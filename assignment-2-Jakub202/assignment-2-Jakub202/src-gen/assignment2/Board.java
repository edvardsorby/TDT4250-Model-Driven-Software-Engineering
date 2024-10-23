/**
 */
package assignment2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment2.Board#isStandardStartPoint <em>Standard Start Point</em>}</li>
 *   <li>{@link assignment2.Board#getName <em>Name</em>}</li>
 *   <li>{@link assignment2.Board#getSheetsConfig <em>Sheets Config</em>}</li>
 * </ul>
 *
 * @see assignment2.Assignment2Package#getBoard()
 * @model
 * @generated
 */
public interface Board extends EObject {
	/**
	 * Returns the value of the '<em><b>Standard Start Point</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Start Point</em>' attribute.
	 * @see #setStandardStartPoint(boolean)
	 * @see assignment2.Assignment2Package#getBoard_StandardStartPoint()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isStandardStartPoint();

	/**
	 * Sets the value of the '{@link assignment2.Board#isStandardStartPoint <em>Standard Start Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Start Point</em>' attribute.
	 * @see #isStandardStartPoint()
	 * @generated
	 */
	void setStandardStartPoint(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see assignment2.Assignment2Package#getBoard_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link assignment2.Board#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sheets Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheets Config</em>' containment reference.
	 * @see #setSheetsConfig(SheetsConfig)
	 * @see assignment2.Assignment2Package#getBoard_SheetsConfig()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SheetsConfig getSheetsConfig();

	/**
	 * Sets the value of the '{@link assignment2.Board#getSheetsConfig <em>Sheets Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheets Config</em>' containment reference.
	 * @see #getSheetsConfig()
	 * @generated
	 */
	void setSheetsConfig(SheetsConfig value);

} // Board
