/**
 */
package no.ntnu.tdt4250.ecom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.ecom.Language#getLanguageCode <em>Language Code</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ecom.Language#getLanguageName <em>Language Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ecom.Language#getCurrency <em>Currency</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.ecom.EcomPackage#getLanguage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='languageCodeShouldBe2Chars'"
 * @generated
 */
public interface Language extends EObject {
	/**
	 * Returns the value of the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language Code</em>' attribute.
	 * @see #setLanguageCode(String)
	 * @see no.ntnu.tdt4250.ecom.EcomPackage#getLanguage_LanguageCode()
	 * @model required="true"
	 * @generated
	 */
	String getLanguageCode();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ecom.Language#getLanguageCode <em>Language Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Code</em>' attribute.
	 * @see #getLanguageCode()
	 * @generated
	 */
	void setLanguageCode(String value);

	/**
	 * Returns the value of the '<em><b>Language Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language Name</em>' attribute.
	 * @see #setLanguageName(String)
	 * @see no.ntnu.tdt4250.ecom.EcomPackage#getLanguage_LanguageName()
	 * @model
	 * @generated
	 */
	String getLanguageName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ecom.Language#getLanguageName <em>Language Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Name</em>' attribute.
	 * @see #getLanguageName()
	 * @generated
	 */
	void setLanguageName(String value);

	/**
	 * Returns the value of the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' attribute.
	 * @see #setCurrency(String)
	 * @see no.ntnu.tdt4250.ecom.EcomPackage#getLanguage_Currency()
	 * @model
	 * @generated
	 */
	String getCurrency();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.ecom.Language#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(String value);

} // Language
