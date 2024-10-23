/**
 */
package assignment2.impl;

import assignment2.Assignment2Package;
import assignment2.Rules;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rules</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment2.impl.RulesImpl#isCustomizable <em>Customizable</em>}</li>
 *   <li>{@link assignment2.impl.RulesImpl#getMaximumPlayers <em>Maximum Players</em>}</li>
 *   <li>{@link assignment2.impl.RulesImpl#getMinimumPlayers <em>Minimum Players</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RulesImpl extends MinimalEObjectImpl.Container implements Rules {
	/**
	 * The default value of the '{@link #isCustomizable() <em>Customizable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCustomizable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CUSTOMIZABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCustomizable() <em>Customizable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCustomizable()
	 * @generated
	 * @ordered
	 */
	protected boolean customizable = CUSTOMIZABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumPlayers() <em>Maximum Players</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumPlayers()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXIMUM_PLAYERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaximumPlayers() <em>Maximum Players</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumPlayers()
	 * @generated
	 * @ordered
	 */
	protected int maximumPlayers = MAXIMUM_PLAYERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumPlayers() <em>Minimum Players</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumPlayers()
	 * @generated
	 * @ordered
	 */
	protected static final int MINIMUM_PLAYERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinimumPlayers() <em>Minimum Players</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumPlayers()
	 * @generated
	 * @ordered
	 */
	protected int minimumPlayers = MINIMUM_PLAYERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RulesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assignment2Package.Literals.RULES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCustomizable() {
		return customizable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomizable(boolean newCustomizable) {
		boolean oldCustomizable = customizable;
		customizable = newCustomizable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.RULES__CUSTOMIZABLE,
					oldCustomizable, customizable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaximumPlayers() {
		return maximumPlayers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumPlayers(int newMaximumPlayers) {
		int oldMaximumPlayers = maximumPlayers;
		maximumPlayers = newMaximumPlayers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.RULES__MAXIMUM_PLAYERS,
					oldMaximumPlayers, maximumPlayers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinimumPlayers() {
		return minimumPlayers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimumPlayers(int newMinimumPlayers) {
		int oldMinimumPlayers = minimumPlayers;
		minimumPlayers = newMinimumPlayers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.RULES__MINIMUM_PLAYERS,
					oldMinimumPlayers, minimumPlayers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Assignment2Package.RULES__CUSTOMIZABLE:
			return isCustomizable();
		case Assignment2Package.RULES__MAXIMUM_PLAYERS:
			return getMaximumPlayers();
		case Assignment2Package.RULES__MINIMUM_PLAYERS:
			return getMinimumPlayers();
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
		case Assignment2Package.RULES__CUSTOMIZABLE:
			setCustomizable((Boolean) newValue);
			return;
		case Assignment2Package.RULES__MAXIMUM_PLAYERS:
			setMaximumPlayers((Integer) newValue);
			return;
		case Assignment2Package.RULES__MINIMUM_PLAYERS:
			setMinimumPlayers((Integer) newValue);
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
		case Assignment2Package.RULES__CUSTOMIZABLE:
			setCustomizable(CUSTOMIZABLE_EDEFAULT);
			return;
		case Assignment2Package.RULES__MAXIMUM_PLAYERS:
			setMaximumPlayers(MAXIMUM_PLAYERS_EDEFAULT);
			return;
		case Assignment2Package.RULES__MINIMUM_PLAYERS:
			setMinimumPlayers(MINIMUM_PLAYERS_EDEFAULT);
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
		case Assignment2Package.RULES__CUSTOMIZABLE:
			return customizable != CUSTOMIZABLE_EDEFAULT;
		case Assignment2Package.RULES__MAXIMUM_PLAYERS:
			return maximumPlayers != MAXIMUM_PLAYERS_EDEFAULT;
		case Assignment2Package.RULES__MINIMUM_PLAYERS:
			return minimumPlayers != MINIMUM_PLAYERS_EDEFAULT;
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
		result.append(" (Customizable: ");
		result.append(customizable);
		result.append(", MaximumPlayers: ");
		result.append(maximumPlayers);
		result.append(", MinimumPlayers: ");
		result.append(minimumPlayers);
		result.append(')');
		return result.toString();
	}

} //RulesImpl
