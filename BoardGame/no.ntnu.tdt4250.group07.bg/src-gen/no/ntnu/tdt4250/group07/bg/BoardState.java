/**
 */
package no.ntnu.tdt4250.group07.bg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Board State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.BoardState#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.BoardState#isToggleable <em>Toggleable</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getBoardState()
 * @model
 * @generated
 */
public interface BoardState extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getBoardState_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.BoardState#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Toggleable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toggleable</em>' attribute.
	 * @see #setToggleable(boolean)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getBoardState_Toggleable()
	 * @model required="true"
	 * @generated
	 */
	boolean isToggleable();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.BoardState#isToggleable <em>Toggleable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toggleable</em>' attribute.
	 * @see #isToggleable()
	 * @generated
	 */
	void setToggleable(boolean value);

} // BoardState
