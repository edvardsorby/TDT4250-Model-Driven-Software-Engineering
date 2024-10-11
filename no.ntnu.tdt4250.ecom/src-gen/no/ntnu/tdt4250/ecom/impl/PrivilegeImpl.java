/**
 */
package no.ntnu.tdt4250.ecom.impl;

import no.ntnu.tdt4250.ecom.EcomPackage;
import no.ntnu.tdt4250.ecom.Privilege;
import no.ntnu.tdt4250.ecom.PrivilegeType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Privilege</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.ecom.impl.PrivilegeImpl#getPrivilege <em>Privilege</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrivilegeImpl extends MinimalEObjectImpl.Container implements Privilege {
	/**
	 * The default value of the '{@link #getPrivilege() <em>Privilege</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivilege()
	 * @generated
	 * @ordered
	 */
	protected static final PrivilegeType PRIVILEGE_EDEFAULT = PrivilegeType.POST_ITEMS;

	/**
	 * The cached value of the '{@link #getPrivilege() <em>Privilege</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivilege()
	 * @generated
	 * @ordered
	 */
	protected PrivilegeType privilege = PRIVILEGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivilegeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcomPackage.Literals.PRIVILEGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivilegeType getPrivilege() {
		return privilege;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivilege(PrivilegeType newPrivilege) {
		PrivilegeType oldPrivilege = privilege;
		privilege = newPrivilege == null ? PRIVILEGE_EDEFAULT : newPrivilege;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcomPackage.PRIVILEGE__PRIVILEGE, oldPrivilege,
					privilege));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EcomPackage.PRIVILEGE__PRIVILEGE:
			return getPrivilege();
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
		case EcomPackage.PRIVILEGE__PRIVILEGE:
			setPrivilege((PrivilegeType) newValue);
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
		case EcomPackage.PRIVILEGE__PRIVILEGE:
			setPrivilege(PRIVILEGE_EDEFAULT);
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
		case EcomPackage.PRIVILEGE__PRIVILEGE:
			return privilege != PRIVILEGE_EDEFAULT;
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
		result.append(" (privilege: ");
		result.append(privilege);
		result.append(')');
		return result.toString();
	}

} //PrivilegeImpl
