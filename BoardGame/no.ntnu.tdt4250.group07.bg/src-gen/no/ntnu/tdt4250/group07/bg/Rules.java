/**
 */
package no.ntnu.tdt4250.group07.bg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group07.bg.Rules#getBoard <em>Board</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getRules()
 * @model
 * @generated
 */
public interface Rules extends EObject {
	/**
	 * Returns the value of the '<em><b>Board</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group07.bg.Board}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board</em>' containment reference list.
	 * @see no.ntnu.tdt4250.group07.bg.BgPackage#getRules_Board()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Board> getBoard();

} // Rules
