/**
 */
package no.ntnu.tdt4250.group07.bg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player Brick Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.PlayerBrickSet#getBrick <em>Brick</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.PlayerBrickSet#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.PlayerBrickSet#getWin <em>Win</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.PlayerBrickSet#getDraw <em>Draw</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getPlayerBrickSet()
 * @model
 * @generated
 */
public interface PlayerBrickSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Brick</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group07.bg.Brick}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brick</em>' containment reference list.
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getPlayerBrickSet_Brick()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Brick> getBrick();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getPlayerBrickSet_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.PlayerBrickSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Win</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group07.bg.Outcome}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Win</em>' reference list.
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getPlayerBrickSet_Win()
	 * @model required="true"
	 * @generated
	 */
	EList<Outcome> getWin();

	/**
	 * Returns the value of the '<em><b>Draw</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Draw</em>' reference.
	 * @see #setDraw(Outcome)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getPlayerBrickSet_Draw()
	 * @model
	 * @generated
	 */
	Outcome getDraw();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.PlayerBrickSet#getDraw <em>Draw</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Draw</em>' reference.
	 * @see #getDraw()
	 * @generated
	 */
	void setDraw(Outcome value);

} // PlayerBrickSet
