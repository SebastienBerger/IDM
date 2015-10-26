/**
 */
package SimplStateMachine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initial State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimplStateMachine.InitialState#getReferencedState <em>Referenced State</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimplStateMachine.SimplStateMachinePackage#getInitialState()
 * @model
 * @generated
 */
public interface InitialState extends EObject {
	/**
	 * Returns the value of the '<em><b>Referenced State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced State</em>' reference.
	 * @see #setReferencedState(State)
	 * @see SimplStateMachine.SimplStateMachinePackage#getInitialState_ReferencedState()
	 * @model required="true"
	 * @generated
	 */
	State getReferencedState();

	/**
	 * Sets the value of the '{@link SimplStateMachine.InitialState#getReferencedState <em>Referenced State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced State</em>' reference.
	 * @see #getReferencedState()
	 * @generated
	 */
	void setReferencedState(State value);

} // InitialState
