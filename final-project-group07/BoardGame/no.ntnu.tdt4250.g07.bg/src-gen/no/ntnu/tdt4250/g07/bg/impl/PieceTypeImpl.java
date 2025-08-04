/**
 */
package no.ntnu.tdt4250.g07.bg.impl;

import java.util.Collection;

import no.ntnu.tdt4250.g07.bg.BgPackage;
import no.ntnu.tdt4250.g07.bg.CellState;
import no.ntnu.tdt4250.g07.bg.EffectOnCell;
import no.ntnu.tdt4250.g07.bg.PieceType;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Piece Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.impl.PieceTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.impl.PieceTypeImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.impl.PieceTypeImpl#getEffectsOnCell <em>Effects On Cell</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.impl.PieceTypeImpl#getDisallowedStates <em>Disallowed States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PieceTypeImpl extends BoardGameElementImpl implements PieceType {
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
	 * The cached value of the '{@link #getEffectsOnCell() <em>Effects On Cell</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectsOnCell()
	 * @generated
	 * @ordered
	 */
	protected EList<EffectOnCell> effectsOnCell;

	/**
	 * The cached value of the '{@link #getDisallowedStates() <em>Disallowed States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisallowedStates()
	 * @generated
	 * @ordered
	 */
	protected EList<CellState> disallowedStates;

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
	public EList<EffectOnCell> getEffectsOnCell() {
		if (effectsOnCell == null) {
			effectsOnCell = new EObjectResolvingEList<EffectOnCell>(EffectOnCell.class, this,
					BgPackage.PIECE_TYPE__EFFECTS_ON_CELL);
		}
		return effectsOnCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CellState> getDisallowedStates() {
		if (disallowedStates == null) {
			disallowedStates = new EObjectResolvingEList<CellState>(CellState.class, this,
					BgPackage.PIECE_TYPE__DISALLOWED_STATES);
		}
		return disallowedStates;
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
		case BgPackage.PIECE_TYPE__SYMBOL:
			return getSymbol();
		case BgPackage.PIECE_TYPE__EFFECTS_ON_CELL:
			return getEffectsOnCell();
		case BgPackage.PIECE_TYPE__DISALLOWED_STATES:
			return getDisallowedStates();
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
		case BgPackage.PIECE_TYPE__SYMBOL:
			setSymbol((String) newValue);
			return;
		case BgPackage.PIECE_TYPE__EFFECTS_ON_CELL:
			getEffectsOnCell().clear();
			getEffectsOnCell().addAll((Collection<? extends EffectOnCell>) newValue);
			return;
		case BgPackage.PIECE_TYPE__DISALLOWED_STATES:
			getDisallowedStates().clear();
			getDisallowedStates().addAll((Collection<? extends CellState>) newValue);
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
		case BgPackage.PIECE_TYPE__SYMBOL:
			setSymbol(SYMBOL_EDEFAULT);
			return;
		case BgPackage.PIECE_TYPE__EFFECTS_ON_CELL:
			getEffectsOnCell().clear();
			return;
		case BgPackage.PIECE_TYPE__DISALLOWED_STATES:
			getDisallowedStates().clear();
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
		case BgPackage.PIECE_TYPE__SYMBOL:
			return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
		case BgPackage.PIECE_TYPE__EFFECTS_ON_CELL:
			return effectsOnCell != null && !effectsOnCell.isEmpty();
		case BgPackage.PIECE_TYPE__DISALLOWED_STATES:
			return disallowedStates != null && !disallowedStates.isEmpty();
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
