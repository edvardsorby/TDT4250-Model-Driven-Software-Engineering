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
 *   <li>{@link no.ntnu.tdt4250.ecom.Marketplace#getCategory <em>Category</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ecom.Marketplace#getLanguage <em>Language</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ecom.Marketplace#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.ecom.EcomPackage#getMarketplace()
 * @model
 * @generated
 */
public interface Marketplace extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.ecom.Item}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see no.ntnu.tdt4250.ecom.EcomPackage#getMarketplace_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getItems();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.ecom.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see no.ntnu.tdt4250.ecom.EcomPackage#getMarketplace_Category()
	 * @model containment="true"
	 * @generated
	 */
	EList<Category> getCategory();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.ecom.Language}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' reference list.
	 * @see no.ntnu.tdt4250.ecom.EcomPackage#getMarketplace_Language()
	 * @model required="true"
	 * @generated
	 */
	EList<Language> getLanguage();

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

} // Marketplace
