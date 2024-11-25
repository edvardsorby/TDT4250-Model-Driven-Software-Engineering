/**
 */
package no.ntnu.tdt4250.group07.bg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.Condition#getBoardstate <em>Boardstate</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.Condition#getRelativeposition <em>Relativeposition</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.Condition#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.Condition#isProhibited <em>Prohibited</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.Condition#getBricktype <em>Bricktype</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.Condition#getBrickstate <em>Brickstate</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.Condition#getCelltype <em>Celltype</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.Condition#getCellstate <em>Cellstate</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.Condition#getLine <em>Line</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.Condition#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Boardstate</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group07.bg.BoardState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boardstate</em>' reference list.
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getCondition_Boardstate()
	 * @model
	 * @generated
	 */
	EList<BoardState> getBoardstate();

	/**
	 * Returns the value of the '<em><b>Relativeposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relativeposition</em>' reference.
	 * @see #setRelativeposition(RelativePosition)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getCondition_Relativeposition()
	 * @model
	 * @generated
	 */
	RelativePosition getRelativeposition();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.Condition#getRelativeposition <em>Relativeposition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relativeposition</em>' reference.
	 * @see #getRelativeposition()
	 * @generated
	 */
	void setRelativeposition(RelativePosition value);

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(boolean)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getCondition_Mandatory()
	 * @model required="true"
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.Condition#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isMandatory()
	 * @generated
	 */
	void setMandatory(boolean value);

	/**
	 * Returns the value of the '<em><b>Prohibited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prohibited</em>' attribute.
	 * @see #setProhibited(boolean)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getCondition_Prohibited()
	 * @model required="true"
	 * @generated
	 */
	boolean isProhibited();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.Condition#isProhibited <em>Prohibited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prohibited</em>' attribute.
	 * @see #isProhibited()
	 * @generated
	 */
	void setProhibited(boolean value);

	/**
	 * Returns the value of the '<em><b>Bricktype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bricktype</em>' reference.
	 * @see #setBricktype(BrickType)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getCondition_Bricktype()
	 * @model
	 * @generated
	 */
	BrickType getBricktype();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.Condition#getBricktype <em>Bricktype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bricktype</em>' reference.
	 * @see #getBricktype()
	 * @generated
	 */
	void setBricktype(BrickType value);

	/**
	 * Returns the value of the '<em><b>Brickstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brickstate</em>' reference.
	 * @see #setBrickstate(BrickState)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getCondition_Brickstate()
	 * @model
	 * @generated
	 */
	BrickState getBrickstate();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.Condition#getBrickstate <em>Brickstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brickstate</em>' reference.
	 * @see #getBrickstate()
	 * @generated
	 */
	void setBrickstate(BrickState value);

	/**
	 * Returns the value of the '<em><b>Celltype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Celltype</em>' reference.
	 * @see #setCelltype(CellType)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getCondition_Celltype()
	 * @model
	 * @generated
	 */
	CellType getCelltype();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.Condition#getCelltype <em>Celltype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Celltype</em>' reference.
	 * @see #getCelltype()
	 * @generated
	 */
	void setCelltype(CellType value);

	/**
	 * Returns the value of the '<em><b>Cellstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cellstate</em>' reference.
	 * @see #setCellstate(CellState)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getCondition_Cellstate()
	 * @model
	 * @generated
	 */
	CellState getCellstate();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.Condition#getCellstate <em>Cellstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cellstate</em>' reference.
	 * @see #getCellstate()
	 * @generated
	 */
	void setCellstate(CellState value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group07.bg.Line}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' reference list.
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getCondition_Line()
	 * @model
	 * @generated
	 */
	EList<Line> getLine();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getCondition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.Condition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Condition
