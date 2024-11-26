/**
 */
package no.ntnu.tdt4250.group07.bg.impl;

import java.util.Collection;

import no.ntnu.tdt4250.group07.bg.BgPackage;
import no.ntnu.tdt4250.group07.bg.Board;
import no.ntnu.tdt4250.group07.bg.BoardState;
import no.ntnu.tdt4250.group07.bg.Cell;
import no.ntnu.tdt4250.group07.bg.PlayerBrickSet;
import no.ntnu.tdt4250.group07.bg.ValidMove;

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
 * An implementation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.BoardImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.BoardImpl#isStartPosition <em>Start Position</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.BoardImpl#getPlayerbrickset <em>Playerbrickset</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.BoardImpl#getCell <em>Cell</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.BoardImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.BoardImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.BoardImpl#getBoardstate <em>Boardstate</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.BoardImpl#getValidmove <em>Validmove</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoardImpl extends MinimalEObjectImpl.Container implements Board {
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
	 * The default value of the '{@link #isStartPosition() <em>Start Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStartPosition()
	 * @generated
	 * @ordered
	 */
	protected static final boolean START_POSITION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStartPosition() <em>Start Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStartPosition()
	 * @generated
	 * @ordered
	 */
	protected boolean startPosition = START_POSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlayerbrickset() <em>Playerbrickset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerbrickset()
	 * @generated
	 * @ordered
	 */
	protected EList<PlayerBrickSet> playerbrickset;

	/**
	 * The cached value of the '{@link #getCell() <em>Cell</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCell()
	 * @generated
	 * @ordered
	 */
	protected EList<Cell> cell;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

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
	 * The cached value of the '{@link #getValidmove() <em>Validmove</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidmove()
	 * @generated
	 * @ordered
	 */
	protected EList<ValidMove> validmove;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BgPackage.Literals.BOARD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.BOARD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isStartPosition() {
		return startPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartPosition(boolean newStartPosition) {
		boolean oldStartPosition = startPosition;
		startPosition = newStartPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.BOARD__START_POSITION, oldStartPosition,
					startPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlayerBrickSet> getPlayerbrickset() {
		if (playerbrickset == null) {
			playerbrickset = new EObjectContainmentEList<PlayerBrickSet>(PlayerBrickSet.class, this,
					BgPackage.BOARD__PLAYERBRICKSET);
		}
		return playerbrickset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Cell> getCell() {
		if (cell == null) {
			cell = new EObjectResolvingEList<Cell>(Cell.class, this, BgPackage.BOARD__CELL);
		}
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.BOARD__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.BOARD__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoardState> getBoardstate() {
		if (boardstate == null) {
			boardstate = new EObjectResolvingEList<BoardState>(BoardState.class, this, BgPackage.BOARD__BOARDSTATE);
		}
		return boardstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValidMove> getValidmove() {
		if (validmove == null) {
			validmove = new EObjectContainmentEList<ValidMove>(ValidMove.class, this, BgPackage.BOARD__VALIDMOVE);
		}
		return validmove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BgPackage.BOARD__PLAYERBRICKSET:
			return ((InternalEList<?>) getPlayerbrickset()).basicRemove(otherEnd, msgs);
		case BgPackage.BOARD__VALIDMOVE:
			return ((InternalEList<?>) getValidmove()).basicRemove(otherEnd, msgs);
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
		case BgPackage.BOARD__NAME:
			return getName();
		case BgPackage.BOARD__START_POSITION:
			return isStartPosition();
		case BgPackage.BOARD__PLAYERBRICKSET:
			return getPlayerbrickset();
		case BgPackage.BOARD__CELL:
			return getCell();
		case BgPackage.BOARD__WIDTH:
			return getWidth();
		case BgPackage.BOARD__HEIGHT:
			return getHeight();
		case BgPackage.BOARD__BOARDSTATE:
			return getBoardstate();
		case BgPackage.BOARD__VALIDMOVE:
			return getValidmove();
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
		case BgPackage.BOARD__NAME:
			setName((String) newValue);
			return;
		case BgPackage.BOARD__START_POSITION:
			setStartPosition((Boolean) newValue);
			return;
		case BgPackage.BOARD__PLAYERBRICKSET:
			getPlayerbrickset().clear();
			getPlayerbrickset().addAll((Collection<? extends PlayerBrickSet>) newValue);
			return;
		case BgPackage.BOARD__CELL:
			getCell().clear();
			getCell().addAll((Collection<? extends Cell>) newValue);
			return;
		case BgPackage.BOARD__WIDTH:
			setWidth((Integer) newValue);
			return;
		case BgPackage.BOARD__HEIGHT:
			setHeight((Integer) newValue);
			return;
		case BgPackage.BOARD__BOARDSTATE:
			getBoardstate().clear();
			getBoardstate().addAll((Collection<? extends BoardState>) newValue);
			return;
		case BgPackage.BOARD__VALIDMOVE:
			getValidmove().clear();
			getValidmove().addAll((Collection<? extends ValidMove>) newValue);
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
		case BgPackage.BOARD__NAME:
			setName(NAME_EDEFAULT);
			return;
		case BgPackage.BOARD__START_POSITION:
			setStartPosition(START_POSITION_EDEFAULT);
			return;
		case BgPackage.BOARD__PLAYERBRICKSET:
			getPlayerbrickset().clear();
			return;
		case BgPackage.BOARD__CELL:
			getCell().clear();
			return;
		case BgPackage.BOARD__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case BgPackage.BOARD__HEIGHT:
			setHeight(HEIGHT_EDEFAULT);
			return;
		case BgPackage.BOARD__BOARDSTATE:
			getBoardstate().clear();
			return;
		case BgPackage.BOARD__VALIDMOVE:
			getValidmove().clear();
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
		case BgPackage.BOARD__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case BgPackage.BOARD__START_POSITION:
			return startPosition != START_POSITION_EDEFAULT;
		case BgPackage.BOARD__PLAYERBRICKSET:
			return playerbrickset != null && !playerbrickset.isEmpty();
		case BgPackage.BOARD__CELL:
			return cell != null && !cell.isEmpty();
		case BgPackage.BOARD__WIDTH:
			return width != WIDTH_EDEFAULT;
		case BgPackage.BOARD__HEIGHT:
			return height != HEIGHT_EDEFAULT;
		case BgPackage.BOARD__BOARDSTATE:
			return boardstate != null && !boardstate.isEmpty();
		case BgPackage.BOARD__VALIDMOVE:
			return validmove != null && !validmove.isEmpty();
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
		result.append(", StartPosition: ");
		result.append(startPosition);
		result.append(", Width: ");
		result.append(width);
		result.append(", Height: ");
		result.append(height);
		result.append(')');
		return result.toString();
	}

} //BoardImpl
