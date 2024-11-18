/**
 */
package no.ntnu.tdt4250.group07.bg.impl;

import no.ntnu.tdt4250.group07.bg.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BgFactoryImpl extends EFactoryImpl implements BgFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BgFactory init() {
		try {
			BgFactory theBgFactory = (BgFactory) EPackage.Registry.INSTANCE.getEFactory(BgPackage.eNS_URI);
			if (theBgFactory != null) {
				return theBgFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BgFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BgFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case BgPackage.RULES:
			return createRules();
		case BgPackage.BOARD:
			return createBoard();
		case BgPackage.PLAYER_BRICK_SET:
			return createPlayerBrickSet();
		case BgPackage.BRICK:
			return createBrick();
		case BgPackage.BRICK_TYPE:
			return createBrickType();
		case BgPackage.BRICK_STATE:
			return createBrickState();
		case BgPackage.CELL:
			return createCell();
		case BgPackage.CELL_TYPE:
			return createCellType();
		case BgPackage.CELL_STATE:
			return createCellState();
		case BgPackage.BOARD_STATE:
			return createBoardState();
		case BgPackage.VALID_MOVE:
			return createValidMove();
		case BgPackage.CONDITION:
			return createCondition();
		case BgPackage.BRICK_CHANGE:
			return createBrickChange();
		case BgPackage.RELATIVE_POSITION:
			return createRelativePosition();
		case BgPackage.CELL_CHANGE:
			return createCellChange();
		case BgPackage.EFFECT_ON_CELL:
			return createEffectOnCell();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rules createRules() {
		RulesImpl rules = new RulesImpl();
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Board createBoard() {
		BoardImpl board = new BoardImpl();
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlayerBrickSet createPlayerBrickSet() {
		PlayerBrickSetImpl playerBrickSet = new PlayerBrickSetImpl();
		return playerBrickSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Brick createBrick() {
		BrickImpl brick = new BrickImpl();
		return brick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BrickType createBrickType() {
		BrickTypeImpl brickType = new BrickTypeImpl();
		return brickType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BrickState createBrickState() {
		BrickStateImpl brickState = new BrickStateImpl();
		return brickState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cell createCell() {
		CellImpl cell = new CellImpl();
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CellType createCellType() {
		CellTypeImpl cellType = new CellTypeImpl();
		return cellType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CellState createCellState() {
		CellStateImpl cellState = new CellStateImpl();
		return cellState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoardState createBoardState() {
		BoardStateImpl boardState = new BoardStateImpl();
		return boardState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidMove createValidMove() {
		ValidMoveImpl validMove = new ValidMoveImpl();
		return validMove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BrickChange createBrickChange() {
		BrickChangeImpl brickChange = new BrickChangeImpl();
		return brickChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelativePosition createRelativePosition() {
		RelativePositionImpl relativePosition = new RelativePositionImpl();
		return relativePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CellChange createCellChange() {
		CellChangeImpl cellChange = new CellChangeImpl();
		return cellChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EffectOnCell createEffectOnCell() {
		EffectOnCellImpl effectOnCell = new EffectOnCellImpl();
		return effectOnCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BgPackage getBgPackage() {
		return (BgPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BgPackage getPackage() {
		return BgPackage.eINSTANCE;
	}

} //BgFactoryImpl
