/**
 */
package no.ntnu.tdt4250.group07.bg.impl;

import java.util.Collection;
import no.ntnu.tdt4250.group07.bg.BgPackage;
import no.ntnu.tdt4250.group07.bg.CellState;
import no.ntnu.tdt4250.group07.bg.EffectOnCell;
import no.ntnu.tdt4250.group07.bg.RelativePosition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effect On Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.EffectOnCellImpl#getRelativeposition <em>Relativeposition</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.EffectOnCellImpl#getCellstate <em>Cellstate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EffectOnCellImpl extends MinimalEObjectImpl.Container implements EffectOnCell {
	/**
	 * The cached value of the '{@link #getRelativeposition() <em>Relativeposition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeposition()
	 * @generated
	 * @ordered
	 */
	protected EList<RelativePosition> relativeposition;

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
	public EList<RelativePosition> getRelativeposition() {
		if (relativeposition == null) {
			relativeposition = new EObjectResolvingEList<RelativePosition>(RelativePosition.class, this,
					BgPackage.EFFECT_ON_CELL__RELATIVEPOSITION);
		}
		return relativeposition;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BgPackage.EFFECT_ON_CELL__CELLSTATE,
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
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.EFFECT_ON_CELL__CELLSTATE, oldCellstate,
					cellstate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BgPackage.EFFECT_ON_CELL__RELATIVEPOSITION:
			return getRelativeposition();
		case BgPackage.EFFECT_ON_CELL__CELLSTATE:
			if (resolve)
				return getCellstate();
			return basicGetCellstate();
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
		case BgPackage.EFFECT_ON_CELL__RELATIVEPOSITION:
			getRelativeposition().clear();
			getRelativeposition().addAll((Collection<? extends RelativePosition>) newValue);
			return;
		case BgPackage.EFFECT_ON_CELL__CELLSTATE:
			setCellstate((CellState) newValue);
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
		case BgPackage.EFFECT_ON_CELL__RELATIVEPOSITION:
			getRelativeposition().clear();
			return;
		case BgPackage.EFFECT_ON_CELL__CELLSTATE:
			setCellstate((CellState) null);
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
		case BgPackage.EFFECT_ON_CELL__RELATIVEPOSITION:
			return relativeposition != null && !relativeposition.isEmpty();
		case BgPackage.EFFECT_ON_CELL__CELLSTATE:
			return cellstate != null;
		}
		return super.eIsSet(featureID);
	}

} //EffectOnCellImpl
