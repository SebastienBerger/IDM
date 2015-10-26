/**
 */
package SimplStateMachine.util;

import SimplStateMachine.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see SimplStateMachine.SimplStateMachinePackage
 * @generated
 */
public class SimplStateMachineValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SimplStateMachineValidator INSTANCE = new SimplStateMachineValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "SimplStateMachine";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplStateMachineValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SimplStateMachinePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SimplStateMachinePackage.STATE_MACHINE:
				return validateStateMachine((StateMachine)value, diagnostics, context);
			case SimplStateMachinePackage.STATE:
				return validateState((State)value, diagnostics, context);
			case SimplStateMachinePackage.COMPOSITE_STATE:
				return validateCompositeState((CompositeState)value, diagnostics, context);
			case SimplStateMachinePackage.INITIAL_STATE:
				return validateInitialState((InitialState)value, diagnostics, context);
			case SimplStateMachinePackage.TRANSITION:
				return validateTransition((Transition)value, diagnostics, context);
			case SimplStateMachinePackage.EVENT:
				return validateEvent((Event)value, diagnostics, context);
			case SimplStateMachinePackage.EXPRESSION_ELEMENT:
				return validateExpressionElement((ExpressionElement)value, diagnostics, context);
			case SimplStateMachinePackage.EXPRESSION:
				return validateExpression((Expression)value, diagnostics, context);
			case SimplStateMachinePackage.DATA:
				return validateData((Data)value, diagnostics, context);
			case SimplStateMachinePackage.BOOLEAN_DATA:
				return validateBooleanData((BooleanData)value, diagnostics, context);
			case SimplStateMachinePackage.INTEGER_DATA:
				return validateIntegerData((IntegerData)value, diagnostics, context);
			case SimplStateMachinePackage.VARIABLE:
				return validateVariable((Variable)value, diagnostics, context);
			case SimplStateMachinePackage.BOOLEAN_VARIABLE:
				return validateBooleanVariable((BooleanVariable)value, diagnostics, context);
			case SimplStateMachinePackage.INTEGER_VARIABLE:
				return validateIntegerVariable((IntegerVariable)value, diagnostics, context);
			case SimplStateMachinePackage.OPERATION:
				return validateOperation((Operation)value, diagnostics, context);
			case SimplStateMachinePackage.ASSIGNMENT:
				return validateAssignment((Assignment)value, diagnostics, context);
			case SimplStateMachinePackage.VARIABLE_REFERENCE:
				return validateVariableReference((VariableReference)value, diagnostics, context);
			case SimplStateMachinePackage.OPERATOR:
				return validateOperator((Operator)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateMachine(StateMachine stateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stateMachine, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_containerForAllStates(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateCompositeState_initialStateInComposite(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateCompositeState_uniqueCompositeName(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateMachine_singleStateMachine(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateMachine_noContainerForStatemachine(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateMachine_activeStateHierarchyConsistency(stateMachine, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the singleStateMachine constraint of '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE_MACHINE__SINGLE_STATE_MACHINE__EEXPRESSION = "StateMachine.allInstances()->size() = 1";

	/**
	 * Validates the singleStateMachine constraint of '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateMachine_singleStateMachine(StateMachine stateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimplStateMachinePackage.Literals.STATE_MACHINE,
				 stateMachine,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "singleStateMachine",
				 STATE_MACHINE__SINGLE_STATE_MACHINE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noContainerForStatemachine constraint of '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE_MACHINE__NO_CONTAINER_FOR_STATEMACHINE__EEXPRESSION = "self.container.oclIsUndefined()";

	/**
	 * Validates the noContainerForStatemachine constraint of '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateMachine_noContainerForStatemachine(StateMachine stateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimplStateMachinePackage.Literals.STATE_MACHINE,
				 stateMachine,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noContainerForStatemachine",
				 STATE_MACHINE__NO_CONTAINER_FOR_STATEMACHINE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the activeStateHierarchyConsistency constraint of '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE_MACHINE__ACTIVE_STATE_HIERARCHY_CONSISTENCY__EEXPRESSION = "if self.isActive then self.activeSubTree() else self.unactiveSubTree() endif";

	/**
	 * Validates the activeStateHierarchyConsistency constraint of '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateMachine_activeStateHierarchyConsistency(StateMachine stateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimplStateMachinePackage.Literals.STATE_MACHINE,
				 stateMachine,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "activeStateHierarchyConsistency",
				 STATE_MACHINE__ACTIVE_STATE_HIERARCHY_CONSISTENCY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(state, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_containerForAllStates(state, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the containerForAllStates constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__CONTAINER_FOR_ALL_STATES__EEXPRESSION = "not self.oclIsTypeOf(StateMachine) implies not self.container.oclIsUndefined()";

	/**
	 * Validates the containerForAllStates constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_containerForAllStates(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimplStateMachinePackage.Literals.STATE,
				 state,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "containerForAllStates",
				 STATE__CONTAINER_FOR_ALL_STATES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeState(CompositeState compositeState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(compositeState, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(compositeState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(compositeState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(compositeState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(compositeState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(compositeState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(compositeState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(compositeState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(compositeState, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_containerForAllStates(compositeState, diagnostics, context);
		if (result || diagnostics != null) result &= validateCompositeState_initialStateInComposite(compositeState, diagnostics, context);
		if (result || diagnostics != null) result &= validateCompositeState_uniqueCompositeName(compositeState, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the initialStateInComposite constraint of '<em>Composite State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPOSITE_STATE__INITIAL_STATE_IN_COMPOSITE__EEXPRESSION = "self.states->includes(self.initialState.referencedState)";

	/**
	 * Validates the initialStateInComposite constraint of '<em>Composite State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeState_initialStateInComposite(CompositeState compositeState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimplStateMachinePackage.Literals.COMPOSITE_STATE,
				 compositeState,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "initialStateInComposite",
				 COMPOSITE_STATE__INITIAL_STATE_IN_COMPOSITE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueCompositeName constraint of '<em>Composite State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPOSITE_STATE__UNIQUE_COMPOSITE_NAME__EEXPRESSION = "self.states->forAll(s1 : State | self.states->forAll(s2 : State | s1.name = s2.name implies s1 = s2))";

	/**
	 * Validates the uniqueCompositeName constraint of '<em>Composite State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeState_uniqueCompositeName(CompositeState compositeState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimplStateMachinePackage.Literals.COMPOSITE_STATE,
				 compositeState,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueCompositeName",
				 COMPOSITE_STATE__UNIQUE_COMPOSITE_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialState(InitialState initialState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(initialState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_transInitialState(transition, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the transInitialState constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__TRANS_INITIAL_STATE__EEXPRESSION = "not self.source.oclIsTypeOf(StateMachine) and not self.target.oclIsTypeOf(StateMachine)";

	/**
	 * Validates the transInitialState constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_transInitialState(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimplStateMachinePackage.Literals.TRANSITION,
				 transition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "transInitialState",
				 TRANSITION__TRANS_INITIAL_STATE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(event, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(event, diagnostics, context);
		if (result || diagnostics != null) result &= validateEvent_uniqueEventName(event, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniqueEventName constraint of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EVENT__UNIQUE_EVENT_NAME__EEXPRESSION = "Event.allInstances()->forAll(e : Event | e.name = self.name implies e = self)";

	/**
	 * Validates the uniqueEventName constraint of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent_uniqueEventName(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimplStateMachinePackage.Literals.EVENT,
				 event,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueEventName",
				 EVENT__UNIQUE_EVENT_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpressionElement(ExpressionElement expressionElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expressionElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateData(Data data, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(data, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanData(BooleanData booleanData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerData(IntegerData integerData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanVariable(BooleanVariable booleanVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerVariable(IntegerVariable integerVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignment(Assignment assignment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assignment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableReference(VariableReference variableReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperator(Operator operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SimplStateMachineValidator
