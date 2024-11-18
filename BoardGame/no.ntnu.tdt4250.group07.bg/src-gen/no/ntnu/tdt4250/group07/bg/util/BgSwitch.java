/**
 */
package no.ntnu.tdt4250.group07.bg.util;

import no.ntnu.tdt4250.group07.bg.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.group07.bg.BgPackage
 * @generated
 */
public class BgSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BgPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BgSwitch() {
		if (modelPackage == null) {
			modelPackage = BgPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case BgPackage.RULES: {
			Rules rules = (Rules) theEObject;
			T result = caseRules(rules);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BgPackage.BOARD: {
			Board board = (Board) theEObject;
			T result = caseBoard(board);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BgPackage.PLAYER_BRICK_SET: {
			PlayerBrickSet playerBrickSet = (PlayerBrickSet) theEObject;
			T result = casePlayerBrickSet(playerBrickSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BgPackage.BRICK: {
			Brick brick = (Brick) theEObject;
			T result = caseBrick(brick);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BgPackage.BRICK_TYPE: {
			BrickType brickType = (BrickType) theEObject;
			T result = caseBrickType(brickType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BgPackage.BRICK_STATE: {
			BrickState brickState = (BrickState) theEObject;
			T result = caseBrickState(brickState);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BgPackage.CELL: {
			Cell cell = (Cell) theEObject;
			T result = caseCell(cell);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BgPackage.CELL_TYPE: {
			CellType cellType = (CellType) theEObject;
			T result = caseCellType(cellType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BgPackage.CELL_STATE: {
			CellState cellState = (CellState) theEObject;
			T result = caseCellState(cellState);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BgPackage.BOARD_STATE: {
			BoardState boardState = (BoardState) theEObject;
			T result = caseBoardState(boardState);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BgPackage.VALID_MOVE: {
			ValidMove validMove = (ValidMove) theEObject;
			T result = caseValidMove(validMove);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BgPackage.CONDITION: {
			Condition condition = (Condition) theEObject;
			T result = caseCondition(condition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BgPackage.BRICK_CHANGE: {
			BrickChange brickChange = (BrickChange) theEObject;
			T result = caseBrickChange(brickChange);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BgPackage.RELATIVE_POSITION: {
			RelativePosition relativePosition = (RelativePosition) theEObject;
			T result = caseRelativePosition(relativePosition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BgPackage.CELL_CHANGE: {
			CellChange cellChange = (CellChange) theEObject;
			T result = caseCellChange(cellChange);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BgPackage.EFFECT_ON_CELL: {
			EffectOnCell effectOnCell = (EffectOnCell) theEObject;
			T result = caseEffectOnCell(effectOnCell);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRules(Rules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Board</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Board</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoard(Board object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Player Brick Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Player Brick Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlayerBrickSet(PlayerBrickSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Brick</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Brick</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrick(Brick object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Brick Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Brick Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrickType(BrickType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Brick State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Brick State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrickState(BrickState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCell(Cell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCellType(CellType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCellState(CellState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Board State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Board State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoardState(BoardState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valid Move</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valid Move</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidMove(ValidMove object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Brick Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Brick Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrickChange(BrickChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativePosition(RelativePosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCellChange(CellChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effect On Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effect On Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEffectOnCell(EffectOnCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BgSwitch
