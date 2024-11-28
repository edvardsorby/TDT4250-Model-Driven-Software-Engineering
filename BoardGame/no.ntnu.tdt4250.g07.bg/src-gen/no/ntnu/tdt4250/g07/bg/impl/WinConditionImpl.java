/**
 */
package no.ntnu.tdt4250.g07.bg.impl;

import no.ntnu.tdt4250.g07.bg.BgPackage;
import no.ntnu.tdt4250.g07.bg.InARow;
import no.ntnu.tdt4250.g07.bg.WinCondition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Win Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.impl.WinConditionImpl#getInarow <em>Inarow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WinConditionImpl extends BoardGameElementImpl implements WinCondition {
	/**
	 * The cached value of the '{@link #getInarow() <em>Inarow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInarow()
	 * @generated
	 * @ordered
	 */
	protected InARow inarow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WinConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BgPackage.Literals.WIN_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InARow getInarow() {
		return inarow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInarow(InARow newInarow, NotificationChain msgs) {
		InARow oldInarow = inarow;
		inarow = newInarow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BgPackage.WIN_CONDITION__INAROW, oldInarow, newInarow);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInarow(InARow newInarow) {
		if (newInarow != inarow) {
			NotificationChain msgs = null;
			if (inarow != null)
				msgs = ((InternalEObject) inarow).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BgPackage.WIN_CONDITION__INAROW, null, msgs);
			if (newInarow != null)
				msgs = ((InternalEObject) newInarow).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BgPackage.WIN_CONDITION__INAROW, null, msgs);
			msgs = basicSetInarow(newInarow, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.WIN_CONDITION__INAROW, newInarow,
					newInarow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BgPackage.WIN_CONDITION__INAROW:
			return basicSetInarow(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BgPackage.WIN_CONDITION__INAROW:
			return getInarow();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BgPackage.WIN_CONDITION__INAROW:
			setInarow((InARow) newValue);
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
		case BgPackage.WIN_CONDITION__INAROW:
			setInarow((InARow) null);
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
		case BgPackage.WIN_CONDITION__INAROW:
			return inarow != null;
		}
		return super.eIsSet(featureID);
	}

} //WinConditionImpl
