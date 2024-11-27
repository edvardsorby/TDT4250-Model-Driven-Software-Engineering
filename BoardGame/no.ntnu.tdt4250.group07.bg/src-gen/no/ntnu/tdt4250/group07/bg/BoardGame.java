/**
 */
package no.ntnu.tdt4250.group07.bg;

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
 *   <li>{@link no.ntnu.tdt4250.group07.bg.BoardGame#getPiecetypes <em>Piecetypes</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.BoardGame#getCellstate <em>Cellstate</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.BoardGame#getWincondition <em>Wincondition</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.BoardGame#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getBoardGame()
 * @model
 * @generated
 */
public interface BoardGame extends EObject {
	/**
	 * Returns the value of the '<em><b>Piecetypes</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group07.bg.PieceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Piecetypes</em>' containment reference list.
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getBoardGame_Piecetypes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PieceType> getPiecetypes();

	/**
	 * Returns the value of the '<em><b>Cellstate</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group07.bg.CellState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cellstate</em>' containment reference list.
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getBoardGame_Cellstate()
	 * @model containment="true"
	 * @generated
	 */
	EList<CellState> getCellstate();

	/**
	 * Returns the value of the '<em><b>Wincondition</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group07.bg.WinCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wincondition</em>' containment reference list.
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getBoardGame_Wincondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<WinCondition> getWincondition();

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getBoardGame_Size()
	 * @model required="true"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.BoardGame#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

} // BoardGame
