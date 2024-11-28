/**
 */
package no.ntnu.tdt4250.g07.bg.impl;

import java.util.Collection;

import no.ntnu.tdt4250.g07.bg.BgPackage;
import no.ntnu.tdt4250.g07.bg.Condition;
import no.ntnu.tdt4250.g07.bg.ValidMove;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Valid Move</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.impl.ValidMoveImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.impl.ValidMoveImpl#isPlaceAnywhere <em>Place Anywhere</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.impl.ValidMoveImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValidMoveImpl extends MinimalEObjectImpl.Container implements ValidMove {
	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> conditions;

	/**
	 * The default value of the '{@link #isPlaceAnywhere() <em>Place Anywhere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPlaceAnywhere()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PLACE_ANYWHERE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPlaceAnywhere() <em>Place Anywhere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPlaceAnywhere()
	 * @generated
	 * @ordered
	 */
	protected boolean placeAnywhere = PLACE_ANYWHERE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidMoveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BgPackage.Literals.VALID_MOVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Condition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<Condition>(Condition.class, this,
					BgPackage.VALID_MOVE__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPlaceAnywhere() {
		return placeAnywhere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlaceAnywhere(boolean newPlaceAnywhere) {
		boolean oldPlaceAnywhere = placeAnywhere;
		placeAnywhere = newPlaceAnywhere;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.VALID_MOVE__PLACE_ANYWHERE,
					oldPlaceAnywhere, placeAnywhere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.VALID_MOVE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BgPackage.VALID_MOVE__CONDITIONS:
			return ((InternalEList<?>) getConditions()).basicRemove(otherEnd, msgs);
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
		case BgPackage.VALID_MOVE__CONDITIONS:
			return getConditions();
		case BgPackage.VALID_MOVE__PLACE_ANYWHERE:
			return isPlaceAnywhere();
		case BgPackage.VALID_MOVE__NAME:
			return getName();
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
		case BgPackage.VALID_MOVE__CONDITIONS:
			getConditions().clear();
			getConditions().addAll((Collection<? extends Condition>) newValue);
			return;
		case BgPackage.VALID_MOVE__PLACE_ANYWHERE:
			setPlaceAnywhere((Boolean) newValue);
			return;
		case BgPackage.VALID_MOVE__NAME:
			setName((String) newValue);
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
		case BgPackage.VALID_MOVE__CONDITIONS:
			getConditions().clear();
			return;
		case BgPackage.VALID_MOVE__PLACE_ANYWHERE:
			setPlaceAnywhere(PLACE_ANYWHERE_EDEFAULT);
			return;
		case BgPackage.VALID_MOVE__NAME:
			setName(NAME_EDEFAULT);
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
		case BgPackage.VALID_MOVE__CONDITIONS:
			return conditions != null && !conditions.isEmpty();
		case BgPackage.VALID_MOVE__PLACE_ANYWHERE:
			return placeAnywhere != PLACE_ANYWHERE_EDEFAULT;
		case BgPackage.VALID_MOVE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (placeAnywhere: ");
		result.append(placeAnywhere);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ValidMoveImpl
