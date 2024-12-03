import { View, TouchableOpacity, Text } from "react-native";
import { useState, useEffect } from "react";
import CustomButton from "../components/button.js";
import { boardStyles } from "./boardStyles.js";
import React from 'react'
import { checkIsFinishedFunction } from "./winConditions.js";

export default function BoardGame() {
  const boardSize = 8; // Size of the board
  let players = [
{symbol:"🪨",
disallowedStates: ["Occupied","PaperEffect",],
effectsOnCell: [{state: "Occupied", x:0, y:0},{state: "RockEffect", x:0, y:1},{state: "RockEffect", x:0, y:-1},{state: "RockEffect", x:-1, y:0},{state: "RockEffect", x:1, y:0},]},
{symbol:"✂️",
disallowedStates: ["Occupied","RockEffect",],
effectsOnCell: [{state: "Occupied", x:0, y:0},{state: "ScissorEffect", x:0, y:1},{state: "ScissorEffect", x:0, y:-1},{state: "ScissorEffect", x:-1, y:0},{state: "ScissorEffect", x:1, y:0},]},
{symbol:"📄",
disallowedStates: ["Occupied","ScissorEffect",],
effectsOnCell: [{state: "Occupied", x:0, y:0},{state: "PaperEffect", x:0, y:1},{state: "PaperEffect", x:0, y:-1},{state: "PaperEffect", x:-1, y:0},{state: "PaperEffect", x:1, y:0},]},]
	
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
    setMessage(`Next Piece ${players[0].symbol}`);

    setGameActive(true);
  };

  useEffect(() => {   
    initializeBoard()
  }, []);
  
    const checkIfMoveIsAllowed = (disallowedStates, row, col) => {
      const cell = board[row][col]
  
      if (cell === null) {
        return true
      } else {
        const cellStates = cell.states
  
        for (let i = 0; i < cellStates.length; i++) {
          const state = cellStates[i];
  
          for (let j = 0; j < disallowedStates.length; j++) {
            const disallowedState = disallowedStates[j];
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
    
          if (
            !((affectedRow >= boardSize || affectedRow < 0)
            ||(affectedCol >= boardSize || affectedCol < 0))
          ) {
            let newCell
            
            if (board[affectedRow][affectedCol] === null) {
              newCell = {}
              
          
              newCell.states = [effect.state]
            } else {
              newCell = board[affectedRow][affectedCol]
              
              newCell.states.push(effect.state)
      
            }
            
	        if (affectedRow === row && affectedCol === col) {
		        newCell.piece = piece
		    }
            
            newBoard[affectedRow][affectedCol] = newCell
          }
          
        }
		         setBoard(newBoard)
		            return newBoard
		         }
        

   const onCellClick = (row, col) => {
  
      const currentPlayerPiece = players[currentPlayer]
  
      let newBoard
  
      if (checkIfMoveIsAllowed(currentPlayerPiece.disallowedStates, row, col) && gameActive) {
        newBoard = updateBoard(currentPlayerPiece, row, col)
      } else {
        setMessage("Disallowed move")
        return
      }
  
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
     <Text style={boardStyles.title}>Rock-Paper-Scissors</Text>
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
<Text style={boardStyles.rule}>4  in a column</Text>
<Text style={boardStyles.rule}>4  in a diagonal</Text>
    </View>	
      <CustomButton title="Reset" onPress={resetGame} />
      
    </View>
  )
}
