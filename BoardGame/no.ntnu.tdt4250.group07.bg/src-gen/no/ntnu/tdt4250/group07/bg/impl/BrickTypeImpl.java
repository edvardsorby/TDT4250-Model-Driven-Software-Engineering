/**
 */
package no.ntnu.tdt4250.group07.bg.impl;

import java.util.Collection;

import no.ntnu.tdt4250.group07.bg.BgPackage;
import no.ntnu.tdt4250.group07.bg.BrickState;
import no.ntnu.tdt4250.group07.bg.BrickType;
import no.ntnu.tdt4250.group07.bg.EffectOnCell;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Brick Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.BrickTypeImpl#getBrickstate <em>Brickstate</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.BrickTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.BrickTypeImpl#getEffectoncell <em>Effectoncell</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BrickTypeImpl extends MinimalEObjectImpl.Container implements BrickType {
	/**
	 * The cached value of the '{@link #getBrickstate() <em>Brickstate</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrickstate()
	 * @generated
	 * @ordered
	 */
	protected EList<BrickState> brickstate;

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
	 * The cached value of the '{@link #getEffectoncell() <em>Effectoncell</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectoncell()
	 * @generated
	 * @ordered
	 */
	protected EList<EffectOnCell> effectoncell;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrickTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BgPackage.Literals.BRICK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BrickState> getBrickstate() {
		if (brickstate == null) {
			brickstate = new EObjectResolvingEList<BrickState>(BrickState.class, this,
					BgPackage.BRICK_TYPE__BRICKSTATE);
		}
		return brickstate;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.BRICK_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EffectOnCell> getEffectoncell() {
		if (effectoncell == null) {
			effectoncell = new EObjectResolvingEList<EffectOnCell>(EffectOnCell.class, this,
					BgPackage.BRICK_TYPE__EFFECTONCELL);
		}
		return effectoncell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BgPackage.BRICK_TYPE__BRICKSTATE:
			return getBrickstate();
		case BgPackage.BRICK_TYPE__NAME:
			return getName();
		case BgPackage.BRICK_TYPE__EFFECTONCELL:
			return getEffectoncell();
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
		case BgPackage.BRICK_TYPE__BRICKSTATE:
			getBrickstate().clear();
			getBrickstate().addAll((Collection<? extends BrickState>) newValue);
			return;
		case BgPackage.BRICK_TYPE__NAME:
			setName((String) newValue);
			return;
		case BgPackage.BRICK_TYPE__EFFECTONCELL:
			getEffectoncell().clear();
			getEffectoncell().addAll((Collection<? extends EffectOnCell>) newValue);
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
		case BgPackage.BRICK_TYPE__BRICKSTATE:
			getBrickstate().clear();
			return;
		case BgPackage.BRICK_TYPE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case BgPackage.BRICK_TYPE__EFFECTONCELL:
			getEffectoncell().clear();
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
		case BgPackage.BRICK_TYPE__BRICKSTATE:
			return brickstate != null && !brickstate.isEmpty();
		case BgPackage.BRICK_TYPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case BgPackage.BRICK_TYPE__EFFECTONCELL:
			return effectoncell != null && !effectoncell.isEmpty();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //BrickTypeImpl
