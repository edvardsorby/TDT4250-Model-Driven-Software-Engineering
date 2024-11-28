/**
 */
package no.ntnu.tdt4250.g07.bg.impl;

import java.util.Collection;
import no.ntnu.tdt4250.g07.bg.BgPackage;
import no.ntnu.tdt4250.g07.bg.WinCondition;

import no.ntnu.tdt4250.g07.bg.WinConditionElement;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Win Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.impl.WinConditionImpl#getWinConditionElements <em>Win Condition Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WinConditionImpl extends BoardGameElementImpl implements WinCondition {
	/**
	 * The cached value of the '{@link #getWinConditionElements() <em>Win Condition Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinConditionElements()
	 * @generated
	 * @ordered
	 */
	protected EList<WinConditionElement> winConditionElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WinConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BgPackage.Literals.WIN_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WinConditionElement> getWinConditionElements() {
		if (winConditionElements == null) {
			winConditionElements = new EObjectContainmentEList<WinConditionElement>(WinConditionElement.class, this,
					BgPackage.WIN_CONDITION__WIN_CONDITION_ELEMENTS);
		}
		return winConditionElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BgPackage.WIN_CONDITION__WIN_CONDITION_ELEMENTS:
			return ((InternalEList<?>) getWinConditionElements()).basicRemove(otherEnd, msgs);
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
		case BgPackage.WIN_CONDITION__WIN_CONDITION_ELEMENTS:
			return getWinConditionElements();
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
		case BgPackage.WIN_CONDITION__WIN_CONDITION_ELEMENTS:
			getWinConditionElements().clear();
			getWinConditionElements().addAll((Collection<? extends WinConditionElement>) newValue);
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
		case BgPackage.WIN_CONDITION__WIN_CONDITION_ELEMENTS:
			getWinConditionElements().clear();
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
		case BgPackage.WIN_CONDITION__WIN_CONDITION_ELEMENTS:
			return winConditionElements != null && !winConditionElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WinConditionImpl
