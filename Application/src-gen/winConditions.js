// Auto-generated JavaScript for win conditions
export const winConditions = [
  {
      name: "TicTacToe",
      validate: function(board, player) {
          const boardSize = board.length;

          // Horizontal Check
          for (let row = 0; row < boardSize; row++) {
              let count = 0;
              for (let col = 0; col < boardSize; col++) {
                  if (board[row][col] === player) {
                      count++;
                      if (count === 3) return true;
                  } else {
                      count = 0;
                  }
              }
          }

          // Vertical Check
          for (let col = 0; col < boardSize; col++) {
              let count = 0;
              for (let row = 0; row < boardSize; row++) {
                  if (board[row][col] === player) {
                      count++;
                      if (count === 3) return true;
                  } else {
                      count = 0;
                  }
              }
          }

          // Diagonal Check
          const checkDiagonal = (startRow, startCol, deltaRow, deltaCol) => {
              let count = 0;
              let row = startRow;
              let col = startCol;
              while (row >= 0 && row < boardSize && col >= 0 && col < boardSize) {
                  if (board[row][col] === player) {
                      count++;
                      if (count === 3) return true;
                  } else {
                      count = 0;
                  }
                  row += deltaRow;
                  col += deltaCol;
              }
              return false;
          };

          // Top-left to bottom-right diagonals
          for (let row = 0; row < boardSize; row++) {
              if (checkDiagonal(row, 0, 1, 1)) return true;
          }
          for (let col = 1; col < boardSize; col++) {
              if (checkDiagonal(0, col, 1, 1)) return true;
          }

          // Top-right to bottom-left diagonals
          for (let row = 0; row < boardSize; row++) {
              if (checkDiagonal(row, boardSize - 1, 1, -1)) return true;
          }
          for (let col = boardSize - 2; col >= 0; col--) {
              if (checkDiagonal(0, col, 1, -1)) return true;
          }

          return false;
      }
  }
];
