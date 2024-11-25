/**
 */
package no.ntnu.tdt4250.group07.bg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Brick Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.BrickChange#getPositionchange <em>Positionchange</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.BrickChange#getMovingBrick <em>Moving Brick</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.BrickChange#getChangeFrom <em>Change From</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.BrickChange#getChangeTo <em>Change To</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.BrickChange#getCondition <em>Condition</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.BrickChange#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getBrickChange()
 * @model
 * @generated
 */
public interface BrickChange extends EObject {
	/**
	 * Returns the value of the '<em><b>Positionchange</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positionchange</em>' reference.
	 * @see #setPositionchange(RelativePosition)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getBrickChange_Positionchange()
	 * @model
	 * @generated
	 */
	RelativePosition getPositionchange();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.BrickChange#getPositionchange <em>Positionchange</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positionchange</em>' reference.
	 * @see #getPositionchange()
	 * @generated
	 */
	void setPositionchange(RelativePosition value);

	/**
	 * Returns the value of the '<em><b>Moving Brick</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moving Brick</em>' reference.
	 * @see #setMovingBrick(BrickType)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getBrickChange_MovingBrick()
	 * @model
	 * @generated
	 */
	BrickType getMovingBrick();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.BrickChange#getMovingBrick <em>Moving Brick</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moving Brick</em>' reference.
	 * @see #getMovingBrick()
	 * @generated
	 */
	void setMovingBrick(BrickType value);

	/**
	 * Returns the value of the '<em><b>Change From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change From</em>' reference.
	 * @see #setChangeFrom(BrickType)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getBrickChange_ChangeFrom()
	 * @model
	 * @generated
	 */
	BrickType getChangeFrom();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.BrickChange#getChangeFrom <em>Change From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change From</em>' reference.
	 * @see #getChangeFrom()
	 * @generated
	 */
	void setChangeFrom(BrickType value);

	/**
	 * Returns the value of the '<em><b>Change To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change To</em>' reference.
	 * @see #setChangeTo(BrickType)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getBrickChange_ChangeTo()
	 * @model
	 * @generated
	 */
	BrickType getChangeTo();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.BrickChange#getChangeTo <em>Change To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change To</em>' reference.
	 * @see #getChangeTo()
	 * @generated
	 */
	void setChangeTo(BrickType value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group07.bg.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference list.
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getBrickChange_Condition()
	 * @model
	 * @generated
	 */
	EList<Condition> getCondition();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getBrickChange_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group07.bg.BrickChange#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // BrickChange
