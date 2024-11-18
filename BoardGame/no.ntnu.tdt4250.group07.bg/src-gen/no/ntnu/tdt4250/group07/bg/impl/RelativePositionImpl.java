/**
 */
package no.ntnu.tdt4250.group07.bg.impl;

import no.ntnu.tdt4250.group07.bg.BgPackage;
import no.ntnu.tdt4250.group07.bg.RelativePosition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relative Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.RelativePositionImpl#getXchange <em>Xchange</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.RelativePositionImpl#getYchange <em>Ychange</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelativePositionImpl extends MinimalEObjectImpl.Container implements RelativePosition {
	/**
	 * The default value of the '{@link #getXchange() <em>Xchange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXchange()
	 * @generated
	 * @ordered
	 */
	protected static final int XCHANGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getXchange() <em>Xchange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXchange()
	 * @generated
	 * @ordered
	 */
	protected int xchange = XCHANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYchange() <em>Ychange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYchange()
	 * @generated
	 * @ordered
	 */
	protected static final int YCHANGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYchange() <em>Ychange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYchange()
	 * @generated
	 * @ordered
	 */
	protected int ychange = YCHANGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelativePositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BgPackage.Literals.RELATIVE_POSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getXchange() {
		return xchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXchange(int newXchange) {
		int oldXchange = xchange;
		xchange = newXchange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.RELATIVE_POSITION__XCHANGE, oldXchange,
					xchange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getYchange() {
		return ychange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYchange(int newYchange) {
		int oldYchange = ychange;
		ychange = newYchange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.RELATIVE_POSITION__YCHANGE, oldYchange,
					ychange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BgPackage.RELATIVE_POSITION__XCHANGE:
			return getXchange();
		case BgPackage.RELATIVE_POSITION__YCHANGE:
			return getYchange();
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
		case BgPackage.RELATIVE_POSITION__XCHANGE:
			setXchange((Integer) newValue);
			return;
		case BgPackage.RELATIVE_POSITION__YCHANGE:
			setYchange((Integer) newValue);
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
		case BgPackage.RELATIVE_POSITION__XCHANGE:
			setXchange(XCHANGE_EDEFAULT);
			return;
		case BgPackage.RELATIVE_POSITION__YCHANGE:
			setYchange(YCHANGE_EDEFAULT);
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
		case BgPackage.RELATIVE_POSITION__XCHANGE:
			return xchange != XCHANGE_EDEFAULT;
		case BgPackage.RELATIVE_POSITION__YCHANGE:
			return ychange != YCHANGE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Xchange: ");
		result.append(xchange);
		result.append(", Ychange: ");
		result.append(ychange);
		result.append(')');
		return result.toString();
	}

} //RelativePositionImpl
