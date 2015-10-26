/*
 * generated by Xtext
 */
grammar InternalSM;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.xtext.StateMachine.sm.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.StateMachine.sm.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.StateMachine.sm.services.SMGrammarAccess;

}

@parser::members {

 	private SMGrammarAccess grammarAccess;
 	
    public InternalSMParser(TokenStream input, SMGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "StateMachine";	
   	}
   	
   	@Override
   	protected SMGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleStateMachine
entryRuleStateMachine returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStateMachineRule()); }
	 iv_ruleStateMachine=ruleStateMachine 
	 { $current=$iv_ruleStateMachine.current; } 
	 EOF 
;

// Rule StateMachine
ruleStateMachine returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='StateMachine' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getStateMachineAccess().getStateMachineKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getStateMachineAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateMachineRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getStateMachineAccess().getVariablesVariableParserRuleCall_3_0()); 
	    }
		lv_variables_3_0=ruleVariable		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateMachineRule());
	        }
       		add(
       			$current, 
       			"variables",
        		lv_variables_3_0, 
        		"Variable");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='events' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getStateMachineAccess().getEventsKeyword_4());
    }
	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getStateMachineAccess().getEventsEventParserRuleCall_6_0()); 
	    }
		lv_events_6_0=ruleEvent		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateMachineRule());
	        }
       		add(
       			$current, 
       			"events",
        		lv_events_6_0, 
        		"Event");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_7=',' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getStateMachineAccess().getCommaKeyword_7_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getStateMachineAccess().getEventsEventParserRuleCall_7_1_0()); 
	    }
		lv_events_8_0=ruleEvent		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateMachineRule());
	        }
       		add(
       			$current, 
       			"events",
        		lv_events_8_0, 
        		"Event");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_8());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_9_0()); 
	    }
		lv_states_10_0=ruleState		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateMachineRule());
	        }
       		add(
       			$current, 
       			"states",
        		lv_states_10_0, 
        		"State");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_11='init with' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getStateMachineAccess().getInitWithKeyword_10());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getStateMachineAccess().getInitialStateInitialStateParserRuleCall_11_0()); 
	    }
		lv_initialState_12_0=ruleInitialState		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateMachineRule());
	        }
       		set(
       			$current, 
       			"initialState",
        		lv_initialState_12_0, 
        		"InitialState");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_12_0()); 
	    }
		lv_transitions_13_0=ruleTransition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateMachineRule());
	        }
       		add(
       			$current, 
       			"transitions",
        		lv_transitions_13_0, 
        		"Transition");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_14='}' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_13());
    }
)
;





// Entry rule entryRuleState
entryRuleState returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	 iv_ruleState=ruleState 
	 { $current=$iv_ruleState.current; } 
	 EOF 
;

// Rule State
ruleState returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getStateAccess().getState_ImplParserRuleCall_0()); 
    }
    this_State_Impl_0=ruleState_Impl
    { 
        $current = $this_State_Impl_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getStateAccess().getStateMachineParserRuleCall_1()); 
    }
    this_StateMachine_1=ruleStateMachine
    { 
        $current = $this_StateMachine_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getStateAccess().getCompositeState_ImplParserRuleCall_2()); 
    }
    this_CompositeState_Impl_2=ruleCompositeState_Impl
    { 
        $current = $this_CompositeState_Impl_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleVariable
entryRuleVariable returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	 iv_ruleVariable=ruleVariable 
	 { $current=$iv_ruleVariable.current; } 
	 EOF 
;

// Rule Variable
ruleVariable returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='var' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVarKeyword_0());
    }
(
    { 
        newCompositeNode(grammarAccess.getVariableAccess().getBooleanVariableParserRuleCall_1_0()); 
    }
    this_BooleanVariable_1=ruleBooleanVariable
    { 
        $current = $this_BooleanVariable_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getVariableAccess().getIntegerVariableParserRuleCall_1_1()); 
    }
    this_IntegerVariable_2=ruleIntegerVariable
    { 
        $current = $this_IntegerVariable_2.current; 
        afterParserOrEnumRuleCall();
    }
))
;





// Entry rule entryRuleExpressionElement
entryRuleExpressionElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExpressionElementRule()); }
	 iv_ruleExpressionElement=ruleExpressionElement 
	 { $current=$iv_ruleExpressionElement.current; } 
	 EOF 
;

