import bg from "./oldScreens/bg"



const winConditions = [
    {
      diagonal: false,
      horizontal: false,
      vertical: true,
      counth: 3,
      countv: 2, 
      unique: true
    }
  ]

  const boardSize = bg.size;
  
  export function checkIsFinishedFunction(board, players, currentPlayer, setMessage) {

    const newBoard = board;
    let isFinished = false;
    const conditionList = winConditions
    const player = players[currentPlayer]

    for(let i = 0; i < conditionList.length; i++){
      const cond = conditionList[i];
      const count = cond.count;

      if(cond.unique) { // Sudoku code that checks for uniques
        console.log("Checking for uniqe")
        const isHorizontalValid = cond.horizontal ? isValidRows(newBoard,5) : true;
        const isVerticalValid = cond.vertical ? isValidColumns(newBoard,5) : true;
        
        if (isHorizontalValid && isVerticalValid) {
          setMessage("Puzzle solved!");
          return true;
        } else {
          //setMessage("Board contains mistakes");
          return false;
        }       
      } else { // Tic-Tac-Toe code that checks for equals
        console.log("Checking for equal")
        if(cond.horizontal){
          isFinished = xInARow(count, player, board)
       
          if(isFinished) {
            setMessage(`Player ${players[currentPlayer]} wins!`);
            return true;
          } 
        }
        if(cond.vertical){
          isFinished = xInAColumn(count, player, newBoard)
          if(isFinished) {
            setMessage(`Player ${players[currentPlayer]} wins!`);
            return true;
          }
        }
        if(cond.diagonal){
          isFinished = xInDiagonal(count, player, newBoard)
          if(isFinished) {
            setMessage(`Player ${players[currentPlayer]} wins!`);
            return true;
          }
        }
        
      }
    }
  
    return false; //not finished
  };

  function isValidRows(board, numRows) {
    let found = 0; // Counter for valid rows
    const boardSize = board.length; // Assuming board is a square matrix

    for (let row = 0; row < boardSize; row++) {
        if (isUniqueGroup(board[row])) {
            found++;
        }
    }

    return found >= numRows; // Return true if at least numRows rows are valid
}

function isValidColumns(board, numColumns) {
    let found = 0; // Counter for valid columns
    const boardSize = board.length; // Assuming board is a square matrix

    for (let col = 0; col < boardSize; col++) {
        const column = [];
        for (let row = 0; row < boardSize; row++) {
            column.push(board[row][col]);
        }
        if (isUniqueGroup(column)) {
            found++;
        }
    }

    return found >= numColumns; // Return true if at least numColumns columns are valid
}

 /* function isValidRows(board, numRows) {
    var found = 0; //how many rows with all unique
    
    for (let row = 0; row < boardSize; row++) {
      //if (board[row].includes(null)) return false;
      if (isUniqueGroup(board[row])) {
        found++;
    }
}

    if(found >= numRows){
        return true;
    }else {
        return false;
    }
  }

  function isValidColumns(board,numRows) {
    var found = 0;
    
    for (let col = 0; col < boardSize; col++) {
      const column = [];
      for (let row = 0; row < boardSize; row++) {
        column.push(board[row][col]);
        if (board[row].includes(null)) return false;
        if (isUniqueGroup(board[row])) {
          found++;
        }
      }
    }
    if(found >= numRows){
        return true;
    }else {
        return false;
    }
  }
*/
  /*

   function isValidRows(board) {
    console.log("Boardsize: " + boardSize)
    for (let row = 0; row < boardSize; row++) {
      if (board[row].includes(null)) return false;
      if (!isUniqueGroup(board[row])) return false;
    }
    return true;
  }
  
  function isValidColumns(board) {
    for (let col = 0; col < boardSize; col++) {
      const column = [];
      for (let row = 0; row < boardSize; row++) {
        column.push(board[row][col]);
        if (board[row].includes(null)) return false;
      }
      if (!isUniqueGroup(column)) return false;
    }
    return true;
  }*/

  function isUniqueGroup(group) { // valid group = unique elements
    const seen = new Set();
    for (const value of group) {
      console.log(group)
      if (value === null) continue; 
      if (seen.has(value)) return false;
      seen.add(value);
    }
    return true;
  }

  const xInARow = (num, player, board) => {
    for (let row = 0; row < boardSize; row++) {
      let count = 0;
      console.log(board)      
      for (let col = 0; col < boardSize; col++) {
        if (board[row][col] === player) {
          count++;
          console.log("inarow: " + count + "  vs: " + num + " player: "+ player)
          if (count === num) return true;
        } else {
          count = 0;
        }
      }
    }
    return false;
  };

  const xInAColumn = (num, player, board) => {
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

  const xInDiagonal = (num, player, board) => {
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

  