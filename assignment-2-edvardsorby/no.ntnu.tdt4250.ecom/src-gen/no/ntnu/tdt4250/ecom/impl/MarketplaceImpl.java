/**
 */
package no.ntnu.tdt4250.ecom.impl;

import java.util.Collection;

import no.ntnu.tdt4250.ecom.Category;
import no.ntnu.tdt4250.ecom.EcomPackage;
import no.ntnu.tdt4250.ecom.Item;
import no.ntnu.tdt4250.ecom.Language;
import no.ntnu.tdt4250.ecom.Marketplace;
import no.ntnu.tdt4250.ecom.Role;
import no.ntnu.tdt4250.ecom.User;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Marketplace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.ecom.impl.MarketplaceImpl#getItems <em>Items</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ecom.impl.MarketplaceImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ecom.impl.MarketplaceImpl#getLanguages <em>Languages</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ecom.impl.MarketplaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ecom.impl.MarketplaceImpl#getNumberOfItems <em>Number Of Items</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ecom.impl.MarketplaceImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ecom.impl.MarketplaceImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarketplaceImpl extends MinimalEObjectImpl.Container implements Marketplace {
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> items;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> categories;

	/**
	 * The cached value of the '{@link #getLanguages() <em>Languages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<Language> languages;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfItems() <em>Number Of Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfItems()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_ITEMS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> users;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarketplaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcomPackage.Literals.MARKETPLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Item> getItems() {
		if (items == null) {
			items = new EObjectResolvingEList<Item>(Item.class, this, EcomPackage.MARKETPLACE__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Category> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList<Category>(Category.class, this,
					EcomPackage.MARKETPLACE__CATEGORIES);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Language> getLanguages() {
		if (languages == null) {
			languages = new EObjectContainmentEList<Language>(Language.class, this, EcomPackage.MARKETPLACE__LANGUAGES);
		}
		return languages;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcomPackage.MARKETPLACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int getNumberOfItems() {
		return this.getItems().size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<User> getUsers() {
		if (users == null) {
			users = new EObjectContainmentEList<User>(User.class, this, EcomPackage.MARKETPLACE__USERS);
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, EcomPackage.MARKETPLACE__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcomPackage.MARKETPLACE__CATEGORIES:
			return ((InternalEList<?>) getCategories()).basicRemove(otherEnd, msgs);
		case EcomPackage.MARKETPLACE__LANGUAGES:
			return ((InternalEList<?>) getLanguages()).basicRemove(otherEnd, msgs);
		case EcomPackage.MARKETPLACE__USERS:
			return ((InternalEList<?>) getUsers()).basicRemove(otherEnd, msgs);
		case EcomPackage.MARKETPLACE__ROLES:
			return ((InternalEList<?>) getRoles()).basicRemove(otherEnd, msgs);
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
		case EcomPackage.MARKETPLACE__ITEMS:
			return getItems();
		case EcomPackage.MARKETPLACE__CATEGORIES:
			return getCategories();
		case EcomPackage.MARKETPLACE__LANGUAGES:
			return getLanguages();
		case EcomPackage.MARKETPLACE__NAME:
			return getName();
		case EcomPackage.MARKETPLACE__NUMBER_OF_ITEMS:
			return getNumberOfItems();
		case EcomPackage.MARKETPLACE__USERS:
			return getUsers();
		case EcomPackage.MARKETPLACE__ROLES:
			return getRoles();
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
		case EcomPackage.MARKETPLACE__ITEMS:
			getItems().clear();
			getItems().addAll((Collection<? extends Item>) newValue);
			return;
		case EcomPackage.MARKETPLACE__CATEGORIES:
			getCategories().clear();
			getCategories().addAll((Collection<? extends Category>) newValue);
			return;
		case EcomPackage.MARKETPLACE__LANGUAGES:
			getLanguages().clear();
			getLanguages().addAll((Collection<? extends Language>) newValue);
			return;
		case EcomPackage.MARKETPLACE__NAME:
			setName((String) newValue);
			return;
		case EcomPackage.MARKETPLACE__USERS:
			getUsers().clear();
			getUsers().addAll((Collection<? extends User>) newValue);
			return;
		case EcomPackage.MARKETPLACE__ROLES:
			getRoles().clear();
			getRoles().addAll((Collection<? extends Role>) newValue);
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
		case EcomPackage.MARKETPLACE__ITEMS:
			getItems().clear();
			return;
		case EcomPackage.MARKETPLACE__CATEGORIES:
			getCategories().clear();
			return;
		case EcomPackage.MARKETPLACE__LANGUAGES:
			getLanguages().clear();
			return;
		case EcomPackage.MARKETPLACE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EcomPackage.MARKETPLACE__USERS:
			getUsers().clear();
			return;
		case EcomPackage.MARKETPLACE__ROLES:
			getRoles().clear();
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
		case EcomPackage.MARKETPLACE__ITEMS:
			return items != null && !items.isEmpty();
		case EcomPackage.MARKETPLACE__CATEGORIES:
			return categories != null && !categories.isEmpty();
		case EcomPackage.MARKETPLACE__LANGUAGES:
			return languages != null && !languages.isEmpty();
		case EcomPackage.MARKETPLACE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EcomPackage.MARKETPLACE__NUMBER_OF_ITEMS:
			return getNumberOfItems() != NUMBER_OF_ITEMS_EDEFAULT;
		case EcomPackage.MARKETPLACE__USERS:
			return users != null && !users.isEmpty();
		case EcomPackage.MARKETPLACE__ROLES:
			return roles != null && !roles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MarketplaceImpl
