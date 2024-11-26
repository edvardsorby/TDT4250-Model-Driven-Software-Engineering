/**
 */
package no.ntnu.tdt4250.group07.bg.impl;

import java.util.Collection;

import no.ntnu.tdt4250.group07.bg.BgPackage;
import no.ntnu.tdt4250.group07.bg.BrickChange;
import no.ntnu.tdt4250.group07.bg.CellChange;
import no.ntnu.tdt4250.group07.bg.ValidMove;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Valid Move</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.ValidMoveImpl#getBrickchange <em>Brickchange</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.ValidMoveImpl#getCellchange <em>Cellchange</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.ValidMoveImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValidMoveImpl extends MinimalEObjectImpl.Container implements ValidMove {
	/**
	 * The cached value of the '{@link #getBrickchange() <em>Brickchange</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrickchange()
	 * @generated
	 * @ordered
	 */
	protected EList<BrickChange> brickchange;

	/**
	 * The cached value of the '{@link #getCellchange() <em>Cellchange</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellchange()
	 * @generated
	 * @ordered
	 */
	protected EList<CellChange> cellchange;

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
	public EList<BrickChange> getBrickchange() {
		if (brickchange == null) {
			brickchange = new EObjectResolvingEList<BrickChange>(BrickChange.class, this,
					BgPackage.VALID_MOVE__BRICKCHANGE);
		}
		return brickchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CellChange> getCellchange() {
		if (cellchange == null) {
			cellchange = new EObjectResolvingEList<CellChange>(CellChange.class, this,
					BgPackage.VALID_MOVE__CELLCHANGE);
		}
		return cellchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BgPackage.VALID_MOVE__BRICKCHANGE:
			return getBrickchange();
		case BgPackage.VALID_MOVE__CELLCHANGE:
			return getCellchange();
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
		case BgPackage.VALID_MOVE__BRICKCHANGE:
			getBrickchange().clear();
			getBrickchange().addAll((Collection<? extends BrickChange>) newValue);
			return;
		case BgPackage.VALID_MOVE__CELLCHANGE:
			getCellchange().clear();
			getCellchange().addAll((Collection<? extends CellChange>) newValue);
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
		case BgPackage.VALID_MOVE__BRICKCHANGE:
			getBrickchange().clear();
			return;
		case BgPackage.VALID_MOVE__CELLCHANGE:
			getCellchange().clear();
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
		case BgPackage.VALID_MOVE__BRICKCHANGE:
			return brickchange != null && !brickchange.isEmpty();
		case BgPackage.VALID_MOVE__CELLCHANGE:
			return cellchange != null && !cellchange.isEmpty();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ValidMoveImpl
