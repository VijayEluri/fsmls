/**
 * Copyright (c) 2002-2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   Michal Antkiewicz - modifications
 */
package ca.uwaterloo.gsd.fsml.ecoreview.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedImage;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * @author Michal Antkiewicz <mantkiew@gsd.uwaterloo.ca>
 * 
 * This is the item provider adapter for a {@link org.eclipse.emf.ecore.EStructuralFeature} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EStructuralFeatureItemProvider
  extends ETypedElementItemProvider
  implements
    IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeatureItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

      addChangeablePropertyDescriptor(object);
      addVolatilePropertyDescriptor(object);
      addTransientPropertyDescriptor(object);
      addDefaultValueLiteralPropertyDescriptor(object);
      addDefaultValuePropertyDescriptor(object);
      addUnsettablePropertyDescriptor(object);
      addDerivedPropertyDescriptor(object);
      addEContainingClassPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Changeable feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addChangeablePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EStructuralFeature_changeable_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_EStructuralFeature_changeable_feature", "_UI_EStructuralFeature_type"),
         EcorePackage.Literals.ESTRUCTURAL_FEATURE__CHANGEABLE,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Volatile feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addVolatilePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EStructuralFeature_volatile_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_EStructuralFeature_volatile_feature", "_UI_EStructuralFeature_type"),
         EcorePackage.Literals.ESTRUCTURAL_FEATURE__VOLATILE,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Transient feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addTransientPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EStructuralFeature_transient_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_EStructuralFeature_transient_feature", "_UI_EStructuralFeature_type"),
         EcorePackage.Literals.ESTRUCTURAL_FEATURE__TRANSIENT,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Default Value Literal feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addDefaultValueLiteralPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EStructuralFeature_defaultValueLiteral_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_EStructuralFeature_defaultValueLiteral_feature", "_UI_EStructuralFeature_type"),
         EcorePackage.Literals.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Default Value feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addDefaultValuePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EStructuralFeature_defaultValue_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_EStructuralFeature_defaultValue_feature", "_UI_EStructuralFeature_type"),
         EcorePackage.Literals.ESTRUCTURAL_FEATURE__DEFAULT_VALUE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Unsettable feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addUnsettablePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EStructuralFeature_unsettable_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_EStructuralFeature_unsettable_feature", "_UI_EStructuralFeature_type"),
         EcorePackage.Literals.ESTRUCTURAL_FEATURE__UNSETTABLE,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Derived feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addDerivedPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EStructuralFeature_derived_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_EStructuralFeature_derived_feature", "_UI_EStructuralFeature_type"),
         EcorePackage.Literals.ESTRUCTURAL_FEATURE__DERIVED,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the EContaining Class feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addEContainingClassPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EStructuralFeature_eContainingClass_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_EStructuralFeature_eContainingClass_feature", "_UI_EStructuralFeature_type"),
         EcorePackage.Literals.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS,
         false,
         false,
         false,
         null,
         null,
         null));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getText(Object object)
  {
    String label = ((EStructuralFeature)object).getName();
    return label == null || label.length() == 0 ?
      getString("_UI_EStructuralFeature_type") :
      getString("_UI_EStructuralFeature_type") + " " + label;
  }

  public Object getComposedImage(Object object, Object imageToCompose)
  {
    EStructuralFeature eStructuralFeature = (EStructuralFeature)object;
    Collection images = new ArrayList();
    
    images.add(imageToCompose);
    String imageName = "full/obj16/EOccurrence";
    int minOccurs = eStructuralFeature.getLowerBound();
    int maxOccurs = eStructuralFeature.getUpperBound();
    if (minOccurs >= 0 && (minOccurs <= maxOccurs || maxOccurs == -1))
    {
      switch (minOccurs)
      {
        case 0:
        {
          imageName += "Zero";
          break;
        }
        case 1:
        {
          imageName += "One";
          break;
        }
        default:
        {
          imageName += "N";
          break;
        }
      }

      if (minOccurs != maxOccurs)
      {
        switch (maxOccurs)
        {
          case -1:
          {
            imageName += "ToUnbounded";
            break;
          }
          case 0:
          {
            break;
          }
          case 1:
          {
            imageName += "ToOne";
            break;
          }
          default:
          {
            imageName += minOccurs <= 1 ? "ToN" : "ToM";
            break;
          }
        }
      }
    }
    else
    {
      imageName += "NToM";
    }

    if (!imageName.equals("full/obj16/EOccurrenceZeroToOne"))
    {
      images.add(EcoreEditPlugin.INSTANCE.getImage(imageName));
    }
    
    if (eStructuralFeature.getEAnnotation("key") != null)
		  images.add(getResourceLocator().getImage("full/obj16/key"));
  
    if (eStructuralFeature.getEAnnotation("essential") != null)
		  images.add(getResourceLocator().getImage("full/obj16/essential"));
    
    return 
      new ComposedImage(images)
      {
        public List getDrawPoints(Size size)
        {
          List result = super.getDrawPoints(size);
          if (result.size() > 1)
          {
            ((Point)result.get(0)).y = -2;
          }
          return result;
        }
      };
  }


  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void notifyChanged(Notification notification)
  {
    updateChildren(notification);

    switch (notification.getFeatureID(EStructuralFeature.class))
    {
      case EcorePackage.ESTRUCTURAL_FEATURE__CHANGEABLE:
      case EcorePackage.ESTRUCTURAL_FEATURE__VOLATILE:
      case EcorePackage.ESTRUCTURAL_FEATURE__TRANSIENT:
      case EcorePackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL:
      case EcorePackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE:
      case EcorePackage.ESTRUCTURAL_FEATURE__UNSETTABLE:
      case EcorePackage.ESTRUCTURAL_FEATURE__DERIVED:
      case EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s
   * describing all of the children that can be created under this object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);
  }

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceLocator getResourceLocator()
  {
    return EcoreEditPlugin.INSTANCE;
  }

}
