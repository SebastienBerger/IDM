/**
 */
package SimplStateMachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimplStateMachine.CompositeState#getStates <em>States</em>}</li>
 *   <li>{@link SimplStateMachine.CompositeState#getInitialState <em>Initial State</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimplStateMachine.SimplStateMachinePackage#getCompositeState()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='initialStateInComposite uniqueCompositeName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot initialStateInComposite='self.states->includes(self.initialState.referencedState)' uniqueCompositeName='self.states->forAll(s1 : State | self.states->forAll(s2 : State | s1.name = s2.name implies s1 = s2))'"
 * @generated
 */
public interface CompositeState extends State {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link SimplStateMachine.State}.
	 * It is bidirectional and its opposite is '{@link SimplStateMachine.State#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see SimplStateMachine.SimplStateMachinePackage#getCompositeState_States()
	 * @see SimplStateMachine.State#getContainer
	 * @model opposite="container" containment="true" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' containment reference.
	 * @see #setInitialState(InitialState)
	 * @see SimplStateMachine.SimplStateMachinePackage#getCompositeState_InitialState()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InitialState getInitialState();

	/**
	 * Sets the value of the '{@link SimplStateMachine.CompositeState#getInitialState <em>Initial State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' containment reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(InitialState value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.states->select(s : State | s.isActive)->size() = 1 and self.states->select(s : State | s.oclIsTypeOf(CompositeState))->forAll(s : State | if s.isActive then s.oclAsType(CompositeState).activeSubTree() else s.oclAsType(CompositeState).unactiveSubTree() endif)'"
	 * @generated
	 */
	boolean activeSubTree();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.states->forAll(s : State | not s.isActive) and self.states->select(s : State | s.oclIsTypeOf(CompositeState))->forAll(s : State | s.oclAsType(CompositeState).unactiveSubTree())'"
	 * @generated
	 */
	boolean unactiveSubTree();

} // CompositeState
