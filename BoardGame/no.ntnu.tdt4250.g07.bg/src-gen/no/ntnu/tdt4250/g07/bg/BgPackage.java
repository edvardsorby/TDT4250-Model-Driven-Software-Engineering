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
	 * The feature id for the '<em><b>Piecetypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_GAME__PIECETYPES = 0;

	/**
	 * The feature id for the '<em><b>Cellstates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_GAME__CELLSTATES = 1;

	/**
	 * The feature id for the '<em><b>Win Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_GAME__WIN_CONDITIONS = 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_GAME__SIZE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_GAME__NAME = 4;

	/**
	 * The number of structural features of the '<em>Board Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_GAME_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Board Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_GAME_OPERATION_COUNT = 0;

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
	int PIECE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Validmoves</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_TYPE__VALIDMOVES = 1;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_TYPE__SYMBOL = 2;

	/**
	 * The feature id for the '<em><b>Effectsoncell</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_TYPE__EFFECTSONCELL = 3;

	/**
	 * The number of structural features of the '<em>Piece Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Piece Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_TYPE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_MOVE__CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Place Anywhere</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_MOVE__PLACE_ANYWHERE = 1;

	/**
	 * The number of structural features of the '<em>Valid Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_MOVE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Valid Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_MOVE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Cellstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CELLSTATE = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

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
	int CELL_STATE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Cell State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_STATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cell State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_STATE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Cellstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_ON_CELL__CELLSTATE = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_ON_CELL__X = 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_ON_CELL__Y = 2;

	/**
	 * The number of structural features of the '<em>Effect On Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_ON_CELL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Effect On Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_ON_CELL_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Inarow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIN_CONDITION__INAROW = 0;

	/**
	 * The number of structural features of the '<em>Win Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIN_CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Win Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIN_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.g07.bg.impl.InARowImpl <em>In ARow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.g07.bg.impl.InARowImpl
	 * @see no.ntnu.tdt4250.g07.bg.impl.BgPackageImpl#getInARow()
	 * @generated
	 */
	int IN_AROW = 7;

	/**
	 * The feature id for the '<em><b>Diagonal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_AROW__DIAGONAL = 0;

	/**
	 * The feature id for the '<em><b>Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_AROW__HORIZONTAL = 1;

	/**
	 * The feature id for the '<em><b>Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_AROW__VERTICAL = 2;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_AROW__COUNT = 3;

	/**
	 * The number of structural features of the '<em>In ARow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_AROW_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>In ARow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_AROW_OPERATION_COUNT = 0;

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
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.g07.bg.BoardGame#getPiecetypes <em>Piecetypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Piecetypes</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.BoardGame#getPiecetypes()
	 * @see #getBoardGame()
	 * @generated
	 */
	EReference getBoardGame_Piecetypes();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.g07.bg.BoardGame#getCellstates <em>Cellstates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cellstates</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.BoardGame#getCellstates()
	 * @see #getBoardGame()
	 * @generated
	 */
	EReference getBoardGame_Cellstates();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.g07.bg.BoardGame#getWinConditions <em>Win Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Win Conditions</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.BoardGame#getWinConditions()
	 * @see #getBoardGame()
	 * @generated
	 */
	EReference getBoardGame_WinConditions();

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
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.g07.bg.PieceType#getValidmoves <em>Validmoves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validmoves</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.PieceType#getValidmoves()
	 * @see #getPieceType()
	 * @generated
	 */
	EReference getPieceType_Validmoves();

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
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.g07.bg.PieceType#getEffectsoncell <em>Effectsoncell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Effectsoncell</em>'.
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
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.g07.bg.ValidMove#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
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
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.g07.bg.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.g07.bg.Condition#getCellstate <em>Cellstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cellstate</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.Condition#getCellstate()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Cellstate();

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
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.g07.bg.EffectOnCell#getCellstate <em>Cellstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cellstate</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.EffectOnCell#getCellstate()
	 * @see #getEffectOnCell()
	 * @generated
	 */
	EReference getEffectOnCell_Cellstate();

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
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.g07.bg.WinCondition <em>Win Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Win Condition</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.WinCondition
	 * @generated
	 */
	EClass getWinCondition();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.g07.bg.WinCondition#getInarow <em>Inarow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inarow</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.WinCondition#getInarow()
	 * @see #getWinCondition()
	 * @generated
	 */
	EReference getWinCondition_Inarow();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.g07.bg.InARow <em>In ARow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In ARow</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.InARow
	 * @generated
	 */
	EClass getInARow();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.g07.bg.InARow#isDiagonal <em>Diagonal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagonal</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.InARow#isDiagonal()
	 * @see #getInARow()
	 * @generated
	 */
	EAttribute getInARow_Diagonal();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.g07.bg.InARow#isHorizontal <em>Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.InARow#isHorizontal()
	 * @see #getInARow()
	 * @generated
	 */
	EAttribute getInARow_Horizontal();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.g07.bg.InARow#isVertical <em>Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.InARow#isVertical()
	 * @see #getInARow()
	 * @generated
	 */
	EAttribute getInARow_Vertical();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.g07.bg.InARow#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see no.ntnu.tdt4250.g07.bg.InARow#getCount()
	 * @see #getInARow()
	 * @generated
	 */
	EAttribute getInARow_Count();

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
		 * The meta object literal for the '<em><b>Piecetypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD_GAME__PIECETYPES = eINSTANCE.getBoardGame_Piecetypes();

		/**
		 * The meta object literal for the '<em><b>Cellstates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD_GAME__CELLSTATES = eINSTANCE.getBoardGame_Cellstates();

		/**
		 * The meta object literal for the '<em><b>Win Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD_GAME__WIN_CONDITIONS = eINSTANCE.getBoardGame_WinConditions();

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
		 * The meta object literal for the '<em><b>Validmoves</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIECE_TYPE__VALIDMOVES = eINSTANCE.getPieceType_Validmoves();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIECE_TYPE__SYMBOL = eINSTANCE.getPieceType_Symbol();

		/**
		 * The meta object literal for the '<em><b>Effectsoncell</b></em>' containment reference list feature.
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
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link no.ntnu.tdt4250.g07.bg.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.g07.bg.impl.ConditionImpl
		 * @see no.ntnu.tdt4250.g07.bg.impl.BgPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Cellstate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__CELLSTATE = eINSTANCE.getCondition_Cellstate();

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
		 * The meta object literal for the '<em><b>Cellstate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECT_ON_CELL__CELLSTATE = eINSTANCE.getEffectOnCell_Cellstate();

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
		 * The meta object literal for the '{@link no.ntnu.tdt4250.g07.bg.impl.WinConditionImpl <em>Win Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.g07.bg.impl.WinConditionImpl
		 * @see no.ntnu.tdt4250.g07.bg.impl.BgPackageImpl#getWinCondition()
		 * @generated
		 */
		EClass WIN_CONDITION = eINSTANCE.getWinCondition();

		/**
		 * The meta object literal for the '<em><b>Inarow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIN_CONDITION__INAROW = eINSTANCE.getWinCondition_Inarow();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.g07.bg.impl.InARowImpl <em>In ARow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.g07.bg.impl.InARowImpl
		 * @see no.ntnu.tdt4250.g07.bg.impl.BgPackageImpl#getInARow()
		 * @generated
		 */
		EClass IN_AROW = eINSTANCE.getInARow();

		/**
		 * The meta object literal for the '<em><b>Diagonal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_AROW__DIAGONAL = eINSTANCE.getInARow_Diagonal();

		/**
		 * The meta object literal for the '<em><b>Horizontal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_AROW__HORIZONTAL = eINSTANCE.getInARow_Horizontal();

		/**
		 * The meta object literal for the '<em><b>Vertical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_AROW__VERTICAL = eINSTANCE.getInARow_Vertical();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_AROW__COUNT = eINSTANCE.getInARow_Count();

	}

} //BgPackage
