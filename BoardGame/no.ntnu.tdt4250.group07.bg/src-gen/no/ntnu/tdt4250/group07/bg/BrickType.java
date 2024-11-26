/**
 */
package no.ntnu.tdt4250.group07.bg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Brick Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.BrickType#getBrickstate <em>Brickstate</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.BrickType#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.BrickType#getEffectoncell <em>Effectoncell</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getBrickType()
 * @model
 * @generated
 */
public interface BrickType extends EObject {
	/**
	 * Returns the value of the '<em><b>Brickstate</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group07.bg.BrickState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brickstate</em>' reference list.
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getBrickType_Brickstate()
	 * @model required="true"
	 * @generated
	 */
	EList<BrickState> getBrickstate();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getBrickType_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.BrickType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Effectoncell</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group07.bg.EffectOnCell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effectoncell</em>' reference list.
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getBrickType_Effectoncell()
	 * @model
	 * @generated
	 */
	EList<EffectOnCell> getEffectoncell();

} // BrickType
