/**
 */
package assignment2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment2.Rules#isCustomizable <em>Customizable</em>}</li>
 *   <li>{@link assignment2.Rules#getMaximumPlayers <em>Maximum Players</em>}</li>
 *   <li>{@link assignment2.Rules#getMinimumPlayers <em>Minimum Players</em>}</li>
 * </ul>
 *
 * @see assignment2.Assignment2Package#getRules()
 * @model
 * @generated
 */
public interface Rules extends EObject {
	/**
	 * Returns the value of the '<em><b>Customizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customizable</em>' attribute.
	 * @see #setCustomizable(boolean)
	 * @see assignment2.Assignment2Package#getRules_Customizable()
	 * @model required="true"
	 * @generated
	 */
	boolean isCustomizable();

	/**
	 * Sets the value of the '{@link assignment2.Rules#isCustomizable <em>Customizable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customizable</em>' attribute.
	 * @see #isCustomizable()
	 * @generated
	 */
	void setCustomizable(boolean value);

	/**
	 * Returns the value of the '<em><b>Maximum Players</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Players</em>' attribute.
	 * @see #setMaximumPlayers(int)
	 * @see assignment2.Assignment2Package#getRules_MaximumPlayers()
	 * @model required="true"
	 * @generated
	 */
	int getMaximumPlayers();

	/**
	 * Sets the value of the '{@link assignment2.Rules#getMaximumPlayers <em>Maximum Players</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Players</em>' attribute.
	 * @see #getMaximumPlayers()
	 * @generated
	 */
	void setMaximumPlayers(int value);

	/**
	 * Returns the value of the '<em><b>Minimum Players</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Players</em>' attribute.
	 * @see #setMinimumPlayers(int)
	 * @see assignment2.Assignment2Package#getRules_MinimumPlayers()
	 * @model required="true"
	 * @generated
	 */
	int getMinimumPlayers();

	/**
	 * Sets the value of the '{@link assignment2.Rules#getMinimumPlayers <em>Minimum Players</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Players</em>' attribute.
	 * @see #getMinimumPlayers()
	 * @generated
	 */
	void setMinimumPlayers(int value);

} // Rules
