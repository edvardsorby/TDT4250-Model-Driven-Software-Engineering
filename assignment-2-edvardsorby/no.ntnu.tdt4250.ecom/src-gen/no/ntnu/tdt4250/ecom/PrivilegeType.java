/**
 */
package no.ntnu.tdt4250.ecom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Privilege Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.ecom.EcomPackage#getPrivilegeType()
 * @model
 * @generated
 */
public enum PrivilegeType implements Enumerator {
	/**
	 * The '<em><b>POST ITEMS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST_ITEMS_VALUE
	 * @generated
	 * @ordered
	 */
	POST_ITEMS(0, "POST_ITEMS", "POST_ITEMS"),

	/**
	 * The '<em><b>EDIT CATEGORIES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDIT_CATEGORIES_VALUE
	 * @generated
	 * @ordered
	 */
	EDIT_CATEGORIES(1, "EDIT_CATEGORIES", "EDIT_CATEGORIES"),

	/**
	 * The '<em><b>MANAGE USERS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANAGE_USERS_VALUE
	 * @generated
	 * @ordered
	 */
	MANAGE_USERS(2, "MANAGE_USERS", "MANAGE_USERS"),

	/**
	 * The '<em><b>MODERATE ITEMS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODERATE_ITEMS_VALUE
	 * @generated
	 * @ordered
	 */
	MODERATE_ITEMS(3, "MODERATE_ITEMS", "MODERATE_ITEMS");

	/**
	 * The '<em><b>POST ITEMS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST_ITEMS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POST_ITEMS_VALUE = 0;

	/**
	 * The '<em><b>EDIT CATEGORIES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDIT_CATEGORIES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EDIT_CATEGORIES_VALUE = 1;

	/**
	 * The '<em><b>MANAGE USERS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANAGE_USERS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANAGE_USERS_VALUE = 2;

	/**
	 * The '<em><b>MODERATE ITEMS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODERATE_ITEMS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODERATE_ITEMS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Privilege Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PrivilegeType[] VALUES_ARRAY = new PrivilegeType[] { POST_ITEMS, EDIT_CATEGORIES, MANAGE_USERS,
			MODERATE_ITEMS, };

	/**
	 * A public read-only list of all the '<em><b>Privilege Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PrivilegeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Privilege Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PrivilegeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrivilegeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Privilege Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PrivilegeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrivilegeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Privilege Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PrivilegeType get(int value) {
		switch (value) {
		case POST_ITEMS_VALUE:
			return POST_ITEMS;
		case EDIT_CATEGORIES_VALUE:
			return EDIT_CATEGORIES;
		case MANAGE_USERS_VALUE:
			return MANAGE_USERS;
		case MODERATE_ITEMS_VALUE:
			return MODERATE_ITEMS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PrivilegeType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //PrivilegeType
