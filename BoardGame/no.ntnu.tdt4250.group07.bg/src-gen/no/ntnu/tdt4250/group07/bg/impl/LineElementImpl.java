/**
 */
package no.ntnu.tdt4250.group07.bg.impl;

import no.ntnu.tdt4250.group07.bg.BgPackage;
import no.ntnu.tdt4250.group07.bg.BrickState;
import no.ntnu.tdt4250.group07.bg.BrickType;
import no.ntnu.tdt4250.group07.bg.CellState;
import no.ntnu.tdt4250.group07.bg.CellType;
import no.ntnu.tdt4250.group07.bg.LineElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.LineElementImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.LineElementImpl#getCelltype <em>Celltype</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.LineElementImpl#getCellstate <em>Cellstate</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.LineElementImpl#getBrickstate <em>Brickstate</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.LineElementImpl#getBricktype <em>Bricktype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineElementImpl extends MinimalEObjectImpl.Container implements LineElement {
	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int POSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected int position = POSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCelltype() <em>Celltype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCelltype()
	 * @generated
	 * @ordered
	 */
	protected CellType celltype;

	/**
	 * The cached value of the '{@link #getCellstate() <em>Cellstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellstate()
	 * @generated
	 * @ordered
	 */
	protected CellState cellstate;

	/**
	 * The cached value of the '{@link #getBrickstate() <em>Brickstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrickstate()
	 * @generated
	 * @ordered
	 */
	protected BrickState brickstate;

	/**
	 * The cached value of the '{@link #getBricktype() <em>Bricktype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBricktype()
	 * @generated
	 * @ordered
	 */
	protected BrickType bricktype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BgPackage.Literals.LINE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosition(int newPosition) {
		int oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.LINE_ELEMENT__POSITION, oldPosition,
					position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CellType getCelltype() {
		if (celltype != null && celltype.eIsProxy()) {
			InternalEObject oldCelltype = (InternalEObject) celltype;
			celltype = (CellType) eResolveProxy(oldCelltype);
			if (celltype != oldCelltype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BgPackage.LINE_ELEMENT__CELLTYPE,
							oldCelltype, celltype));
			}
		}
		return celltype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellType basicGetCelltype() {
		return celltype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCelltype(CellType newCelltype) {
		CellType oldCelltype = celltype;
		celltype = newCelltype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.LINE_ELEMENT__CELLTYPE, oldCelltype,
					celltype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CellState getCellstate() {
		if (cellstate != null && cellstate.eIsProxy()) {
			InternalEObject oldCellstate = (InternalEObject) cellstate;
			cellstate = (CellState) eResolveProxy(oldCellstate);
			if (cellstate != oldCellstate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BgPackage.LINE_ELEMENT__CELLSTATE,
							oldCellstate, cellstate));
			}
		}
		return cellstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellState basicGetCellstate() {
		return cellstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCellstate(CellState newCellstate) {
		CellState oldCellstate = cellstate;
		cellstate = newCellstate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.LINE_ELEMENT__CELLSTATE, oldCellstate,
					cellstate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BrickState getBrickstate() {
		if (brickstate != null && brickstate.eIsProxy()) {
			InternalEObject oldBrickstate = (InternalEObject) brickstate;
			brickstate = (BrickState) eResolveProxy(oldBrickstate);
			if (brickstate != oldBrickstate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BgPackage.LINE_ELEMENT__BRICKSTATE,
							oldBrickstate, brickstate));
			}
		}
		return brickstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrickState basicGetBrickstate() {
		return brickstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBrickstate(BrickState newBrickstate) {
		BrickState oldBrickstate = brickstate;
		brickstate = newBrickstate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.LINE_ELEMENT__BRICKSTATE, oldBrickstate,
					brickstate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BrickType getBricktype() {
		if (bricktype != null && bricktype.eIsProxy()) {
			InternalEObject oldBricktype = (InternalEObject) bricktype;
			bricktype = (BrickType) eResolveProxy(oldBricktype);
			if (bricktype != oldBricktype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BgPackage.LINE_ELEMENT__BRICKTYPE,
							oldBricktype, bricktype));
			}
		}
		return bricktype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrickType basicGetBricktype() {
		return bricktype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBricktype(BrickType newBricktype) {
		BrickType oldBricktype = bricktype;
		bricktype = newBricktype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.LINE_ELEMENT__BRICKTYPE, oldBricktype,
					bricktype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BgPackage.LINE_ELEMENT__POSITION:
			return getPosition();
		case BgPackage.LINE_ELEMENT__CELLTYPE:
			if (resolve)
				return getCelltype();
			return basicGetCelltype();
		case BgPackage.LINE_ELEMENT__CELLSTATE:
			if (resolve)
				return getCellstate();
			return basicGetCellstate();
		case BgPackage.LINE_ELEMENT__BRICKSTATE:
			if (resolve)
				return getBrickstate();
			return basicGetBrickstate();
		case BgPackage.LINE_ELEMENT__BRICKTYPE:
			if (resolve)
				return getBricktype();
			return basicGetBricktype();
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
		case BgPackage.LINE_ELEMENT__POSITION:
			setPosition((Integer) newValue);
			return;
		case BgPackage.LINE_ELEMENT__CELLTYPE:
			setCelltype((CellType) newValue);
			return;
		case BgPackage.LINE_ELEMENT__CELLSTATE:
			setCellstate((CellState) newValue);
			return;
		case BgPackage.LINE_ELEMENT__BRICKSTATE:
			setBrickstate((BrickState) newValue);
			return;
		case BgPackage.LINE_ELEMENT__BRICKTYPE:
			setBricktype((BrickType) newValue);
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
		case BgPackage.LINE_ELEMENT__POSITION:
			setPosition(POSITION_EDEFAULT);
			return;
		case BgPackage.LINE_ELEMENT__CELLTYPE:
			setCelltype((CellType) null);
			return;
		case BgPackage.LINE_ELEMENT__CELLSTATE:
			setCellstate((CellState) null);
			return;
		case BgPackage.LINE_ELEMENT__BRICKSTATE:
			setBrickstate((BrickState) null);
			return;
		case BgPackage.LINE_ELEMENT__BRICKTYPE:
			setBricktype((BrickType) null);
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
		case BgPackage.LINE_ELEMENT__POSITION:
			return position != POSITION_EDEFAULT;
		case BgPackage.LINE_ELEMENT__CELLTYPE:
			return celltype != null;
		case BgPackage.LINE_ELEMENT__CELLSTATE:
			return cellstate != null;
		case BgPackage.LINE_ELEMENT__BRICKSTATE:
			return brickstate != null;
		case BgPackage.LINE_ELEMENT__BRICKTYPE:
			return bricktype != null;
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
		result.append(" (Position: ");
		result.append(position);
		result.append(')');
		return result.toString();
	}

} //LineElementImpl
