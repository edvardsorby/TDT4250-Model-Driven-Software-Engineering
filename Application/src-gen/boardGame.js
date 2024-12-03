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
  const boardSize = 8; // Size of the board
  const players = ["♔", "♚", "♙", "♟", "🐖", ]; // Players
	
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
    setMessage(`Next Piece ${players[0]}`);

    setGameActive(true);
  };

  useEffect(() => {   
    initializeBoard()
  }, []);

  const onCellClick = (row, col) => {
    if (!gameActive || board[row][col] !== null) return; //check if occupied  
    
    //if(!gameActive) return;
   
    //placing the piece
    const newBoard = board.map((boardRow, rowIndex) =>
      boardRow.map((cell, colIndex) => (rowIndex === row && colIndex === col ? players[currentPlayer] : cell))
    );

    setBoard(newBoard);

    if (checkIsFinished(newBoard)) {
      setGameActive(false);
    } else if (checkIfBoardIsFilled(newBoard)) {
          setMessage("It's a draw!");
          setGameActive(false);
    } else {
      const nextPlayer = (currentPlayer + 1) % players.length;
      setCurrentPlayer(nextPlayer);
      setMessage(`Next piece: ${players[nextPlayer]}`);
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
     <Text style={boardStyles.title}>Farmer's Chess</Text>
     <Text style={boardStyles.message}>
             Players: {players.map((player, index) => (
               <Text
                 key={index}
                 style={player === players[currentPlayer] ? { fontSize: 32 } : null}
               >
                 {player}{' '}
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
              <Text style={boardStyles.cellText}>{cell}</Text>
            </TouchableOpacity>
          ))
        )}
      </View>
     <View style={boardStyles.rules}>
		             <Text style={boardStyles.rule}>Rules:</Text>
	             
<Text style={boardStyles.rule}>6  in a row</Text>
<Text style={boardStyles.rule}>4  in a column</Text>
<Text style={boardStyles.rule}>3  in a diagonal</Text>
    </View>	
      <CustomButton title="Reset" onPress={resetGame} />
      
    </View>
  )
}
