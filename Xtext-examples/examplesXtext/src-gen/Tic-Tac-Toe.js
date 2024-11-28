const boardGame = {
    size: 3,
    elements: {
   		ValidMove: [{"name": "placePiece","conditions": [],"placeAnywhere": true}],
   		PieceType: [{"name": "X","symbol": "1","validMoves": [{ "name": "placePiece", "conditions": [], "placeAnywhere": true }],"effectsoncell": []},{"name": "Y","symbol": "2","validMoves": [{ "name": "placePiece", "conditions": [], "placeAnywhere": true }],"effectsoncell": []},{"name": "three","symbol": "3","validMoves": [{ "name": "placePiece", "conditions": [], "placeAnywhere": true }],"effectsoncell": []}],
   		WinCondition: [{"winConditionElements": [{ "count": 3, "diagonal": true, "horizontal": true, "vertical": true, "unique": false }]}]
    }
};

export default boardGame;
