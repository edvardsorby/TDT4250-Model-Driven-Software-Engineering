const boardGame = {
	title: "Tic-Tac-Toe",
    size: 5,
    config: {
   		validMove: [{"name": "placePiece","conditions": [],"placeAnywhere": true}],
   		pieceType: [{"name": "X","symbol": "❌","validMoves": [{ "name": "placePiece", "conditions": [], "placeAnywhere": true }],"effectsoncell": []},{"name": "O","symbol": "⭕","validMoves": [{ "name": "placePiece", "conditions": [], "placeAnywhere": true }],"effectsoncell": []}],
   		winCondition: [{"winConditionElements": [{ "length": 5, "direction": "ROW" }, 
   		{ "length": 3, "direction": "COLUMN" }]}]
    }
};

export default boardGame;
