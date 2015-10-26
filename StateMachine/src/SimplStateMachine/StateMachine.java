/**
 */
package SimplStateMachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimplStateMachine.StateMachine#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link SimplStateMachine.StateMachine#getEvents <em>Events</em>}</li>
 *   <li>{@link SimplStateMachine.StateMachine#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimplStateMachine.SimplStateMachinePackage#getStateMachine()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='singleStateMachine noContainerForStatemachine activeStateHierarchyConsistency'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot singleStateMachine='StateMachine.allInstances()->size() = 1' noContainerForStatemachine='self.container.oclIsUndefined()' activeStateHierarchyConsistency='if self.isActive then self.activeSubTree() else self.unactiveSubTree() endif'"
 * @generated
 */
public interface StateMachine extends CompositeState {
	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link SimplStateMachine.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see SimplStateMachine.SimplStateMachinePackage#getStateMachine_Transitions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link SimplStateMachine.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see SimplStateMachine.SimplStateMachinePackage#getStateMachine_Events()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link SimplStateMachine.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see SimplStateMachine.SimplStateMachinePackage#getStateMachine_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

} // StateMachine
