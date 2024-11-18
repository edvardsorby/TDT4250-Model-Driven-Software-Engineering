/**
 */
package no.ntnu.tdt4250.group07.bg;

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
 * </ul>
 *
 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getEffectOnCell()
 * @model
 * @generated
 */
public interface EffectOnCell extends EObject {
	/**
	 * Returns the value of the '<em><b>Relativeposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relativeposition</em>' reference.
	 * @see #setRelativeposition(RelativePosition)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getEffectOnCell_Relativeposition()
	 * @model
	 * @generated
	 */
	RelativePosition getRelativeposition();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.EffectOnCell#getRelativeposition <em>Relativeposition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relativeposition</em>' reference.
	 * @see #getRelativeposition()
	 * @generated
	 */
	void setRelativeposition(RelativePosition value);

	/**
	 * Returns the value of the '<em><b>Cellstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cellstate</em>' reference.
	 * @see #setCellstate(CellState)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getEffectOnCell_Cellstate()
	 * @model
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

} // EffectOnCell
