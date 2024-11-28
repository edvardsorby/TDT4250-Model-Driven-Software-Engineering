const boardGame = {
    size: 5,
    elements: {
   CellState: [{
       "name": "Occupied"
   }
   ,
   {
       "name": "Empty"
   }
   ],
   Condition: [{
       "cellstate": { "name": "Empty"
        }
       ,
       "name": "IsEmpty"
   }
   ],
   ValidMove: [{
       "conditions": [{ "cellstate": { "name": "Empty"
        }
       , "name": "IsEmpty"
        }]
       ,
       "placeAnywhere": true
       ,
       "name": "placePiece"
   }
   ],
   EffectOnCell: [{
       "cellstate": { "name": "Occupied"
        }
       ,
       "x": 0
       ,
       "y": 0
       ,
       "name": "makeOccupied"
   }
   ],
   PieceType: [{
       "name": "X"
       ,
       "validmoves": [{ "conditions": [{ "cellstate": { "name": "Empty"
        }
       , "name": "IsEmpty"
        }]
       , "placeAnywhere": true
       , "name": "placePiece"
        }]
       ,
       "symbol": "X"
       ,
       "effectsoncell": [{ "cellstate": { "name": "Occupied"
        }
       , "x": 0
       , "y": 0
       , "name": "makeOccupied"
        }]
   }
   ,
   {
       "name": "O"
       ,
       "validmoves": [{ "conditions": [{ "cellstate": { "name": "Empty"
        }
       , "name": "IsEmpty"
        }]
       , "placeAnywhere": true
       , "name": "placePiece"
        }]
       ,
       "symbol": "O"
       ,
       "effectsoncell": [{ "cellstate": { "name": "Occupied"
        }
       , "x": 0
       , "y": 0
       , "name": "makeOccupied"
        }]
   }
   ],
   WinCondition: [{
       "inarow": { "diagonal": true
       , "horizontal": true
       , "vertical": true
       , "count": 5
        }
   }
   ]
    }
};

export default boardGame;
