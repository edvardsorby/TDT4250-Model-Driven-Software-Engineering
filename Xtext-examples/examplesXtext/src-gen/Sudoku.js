const boardGame = {
    size: 3,
    elements: {
   		ValidMove: [{"name": "placePiece","conditions": [],"placeAnywhere": true}],
   		PieceType: [
			{"name": "one","symbol": "1",
				"validMoves": [{ "name": "placePiece", "conditions": [], "placeAnywhere": true }],"effectsoncell": []},
				{"name": "two","symbol": "2",
				"validMoves": [{ "name": "placePiece", "conditions": [], "placeAnywhere": true }],"effectsoncell": []},
				{"name": "three","symbol": "3","validMoves": [{ "name": "placePiece", "conditions": [], "placeAnywhere": true }],"effectsoncell": []}],
   		WinCondition: [{"winConditionElements": [{ "count": 3, "diagonal": false, "horizontal": true, "vertical": true, "unique": true }]}]
    }
};

export default boardGame;
