/**
 */
package no.ntnu.tdt4250.g07.bg.util;

import no.ntnu.tdt4250.g07.bg.*;

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
 * @see no.ntnu.tdt4250.g07.bg.BgPackage
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
		case BgPackage.BOARD_GAME: {
			BoardGame boardGame = (BoardGame) theEObject;
			T result = caseBoardGame(boardGame);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BgPackage.PIECE_TYPE: {
			PieceType pieceType = (PieceType) theEObject;
			T result = casePieceType(pieceType);
			if (result == null)
				result = caseBoardGameElement(pieceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BgPackage.CELL_STATE: {
			CellState cellState = (CellState) theEObject;
			T result = caseCellState(cellState);
			if (result == null)
				result = caseBoardGameElement(cellState);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BgPackage.EFFECT_ON_CELL: {
			EffectOnCell effectOnCell = (EffectOnCell) theEObject;
			T result = caseEffectOnCell(effectOnCell);
			if (result == null)
				result = caseBoardGameElement(effectOnCell);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BgPackage.WIN_CONDITION: {
			WinCondition winCondition = (WinCondition) theEObject;
			T result = caseWinCondition(winCondition);
			if (result == null)
				result = caseBoardGameElement(winCondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BgPackage.LINE: {
			Line line = (Line) theEObject;
			T result = caseLine(line);
			if (result == null)
				result = caseWinConditionElement(line);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BgPackage.BOARD_GAME_ELEMENT: {
			BoardGameElement boardGameElement = (BoardGameElement) theEObject;
			T result = caseBoardGameElement(boardGameElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BgPackage.WIN_CONDITION_ELEMENT: {
			WinConditionElement winConditionElement = (WinConditionElement) theEObject;
			T result = caseWinConditionElement(winConditionElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Board Game</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Board Game</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoardGame(BoardGame object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Piece Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Piece Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePieceType(PieceType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Win Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Win Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWinCondition(WinCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLine(Line object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Board Game Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Board Game Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoardGameElement(BoardGameElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Win Condition Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Win Condition Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWinConditionElement(WinConditionElement object) {
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
