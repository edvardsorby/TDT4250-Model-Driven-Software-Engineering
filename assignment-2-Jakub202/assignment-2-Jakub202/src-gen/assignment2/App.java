/**
 */
package assignment2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment2.App#getName <em>Name</em>}</li>
 *   <li>{@link assignment2.App#getRules <em>Rules</em>}</li>
 *   <li>{@link assignment2.App#getDescription <em>Description</em>}</li>
 *   <li>{@link assignment2.App#getBoard <em>Board</em>}</li>
 *   <li>{@link assignment2.App#isSinglePlayer <em>Single Player</em>}</li>
 *   <li>{@link assignment2.App#isMultiPlayer <em>Multi Player</em>}</li>
 *   <li>{@link assignment2.App#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link assignment2.App#isOnline <em>Online</em>}</li>
 *   <li>{@link assignment2.App#getPlatform <em>Platform</em>}</li>
 *   <li>{@link assignment2.App#isMultiPlatform <em>Multi Platform</em>}</li>
 * </ul>
 *
 * @see assignment2.Assignment2Package#getApp()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NonStandardBoardMustHaveGenerator SinglePlayerMustHaveSolver'"
 * @generated
 */
public interface App extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see assignment2.Assignment2Package#getApp_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link assignment2.App#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' reference.
	 * @see #setRules(Rules)
	 * @see assignment2.Assignment2Package#getApp_Rules()
	 * @model required="true"
	 * @generated
	 */
	Rules getRules();

	/**
	 * Sets the value of the '{@link assignment2.App#getRules <em>Rules</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rules</em>' reference.
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
	 * @see assignment2.Assignment2Package#getApp_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link assignment2.App#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Board</b></em>' containment reference list.
	 * The list contents are of type {@link assignment2.Board}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board</em>' containment reference list.
	 * @see assignment2.Assignment2Package#getApp_Board()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Board> getBoard();

	/**
	 * Returns the value of the '<em><b>Single Player</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Player</em>' attribute.
	 * @see assignment2.Assignment2Package#getApp_SinglePlayer()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isSinglePlayer();

	/**
	 * Returns the value of the '<em><b>Multi Player</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Player</em>' attribute.
	 * @see assignment2.Assignment2Package#getApp_MultiPlayer()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isMultiPlayer();

	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' reference list.
	 * The list contents are of type {@link assignment2.Algorithm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' reference list.
	 * @see assignment2.Assignment2Package#getApp_Algorithm()
	 * @model
	 * @generated
	 */
	EList<Algorithm> getAlgorithm();

	/**
	 * Returns the value of the '<em><b>Online</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Online</em>' attribute.
	 * @see #setOnline(boolean)
	 * @see assignment2.Assignment2Package#getApp_Online()
	 * @model required="true"
	 * @generated
	 */
	boolean isOnline();

	/**
	 * Sets the value of the '{@link assignment2.App#isOnline <em>Online</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Online</em>' attribute.
	 * @see #isOnline()
	 * @generated
	 */
	void setOnline(boolean value);

	/**
	 * Returns the value of the '<em><b>Platform</b></em>' reference list.
	 * The list contents are of type {@link assignment2.Platform}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform</em>' reference list.
	 * @see assignment2.Assignment2Package#getApp_Platform()
	 * @model required="true"
	 * @generated
	 */
	EList<Platform> getPlatform();

	/**
	 * Returns the value of the '<em><b>Multi Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Platform</em>' attribute.
	 * @see assignment2.Assignment2Package#getApp_MultiPlatform()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isMultiPlatform();

} // App
