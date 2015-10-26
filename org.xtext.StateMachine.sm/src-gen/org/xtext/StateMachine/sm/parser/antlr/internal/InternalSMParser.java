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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSMParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'isActive'", "'StateMachine'", "'{'", "'events'", "','", "'}'", "'var'", "'true'", "'false'", "'Operation'", "'contents'", "'State'", "'operation'", "'InitialState'", "'referencedState'", "'Assignment'", "'_name'", "'variable'", "'expression'", "'Expression'", "'operator'", "'left'", "'right'", "'VariableReference'", "'-'", "'CompositeState'", "'states'", "'initialState'", "':'", "'boolean'", "':='", "'integer'", "'add'", "'sub'", "'eq'", "'mul'", "'gt'", "'lt'", "'lte'", "'gte'", "'div'", "'and'", "'neq'", "'or'", "'not'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSMParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSMParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSMParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g"; }



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



    // $ANTLR start "entryRuleStateMachine"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:68:1: entryRuleStateMachine returns [EObject current=null] : iv_ruleStateMachine= ruleStateMachine EOF ;
    public final EObject entryRuleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachine = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:69:2: (iv_ruleStateMachine= ruleStateMachine EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:70:2: iv_ruleStateMachine= ruleStateMachine EOF
            {
             newCompositeNode(grammarAccess.getStateMachineRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStateMachine_in_entryRuleStateMachine75);
            iv_ruleStateMachine=ruleStateMachine();

            state._fsp--;

             current =iv_ruleStateMachine; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStateMachine85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:77:1: ruleStateMachine returns [EObject current=null] : ( ( (lv_isActive_0_0= 'isActive' ) ) otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* otherlv_5= 'events' otherlv_6= '{' ( (lv_events_7_0= ruleEvent ) ) (otherlv_8= ',' ( (lv_events_9_0= ruleEvent ) ) )* otherlv_10= '}' otherlv_11= '}' ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token lv_isActive_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_variables_4_0 = null;

        EObject lv_events_7_0 = null;

        EObject lv_events_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:80:28: ( ( ( (lv_isActive_0_0= 'isActive' ) ) otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* otherlv_5= 'events' otherlv_6= '{' ( (lv_events_7_0= ruleEvent ) ) (otherlv_8= ',' ( (lv_events_9_0= ruleEvent ) ) )* otherlv_10= '}' otherlv_11= '}' ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:81:1: ( ( (lv_isActive_0_0= 'isActive' ) ) otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* otherlv_5= 'events' otherlv_6= '{' ( (lv_events_7_0= ruleEvent ) ) (otherlv_8= ',' ( (lv_events_9_0= ruleEvent ) ) )* otherlv_10= '}' otherlv_11= '}' )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:81:1: ( ( (lv_isActive_0_0= 'isActive' ) ) otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* otherlv_5= 'events' otherlv_6= '{' ( (lv_events_7_0= ruleEvent ) ) (otherlv_8= ',' ( (lv_events_9_0= ruleEvent ) ) )* otherlv_10= '}' otherlv_11= '}' )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:81:2: ( (lv_isActive_0_0= 'isActive' ) ) otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* otherlv_5= 'events' otherlv_6= '{' ( (lv_events_7_0= ruleEvent ) ) (otherlv_8= ',' ( (lv_events_9_0= ruleEvent ) ) )* otherlv_10= '}' otherlv_11= '}'
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:81:2: ( (lv_isActive_0_0= 'isActive' ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:82:1: (lv_isActive_0_0= 'isActive' )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:82:1: (lv_isActive_0_0= 'isActive' )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:83:3: lv_isActive_0_0= 'isActive'
            {
            lv_isActive_0_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleStateMachine128); 

                    newLeafNode(lv_isActive_0_0, grammarAccess.getStateMachineAccess().getIsActiveIsActiveKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateMachineRule());
            	        }
                   		setWithLastConsumed(current, "isActive", true, "isActive");
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStateMachine153); 

                	newLeafNode(otherlv_1, grammarAccess.getStateMachineAccess().getStateMachineKeyword_1());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:100:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:101:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:101:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:102:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStateMachineAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStateMachine174);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStateMachine186); 

                	newLeafNode(otherlv_3, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:122:1: ( (lv_variables_4_0= ruleVariable ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:123:1: (lv_variables_4_0= ruleVariable )
            	    {
            	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:123:1: (lv_variables_4_0= ruleVariable )
            	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:124:3: lv_variables_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getVariablesVariableParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleStateMachine207);
            	    lv_variables_4_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_4_0, 
            	            		"Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleStateMachine220); 

                	newLeafNode(otherlv_5, grammarAccess.getStateMachineAccess().getEventsKeyword_5());
                
            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStateMachine232); 

                	newLeafNode(otherlv_6, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_6());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:148:1: ( (lv_events_7_0= ruleEvent ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:149:1: (lv_events_7_0= ruleEvent )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:149:1: (lv_events_7_0= ruleEvent )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:150:3: lv_events_7_0= ruleEvent
            {
             
            	        newCompositeNode(grammarAccess.getStateMachineAccess().getEventsEventParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEvent_in_ruleStateMachine253);
            lv_events_7_0=ruleEvent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	        }
                   		add(
                   			current, 
                   			"events",
                    		lv_events_7_0, 
                    		"Event");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:166:2: (otherlv_8= ',' ( (lv_events_9_0= ruleEvent ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:166:4: otherlv_8= ',' ( (lv_events_9_0= ruleEvent ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStateMachine266); 

            	        	newLeafNode(otherlv_8, grammarAccess.getStateMachineAccess().getCommaKeyword_8_0());
            	        
            	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:170:1: ( (lv_events_9_0= ruleEvent ) )
            	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:171:1: (lv_events_9_0= ruleEvent )
            	    {
            	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:171:1: (lv_events_9_0= ruleEvent )
            	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:172:3: lv_events_9_0= ruleEvent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getEventsEventParserRuleCall_8_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEvent_in_ruleStateMachine287);
            	    lv_events_9_0=ruleEvent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"events",
            	            		lv_events_9_0, 
            	            		"Event");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStateMachine301); 

                	newLeafNode(otherlv_10, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_9());
                
            otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStateMachine313); 

                	newLeafNode(otherlv_11, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleState"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:204:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:205:2: (iv_ruleState= ruleState EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:206:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_in_entryRuleState349);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState359); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:213:1: ruleState returns [EObject current=null] : (this_State_Impl_0= ruleState_Impl | this_StateMachine_1= ruleStateMachine | this_CompositeState_Impl_2= ruleCompositeState_Impl ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        EObject this_State_Impl_0 = null;

        EObject this_StateMachine_1 = null;

        EObject this_CompositeState_Impl_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:216:28: ( (this_State_Impl_0= ruleState_Impl | this_StateMachine_1= ruleStateMachine | this_CompositeState_Impl_2= ruleCompositeState_Impl ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:217:1: (this_State_Impl_0= ruleState_Impl | this_StateMachine_1= ruleStateMachine | this_CompositeState_Impl_2= ruleCompositeState_Impl )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:217:1: (this_State_Impl_0= ruleState_Impl | this_StateMachine_1= ruleStateMachine | this_CompositeState_Impl_2= ruleCompositeState_Impl )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                switch ( input.LA(2) ) {
                case 36:
                    {
                    alt3=3;
                    }
                    break;
                case 22:
                    {
                    alt3=1;
                    }
                    break;
                case 12:
                    {
                    alt3=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:218:5: this_State_Impl_0= ruleState_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getStateAccess().getState_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleState_Impl_in_ruleState406);
                    this_State_Impl_0=ruleState_Impl();

                    state._fsp--;

                     
                            current = this_State_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:228:5: this_StateMachine_1= ruleStateMachine
                    {
                     
                            newCompositeNode(grammarAccess.getStateAccess().getStateMachineParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStateMachine_in_ruleState433);
                    this_StateMachine_1=ruleStateMachine();

                    state._fsp--;

                     
                            current = this_StateMachine_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:238:5: this_CompositeState_Impl_2= ruleCompositeState_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getStateAccess().getCompositeState_ImplParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCompositeState_Impl_in_ruleState460);
                    this_CompositeState_Impl_2=ruleCompositeState_Impl();

                    state._fsp--;

                     
                            current = this_CompositeState_Impl_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleVariable"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:254:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:255:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:256:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable495);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable505); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:263:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'var' (this_BooleanVariable_1= ruleBooleanVariable | this_IntegerVariable_2= ruleIntegerVariable ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_BooleanVariable_1 = null;

        EObject this_IntegerVariable_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:266:28: ( (otherlv_0= 'var' (this_BooleanVariable_1= ruleBooleanVariable | this_IntegerVariable_2= ruleIntegerVariable ) ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:267:1: (otherlv_0= 'var' (this_BooleanVariable_1= ruleBooleanVariable | this_IntegerVariable_2= ruleIntegerVariable ) )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:267:1: (otherlv_0= 'var' (this_BooleanVariable_1= ruleBooleanVariable | this_IntegerVariable_2= ruleIntegerVariable ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:267:3: otherlv_0= 'var' (this_BooleanVariable_1= ruleBooleanVariable | this_IntegerVariable_2= ruleIntegerVariable )
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleVariable542); 

                	newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVarKeyword_0());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:271:1: (this_BooleanVariable_1= ruleBooleanVariable | this_IntegerVariable_2= ruleIntegerVariable )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==39) ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==40) ) {
                        alt4=1;
                    }
                    else if ( (LA4_3==42) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==RULE_ID) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==39) ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==40) ) {
                        alt4=1;
                    }
                    else if ( (LA4_3==42) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:272:5: this_BooleanVariable_1= ruleBooleanVariable
                    {
                     
                            newCompositeNode(grammarAccess.getVariableAccess().getBooleanVariableParserRuleCall_1_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanVariable_in_ruleVariable565);
                    this_BooleanVariable_1=ruleBooleanVariable();

                    state._fsp--;

                     
                            current = this_BooleanVariable_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:282:5: this_IntegerVariable_2= ruleIntegerVariable
                    {
                     
                            newCompositeNode(grammarAccess.getVariableAccess().getIntegerVariableParserRuleCall_1_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerVariable_in_ruleVariable592);
                    this_IntegerVariable_2=ruleIntegerVariable();

                    state._fsp--;

                     
                            current = this_IntegerVariable_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleExpressionElement"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:298:1: entryRuleExpressionElement returns [EObject current=null] : iv_ruleExpressionElement= ruleExpressionElement EOF ;
    public final EObject entryRuleExpressionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionElement = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:299:2: (iv_ruleExpressionElement= ruleExpressionElement EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:300:2: iv_ruleExpressionElement= ruleExpressionElement EOF
            {
             newCompositeNode(grammarAccess.getExpressionElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionElement_in_entryRuleExpressionElement628);
            iv_ruleExpressionElement=ruleExpressionElement();

            state._fsp--;

             current =iv_ruleExpressionElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpressionElement638); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionElement"


    // $ANTLR start "ruleExpressionElement"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:307:1: ruleExpressionElement returns [EObject current=null] : (this_Expression_0= ruleExpression | this_BooleanData_1= ruleBooleanData | this_IntegerData_2= ruleIntegerData | this_VariableReference_3= ruleVariableReference ) ;
    public final EObject ruleExpressionElement() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;

        EObject this_BooleanData_1 = null;

        EObject this_IntegerData_2 = null;

        EObject this_VariableReference_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:310:28: ( (this_Expression_0= ruleExpression | this_BooleanData_1= ruleBooleanData | this_IntegerData_2= ruleIntegerData | this_VariableReference_3= ruleVariableReference ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:311:1: (this_Expression_0= ruleExpression | this_BooleanData_1= ruleBooleanData | this_IntegerData_2= ruleIntegerData | this_VariableReference_3= ruleVariableReference )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:311:1: (this_Expression_0= ruleExpression | this_BooleanData_1= ruleBooleanData | this_IntegerData_2= ruleIntegerData | this_VariableReference_3= ruleVariableReference )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt5=1;
                }
                break;
            case 18:
            case 19:
                {
                alt5=2;
                }
                break;
            case RULE_INT:
            case 35:
                {
                alt5=3;
                }
                break;
            case 34:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:312:5: this_Expression_0= ruleExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionElementAccess().getExpressionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleExpressionElement685);
                    this_Expression_0=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:322:5: this_BooleanData_1= ruleBooleanData
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionElementAccess().getBooleanDataParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanData_in_ruleExpressionElement712);
                    this_BooleanData_1=ruleBooleanData();

                    state._fsp--;

                     
                            current = this_BooleanData_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:332:5: this_IntegerData_2= ruleIntegerData
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionElementAccess().getIntegerDataParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerData_in_ruleExpressionElement739);
                    this_IntegerData_2=ruleIntegerData();

                    state._fsp--;

                     
                            current = this_IntegerData_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:342:5: this_VariableReference_3= ruleVariableReference
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionElementAccess().getVariableReferenceParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_ruleExpressionElement766);
                    this_VariableReference_3=ruleVariableReference();

                    state._fsp--;

                     
                            current = this_VariableReference_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionElement"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:360:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:361:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:362:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString804);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString815); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:369:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:372:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:373:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:373:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:373:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString855); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:381:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString881); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEBoolean"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:396:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:397:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:398:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean927);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean938); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:405:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:408:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:409:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:409:1: (kw= 'true' | kw= 'false' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:410:2: kw= 'true'
                    {
                    kw=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEBoolean976); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:417:2: kw= 'false'
                    {
                    kw=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEBoolean995); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleOperation"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:430:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:431:2: (iv_ruleOperation= ruleOperation EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:432:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_entryRuleOperation1035);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperation1045); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:439:1: ruleOperation returns [EObject current=null] : ( () otherlv_1= 'Operation' otherlv_2= '{' (otherlv_3= 'contents' otherlv_4= '{' ( (lv_contents_5_0= ruleAssignment ) ) (otherlv_6= ',' ( (lv_contents_7_0= ruleAssignment ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_contents_5_0 = null;

        EObject lv_contents_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:442:28: ( ( () otherlv_1= 'Operation' otherlv_2= '{' (otherlv_3= 'contents' otherlv_4= '{' ( (lv_contents_5_0= ruleAssignment ) ) (otherlv_6= ',' ( (lv_contents_7_0= ruleAssignment ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:443:1: ( () otherlv_1= 'Operation' otherlv_2= '{' (otherlv_3= 'contents' otherlv_4= '{' ( (lv_contents_5_0= ruleAssignment ) ) (otherlv_6= ',' ( (lv_contents_7_0= ruleAssignment ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:443:1: ( () otherlv_1= 'Operation' otherlv_2= '{' (otherlv_3= 'contents' otherlv_4= '{' ( (lv_contents_5_0= ruleAssignment ) ) (otherlv_6= ',' ( (lv_contents_7_0= ruleAssignment ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:443:2: () otherlv_1= 'Operation' otherlv_2= '{' (otherlv_3= 'contents' otherlv_4= '{' ( (lv_contents_5_0= ruleAssignment ) ) (otherlv_6= ',' ( (lv_contents_7_0= ruleAssignment ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:443:2: ()
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:444:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOperationAccess().getOperationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleOperation1091); 

                	newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getOperationKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleOperation1103); 

                	newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:457:1: (otherlv_3= 'contents' otherlv_4= '{' ( (lv_contents_5_0= ruleAssignment ) ) (otherlv_6= ',' ( (lv_contents_7_0= ruleAssignment ) ) )* otherlv_8= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:457:3: otherlv_3= 'contents' otherlv_4= '{' ( (lv_contents_5_0= ruleAssignment ) ) (otherlv_6= ',' ( (lv_contents_7_0= ruleAssignment ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleOperation1116); 

                        	newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getContentsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleOperation1128); 

                        	newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:465:1: ( (lv_contents_5_0= ruleAssignment ) )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:466:1: (lv_contents_5_0= ruleAssignment )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:466:1: (lv_contents_5_0= ruleAssignment )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:467:3: lv_contents_5_0= ruleAssignment
                    {
                     
                    	        newCompositeNode(grammarAccess.getOperationAccess().getContentsAssignmentParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleOperation1149);
                    lv_contents_5_0=ruleAssignment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOperationRule());
                    	        }
                           		add(
                           			current, 
                           			"contents",
                            		lv_contents_5_0, 
                            		"Assignment");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:483:2: (otherlv_6= ',' ( (lv_contents_7_0= ruleAssignment ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==15) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:483:4: otherlv_6= ',' ( (lv_contents_7_0= ruleAssignment ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOperation1162); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:487:1: ( (lv_contents_7_0= ruleAssignment ) )
                    	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:488:1: (lv_contents_7_0= ruleAssignment )
                    	    {
                    	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:488:1: (lv_contents_7_0= ruleAssignment )
                    	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:489:3: lv_contents_7_0= ruleAssignment
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOperationAccess().getContentsAssignmentParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleOperation1183);
                    	    lv_contents_7_0=ruleAssignment();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOperationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"contents",
                    	            		lv_contents_7_0, 
                    	            		"Assignment");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleOperation1197); 

                        	newLeafNode(otherlv_8, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleOperation1211); 

                	newLeafNode(otherlv_9, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleState_Impl"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:521:1: entryRuleState_Impl returns [EObject current=null] : iv_ruleState_Impl= ruleState_Impl EOF ;
    public final EObject entryRuleState_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState_Impl = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:522:2: (iv_ruleState_Impl= ruleState_Impl EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:523:2: iv_ruleState_Impl= ruleState_Impl EOF
            {
             newCompositeNode(grammarAccess.getState_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_Impl_in_entryRuleState_Impl1247);
            iv_ruleState_Impl=ruleState_Impl();

            state._fsp--;

             current =iv_ruleState_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState_Impl1257); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState_Impl"


    // $ANTLR start "ruleState_Impl"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:530:1: ruleState_Impl returns [EObject current=null] : ( ( (lv_isActive_0_0= 'isActive' ) ) otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'operation' ( (lv_operation_5_0= ruleOperation ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleState_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_isActive_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_operation_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:533:28: ( ( ( (lv_isActive_0_0= 'isActive' ) ) otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'operation' ( (lv_operation_5_0= ruleOperation ) ) )? otherlv_6= '}' ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:534:1: ( ( (lv_isActive_0_0= 'isActive' ) ) otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'operation' ( (lv_operation_5_0= ruleOperation ) ) )? otherlv_6= '}' )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:534:1: ( ( (lv_isActive_0_0= 'isActive' ) ) otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'operation' ( (lv_operation_5_0= ruleOperation ) ) )? otherlv_6= '}' )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:534:2: ( (lv_isActive_0_0= 'isActive' ) ) otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'operation' ( (lv_operation_5_0= ruleOperation ) ) )? otherlv_6= '}'
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:534:2: ( (lv_isActive_0_0= 'isActive' ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:535:1: (lv_isActive_0_0= 'isActive' )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:535:1: (lv_isActive_0_0= 'isActive' )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:536:3: lv_isActive_0_0= 'isActive'
            {
            lv_isActive_0_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleState_Impl1300); 

                    newLeafNode(lv_isActive_0_0, grammarAccess.getState_ImplAccess().getIsActiveIsActiveKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getState_ImplRule());
            	        }
                   		setWithLastConsumed(current, "isActive", true, "isActive");
            	    

            }


            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleState_Impl1325); 

                	newLeafNode(otherlv_1, grammarAccess.getState_ImplAccess().getStateKeyword_1());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:553:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:554:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:554:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:555:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getState_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState_Impl1346);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getState_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleState_Impl1358); 

                	newLeafNode(otherlv_3, grammarAccess.getState_ImplAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:575:1: (otherlv_4= 'operation' ( (lv_operation_5_0= ruleOperation ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:575:3: otherlv_4= 'operation' ( (lv_operation_5_0= ruleOperation ) )
                    {
                    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleState_Impl1371); 

                        	newLeafNode(otherlv_4, grammarAccess.getState_ImplAccess().getOperationKeyword_4_0());
                        
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:579:1: ( (lv_operation_5_0= ruleOperation ) )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:580:1: (lv_operation_5_0= ruleOperation )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:580:1: (lv_operation_5_0= ruleOperation )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:581:3: lv_operation_5_0= ruleOperation
                    {
                     
                    	        newCompositeNode(grammarAccess.getState_ImplAccess().getOperationOperationParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleState_Impl1392);
                    lv_operation_5_0=ruleOperation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getState_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"operation",
                            		lv_operation_5_0, 
                            		"Operation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleState_Impl1406); 

                	newLeafNode(otherlv_6, grammarAccess.getState_ImplAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState_Impl"


    // $ANTLR start "entryRuleInitialState"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:609:1: entryRuleInitialState returns [EObject current=null] : iv_ruleInitialState= ruleInitialState EOF ;
    public final EObject entryRuleInitialState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialState = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:610:2: (iv_ruleInitialState= ruleInitialState EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:611:2: iv_ruleInitialState= ruleInitialState EOF
            {
             newCompositeNode(grammarAccess.getInitialStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInitialState_in_entryRuleInitialState1442);
            iv_ruleInitialState=ruleInitialState();

            state._fsp--;

             current =iv_ruleInitialState; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInitialState1452); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitialState"


    // $ANTLR start "ruleInitialState"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:618:1: ruleInitialState returns [EObject current=null] : (otherlv_0= 'InitialState' otherlv_1= '{' otherlv_2= 'referencedState' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleInitialState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:621:28: ( (otherlv_0= 'InitialState' otherlv_1= '{' otherlv_2= 'referencedState' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:622:1: (otherlv_0= 'InitialState' otherlv_1= '{' otherlv_2= 'referencedState' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:622:1: (otherlv_0= 'InitialState' otherlv_1= '{' otherlv_2= 'referencedState' ( ( ruleEString ) ) otherlv_4= '}' )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:622:3: otherlv_0= 'InitialState' otherlv_1= '{' otherlv_2= 'referencedState' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleInitialState1489); 

                	newLeafNode(otherlv_0, grammarAccess.getInitialStateAccess().getInitialStateKeyword_0());
                
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleInitialState1501); 

                	newLeafNode(otherlv_1, grammarAccess.getInitialStateAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleInitialState1513); 

                	newLeafNode(otherlv_2, grammarAccess.getInitialStateAccess().getReferencedStateKeyword_2());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:634:1: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:635:1: ( ruleEString )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:635:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:636:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInitialStateRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getInitialStateAccess().getReferencedStateStateCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInitialState1536);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleInitialState1548); 

                	newLeafNode(otherlv_4, grammarAccess.getInitialStateAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitialState"


    // $ANTLR start "entryRuleEvent"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:663:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:664:2: (iv_ruleEvent= ruleEvent EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:665:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEvent_in_entryRuleEvent1586);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEvent1596); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:672:1: ruleEvent returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:675:28: ( ( () ( (lv_name_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:676:1: ( () ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:676:1: ( () ( (lv_name_1_0= RULE_STRING ) ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:676:2: () ( (lv_name_1_0= RULE_STRING ) )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:676:2: ()
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:677:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEventAccess().getEventAction_0(),
                        current);
                

            }

            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:682:2: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:683:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:683:1: (lv_name_1_0= RULE_STRING )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:684:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEvent1647); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEventAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleAssignment"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:708:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:709:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:710:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment1688);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment1698); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:717:1: ruleAssignment returns [EObject current=null] : (otherlv_0= 'Assignment' otherlv_1= '{' (otherlv_2= '_name' ( (lv__name_3_0= ruleEString ) ) )? otherlv_4= 'variable' ( ( ruleEString ) ) otherlv_6= 'expression' ( (lv_expression_7_0= ruleExpressionElement ) ) otherlv_8= '}' ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv__name_3_0 = null;

        EObject lv_expression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:720:28: ( (otherlv_0= 'Assignment' otherlv_1= '{' (otherlv_2= '_name' ( (lv__name_3_0= ruleEString ) ) )? otherlv_4= 'variable' ( ( ruleEString ) ) otherlv_6= 'expression' ( (lv_expression_7_0= ruleExpressionElement ) ) otherlv_8= '}' ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:721:1: (otherlv_0= 'Assignment' otherlv_1= '{' (otherlv_2= '_name' ( (lv__name_3_0= ruleEString ) ) )? otherlv_4= 'variable' ( ( ruleEString ) ) otherlv_6= 'expression' ( (lv_expression_7_0= ruleExpressionElement ) ) otherlv_8= '}' )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:721:1: (otherlv_0= 'Assignment' otherlv_1= '{' (otherlv_2= '_name' ( (lv__name_3_0= ruleEString ) ) )? otherlv_4= 'variable' ( ( ruleEString ) ) otherlv_6= 'expression' ( (lv_expression_7_0= ruleExpressionElement ) ) otherlv_8= '}' )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:721:3: otherlv_0= 'Assignment' otherlv_1= '{' (otherlv_2= '_name' ( (lv__name_3_0= ruleEString ) ) )? otherlv_4= 'variable' ( ( ruleEString ) ) otherlv_6= 'expression' ( (lv_expression_7_0= ruleExpressionElement ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleAssignment1735); 

                	newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getAssignmentKeyword_0());
                
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAssignment1747); 

                	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:729:1: (otherlv_2= '_name' ( (lv__name_3_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:729:3: otherlv_2= '_name' ( (lv__name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAssignment1760); 

                        	newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().get_nameKeyword_2_0());
                        
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:733:1: ( (lv__name_3_0= ruleEString ) )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:734:1: (lv__name_3_0= ruleEString )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:734:1: (lv__name_3_0= ruleEString )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:735:3: lv__name_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignmentAccess().get_nameEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssignment1781);
                    lv__name_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    	        }
                           		set(
                           			current, 
                           			"_name",
                            		lv__name_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAssignment1795); 

                	newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getVariableKeyword_3());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:755:1: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:756:1: ( ruleEString )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:756:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:757:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssignmentRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssignment1818);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAssignment1830); 

                	newLeafNode(otherlv_6, grammarAccess.getAssignmentAccess().getExpressionKeyword_5());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:774:1: ( (lv_expression_7_0= ruleExpressionElement ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:775:1: (lv_expression_7_0= ruleExpressionElement )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:775:1: (lv_expression_7_0= ruleExpressionElement )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:776:3: lv_expression_7_0= ruleExpressionElement
            {
             
            	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionElementParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpressionElement_in_ruleAssignment1851);
            lv_expression_7_0=ruleExpressionElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_7_0, 
                    		"ExpressionElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAssignment1863); 

                	newLeafNode(otherlv_8, grammarAccess.getAssignmentAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:804:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:805:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:806:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression1899);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression1909); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:813:1: ruleExpression returns [EObject current=null] : (otherlv_0= 'Expression' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleOperator ) ) (otherlv_4= '_name' ( (lv__name_5_0= ruleEString ) ) )? otherlv_6= 'left' ( (lv_left_7_0= ruleExpressionElement ) ) otherlv_8= 'right' ( (lv_right_9_0= ruleExpressionElement ) ) otherlv_10= '}' ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_operator_3_0 = null;

        AntlrDatatypeRuleToken lv__name_5_0 = null;

        EObject lv_left_7_0 = null;

        EObject lv_right_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:816:28: ( (otherlv_0= 'Expression' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleOperator ) ) (otherlv_4= '_name' ( (lv__name_5_0= ruleEString ) ) )? otherlv_6= 'left' ( (lv_left_7_0= ruleExpressionElement ) ) otherlv_8= 'right' ( (lv_right_9_0= ruleExpressionElement ) ) otherlv_10= '}' ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:817:1: (otherlv_0= 'Expression' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleOperator ) ) (otherlv_4= '_name' ( (lv__name_5_0= ruleEString ) ) )? otherlv_6= 'left' ( (lv_left_7_0= ruleExpressionElement ) ) otherlv_8= 'right' ( (lv_right_9_0= ruleExpressionElement ) ) otherlv_10= '}' )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:817:1: (otherlv_0= 'Expression' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleOperator ) ) (otherlv_4= '_name' ( (lv__name_5_0= ruleEString ) ) )? otherlv_6= 'left' ( (lv_left_7_0= ruleExpressionElement ) ) otherlv_8= 'right' ( (lv_right_9_0= ruleExpressionElement ) ) otherlv_10= '}' )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:817:3: otherlv_0= 'Expression' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleOperator ) ) (otherlv_4= '_name' ( (lv__name_5_0= ruleEString ) ) )? otherlv_6= 'left' ( (lv_left_7_0= ruleExpressionElement ) ) otherlv_8= 'right' ( (lv_right_9_0= ruleExpressionElement ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleExpression1946); 

                	newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getExpressionKeyword_0());
                
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleExpression1958); 

                	newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleExpression1970); 

                	newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getOperatorKeyword_2());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:829:1: ( (lv_operator_3_0= ruleOperator ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:830:1: (lv_operator_3_0= ruleOperator )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:830:1: (lv_operator_3_0= ruleOperator )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:831:3: lv_operator_3_0= ruleOperator
            {
             
            	        newCompositeNode(grammarAccess.getExpressionAccess().getOperatorOperatorEnumRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperator_in_ruleExpression1991);
            lv_operator_3_0=ruleOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_3_0, 
                    		"Operator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:847:2: (otherlv_4= '_name' ( (lv__name_5_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:847:4: otherlv_4= '_name' ( (lv__name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleExpression2004); 

                        	newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().get_nameKeyword_4_0());
                        
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:851:1: ( (lv__name_5_0= ruleEString ) )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:852:1: (lv__name_5_0= ruleEString )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:852:1: (lv__name_5_0= ruleEString )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:853:3: lv__name_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionAccess().get_nameEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExpression2025);
                    lv__name_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"_name",
                            		lv__name_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleExpression2039); 

                	newLeafNode(otherlv_6, grammarAccess.getExpressionAccess().getLeftKeyword_5());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:873:1: ( (lv_left_7_0= ruleExpressionElement ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:874:1: (lv_left_7_0= ruleExpressionElement )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:874:1: (lv_left_7_0= ruleExpressionElement )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:875:3: lv_left_7_0= ruleExpressionElement
            {
             
            	        newCompositeNode(grammarAccess.getExpressionAccess().getLeftExpressionElementParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpressionElement_in_ruleExpression2060);
            lv_left_7_0=ruleExpressionElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_7_0, 
                    		"ExpressionElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleExpression2072); 

                	newLeafNode(otherlv_8, grammarAccess.getExpressionAccess().getRightKeyword_7());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:895:1: ( (lv_right_9_0= ruleExpressionElement ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:896:1: (lv_right_9_0= ruleExpressionElement )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:896:1: (lv_right_9_0= ruleExpressionElement )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:897:3: lv_right_9_0= ruleExpressionElement
            {
             
            	        newCompositeNode(grammarAccess.getExpressionAccess().getRightExpressionElementParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpressionElement_in_ruleExpression2093);
            lv_right_9_0=ruleExpressionElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"right",
                    		lv_right_9_0, 
                    		"ExpressionElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleExpression2105); 

                	newLeafNode(otherlv_10, grammarAccess.getExpressionAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBooleanData"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:925:1: entryRuleBooleanData returns [EObject current=null] : iv_ruleBooleanData= ruleBooleanData EOF ;
    public final EObject entryRuleBooleanData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanData = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:926:2: (iv_ruleBooleanData= ruleBooleanData EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:927:2: iv_ruleBooleanData= ruleBooleanData EOF
            {
             newCompositeNode(grammarAccess.getBooleanDataRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanData_in_entryRuleBooleanData2141);
            iv_ruleBooleanData=ruleBooleanData();

            state._fsp--;

             current =iv_ruleBooleanData; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanData2151); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanData"


    // $ANTLR start "ruleBooleanData"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:934:1: ruleBooleanData returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanData() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:937:28: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:938:1: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:938:1: ( (lv_value_0_0= ruleEBoolean ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:939:1: (lv_value_0_0= ruleEBoolean )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:939:1: (lv_value_0_0= ruleEBoolean )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:940:3: lv_value_0_0= ruleEBoolean
            {
             
            	        newCompositeNode(grammarAccess.getBooleanDataAccess().getValueEBooleanParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleBooleanData2196);
            lv_value_0_0=ruleEBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanDataRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EBoolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanData"


    // $ANTLR start "entryRuleIntegerData"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:964:1: entryRuleIntegerData returns [EObject current=null] : iv_ruleIntegerData= ruleIntegerData EOF ;
    public final EObject entryRuleIntegerData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerData = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:965:2: (iv_ruleIntegerData= ruleIntegerData EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:966:2: iv_ruleIntegerData= ruleIntegerData EOF
            {
             newCompositeNode(grammarAccess.getIntegerDataRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerData_in_entryRuleIntegerData2231);
            iv_ruleIntegerData=ruleIntegerData();

            state._fsp--;

             current =iv_ruleIntegerData; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerData2241); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerData"


    // $ANTLR start "ruleIntegerData"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:973:1: ruleIntegerData returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleIntegerData() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:976:28: ( ( (lv_value_0_0= ruleEInt ) ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:977:1: ( (lv_value_0_0= ruleEInt ) )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:977:1: ( (lv_value_0_0= ruleEInt ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:978:1: (lv_value_0_0= ruleEInt )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:978:1: (lv_value_0_0= ruleEInt )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:979:3: lv_value_0_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getIntegerDataAccess().getValueEIntParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleIntegerData2286);
            lv_value_0_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerDataRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerData"


    // $ANTLR start "entryRuleVariableReference"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1003:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1004:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1005:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
             newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_entryRuleVariableReference2321);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;

             current =iv_ruleVariableReference; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableReference2331); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableReference"


    // $ANTLR start "ruleVariableReference"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1012:1: ruleVariableReference returns [EObject current=null] : (otherlv_0= 'VariableReference' otherlv_1= '{' (otherlv_2= '_name' ( (lv__name_3_0= ruleEString ) ) )? otherlv_4= 'variable' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv__name_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1015:28: ( (otherlv_0= 'VariableReference' otherlv_1= '{' (otherlv_2= '_name' ( (lv__name_3_0= ruleEString ) ) )? otherlv_4= 'variable' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1016:1: (otherlv_0= 'VariableReference' otherlv_1= '{' (otherlv_2= '_name' ( (lv__name_3_0= ruleEString ) ) )? otherlv_4= 'variable' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1016:1: (otherlv_0= 'VariableReference' otherlv_1= '{' (otherlv_2= '_name' ( (lv__name_3_0= ruleEString ) ) )? otherlv_4= 'variable' ( ( ruleEString ) ) otherlv_6= '}' )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1016:3: otherlv_0= 'VariableReference' otherlv_1= '{' (otherlv_2= '_name' ( (lv__name_3_0= ruleEString ) ) )? otherlv_4= 'variable' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleVariableReference2368); 

                	newLeafNode(otherlv_0, grammarAccess.getVariableReferenceAccess().getVariableReferenceKeyword_0());
                
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleVariableReference2380); 

                	newLeafNode(otherlv_1, grammarAccess.getVariableReferenceAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1024:1: (otherlv_2= '_name' ( (lv__name_3_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1024:3: otherlv_2= '_name' ( (lv__name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleVariableReference2393); 

                        	newLeafNode(otherlv_2, grammarAccess.getVariableReferenceAccess().get_nameKeyword_2_0());
                        
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1028:1: ( (lv__name_3_0= ruleEString ) )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1029:1: (lv__name_3_0= ruleEString )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1029:1: (lv__name_3_0= ruleEString )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1030:3: lv__name_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableReferenceAccess().get_nameEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariableReference2414);
                    lv__name_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableReferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"_name",
                            		lv__name_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleVariableReference2428); 

                	newLeafNode(otherlv_4, grammarAccess.getVariableReferenceAccess().getVariableKeyword_3());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1050:1: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1051:1: ( ruleEString )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1051:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1052:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableReferenceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariableReference2451);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleVariableReference2463); 

                	newLeafNode(otherlv_6, grammarAccess.getVariableReferenceAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "entryRuleEInt"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1077:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1078:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1079:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt2500);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt2511); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1086:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1089:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1090:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1090:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1090:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1090:2: (kw= '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1091:2: kw= '-'
                    {
                    kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEInt2550); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt2567); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleCompositeState_Impl"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1111:1: entryRuleCompositeState_Impl returns [EObject current=null] : iv_ruleCompositeState_Impl= ruleCompositeState_Impl EOF ;
    public final EObject entryRuleCompositeState_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeState_Impl = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1112:2: (iv_ruleCompositeState_Impl= ruleCompositeState_Impl EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1113:2: iv_ruleCompositeState_Impl= ruleCompositeState_Impl EOF
            {
             newCompositeNode(grammarAccess.getCompositeState_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCompositeState_Impl_in_entryRuleCompositeState_Impl2612);
            iv_ruleCompositeState_Impl=ruleCompositeState_Impl();

            state._fsp--;

             current =iv_ruleCompositeState_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompositeState_Impl2622); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeState_Impl"


    // $ANTLR start "ruleCompositeState_Impl"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1120:1: ruleCompositeState_Impl returns [EObject current=null] : ( ( (lv_isActive_0_0= 'isActive' ) ) otherlv_1= 'CompositeState' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'operation' ( (lv_operation_5_0= ruleOperation ) ) )? otherlv_6= 'states' otherlv_7= '{' ( (lv_states_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_states_10_0= ruleState ) ) )* otherlv_11= '}' otherlv_12= 'initialState' ( (lv_initialState_13_0= ruleInitialState ) ) otherlv_14= '}' ) ;
    public final EObject ruleCompositeState_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_isActive_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_operation_5_0 = null;

        EObject lv_states_8_0 = null;

        EObject lv_states_10_0 = null;

        EObject lv_initialState_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1123:28: ( ( ( (lv_isActive_0_0= 'isActive' ) ) otherlv_1= 'CompositeState' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'operation' ( (lv_operation_5_0= ruleOperation ) ) )? otherlv_6= 'states' otherlv_7= '{' ( (lv_states_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_states_10_0= ruleState ) ) )* otherlv_11= '}' otherlv_12= 'initialState' ( (lv_initialState_13_0= ruleInitialState ) ) otherlv_14= '}' ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1124:1: ( ( (lv_isActive_0_0= 'isActive' ) ) otherlv_1= 'CompositeState' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'operation' ( (lv_operation_5_0= ruleOperation ) ) )? otherlv_6= 'states' otherlv_7= '{' ( (lv_states_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_states_10_0= ruleState ) ) )* otherlv_11= '}' otherlv_12= 'initialState' ( (lv_initialState_13_0= ruleInitialState ) ) otherlv_14= '}' )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1124:1: ( ( (lv_isActive_0_0= 'isActive' ) ) otherlv_1= 'CompositeState' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'operation' ( (lv_operation_5_0= ruleOperation ) ) )? otherlv_6= 'states' otherlv_7= '{' ( (lv_states_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_states_10_0= ruleState ) ) )* otherlv_11= '}' otherlv_12= 'initialState' ( (lv_initialState_13_0= ruleInitialState ) ) otherlv_14= '}' )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1124:2: ( (lv_isActive_0_0= 'isActive' ) ) otherlv_1= 'CompositeState' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'operation' ( (lv_operation_5_0= ruleOperation ) ) )? otherlv_6= 'states' otherlv_7= '{' ( (lv_states_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_states_10_0= ruleState ) ) )* otherlv_11= '}' otherlv_12= 'initialState' ( (lv_initialState_13_0= ruleInitialState ) ) otherlv_14= '}'
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1124:2: ( (lv_isActive_0_0= 'isActive' ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1125:1: (lv_isActive_0_0= 'isActive' )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1125:1: (lv_isActive_0_0= 'isActive' )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1126:3: lv_isActive_0_0= 'isActive'
            {
            lv_isActive_0_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleCompositeState_Impl2665); 

                    newLeafNode(lv_isActive_0_0, grammarAccess.getCompositeState_ImplAccess().getIsActiveIsActiveKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCompositeState_ImplRule());
            	        }
                   		setWithLastConsumed(current, "isActive", true, "isActive");
            	    

            }


            }

            otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleCompositeState_Impl2690); 

                	newLeafNode(otherlv_1, grammarAccess.getCompositeState_ImplAccess().getCompositeStateKeyword_1());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1143:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1144:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1144:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1145:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCompositeState_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCompositeState_Impl2711);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompositeState_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCompositeState_Impl2723); 

                	newLeafNode(otherlv_3, grammarAccess.getCompositeState_ImplAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1165:1: (otherlv_4= 'operation' ( (lv_operation_5_0= ruleOperation ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1165:3: otherlv_4= 'operation' ( (lv_operation_5_0= ruleOperation ) )
                    {
                    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCompositeState_Impl2736); 

                        	newLeafNode(otherlv_4, grammarAccess.getCompositeState_ImplAccess().getOperationKeyword_4_0());
                        
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1169:1: ( (lv_operation_5_0= ruleOperation ) )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1170:1: (lv_operation_5_0= ruleOperation )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1170:1: (lv_operation_5_0= ruleOperation )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1171:3: lv_operation_5_0= ruleOperation
                    {
                     
                    	        newCompositeNode(grammarAccess.getCompositeState_ImplAccess().getOperationOperationParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleCompositeState_Impl2757);
                    lv_operation_5_0=ruleOperation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCompositeState_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"operation",
                            		lv_operation_5_0, 
                            		"Operation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleCompositeState_Impl2771); 

                	newLeafNode(otherlv_6, grammarAccess.getCompositeState_ImplAccess().getStatesKeyword_5());
                
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCompositeState_Impl2783); 

                	newLeafNode(otherlv_7, grammarAccess.getCompositeState_ImplAccess().getLeftCurlyBracketKeyword_6());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1195:1: ( (lv_states_8_0= ruleState ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1196:1: (lv_states_8_0= ruleState )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1196:1: (lv_states_8_0= ruleState )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1197:3: lv_states_8_0= ruleState
            {
             
            	        newCompositeNode(grammarAccess.getCompositeState_ImplAccess().getStatesStateParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleCompositeState_Impl2804);
            lv_states_8_0=ruleState();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompositeState_ImplRule());
            	        }
                   		add(
                   			current, 
                   			"states",
                    		lv_states_8_0, 
                    		"State");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1213:2: (otherlv_9= ',' ( (lv_states_10_0= ruleState ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==15) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1213:4: otherlv_9= ',' ( (lv_states_10_0= ruleState ) )
            	    {
            	    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCompositeState_Impl2817); 

            	        	newLeafNode(otherlv_9, grammarAccess.getCompositeState_ImplAccess().getCommaKeyword_8_0());
            	        
            	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1217:1: ( (lv_states_10_0= ruleState ) )
            	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1218:1: (lv_states_10_0= ruleState )
            	    {
            	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1218:1: (lv_states_10_0= ruleState )
            	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1219:3: lv_states_10_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCompositeState_ImplAccess().getStatesStateParserRuleCall_8_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleCompositeState_Impl2838);
            	    lv_states_10_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCompositeState_ImplRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_10_0, 
            	            		"State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCompositeState_Impl2852); 

                	newLeafNode(otherlv_11, grammarAccess.getCompositeState_ImplAccess().getRightCurlyBracketKeyword_9());
                
            otherlv_12=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleCompositeState_Impl2864); 

                	newLeafNode(otherlv_12, grammarAccess.getCompositeState_ImplAccess().getInitialStateKeyword_10());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1243:1: ( (lv_initialState_13_0= ruleInitialState ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1244:1: (lv_initialState_13_0= ruleInitialState )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1244:1: (lv_initialState_13_0= ruleInitialState )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1245:3: lv_initialState_13_0= ruleInitialState
            {
             
            	        newCompositeNode(grammarAccess.getCompositeState_ImplAccess().getInitialStateInitialStateParserRuleCall_11_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInitialState_in_ruleCompositeState_Impl2885);
            lv_initialState_13_0=ruleInitialState();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompositeState_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"initialState",
                    		lv_initialState_13_0, 
                    		"InitialState");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_14=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCompositeState_Impl2897); 

                	newLeafNode(otherlv_14, grammarAccess.getCompositeState_ImplAccess().getRightCurlyBracketKeyword_12());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeState_Impl"


    // $ANTLR start "entryRuleBooleanVariable"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1273:1: entryRuleBooleanVariable returns [EObject current=null] : iv_ruleBooleanVariable= ruleBooleanVariable EOF ;
    public final EObject entryRuleBooleanVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanVariable = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1274:2: (iv_ruleBooleanVariable= ruleBooleanVariable EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1275:2: iv_ruleBooleanVariable= ruleBooleanVariable EOF
            {
             newCompositeNode(grammarAccess.getBooleanVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanVariable_in_entryRuleBooleanVariable2933);
            iv_ruleBooleanVariable=ruleBooleanVariable();

            state._fsp--;

             current =iv_ruleBooleanVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanVariable2943); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanVariable"


    // $ANTLR start "ruleBooleanVariable"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1282:1: ruleBooleanVariable returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'boolean' (otherlv_4= ':=' ( (lv_value_5_0= ruleBooleanData ) ) )? ) ;
    public final EObject ruleBooleanVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1285:28: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'boolean' (otherlv_4= ':=' ( (lv_value_5_0= ruleBooleanData ) ) )? ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1286:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'boolean' (otherlv_4= ':=' ( (lv_value_5_0= ruleBooleanData ) ) )? )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1286:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'boolean' (otherlv_4= ':=' ( (lv_value_5_0= ruleBooleanData ) ) )? )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1286:2: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'boolean' (otherlv_4= ':=' ( (lv_value_5_0= ruleBooleanData ) ) )?
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1286:2: ()
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1287:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanVariableAccess().getBooleanVariableAction_0(),
                        current);
                

            }

            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1292:2: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1293:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1293:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1294:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBooleanVariableAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBooleanVariable2998);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanVariableRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleBooleanVariable3010); 

                	newLeafNode(otherlv_2, grammarAccess.getBooleanVariableAccess().getColonKeyword_2());
                
            otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleBooleanVariable3022); 

                	newLeafNode(otherlv_3, grammarAccess.getBooleanVariableAccess().getBooleanKeyword_3());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1318:1: (otherlv_4= ':=' ( (lv_value_5_0= ruleBooleanData ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==41) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1318:3: otherlv_4= ':=' ( (lv_value_5_0= ruleBooleanData ) )
                    {
                    otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleBooleanVariable3035); 

                        	newLeafNode(otherlv_4, grammarAccess.getBooleanVariableAccess().getColonEqualsSignKeyword_4_0());
                        
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1322:1: ( (lv_value_5_0= ruleBooleanData ) )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1323:1: (lv_value_5_0= ruleBooleanData )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1323:1: (lv_value_5_0= ruleBooleanData )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1324:3: lv_value_5_0= ruleBooleanData
                    {
                     
                    	        newCompositeNode(grammarAccess.getBooleanVariableAccess().getValueBooleanDataParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanData_in_ruleBooleanVariable3056);
                    lv_value_5_0=ruleBooleanData();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBooleanVariableRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_5_0, 
                            		"BooleanData");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanVariable"


    // $ANTLR start "entryRuleIntegerVariable"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1348:1: entryRuleIntegerVariable returns [EObject current=null] : iv_ruleIntegerVariable= ruleIntegerVariable EOF ;
    public final EObject entryRuleIntegerVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerVariable = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1349:2: (iv_ruleIntegerVariable= ruleIntegerVariable EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1350:2: iv_ruleIntegerVariable= ruleIntegerVariable EOF
            {
             newCompositeNode(grammarAccess.getIntegerVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerVariable_in_entryRuleIntegerVariable3094);
            iv_ruleIntegerVariable=ruleIntegerVariable();

            state._fsp--;

             current =iv_ruleIntegerVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerVariable3104); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerVariable"


    // $ANTLR start "ruleIntegerVariable"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1357:1: ruleIntegerVariable returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'integer' (otherlv_4= ':=' ( (lv_value_5_0= ruleIntegerData ) ) )? ) ;
    public final EObject ruleIntegerVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1360:28: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'integer' (otherlv_4= ':=' ( (lv_value_5_0= ruleIntegerData ) ) )? ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1361:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'integer' (otherlv_4= ':=' ( (lv_value_5_0= ruleIntegerData ) ) )? )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1361:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'integer' (otherlv_4= ':=' ( (lv_value_5_0= ruleIntegerData ) ) )? )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1361:2: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'integer' (otherlv_4= ':=' ( (lv_value_5_0= ruleIntegerData ) ) )?
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1361:2: ()
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1362:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIntegerVariableAccess().getIntegerVariableAction_0(),
                        current);
                

            }

            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1367:2: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1368:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1368:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1369:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getIntegerVariableAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIntegerVariable3159);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerVariableRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleIntegerVariable3171); 

                	newLeafNode(otherlv_2, grammarAccess.getIntegerVariableAccess().getColonKeyword_2());
                
            otherlv_3=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleIntegerVariable3183); 

                	newLeafNode(otherlv_3, grammarAccess.getIntegerVariableAccess().getIntegerKeyword_3());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1393:1: (otherlv_4= ':=' ( (lv_value_5_0= ruleIntegerData ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==41) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1393:3: otherlv_4= ':=' ( (lv_value_5_0= ruleIntegerData ) )
                    {
                    otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleIntegerVariable3196); 

                        	newLeafNode(otherlv_4, grammarAccess.getIntegerVariableAccess().getColonEqualsSignKeyword_4_0());
                        
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1397:1: ( (lv_value_5_0= ruleIntegerData ) )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1398:1: (lv_value_5_0= ruleIntegerData )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1398:1: (lv_value_5_0= ruleIntegerData )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1399:3: lv_value_5_0= ruleIntegerData
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntegerVariableAccess().getValueIntegerDataParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerData_in_ruleIntegerVariable3217);
                    lv_value_5_0=ruleIntegerData();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntegerVariableRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_5_0, 
                            		"IntegerData");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerVariable"


    // $ANTLR start "ruleOperator"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1423:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'add' ) | (enumLiteral_1= 'sub' ) | (enumLiteral_2= 'eq' ) | (enumLiteral_3= 'mul' ) | (enumLiteral_4= 'gt' ) | (enumLiteral_5= 'lt' ) | (enumLiteral_6= 'lte' ) | (enumLiteral_7= 'gte' ) | (enumLiteral_8= 'div' ) | (enumLiteral_9= 'and' ) | (enumLiteral_10= 'neq' ) | (enumLiteral_11= 'or' ) | (enumLiteral_12= 'not' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;

         enterRule(); 
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1425:28: ( ( (enumLiteral_0= 'add' ) | (enumLiteral_1= 'sub' ) | (enumLiteral_2= 'eq' ) | (enumLiteral_3= 'mul' ) | (enumLiteral_4= 'gt' ) | (enumLiteral_5= 'lt' ) | (enumLiteral_6= 'lte' ) | (enumLiteral_7= 'gte' ) | (enumLiteral_8= 'div' ) | (enumLiteral_9= 'and' ) | (enumLiteral_10= 'neq' ) | (enumLiteral_11= 'or' ) | (enumLiteral_12= 'not' ) ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1426:1: ( (enumLiteral_0= 'add' ) | (enumLiteral_1= 'sub' ) | (enumLiteral_2= 'eq' ) | (enumLiteral_3= 'mul' ) | (enumLiteral_4= 'gt' ) | (enumLiteral_5= 'lt' ) | (enumLiteral_6= 'lte' ) | (enumLiteral_7= 'gte' ) | (enumLiteral_8= 'div' ) | (enumLiteral_9= 'and' ) | (enumLiteral_10= 'neq' ) | (enumLiteral_11= 'or' ) | (enumLiteral_12= 'not' ) )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1426:1: ( (enumLiteral_0= 'add' ) | (enumLiteral_1= 'sub' ) | (enumLiteral_2= 'eq' ) | (enumLiteral_3= 'mul' ) | (enumLiteral_4= 'gt' ) | (enumLiteral_5= 'lt' ) | (enumLiteral_6= 'lte' ) | (enumLiteral_7= 'gte' ) | (enumLiteral_8= 'div' ) | (enumLiteral_9= 'and' ) | (enumLiteral_10= 'neq' ) | (enumLiteral_11= 'or' ) | (enumLiteral_12= 'not' ) )
            int alt19=13;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt19=1;
                }
                break;
            case 44:
                {
                alt19=2;
                }
                break;
            case 45:
                {
                alt19=3;
                }
                break;
            case 46:
                {
                alt19=4;
                }
                break;
            case 47:
                {
                alt19=5;
                }
                break;
            case 48:
                {
                alt19=6;
                }
                break;
            case 49:
                {
                alt19=7;
                }
                break;
            case 50:
                {
                alt19=8;
                }
                break;
            case 51:
                {
                alt19=9;
                }
                break;
            case 52:
                {
                alt19=10;
                }
                break;
            case 53:
                {
                alt19=11;
                }
                break;
            case 54:
                {
                alt19=12;
                }
                break;
            case 55:
                {
                alt19=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1426:2: (enumLiteral_0= 'add' )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1426:2: (enumLiteral_0= 'add' )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1426:4: enumLiteral_0= 'add'
                    {
                    enumLiteral_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleOperator3269); 

                            current = grammarAccess.getOperatorAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getAddEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1432:6: (enumLiteral_1= 'sub' )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1432:6: (enumLiteral_1= 'sub' )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1432:8: enumLiteral_1= 'sub'
                    {
                    enumLiteral_1=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleOperator3286); 

                            current = grammarAccess.getOperatorAccess().getSubEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getSubEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1438:6: (enumLiteral_2= 'eq' )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1438:6: (enumLiteral_2= 'eq' )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1438:8: enumLiteral_2= 'eq'
                    {
                    enumLiteral_2=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleOperator3303); 

                            current = grammarAccess.getOperatorAccess().getEqEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getEqEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1444:6: (enumLiteral_3= 'mul' )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1444:6: (enumLiteral_3= 'mul' )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1444:8: enumLiteral_3= 'mul'
                    {
                    enumLiteral_3=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleOperator3320); 

                            current = grammarAccess.getOperatorAccess().getMulEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getMulEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1450:6: (enumLiteral_4= 'gt' )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1450:6: (enumLiteral_4= 'gt' )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1450:8: enumLiteral_4= 'gt'
                    {
                    enumLiteral_4=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleOperator3337); 

                            current = grammarAccess.getOperatorAccess().getGtEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getOperatorAccess().getGtEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1456:6: (enumLiteral_5= 'lt' )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1456:6: (enumLiteral_5= 'lt' )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1456:8: enumLiteral_5= 'lt'
                    {
                    enumLiteral_5=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleOperator3354); 

                            current = grammarAccess.getOperatorAccess().getLtEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getOperatorAccess().getLtEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1462:6: (enumLiteral_6= 'lte' )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1462:6: (enumLiteral_6= 'lte' )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1462:8: enumLiteral_6= 'lte'
                    {
                    enumLiteral_6=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleOperator3371); 

                            current = grammarAccess.getOperatorAccess().getLteEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getOperatorAccess().getLteEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1468:6: (enumLiteral_7= 'gte' )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1468:6: (enumLiteral_7= 'gte' )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1468:8: enumLiteral_7= 'gte'
                    {
                    enumLiteral_7=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleOperator3388); 

                            current = grammarAccess.getOperatorAccess().getGteEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getOperatorAccess().getGteEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1474:6: (enumLiteral_8= 'div' )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1474:6: (enumLiteral_8= 'div' )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1474:8: enumLiteral_8= 'div'
                    {
                    enumLiteral_8=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleOperator3405); 

                            current = grammarAccess.getOperatorAccess().getDivEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getOperatorAccess().getDivEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1480:6: (enumLiteral_9= 'and' )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1480:6: (enumLiteral_9= 'and' )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1480:8: enumLiteral_9= 'and'
                    {
                    enumLiteral_9=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleOperator3422); 

                            current = grammarAccess.getOperatorAccess().getAndEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getOperatorAccess().getAndEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1486:6: (enumLiteral_10= 'neq' )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1486:6: (enumLiteral_10= 'neq' )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1486:8: enumLiteral_10= 'neq'
                    {
                    enumLiteral_10=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleOperator3439); 

                            current = grammarAccess.getOperatorAccess().getNeqEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getOperatorAccess().getNeqEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1492:6: (enumLiteral_11= 'or' )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1492:6: (enumLiteral_11= 'or' )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1492:8: enumLiteral_11= 'or'
                    {
                    enumLiteral_11=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleOperator3456); 

                            current = grammarAccess.getOperatorAccess().getOrEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getOperatorAccess().getOrEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1498:6: (enumLiteral_12= 'not' )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1498:6: (enumLiteral_12= 'not' )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1498:8: enumLiteral_12= 'not'
                    {
                    enumLiteral_12=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleOperator3473); 

                            current = grammarAccess.getOperatorAccess().getNotEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getOperatorAccess().getNotEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperator"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleStateMachine_in_entryRuleStateMachine75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStateMachine85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleStateMachine128 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStateMachine153 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStateMachine174 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleStateMachine186 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleStateMachine207 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_14_in_ruleStateMachine220 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleStateMachine232 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEvent_in_ruleStateMachine253 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleStateMachine266 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEvent_in_ruleStateMachine287 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleStateMachine301 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleStateMachine313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_entryRuleState349 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_Impl_in_ruleState406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateMachine_in_ruleState433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeState_Impl_in_ruleState460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable495 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleVariable542 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleBooleanVariable_in_ruleVariable565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerVariable_in_ruleVariable592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionElement_in_entryRuleExpressionElement628 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpressionElement638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionElement685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanData_in_ruleExpressionElement712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerData_in_ruleExpressionElement739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_ruleExpressionElement766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString804 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean927 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleEBoolean976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleEBoolean995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation1035 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperation1045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleOperation1091 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleOperation1103 = new BitSet(new long[]{0x0000000000210000L});
        public static final BitSet FOLLOW_21_in_ruleOperation1116 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleOperation1128 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleOperation1149 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleOperation1162 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleOperation1183 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleOperation1197 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleOperation1211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_Impl_in_entryRuleState_Impl1247 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState_Impl1257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleState_Impl1300 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleState_Impl1325 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState_Impl1346 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleState_Impl1358 = new BitSet(new long[]{0x0000000000810000L});
        public static final BitSet FOLLOW_23_in_ruleState_Impl1371 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleState_Impl1392 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleState_Impl1406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitialState_in_entryRuleInitialState1442 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInitialState1452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleInitialState1489 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleInitialState1501 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleInitialState1513 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInitialState1536 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleInitialState1548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent1586 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEvent1596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEvent1647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1688 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleAssignment1735 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAssignment1747 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_27_in_ruleAssignment1760 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssignment1781 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleAssignment1795 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssignment1818 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleAssignment1830 = new BitSet(new long[]{0x0000000C400C0040L});
        public static final BitSet FOLLOW_ruleExpressionElement_in_ruleAssignment1851 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleAssignment1863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1899 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression1909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleExpression1946 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleExpression1958 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleExpression1970 = new BitSet(new long[]{0x00FFF80000000000L});
        public static final BitSet FOLLOW_ruleOperator_in_ruleExpression1991 = new BitSet(new long[]{0x0000000108000000L});
        public static final BitSet FOLLOW_27_in_ruleExpression2004 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExpression2025 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleExpression2039 = new BitSet(new long[]{0x0000000C400C0040L});
        public static final BitSet FOLLOW_ruleExpressionElement_in_ruleExpression2060 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleExpression2072 = new BitSet(new long[]{0x0000000C400C0040L});
        public static final BitSet FOLLOW_ruleExpressionElement_in_ruleExpression2093 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleExpression2105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanData_in_entryRuleBooleanData2141 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanData2151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleBooleanData2196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerData_in_entryRuleIntegerData2231 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerData2241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleIntegerData2286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference2321 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference2331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleVariableReference2368 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleVariableReference2380 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_27_in_ruleVariableReference2393 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariableReference2414 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleVariableReference2428 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariableReference2451 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleVariableReference2463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2500 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt2511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleEInt2550 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeState_Impl_in_entryRuleCompositeState_Impl2612 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompositeState_Impl2622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleCompositeState_Impl2665 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleCompositeState_Impl2690 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCompositeState_Impl2711 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCompositeState_Impl2723 = new BitSet(new long[]{0x0000002000800000L});
        public static final BitSet FOLLOW_23_in_ruleCompositeState_Impl2736 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleCompositeState_Impl2757 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleCompositeState_Impl2771 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCompositeState_Impl2783 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleState_in_ruleCompositeState_Impl2804 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleCompositeState_Impl2817 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleState_in_ruleCompositeState_Impl2838 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleCompositeState_Impl2852 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleCompositeState_Impl2864 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleInitialState_in_ruleCompositeState_Impl2885 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleCompositeState_Impl2897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanVariable_in_entryRuleBooleanVariable2933 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanVariable2943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBooleanVariable2998 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleBooleanVariable3010 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleBooleanVariable3022 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_41_in_ruleBooleanVariable3035 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_ruleBooleanData_in_ruleBooleanVariable3056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerVariable_in_entryRuleIntegerVariable3094 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerVariable3104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIntegerVariable3159 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleIntegerVariable3171 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleIntegerVariable3183 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_41_in_ruleIntegerVariable3196 = new BitSet(new long[]{0x0000000800000040L});
        public static final BitSet FOLLOW_ruleIntegerData_in_ruleIntegerVariable3217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleOperator3269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleOperator3286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleOperator3303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleOperator3320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleOperator3337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleOperator3354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleOperator3371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleOperator3388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleOperator3405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleOperator3422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleOperator3439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleOperator3456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleOperator3473 = new BitSet(new long[]{0x0000000000000002L});
    }


}