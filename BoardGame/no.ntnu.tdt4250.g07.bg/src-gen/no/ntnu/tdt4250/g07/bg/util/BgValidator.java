/**
 */
package no.ntnu.tdt4250.g07.bg.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import no.ntnu.tdt4250.g07.bg.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.g07.bg.BgPackage
 * @generated
 */
public class BgValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BgValidator INSTANCE = new BgValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "no.ntnu.tdt4250.g07.bg";

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
	public BgValidator() {
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
		return BgPackage.eINSTANCE;
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
		case BgPackage.BOARD_GAME:
			return validateBoardGame((BoardGame) value, diagnostics, context);
		case BgPackage.PIECE_TYPE:
			return validatePieceType((PieceType) value, diagnostics, context);
		case BgPackage.CELL_STATE:
			return validateCellState((CellState) value, diagnostics, context);
		case BgPackage.EFFECT_ON_CELL:
			return validateEffectOnCell((EffectOnCell) value, diagnostics, context);
		case BgPackage.WIN_CONDITION:
			return validateWinCondition((WinCondition) value, diagnostics, context);
		case BgPackage.LINE:
			return validateLine((Line) value, diagnostics, context);
		case BgPackage.BOARD_GAME_ELEMENT:
			return validateBoardGameElement((BoardGameElement) value, diagnostics, context);
		case BgPackage.WIN_CONDITION_ELEMENT:
			return validateWinConditionElement((WinConditionElement) value, diagnostics, context);
		case BgPackage.DIRECTION:
			return validateDirection((Direction) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoardGame(BoardGame boardGame, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(boardGame, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(boardGame, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(boardGame, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(boardGame, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(boardGame, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(boardGame, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(boardGame, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(boardGame, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(boardGame, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBoardGame_MustHaveAPieceType(boardGame, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBoardGame_LinesCantBeLongerThanBoard(boardGame, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBoardGame_BoardSizeMustBeAtLeast2(boardGame, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBoardGame_LengthValuesMustBeGreaterThanOne(boardGame, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBoardGame_PieceTypesMustBeUnique(boardGame, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBoardGame_BoardSizeMustBeMaximum10(boardGame, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBoardGame_MustHaveAWinCondition(boardGame, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBoardGame_DirectionCanOnlyBeUsedOnce(boardGame, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MustHaveAPieceType constraint of '<em>Board Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateBoardGame_MustHaveAPieceType(BoardGame boardGame, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		boolean valid = false;

		for (BoardGameElement element : boardGame.getBoardGameElements()) {
			if (element instanceof PieceType) {
				valid = true;
				break;
			}
		}

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "MustHaveAPieceType", getObjectLabel(boardGame, context) },
								new Object[] { boardGame }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the LinesCantBeLongerThanBoard constraint of '<em>Board Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateBoardGame_LinesCantBeLongerThanBoard(BoardGame boardGame, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		boolean valid = true;

		for (BoardGameElement element : boardGame.getBoardGameElements()) {
			if (element instanceof WinCondition) {
				for (WinConditionElement winCondition : ((WinCondition) element).getWinConditionElements()) {
					if (winCondition instanceof Line) {
						if (((Line) winCondition).getLength() > boardGame.getSize()) {
							valid = false;
						}
					}
				}
			}
		}

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "LinesCantBeLongerThanBoard", getObjectLabel(boardGame, context) },
								new Object[] { boardGame }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the BoardSizeMustBeAtLeast2 constraint of '<em>Board Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateBoardGame_BoardSizeMustBeAtLeast2(BoardGame boardGame, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		boolean valid = true;

		if (boardGame.getSize() < 2) {
			valid = false;
		}

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "BoardSizeMustBeAtLeast2", getObjectLabel(boardGame, context) },
								new Object[] { boardGame }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the LengthValuesMustBeGreaterThanOne constraint of '<em>Board Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateBoardGame_LengthValuesMustBeGreaterThanOne(BoardGame boardGame, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		boolean valid = true;
		for (BoardGameElement element : boardGame.getBoardGameElements()) {
			if (element instanceof WinCondition) {
				for (WinConditionElement winCondition : ((WinCondition) element).getWinConditionElements()) {
					if (winCondition instanceof Line) {
						if (((Line) winCondition).getLength() < 2) {
							valid = false;
						}
					}
				}
			}
		}

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "LengthValuesMustBeGreaterThanOne", getObjectLabel(boardGame, context) },
								new Object[] { boardGame }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the PieceTypesMustBeUnique constraint of '<em>Board Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateBoardGame_PieceTypesMustBeUnique(BoardGame boardGame, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		boolean valid = true;

		ArrayList<String> pieceNameList = new ArrayList<>();
		ArrayList<String> pieceSymbolList = new ArrayList<>();

		for (BoardGameElement element : boardGame.getBoardGameElements()) {
			if (element instanceof PieceType) {
				pieceNameList.add(((PieceType) element).getName());
				pieceSymbolList.add(((PieceType) element).getSymbol());
			}
		}

		if (!hasUniqueElements(pieceNameList)) {
			valid = false;
		}
		if (!hasUniqueElements(pieceSymbolList)) {
			valid = false;
		}

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "PieceTypesMustBeUnique", getObjectLabel(boardGame, context) },
								new Object[] { boardGame }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the BoardSizeMustBeMaximum10 constraint of '<em>Board Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateBoardGame_BoardSizeMustBeMaximum10(BoardGame boardGame, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		boolean valid = true;

		if (boardGame.getSize() > 10) {
			valid = false;
		}

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "BoardSizeMustBeMaximum10", getObjectLabel(boardGame, context) },
								new Object[] { boardGame }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the MustHaveAWinCondition constraint of '<em>Board Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateBoardGame_MustHaveAWinCondition(BoardGame boardGame, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		boolean valid = false;

		for (BoardGameElement element : boardGame.getBoardGameElements())
			if (element instanceof WinCondition) {
				valid = true;
			}

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "MustHaveAWinCondition", getObjectLabel(boardGame, context) },
								new Object[] { boardGame }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the DirectionCanOnlyBeUsedOnce constraint of '<em>Board Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateBoardGame_DirectionCanOnlyBeUsedOnce(BoardGame boardGame, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		
		boolean valid = true;
		
		ArrayList<Direction> directions = new ArrayList<>();
		
		for (BoardGameElement element : boardGame.getBoardGameElements()) {
			if (element instanceof WinCondition) {
				for (WinConditionElement winCondition : ((WinCondition) element).getWinConditionElements()) {
					if (winCondition instanceof Line) {
						directions.add(((Line)winCondition).getDirection());
					}
				}
			}
		}
			
		if(!hasUniqueElements(directions)) {
			valid=false;
		}
		

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "DirectionCanOnlyBeUsedOnce", getObjectLabel(boardGame, context) },
								new Object[] { boardGame }, context));
			}
			return false;
		}
		return true;
	}

	public boolean hasUniqueElements(List<?> list) {
		Set<?> set = new HashSet<>(list);
		return set.size() == list.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePieceType(PieceType pieceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pieceType, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(pieceType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(pieceType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(pieceType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(pieceType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(pieceType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(pieceType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(pieceType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(pieceType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePieceType_SymbolCannotBeEmpty(pieceType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SymbolCannotBeEmpty constraint of '<em>Piece Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePieceType_SymbolCannotBeEmpty(PieceType pieceType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		boolean valid = true;

		valid = !pieceType.getSymbol().isEmpty();

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "SymbolCannotBeEmpty", getObjectLabel(pieceType, context) },
								new Object[] { pieceType }, context));
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
	public boolean validateCellState(CellState cellState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cellState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEffectOnCell(EffectOnCell effectOnCell, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(effectOnCell, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWinCondition(WinCondition winCondition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(winCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLine(Line line, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(line, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoardGameElement(BoardGameElement boardGameElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boardGameElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWinConditionElement(WinConditionElement winConditionElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(winConditionElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirection(Direction direction, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //BgValidator
