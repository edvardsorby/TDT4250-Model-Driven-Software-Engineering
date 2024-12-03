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

