const boardGame = {
    size: 5,
    elements: {
        CellState: [
            { "name": "Occupied" },
            { "name": "Empty" }
        ],
        Condition: [
            {
                "name": "IsEmpty",
                "cellState": {
                    "name": "Empty"
                }
            }
        ],
        ValidMove: [{
            "name": "placePiece"
            ,
            "conditions": [
                {
                    "name": "IsEmpty",
                    "cellState": {
                        "name": "Empty"
                    }
                }]
            ,
            "placeAnywhere": true
        }
        ],
        EffectOnCell: [{
            "name": "makeOccupied"
            ,
            "cellState": {
                "name": "Occupied"
            }
            ,
            "x": 0
            ,
            "y": 0
        }
        ],
        PieceType: [{
            "name": "X"
            ,
            "symbol": "X"
            ,
            "validMoves": [{
                "name": "placePiece"
                , "conditions": [{
                    "name": "IsEmpty"
                    , "cellState": {
                        "name": "Empty"
                    }
                }]
                , "placeAnywhere": true
            }]
            ,
            "effectsoncell": [{
                "name": "makeOccupied"
                , "cellState": {
                    "name": "Occupied"
                }
                , "x": 0
                , "y": 0
            }]
        }
            ,
        {
            "name": "O"
            ,
            "symbol": "O"
            ,
            "validMoves": [{
                "name": "placePiece"
                , "conditions": [{
                    "name": "IsEmpty"
                    , "cellState": {
                        "name": "Empty"
                    }
                }]
                , "placeAnywhere": true
            }]
            ,
            "effectsoncell": [{
                "name": "makeOccupied"
                , "cellState": {
                    "name": "Occupied"
                }
                , "x": 0
                , "y": 0
            }]
        }
        ],
        WinCondition: [{
            "winConditionElements": [{
                "count": 3
                , "diagonal": true
                , "horizontal": true
                , "vertical": true
                , "unique": false
            }]
        }
        ]
    }
};

export default boardGame;
