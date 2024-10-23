/**
 */
package assignment2.impl;

import assignment2.Algorithm;
import assignment2.App;
import assignment2.Assignment2Package;
import assignment2.Board;
import assignment2.Platform;
import assignment2.Rules;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment2.impl.AppImpl#getName <em>Name</em>}</li>
 *   <li>{@link assignment2.impl.AppImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link assignment2.impl.AppImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link assignment2.impl.AppImpl#getBoard <em>Board</em>}</li>
 *   <li>{@link assignment2.impl.AppImpl#isSinglePlayer <em>Single Player</em>}</li>
 *   <li>{@link assignment2.impl.AppImpl#isMultiPlayer <em>Multi Player</em>}</li>
 *   <li>{@link assignment2.impl.AppImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link assignment2.impl.AppImpl#isOnline <em>Online</em>}</li>
 *   <li>{@link assignment2.impl.AppImpl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link assignment2.impl.AppImpl#isMultiPlatform <em>Multi Platform</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppImpl extends MinimalEObjectImpl.Container implements App {
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
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected Rules rules;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBoard() <em>Board</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoard()
	 * @generated
	 * @ordered
	 */
	protected EList<Board> board;

	/**
	 * The default value of the '{@link #isSinglePlayer() <em>Single Player</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSinglePlayer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SINGLE_PLAYER_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isMultiPlayer() <em>Multi Player</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiPlayer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTI_PLAYER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected EList<Algorithm> algorithm;

	/**
	 * The default value of the '{@link #isOnline() <em>Online</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnline()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ONLINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOnline() <em>Online</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnline()
	 * @generated
	 * @ordered
	 */
	protected boolean online = ONLINE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlatform() <em>Platform</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatform()
	 * @generated
	 * @ordered
	 */
	protected EList<Platform> platform;

	/**
	 * The default value of the '{@link #isMultiPlatform() <em>Multi Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiPlatform()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTI_PLATFORM_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assignment2Package.Literals.APP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.APP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rules getRules() {
		if (rules != null && rules.eIsProxy()) {
			InternalEObject oldRules = (InternalEObject) rules;
			rules = (Rules) eResolveProxy(oldRules);
			if (rules != oldRules) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Assignment2Package.APP__RULES, oldRules,
							rules));
			}
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rules basicGetRules() {
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRules(Rules newRules) {
		Rules oldRules = rules;
		rules = newRules;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.APP__RULES, oldRules, rules));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.APP__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Board> getBoard() {
		if (board == null) {
			board = new EObjectContainmentEList<Board>(Board.class, this, Assignment2Package.APP__BOARD);
		}
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isSinglePlayer() {
		return this.getRules().getMinimumPlayers() == 1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isMultiPlayer() {
		return this.getRules().getMaximumPlayers() > 1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Algorithm> getAlgorithm() {
		if (algorithm == null) {
			algorithm = new EObjectResolvingEList<Algorithm>(Algorithm.class, this, Assignment2Package.APP__ALGORITHM);
		}
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOnline() {
		return online;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnline(boolean newOnline) {
		boolean oldOnline = online;
		online = newOnline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.APP__ONLINE, oldOnline, online));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Platform> getPlatform() {
		if (platform == null) {
			platform = new EObjectResolvingEList<Platform>(Platform.class, this, Assignment2Package.APP__PLATFORM);
		}
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isMultiPlatform() {
		return this.getPlatform().size() > 1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Assignment2Package.APP__BOARD:
			return ((InternalEList<?>) getBoard()).basicRemove(otherEnd, msgs);
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
		case Assignment2Package.APP__NAME:
			return getName();
		case Assignment2Package.APP__RULES:
			if (resolve)
				return getRules();
			return basicGetRules();
		case Assignment2Package.APP__DESCRIPTION:
			return getDescription();
		case Assignment2Package.APP__BOARD:
			return getBoard();
		case Assignment2Package.APP__SINGLE_PLAYER:
			return isSinglePlayer();
		case Assignment2Package.APP__MULTI_PLAYER:
			return isMultiPlayer();
		case Assignment2Package.APP__ALGORITHM:
			return getAlgorithm();
		case Assignment2Package.APP__ONLINE:
			return isOnline();
		case Assignment2Package.APP__PLATFORM:
			return getPlatform();
		case Assignment2Package.APP__MULTI_PLATFORM:
			return isMultiPlatform();
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
		case Assignment2Package.APP__NAME:
			setName((String) newValue);
			return;
		case Assignment2Package.APP__RULES:
			setRules((Rules) newValue);
			return;
		case Assignment2Package.APP__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case Assignment2Package.APP__BOARD:
			getBoard().clear();
			getBoard().addAll((Collection<? extends Board>) newValue);
			return;
		case Assignment2Package.APP__ALGORITHM:
			getAlgorithm().clear();
			getAlgorithm().addAll((Collection<? extends Algorithm>) newValue);
			return;
		case Assignment2Package.APP__ONLINE:
			setOnline((Boolean) newValue);
			return;
		case Assignment2Package.APP__PLATFORM:
			getPlatform().clear();
			getPlatform().addAll((Collection<? extends Platform>) newValue);
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
		case Assignment2Package.APP__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Assignment2Package.APP__RULES:
			setRules((Rules) null);
			return;
		case Assignment2Package.APP__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case Assignment2Package.APP__BOARD:
			getBoard().clear();
			return;
		case Assignment2Package.APP__ALGORITHM:
			getAlgorithm().clear();
			return;
		case Assignment2Package.APP__ONLINE:
			setOnline(ONLINE_EDEFAULT);
			return;
		case Assignment2Package.APP__PLATFORM:
			getPlatform().clear();
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
		case Assignment2Package.APP__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Assignment2Package.APP__RULES:
			return rules != null;
		case Assignment2Package.APP__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case Assignment2Package.APP__BOARD:
			return board != null && !board.isEmpty();
		case Assignment2Package.APP__SINGLE_PLAYER:
			return isSinglePlayer() != SINGLE_PLAYER_EDEFAULT;
		case Assignment2Package.APP__MULTI_PLAYER:
			return isMultiPlayer() != MULTI_PLAYER_EDEFAULT;
		case Assignment2Package.APP__ALGORITHM:
			return algorithm != null && !algorithm.isEmpty();
		case Assignment2Package.APP__ONLINE:
			return online != ONLINE_EDEFAULT;
		case Assignment2Package.APP__PLATFORM:
			return platform != null && !platform.isEmpty();
		case Assignment2Package.APP__MULTI_PLATFORM:
			return isMultiPlatform() != MULTI_PLATFORM_EDEFAULT;
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
		result.append(", Description: ");
		result.append(description);
		result.append(", Online: ");
		result.append(online);
		result.append(')');
		return result.toString();
	}

} //AppImpl
