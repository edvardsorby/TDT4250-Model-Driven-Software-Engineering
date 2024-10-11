/**
 */
package no.ntnu.tdt4250.ecom;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.ecom.EcomFactory
 * @model kind="package"
 * @generated
 */
public interface EcomPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecom";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ntnu.no/tdt4250/ecom";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecom";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcomPackage eINSTANCE = no.ntnu.tdt4250.ecom.impl.EcomPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.ecom.impl.MarketplaceImpl <em>Marketplace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.ecom.impl.MarketplaceImpl
	 * @see no.ntnu.tdt4250.ecom.impl.EcomPackageImpl#getMarketplace()
	 * @generated
	 */
	int MARKETPLACE = 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETPLACE__ITEMS = 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETPLACE__CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETPLACE__LANGUAGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETPLACE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Marketplace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETPLACE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Marketplace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETPLACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.ecom.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.ecom.impl.UserImpl
	 * @see no.ntnu.tdt4250.ecom.impl.EcomPackageImpl#getUser()
	 * @generated
	 */
	int USER = 1;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ITEMS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USERNAME = 2;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ROLE = 3;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.ecom.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.ecom.impl.ItemImpl
	 * @see no.ntnu.tdt4250.ecom.impl.EcomPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 2;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__CATEGORY = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__PRICE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__PUBLISHED = 4;

	/**
	 * The feature id for the '<em><b>Seller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__SELLER = 5;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.ecom.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.ecom.impl.CategoryImpl
	 * @see no.ntnu.tdt4250.ecom.impl.EcomPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.ecom.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.ecom.impl.RoleImpl
	 * @see no.ntnu.tdt4250.ecom.impl.EcomPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 4;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ROLE_NAME = 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.ecom.impl.LanguageImpl <em>Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.ecom.impl.LanguageImpl
	 * @see no.ntnu.tdt4250.ecom.impl.EcomPackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 5;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__LANGUAGE_CODE = 0;

	/**
	 * The feature id for the '<em><b>Language Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__LANGUAGE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__CURRENCY = 2;

	/**
	 * The number of structural features of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.ecom.impl.AdminImpl <em>Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.ecom.impl.AdminImpl
	 * @see no.ntnu.tdt4250.ecom.impl.EcomPackageImpl#getAdmin()
	 * @generated
	 */
	int ADMIN = 6;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__ROLE_NAME = ROLE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Privileges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__PRIVILEGES = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_FEATURE_COUNT = ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.ecom.impl.NormalUserImpl <em>Normal User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.ecom.impl.NormalUserImpl
	 * @see no.ntnu.tdt4250.ecom.impl.EcomPackageImpl#getNormalUser()
	 * @generated
	 */
	int NORMAL_USER = 7;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_USER__ROLE_NAME = ROLE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Privileges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_USER__PRIVILEGES = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Normal User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_USER_FEATURE_COUNT = ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Normal User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_USER_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.ecom.impl.PrivilegeImpl <em>Privilege</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.ecom.impl.PrivilegeImpl
	 * @see no.ntnu.tdt4250.ecom.impl.EcomPackageImpl#getPrivilege()
	 * @generated
	 */
	int PRIVILEGE = 8;

	/**
	 * The feature id for the '<em><b>Privilege</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVILEGE__PRIVILEGE = 0;

	/**
	 * The number of structural features of the '<em>Privilege</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVILEGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Privilege</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVILEGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.ecom.PrivilegeType <em>Privilege Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.ecom.PrivilegeType
	 * @see no.ntnu.tdt4250.ecom.impl.EcomPackageImpl#getPrivilegeType()
	 * @generated
	 */
	int PRIVILEGE_TYPE = 9;

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.ecom.Marketplace <em>Marketplace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marketplace</em>'.
	 * @see no.ntnu.tdt4250.ecom.Marketplace
	 * @generated
	 */
	EClass getMarketplace();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.ecom.Marketplace#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see no.ntnu.tdt4250.ecom.Marketplace#getItems()
	 * @see #getMarketplace()
	 * @generated
	 */
	EReference getMarketplace_Items();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.ecom.Marketplace#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Category</em>'.
	 * @see no.ntnu.tdt4250.ecom.Marketplace#getCategory()
	 * @see #getMarketplace()
	 * @generated
	 */
	EReference getMarketplace_Category();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.ecom.Marketplace#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Language</em>'.
	 * @see no.ntnu.tdt4250.ecom.Marketplace#getLanguage()
	 * @see #getMarketplace()
	 * @generated
	 */
	EReference getMarketplace_Language();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ecom.Marketplace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.ecom.Marketplace#getName()
	 * @see #getMarketplace()
	 * @generated
	 */
	EAttribute getMarketplace_Name();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.ecom.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see no.ntnu.tdt4250.ecom.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.ecom.User#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Items</em>'.
	 * @see no.ntnu.tdt4250.ecom.User#getItems()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Items();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ecom.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.ecom.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ecom.User#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see no.ntnu.tdt4250.ecom.User#getUsername()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Username();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.ecom.User#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see no.ntnu.tdt4250.ecom.User#getRole()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Role();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.ecom.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see no.ntnu.tdt4250.ecom.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.ecom.Item#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category</em>'.
	 * @see no.ntnu.tdt4250.ecom.Item#getCategory()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Category();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ecom.Item#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see no.ntnu.tdt4250.ecom.Item#getTitle()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Title();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ecom.Item#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see no.ntnu.tdt4250.ecom.Item#getPrice()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Price();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ecom.Item#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see no.ntnu.tdt4250.ecom.Item#getDescription()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Description();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ecom.Item#getPublished <em>Published</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Published</em>'.
	 * @see no.ntnu.tdt4250.ecom.Item#getPublished()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Published();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.ecom.Item#getSeller <em>Seller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Seller</em>'.
	 * @see no.ntnu.tdt4250.ecom.Item#getSeller()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Seller();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.ecom.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see no.ntnu.tdt4250.ecom.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ecom.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.ecom.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ecom.Category#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see no.ntnu.tdt4250.ecom.Category#getDescription()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Description();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.ecom.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see no.ntnu.tdt4250.ecom.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ecom.Role#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Name</em>'.
	 * @see no.ntnu.tdt4250.ecom.Role#getRoleName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_RoleName();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.ecom.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language</em>'.
	 * @see no.ntnu.tdt4250.ecom.Language
	 * @generated
	 */
	EClass getLanguage();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ecom.Language#getLanguageCode <em>Language Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language Code</em>'.
	 * @see no.ntnu.tdt4250.ecom.Language#getLanguageCode()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_LanguageCode();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ecom.Language#getLanguageName <em>Language Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language Name</em>'.
	 * @see no.ntnu.tdt4250.ecom.Language#getLanguageName()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_LanguageName();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ecom.Language#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see no.ntnu.tdt4250.ecom.Language#getCurrency()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Currency();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.ecom.Admin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin</em>'.
	 * @see no.ntnu.tdt4250.ecom.Admin
	 * @generated
	 */
	EClass getAdmin();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.ecom.Admin#getPrivileges <em>Privileges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Privileges</em>'.
	 * @see no.ntnu.tdt4250.ecom.Admin#getPrivileges()
	 * @see #getAdmin()
	 * @generated
	 */
	EReference getAdmin_Privileges();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.ecom.NormalUser <em>Normal User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal User</em>'.
	 * @see no.ntnu.tdt4250.ecom.NormalUser
	 * @generated
	 */
	EClass getNormalUser();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.ecom.NormalUser#getPrivileges <em>Privileges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Privileges</em>'.
	 * @see no.ntnu.tdt4250.ecom.NormalUser#getPrivileges()
	 * @see #getNormalUser()
	 * @generated
	 */
	EReference getNormalUser_Privileges();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.ecom.Privilege <em>Privilege</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Privilege</em>'.
	 * @see no.ntnu.tdt4250.ecom.Privilege
	 * @generated
	 */
	EClass getPrivilege();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.ecom.Privilege#getPrivilege <em>Privilege</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Privilege</em>'.
	 * @see no.ntnu.tdt4250.ecom.Privilege#getPrivilege()
	 * @see #getPrivilege()
	 * @generated
	 */
	EAttribute getPrivilege_Privilege();

	/**
	 * Returns the meta object for enum '{@link no.ntnu.tdt4250.ecom.PrivilegeType <em>Privilege Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Privilege Type</em>'.
	 * @see no.ntnu.tdt4250.ecom.PrivilegeType
	 * @generated
	 */
	EEnum getPrivilegeType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcomFactory getEcomFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.ecom.impl.MarketplaceImpl <em>Marketplace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.ecom.impl.MarketplaceImpl
		 * @see no.ntnu.tdt4250.ecom.impl.EcomPackageImpl#getMarketplace()
		 * @generated
		 */
		EClass MARKETPLACE = eINSTANCE.getMarketplace();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETPLACE__ITEMS = eINSTANCE.getMarketplace_Items();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETPLACE__CATEGORY = eINSTANCE.getMarketplace_Category();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETPLACE__LANGUAGE = eINSTANCE.getMarketplace_Language();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETPLACE__NAME = eINSTANCE.getMarketplace_Name();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.ecom.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.ecom.impl.UserImpl
		 * @see no.ntnu.tdt4250.ecom.impl.EcomPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__ITEMS = eINSTANCE.getUser_Items();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USERNAME = eINSTANCE.getUser_Username();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__ROLE = eINSTANCE.getUser_Role();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.ecom.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.ecom.impl.ItemImpl
		 * @see no.ntnu.tdt4250.ecom.impl.EcomPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__CATEGORY = eINSTANCE.getItem_Category();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__TITLE = eINSTANCE.getItem_Title();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__PRICE = eINSTANCE.getItem_Price();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__DESCRIPTION = eINSTANCE.getItem_Description();

		/**
		 * The meta object literal for the '<em><b>Published</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__PUBLISHED = eINSTANCE.getItem_Published();

		/**
		 * The meta object literal for the '<em><b>Seller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__SELLER = eINSTANCE.getItem_Seller();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.ecom.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.ecom.impl.CategoryImpl
		 * @see no.ntnu.tdt4250.ecom.impl.EcomPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__DESCRIPTION = eINSTANCE.getCategory_Description();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.ecom.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.ecom.impl.RoleImpl
		 * @see no.ntnu.tdt4250.ecom.impl.EcomPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Role Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__ROLE_NAME = eINSTANCE.getRole_RoleName();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.ecom.impl.LanguageImpl <em>Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.ecom.impl.LanguageImpl
		 * @see no.ntnu.tdt4250.ecom.impl.EcomPackageImpl#getLanguage()
		 * @generated
		 */
		EClass LANGUAGE = eINSTANCE.getLanguage();

		/**
		 * The meta object literal for the '<em><b>Language Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__LANGUAGE_CODE = eINSTANCE.getLanguage_LanguageCode();

		/**
		 * The meta object literal for the '<em><b>Language Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__LANGUAGE_NAME = eINSTANCE.getLanguage_LanguageName();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__CURRENCY = eINSTANCE.getLanguage_Currency();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.ecom.impl.AdminImpl <em>Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.ecom.impl.AdminImpl
		 * @see no.ntnu.tdt4250.ecom.impl.EcomPackageImpl#getAdmin()
		 * @generated
		 */
		EClass ADMIN = eINSTANCE.getAdmin();

		/**
		 * The meta object literal for the '<em><b>Privileges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMIN__PRIVILEGES = eINSTANCE.getAdmin_Privileges();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.ecom.impl.NormalUserImpl <em>Normal User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.ecom.impl.NormalUserImpl
		 * @see no.ntnu.tdt4250.ecom.impl.EcomPackageImpl#getNormalUser()
		 * @generated
		 */
		EClass NORMAL_USER = eINSTANCE.getNormalUser();

		/**
		 * The meta object literal for the '<em><b>Privileges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORMAL_USER__PRIVILEGES = eINSTANCE.getNormalUser_Privileges();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.ecom.impl.PrivilegeImpl <em>Privilege</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.ecom.impl.PrivilegeImpl
		 * @see no.ntnu.tdt4250.ecom.impl.EcomPackageImpl#getPrivilege()
		 * @generated
		 */
		EClass PRIVILEGE = eINSTANCE.getPrivilege();

		/**
		 * The meta object literal for the '<em><b>Privilege</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVILEGE__PRIVILEGE = eINSTANCE.getPrivilege_Privilege();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.ecom.PrivilegeType <em>Privilege Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.ecom.PrivilegeType
		 * @see no.ntnu.tdt4250.ecom.impl.EcomPackageImpl#getPrivilegeType()
		 * @generated
		 */
		EEnum PRIVILEGE_TYPE = eINSTANCE.getPrivilegeType();

	}

} //EcomPackage
