/**
 */
package no.ntnu.tdt4250.group07.bg.impl;

import java.util.Collection;

import no.ntnu.tdt4250.group07.bg.BgPackage;
import no.ntnu.tdt4250.group07.bg.EffectOnCell;
import no.ntnu.tdt4250.group07.bg.PieceType;
import no.ntnu.tdt4250.group07.bg.ValidMove;

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
 * An implementation of the model object '<em><b>Piece Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.PieceTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.PieceTypeImpl#getValidmove <em>Validmove</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.PieceTypeImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.PieceTypeImpl#getEffectoncell <em>Effectoncell</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PieceTypeImpl extends MinimalEObjectImpl.Container implements PieceType {
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
	 * The cached value of the '{@link #getValidmove() <em>Validmove</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidmove()
	 * @generated
	 * @ordered
	 */
	protected EList<ValidMove> validmove;

	/**
	 * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected String symbol = SYMBOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEffectoncell() <em>Effectoncell</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectoncell()
	 * @generated
	 * @ordered
	 */
	protected EList<EffectOnCell> effectoncell;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PieceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BgPackage.Literals.PIECE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.PIECE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValidMove> getValidmove() {
		if (validmove == null) {
			validmove = new EObjectContainmentEList<ValidMove>(ValidMove.class, this, BgPackage.PIECE_TYPE__VALIDMOVE);
		}
		return validmove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSymbol() {
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymbol(String newSymbol) {
		String oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.PIECE_TYPE__SYMBOL, oldSymbol, symbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EffectOnCell> getEffectoncell() {
		if (effectoncell == null) {
			effectoncell = new EObjectContainmentEList<EffectOnCell>(EffectOnCell.class, this,
					BgPackage.PIECE_TYPE__EFFECTONCELL);
		}
		return effectoncell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BgPackage.PIECE_TYPE__VALIDMOVE:
			return ((InternalEList<?>) getValidmove()).basicRemove(otherEnd, msgs);
		case BgPackage.PIECE_TYPE__EFFECTONCELL:
			return ((InternalEList<?>) getEffectoncell()).basicRemove(otherEnd, msgs);
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
		case BgPackage.PIECE_TYPE__NAME:
			return getName();
		case BgPackage.PIECE_TYPE__VALIDMOVE:
			return getValidmove();
		case BgPackage.PIECE_TYPE__SYMBOL:
			return getSymbol();
		case BgPackage.PIECE_TYPE__EFFECTONCELL:
			return getEffectoncell();
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
		case BgPackage.PIECE_TYPE__NAME:
			setName((String) newValue);
			return;
		case BgPackage.PIECE_TYPE__VALIDMOVE:
			getValidmove().clear();
			getValidmove().addAll((Collection<? extends ValidMove>) newValue);
			return;
		case BgPackage.PIECE_TYPE__SYMBOL:
			setSymbol((String) newValue);
			return;
		case BgPackage.PIECE_TYPE__EFFECTONCELL:
			getEffectoncell().clear();
			getEffectoncell().addAll((Collection<? extends EffectOnCell>) newValue);
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
		case BgPackage.PIECE_TYPE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case BgPackage.PIECE_TYPE__VALIDMOVE:
			getValidmove().clear();
			return;
		case BgPackage.PIECE_TYPE__SYMBOL:
			setSymbol(SYMBOL_EDEFAULT);
			return;
		case BgPackage.PIECE_TYPE__EFFECTONCELL:
			getEffectoncell().clear();
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
		case BgPackage.PIECE_TYPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case BgPackage.PIECE_TYPE__VALIDMOVE:
			return validmove != null && !validmove.isEmpty();
		case BgPackage.PIECE_TYPE__SYMBOL:
			return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
		case BgPackage.PIECE_TYPE__EFFECTONCELL:
			return effectoncell != null && !effectoncell.isEmpty();
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
		result.append(", symbol: ");
		result.append(symbol);
		result.append(')');
		return result.toString();
	}

} //PieceTypeImpl
