/**
 */
package no.ntnu.tdt4250.g07.bg.impl;

import no.ntnu.tdt4250.g07.bg.*;

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
		case BgPackage.BOARD_GAME:
			return createBoardGame();
		case BgPackage.PIECE_TYPE:
			return createPieceType();
		case BgPackage.VALID_MOVE:
			return createValidMove();
		case BgPackage.CONDITION:
			return createCondition();
		case BgPackage.CELL_STATE:
			return createCellState();
		case BgPackage.EFFECT_ON_CELL:
			return createEffectOnCell();
		case BgPackage.WIN_CONDITION:
			return createWinCondition();
		case BgPackage.IN_AROW:
			return createInARow();
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
	public BoardGame createBoardGame() {
		BoardGameImpl boardGame = new BoardGameImpl();
		return boardGame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PieceType createPieceType() {
		PieceTypeImpl pieceType = new PieceTypeImpl();
		return pieceType;
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
	public WinCondition createWinCondition() {
		WinConditionImpl winCondition = new WinConditionImpl();
		return winCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InARow createInARow() {
		InARowImpl inARow = new InARowImpl();
		return inARow;
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
