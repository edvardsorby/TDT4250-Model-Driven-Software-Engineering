/**
 */
package no.ntnu.tdt4250.ecom.impl;

import java.util.Collection;

import no.ntnu.tdt4250.ecom.EcomPackage;
import no.ntnu.tdt4250.ecom.NormalUser;
import no.ntnu.tdt4250.ecom.Privilege;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.ecom.impl.NormalUserImpl#getPrivileges <em>Privileges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalUserImpl extends RoleImpl implements NormalUser {
	/**
	 * The cached value of the '{@link #getPrivileges() <em>Privileges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivileges()
	 * @generated
	 * @ordered
	 */
	protected EList<Privilege> privileges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalUserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcomPackage.Literals.NORMAL_USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Privilege> getPrivileges() {
		if (privileges == null) {
			privileges = new EObjectContainmentEList<Privilege>(Privilege.class, this,
					EcomPackage.NORMAL_USER__PRIVILEGES);
		}
		return privileges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcomPackage.NORMAL_USER__PRIVILEGES:
			return ((InternalEList<?>) getPrivileges()).basicRemove(otherEnd, msgs);
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
		case EcomPackage.NORMAL_USER__PRIVILEGES:
			return getPrivileges();
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
		case EcomPackage.NORMAL_USER__PRIVILEGES:
			getPrivileges().clear();
			getPrivileges().addAll((Collection<? extends Privilege>) newValue);
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
		case EcomPackage.NORMAL_USER__PRIVILEGES:
			getPrivileges().clear();
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
		case EcomPackage.NORMAL_USER__PRIVILEGES:
			return privileges != null && !privileges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NormalUserImpl
