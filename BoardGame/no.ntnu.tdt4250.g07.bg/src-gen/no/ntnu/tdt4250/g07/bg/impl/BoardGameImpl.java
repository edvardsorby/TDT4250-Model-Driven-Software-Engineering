/**
 */
package no.ntnu.tdt4250.g07.bg.impl;

import java.util.Collection;

import no.ntnu.tdt4250.g07.bg.BgPackage;
import no.ntnu.tdt4250.g07.bg.BoardGame;
import no.ntnu.tdt4250.g07.bg.BoardGameElement;
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
 *   <li>{@link no.ntnu.tdt4250.g07.bg.impl.BoardGameImpl#getSize <em>Size</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.impl.BoardGameImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.impl.BoardGameImpl#getBoardgameelements <em>Boardgameelements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoardGameImpl extends MinimalEObjectImpl.Container implements BoardGame {
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
	 * The cached value of the '{@link #getBoardgameelements() <em>Boardgameelements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardgameelements()
	 * @generated
	 * @ordered
	 */
	protected EList<BoardGameElement> boardgameelements;

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
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.BOARD_GAME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoardGameElement> getBoardgameelements() {
		if (boardgameelements == null) {
			boardgameelements = new EObjectContainmentEList<BoardGameElement>(BoardGameElement.class, this,
					BgPackage.BOARD_GAME__BOARDGAMEELEMENTS);
		}
		return boardgameelements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BgPackage.BOARD_GAME__BOARDGAMEELEMENTS:
			return ((InternalEList<?>) getBoardgameelements()).basicRemove(otherEnd, msgs);
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
		case BgPackage.BOARD_GAME__SIZE:
			return getSize();
		case BgPackage.BOARD_GAME__NAME:
			return getName();
		case BgPackage.BOARD_GAME__BOARDGAMEELEMENTS:
			return getBoardgameelements();
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
		case BgPackage.BOARD_GAME__SIZE:
			setSize((Integer) newValue);
			return;
		case BgPackage.BOARD_GAME__NAME:
			setName((String) newValue);
			return;
		case BgPackage.BOARD_GAME__BOARDGAMEELEMENTS:
			getBoardgameelements().clear();
			getBoardgameelements().addAll((Collection<? extends BoardGameElement>) newValue);
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
		case BgPackage.BOARD_GAME__SIZE:
			setSize(SIZE_EDEFAULT);
			return;
		case BgPackage.BOARD_GAME__NAME:
			setName(NAME_EDEFAULT);
			return;
		case BgPackage.BOARD_GAME__BOARDGAMEELEMENTS:
			getBoardgameelements().clear();
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
		case BgPackage.BOARD_GAME__SIZE:
			return size != SIZE_EDEFAULT;
		case BgPackage.BOARD_GAME__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case BgPackage.BOARD_GAME__BOARDGAMEELEMENTS:
			return boardgameelements != null && !boardgameelements.isEmpty();
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //BoardGameImpl
