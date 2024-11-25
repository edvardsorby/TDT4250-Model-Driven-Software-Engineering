/**
 */
package no.ntnu.tdt4250.group07.bg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outcome</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.Outcome#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getOutcome()
 * @model
 * @generated
 */
public interface Outcome extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group07.bg.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference list.
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getOutcome_Condition()
	 * @model required="true"
	 * @generated
	 */
	EList<Condition> getCondition();

} // Outcome
