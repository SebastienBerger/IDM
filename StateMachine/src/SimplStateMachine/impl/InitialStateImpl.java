/**
 */
package SimplStateMachine.impl;

import SimplStateMachine.InitialState;
import SimplStateMachine.SimplStateMachinePackage;
import SimplStateMachine.State;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initial State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SimplStateMachine.impl.InitialStateImpl#getReferencedState <em>Referenced State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InitialStateImpl extends MinimalEObjectImpl.Container implements InitialState {
	/**
	 * The cached value of the '{@link #getReferencedState() <em>Referenced State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedState()
	 * @generated
	 * @ordered
	 */
	protected State referencedState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplStateMachinePackage.Literals.INITIAL_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getReferencedState() {
		if (referencedState != null && referencedState.eIsProxy()) {
			InternalEObject oldReferencedState = (InternalEObject)referencedState;
			referencedState = (State)eResolveProxy(oldReferencedState);
			if (referencedState != oldReferencedState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplStateMachinePackage.INITIAL_STATE__REFERENCED_STATE, oldReferencedState, referencedState));
			}
		}
		return referencedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetReferencedState() {
		return referencedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedState(State newReferencedState) {
		State oldReferencedState = referencedState;
		referencedState = newReferencedState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplStateMachinePackage.INITIAL_STATE__REFERENCED_STATE, oldReferencedState, referencedState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplStateMachinePackage.INITIAL_STATE__REFERENCED_STATE:
				if (resolve) return getReferencedState();
				return basicGetReferencedState();
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
			case SimplStateMachinePackage.INITIAL_STATE__REFERENCED_STATE:
				setReferencedState((State)newValue);
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
			case SimplStateMachinePackage.INITIAL_STATE__REFERENCED_STATE:
				setReferencedState((State)null);
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
			case SimplStateMachinePackage.INITIAL_STATE__REFERENCED_STATE:
				return referencedState != null;
		}
		return super.eIsSet(featureID);
	}

} //InitialStateImpl
