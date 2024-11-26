/**
 */
package no.ntnu.tdt4250.group07.bg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.RelativePosition#getXchange <em>Xchange</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.RelativePosition#getYchange <em>Ychange</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getRelativePosition()
 * @model
 * @generated
 */
public interface RelativePosition extends EObject {
	/**
	 * Returns the value of the '<em><b>Xchange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xchange</em>' attribute.
	 * @see #setXchange(int)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getRelativePosition_Xchange()
	 * @model required="true"
	 * @generated
	 */
	int getXchange();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.RelativePosition#getXchange <em>Xchange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xchange</em>' attribute.
	 * @see #getXchange()
	 * @generated
	 */
	void setXchange(int value);

	/**
	 * Returns the value of the '<em><b>Ychange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ychange</em>' attribute.
	 * @see #setYchange(int)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getRelativePosition_Ychange()
	 * @model required="true"
	 * @generated
	 */
	int getYchange();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.RelativePosition#getYchange <em>Ychange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ychange</em>' attribute.
	 * @see #getYchange()
	 * @generated
	 */
	void setYchange(int value);

} // RelativePosition
