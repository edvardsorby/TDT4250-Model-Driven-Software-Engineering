/**
 */
package no.ntnu.tdt4250.ecom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Privilege</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.ecom.Privilege#getPrivilege <em>Privilege</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.ecom.EcomPackage#getPrivilege()
 * @model
 * @generated
 */
public interface Privilege extends EObject {
	/**
	 * Returns the value of the '<em><b>Privilege</b></em>' attribute.
	 * The default value is <code>"POST_ITEMS"</code>.
	 * The literals are from the enumeration {@link no.ntnu.tdt4250.ecom.PrivilegeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Privilege</em>' attribute.
	 * @see no.ntnu.tdt4250.ecom.PrivilegeType
	 * @see #setPrivilege(PrivilegeType)
	 * @see no.ntnu.tdt4250.ecom.EcomPackage#getPrivilege_Privilege()
	 * @model default="POST_ITEMS"
	 * @generated
	 */
	PrivilegeType getPrivilege();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ecom.Privilege#getPrivilege <em>Privilege</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Privilege</em>' attribute.
	 * @see no.ntnu.tdt4250.ecom.PrivilegeType
	 * @see #getPrivilege()
	 * @generated
	 */
	void setPrivilege(PrivilegeType value);

} // Privilege
