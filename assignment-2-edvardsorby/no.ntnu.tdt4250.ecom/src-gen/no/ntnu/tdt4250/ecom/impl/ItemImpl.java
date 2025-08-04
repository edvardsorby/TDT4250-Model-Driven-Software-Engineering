/**
 */
package no.ntnu.tdt4250.ecom.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import no.ntnu.tdt4250.ecom.Category;
import no.ntnu.tdt4250.ecom.EcomPackage;
import no.ntnu.tdt4250.ecom.Item;
import no.ntnu.tdt4250.ecom.User;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.ecom.impl.ItemImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ecom.impl.ItemImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ecom.impl.ItemImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ecom.impl.ItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ecom.impl.ItemImpl#getPublished <em>Published</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.ecom.impl.ItemImpl#getSeller <em>Seller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemImpl extends MinimalEObjectImpl.Container implements Item {
	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected Category category;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final int PRICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected int price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublished() <em>Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublished()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar PUBLISHED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublished() <em>Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublished()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar published = PUBLISHED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSeller() <em>Seller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeller()
	 * @generated
	 * @ordered
	 */
	protected User seller;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcomPackage.Literals.ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getCategory() {
		if (category != null && category.eIsProxy()) {
			InternalEObject oldCategory = (InternalEObject) category;
			category = (Category) eResolveProxy(oldCategory);
			if (category != oldCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcomPackage.ITEM__CATEGORY, oldCategory,
							category));
			}
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(Category newCategory) {
		Category oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcomPackage.ITEM__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcomPackage.ITEM__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrice(int newPrice) {
		int oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcomPackage.ITEM__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcomPackage.ITEM__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getPublished() {
		return published;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublished(XMLGregorianCalendar newPublished) {
		XMLGregorianCalendar oldPublished = published;
		published = newPublished;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcomPackage.ITEM__PUBLISHED, oldPublished,
					published));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User getSeller() {
		if (seller != null && seller.eIsProxy()) {
			InternalEObject oldSeller = (InternalEObject) seller;
			seller = (User) eResolveProxy(oldSeller);
			if (seller != oldSeller) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcomPackage.ITEM__SELLER, oldSeller,
							seller));
			}
		}
		return seller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetSeller() {
		return seller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeller(User newSeller) {
		User oldSeller = seller;
		seller = newSeller;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcomPackage.ITEM__SELLER, oldSeller, seller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EcomPackage.ITEM__CATEGORY:
			if (resolve)
				return getCategory();
			return basicGetCategory();
		case EcomPackage.ITEM__TITLE:
			return getTitle();
		case EcomPackage.ITEM__PRICE:
			return getPrice();
		case EcomPackage.ITEM__DESCRIPTION:
			return getDescription();
		case EcomPackage.ITEM__PUBLISHED:
			return getPublished();
		case EcomPackage.ITEM__SELLER:
			if (resolve)
				return getSeller();
			return basicGetSeller();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EcomPackage.ITEM__CATEGORY:
			setCategory((Category) newValue);
			return;
		case EcomPackage.ITEM__TITLE:
			setTitle((String) newValue);
			return;
		case EcomPackage.ITEM__PRICE:
			setPrice((Integer) newValue);
			return;
		case EcomPackage.ITEM__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case EcomPackage.ITEM__PUBLISHED:
			setPublished((XMLGregorianCalendar) newValue);
			return;
		case EcomPackage.ITEM__SELLER:
			setSeller((User) newValue);
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
		case EcomPackage.ITEM__CATEGORY:
			setCategory((Category) null);
			return;
		case EcomPackage.ITEM__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case EcomPackage.ITEM__PRICE:
			setPrice(PRICE_EDEFAULT);
			return;
		case EcomPackage.ITEM__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case EcomPackage.ITEM__PUBLISHED:
			setPublished(PUBLISHED_EDEFAULT);
			return;
		case EcomPackage.ITEM__SELLER:
			setSeller((User) null);
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
		case EcomPackage.ITEM__CATEGORY:
			return category != null;
		case EcomPackage.ITEM__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case EcomPackage.ITEM__PRICE:
			return price != PRICE_EDEFAULT;
		case EcomPackage.ITEM__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case EcomPackage.ITEM__PUBLISHED:
			return PUBLISHED_EDEFAULT == null ? published != null : !PUBLISHED_EDEFAULT.equals(published);
		case EcomPackage.ITEM__SELLER:
			return seller != null;
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
		result.append(" (title: ");
		result.append(title);
		result.append(", price: ");
		result.append(price);
		result.append(", description: ");
		result.append(description);
		result.append(", published: ");
		result.append(published);
		result.append(')');
		return result.toString();
	}

} //ItemImpl
