/**
 */
package no.ntnu.tdt4250.g07.BoardGame;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect On Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.g07.BoardGame.EffectOnCell#getCellstate <em>Cellstate</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.BoardGame.EffectOnCell#getX <em>X</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.BoardGame.EffectOnCell#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.g07.BoardGame.BgPackage#getEffectOnCell()
 * @model
 * @generated
 */
public interface EffectOnCell extends EObject {
	/**
	 * Returns the value of the '<em><b>Cellstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cellstate</em>' reference.
	 * @see #setCellstate(CellState)
	 * @see no.ntnu.tdt4250.g07.BoardGame.BgPackage#getEffectOnCell_Cellstate()
	 * @model required="true"
	 * @generated
	 */
	CellState getCellstate();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.g07.BoardGame.EffectOnCell#getCellstate <em>Cellstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cellstate</em>' reference.
	 * @see #getCellstate()
	 * @generated
	 */
	void setCellstate(CellState value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see no.ntnu.tdt4250.g07.BoardGame.BgPackage#getEffectOnCell_X()
	 * @model required="true"
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.g07.BoardGame.EffectOnCell#getX <em>X</em>}' attribute.
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
	 * @see no.ntnu.tdt4250.g07.BoardGame.BgPackage#getEffectOnCell_Y()
	 * @model required="true"
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.g07.BoardGame.EffectOnCell#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

} // EffectOnCell
