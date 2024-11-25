/**
 */
package no.ntnu.tdt4250.group07.bg.impl;

import java.util.Collection;

import no.ntnu.tdt4250.group07.bg.BgPackage;
import no.ntnu.tdt4250.group07.bg.Brick;
import no.ntnu.tdt4250.group07.bg.Outcome;
import no.ntnu.tdt4250.group07.bg.PlayerBrickSet;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player Brick Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.PlayerBrickSetImpl#getBrick <em>Brick</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.PlayerBrickSetImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.PlayerBrickSetImpl#getWin <em>Win</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.PlayerBrickSetImpl#getDraw <em>Draw</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayerBrickSetImpl extends MinimalEObjectImpl.Container implements PlayerBrickSet {
	/**
	 * The cached value of the '{@link #getBrick() <em>Brick</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrick()
	 * @generated
	 * @ordered
	 */
	protected EList<Brick> brick;

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
	 * The cached value of the '{@link #getWin() <em>Win</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWin()
	 * @generated
	 * @ordered
	 */
	protected EList<Outcome> win;

	/**
	 * The cached value of the '{@link #getDraw() <em>Draw</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDraw()
	 * @generated
	 * @ordered
	 */
	protected Outcome draw;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerBrickSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BgPackage.Literals.PLAYER_BRICK_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Brick> getBrick() {
		if (brick == null) {
			brick = new EObjectResolvingEList<Brick>(Brick.class, this, BgPackage.PLAYER_BRICK_SET__BRICK);
		}
		return brick;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.PLAYER_BRICK_SET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Outcome> getWin() {
		if (win == null) {
			win = new EObjectResolvingEList<Outcome>(Outcome.class, this, BgPackage.PLAYER_BRICK_SET__WIN);
		}
		return win;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Outcome getDraw() {
		if (draw != null && draw.eIsProxy()) {
			InternalEObject oldDraw = (InternalEObject) draw;
			draw = (Outcome) eResolveProxy(oldDraw);
			if (draw != oldDraw) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BgPackage.PLAYER_BRICK_SET__DRAW, oldDraw,
							draw));
			}
		}
		return draw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Outcome basicGetDraw() {
		return draw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDraw(Outcome newDraw) {
		Outcome oldDraw = draw;
		draw = newDraw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.PLAYER_BRICK_SET__DRAW, oldDraw, draw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BgPackage.PLAYER_BRICK_SET__BRICK:
			return getBrick();
		case BgPackage.PLAYER_BRICK_SET__NAME:
			return getName();
		case BgPackage.PLAYER_BRICK_SET__WIN:
			return getWin();
		case BgPackage.PLAYER_BRICK_SET__DRAW:
			if (resolve)
				return getDraw();
			return basicGetDraw();
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
		case BgPackage.PLAYER_BRICK_SET__BRICK:
			getBrick().clear();
			getBrick().addAll((Collection<? extends Brick>) newValue);
			return;
		case BgPackage.PLAYER_BRICK_SET__NAME:
			setName((String) newValue);
			return;
		case BgPackage.PLAYER_BRICK_SET__WIN:
			getWin().clear();
			getWin().addAll((Collection<? extends Outcome>) newValue);
			return;
		case BgPackage.PLAYER_BRICK_SET__DRAW:
			setDraw((Outcome) newValue);
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
		case BgPackage.PLAYER_BRICK_SET__BRICK:
			getBrick().clear();
			return;
		case BgPackage.PLAYER_BRICK_SET__NAME:
			setName(NAME_EDEFAULT);
			return;
		case BgPackage.PLAYER_BRICK_SET__WIN:
			getWin().clear();
			return;
		case BgPackage.PLAYER_BRICK_SET__DRAW:
			setDraw((Outcome) null);
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
		case BgPackage.PLAYER_BRICK_SET__BRICK:
			return brick != null && !brick.isEmpty();
		case BgPackage.PLAYER_BRICK_SET__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case BgPackage.PLAYER_BRICK_SET__WIN:
			return win != null && !win.isEmpty();
		case BgPackage.PLAYER_BRICK_SET__DRAW:
			return draw != null;
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

} //PlayerBrickSetImpl
