const boardGame = {
  size: 5,
  piecetypes: [
      {
          name: "🤡",
          symbol: "🤡",
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