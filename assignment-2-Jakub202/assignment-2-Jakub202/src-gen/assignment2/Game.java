/**
 */
package assignment2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment2.Game#getName <em>Name</em>}</li>
 *   <li>{@link assignment2.Game#getRules <em>Rules</em>}</li>
 *   <li>{@link assignment2.Game#getDescription <em>Description</em>}</li>
 *   <li>{@link assignment2.Game#getBoard <em>Board</em>}</li>
 *   <li>{@link assignment2.Game#isSinglePlayer <em>Single Player</em>}</li>
 *   <li>{@link assignment2.Game#isMultiPlayer <em>Multi Player</em>}</li>
 *   <li>{@link assignment2.Game#getAlgorithm <em>Algorithm</em>}</li>
 * </ul>
 *
 * @see assignment2.Assignment2Package#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see assignment2.Assignment2Package#getGame_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link assignment2.Game#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference.
	 * @see #setRules(Rules)
	 * @see assignment2.Assignment2Package#getGame_Rules()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Rules getRules();

	/**
	 * Sets the value of the '{@link assignment2.Game#getRules <em>Rules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rules</em>' containment reference.
	 * @see #getRules()
	 * @generated
	 */
	void setRules(Rules value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see assignment2.Assignment2Package#getGame_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link assignment2.Game#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Board</b></em>' reference list.
	 * The list contents are of type {@link assignment2.Board}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board</em>' reference list.
	 * @see assignment2.Assignment2Package#getGame_Board()
	 * @model required="true"
	 * @generated
	 */
	EList<Board> getBoard();

	/**
	 * Returns the value of the '<em><b>Single Player</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Player</em>' attribute.
	 * @see #setSinglePlayer(boolean)
	 * @see assignment2.Assignment2Package#getGame_SinglePlayer()
	 * @model required="true" derived="true"
	 * @generated
	 */
	boolean isSinglePlayer();

	/**
	 * Sets the value of the '{@link assignment2.Game#isSinglePlayer <em>Single Player</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Player</em>' attribute.
	 * @see #isSinglePlayer()
	 * @generated
	 */
	void setSinglePlayer(boolean value);

	/**
	 * Returns the value of the '<em><b>Multi Player</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Player</em>' attribute.
	 * @see #setMultiPlayer(boolean)
	 * @see assignment2.Assignment2Package#getGame_MultiPlayer()
	 * @model required="true" derived="true"
	 * @generated
	 */
	boolean isMultiPlayer();

	/**
	 * Sets the value of the '{@link assignment2.Game#isMultiPlayer <em>Multi Player</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Player</em>' attribute.
	 * @see #isMultiPlayer()
	 * @generated
	 */
	void setMultiPlayer(boolean value);

	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' reference list.
	 * The list contents are of type {@link assignment2.Algorithm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' reference list.
	 * @see assignment2.Assignment2Package#getGame_Algorithm()
	 * @model
	 * @generated
	 */
	EList<Algorithm> getAlgorithm();

} // Game
