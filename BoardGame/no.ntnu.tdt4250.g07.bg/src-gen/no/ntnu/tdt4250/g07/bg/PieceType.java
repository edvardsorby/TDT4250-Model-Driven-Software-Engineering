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
 *   <li>{@link no.ntnu.tdt4250.g07.bg.PieceType#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.PieceType#getEffectsOnCell <em>Effects On Cell</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.g07.bg.PieceType#getDisallowedStates <em>Disallowed States</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getPieceType()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SymbolCannotBeEmpty'"
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
	 * Returns the value of the '<em><b>Effects On Cell</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.g07.bg.EffectOnCell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effects On Cell</em>' reference list.
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getPieceType_EffectsOnCell()
	 * @model
	 * @generated
	 */
	EList<EffectOnCell> getEffectsOnCell();

	/**
	 * Returns the value of the '<em><b>Disallowed States</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.g07.bg.CellState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disallowed States</em>' reference list.
	 * @see no.ntnu.tdt4250.g07.bg.BgPackage#getPieceType_DisallowedStates()
	 * @model
	 * @generated
	 */
	EList<CellState> getDisallowedStates();

} // PieceType
