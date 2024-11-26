/**
 */
package no.ntnu.tdt4250.group07.bg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.Cell#getXposition <em>Xposition</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.Cell#getYposition <em>Yposition</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.Cell#getCelltype <em>Celltype</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getCell()
 * @model
 * @generated
 */
public interface Cell extends EObject {
	/**
	 * Returns the value of the '<em><b>Xposition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xposition</em>' attribute.
	 * @see #setXposition(int)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getCell_Xposition()
	 * @model required="true"
	 * @generated
	 */
	int getXposition();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.Cell#getXposition <em>Xposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xposition</em>' attribute.
	 * @see #getXposition()
	 * @generated
	 */
	void setXposition(int value);

	/**
	 * Returns the value of the '<em><b>Yposition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yposition</em>' attribute.
	 * @see #setYposition(int)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getCell_Yposition()
	 * @model required="true"
	 * @generated
	 */
	int getYposition();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.Cell#getYposition <em>Yposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yposition</em>' attribute.
	 * @see #getYposition()
	 * @generated
	 */
	void setYposition(int value);

	/**
	 * Returns the value of the '<em><b>Celltype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Celltype</em>' reference.
	 * @see #setCelltype(CellType)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getCell_Celltype()
	 * @model required="true"
	 * @generated
	 */
	CellType getCelltype();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.Cell#getCelltype <em>Celltype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Celltype</em>' reference.
	 * @see #getCelltype()
	 * @generated
	 */
	void setCelltype(CellType value);

} // Cell
