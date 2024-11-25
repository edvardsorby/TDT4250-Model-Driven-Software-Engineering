/**
 */
package no.ntnu.tdt4250.group07.bg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.CellChange#getCondition <em>Condition</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.CellChange#getChangeFrom <em>Change From</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.CellChange#getChangeTo <em>Change To</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.CellChange#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getCellChange()
 * @model
 * @generated
 */
public interface CellChange extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group07.bg.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference list.
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getCellChange_Condition()
	 * @model
	 * @generated
	 */
	EList<Condition> getCondition();

	/**
	 * Returns the value of the '<em><b>Change From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change From</em>' reference.
	 * @see #setChangeFrom(CellType)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getCellChange_ChangeFrom()
	 * @model required="true"
	 * @generated
	 */
	CellType getChangeFrom();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.CellChange#getChangeFrom <em>Change From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change From</em>' reference.
	 * @see #getChangeFrom()
	 * @generated
	 */
	void setChangeFrom(CellType value);

	/**
	 * Returns the value of the '<em><b>Change To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change To</em>' reference.
	 * @see #setChangeTo(CellType)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getCellChange_ChangeTo()
	 * @model required="true"
	 * @generated
	 */
	CellType getChangeTo();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.CellChange#getChangeTo <em>Change To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change To</em>' reference.
	 * @see #getChangeTo()
	 * @generated
	 */
	void setChangeTo(CellType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getCellChange_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.CellChange#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CellChange
