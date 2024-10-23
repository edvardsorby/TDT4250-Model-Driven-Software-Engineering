/**
 */
package assignment2.impl;

import assignment2.Assignment2Package;
import assignment2.Board;
import assignment2.SheetsConfig;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment2.impl.BoardImpl#isStandardStartPoint <em>Standard Start Point</em>}</li>
 *   <li>{@link assignment2.impl.BoardImpl#getName <em>Name</em>}</li>
 *   <li>{@link assignment2.impl.BoardImpl#getSheetsConfig <em>Sheets Config</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoardImpl extends MinimalEObjectImpl.Container implements Board {
	/**
	 * The default value of the '{@link #isStandardStartPoint() <em>Standard Start Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStandardStartPoint()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STANDARD_START_POINT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isStandardStartPoint() <em>Standard Start Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStandardStartPoint()
	 * @generated
	 * @ordered
	 */
	protected boolean standardStartPoint = STANDARD_START_POINT_EDEFAULT;

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
	 * The cached value of the '{@link #getSheetsConfig() <em>Sheets Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheetsConfig()
	 * @generated
	 * @ordered
	 */
	protected SheetsConfig sheetsConfig;

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
		return Assignment2Package.Literals.BOARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isStandardStartPoint() {
		return standardStartPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandardStartPoint(boolean newStandardStartPoint) {
		boolean oldStandardStartPoint = standardStartPoint;
		standardStartPoint = newStandardStartPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.BOARD__STANDARD_START_POINT,
					oldStandardStartPoint, standardStartPoint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.BOARD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SheetsConfig getSheetsConfig() {
		return sheetsConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSheetsConfig(SheetsConfig newSheetsConfig, NotificationChain msgs) {
		SheetsConfig oldSheetsConfig = sheetsConfig;
		sheetsConfig = newSheetsConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Assignment2Package.BOARD__SHEETS_CONFIG, oldSheetsConfig, newSheetsConfig);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSheetsConfig(SheetsConfig newSheetsConfig) {
		if (newSheetsConfig != sheetsConfig) {
			NotificationChain msgs = null;
			if (sheetsConfig != null)
				msgs = ((InternalEObject) sheetsConfig).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Assignment2Package.BOARD__SHEETS_CONFIG, null, msgs);
			if (newSheetsConfig != null)
				msgs = ((InternalEObject) newSheetsConfig).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Assignment2Package.BOARD__SHEETS_CONFIG, null, msgs);
			msgs = basicSetSheetsConfig(newSheetsConfig, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.BOARD__SHEETS_CONFIG,
					newSheetsConfig, newSheetsConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Assignment2Package.BOARD__SHEETS_CONFIG:
			return basicSetSheetsConfig(null, msgs);
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
		case Assignment2Package.BOARD__STANDARD_START_POINT:
			return isStandardStartPoint();
		case Assignment2Package.BOARD__NAME:
			return getName();
		case Assignment2Package.BOARD__SHEETS_CONFIG:
			return getSheetsConfig();
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
		case Assignment2Package.BOARD__STANDARD_START_POINT:
			setStandardStartPoint((Boolean) newValue);
			return;
		case Assignment2Package.BOARD__NAME:
			setName((String) newValue);
			return;
		case Assignment2Package.BOARD__SHEETS_CONFIG:
			setSheetsConfig((SheetsConfig) newValue);
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
		case Assignment2Package.BOARD__STANDARD_START_POINT:
			setStandardStartPoint(STANDARD_START_POINT_EDEFAULT);
			return;
		case Assignment2Package.BOARD__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Assignment2Package.BOARD__SHEETS_CONFIG:
			setSheetsConfig((SheetsConfig) null);
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
		case Assignment2Package.BOARD__STANDARD_START_POINT:
			return standardStartPoint != STANDARD_START_POINT_EDEFAULT;
		case Assignment2Package.BOARD__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Assignment2Package.BOARD__SHEETS_CONFIG:
			return sheetsConfig != null;
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
		result.append(" (standardStartPoint: ");
		result.append(standardStartPoint);
		result.append(", Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //BoardImpl