// Rule ExpressionElement
ruleExpressionElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getExpressionElementAccess().getExpressionParserRuleCall_0()); 
    }
    this_Expression_0=ruleExpression
    { 
        $current = $this_Expression_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getExpressionElementAccess().getBooleanDataParserRuleCall_1()); 
    }
    this_BooleanData_1=ruleBooleanData
    { 
        $current = $this_BooleanData_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getExpressionElementAccess().getIntegerDataParserRuleCall_2()); 
    }
    this_IntegerData_2=ruleIntegerData
    { 
        $current = $this_IntegerData_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getExpressionElementAccess().getVariableReferenceParserRuleCall_3()); 
    }
    this_VariableReference_3=ruleVariableReference
    { 
        $current = $this_VariableReference_3.current; 
        afterParserOrEnumRuleCall();
    }
)
;







// Entry rule entryRuleEString
entryRuleEString returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEStringRule()); } 
	 iv_ruleEString=ruleEString 
	 { $current=$iv_ruleEString.current.getText(); }  
	 EOF 
;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
    }

    |    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
    }
)
    ;





// Entry rule entryRuleEBoolean
entryRuleEBoolean returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEBooleanRule()); } 
	 iv_ruleEBoolean=ruleEBoolean 
	 { $current=$iv_ruleEBoolean.current.getText(); }  
	 EOF 
;

// Rule EBoolean
ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='true' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
    }

    |
	kw='false' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
    }
)
    ;





// Entry rule entryRuleOperation
entryRuleOperation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOperationRule()); }
	 iv_ruleOperation=ruleOperation 
	 { $current=$iv_ruleOperation.current; } 
	 EOF 
;

// Rule Operation
ruleOperation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getOperationAccess().getOperationAction_0(),
            $current);
    }
)(	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOperationAccess().getContentsAssignmentParserRuleCall_1_1_0()); 
	    }
		lv_contents_2_0=ruleAssignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOperationRule());
	        }
       		add(
       			$current, 
       			"contents",
        		lv_contents_2_0, 
        		"Assignment");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3=';' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getSemicolonKeyword_1_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOperationAccess().getContentsAssignmentParserRuleCall_1_2_1_0()); 
	    }
		lv_contents_4_0=ruleAssignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOperationRule());
	        }
       		add(
       			$current, 
       			"contents",
        		lv_contents_4_0, 
        		"Assignment");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_1_3());
    }
)?)
;





// Entry rule entryRuleState_Impl
entryRuleState_Impl returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getState_ImplRule()); }
	 iv_ruleState_Impl=ruleState_Impl 
	 { $current=$iv_ruleState_Impl.current; } 
	 EOF 
;

// Rule State_Impl
ruleState_Impl returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='state' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getState_ImplAccess().getStateKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getState_ImplAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getState_ImplRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getState_ImplAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='do' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getState_ImplAccess().getDoKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getState_ImplAccess().getOperationOperationParserRuleCall_3_1_0()); 
	    }
		lv_operation_4_0=ruleOperation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getState_ImplRule());
	        }
       		set(
       			$current, 
       			"operation",
        		lv_operation_4_0, 
        		"Operation");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getState_ImplAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleInitialState
entryRuleInitialState returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getInitialStateRule()); }
	 iv_ruleInitialState=ruleInitialState 
	 { $current=$iv_ruleInitialState.current; } 
	 EOF 
;

// Rule InitialState
ruleInitialState returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getInitialStateRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getInitialStateAccess().getReferencedStateStateCrossReference_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleTransition
entryRuleTransition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTransitionRule()); }
	 iv_ruleTransition=ruleTransition 
	 { $current=$iv_ruleTransition.current; } 
	 EOF 
;

// Rule Transition
ruleTransition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='from' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getFromKeyword_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getTransitionRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getTransitionAccess().getSourceStateCrossReference_1_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='to' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getToKeyword_2());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getTransitionRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getTransitionAccess().getTargetStateCrossReference_3_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4='for' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getForKeyword_4());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getTransitionRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getTransitionAccess().getEventEventCrossReference_5_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_6='guard' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getGuardKeyword_6_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTransitionAccess().getGuardExpressionParserRuleCall_6_1_0()); 
	    }
		lv_guard_7_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTransitionRule());
	        }
       		set(
       			$current, 
       			"guard",
        		lv_guard_7_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleEvent
entryRuleEvent returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEventRule()); }
	 iv_ruleEvent=ruleEvent 
	 { $current=$iv_ruleEvent.current; } 
	 EOF 
;

// Rule Event
ruleEvent returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getEventAccess().getEventAction_0(),
            $current);
    }
)(
(
		lv_name_1_0=RULE_STRING
		{
			newLeafNode(lv_name_1_0, grammarAccess.getEventAccess().getNameSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEventRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleAssignment
entryRuleAssignment returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAssignmentRule()); }
	 iv_ruleAssignment=ruleAssignment 
	 { $current=$iv_ruleAssignment.current; } 
	 EOF 
;

// Rule Assignment
ruleAssignment returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAssignmentRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_0_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1=':=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionElementParserRuleCall_2_0()); 
	    }
		lv_expression_2_0=ruleExpressionElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAssignmentRule());
	        }
       		set(
       			$current, 
       			"expression",
        		lv_expression_2_0, 
        		"ExpressionElement");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	 iv_ruleExpression=ruleExpression 
	 { $current=$iv_ruleExpression.current; } 
	 EOF 
;

// Rule Expression
ruleExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='left' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getLeftKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getExpressionAccess().getLeftExpressionElementParserRuleCall_1_0()); 
	    }
		lv_left_1_0=ruleExpressionElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExpressionRule());
	        }
       		set(
       			$current, 
       			"left",
        		lv_left_1_0, 
        		"ExpressionElement");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='op' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getOpKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getExpressionAccess().getOperatorOperatorEnumRuleCall_3_0()); 
	    }
		lv_operator_3_0=ruleOperator		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExpressionRule());
	        }
       		set(
       			$current, 
       			"operator",
        		lv_operator_3_0, 
        		"Operator");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4='right' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getRightKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getExpressionAccess().getRightExpressionElementParserRuleCall_5_0()); 
	    }
		lv_right_5_0=ruleExpressionElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExpressionRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_5_0, 
        		"ExpressionElement");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleBooleanData
entryRuleBooleanData returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBooleanDataRule()); }
	 iv_ruleBooleanData=ruleBooleanData 
	 { $current=$iv_ruleBooleanData.current; } 
	 EOF 
;

// Rule BooleanData
ruleBooleanData returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getBooleanDataAccess().getValueEBooleanParserRuleCall_0()); 
	    }
		lv_value_0_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBooleanDataRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleIntegerData
entryRuleIntegerData returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIntegerDataRule()); }
	 iv_ruleIntegerData=ruleIntegerData 
	 { $current=$iv_ruleIntegerData.current; } 
	 EOF 
;

// Rule IntegerData
ruleIntegerData returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getIntegerDataAccess().getValueEIntParserRuleCall_0()); 
	    }
		lv_value_0_0=ruleEInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIntegerDataRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"EInt");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleVariableReference
entryRuleVariableReference returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVariableReferenceRule()); }
	 iv_ruleVariableReference=ruleVariableReference 
	 { $current=$iv_ruleVariableReference.current; } 
	 EOF 
;

// Rule VariableReference
ruleVariableReference returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getVariableReferenceRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEIntRule()); } 
	 iv_ruleEInt=ruleEInt 
	 { $current=$iv_ruleEInt.current.getText(); }  
	 EOF 
;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
    }
)?    this_INT_1=RULE_INT    {
		$current.merge(this_INT_1);
    }

    { 
    newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
    }
)
    ;





// Entry rule entryRuleCompositeState_Impl
entryRuleCompositeState_Impl returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCompositeState_ImplRule()); }
	 iv_ruleCompositeState_Impl=ruleCompositeState_Impl 
	 { $current=$iv_ruleCompositeState_Impl.current; } 
	 EOF 
;

// Rule CompositeState_Impl
ruleCompositeState_Impl returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='state' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getCompositeState_ImplAccess().getStateKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCompositeState_ImplAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCompositeState_ImplRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getCompositeState_ImplAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCompositeState_ImplAccess().getStatesStateParserRuleCall_3_0()); 
	    }
		lv_states_3_0=ruleState		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCompositeState_ImplRule());
	        }
       		add(
       			$current, 
       			"states",
        		lv_states_3_0, 
        		"State");
	        afterParserOrEnumRuleCall();
	    }

)
)+(	otherlv_4='do' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getCompositeState_ImplAccess().getDoKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCompositeState_ImplAccess().getOperationOperationParserRuleCall_4_1_0()); 
	    }
		lv_operation_5_0=ruleOperation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCompositeState_ImplRule());
	        }
       		set(
       			$current, 
       			"operation",
        		lv_operation_5_0, 
        		"Operation");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_6='init with' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getCompositeState_ImplAccess().getInitWithKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCompositeState_ImplAccess().getInitialStateInitialStateParserRuleCall_6_0()); 
	    }
		lv_initialState_7_0=ruleInitialState		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCompositeState_ImplRule());
	        }
       		set(
       			$current, 
       			"initialState",
        		lv_initialState_7_0, 
        		"InitialState");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getCompositeState_ImplAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleBooleanVariable
