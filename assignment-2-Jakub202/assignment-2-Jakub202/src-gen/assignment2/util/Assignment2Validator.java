/**
 */
package assignment2.util;

import assignment2.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see assignment2.Assignment2Package
 * @generated
 */
public class Assignment2Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Assignment2Validator INSTANCE = new Assignment2Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "assignment2";

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
	public Assignment2Validator() {
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
		return Assignment2Package.eINSTANCE;
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
		case Assignment2Package.APP:
			return validateApp((App) value, diagnostics, context);
		case Assignment2Package.RULES:
			return validateRules((Rules) value, diagnostics, context);
		case Assignment2Package.BOARD:
			return validateBoard((Board) value, diagnostics, context);
		case Assignment2Package.ALGORITHM:
			return validateAlgorithm((Algorithm) value, diagnostics, context);
		case Assignment2Package.SOLVER:
			return validateSolver((Solver) value, diagnostics, context);
		case Assignment2Package.PROBLEM_GENERATOR:
			return validateProblemGenerator((ProblemGenerator) value, diagnostics, context);
		case Assignment2Package.PLATFORM:
			return validatePlatform((Platform) value, diagnostics, context);
		case Assignment2Package.SHEETS_CONFIG:
			return validateSheetsConfig((SheetsConfig) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApp(App app, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(app, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(app, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(app, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(app, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(app, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(app, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(app, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(app, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(app, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateApp_NonStandardBoardMustHaveGenerator(app, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateApp_SinglePlayerMustHaveSolver(app, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NonStandardBoardMustHaveGenerator constraint of '<em>App</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateApp_NonStandardBoardMustHaveGenerator(App app, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT

		boolean valid = true;

		for (Board board : app.getBoard()) {
			if (!board.isStandardStartPoint()) {
				valid = false;
				for (Algorithm algo : app.getAlgorithm()) {
					if (algo instanceof ProblemGenerator) {
						valid = true;
						break;
					}
				}
			}
		}

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "NonStandardBoardMustHaveGenerator", getObjectLabel(app, context) },
								new Object[] { app }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the SinglePlayerMustHaveSolver constraint of '<em>App</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateApp_SinglePlayerMustHaveSolver(App app, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT

		boolean valid = true;

		if (app.isSinglePlayer()) {
			valid = false;
			for (Algorithm algo : app.getAlgorithm()) {
				if (algo instanceof Solver) {
					valid = true;
				}
			}
		}

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "SinglePlayerMustHaveSolver", getObjectLabel(app, context) },
								new Object[] { app }, context));
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
	public boolean validateRules(Rules rules, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rules, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoard(Board board, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(board, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlgorithm(Algorithm algorithm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(algorithm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSolver(Solver solver, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(solver, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemGenerator(ProblemGenerator problemGenerator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(problemGenerator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlatform(Platform platform, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(platform, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSheetsConfig(SheetsConfig sheetsConfig, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sheetsConfig, diagnostics, context);
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

} //Assignment2Validator
