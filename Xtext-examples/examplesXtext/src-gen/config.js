const boardGame = {
	title: "Bondesjakk",
    size: 5,
    pieces: ["🧑‍🌾", "🐄", "🐔", ],
    config: {
   		validMove: [{"name": "placePiece","conditions": [],"placeAnywhere": true}],
   		pieceType: [{"name": "X","symbol": "🧑‍🌾","validMoves": [{ "name": "placePiece", "conditions": [], "placeAnywhere": true }],"effectsoncell": []},{"name": "O","symbol": "🐄","validMoves": [{ "name": "placePiece", "conditions": [], "placeAnywhere": true }],"effectsoncell": []},{"name": "O","symbol": "🐔","validMoves": [{ "name": "placePiece", "conditions": [], "placeAnywhere": true }],"effectsoncell": []}],
   		winCondition: [{"winConditionElements": [{ "length": 4, "direction": "ROW" }, 
   		{ "length": 3, "direction": "COLUMN" }, 
   		{ "length": 4, "direction": "DIAGONAL" }]}]
    }
};

export default boardGame;
