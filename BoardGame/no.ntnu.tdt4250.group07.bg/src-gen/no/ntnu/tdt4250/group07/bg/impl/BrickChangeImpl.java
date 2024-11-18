/**
 */
package no.ntnu.tdt4250.group07.bg.impl;

import java.util.Collection;

import no.ntnu.tdt4250.group07.bg.BgPackage;
import no.ntnu.tdt4250.group07.bg.BrickChange;
import no.ntnu.tdt4250.group07.bg.BrickType;
import no.ntnu.tdt4250.group07.bg.Condition;
import no.ntnu.tdt4250.group07.bg.RelativePosition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Brick Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.BrickChangeImpl#getPositionchange <em>Positionchange</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.BrickChangeImpl#getMovingBrick <em>Moving Brick</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.BrickChangeImpl#getChangeFrom <em>Change From</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.BrickChangeImpl#getChangeTo <em>Change To</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.BrickChangeImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BrickChangeImpl extends MinimalEObjectImpl.Container implements BrickChange {
	/**
	 * The cached value of the '{@link #getPositionchange() <em>Positionchange</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionchange()
	 * @generated
	 * @ordered
	 */
	protected RelativePosition positionchange;

	/**
	 * The cached value of the '{@link #getMovingBrick() <em>Moving Brick</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovingBrick()
	 * @generated
	 * @ordered
	 */
	protected BrickType movingBrick;

	/**
	 * The cached value of the '{@link #getChangeFrom() <em>Change From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeFrom()
	 * @generated
	 * @ordered
	 */
	protected BrickType changeFrom;

	/**
	 * The cached value of the '{@link #getChangeTo() <em>Change To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeTo()
	 * @generated
	 * @ordered
	 */
	protected BrickType changeTo;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> condition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrickChangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BgPackage.Literals.BRICK_CHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelativePosition getPositionchange() {
		if (positionchange != null && positionchange.eIsProxy()) {
			InternalEObject oldPositionchange = (InternalEObject) positionchange;
			positionchange = (RelativePosition) eResolveProxy(oldPositionchange);
			if (positionchange != oldPositionchange) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BgPackage.BRICK_CHANGE__POSITIONCHANGE,
							oldPositionchange, positionchange));
			}
		}
		return positionchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativePosition basicGetPositionchange() {
		return positionchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionchange(RelativePosition newPositionchange) {
		RelativePosition oldPositionchange = positionchange;
		positionchange = newPositionchange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.BRICK_CHANGE__POSITIONCHANGE,
					oldPositionchange, positionchange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BrickType getMovingBrick() {
		if (movingBrick != null && movingBrick.eIsProxy()) {
			InternalEObject oldMovingBrick = (InternalEObject) movingBrick;
			movingBrick = (BrickType) eResolveProxy(oldMovingBrick);
			if (movingBrick != oldMovingBrick) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BgPackage.BRICK_CHANGE__MOVING_BRICK,
							oldMovingBrick, movingBrick));
			}
		}
		return movingBrick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrickType basicGetMovingBrick() {
		return movingBrick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMovingBrick(BrickType newMovingBrick) {
		BrickType oldMovingBrick = movingBrick;
		movingBrick = newMovingBrick;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.BRICK_CHANGE__MOVING_BRICK, oldMovingBrick,
					movingBrick));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BrickType getChangeFrom() {
		if (changeFrom != null && changeFrom.eIsProxy()) {
			InternalEObject oldChangeFrom = (InternalEObject) changeFrom;
			changeFrom = (BrickType) eResolveProxy(oldChangeFrom);
			if (changeFrom != oldChangeFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BgPackage.BRICK_CHANGE__CHANGE_FROM,
							oldChangeFrom, changeFrom));
			}
		}
		return changeFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrickType basicGetChangeFrom() {
		return changeFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeFrom(BrickType newChangeFrom) {
		BrickType oldChangeFrom = changeFrom;
		changeFrom = newChangeFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.BRICK_CHANGE__CHANGE_FROM, oldChangeFrom,
					changeFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BrickType getChangeTo() {
		if (changeTo != null && changeTo.eIsProxy()) {
			InternalEObject oldChangeTo = (InternalEObject) changeTo;
			changeTo = (BrickType) eResolveProxy(oldChangeTo);
			if (changeTo != oldChangeTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BgPackage.BRICK_CHANGE__CHANGE_TO,
							oldChangeTo, changeTo));
			}
		}
		return changeTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrickType basicGetChangeTo() {
		return changeTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeTo(BrickType newChangeTo) {
		BrickType oldChangeTo = changeTo;
		changeTo = newChangeTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.BRICK_CHANGE__CHANGE_TO, oldChangeTo,
					changeTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Condition> getCondition() {
		if (condition == null) {
			condition = new EObjectResolvingEList<Condition>(Condition.class, this, BgPackage.BRICK_CHANGE__CONDITION);
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BgPackage.BRICK_CHANGE__POSITIONCHANGE:
			if (resolve)
				return getPositionchange();
			return basicGetPositionchange();
		case BgPackage.BRICK_CHANGE__MOVING_BRICK:
			if (resolve)
				return getMovingBrick();
			return basicGetMovingBrick();
		case BgPackage.BRICK_CHANGE__CHANGE_FROM:
			if (resolve)
				return getChangeFrom();
			return basicGetChangeFrom();
		case BgPackage.BRICK_CHANGE__CHANGE_TO:
			if (resolve)
				return getChangeTo();
			return basicGetChangeTo();
		case BgPackage.BRICK_CHANGE__CONDITION:
			return getCondition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BgPackage.BRICK_CHANGE__POSITIONCHANGE:
			setPositionchange((RelativePosition) newValue);
			return;
		case BgPackage.BRICK_CHANGE__MOVING_BRICK:
			setMovingBrick((BrickType) newValue);
			return;
		case BgPackage.BRICK_CHANGE__CHANGE_FROM:
			setChangeFrom((BrickType) newValue);
			return;
		case BgPackage.BRICK_CHANGE__CHANGE_TO:
			setChangeTo((BrickType) newValue);
			return;
		case BgPackage.BRICK_CHANGE__CONDITION:
			getCondition().clear();
			getCondition().addAll((Collection<? extends Condition>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case BgPackage.BRICK_CHANGE__POSITIONCHANGE:
			setPositionchange((RelativePosition) null);
			return;
		case BgPackage.BRICK_CHANGE__MOVING_BRICK:
			setMovingBrick((BrickType) null);
			return;
		case BgPackage.BRICK_CHANGE__CHANGE_FROM:
			setChangeFrom((BrickType) null);
			return;
		case BgPackage.BRICK_CHANGE__CHANGE_TO:
			setChangeTo((BrickType) null);
			return;
		case BgPackage.BRICK_CHANGE__CONDITION:
			getCondition().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case BgPackage.BRICK_CHANGE__POSITIONCHANGE:
			return positionchange != null;
		case BgPackage.BRICK_CHANGE__MOVING_BRICK:
			return movingBrick != null;
		case BgPackage.BRICK_CHANGE__CHANGE_FROM:
			return changeFrom != null;
		case BgPackage.BRICK_CHANGE__CHANGE_TO:
			return changeTo != null;
		case BgPackage.BRICK_CHANGE__CONDITION:
			return condition != null && !condition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BrickChangeImpl
