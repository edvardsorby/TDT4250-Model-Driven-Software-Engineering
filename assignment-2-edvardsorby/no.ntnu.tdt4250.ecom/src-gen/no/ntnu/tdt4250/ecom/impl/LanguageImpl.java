/**
 */
package no.ntnu.tdt4250.ecom.impl;

import no.ntnu.tdt4250.ecom.EcomPackage;
import no.ntnu.tdt4250.ecom.Language;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Language</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.ecom.impl.LanguageImpl#getLanguageCode <em>Language Code</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ecom.impl.LanguageImpl#getLanguageName <em>Language Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ecom.impl.LanguageImpl#getCurrency <em>Currency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LanguageImpl extends MinimalEObjectImpl.Container implements Language {
	/**
	 * The default value of the '{@link #getLanguageCode() <em>Language Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageCode()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguageCode() <em>Language Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageCode()
	 * @generated
	 * @ordered
	 */
	protected String languageCode = LANGUAGE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguageName() <em>Language Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageName()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguageName() <em>Language Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageName()
	 * @generated
	 * @ordered
	 */
	protected String languageName = LANGUAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected String currency = CURRENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcomPackage.Literals.LANGUAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLanguageCode() {
		return languageCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguageCode(String newLanguageCode) {
		String oldLanguageCode = languageCode;
		languageCode = newLanguageCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcomPackage.LANGUAGE__LANGUAGE_CODE, oldLanguageCode,
					languageCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLanguageName() {
		return languageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguageName(String newLanguageName) {
		String oldLanguageName = languageName;
		languageName = newLanguageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcomPackage.LANGUAGE__LANGUAGE_NAME, oldLanguageName,
					languageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrency() {
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrency(String newCurrency) {
		String oldCurrency = currency;
		currency = newCurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcomPackage.LANGUAGE__CURRENCY, oldCurrency,
					currency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EcomPackage.LANGUAGE__LANGUAGE_CODE:
			return getLanguageCode();
		case EcomPackage.LANGUAGE__LANGUAGE_NAME:
			return getLanguageName();
		case EcomPackage.LANGUAGE__CURRENCY:
			return getCurrency();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EcomPackage.LANGUAGE__LANGUAGE_CODE:
			setLanguageCode((String) newValue);
			return;
		case EcomPackage.LANGUAGE__LANGUAGE_NAME:
			setLanguageName((String) newValue);
			return;
		case EcomPackage.LANGUAGE__CURRENCY:
			setCurrency((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EcomPackage.LANGUAGE__LANGUAGE_CODE:
			setLanguageCode(LANGUAGE_CODE_EDEFAULT);
			return;
		case EcomPackage.LANGUAGE__LANGUAGE_NAME:
			setLanguageName(LANGUAGE_NAME_EDEFAULT);
			return;
		case EcomPackage.LANGUAGE__CURRENCY:
			setCurrency(CURRENCY_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EcomPackage.LANGUAGE__LANGUAGE_CODE:
			return LANGUAGE_CODE_EDEFAULT == null ? languageCode != null : !LANGUAGE_CODE_EDEFAULT.equals(languageCode);
		case EcomPackage.LANGUAGE__LANGUAGE_NAME:
			return LANGUAGE_NAME_EDEFAULT == null ? languageName != null : !LANGUAGE_NAME_EDEFAULT.equals(languageName);
		case EcomPackage.LANGUAGE__CURRENCY:
			return CURRENCY_EDEFAULT == null ? currency != null : !CURRENCY_EDEFAULT.equals(currency);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (languageCode: ");
		result.append(languageCode);
		result.append(", languageName: ");
		result.append(languageName);
		result.append(", currency: ");
		result.append(currency);
		result.append(')');
		return result.toString();
	}

} //LanguageImpl
