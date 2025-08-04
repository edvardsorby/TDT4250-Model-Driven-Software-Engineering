/**
 */
package no.ntnu.tdt4250.ecom.util;

import java.util.Map;

import no.ntnu.tdt4250.ecom.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.ecom.EcomPackage
 * @generated
 */
public class EcomValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EcomValidator INSTANCE = new EcomValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "no.ntnu.tdt4250.ecom";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcomValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return EcomPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case EcomPackage.MARKETPLACE:
			return validateMarketplace((Marketplace) value, diagnostics, context);
		case EcomPackage.USER:
			return validateUser((User) value, diagnostics, context);
		case EcomPackage.ITEM:
			return validateItem((Item) value, diagnostics, context);
		case EcomPackage.CATEGORY:
			return validateCategory((Category) value, diagnostics, context);
		case EcomPackage.ROLE:
			return validateRole((Role) value, diagnostics, context);
		case EcomPackage.LANGUAGE:
			return validateLanguage((Language) value, diagnostics, context);
		case EcomPackage.ADMIN:
			return validateAdmin((Admin) value, diagnostics, context);
		case EcomPackage.NORMAL_USER:
			return validateNormalUser((NormalUser) value, diagnostics, context);
		case EcomPackage.PRIVILEGE:
			return validatePrivilege((Privilege) value, diagnostics, context);
		case EcomPackage.PRIVILEGE_TYPE:
			return validatePrivilegeType((PrivilegeType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarketplace(Marketplace marketplace, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(marketplace, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(user, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItem(Item item, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(item, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(item, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(item, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(item, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(item, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(item, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(item, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(item, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(item, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateItem_itemTitleShouldBeMax80(item, diagnostics, context);
		return result;
	}

	/**
	 * Validates the itemTitleShouldBeMax80 constraint of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateItem_itemTitleShouldBeMax80(Item item, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		boolean valid = true;

		if (item.getTitle() != null) {
			if (item.getTitle().length() > 80) {
				valid = false;
			}
		}

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "itemTitleShouldBeMax80", getObjectLabel(item, context) },
								new Object[] { item }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategory(Category category, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(category, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(role, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguage(Language language, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(language, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(language, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(language, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(language, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(language, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(language, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(language, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(language, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(language, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateLanguage_languageCodeShouldBe2Chars(language, diagnostics, context);
		return result;
	}

	/**
	 * Validates the languageCodeShouldBe2Chars constraint of '<em>Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateLanguage_languageCodeShouldBe2Chars(Language language, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT

		boolean valid = true;

		if (language.getLanguageCode() != null) {
			if (language.getLanguageCode().length() != 2) {
				valid = false;
			}

		}

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "languageCodeShouldBe2Chars", getObjectLabel(language, context) },
								new Object[] { language }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdmin(Admin admin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(admin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNormalUser(NormalUser normalUser, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(normalUser, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivilege(Privilege privilege, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(privilege, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivilegeType(PrivilegeType privilegeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //EcomValidator
