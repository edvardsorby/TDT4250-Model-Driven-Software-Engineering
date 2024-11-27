/**
 */
package no.ntnu.tdt4250.g07.BoardGame;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Win Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.g07.BoardGame.WinCondition#getInarow <em>Inarow</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.g07.BoardGame.BgPackage#getWinCondition()
 * @model
 * @generated
 */
public interface WinCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Inarow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inarow</em>' containment reference.
	 * @see #setInarow(InARow)
	 * @see no.ntnu.tdt4250.g07.BoardGame.BgPackage#getWinCondition_Inarow()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InARow getInarow();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.g07.BoardGame.WinCondition#getInarow <em>Inarow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inarow</em>' containment reference.
	 * @see #getInarow()
	 * @generated
	 */
	void setInarow(InARow value);

} // WinCondition
