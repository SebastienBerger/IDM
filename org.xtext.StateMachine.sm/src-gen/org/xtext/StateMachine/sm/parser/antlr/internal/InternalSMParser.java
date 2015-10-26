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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'StateMachine'", "'{'", "'events'", "','", "'}'", "'init with'", "'var'", "'true'", "'false'", "';'", "'state'", "'do'", "'from'", "'to'", "'for'", "'guard'", "':='", "'left'", "'op'", "'right'", "'-'", "':'", "'boolean'", "'integer'", "'add'", "'sub'", "'eq'", "'mul'", "'gt'", "'lt'", "'lte'", "'gte'", "'div'", "'and'", "'neq'", "'or'", "'not'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:77:1: ruleStateMachine returns [EObject current=null] : (otherlv_0= 'StateMachine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleVariable ) )* otherlv_4= 'events' otherlv_5= '{' ( (lv_events_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}' ( (lv_states_10_0= ruleState ) )+ otherlv_11= 'init with' ( (lv_initialState_12_0= ruleInitialState ) ) ( (lv_transitions_13_0= ruleTransition ) )+ otherlv_14= '}' ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_variables_3_0 = null;

        EObject lv_events_6_0 = null;

        EObject lv_events_8_0 = null;

        EObject lv_states_10_0 = null;

        EObject lv_initialState_12_0 = null;

        EObject lv_transitions_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:80:28: ( (otherlv_0= 'StateMachine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleVariable ) )* otherlv_4= 'events' otherlv_5= '{' ( (lv_events_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}' ( (lv_states_10_0= ruleState ) )+ otherlv_11= 'init with' ( (lv_initialState_12_0= ruleInitialState ) ) ( (lv_transitions_13_0= ruleTransition ) )+ otherlv_14= '}' ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:81:1: (otherlv_0= 'StateMachine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleVariable ) )* otherlv_4= 'events' otherlv_5= '{' ( (lv_events_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}' ( (lv_states_10_0= ruleState ) )+ otherlv_11= 'init with' ( (lv_initialState_12_0= ruleInitialState ) ) ( (lv_transitions_13_0= ruleTransition ) )+ otherlv_14= '}' )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:81:1: (otherlv_0= 'StateMachine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleVariable ) )* otherlv_4= 'events' otherlv_5= '{' ( (lv_events_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}' ( (lv_states_10_0= ruleState ) )+ otherlv_11= 'init with' ( (lv_initialState_12_0= ruleInitialState ) ) ( (lv_transitions_13_0= ruleTransition ) )+ otherlv_14= '}' )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:81:3: otherlv_0= 'StateMachine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleVariable ) )* otherlv_4= 'events' otherlv_5= '{' ( (lv_events_6_0= ruleEvent ) ) (otherlv_7= ',' ( (lv_events_8_0= ruleEvent ) ) )* otherlv_9= '}' ( (lv_states_10_0= ruleState ) )+ otherlv_11= 'init with' ( (lv_initialState_12_0= ruleInitialState ) ) ( (lv_transitions_13_0= ruleTransition ) )+ otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleStateMachine122); 

                	newLeafNode(otherlv_0, grammarAccess.getStateMachineAccess().getStateMachineKeyword_0());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:85:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:86:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:86:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:87:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStateMachineAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStateMachine143);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStateMachine155); 

                	newLeafNode(otherlv_2, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:107:1: ( (lv_variables_3_0= ruleVariable ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:108:1: (lv_variables_3_0= ruleVariable )
            	    {
            	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:108:1: (lv_variables_3_0= ruleVariable )
            	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:109:3: lv_variables_3_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getVariablesVariableParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleStateMachine176);
            	    lv_variables_3_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_3_0, 
            	            		"Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStateMachine189); 

                	newLeafNode(otherlv_4, grammarAccess.getStateMachineAccess().getEventsKeyword_4());
                
            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStateMachine201); 

                	newLeafNode(otherlv_5, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:133:1: ( (lv_events_6_0= ruleEvent ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:134:1: (lv_events_6_0= ruleEvent )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:134:1: (lv_events_6_0= ruleEvent )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:135:3: lv_events_6_0= ruleEvent
            {
             
            	        newCompositeNode(grammarAccess.getStateMachineAccess().getEventsEventParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEvent_in_ruleStateMachine222);
            lv_events_6_0=ruleEvent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	        }
                   		add(
                   			current, 
                   			"events",
                    		lv_events_6_0, 
                    		"Event");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:151:2: (otherlv_7= ',' ( (lv_events_8_0= ruleEvent ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:151:4: otherlv_7= ',' ( (lv_events_8_0= ruleEvent ) )
            	    {
            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleStateMachine235); 

            	        	newLeafNode(otherlv_7, grammarAccess.getStateMachineAccess().getCommaKeyword_7_0());
            	        
            	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:155:1: ( (lv_events_8_0= ruleEvent ) )
            	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:156:1: (lv_events_8_0= ruleEvent )
            	    {
            	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:156:1: (lv_events_8_0= ruleEvent )
            	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:157:3: lv_events_8_0= ruleEvent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getEventsEventParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEvent_in_ruleStateMachine256);
            	    lv_events_8_0=ruleEvent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"events",
            	            		lv_events_8_0, 
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

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStateMachine270); 

                	newLeafNode(otherlv_9, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_8());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:177:1: ( (lv_states_10_0= ruleState ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11||LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:178:1: (lv_states_10_0= ruleState )
            	    {
            	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:178:1: (lv_states_10_0= ruleState )
            	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:179:3: lv_states_10_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleStateMachine291);
            	    lv_states_10_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_10_0, 
            	            		"State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStateMachine304); 

                	newLeafNode(otherlv_11, grammarAccess.getStateMachineAccess().getInitWithKeyword_10());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:199:1: ( (lv_initialState_12_0= ruleInitialState ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:200:1: (lv_initialState_12_0= ruleInitialState )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:200:1: (lv_initialState_12_0= ruleInitialState )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:201:3: lv_initialState_12_0= ruleInitialState
            {
             
            	        newCompositeNode(grammarAccess.getStateMachineAccess().getInitialStateInitialStateParserRuleCall_11_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInitialState_in_ruleStateMachine325);
            lv_initialState_12_0=ruleInitialState();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	        }
                   		set(
                   			current, 
                   			"initialState",
                    		lv_initialState_12_0, 
                    		"InitialState");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:217:2: ( (lv_transitions_13_0= ruleTransition ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:218:1: (lv_transitions_13_0= ruleTransition )
            	    {
            	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:218:1: (lv_transitions_13_0= ruleTransition )
            	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:219:3: lv_transitions_13_0= ruleTransition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleStateMachine346);
            	    lv_transitions_13_0=ruleTransition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"transitions",
            	            		lv_transitions_13_0, 
            	            		"Transition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStateMachine359); 

                	newLeafNode(otherlv_14, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_13());
                

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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:247:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:248:2: (iv_ruleState= ruleState EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:249:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_in_entryRuleState395);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState405); 

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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:256:1: ruleState returns [EObject current=null] : (this_State_Impl_0= ruleState_Impl | this_StateMachine_1= ruleStateMachine | this_CompositeState_Impl_2= ruleCompositeState_Impl ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        EObject this_State_Impl_0 = null;

        EObject this_StateMachine_1 = null;

        EObject this_CompositeState_Impl_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:259:28: ( (this_State_Impl_0= ruleState_Impl | this_StateMachine_1= ruleStateMachine | this_CompositeState_Impl_2= ruleCompositeState_Impl ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:260:1: (this_State_Impl_0= ruleState_Impl | this_StateMachine_1= ruleStateMachine | this_CompositeState_Impl_2= ruleCompositeState_Impl )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:260:1: (this_State_Impl_0= ruleState_Impl | this_StateMachine_1= ruleStateMachine | this_CompositeState_Impl_2= ruleCompositeState_Impl )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_STRING) ) {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3==12) ) {
                        int LA5_5 = input.LA(4);

                        if ( (LA5_5==11||LA5_5==21) ) {
                            alt5=3;
                        }
                        else if ( (LA5_5==15||LA5_5==22) ) {
                            alt5=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA5_1==RULE_ID) ) {
                    int LA5_4 = input.LA(3);

                    if ( (LA5_4==12) ) {
                        int LA5_5 = input.LA(4);

                        if ( (LA5_5==11||LA5_5==21) ) {
                            alt5=3;
                        }
                        else if ( (LA5_5==15||LA5_5==22) ) {
                            alt5=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==11) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:261:5: this_State_Impl_0= ruleState_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getStateAccess().getState_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleState_Impl_in_ruleState452);
                    this_State_Impl_0=ruleState_Impl();

                    state._fsp--;

                     
                            current = this_State_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:271:5: this_StateMachine_1= ruleStateMachine
                    {
                     
                            newCompositeNode(grammarAccess.getStateAccess().getStateMachineParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStateMachine_in_ruleState479);
                    this_StateMachine_1=ruleStateMachine();

                    state._fsp--;

                     
                            current = this_StateMachine_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:281:5: this_CompositeState_Impl_2= ruleCompositeState_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getStateAccess().getCompositeState_ImplParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCompositeState_Impl_in_ruleState506);
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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:297:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:298:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:299:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable541);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable551); 

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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:306:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'var' (this_BooleanVariable_1= ruleBooleanVariable | this_IntegerVariable_2= ruleIntegerVariable ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_BooleanVariable_1 = null;

        EObject this_IntegerVariable_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:309:28: ( (otherlv_0= 'var' (this_BooleanVariable_1= ruleBooleanVariable | this_IntegerVariable_2= ruleIntegerVariable ) ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:310:1: (otherlv_0= 'var' (this_BooleanVariable_1= ruleBooleanVariable | this_IntegerVariable_2= ruleIntegerVariable ) )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:310:1: (otherlv_0= 'var' (this_BooleanVariable_1= ruleBooleanVariable | this_IntegerVariable_2= ruleIntegerVariable ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:310:3: otherlv_0= 'var' (this_BooleanVariable_1= ruleBooleanVariable | this_IntegerVariable_2= ruleIntegerVariable )
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleVariable588); 

                	newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVarKeyword_0());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:314:1: (this_BooleanVariable_1= ruleBooleanVariable | this_IntegerVariable_2= ruleIntegerVariable )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==32) ) {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==33) ) {
                        alt6=1;
                    }
                    else if ( (LA6_3==34) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==RULE_ID) ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==32) ) {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==33) ) {
                        alt6=1;
                    }
                    else if ( (LA6_3==34) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:315:5: this_BooleanVariable_1= ruleBooleanVariable
                    {
                     
                            newCompositeNode(grammarAccess.getVariableAccess().getBooleanVariableParserRuleCall_1_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanVariable_in_ruleVariable611);
                    this_BooleanVariable_1=ruleBooleanVariable();

                    state._fsp--;

                     
                            current = this_BooleanVariable_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:325:5: this_IntegerVariable_2= ruleIntegerVariable
                    {
                     
                            newCompositeNode(grammarAccess.getVariableAccess().getIntegerVariableParserRuleCall_1_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerVariable_in_ruleVariable638);
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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:341:1: entryRuleExpressionElement returns [EObject current=null] : iv_ruleExpressionElement= ruleExpressionElement EOF ;
    public final EObject entryRuleExpressionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionElement = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:342:2: (iv_ruleExpressionElement= ruleExpressionElement EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:343:2: iv_ruleExpressionElement= ruleExpressionElement EOF
            {
             newCompositeNode(grammarAccess.getExpressionElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionElement_in_entryRuleExpressionElement674);
            iv_ruleExpressionElement=ruleExpressionElement();

            state._fsp--;

             current =iv_ruleExpressionElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpressionElement684); 

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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:350:1: ruleExpressionElement returns [EObject current=null] : (this_Expression_0= ruleExpression | this_BooleanData_1= ruleBooleanData | this_IntegerData_2= ruleIntegerData | this_VariableReference_3= ruleVariableReference ) ;
    public final EObject ruleExpressionElement() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;

        EObject this_BooleanData_1 = null;

        EObject this_IntegerData_2 = null;

        EObject this_VariableReference_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:353:28: ( (this_Expression_0= ruleExpression | this_BooleanData_1= ruleBooleanData | this_IntegerData_2= ruleIntegerData | this_VariableReference_3= ruleVariableReference ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:354:1: (this_Expression_0= ruleExpression | this_BooleanData_1= ruleBooleanData | this_IntegerData_2= ruleIntegerData | this_VariableReference_3= ruleVariableReference )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:354:1: (this_Expression_0= ruleExpression | this_BooleanData_1= ruleBooleanData | this_IntegerData_2= ruleIntegerData | this_VariableReference_3= ruleVariableReference )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt7=1;
                }
                break;
            case 18:
            case 19:
                {
                alt7=2;
                }
                break;
            case RULE_INT:
            case 31:
                {
                alt7=3;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:355:5: this_Expression_0= ruleExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionElementAccess().getExpressionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleExpressionElement731);
                    this_Expression_0=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:365:5: this_BooleanData_1= ruleBooleanData
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionElementAccess().getBooleanDataParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanData_in_ruleExpressionElement758);
                    this_BooleanData_1=ruleBooleanData();

                    state._fsp--;

                     
                            current = this_BooleanData_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:375:5: this_IntegerData_2= ruleIntegerData
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionElementAccess().getIntegerDataParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerData_in_ruleExpressionElement785);
                    this_IntegerData_2=ruleIntegerData();

                    state._fsp--;

                     
                            current = this_IntegerData_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:385:5: this_VariableReference_3= ruleVariableReference
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionElementAccess().getVariableReferenceParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_ruleExpressionElement812);
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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:403:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:404:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:405:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString850);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString861); 

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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:412:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:415:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:416:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:416:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:416:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString901); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:424:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString927); 

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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:439:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:440:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:441:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean973);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean984); 

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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:448:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:451:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:452:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:452:1: (kw= 'true' | kw= 'false' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            else if ( (LA9_0==19) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:453:2: kw= 'true'
                    {
                    kw=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEBoolean1022); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:460:2: kw= 'false'
                    {
                    kw=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEBoolean1041); 

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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:473:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:474:2: (iv_ruleOperation= ruleOperation EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:475:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_entryRuleOperation1081);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperation1091); 

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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:482:1: ruleOperation returns [EObject current=null] : ( () (otherlv_1= '{' ( (lv_contents_2_0= ruleAssignment ) ) (otherlv_3= ';' ( (lv_contents_4_0= ruleAssignment ) ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_contents_2_0 = null;

        EObject lv_contents_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:485:28: ( ( () (otherlv_1= '{' ( (lv_contents_2_0= ruleAssignment ) ) (otherlv_3= ';' ( (lv_contents_4_0= ruleAssignment ) ) )* otherlv_5= '}' )? ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:486:1: ( () (otherlv_1= '{' ( (lv_contents_2_0= ruleAssignment ) ) (otherlv_3= ';' ( (lv_contents_4_0= ruleAssignment ) ) )* otherlv_5= '}' )? )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:486:1: ( () (otherlv_1= '{' ( (lv_contents_2_0= ruleAssignment ) ) (otherlv_3= ';' ( (lv_contents_4_0= ruleAssignment ) ) )* otherlv_5= '}' )? )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:486:2: () (otherlv_1= '{' ( (lv_contents_2_0= ruleAssignment ) ) (otherlv_3= ';' ( (lv_contents_4_0= ruleAssignment ) ) )* otherlv_5= '}' )?
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:486:2: ()
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:487:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOperationAccess().getOperationAction_0(),
                        current);
                

            }

            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:492:2: (otherlv_1= '{' ( (lv_contents_2_0= ruleAssignment ) ) (otherlv_3= ';' ( (lv_contents_4_0= ruleAssignment ) ) )* otherlv_5= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:492:4: otherlv_1= '{' ( (lv_contents_2_0= ruleAssignment ) ) (otherlv_3= ';' ( (lv_contents_4_0= ruleAssignment ) ) )* otherlv_5= '}'
                    {
                    otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOperation1138); 

                        	newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:496:1: ( (lv_contents_2_0= ruleAssignment ) )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:497:1: (lv_contents_2_0= ruleAssignment )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:497:1: (lv_contents_2_0= ruleAssignment )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:498:3: lv_contents_2_0= ruleAssignment
                    {
                     
                    	        newCompositeNode(grammarAccess.getOperationAccess().getContentsAssignmentParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleOperation1159);
                    lv_contents_2_0=ruleAssignment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOperationRule());
                    	        }
                           		add(
                           			current, 
                           			"contents",
                            		lv_contents_2_0, 
                            		"Assignment");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:514:2: (otherlv_3= ';' ( (lv_contents_4_0= ruleAssignment ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==20) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:514:4: otherlv_3= ';' ( (lv_contents_4_0= ruleAssignment ) )
                    	    {
                    	    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleOperation1172); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getSemicolonKeyword_1_2_0());
                    	        
                    	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:518:1: ( (lv_contents_4_0= ruleAssignment ) )
                    	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:519:1: (lv_contents_4_0= ruleAssignment )
                    	    {
                    	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:519:1: (lv_contents_4_0= ruleAssignment )
                    	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:520:3: lv_contents_4_0= ruleAssignment
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOperationAccess().getContentsAssignmentParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleOperation1193);
                    	    lv_contents_4_0=ruleAssignment();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOperationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"contents",
                    	            		lv_contents_4_0, 
                    	            		"Assignment");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOperation1207); 

                        	newLeafNode(otherlv_5, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_1_3());
                        

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleState_Impl"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:548:1: entryRuleState_Impl returns [EObject current=null] : iv_ruleState_Impl= ruleState_Impl EOF ;
    public final EObject entryRuleState_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState_Impl = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:549:2: (iv_ruleState_Impl= ruleState_Impl EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:550:2: iv_ruleState_Impl= ruleState_Impl EOF
            {
             newCompositeNode(grammarAccess.getState_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_Impl_in_entryRuleState_Impl1245);
            iv_ruleState_Impl=ruleState_Impl();

            state._fsp--;

             current =iv_ruleState_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState_Impl1255); 

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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:557:1: ruleState_Impl returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'do' ( (lv_operation_4_0= ruleOperation ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleState_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_operation_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:560:28: ( (otherlv_0= 'state' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'do' ( (lv_operation_4_0= ruleOperation ) ) )? otherlv_5= '}' ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:561:1: (otherlv_0= 'state' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'do' ( (lv_operation_4_0= ruleOperation ) ) )? otherlv_5= '}' )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:561:1: (otherlv_0= 'state' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'do' ( (lv_operation_4_0= ruleOperation ) ) )? otherlv_5= '}' )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:561:3: otherlv_0= 'state' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'do' ( (lv_operation_4_0= ruleOperation ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleState_Impl1292); 

                	newLeafNode(otherlv_0, grammarAccess.getState_ImplAccess().getStateKeyword_0());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:565:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:566:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:566:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:567:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getState_ImplAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState_Impl1313);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getState_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleState_Impl1325); 

                	newLeafNode(otherlv_2, grammarAccess.getState_ImplAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:587:1: (otherlv_3= 'do' ( (lv_operation_4_0= ruleOperation ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:587:3: otherlv_3= 'do' ( (lv_operation_4_0= ruleOperation ) )
                    {
                    otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleState_Impl1338); 

                        	newLeafNode(otherlv_3, grammarAccess.getState_ImplAccess().getDoKeyword_3_0());
                        
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:591:1: ( (lv_operation_4_0= ruleOperation ) )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:592:1: (lv_operation_4_0= ruleOperation )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:592:1: (lv_operation_4_0= ruleOperation )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:593:3: lv_operation_4_0= ruleOperation
                    {
                     
                    	        newCompositeNode(grammarAccess.getState_ImplAccess().getOperationOperationParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleState_Impl1359);
                    lv_operation_4_0=ruleOperation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getState_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"operation",
                            		lv_operation_4_0, 
                            		"Operation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleState_Impl1373); 

                	newLeafNode(otherlv_5, grammarAccess.getState_ImplAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:621:1: entryRuleInitialState returns [EObject current=null] : iv_ruleInitialState= ruleInitialState EOF ;
    public final EObject entryRuleInitialState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialState = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:622:2: (iv_ruleInitialState= ruleInitialState EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:623:2: iv_ruleInitialState= ruleInitialState EOF
            {
             newCompositeNode(grammarAccess.getInitialStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInitialState_in_entryRuleInitialState1409);
            iv_ruleInitialState=ruleInitialState();

            state._fsp--;

             current =iv_ruleInitialState; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInitialState1419); 

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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:630:1: ruleInitialState returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleInitialState() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:633:28: ( ( ( ruleEString ) ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:634:1: ( ( ruleEString ) )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:634:1: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:635:1: ( ruleEString )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:635:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:636:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInitialStateRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getInitialStateAccess().getReferencedStateStateCrossReference_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInitialState1466);
            ruleEString();

            state._fsp--;

             
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
    // $ANTLR end "ruleInitialState"


    // $ANTLR start "entryRuleTransition"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:657:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:658:2: (iv_ruleTransition= ruleTransition EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:659:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_entryRuleTransition1501);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransition1511); 

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:666:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'from' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) otherlv_4= 'for' ( ( ruleEString ) ) (otherlv_6= 'guard' ( (lv_guard_7_0= ruleExpression ) ) )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_guard_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:669:28: ( (otherlv_0= 'from' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) otherlv_4= 'for' ( ( ruleEString ) ) (otherlv_6= 'guard' ( (lv_guard_7_0= ruleExpression ) ) )? ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:670:1: (otherlv_0= 'from' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) otherlv_4= 'for' ( ( ruleEString ) ) (otherlv_6= 'guard' ( (lv_guard_7_0= ruleExpression ) ) )? )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:670:1: (otherlv_0= 'from' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) otherlv_4= 'for' ( ( ruleEString ) ) (otherlv_6= 'guard' ( (lv_guard_7_0= ruleExpression ) ) )? )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:670:3: otherlv_0= 'from' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) otherlv_4= 'for' ( ( ruleEString ) ) (otherlv_6= 'guard' ( (lv_guard_7_0= ruleExpression ) ) )?
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTransition1548); 

                	newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getFromKeyword_0());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:674:1: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:675:1: ( ruleEString )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:675:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:676:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTransitionAccess().getSourceStateCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition1571);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTransition1583); 

                	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getToKeyword_2());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:693:1: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:694:1: ( ruleEString )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:694:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:695:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTransitionAccess().getTargetStateCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition1606);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTransition1618); 

                	newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getForKeyword_4());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:712:1: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:713:1: ( ruleEString )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:713:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:714:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTransitionAccess().getEventEventCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition1641);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:727:2: (otherlv_6= 'guard' ( (lv_guard_7_0= ruleExpression ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:727:4: otherlv_6= 'guard' ( (lv_guard_7_0= ruleExpression ) )
                    {
                    otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTransition1654); 

                        	newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getGuardKeyword_6_0());
                        
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:731:1: ( (lv_guard_7_0= ruleExpression ) )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:732:1: (lv_guard_7_0= ruleExpression )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:732:1: (lv_guard_7_0= ruleExpression )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:733:3: lv_guard_7_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getGuardExpressionParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleTransition1675);
                    lv_guard_7_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	        }
                           		set(
                           			current, 
                           			"guard",
                            		lv_guard_7_0, 
                            		"Expression");
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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleEvent"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:757:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:758:2: (iv_ruleEvent= ruleEvent EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:759:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEvent_in_entryRuleEvent1713);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEvent1723); 

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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:766:1: ruleEvent returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:769:28: ( ( () ( (lv_name_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:770:1: ( () ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:770:1: ( () ( (lv_name_1_0= RULE_STRING ) ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:770:2: () ( (lv_name_1_0= RULE_STRING ) )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:770:2: ()
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:771:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEventAccess().getEventAction_0(),
                        current);
                

            }

            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:776:2: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:777:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:777:1: (lv_name_1_0= RULE_STRING )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:778:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEvent1774); 

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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:802:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:803:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:804:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment1815);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment1825); 

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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:811:1: ruleAssignment returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleExpressionElement ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:814:28: ( ( ( ( ruleEString ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleExpressionElement ) ) ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:815:1: ( ( ( ruleEString ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleExpressionElement ) ) )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:815:1: ( ( ( ruleEString ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleExpressionElement ) ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:815:2: ( ( ruleEString ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleExpressionElement ) )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:815:2: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:816:1: ( ruleEString )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:816:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:817:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssignmentRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssignment1873);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAssignment1885); 

                	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:834:1: ( (lv_expression_2_0= ruleExpressionElement ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:835:1: (lv_expression_2_0= ruleExpressionElement )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:835:1: (lv_expression_2_0= ruleExpressionElement )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:836:3: lv_expression_2_0= ruleExpressionElement
            {
             
            	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionElementParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpressionElement_in_ruleAssignment1906);
            lv_expression_2_0=ruleExpressionElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_2_0, 
                    		"ExpressionElement");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:860:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:861:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:862:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression1942);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression1952); 

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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:869:1: ruleExpression returns [EObject current=null] : (otherlv_0= 'left' ( (lv_left_1_0= ruleExpressionElement ) ) otherlv_2= 'op' ( (lv_operator_3_0= ruleOperator ) ) otherlv_4= 'right' ( (lv_right_5_0= ruleExpressionElement ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        Enumerator lv_operator_3_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:872:28: ( (otherlv_0= 'left' ( (lv_left_1_0= ruleExpressionElement ) ) otherlv_2= 'op' ( (lv_operator_3_0= ruleOperator ) ) otherlv_4= 'right' ( (lv_right_5_0= ruleExpressionElement ) ) ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:873:1: (otherlv_0= 'left' ( (lv_left_1_0= ruleExpressionElement ) ) otherlv_2= 'op' ( (lv_operator_3_0= ruleOperator ) ) otherlv_4= 'right' ( (lv_right_5_0= ruleExpressionElement ) ) )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:873:1: (otherlv_0= 'left' ( (lv_left_1_0= ruleExpressionElement ) ) otherlv_2= 'op' ( (lv_operator_3_0= ruleOperator ) ) otherlv_4= 'right' ( (lv_right_5_0= ruleExpressionElement ) ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:873:3: otherlv_0= 'left' ( (lv_left_1_0= ruleExpressionElement ) ) otherlv_2= 'op' ( (lv_operator_3_0= ruleOperator ) ) otherlv_4= 'right' ( (lv_right_5_0= ruleExpressionElement ) )
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleExpression1989); 

                	newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getLeftKeyword_0());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:877:1: ( (lv_left_1_0= ruleExpressionElement ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:878:1: (lv_left_1_0= ruleExpressionElement )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:878:1: (lv_left_1_0= ruleExpressionElement )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:879:3: lv_left_1_0= ruleExpressionElement
            {
             
            	        newCompositeNode(grammarAccess.getExpressionAccess().getLeftExpressionElementParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpressionElement_in_ruleExpression2010);
            lv_left_1_0=ruleExpressionElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_1_0, 
                    		"ExpressionElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleExpression2022); 

                	newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getOpKeyword_2());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:899:1: ( (lv_operator_3_0= ruleOperator ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:900:1: (lv_operator_3_0= ruleOperator )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:900:1: (lv_operator_3_0= ruleOperator )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:901:3: lv_operator_3_0= ruleOperator
            {
             
            	        newCompositeNode(grammarAccess.getExpressionAccess().getOperatorOperatorEnumRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperator_in_ruleExpression2043);
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

            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleExpression2055); 

                	newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getRightKeyword_4());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:921:1: ( (lv_right_5_0= ruleExpressionElement ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:922:1: (lv_right_5_0= ruleExpressionElement )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:922:1: (lv_right_5_0= ruleExpressionElement )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:923:3: lv_right_5_0= ruleExpressionElement
            {
             
            	        newCompositeNode(grammarAccess.getExpressionAccess().getRightExpressionElementParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpressionElement_in_ruleExpression2076);
            lv_right_5_0=ruleExpressionElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"right",
                    		lv_right_5_0, 
                    		"ExpressionElement");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBooleanData"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:947:1: entryRuleBooleanData returns [EObject current=null] : iv_ruleBooleanData= ruleBooleanData EOF ;
    public final EObject entryRuleBooleanData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanData = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:948:2: (iv_ruleBooleanData= ruleBooleanData EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:949:2: iv_ruleBooleanData= ruleBooleanData EOF
            {
             newCompositeNode(grammarAccess.getBooleanDataRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanData_in_entryRuleBooleanData2112);
            iv_ruleBooleanData=ruleBooleanData();

            state._fsp--;

             current =iv_ruleBooleanData; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanData2122); 

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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:956:1: ruleBooleanData returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanData() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:959:28: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:960:1: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:960:1: ( (lv_value_0_0= ruleEBoolean ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:961:1: (lv_value_0_0= ruleEBoolean )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:961:1: (lv_value_0_0= ruleEBoolean )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:962:3: lv_value_0_0= ruleEBoolean
            {
             
            	        newCompositeNode(grammarAccess.getBooleanDataAccess().getValueEBooleanParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleBooleanData2167);
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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:986:1: entryRuleIntegerData returns [EObject current=null] : iv_ruleIntegerData= ruleIntegerData EOF ;
    public final EObject entryRuleIntegerData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerData = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:987:2: (iv_ruleIntegerData= ruleIntegerData EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:988:2: iv_ruleIntegerData= ruleIntegerData EOF
            {
             newCompositeNode(grammarAccess.getIntegerDataRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerData_in_entryRuleIntegerData2202);
            iv_ruleIntegerData=ruleIntegerData();

            state._fsp--;

             current =iv_ruleIntegerData; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerData2212); 

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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:995:1: ruleIntegerData returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleIntegerData() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:998:28: ( ( (lv_value_0_0= ruleEInt ) ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:999:1: ( (lv_value_0_0= ruleEInt ) )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:999:1: ( (lv_value_0_0= ruleEInt ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1000:1: (lv_value_0_0= ruleEInt )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1000:1: (lv_value_0_0= ruleEInt )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1001:3: lv_value_0_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getIntegerDataAccess().getValueEIntParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleIntegerData2257);
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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1025:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1026:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1027:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
             newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_entryRuleVariableReference2292);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;

             current =iv_ruleVariableReference; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableReference2302); 

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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1034:1: ruleVariableReference returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1037:28: ( ( ( ruleEString ) ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1038:1: ( ( ruleEString ) )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1038:1: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1039:1: ( ruleEString )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1039:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1040:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableReferenceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariableReference2349);
            ruleEString();

            state._fsp--;

             
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
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "entryRuleEInt"
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1061:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1062:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1063:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt2385);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt2396); 

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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1070:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1073:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1074:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1074:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1074:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1074:2: (kw= '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1075:2: kw= '-'
                    {
                    kw=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleEInt2435); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt2452); 

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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1095:1: entryRuleCompositeState_Impl returns [EObject current=null] : iv_ruleCompositeState_Impl= ruleCompositeState_Impl EOF ;
    public final EObject entryRuleCompositeState_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeState_Impl = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1096:2: (iv_ruleCompositeState_Impl= ruleCompositeState_Impl EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1097:2: iv_ruleCompositeState_Impl= ruleCompositeState_Impl EOF
            {
             newCompositeNode(grammarAccess.getCompositeState_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCompositeState_Impl_in_entryRuleCompositeState_Impl2497);
            iv_ruleCompositeState_Impl=ruleCompositeState_Impl();

            state._fsp--;

             current =iv_ruleCompositeState_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompositeState_Impl2507); 

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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1104:1: ruleCompositeState_Impl returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_states_3_0= ruleState ) )+ (otherlv_4= 'do' ( (lv_operation_5_0= ruleOperation ) ) )? otherlv_6= 'init with' ( (lv_initialState_7_0= ruleInitialState ) ) otherlv_8= '}' ) ;
    public final EObject ruleCompositeState_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_states_3_0 = null;

        EObject lv_operation_5_0 = null;

        EObject lv_initialState_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1107:28: ( (otherlv_0= 'state' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_states_3_0= ruleState ) )+ (otherlv_4= 'do' ( (lv_operation_5_0= ruleOperation ) ) )? otherlv_6= 'init with' ( (lv_initialState_7_0= ruleInitialState ) ) otherlv_8= '}' ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1108:1: (otherlv_0= 'state' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_states_3_0= ruleState ) )+ (otherlv_4= 'do' ( (lv_operation_5_0= ruleOperation ) ) )? otherlv_6= 'init with' ( (lv_initialState_7_0= ruleInitialState ) ) otherlv_8= '}' )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1108:1: (otherlv_0= 'state' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_states_3_0= ruleState ) )+ (otherlv_4= 'do' ( (lv_operation_5_0= ruleOperation ) ) )? otherlv_6= 'init with' ( (lv_initialState_7_0= ruleInitialState ) ) otherlv_8= '}' )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1108:3: otherlv_0= 'state' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_states_3_0= ruleState ) )+ (otherlv_4= 'do' ( (lv_operation_5_0= ruleOperation ) ) )? otherlv_6= 'init with' ( (lv_initialState_7_0= ruleInitialState ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleCompositeState_Impl2544); 

                	newLeafNode(otherlv_0, grammarAccess.getCompositeState_ImplAccess().getStateKeyword_0());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1112:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1113:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1113:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1114:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCompositeState_ImplAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCompositeState_Impl2565);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompositeState_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCompositeState_Impl2577); 

                	newLeafNode(otherlv_2, grammarAccess.getCompositeState_ImplAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1134:1: ( (lv_states_3_0= ruleState ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==11||LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1135:1: (lv_states_3_0= ruleState )
            	    {
            	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1135:1: (lv_states_3_0= ruleState )
            	    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1136:3: lv_states_3_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCompositeState_ImplAccess().getStatesStateParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleCompositeState_Impl2598);
            	    lv_states_3_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCompositeState_ImplRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_3_0, 
            	            		"State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1152:3: (otherlv_4= 'do' ( (lv_operation_5_0= ruleOperation ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1152:5: otherlv_4= 'do' ( (lv_operation_5_0= ruleOperation ) )
                    {
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCompositeState_Impl2612); 

                        	newLeafNode(otherlv_4, grammarAccess.getCompositeState_ImplAccess().getDoKeyword_4_0());
                        
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1156:1: ( (lv_operation_5_0= ruleOperation ) )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1157:1: (lv_operation_5_0= ruleOperation )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1157:1: (lv_operation_5_0= ruleOperation )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1158:3: lv_operation_5_0= ruleOperation
                    {
                     
                    	        newCompositeNode(grammarAccess.getCompositeState_ImplAccess().getOperationOperationParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleCompositeState_Impl2633);
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

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCompositeState_Impl2647); 

                	newLeafNode(otherlv_6, grammarAccess.getCompositeState_ImplAccess().getInitWithKeyword_5());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1178:1: ( (lv_initialState_7_0= ruleInitialState ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1179:1: (lv_initialState_7_0= ruleInitialState )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1179:1: (lv_initialState_7_0= ruleInitialState )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1180:3: lv_initialState_7_0= ruleInitialState
            {
             
            	        newCompositeNode(grammarAccess.getCompositeState_ImplAccess().getInitialStateInitialStateParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInitialState_in_ruleCompositeState_Impl2668);
            lv_initialState_7_0=ruleInitialState();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompositeState_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"initialState",
                    		lv_initialState_7_0, 
                    		"InitialState");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCompositeState_Impl2680); 

                	newLeafNode(otherlv_8, grammarAccess.getCompositeState_ImplAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1208:1: entryRuleBooleanVariable returns [EObject current=null] : iv_ruleBooleanVariable= ruleBooleanVariable EOF ;
    public final EObject entryRuleBooleanVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanVariable = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1209:2: (iv_ruleBooleanVariable= ruleBooleanVariable EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1210:2: iv_ruleBooleanVariable= ruleBooleanVariable EOF
            {
             newCompositeNode(grammarAccess.getBooleanVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanVariable_in_entryRuleBooleanVariable2716);
            iv_ruleBooleanVariable=ruleBooleanVariable();

            state._fsp--;

             current =iv_ruleBooleanVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanVariable2726); 

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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1217:1: ruleBooleanVariable returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'boolean' (otherlv_4= ':=' ( (lv_value_5_0= ruleBooleanData ) ) )? ) ;
    public final EObject ruleBooleanVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1220:28: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'boolean' (otherlv_4= ':=' ( (lv_value_5_0= ruleBooleanData ) ) )? ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1221:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'boolean' (otherlv_4= ':=' ( (lv_value_5_0= ruleBooleanData ) ) )? )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1221:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'boolean' (otherlv_4= ':=' ( (lv_value_5_0= ruleBooleanData ) ) )? )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1221:2: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'boolean' (otherlv_4= ':=' ( (lv_value_5_0= ruleBooleanData ) ) )?
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1221:2: ()
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1222:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanVariableAccess().getBooleanVariableAction_0(),
                        current);
                

            }

            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1227:2: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1228:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1228:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1229:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBooleanVariableAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBooleanVariable2781);
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

            otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleBooleanVariable2793); 

                	newLeafNode(otherlv_2, grammarAccess.getBooleanVariableAccess().getColonKeyword_2());
                
            otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleBooleanVariable2805); 

                	newLeafNode(otherlv_3, grammarAccess.getBooleanVariableAccess().getBooleanKeyword_3());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1253:1: (otherlv_4= ':=' ( (lv_value_5_0= ruleBooleanData ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1253:3: otherlv_4= ':=' ( (lv_value_5_0= ruleBooleanData ) )
                    {
                    otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleBooleanVariable2818); 

                        	newLeafNode(otherlv_4, grammarAccess.getBooleanVariableAccess().getColonEqualsSignKeyword_4_0());
                        
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1257:1: ( (lv_value_5_0= ruleBooleanData ) )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1258:1: (lv_value_5_0= ruleBooleanData )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1258:1: (lv_value_5_0= ruleBooleanData )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1259:3: lv_value_5_0= ruleBooleanData
                    {
                     
                    	        newCompositeNode(grammarAccess.getBooleanVariableAccess().getValueBooleanDataParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanData_in_ruleBooleanVariable2839);
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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1283:1: entryRuleIntegerVariable returns [EObject current=null] : iv_ruleIntegerVariable= ruleIntegerVariable EOF ;
    public final EObject entryRuleIntegerVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerVariable = null;


        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1284:2: (iv_ruleIntegerVariable= ruleIntegerVariable EOF )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1285:2: iv_ruleIntegerVariable= ruleIntegerVariable EOF
            {
             newCompositeNode(grammarAccess.getIntegerVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerVariable_in_entryRuleIntegerVariable2877);
            iv_ruleIntegerVariable=ruleIntegerVariable();

            state._fsp--;

             current =iv_ruleIntegerVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerVariable2887); 

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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1292:1: ruleIntegerVariable returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'integer' (otherlv_4= ':=' ( (lv_value_5_0= ruleIntegerData ) ) )? ) ;
    public final EObject ruleIntegerVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1295:28: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'integer' (otherlv_4= ':=' ( (lv_value_5_0= ruleIntegerData ) ) )? ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1296:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'integer' (otherlv_4= ':=' ( (lv_value_5_0= ruleIntegerData ) ) )? )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1296:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'integer' (otherlv_4= ':=' ( (lv_value_5_0= ruleIntegerData ) ) )? )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1296:2: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'integer' (otherlv_4= ':=' ( (lv_value_5_0= ruleIntegerData ) ) )?
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1296:2: ()
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1297:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIntegerVariableAccess().getIntegerVariableAction_0(),
                        current);
                

            }

            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1302:2: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1303:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1303:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1304:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getIntegerVariableAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIntegerVariable2942);
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

            otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleIntegerVariable2954); 

                	newLeafNode(otherlv_2, grammarAccess.getIntegerVariableAccess().getColonKeyword_2());
                
            otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleIntegerVariable2966); 

                	newLeafNode(otherlv_3, grammarAccess.getIntegerVariableAccess().getIntegerKeyword_3());
                
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1328:1: (otherlv_4= ':=' ( (lv_value_5_0= ruleIntegerData ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1328:3: otherlv_4= ':=' ( (lv_value_5_0= ruleIntegerData ) )
                    {
                    otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleIntegerVariable2979); 

                        	newLeafNode(otherlv_4, grammarAccess.getIntegerVariableAccess().getColonEqualsSignKeyword_4_0());
                        
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1332:1: ( (lv_value_5_0= ruleIntegerData ) )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1333:1: (lv_value_5_0= ruleIntegerData )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1333:1: (lv_value_5_0= ruleIntegerData )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1334:3: lv_value_5_0= ruleIntegerData
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntegerVariableAccess().getValueIntegerDataParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerData_in_ruleIntegerVariable3000);
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
    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1358:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'add' ) | (enumLiteral_1= 'sub' ) | (enumLiteral_2= 'eq' ) | (enumLiteral_3= 'mul' ) | (enumLiteral_4= 'gt' ) | (enumLiteral_5= 'lt' ) | (enumLiteral_6= 'lte' ) | (enumLiteral_7= 'gte' ) | (enumLiteral_8= 'div' ) | (enumLiteral_9= 'and' ) | (enumLiteral_10= 'neq' ) | (enumLiteral_11= 'or' ) | (enumLiteral_12= 'not' ) ) ;
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
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1360:28: ( ( (enumLiteral_0= 'add' ) | (enumLiteral_1= 'sub' ) | (enumLiteral_2= 'eq' ) | (enumLiteral_3= 'mul' ) | (enumLiteral_4= 'gt' ) | (enumLiteral_5= 'lt' ) | (enumLiteral_6= 'lte' ) | (enumLiteral_7= 'gte' ) | (enumLiteral_8= 'div' ) | (enumLiteral_9= 'and' ) | (enumLiteral_10= 'neq' ) | (enumLiteral_11= 'or' ) | (enumLiteral_12= 'not' ) ) )
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1361:1: ( (enumLiteral_0= 'add' ) | (enumLiteral_1= 'sub' ) | (enumLiteral_2= 'eq' ) | (enumLiteral_3= 'mul' ) | (enumLiteral_4= 'gt' ) | (enumLiteral_5= 'lt' ) | (enumLiteral_6= 'lte' ) | (enumLiteral_7= 'gte' ) | (enumLiteral_8= 'div' ) | (enumLiteral_9= 'and' ) | (enumLiteral_10= 'neq' ) | (enumLiteral_11= 'or' ) | (enumLiteral_12= 'not' ) )
            {
            // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1361:1: ( (enumLiteral_0= 'add' ) | (enumLiteral_1= 'sub' ) | (enumLiteral_2= 'eq' ) | (enumLiteral_3= 'mul' ) | (enumLiteral_4= 'gt' ) | (enumLiteral_5= 'lt' ) | (enumLiteral_6= 'lte' ) | (enumLiteral_7= 'gte' ) | (enumLiteral_8= 'div' ) | (enumLiteral_9= 'and' ) | (enumLiteral_10= 'neq' ) | (enumLiteral_11= 'or' ) | (enumLiteral_12= 'not' ) )
            int alt19=13;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt19=1;
                }
                break;
            case 36:
                {
                alt19=2;
                }
                break;
            case 37:
                {
                alt19=3;
                }
                break;
            case 38:
                {
                alt19=4;
                }
                break;
            case 39:
                {
                alt19=5;
                }
                break;
            case 40:
                {
                alt19=6;
                }
                break;
            case 41:
                {
                alt19=7;
                }
                break;
            case 42:
                {
                alt19=8;
                }
                break;
            case 43:
                {
                alt19=9;
                }
                break;
            case 44:
                {
                alt19=10;
                }
                break;
            case 45:
                {
                alt19=11;
                }
                break;
            case 46:
                {
                alt19=12;
                }
                break;
            case 47:
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
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1361:2: (enumLiteral_0= 'add' )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1361:2: (enumLiteral_0= 'add' )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1361:4: enumLiteral_0= 'add'
                    {
                    enumLiteral_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleOperator3052); 

                            current = grammarAccess.getOperatorAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getAddEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1367:6: (enumLiteral_1= 'sub' )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1367:6: (enumLiteral_1= 'sub' )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1367:8: enumLiteral_1= 'sub'
                    {
                    enumLiteral_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleOperator3069); 

                            current = grammarAccess.getOperatorAccess().getSubEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getSubEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1373:6: (enumLiteral_2= 'eq' )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1373:6: (enumLiteral_2= 'eq' )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1373:8: enumLiteral_2= 'eq'
                    {
                    enumLiteral_2=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleOperator3086); 

                            current = grammarAccess.getOperatorAccess().getEqEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getEqEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1379:6: (enumLiteral_3= 'mul' )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1379:6: (enumLiteral_3= 'mul' )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1379:8: enumLiteral_3= 'mul'
                    {
                    enumLiteral_3=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleOperator3103); 

                            current = grammarAccess.getOperatorAccess().getMulEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getMulEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1385:6: (enumLiteral_4= 'gt' )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1385:6: (enumLiteral_4= 'gt' )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1385:8: enumLiteral_4= 'gt'
                    {
                    enumLiteral_4=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleOperator3120); 

                            current = grammarAccess.getOperatorAccess().getGtEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getOperatorAccess().getGtEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1391:6: (enumLiteral_5= 'lt' )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1391:6: (enumLiteral_5= 'lt' )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1391:8: enumLiteral_5= 'lt'
                    {
                    enumLiteral_5=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleOperator3137); 

                            current = grammarAccess.getOperatorAccess().getLtEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getOperatorAccess().getLtEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1397:6: (enumLiteral_6= 'lte' )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1397:6: (enumLiteral_6= 'lte' )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1397:8: enumLiteral_6= 'lte'
                    {
                    enumLiteral_6=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleOperator3154); 

                            current = grammarAccess.getOperatorAccess().getLteEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getOperatorAccess().getLteEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1403:6: (enumLiteral_7= 'gte' )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1403:6: (enumLiteral_7= 'gte' )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1403:8: enumLiteral_7= 'gte'
                    {
                    enumLiteral_7=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleOperator3171); 

                            current = grammarAccess.getOperatorAccess().getGteEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getOperatorAccess().getGteEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1409:6: (enumLiteral_8= 'div' )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1409:6: (enumLiteral_8= 'div' )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1409:8: enumLiteral_8= 'div'
                    {
                    enumLiteral_8=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleOperator3188); 

                            current = grammarAccess.getOperatorAccess().getDivEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getOperatorAccess().getDivEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1415:6: (enumLiteral_9= 'and' )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1415:6: (enumLiteral_9= 'and' )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1415:8: enumLiteral_9= 'and'
                    {
                    enumLiteral_9=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleOperator3205); 

                            current = grammarAccess.getOperatorAccess().getAndEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getOperatorAccess().getAndEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1421:6: (enumLiteral_10= 'neq' )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1421:6: (enumLiteral_10= 'neq' )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1421:8: enumLiteral_10= 'neq'
                    {
                    enumLiteral_10=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleOperator3222); 

                            current = grammarAccess.getOperatorAccess().getNeqEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getOperatorAccess().getNeqEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1427:6: (enumLiteral_11= 'or' )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1427:6: (enumLiteral_11= 'or' )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1427:8: enumLiteral_11= 'or'
                    {
                    enumLiteral_11=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleOperator3239); 

                            current = grammarAccess.getOperatorAccess().getOrEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getOperatorAccess().getOrEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1433:6: (enumLiteral_12= 'not' )
                    {
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1433:6: (enumLiteral_12= 'not' )
                    // ../org.xtext.StateMachine.sm/src-gen/org/xtext/StateMachine/sm/parser/antlr/internal/InternalSM.g:1433:8: enumLiteral_12= 'not'
                    {
                    enumLiteral_12=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleOperator3256); 

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
        public static final BitSet FOLLOW_11_in_ruleStateMachine122 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStateMachine143 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStateMachine155 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleStateMachine176 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_13_in_ruleStateMachine189 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStateMachine201 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEvent_in_ruleStateMachine222 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleStateMachine235 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEvent_in_ruleStateMachine256 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleStateMachine270 = new BitSet(new long[]{0x0000000000200800L});
        public static final BitSet FOLLOW_ruleState_in_ruleStateMachine291 = new BitSet(new long[]{0x0000000000210800L});
        public static final BitSet FOLLOW_16_in_ruleStateMachine304 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleInitialState_in_ruleStateMachine325 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleStateMachine346 = new BitSet(new long[]{0x0000000000808000L});
        public static final BitSet FOLLOW_15_in_ruleStateMachine359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_entryRuleState395 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_Impl_in_ruleState452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateMachine_in_ruleState479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeState_Impl_in_ruleState506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleVariable588 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleBooleanVariable_in_ruleVariable611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerVariable_in_ruleVariable638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionElement_in_entryRuleExpressionElement674 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpressionElement684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionElement731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanData_in_ruleExpressionElement758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerData_in_ruleExpressionElement785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_ruleExpressionElement812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString850 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean973 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleEBoolean1022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleEBoolean1041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation1081 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperation1091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleOperation1138 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleOperation1159 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleOperation1172 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleOperation1193 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_15_in_ruleOperation1207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_Impl_in_entryRuleState_Impl1245 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState_Impl1255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleState_Impl1292 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState_Impl1313 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleState_Impl1325 = new BitSet(new long[]{0x0000000000408000L});
        public static final BitSet FOLLOW_22_in_ruleState_Impl1338 = new BitSet(new long[]{0x0000000000009000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleState_Impl1359 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleState_Impl1373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitialState_in_entryRuleInitialState1409 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInitialState1419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInitialState1466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition1501 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition1511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleTransition1548 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition1571 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleTransition1583 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition1606 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleTransition1618 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition1641 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleTransition1654 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleTransition1675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent1713 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEvent1723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEvent1774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1815 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssignment1873 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleAssignment1885 = new BitSet(new long[]{0x00000000900C0070L});
        public static final BitSet FOLLOW_ruleExpressionElement_in_ruleAssignment1906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1942 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression1952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleExpression1989 = new BitSet(new long[]{0x00000000900C0070L});
        public static final BitSet FOLLOW_ruleExpressionElement_in_ruleExpression2010 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleExpression2022 = new BitSet(new long[]{0x0000FFF800000000L});
        public static final BitSet FOLLOW_ruleOperator_in_ruleExpression2043 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleExpression2055 = new BitSet(new long[]{0x00000000900C0070L});
        public static final BitSet FOLLOW_ruleExpressionElement_in_ruleExpression2076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanData_in_entryRuleBooleanData2112 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanData2122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleBooleanData2167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerData_in_entryRuleIntegerData2202 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerData2212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleIntegerData2257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference2292 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference2302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariableReference2349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2385 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt2396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleEInt2435 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeState_Impl_in_entryRuleCompositeState_Impl2497 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompositeState_Impl2507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleCompositeState_Impl2544 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCompositeState_Impl2565 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCompositeState_Impl2577 = new BitSet(new long[]{0x0000000000200800L});
        public static final BitSet FOLLOW_ruleState_in_ruleCompositeState_Impl2598 = new BitSet(new long[]{0x0000000000610800L});
        public static final BitSet FOLLOW_22_in_ruleCompositeState_Impl2612 = new BitSet(new long[]{0x0000000000011000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleCompositeState_Impl2633 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleCompositeState_Impl2647 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleInitialState_in_ruleCompositeState_Impl2668 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleCompositeState_Impl2680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanVariable_in_entryRuleBooleanVariable2716 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanVariable2726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBooleanVariable2781 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleBooleanVariable2793 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleBooleanVariable2805 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_27_in_ruleBooleanVariable2818 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_ruleBooleanData_in_ruleBooleanVariable2839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerVariable_in_entryRuleIntegerVariable2877 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerVariable2887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIntegerVariable2942 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleIntegerVariable2954 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleIntegerVariable2966 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_27_in_ruleIntegerVariable2979 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_ruleIntegerData_in_ruleIntegerVariable3000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleOperator3052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleOperator3069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleOperator3086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleOperator3103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleOperator3120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleOperator3137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleOperator3154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleOperator3171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleOperator3188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleOperator3205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleOperator3222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleOperator3239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleOperator3256 = new BitSet(new long[]{0x0000000000000002L});
    }


}