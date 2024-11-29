import { View, StyleSheet, TouchableOpacity, Text, TextInput, Alert, Pressable, Button } from "react-native";
import { useState, useEffect } from "react";
import CustomButton from "../../components/button.js";
import AsyncStorage from "@react-native-async-storage/async-storage";
import { useTranslation } from "react-i18next";
import { globalStyles } from "../../styles/global.js";
import bg from "./bg.js";
import { RFValue } from "react-native-responsive-fontsize";

import React from 'react'

export default function TicTacToe() {

  
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

  const initializeBoard = () => {
    setBoard(Array(boardSize).fill(Array(boardSize).fill(null)));
    setCurrentPlayer(0);
    setGameActive(true);
    setMessage(`Player ${players[currentPlayer]}'s turn`);
  };

  const onCellClick = (row, col) => {

    // ---EFFECT ON CELL---
    if (!gameActive || board[row][col] !== null) return; //check if occupied   
    //if(!gameActive) return; //dont check

    console.log("Hei")
    console.log(board)
    const newBoard = board.map((boardRow, rowIndex) =>
      boardRow.map((cell, colIndex) => (rowIndex === row && colIndex === col ? players[currentPlayer] : cell))
  );
    console.log("Hei 2")
    console.log(newBoard)

    setBoard(newBoard);

    if (checkVictory(players[currentPlayer], newBoard)) {
      setMessage(`Player ${players[currentPlayer]} wins!`);
      setGameActive(false);
    } else if (checkDraw(newBoard)) {
      setMessage("It's a draw!");
      setGameActive(false);
    } else {
      const nextPlayer = (currentPlayer + 1) % players.length;
      setCurrentPlayer(nextPlayer);
      setMessage(`Player ${players[nextPlayer]}'s turn`);
    }
  };

  const checkVictory = (player, board) => {

    return checkRow(XInARow, player, board) || 
          checkColumn(XInARow, player, board) || 
          checkDiagonals(XInARow, player, board);
  };

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
      <Text style={styles.title}>{bg.boardGameName}</Text>
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