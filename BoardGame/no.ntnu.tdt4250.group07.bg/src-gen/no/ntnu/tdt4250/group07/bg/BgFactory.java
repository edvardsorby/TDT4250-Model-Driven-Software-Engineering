/**
 */
package no.ntnu.tdt4250.group07.bg;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.group07.bg.BgPackage
 * @generated
 */
public interface BgFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BgFactory eINSTANCE = no.ntnu.tdt4250.group07.bg.impl.BgFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Board Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Board Game</em>'.
	 * @generated
	 */
	BoardGame createBoardGame();

	/**
	 * Returns a new object of class '<em>Piece Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Piece Type</em>'.
	 * @generated
	 */
	PieceType createPieceType();

	/**
	 * Returns a new object of class '<em>Cell State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cell State</em>'.
	 * @generated
	 */
	CellState createCellState();

	/**
	 * Returns a new object of class '<em>Valid Move</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valid Move</em>'.
	 * @generated
	 */
	ValidMove createValidMove();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Effect On Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Effect On Cell</em>'.
	 * @generated
	 */
	EffectOnCell createEffectOnCell();

	/**
	 * Returns a new object of class '<em>Win Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Win Condition</em>'.
	 * @generated
	 */
	WinCondition createWinCondition();

	/**
	 * Returns a new object of class '<em>In ARow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In ARow</em>'.
	 * @generated
	 */
	InARow createInARow();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BgPackage getBgPackage();

} //BgFactory
