/**
 */
package no.ntnu.tdt4250.g07.BoardGame;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Piece Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.g07.BoardGame.PieceType#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.BoardGame.PieceType#getValidmoves <em>Validmoves</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.BoardGame.PieceType#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.BoardGame.PieceType#getEffectsoncell <em>Effectsoncell</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.g07.BoardGame.BgPackage#getPieceType()
 * @model
 * @generated
 */
public interface PieceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.g07.BoardGame.BgPackage#getPieceType_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.g07.BoardGame.PieceType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Validmoves</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.g07.BoardGame.ValidMove}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validmoves</em>' containment reference list.
	 * @see no.ntnu.tdt4250.g07.BoardGame.BgPackage#getPieceType_Validmoves()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ValidMove> getValidmoves();

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see no.ntnu.tdt4250.g07.BoardGame.BgPackage#getPieceType_Symbol()
	 * @model required="true"
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.g07.BoardGame.PieceType#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Effectsoncell</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.g07.BoardGame.EffectOnCell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effectsoncell</em>' containment reference list.
	 * @see no.ntnu.tdt4250.g07.BoardGame.BgPackage#getPieceType_Effectsoncell()
	 * @model containment="true"
	 * @generated
	 */
	EList<EffectOnCell> getEffectsoncell();

} // PieceType
