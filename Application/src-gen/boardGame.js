import { View, StyleSheet, TouchableOpacity, Text, TextInput, Alert, Pressable, Button } from "react-native";
import { useState, useEffect } from "react";
import CustomButton from "../components/button.js";
import AsyncStorage from "@react-native-async-storage/async-storage";
import { useTranslation } from "react-i18next";
import { globalStyles } from "../styles/global.js";
import { boardStyles } from "./boardStyles.js";
import { RFValue } from "react-native-responsive-fontsize";
import React from 'react'
import { checkIsFinishedFunction } from "./winConditions.js";


export default function BoardGame() {
  const boardSize = 5; // Size of the board
  // let players = ["🐄", "🧑‍🌾",]; // Players

  const exCell = {
    piece: {

    },
    states: ["Occupied", "Targeted"]
  }

  let players = [
    {symbol:"X",
    disallowedStates: ["Occupied",],
    effectsOnCell: [{name:"Occupied", x:0, y:0},{name:"Occupied", x:1, y:0}]},
    {symbol:"Y",
    disallowedStates: ["Occupied",],
    effectsOnCell: [{name:"Occupied", x:0, y:0}]},
  ]

  const [board, setBoard] = useState(Array(boardSize).fill(Array(boardSize).fill(null)));
  const [currentPlayer, setCurrentPlayer] = useState(0);
  const [gameActive, setGameActive] = useState(true);

  // start message
  const [message, setMessage] = useState(``);

  //Board
  const predefinedBoard = Array(boardSize).fill(Array(boardSize).fill(null));


  const initializeBoard = () => {
    //const newBoard = predefinedBoard.map(row => row.slice()); 
    setBoard(predefinedBoard);

    setCurrentPlayer(0);
    setMessage(`Next Piece: ${players[0].symbol}`);

    setGameActive(true);
  };

  useEffect(() => {
    initializeBoard()
  }, []);

  const checkIfMoveIsAllowed = (disallowedStates, row, col) => {
    const cell = board[row][col]
    console.log(cell)

    if (cell === null) {
      return true
    } else {
      const cellStates = cell.states

      for (let i = 0; i < cellStates.length; i++) {
        const state = cellStates[i];

        for (let j = 0; j < disallowedStates.length; j++) {
          const disallowedState = disallowedStates[j];

          console.log(state + " " + disallowedState)
          if (state === disallowedState) return false
        }
        
      }
      return true
    }
  }

  const updateBoard = (piece, row, col) => {

    
    const effectsOnCell = piece.effectsOnCell
    
    let newBoard = board.map(row => [...row]);
    
    for (let i = 0; i < effectsOnCell.length; i++) {
      
      
      const effect = effectsOnCell[i];
      
      const affectedRow = row + effect.y
      const affectedCol = col + effect.x

      console.log("affectedRow: " + affectedRow)
      console.log("affectedCol: " + affectedCol)

      if (
        !((affectedRow >= boardSize || affectedRow < 0)
        ||(affectedCol >= boardSize || affectedCol < 0))
      ) {
        let newCell
        
        if (board[affectedRow][affectedCol] === null) {
          newCell = {}
          
          if (affectedRow === row && affectedCol === col) {
            newCell.piece = piece
          }
          console.log("Effect: ")
          console.log(effect)
          newCell.states = [effect.name]
        } else {
          console.log("1:")
          console.log(newCell)
          newCell = board[affectedRow][affectedCol]
          
          newCell.states += effect.cellState
  
          console.log("2:")
          console.log(newCell)
        }
        
        newBoard[affectedRow][affectedCol] = newCell
      }
      
    }

    setBoard(newBoard)
    return newBoard
    
    // const newBoard = board.map((row, col) =>
    //   boardRow.map((cell, colIndex) => (rowIndex === row && colIndex === col ? players[currentPlayer] : cell))
    // );

  }

  const onCellClick = (row, col) => {
    // if (!gameActive || board[row][col] !== null) return; //check if occupied  

    const currentPlayerPiece = players[currentPlayer]

    let newBoard

    if (checkIfMoveIsAllowed(currentPlayerPiece.disallowedStates, row, col) && gameActive) {
      newBoard = updateBoard(currentPlayerPiece, row, col)
      console.log("Allowed move")
    } else {
      setMessage("Disallowed move")
      return
    }

    //if(!gameActive) return;



    if (checkIsFinished(newBoard)) {
      setGameActive(false);
    } else if (checkIfBoardIsFilled(newBoard)) {
      setMessage("It's a draw!");
      setGameActive(false);
    } else {
      const nextPlayer = (currentPlayer + 1) % players.length;
      setCurrentPlayer(nextPlayer);
      setMessage(`Next piece: ${players[nextPlayer].symbol}`);
    }
  };

  const checkIsFinished = (board) => {
    return checkIsFinishedFunction(board, players, currentPlayer, setMessage)
  }

  const checkIfBoardIsFilled = (board) => {
    return board.flat().every((cell) => cell !== null);
  };

  const resetGame = () => {
    initializeBoard();
  };
  return (

    <View style={boardStyles.container}>
      <Text style={boardStyles.title}>Kugalskap</Text>
      <Text style={boardStyles.message}>
        Players: {players.map((player, index) => (
          <Text
            key={index}
            style={player === players[currentPlayer] ? { fontSize: 32 } : null}
          >
            {player.symbol}{' '}
          </Text>
        ))}
      </Text>
      <Text style={boardStyles.message}>{message}</Text>
      <View style={boardStyles.board}>
        {board.map((row, rowIndex) =>
          row.map((cell, colIndex) => (
            <TouchableOpacity
              key={`${rowIndex}-${colIndex}`}
              style={boardStyles.cell}
              onPress={() => onCellClick(rowIndex, colIndex)}
            >
              <Text style={boardStyles.cellText}>{cell != null && cell.piece != null && cell.piece.symbol}</Text>
            </TouchableOpacity>
          ))
        )}
      </View>
      <View style={boardStyles.rules}>
        <Text style={boardStyles.rule}>Rules:</Text>

        <Text style={boardStyles.rule}>4  in a row</Text>
      </View>
      <CustomButton title="Reset" onPress={resetGame} />

    </View>
  )
}
