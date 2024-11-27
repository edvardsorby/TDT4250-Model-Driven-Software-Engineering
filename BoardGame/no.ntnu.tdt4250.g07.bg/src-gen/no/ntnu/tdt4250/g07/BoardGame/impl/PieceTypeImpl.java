/**
 */
package no.ntnu.tdt4250.g07.BoardGame.impl;

import java.util.Collection;

import no.ntnu.tdt4250.g07.BoardGame.BgPackage;
import no.ntnu.tdt4250.g07.BoardGame.EffectOnCell;
import no.ntnu.tdt4250.g07.BoardGame.PieceType;
import no.ntnu.tdt4250.g07.BoardGame.ValidMove;

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
 *   <li>{@link no.ntnu.tdt4250.g07.BoardGame.impl.PieceTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.BoardGame.impl.PieceTypeImpl#getValidmoves <em>Validmoves</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.BoardGame.impl.PieceTypeImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.BoardGame.impl.PieceTypeImpl#getEffectsoncell <em>Effectsoncell</em>}</li>
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
	 * The cached value of the '{@link #getValidmoves() <em>Validmoves</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidmoves()
	 * @generated
	 * @ordered
	 */
	protected EList<ValidMove> validmoves;

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
	 * The cached value of the '{@link #getEffectsoncell() <em>Effectsoncell</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectsoncell()
	 * @generated
	 * @ordered
	 */
	protected EList<EffectOnCell> effectsoncell;

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
	public EList<ValidMove> getValidmoves() {
		if (validmoves == null) {
			validmoves = new EObjectContainmentEList<ValidMove>(ValidMove.class, this,
					BgPackage.PIECE_TYPE__VALIDMOVES);
		}
		return validmoves;
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
	public EList<EffectOnCell> getEffectsoncell() {
		if (effectsoncell == null) {
			effectsoncell = new EObjectContainmentEList<EffectOnCell>(EffectOnCell.class, this,
					BgPackage.PIECE_TYPE__EFFECTSONCELL);
		}
		return effectsoncell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BgPackage.PIECE_TYPE__VALIDMOVES:
			return ((InternalEList<?>) getValidmoves()).basicRemove(otherEnd, msgs);
		case BgPackage.PIECE_TYPE__EFFECTSONCELL:
			return ((InternalEList<?>) getEffectsoncell()).basicRemove(otherEnd, msgs);
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
		case BgPackage.PIECE_TYPE__VALIDMOVES:
			return getValidmoves();
		case BgPackage.PIECE_TYPE__SYMBOL:
			return getSymbol();
		case BgPackage.PIECE_TYPE__EFFECTSONCELL:
			return getEffectsoncell();
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
		case BgPackage.PIECE_TYPE__VALIDMOVES:
			getValidmoves().clear();
			getValidmoves().addAll((Collection<? extends ValidMove>) newValue);
			return;
		case BgPackage.PIECE_TYPE__SYMBOL:
			setSymbol((String) newValue);
			return;
		case BgPackage.PIECE_TYPE__EFFECTSONCELL:
			getEffectsoncell().clear();
			getEffectsoncell().addAll((Collection<? extends EffectOnCell>) newValue);
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
		case BgPackage.PIECE_TYPE__VALIDMOVES:
			getValidmoves().clear();
			return;
		case BgPackage.PIECE_TYPE__SYMBOL:
			setSymbol(SYMBOL_EDEFAULT);
			return;
		case BgPackage.PIECE_TYPE__EFFECTSONCELL:
			getEffectsoncell().clear();
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
		case BgPackage.PIECE_TYPE__VALIDMOVES:
			return validmoves != null && !validmoves.isEmpty();
		case BgPackage.PIECE_TYPE__SYMBOL:
			return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
		case BgPackage.PIECE_TYPE__EFFECTSONCELL:
			return effectsoncell != null && !effectsoncell.isEmpty();
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
