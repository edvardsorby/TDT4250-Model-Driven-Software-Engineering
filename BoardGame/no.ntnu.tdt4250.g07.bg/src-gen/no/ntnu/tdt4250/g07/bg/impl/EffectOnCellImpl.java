/**
 */
package no.ntnu.tdt4250.g07.bg.impl;

import no.ntnu.tdt4250.g07.bg.BgPackage;
import no.ntnu.tdt4250.g07.bg.CellState;
import no.ntnu.tdt4250.g07.bg.EffectOnCell;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effect On Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.impl.EffectOnCellImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.impl.EffectOnCellImpl#getCellState <em>Cell State</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.impl.EffectOnCellImpl#getX <em>X</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.impl.EffectOnCellImpl#getY <em>Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EffectOnCellImpl extends BoardGameElementImpl implements EffectOnCell {
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
	 * The cached value of the '{@link #getCellState() <em>Cell State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellState()
	 * @generated
	 * @ordered
	 */
	protected CellState cellState;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final int X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected int x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final int Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected int y = Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EffectOnCellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BgPackage.Literals.EFFECT_ON_CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CellState getCellState() {
		if (cellState != null && cellState.eIsProxy()) {
			InternalEObject oldCellState = (InternalEObject) cellState;
			cellState = (CellState) eResolveProxy(oldCellState);
			if (cellState != oldCellState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BgPackage.EFFECT_ON_CELL__CELL_STATE,
							oldCellState, cellState));
			}
		}
		return cellState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellState basicGetCellState() {
		return cellState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCellState(CellState newCellState) {
		CellState oldCellState = cellState;
		cellState = newCellState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.EFFECT_ON_CELL__CELL_STATE, oldCellState,
					cellState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX(int newX) {
		int oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.EFFECT_ON_CELL__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setY(int newY) {
		int oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.EFFECT_ON_CELL__Y, oldY, y));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.EFFECT_ON_CELL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BgPackage.EFFECT_ON_CELL__NAME:
			return getName();
		case BgPackage.EFFECT_ON_CELL__CELL_STATE:
			if (resolve)
				return getCellState();
			return basicGetCellState();
		case BgPackage.EFFECT_ON_CELL__X:
			return getX();
		case BgPackage.EFFECT_ON_CELL__Y:
			return getY();
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
		case BgPackage.EFFECT_ON_CELL__NAME:
			setName((String) newValue);
			return;
		case BgPackage.EFFECT_ON_CELL__CELL_STATE:
			setCellState((CellState) newValue);
			return;
		case BgPackage.EFFECT_ON_CELL__X:
			setX((Integer) newValue);
			return;
		case BgPackage.EFFECT_ON_CELL__Y:
			setY((Integer) newValue);
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
		case BgPackage.EFFECT_ON_CELL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case BgPackage.EFFECT_ON_CELL__CELL_STATE:
			setCellState((CellState) null);
			return;
		case BgPackage.EFFECT_ON_CELL__X:
			setX(X_EDEFAULT);
			return;
		case BgPackage.EFFECT_ON_CELL__Y:
			setY(Y_EDEFAULT);
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
		case BgPackage.EFFECT_ON_CELL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case BgPackage.EFFECT_ON_CELL__CELL_STATE:
			return cellState != null;
		case BgPackage.EFFECT_ON_CELL__X:
			return x != X_EDEFAULT;
		case BgPackage.EFFECT_ON_CELL__Y:
			return y != Y_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(')');
		return result.toString();
	}

} //EffectOnCellImpl
