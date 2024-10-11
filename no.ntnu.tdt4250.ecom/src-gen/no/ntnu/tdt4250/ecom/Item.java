/**
 */
package no.ntnu.tdt4250.ecom;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.ecom.Item#getCategory <em>Category</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ecom.Item#getTitle <em>Title</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ecom.Item#getPrice <em>Price</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ecom.Item#getDescription <em>Description</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ecom.Item#getPublished <em>Published</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ecom.Item#getSeller <em>Seller</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.ecom.EcomPackage#getItem()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='itemTitleShouldBeMax80'"
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference.
	 * @see #setCategory(Category)
	 * @see no.ntnu.tdt4250.ecom.EcomPackage#getItem_Category()
	 * @model required="true"
	 * @generated
	 */
	Category getCategory();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ecom.Item#getCategory <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see no.ntnu.tdt4250.ecom.EcomPackage#getItem_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ecom.Item#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(int)
	 * @see no.ntnu.tdt4250.ecom.EcomPackage#getItem_Price()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getPrice();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ecom.Item#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see no.ntnu.tdt4250.ecom.EcomPackage#getItem_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ecom.Item#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Published</em>' attribute.
	 * @see #setPublished(XMLGregorianCalendar)
	 * @see no.ntnu.tdt4250.ecom.EcomPackage#getItem_Published()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 * @generated
	 */
	XMLGregorianCalendar getPublished();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ecom.Item#getPublished <em>Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Published</em>' attribute.
	 * @see #getPublished()
	 * @generated
	 */
	void setPublished(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Seller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seller</em>' reference.
	 * @see #setSeller(User)
	 * @see no.ntnu.tdt4250.ecom.EcomPackage#getItem_Seller()
	 * @model required="true"
	 * @generated
	 */
	User getSeller();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ecom.Item#getSeller <em>Seller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seller</em>' reference.
	 * @see #getSeller()
	 * @generated
	 */
	void setSeller(User value);

} // Item
