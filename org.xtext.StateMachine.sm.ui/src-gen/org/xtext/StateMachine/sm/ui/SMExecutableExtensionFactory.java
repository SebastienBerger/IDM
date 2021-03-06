/*
 * generated by Xtext
 */
package org.xtext.StateMachine.sm.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.xtext.StateMachine.sm.ui.internal.SMActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SMExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return SMActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return SMActivator.getInstance().getInjector(SMActivator.ORG_XTEXT_STATEMACHINE_SM_SM);
	}
	
}
