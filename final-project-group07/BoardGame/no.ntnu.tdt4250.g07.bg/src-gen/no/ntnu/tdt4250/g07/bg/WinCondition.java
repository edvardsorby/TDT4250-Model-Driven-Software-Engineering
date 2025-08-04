/**
 */
package no.ntnu.tdt4250.g07.bg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Win Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.WinCondition#getWinConditionElements <em>Win Condition Elements</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getWinCondition()
 * @model
 * @generated
 */
public interface WinCondition extends BoardGameElement {
	/**
	 * Returns the value of the '<em><b>Win Condition Elements</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.g07.bg.WinConditionElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Win Condition Elements</em>' containment reference list.
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getWinCondition_WinConditionElements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<WinConditionElement> getWinConditionElements();

} // WinCondition
