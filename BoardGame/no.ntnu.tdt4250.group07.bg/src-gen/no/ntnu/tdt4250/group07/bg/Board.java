/**
 */
package no.ntnu.tdt4250.group07.bg;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link no.ntnu.tdt4250.group07.bg.Board#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.Board#isStartPosition <em>Start Position</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.Board#getPlayerbrickset <em>Playerbrickset</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.Board#getCell <em>Cell</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.Board#getWidth <em>Width</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.Board#getHeight <em>Height</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.Board#getBoardstate <em>Boardstate</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.Board#getValidmove <em>Validmove</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getBoard()
 * @model
 * @generated
 */
public interface Board extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getBoard_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.Board#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Start Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Position</em>' attribute.
	 * @see #setStartPosition(boolean)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getBoard_StartPosition()
	 * @model required="true" derived="true"
	 * @generated
	 */
	boolean isStartPosition();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.Board#isStartPosition <em>Start Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Position</em>' attribute.
	 * @see #isStartPosition()
	 * @generated
	 */
	void setStartPosition(boolean value);

	/**
	 * Returns the value of the '<em><b>Playerbrickset</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group07.bg.PlayerBrickSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Playerbrickset</em>' containment reference list.
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getBoard_Playerbrickset()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PlayerBrickSet> getPlayerbrickset();

	/**
	 * Returns the value of the '<em><b>Cell</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group07.bg.Cell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell</em>' reference list.
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getBoard_Cell()
	 * @model required="true"
	 * @generated
	 */
	EList<Cell> getCell();

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getBoard_Width()
	 * @model required="true"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.Board#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getBoard_Height()
	 * @model required="true"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.Board#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Boardstate</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group07.bg.BoardState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boardstate</em>' reference list.
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getBoard_Boardstate()
	 * @model
	 * @generated
	 */
	EList<BoardState> getBoardstate();

	/**
	 * Returns the value of the '<em><b>Validmove</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group07.bg.ValidMove}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validmove</em>' containment reference list.
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getBoard_Validmove()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ValidMove> getValidmove();

} // Board
