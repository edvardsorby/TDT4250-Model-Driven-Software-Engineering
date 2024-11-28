/**
 */
package no.ntnu.tdt4250.g07.bg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.Line#getCount <em>Count</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.Line#isDiagonal <em>Diagonal</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.Line#isHorizontal <em>Horizontal</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.Line#isVertical <em>Vertical</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.Line#isUnique <em>Unique</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getLine()
 * @model
 * @generated
 */
public interface Line extends WinConditionElement {
	/**
	 * Returns the value of the '<em><b>Diagonal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagonal</em>' attribute.
	 * @see #setDiagonal(boolean)
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getLine_Diagonal()
	 * @model required="true"
	 * @generated
	 */
	boolean isDiagonal();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.g07.bg.Line#isDiagonal <em>Diagonal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagonal</em>' attribute.
	 * @see #isDiagonal()
	 * @generated
	 */
	void setDiagonal(boolean value);

	/**
	 * Returns the value of the '<em><b>Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal</em>' attribute.
	 * @see #setHorizontal(boolean)
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getLine_Horizontal()
	 * @model required="true"
	 * @generated
	 */
	boolean isHorizontal();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.g07.bg.Line#isHorizontal <em>Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal</em>' attribute.
	 * @see #isHorizontal()
	 * @generated
	 */
	void setHorizontal(boolean value);

	/**
	 * Returns the value of the '<em><b>Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical</em>' attribute.
	 * @see #setVertical(boolean)
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getLine_Vertical()
	 * @model required="true"
	 * @generated
	 */
	boolean isVertical();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.g07.bg.Line#isVertical <em>Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical</em>' attribute.
	 * @see #isVertical()
	 * @generated
	 */
	void setVertical(boolean value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getLine_Count()
	 * @model required="true"
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.g07.bg.Line#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(boolean)
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getLine_Unique()
	 * @model required="true"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.g07.bg.Line#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

} // Line
