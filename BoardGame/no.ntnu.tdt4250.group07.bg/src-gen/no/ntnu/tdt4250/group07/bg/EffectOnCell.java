/**
 */
package no.ntnu.tdt4250.group07.bg;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect On Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.EffectOnCell#getRelativeposition <em>Relativeposition</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.EffectOnCell#getCellstate <em>Cellstate</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.EffectOnCell#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getEffectOnCell()
 * @model
 * @generated
 */
public interface EffectOnCell extends EObject {
	/**
	 * Returns the value of the '<em><b>Relativeposition</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group07.bg.RelativePosition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relativeposition</em>' reference list.
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getEffectOnCell_Relativeposition()
	 * @model required="true"
	 * @generated
	 */
	EList<RelativePosition> getRelativeposition();

	/**
	 * Returns the value of the '<em><b>Cellstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cellstate</em>' reference.
	 * @see #setCellstate(CellState)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getEffectOnCell_Cellstate()
	 * @model required="true"
	 * @generated
	 */
	CellState getCellstate();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.EffectOnCell#getCellstate <em>Cellstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cellstate</em>' reference.
	 * @see #getCellstate()
	 * @generated
	 */
	void setCellstate(CellState value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getEffectOnCell_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.EffectOnCell#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // EffectOnCell
