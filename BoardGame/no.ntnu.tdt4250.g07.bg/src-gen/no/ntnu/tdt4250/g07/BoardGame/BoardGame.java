/**
 */
package no.ntnu.tdt4250.g07.BoardGame;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Board Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.g07.BoardGame.BoardGame#getPiecetypes <em>Piecetypes</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.BoardGame.BoardGame#getCellstates <em>Cellstates</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.BoardGame.BoardGame#getWinConditions <em>Win Conditions</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.BoardGame.BoardGame#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.g07.BoardGame.BgPackage#getBoardGame()
 * @model
 * @generated
 */
public interface BoardGame extends EObject {
	/**
	 * Returns the value of the '<em><b>Piecetypes</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.g07.BoardGame.PieceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Piecetypes</em>' containment reference list.
	 * @see no.ntnu.tdt4250.g07.BoardGame.BgPackage#getBoardGame_Piecetypes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PieceType> getPiecetypes();

	/**
	 * Returns the value of the '<em><b>Cellstates</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.g07.BoardGame.CellState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cellstates</em>' containment reference list.
	 * @see no.ntnu.tdt4250.g07.BoardGame.BgPackage#getBoardGame_Cellstates()
	 * @model containment="true"
	 * @generated
	 */
	EList<CellState> getCellstates();

	/**
	 * Returns the value of the '<em><b>Win Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.g07.BoardGame.WinCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Win Conditions</em>' containment reference list.
	 * @see no.ntnu.tdt4250.g07.BoardGame.BgPackage#getBoardGame_WinConditions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<WinCondition> getWinConditions();

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see no.ntnu.tdt4250.g07.BoardGame.BgPackage#getBoardGame_Size()
	 * @model required="true"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.g07.BoardGame.BoardGame#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

} // BoardGame
