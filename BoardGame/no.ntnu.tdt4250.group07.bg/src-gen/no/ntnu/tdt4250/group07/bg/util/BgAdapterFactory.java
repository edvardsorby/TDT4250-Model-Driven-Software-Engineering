/**
 */
package no.ntnu.tdt4250.group07.bg.util;

import no.ntnu.tdt4250.group07.bg.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.group07.bg.BgPackage
 * @generated
 */
public class BgAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BgPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BgAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BgPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BgSwitch<Adapter> modelSwitch = new BgSwitch<Adapter>() {
		@Override
		public Adapter caseRules(Rules object) {
			return createRulesAdapter();
		}

		@Override
		public Adapter caseBoard(Board object) {
			return createBoardAdapter();
		}

		@Override
		public Adapter casePlayerBrickSet(PlayerBrickSet object) {
			return createPlayerBrickSetAdapter();
		}

		@Override
		public Adapter caseBrick(Brick object) {
			return createBrickAdapter();
		}

		@Override
		public Adapter caseBrickType(BrickType object) {
			return createBrickTypeAdapter();
		}

		@Override
		public Adapter caseBrickState(BrickState object) {
			return createBrickStateAdapter();
		}

		@Override
		public Adapter caseCell(Cell object) {
			return createCellAdapter();
		}

		@Override
		public Adapter caseCellType(CellType object) {
			return createCellTypeAdapter();
		}

		@Override
		public Adapter caseCellState(CellState object) {
			return createCellStateAdapter();
		}

		@Override
		public Adapter caseBoardState(BoardState object) {
			return createBoardStateAdapter();
		}

		@Override
		public Adapter caseValidMove(ValidMove object) {
			return createValidMoveAdapter();
		}

		@Override
		public Adapter caseCondition(Condition object) {
			return createConditionAdapter();
		}

		@Override
		public Adapter caseBrickChange(BrickChange object) {
			return createBrickChangeAdapter();
		}

		@Override
		public Adapter caseRelativePosition(RelativePosition object) {
			return createRelativePositionAdapter();
		}

		@Override
		public Adapter caseCellChange(CellChange object) {
			return createCellChangeAdapter();
		}

		@Override
		public Adapter caseEffectOnCell(EffectOnCell object) {
			return createEffectOnCellAdapter();
		}

		@Override
		public Adapter caseLine(Line object) {
			return createLineAdapter();
		}

		@Override
		public Adapter caseLineElement(LineElement object) {
			return createLineElementAdapter();
		}

		@Override
		public Adapter caseOutcome(Outcome object) {
			return createOutcomeAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.group07.bg.Rules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.group07.bg.Rules
	 * @generated
	 */
	public Adapter createRulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.group07.bg.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.group07.bg.Board
	 * @generated
	 */
	public Adapter createBoardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.group07.bg.PlayerBrickSet <em>Player Brick Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.group07.bg.PlayerBrickSet
	 * @generated
	 */
	public Adapter createPlayerBrickSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.group07.bg.Brick <em>Brick</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.group07.bg.Brick
	 * @generated
	 */
	public Adapter createBrickAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.group07.bg.BrickType <em>Brick Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.group07.bg.BrickType
	 * @generated
	 */
	public Adapter createBrickTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.group07.bg.BrickState <em>Brick State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.group07.bg.BrickState
	 * @generated
	 */
	public Adapter createBrickStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.group07.bg.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.group07.bg.Cell
	 * @generated
	 */
	public Adapter createCellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.group07.bg.CellType <em>Cell Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.group07.bg.CellType
	 * @generated
	 */
	public Adapter createCellTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.group07.bg.CellState <em>Cell State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.group07.bg.CellState
	 * @generated
	 */
	public Adapter createCellStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.group07.bg.BoardState <em>Board State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.group07.bg.BoardState
	 * @generated
	 */
	public Adapter createBoardStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.group07.bg.ValidMove <em>Valid Move</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.group07.bg.ValidMove
	 * @generated
	 */
	public Adapter createValidMoveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.group07.bg.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.group07.bg.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.group07.bg.BrickChange <em>Brick Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.group07.bg.BrickChange
	 * @generated
	 */
	public Adapter createBrickChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.group07.bg.RelativePosition <em>Relative Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.group07.bg.RelativePosition
	 * @generated
	 */
	public Adapter createRelativePositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.group07.bg.CellChange <em>Cell Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.group07.bg.CellChange
	 * @generated
	 */
	public Adapter createCellChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.group07.bg.EffectOnCell <em>Effect On Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.group07.bg.EffectOnCell
	 * @generated
	 */
	public Adapter createEffectOnCellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.group07.bg.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.group07.bg.Line
	 * @generated
	 */
	public Adapter createLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.group07.bg.LineElement <em>Line Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.group07.bg.LineElement
	 * @generated
	 */
	public Adapter createLineElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.group07.bg.Outcome <em>Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.group07.bg.Outcome
	 * @generated
	 */
	public Adapter createOutcomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BgAdapterFactory
