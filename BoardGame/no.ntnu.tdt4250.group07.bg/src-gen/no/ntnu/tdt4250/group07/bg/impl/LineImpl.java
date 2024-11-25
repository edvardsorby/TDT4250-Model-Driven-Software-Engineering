/**
 */
package no.ntnu.tdt4250.group07.bg.impl;

import java.util.Collection;

import no.ntnu.tdt4250.group07.bg.BgPackage;
import no.ntnu.tdt4250.group07.bg.Line;
import no.ntnu.tdt4250.group07.bg.LineElement;

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
 * An implementation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.LineImpl#isHorizontal <em>Horizontal</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.LineImpl#isVertical <em>Vertical</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.LineImpl#isDiagonal <em>Diagonal</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.impl.LineImpl#getLineelement <em>Lineelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineImpl extends MinimalEObjectImpl.Container implements Line {
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
	 * The cached value of the '{@link #getLineelement() <em>Lineelement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineelement()
	 * @generated
	 * @ordered
	 */
	protected EList<LineElement> lineelement;

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
	public EList<LineElement> getLineelement() {
		if (lineelement == null) {
			lineelement = new EObjectContainmentEList<LineElement>(LineElement.class, this,
					BgPackage.LINE__LINEELEMENT);
		}
		return lineelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BgPackage.LINE__LINEELEMENT:
			return ((InternalEList<?>) getLineelement()).basicRemove(otherEnd, msgs);
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
		case BgPackage.LINE__HORIZONTAL:
			return isHorizontal();
		case BgPackage.LINE__VERTICAL:
			return isVertical();
		case BgPackage.LINE__DIAGONAL:
			return isDiagonal();
		case BgPackage.LINE__LINEELEMENT:
			return getLineelement();
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
		case BgPackage.LINE__HORIZONTAL:
			setHorizontal((Boolean) newValue);
			return;
		case BgPackage.LINE__VERTICAL:
			setVertical((Boolean) newValue);
			return;
		case BgPackage.LINE__DIAGONAL:
			setDiagonal((Boolean) newValue);
			return;
		case BgPackage.LINE__LINEELEMENT:
			getLineelement().clear();
			getLineelement().addAll((Collection<? extends LineElement>) newValue);
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
		case BgPackage.LINE__HORIZONTAL:
			setHorizontal(HORIZONTAL_EDEFAULT);
			return;
		case BgPackage.LINE__VERTICAL:
			setVertical(VERTICAL_EDEFAULT);
			return;
		case BgPackage.LINE__DIAGONAL:
			setDiagonal(DIAGONAL_EDEFAULT);
			return;
		case BgPackage.LINE__LINEELEMENT:
			getLineelement().clear();
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
		case BgPackage.LINE__HORIZONTAL:
			return horizontal != HORIZONTAL_EDEFAULT;
		case BgPackage.LINE__VERTICAL:
			return vertical != VERTICAL_EDEFAULT;
		case BgPackage.LINE__DIAGONAL:
			return diagonal != DIAGONAL_EDEFAULT;
		case BgPackage.LINE__LINEELEMENT:
			return lineelement != null && !lineelement.isEmpty();
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
		result.append(" (Horizontal: ");
		result.append(horizontal);
		result.append(", Vertical: ");
		result.append(vertical);
		result.append(", Diagonal: ");
		result.append(diagonal);
		result.append(')');
		return result.toString();
	}

} //LineImpl
