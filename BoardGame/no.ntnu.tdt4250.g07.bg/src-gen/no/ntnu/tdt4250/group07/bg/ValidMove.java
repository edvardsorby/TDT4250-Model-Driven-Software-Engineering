/**
 */
package no.ntnu.tdt4250.group07.bg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valid Move</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.ValidMove#getConditions <em>Conditions</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.ValidMove#isPlaceAnywhere <em>Place Anywhere</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getValidMove()
 * @model
 * @generated
 */
public interface ValidMove extends EObject {
	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group07.bg.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getValidMove_Conditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getConditions();

	/**
	 * Returns the value of the '<em><b>Place Anywhere</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place Anywhere</em>' attribute.
	 * @see #setPlaceAnywhere(boolean)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getValidMove_PlaceAnywhere()
	 * @model required="true"
	 * @generated
	 */
	boolean isPlaceAnywhere();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.ValidMove#isPlaceAnywhere <em>Place Anywhere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place Anywhere</em>' attribute.
	 * @see #isPlaceAnywhere()
	 * @generated
	 */
	void setPlaceAnywhere(boolean value);

} // ValidMove
