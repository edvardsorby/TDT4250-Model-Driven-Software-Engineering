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
 *   <li>{@link no.ntnu.tdt4250.g07.bg.Line#getLength <em>Length</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.Line#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getLine()
 * @model
 * @generated
 */
public interface Line extends WinConditionElement {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getLine_Length()
	 * @model required="true"
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.g07.bg.Line#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link no.ntnu.tdt4250.g07.bg.Direction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see no.ntnu.tdt4250.g07.bg.Direction
	 * @see #setDirection(Direction)
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getLine_Direction()
	 * @model
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.g07.bg.Line#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see no.ntnu.tdt4250.g07.bg.Direction
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

} // Line
