/**
 */
package no.ntnu.tdt4250.group07.bg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.CellType#getCellstate <em>Cellstate</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.CellType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getCellType()
 * @model
 * @generated
 */
public interface CellType extends EObject {
	/**
	 * Returns the value of the '<em><b>Cellstate</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group07.bg.CellState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cellstate</em>' reference list.
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getCellType_Cellstate()
	 * @model required="true"
	 * @generated
	 */
	EList<CellState> getCellstate();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getCellType_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.CellType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CellType
