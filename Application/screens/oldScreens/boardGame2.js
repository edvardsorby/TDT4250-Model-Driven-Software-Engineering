import { View, StyleSheet, TouchableOpacity, Text, TextInput, Alert, Pressable, Button } from "react-native";
import { useState, useEffect } from "react";
import CustomButton from "../components/button";
import AsyncStorage from "@react-native-async-storage/async-storage";
import { useTranslation } from "react-i18next";
import { globalStyles } from "../styles/global";
import { RFValue } from "react-native-responsive-fontsize";
import React from 'react'

/*---Generated resources---*/

//pieces and game
import bg from "../src-gen/bg.js"

//generated board
//import gameBoard from "../src-gen/gameBoard.js"
import { checkIsFinishedFunction } from "./checkIsFinished.js";



export default function BoardGame() {
  const boardSize = bg.size; // Size of the board
  const players = []; // Players
  
//Add board-pice symbols to player list
  bg.piecetypes.forEach((piece) => {
    players.push(piece.symbol);
  });

  const [board, setBoard] = useState(Array(boardSize).fill(Array(boardSize).fill(null)));
  const [currentPlayer, setCurrentPlayer] = useState(0);
  const [gameActive, setGameActive] = useState(true);

  // start message
  const [message, setMessage] = useState(`This is a board game`);

  //Board
  const predefinedBoard = Array(boardSize).fill(Array(boardSize).fill(null));
 
  
  const initializeBoard = () => {
    //const newBoard = predefinedBoard.map(row => row.slice()); 
    setBoard(predefinedBoard);

    setCurrentPlayer(0); 
    setMessage(`Next Piece ${players[currentPlayer]}`);

    setGameActive(true);
  };

  useEffect(() => {   
    initializeBoard()
  }, []);


  const checkIfPieceOverwrites = (row,col) => {
    const pieceVar = true;
    if(pieceVar) {
      return true
    }
    return false
  }

  const onCellClick = (row, col) => {
    if(!gameActive && board[row][col] !== null) return
    //if(!gameActive) return;
   
    //placing the piece
    const newBoard = board.map((boardRow, rowIndex) =>
      boardRow.map((cell, colIndex) => (rowIndex === row && colIndex === col ? players[currentPlayer] : cell))
    );

    setBoard(newBoard);

    console.log(board)
    if (checkIsFinished(newBoard)) {
      //setMessage(`Player ${players[currentPlayer]} wins!`);
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
    
<View style={styles.container}>
      <Text style={styles.title}>{bg.boardGameName}</Text>
      {/* FOR-Loop: print all rUUles */}
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