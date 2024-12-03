/**
 */
package no.ntnu.tdt4250.g07.bg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Board Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.BoardGame#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.BoardGame#getSize <em>Size</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.BoardGame#getBoardGameElements <em>Board Game Elements</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getBoardGame()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MustHaveAPieceType LinesCantBeLongerThanBoard BoardSizeMustBeAtLeast2 LengthValuesMustBeGreaterThanOne PieceTypesMustBeUnique BoardSizeMustBeMaximum10'"
 * @generated
 */
public interface BoardGame extends EObject {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getBoardGame_Size()
	 * @model required="true"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.g07.bg.BoardGame#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getBoardGame_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.g07.bg.BoardGame#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Board Game Elements</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.g07.bg.BoardGameElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board Game Elements</em>' containment reference list.
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getBoardGame_BoardGameElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<BoardGameElement> getBoardGameElements();

} // BoardGame
