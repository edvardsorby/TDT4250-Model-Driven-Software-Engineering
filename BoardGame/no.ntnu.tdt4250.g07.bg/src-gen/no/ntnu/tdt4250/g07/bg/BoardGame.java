/**
 */
package no.ntnu.tdt4250.g07.bg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Board Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.BoardGame#getPiecetypes <em>Piecetypes</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.BoardGame#getCellstates <em>Cellstates</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.BoardGame#getWinConditions <em>Win Conditions</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.BoardGame#getSize <em>Size</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.BoardGame#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.BoardGame#getValidmoves <em>Validmoves</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.BoardGame#getEffectsoncell <em>Effectsoncell</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getBoardGame()
 * @model
 * @generated
 */
public interface BoardGame extends EObject {
	/**
	 * Returns the value of the '<em><b>Piecetypes</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.g07.bg.PieceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Piecetypes</em>' containment reference list.
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getBoardGame_Piecetypes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PieceType> getPiecetypes();

	/**
	 * Returns the value of the '<em><b>Cellstates</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.g07.bg.CellState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cellstates</em>' containment reference list.
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getBoardGame_Cellstates()
	 * @model containment="true"
	 * @generated
	 */
	EList<CellState> getCellstates();

	/**
	 * Returns the value of the '<em><b>Win Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.g07.bg.WinCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Win Conditions</em>' containment reference list.
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getBoardGame_WinConditions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<WinCondition> getWinConditions();

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getBoardGame_Size()
	 * @model required="true"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.g07.bg.BoardGame#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getBoardGame_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.g07.bg.BoardGame#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Validmoves</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.g07.bg.ValidMove}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validmoves</em>' containment reference list.
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getBoardGame_Validmoves()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ValidMove> getValidmoves();

	/**
	 * Returns the value of the '<em><b>Effectsoncell</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.g07.bg.EffectOnCell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effectsoncell</em>' containment reference list.
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getBoardGame_Effectsoncell()
	 * @model containment="true"
	 * @generated
	 */
	EList<EffectOnCell> getEffectsoncell();

} // BoardGame
