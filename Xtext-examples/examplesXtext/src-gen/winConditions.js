// Auto-generated JavaScript for win conditions
const boardSize = 5;
  
export function checkIsFinishedFunction(board, players, currentPlayer, setMessage) {
	const newBoard = board;
	let isFinished = false;

	const player = players[currentPlayer]
    			   
    			const inARowLength = 4
if(inARow(inARowLength, player, board)) {
	setMessage(`Player ${players[currentPlayer].symbol} wins because of ${inARowLength} in a row!`);
	return true
}
const inAColumnLength = 4
	     		if(inAColumn(inAColumnLength, player, board)) {
	     			setMessage(`Player ${players[currentPlayer].symbol} wins because of ${inAColumnLength} in a column!`);
	     			return true
	     		}
    	   
  	return false; //not finished
};

const inARow = (num, player, board) => {
  for (let row = 0; row < boardSize; row++) {
    let count = 0;   
    for (let col = 0; col < boardSize; col++) {
      if (
     		board[row][col] != null && 
          board[row][col].piece != null && 
          board[row][col].piece.symbol === player.symbol
          ){
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
      if(
     		board[row][col] != null && 
          board[row][col].piece != null && 
          board[row][col].piece.symbol === player.symbol
          ){
        count++;
        if (count === num) return true;
      } else {
        count = 0;
      }
    }
  }
  return false;
};

