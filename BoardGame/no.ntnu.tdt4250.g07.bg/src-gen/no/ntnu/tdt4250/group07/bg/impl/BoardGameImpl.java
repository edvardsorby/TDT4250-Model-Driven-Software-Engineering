/**
 */
package no.ntnu.tdt4250.group07.bg.impl;

import java.util.Collection;

import no.ntnu.tdt4250.group07.bg.BgPackage;
import no.ntnu.tdt4250.group07.bg.BoardGame;
import no.ntnu.tdt4250.group07.bg.CellState;
import no.ntnu.tdt4250.group07.bg.PieceType;
import no.ntnu.tdt4250.group07.bg.WinCondition;

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
 * An implementation of the model object '<em><b>Board Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.BoardGameImpl#getPiecetypes <em>Piecetypes</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.BoardGameImpl#getCellstates <em>Cellstates</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.BoardGameImpl#getWinConditions <em>Win Conditions</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.BoardGameImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoardGameImpl extends MinimalEObjectImpl.Container implements BoardGame {
	/**
	 * The cached value of the '{@link #getPiecetypes() <em>Piecetypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPiecetypes()
	 * @generated
	 * @ordered
	 */
	protected EList<PieceType> piecetypes;

	/**
	 * The cached value of the '{@link #getCellstates() <em>Cellstates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellstates()
	 * @generated
	 * @ordered
	 */
	protected EList<CellState> cellstates;

	/**
	 * The cached value of the '{@link #getWinConditions() <em>Win Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<WinCondition> winConditions;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoardGameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BgPackage.Literals.BOARD_GAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PieceType> getPiecetypes() {
		if (piecetypes == null) {
			piecetypes = new EObjectContainmentEList<PieceType>(PieceType.class, this,
					BgPackage.BOARD_GAME__PIECETYPES);
		}
		return piecetypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CellState> getCellstates() {
		if (cellstates == null) {
			cellstates = new EObjectContainmentEList<CellState>(CellState.class, this,
					BgPackage.BOARD_GAME__CELLSTATES);
		}
		return cellstates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WinCondition> getWinConditions() {
		if (winConditions == null) {
			winConditions = new EObjectContainmentEList<WinCondition>(WinCondition.class, this,
					BgPackage.BOARD_GAME__WIN_CONDITIONS);
		}
		return winConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.BOARD_GAME__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BgPackage.BOARD_GAME__PIECETYPES:
			return ((InternalEList<?>) getPiecetypes()).basicRemove(otherEnd, msgs);
		case BgPackage.BOARD_GAME__CELLSTATES:
			return ((InternalEList<?>) getCellstates()).basicRemove(otherEnd, msgs);
		case BgPackage.BOARD_GAME__WIN_CONDITIONS:
			return ((InternalEList<?>) getWinConditions()).basicRemove(otherEnd, msgs);
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
		case BgPackage.BOARD_GAME__PIECETYPES:
			return getPiecetypes();
		case BgPackage.BOARD_GAME__CELLSTATES:
			return getCellstates();
		case BgPackage.BOARD_GAME__WIN_CONDITIONS:
			return getWinConditions();
		case BgPackage.BOARD_GAME__SIZE:
			return getSize();
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
		case BgPackage.BOARD_GAME__PIECETYPES:
			getPiecetypes().clear();
			getPiecetypes().addAll((Collection<? extends PieceType>) newValue);
			return;
		case BgPackage.BOARD_GAME__CELLSTATES:
			getCellstates().clear();
			getCellstates().addAll((Collection<? extends CellState>) newValue);
			return;
		case BgPackage.BOARD_GAME__WIN_CONDITIONS:
			getWinConditions().clear();
			getWinConditions().addAll((Collection<? extends WinCondition>) newValue);
			return;
		case BgPackage.BOARD_GAME__SIZE:
			setSize((Integer) newValue);
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
		case BgPackage.BOARD_GAME__PIECETYPES:
			getPiecetypes().clear();
			return;
		case BgPackage.BOARD_GAME__CELLSTATES:
			getCellstates().clear();
			return;
		case BgPackage.BOARD_GAME__WIN_CONDITIONS:
			getWinConditions().clear();
			return;
		case BgPackage.BOARD_GAME__SIZE:
			setSize(SIZE_EDEFAULT);
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
		case BgPackage.BOARD_GAME__PIECETYPES:
			return piecetypes != null && !piecetypes.isEmpty();
		case BgPackage.BOARD_GAME__CELLSTATES:
			return cellstates != null && !cellstates.isEmpty();
		case BgPackage.BOARD_GAME__WIN_CONDITIONS:
			return winConditions != null && !winConditions.isEmpty();
		case BgPackage.BOARD_GAME__SIZE:
			return size != SIZE_EDEFAULT;
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
		result.append(" (size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //BoardGameImpl
