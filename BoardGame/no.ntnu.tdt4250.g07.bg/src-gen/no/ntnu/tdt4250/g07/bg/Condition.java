/**
 */
package no.ntnu.tdt4250.g07.bg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.Condition#getCellstate <em>Cellstate</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Cellstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cellstate</em>' reference.
	 * @see #setCellstate(CellState)
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getCondition_Cellstate()
	 * @model required="true"
	 * @generated
	 */
	CellState getCellstate();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.g07.bg.Condition#getCellstate <em>Cellstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cellstate</em>' reference.
	 * @see #getCellstate()
	 * @generated
	 */
	void setCellstate(CellState value);

} // Condition
