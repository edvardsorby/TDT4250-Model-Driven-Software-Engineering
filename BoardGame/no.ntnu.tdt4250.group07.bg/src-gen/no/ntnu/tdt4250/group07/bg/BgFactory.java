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
	 * Returns a new object of class '<em>Rules</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rules</em>'.
	 * @generated
	 */
	Rules createRules();

	/**
	 * Returns a new object of class '<em>Board</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Board</em>'.
	 * @generated
	 */
	Board createBoard();

	/**
	 * Returns a new object of class '<em>Player Brick Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Player Brick Set</em>'.
	 * @generated
	 */
	PlayerBrickSet createPlayerBrickSet();

	/**
	 * Returns a new object of class '<em>Brick</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Brick</em>'.
	 * @generated
	 */
	Brick createBrick();

	/**
	 * Returns a new object of class '<em>Brick Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Brick Type</em>'.
	 * @generated
	 */
	BrickType createBrickType();

	/**
	 * Returns a new object of class '<em>Brick State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Brick State</em>'.
	 * @generated
	 */
	BrickState createBrickState();

	/**
	 * Returns a new object of class '<em>Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cell</em>'.
	 * @generated
	 */
	Cell createCell();

	/**
	 * Returns a new object of class '<em>Cell Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cell Type</em>'.
	 * @generated
	 */
	CellType createCellType();

	/**
	 * Returns a new object of class '<em>Cell State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cell State</em>'.
	 * @generated
	 */
	CellState createCellState();

	/**
	 * Returns a new object of class '<em>Board State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Board State</em>'.
	 * @generated
	 */
	BoardState createBoardState();

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
	 * Returns a new object of class '<em>Brick Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Brick Change</em>'.
	 * @generated
	 */
	BrickChange createBrickChange();

	/**
	 * Returns a new object of class '<em>Relative Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relative Position</em>'.
	 * @generated
	 */
	RelativePosition createRelativePosition();

	/**
	 * Returns a new object of class '<em>Cell Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cell Change</em>'.
	 * @generated
	 */
	CellChange createCellChange();

	/**
	 * Returns a new object of class '<em>Effect On Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Effect On Cell</em>'.
	 * @generated
	 */
	EffectOnCell createEffectOnCell();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BgPackage getBgPackage();

} //BgFactory
