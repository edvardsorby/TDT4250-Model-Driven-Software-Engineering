/**
 */
package no.ntnu.tdt4250.group07.bg;

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
 * @see no.ntnu.tdt4250.group07.bg.BgFactory
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
	String eNS_URI = "http://www.example.org/bg";

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
	BgPackage eINSTANCE = no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group07.bg.impl.RulesImpl <em>Rules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group07.bg.impl.RulesImpl
	 * @see no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl#getRules()
	 * @generated
	 */
	int RULES = 0;

	/**
	 * The feature id for the '<em><b>Board</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES__BOARD = 0;

	/**
	 * The number of structural features of the '<em>Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group07.bg.impl.BoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group07.bg.impl.BoardImpl
	 * @see no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl#getBoard()
	 * @generated
	 */
	int BOARD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__START_POSITION = 1;

	/**
	 * The feature id for the '<em><b>Playerbrickset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__PLAYERBRICKSET = 2;

	/**
	 * The feature id for the '<em><b>Cell</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__CELL = 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__WIDTH = 4;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__HEIGHT = 5;

	/**
	 * The feature id for the '<em><b>Boardstate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__BOARDSTATE = 6;

	/**
	 * The feature id for the '<em><b>Validmove</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__VALIDMOVE = 7;

	/**
	 * The number of structural features of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group07.bg.impl.PlayerBrickSetImpl <em>Player Brick Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group07.bg.impl.PlayerBrickSetImpl
	 * @see no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl#getPlayerBrickSet()
	 * @generated
	 */
	int PLAYER_BRICK_SET = 2;

	/**
	 * The feature id for the '<em><b>Brick</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_BRICK_SET__BRICK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_BRICK_SET__NAME = 1;

	/**
	 * The number of structural features of the '<em>Player Brick Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_BRICK_SET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Player Brick Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_BRICK_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group07.bg.impl.BrickImpl <em>Brick</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group07.bg.impl.BrickImpl
	 * @see no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl#getBrick()
	 * @generated
	 */
	int BRICK = 3;

	/**
	 * The feature id for the '<em><b>Bricktype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK__BRICKTYPE = 0;

	/**
	 * The feature id for the '<em><b>Start Cell</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK__START_CELL = 1;

	/**
	 * The number of structural features of the '<em>Brick</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Brick</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group07.bg.impl.BrickTypeImpl <em>Brick Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group07.bg.impl.BrickTypeImpl
	 * @see no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl#getBrickType()
	 * @generated
	 */
	int BRICK_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Brickstate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK_TYPE__BRICKSTATE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Effectoncell</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK_TYPE__EFFECTONCELL = 2;

	/**
	 * The number of structural features of the '<em>Brick Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Brick Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group07.bg.impl.BrickStateImpl <em>Brick State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group07.bg.impl.BrickStateImpl
	 * @see no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl#getBrickState()
	 * @generated
	 */
	int BRICK_STATE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK_STATE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Brick State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK_STATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Brick State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group07.bg.impl.CellImpl <em>Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group07.bg.impl.CellImpl
	 * @see no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl#getCell()
	 * @generated
	 */
	int CELL = 6;

	/**
	 * The feature id for the '<em><b>Xposition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__XPOSITION = 0;

	/**
	 * The feature id for the '<em><b>Yposition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__YPOSITION = 1;

	/**
	 * The feature id for the '<em><b>Celltype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__CELLTYPE = 2;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group07.bg.impl.CellTypeImpl <em>Cell Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group07.bg.impl.CellTypeImpl
	 * @see no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl#getCellType()
	 * @generated
	 */
	int CELL_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Cellstate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_TYPE__CELLSTATE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Cell Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cell Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group07.bg.impl.CellStateImpl <em>Cell State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group07.bg.impl.CellStateImpl
	 * @see no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl#getCellState()
	 * @generated
	 */
	int CELL_STATE = 8;

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
	 * The meta object id for the '{@link no.ntnu.tdt4250.group07.bg.impl.BoardStateImpl <em>Board State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group07.bg.impl.BoardStateImpl
	 * @see no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl#getBoardState()
	 * @generated
	 */
	int BOARD_STATE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Toggleable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_STATE__TOGGLEABLE = 1;

	/**
	 * The number of structural features of the '<em>Board State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_STATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Board State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group07.bg.impl.ValidMoveImpl <em>Valid Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group07.bg.impl.ValidMoveImpl
	 * @see no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl#getValidMove()
	 * @generated
	 */
	int VALID_MOVE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_MOVE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Brickchange</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_MOVE__BRICKCHANGE = 1;

	/**
	 * The feature id for the '<em><b>Cellchange</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_MOVE__CELLCHANGE = 2;

	/**
	 * The number of structural features of the '<em>Valid Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_MOVE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Valid Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_MOVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group07.bg.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group07.bg.impl.ConditionImpl
	 * @see no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 11;

	/**
	 * The feature id for the '<em><b>Boardstate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__BOARDSTATE = 0;

	/**
	 * The feature id for the '<em><b>Relativeposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__RELATIVEPOSITION = 1;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__MANDATORY = 2;

	/**
	 * The feature id for the '<em><b>Prohibited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__PROHIBITED = 3;

	/**
	 * The feature id for the '<em><b>Bricktype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__BRICKTYPE = 4;

	/**
	 * The feature id for the '<em><b>Brickstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__BRICKSTATE = 5;

	/**
	 * The feature id for the '<em><b>Celltype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CELLTYPE = 6;

	/**
	 * The feature id for the '<em><b>Cellstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CELLSTATE = 7;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group07.bg.impl.BrickChangeImpl <em>Brick Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group07.bg.impl.BrickChangeImpl
	 * @see no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl#getBrickChange()
	 * @generated
	 */
	int BRICK_CHANGE = 12;

	/**
	 * The feature id for the '<em><b>Positionchange</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK_CHANGE__POSITIONCHANGE = 0;

	/**
	 * The feature id for the '<em><b>Moving Brick</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK_CHANGE__MOVING_BRICK = 1;

	/**
	 * The feature id for the '<em><b>Change From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK_CHANGE__CHANGE_FROM = 2;

	/**
	 * The feature id for the '<em><b>Change To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK_CHANGE__CHANGE_TO = 3;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK_CHANGE__CONDITION = 4;

	/**
	 * The number of structural features of the '<em>Brick Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK_CHANGE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Brick Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK_CHANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group07.bg.impl.RelativePositionImpl <em>Relative Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group07.bg.impl.RelativePositionImpl
	 * @see no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl#getRelativePosition()
	 * @generated
	 */
	int RELATIVE_POSITION = 13;

	/**
	 * The feature id for the '<em><b>Xchange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_POSITION__XCHANGE = 0;

	/**
	 * The feature id for the '<em><b>Ychange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_POSITION__YCHANGE = 1;

	/**
	 * The number of structural features of the '<em>Relative Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_POSITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Relative Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group07.bg.impl.CellChangeImpl <em>Cell Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group07.bg.impl.CellChangeImpl
	 * @see no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl#getCellChange()
	 * @generated
	 */
	int CELL_CHANGE = 14;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_CHANGE__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Change From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_CHANGE__CHANGE_FROM = 1;

	/**
	 * The feature id for the '<em><b>Change To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_CHANGE__CHANGE_TO = 2;

	/**
	 * The number of structural features of the '<em>Cell Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_CHANGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cell Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_CHANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group07.bg.impl.EffectOnCellImpl <em>Effect On Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group07.bg.impl.EffectOnCellImpl
	 * @see no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl#getEffectOnCell()
	 * @generated
	 */
	int EFFECT_ON_CELL = 15;

	/**
	 * The feature id for the '<em><b>Relativeposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_ON_CELL__RELATIVEPOSITION = 0;

	/**
	 * The feature id for the '<em><b>Cellstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_ON_CELL__CELLSTATE = 1;

	/**
	 * The number of structural features of the '<em>Effect On Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_ON_CELL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Effect On Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_ON_CELL_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group07.bg.Rules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rules</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.Rules
	 * @generated
	 */
	EClass getRules();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.group07.bg.Rules#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Board</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.Rules#getBoard()
	 * @see #getRules()
	 * @generated
	 */
	EReference getRules_Board();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group07.bg.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.Board
	 * @generated
	 */
	EClass getBoard();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group07.bg.Board#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.Board#getName()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group07.bg.Board#isStartPosition <em>Start Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Position</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.Board#isStartPosition()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_StartPosition();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.group07.bg.Board#getPlayerbrickset <em>Playerbrickset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Playerbrickset</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.Board#getPlayerbrickset()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Playerbrickset();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.group07.bg.Board#getCell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cell</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.Board#getCell()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Cell();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group07.bg.Board#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.Board#getWidth()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_Width();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group07.bg.Board#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.Board#getHeight()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_Height();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.group07.bg.Board#getBoardstate <em>Boardstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Boardstate</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.Board#getBoardstate()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Boardstate();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.group07.bg.Board#getValidmove <em>Validmove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validmove</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.Board#getValidmove()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Validmove();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group07.bg.PlayerBrickSet <em>Player Brick Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player Brick Set</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.PlayerBrickSet
	 * @generated
	 */
	EClass getPlayerBrickSet();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.group07.bg.PlayerBrickSet#getBrick <em>Brick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Brick</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.PlayerBrickSet#getBrick()
	 * @see #getPlayerBrickSet()
	 * @generated
	 */
	EReference getPlayerBrickSet_Brick();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group07.bg.PlayerBrickSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.PlayerBrickSet#getName()
	 * @see #getPlayerBrickSet()
	 * @generated
	 */
	EAttribute getPlayerBrickSet_Name();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group07.bg.Brick <em>Brick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Brick</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.Brick
	 * @generated
	 */
	EClass getBrick();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.group07.bg.Brick#getBricktype <em>Bricktype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bricktype</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.Brick#getBricktype()
	 * @see #getBrick()
	 * @generated
	 */
	EReference getBrick_Bricktype();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.group07.bg.Brick#getStartCell <em>Start Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Cell</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.Brick#getStartCell()
	 * @see #getBrick()
	 * @generated
	 */
	EReference getBrick_StartCell();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group07.bg.BrickType <em>Brick Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Brick Type</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.BrickType
	 * @generated
	 */
	EClass getBrickType();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.group07.bg.BrickType#getBrickstate <em>Brickstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Brickstate</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.BrickType#getBrickstate()
	 * @see #getBrickType()
	 * @generated
	 */
	EReference getBrickType_Brickstate();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group07.bg.BrickType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.BrickType#getName()
	 * @see #getBrickType()
	 * @generated
	 */
	EAttribute getBrickType_Name();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.group07.bg.BrickType#getEffectoncell <em>Effectoncell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Effectoncell</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.BrickType#getEffectoncell()
	 * @see #getBrickType()
	 * @generated
	 */
	EReference getBrickType_Effectoncell();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group07.bg.BrickState <em>Brick State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Brick State</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.BrickState
	 * @generated
	 */
	EClass getBrickState();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group07.bg.BrickState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.BrickState#getName()
	 * @see #getBrickState()
	 * @generated
	 */
	EAttribute getBrickState_Name();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group07.bg.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.Cell
	 * @generated
	 */
	EClass getCell();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group07.bg.Cell#getXposition <em>Xposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xposition</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.Cell#getXposition()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Xposition();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group07.bg.Cell#getYposition <em>Yposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yposition</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.Cell#getYposition()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Yposition();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.group07.bg.Cell#getCelltype <em>Celltype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Celltype</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.Cell#getCelltype()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_Celltype();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group07.bg.CellType <em>Cell Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell Type</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.CellType
	 * @generated
	 */
	EClass getCellType();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.group07.bg.CellType#getCellstate <em>Cellstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cellstate</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.CellType#getCellstate()
	 * @see #getCellType()
	 * @generated
	 */
	EReference getCellType_Cellstate();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group07.bg.CellType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.CellType#getName()
	 * @see #getCellType()
	 * @generated
	 */
	EAttribute getCellType_Name();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group07.bg.CellState <em>Cell State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell State</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.CellState
	 * @generated
	 */
	EClass getCellState();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group07.bg.CellState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.CellState#getName()
	 * @see #getCellState()
	 * @generated
	 */
	EAttribute getCellState_Name();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group07.bg.BoardState <em>Board State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board State</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.BoardState
	 * @generated
	 */
	EClass getBoardState();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group07.bg.BoardState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.BoardState#getName()
	 * @see #getBoardState()
	 * @generated
	 */
	EAttribute getBoardState_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group07.bg.BoardState#isToggleable <em>Toggleable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Toggleable</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.BoardState#isToggleable()
	 * @see #getBoardState()
	 * @generated
	 */
	EAttribute getBoardState_Toggleable();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group07.bg.ValidMove <em>Valid Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valid Move</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.ValidMove
	 * @generated
	 */
	EClass getValidMove();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group07.bg.ValidMove#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.ValidMove#getName()
	 * @see #getValidMove()
	 * @generated
	 */
	EAttribute getValidMove_Name();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.group07.bg.ValidMove#getBrickchange <em>Brickchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Brickchange</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.ValidMove#getBrickchange()
	 * @see #getValidMove()
	 * @generated
	 */
	EReference getValidMove_Brickchange();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.group07.bg.ValidMove#getCellchange <em>Cellchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cellchange</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.ValidMove#getCellchange()
	 * @see #getValidMove()
	 * @generated
	 */
	EReference getValidMove_Cellchange();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group07.bg.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.group07.bg.Condition#getBoardstate <em>Boardstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Boardstate</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.Condition#getBoardstate()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Boardstate();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.group07.bg.Condition#getRelativeposition <em>Relativeposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relativeposition</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.Condition#getRelativeposition()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Relativeposition();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group07.bg.Condition#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.Condition#isMandatory()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Mandatory();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group07.bg.Condition#isProhibited <em>Prohibited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prohibited</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.Condition#isProhibited()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Prohibited();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.group07.bg.Condition#getBricktype <em>Bricktype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bricktype</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.Condition#getBricktype()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Bricktype();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.group07.bg.Condition#getBrickstate <em>Brickstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Brickstate</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.Condition#getBrickstate()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Brickstate();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.group07.bg.Condition#getCelltype <em>Celltype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Celltype</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.Condition#getCelltype()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Celltype();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.group07.bg.Condition#getCellstate <em>Cellstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cellstate</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.Condition#getCellstate()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Cellstate();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group07.bg.BrickChange <em>Brick Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Brick Change</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.BrickChange
	 * @generated
	 */
	EClass getBrickChange();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.group07.bg.BrickChange#getPositionchange <em>Positionchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Positionchange</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.BrickChange#getPositionchange()
	 * @see #getBrickChange()
	 * @generated
	 */
	EReference getBrickChange_Positionchange();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.group07.bg.BrickChange#getMovingBrick <em>Moving Brick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Moving Brick</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.BrickChange#getMovingBrick()
	 * @see #getBrickChange()
	 * @generated
	 */
	EReference getBrickChange_MovingBrick();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.group07.bg.BrickChange#getChangeFrom <em>Change From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change From</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.BrickChange#getChangeFrom()
	 * @see #getBrickChange()
	 * @generated
	 */
	EReference getBrickChange_ChangeFrom();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.group07.bg.BrickChange#getChangeTo <em>Change To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change To</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.BrickChange#getChangeTo()
	 * @see #getBrickChange()
	 * @generated
	 */
	EReference getBrickChange_ChangeTo();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.group07.bg.BrickChange#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Condition</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.BrickChange#getCondition()
	 * @see #getBrickChange()
	 * @generated
	 */
	EReference getBrickChange_Condition();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group07.bg.RelativePosition <em>Relative Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Position</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.RelativePosition
	 * @generated
	 */
	EClass getRelativePosition();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group07.bg.RelativePosition#getXchange <em>Xchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xchange</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.RelativePosition#getXchange()
	 * @see #getRelativePosition()
	 * @generated
	 */
	EAttribute getRelativePosition_Xchange();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group07.bg.RelativePosition#getYchange <em>Ychange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ychange</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.RelativePosition#getYchange()
	 * @see #getRelativePosition()
	 * @generated
	 */
	EAttribute getRelativePosition_Ychange();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group07.bg.CellChange <em>Cell Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell Change</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.CellChange
	 * @generated
	 */
	EClass getCellChange();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.group07.bg.CellChange#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Condition</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.CellChange#getCondition()
	 * @see #getCellChange()
	 * @generated
	 */
	EReference getCellChange_Condition();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.group07.bg.CellChange#getChangeFrom <em>Change From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change From</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.CellChange#getChangeFrom()
	 * @see #getCellChange()
	 * @generated
	 */
	EReference getCellChange_ChangeFrom();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.group07.bg.CellChange#getChangeTo <em>Change To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change To</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.CellChange#getChangeTo()
	 * @see #getCellChange()
	 * @generated
	 */
	EReference getCellChange_ChangeTo();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group07.bg.EffectOnCell <em>Effect On Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effect On Cell</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.EffectOnCell
	 * @generated
	 */
	EClass getEffectOnCell();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.group07.bg.EffectOnCell#getRelativeposition <em>Relativeposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relativeposition</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.EffectOnCell#getRelativeposition()
	 * @see #getEffectOnCell()
	 * @generated
	 */
	EReference getEffectOnCell_Relativeposition();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.group07.bg.EffectOnCell#getCellstate <em>Cellstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cellstate</em>'.
	 * @see no.ntnu.tdt4250.group07.bg.EffectOnCell#getCellstate()
	 * @see #getEffectOnCell()
	 * @generated
	 */
	EReference getEffectOnCell_Cellstate();

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
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group07.bg.impl.RulesImpl <em>Rules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group07.bg.impl.RulesImpl
		 * @see no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl#getRules()
		 * @generated
		 */
		EClass RULES = eINSTANCE.getRules();

		/**
		 * The meta object literal for the '<em><b>Board</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULES__BOARD = eINSTANCE.getRules_Board();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group07.bg.impl.BoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group07.bg.impl.BoardImpl
		 * @see no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl#getBoard()
		 * @generated
		 */
		EClass BOARD = eINSTANCE.getBoard();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__NAME = eINSTANCE.getBoard_Name();

		/**
		 * The meta object literal for the '<em><b>Start Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__START_POSITION = eINSTANCE.getBoard_StartPosition();

		/**
		 * The meta object literal for the '<em><b>Playerbrickset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__PLAYERBRICKSET = eINSTANCE.getBoard_Playerbrickset();

		/**
		 * The meta object literal for the '<em><b>Cell</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__CELL = eINSTANCE.getBoard_Cell();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__WIDTH = eINSTANCE.getBoard_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__HEIGHT = eINSTANCE.getBoard_Height();

		/**
		 * The meta object literal for the '<em><b>Boardstate</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__BOARDSTATE = eINSTANCE.getBoard_Boardstate();

		/**
		 * The meta object literal for the '<em><b>Validmove</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__VALIDMOVE = eINSTANCE.getBoard_Validmove();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group07.bg.impl.PlayerBrickSetImpl <em>Player Brick Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group07.bg.impl.PlayerBrickSetImpl
		 * @see no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl#getPlayerBrickSet()
		 * @generated
		 */
		EClass PLAYER_BRICK_SET = eINSTANCE.getPlayerBrickSet();

		/**
		 * The meta object literal for the '<em><b>Brick</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER_BRICK_SET__BRICK = eINSTANCE.getPlayerBrickSet_Brick();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_BRICK_SET__NAME = eINSTANCE.getPlayerBrickSet_Name();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group07.bg.impl.BrickImpl <em>Brick</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group07.bg.impl.BrickImpl
		 * @see no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl#getBrick()
		 * @generated
		 */
		EClass BRICK = eINSTANCE.getBrick();

		/**
		 * The meta object literal for the '<em><b>Bricktype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRICK__BRICKTYPE = eINSTANCE.getBrick_Bricktype();

		/**
		 * The meta object literal for the '<em><b>Start Cell</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRICK__START_CELL = eINSTANCE.getBrick_StartCell();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group07.bg.impl.BrickTypeImpl <em>Brick Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group07.bg.impl.BrickTypeImpl
		 * @see no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl#getBrickType()
		 * @generated
		 */
		EClass BRICK_TYPE = eINSTANCE.getBrickType();

		/**
		 * The meta object literal for the '<em><b>Brickstate</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRICK_TYPE__BRICKSTATE = eINSTANCE.getBrickType_Brickstate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRICK_TYPE__NAME = eINSTANCE.getBrickType_Name();

		/**
		 * The meta object literal for the '<em><b>Effectoncell</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRICK_TYPE__EFFECTONCELL = eINSTANCE.getBrickType_Effectoncell();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group07.bg.impl.BrickStateImpl <em>Brick State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group07.bg.impl.BrickStateImpl
		 * @see no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl#getBrickState()
		 * @generated
		 */
		EClass BRICK_STATE = eINSTANCE.getBrickState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRICK_STATE__NAME = eINSTANCE.getBrickState_Name();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group07.bg.impl.CellImpl <em>Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group07.bg.impl.CellImpl
		 * @see no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl#getCell()
		 * @generated
		 */
		EClass CELL = eINSTANCE.getCell();

		/**
		 * The meta object literal for the '<em><b>Xposition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__XPOSITION = eINSTANCE.getCell_Xposition();

		/**
		 * The meta object literal for the '<em><b>Yposition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__YPOSITION = eINSTANCE.getCell_Yposition();

		/**
		 * The meta object literal for the '<em><b>Celltype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__CELLTYPE = eINSTANCE.getCell_Celltype();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group07.bg.impl.CellTypeImpl <em>Cell Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group07.bg.impl.CellTypeImpl
		 * @see no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl#getCellType()
		 * @generated
		 */
		EClass CELL_TYPE = eINSTANCE.getCellType();

		/**
		 * The meta object literal for the '<em><b>Cellstate</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL_TYPE__CELLSTATE = eINSTANCE.getCellType_Cellstate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL_TYPE__NAME = eINSTANCE.getCellType_Name();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group07.bg.impl.CellStateImpl <em>Cell State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group07.bg.impl.CellStateImpl
		 * @see no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl#getCellState()
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
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group07.bg.impl.BoardStateImpl <em>Board State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group07.bg.impl.BoardStateImpl
		 * @see no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl#getBoardState()
		 * @generated
		 */
		EClass BOARD_STATE = eINSTANCE.getBoardState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD_STATE__NAME = eINSTANCE.getBoardState_Name();

		/**
		 * The meta object literal for the '<em><b>Toggleable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD_STATE__TOGGLEABLE = eINSTANCE.getBoardState_Toggleable();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group07.bg.impl.ValidMoveImpl <em>Valid Move</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group07.bg.impl.ValidMoveImpl
		 * @see no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl#getValidMove()
		 * @generated
		 */
		EClass VALID_MOVE = eINSTANCE.getValidMove();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALID_MOVE__NAME = eINSTANCE.getValidMove_Name();

		/**
		 * The meta object literal for the '<em><b>Brickchange</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALID_MOVE__BRICKCHANGE = eINSTANCE.getValidMove_Brickchange();

		/**
		 * The meta object literal for the '<em><b>Cellchange</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALID_MOVE__CELLCHANGE = eINSTANCE.getValidMove_Cellchange();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group07.bg.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group07.bg.impl.ConditionImpl
		 * @see no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Boardstate</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__BOARDSTATE = eINSTANCE.getCondition_Boardstate();

		/**
		 * The meta object literal for the '<em><b>Relativeposition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__RELATIVEPOSITION = eINSTANCE.getCondition_Relativeposition();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__MANDATORY = eINSTANCE.getCondition_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Prohibited</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__PROHIBITED = eINSTANCE.getCondition_Prohibited();

		/**
		 * The meta object literal for the '<em><b>Bricktype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__BRICKTYPE = eINSTANCE.getCondition_Bricktype();

		/**
		 * The meta object literal for the '<em><b>Brickstate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__BRICKSTATE = eINSTANCE.getCondition_Brickstate();

		/**
		 * The meta object literal for the '<em><b>Celltype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__CELLTYPE = eINSTANCE.getCondition_Celltype();

		/**
		 * The meta object literal for the '<em><b>Cellstate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__CELLSTATE = eINSTANCE.getCondition_Cellstate();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group07.bg.impl.BrickChangeImpl <em>Brick Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group07.bg.impl.BrickChangeImpl
		 * @see no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl#getBrickChange()
		 * @generated
		 */
		EClass BRICK_CHANGE = eINSTANCE.getBrickChange();

		/**
		 * The meta object literal for the '<em><b>Positionchange</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRICK_CHANGE__POSITIONCHANGE = eINSTANCE.getBrickChange_Positionchange();

		/**
		 * The meta object literal for the '<em><b>Moving Brick</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRICK_CHANGE__MOVING_BRICK = eINSTANCE.getBrickChange_MovingBrick();

		/**
		 * The meta object literal for the '<em><b>Change From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRICK_CHANGE__CHANGE_FROM = eINSTANCE.getBrickChange_ChangeFrom();

		/**
		 * The meta object literal for the '<em><b>Change To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRICK_CHANGE__CHANGE_TO = eINSTANCE.getBrickChange_ChangeTo();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRICK_CHANGE__CONDITION = eINSTANCE.getBrickChange_Condition();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group07.bg.impl.RelativePositionImpl <em>Relative Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group07.bg.impl.RelativePositionImpl
		 * @see no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl#getRelativePosition()
		 * @generated
		 */
		EClass RELATIVE_POSITION = eINSTANCE.getRelativePosition();

		/**
		 * The meta object literal for the '<em><b>Xchange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_POSITION__XCHANGE = eINSTANCE.getRelativePosition_Xchange();

		/**
		 * The meta object literal for the '<em><b>Ychange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_POSITION__YCHANGE = eINSTANCE.getRelativePosition_Ychange();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group07.bg.impl.CellChangeImpl <em>Cell Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group07.bg.impl.CellChangeImpl
		 * @see no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl#getCellChange()
		 * @generated
		 */
		EClass CELL_CHANGE = eINSTANCE.getCellChange();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL_CHANGE__CONDITION = eINSTANCE.getCellChange_Condition();

		/**
		 * The meta object literal for the '<em><b>Change From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL_CHANGE__CHANGE_FROM = eINSTANCE.getCellChange_ChangeFrom();

		/**
		 * The meta object literal for the '<em><b>Change To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL_CHANGE__CHANGE_TO = eINSTANCE.getCellChange_ChangeTo();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group07.bg.impl.EffectOnCellImpl <em>Effect On Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group07.bg.impl.EffectOnCellImpl
		 * @see no.ntnu.tdt4250.group07.bg.impl.BgPackageImpl#getEffectOnCell()
		 * @generated
		 */
		EClass EFFECT_ON_CELL = eINSTANCE.getEffectOnCell();

		/**
		 * The meta object literal for the '<em><b>Relativeposition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECT_ON_CELL__RELATIVEPOSITION = eINSTANCE.getEffectOnCell_Relativeposition();

		/**
		 * The meta object literal for the '<em><b>Cellstate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECT_ON_CELL__CELLSTATE = eINSTANCE.getEffectOnCell_Cellstate();

	}

} //BgPackage
