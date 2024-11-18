/**
 */
package no.ntnu.tdt4250.group07.bg.impl;

import java.util.Collection;

import no.ntnu.tdt4250.group07.bg.BgPackage;
import no.ntnu.tdt4250.group07.bg.CellChange;
import no.ntnu.tdt4250.group07.bg.CellType;
import no.ntnu.tdt4250.group07.bg.Condition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.CellChangeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.CellChangeImpl#getChangeFrom <em>Change From</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.CellChangeImpl#getChangeTo <em>Change To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CellChangeImpl extends MinimalEObjectImpl.Container implements CellChange {
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
	 * The cached value of the '{@link #getChangeFrom() <em>Change From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeFrom()
	 * @generated
	 * @ordered
	 */
	protected CellType changeFrom;

	/**
	 * The cached value of the '{@link #getChangeTo() <em>Change To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeTo()
	 * @generated
	 * @ordered
	 */
	protected CellType changeTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CellChangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BgPackage.Literals.CELL_CHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Condition> getCondition() {
		if (condition == null) {
			condition = new EObjectResolvingEList<Condition>(Condition.class, this, BgPackage.CELL_CHANGE__CONDITION);
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CellType getChangeFrom() {
		if (changeFrom != null && changeFrom.eIsProxy()) {
			InternalEObject oldChangeFrom = (InternalEObject) changeFrom;
			changeFrom = (CellType) eResolveProxy(oldChangeFrom);
			if (changeFrom != oldChangeFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BgPackage.CELL_CHANGE__CHANGE_FROM,
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
	public CellType basicGetChangeFrom() {
		return changeFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeFrom(CellType newChangeFrom) {
		CellType oldChangeFrom = changeFrom;
		changeFrom = newChangeFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.CELL_CHANGE__CHANGE_FROM, oldChangeFrom,
					changeFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CellType getChangeTo() {
		if (changeTo != null && changeTo.eIsProxy()) {
			InternalEObject oldChangeTo = (InternalEObject) changeTo;
			changeTo = (CellType) eResolveProxy(oldChangeTo);
			if (changeTo != oldChangeTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BgPackage.CELL_CHANGE__CHANGE_TO,
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
	public CellType basicGetChangeTo() {
		return changeTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeTo(CellType newChangeTo) {
		CellType oldChangeTo = changeTo;
		changeTo = newChangeTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.CELL_CHANGE__CHANGE_TO, oldChangeTo,
					changeTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BgPackage.CELL_CHANGE__CONDITION:
			return getCondition();
		case BgPackage.CELL_CHANGE__CHANGE_FROM:
			if (resolve)
				return getChangeFrom();
			return basicGetChangeFrom();
		case BgPackage.CELL_CHANGE__CHANGE_TO:
			if (resolve)
				return getChangeTo();
			return basicGetChangeTo();
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
		case BgPackage.CELL_CHANGE__CONDITION:
			getCondition().clear();
			getCondition().addAll((Collection<? extends Condition>) newValue);
			return;
		case BgPackage.CELL_CHANGE__CHANGE_FROM:
			setChangeFrom((CellType) newValue);
			return;
		case BgPackage.CELL_CHANGE__CHANGE_TO:
			setChangeTo((CellType) newValue);
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
		case BgPackage.CELL_CHANGE__CONDITION:
			getCondition().clear();
			return;
		case BgPackage.CELL_CHANGE__CHANGE_FROM:
			setChangeFrom((CellType) null);
			return;
		case BgPackage.CELL_CHANGE__CHANGE_TO:
			setChangeTo((CellType) null);
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
		case BgPackage.CELL_CHANGE__CONDITION:
			return condition != null && !condition.isEmpty();
		case BgPackage.CELL_CHANGE__CHANGE_FROM:
			return changeFrom != null;
		case BgPackage.CELL_CHANGE__CHANGE_TO:
			return changeTo != null;
		}
		return super.eIsSet(featureID);
	}

} //CellChangeImpl
