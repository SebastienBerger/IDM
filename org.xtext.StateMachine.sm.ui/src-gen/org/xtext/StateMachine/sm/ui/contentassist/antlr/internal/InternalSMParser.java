package org.xtext.StateMachine.sm.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.StateMachine.sm.services.SMGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSMParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'add'", "'sub'", "'eq'", "'mul'", "'gt'", "'lt'", "'lte'", "'gte'", "'div'", "'and'", "'neq'", "'or'", "'not'", "'StateMachine'", "'{'", "'events'", "'}'", "','", "'var'", "'Operation'", "'contents'", "'State'", "'operation'", "'InitialState'", "'referencedState'", "'Assignment'", "'variable'", "'expression'", "'_name'", "'Expression'", "'operator'", "'left'", "'right'", "'VariableReference'", "'-'", "'CompositeState'", "'states'", "'initialState'", "':'", "'boolean'", "':='", "'integer'", "'isActive'"
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
    public String getGrammarFileName() { return "../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g"; }


     
     	private SMGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SMGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleStateMachine"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:60:1: entryRuleStateMachine : ruleStateMachine EOF ;
    public final void entryRuleStateMachine() throws RecognitionException {
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:61:1: ( ruleStateMachine EOF )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:62:1: ruleStateMachine EOF
            {
             before(grammarAccess.getStateMachineRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStateMachine_in_entryRuleStateMachine61);
            ruleStateMachine();

            state._fsp--;

             after(grammarAccess.getStateMachineRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStateMachine68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:69:1: ruleStateMachine : ( ( rule__StateMachine__Group__0 ) ) ;
    public final void ruleStateMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:73:2: ( ( ( rule__StateMachine__Group__0 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:74:1: ( ( rule__StateMachine__Group__0 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:74:1: ( ( rule__StateMachine__Group__0 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:75:1: ( rule__StateMachine__Group__0 )
            {
             before(grammarAccess.getStateMachineAccess().getGroup()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:76:1: ( rule__StateMachine__Group__0 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:76:2: rule__StateMachine__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__0_in_ruleStateMachine94);
            rule__StateMachine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleState"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:88:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:89:1: ( ruleState EOF )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:90:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_in_entryRuleState121);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:97:1: ruleState : ( ( rule__State__Alternatives ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:101:2: ( ( ( rule__State__Alternatives ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:102:1: ( ( rule__State__Alternatives ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:102:1: ( ( rule__State__Alternatives ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:103:1: ( rule__State__Alternatives )
            {
             before(grammarAccess.getStateAccess().getAlternatives()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:104:1: ( rule__State__Alternatives )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:104:2: rule__State__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Alternatives_in_ruleState154);
            rule__State__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleVariable"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:116:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:117:1: ( ruleVariable EOF )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:118:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable181);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:125:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:129:2: ( ( ( rule__Variable__Group__0 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:130:1: ( ( rule__Variable__Group__0 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:130:1: ( ( rule__Variable__Group__0 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:131:1: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:132:1: ( rule__Variable__Group__0 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:132:2: rule__Variable__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__0_in_ruleVariable214);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleExpressionElement"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:144:1: entryRuleExpressionElement : ruleExpressionElement EOF ;
    public final void entryRuleExpressionElement() throws RecognitionException {
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:145:1: ( ruleExpressionElement EOF )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:146:1: ruleExpressionElement EOF
            {
             before(grammarAccess.getExpressionElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionElement_in_entryRuleExpressionElement241);
            ruleExpressionElement();

            state._fsp--;

             after(grammarAccess.getExpressionElementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpressionElement248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionElement"


    // $ANTLR start "ruleExpressionElement"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:153:1: ruleExpressionElement : ( ( rule__ExpressionElement__Alternatives ) ) ;
    public final void ruleExpressionElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:157:2: ( ( ( rule__ExpressionElement__Alternatives ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:158:1: ( ( rule__ExpressionElement__Alternatives ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:158:1: ( ( rule__ExpressionElement__Alternatives ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:159:1: ( rule__ExpressionElement__Alternatives )
            {
             before(grammarAccess.getExpressionElementAccess().getAlternatives()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:160:1: ( rule__ExpressionElement__Alternatives )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:160:2: rule__ExpressionElement__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionElement__Alternatives_in_ruleExpressionElement274);
            rule__ExpressionElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionElement"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:174:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:175:1: ( ruleEString EOF )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:176:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString303);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString310); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:183:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:187:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:188:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:188:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:189:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:190:1: ( rule__EString__Alternatives )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:190:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString336);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEBoolean"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:202:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:203:1: ( ruleEBoolean EOF )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:204:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean363);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean370); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:211:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:215:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:216:1: ( ( rule__EBoolean__Alternatives ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:216:1: ( ( rule__EBoolean__Alternatives ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:217:1: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:218:1: ( rule__EBoolean__Alternatives )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:218:2: rule__EBoolean__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean396);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleOperation"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:230:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:231:1: ( ruleOperation EOF )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:232:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_entryRuleOperation423);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperation430); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:239:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:243:2: ( ( ( rule__Operation__Group__0 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:244:1: ( ( rule__Operation__Group__0 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:244:1: ( ( rule__Operation__Group__0 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:245:1: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:246:1: ( rule__Operation__Group__0 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:246:2: rule__Operation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__0_in_ruleOperation456);
            rule__Operation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleState_Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:258:1: entryRuleState_Impl : ruleState_Impl EOF ;
    public final void entryRuleState_Impl() throws RecognitionException {
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:259:1: ( ruleState_Impl EOF )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:260:1: ruleState_Impl EOF
            {
             before(grammarAccess.getState_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_Impl_in_entryRuleState_Impl483);
            ruleState_Impl();

            state._fsp--;

             after(grammarAccess.getState_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState_Impl490); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState_Impl"


    // $ANTLR start "ruleState_Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:267:1: ruleState_Impl : ( ( rule__State_Impl__Group__0 ) ) ;
    public final void ruleState_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:271:2: ( ( ( rule__State_Impl__Group__0 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:272:1: ( ( rule__State_Impl__Group__0 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:272:1: ( ( rule__State_Impl__Group__0 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:273:1: ( rule__State_Impl__Group__0 )
            {
             before(grammarAccess.getState_ImplAccess().getGroup()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:274:1: ( rule__State_Impl__Group__0 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:274:2: rule__State_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__State_Impl__Group__0_in_ruleState_Impl516);
            rule__State_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getState_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState_Impl"


    // $ANTLR start "entryRuleInitialState"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:286:1: entryRuleInitialState : ruleInitialState EOF ;
    public final void entryRuleInitialState() throws RecognitionException {
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:287:1: ( ruleInitialState EOF )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:288:1: ruleInitialState EOF
            {
             before(grammarAccess.getInitialStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInitialState_in_entryRuleInitialState543);
            ruleInitialState();

            state._fsp--;

             after(grammarAccess.getInitialStateRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInitialState550); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInitialState"


    // $ANTLR start "ruleInitialState"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:295:1: ruleInitialState : ( ( rule__InitialState__Group__0 ) ) ;
    public final void ruleInitialState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:299:2: ( ( ( rule__InitialState__Group__0 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:300:1: ( ( rule__InitialState__Group__0 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:300:1: ( ( rule__InitialState__Group__0 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:301:1: ( rule__InitialState__Group__0 )
            {
             before(grammarAccess.getInitialStateAccess().getGroup()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:302:1: ( rule__InitialState__Group__0 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:302:2: rule__InitialState__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__InitialState__Group__0_in_ruleInitialState576);
            rule__InitialState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitialState"


    // $ANTLR start "entryRuleEvent"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:316:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:317:1: ( ruleEvent EOF )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:318:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEvent_in_entryRuleEvent605);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEvent612); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:325:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:329:2: ( ( ( rule__Event__Group__0 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:330:1: ( ( rule__Event__Group__0 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:330:1: ( ( rule__Event__Group__0 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:331:1: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:332:1: ( rule__Event__Group__0 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:332:2: rule__Event__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__0_in_ruleEvent638);
            rule__Event__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleAssignment"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:344:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:345:1: ( ruleAssignment EOF )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:346:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment665);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment672); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:353:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:357:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:358:1: ( ( rule__Assignment__Group__0 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:358:1: ( ( rule__Assignment__Group__0 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:359:1: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:360:1: ( rule__Assignment__Group__0 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:360:2: rule__Assignment__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__0_in_ruleAssignment698);
            rule__Assignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:372:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:373:1: ( ruleExpression EOF )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:374:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression725);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression732); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:381:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:385:2: ( ( ( rule__Expression__Group__0 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:386:1: ( ( rule__Expression__Group__0 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:386:1: ( ( rule__Expression__Group__0 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:387:1: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:388:1: ( rule__Expression__Group__0 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:388:2: rule__Expression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__0_in_ruleExpression758);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBooleanData"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:400:1: entryRuleBooleanData : ruleBooleanData EOF ;
    public final void entryRuleBooleanData() throws RecognitionException {
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:401:1: ( ruleBooleanData EOF )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:402:1: ruleBooleanData EOF
            {
             before(grammarAccess.getBooleanDataRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanData_in_entryRuleBooleanData785);
            ruleBooleanData();

            state._fsp--;

             after(grammarAccess.getBooleanDataRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanData792); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanData"


    // $ANTLR start "ruleBooleanData"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:409:1: ruleBooleanData : ( ( rule__BooleanData__ValueAssignment ) ) ;
    public final void ruleBooleanData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:413:2: ( ( ( rule__BooleanData__ValueAssignment ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:414:1: ( ( rule__BooleanData__ValueAssignment ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:414:1: ( ( rule__BooleanData__ValueAssignment ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:415:1: ( rule__BooleanData__ValueAssignment )
            {
             before(grammarAccess.getBooleanDataAccess().getValueAssignment()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:416:1: ( rule__BooleanData__ValueAssignment )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:416:2: rule__BooleanData__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanData__ValueAssignment_in_ruleBooleanData818);
            rule__BooleanData__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanDataAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanData"


    // $ANTLR start "entryRuleIntegerData"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:428:1: entryRuleIntegerData : ruleIntegerData EOF ;
    public final void entryRuleIntegerData() throws RecognitionException {
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:429:1: ( ruleIntegerData EOF )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:430:1: ruleIntegerData EOF
            {
             before(grammarAccess.getIntegerDataRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerData_in_entryRuleIntegerData845);
            ruleIntegerData();

            state._fsp--;

             after(grammarAccess.getIntegerDataRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerData852); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerData"


    // $ANTLR start "ruleIntegerData"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:437:1: ruleIntegerData : ( ( rule__IntegerData__ValueAssignment ) ) ;
    public final void ruleIntegerData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:441:2: ( ( ( rule__IntegerData__ValueAssignment ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:442:1: ( ( rule__IntegerData__ValueAssignment ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:442:1: ( ( rule__IntegerData__ValueAssignment ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:443:1: ( rule__IntegerData__ValueAssignment )
            {
             before(grammarAccess.getIntegerDataAccess().getValueAssignment()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:444:1: ( rule__IntegerData__ValueAssignment )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:444:2: rule__IntegerData__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerData__ValueAssignment_in_ruleIntegerData878);
            rule__IntegerData__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntegerDataAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerData"


    // $ANTLR start "entryRuleVariableReference"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:456:1: entryRuleVariableReference : ruleVariableReference EOF ;
    public final void entryRuleVariableReference() throws RecognitionException {
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:457:1: ( ruleVariableReference EOF )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:458:1: ruleVariableReference EOF
            {
             before(grammarAccess.getVariableReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_entryRuleVariableReference905);
            ruleVariableReference();

            state._fsp--;

             after(grammarAccess.getVariableReferenceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableReference912); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableReference"


    // $ANTLR start "ruleVariableReference"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:465:1: ruleVariableReference : ( ( rule__VariableReference__Group__0 ) ) ;
    public final void ruleVariableReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:469:2: ( ( ( rule__VariableReference__Group__0 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:470:1: ( ( rule__VariableReference__Group__0 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:470:1: ( ( rule__VariableReference__Group__0 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:471:1: ( rule__VariableReference__Group__0 )
            {
             before(grammarAccess.getVariableReferenceAccess().getGroup()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:472:1: ( rule__VariableReference__Group__0 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:472:2: rule__VariableReference__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group__0_in_ruleVariableReference938);
            rule__VariableReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "entryRuleEInt"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:484:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:485:1: ( ruleEInt EOF )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:486:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt965);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt972); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:493:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:497:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:498:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:498:1: ( ( rule__EInt__Group__0 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:499:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:500:1: ( rule__EInt__Group__0 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:500:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt998);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleCompositeState_Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:512:1: entryRuleCompositeState_Impl : ruleCompositeState_Impl EOF ;
    public final void entryRuleCompositeState_Impl() throws RecognitionException {
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:513:1: ( ruleCompositeState_Impl EOF )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:514:1: ruleCompositeState_Impl EOF
            {
             before(grammarAccess.getCompositeState_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCompositeState_Impl_in_entryRuleCompositeState_Impl1025);
            ruleCompositeState_Impl();

            state._fsp--;

             after(grammarAccess.getCompositeState_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompositeState_Impl1032); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompositeState_Impl"


    // $ANTLR start "ruleCompositeState_Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:521:1: ruleCompositeState_Impl : ( ( rule__CompositeState_Impl__Group__0 ) ) ;
    public final void ruleCompositeState_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:525:2: ( ( ( rule__CompositeState_Impl__Group__0 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:526:1: ( ( rule__CompositeState_Impl__Group__0 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:526:1: ( ( rule__CompositeState_Impl__Group__0 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:527:1: ( rule__CompositeState_Impl__Group__0 )
            {
             before(grammarAccess.getCompositeState_ImplAccess().getGroup()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:528:1: ( rule__CompositeState_Impl__Group__0 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:528:2: rule__CompositeState_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__0_in_ruleCompositeState_Impl1058);
            rule__CompositeState_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeState_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositeState_Impl"


    // $ANTLR start "entryRuleBooleanVariable"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:540:1: entryRuleBooleanVariable : ruleBooleanVariable EOF ;
    public final void entryRuleBooleanVariable() throws RecognitionException {
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:541:1: ( ruleBooleanVariable EOF )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:542:1: ruleBooleanVariable EOF
            {
             before(grammarAccess.getBooleanVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanVariable_in_entryRuleBooleanVariable1085);
            ruleBooleanVariable();

            state._fsp--;

             after(grammarAccess.getBooleanVariableRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanVariable1092); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanVariable"


    // $ANTLR start "ruleBooleanVariable"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:549:1: ruleBooleanVariable : ( ( rule__BooleanVariable__Group__0 ) ) ;
    public final void ruleBooleanVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:553:2: ( ( ( rule__BooleanVariable__Group__0 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:554:1: ( ( rule__BooleanVariable__Group__0 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:554:1: ( ( rule__BooleanVariable__Group__0 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:555:1: ( rule__BooleanVariable__Group__0 )
            {
             before(grammarAccess.getBooleanVariableAccess().getGroup()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:556:1: ( rule__BooleanVariable__Group__0 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:556:2: rule__BooleanVariable__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group__0_in_ruleBooleanVariable1118);
            rule__BooleanVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanVariable"


    // $ANTLR start "entryRuleIntegerVariable"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:568:1: entryRuleIntegerVariable : ruleIntegerVariable EOF ;
    public final void entryRuleIntegerVariable() throws RecognitionException {
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:569:1: ( ruleIntegerVariable EOF )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:570:1: ruleIntegerVariable EOF
            {
             before(grammarAccess.getIntegerVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerVariable_in_entryRuleIntegerVariable1145);
            ruleIntegerVariable();

            state._fsp--;

             after(grammarAccess.getIntegerVariableRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerVariable1152); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerVariable"


    // $ANTLR start "ruleIntegerVariable"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:577:1: ruleIntegerVariable : ( ( rule__IntegerVariable__Group__0 ) ) ;
    public final void ruleIntegerVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:581:2: ( ( ( rule__IntegerVariable__Group__0 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:582:1: ( ( rule__IntegerVariable__Group__0 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:582:1: ( ( rule__IntegerVariable__Group__0 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:583:1: ( rule__IntegerVariable__Group__0 )
            {
             before(grammarAccess.getIntegerVariableAccess().getGroup()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:584:1: ( rule__IntegerVariable__Group__0 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:584:2: rule__IntegerVariable__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group__0_in_ruleIntegerVariable1178);
            rule__IntegerVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerVariable"


    // $ANTLR start "ruleOperator"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:597:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:601:1: ( ( ( rule__Operator__Alternatives ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:602:1: ( ( rule__Operator__Alternatives ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:602:1: ( ( rule__Operator__Alternatives ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:603:1: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:604:1: ( rule__Operator__Alternatives )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:604:2: rule__Operator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operator__Alternatives_in_ruleOperator1215);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "rule__State__Alternatives"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:615:1: rule__State__Alternatives : ( ( ruleState_Impl ) | ( ruleStateMachine ) | ( ruleCompositeState_Impl ) );
    public final void rule__State__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:619:1: ( ( ruleState_Impl ) | ( ruleStateMachine ) | ( ruleCompositeState_Impl ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==55) ) {
                switch ( input.LA(2) ) {
                case 26:
                    {
                    alt1=2;
                    }
                    break;
                case 48:
                    {
                    alt1=3;
                    }
                    break;
                case 34:
                    {
                    alt1=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:620:1: ( ruleState_Impl )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:620:1: ( ruleState_Impl )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:621:1: ruleState_Impl
                    {
                     before(grammarAccess.getStateAccess().getState_ImplParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleState_Impl_in_rule__State__Alternatives1250);
                    ruleState_Impl();

                    state._fsp--;

                     after(grammarAccess.getStateAccess().getState_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:626:6: ( ruleStateMachine )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:626:6: ( ruleStateMachine )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:627:1: ruleStateMachine
                    {
                     before(grammarAccess.getStateAccess().getStateMachineParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleStateMachine_in_rule__State__Alternatives1267);
                    ruleStateMachine();

                    state._fsp--;

                     after(grammarAccess.getStateAccess().getStateMachineParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:632:6: ( ruleCompositeState_Impl )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:632:6: ( ruleCompositeState_Impl )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:633:1: ruleCompositeState_Impl
                    {
                     before(grammarAccess.getStateAccess().getCompositeState_ImplParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCompositeState_Impl_in_rule__State__Alternatives1284);
                    ruleCompositeState_Impl();

                    state._fsp--;

                     after(grammarAccess.getStateAccess().getCompositeState_ImplParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Alternatives"


    // $ANTLR start "rule__Variable__Alternatives_1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:643:1: rule__Variable__Alternatives_1 : ( ( ruleBooleanVariable ) | ( ruleIntegerVariable ) );
    public final void rule__Variable__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:647:1: ( ( ruleBooleanVariable ) | ( ruleIntegerVariable ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==51) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==54) ) {
                        alt2=2;
                    }
                    else if ( (LA2_3==52) ) {
                        alt2=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==RULE_ID) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==51) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==54) ) {
                        alt2=2;
                    }
                    else if ( (LA2_3==52) ) {
                        alt2=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:648:1: ( ruleBooleanVariable )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:648:1: ( ruleBooleanVariable )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:649:1: ruleBooleanVariable
                    {
                     before(grammarAccess.getVariableAccess().getBooleanVariableParserRuleCall_1_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanVariable_in_rule__Variable__Alternatives_11316);
                    ruleBooleanVariable();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getBooleanVariableParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:654:6: ( ruleIntegerVariable )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:654:6: ( ruleIntegerVariable )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:655:1: ruleIntegerVariable
                    {
                     before(grammarAccess.getVariableAccess().getIntegerVariableParserRuleCall_1_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerVariable_in_rule__Variable__Alternatives_11333);
                    ruleIntegerVariable();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getIntegerVariableParserRuleCall_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Alternatives_1"


    // $ANTLR start "rule__ExpressionElement__Alternatives"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:665:1: rule__ExpressionElement__Alternatives : ( ( ruleExpression ) | ( ruleBooleanData ) | ( ruleIntegerData ) | ( ruleVariableReference ) );
    public final void rule__ExpressionElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:669:1: ( ( ruleExpression ) | ( ruleBooleanData ) | ( ruleIntegerData ) | ( ruleVariableReference ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt3=1;
                }
                break;
            case 11:
            case 12:
                {
                alt3=2;
                }
                break;
            case RULE_INT:
            case 47:
                {
                alt3=3;
                }
                break;
            case 46:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:670:1: ( ruleExpression )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:670:1: ( ruleExpression )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:671:1: ruleExpression
                    {
                     before(grammarAccess.getExpressionElementAccess().getExpressionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__ExpressionElement__Alternatives1365);
                    ruleExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionElementAccess().getExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:676:6: ( ruleBooleanData )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:676:6: ( ruleBooleanData )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:677:1: ruleBooleanData
                    {
                     before(grammarAccess.getExpressionElementAccess().getBooleanDataParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanData_in_rule__ExpressionElement__Alternatives1382);
                    ruleBooleanData();

                    state._fsp--;

                     after(grammarAccess.getExpressionElementAccess().getBooleanDataParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:682:6: ( ruleIntegerData )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:682:6: ( ruleIntegerData )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:683:1: ruleIntegerData
                    {
                     before(grammarAccess.getExpressionElementAccess().getIntegerDataParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerData_in_rule__ExpressionElement__Alternatives1399);
                    ruleIntegerData();

                    state._fsp--;

                     after(grammarAccess.getExpressionElementAccess().getIntegerDataParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:688:6: ( ruleVariableReference )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:688:6: ( ruleVariableReference )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:689:1: ruleVariableReference
                    {
                     before(grammarAccess.getExpressionElementAccess().getVariableReferenceParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_rule__ExpressionElement__Alternatives1416);
                    ruleVariableReference();

                    state._fsp--;

                     after(grammarAccess.getExpressionElementAccess().getVariableReferenceParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionElement__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:700:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:704:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:705:1: ( RULE_STRING )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:705:1: ( RULE_STRING )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:706:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1449); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:711:6: ( RULE_ID )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:711:6: ( RULE_ID )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:712:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1466); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:722:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:726:1: ( ( 'true' ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:727:1: ( 'true' )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:727:1: ( 'true' )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:728:1: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__EBoolean__Alternatives1499); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:735:6: ( 'false' )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:735:6: ( 'false' )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:736:1: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__EBoolean__Alternatives1519); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:748:1: rule__Operator__Alternatives : ( ( ( 'add' ) ) | ( ( 'sub' ) ) | ( ( 'eq' ) ) | ( ( 'mul' ) ) | ( ( 'gt' ) ) | ( ( 'lt' ) ) | ( ( 'lte' ) ) | ( ( 'gte' ) ) | ( ( 'div' ) ) | ( ( 'and' ) ) | ( ( 'neq' ) ) | ( ( 'or' ) ) | ( ( 'not' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:752:1: ( ( ( 'add' ) ) | ( ( 'sub' ) ) | ( ( 'eq' ) ) | ( ( 'mul' ) ) | ( ( 'gt' ) ) | ( ( 'lt' ) ) | ( ( 'lte' ) ) | ( ( 'gte' ) ) | ( ( 'div' ) ) | ( ( 'and' ) ) | ( ( 'neq' ) ) | ( ( 'or' ) ) | ( ( 'not' ) ) )
            int alt6=13;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            case 16:
                {
                alt6=4;
                }
                break;
            case 17:
                {
                alt6=5;
                }
                break;
            case 18:
                {
                alt6=6;
                }
                break;
            case 19:
                {
                alt6=7;
                }
                break;
            case 20:
                {
                alt6=8;
                }
                break;
            case 21:
                {
                alt6=9;
                }
                break;
            case 22:
                {
                alt6=10;
                }
                break;
            case 23:
                {
                alt6=11;
                }
                break;
            case 24:
                {
                alt6=12;
                }
                break;
            case 25:
                {
                alt6=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:753:1: ( ( 'add' ) )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:753:1: ( ( 'add' ) )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:754:1: ( 'add' )
                    {
                     before(grammarAccess.getOperatorAccess().getAddEnumLiteralDeclaration_0()); 
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:755:1: ( 'add' )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:755:3: 'add'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__Operator__Alternatives1554); 

                    }

                     after(grammarAccess.getOperatorAccess().getAddEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:760:6: ( ( 'sub' ) )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:760:6: ( ( 'sub' ) )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:761:1: ( 'sub' )
                    {
                     before(grammarAccess.getOperatorAccess().getSubEnumLiteralDeclaration_1()); 
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:762:1: ( 'sub' )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:762:3: 'sub'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__Operator__Alternatives1575); 

                    }

                     after(grammarAccess.getOperatorAccess().getSubEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:767:6: ( ( 'eq' ) )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:767:6: ( ( 'eq' ) )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:768:1: ( 'eq' )
                    {
                     before(grammarAccess.getOperatorAccess().getEqEnumLiteralDeclaration_2()); 
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:769:1: ( 'eq' )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:769:3: 'eq'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__Operator__Alternatives1596); 

                    }

                     after(grammarAccess.getOperatorAccess().getEqEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:774:6: ( ( 'mul' ) )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:774:6: ( ( 'mul' ) )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:775:1: ( 'mul' )
                    {
                     before(grammarAccess.getOperatorAccess().getMulEnumLiteralDeclaration_3()); 
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:776:1: ( 'mul' )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:776:3: 'mul'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__Operator__Alternatives1617); 

                    }

                     after(grammarAccess.getOperatorAccess().getMulEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:781:6: ( ( 'gt' ) )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:781:6: ( ( 'gt' ) )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:782:1: ( 'gt' )
                    {
                     before(grammarAccess.getOperatorAccess().getGtEnumLiteralDeclaration_4()); 
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:783:1: ( 'gt' )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:783:3: 'gt'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__Operator__Alternatives1638); 

                    }

                     after(grammarAccess.getOperatorAccess().getGtEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:788:6: ( ( 'lt' ) )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:788:6: ( ( 'lt' ) )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:789:1: ( 'lt' )
                    {
                     before(grammarAccess.getOperatorAccess().getLtEnumLiteralDeclaration_5()); 
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:790:1: ( 'lt' )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:790:3: 'lt'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__Operator__Alternatives1659); 

                    }

                     after(grammarAccess.getOperatorAccess().getLtEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:795:6: ( ( 'lte' ) )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:795:6: ( ( 'lte' ) )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:796:1: ( 'lte' )
                    {
                     before(grammarAccess.getOperatorAccess().getLteEnumLiteralDeclaration_6()); 
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:797:1: ( 'lte' )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:797:3: 'lte'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__Operator__Alternatives1680); 

                    }

                     after(grammarAccess.getOperatorAccess().getLteEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:802:6: ( ( 'gte' ) )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:802:6: ( ( 'gte' ) )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:803:1: ( 'gte' )
                    {
                     before(grammarAccess.getOperatorAccess().getGteEnumLiteralDeclaration_7()); 
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:804:1: ( 'gte' )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:804:3: 'gte'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__Operator__Alternatives1701); 

                    }

                     after(grammarAccess.getOperatorAccess().getGteEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:809:6: ( ( 'div' ) )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:809:6: ( ( 'div' ) )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:810:1: ( 'div' )
                    {
                     before(grammarAccess.getOperatorAccess().getDivEnumLiteralDeclaration_8()); 
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:811:1: ( 'div' )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:811:3: 'div'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__Operator__Alternatives1722); 

                    }

                     after(grammarAccess.getOperatorAccess().getDivEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:816:6: ( ( 'and' ) )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:816:6: ( ( 'and' ) )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:817:1: ( 'and' )
                    {
                     before(grammarAccess.getOperatorAccess().getAndEnumLiteralDeclaration_9()); 
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:818:1: ( 'and' )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:818:3: 'and'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__Operator__Alternatives1743); 

                    }

                     after(grammarAccess.getOperatorAccess().getAndEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:823:6: ( ( 'neq' ) )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:823:6: ( ( 'neq' ) )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:824:1: ( 'neq' )
                    {
                     before(grammarAccess.getOperatorAccess().getNeqEnumLiteralDeclaration_10()); 
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:825:1: ( 'neq' )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:825:3: 'neq'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__Operator__Alternatives1764); 

                    }

                     after(grammarAccess.getOperatorAccess().getNeqEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:830:6: ( ( 'or' ) )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:830:6: ( ( 'or' ) )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:831:1: ( 'or' )
                    {
                     before(grammarAccess.getOperatorAccess().getOrEnumLiteralDeclaration_11()); 
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:832:1: ( 'or' )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:832:3: 'or'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__Operator__Alternatives1785); 

                    }

                     after(grammarAccess.getOperatorAccess().getOrEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:837:6: ( ( 'not' ) )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:837:6: ( ( 'not' ) )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:838:1: ( 'not' )
                    {
                     before(grammarAccess.getOperatorAccess().getNotEnumLiteralDeclaration_12()); 
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:839:1: ( 'not' )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:839:3: 'not'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__Operator__Alternatives1806); 

                    }

                     after(grammarAccess.getOperatorAccess().getNotEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__StateMachine__Group__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:851:1: rule__StateMachine__Group__0 : rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 ;
    public final void rule__StateMachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:855:1: ( rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:856:2: rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__0__Impl_in_rule__StateMachine__Group__01839);
            rule__StateMachine__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__1_in_rule__StateMachine__Group__01842);
            rule__StateMachine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__0"


    // $ANTLR start "rule__StateMachine__Group__0__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:863:1: rule__StateMachine__Group__0__Impl : ( ( rule__StateMachine__IsActiveAssignment_0 ) ) ;
    public final void rule__StateMachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:867:1: ( ( ( rule__StateMachine__IsActiveAssignment_0 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:868:1: ( ( rule__StateMachine__IsActiveAssignment_0 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:868:1: ( ( rule__StateMachine__IsActiveAssignment_0 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:869:1: ( rule__StateMachine__IsActiveAssignment_0 )
            {
             before(grammarAccess.getStateMachineAccess().getIsActiveAssignment_0()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:870:1: ( rule__StateMachine__IsActiveAssignment_0 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:870:2: rule__StateMachine__IsActiveAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__IsActiveAssignment_0_in_rule__StateMachine__Group__0__Impl1869);
            rule__StateMachine__IsActiveAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getIsActiveAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__0__Impl"


    // $ANTLR start "rule__StateMachine__Group__1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:880:1: rule__StateMachine__Group__1 : rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 ;
    public final void rule__StateMachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:884:1: ( rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:885:2: rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__1__Impl_in_rule__StateMachine__Group__11899);
            rule__StateMachine__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__2_in_rule__StateMachine__Group__11902);
            rule__StateMachine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__1"


    // $ANTLR start "rule__StateMachine__Group__1__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:892:1: rule__StateMachine__Group__1__Impl : ( 'StateMachine' ) ;
    public final void rule__StateMachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:896:1: ( ( 'StateMachine' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:897:1: ( 'StateMachine' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:897:1: ( 'StateMachine' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:898:1: 'StateMachine'
            {
             before(grammarAccess.getStateMachineAccess().getStateMachineKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__StateMachine__Group__1__Impl1930); 
             after(grammarAccess.getStateMachineAccess().getStateMachineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__1__Impl"


    // $ANTLR start "rule__StateMachine__Group__2"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:911:1: rule__StateMachine__Group__2 : rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 ;
    public final void rule__StateMachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:915:1: ( rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:916:2: rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__2__Impl_in_rule__StateMachine__Group__21961);
            rule__StateMachine__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__3_in_rule__StateMachine__Group__21964);
            rule__StateMachine__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__2"


    // $ANTLR start "rule__StateMachine__Group__2__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:923:1: rule__StateMachine__Group__2__Impl : ( ( rule__StateMachine__NameAssignment_2 ) ) ;
    public final void rule__StateMachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:927:1: ( ( ( rule__StateMachine__NameAssignment_2 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:928:1: ( ( rule__StateMachine__NameAssignment_2 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:928:1: ( ( rule__StateMachine__NameAssignment_2 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:929:1: ( rule__StateMachine__NameAssignment_2 )
            {
             before(grammarAccess.getStateMachineAccess().getNameAssignment_2()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:930:1: ( rule__StateMachine__NameAssignment_2 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:930:2: rule__StateMachine__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__NameAssignment_2_in_rule__StateMachine__Group__2__Impl1991);
            rule__StateMachine__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__2__Impl"


    // $ANTLR start "rule__StateMachine__Group__3"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:940:1: rule__StateMachine__Group__3 : rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4 ;
    public final void rule__StateMachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:944:1: ( rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:945:2: rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__3__Impl_in_rule__StateMachine__Group__32021);
            rule__StateMachine__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__4_in_rule__StateMachine__Group__32024);
            rule__StateMachine__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__3"


    // $ANTLR start "rule__StateMachine__Group__3__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:952:1: rule__StateMachine__Group__3__Impl : ( '{' ) ;
    public final void rule__StateMachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:956:1: ( ( '{' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:957:1: ( '{' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:957:1: ( '{' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:958:1: '{'
            {
             before(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__StateMachine__Group__3__Impl2052); 
             after(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__3__Impl"


    // $ANTLR start "rule__StateMachine__Group__4"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:971:1: rule__StateMachine__Group__4 : rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5 ;
    public final void rule__StateMachine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:975:1: ( rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:976:2: rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__4__Impl_in_rule__StateMachine__Group__42083);
            rule__StateMachine__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__5_in_rule__StateMachine__Group__42086);
            rule__StateMachine__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__4"


    // $ANTLR start "rule__StateMachine__Group__4__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:983:1: rule__StateMachine__Group__4__Impl : ( ( rule__StateMachine__VariablesAssignment_4 )* ) ;
    public final void rule__StateMachine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:987:1: ( ( ( rule__StateMachine__VariablesAssignment_4 )* ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:988:1: ( ( rule__StateMachine__VariablesAssignment_4 )* )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:988:1: ( ( rule__StateMachine__VariablesAssignment_4 )* )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:989:1: ( rule__StateMachine__VariablesAssignment_4 )*
            {
             before(grammarAccess.getStateMachineAccess().getVariablesAssignment_4()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:990:1: ( rule__StateMachine__VariablesAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==31) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:990:2: rule__StateMachine__VariablesAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__StateMachine__VariablesAssignment_4_in_rule__StateMachine__Group__4__Impl2113);
            	    rule__StateMachine__VariablesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getVariablesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__4__Impl"


    // $ANTLR start "rule__StateMachine__Group__5"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1000:1: rule__StateMachine__Group__5 : rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6 ;
    public final void rule__StateMachine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1004:1: ( rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1005:2: rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__5__Impl_in_rule__StateMachine__Group__52144);
            rule__StateMachine__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__6_in_rule__StateMachine__Group__52147);
            rule__StateMachine__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__5"


    // $ANTLR start "rule__StateMachine__Group__5__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1012:1: rule__StateMachine__Group__5__Impl : ( 'events' ) ;
    public final void rule__StateMachine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1016:1: ( ( 'events' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1017:1: ( 'events' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1017:1: ( 'events' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1018:1: 'events'
            {
             before(grammarAccess.getStateMachineAccess().getEventsKeyword_5()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__StateMachine__Group__5__Impl2175); 
             after(grammarAccess.getStateMachineAccess().getEventsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__5__Impl"


    // $ANTLR start "rule__StateMachine__Group__6"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1031:1: rule__StateMachine__Group__6 : rule__StateMachine__Group__6__Impl rule__StateMachine__Group__7 ;
    public final void rule__StateMachine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1035:1: ( rule__StateMachine__Group__6__Impl rule__StateMachine__Group__7 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1036:2: rule__StateMachine__Group__6__Impl rule__StateMachine__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__6__Impl_in_rule__StateMachine__Group__62206);
            rule__StateMachine__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__7_in_rule__StateMachine__Group__62209);
            rule__StateMachine__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__6"


    // $ANTLR start "rule__StateMachine__Group__6__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1043:1: rule__StateMachine__Group__6__Impl : ( '{' ) ;
    public final void rule__StateMachine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1047:1: ( ( '{' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1048:1: ( '{' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1048:1: ( '{' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1049:1: '{'
            {
             before(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__StateMachine__Group__6__Impl2237); 
             after(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__6__Impl"


    // $ANTLR start "rule__StateMachine__Group__7"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1062:1: rule__StateMachine__Group__7 : rule__StateMachine__Group__7__Impl rule__StateMachine__Group__8 ;
    public final void rule__StateMachine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1066:1: ( rule__StateMachine__Group__7__Impl rule__StateMachine__Group__8 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1067:2: rule__StateMachine__Group__7__Impl rule__StateMachine__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__7__Impl_in_rule__StateMachine__Group__72268);
            rule__StateMachine__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__8_in_rule__StateMachine__Group__72271);
            rule__StateMachine__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__7"


    // $ANTLR start "rule__StateMachine__Group__7__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1074:1: rule__StateMachine__Group__7__Impl : ( ( rule__StateMachine__EventsAssignment_7 ) ) ;
    public final void rule__StateMachine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1078:1: ( ( ( rule__StateMachine__EventsAssignment_7 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1079:1: ( ( rule__StateMachine__EventsAssignment_7 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1079:1: ( ( rule__StateMachine__EventsAssignment_7 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1080:1: ( rule__StateMachine__EventsAssignment_7 )
            {
             before(grammarAccess.getStateMachineAccess().getEventsAssignment_7()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1081:1: ( rule__StateMachine__EventsAssignment_7 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1081:2: rule__StateMachine__EventsAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__EventsAssignment_7_in_rule__StateMachine__Group__7__Impl2298);
            rule__StateMachine__EventsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getEventsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__7__Impl"


    // $ANTLR start "rule__StateMachine__Group__8"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1091:1: rule__StateMachine__Group__8 : rule__StateMachine__Group__8__Impl rule__StateMachine__Group__9 ;
    public final void rule__StateMachine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1095:1: ( rule__StateMachine__Group__8__Impl rule__StateMachine__Group__9 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1096:2: rule__StateMachine__Group__8__Impl rule__StateMachine__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__8__Impl_in_rule__StateMachine__Group__82328);
            rule__StateMachine__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__9_in_rule__StateMachine__Group__82331);
            rule__StateMachine__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__8"


    // $ANTLR start "rule__StateMachine__Group__8__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1103:1: rule__StateMachine__Group__8__Impl : ( ( rule__StateMachine__Group_8__0 )* ) ;
    public final void rule__StateMachine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1107:1: ( ( ( rule__StateMachine__Group_8__0 )* ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1108:1: ( ( rule__StateMachine__Group_8__0 )* )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1108:1: ( ( rule__StateMachine__Group_8__0 )* )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1109:1: ( rule__StateMachine__Group_8__0 )*
            {
             before(grammarAccess.getStateMachineAccess().getGroup_8()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1110:1: ( rule__StateMachine__Group_8__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1110:2: rule__StateMachine__Group_8__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_8__0_in_rule__StateMachine__Group__8__Impl2358);
            	    rule__StateMachine__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__8__Impl"


    // $ANTLR start "rule__StateMachine__Group__9"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1120:1: rule__StateMachine__Group__9 : rule__StateMachine__Group__9__Impl rule__StateMachine__Group__10 ;
    public final void rule__StateMachine__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1124:1: ( rule__StateMachine__Group__9__Impl rule__StateMachine__Group__10 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1125:2: rule__StateMachine__Group__9__Impl rule__StateMachine__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__9__Impl_in_rule__StateMachine__Group__92389);
            rule__StateMachine__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__10_in_rule__StateMachine__Group__92392);
            rule__StateMachine__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__9"


    // $ANTLR start "rule__StateMachine__Group__9__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1132:1: rule__StateMachine__Group__9__Impl : ( '}' ) ;
    public final void rule__StateMachine__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1136:1: ( ( '}' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1137:1: ( '}' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1137:1: ( '}' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1138:1: '}'
            {
             before(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_9()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__StateMachine__Group__9__Impl2420); 
             after(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__9__Impl"


    // $ANTLR start "rule__StateMachine__Group__10"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1151:1: rule__StateMachine__Group__10 : rule__StateMachine__Group__10__Impl ;
    public final void rule__StateMachine__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1155:1: ( rule__StateMachine__Group__10__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1156:2: rule__StateMachine__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__10__Impl_in_rule__StateMachine__Group__102451);
            rule__StateMachine__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__10"


    // $ANTLR start "rule__StateMachine__Group__10__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1162:1: rule__StateMachine__Group__10__Impl : ( '}' ) ;
    public final void rule__StateMachine__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1166:1: ( ( '}' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1167:1: ( '}' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1167:1: ( '}' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1168:1: '}'
            {
             before(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_10()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__StateMachine__Group__10__Impl2479); 
             after(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__10__Impl"


    // $ANTLR start "rule__StateMachine__Group_8__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1203:1: rule__StateMachine__Group_8__0 : rule__StateMachine__Group_8__0__Impl rule__StateMachine__Group_8__1 ;
    public final void rule__StateMachine__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1207:1: ( rule__StateMachine__Group_8__0__Impl rule__StateMachine__Group_8__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1208:2: rule__StateMachine__Group_8__0__Impl rule__StateMachine__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_8__0__Impl_in_rule__StateMachine__Group_8__02532);
            rule__StateMachine__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_8__1_in_rule__StateMachine__Group_8__02535);
            rule__StateMachine__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_8__0"


    // $ANTLR start "rule__StateMachine__Group_8__0__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1215:1: rule__StateMachine__Group_8__0__Impl : ( ',' ) ;
    public final void rule__StateMachine__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1219:1: ( ( ',' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1220:1: ( ',' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1220:1: ( ',' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1221:1: ','
            {
             before(grammarAccess.getStateMachineAccess().getCommaKeyword_8_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__StateMachine__Group_8__0__Impl2563); 
             after(grammarAccess.getStateMachineAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_8__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_8__1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1234:1: rule__StateMachine__Group_8__1 : rule__StateMachine__Group_8__1__Impl ;
    public final void rule__StateMachine__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1238:1: ( rule__StateMachine__Group_8__1__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1239:2: rule__StateMachine__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_8__1__Impl_in_rule__StateMachine__Group_8__12594);
            rule__StateMachine__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_8__1"


    // $ANTLR start "rule__StateMachine__Group_8__1__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1245:1: rule__StateMachine__Group_8__1__Impl : ( ( rule__StateMachine__EventsAssignment_8_1 ) ) ;
    public final void rule__StateMachine__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1249:1: ( ( ( rule__StateMachine__EventsAssignment_8_1 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1250:1: ( ( rule__StateMachine__EventsAssignment_8_1 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1250:1: ( ( rule__StateMachine__EventsAssignment_8_1 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1251:1: ( rule__StateMachine__EventsAssignment_8_1 )
            {
             before(grammarAccess.getStateMachineAccess().getEventsAssignment_8_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1252:1: ( rule__StateMachine__EventsAssignment_8_1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1252:2: rule__StateMachine__EventsAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__EventsAssignment_8_1_in_rule__StateMachine__Group_8__1__Impl2621);
            rule__StateMachine__EventsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getEventsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_8__1__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1266:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1270:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1271:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__02655);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__02658);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1278:1: rule__Variable__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1282:1: ( ( 'var' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1283:1: ( 'var' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1283:1: ( 'var' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1284:1: 'var'
            {
             before(grammarAccess.getVariableAccess().getVarKeyword_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Variable__Group__0__Impl2686); 
             after(grammarAccess.getVariableAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1297:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1301:1: ( rule__Variable__Group__1__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1302:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__12717);
            rule__Variable__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1308:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__Alternatives_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1312:1: ( ( ( rule__Variable__Alternatives_1 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1313:1: ( ( rule__Variable__Alternatives_1 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1313:1: ( ( rule__Variable__Alternatives_1 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1314:1: ( rule__Variable__Alternatives_1 )
            {
             before(grammarAccess.getVariableAccess().getAlternatives_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1315:1: ( rule__Variable__Alternatives_1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1315:2: rule__Variable__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Alternatives_1_in_rule__Variable__Group__1__Impl2744);
            rule__Variable__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1329:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1333:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1334:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__02778);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__02781);
            rule__Operation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1341:1: rule__Operation__Group__0__Impl : ( () ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1345:1: ( ( () ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1346:1: ( () )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1346:1: ( () )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1347:1: ()
            {
             before(grammarAccess.getOperationAccess().getOperationAction_0()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1348:1: ()
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1350:1: 
            {
            }

             after(grammarAccess.getOperationAccess().getOperationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1360:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1364:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1365:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__12839);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__12842);
            rule__Operation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1372:1: rule__Operation__Group__1__Impl : ( 'Operation' ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1376:1: ( ( 'Operation' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1377:1: ( 'Operation' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1377:1: ( 'Operation' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1378:1: 'Operation'
            {
             before(grammarAccess.getOperationAccess().getOperationKeyword_1()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Operation__Group__1__Impl2870); 
             after(grammarAccess.getOperationAccess().getOperationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__2"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1391:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1395:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1396:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__22901);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__22904);
            rule__Operation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2"


    // $ANTLR start "rule__Operation__Group__2__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1403:1: rule__Operation__Group__2__Impl : ( '{' ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1407:1: ( ( '{' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1408:1: ( '{' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1408:1: ( '{' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1409:1: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Operation__Group__2__Impl2932); 
             after(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2__Impl"


    // $ANTLR start "rule__Operation__Group__3"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1422:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1426:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1427:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__32963);
            rule__Operation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__32966);
            rule__Operation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3"


    // $ANTLR start "rule__Operation__Group__3__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1434:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__Group_3__0 )? ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1438:1: ( ( ( rule__Operation__Group_3__0 )? ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1439:1: ( ( rule__Operation__Group_3__0 )? )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1439:1: ( ( rule__Operation__Group_3__0 )? )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1440:1: ( rule__Operation__Group_3__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_3()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1441:1: ( rule__Operation__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==33) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1441:2: rule__Operation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_3__0_in_rule__Operation__Group__3__Impl2993);
                    rule__Operation__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3__Impl"


    // $ANTLR start "rule__Operation__Group__4"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1451:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1455:1: ( rule__Operation__Group__4__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1456:2: rule__Operation__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__43024);
            rule__Operation__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4"


    // $ANTLR start "rule__Operation__Group__4__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1462:1: rule__Operation__Group__4__Impl : ( '}' ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1466:1: ( ( '}' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1467:1: ( '}' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1467:1: ( '}' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1468:1: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Operation__Group__4__Impl3052); 
             after(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4__Impl"


    // $ANTLR start "rule__Operation__Group_3__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1491:1: rule__Operation__Group_3__0 : rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 ;
    public final void rule__Operation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1495:1: ( rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1496:2: rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_3__0__Impl_in_rule__Operation__Group_3__03093);
            rule__Operation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_3__1_in_rule__Operation__Group_3__03096);
            rule__Operation__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__0"


    // $ANTLR start "rule__Operation__Group_3__0__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1503:1: rule__Operation__Group_3__0__Impl : ( 'contents' ) ;
    public final void rule__Operation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1507:1: ( ( 'contents' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1508:1: ( 'contents' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1508:1: ( 'contents' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1509:1: 'contents'
            {
             before(grammarAccess.getOperationAccess().getContentsKeyword_3_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Operation__Group_3__0__Impl3124); 
             after(grammarAccess.getOperationAccess().getContentsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__0__Impl"


    // $ANTLR start "rule__Operation__Group_3__1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1522:1: rule__Operation__Group_3__1 : rule__Operation__Group_3__1__Impl rule__Operation__Group_3__2 ;
    public final void rule__Operation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1526:1: ( rule__Operation__Group_3__1__Impl rule__Operation__Group_3__2 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1527:2: rule__Operation__Group_3__1__Impl rule__Operation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_3__1__Impl_in_rule__Operation__Group_3__13155);
            rule__Operation__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_3__2_in_rule__Operation__Group_3__13158);
            rule__Operation__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__1"


    // $ANTLR start "rule__Operation__Group_3__1__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1534:1: rule__Operation__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Operation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1538:1: ( ( '{' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1539:1: ( '{' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1539:1: ( '{' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1540:1: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Operation__Group_3__1__Impl3186); 
             after(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__1__Impl"


    // $ANTLR start "rule__Operation__Group_3__2"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1553:1: rule__Operation__Group_3__2 : rule__Operation__Group_3__2__Impl rule__Operation__Group_3__3 ;
    public final void rule__Operation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1557:1: ( rule__Operation__Group_3__2__Impl rule__Operation__Group_3__3 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1558:2: rule__Operation__Group_3__2__Impl rule__Operation__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_3__2__Impl_in_rule__Operation__Group_3__23217);
            rule__Operation__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_3__3_in_rule__Operation__Group_3__23220);
            rule__Operation__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__2"


    // $ANTLR start "rule__Operation__Group_3__2__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1565:1: rule__Operation__Group_3__2__Impl : ( ( rule__Operation__ContentsAssignment_3_2 ) ) ;
    public final void rule__Operation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1569:1: ( ( ( rule__Operation__ContentsAssignment_3_2 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1570:1: ( ( rule__Operation__ContentsAssignment_3_2 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1570:1: ( ( rule__Operation__ContentsAssignment_3_2 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1571:1: ( rule__Operation__ContentsAssignment_3_2 )
            {
             before(grammarAccess.getOperationAccess().getContentsAssignment_3_2()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1572:1: ( rule__Operation__ContentsAssignment_3_2 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1572:2: rule__Operation__ContentsAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__ContentsAssignment_3_2_in_rule__Operation__Group_3__2__Impl3247);
            rule__Operation__ContentsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getContentsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__2__Impl"


    // $ANTLR start "rule__Operation__Group_3__3"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1582:1: rule__Operation__Group_3__3 : rule__Operation__Group_3__3__Impl rule__Operation__Group_3__4 ;
    public final void rule__Operation__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1586:1: ( rule__Operation__Group_3__3__Impl rule__Operation__Group_3__4 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1587:2: rule__Operation__Group_3__3__Impl rule__Operation__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_3__3__Impl_in_rule__Operation__Group_3__33277);
            rule__Operation__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_3__4_in_rule__Operation__Group_3__33280);
            rule__Operation__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__3"


    // $ANTLR start "rule__Operation__Group_3__3__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1594:1: rule__Operation__Group_3__3__Impl : ( ( rule__Operation__Group_3_3__0 )* ) ;
    public final void rule__Operation__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1598:1: ( ( ( rule__Operation__Group_3_3__0 )* ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1599:1: ( ( rule__Operation__Group_3_3__0 )* )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1599:1: ( ( rule__Operation__Group_3_3__0 )* )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1600:1: ( rule__Operation__Group_3_3__0 )*
            {
             before(grammarAccess.getOperationAccess().getGroup_3_3()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1601:1: ( rule__Operation__Group_3_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1601:2: rule__Operation__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_3_3__0_in_rule__Operation__Group_3__3__Impl3307);
            	    rule__Operation__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getOperationAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__3__Impl"


    // $ANTLR start "rule__Operation__Group_3__4"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1611:1: rule__Operation__Group_3__4 : rule__Operation__Group_3__4__Impl ;
    public final void rule__Operation__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1615:1: ( rule__Operation__Group_3__4__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1616:2: rule__Operation__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_3__4__Impl_in_rule__Operation__Group_3__43338);
            rule__Operation__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__4"


    // $ANTLR start "rule__Operation__Group_3__4__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1622:1: rule__Operation__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Operation__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1626:1: ( ( '}' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1627:1: ( '}' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1627:1: ( '}' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1628:1: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Operation__Group_3__4__Impl3366); 
             after(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__4__Impl"


    // $ANTLR start "rule__Operation__Group_3_3__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1651:1: rule__Operation__Group_3_3__0 : rule__Operation__Group_3_3__0__Impl rule__Operation__Group_3_3__1 ;
    public final void rule__Operation__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1655:1: ( rule__Operation__Group_3_3__0__Impl rule__Operation__Group_3_3__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1656:2: rule__Operation__Group_3_3__0__Impl rule__Operation__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_3_3__0__Impl_in_rule__Operation__Group_3_3__03407);
            rule__Operation__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_3_3__1_in_rule__Operation__Group_3_3__03410);
            rule__Operation__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3_3__0"


    // $ANTLR start "rule__Operation__Group_3_3__0__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1663:1: rule__Operation__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Operation__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1667:1: ( ( ',' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1668:1: ( ',' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1668:1: ( ',' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1669:1: ','
            {
             before(grammarAccess.getOperationAccess().getCommaKeyword_3_3_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Operation__Group_3_3__0__Impl3438); 
             after(grammarAccess.getOperationAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3_3__0__Impl"


    // $ANTLR start "rule__Operation__Group_3_3__1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1682:1: rule__Operation__Group_3_3__1 : rule__Operation__Group_3_3__1__Impl ;
    public final void rule__Operation__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1686:1: ( rule__Operation__Group_3_3__1__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1687:2: rule__Operation__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_3_3__1__Impl_in_rule__Operation__Group_3_3__13469);
            rule__Operation__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3_3__1"


    // $ANTLR start "rule__Operation__Group_3_3__1__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1693:1: rule__Operation__Group_3_3__1__Impl : ( ( rule__Operation__ContentsAssignment_3_3_1 ) ) ;
    public final void rule__Operation__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1697:1: ( ( ( rule__Operation__ContentsAssignment_3_3_1 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1698:1: ( ( rule__Operation__ContentsAssignment_3_3_1 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1698:1: ( ( rule__Operation__ContentsAssignment_3_3_1 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1699:1: ( rule__Operation__ContentsAssignment_3_3_1 )
            {
             before(grammarAccess.getOperationAccess().getContentsAssignment_3_3_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1700:1: ( rule__Operation__ContentsAssignment_3_3_1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1700:2: rule__Operation__ContentsAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__ContentsAssignment_3_3_1_in_rule__Operation__Group_3_3__1__Impl3496);
            rule__Operation__ContentsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getContentsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3_3__1__Impl"


    // $ANTLR start "rule__State_Impl__Group__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1714:1: rule__State_Impl__Group__0 : rule__State_Impl__Group__0__Impl rule__State_Impl__Group__1 ;
    public final void rule__State_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1718:1: ( rule__State_Impl__Group__0__Impl rule__State_Impl__Group__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1719:2: rule__State_Impl__Group__0__Impl rule__State_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State_Impl__Group__0__Impl_in_rule__State_Impl__Group__03530);
            rule__State_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State_Impl__Group__1_in_rule__State_Impl__Group__03533);
            rule__State_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State_Impl__Group__0"


    // $ANTLR start "rule__State_Impl__Group__0__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1726:1: rule__State_Impl__Group__0__Impl : ( ( rule__State_Impl__IsActiveAssignment_0 ) ) ;
    public final void rule__State_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1730:1: ( ( ( rule__State_Impl__IsActiveAssignment_0 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1731:1: ( ( rule__State_Impl__IsActiveAssignment_0 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1731:1: ( ( rule__State_Impl__IsActiveAssignment_0 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1732:1: ( rule__State_Impl__IsActiveAssignment_0 )
            {
             before(grammarAccess.getState_ImplAccess().getIsActiveAssignment_0()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1733:1: ( rule__State_Impl__IsActiveAssignment_0 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1733:2: rule__State_Impl__IsActiveAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__State_Impl__IsActiveAssignment_0_in_rule__State_Impl__Group__0__Impl3560);
            rule__State_Impl__IsActiveAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getState_ImplAccess().getIsActiveAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State_Impl__Group__0__Impl"


    // $ANTLR start "rule__State_Impl__Group__1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1743:1: rule__State_Impl__Group__1 : rule__State_Impl__Group__1__Impl rule__State_Impl__Group__2 ;
    public final void rule__State_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1747:1: ( rule__State_Impl__Group__1__Impl rule__State_Impl__Group__2 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1748:2: rule__State_Impl__Group__1__Impl rule__State_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State_Impl__Group__1__Impl_in_rule__State_Impl__Group__13590);
            rule__State_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State_Impl__Group__2_in_rule__State_Impl__Group__13593);
            rule__State_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State_Impl__Group__1"


    // $ANTLR start "rule__State_Impl__Group__1__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1755:1: rule__State_Impl__Group__1__Impl : ( 'State' ) ;
    public final void rule__State_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1759:1: ( ( 'State' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1760:1: ( 'State' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1760:1: ( 'State' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1761:1: 'State'
            {
             before(grammarAccess.getState_ImplAccess().getStateKeyword_1()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__State_Impl__Group__1__Impl3621); 
             after(grammarAccess.getState_ImplAccess().getStateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State_Impl__Group__1__Impl"


    // $ANTLR start "rule__State_Impl__Group__2"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1774:1: rule__State_Impl__Group__2 : rule__State_Impl__Group__2__Impl rule__State_Impl__Group__3 ;
    public final void rule__State_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1778:1: ( rule__State_Impl__Group__2__Impl rule__State_Impl__Group__3 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1779:2: rule__State_Impl__Group__2__Impl rule__State_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__State_Impl__Group__2__Impl_in_rule__State_Impl__Group__23652);
            rule__State_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State_Impl__Group__3_in_rule__State_Impl__Group__23655);
            rule__State_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State_Impl__Group__2"


    // $ANTLR start "rule__State_Impl__Group__2__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1786:1: rule__State_Impl__Group__2__Impl : ( ( rule__State_Impl__NameAssignment_2 ) ) ;
    public final void rule__State_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1790:1: ( ( ( rule__State_Impl__NameAssignment_2 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1791:1: ( ( rule__State_Impl__NameAssignment_2 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1791:1: ( ( rule__State_Impl__NameAssignment_2 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1792:1: ( rule__State_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getState_ImplAccess().getNameAssignment_2()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1793:1: ( rule__State_Impl__NameAssignment_2 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1793:2: rule__State_Impl__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State_Impl__NameAssignment_2_in_rule__State_Impl__Group__2__Impl3682);
            rule__State_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getState_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State_Impl__Group__2__Impl"


    // $ANTLR start "rule__State_Impl__Group__3"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1803:1: rule__State_Impl__Group__3 : rule__State_Impl__Group__3__Impl rule__State_Impl__Group__4 ;
    public final void rule__State_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1807:1: ( rule__State_Impl__Group__3__Impl rule__State_Impl__Group__4 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1808:2: rule__State_Impl__Group__3__Impl rule__State_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__State_Impl__Group__3__Impl_in_rule__State_Impl__Group__33712);
            rule__State_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State_Impl__Group__4_in_rule__State_Impl__Group__33715);
            rule__State_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State_Impl__Group__3"


    // $ANTLR start "rule__State_Impl__Group__3__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1815:1: rule__State_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__State_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1819:1: ( ( '{' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1820:1: ( '{' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1820:1: ( '{' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1821:1: '{'
            {
             before(grammarAccess.getState_ImplAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__State_Impl__Group__3__Impl3743); 
             after(grammarAccess.getState_ImplAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State_Impl__Group__3__Impl"


    // $ANTLR start "rule__State_Impl__Group__4"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1834:1: rule__State_Impl__Group__4 : rule__State_Impl__Group__4__Impl rule__State_Impl__Group__5 ;
    public final void rule__State_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1838:1: ( rule__State_Impl__Group__4__Impl rule__State_Impl__Group__5 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1839:2: rule__State_Impl__Group__4__Impl rule__State_Impl__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__State_Impl__Group__4__Impl_in_rule__State_Impl__Group__43774);
            rule__State_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State_Impl__Group__5_in_rule__State_Impl__Group__43777);
            rule__State_Impl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State_Impl__Group__4"


    // $ANTLR start "rule__State_Impl__Group__4__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1846:1: rule__State_Impl__Group__4__Impl : ( ( rule__State_Impl__Group_4__0 )? ) ;
    public final void rule__State_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1850:1: ( ( ( rule__State_Impl__Group_4__0 )? ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1851:1: ( ( rule__State_Impl__Group_4__0 )? )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1851:1: ( ( rule__State_Impl__Group_4__0 )? )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1852:1: ( rule__State_Impl__Group_4__0 )?
            {
             before(grammarAccess.getState_ImplAccess().getGroup_4()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1853:1: ( rule__State_Impl__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1853:2: rule__State_Impl__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__State_Impl__Group_4__0_in_rule__State_Impl__Group__4__Impl3804);
                    rule__State_Impl__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getState_ImplAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State_Impl__Group__4__Impl"


    // $ANTLR start "rule__State_Impl__Group__5"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1863:1: rule__State_Impl__Group__5 : rule__State_Impl__Group__5__Impl ;
    public final void rule__State_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1867:1: ( rule__State_Impl__Group__5__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1868:2: rule__State_Impl__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State_Impl__Group__5__Impl_in_rule__State_Impl__Group__53835);
            rule__State_Impl__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State_Impl__Group__5"


    // $ANTLR start "rule__State_Impl__Group__5__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1874:1: rule__State_Impl__Group__5__Impl : ( '}' ) ;
    public final void rule__State_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1878:1: ( ( '}' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1879:1: ( '}' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1879:1: ( '}' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1880:1: '}'
            {
             before(grammarAccess.getState_ImplAccess().getRightCurlyBracketKeyword_5()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__State_Impl__Group__5__Impl3863); 
             after(grammarAccess.getState_ImplAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State_Impl__Group__5__Impl"


    // $ANTLR start "rule__State_Impl__Group_4__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1905:1: rule__State_Impl__Group_4__0 : rule__State_Impl__Group_4__0__Impl rule__State_Impl__Group_4__1 ;
    public final void rule__State_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1909:1: ( rule__State_Impl__Group_4__0__Impl rule__State_Impl__Group_4__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1910:2: rule__State_Impl__Group_4__0__Impl rule__State_Impl__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State_Impl__Group_4__0__Impl_in_rule__State_Impl__Group_4__03906);
            rule__State_Impl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State_Impl__Group_4__1_in_rule__State_Impl__Group_4__03909);
            rule__State_Impl__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State_Impl__Group_4__0"


    // $ANTLR start "rule__State_Impl__Group_4__0__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1917:1: rule__State_Impl__Group_4__0__Impl : ( 'operation' ) ;
    public final void rule__State_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1921:1: ( ( 'operation' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1922:1: ( 'operation' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1922:1: ( 'operation' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1923:1: 'operation'
            {
             before(grammarAccess.getState_ImplAccess().getOperationKeyword_4_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__State_Impl__Group_4__0__Impl3937); 
             after(grammarAccess.getState_ImplAccess().getOperationKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State_Impl__Group_4__0__Impl"


    // $ANTLR start "rule__State_Impl__Group_4__1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1936:1: rule__State_Impl__Group_4__1 : rule__State_Impl__Group_4__1__Impl ;
    public final void rule__State_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1940:1: ( rule__State_Impl__Group_4__1__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1941:2: rule__State_Impl__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State_Impl__Group_4__1__Impl_in_rule__State_Impl__Group_4__13968);
            rule__State_Impl__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State_Impl__Group_4__1"


    // $ANTLR start "rule__State_Impl__Group_4__1__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1947:1: rule__State_Impl__Group_4__1__Impl : ( ( rule__State_Impl__OperationAssignment_4_1 ) ) ;
    public final void rule__State_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1951:1: ( ( ( rule__State_Impl__OperationAssignment_4_1 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1952:1: ( ( rule__State_Impl__OperationAssignment_4_1 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1952:1: ( ( rule__State_Impl__OperationAssignment_4_1 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1953:1: ( rule__State_Impl__OperationAssignment_4_1 )
            {
             before(grammarAccess.getState_ImplAccess().getOperationAssignment_4_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1954:1: ( rule__State_Impl__OperationAssignment_4_1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1954:2: rule__State_Impl__OperationAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State_Impl__OperationAssignment_4_1_in_rule__State_Impl__Group_4__1__Impl3995);
            rule__State_Impl__OperationAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getState_ImplAccess().getOperationAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State_Impl__Group_4__1__Impl"


    // $ANTLR start "rule__InitialState__Group__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1968:1: rule__InitialState__Group__0 : rule__InitialState__Group__0__Impl rule__InitialState__Group__1 ;
    public final void rule__InitialState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1972:1: ( rule__InitialState__Group__0__Impl rule__InitialState__Group__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1973:2: rule__InitialState__Group__0__Impl rule__InitialState__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InitialState__Group__0__Impl_in_rule__InitialState__Group__04029);
            rule__InitialState__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InitialState__Group__1_in_rule__InitialState__Group__04032);
            rule__InitialState__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__0"


    // $ANTLR start "rule__InitialState__Group__0__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1980:1: rule__InitialState__Group__0__Impl : ( 'InitialState' ) ;
    public final void rule__InitialState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1984:1: ( ( 'InitialState' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1985:1: ( 'InitialState' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1985:1: ( 'InitialState' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1986:1: 'InitialState'
            {
             before(grammarAccess.getInitialStateAccess().getInitialStateKeyword_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__InitialState__Group__0__Impl4060); 
             after(grammarAccess.getInitialStateAccess().getInitialStateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__0__Impl"


    // $ANTLR start "rule__InitialState__Group__1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1999:1: rule__InitialState__Group__1 : rule__InitialState__Group__1__Impl rule__InitialState__Group__2 ;
    public final void rule__InitialState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2003:1: ( rule__InitialState__Group__1__Impl rule__InitialState__Group__2 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2004:2: rule__InitialState__Group__1__Impl rule__InitialState__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InitialState__Group__1__Impl_in_rule__InitialState__Group__14091);
            rule__InitialState__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InitialState__Group__2_in_rule__InitialState__Group__14094);
            rule__InitialState__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__1"


    // $ANTLR start "rule__InitialState__Group__1__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2011:1: rule__InitialState__Group__1__Impl : ( '{' ) ;
    public final void rule__InitialState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2015:1: ( ( '{' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2016:1: ( '{' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2016:1: ( '{' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2017:1: '{'
            {
             before(grammarAccess.getInitialStateAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__InitialState__Group__1__Impl4122); 
             after(grammarAccess.getInitialStateAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__1__Impl"


    // $ANTLR start "rule__InitialState__Group__2"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2030:1: rule__InitialState__Group__2 : rule__InitialState__Group__2__Impl rule__InitialState__Group__3 ;
    public final void rule__InitialState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2034:1: ( rule__InitialState__Group__2__Impl rule__InitialState__Group__3 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2035:2: rule__InitialState__Group__2__Impl rule__InitialState__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InitialState__Group__2__Impl_in_rule__InitialState__Group__24153);
            rule__InitialState__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InitialState__Group__3_in_rule__InitialState__Group__24156);
            rule__InitialState__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__2"


    // $ANTLR start "rule__InitialState__Group__2__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2042:1: rule__InitialState__Group__2__Impl : ( 'referencedState' ) ;
    public final void rule__InitialState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2046:1: ( ( 'referencedState' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2047:1: ( 'referencedState' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2047:1: ( 'referencedState' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2048:1: 'referencedState'
            {
             before(grammarAccess.getInitialStateAccess().getReferencedStateKeyword_2()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__InitialState__Group__2__Impl4184); 
             after(grammarAccess.getInitialStateAccess().getReferencedStateKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__2__Impl"


    // $ANTLR start "rule__InitialState__Group__3"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2061:1: rule__InitialState__Group__3 : rule__InitialState__Group__3__Impl rule__InitialState__Group__4 ;
    public final void rule__InitialState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2065:1: ( rule__InitialState__Group__3__Impl rule__InitialState__Group__4 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2066:2: rule__InitialState__Group__3__Impl rule__InitialState__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InitialState__Group__3__Impl_in_rule__InitialState__Group__34215);
            rule__InitialState__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InitialState__Group__4_in_rule__InitialState__Group__34218);
            rule__InitialState__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__3"


    // $ANTLR start "rule__InitialState__Group__3__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2073:1: rule__InitialState__Group__3__Impl : ( ( rule__InitialState__ReferencedStateAssignment_3 ) ) ;
    public final void rule__InitialState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2077:1: ( ( ( rule__InitialState__ReferencedStateAssignment_3 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2078:1: ( ( rule__InitialState__ReferencedStateAssignment_3 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2078:1: ( ( rule__InitialState__ReferencedStateAssignment_3 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2079:1: ( rule__InitialState__ReferencedStateAssignment_3 )
            {
             before(grammarAccess.getInitialStateAccess().getReferencedStateAssignment_3()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2080:1: ( rule__InitialState__ReferencedStateAssignment_3 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2080:2: rule__InitialState__ReferencedStateAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InitialState__ReferencedStateAssignment_3_in_rule__InitialState__Group__3__Impl4245);
            rule__InitialState__ReferencedStateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInitialStateAccess().getReferencedStateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__3__Impl"


    // $ANTLR start "rule__InitialState__Group__4"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2090:1: rule__InitialState__Group__4 : rule__InitialState__Group__4__Impl ;
    public final void rule__InitialState__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2094:1: ( rule__InitialState__Group__4__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2095:2: rule__InitialState__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InitialState__Group__4__Impl_in_rule__InitialState__Group__44275);
            rule__InitialState__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__4"


    // $ANTLR start "rule__InitialState__Group__4__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2101:1: rule__InitialState__Group__4__Impl : ( '}' ) ;
    public final void rule__InitialState__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2105:1: ( ( '}' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2106:1: ( '}' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2106:1: ( '}' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2107:1: '}'
            {
             before(grammarAccess.getInitialStateAccess().getRightCurlyBracketKeyword_4()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__InitialState__Group__4__Impl4303); 
             after(grammarAccess.getInitialStateAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__4__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2132:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2136:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2137:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__04346);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__1_in_rule__Event__Group__04349);
            rule__Event__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2144:1: rule__Event__Group__0__Impl : ( () ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2148:1: ( ( () ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2149:1: ( () )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2149:1: ( () )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2150:1: ()
            {
             before(grammarAccess.getEventAccess().getEventAction_0()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2151:1: ()
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2153:1: 
            {
            }

             after(grammarAccess.getEventAccess().getEventAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2163:1: rule__Event__Group__1 : rule__Event__Group__1__Impl ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2167:1: ( rule__Event__Group__1__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2168:2: rule__Event__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__14407);
            rule__Event__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2174:1: rule__Event__Group__1__Impl : ( ( rule__Event__NameAssignment_1 ) ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2178:1: ( ( ( rule__Event__NameAssignment_1 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2179:1: ( ( rule__Event__NameAssignment_1 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2179:1: ( ( rule__Event__NameAssignment_1 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2180:1: ( rule__Event__NameAssignment_1 )
            {
             before(grammarAccess.getEventAccess().getNameAssignment_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2181:1: ( rule__Event__NameAssignment_1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2181:2: rule__Event__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__NameAssignment_1_in_rule__Event__Group__1__Impl4434);
            rule__Event__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2195:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2199:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2200:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__04468);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__04471);
            rule__Assignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2207:1: rule__Assignment__Group__0__Impl : ( 'Assignment' ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2211:1: ( ( 'Assignment' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2212:1: ( 'Assignment' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2212:1: ( 'Assignment' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2213:1: 'Assignment'
            {
             before(grammarAccess.getAssignmentAccess().getAssignmentKeyword_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Assignment__Group__0__Impl4499); 
             after(grammarAccess.getAssignmentAccess().getAssignmentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2226:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2230:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2231:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__14530);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__14533);
            rule__Assignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2238:1: rule__Assignment__Group__1__Impl : ( '{' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2242:1: ( ( '{' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2243:1: ( '{' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2243:1: ( '{' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2244:1: '{'
            {
             before(grammarAccess.getAssignmentAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Assignment__Group__1__Impl4561); 
             after(grammarAccess.getAssignmentAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2257:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl rule__Assignment__Group__3 ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2261:1: ( rule__Assignment__Group__2__Impl rule__Assignment__Group__3 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2262:2: rule__Assignment__Group__2__Impl rule__Assignment__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__24592);
            rule__Assignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__3_in_rule__Assignment__Group__24595);
            rule__Assignment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2269:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__Group_2__0 )? ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2273:1: ( ( ( rule__Assignment__Group_2__0 )? ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2274:1: ( ( rule__Assignment__Group_2__0 )? )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2274:1: ( ( rule__Assignment__Group_2__0 )? )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2275:1: ( rule__Assignment__Group_2__0 )?
            {
             before(grammarAccess.getAssignmentAccess().getGroup_2()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2276:1: ( rule__Assignment__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==41) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2276:2: rule__Assignment__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group_2__0_in_rule__Assignment__Group__2__Impl4622);
                    rule__Assignment__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssignmentAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__Assignment__Group__3"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2286:1: rule__Assignment__Group__3 : rule__Assignment__Group__3__Impl rule__Assignment__Group__4 ;
    public final void rule__Assignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2290:1: ( rule__Assignment__Group__3__Impl rule__Assignment__Group__4 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2291:2: rule__Assignment__Group__3__Impl rule__Assignment__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__3__Impl_in_rule__Assignment__Group__34653);
            rule__Assignment__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__4_in_rule__Assignment__Group__34656);
            rule__Assignment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__3"


    // $ANTLR start "rule__Assignment__Group__3__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2298:1: rule__Assignment__Group__3__Impl : ( 'variable' ) ;
    public final void rule__Assignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2302:1: ( ( 'variable' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2303:1: ( 'variable' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2303:1: ( 'variable' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2304:1: 'variable'
            {
             before(grammarAccess.getAssignmentAccess().getVariableKeyword_3()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Assignment__Group__3__Impl4684); 
             after(grammarAccess.getAssignmentAccess().getVariableKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__3__Impl"


    // $ANTLR start "rule__Assignment__Group__4"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2317:1: rule__Assignment__Group__4 : rule__Assignment__Group__4__Impl rule__Assignment__Group__5 ;
    public final void rule__Assignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2321:1: ( rule__Assignment__Group__4__Impl rule__Assignment__Group__5 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2322:2: rule__Assignment__Group__4__Impl rule__Assignment__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__4__Impl_in_rule__Assignment__Group__44715);
            rule__Assignment__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__5_in_rule__Assignment__Group__44718);
            rule__Assignment__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__4"


    // $ANTLR start "rule__Assignment__Group__4__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2329:1: rule__Assignment__Group__4__Impl : ( ( rule__Assignment__VariableAssignment_4 ) ) ;
    public final void rule__Assignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2333:1: ( ( ( rule__Assignment__VariableAssignment_4 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2334:1: ( ( rule__Assignment__VariableAssignment_4 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2334:1: ( ( rule__Assignment__VariableAssignment_4 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2335:1: ( rule__Assignment__VariableAssignment_4 )
            {
             before(grammarAccess.getAssignmentAccess().getVariableAssignment_4()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2336:1: ( rule__Assignment__VariableAssignment_4 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2336:2: rule__Assignment__VariableAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__VariableAssignment_4_in_rule__Assignment__Group__4__Impl4745);
            rule__Assignment__VariableAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getVariableAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__4__Impl"


    // $ANTLR start "rule__Assignment__Group__5"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2346:1: rule__Assignment__Group__5 : rule__Assignment__Group__5__Impl rule__Assignment__Group__6 ;
    public final void rule__Assignment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2350:1: ( rule__Assignment__Group__5__Impl rule__Assignment__Group__6 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2351:2: rule__Assignment__Group__5__Impl rule__Assignment__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__5__Impl_in_rule__Assignment__Group__54775);
            rule__Assignment__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__6_in_rule__Assignment__Group__54778);
            rule__Assignment__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__5"


    // $ANTLR start "rule__Assignment__Group__5__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2358:1: rule__Assignment__Group__5__Impl : ( 'expression' ) ;
    public final void rule__Assignment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2362:1: ( ( 'expression' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2363:1: ( 'expression' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2363:1: ( 'expression' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2364:1: 'expression'
            {
             before(grammarAccess.getAssignmentAccess().getExpressionKeyword_5()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Assignment__Group__5__Impl4806); 
             after(grammarAccess.getAssignmentAccess().getExpressionKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__5__Impl"


    // $ANTLR start "rule__Assignment__Group__6"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2377:1: rule__Assignment__Group__6 : rule__Assignment__Group__6__Impl rule__Assignment__Group__7 ;
    public final void rule__Assignment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2381:1: ( rule__Assignment__Group__6__Impl rule__Assignment__Group__7 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2382:2: rule__Assignment__Group__6__Impl rule__Assignment__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__6__Impl_in_rule__Assignment__Group__64837);
            rule__Assignment__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__7_in_rule__Assignment__Group__64840);
            rule__Assignment__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__6"


    // $ANTLR start "rule__Assignment__Group__6__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2389:1: rule__Assignment__Group__6__Impl : ( ( rule__Assignment__ExpressionAssignment_6 ) ) ;
    public final void rule__Assignment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2393:1: ( ( ( rule__Assignment__ExpressionAssignment_6 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2394:1: ( ( rule__Assignment__ExpressionAssignment_6 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2394:1: ( ( rule__Assignment__ExpressionAssignment_6 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2395:1: ( rule__Assignment__ExpressionAssignment_6 )
            {
             before(grammarAccess.getAssignmentAccess().getExpressionAssignment_6()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2396:1: ( rule__Assignment__ExpressionAssignment_6 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2396:2: rule__Assignment__ExpressionAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__ExpressionAssignment_6_in_rule__Assignment__Group__6__Impl4867);
            rule__Assignment__ExpressionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getExpressionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__6__Impl"


    // $ANTLR start "rule__Assignment__Group__7"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2406:1: rule__Assignment__Group__7 : rule__Assignment__Group__7__Impl ;
    public final void rule__Assignment__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2410:1: ( rule__Assignment__Group__7__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2411:2: rule__Assignment__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__7__Impl_in_rule__Assignment__Group__74897);
            rule__Assignment__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__7"


    // $ANTLR start "rule__Assignment__Group__7__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2417:1: rule__Assignment__Group__7__Impl : ( '}' ) ;
    public final void rule__Assignment__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2421:1: ( ( '}' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2422:1: ( '}' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2422:1: ( '}' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2423:1: '}'
            {
             before(grammarAccess.getAssignmentAccess().getRightCurlyBracketKeyword_7()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Assignment__Group__7__Impl4925); 
             after(grammarAccess.getAssignmentAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__7__Impl"


    // $ANTLR start "rule__Assignment__Group_2__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2452:1: rule__Assignment__Group_2__0 : rule__Assignment__Group_2__0__Impl rule__Assignment__Group_2__1 ;
    public final void rule__Assignment__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2456:1: ( rule__Assignment__Group_2__0__Impl rule__Assignment__Group_2__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2457:2: rule__Assignment__Group_2__0__Impl rule__Assignment__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group_2__0__Impl_in_rule__Assignment__Group_2__04972);
            rule__Assignment__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group_2__1_in_rule__Assignment__Group_2__04975);
            rule__Assignment__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_2__0"


    // $ANTLR start "rule__Assignment__Group_2__0__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2464:1: rule__Assignment__Group_2__0__Impl : ( '_name' ) ;
    public final void rule__Assignment__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2468:1: ( ( '_name' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2469:1: ( '_name' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2469:1: ( '_name' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2470:1: '_name'
            {
             before(grammarAccess.getAssignmentAccess().get_nameKeyword_2_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Assignment__Group_2__0__Impl5003); 
             after(grammarAccess.getAssignmentAccess().get_nameKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_2__0__Impl"


    // $ANTLR start "rule__Assignment__Group_2__1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2483:1: rule__Assignment__Group_2__1 : rule__Assignment__Group_2__1__Impl ;
    public final void rule__Assignment__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2487:1: ( rule__Assignment__Group_2__1__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2488:2: rule__Assignment__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group_2__1__Impl_in_rule__Assignment__Group_2__15034);
            rule__Assignment__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_2__1"


    // $ANTLR start "rule__Assignment__Group_2__1__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2494:1: rule__Assignment__Group_2__1__Impl : ( ( rule__Assignment___nameAssignment_2_1 ) ) ;
    public final void rule__Assignment__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2498:1: ( ( ( rule__Assignment___nameAssignment_2_1 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2499:1: ( ( rule__Assignment___nameAssignment_2_1 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2499:1: ( ( rule__Assignment___nameAssignment_2_1 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2500:1: ( rule__Assignment___nameAssignment_2_1 )
            {
             before(grammarAccess.getAssignmentAccess().get_nameAssignment_2_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2501:1: ( rule__Assignment___nameAssignment_2_1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2501:2: rule__Assignment___nameAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment___nameAssignment_2_1_in_rule__Assignment__Group_2__1__Impl5061);
            rule__Assignment___nameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().get_nameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_2__1__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2515:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2519:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2520:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__05095);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__05098);
            rule__Expression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2527:1: rule__Expression__Group__0__Impl : ( 'Expression' ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2531:1: ( ( 'Expression' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2532:1: ( 'Expression' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2532:1: ( 'Expression' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2533:1: 'Expression'
            {
             before(grammarAccess.getExpressionAccess().getExpressionKeyword_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Expression__Group__0__Impl5126); 
             after(grammarAccess.getExpressionAccess().getExpressionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2546:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl rule__Expression__Group__2 ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2550:1: ( rule__Expression__Group__1__Impl rule__Expression__Group__2 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2551:2: rule__Expression__Group__1__Impl rule__Expression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__15157);
            rule__Expression__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__2_in_rule__Expression__Group__15160);
            rule__Expression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2558:1: rule__Expression__Group__1__Impl : ( '{' ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2562:1: ( ( '{' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2563:1: ( '{' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2563:1: ( '{' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2564:1: '{'
            {
             before(grammarAccess.getExpressionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Expression__Group__1__Impl5188); 
             after(grammarAccess.getExpressionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group__2"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2577:1: rule__Expression__Group__2 : rule__Expression__Group__2__Impl rule__Expression__Group__3 ;
    public final void rule__Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2581:1: ( rule__Expression__Group__2__Impl rule__Expression__Group__3 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2582:2: rule__Expression__Group__2__Impl rule__Expression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__2__Impl_in_rule__Expression__Group__25219);
            rule__Expression__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__3_in_rule__Expression__Group__25222);
            rule__Expression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__2"


    // $ANTLR start "rule__Expression__Group__2__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2589:1: rule__Expression__Group__2__Impl : ( 'operator' ) ;
    public final void rule__Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2593:1: ( ( 'operator' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2594:1: ( 'operator' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2594:1: ( 'operator' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2595:1: 'operator'
            {
             before(grammarAccess.getExpressionAccess().getOperatorKeyword_2()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Expression__Group__2__Impl5250); 
             after(grammarAccess.getExpressionAccess().getOperatorKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__2__Impl"


    // $ANTLR start "rule__Expression__Group__3"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2608:1: rule__Expression__Group__3 : rule__Expression__Group__3__Impl rule__Expression__Group__4 ;
    public final void rule__Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2612:1: ( rule__Expression__Group__3__Impl rule__Expression__Group__4 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2613:2: rule__Expression__Group__3__Impl rule__Expression__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__3__Impl_in_rule__Expression__Group__35281);
            rule__Expression__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__4_in_rule__Expression__Group__35284);
            rule__Expression__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__3"


    // $ANTLR start "rule__Expression__Group__3__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2620:1: rule__Expression__Group__3__Impl : ( ( rule__Expression__OperatorAssignment_3 ) ) ;
    public final void rule__Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2624:1: ( ( ( rule__Expression__OperatorAssignment_3 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2625:1: ( ( rule__Expression__OperatorAssignment_3 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2625:1: ( ( rule__Expression__OperatorAssignment_3 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2626:1: ( rule__Expression__OperatorAssignment_3 )
            {
             before(grammarAccess.getExpressionAccess().getOperatorAssignment_3()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2627:1: ( rule__Expression__OperatorAssignment_3 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2627:2: rule__Expression__OperatorAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__OperatorAssignment_3_in_rule__Expression__Group__3__Impl5311);
            rule__Expression__OperatorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getOperatorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__3__Impl"


    // $ANTLR start "rule__Expression__Group__4"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2637:1: rule__Expression__Group__4 : rule__Expression__Group__4__Impl rule__Expression__Group__5 ;
    public final void rule__Expression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2641:1: ( rule__Expression__Group__4__Impl rule__Expression__Group__5 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2642:2: rule__Expression__Group__4__Impl rule__Expression__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__4__Impl_in_rule__Expression__Group__45341);
            rule__Expression__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__5_in_rule__Expression__Group__45344);
            rule__Expression__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__4"


    // $ANTLR start "rule__Expression__Group__4__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2649:1: rule__Expression__Group__4__Impl : ( ( rule__Expression__Group_4__0 )? ) ;
    public final void rule__Expression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2653:1: ( ( ( rule__Expression__Group_4__0 )? ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2654:1: ( ( rule__Expression__Group_4__0 )? )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2654:1: ( ( rule__Expression__Group_4__0 )? )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2655:1: ( rule__Expression__Group_4__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_4()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2656:1: ( rule__Expression__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2656:2: rule__Expression__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Expression__Group_4__0_in_rule__Expression__Group__4__Impl5371);
                    rule__Expression__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__4__Impl"


    // $ANTLR start "rule__Expression__Group__5"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2666:1: rule__Expression__Group__5 : rule__Expression__Group__5__Impl rule__Expression__Group__6 ;
    public final void rule__Expression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2670:1: ( rule__Expression__Group__5__Impl rule__Expression__Group__6 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2671:2: rule__Expression__Group__5__Impl rule__Expression__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__5__Impl_in_rule__Expression__Group__55402);
            rule__Expression__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__6_in_rule__Expression__Group__55405);
            rule__Expression__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__5"


    // $ANTLR start "rule__Expression__Group__5__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2678:1: rule__Expression__Group__5__Impl : ( 'left' ) ;
    public final void rule__Expression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2682:1: ( ( 'left' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2683:1: ( 'left' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2683:1: ( 'left' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2684:1: 'left'
            {
             before(grammarAccess.getExpressionAccess().getLeftKeyword_5()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Expression__Group__5__Impl5433); 
             after(grammarAccess.getExpressionAccess().getLeftKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__5__Impl"


    // $ANTLR start "rule__Expression__Group__6"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2697:1: rule__Expression__Group__6 : rule__Expression__Group__6__Impl rule__Expression__Group__7 ;
    public final void rule__Expression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2701:1: ( rule__Expression__Group__6__Impl rule__Expression__Group__7 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2702:2: rule__Expression__Group__6__Impl rule__Expression__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__6__Impl_in_rule__Expression__Group__65464);
            rule__Expression__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__7_in_rule__Expression__Group__65467);
            rule__Expression__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__6"


    // $ANTLR start "rule__Expression__Group__6__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2709:1: rule__Expression__Group__6__Impl : ( ( rule__Expression__LeftAssignment_6 ) ) ;
    public final void rule__Expression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2713:1: ( ( ( rule__Expression__LeftAssignment_6 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2714:1: ( ( rule__Expression__LeftAssignment_6 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2714:1: ( ( rule__Expression__LeftAssignment_6 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2715:1: ( rule__Expression__LeftAssignment_6 )
            {
             before(grammarAccess.getExpressionAccess().getLeftAssignment_6()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2716:1: ( rule__Expression__LeftAssignment_6 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2716:2: rule__Expression__LeftAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__LeftAssignment_6_in_rule__Expression__Group__6__Impl5494);
            rule__Expression__LeftAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getLeftAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__6__Impl"


    // $ANTLR start "rule__Expression__Group__7"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2726:1: rule__Expression__Group__7 : rule__Expression__Group__7__Impl rule__Expression__Group__8 ;
    public final void rule__Expression__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2730:1: ( rule__Expression__Group__7__Impl rule__Expression__Group__8 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2731:2: rule__Expression__Group__7__Impl rule__Expression__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__7__Impl_in_rule__Expression__Group__75524);
            rule__Expression__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__8_in_rule__Expression__Group__75527);
            rule__Expression__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__7"


    // $ANTLR start "rule__Expression__Group__7__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2738:1: rule__Expression__Group__7__Impl : ( 'right' ) ;
    public final void rule__Expression__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2742:1: ( ( 'right' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2743:1: ( 'right' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2743:1: ( 'right' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2744:1: 'right'
            {
             before(grammarAccess.getExpressionAccess().getRightKeyword_7()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Expression__Group__7__Impl5555); 
             after(grammarAccess.getExpressionAccess().getRightKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__7__Impl"


    // $ANTLR start "rule__Expression__Group__8"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2757:1: rule__Expression__Group__8 : rule__Expression__Group__8__Impl rule__Expression__Group__9 ;
    public final void rule__Expression__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2761:1: ( rule__Expression__Group__8__Impl rule__Expression__Group__9 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2762:2: rule__Expression__Group__8__Impl rule__Expression__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__8__Impl_in_rule__Expression__Group__85586);
            rule__Expression__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__9_in_rule__Expression__Group__85589);
            rule__Expression__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__8"


    // $ANTLR start "rule__Expression__Group__8__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2769:1: rule__Expression__Group__8__Impl : ( ( rule__Expression__RightAssignment_8 ) ) ;
    public final void rule__Expression__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2773:1: ( ( ( rule__Expression__RightAssignment_8 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2774:1: ( ( rule__Expression__RightAssignment_8 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2774:1: ( ( rule__Expression__RightAssignment_8 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2775:1: ( rule__Expression__RightAssignment_8 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_8()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2776:1: ( rule__Expression__RightAssignment_8 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2776:2: rule__Expression__RightAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__RightAssignment_8_in_rule__Expression__Group__8__Impl5616);
            rule__Expression__RightAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getRightAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__8__Impl"


    // $ANTLR start "rule__Expression__Group__9"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2786:1: rule__Expression__Group__9 : rule__Expression__Group__9__Impl ;
    public final void rule__Expression__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2790:1: ( rule__Expression__Group__9__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2791:2: rule__Expression__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__9__Impl_in_rule__Expression__Group__95646);
            rule__Expression__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__9"


    // $ANTLR start "rule__Expression__Group__9__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2797:1: rule__Expression__Group__9__Impl : ( '}' ) ;
    public final void rule__Expression__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2801:1: ( ( '}' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2802:1: ( '}' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2802:1: ( '}' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2803:1: '}'
            {
             before(grammarAccess.getExpressionAccess().getRightCurlyBracketKeyword_9()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Expression__Group__9__Impl5674); 
             after(grammarAccess.getExpressionAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__9__Impl"


    // $ANTLR start "rule__Expression__Group_4__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2836:1: rule__Expression__Group_4__0 : rule__Expression__Group_4__0__Impl rule__Expression__Group_4__1 ;
    public final void rule__Expression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2840:1: ( rule__Expression__Group_4__0__Impl rule__Expression__Group_4__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2841:2: rule__Expression__Group_4__0__Impl rule__Expression__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group_4__0__Impl_in_rule__Expression__Group_4__05725);
            rule__Expression__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group_4__1_in_rule__Expression__Group_4__05728);
            rule__Expression__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_4__0"


    // $ANTLR start "rule__Expression__Group_4__0__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2848:1: rule__Expression__Group_4__0__Impl : ( '_name' ) ;
    public final void rule__Expression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2852:1: ( ( '_name' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2853:1: ( '_name' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2853:1: ( '_name' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2854:1: '_name'
            {
             before(grammarAccess.getExpressionAccess().get_nameKeyword_4_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Expression__Group_4__0__Impl5756); 
             after(grammarAccess.getExpressionAccess().get_nameKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_4__0__Impl"


    // $ANTLR start "rule__Expression__Group_4__1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2867:1: rule__Expression__Group_4__1 : rule__Expression__Group_4__1__Impl ;
    public final void rule__Expression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2871:1: ( rule__Expression__Group_4__1__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2872:2: rule__Expression__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group_4__1__Impl_in_rule__Expression__Group_4__15787);
            rule__Expression__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_4__1"


    // $ANTLR start "rule__Expression__Group_4__1__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2878:1: rule__Expression__Group_4__1__Impl : ( ( rule__Expression___nameAssignment_4_1 ) ) ;
    public final void rule__Expression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2882:1: ( ( ( rule__Expression___nameAssignment_4_1 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2883:1: ( ( rule__Expression___nameAssignment_4_1 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2883:1: ( ( rule__Expression___nameAssignment_4_1 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2884:1: ( rule__Expression___nameAssignment_4_1 )
            {
             before(grammarAccess.getExpressionAccess().get_nameAssignment_4_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2885:1: ( rule__Expression___nameAssignment_4_1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2885:2: rule__Expression___nameAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression___nameAssignment_4_1_in_rule__Expression__Group_4__1__Impl5814);
            rule__Expression___nameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().get_nameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_4__1__Impl"


    // $ANTLR start "rule__VariableReference__Group__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2899:1: rule__VariableReference__Group__0 : rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1 ;
    public final void rule__VariableReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2903:1: ( rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2904:2: rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group__0__Impl_in_rule__VariableReference__Group__05848);
            rule__VariableReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group__1_in_rule__VariableReference__Group__05851);
            rule__VariableReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__Group__0"


    // $ANTLR start "rule__VariableReference__Group__0__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2911:1: rule__VariableReference__Group__0__Impl : ( 'VariableReference' ) ;
    public final void rule__VariableReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2915:1: ( ( 'VariableReference' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2916:1: ( 'VariableReference' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2916:1: ( 'VariableReference' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2917:1: 'VariableReference'
            {
             before(grammarAccess.getVariableReferenceAccess().getVariableReferenceKeyword_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__VariableReference__Group__0__Impl5879); 
             after(grammarAccess.getVariableReferenceAccess().getVariableReferenceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__Group__0__Impl"


    // $ANTLR start "rule__VariableReference__Group__1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2930:1: rule__VariableReference__Group__1 : rule__VariableReference__Group__1__Impl rule__VariableReference__Group__2 ;
    public final void rule__VariableReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2934:1: ( rule__VariableReference__Group__1__Impl rule__VariableReference__Group__2 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2935:2: rule__VariableReference__Group__1__Impl rule__VariableReference__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group__1__Impl_in_rule__VariableReference__Group__15910);
            rule__VariableReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group__2_in_rule__VariableReference__Group__15913);
            rule__VariableReference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__Group__1"


    // $ANTLR start "rule__VariableReference__Group__1__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2942:1: rule__VariableReference__Group__1__Impl : ( '{' ) ;
    public final void rule__VariableReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2946:1: ( ( '{' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2947:1: ( '{' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2947:1: ( '{' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2948:1: '{'
            {
             before(grammarAccess.getVariableReferenceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__VariableReference__Group__1__Impl5941); 
             after(grammarAccess.getVariableReferenceAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__Group__1__Impl"


    // $ANTLR start "rule__VariableReference__Group__2"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2961:1: rule__VariableReference__Group__2 : rule__VariableReference__Group__2__Impl rule__VariableReference__Group__3 ;
    public final void rule__VariableReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2965:1: ( rule__VariableReference__Group__2__Impl rule__VariableReference__Group__3 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2966:2: rule__VariableReference__Group__2__Impl rule__VariableReference__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group__2__Impl_in_rule__VariableReference__Group__25972);
            rule__VariableReference__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group__3_in_rule__VariableReference__Group__25975);
            rule__VariableReference__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__Group__2"


    // $ANTLR start "rule__VariableReference__Group__2__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2973:1: rule__VariableReference__Group__2__Impl : ( ( rule__VariableReference__Group_2__0 )? ) ;
    public final void rule__VariableReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2977:1: ( ( ( rule__VariableReference__Group_2__0 )? ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2978:1: ( ( rule__VariableReference__Group_2__0 )? )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2978:1: ( ( rule__VariableReference__Group_2__0 )? )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2979:1: ( rule__VariableReference__Group_2__0 )?
            {
             before(grammarAccess.getVariableReferenceAccess().getGroup_2()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2980:1: ( rule__VariableReference__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==41) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2980:2: rule__VariableReference__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group_2__0_in_rule__VariableReference__Group__2__Impl6002);
                    rule__VariableReference__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableReferenceAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__Group__2__Impl"


    // $ANTLR start "rule__VariableReference__Group__3"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2990:1: rule__VariableReference__Group__3 : rule__VariableReference__Group__3__Impl rule__VariableReference__Group__4 ;
    public final void rule__VariableReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2994:1: ( rule__VariableReference__Group__3__Impl rule__VariableReference__Group__4 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2995:2: rule__VariableReference__Group__3__Impl rule__VariableReference__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group__3__Impl_in_rule__VariableReference__Group__36033);
            rule__VariableReference__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group__4_in_rule__VariableReference__Group__36036);
            rule__VariableReference__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__Group__3"


    // $ANTLR start "rule__VariableReference__Group__3__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3002:1: rule__VariableReference__Group__3__Impl : ( 'variable' ) ;
    public final void rule__VariableReference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3006:1: ( ( 'variable' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3007:1: ( 'variable' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3007:1: ( 'variable' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3008:1: 'variable'
            {
             before(grammarAccess.getVariableReferenceAccess().getVariableKeyword_3()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__VariableReference__Group__3__Impl6064); 
             after(grammarAccess.getVariableReferenceAccess().getVariableKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__Group__3__Impl"


    // $ANTLR start "rule__VariableReference__Group__4"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3021:1: rule__VariableReference__Group__4 : rule__VariableReference__Group__4__Impl rule__VariableReference__Group__5 ;
    public final void rule__VariableReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3025:1: ( rule__VariableReference__Group__4__Impl rule__VariableReference__Group__5 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3026:2: rule__VariableReference__Group__4__Impl rule__VariableReference__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group__4__Impl_in_rule__VariableReference__Group__46095);
            rule__VariableReference__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group__5_in_rule__VariableReference__Group__46098);
            rule__VariableReference__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__Group__4"


    // $ANTLR start "rule__VariableReference__Group__4__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3033:1: rule__VariableReference__Group__4__Impl : ( ( rule__VariableReference__VariableAssignment_4 ) ) ;
    public final void rule__VariableReference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3037:1: ( ( ( rule__VariableReference__VariableAssignment_4 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3038:1: ( ( rule__VariableReference__VariableAssignment_4 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3038:1: ( ( rule__VariableReference__VariableAssignment_4 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3039:1: ( rule__VariableReference__VariableAssignment_4 )
            {
             before(grammarAccess.getVariableReferenceAccess().getVariableAssignment_4()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3040:1: ( rule__VariableReference__VariableAssignment_4 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3040:2: rule__VariableReference__VariableAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__VariableAssignment_4_in_rule__VariableReference__Group__4__Impl6125);
            rule__VariableReference__VariableAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVariableReferenceAccess().getVariableAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__Group__4__Impl"


    // $ANTLR start "rule__VariableReference__Group__5"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3050:1: rule__VariableReference__Group__5 : rule__VariableReference__Group__5__Impl ;
    public final void rule__VariableReference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3054:1: ( rule__VariableReference__Group__5__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3055:2: rule__VariableReference__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group__5__Impl_in_rule__VariableReference__Group__56155);
            rule__VariableReference__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__Group__5"


    // $ANTLR start "rule__VariableReference__Group__5__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3061:1: rule__VariableReference__Group__5__Impl : ( '}' ) ;
    public final void rule__VariableReference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3065:1: ( ( '}' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3066:1: ( '}' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3066:1: ( '}' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3067:1: '}'
            {
             before(grammarAccess.getVariableReferenceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__VariableReference__Group__5__Impl6183); 
             after(grammarAccess.getVariableReferenceAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__Group__5__Impl"


    // $ANTLR start "rule__VariableReference__Group_2__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3092:1: rule__VariableReference__Group_2__0 : rule__VariableReference__Group_2__0__Impl rule__VariableReference__Group_2__1 ;
    public final void rule__VariableReference__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3096:1: ( rule__VariableReference__Group_2__0__Impl rule__VariableReference__Group_2__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3097:2: rule__VariableReference__Group_2__0__Impl rule__VariableReference__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group_2__0__Impl_in_rule__VariableReference__Group_2__06226);
            rule__VariableReference__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group_2__1_in_rule__VariableReference__Group_2__06229);
            rule__VariableReference__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__Group_2__0"


    // $ANTLR start "rule__VariableReference__Group_2__0__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3104:1: rule__VariableReference__Group_2__0__Impl : ( '_name' ) ;
    public final void rule__VariableReference__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3108:1: ( ( '_name' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3109:1: ( '_name' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3109:1: ( '_name' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3110:1: '_name'
            {
             before(grammarAccess.getVariableReferenceAccess().get_nameKeyword_2_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__VariableReference__Group_2__0__Impl6257); 
             after(grammarAccess.getVariableReferenceAccess().get_nameKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__Group_2__0__Impl"


    // $ANTLR start "rule__VariableReference__Group_2__1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3123:1: rule__VariableReference__Group_2__1 : rule__VariableReference__Group_2__1__Impl ;
    public final void rule__VariableReference__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3127:1: ( rule__VariableReference__Group_2__1__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3128:2: rule__VariableReference__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group_2__1__Impl_in_rule__VariableReference__Group_2__16288);
            rule__VariableReference__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__Group_2__1"


    // $ANTLR start "rule__VariableReference__Group_2__1__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3134:1: rule__VariableReference__Group_2__1__Impl : ( ( rule__VariableReference___nameAssignment_2_1 ) ) ;
    public final void rule__VariableReference__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3138:1: ( ( ( rule__VariableReference___nameAssignment_2_1 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3139:1: ( ( rule__VariableReference___nameAssignment_2_1 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3139:1: ( ( rule__VariableReference___nameAssignment_2_1 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3140:1: ( rule__VariableReference___nameAssignment_2_1 )
            {
             before(grammarAccess.getVariableReferenceAccess().get_nameAssignment_2_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3141:1: ( rule__VariableReference___nameAssignment_2_1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3141:2: rule__VariableReference___nameAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference___nameAssignment_2_1_in_rule__VariableReference__Group_2__1__Impl6315);
            rule__VariableReference___nameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableReferenceAccess().get_nameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__Group_2__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3155:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3159:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3160:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__06349);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__06352);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3167:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3171:1: ( ( ( '-' )? ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3172:1: ( ( '-' )? )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3172:1: ( ( '-' )? )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3173:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3174:1: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==47) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3175:2: '-'
                    {
                    match(input,47,FollowSets000.FOLLOW_47_in_rule__EInt__Group__0__Impl6381); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3186:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3190:1: ( rule__EInt__Group__1__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3191:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__16414);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3197:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3201:1: ( ( RULE_INT ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3202:1: ( RULE_INT )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3202:1: ( RULE_INT )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3203:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl6441); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__CompositeState_Impl__Group__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3218:1: rule__CompositeState_Impl__Group__0 : rule__CompositeState_Impl__Group__0__Impl rule__CompositeState_Impl__Group__1 ;
    public final void rule__CompositeState_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3222:1: ( rule__CompositeState_Impl__Group__0__Impl rule__CompositeState_Impl__Group__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3223:2: rule__CompositeState_Impl__Group__0__Impl rule__CompositeState_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__0__Impl_in_rule__CompositeState_Impl__Group__06474);
            rule__CompositeState_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__1_in_rule__CompositeState_Impl__Group__06477);
            rule__CompositeState_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group__0"


    // $ANTLR start "rule__CompositeState_Impl__Group__0__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3230:1: rule__CompositeState_Impl__Group__0__Impl : ( ( rule__CompositeState_Impl__IsActiveAssignment_0 ) ) ;
    public final void rule__CompositeState_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3234:1: ( ( ( rule__CompositeState_Impl__IsActiveAssignment_0 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3235:1: ( ( rule__CompositeState_Impl__IsActiveAssignment_0 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3235:1: ( ( rule__CompositeState_Impl__IsActiveAssignment_0 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3236:1: ( rule__CompositeState_Impl__IsActiveAssignment_0 )
            {
             before(grammarAccess.getCompositeState_ImplAccess().getIsActiveAssignment_0()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3237:1: ( rule__CompositeState_Impl__IsActiveAssignment_0 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3237:2: rule__CompositeState_Impl__IsActiveAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__IsActiveAssignment_0_in_rule__CompositeState_Impl__Group__0__Impl6504);
            rule__CompositeState_Impl__IsActiveAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeState_ImplAccess().getIsActiveAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group__0__Impl"


    // $ANTLR start "rule__CompositeState_Impl__Group__1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3247:1: rule__CompositeState_Impl__Group__1 : rule__CompositeState_Impl__Group__1__Impl rule__CompositeState_Impl__Group__2 ;
    public final void rule__CompositeState_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3251:1: ( rule__CompositeState_Impl__Group__1__Impl rule__CompositeState_Impl__Group__2 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3252:2: rule__CompositeState_Impl__Group__1__Impl rule__CompositeState_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__1__Impl_in_rule__CompositeState_Impl__Group__16534);
            rule__CompositeState_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__2_in_rule__CompositeState_Impl__Group__16537);
            rule__CompositeState_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group__1"


    // $ANTLR start "rule__CompositeState_Impl__Group__1__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3259:1: rule__CompositeState_Impl__Group__1__Impl : ( 'CompositeState' ) ;
    public final void rule__CompositeState_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3263:1: ( ( 'CompositeState' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3264:1: ( 'CompositeState' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3264:1: ( 'CompositeState' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3265:1: 'CompositeState'
            {
             before(grammarAccess.getCompositeState_ImplAccess().getCompositeStateKeyword_1()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__CompositeState_Impl__Group__1__Impl6565); 
             after(grammarAccess.getCompositeState_ImplAccess().getCompositeStateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group__1__Impl"


    // $ANTLR start "rule__CompositeState_Impl__Group__2"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3278:1: rule__CompositeState_Impl__Group__2 : rule__CompositeState_Impl__Group__2__Impl rule__CompositeState_Impl__Group__3 ;
    public final void rule__CompositeState_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3282:1: ( rule__CompositeState_Impl__Group__2__Impl rule__CompositeState_Impl__Group__3 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3283:2: rule__CompositeState_Impl__Group__2__Impl rule__CompositeState_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__2__Impl_in_rule__CompositeState_Impl__Group__26596);
            rule__CompositeState_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__3_in_rule__CompositeState_Impl__Group__26599);
            rule__CompositeState_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group__2"


    // $ANTLR start "rule__CompositeState_Impl__Group__2__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3290:1: rule__CompositeState_Impl__Group__2__Impl : ( ( rule__CompositeState_Impl__NameAssignment_2 ) ) ;
    public final void rule__CompositeState_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3294:1: ( ( ( rule__CompositeState_Impl__NameAssignment_2 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3295:1: ( ( rule__CompositeState_Impl__NameAssignment_2 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3295:1: ( ( rule__CompositeState_Impl__NameAssignment_2 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3296:1: ( rule__CompositeState_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getCompositeState_ImplAccess().getNameAssignment_2()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3297:1: ( rule__CompositeState_Impl__NameAssignment_2 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3297:2: rule__CompositeState_Impl__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__NameAssignment_2_in_rule__CompositeState_Impl__Group__2__Impl6626);
            rule__CompositeState_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeState_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group__2__Impl"


    // $ANTLR start "rule__CompositeState_Impl__Group__3"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3307:1: rule__CompositeState_Impl__Group__3 : rule__CompositeState_Impl__Group__3__Impl rule__CompositeState_Impl__Group__4 ;
    public final void rule__CompositeState_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3311:1: ( rule__CompositeState_Impl__Group__3__Impl rule__CompositeState_Impl__Group__4 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3312:2: rule__CompositeState_Impl__Group__3__Impl rule__CompositeState_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__3__Impl_in_rule__CompositeState_Impl__Group__36656);
            rule__CompositeState_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__4_in_rule__CompositeState_Impl__Group__36659);
            rule__CompositeState_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group__3"


    // $ANTLR start "rule__CompositeState_Impl__Group__3__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3319:1: rule__CompositeState_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__CompositeState_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3323:1: ( ( '{' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3324:1: ( '{' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3324:1: ( '{' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3325:1: '{'
            {
             before(grammarAccess.getCompositeState_ImplAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__CompositeState_Impl__Group__3__Impl6687); 
             after(grammarAccess.getCompositeState_ImplAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group__3__Impl"


    // $ANTLR start "rule__CompositeState_Impl__Group__4"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3338:1: rule__CompositeState_Impl__Group__4 : rule__CompositeState_Impl__Group__4__Impl rule__CompositeState_Impl__Group__5 ;
    public final void rule__CompositeState_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3342:1: ( rule__CompositeState_Impl__Group__4__Impl rule__CompositeState_Impl__Group__5 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3343:2: rule__CompositeState_Impl__Group__4__Impl rule__CompositeState_Impl__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__4__Impl_in_rule__CompositeState_Impl__Group__46718);
            rule__CompositeState_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__5_in_rule__CompositeState_Impl__Group__46721);
            rule__CompositeState_Impl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group__4"


    // $ANTLR start "rule__CompositeState_Impl__Group__4__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3350:1: rule__CompositeState_Impl__Group__4__Impl : ( ( rule__CompositeState_Impl__Group_4__0 )? ) ;
    public final void rule__CompositeState_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3354:1: ( ( ( rule__CompositeState_Impl__Group_4__0 )? ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3355:1: ( ( rule__CompositeState_Impl__Group_4__0 )? )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3355:1: ( ( rule__CompositeState_Impl__Group_4__0 )? )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3356:1: ( rule__CompositeState_Impl__Group_4__0 )?
            {
             before(grammarAccess.getCompositeState_ImplAccess().getGroup_4()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3357:1: ( rule__CompositeState_Impl__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3357:2: rule__CompositeState_Impl__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group_4__0_in_rule__CompositeState_Impl__Group__4__Impl6748);
                    rule__CompositeState_Impl__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeState_ImplAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group__4__Impl"


    // $ANTLR start "rule__CompositeState_Impl__Group__5"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3367:1: rule__CompositeState_Impl__Group__5 : rule__CompositeState_Impl__Group__5__Impl rule__CompositeState_Impl__Group__6 ;
    public final void rule__CompositeState_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3371:1: ( rule__CompositeState_Impl__Group__5__Impl rule__CompositeState_Impl__Group__6 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3372:2: rule__CompositeState_Impl__Group__5__Impl rule__CompositeState_Impl__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__5__Impl_in_rule__CompositeState_Impl__Group__56779);
            rule__CompositeState_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__6_in_rule__CompositeState_Impl__Group__56782);
            rule__CompositeState_Impl__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group__5"


    // $ANTLR start "rule__CompositeState_Impl__Group__5__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3379:1: rule__CompositeState_Impl__Group__5__Impl : ( 'states' ) ;
    public final void rule__CompositeState_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3383:1: ( ( 'states' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3384:1: ( 'states' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3384:1: ( 'states' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3385:1: 'states'
            {
             before(grammarAccess.getCompositeState_ImplAccess().getStatesKeyword_5()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__CompositeState_Impl__Group__5__Impl6810); 
             after(grammarAccess.getCompositeState_ImplAccess().getStatesKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group__5__Impl"


    // $ANTLR start "rule__CompositeState_Impl__Group__6"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3398:1: rule__CompositeState_Impl__Group__6 : rule__CompositeState_Impl__Group__6__Impl rule__CompositeState_Impl__Group__7 ;
    public final void rule__CompositeState_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3402:1: ( rule__CompositeState_Impl__Group__6__Impl rule__CompositeState_Impl__Group__7 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3403:2: rule__CompositeState_Impl__Group__6__Impl rule__CompositeState_Impl__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__6__Impl_in_rule__CompositeState_Impl__Group__66841);
            rule__CompositeState_Impl__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__7_in_rule__CompositeState_Impl__Group__66844);
            rule__CompositeState_Impl__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group__6"


    // $ANTLR start "rule__CompositeState_Impl__Group__6__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3410:1: rule__CompositeState_Impl__Group__6__Impl : ( '{' ) ;
    public final void rule__CompositeState_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3414:1: ( ( '{' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3415:1: ( '{' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3415:1: ( '{' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3416:1: '{'
            {
             before(grammarAccess.getCompositeState_ImplAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__CompositeState_Impl__Group__6__Impl6872); 
             after(grammarAccess.getCompositeState_ImplAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group__6__Impl"


    // $ANTLR start "rule__CompositeState_Impl__Group__7"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3429:1: rule__CompositeState_Impl__Group__7 : rule__CompositeState_Impl__Group__7__Impl rule__CompositeState_Impl__Group__8 ;
    public final void rule__CompositeState_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3433:1: ( rule__CompositeState_Impl__Group__7__Impl rule__CompositeState_Impl__Group__8 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3434:2: rule__CompositeState_Impl__Group__7__Impl rule__CompositeState_Impl__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__7__Impl_in_rule__CompositeState_Impl__Group__76903);
            rule__CompositeState_Impl__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__8_in_rule__CompositeState_Impl__Group__76906);
            rule__CompositeState_Impl__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group__7"


    // $ANTLR start "rule__CompositeState_Impl__Group__7__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3441:1: rule__CompositeState_Impl__Group__7__Impl : ( ( rule__CompositeState_Impl__StatesAssignment_7 ) ) ;
    public final void rule__CompositeState_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3445:1: ( ( ( rule__CompositeState_Impl__StatesAssignment_7 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3446:1: ( ( rule__CompositeState_Impl__StatesAssignment_7 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3446:1: ( ( rule__CompositeState_Impl__StatesAssignment_7 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3447:1: ( rule__CompositeState_Impl__StatesAssignment_7 )
            {
             before(grammarAccess.getCompositeState_ImplAccess().getStatesAssignment_7()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3448:1: ( rule__CompositeState_Impl__StatesAssignment_7 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3448:2: rule__CompositeState_Impl__StatesAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__StatesAssignment_7_in_rule__CompositeState_Impl__Group__7__Impl6933);
            rule__CompositeState_Impl__StatesAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getCompositeState_ImplAccess().getStatesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group__7__Impl"


    // $ANTLR start "rule__CompositeState_Impl__Group__8"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3458:1: rule__CompositeState_Impl__Group__8 : rule__CompositeState_Impl__Group__8__Impl rule__CompositeState_Impl__Group__9 ;
    public final void rule__CompositeState_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3462:1: ( rule__CompositeState_Impl__Group__8__Impl rule__CompositeState_Impl__Group__9 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3463:2: rule__CompositeState_Impl__Group__8__Impl rule__CompositeState_Impl__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__8__Impl_in_rule__CompositeState_Impl__Group__86963);
            rule__CompositeState_Impl__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__9_in_rule__CompositeState_Impl__Group__86966);
            rule__CompositeState_Impl__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group__8"


    // $ANTLR start "rule__CompositeState_Impl__Group__8__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3470:1: rule__CompositeState_Impl__Group__8__Impl : ( ( rule__CompositeState_Impl__Group_8__0 )* ) ;
    public final void rule__CompositeState_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3474:1: ( ( ( rule__CompositeState_Impl__Group_8__0 )* ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3475:1: ( ( rule__CompositeState_Impl__Group_8__0 )* )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3475:1: ( ( rule__CompositeState_Impl__Group_8__0 )* )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3476:1: ( rule__CompositeState_Impl__Group_8__0 )*
            {
             before(grammarAccess.getCompositeState_ImplAccess().getGroup_8()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3477:1: ( rule__CompositeState_Impl__Group_8__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3477:2: rule__CompositeState_Impl__Group_8__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group_8__0_in_rule__CompositeState_Impl__Group__8__Impl6993);
            	    rule__CompositeState_Impl__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getCompositeState_ImplAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group__8__Impl"


    // $ANTLR start "rule__CompositeState_Impl__Group__9"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3487:1: rule__CompositeState_Impl__Group__9 : rule__CompositeState_Impl__Group__9__Impl rule__CompositeState_Impl__Group__10 ;
    public final void rule__CompositeState_Impl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3491:1: ( rule__CompositeState_Impl__Group__9__Impl rule__CompositeState_Impl__Group__10 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3492:2: rule__CompositeState_Impl__Group__9__Impl rule__CompositeState_Impl__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__9__Impl_in_rule__CompositeState_Impl__Group__97024);
            rule__CompositeState_Impl__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__10_in_rule__CompositeState_Impl__Group__97027);
            rule__CompositeState_Impl__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group__9"


    // $ANTLR start "rule__CompositeState_Impl__Group__9__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3499:1: rule__CompositeState_Impl__Group__9__Impl : ( '}' ) ;
    public final void rule__CompositeState_Impl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3503:1: ( ( '}' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3504:1: ( '}' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3504:1: ( '}' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3505:1: '}'
            {
             before(grammarAccess.getCompositeState_ImplAccess().getRightCurlyBracketKeyword_9()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__CompositeState_Impl__Group__9__Impl7055); 
             after(grammarAccess.getCompositeState_ImplAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group__9__Impl"


    // $ANTLR start "rule__CompositeState_Impl__Group__10"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3518:1: rule__CompositeState_Impl__Group__10 : rule__CompositeState_Impl__Group__10__Impl rule__CompositeState_Impl__Group__11 ;
    public final void rule__CompositeState_Impl__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3522:1: ( rule__CompositeState_Impl__Group__10__Impl rule__CompositeState_Impl__Group__11 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3523:2: rule__CompositeState_Impl__Group__10__Impl rule__CompositeState_Impl__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__10__Impl_in_rule__CompositeState_Impl__Group__107086);
            rule__CompositeState_Impl__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__11_in_rule__CompositeState_Impl__Group__107089);
            rule__CompositeState_Impl__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group__10"


    // $ANTLR start "rule__CompositeState_Impl__Group__10__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3530:1: rule__CompositeState_Impl__Group__10__Impl : ( 'initialState' ) ;
    public final void rule__CompositeState_Impl__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3534:1: ( ( 'initialState' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3535:1: ( 'initialState' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3535:1: ( 'initialState' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3536:1: 'initialState'
            {
             before(grammarAccess.getCompositeState_ImplAccess().getInitialStateKeyword_10()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__CompositeState_Impl__Group__10__Impl7117); 
             after(grammarAccess.getCompositeState_ImplAccess().getInitialStateKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group__10__Impl"


    // $ANTLR start "rule__CompositeState_Impl__Group__11"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3549:1: rule__CompositeState_Impl__Group__11 : rule__CompositeState_Impl__Group__11__Impl rule__CompositeState_Impl__Group__12 ;
    public final void rule__CompositeState_Impl__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3553:1: ( rule__CompositeState_Impl__Group__11__Impl rule__CompositeState_Impl__Group__12 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3554:2: rule__CompositeState_Impl__Group__11__Impl rule__CompositeState_Impl__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__11__Impl_in_rule__CompositeState_Impl__Group__117148);
            rule__CompositeState_Impl__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__12_in_rule__CompositeState_Impl__Group__117151);
            rule__CompositeState_Impl__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group__11"


    // $ANTLR start "rule__CompositeState_Impl__Group__11__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3561:1: rule__CompositeState_Impl__Group__11__Impl : ( ( rule__CompositeState_Impl__InitialStateAssignment_11 ) ) ;
    public final void rule__CompositeState_Impl__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3565:1: ( ( ( rule__CompositeState_Impl__InitialStateAssignment_11 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3566:1: ( ( rule__CompositeState_Impl__InitialStateAssignment_11 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3566:1: ( ( rule__CompositeState_Impl__InitialStateAssignment_11 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3567:1: ( rule__CompositeState_Impl__InitialStateAssignment_11 )
            {
             before(grammarAccess.getCompositeState_ImplAccess().getInitialStateAssignment_11()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3568:1: ( rule__CompositeState_Impl__InitialStateAssignment_11 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3568:2: rule__CompositeState_Impl__InitialStateAssignment_11
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__InitialStateAssignment_11_in_rule__CompositeState_Impl__Group__11__Impl7178);
            rule__CompositeState_Impl__InitialStateAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getCompositeState_ImplAccess().getInitialStateAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group__11__Impl"


    // $ANTLR start "rule__CompositeState_Impl__Group__12"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3578:1: rule__CompositeState_Impl__Group__12 : rule__CompositeState_Impl__Group__12__Impl ;
    public final void rule__CompositeState_Impl__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3582:1: ( rule__CompositeState_Impl__Group__12__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3583:2: rule__CompositeState_Impl__Group__12__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__12__Impl_in_rule__CompositeState_Impl__Group__127208);
            rule__CompositeState_Impl__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group__12"


    // $ANTLR start "rule__CompositeState_Impl__Group__12__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3589:1: rule__CompositeState_Impl__Group__12__Impl : ( '}' ) ;
    public final void rule__CompositeState_Impl__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3593:1: ( ( '}' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3594:1: ( '}' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3594:1: ( '}' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3595:1: '}'
            {
             before(grammarAccess.getCompositeState_ImplAccess().getRightCurlyBracketKeyword_12()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__CompositeState_Impl__Group__12__Impl7236); 
             after(grammarAccess.getCompositeState_ImplAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group__12__Impl"


    // $ANTLR start "rule__CompositeState_Impl__Group_4__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3634:1: rule__CompositeState_Impl__Group_4__0 : rule__CompositeState_Impl__Group_4__0__Impl rule__CompositeState_Impl__Group_4__1 ;
    public final void rule__CompositeState_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3638:1: ( rule__CompositeState_Impl__Group_4__0__Impl rule__CompositeState_Impl__Group_4__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3639:2: rule__CompositeState_Impl__Group_4__0__Impl rule__CompositeState_Impl__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group_4__0__Impl_in_rule__CompositeState_Impl__Group_4__07293);
            rule__CompositeState_Impl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group_4__1_in_rule__CompositeState_Impl__Group_4__07296);
            rule__CompositeState_Impl__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group_4__0"


    // $ANTLR start "rule__CompositeState_Impl__Group_4__0__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3646:1: rule__CompositeState_Impl__Group_4__0__Impl : ( 'operation' ) ;
    public final void rule__CompositeState_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3650:1: ( ( 'operation' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3651:1: ( 'operation' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3651:1: ( 'operation' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3652:1: 'operation'
            {
             before(grammarAccess.getCompositeState_ImplAccess().getOperationKeyword_4_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__CompositeState_Impl__Group_4__0__Impl7324); 
             after(grammarAccess.getCompositeState_ImplAccess().getOperationKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group_4__0__Impl"


    // $ANTLR start "rule__CompositeState_Impl__Group_4__1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3665:1: rule__CompositeState_Impl__Group_4__1 : rule__CompositeState_Impl__Group_4__1__Impl ;
    public final void rule__CompositeState_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3669:1: ( rule__CompositeState_Impl__Group_4__1__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3670:2: rule__CompositeState_Impl__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group_4__1__Impl_in_rule__CompositeState_Impl__Group_4__17355);
            rule__CompositeState_Impl__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group_4__1"


    // $ANTLR start "rule__CompositeState_Impl__Group_4__1__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3676:1: rule__CompositeState_Impl__Group_4__1__Impl : ( ( rule__CompositeState_Impl__OperationAssignment_4_1 ) ) ;
    public final void rule__CompositeState_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3680:1: ( ( ( rule__CompositeState_Impl__OperationAssignment_4_1 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3681:1: ( ( rule__CompositeState_Impl__OperationAssignment_4_1 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3681:1: ( ( rule__CompositeState_Impl__OperationAssignment_4_1 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3682:1: ( rule__CompositeState_Impl__OperationAssignment_4_1 )
            {
             before(grammarAccess.getCompositeState_ImplAccess().getOperationAssignment_4_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3683:1: ( rule__CompositeState_Impl__OperationAssignment_4_1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3683:2: rule__CompositeState_Impl__OperationAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__OperationAssignment_4_1_in_rule__CompositeState_Impl__Group_4__1__Impl7382);
            rule__CompositeState_Impl__OperationAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeState_ImplAccess().getOperationAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group_4__1__Impl"


    // $ANTLR start "rule__CompositeState_Impl__Group_8__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3697:1: rule__CompositeState_Impl__Group_8__0 : rule__CompositeState_Impl__Group_8__0__Impl rule__CompositeState_Impl__Group_8__1 ;
    public final void rule__CompositeState_Impl__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3701:1: ( rule__CompositeState_Impl__Group_8__0__Impl rule__CompositeState_Impl__Group_8__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3702:2: rule__CompositeState_Impl__Group_8__0__Impl rule__CompositeState_Impl__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group_8__0__Impl_in_rule__CompositeState_Impl__Group_8__07416);
            rule__CompositeState_Impl__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group_8__1_in_rule__CompositeState_Impl__Group_8__07419);
            rule__CompositeState_Impl__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group_8__0"


    // $ANTLR start "rule__CompositeState_Impl__Group_8__0__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3709:1: rule__CompositeState_Impl__Group_8__0__Impl : ( ',' ) ;
    public final void rule__CompositeState_Impl__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3713:1: ( ( ',' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3714:1: ( ',' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3714:1: ( ',' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3715:1: ','
            {
             before(grammarAccess.getCompositeState_ImplAccess().getCommaKeyword_8_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__CompositeState_Impl__Group_8__0__Impl7447); 
             after(grammarAccess.getCompositeState_ImplAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group_8__0__Impl"


    // $ANTLR start "rule__CompositeState_Impl__Group_8__1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3728:1: rule__CompositeState_Impl__Group_8__1 : rule__CompositeState_Impl__Group_8__1__Impl ;
    public final void rule__CompositeState_Impl__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3732:1: ( rule__CompositeState_Impl__Group_8__1__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3733:2: rule__CompositeState_Impl__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group_8__1__Impl_in_rule__CompositeState_Impl__Group_8__17478);
            rule__CompositeState_Impl__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group_8__1"


    // $ANTLR start "rule__CompositeState_Impl__Group_8__1__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3739:1: rule__CompositeState_Impl__Group_8__1__Impl : ( ( rule__CompositeState_Impl__StatesAssignment_8_1 ) ) ;
    public final void rule__CompositeState_Impl__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3743:1: ( ( ( rule__CompositeState_Impl__StatesAssignment_8_1 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3744:1: ( ( rule__CompositeState_Impl__StatesAssignment_8_1 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3744:1: ( ( rule__CompositeState_Impl__StatesAssignment_8_1 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3745:1: ( rule__CompositeState_Impl__StatesAssignment_8_1 )
            {
             before(grammarAccess.getCompositeState_ImplAccess().getStatesAssignment_8_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3746:1: ( rule__CompositeState_Impl__StatesAssignment_8_1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3746:2: rule__CompositeState_Impl__StatesAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__StatesAssignment_8_1_in_rule__CompositeState_Impl__Group_8__1__Impl7505);
            rule__CompositeState_Impl__StatesAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeState_ImplAccess().getStatesAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__Group_8__1__Impl"


    // $ANTLR start "rule__BooleanVariable__Group__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3760:1: rule__BooleanVariable__Group__0 : rule__BooleanVariable__Group__0__Impl rule__BooleanVariable__Group__1 ;
    public final void rule__BooleanVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3764:1: ( rule__BooleanVariable__Group__0__Impl rule__BooleanVariable__Group__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3765:2: rule__BooleanVariable__Group__0__Impl rule__BooleanVariable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group__0__Impl_in_rule__BooleanVariable__Group__07539);
            rule__BooleanVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group__1_in_rule__BooleanVariable__Group__07542);
            rule__BooleanVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__Group__0"


    // $ANTLR start "rule__BooleanVariable__Group__0__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3772:1: rule__BooleanVariable__Group__0__Impl : ( () ) ;
    public final void rule__BooleanVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3776:1: ( ( () ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3777:1: ( () )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3777:1: ( () )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3778:1: ()
            {
             before(grammarAccess.getBooleanVariableAccess().getBooleanVariableAction_0()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3779:1: ()
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3781:1: 
            {
            }

             after(grammarAccess.getBooleanVariableAccess().getBooleanVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__Group__0__Impl"


    // $ANTLR start "rule__BooleanVariable__Group__1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3791:1: rule__BooleanVariable__Group__1 : rule__BooleanVariable__Group__1__Impl rule__BooleanVariable__Group__2 ;
    public final void rule__BooleanVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3795:1: ( rule__BooleanVariable__Group__1__Impl rule__BooleanVariable__Group__2 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3796:2: rule__BooleanVariable__Group__1__Impl rule__BooleanVariable__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group__1__Impl_in_rule__BooleanVariable__Group__17600);
            rule__BooleanVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group__2_in_rule__BooleanVariable__Group__17603);
            rule__BooleanVariable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__Group__1"


    // $ANTLR start "rule__BooleanVariable__Group__1__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3803:1: rule__BooleanVariable__Group__1__Impl : ( ( rule__BooleanVariable__NameAssignment_1 ) ) ;
    public final void rule__BooleanVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3807:1: ( ( ( rule__BooleanVariable__NameAssignment_1 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3808:1: ( ( rule__BooleanVariable__NameAssignment_1 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3808:1: ( ( rule__BooleanVariable__NameAssignment_1 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3809:1: ( rule__BooleanVariable__NameAssignment_1 )
            {
             before(grammarAccess.getBooleanVariableAccess().getNameAssignment_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3810:1: ( rule__BooleanVariable__NameAssignment_1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3810:2: rule__BooleanVariable__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__NameAssignment_1_in_rule__BooleanVariable__Group__1__Impl7630);
            rule__BooleanVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__Group__1__Impl"


    // $ANTLR start "rule__BooleanVariable__Group__2"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3820:1: rule__BooleanVariable__Group__2 : rule__BooleanVariable__Group__2__Impl rule__BooleanVariable__Group__3 ;
    public final void rule__BooleanVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3824:1: ( rule__BooleanVariable__Group__2__Impl rule__BooleanVariable__Group__3 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3825:2: rule__BooleanVariable__Group__2__Impl rule__BooleanVariable__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group__2__Impl_in_rule__BooleanVariable__Group__27660);
            rule__BooleanVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group__3_in_rule__BooleanVariable__Group__27663);
            rule__BooleanVariable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__Group__2"


    // $ANTLR start "rule__BooleanVariable__Group__2__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3832:1: rule__BooleanVariable__Group__2__Impl : ( ':' ) ;
    public final void rule__BooleanVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3836:1: ( ( ':' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3837:1: ( ':' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3837:1: ( ':' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3838:1: ':'
            {
             before(grammarAccess.getBooleanVariableAccess().getColonKeyword_2()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__BooleanVariable__Group__2__Impl7691); 
             after(grammarAccess.getBooleanVariableAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__Group__2__Impl"


    // $ANTLR start "rule__BooleanVariable__Group__3"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3851:1: rule__BooleanVariable__Group__3 : rule__BooleanVariable__Group__3__Impl rule__BooleanVariable__Group__4 ;
    public final void rule__BooleanVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3855:1: ( rule__BooleanVariable__Group__3__Impl rule__BooleanVariable__Group__4 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3856:2: rule__BooleanVariable__Group__3__Impl rule__BooleanVariable__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group__3__Impl_in_rule__BooleanVariable__Group__37722);
            rule__BooleanVariable__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group__4_in_rule__BooleanVariable__Group__37725);
            rule__BooleanVariable__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__Group__3"


    // $ANTLR start "rule__BooleanVariable__Group__3__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3863:1: rule__BooleanVariable__Group__3__Impl : ( 'boolean' ) ;
    public final void rule__BooleanVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3867:1: ( ( 'boolean' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3868:1: ( 'boolean' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3868:1: ( 'boolean' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3869:1: 'boolean'
            {
             before(grammarAccess.getBooleanVariableAccess().getBooleanKeyword_3()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__BooleanVariable__Group__3__Impl7753); 
             after(grammarAccess.getBooleanVariableAccess().getBooleanKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__Group__3__Impl"


    // $ANTLR start "rule__BooleanVariable__Group__4"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3882:1: rule__BooleanVariable__Group__4 : rule__BooleanVariable__Group__4__Impl ;
    public final void rule__BooleanVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3886:1: ( rule__BooleanVariable__Group__4__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3887:2: rule__BooleanVariable__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group__4__Impl_in_rule__BooleanVariable__Group__47784);
            rule__BooleanVariable__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__Group__4"


    // $ANTLR start "rule__BooleanVariable__Group__4__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3893:1: rule__BooleanVariable__Group__4__Impl : ( ( rule__BooleanVariable__Group_4__0 )? ) ;
    public final void rule__BooleanVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3897:1: ( ( ( rule__BooleanVariable__Group_4__0 )? ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3898:1: ( ( rule__BooleanVariable__Group_4__0 )? )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3898:1: ( ( rule__BooleanVariable__Group_4__0 )? )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3899:1: ( rule__BooleanVariable__Group_4__0 )?
            {
             before(grammarAccess.getBooleanVariableAccess().getGroup_4()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3900:1: ( rule__BooleanVariable__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==53) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3900:2: rule__BooleanVariable__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group_4__0_in_rule__BooleanVariable__Group__4__Impl7811);
                    rule__BooleanVariable__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBooleanVariableAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__Group__4__Impl"


    // $ANTLR start "rule__BooleanVariable__Group_4__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3920:1: rule__BooleanVariable__Group_4__0 : rule__BooleanVariable__Group_4__0__Impl rule__BooleanVariable__Group_4__1 ;
    public final void rule__BooleanVariable__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3924:1: ( rule__BooleanVariable__Group_4__0__Impl rule__BooleanVariable__Group_4__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3925:2: rule__BooleanVariable__Group_4__0__Impl rule__BooleanVariable__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group_4__0__Impl_in_rule__BooleanVariable__Group_4__07852);
            rule__BooleanVariable__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group_4__1_in_rule__BooleanVariable__Group_4__07855);
            rule__BooleanVariable__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__Group_4__0"


    // $ANTLR start "rule__BooleanVariable__Group_4__0__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3932:1: rule__BooleanVariable__Group_4__0__Impl : ( ':=' ) ;
    public final void rule__BooleanVariable__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3936:1: ( ( ':=' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3937:1: ( ':=' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3937:1: ( ':=' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3938:1: ':='
            {
             before(grammarAccess.getBooleanVariableAccess().getColonEqualsSignKeyword_4_0()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__BooleanVariable__Group_4__0__Impl7883); 
             after(grammarAccess.getBooleanVariableAccess().getColonEqualsSignKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__Group_4__0__Impl"


    // $ANTLR start "rule__BooleanVariable__Group_4__1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3951:1: rule__BooleanVariable__Group_4__1 : rule__BooleanVariable__Group_4__1__Impl ;
    public final void rule__BooleanVariable__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3955:1: ( rule__BooleanVariable__Group_4__1__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3956:2: rule__BooleanVariable__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group_4__1__Impl_in_rule__BooleanVariable__Group_4__17914);
            rule__BooleanVariable__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__Group_4__1"


    // $ANTLR start "rule__BooleanVariable__Group_4__1__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3962:1: rule__BooleanVariable__Group_4__1__Impl : ( ( rule__BooleanVariable__ValueAssignment_4_1 ) ) ;
    public final void rule__BooleanVariable__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3966:1: ( ( ( rule__BooleanVariable__ValueAssignment_4_1 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3967:1: ( ( rule__BooleanVariable__ValueAssignment_4_1 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3967:1: ( ( rule__BooleanVariable__ValueAssignment_4_1 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3968:1: ( rule__BooleanVariable__ValueAssignment_4_1 )
            {
             before(grammarAccess.getBooleanVariableAccess().getValueAssignment_4_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3969:1: ( rule__BooleanVariable__ValueAssignment_4_1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3969:2: rule__BooleanVariable__ValueAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__ValueAssignment_4_1_in_rule__BooleanVariable__Group_4__1__Impl7941);
            rule__BooleanVariable__ValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanVariableAccess().getValueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__Group_4__1__Impl"


    // $ANTLR start "rule__IntegerVariable__Group__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3983:1: rule__IntegerVariable__Group__0 : rule__IntegerVariable__Group__0__Impl rule__IntegerVariable__Group__1 ;
    public final void rule__IntegerVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3987:1: ( rule__IntegerVariable__Group__0__Impl rule__IntegerVariable__Group__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3988:2: rule__IntegerVariable__Group__0__Impl rule__IntegerVariable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group__0__Impl_in_rule__IntegerVariable__Group__07975);
            rule__IntegerVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group__1_in_rule__IntegerVariable__Group__07978);
            rule__IntegerVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group__0"


    // $ANTLR start "rule__IntegerVariable__Group__0__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3995:1: rule__IntegerVariable__Group__0__Impl : ( () ) ;
    public final void rule__IntegerVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3999:1: ( ( () ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4000:1: ( () )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4000:1: ( () )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4001:1: ()
            {
             before(grammarAccess.getIntegerVariableAccess().getIntegerVariableAction_0()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4002:1: ()
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4004:1: 
            {
            }

             after(grammarAccess.getIntegerVariableAccess().getIntegerVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group__0__Impl"


    // $ANTLR start "rule__IntegerVariable__Group__1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4014:1: rule__IntegerVariable__Group__1 : rule__IntegerVariable__Group__1__Impl rule__IntegerVariable__Group__2 ;
    public final void rule__IntegerVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4018:1: ( rule__IntegerVariable__Group__1__Impl rule__IntegerVariable__Group__2 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4019:2: rule__IntegerVariable__Group__1__Impl rule__IntegerVariable__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group__1__Impl_in_rule__IntegerVariable__Group__18036);
            rule__IntegerVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group__2_in_rule__IntegerVariable__Group__18039);
            rule__IntegerVariable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group__1"


    // $ANTLR start "rule__IntegerVariable__Group__1__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4026:1: rule__IntegerVariable__Group__1__Impl : ( ( rule__IntegerVariable__NameAssignment_1 ) ) ;
    public final void rule__IntegerVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4030:1: ( ( ( rule__IntegerVariable__NameAssignment_1 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4031:1: ( ( rule__IntegerVariable__NameAssignment_1 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4031:1: ( ( rule__IntegerVariable__NameAssignment_1 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4032:1: ( rule__IntegerVariable__NameAssignment_1 )
            {
             before(grammarAccess.getIntegerVariableAccess().getNameAssignment_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4033:1: ( rule__IntegerVariable__NameAssignment_1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4033:2: rule__IntegerVariable__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__NameAssignment_1_in_rule__IntegerVariable__Group__1__Impl8066);
            rule__IntegerVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group__1__Impl"


    // $ANTLR start "rule__IntegerVariable__Group__2"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4043:1: rule__IntegerVariable__Group__2 : rule__IntegerVariable__Group__2__Impl rule__IntegerVariable__Group__3 ;
    public final void rule__IntegerVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4047:1: ( rule__IntegerVariable__Group__2__Impl rule__IntegerVariable__Group__3 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4048:2: rule__IntegerVariable__Group__2__Impl rule__IntegerVariable__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group__2__Impl_in_rule__IntegerVariable__Group__28096);
            rule__IntegerVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group__3_in_rule__IntegerVariable__Group__28099);
            rule__IntegerVariable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group__2"


    // $ANTLR start "rule__IntegerVariable__Group__2__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4055:1: rule__IntegerVariable__Group__2__Impl : ( ':' ) ;
    public final void rule__IntegerVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4059:1: ( ( ':' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4060:1: ( ':' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4060:1: ( ':' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4061:1: ':'
            {
             before(grammarAccess.getIntegerVariableAccess().getColonKeyword_2()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__IntegerVariable__Group__2__Impl8127); 
             after(grammarAccess.getIntegerVariableAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group__2__Impl"


    // $ANTLR start "rule__IntegerVariable__Group__3"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4074:1: rule__IntegerVariable__Group__3 : rule__IntegerVariable__Group__3__Impl rule__IntegerVariable__Group__4 ;
    public final void rule__IntegerVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4078:1: ( rule__IntegerVariable__Group__3__Impl rule__IntegerVariable__Group__4 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4079:2: rule__IntegerVariable__Group__3__Impl rule__IntegerVariable__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group__3__Impl_in_rule__IntegerVariable__Group__38158);
            rule__IntegerVariable__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group__4_in_rule__IntegerVariable__Group__38161);
            rule__IntegerVariable__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group__3"


    // $ANTLR start "rule__IntegerVariable__Group__3__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4086:1: rule__IntegerVariable__Group__3__Impl : ( 'integer' ) ;
    public final void rule__IntegerVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4090:1: ( ( 'integer' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4091:1: ( 'integer' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4091:1: ( 'integer' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4092:1: 'integer'
            {
             before(grammarAccess.getIntegerVariableAccess().getIntegerKeyword_3()); 
            match(input,54,FollowSets000.FOLLOW_54_in_rule__IntegerVariable__Group__3__Impl8189); 
             after(grammarAccess.getIntegerVariableAccess().getIntegerKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group__3__Impl"


    // $ANTLR start "rule__IntegerVariable__Group__4"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4105:1: rule__IntegerVariable__Group__4 : rule__IntegerVariable__Group__4__Impl ;
    public final void rule__IntegerVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4109:1: ( rule__IntegerVariable__Group__4__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4110:2: rule__IntegerVariable__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group__4__Impl_in_rule__IntegerVariable__Group__48220);
            rule__IntegerVariable__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group__4"


    // $ANTLR start "rule__IntegerVariable__Group__4__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4116:1: rule__IntegerVariable__Group__4__Impl : ( ( rule__IntegerVariable__Group_4__0 )? ) ;
    public final void rule__IntegerVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4120:1: ( ( ( rule__IntegerVariable__Group_4__0 )? ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4121:1: ( ( rule__IntegerVariable__Group_4__0 )? )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4121:1: ( ( rule__IntegerVariable__Group_4__0 )? )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4122:1: ( rule__IntegerVariable__Group_4__0 )?
            {
             before(grammarAccess.getIntegerVariableAccess().getGroup_4()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4123:1: ( rule__IntegerVariable__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==53) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4123:2: rule__IntegerVariable__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group_4__0_in_rule__IntegerVariable__Group__4__Impl8247);
                    rule__IntegerVariable__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerVariableAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group__4__Impl"


    // $ANTLR start "rule__IntegerVariable__Group_4__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4143:1: rule__IntegerVariable__Group_4__0 : rule__IntegerVariable__Group_4__0__Impl rule__IntegerVariable__Group_4__1 ;
    public final void rule__IntegerVariable__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4147:1: ( rule__IntegerVariable__Group_4__0__Impl rule__IntegerVariable__Group_4__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4148:2: rule__IntegerVariable__Group_4__0__Impl rule__IntegerVariable__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group_4__0__Impl_in_rule__IntegerVariable__Group_4__08288);
            rule__IntegerVariable__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group_4__1_in_rule__IntegerVariable__Group_4__08291);
            rule__IntegerVariable__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group_4__0"


    // $ANTLR start "rule__IntegerVariable__Group_4__0__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4155:1: rule__IntegerVariable__Group_4__0__Impl : ( ':=' ) ;
    public final void rule__IntegerVariable__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4159:1: ( ( ':=' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4160:1: ( ':=' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4160:1: ( ':=' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4161:1: ':='
            {
             before(grammarAccess.getIntegerVariableAccess().getColonEqualsSignKeyword_4_0()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__IntegerVariable__Group_4__0__Impl8319); 
             after(grammarAccess.getIntegerVariableAccess().getColonEqualsSignKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group_4__0__Impl"


    // $ANTLR start "rule__IntegerVariable__Group_4__1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4174:1: rule__IntegerVariable__Group_4__1 : rule__IntegerVariable__Group_4__1__Impl ;
    public final void rule__IntegerVariable__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4178:1: ( rule__IntegerVariable__Group_4__1__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4179:2: rule__IntegerVariable__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group_4__1__Impl_in_rule__IntegerVariable__Group_4__18350);
            rule__IntegerVariable__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group_4__1"


    // $ANTLR start "rule__IntegerVariable__Group_4__1__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4185:1: rule__IntegerVariable__Group_4__1__Impl : ( ( rule__IntegerVariable__ValueAssignment_4_1 ) ) ;
    public final void rule__IntegerVariable__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4189:1: ( ( ( rule__IntegerVariable__ValueAssignment_4_1 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4190:1: ( ( rule__IntegerVariable__ValueAssignment_4_1 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4190:1: ( ( rule__IntegerVariable__ValueAssignment_4_1 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4191:1: ( rule__IntegerVariable__ValueAssignment_4_1 )
            {
             before(grammarAccess.getIntegerVariableAccess().getValueAssignment_4_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4192:1: ( rule__IntegerVariable__ValueAssignment_4_1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4192:2: rule__IntegerVariable__ValueAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__ValueAssignment_4_1_in_rule__IntegerVariable__Group_4__1__Impl8377);
            rule__IntegerVariable__ValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerVariableAccess().getValueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group_4__1__Impl"


    // $ANTLR start "rule__StateMachine__IsActiveAssignment_0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4207:1: rule__StateMachine__IsActiveAssignment_0 : ( ( 'isActive' ) ) ;
    public final void rule__StateMachine__IsActiveAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4211:1: ( ( ( 'isActive' ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4212:1: ( ( 'isActive' ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4212:1: ( ( 'isActive' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4213:1: ( 'isActive' )
            {
             before(grammarAccess.getStateMachineAccess().getIsActiveIsActiveKeyword_0_0()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4214:1: ( 'isActive' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4215:1: 'isActive'
            {
             before(grammarAccess.getStateMachineAccess().getIsActiveIsActiveKeyword_0_0()); 
            match(input,55,FollowSets000.FOLLOW_55_in_rule__StateMachine__IsActiveAssignment_08421); 
             after(grammarAccess.getStateMachineAccess().getIsActiveIsActiveKeyword_0_0()); 

            }

             after(grammarAccess.getStateMachineAccess().getIsActiveIsActiveKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__IsActiveAssignment_0"


    // $ANTLR start "rule__StateMachine__NameAssignment_2"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4230:1: rule__StateMachine__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__StateMachine__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4234:1: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4235:1: ( ruleEString )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4235:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4236:1: ruleEString
            {
             before(grammarAccess.getStateMachineAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__StateMachine__NameAssignment_28460);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__NameAssignment_2"


    // $ANTLR start "rule__StateMachine__VariablesAssignment_4"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4245:1: rule__StateMachine__VariablesAssignment_4 : ( ruleVariable ) ;
    public final void rule__StateMachine__VariablesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4249:1: ( ( ruleVariable ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4250:1: ( ruleVariable )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4250:1: ( ruleVariable )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4251:1: ruleVariable
            {
             before(grammarAccess.getStateMachineAccess().getVariablesVariableParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_rule__StateMachine__VariablesAssignment_48491);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getVariablesVariableParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__VariablesAssignment_4"


    // $ANTLR start "rule__StateMachine__EventsAssignment_7"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4260:1: rule__StateMachine__EventsAssignment_7 : ( ruleEvent ) ;
    public final void rule__StateMachine__EventsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4264:1: ( ( ruleEvent ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4265:1: ( ruleEvent )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4265:1: ( ruleEvent )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4266:1: ruleEvent
            {
             before(grammarAccess.getStateMachineAccess().getEventsEventParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEvent_in_rule__StateMachine__EventsAssignment_78522);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getEventsEventParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__EventsAssignment_7"


    // $ANTLR start "rule__StateMachine__EventsAssignment_8_1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4275:1: rule__StateMachine__EventsAssignment_8_1 : ( ruleEvent ) ;
    public final void rule__StateMachine__EventsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4279:1: ( ( ruleEvent ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4280:1: ( ruleEvent )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4280:1: ( ruleEvent )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4281:1: ruleEvent
            {
             before(grammarAccess.getStateMachineAccess().getEventsEventParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEvent_in_rule__StateMachine__EventsAssignment_8_18553);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getEventsEventParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__EventsAssignment_8_1"


    // $ANTLR start "rule__Operation__ContentsAssignment_3_2"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4290:1: rule__Operation__ContentsAssignment_3_2 : ( ruleAssignment ) ;
    public final void rule__Operation__ContentsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4294:1: ( ( ruleAssignment ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4295:1: ( ruleAssignment )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4295:1: ( ruleAssignment )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4296:1: ruleAssignment
            {
             before(grammarAccess.getOperationAccess().getContentsAssignmentParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_rule__Operation__ContentsAssignment_3_28584);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getContentsAssignmentParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ContentsAssignment_3_2"


    // $ANTLR start "rule__Operation__ContentsAssignment_3_3_1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4305:1: rule__Operation__ContentsAssignment_3_3_1 : ( ruleAssignment ) ;
    public final void rule__Operation__ContentsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4309:1: ( ( ruleAssignment ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4310:1: ( ruleAssignment )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4310:1: ( ruleAssignment )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4311:1: ruleAssignment
            {
             before(grammarAccess.getOperationAccess().getContentsAssignmentParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_rule__Operation__ContentsAssignment_3_3_18615);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getContentsAssignmentParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ContentsAssignment_3_3_1"


    // $ANTLR start "rule__State_Impl__IsActiveAssignment_0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4320:1: rule__State_Impl__IsActiveAssignment_0 : ( ( 'isActive' ) ) ;
    public final void rule__State_Impl__IsActiveAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4324:1: ( ( ( 'isActive' ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4325:1: ( ( 'isActive' ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4325:1: ( ( 'isActive' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4326:1: ( 'isActive' )
            {
             before(grammarAccess.getState_ImplAccess().getIsActiveIsActiveKeyword_0_0()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4327:1: ( 'isActive' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4328:1: 'isActive'
            {
             before(grammarAccess.getState_ImplAccess().getIsActiveIsActiveKeyword_0_0()); 
            match(input,55,FollowSets000.FOLLOW_55_in_rule__State_Impl__IsActiveAssignment_08651); 
             after(grammarAccess.getState_ImplAccess().getIsActiveIsActiveKeyword_0_0()); 

            }

             after(grammarAccess.getState_ImplAccess().getIsActiveIsActiveKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State_Impl__IsActiveAssignment_0"


    // $ANTLR start "rule__State_Impl__NameAssignment_2"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4343:1: rule__State_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__State_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4347:1: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4348:1: ( ruleEString )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4348:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4349:1: ruleEString
            {
             before(grammarAccess.getState_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__State_Impl__NameAssignment_28690);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getState_ImplAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State_Impl__NameAssignment_2"


    // $ANTLR start "rule__State_Impl__OperationAssignment_4_1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4358:1: rule__State_Impl__OperationAssignment_4_1 : ( ruleOperation ) ;
    public final void rule__State_Impl__OperationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4362:1: ( ( ruleOperation ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4363:1: ( ruleOperation )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4363:1: ( ruleOperation )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4364:1: ruleOperation
            {
             before(grammarAccess.getState_ImplAccess().getOperationOperationParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_rule__State_Impl__OperationAssignment_4_18721);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getState_ImplAccess().getOperationOperationParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State_Impl__OperationAssignment_4_1"


    // $ANTLR start "rule__InitialState__ReferencedStateAssignment_3"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4373:1: rule__InitialState__ReferencedStateAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__InitialState__ReferencedStateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4377:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4378:1: ( ( ruleEString ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4378:1: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4379:1: ( ruleEString )
            {
             before(grammarAccess.getInitialStateAccess().getReferencedStateStateCrossReference_3_0()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4380:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4381:1: ruleEString
            {
             before(grammarAccess.getInitialStateAccess().getReferencedStateStateEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InitialState__ReferencedStateAssignment_38756);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInitialStateAccess().getReferencedStateStateEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getInitialStateAccess().getReferencedStateStateCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__ReferencedStateAssignment_3"


    // $ANTLR start "rule__Event__NameAssignment_1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4396:1: rule__Event__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Event__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4400:1: ( ( RULE_STRING ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4401:1: ( RULE_STRING )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4401:1: ( RULE_STRING )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4402:1: RULE_STRING
            {
             before(grammarAccess.getEventAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Event__NameAssignment_18795); 
             after(grammarAccess.getEventAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__NameAssignment_1"


    // $ANTLR start "rule__Assignment___nameAssignment_2_1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4411:1: rule__Assignment___nameAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Assignment___nameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4415:1: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4416:1: ( ruleEString )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4416:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4417:1: ruleEString
            {
             before(grammarAccess.getAssignmentAccess().get_nameEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Assignment___nameAssignment_2_18826);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().get_nameEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment___nameAssignment_2_1"


    // $ANTLR start "rule__Assignment__VariableAssignment_4"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4426:1: rule__Assignment__VariableAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Assignment__VariableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4430:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4431:1: ( ( ruleEString ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4431:1: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4432:1: ( ruleEString )
            {
             before(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_4_0()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4433:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4434:1: ruleEString
            {
             before(grammarAccess.getAssignmentAccess().getVariableVariableEStringParserRuleCall_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Assignment__VariableAssignment_48861);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getVariableVariableEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__VariableAssignment_4"


    // $ANTLR start "rule__Assignment__ExpressionAssignment_6"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4445:1: rule__Assignment__ExpressionAssignment_6 : ( ruleExpressionElement ) ;
    public final void rule__Assignment__ExpressionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4449:1: ( ( ruleExpressionElement ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4450:1: ( ruleExpressionElement )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4450:1: ( ruleExpressionElement )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4451:1: ruleExpressionElement
            {
             before(grammarAccess.getAssignmentAccess().getExpressionExpressionElementParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionElement_in_rule__Assignment__ExpressionAssignment_68896);
            ruleExpressionElement();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getExpressionExpressionElementParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ExpressionAssignment_6"


    // $ANTLR start "rule__Expression__OperatorAssignment_3"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4460:1: rule__Expression__OperatorAssignment_3 : ( ruleOperator ) ;
    public final void rule__Expression__OperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4464:1: ( ( ruleOperator ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4465:1: ( ruleOperator )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4465:1: ( ruleOperator )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4466:1: ruleOperator
            {
             before(grammarAccess.getExpressionAccess().getOperatorOperatorEnumRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperator_in_rule__Expression__OperatorAssignment_38927);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOperatorOperatorEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__OperatorAssignment_3"


    // $ANTLR start "rule__Expression___nameAssignment_4_1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4475:1: rule__Expression___nameAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Expression___nameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4479:1: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4480:1: ( ruleEString )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4480:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4481:1: ruleEString
            {
             before(grammarAccess.getExpressionAccess().get_nameEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Expression___nameAssignment_4_18958);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().get_nameEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression___nameAssignment_4_1"


    // $ANTLR start "rule__Expression__LeftAssignment_6"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4490:1: rule__Expression__LeftAssignment_6 : ( ruleExpressionElement ) ;
    public final void rule__Expression__LeftAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4494:1: ( ( ruleExpressionElement ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4495:1: ( ruleExpressionElement )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4495:1: ( ruleExpressionElement )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4496:1: ruleExpressionElement
            {
             before(grammarAccess.getExpressionAccess().getLeftExpressionElementParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionElement_in_rule__Expression__LeftAssignment_68989);
            ruleExpressionElement();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getLeftExpressionElementParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__LeftAssignment_6"


    // $ANTLR start "rule__Expression__RightAssignment_8"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4505:1: rule__Expression__RightAssignment_8 : ( ruleExpressionElement ) ;
    public final void rule__Expression__RightAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4509:1: ( ( ruleExpressionElement ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4510:1: ( ruleExpressionElement )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4510:1: ( ruleExpressionElement )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4511:1: ruleExpressionElement
            {
             before(grammarAccess.getExpressionAccess().getRightExpressionElementParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionElement_in_rule__Expression__RightAssignment_89020);
            ruleExpressionElement();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRightExpressionElementParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__RightAssignment_8"


    // $ANTLR start "rule__BooleanData__ValueAssignment"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4520:1: rule__BooleanData__ValueAssignment : ( ruleEBoolean ) ;
    public final void rule__BooleanData__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4524:1: ( ( ruleEBoolean ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4525:1: ( ruleEBoolean )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4525:1: ( ruleEBoolean )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4526:1: ruleEBoolean
            {
             before(grammarAccess.getBooleanDataAccess().getValueEBooleanParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__BooleanData__ValueAssignment9051);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanDataAccess().getValueEBooleanParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanData__ValueAssignment"


    // $ANTLR start "rule__IntegerData__ValueAssignment"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4535:1: rule__IntegerData__ValueAssignment : ( ruleEInt ) ;
    public final void rule__IntegerData__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4539:1: ( ( ruleEInt ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4540:1: ( ruleEInt )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4540:1: ( ruleEInt )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4541:1: ruleEInt
            {
             before(grammarAccess.getIntegerDataAccess().getValueEIntParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__IntegerData__ValueAssignment9082);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerDataAccess().getValueEIntParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerData__ValueAssignment"


    // $ANTLR start "rule__VariableReference___nameAssignment_2_1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4550:1: rule__VariableReference___nameAssignment_2_1 : ( ruleEString ) ;
    public final void rule__VariableReference___nameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4554:1: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4555:1: ( ruleEString )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4555:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4556:1: ruleEString
            {
             before(grammarAccess.getVariableReferenceAccess().get_nameEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__VariableReference___nameAssignment_2_19113);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableReferenceAccess().get_nameEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference___nameAssignment_2_1"


    // $ANTLR start "rule__VariableReference__VariableAssignment_4"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4565:1: rule__VariableReference__VariableAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__VariableReference__VariableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4569:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4570:1: ( ( ruleEString ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4570:1: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4571:1: ( ruleEString )
            {
             before(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_4_0()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4572:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4573:1: ruleEString
            {
             before(grammarAccess.getVariableReferenceAccess().getVariableVariableEStringParserRuleCall_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__VariableReference__VariableAssignment_49148);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableReferenceAccess().getVariableVariableEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__VariableAssignment_4"


    // $ANTLR start "rule__CompositeState_Impl__IsActiveAssignment_0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4584:1: rule__CompositeState_Impl__IsActiveAssignment_0 : ( ( 'isActive' ) ) ;
    public final void rule__CompositeState_Impl__IsActiveAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4588:1: ( ( ( 'isActive' ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4589:1: ( ( 'isActive' ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4589:1: ( ( 'isActive' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4590:1: ( 'isActive' )
            {
             before(grammarAccess.getCompositeState_ImplAccess().getIsActiveIsActiveKeyword_0_0()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4591:1: ( 'isActive' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4592:1: 'isActive'
            {
             before(grammarAccess.getCompositeState_ImplAccess().getIsActiveIsActiveKeyword_0_0()); 
            match(input,55,FollowSets000.FOLLOW_55_in_rule__CompositeState_Impl__IsActiveAssignment_09188); 
             after(grammarAccess.getCompositeState_ImplAccess().getIsActiveIsActiveKeyword_0_0()); 

            }

             after(grammarAccess.getCompositeState_ImplAccess().getIsActiveIsActiveKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__IsActiveAssignment_0"


    // $ANTLR start "rule__CompositeState_Impl__NameAssignment_2"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4607:1: rule__CompositeState_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__CompositeState_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4611:1: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4612:1: ( ruleEString )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4612:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4613:1: ruleEString
            {
             before(grammarAccess.getCompositeState_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CompositeState_Impl__NameAssignment_29227);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeState_ImplAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__NameAssignment_2"


    // $ANTLR start "rule__CompositeState_Impl__OperationAssignment_4_1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4622:1: rule__CompositeState_Impl__OperationAssignment_4_1 : ( ruleOperation ) ;
    public final void rule__CompositeState_Impl__OperationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4626:1: ( ( ruleOperation ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4627:1: ( ruleOperation )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4627:1: ( ruleOperation )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4628:1: ruleOperation
            {
             before(grammarAccess.getCompositeState_ImplAccess().getOperationOperationParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_rule__CompositeState_Impl__OperationAssignment_4_19258);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getCompositeState_ImplAccess().getOperationOperationParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__OperationAssignment_4_1"


    // $ANTLR start "rule__CompositeState_Impl__StatesAssignment_7"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4637:1: rule__CompositeState_Impl__StatesAssignment_7 : ( ruleState ) ;
    public final void rule__CompositeState_Impl__StatesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4641:1: ( ( ruleState ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4642:1: ( ruleState )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4642:1: ( ruleState )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4643:1: ruleState
            {
             before(grammarAccess.getCompositeState_ImplAccess().getStatesStateParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_in_rule__CompositeState_Impl__StatesAssignment_79289);
            ruleState();

            state._fsp--;

             after(grammarAccess.getCompositeState_ImplAccess().getStatesStateParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__StatesAssignment_7"


    // $ANTLR start "rule__CompositeState_Impl__StatesAssignment_8_1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4652:1: rule__CompositeState_Impl__StatesAssignment_8_1 : ( ruleState ) ;
    public final void rule__CompositeState_Impl__StatesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4656:1: ( ( ruleState ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4657:1: ( ruleState )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4657:1: ( ruleState )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4658:1: ruleState
            {
             before(grammarAccess.getCompositeState_ImplAccess().getStatesStateParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_in_rule__CompositeState_Impl__StatesAssignment_8_19320);
            ruleState();

            state._fsp--;

             after(grammarAccess.getCompositeState_ImplAccess().getStatesStateParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__StatesAssignment_8_1"


    // $ANTLR start "rule__CompositeState_Impl__InitialStateAssignment_11"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4667:1: rule__CompositeState_Impl__InitialStateAssignment_11 : ( ruleInitialState ) ;
    public final void rule__CompositeState_Impl__InitialStateAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4671:1: ( ( ruleInitialState ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4672:1: ( ruleInitialState )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4672:1: ( ruleInitialState )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4673:1: ruleInitialState
            {
             before(grammarAccess.getCompositeState_ImplAccess().getInitialStateInitialStateParserRuleCall_11_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInitialState_in_rule__CompositeState_Impl__InitialStateAssignment_119351);
            ruleInitialState();

            state._fsp--;

             after(grammarAccess.getCompositeState_ImplAccess().getInitialStateInitialStateParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState_Impl__InitialStateAssignment_11"


    // $ANTLR start "rule__BooleanVariable__NameAssignment_1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4682:1: rule__BooleanVariable__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__BooleanVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4686:1: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4687:1: ( ruleEString )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4687:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4688:1: ruleEString
            {
             before(grammarAccess.getBooleanVariableAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BooleanVariable__NameAssignment_19382);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBooleanVariableAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__NameAssignment_1"


    // $ANTLR start "rule__BooleanVariable__ValueAssignment_4_1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4697:1: rule__BooleanVariable__ValueAssignment_4_1 : ( ruleBooleanData ) ;
    public final void rule__BooleanVariable__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4701:1: ( ( ruleBooleanData ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4702:1: ( ruleBooleanData )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4702:1: ( ruleBooleanData )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4703:1: ruleBooleanData
            {
             before(grammarAccess.getBooleanVariableAccess().getValueBooleanDataParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanData_in_rule__BooleanVariable__ValueAssignment_4_19413);
            ruleBooleanData();

            state._fsp--;

             after(grammarAccess.getBooleanVariableAccess().getValueBooleanDataParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__ValueAssignment_4_1"


    // $ANTLR start "rule__IntegerVariable__NameAssignment_1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4712:1: rule__IntegerVariable__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__IntegerVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4716:1: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4717:1: ( ruleEString )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4717:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4718:1: ruleEString
            {
             before(grammarAccess.getIntegerVariableAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__IntegerVariable__NameAssignment_19444);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntegerVariableAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__NameAssignment_1"


    // $ANTLR start "rule__IntegerVariable__ValueAssignment_4_1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4727:1: rule__IntegerVariable__ValueAssignment_4_1 : ( ruleIntegerData ) ;
    public final void rule__IntegerVariable__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4731:1: ( ( ruleIntegerData ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4732:1: ( ruleIntegerData )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4732:1: ( ruleIntegerData )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4733:1: ruleIntegerData
            {
             before(grammarAccess.getIntegerVariableAccess().getValueIntegerDataParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerData_in_rule__IntegerVariable__ValueAssignment_4_19475);
            ruleIntegerData();

            state._fsp--;

             after(grammarAccess.getIntegerVariableAccess().getValueIntegerDataParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__ValueAssignment_4_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleStateMachine_in_entryRuleStateMachine61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStateMachine68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__0_in_ruleStateMachine94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_entryRuleState121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Alternatives_in_ruleState154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__0_in_ruleVariable214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionElement_in_entryRuleExpressionElement241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpressionElement248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionElement__Alternatives_in_ruleExpressionElement274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString303 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean363 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation423 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperation430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__0_in_ruleOperation456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_Impl_in_entryRuleState_Impl483 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState_Impl490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State_Impl__Group__0_in_ruleState_Impl516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitialState_in_entryRuleInitialState543 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInitialState550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InitialState__Group__0_in_ruleInitialState576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent605 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEvent612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__0_in_ruleEvent638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment665 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__0_in_ruleAssignment698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression725 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__0_in_ruleExpression758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanData_in_entryRuleBooleanData785 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanData792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanData__ValueAssignment_in_ruleBooleanData818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerData_in_entryRuleIntegerData845 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerData852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerData__ValueAssignment_in_ruleIntegerData878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference905 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group__0_in_ruleVariableReference938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt965 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeState_Impl_in_entryRuleCompositeState_Impl1025 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompositeState_Impl1032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__0_in_ruleCompositeState_Impl1058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanVariable_in_entryRuleBooleanVariable1085 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanVariable1092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group__0_in_ruleBooleanVariable1118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerVariable_in_entryRuleIntegerVariable1145 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerVariable1152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group__0_in_ruleIntegerVariable1178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operator__Alternatives_in_ruleOperator1215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_Impl_in_rule__State__Alternatives1250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateMachine_in_rule__State__Alternatives1267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeState_Impl_in_rule__State__Alternatives1284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanVariable_in_rule__Variable__Alternatives_11316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerVariable_in_rule__Variable__Alternatives_11333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__ExpressionElement__Alternatives1365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanData_in_rule__ExpressionElement__Alternatives1382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerData_in_rule__ExpressionElement__Alternatives1399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_rule__ExpressionElement__Alternatives1416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__EBoolean__Alternatives1499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EBoolean__Alternatives1519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Operator__Alternatives1554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Operator__Alternatives1575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Operator__Alternatives1596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Operator__Alternatives1617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Operator__Alternatives1638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Operator__Alternatives1659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Operator__Alternatives1680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Operator__Alternatives1701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Operator__Alternatives1722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Operator__Alternatives1743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Operator__Alternatives1764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Operator__Alternatives1785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Operator__Alternatives1806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__0__Impl_in_rule__StateMachine__Group__01839 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__1_in_rule__StateMachine__Group__01842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__IsActiveAssignment_0_in_rule__StateMachine__Group__0__Impl1869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__1__Impl_in_rule__StateMachine__Group__11899 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__2_in_rule__StateMachine__Group__11902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__StateMachine__Group__1__Impl1930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__2__Impl_in_rule__StateMachine__Group__21961 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__3_in_rule__StateMachine__Group__21964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__NameAssignment_2_in_rule__StateMachine__Group__2__Impl1991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__3__Impl_in_rule__StateMachine__Group__32021 = new BitSet(new long[]{0x0000000090000000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__4_in_rule__StateMachine__Group__32024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__StateMachine__Group__3__Impl2052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__4__Impl_in_rule__StateMachine__Group__42083 = new BitSet(new long[]{0x0000000090000000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__5_in_rule__StateMachine__Group__42086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__VariablesAssignment_4_in_rule__StateMachine__Group__4__Impl2113 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__5__Impl_in_rule__StateMachine__Group__52144 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__6_in_rule__StateMachine__Group__52147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__StateMachine__Group__5__Impl2175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__6__Impl_in_rule__StateMachine__Group__62206 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__7_in_rule__StateMachine__Group__62209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__StateMachine__Group__6__Impl2237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__7__Impl_in_rule__StateMachine__Group__72268 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__8_in_rule__StateMachine__Group__72271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__EventsAssignment_7_in_rule__StateMachine__Group__7__Impl2298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__8__Impl_in_rule__StateMachine__Group__82328 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__9_in_rule__StateMachine__Group__82331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_8__0_in_rule__StateMachine__Group__8__Impl2358 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__9__Impl_in_rule__StateMachine__Group__92389 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__10_in_rule__StateMachine__Group__92392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__StateMachine__Group__9__Impl2420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__10__Impl_in_rule__StateMachine__Group__102451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__StateMachine__Group__10__Impl2479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_8__0__Impl_in_rule__StateMachine__Group_8__02532 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_8__1_in_rule__StateMachine__Group_8__02535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__StateMachine__Group_8__0__Impl2563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_8__1__Impl_in_rule__StateMachine__Group_8__12594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__EventsAssignment_8_1_in_rule__StateMachine__Group_8__1__Impl2621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__02655 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__02658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Variable__Group__0__Impl2686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__12717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Alternatives_1_in_rule__Variable__Group__1__Impl2744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__02778 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__02781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__12839 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__12842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Operation__Group__1__Impl2870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__22901 = new BitSet(new long[]{0x0000000220000000L});
        public static final BitSet FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__22904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Operation__Group__2__Impl2932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__32963 = new BitSet(new long[]{0x0000000220000000L});
        public static final BitSet FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__32966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_3__0_in_rule__Operation__Group__3__Impl2993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__43024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Operation__Group__4__Impl3052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_3__0__Impl_in_rule__Operation__Group_3__03093 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Operation__Group_3__1_in_rule__Operation__Group_3__03096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Operation__Group_3__0__Impl3124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_3__1__Impl_in_rule__Operation__Group_3__13155 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Operation__Group_3__2_in_rule__Operation__Group_3__13158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Operation__Group_3__1__Impl3186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_3__2__Impl_in_rule__Operation__Group_3__23217 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_rule__Operation__Group_3__3_in_rule__Operation__Group_3__23220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__ContentsAssignment_3_2_in_rule__Operation__Group_3__2__Impl3247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_3__3__Impl_in_rule__Operation__Group_3__33277 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_rule__Operation__Group_3__4_in_rule__Operation__Group_3__33280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_3_3__0_in_rule__Operation__Group_3__3__Impl3307 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_3__4__Impl_in_rule__Operation__Group_3__43338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Operation__Group_3__4__Impl3366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_3_3__0__Impl_in_rule__Operation__Group_3_3__03407 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Operation__Group_3_3__1_in_rule__Operation__Group_3_3__03410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Operation__Group_3_3__0__Impl3438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_3_3__1__Impl_in_rule__Operation__Group_3_3__13469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__ContentsAssignment_3_3_1_in_rule__Operation__Group_3_3__1__Impl3496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State_Impl__Group__0__Impl_in_rule__State_Impl__Group__03530 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__State_Impl__Group__1_in_rule__State_Impl__Group__03533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State_Impl__IsActiveAssignment_0_in_rule__State_Impl__Group__0__Impl3560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State_Impl__Group__1__Impl_in_rule__State_Impl__Group__13590 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__State_Impl__Group__2_in_rule__State_Impl__Group__13593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__State_Impl__Group__1__Impl3621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State_Impl__Group__2__Impl_in_rule__State_Impl__Group__23652 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__State_Impl__Group__3_in_rule__State_Impl__Group__23655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State_Impl__NameAssignment_2_in_rule__State_Impl__Group__2__Impl3682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State_Impl__Group__3__Impl_in_rule__State_Impl__Group__33712 = new BitSet(new long[]{0x0000000820000000L});
        public static final BitSet FOLLOW_rule__State_Impl__Group__4_in_rule__State_Impl__Group__33715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__State_Impl__Group__3__Impl3743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State_Impl__Group__4__Impl_in_rule__State_Impl__Group__43774 = new BitSet(new long[]{0x0000000820000000L});
        public static final BitSet FOLLOW_rule__State_Impl__Group__5_in_rule__State_Impl__Group__43777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State_Impl__Group_4__0_in_rule__State_Impl__Group__4__Impl3804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State_Impl__Group__5__Impl_in_rule__State_Impl__Group__53835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__State_Impl__Group__5__Impl3863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State_Impl__Group_4__0__Impl_in_rule__State_Impl__Group_4__03906 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__State_Impl__Group_4__1_in_rule__State_Impl__Group_4__03909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__State_Impl__Group_4__0__Impl3937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State_Impl__Group_4__1__Impl_in_rule__State_Impl__Group_4__13968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State_Impl__OperationAssignment_4_1_in_rule__State_Impl__Group_4__1__Impl3995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InitialState__Group__0__Impl_in_rule__InitialState__Group__04029 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__InitialState__Group__1_in_rule__InitialState__Group__04032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__InitialState__Group__0__Impl4060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InitialState__Group__1__Impl_in_rule__InitialState__Group__14091 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__InitialState__Group__2_in_rule__InitialState__Group__14094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__InitialState__Group__1__Impl4122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InitialState__Group__2__Impl_in_rule__InitialState__Group__24153 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InitialState__Group__3_in_rule__InitialState__Group__24156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__InitialState__Group__2__Impl4184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InitialState__Group__3__Impl_in_rule__InitialState__Group__34215 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__InitialState__Group__4_in_rule__InitialState__Group__34218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InitialState__ReferencedStateAssignment_3_in_rule__InitialState__Group__3__Impl4245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InitialState__Group__4__Impl_in_rule__InitialState__Group__44275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__InitialState__Group__4__Impl4303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__04346 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__04349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__14407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__NameAssignment_1_in_rule__Event__Group__1__Impl4434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__04468 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__04471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Assignment__Group__0__Impl4499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__14530 = new BitSet(new long[]{0x0000028000000000L});
        public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__14533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Assignment__Group__1__Impl4561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__24592 = new BitSet(new long[]{0x0000028000000000L});
        public static final BitSet FOLLOW_rule__Assignment__Group__3_in_rule__Assignment__Group__24595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group_2__0_in_rule__Assignment__Group__2__Impl4622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__3__Impl_in_rule__Assignment__Group__34653 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Assignment__Group__4_in_rule__Assignment__Group__34656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Assignment__Group__3__Impl4684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__4__Impl_in_rule__Assignment__Group__44715 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__Assignment__Group__5_in_rule__Assignment__Group__44718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__VariableAssignment_4_in_rule__Assignment__Group__4__Impl4745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__5__Impl_in_rule__Assignment__Group__54775 = new BitSet(new long[]{0x0000C40000001840L});
        public static final BitSet FOLLOW_rule__Assignment__Group__6_in_rule__Assignment__Group__54778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Assignment__Group__5__Impl4806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__6__Impl_in_rule__Assignment__Group__64837 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Assignment__Group__7_in_rule__Assignment__Group__64840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__ExpressionAssignment_6_in_rule__Assignment__Group__6__Impl4867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__7__Impl_in_rule__Assignment__Group__74897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Assignment__Group__7__Impl4925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group_2__0__Impl_in_rule__Assignment__Group_2__04972 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Assignment__Group_2__1_in_rule__Assignment__Group_2__04975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Assignment__Group_2__0__Impl5003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group_2__1__Impl_in_rule__Assignment__Group_2__15034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment___nameAssignment_2_1_in_rule__Assignment__Group_2__1__Impl5061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__05095 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__05098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Expression__Group__0__Impl5126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__15157 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__Expression__Group__2_in_rule__Expression__Group__15160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Expression__Group__1__Impl5188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__2__Impl_in_rule__Expression__Group__25219 = new BitSet(new long[]{0x0000000003FFE000L});
        public static final BitSet FOLLOW_rule__Expression__Group__3_in_rule__Expression__Group__25222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Expression__Group__2__Impl5250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__3__Impl_in_rule__Expression__Group__35281 = new BitSet(new long[]{0x0000120000000000L});
        public static final BitSet FOLLOW_rule__Expression__Group__4_in_rule__Expression__Group__35284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__OperatorAssignment_3_in_rule__Expression__Group__3__Impl5311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__4__Impl_in_rule__Expression__Group__45341 = new BitSet(new long[]{0x0000120000000000L});
        public static final BitSet FOLLOW_rule__Expression__Group__5_in_rule__Expression__Group__45344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group_4__0_in_rule__Expression__Group__4__Impl5371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__5__Impl_in_rule__Expression__Group__55402 = new BitSet(new long[]{0x0000C40000001840L});
        public static final BitSet FOLLOW_rule__Expression__Group__6_in_rule__Expression__Group__55405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Expression__Group__5__Impl5433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__6__Impl_in_rule__Expression__Group__65464 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__Expression__Group__7_in_rule__Expression__Group__65467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__LeftAssignment_6_in_rule__Expression__Group__6__Impl5494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__7__Impl_in_rule__Expression__Group__75524 = new BitSet(new long[]{0x0000C40000001840L});
        public static final BitSet FOLLOW_rule__Expression__Group__8_in_rule__Expression__Group__75527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Expression__Group__7__Impl5555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__8__Impl_in_rule__Expression__Group__85586 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Expression__Group__9_in_rule__Expression__Group__85589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__RightAssignment_8_in_rule__Expression__Group__8__Impl5616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__9__Impl_in_rule__Expression__Group__95646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Expression__Group__9__Impl5674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group_4__0__Impl_in_rule__Expression__Group_4__05725 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Expression__Group_4__1_in_rule__Expression__Group_4__05728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Expression__Group_4__0__Impl5756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group_4__1__Impl_in_rule__Expression__Group_4__15787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression___nameAssignment_4_1_in_rule__Expression__Group_4__1__Impl5814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group__0__Impl_in_rule__VariableReference__Group__05848 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__VariableReference__Group__1_in_rule__VariableReference__Group__05851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__VariableReference__Group__0__Impl5879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group__1__Impl_in_rule__VariableReference__Group__15910 = new BitSet(new long[]{0x0000028000000000L});
        public static final BitSet FOLLOW_rule__VariableReference__Group__2_in_rule__VariableReference__Group__15913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__VariableReference__Group__1__Impl5941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group__2__Impl_in_rule__VariableReference__Group__25972 = new BitSet(new long[]{0x0000028000000000L});
        public static final BitSet FOLLOW_rule__VariableReference__Group__3_in_rule__VariableReference__Group__25975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group_2__0_in_rule__VariableReference__Group__2__Impl6002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group__3__Impl_in_rule__VariableReference__Group__36033 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__VariableReference__Group__4_in_rule__VariableReference__Group__36036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__VariableReference__Group__3__Impl6064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group__4__Impl_in_rule__VariableReference__Group__46095 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__VariableReference__Group__5_in_rule__VariableReference__Group__46098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__VariableAssignment_4_in_rule__VariableReference__Group__4__Impl6125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group__5__Impl_in_rule__VariableReference__Group__56155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__VariableReference__Group__5__Impl6183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group_2__0__Impl_in_rule__VariableReference__Group_2__06226 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__VariableReference__Group_2__1_in_rule__VariableReference__Group_2__06229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__VariableReference__Group_2__0__Impl6257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group_2__1__Impl_in_rule__VariableReference__Group_2__16288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference___nameAssignment_2_1_in_rule__VariableReference__Group_2__1__Impl6315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__06349 = new BitSet(new long[]{0x0000800000000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__06352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__EInt__Group__0__Impl6381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__16414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl6441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__0__Impl_in_rule__CompositeState_Impl__Group__06474 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__1_in_rule__CompositeState_Impl__Group__06477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__IsActiveAssignment_0_in_rule__CompositeState_Impl__Group__0__Impl6504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__1__Impl_in_rule__CompositeState_Impl__Group__16534 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__2_in_rule__CompositeState_Impl__Group__16537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__CompositeState_Impl__Group__1__Impl6565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__2__Impl_in_rule__CompositeState_Impl__Group__26596 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__3_in_rule__CompositeState_Impl__Group__26599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__NameAssignment_2_in_rule__CompositeState_Impl__Group__2__Impl6626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__3__Impl_in_rule__CompositeState_Impl__Group__36656 = new BitSet(new long[]{0x0002000800000000L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__4_in_rule__CompositeState_Impl__Group__36659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__CompositeState_Impl__Group__3__Impl6687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__4__Impl_in_rule__CompositeState_Impl__Group__46718 = new BitSet(new long[]{0x0002000800000000L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__5_in_rule__CompositeState_Impl__Group__46721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group_4__0_in_rule__CompositeState_Impl__Group__4__Impl6748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__5__Impl_in_rule__CompositeState_Impl__Group__56779 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__6_in_rule__CompositeState_Impl__Group__56782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__CompositeState_Impl__Group__5__Impl6810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__6__Impl_in_rule__CompositeState_Impl__Group__66841 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__7_in_rule__CompositeState_Impl__Group__66844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__CompositeState_Impl__Group__6__Impl6872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__7__Impl_in_rule__CompositeState_Impl__Group__76903 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__8_in_rule__CompositeState_Impl__Group__76906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__StatesAssignment_7_in_rule__CompositeState_Impl__Group__7__Impl6933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__8__Impl_in_rule__CompositeState_Impl__Group__86963 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__9_in_rule__CompositeState_Impl__Group__86966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group_8__0_in_rule__CompositeState_Impl__Group__8__Impl6993 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__9__Impl_in_rule__CompositeState_Impl__Group__97024 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__10_in_rule__CompositeState_Impl__Group__97027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__CompositeState_Impl__Group__9__Impl7055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__10__Impl_in_rule__CompositeState_Impl__Group__107086 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__11_in_rule__CompositeState_Impl__Group__107089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__CompositeState_Impl__Group__10__Impl7117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__11__Impl_in_rule__CompositeState_Impl__Group__117148 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__12_in_rule__CompositeState_Impl__Group__117151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__InitialStateAssignment_11_in_rule__CompositeState_Impl__Group__11__Impl7178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__12__Impl_in_rule__CompositeState_Impl__Group__127208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__CompositeState_Impl__Group__12__Impl7236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group_4__0__Impl_in_rule__CompositeState_Impl__Group_4__07293 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group_4__1_in_rule__CompositeState_Impl__Group_4__07296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__CompositeState_Impl__Group_4__0__Impl7324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group_4__1__Impl_in_rule__CompositeState_Impl__Group_4__17355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__OperationAssignment_4_1_in_rule__CompositeState_Impl__Group_4__1__Impl7382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group_8__0__Impl_in_rule__CompositeState_Impl__Group_8__07416 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group_8__1_in_rule__CompositeState_Impl__Group_8__07419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__CompositeState_Impl__Group_8__0__Impl7447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group_8__1__Impl_in_rule__CompositeState_Impl__Group_8__17478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__StatesAssignment_8_1_in_rule__CompositeState_Impl__Group_8__1__Impl7505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group__0__Impl_in_rule__BooleanVariable__Group__07539 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group__1_in_rule__BooleanVariable__Group__07542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group__1__Impl_in_rule__BooleanVariable__Group__17600 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group__2_in_rule__BooleanVariable__Group__17603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__NameAssignment_1_in_rule__BooleanVariable__Group__1__Impl7630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group__2__Impl_in_rule__BooleanVariable__Group__27660 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group__3_in_rule__BooleanVariable__Group__27663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__BooleanVariable__Group__2__Impl7691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group__3__Impl_in_rule__BooleanVariable__Group__37722 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group__4_in_rule__BooleanVariable__Group__37725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__BooleanVariable__Group__3__Impl7753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group__4__Impl_in_rule__BooleanVariable__Group__47784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group_4__0_in_rule__BooleanVariable__Group__4__Impl7811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group_4__0__Impl_in_rule__BooleanVariable__Group_4__07852 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group_4__1_in_rule__BooleanVariable__Group_4__07855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__BooleanVariable__Group_4__0__Impl7883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group_4__1__Impl_in_rule__BooleanVariable__Group_4__17914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__ValueAssignment_4_1_in_rule__BooleanVariable__Group_4__1__Impl7941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group__0__Impl_in_rule__IntegerVariable__Group__07975 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group__1_in_rule__IntegerVariable__Group__07978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group__1__Impl_in_rule__IntegerVariable__Group__18036 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group__2_in_rule__IntegerVariable__Group__18039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__NameAssignment_1_in_rule__IntegerVariable__Group__1__Impl8066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group__2__Impl_in_rule__IntegerVariable__Group__28096 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group__3_in_rule__IntegerVariable__Group__28099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__IntegerVariable__Group__2__Impl8127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group__3__Impl_in_rule__IntegerVariable__Group__38158 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group__4_in_rule__IntegerVariable__Group__38161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rule__IntegerVariable__Group__3__Impl8189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group__4__Impl_in_rule__IntegerVariable__Group__48220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group_4__0_in_rule__IntegerVariable__Group__4__Impl8247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group_4__0__Impl_in_rule__IntegerVariable__Group_4__08288 = new BitSet(new long[]{0x0000800000000040L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group_4__1_in_rule__IntegerVariable__Group_4__08291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__IntegerVariable__Group_4__0__Impl8319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group_4__1__Impl_in_rule__IntegerVariable__Group_4__18350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__ValueAssignment_4_1_in_rule__IntegerVariable__Group_4__1__Impl8377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__StateMachine__IsActiveAssignment_08421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__StateMachine__NameAssignment_28460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_rule__StateMachine__VariablesAssignment_48491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvent_in_rule__StateMachine__EventsAssignment_78522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvent_in_rule__StateMachine__EventsAssignment_8_18553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_rule__Operation__ContentsAssignment_3_28584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_rule__Operation__ContentsAssignment_3_3_18615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__State_Impl__IsActiveAssignment_08651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__State_Impl__NameAssignment_28690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_rule__State_Impl__OperationAssignment_4_18721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InitialState__ReferencedStateAssignment_38756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Event__NameAssignment_18795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Assignment___nameAssignment_2_18826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Assignment__VariableAssignment_48861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionElement_in_rule__Assignment__ExpressionAssignment_68896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperator_in_rule__Expression__OperatorAssignment_38927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Expression___nameAssignment_4_18958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionElement_in_rule__Expression__LeftAssignment_68989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionElement_in_rule__Expression__RightAssignment_89020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__BooleanData__ValueAssignment9051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__IntegerData__ValueAssignment9082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__VariableReference___nameAssignment_2_19113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__VariableReference__VariableAssignment_49148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__CompositeState_Impl__IsActiveAssignment_09188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CompositeState_Impl__NameAssignment_29227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_rule__CompositeState_Impl__OperationAssignment_4_19258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_rule__CompositeState_Impl__StatesAssignment_79289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_rule__CompositeState_Impl__StatesAssignment_8_19320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitialState_in_rule__CompositeState_Impl__InitialStateAssignment_119351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BooleanVariable__NameAssignment_19382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanData_in_rule__BooleanVariable__ValueAssignment_4_19413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__IntegerVariable__NameAssignment_19444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerData_in_rule__IntegerVariable__ValueAssignment_4_19475 = new BitSet(new long[]{0x0000000000000002L});
    }


}