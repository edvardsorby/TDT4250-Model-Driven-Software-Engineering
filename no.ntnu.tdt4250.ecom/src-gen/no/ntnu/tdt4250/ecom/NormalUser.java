/**
 */
package no.ntnu.tdt4250.ecom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.ecom.NormalUser#getPrivileges <em>Privileges</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.ecom.EcomPackage#getNormalUser()
 * @model
 * @generated
 */
public interface NormalUser extends Role {
	/**
	 * Returns the value of the '<em><b>Privileges</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.ecom.Privilege}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Privileges</em>' containment reference list.
	 * @see no.ntnu.tdt4250.ecom.EcomPackage#getNormalUser_Privileges()
	 * @model containment="true"
	 * @generated
	 */
	EList<Privilege> getPrivileges();

} // NormalUser
