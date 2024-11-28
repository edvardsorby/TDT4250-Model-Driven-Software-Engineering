/**
 */
package no.ntnu.tdt4250.g07.bg;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.g07.bg.BgFactory
 * @model kind="package"
 * @generated
 */
public interface BgPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bg";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ntnu.no/tdt4250/g07/bg";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BgPackage eINSTANCE = no.ntnu.tdt4250.g07.bg.impl.BgPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.g07.bg.impl.BoardGameImpl <em>Board Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.g07.bg.impl.BoardGameImpl
	 * @see no.ntnu.tdt4250.g07.bg.impl.BgPackageImpl#getBoardGame()
	 * @generated
	 */
	int BOARD_GAME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_GAME__NAME = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_GAME__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Board Game Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_GAME__BOARD_GAME_ELEMENTS = 2;

	/**
	 * The number of structural features of the '<em>Board Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_GAME_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Board Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_GAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.g07.bg.impl.BoardGameElementImpl <em>Board Game Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.g07.bg.impl.BoardGameElementImpl
	 * @see no.ntnu.tdt4250.g07.bg.impl.BgPackageImpl#getBoardGameElement()
	 * @generated
	 */
	int BOARD_GAME_ELEMENT = 8;

	/**
	 * The number of structural features of the '<em>Board Game Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_GAME_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Board Game Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_GAME_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.g07.bg.impl.PieceTypeImpl <em>Piece Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.g07.bg.impl.PieceTypeImpl
	 * @see no.ntnu.tdt4250.g07.bg.impl.BgPackageImpl#getPieceType()
	 * @generated
	 */
	int PIECE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_TYPE__NAME = BOARD_GAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_TYPE__SYMBOL = BOARD_GAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Valid Moves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_TYPE__VALID_MOVES = BOARD_GAME_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Effectsoncell</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_TYPE__EFFECTSONCELL = BOARD_GAME_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Piece Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_TYPE_FEATURE_COUNT = BOARD_GAME_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Piece Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_TYPE_OPERATION_COUNT = BOARD_GAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.g07.bg.impl.ValidMoveImpl <em>Valid Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.g07.bg.impl.ValidMoveImpl
	 * @see no.ntnu.tdt4250.g07.bg.impl.BgPackageImpl#getValidMove()
	 * @generated
	 */
	int VALID_MOVE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_MOVE__NAME = BOARD_GAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_MOVE__CONDITIONS = BOARD_GAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Place Anywhere</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_MOVE__PLACE_ANYWHERE = BOARD_GAME_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Valid Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_MOVE_FEATURE_COUNT = BOARD_GAME_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Valid Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_MOVE_OPERATION_COUNT = BOARD_GAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.g07.bg.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.g07.bg.impl.ConditionImpl
	 * @see no.ntnu.tdt4250.g07.bg.impl.BgPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = BOARD_GAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cell State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CELL_STATE = BOARD_GAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = BOARD_GAME_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = BOARD_GAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.g07.bg.impl.CellStateImpl <em>Cell State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.g07.bg.impl.CellStateImpl
	 * @see no.ntnu.tdt4250.g07.bg.impl.BgPackageImpl#getCellState()
	 * @generated
	 */
	int CELL_STATE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_STATE__NAME = BOARD_GAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cell State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_STATE_FEATURE_COUNT = BOARD_GAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cell State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_STATE_OPERATION_COUNT = BOARD_GAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.g07.bg.impl.EffectOnCellImpl <em>Effect On Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.g07.bg.impl.EffectOnCellImpl
	 * @see no.ntnu.tdt4250.g07.bg.impl.BgPackageImpl#getEffectOnCell()
	 * @generated
	 */
	int EFFECT_ON_CELL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_ON_CELL__NAME = BOARD_GAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cell State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_ON_CELL__CELL_STATE = BOARD_GAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_ON_CELL__X = BOARD_GAME_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_ON_CELL__Y = BOARD_GAME_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Effect On Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_ON_CELL_FEATURE_COUNT = BOARD_GAME_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Effect On Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_ON_CELL_OPERATION_COUNT = BOARD_GAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.g07.bg.impl.WinConditionImpl <em>Win Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.g07.bg.impl.WinConditionImpl
	 * @see no.ntnu.tdt4250.g07.bg.impl.BgPackageImpl#getWinCondition()
	 * @generated
	 */
	int WIN_CONDITION = 6;

	/**
	 * The feature id for the '<em><b>Win Condition Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIN_CONDITION__WIN_CONDITION_ELEMENTS = BOARD_GAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Win Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIN_CONDITION_FEATURE_COUNT = BOARD_GAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Win Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIN_CONDITION_OPERATION_COUNT = BOARD_GAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.g07.bg.impl.WinConditionElementImpl <em>Win Condition Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.g07.bg.impl.WinConditionElementImpl
	 * @see no.ntnu.tdt4250.g07.bg.impl.BgPackageImpl#getWinConditionElement()
	 * @generated
	 */
	int WIN_CONDITION_ELEMENT = 9;

	/**
	 * The number of structural features of the '<em>Win Condition Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIN_CONDITION_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Win Condition Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIN_CONDITION_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.g07.bg.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.g07.bg.impl.LineImpl
	 * @see no.ntnu.tdt4250.g07.bg.impl.BgPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 7;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__COUNT = WIN_CONDITION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diagonal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__DIAGONAL = WIN_CONDITION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__HORIZONTAL = WIN_CONDITION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__VERTICAL = WIN_CONDITION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__UNIQUE = WIN_CONDITION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = WIN_CONDITION_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OPERATION_COUNT = WIN_CONDITION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.g07.bg.BoardGame <em>Board Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board Game</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.BoardGame
	 * @generated
	 */
	EClass getBoardGame();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.g07.bg.BoardGame#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.BoardGame#getSize()
	 * @see #getBoardGame()
	 * @generated
	 */
	EAttribute getBoardGame_Size();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.g07.bg.BoardGame#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.BoardGame#getName()
	 * @see #getBoardGame()
	 * @generated
	 */
	EAttribute getBoardGame_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.g07.bg.BoardGame#getBoardGameElements <em>Board Game Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Board Game Elements</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.BoardGame#getBoardGameElements()
	 * @see #getBoardGame()
	 * @generated
	 */
	EReference getBoardGame_BoardGameElements();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.g07.bg.PieceType <em>Piece Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Piece Type</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.PieceType
	 * @generated
	 */
	EClass getPieceType();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.g07.bg.PieceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.PieceType#getName()
	 * @see #getPieceType()
	 * @generated
	 */
	EAttribute getPieceType_Name();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.g07.bg.PieceType#getValidMoves <em>Valid Moves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Valid Moves</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.PieceType#getValidMoves()
	 * @see #getPieceType()
	 * @generated
	 */
	EReference getPieceType_ValidMoves();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.g07.bg.PieceType#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.PieceType#getSymbol()
	 * @see #getPieceType()
	 * @generated
	 */
	EAttribute getPieceType_Symbol();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.g07.bg.PieceType#getEffectsoncell <em>Effectsoncell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Effectsoncell</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.PieceType#getEffectsoncell()
	 * @see #getPieceType()
	 * @generated
	 */
	EReference getPieceType_Effectsoncell();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.g07.bg.ValidMove <em>Valid Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valid Move</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.ValidMove
	 * @generated
	 */
	EClass getValidMove();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.g07.bg.ValidMove#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conditions</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.ValidMove#getConditions()
	 * @see #getValidMove()
	 * @generated
	 */
	EReference getValidMove_Conditions();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.g07.bg.ValidMove#isPlaceAnywhere <em>Place Anywhere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Place Anywhere</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.ValidMove#isPlaceAnywhere()
	 * @see #getValidMove()
	 * @generated
	 */
	EAttribute getValidMove_PlaceAnywhere();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.g07.bg.ValidMove#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.ValidMove#getName()
	 * @see #getValidMove()
	 * @generated
	 */
	EAttribute getValidMove_Name();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.g07.bg.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.g07.bg.Condition#getCellState <em>Cell State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cell State</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.Condition#getCellState()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_CellState();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.g07.bg.Condition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.Condition#getName()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Name();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.g07.bg.CellState <em>Cell State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell State</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.CellState
	 * @generated
	 */
	EClass getCellState();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.g07.bg.CellState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.CellState#getName()
	 * @see #getCellState()
	 * @generated
	 */
	EAttribute getCellState_Name();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.g07.bg.EffectOnCell <em>Effect On Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effect On Cell</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.EffectOnCell
	 * @generated
	 */
	EClass getEffectOnCell();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.g07.bg.EffectOnCell#getCellState <em>Cell State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cell State</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.EffectOnCell#getCellState()
	 * @see #getEffectOnCell()
	 * @generated
	 */
	EReference getEffectOnCell_CellState();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.g07.bg.EffectOnCell#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.EffectOnCell#getX()
	 * @see #getEffectOnCell()
	 * @generated
	 */
	EAttribute getEffectOnCell_X();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.g07.bg.EffectOnCell#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.EffectOnCell#getY()
	 * @see #getEffectOnCell()
	 * @generated
	 */
	EAttribute getEffectOnCell_Y();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.g07.bg.EffectOnCell#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.EffectOnCell#getName()
	 * @see #getEffectOnCell()
	 * @generated
	 */
	EAttribute getEffectOnCell_Name();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.g07.bg.WinCondition <em>Win Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Win Condition</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.WinCondition
	 * @generated
	 */
	EClass getWinCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.g07.bg.WinCondition#getWinConditionElements <em>Win Condition Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Win Condition Elements</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.WinCondition#getWinConditionElements()
	 * @see #getWinCondition()
	 * @generated
	 */
	EReference getWinCondition_WinConditionElements();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.g07.bg.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.g07.bg.Line#isDiagonal <em>Diagonal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagonal</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.Line#isDiagonal()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Diagonal();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.g07.bg.Line#isHorizontal <em>Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.Line#isHorizontal()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Horizontal();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.g07.bg.Line#isVertical <em>Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.Line#isVertical()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Vertical();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.g07.bg.Line#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.Line#getCount()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Count();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.g07.bg.Line#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.Line#isUnique()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Unique();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.g07.bg.BoardGameElement <em>Board Game Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board Game Element</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.BoardGameElement
	 * @generated
	 */
	EClass getBoardGameElement();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.g07.bg.WinConditionElement <em>Win Condition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Win Condition Element</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.WinConditionElement
	 * @generated
	 */
	EClass getWinConditionElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BgFactory getBgFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.g07.bg.impl.BoardGameImpl <em>Board Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.g07.bg.impl.BoardGameImpl
		 * @see no.ntnu.tdt4250.g07.bg.impl.BgPackageImpl#getBoardGame()
		 * @generated
		 */
		EClass BOARD_GAME = eINSTANCE.getBoardGame();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD_GAME__SIZE = eINSTANCE.getBoardGame_Size();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD_GAME__NAME = eINSTANCE.getBoardGame_Name();

		/**
		 * The meta object literal for the '<em><b>Board Game Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD_GAME__BOARD_GAME_ELEMENTS = eINSTANCE.getBoardGame_BoardGameElements();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.g07.bg.impl.PieceTypeImpl <em>Piece Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.g07.bg.impl.PieceTypeImpl
		 * @see no.ntnu.tdt4250.g07.bg.impl.BgPackageImpl#getPieceType()
		 * @generated
		 */
		EClass PIECE_TYPE = eINSTANCE.getPieceType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIECE_TYPE__NAME = eINSTANCE.getPieceType_Name();

		/**
		 * The meta object literal for the '<em><b>Valid Moves</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIECE_TYPE__VALID_MOVES = eINSTANCE.getPieceType_ValidMoves();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIECE_TYPE__SYMBOL = eINSTANCE.getPieceType_Symbol();

		/**
		 * The meta object literal for the '<em><b>Effectsoncell</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIECE_TYPE__EFFECTSONCELL = eINSTANCE.getPieceType_Effectsoncell();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.g07.bg.impl.ValidMoveImpl <em>Valid Move</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.g07.bg.impl.ValidMoveImpl
		 * @see no.ntnu.tdt4250.g07.bg.impl.BgPackageImpl#getValidMove()
		 * @generated
		 */
		EClass VALID_MOVE = eINSTANCE.getValidMove();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALID_MOVE__CONDITIONS = eINSTANCE.getValidMove_Conditions();

		/**
		 * The meta object literal for the '<em><b>Place Anywhere</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALID_MOVE__PLACE_ANYWHERE = eINSTANCE.getValidMove_PlaceAnywhere();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALID_MOVE__NAME = eINSTANCE.getValidMove_Name();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.g07.bg.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.g07.bg.impl.ConditionImpl
		 * @see no.ntnu.tdt4250.g07.bg.impl.BgPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Cell State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__CELL_STATE = eINSTANCE.getCondition_CellState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__NAME = eINSTANCE.getCondition_Name();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.g07.bg.impl.CellStateImpl <em>Cell State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.g07.bg.impl.CellStateImpl
		 * @see no.ntnu.tdt4250.g07.bg.impl.BgPackageImpl#getCellState()
		 * @generated
		 */
		EClass CELL_STATE = eINSTANCE.getCellState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL_STATE__NAME = eINSTANCE.getCellState_Name();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.g07.bg.impl.EffectOnCellImpl <em>Effect On Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.g07.bg.impl.EffectOnCellImpl
		 * @see no.ntnu.tdt4250.g07.bg.impl.BgPackageImpl#getEffectOnCell()
		 * @generated
		 */
		EClass EFFECT_ON_CELL = eINSTANCE.getEffectOnCell();

		/**
		 * The meta object literal for the '<em><b>Cell State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECT_ON_CELL__CELL_STATE = eINSTANCE.getEffectOnCell_CellState();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT_ON_CELL__X = eINSTANCE.getEffectOnCell_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT_ON_CELL__Y = eINSTANCE.getEffectOnCell_Y();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT_ON_CELL__NAME = eINSTANCE.getEffectOnCell_Name();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.g07.bg.impl.WinConditionImpl <em>Win Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.g07.bg.impl.WinConditionImpl
		 * @see no.ntnu.tdt4250.g07.bg.impl.BgPackageImpl#getWinCondition()
		 * @generated
		 */
		EClass WIN_CONDITION = eINSTANCE.getWinCondition();

		/**
		 * The meta object literal for the '<em><b>Win Condition Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIN_CONDITION__WIN_CONDITION_ELEMENTS = eINSTANCE.getWinCondition_WinConditionElements();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.g07.bg.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.g07.bg.impl.LineImpl
		 * @see no.ntnu.tdt4250.g07.bg.impl.BgPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Diagonal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__DIAGONAL = eINSTANCE.getLine_Diagonal();

		/**
		 * The meta object literal for the '<em><b>Horizontal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__HORIZONTAL = eINSTANCE.getLine_Horizontal();

		/**
		 * The meta object literal for the '<em><b>Vertical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__VERTICAL = eINSTANCE.getLine_Vertical();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__COUNT = eINSTANCE.getLine_Count();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__UNIQUE = eINSTANCE.getLine_Unique();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.g07.bg.impl.BoardGameElementImpl <em>Board Game Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.g07.bg.impl.BoardGameElementImpl
		 * @see no.ntnu.tdt4250.g07.bg.impl.BgPackageImpl#getBoardGameElement()
		 * @generated
		 */
		EClass BOARD_GAME_ELEMENT = eINSTANCE.getBoardGameElement();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.g07.bg.impl.WinConditionElementImpl <em>Win Condition Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.g07.bg.impl.WinConditionElementImpl
		 * @see no.ntnu.tdt4250.g07.bg.impl.BgPackageImpl#getWinConditionElement()
		 * @generated
		 */
		EClass WIN_CONDITION_ELEMENT = eINSTANCE.getWinConditionElement();

	}

} //BgPackage
