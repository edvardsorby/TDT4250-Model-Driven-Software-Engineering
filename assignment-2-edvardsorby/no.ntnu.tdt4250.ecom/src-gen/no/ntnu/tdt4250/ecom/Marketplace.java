/**
 */
package no.ntnu.tdt4250.ecom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marketplace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.ecom.Marketplace#getItems <em>Items</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ecom.Marketplace#getCategories <em>Categories</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ecom.Marketplace#getLanguages <em>Languages</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ecom.Marketplace#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ecom.Marketplace#getNumberOfItems <em>Number Of Items</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ecom.Marketplace#getUsers <em>Users</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ecom.Marketplace#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.ecom.EcomPackage#getMarketplace()
 * @model
 * @generated
 */
public interface Marketplace extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.ecom.Item}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' reference list.
	 * @see no.ntnu.tdt4250.ecom.EcomPackage#getMarketplace_Items()
	 * @model
	 * @generated
	 */
	EList<Item> getItems();

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.ecom.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see no.ntnu.tdt4250.ecom.EcomPackage#getMarketplace_Categories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Category> getCategories();

	/**
	 * Returns the value of the '<em><b>Languages</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.ecom.Language}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Languages</em>' containment reference list.
	 * @see no.ntnu.tdt4250.ecom.EcomPackage#getMarketplace_Languages()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Language> getLanguages();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.ecom.EcomPackage#getMarketplace_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ecom.Marketplace#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Items</em>' attribute.
	 * @see no.ntnu.tdt4250.ecom.EcomPackage#getMarketplace_NumberOfItems()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNumberOfItems();

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.ecom.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see no.ntnu.tdt4250.ecom.EcomPackage#getMarketplace_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.ecom.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see no.ntnu.tdt4250.ecom.EcomPackage#getMarketplace_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

} // Marketplace
