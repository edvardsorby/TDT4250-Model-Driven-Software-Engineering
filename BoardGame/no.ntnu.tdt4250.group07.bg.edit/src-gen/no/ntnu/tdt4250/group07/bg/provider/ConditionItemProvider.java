/**
 */
package no.ntnu.tdt4250.group07.bg.provider;

import java.util.Collection;
import java.util.List;

import no.ntnu.tdt4250.group07.bg.BgPackage;
import no.ntnu.tdt4250.group07.bg.Condition;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link no.ntnu.tdt4250.group07.bg.Condition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConditionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addBoardstatePropertyDescriptor(object);
			addRelativepositionPropertyDescriptor(object);
			addMandatoryPropertyDescriptor(object);
			addProhibitedPropertyDescriptor(object);
			addBricktypePropertyDescriptor(object);
			addBrickstatePropertyDescriptor(object);
			addCelltypePropertyDescriptor(object);
			addCellstatePropertyDescriptor(object);
			addLinePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Boardstate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBoardstatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Condition_boardstate_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Condition_boardstate_feature",
								"_UI_Condition_type"),
						BgPackage.Literals.CONDITION__BOARDSTATE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Relativeposition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelativepositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Condition_relativeposition_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Condition_relativeposition_feature",
								"_UI_Condition_type"),
						BgPackage.Literals.CONDITION__RELATIVEPOSITION, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Mandatory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMandatoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Condition_mandatory_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Condition_mandatory_feature",
								"_UI_Condition_type"),
						BgPackage.Literals.CONDITION__MANDATORY, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Prohibited feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProhibitedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Condition_prohibited_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Condition_prohibited_feature",
								"_UI_Condition_type"),
						BgPackage.Literals.CONDITION__PROHIBITED, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Bricktype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBricktypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Condition_bricktype_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Condition_bricktype_feature",
								"_UI_Condition_type"),
						BgPackage.Literals.CONDITION__BRICKTYPE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Brickstate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBrickstatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Condition_brickstate_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Condition_brickstate_feature",
								"_UI_Condition_type"),
						BgPackage.Literals.CONDITION__BRICKSTATE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Celltype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCelltypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Condition_celltype_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Condition_celltype_feature",
								"_UI_Condition_type"),
						BgPackage.Literals.CONDITION__CELLTYPE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Cellstate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCellstatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Condition_cellstate_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Condition_cellstate_feature",
								"_UI_Condition_type"),
						BgPackage.Literals.CONDITION__CELLSTATE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Line feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Condition_line_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Condition_line_feature",
								"_UI_Condition_type"),
						BgPackage.Literals.CONDITION__LINE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Condition_Name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Condition_Name_feature",
								"_UI_Condition_type"),
						BgPackage.Literals.CONDITION__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns Condition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Condition"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Condition) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Condition_type")
				: getString("_UI_Condition_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Condition.class)) {
		case BgPackage.CONDITION__MANDATORY:
		case BgPackage.CONDITION__PROHIBITED:
		case BgPackage.CONDITION__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BgEditPlugin.INSTANCE;
	}

}
