

class MyDslGenerator extends AbstractGenerator {

    /**---   GENERATING BOARD    ---**/

    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        resource.allContents.toIterable.filter(Model).forEach[model |
            val boardContent = generateBoardContent(model.size)
            fsa.generateFile("gameBoard.js", boardContent)
        ]
    }

    /**
    * Generate board file
    */
    def generateBoardContent(int size) '''
        const gameBoard = [
        «generateRows(size)»
        ];

        export default gameBoard;
        '''

    /**
     * Helper method to generate empty rows for the board
     */
    def generateRows(int size) '''
        «FOR i : 0..size-1»
            [«FOR j : 0..size-1»null«IF j<size-1», «ENDIF»«ENDFOR»]«IF i<size-1»,«ENDIF»
        «ENDFOR»
        '''
}
