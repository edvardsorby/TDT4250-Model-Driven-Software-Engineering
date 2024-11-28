/**
 */
package no.ntnu.tdt4250.g07.bg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Piece Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.PieceType#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.PieceType#getValidmoves <em>Validmoves</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.PieceType#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.PieceType#getEffectsoncell <em>Effectsoncell</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getPieceType()
 * @model
 * @generated
 */
public interface PieceType extends BoardGameElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getPieceType_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.g07.bg.PieceType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Validmoves</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.g07.bg.ValidMove}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validmoves</em>' reference list.
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getPieceType_Validmoves()
	 * @model required="true"
	 * @generated
	 */
	EList<ValidMove> getValidmoves();

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getPieceType_Symbol()
	 * @model required="true"
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.g07.bg.PieceType#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Effectsoncell</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.g07.bg.EffectOnCell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effectsoncell</em>' reference list.
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getPieceType_Effectsoncell()
	 * @model
	 * @generated
	 */
	EList<EffectOnCell> getEffectsoncell();

} // PieceType
