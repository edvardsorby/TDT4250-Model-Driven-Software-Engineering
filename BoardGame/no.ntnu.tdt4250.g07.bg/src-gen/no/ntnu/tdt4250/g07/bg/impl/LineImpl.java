/**
 */
package no.ntnu.tdt4250.g07.bg.impl;

import no.ntnu.tdt4250.g07.bg.BgPackage;
import no.ntnu.tdt4250.g07.bg.Line;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.impl.LineImpl#getCount <em>Count</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.impl.LineImpl#isDiagonal <em>Diagonal</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.impl.LineImpl#isHorizontal <em>Horizontal</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.impl.LineImpl#isVertical <em>Vertical</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.impl.LineImpl#isUnique <em>Unique</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineImpl extends WinConditionElementImpl implements Line {
	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected int count = COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #isDiagonal() <em>Diagonal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDiagonal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DIAGONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDiagonal() <em>Diagonal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDiagonal()
	 * @generated
	 * @ordered
	 */
	protected boolean diagonal = DIAGONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isHorizontal() <em>Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHorizontal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HORIZONTAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHorizontal() <em>Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHorizontal()
	 * @generated
	 * @ordered
	 */
	protected boolean horizontal = HORIZONTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isVertical() <em>Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVertical()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERTICAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVertical() <em>Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVertical()
	 * @generated
	 * @ordered
	 */
	protected boolean vertical = VERTICAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean unique = UNIQUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BgPackage.Literals.LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDiagonal() {
		return diagonal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiagonal(boolean newDiagonal) {
		boolean oldDiagonal = diagonal;
		diagonal = newDiagonal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.LINE__DIAGONAL, oldDiagonal, diagonal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHorizontal() {
		return horizontal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHorizontal(boolean newHorizontal) {
		boolean oldHorizontal = horizontal;
		horizontal = newHorizontal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.LINE__HORIZONTAL, oldHorizontal,
					horizontal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVertical() {
		return vertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVertical(boolean newVertical) {
		boolean oldVertical = vertical;
		vertical = newVertical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.LINE__VERTICAL, oldVertical, vertical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount(int newCount) {
		int oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.LINE__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUnique() {
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnique(boolean newUnique) {
		boolean oldUnique = unique;
		unique = newUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.LINE__UNIQUE, oldUnique, unique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BgPackage.LINE__COUNT:
			return getCount();
		case BgPackage.LINE__DIAGONAL:
			return isDiagonal();
		case BgPackage.LINE__HORIZONTAL:
			return isHorizontal();
		case BgPackage.LINE__VERTICAL:
			return isVertical();
		case BgPackage.LINE__UNIQUE:
			return isUnique();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BgPackage.LINE__COUNT:
			setCount((Integer) newValue);
			return;
		case BgPackage.LINE__DIAGONAL:
			setDiagonal((Boolean) newValue);
			return;
		case BgPackage.LINE__HORIZONTAL:
			setHorizontal((Boolean) newValue);
			return;
		case BgPackage.LINE__VERTICAL:
			setVertical((Boolean) newValue);
			return;
		case BgPackage.LINE__UNIQUE:
			setUnique((Boolean) newValue);
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
		case BgPackage.LINE__COUNT:
			setCount(COUNT_EDEFAULT);
			return;
		case BgPackage.LINE__DIAGONAL:
			setDiagonal(DIAGONAL_EDEFAULT);
			return;
		case BgPackage.LINE__HORIZONTAL:
			setHorizontal(HORIZONTAL_EDEFAULT);
			return;
		case BgPackage.LINE__VERTICAL:
			setVertical(VERTICAL_EDEFAULT);
			return;
		case BgPackage.LINE__UNIQUE:
			setUnique(UNIQUE_EDEFAULT);
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
		case BgPackage.LINE__COUNT:
			return count != COUNT_EDEFAULT;
		case BgPackage.LINE__DIAGONAL:
			return diagonal != DIAGONAL_EDEFAULT;
		case BgPackage.LINE__HORIZONTAL:
			return horizontal != HORIZONTAL_EDEFAULT;
		case BgPackage.LINE__VERTICAL:
			return vertical != VERTICAL_EDEFAULT;
		case BgPackage.LINE__UNIQUE:
			return unique != UNIQUE_EDEFAULT;
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
		result.append(" (count: ");
		result.append(count);
		result.append(", diagonal: ");
		result.append(diagonal);
		result.append(", horizontal: ");
		result.append(horizontal);
		result.append(", vertical: ");
		result.append(vertical);
		result.append(", unique: ");
		result.append(unique);
		result.append(')');
		return result.toString();
	}

} //LineImpl
