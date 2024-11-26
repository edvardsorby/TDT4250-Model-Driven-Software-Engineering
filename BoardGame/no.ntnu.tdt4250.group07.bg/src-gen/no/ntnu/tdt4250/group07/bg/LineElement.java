/**
 */
package no.ntnu.tdt4250.group07.bg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.LineElement#getPosition <em>Position</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.LineElement#getCelltype <em>Celltype</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.LineElement#getCellstate <em>Cellstate</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.LineElement#getBrickstate <em>Brickstate</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.LineElement#getBricktype <em>Bricktype</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getLineElement()
 * @model
 * @generated
 */
public interface LineElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(int)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getLineElement_Position()
	 * @model
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.LineElement#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(int value);

	/**
	 * Returns the value of the '<em><b>Celltype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Celltype</em>' reference.
	 * @see #setCelltype(CellType)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getLineElement_Celltype()
	 * @model
	 * @generated
	 */
	CellType getCelltype();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.LineElement#getCelltype <em>Celltype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Celltype</em>' reference.
	 * @see #getCelltype()
	 * @generated
	 */
	void setCelltype(CellType value);

	/**
	 * Returns the value of the '<em><b>Cellstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cellstate</em>' reference.
	 * @see #setCellstate(CellState)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getLineElement_Cellstate()
	 * @model
	 * @generated
	 */
	CellState getCellstate();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.LineElement#getCellstate <em>Cellstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cellstate</em>' reference.
	 * @see #getCellstate()
	 * @generated
	 */
	void setCellstate(CellState value);

	/**
	 * Returns the value of the '<em><b>Brickstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brickstate</em>' reference.
	 * @see #setBrickstate(BrickState)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getLineElement_Brickstate()
	 * @model
	 * @generated
	 */
	BrickState getBrickstate();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.LineElement#getBrickstate <em>Brickstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brickstate</em>' reference.
	 * @see #getBrickstate()
	 * @generated
	 */
	void setBrickstate(BrickState value);

	/**
	 * Returns the value of the '<em><b>Bricktype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bricktype</em>' reference.
	 * @see #setBricktype(BrickType)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getLineElement_Bricktype()
	 * @model
	 * @generated
	 */
	BrickType getBricktype();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.LineElement#getBricktype <em>Bricktype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bricktype</em>' reference.
	 * @see #getBricktype()
	 * @generated
	 */
	void setBricktype(BrickType value);

} // LineElement
