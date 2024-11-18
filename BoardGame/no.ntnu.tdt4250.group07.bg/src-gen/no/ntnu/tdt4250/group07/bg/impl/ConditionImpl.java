/**
 */
package no.ntnu.tdt4250.group07.bg.impl;

import java.util.Collection;

import no.ntnu.tdt4250.group07.bg.BgPackage;
import no.ntnu.tdt4250.group07.bg.BoardState;
import no.ntnu.tdt4250.group07.bg.BrickState;
import no.ntnu.tdt4250.group07.bg.BrickType;
import no.ntnu.tdt4250.group07.bg.CellState;
import no.ntnu.tdt4250.group07.bg.CellType;
import no.ntnu.tdt4250.group07.bg.Condition;
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
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.ConditionImpl#getBoardstate <em>Boardstate</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.ConditionImpl#getRelativeposition <em>Relativeposition</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.ConditionImpl#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.ConditionImpl#isProhibited <em>Prohibited</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.ConditionImpl#getBricktype <em>Bricktype</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.ConditionImpl#getBrickstate <em>Brickstate</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.ConditionImpl#getCelltype <em>Celltype</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.ConditionImpl#getCellstate <em>Cellstate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends MinimalEObjectImpl.Container implements Condition {
	/**
	 * The cached value of the '{@link #getBoardstate() <em>Boardstate</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardstate()
	 * @generated
	 * @ordered
	 */
	protected EList<BoardState> boardstate;

	/**
	 * The cached value of the '{@link #getRelativeposition() <em>Relativeposition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeposition()
	 * @generated
	 * @ordered
	 */
	protected RelativePosition relativeposition;

	/**
	 * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean mandatory = MANDATORY_EDEFAULT;

	/**
	 * The default value of the '{@link #isProhibited() <em>Prohibited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProhibited()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROHIBITED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProhibited() <em>Prohibited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProhibited()
	 * @generated
	 * @ordered
	 */
	protected boolean prohibited = PROHIBITED_EDEFAULT;

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
	 * The cached value of the '{@link #getBrickstate() <em>Brickstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrickstate()
	 * @generated
	 * @ordered
	 */
	protected BrickState brickstate;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BgPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoardState> getBoardstate() {
		if (boardstate == null) {
			boardstate = new EObjectResolvingEList<BoardState>(BoardState.class, this, BgPackage.CONDITION__BOARDSTATE);
		}
		return boardstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelativePosition getRelativeposition() {
		if (relativeposition != null && relativeposition.eIsProxy()) {
			InternalEObject oldRelativeposition = (InternalEObject) relativeposition;
			relativeposition = (RelativePosition) eResolveProxy(oldRelativeposition);
			if (relativeposition != oldRelativeposition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BgPackage.CONDITION__RELATIVEPOSITION,
							oldRelativeposition, relativeposition));
			}
		}
		return relativeposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativePosition basicGetRelativeposition() {
		return relativeposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelativeposition(RelativePosition newRelativeposition) {
		RelativePosition oldRelativeposition = relativeposition;
		relativeposition = newRelativeposition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.CONDITION__RELATIVEPOSITION,
					oldRelativeposition, relativeposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMandatory() {
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMandatory(boolean newMandatory) {
		boolean oldMandatory = mandatory;
		mandatory = newMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.CONDITION__MANDATORY, oldMandatory,
					mandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isProhibited() {
		return prohibited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProhibited(boolean newProhibited) {
		boolean oldProhibited = prohibited;
		prohibited = newProhibited;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.CONDITION__PROHIBITED, oldProhibited,
					prohibited));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BgPackage.CONDITION__BRICKTYPE,
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
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.CONDITION__BRICKTYPE, oldBricktype,
					bricktype));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BgPackage.CONDITION__BRICKSTATE,
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
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.CONDITION__BRICKSTATE, oldBrickstate,
					brickstate));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BgPackage.CONDITION__CELLTYPE,
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
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.CONDITION__CELLTYPE, oldCelltype,
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BgPackage.CONDITION__CELLSTATE,
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
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.CONDITION__CELLSTATE, oldCellstate,
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
		case BgPackage.CONDITION__BOARDSTATE:
			return getBoardstate();
		case BgPackage.CONDITION__RELATIVEPOSITION:
			if (resolve)
				return getRelativeposition();
			return basicGetRelativeposition();
		case BgPackage.CONDITION__MANDATORY:
			return isMandatory();
		case BgPackage.CONDITION__PROHIBITED:
			return isProhibited();
		case BgPackage.CONDITION__BRICKTYPE:
			if (resolve)
				return getBricktype();
			return basicGetBricktype();
		case BgPackage.CONDITION__BRICKSTATE:
			if (resolve)
				return getBrickstate();
			return basicGetBrickstate();
		case BgPackage.CONDITION__CELLTYPE:
			if (resolve)
				return getCelltype();
			return basicGetCelltype();
		case BgPackage.CONDITION__CELLSTATE:
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
		case BgPackage.CONDITION__BOARDSTATE:
			getBoardstate().clear();
			getBoardstate().addAll((Collection<? extends BoardState>) newValue);
			return;
		case BgPackage.CONDITION__RELATIVEPOSITION:
			setRelativeposition((RelativePosition) newValue);
			return;
		case BgPackage.CONDITION__MANDATORY:
			setMandatory((Boolean) newValue);
			return;
		case BgPackage.CONDITION__PROHIBITED:
			setProhibited((Boolean) newValue);
			return;
		case BgPackage.CONDITION__BRICKTYPE:
			setBricktype((BrickType) newValue);
			return;
		case BgPackage.CONDITION__BRICKSTATE:
			setBrickstate((BrickState) newValue);
			return;
		case BgPackage.CONDITION__CELLTYPE:
			setCelltype((CellType) newValue);
			return;
		case BgPackage.CONDITION__CELLSTATE:
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
		case BgPackage.CONDITION__BOARDSTATE:
			getBoardstate().clear();
			return;
		case BgPackage.CONDITION__RELATIVEPOSITION:
			setRelativeposition((RelativePosition) null);
			return;
		case BgPackage.CONDITION__MANDATORY:
			setMandatory(MANDATORY_EDEFAULT);
			return;
		case BgPackage.CONDITION__PROHIBITED:
			setProhibited(PROHIBITED_EDEFAULT);
			return;
		case BgPackage.CONDITION__BRICKTYPE:
			setBricktype((BrickType) null);
			return;
		case BgPackage.CONDITION__BRICKSTATE:
			setBrickstate((BrickState) null);
			return;
		case BgPackage.CONDITION__CELLTYPE:
			setCelltype((CellType) null);
			return;
		case BgPackage.CONDITION__CELLSTATE:
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
		case BgPackage.CONDITION__BOARDSTATE:
			return boardstate != null && !boardstate.isEmpty();
		case BgPackage.CONDITION__RELATIVEPOSITION:
			return relativeposition != null;
		case BgPackage.CONDITION__MANDATORY:
			return mandatory != MANDATORY_EDEFAULT;
		case BgPackage.CONDITION__PROHIBITED:
			return prohibited != PROHIBITED_EDEFAULT;
		case BgPackage.CONDITION__BRICKTYPE:
			return bricktype != null;
		case BgPackage.CONDITION__BRICKSTATE:
			return brickstate != null;
		case BgPackage.CONDITION__CELLTYPE:
			return celltype != null;
		case BgPackage.CONDITION__CELLSTATE:
			return cellstate != null;
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
		result.append(" (mandatory: ");
		result.append(mandatory);
		result.append(", prohibited: ");
		result.append(prohibited);
		result.append(')');
		return result.toString();
	}

} //ConditionImpl
