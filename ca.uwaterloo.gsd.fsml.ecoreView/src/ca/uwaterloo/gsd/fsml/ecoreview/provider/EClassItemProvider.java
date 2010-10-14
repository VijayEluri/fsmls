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
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
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
 * This is the item provider adapter for a {@link org.eclipse.emf.ecore.EClass} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EClassItemProvider
  extends EClassifierItemProvider
  implements
    IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClassItemProvider(AdapterFactory adapterFactory)
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

      addAbstractPropertyDescriptor(object);
      addInterfacePropertyDescriptor(object);
      addESuperTypesPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Abstract feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addAbstractPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EClass_abstract_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_EClass_abstract_feature", "_UI_EClass_type"),
         EcorePackage.Literals.ECLASS__ABSTRACT,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Interface feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addInterfacePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EClass_interface_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_EClass_interface_feature", "_UI_EClass_type"),
         EcorePackage.Literals.ECLASS__INTERFACE,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the ESuper Types feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  protected void addESuperTypesPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EClass_eSuperTypes_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_EClass_eSuperTypes_feature", "_UI_EClass_type"),
         EcorePackage.Literals.ECLASS__ESUPER_TYPES,
         true,
         false,
         true,
         null,
         null,
         null)
       {
         public Collection getChoiceOfValues(Object object)
         {
           EClass eClass = (EClass)object;
           
           // Filter out classes that aren't permitted.
           //
           Collection result = super.getChoiceOfValues(object);
           result.removeAll(EcorePackage.eINSTANCE.getEClassifiers());
           for (Iterator i = result.iterator(); i.hasNext(); )
           {
             EClass otherEClass = (EClass)i.next();
             if (otherEClass == eClass || otherEClass.getEAllSuperTypes().contains(eClass))
             {
               i.remove();
             }
           }
           return result;
         }
       });
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Collection getChildrenFeatures(Object object)
  {
    if (childrenFeatures == null)
    {
      super.getChildrenFeatures(object);
      childrenFeatures.add(EcorePackage.Literals.ECLASS__EOPERATIONS);
      childrenFeatures.add(EcorePackage.Literals.ECLASS__ESTRUCTURAL_FEATURES);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns EClass.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public Object getImage(Object object)
  {
	  Collection images = new ArrayList();
	  
	  EClass eClass = (EClass) object;
	  
	  images.add(getResourceLocator().getImage(
				(eClass.isAbstract() || eClass.isInterface()) ? "full/obj16/AbstractEClass" : "full/obj16/EClass"));
	  
	  if (eClass.getEAnnotation("parentKey") != null)
		  images.add(getResourceLocator().getImage("full/obj16/parentKey"));
	  if (eClass.getEAnnotation("indexKey") != null)
		  images.add(getResourceLocator().getImage("full/obj16/indexKey"));
	  
	  return new ComposedImage(images);
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String getText(Object object)
  {
    EClass eClass = (EClass)object;
    StringBuffer result = new StringBuffer();
    
    // Michal: handle feature group
    EAnnotation featureGroup = getEAnnotation(eClass, "featureGroup");
    if (featureGroup != null) {
    	String min = (String) featureGroup.getDetails().get("lowerBound");
    	String max = (String) featureGroup.getDetails().get("upperBound");
    	String essentialDetail = (String) featureGroup.getDetails().get("essential");
    	boolean essential = (essentialDetail != null && essentialDetail.equals("true"));
    	
    	result.append((essential ? "!" : "") + "<" + min + "-" + max + "> ");
    }
    
    if (eClass.getName() != null)
    {
      result.append(eClass.getName());
    }
    if (!eClass.getESuperTypes().isEmpty())
    {
    	boolean firstSuperType = true;
      
      for (Iterator i = eClass.getESuperTypes().iterator(); i.hasNext(); )
      {
        EClass eSuperType = (EClass)i.next();
        String eSuperTypeName = eSuperType.getName();
        if (!eSuperTypeName.equals("Concept") && !eSuperTypeName.equals("Model")) {
	        if (firstSuperType) {
	        	result.append(" -> ");
	        	firstSuperType = false;
	        }
	        else
	        	result.append(", ");
        	result.append(eSuperTypeName);
        }
      }
    }
    if (eClass.getInstanceClassName() != null)
    {
      result.append(" <");
      result.append(eClass.getInstanceClassName());
      result.append(">");
    }
    
    return result.toString();
  }
  /**
	 * @param modelElement
	 * @param source
	 * @return EAnnotation for given modelElement. If modelElement is a class try retrieving the annotation from superclasses.
	 */
	public static EAnnotation getEAnnotation(EModelElement modelElement, String source) {
		EAnnotation annotation = modelElement.getEAnnotation(source);
		if (annotation != null)
			return annotation;
		
		// look for inherited annotations
		if (modelElement instanceof EClass) {
			EClass eClass = (EClass) modelElement;
			for (Object aux : eClass.getEAllSuperTypes()) {
				EClass superType = (EClass) aux;
				annotation = superType.getEAnnotation(source);
				if (annotation != null)
					return annotation;
			}
		}
		
		return annotation;
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

    switch (notification.getFeatureID(EClass.class))
    {
      case EcorePackage.ECLASS__ABSTRACT:
      case EcorePackage.ECLASS__INTERFACE:
      case EcorePackage.ECLASS__ESUPER_TYPES:
      case EcorePackage.ECLASS__EREFERENCES:
      case EcorePackage.ECLASS__EATTRIBUTES:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case EcorePackage.ECLASS__EOPERATIONS:
      case EcorePackage.ECLASS__ESTRUCTURAL_FEATURES:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

    newChildDescriptors.add
      (createChildParameter
        (EcorePackage.Literals.ECLASS__EOPERATIONS,
         EcoreFactory.eINSTANCE.createEOperation()));

    newChildDescriptors.add
      (createChildParameter
        (EcorePackage.Literals.ECLASS__ESTRUCTURAL_FEATURES,
         EcoreFactory.eINSTANCE.createEAttribute()));

    newChildDescriptors.add
      (createChildParameter
        (EcorePackage.Literals.ECLASS__ESTRUCTURAL_FEATURES,
         EcoreFactory.eINSTANCE.createEReference()));
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
