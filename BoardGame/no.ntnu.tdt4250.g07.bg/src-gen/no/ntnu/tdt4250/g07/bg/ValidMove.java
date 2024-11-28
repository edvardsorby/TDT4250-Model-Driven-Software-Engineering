/**
 */
package no.ntnu.tdt4250.g07.bg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valid Move</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.ValidMove#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.ValidMove#getConditions <em>Conditions</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.ValidMove#isPlaceAnywhere <em>Place Anywhere</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getValidMove()
 * @model
 * @generated
 */
public interface ValidMove extends BoardGameElement {
	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.g07.bg.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' reference list.
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getValidMove_Conditions()
	 * @model
	 * @generated
	 */
	EList<Condition> getConditions();

	/**
	 * Returns the value of the '<em><b>Place Anywhere</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place Anywhere</em>' attribute.
	 * @see #setPlaceAnywhere(boolean)
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getValidMove_PlaceAnywhere()
	 * @model required="true"
	 * @generated
	 */
	boolean isPlaceAnywhere();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.g07.bg.ValidMove#isPlaceAnywhere <em>Place Anywhere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place Anywhere</em>' attribute.
	 * @see #isPlaceAnywhere()
	 * @generated
	 */
	void setPlaceAnywhere(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getValidMove_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.g07.bg.ValidMove#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ValidMove
