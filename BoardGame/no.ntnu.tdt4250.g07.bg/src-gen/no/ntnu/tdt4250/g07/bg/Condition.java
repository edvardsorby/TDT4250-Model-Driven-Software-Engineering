/**
 */
package no.ntnu.tdt4250.g07.bg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.Condition#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.Condition#getCellState <em>Cell State</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends BoardGameElement {
	/**
	 * Returns the value of the '<em><b>Cell State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell State</em>' reference.
	 * @see #setCellState(CellState)
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getCondition_CellState()
	 * @model required="true"
	 * @generated
	 */
	CellState getCellState();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.g07.bg.Condition#getCellState <em>Cell State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell State</em>' reference.
	 * @see #getCellState()
	 * @generated
	 */
	void setCellState(CellState value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getCondition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.g07.bg.Condition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Condition
