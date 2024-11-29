/**
 */
package no.ntnu.tdt4250.g07.bg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect On Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.EffectOnCell#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.EffectOnCell#getCellState <em>Cell State</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.EffectOnCell#getX <em>X</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.EffectOnCell#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getEffectOnCell()
 * @model
 * @generated
 */
public interface EffectOnCell extends BoardGameElement {
	/**
	 * Returns the value of the '<em><b>Cell State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell State</em>' reference.
	 * @see #setCellState(CellState)
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getEffectOnCell_CellState()
	 * @model required="true"
	 * @generated
	 */
	CellState getCellState();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.g07.bg.EffectOnCell#getCellState <em>Cell State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell State</em>' reference.
	 * @see #getCellState()
	 * @generated
	 */
	void setCellState(CellState value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getEffectOnCell_X()
	 * @model required="true"
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.g07.bg.EffectOnCell#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(int)
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getEffectOnCell_Y()
	 * @model required="true"
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.g07.bg.EffectOnCell#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getEffectOnCell_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.g07.bg.EffectOnCell#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // EffectOnCell
