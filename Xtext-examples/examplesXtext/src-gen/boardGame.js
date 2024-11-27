const boardGame = {
    size: 5,
    piecetypes: [
        {
            name: "X",
            symbol: "X",
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
            name: "O",
            symbol: "O",
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
    ],
    cellstates: [
        no.ntnu.tdt4250.group07.bg.CellState, no.ntnu.tdt4250.group07.bg.CellState
    ],
    winConditions: [
        {
            inarow: {
                diagonal: true,
                horizontal: true,
                vertical: true,
                count: 5
            }
        }
    ]
};

export default boardGame;
