/**
 */
package assignment2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sheets Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment2.SheetsConfig#getRanking <em>Ranking</em>}</li>
 *   <li>{@link assignment2.SheetsConfig#getSheet <em>Sheet</em>}</li>
 *   <li>{@link assignment2.SheetsConfig#getPlayer <em>Player</em>}</li>
 *   <li>{@link assignment2.SheetsConfig#getScore <em>Score</em>}</li>
 * </ul>
 *
 * @see assignment2.Assignment2Package#getSheetsConfig()
 * @model
 * @generated
 */
public interface SheetsConfig extends EObject {

	/**
	 * Returns the value of the '<em><b>Ranking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ranking</em>' attribute.
	 * @see #setRanking(String)
	 * @see assignment2.Assignment2Package#getSheetsConfig_Ranking()
	 * @model required="true"
	 * @generated
	 */
	String getRanking();

	/**
	 * Sets the value of the '{@link assignment2.SheetsConfig#getRanking <em>Ranking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ranking</em>' attribute.
	 * @see #getRanking()
	 * @generated
	 */
	void setRanking(String value);

	/**
	 * Returns the value of the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet</em>' attribute.
	 * @see #setSheet(String)
	 * @see assignment2.Assignment2Package#getSheetsConfig_Sheet()
	 * @model required="true"
	 * @generated
	 */
	String getSheet();

	/**
	 * Sets the value of the '{@link assignment2.SheetsConfig#getSheet <em>Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet</em>' attribute.
	 * @see #getSheet()
	 * @generated
	 */
	void setSheet(String value);

	/**
	 * Returns the value of the '<em><b>Player</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' attribute.
	 * @see #setPlayer(String)
	 * @see assignment2.Assignment2Package#getSheetsConfig_Player()
	 * @model required="true"
	 * @generated
	 */
	String getPlayer();

	/**
	 * Sets the value of the '{@link assignment2.SheetsConfig#getPlayer <em>Player</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player</em>' attribute.
	 * @see #getPlayer()
	 * @generated
	 */
	void setPlayer(String value);

	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(String)
	 * @see assignment2.Assignment2Package#getSheetsConfig_Score()
	 * @model required="true"
	 * @generated
	 */
	String getScore();

	/**
	 * Sets the value of the '{@link assignment2.SheetsConfig#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(String value);
} // SheetsConfig
