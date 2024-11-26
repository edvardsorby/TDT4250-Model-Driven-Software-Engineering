/**
 */
package no.ntnu.tdt4250.group07.bg.impl;

import no.ntnu.tdt4250.group07.bg.BgPackage;
import no.ntnu.tdt4250.group07.bg.Cell;
import no.ntnu.tdt4250.group07.bg.CellType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.CellImpl#getXposition <em>Xposition</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.CellImpl#getYposition <em>Yposition</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.CellImpl#getCelltype <em>Celltype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CellImpl extends MinimalEObjectImpl.Container implements Cell {
	/**
	 * The default value of the '{@link #getXposition() <em>Xposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXposition()
	 * @generated
	 * @ordered
	 */
	protected static final int XPOSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getXposition() <em>Xposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXposition()
	 * @generated
	 * @ordered
	 */
	protected int xposition = XPOSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getYposition() <em>Yposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYposition()
	 * @generated
	 * @ordered
	 */
	protected static final int YPOSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYposition() <em>Yposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYposition()
	 * @generated
	 * @ordered
	 */
	protected int yposition = YPOSITION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BgPackage.Literals.CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getXposition() {
		return xposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXposition(int newXposition) {
		int oldXposition = xposition;
		xposition = newXposition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.CELL__XPOSITION, oldXposition, xposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getYposition() {
		return yposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYposition(int newYposition) {
		int oldYposition = yposition;
		yposition = newYposition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.CELL__YPOSITION, oldYposition, yposition));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BgPackage.CELL__CELLTYPE, oldCelltype,
							celltype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.CELL__CELLTYPE, oldCelltype, celltype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BgPackage.CELL__XPOSITION:
			return getXposition();
		case BgPackage.CELL__YPOSITION:
			return getYposition();
		case BgPackage.CELL__CELLTYPE:
			if (resolve)
				return getCelltype();
			return basicGetCelltype();
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
		case BgPackage.CELL__XPOSITION:
			setXposition((Integer) newValue);
			return;
		case BgPackage.CELL__YPOSITION:
			setYposition((Integer) newValue);
			return;
		case BgPackage.CELL__CELLTYPE:
			setCelltype((CellType) newValue);
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
		case BgPackage.CELL__XPOSITION:
			setXposition(XPOSITION_EDEFAULT);
			return;
		case BgPackage.CELL__YPOSITION:
			setYposition(YPOSITION_EDEFAULT);
			return;
		case BgPackage.CELL__CELLTYPE:
			setCelltype((CellType) null);
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
		case BgPackage.CELL__XPOSITION:
			return xposition != XPOSITION_EDEFAULT;
		case BgPackage.CELL__YPOSITION:
			return yposition != YPOSITION_EDEFAULT;
		case BgPackage.CELL__CELLTYPE:
			return celltype != null;
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
		result.append(" (Xposition: ");
		result.append(xposition);
		result.append(", Yposition: ");
		result.append(yposition);
		result.append(')');
		return result.toString();
	}

} //CellImpl
