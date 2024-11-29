const boardGame = {
	title: Sudoku,
    size: 3,
    config: {
   		validMove: [{"name": "placePiece","conditions": [],"placeAnywhere": true}],
   		pieceType: [{"name": "one","symbol": "👍","validMoves": [{ "name": "placePiece", "conditions": [], "placeAnywhere": true }],"effectsoncell": []},{"name": "two","symbol": "✌️","validMoves": [{ "name": "placePiece", "conditions": [], "placeAnywhere": true }],"effectsoncell": []},{"name": "three","symbol": "👌","validMoves": [{ "name": "placePiece", "conditions": [], "placeAnywhere": true }],"effectsoncell": []}],
   		winCondition: [{"winConditionElements": [{ "count": 3, "diagonal": false, "horizontal": true, "vertical": false, "unique": true }]}]
    }
};

export default boardGame;
