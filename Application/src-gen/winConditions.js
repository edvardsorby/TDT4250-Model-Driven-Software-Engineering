// Auto-generated JavaScript for win conditions
const boardSize = 5;
  
export function checkIsFinishedFunction(board, players, currentPlayer, setMessage) {
	const newBoard = board;
	let isFinished = false;

	const player = players[currentPlayer]
    			const inARowLength = 4
if(inARow(inARowLength, player, board)) {
	setMessage(`Player ${players[currentPlayer]} wins because of ${inARowLength} in a row!`);
	return true
}
const inAColumnLength = 3
	     		if(inAColumn(inAColumnLength, player, board)) {
	     			setMessage(`Player ${players[currentPlayer]} wins because of ${inAColumnLength} in a column!`);
	     			return true
	     		}
const inADiagonalLength = 4
	     		if(inDiagonal(inADiagonalLength, player, board)) {
	     			setMessage(`Player ${players[currentPlayer]} wins because of ${inADiagonalLength} in a diagonal!`);
	     			return true
	     		}
  	return false; //not finished
};

const inARow = (num, player, board) => {
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

const inAColumn = (num, player, board) => {
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

const inDiagonal = (num, player, board) => {
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