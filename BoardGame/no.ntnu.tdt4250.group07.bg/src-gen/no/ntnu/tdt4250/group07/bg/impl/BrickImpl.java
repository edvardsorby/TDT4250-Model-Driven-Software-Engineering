/**
 */
package no.ntnu.tdt4250.group07.bg.impl;

import no.ntnu.tdt4250.group07.bg.BgPackage;
import no.ntnu.tdt4250.group07.bg.Brick;
import no.ntnu.tdt4250.group07.bg.BrickType;
import no.ntnu.tdt4250.group07.bg.Cell;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Brick</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.BrickImpl#getBricktype <em>Bricktype</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.BrickImpl#getStartCell <em>Start Cell</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BrickImpl extends MinimalEObjectImpl.Container implements Brick {
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
	 * The cached value of the '{@link #getStartCell() <em>Start Cell</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartCell()
	 * @generated
	 * @ordered
	 */
	protected Cell startCell;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrickImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BgPackage.Literals.BRICK;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BgPackage.BRICK__BRICKTYPE, oldBricktype,
							bricktype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.BRICK__BRICKTYPE, oldBricktype, bricktype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cell getStartCell() {
		if (startCell != null && startCell.eIsProxy()) {
			InternalEObject oldStartCell = (InternalEObject) startCell;
			startCell = (Cell) eResolveProxy(oldStartCell);
			if (startCell != oldStartCell) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BgPackage.BRICK__START_CELL, oldStartCell,
							startCell));
			}
		}
		return startCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cell basicGetStartCell() {
		return startCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartCell(Cell newStartCell) {
		Cell oldStartCell = startCell;
		startCell = newStartCell;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.BRICK__START_CELL, oldStartCell,
					startCell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BgPackage.BRICK__BRICKTYPE:
			if (resolve)
				return getBricktype();
			return basicGetBricktype();
		case BgPackage.BRICK__START_CELL:
			if (resolve)
				return getStartCell();
			return basicGetStartCell();
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
		case BgPackage.BRICK__BRICKTYPE:
			setBricktype((BrickType) newValue);
			return;
		case BgPackage.BRICK__START_CELL:
			setStartCell((Cell) newValue);
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
		case BgPackage.BRICK__BRICKTYPE:
			setBricktype((BrickType) null);
			return;
		case BgPackage.BRICK__START_CELL:
			setStartCell((Cell) null);
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
		case BgPackage.BRICK__BRICKTYPE:
			return bricktype != null;
		case BgPackage.BRICK__START_CELL:
			return startCell != null;
		}
		return super.eIsSet(featureID);
	}

} //BrickImpl
