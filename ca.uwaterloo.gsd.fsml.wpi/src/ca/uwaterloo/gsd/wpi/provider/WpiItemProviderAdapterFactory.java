/*******************************************************************************
 * Copyright (c) 2010 Michal Antkiewicz.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michal Antkiewicz - initial API and implementation
 ******************************************************************************/
/**
  *
 *
 *
 * $Id: WpiItemProviderAdapterFactory.java,v 1.12 2008/06/26 19:28:46 Michal Antkiewicz <mantkiew@gsd.uwaterloo.ca> $
 */
package ca.uwaterloo.gsd.wpi.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import ca.uwaterloo.gsd.wpi.util.WpiAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WpiItemProviderAdapterFactory extends WpiAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WpiItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.uwaterloo.gsd.wpi.WorkbenchPartInteractions} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkbenchPartInteractionsItemProvider workbenchPartInteractionsItemProvider;

	/**
	 * This creates an adapter for a {@link ca.uwaterloo.gsd.wpi.WorkbenchPartInteractions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkbenchPartInteractionsAdapter() {
		if (workbenchPartInteractionsItemProvider == null) {
			workbenchPartInteractionsItemProvider = new WorkbenchPartInteractionsItemProvider(this);
		}

		return workbenchPartInteractionsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.uwaterloo.gsd.wpi.ViewPart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewPartItemProvider viewPartItemProvider;

	/**
	 * This creates an adapter for a {@link ca.uwaterloo.gsd.wpi.ViewPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createViewPartAdapter() {
		if (viewPartItemProvider == null) {
			viewPartItemProvider = new ViewPartItemProvider(this);
		}

		return viewPartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.uwaterloo.gsd.wpi.ImplementsIViewPart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementsIViewPartItemProvider implementsIViewPartItemProvider;

	/**
	 * This creates an adapter for a {@link ca.uwaterloo.gsd.wpi.ImplementsIViewPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImplementsIViewPartAdapter() {
		if (implementsIViewPartItemProvider == null) {
			implementsIViewPartItemProvider = new ImplementsIViewPartItemProvider(this);
		}

		return implementsIViewPartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.uwaterloo.gsd.wpi.ExtendsViewPart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendsViewPartItemProvider extendsViewPartItemProvider;

	/**
	 * This creates an adapter for a {@link ca.uwaterloo.gsd.wpi.ExtendsViewPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExtendsViewPartAdapter() {
		if (extendsViewPartItemProvider == null) {
			extendsViewPartItemProvider = new ExtendsViewPartItemProvider(this);
		}

		return extendsViewPartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.uwaterloo.gsd.wpi.EditorPart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EditorPartItemProvider editorPartItemProvider;

	/**
	 * This creates an adapter for a {@link ca.uwaterloo.gsd.wpi.EditorPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEditorPartAdapter() {
		if (editorPartItemProvider == null) {
			editorPartItemProvider = new EditorPartItemProvider(this);
		}

		return editorPartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.uwaterloo.gsd.wpi.Contributor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContributorItemProvider contributorItemProvider;

	/**
	 * This creates an adapter for a {@link ca.uwaterloo.gsd.wpi.Contributor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContributorAdapter() {
		if (contributorItemProvider == null) {
			contributorItemProvider = new ContributorItemProvider(this);
		}

		return contributorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.uwaterloo.gsd.wpi.ExtendsEditorActionBarContributor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendsEditorActionBarContributorItemProvider extendsEditorActionBarContributorItemProvider;

	/**
	 * This creates an adapter for a {@link ca.uwaterloo.gsd.wpi.ExtendsEditorActionBarContributor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExtendsEditorActionBarContributorAdapter() {
		if (extendsEditorActionBarContributorItemProvider == null) {
			extendsEditorActionBarContributorItemProvider = new ExtendsEditorActionBarContributorItemProvider(this);
		}

		return extendsEditorActionBarContributorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.uwaterloo.gsd.wpi.ImplementsIEditorPart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementsIEditorPartItemProvider implementsIEditorPartItemProvider;

	/**
	 * This creates an adapter for a {@link ca.uwaterloo.gsd.wpi.ImplementsIEditorPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImplementsIEditorPartAdapter() {
		if (implementsIEditorPartItemProvider == null) {
			implementsIEditorPartItemProvider = new ImplementsIEditorPartItemProvider(this);
		}

		return implementsIEditorPartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.uwaterloo.gsd.wpi.ExtendsEditorPart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendsEditorPartItemProvider extendsEditorPartItemProvider;

	/**
	 * This creates an adapter for a {@link ca.uwaterloo.gsd.wpi.ExtendsEditorPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExtendsEditorPartAdapter() {
		if (extendsEditorPartItemProvider == null) {
			extendsEditorPartItemProvider = new ExtendsEditorPartItemProvider(this);
		}

		return extendsEditorPartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.uwaterloo.gsd.wpi.SelectionProvider} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionProviderItemProvider selectionProviderItemProvider;

	/**
	 * This creates an adapter for a {@link ca.uwaterloo.gsd.wpi.SelectionProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSelectionProviderAdapter() {
		if (selectionProviderItemProvider == null) {
			selectionProviderItemProvider = new SelectionProviderItemProvider(this);
		}

		return selectionProviderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.uwaterloo.gsd.wpi.RegistersAsSelectionProvider} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistersAsSelectionProviderItemProvider registersAsSelectionProviderItemProvider;

	/**
	 * This creates an adapter for a {@link ca.uwaterloo.gsd.wpi.RegistersAsSelectionProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRegistersAsSelectionProviderAdapter() {
		if (registersAsSelectionProviderItemProvider == null) {
			registersAsSelectionProviderItemProvider = new RegistersAsSelectionProviderItemProvider(this);
		}

		return registersAsSelectionProviderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.uwaterloo.gsd.wpi.ThisSelectionProvider} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThisSelectionProviderItemProvider thisSelectionProviderItemProvider;

	/**
	 * This creates an adapter for a {@link ca.uwaterloo.gsd.wpi.ThisSelectionProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createThisSelectionProviderAdapter() {
		if (thisSelectionProviderItemProvider == null) {
			thisSelectionProviderItemProvider = new ThisSelectionProviderItemProvider(this);
		}

		return thisSelectionProviderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.uwaterloo.gsd.wpi.FieldSelectionProvider} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldSelectionProviderItemProvider fieldSelectionProviderItemProvider;

	/**
	 * This creates an adapter for a {@link ca.uwaterloo.gsd.wpi.FieldSelectionProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFieldSelectionProviderAdapter() {
		if (fieldSelectionProviderItemProvider == null) {
			fieldSelectionProviderItemProvider = new FieldSelectionProviderItemProvider(this);
		}

		return fieldSelectionProviderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.uwaterloo.gsd.wpi.SelectionListener} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionListenerItemProvider selectionListenerItemProvider;

	/**
	 * This creates an adapter for a {@link ca.uwaterloo.gsd.wpi.SelectionListener}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSelectionListenerAdapter() {
		if (selectionListenerItemProvider == null) {
			selectionListenerItemProvider = new SelectionListenerItemProvider(this);
		}

		return selectionListenerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.uwaterloo.gsd.wpi.RegistersAs} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistersAsItemProvider registersAsItemProvider;

	/**
	 * This creates an adapter for a {@link ca.uwaterloo.gsd.wpi.RegistersAs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRegistersAsAdapter() {
		if (registersAsItemProvider == null) {
			registersAsItemProvider = new RegistersAsItemProvider(this);
		}

		return registersAsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.uwaterloo.gsd.wpi.GlobalSelectionListener} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalSelectionListenerItemProvider globalSelectionListenerItemProvider;

	/**
	 * This creates an adapter for a {@link ca.uwaterloo.gsd.wpi.GlobalSelectionListener}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGlobalSelectionListenerAdapter() {
		if (globalSelectionListenerItemProvider == null) {
			globalSelectionListenerItemProvider = new GlobalSelectionListenerItemProvider(this);
		}

		return globalSelectionListenerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.uwaterloo.gsd.wpi.GlobalPostSelectionListener} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalPostSelectionListenerItemProvider globalPostSelectionListenerItemProvider;

	/**
	 * This creates an adapter for a {@link ca.uwaterloo.gsd.wpi.GlobalPostSelectionListener}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGlobalPostSelectionListenerAdapter() {
		if (globalPostSelectionListenerItemProvider == null) {
			globalPostSelectionListenerItemProvider = new GlobalPostSelectionListenerItemProvider(this);
		}

		return globalPostSelectionListenerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.uwaterloo.gsd.wpi.SpecificSelectionListener} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificSelectionListenerItemProvider specificSelectionListenerItemProvider;

	/**
	 * This creates an adapter for a {@link ca.uwaterloo.gsd.wpi.SpecificSelectionListener}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSpecificSelectionListenerAdapter() {
		if (specificSelectionListenerItemProvider == null) {
			specificSelectionListenerItemProvider = new SpecificSelectionListenerItemProvider(this);
		}

		return specificSelectionListenerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.uwaterloo.gsd.wpi.DeregistersSamePartId} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeregistersSamePartIdItemProvider deregistersSamePartIdItemProvider;

	/**
	 * This creates an adapter for a {@link ca.uwaterloo.gsd.wpi.DeregistersSamePartId}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeregistersSamePartIdAdapter() {
		if (deregistersSamePartIdItemProvider == null) {
			deregistersSamePartIdItemProvider = new DeregistersSamePartIdItemProvider(this);
		}

		return deregistersSamePartIdItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.uwaterloo.gsd.wpi.PartListener} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartListenerItemProvider partListenerItemProvider;

	/**
	 * This creates an adapter for a {@link ca.uwaterloo.gsd.wpi.PartListener}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPartListenerAdapter() {
		if (partListenerItemProvider == null) {
			partListenerItemProvider = new PartListenerItemProvider(this);
		}

		return partListenerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.uwaterloo.gsd.wpi.RegistersAPartListener} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistersAPartListenerItemProvider registersAPartListenerItemProvider;

	/**
	 * This creates an adapter for a {@link ca.uwaterloo.gsd.wpi.RegistersAPartListener}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRegistersAPartListenerAdapter() {
		if (registersAPartListenerItemProvider == null) {
			registersAPartListenerItemProvider = new RegistersAPartListenerItemProvider(this);
		}

		return registersAPartListenerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.uwaterloo.gsd.wpi.RegistersAsPartListener} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistersAsPartListenerItemProvider registersAsPartListenerItemProvider;

	/**
	 * This creates an adapter for a {@link ca.uwaterloo.gsd.wpi.RegistersAsPartListener}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRegistersAsPartListenerAdapter() {
		if (registersAsPartListenerItemProvider == null) {
			registersAsPartListenerItemProvider = new RegistersAsPartListenerItemProvider(this);
		}

		return registersAsPartListenerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.uwaterloo.gsd.wpi.RegistersAsPartListener2} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistersAsPartListener2ItemProvider registersAsPartListener2ItemProvider;

	/**
	 * This creates an adapter for a {@link ca.uwaterloo.gsd.wpi.RegistersAsPartListener2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRegistersAsPartListener2Adapter() {
		if (registersAsPartListener2ItemProvider == null) {
			registersAsPartListener2ItemProvider = new RegistersAsPartListener2ItemProvider(this);
		}

		return registersAsPartListener2ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.uwaterloo.gsd.wpi.Deregisters} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeregistersItemProvider deregistersItemProvider;

	/**
	 * This creates an adapter for a {@link ca.uwaterloo.gsd.wpi.Deregisters}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeregistersAdapter() {
		if (deregistersItemProvider == null) {
			deregistersItemProvider = new DeregistersItemProvider(this);
		}

		return deregistersItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.uwaterloo.gsd.wpi.DeregistersSameObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeregistersSameObjectItemProvider deregistersSameObjectItemProvider;

	/**
	 * This creates an adapter for a {@link ca.uwaterloo.gsd.wpi.DeregistersSameObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeregistersSameObjectAdapter() {
		if (deregistersSameObjectItemProvider == null) {
			deregistersSameObjectItemProvider = new DeregistersSameObjectItemProvider(this);
		}

		return deregistersSameObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.uwaterloo.gsd.wpi.AdapterRequestor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdapterRequestorItemProvider adapterRequestorItemProvider;

	/**
	 * This creates an adapter for a {@link ca.uwaterloo.gsd.wpi.AdapterRequestor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAdapterRequestorAdapter() {
		if (adapterRequestorItemProvider == null) {
			adapterRequestorItemProvider = new AdapterRequestorItemProvider(this);
		}

		return adapterRequestorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.uwaterloo.gsd.wpi.RequestsAdapter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestsAdapterItemProvider requestsAdapterItemProvider;

	/**
	 * This creates an adapter for a {@link ca.uwaterloo.gsd.wpi.RequestsAdapter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRequestsAdapterAdapter() {
		if (requestsAdapterItemProvider == null) {
			requestsAdapterItemProvider = new RequestsAdapterItemProvider(this);
		}

		return requestsAdapterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.uwaterloo.gsd.wpi.AdapterProvider} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdapterProviderItemProvider adapterProviderItemProvider;

	/**
	 * This creates an adapter for a {@link ca.uwaterloo.gsd.wpi.AdapterProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAdapterProviderAdapter() {
		if (adapterProviderItemProvider == null) {
			adapterProviderItemProvider = new AdapterProviderItemProvider(this);
		}

		return adapterProviderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.uwaterloo.gsd.wpi.ProvidesAdapter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidesAdapterItemProvider providesAdapterItemProvider;

	/**
	 * This creates an adapter for a {@link ca.uwaterloo.gsd.wpi.ProvidesAdapter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProvidesAdapterAdapter() {
		if (providesAdapterItemProvider == null) {
			providesAdapterItemProvider = new ProvidesAdapterItemProvider(this);
		}

		return providesAdapterItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (workbenchPartInteractionsItemProvider != null) workbenchPartInteractionsItemProvider.dispose();
		if (viewPartItemProvider != null) viewPartItemProvider.dispose();
		if (implementsIViewPartItemProvider != null) implementsIViewPartItemProvider.dispose();
		if (extendsViewPartItemProvider != null) extendsViewPartItemProvider.dispose();
		if (editorPartItemProvider != null) editorPartItemProvider.dispose();
		if (contributorItemProvider != null) contributorItemProvider.dispose();
		if (extendsEditorActionBarContributorItemProvider != null) extendsEditorActionBarContributorItemProvider.dispose();
		if (implementsIEditorPartItemProvider != null) implementsIEditorPartItemProvider.dispose();
		if (extendsEditorPartItemProvider != null) extendsEditorPartItemProvider.dispose();
		if (selectionProviderItemProvider != null) selectionProviderItemProvider.dispose();
		if (registersAsSelectionProviderItemProvider != null) registersAsSelectionProviderItemProvider.dispose();
		if (thisSelectionProviderItemProvider != null) thisSelectionProviderItemProvider.dispose();
		if (fieldSelectionProviderItemProvider != null) fieldSelectionProviderItemProvider.dispose();
		if (selectionListenerItemProvider != null) selectionListenerItemProvider.dispose();
		if (registersAsItemProvider != null) registersAsItemProvider.dispose();
		if (globalSelectionListenerItemProvider != null) globalSelectionListenerItemProvider.dispose();
		if (globalPostSelectionListenerItemProvider != null) globalPostSelectionListenerItemProvider.dispose();
		if (specificSelectionListenerItemProvider != null) specificSelectionListenerItemProvider.dispose();
		if (deregistersSamePartIdItemProvider != null) deregistersSamePartIdItemProvider.dispose();
		if (partListenerItemProvider != null) partListenerItemProvider.dispose();
		if (registersAPartListenerItemProvider != null) registersAPartListenerItemProvider.dispose();
		if (registersAsPartListenerItemProvider != null) registersAsPartListenerItemProvider.dispose();
		if (registersAsPartListener2ItemProvider != null) registersAsPartListener2ItemProvider.dispose();
		if (deregistersItemProvider != null) deregistersItemProvider.dispose();
		if (deregistersSameObjectItemProvider != null) deregistersSameObjectItemProvider.dispose();
		if (adapterProviderItemProvider != null) adapterProviderItemProvider.dispose();
		if (providesAdapterItemProvider != null) providesAdapterItemProvider.dispose();
		if (adapterRequestorItemProvider != null) adapterRequestorItemProvider.dispose();
		if (requestsAdapterItemProvider != null) requestsAdapterItemProvider.dispose();
	}

}
