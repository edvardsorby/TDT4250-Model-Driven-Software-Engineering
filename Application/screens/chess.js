import { View, StyleSheet, TouchableOpacity, Text, TextInput, Alert, Pressable, Button } from "react-native";
import { useState, useEffect } from "react";
import CustomButton from "../components/button";
import AsyncStorage from "@react-native-async-storage/async-storage";
import { useTranslation } from "react-i18next";
import { globalStyles } from "../styles/global";
//import bg from "../src-gen/bg.js"
import bg from "../src-gen/chess.js"
import board from "../src-gen/gameBoard.js"

import { RFValue } from "react-native-responsive-fontsize";

import React from 'react'

export default function Chess() {
  const boardSize = bg.size; // Size of the board
  const players = []; // Players
  const XInARow = bg.winConditions[0].inarow.count; // Win condition: X in a row
  //const XInARow = 2;
  bg.piecetypes.forEach((piece) => {
    players.push(piece.symbol);
  });

  const [board, setBoard] = useState(Array(boardSize).fill(Array(boardSize).fill(null)));
  const [currentPlayer, setCurrentPlayer] = useState(0);
  const [gameActive, setGameActive] = useState(true);
  const [message, setMessage] = useState(`Player ${players[currentPlayer]}'s turn`);

  // const predefinedBoard = 

  const predefinedBoard = [
    [null,"👒","☀",null,null],
    [null,null, null, null,null],
    [null, null, null, null,null],
    [null, null, null, null,null],
    [null, "🌞", "🎓", null,null],
  ];

  const initializeBoard = () => {
    //setBoard(Array(boardSize).fill(Array(boardSize).fill(null))); // IF NOT PREDEFINED BOARD
    
    const newBoard = predefinedBoard.map(row => row.slice()); // IF PREDEFINED BOARD
    setBoard(newBoard);

    setCurrentPlayer(0); 
    setMessage(`Player ${players[currentPlayer]}'s turn`);

    setGameActive(true);
  };

  /**
   * VALID MOVES
   * Used for games with moveable pieces
   * 
   */
  const getValidMoves = (piece,row,col) => {
    if (board[row][col] == null) return //empty cell has no valid moves
    
    const numConditions = piece.validmoves.length;
    let validCells = [];

    for (let i = 0; i < numConditions; i++) { // => list of valid coodinates for this piece
        let x = col + piece.validmoves[i].relativePosition.x
        let y = row + piece.validmoves[i].relativePosition.y

        const invalidCell = (x > boardSize || y>boardSize || y<0 || x<0) //pieces cannot go beyond the board

        if(!invalidCell){
            validCells.add(x,y)
        }
    }
    
    return validCells;
  }

  const highlightCells = (listOfCells) => {
    listOfCells.forEach(([x, y]) => {
      console.log(`x: ${x}, y: ${y}`);
    });

  }

  const removeHighlights = () => {

  }

  const onCellClick = (row, col) => {
    // ---EFFECT ON CELL---
    //if (!gameActive || board[row][col] !== null) return; //check if occupied   
    if(!gameActive) return; //dont check if occupied

    //CHESS Games with changable piece positions
    removeHighlights();
    let validMoves = getValidMoves(row,col);
    highlightCells(validMoves);

    //const newBoard = board.map((boardRow, rowIndex) =>
    //  boardRow.map((cell, colIndex) => (rowIndex === row && colIndex === col ? players[currentPlayer] : cell))
    //);


    //setBoard(newBoard);
    //const nextPlayer = (currentPlayer + 1) % players.length;
    //setCurrentPlayer(nextPlayer);

    // ONLY IN VS.
    /*if (checkIsFinished(players[currentPlayer], newBoard)) {
      setMessage(`Player ${players[currentPlayer]} wins!`);
      setGameActive(false);
    } else if (checkDraw(newBoard)) {
      setMessage("It's a draw!");
      setGameActive(false);
    } else {
      const nextPlayer = (currentPlayer + 1) % players.length;
      setCurrentPlayer(nextPlayer);
      setMessage(`Player ${players[nextPlayer]}'s turn`);
    }*/
  };

  const checkIsFinished = () => {
    const newBoard = board;
    if(isValidRows(newBoard) && isValidColumns(newBoard)){
        setGameActive(false);
        setMessage("Congratulations!");
    }
    else {
        setMessage("The board contains mistakes!");
    }
  };

  //const checkIsFinished = (player, board) => { //TIC---TAC---TOE
   // return checkRow(XInARow, player, board) || 
    //      checkColumn(XInARow, player, board) || 
    //      checkDiagonals(XInARow, player, board)||
      //    
          //;
  //};

  function isValidRows(board) {
    for (let row = 0; row < boardSize; row++) {
      if (!isValidGroup(board[row])) return false;
    }
    return true;
  }

  function isValidColumns(board) {
    for (let col = 0; col < boardSize; col++) {
      const column = [];
      for (let row = 0; row < boardSize; row++) {
        column.push(board[row][col]);
      }
      if (!isValidGroup(column)) return false;
    }
    return true;
  }

  function isValidGroup(group) { // valid group = unique elements
    const seen = new Set();
    for (const value of group) {
      if (value === 0) continue; 
      if (seen.has(value)) return false;
      seen.add(value);
    }
    return true;
  }

  const checkRow = (num, player, board) => {
    for (let row = 0; row < boardSize; row++) {
      let count = 0;
      for (let col = 0; col < boardSize; col++) {
        if (board[row][col] === player) {
          count++;
          if (count === num) return true;
        } else {
          count = 0;
        }
      }
    }
    return false;
  };

  const checkColumn = (num, player, board) => {
    for (let col = 0; col < boardSize; col++) {
      let count = 0;
      for (let row = 0; row < boardSize; row++) {
        if (board[row][col] === player) {
          count++;
          if (count === num) return true;
        } else {
          count = 0;
        }
      }
    }
    return false;
  };

  const checkDiagonals = (num, player, board) => {
    const countDiagonalMatches = (startRow, startCol, deltaRow, deltaCol) => {
      let count = 0;
      let row = startRow;
      let col = startCol;

      while (row >= 0 && row < boardSize && col >= 0 && col < boardSize) {
        if (board[row][col] === player) {
          count++;
          if (count === num) return true;
        } else {
          count = 0;
        }
        row += deltaRow;
        col += deltaCol;
      }

      return false;
    };

    // Check top-left to bottom-right
    for (let row = 0; row < boardSize; row++) {
      if (countDiagonalMatches(row, 0, 1, 1)) return true;
    }
    for (let col = 1; col < boardSize; col++) {
      if (countDiagonalMatches(0, col, 1, 1)) return true;
    }

    // Check top-right to bottom-left
    for (let row = 0; row < boardSize; row++) {
      if (countDiagonalMatches(row, boardSize - 1, 1, -1)) return true;
    }
    for (let col = boardSize - 2; col >= 0; col--) {
      if (countDiagonalMatches(0, col, 1, -1)) return true;
    }

    return false;
  };

  const checkDraw = (board) => {
    return board.flat().every((cell) => cell !== null);
  };

  const resetGame = () => {
    initializeBoard();
  };
  
  return (
    
<View style={styles.container}>
      <Text style={styles.title}>♜ Tillitsbasert sjakk ♜</Text>
      <Text >Board size: {boardSize}</Text>
      <Text >Win condition: {XInARow} in a row</Text>
      <View style={styles.board}>
        {board.map((row, rowIndex) =>
          row.map((cell, colIndex) => (
            <TouchableOpacity
              key={`${rowIndex}-${colIndex}`}
              style={styles.cell}
              onPress={() => onCellClick(rowIndex, colIndex)}
            >
              <Text style={styles.cellText}>{cell}</Text>
            </TouchableOpacity>
          ))
        )}
      </View>
      <Text style={styles.message}>{message}</Text>
      <CustomButton title="Reset" onPress={resetGame} />
      <CustomButton title="Valider" onPress={checkIsFinished} />
    </View>
  )
}


const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: "center",
    alignItems: "center",
    backgroundColor: "azure",//VARIABEL
  },
  title: {
    fontSize: 24,
    marginBottom: 20,
    color: "#023535",//VARIABEL
  },
  board: {
    flexDirection: "row",
    flexWrap: "wrap",
    width: 300, 
    height: 300, 
  },
  cell: {
    width:  300 / bg.size,
    height:  300 / bg.size,
    borderWidth: 2,
    borderColor: "black",//VARIABEL
    justifyContent: "center",
    alignItems: "center",
    backgroundColor: "#fff", //VARIABEL
  },
  cellText: {
    fontSize: RFValue(32, 812),
    fontWeight: "bold",
  },
  message: {
    fontSize: 18,
    marginVertical: 10,
    color: "#023535",
  },
});