entryRuleBooleanVariable returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBooleanVariableRule()); }
	 iv_ruleBooleanVariable=ruleBooleanVariable 
	 { $current=$iv_ruleBooleanVariable.current; } 
	 EOF 
;

// Rule BooleanVariable
ruleBooleanVariable returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getBooleanVariableAccess().getBooleanVariableAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getBooleanVariableAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBooleanVariableRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getBooleanVariableAccess().getColonKeyword_2());
    }
	otherlv_3='boolean' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getBooleanVariableAccess().getBooleanKeyword_3());
    }
(	otherlv_4=':=' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getBooleanVariableAccess().getColonEqualsSignKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBooleanVariableAccess().getValueBooleanDataParserRuleCall_4_1_0()); 
	    }
		lv_value_5_0=ruleBooleanData		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBooleanVariableRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_5_0, 
        		"BooleanData");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleIntegerVariable
entryRuleIntegerVariable returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIntegerVariableRule()); }
	 iv_ruleIntegerVariable=ruleIntegerVariable 
	 { $current=$iv_ruleIntegerVariable.current; } 
	 EOF 
;

// Rule IntegerVariable
ruleIntegerVariable returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getIntegerVariableAccess().getIntegerVariableAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getIntegerVariableAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIntegerVariableRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getIntegerVariableAccess().getColonKeyword_2());
    }
	otherlv_3='integer' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getIntegerVariableAccess().getIntegerKeyword_3());
    }
(	otherlv_4=':=' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getIntegerVariableAccess().getColonEqualsSignKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getIntegerVariableAccess().getValueIntegerDataParserRuleCall_4_1_0()); 
	    }
		lv_value_5_0=ruleIntegerData		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIntegerVariableRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_5_0, 
        		"IntegerData");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Rule Operator
ruleOperator returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='add' 
	{
        $current = grammarAccess.getOperatorAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getAddEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='sub' 
	{
        $current = grammarAccess.getOperatorAccess().getSubEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getSubEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='eq' 
	{
        $current = grammarAccess.getOperatorAccess().getEqEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getEqEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='mul' 
	{
        $current = grammarAccess.getOperatorAccess().getMulEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getMulEnumLiteralDeclaration_3()); 
    }
)
    |(	enumLiteral_4='gt' 
	{
        $current = grammarAccess.getOperatorAccess().getGtEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_4, grammarAccess.getOperatorAccess().getGtEnumLiteralDeclaration_4()); 
    }
)
    |(	enumLiteral_5='lt' 
	{
        $current = grammarAccess.getOperatorAccess().getLtEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_5, grammarAccess.getOperatorAccess().getLtEnumLiteralDeclaration_5()); 
    }
)
    |(	enumLiteral_6='lte' 
	{
        $current = grammarAccess.getOperatorAccess().getLteEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_6, grammarAccess.getOperatorAccess().getLteEnumLiteralDeclaration_6()); 
    }
)
    |(	enumLiteral_7='gte' 
	{
        $current = grammarAccess.getOperatorAccess().getGteEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_7, grammarAccess.getOperatorAccess().getGteEnumLiteralDeclaration_7()); 
    }
)
    |(	enumLiteral_8='div' 
	{
        $current = grammarAccess.getOperatorAccess().getDivEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_8, grammarAccess.getOperatorAccess().getDivEnumLiteralDeclaration_8()); 
    }
)
    |(	enumLiteral_9='and' 
	{
        $current = grammarAccess.getOperatorAccess().getAndEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_9, grammarAccess.getOperatorAccess().getAndEnumLiteralDeclaration_9()); 
    }
)
    |(	enumLiteral_10='neq' 
	{
        $current = grammarAccess.getOperatorAccess().getNeqEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_10, grammarAccess.getOperatorAccess().getNeqEnumLiteralDeclaration_10()); 
    }
)
    |(	enumLiteral_11='or' 
	{
        $current = grammarAccess.getOperatorAccess().getOrEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_11, grammarAccess.getOperatorAccess().getOrEnumLiteralDeclaration_11()); 
    }
)
    |(	enumLiteral_12='not' 
	{
        $current = grammarAccess.getOperatorAccess().getNotEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_12, grammarAccess.getOperatorAccess().getNotEnumLiteralDeclaration_12()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


