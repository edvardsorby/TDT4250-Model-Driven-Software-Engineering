/**
 */
package no.ntnu.tdt4250.group07.bg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Brick</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.Brick#getBricktype <em>Bricktype</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.Brick#getStartCell <em>Start Cell</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getBrick()
 * @model
 * @generated
 */
public interface Brick extends EObject {
	/**
	 * Returns the value of the '<em><b>Bricktype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bricktype</em>' reference.
	 * @see #setBricktype(BrickType)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getBrick_Bricktype()
	 * @model required="true"
	 * @generated
	 */
	BrickType getBricktype();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.Brick#getBricktype <em>Bricktype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bricktype</em>' reference.
	 * @see #getBricktype()
	 * @generated
	 */
	void setBricktype(BrickType value);

	/**
	 * Returns the value of the '<em><b>Start Cell</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Cell</em>' reference.
	 * @see #setStartCell(Cell)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getBrick_StartCell()
	 * @model
	 * @generated
	 */
	Cell getStartCell();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.Brick#getStartCell <em>Start Cell</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Cell</em>' reference.
	 * @see #getStartCell()
	 * @generated
	 */
	void setStartCell(Cell value);

} // Brick
