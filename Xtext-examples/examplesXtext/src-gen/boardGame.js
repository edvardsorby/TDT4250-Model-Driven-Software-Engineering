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
                            cellstate: "Empty"
                        }
                    ]
                }
            ]
        }
    ],
    cellstates: [
        no.ntnu.tdt4250.g07.BoardGame.CellState, no.ntnu.tdt4250.g07.BoardGame.CellState
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
