const boardGame = {
    boardGameName: "Tic-Tac-Toe",
  size: 5,
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
                placeAnywhere: false,
                relativePosition: {x:2, y:2},
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