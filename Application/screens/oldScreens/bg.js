const boardGame = {
    boardGameName: "Bondesjakk",
  size: 7,
  piecetypes: [
      {
          name: "😺",
          symbol: "😺",
          validmoves: [
              {
                  placeAnywhere: false,
                  relativePosition: {x:0, y:1},
                  conditions: [
                      {
                          cellstate: "Occupied"
                      }
                  ]
              },
              {
                placeAnywhere: true,//false
              
                conditions: [
                    {
                        cellstate: "Occupied"
                    }
                ]
            }
          ],
      }
      ,
      {
          name: "♜",
          symbol: "♜",
          validmoves: [
              {
                  placeAnywhere: true,
                  conditions: [
                      {
                          cellstate: "Occupied"
                      }
                  ]
              }
          ]
      },
      {
        name: "🌞",
        symbol: "🌞",
        validmoves: [
            {
                placeAnywhere: true,
                conditions: [
                    {
                        cellstate: "Occupied"
                    }
                ]
            }
        ]
    },
    {
        name: "🎓",
        symbol: "🎓",
        validmoves: [
            {
                placeAnywhere: true,
                conditions: [
                    {
                        cellstate: "Occupied"
                    }
                ]
            }
        ]
    },
    {
        name: "🌂",
        symbol: "🌂",
        validmoves: [
            {
                placeAnywhere: true,
                conditions: [
                    {
                        cellstate: "Occupied"
                    }
                ]
            }
        ]
    },
  ],
  cellstates: [
  ],
  winConditions: [
      {
          inarow: {
              diagonal: true,
              horizontal: true,
              vertical: true,
              count: 3
          }
      }
  ]
};

export default boardGame;