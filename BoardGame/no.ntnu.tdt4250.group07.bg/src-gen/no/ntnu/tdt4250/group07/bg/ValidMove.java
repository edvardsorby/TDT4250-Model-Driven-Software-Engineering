/**
 */
package no.ntnu.tdt4250.group07.bg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valid Move</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.ValidMove#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.ValidMove#getBrickchange <em>Brickchange</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.ValidMove#getCellchange <em>Cellchange</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getValidMove()
 * @model
 * @generated
 */
public interface ValidMove extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getValidMove_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.ValidMove#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Brickchange</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group07.bg.BrickChange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brickchange</em>' reference list.
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getValidMove_Brickchange()
	 * @model
	 * @generated
	 */
	EList<BrickChange> getBrickchange();

	/**
	 * Returns the value of the '<em><b>Cellchange</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group07.bg.CellChange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cellchange</em>' reference list.
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getValidMove_Cellchange()
	 * @model
	 * @generated
	 */
	EList<CellChange> getCellchange();

} // ValidMove
