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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'add'", "'sub'", "'eq'", "'mul'", "'gt'", "'lt'", "'lte'", "'gte'", "'div'", "'and'", "'neq'", "'or'", "'not'", "'StateMachine'", "'{'", "'events'", "'}'", "'init with'", "','", "'var'", "';'", "'state'", "'do'", "'from'", "'to'", "'for'", "'guard'", "':='", "'Expression'", "'operator'", "'left'", "'right'", "'_name'", "'VariableReference'", "'variable'", "'-'", "':'", "'boolean'", "'integer'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:295:1: ruleInitialState : ( ( rule__InitialState__ReferencedStateAssignment ) ) ;
    public final void ruleInitialState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:299:2: ( ( ( rule__InitialState__ReferencedStateAssignment ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:300:1: ( ( rule__InitialState__ReferencedStateAssignment ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:300:1: ( ( rule__InitialState__ReferencedStateAssignment ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:301:1: ( rule__InitialState__ReferencedStateAssignment )
            {
             before(grammarAccess.getInitialStateAccess().getReferencedStateAssignment()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:302:1: ( rule__InitialState__ReferencedStateAssignment )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:302:2: rule__InitialState__ReferencedStateAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__InitialState__ReferencedStateAssignment_in_ruleInitialState576);
            rule__InitialState__ReferencedStateAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInitialStateAccess().getReferencedStateAssignment()); 

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


    // $ANTLR start "entryRuleTransition"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:314:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:315:1: ( ruleTransition EOF )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:316:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_entryRuleTransition603);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransition610); 

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:323:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:327:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:328:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:328:1: ( ( rule__Transition__Group__0 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:329:1: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:330:1: ( rule__Transition__Group__0 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:330:2: rule__Transition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__0_in_ruleTransition636);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleEvent"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:342:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:343:1: ( ruleEvent EOF )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:344:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEvent_in_entryRuleEvent663);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEvent670); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:351:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:355:2: ( ( ( rule__Event__Group__0 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:356:1: ( ( rule__Event__Group__0 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:356:1: ( ( rule__Event__Group__0 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:357:1: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:358:1: ( rule__Event__Group__0 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:358:2: rule__Event__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__0_in_ruleEvent696);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:370:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:371:1: ( ruleAssignment EOF )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:372:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment723);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment730); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:379:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:383:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:384:1: ( ( rule__Assignment__Group__0 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:384:1: ( ( rule__Assignment__Group__0 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:385:1: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:386:1: ( rule__Assignment__Group__0 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:386:2: rule__Assignment__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__0_in_ruleAssignment756);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:398:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:399:1: ( ruleExpression EOF )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:400:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression783);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression790); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:407:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:411:2: ( ( ( rule__Expression__Group__0 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:412:1: ( ( rule__Expression__Group__0 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:412:1: ( ( rule__Expression__Group__0 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:413:1: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:414:1: ( rule__Expression__Group__0 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:414:2: rule__Expression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__0_in_ruleExpression816);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:426:1: entryRuleBooleanData : ruleBooleanData EOF ;
    public final void entryRuleBooleanData() throws RecognitionException {
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:427:1: ( ruleBooleanData EOF )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:428:1: ruleBooleanData EOF
            {
             before(grammarAccess.getBooleanDataRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanData_in_entryRuleBooleanData843);
            ruleBooleanData();

            state._fsp--;

             after(grammarAccess.getBooleanDataRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanData850); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:435:1: ruleBooleanData : ( ( rule__BooleanData__ValueAssignment ) ) ;
    public final void ruleBooleanData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:439:2: ( ( ( rule__BooleanData__ValueAssignment ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:440:1: ( ( rule__BooleanData__ValueAssignment ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:440:1: ( ( rule__BooleanData__ValueAssignment ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:441:1: ( rule__BooleanData__ValueAssignment )
            {
             before(grammarAccess.getBooleanDataAccess().getValueAssignment()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:442:1: ( rule__BooleanData__ValueAssignment )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:442:2: rule__BooleanData__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanData__ValueAssignment_in_ruleBooleanData876);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:454:1: entryRuleIntegerData : ruleIntegerData EOF ;
    public final void entryRuleIntegerData() throws RecognitionException {
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:455:1: ( ruleIntegerData EOF )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:456:1: ruleIntegerData EOF
            {
             before(grammarAccess.getIntegerDataRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerData_in_entryRuleIntegerData903);
            ruleIntegerData();

            state._fsp--;

             after(grammarAccess.getIntegerDataRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerData910); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:463:1: ruleIntegerData : ( ( rule__IntegerData__ValueAssignment ) ) ;
    public final void ruleIntegerData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:467:2: ( ( ( rule__IntegerData__ValueAssignment ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:468:1: ( ( rule__IntegerData__ValueAssignment ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:468:1: ( ( rule__IntegerData__ValueAssignment ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:469:1: ( rule__IntegerData__ValueAssignment )
            {
             before(grammarAccess.getIntegerDataAccess().getValueAssignment()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:470:1: ( rule__IntegerData__ValueAssignment )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:470:2: rule__IntegerData__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerData__ValueAssignment_in_ruleIntegerData936);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:482:1: entryRuleVariableReference : ruleVariableReference EOF ;
    public final void entryRuleVariableReference() throws RecognitionException {
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:483:1: ( ruleVariableReference EOF )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:484:1: ruleVariableReference EOF
            {
             before(grammarAccess.getVariableReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_entryRuleVariableReference963);
            ruleVariableReference();

            state._fsp--;

             after(grammarAccess.getVariableReferenceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableReference970); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:491:1: ruleVariableReference : ( ( rule__VariableReference__Group__0 ) ) ;
    public final void ruleVariableReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:495:2: ( ( ( rule__VariableReference__Group__0 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:496:1: ( ( rule__VariableReference__Group__0 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:496:1: ( ( rule__VariableReference__Group__0 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:497:1: ( rule__VariableReference__Group__0 )
            {
             before(grammarAccess.getVariableReferenceAccess().getGroup()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:498:1: ( rule__VariableReference__Group__0 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:498:2: rule__VariableReference__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group__0_in_ruleVariableReference996);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:510:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:511:1: ( ruleEInt EOF )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:512:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1023);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1030); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:519:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:523:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:524:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:524:1: ( ( rule__EInt__Group__0 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:525:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:526:1: ( rule__EInt__Group__0 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:526:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt1056);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:538:1: entryRuleCompositeState_Impl : ruleCompositeState_Impl EOF ;
    public final void entryRuleCompositeState_Impl() throws RecognitionException {
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:539:1: ( ruleCompositeState_Impl EOF )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:540:1: ruleCompositeState_Impl EOF
            {
             before(grammarAccess.getCompositeState_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCompositeState_Impl_in_entryRuleCompositeState_Impl1083);
            ruleCompositeState_Impl();

            state._fsp--;

             after(grammarAccess.getCompositeState_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompositeState_Impl1090); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:547:1: ruleCompositeState_Impl : ( ( rule__CompositeState_Impl__Group__0 ) ) ;
    public final void ruleCompositeState_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:551:2: ( ( ( rule__CompositeState_Impl__Group__0 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:552:1: ( ( rule__CompositeState_Impl__Group__0 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:552:1: ( ( rule__CompositeState_Impl__Group__0 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:553:1: ( rule__CompositeState_Impl__Group__0 )
            {
             before(grammarAccess.getCompositeState_ImplAccess().getGroup()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:554:1: ( rule__CompositeState_Impl__Group__0 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:554:2: rule__CompositeState_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__0_in_ruleCompositeState_Impl1116);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:566:1: entryRuleBooleanVariable : ruleBooleanVariable EOF ;
    public final void entryRuleBooleanVariable() throws RecognitionException {
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:567:1: ( ruleBooleanVariable EOF )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:568:1: ruleBooleanVariable EOF
            {
             before(grammarAccess.getBooleanVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanVariable_in_entryRuleBooleanVariable1143);
            ruleBooleanVariable();

            state._fsp--;

             after(grammarAccess.getBooleanVariableRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanVariable1150); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:575:1: ruleBooleanVariable : ( ( rule__BooleanVariable__Group__0 ) ) ;
    public final void ruleBooleanVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:579:2: ( ( ( rule__BooleanVariable__Group__0 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:580:1: ( ( rule__BooleanVariable__Group__0 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:580:1: ( ( rule__BooleanVariable__Group__0 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:581:1: ( rule__BooleanVariable__Group__0 )
            {
             before(grammarAccess.getBooleanVariableAccess().getGroup()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:582:1: ( rule__BooleanVariable__Group__0 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:582:2: rule__BooleanVariable__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group__0_in_ruleBooleanVariable1176);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:594:1: entryRuleIntegerVariable : ruleIntegerVariable EOF ;
    public final void entryRuleIntegerVariable() throws RecognitionException {
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:595:1: ( ruleIntegerVariable EOF )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:596:1: ruleIntegerVariable EOF
            {
             before(grammarAccess.getIntegerVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerVariable_in_entryRuleIntegerVariable1203);
            ruleIntegerVariable();

            state._fsp--;

             after(grammarAccess.getIntegerVariableRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerVariable1210); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:603:1: ruleIntegerVariable : ( ( rule__IntegerVariable__Group__0 ) ) ;
    public final void ruleIntegerVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:607:2: ( ( ( rule__IntegerVariable__Group__0 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:608:1: ( ( rule__IntegerVariable__Group__0 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:608:1: ( ( rule__IntegerVariable__Group__0 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:609:1: ( rule__IntegerVariable__Group__0 )
            {
             before(grammarAccess.getIntegerVariableAccess().getGroup()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:610:1: ( rule__IntegerVariable__Group__0 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:610:2: rule__IntegerVariable__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group__0_in_ruleIntegerVariable1236);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:623:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:627:1: ( ( ( rule__Operator__Alternatives ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:628:1: ( ( rule__Operator__Alternatives ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:628:1: ( ( rule__Operator__Alternatives ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:629:1: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:630:1: ( rule__Operator__Alternatives )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:630:2: rule__Operator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operator__Alternatives_in_ruleOperator1273);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:641:1: rule__State__Alternatives : ( ( ruleState_Impl ) | ( ruleStateMachine ) | ( ruleCompositeState_Impl ) );
    public final void rule__State__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:645:1: ( ( ruleState_Impl ) | ( ruleStateMachine ) | ( ruleCompositeState_Impl ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==34) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_STRING) ) {
                    int LA1_3 = input.LA(3);

                    if ( (LA1_3==27) ) {
                        int LA1_5 = input.LA(4);

                        if ( (LA1_5==29||LA1_5==35) ) {
                            alt1=1;
                        }
                        else if ( (LA1_5==26||LA1_5==34) ) {
                            alt1=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA1_1==RULE_ID) ) {
                    int LA1_4 = input.LA(3);

                    if ( (LA1_4==27) ) {
                        int LA1_5 = input.LA(4);

                        if ( (LA1_5==29||LA1_5==35) ) {
                            alt1=1;
                        }
                        else if ( (LA1_5==26||LA1_5==34) ) {
                            alt1=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0==26) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:646:1: ( ruleState_Impl )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:646:1: ( ruleState_Impl )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:647:1: ruleState_Impl
                    {
                     before(grammarAccess.getStateAccess().getState_ImplParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleState_Impl_in_rule__State__Alternatives1308);
                    ruleState_Impl();

                    state._fsp--;

                     after(grammarAccess.getStateAccess().getState_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:652:6: ( ruleStateMachine )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:652:6: ( ruleStateMachine )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:653:1: ruleStateMachine
                    {
                     before(grammarAccess.getStateAccess().getStateMachineParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleStateMachine_in_rule__State__Alternatives1325);
                    ruleStateMachine();

                    state._fsp--;

                     after(grammarAccess.getStateAccess().getStateMachineParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:658:6: ( ruleCompositeState_Impl )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:658:6: ( ruleCompositeState_Impl )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:659:1: ruleCompositeState_Impl
                    {
                     before(grammarAccess.getStateAccess().getCompositeState_ImplParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCompositeState_Impl_in_rule__State__Alternatives1342);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:669:1: rule__Variable__Alternatives_1 : ( ( ruleBooleanVariable ) | ( ruleIntegerVariable ) );
    public final void rule__Variable__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:673:1: ( ( ruleBooleanVariable ) | ( ruleIntegerVariable ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==49) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==51) ) {
                        alt2=2;
                    }
                    else if ( (LA2_3==50) ) {
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

                if ( (LA2_2==49) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==51) ) {
                        alt2=2;
                    }
                    else if ( (LA2_3==50) ) {
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
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:674:1: ( ruleBooleanVariable )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:674:1: ( ruleBooleanVariable )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:675:1: ruleBooleanVariable
                    {
                     before(grammarAccess.getVariableAccess().getBooleanVariableParserRuleCall_1_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanVariable_in_rule__Variable__Alternatives_11374);
                    ruleBooleanVariable();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getBooleanVariableParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:680:6: ( ruleIntegerVariable )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:680:6: ( ruleIntegerVariable )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:681:1: ruleIntegerVariable
                    {
                     before(grammarAccess.getVariableAccess().getIntegerVariableParserRuleCall_1_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerVariable_in_rule__Variable__Alternatives_11391);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:691:1: rule__ExpressionElement__Alternatives : ( ( ruleExpression ) | ( ruleBooleanData ) | ( ruleIntegerData ) | ( ruleVariableReference ) );
    public final void rule__ExpressionElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:695:1: ( ( ruleExpression ) | ( ruleBooleanData ) | ( ruleIntegerData ) | ( ruleVariableReference ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 41:
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
            case 48:
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
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:696:1: ( ruleExpression )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:696:1: ( ruleExpression )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:697:1: ruleExpression
                    {
                     before(grammarAccess.getExpressionElementAccess().getExpressionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__ExpressionElement__Alternatives1423);
                    ruleExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionElementAccess().getExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:702:6: ( ruleBooleanData )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:702:6: ( ruleBooleanData )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:703:1: ruleBooleanData
                    {
                     before(grammarAccess.getExpressionElementAccess().getBooleanDataParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanData_in_rule__ExpressionElement__Alternatives1440);
                    ruleBooleanData();

                    state._fsp--;

                     after(grammarAccess.getExpressionElementAccess().getBooleanDataParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:708:6: ( ruleIntegerData )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:708:6: ( ruleIntegerData )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:709:1: ruleIntegerData
                    {
                     before(grammarAccess.getExpressionElementAccess().getIntegerDataParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerData_in_rule__ExpressionElement__Alternatives1457);
                    ruleIntegerData();

                    state._fsp--;

                     after(grammarAccess.getExpressionElementAccess().getIntegerDataParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:714:6: ( ruleVariableReference )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:714:6: ( ruleVariableReference )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:715:1: ruleVariableReference
                    {
                     before(grammarAccess.getExpressionElementAccess().getVariableReferenceParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_rule__ExpressionElement__Alternatives1474);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:726:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:730:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:731:1: ( RULE_STRING )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:731:1: ( RULE_STRING )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:732:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1507); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:737:6: ( RULE_ID )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:737:6: ( RULE_ID )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:738:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1524); 
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:748:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:752:1: ( ( 'true' ) | ( 'false' ) )
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
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:753:1: ( 'true' )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:753:1: ( 'true' )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:754:1: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__EBoolean__Alternatives1557); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:761:6: ( 'false' )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:761:6: ( 'false' )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:762:1: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__EBoolean__Alternatives1577); 
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:774:1: rule__Operator__Alternatives : ( ( ( 'add' ) ) | ( ( 'sub' ) ) | ( ( 'eq' ) ) | ( ( 'mul' ) ) | ( ( 'gt' ) ) | ( ( 'lt' ) ) | ( ( 'lte' ) ) | ( ( 'gte' ) ) | ( ( 'div' ) ) | ( ( 'and' ) ) | ( ( 'neq' ) ) | ( ( 'or' ) ) | ( ( 'not' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:778:1: ( ( ( 'add' ) ) | ( ( 'sub' ) ) | ( ( 'eq' ) ) | ( ( 'mul' ) ) | ( ( 'gt' ) ) | ( ( 'lt' ) ) | ( ( 'lte' ) ) | ( ( 'gte' ) ) | ( ( 'div' ) ) | ( ( 'and' ) ) | ( ( 'neq' ) ) | ( ( 'or' ) ) | ( ( 'not' ) ) )
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
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:779:1: ( ( 'add' ) )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:779:1: ( ( 'add' ) )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:780:1: ( 'add' )
                    {
                     before(grammarAccess.getOperatorAccess().getAddEnumLiteralDeclaration_0()); 
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:781:1: ( 'add' )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:781:3: 'add'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__Operator__Alternatives1612); 

                    }

                     after(grammarAccess.getOperatorAccess().getAddEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:786:6: ( ( 'sub' ) )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:786:6: ( ( 'sub' ) )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:787:1: ( 'sub' )
                    {
                     before(grammarAccess.getOperatorAccess().getSubEnumLiteralDeclaration_1()); 
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:788:1: ( 'sub' )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:788:3: 'sub'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__Operator__Alternatives1633); 

                    }

                     after(grammarAccess.getOperatorAccess().getSubEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:793:6: ( ( 'eq' ) )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:793:6: ( ( 'eq' ) )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:794:1: ( 'eq' )
                    {
                     before(grammarAccess.getOperatorAccess().getEqEnumLiteralDeclaration_2()); 
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:795:1: ( 'eq' )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:795:3: 'eq'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__Operator__Alternatives1654); 

                    }

                     after(grammarAccess.getOperatorAccess().getEqEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:800:6: ( ( 'mul' ) )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:800:6: ( ( 'mul' ) )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:801:1: ( 'mul' )
                    {
                     before(grammarAccess.getOperatorAccess().getMulEnumLiteralDeclaration_3()); 
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:802:1: ( 'mul' )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:802:3: 'mul'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__Operator__Alternatives1675); 

                    }

                     after(grammarAccess.getOperatorAccess().getMulEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:807:6: ( ( 'gt' ) )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:807:6: ( ( 'gt' ) )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:808:1: ( 'gt' )
                    {
                     before(grammarAccess.getOperatorAccess().getGtEnumLiteralDeclaration_4()); 
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:809:1: ( 'gt' )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:809:3: 'gt'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__Operator__Alternatives1696); 

                    }

                     after(grammarAccess.getOperatorAccess().getGtEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:814:6: ( ( 'lt' ) )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:814:6: ( ( 'lt' ) )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:815:1: ( 'lt' )
                    {
                     before(grammarAccess.getOperatorAccess().getLtEnumLiteralDeclaration_5()); 
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:816:1: ( 'lt' )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:816:3: 'lt'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__Operator__Alternatives1717); 

                    }

                     after(grammarAccess.getOperatorAccess().getLtEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:821:6: ( ( 'lte' ) )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:821:6: ( ( 'lte' ) )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:822:1: ( 'lte' )
                    {
                     before(grammarAccess.getOperatorAccess().getLteEnumLiteralDeclaration_6()); 
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:823:1: ( 'lte' )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:823:3: 'lte'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__Operator__Alternatives1738); 

                    }

                     after(grammarAccess.getOperatorAccess().getLteEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:828:6: ( ( 'gte' ) )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:828:6: ( ( 'gte' ) )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:829:1: ( 'gte' )
                    {
                     before(grammarAccess.getOperatorAccess().getGteEnumLiteralDeclaration_7()); 
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:830:1: ( 'gte' )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:830:3: 'gte'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__Operator__Alternatives1759); 

                    }

                     after(grammarAccess.getOperatorAccess().getGteEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:835:6: ( ( 'div' ) )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:835:6: ( ( 'div' ) )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:836:1: ( 'div' )
                    {
                     before(grammarAccess.getOperatorAccess().getDivEnumLiteralDeclaration_8()); 
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:837:1: ( 'div' )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:837:3: 'div'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__Operator__Alternatives1780); 

                    }

                     after(grammarAccess.getOperatorAccess().getDivEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:842:6: ( ( 'and' ) )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:842:6: ( ( 'and' ) )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:843:1: ( 'and' )
                    {
                     before(grammarAccess.getOperatorAccess().getAndEnumLiteralDeclaration_9()); 
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:844:1: ( 'and' )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:844:3: 'and'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__Operator__Alternatives1801); 

                    }

                     after(grammarAccess.getOperatorAccess().getAndEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:849:6: ( ( 'neq' ) )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:849:6: ( ( 'neq' ) )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:850:1: ( 'neq' )
                    {
                     before(grammarAccess.getOperatorAccess().getNeqEnumLiteralDeclaration_10()); 
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:851:1: ( 'neq' )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:851:3: 'neq'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__Operator__Alternatives1822); 

                    }

                     after(grammarAccess.getOperatorAccess().getNeqEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:856:6: ( ( 'or' ) )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:856:6: ( ( 'or' ) )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:857:1: ( 'or' )
                    {
                     before(grammarAccess.getOperatorAccess().getOrEnumLiteralDeclaration_11()); 
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:858:1: ( 'or' )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:858:3: 'or'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__Operator__Alternatives1843); 

                    }

                     after(grammarAccess.getOperatorAccess().getOrEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:863:6: ( ( 'not' ) )
                    {
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:863:6: ( ( 'not' ) )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:864:1: ( 'not' )
                    {
                     before(grammarAccess.getOperatorAccess().getNotEnumLiteralDeclaration_12()); 
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:865:1: ( 'not' )
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:865:3: 'not'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__Operator__Alternatives1864); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:877:1: rule__StateMachine__Group__0 : rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 ;
    public final void rule__StateMachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:881:1: ( rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:882:2: rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__0__Impl_in_rule__StateMachine__Group__01897);
            rule__StateMachine__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__1_in_rule__StateMachine__Group__01900);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:889:1: rule__StateMachine__Group__0__Impl : ( 'StateMachine' ) ;
    public final void rule__StateMachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:893:1: ( ( 'StateMachine' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:894:1: ( 'StateMachine' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:894:1: ( 'StateMachine' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:895:1: 'StateMachine'
            {
             before(grammarAccess.getStateMachineAccess().getStateMachineKeyword_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__StateMachine__Group__0__Impl1928); 
             after(grammarAccess.getStateMachineAccess().getStateMachineKeyword_0()); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:908:1: rule__StateMachine__Group__1 : rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 ;
    public final void rule__StateMachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:912:1: ( rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:913:2: rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__1__Impl_in_rule__StateMachine__Group__11959);
            rule__StateMachine__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__2_in_rule__StateMachine__Group__11962);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:920:1: rule__StateMachine__Group__1__Impl : ( ( rule__StateMachine__NameAssignment_1 ) ) ;
    public final void rule__StateMachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:924:1: ( ( ( rule__StateMachine__NameAssignment_1 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:925:1: ( ( rule__StateMachine__NameAssignment_1 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:925:1: ( ( rule__StateMachine__NameAssignment_1 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:926:1: ( rule__StateMachine__NameAssignment_1 )
            {
             before(grammarAccess.getStateMachineAccess().getNameAssignment_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:927:1: ( rule__StateMachine__NameAssignment_1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:927:2: rule__StateMachine__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__NameAssignment_1_in_rule__StateMachine__Group__1__Impl1989);
            rule__StateMachine__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getNameAssignment_1()); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:937:1: rule__StateMachine__Group__2 : rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 ;
    public final void rule__StateMachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:941:1: ( rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:942:2: rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__2__Impl_in_rule__StateMachine__Group__22019);
            rule__StateMachine__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__3_in_rule__StateMachine__Group__22022);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:949:1: rule__StateMachine__Group__2__Impl : ( '{' ) ;
    public final void rule__StateMachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:953:1: ( ( '{' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:954:1: ( '{' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:954:1: ( '{' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:955:1: '{'
            {
             before(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__StateMachine__Group__2__Impl2050); 
             after(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_2()); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:968:1: rule__StateMachine__Group__3 : rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4 ;
    public final void rule__StateMachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:972:1: ( rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:973:2: rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__3__Impl_in_rule__StateMachine__Group__32081);
            rule__StateMachine__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__4_in_rule__StateMachine__Group__32084);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:980:1: rule__StateMachine__Group__3__Impl : ( ( rule__StateMachine__VariablesAssignment_3 )* ) ;
    public final void rule__StateMachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:984:1: ( ( ( rule__StateMachine__VariablesAssignment_3 )* ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:985:1: ( ( rule__StateMachine__VariablesAssignment_3 )* )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:985:1: ( ( rule__StateMachine__VariablesAssignment_3 )* )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:986:1: ( rule__StateMachine__VariablesAssignment_3 )*
            {
             before(grammarAccess.getStateMachineAccess().getVariablesAssignment_3()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:987:1: ( rule__StateMachine__VariablesAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==32) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:987:2: rule__StateMachine__VariablesAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__StateMachine__VariablesAssignment_3_in_rule__StateMachine__Group__3__Impl2111);
            	    rule__StateMachine__VariablesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getVariablesAssignment_3()); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:997:1: rule__StateMachine__Group__4 : rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5 ;
    public final void rule__StateMachine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1001:1: ( rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1002:2: rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__4__Impl_in_rule__StateMachine__Group__42142);
            rule__StateMachine__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__5_in_rule__StateMachine__Group__42145);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1009:1: rule__StateMachine__Group__4__Impl : ( 'events' ) ;
    public final void rule__StateMachine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1013:1: ( ( 'events' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1014:1: ( 'events' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1014:1: ( 'events' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1015:1: 'events'
            {
             before(grammarAccess.getStateMachineAccess().getEventsKeyword_4()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__StateMachine__Group__4__Impl2173); 
             after(grammarAccess.getStateMachineAccess().getEventsKeyword_4()); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1028:1: rule__StateMachine__Group__5 : rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6 ;
    public final void rule__StateMachine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1032:1: ( rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1033:2: rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__5__Impl_in_rule__StateMachine__Group__52204);
            rule__StateMachine__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__6_in_rule__StateMachine__Group__52207);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1040:1: rule__StateMachine__Group__5__Impl : ( '{' ) ;
    public final void rule__StateMachine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1044:1: ( ( '{' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1045:1: ( '{' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1045:1: ( '{' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1046:1: '{'
            {
             before(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__StateMachine__Group__5__Impl2235); 
             after(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_5()); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1059:1: rule__StateMachine__Group__6 : rule__StateMachine__Group__6__Impl rule__StateMachine__Group__7 ;
    public final void rule__StateMachine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1063:1: ( rule__StateMachine__Group__6__Impl rule__StateMachine__Group__7 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1064:2: rule__StateMachine__Group__6__Impl rule__StateMachine__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__6__Impl_in_rule__StateMachine__Group__62266);
            rule__StateMachine__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__7_in_rule__StateMachine__Group__62269);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1071:1: rule__StateMachine__Group__6__Impl : ( ( rule__StateMachine__EventsAssignment_6 ) ) ;
    public final void rule__StateMachine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1075:1: ( ( ( rule__StateMachine__EventsAssignment_6 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1076:1: ( ( rule__StateMachine__EventsAssignment_6 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1076:1: ( ( rule__StateMachine__EventsAssignment_6 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1077:1: ( rule__StateMachine__EventsAssignment_6 )
            {
             before(grammarAccess.getStateMachineAccess().getEventsAssignment_6()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1078:1: ( rule__StateMachine__EventsAssignment_6 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1078:2: rule__StateMachine__EventsAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__EventsAssignment_6_in_rule__StateMachine__Group__6__Impl2296);
            rule__StateMachine__EventsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getEventsAssignment_6()); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1088:1: rule__StateMachine__Group__7 : rule__StateMachine__Group__7__Impl rule__StateMachine__Group__8 ;
    public final void rule__StateMachine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1092:1: ( rule__StateMachine__Group__7__Impl rule__StateMachine__Group__8 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1093:2: rule__StateMachine__Group__7__Impl rule__StateMachine__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__7__Impl_in_rule__StateMachine__Group__72326);
            rule__StateMachine__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__8_in_rule__StateMachine__Group__72329);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1100:1: rule__StateMachine__Group__7__Impl : ( ( rule__StateMachine__Group_7__0 )* ) ;
    public final void rule__StateMachine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1104:1: ( ( ( rule__StateMachine__Group_7__0 )* ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1105:1: ( ( rule__StateMachine__Group_7__0 )* )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1105:1: ( ( rule__StateMachine__Group_7__0 )* )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1106:1: ( rule__StateMachine__Group_7__0 )*
            {
             before(grammarAccess.getStateMachineAccess().getGroup_7()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1107:1: ( rule__StateMachine__Group_7__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==31) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1107:2: rule__StateMachine__Group_7__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_7__0_in_rule__StateMachine__Group__7__Impl2356);
            	    rule__StateMachine__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getGroup_7()); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1117:1: rule__StateMachine__Group__8 : rule__StateMachine__Group__8__Impl rule__StateMachine__Group__9 ;
    public final void rule__StateMachine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1121:1: ( rule__StateMachine__Group__8__Impl rule__StateMachine__Group__9 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1122:2: rule__StateMachine__Group__8__Impl rule__StateMachine__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__8__Impl_in_rule__StateMachine__Group__82387);
            rule__StateMachine__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__9_in_rule__StateMachine__Group__82390);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1129:1: rule__StateMachine__Group__8__Impl : ( '}' ) ;
    public final void rule__StateMachine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1133:1: ( ( '}' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1134:1: ( '}' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1134:1: ( '}' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1135:1: '}'
            {
             before(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_8()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__StateMachine__Group__8__Impl2418); 
             after(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_8()); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1148:1: rule__StateMachine__Group__9 : rule__StateMachine__Group__9__Impl rule__StateMachine__Group__10 ;
    public final void rule__StateMachine__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1152:1: ( rule__StateMachine__Group__9__Impl rule__StateMachine__Group__10 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1153:2: rule__StateMachine__Group__9__Impl rule__StateMachine__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__9__Impl_in_rule__StateMachine__Group__92449);
            rule__StateMachine__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__10_in_rule__StateMachine__Group__92452);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1160:1: rule__StateMachine__Group__9__Impl : ( ( ( rule__StateMachine__StatesAssignment_9 ) ) ( ( rule__StateMachine__StatesAssignment_9 )* ) ) ;
    public final void rule__StateMachine__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1164:1: ( ( ( ( rule__StateMachine__StatesAssignment_9 ) ) ( ( rule__StateMachine__StatesAssignment_9 )* ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1165:1: ( ( ( rule__StateMachine__StatesAssignment_9 ) ) ( ( rule__StateMachine__StatesAssignment_9 )* ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1165:1: ( ( ( rule__StateMachine__StatesAssignment_9 ) ) ( ( rule__StateMachine__StatesAssignment_9 )* ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1166:1: ( ( rule__StateMachine__StatesAssignment_9 ) ) ( ( rule__StateMachine__StatesAssignment_9 )* )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1166:1: ( ( rule__StateMachine__StatesAssignment_9 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1167:1: ( rule__StateMachine__StatesAssignment_9 )
            {
             before(grammarAccess.getStateMachineAccess().getStatesAssignment_9()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1168:1: ( rule__StateMachine__StatesAssignment_9 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1168:2: rule__StateMachine__StatesAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__StatesAssignment_9_in_rule__StateMachine__Group__9__Impl2481);
            rule__StateMachine__StatesAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getStatesAssignment_9()); 

            }

            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1171:1: ( ( rule__StateMachine__StatesAssignment_9 )* )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1172:1: ( rule__StateMachine__StatesAssignment_9 )*
            {
             before(grammarAccess.getStateMachineAccess().getStatesAssignment_9()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1173:1: ( rule__StateMachine__StatesAssignment_9 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26||LA9_0==34) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1173:2: rule__StateMachine__StatesAssignment_9
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__StateMachine__StatesAssignment_9_in_rule__StateMachine__Group__9__Impl2493);
            	    rule__StateMachine__StatesAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getStatesAssignment_9()); 

            }


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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1184:1: rule__StateMachine__Group__10 : rule__StateMachine__Group__10__Impl rule__StateMachine__Group__11 ;
    public final void rule__StateMachine__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1188:1: ( rule__StateMachine__Group__10__Impl rule__StateMachine__Group__11 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1189:2: rule__StateMachine__Group__10__Impl rule__StateMachine__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__10__Impl_in_rule__StateMachine__Group__102526);
            rule__StateMachine__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__11_in_rule__StateMachine__Group__102529);
            rule__StateMachine__Group__11();

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1196:1: rule__StateMachine__Group__10__Impl : ( 'init with' ) ;
    public final void rule__StateMachine__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1200:1: ( ( 'init with' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1201:1: ( 'init with' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1201:1: ( 'init with' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1202:1: 'init with'
            {
             before(grammarAccess.getStateMachineAccess().getInitWithKeyword_10()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__StateMachine__Group__10__Impl2557); 
             after(grammarAccess.getStateMachineAccess().getInitWithKeyword_10()); 

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


    // $ANTLR start "rule__StateMachine__Group__11"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1215:1: rule__StateMachine__Group__11 : rule__StateMachine__Group__11__Impl rule__StateMachine__Group__12 ;
    public final void rule__StateMachine__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1219:1: ( rule__StateMachine__Group__11__Impl rule__StateMachine__Group__12 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1220:2: rule__StateMachine__Group__11__Impl rule__StateMachine__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__11__Impl_in_rule__StateMachine__Group__112588);
            rule__StateMachine__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__12_in_rule__StateMachine__Group__112591);
            rule__StateMachine__Group__12();

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
    // $ANTLR end "rule__StateMachine__Group__11"


    // $ANTLR start "rule__StateMachine__Group__11__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1227:1: rule__StateMachine__Group__11__Impl : ( ( rule__StateMachine__InitialStateAssignment_11 ) ) ;
    public final void rule__StateMachine__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1231:1: ( ( ( rule__StateMachine__InitialStateAssignment_11 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1232:1: ( ( rule__StateMachine__InitialStateAssignment_11 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1232:1: ( ( rule__StateMachine__InitialStateAssignment_11 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1233:1: ( rule__StateMachine__InitialStateAssignment_11 )
            {
             before(grammarAccess.getStateMachineAccess().getInitialStateAssignment_11()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1234:1: ( rule__StateMachine__InitialStateAssignment_11 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1234:2: rule__StateMachine__InitialStateAssignment_11
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__InitialStateAssignment_11_in_rule__StateMachine__Group__11__Impl2618);
            rule__StateMachine__InitialStateAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getInitialStateAssignment_11()); 

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
    // $ANTLR end "rule__StateMachine__Group__11__Impl"


    // $ANTLR start "rule__StateMachine__Group__12"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1244:1: rule__StateMachine__Group__12 : rule__StateMachine__Group__12__Impl rule__StateMachine__Group__13 ;
    public final void rule__StateMachine__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1248:1: ( rule__StateMachine__Group__12__Impl rule__StateMachine__Group__13 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1249:2: rule__StateMachine__Group__12__Impl rule__StateMachine__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__12__Impl_in_rule__StateMachine__Group__122648);
            rule__StateMachine__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__13_in_rule__StateMachine__Group__122651);
            rule__StateMachine__Group__13();

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
    // $ANTLR end "rule__StateMachine__Group__12"


    // $ANTLR start "rule__StateMachine__Group__12__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1256:1: rule__StateMachine__Group__12__Impl : ( ( ( rule__StateMachine__TransitionsAssignment_12 ) ) ( ( rule__StateMachine__TransitionsAssignment_12 )* ) ) ;
    public final void rule__StateMachine__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1260:1: ( ( ( ( rule__StateMachine__TransitionsAssignment_12 ) ) ( ( rule__StateMachine__TransitionsAssignment_12 )* ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1261:1: ( ( ( rule__StateMachine__TransitionsAssignment_12 ) ) ( ( rule__StateMachine__TransitionsAssignment_12 )* ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1261:1: ( ( ( rule__StateMachine__TransitionsAssignment_12 ) ) ( ( rule__StateMachine__TransitionsAssignment_12 )* ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1262:1: ( ( rule__StateMachine__TransitionsAssignment_12 ) ) ( ( rule__StateMachine__TransitionsAssignment_12 )* )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1262:1: ( ( rule__StateMachine__TransitionsAssignment_12 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1263:1: ( rule__StateMachine__TransitionsAssignment_12 )
            {
             before(grammarAccess.getStateMachineAccess().getTransitionsAssignment_12()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1264:1: ( rule__StateMachine__TransitionsAssignment_12 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1264:2: rule__StateMachine__TransitionsAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__TransitionsAssignment_12_in_rule__StateMachine__Group__12__Impl2680);
            rule__StateMachine__TransitionsAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getTransitionsAssignment_12()); 

            }

            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1267:1: ( ( rule__StateMachine__TransitionsAssignment_12 )* )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1268:1: ( rule__StateMachine__TransitionsAssignment_12 )*
            {
             before(grammarAccess.getStateMachineAccess().getTransitionsAssignment_12()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1269:1: ( rule__StateMachine__TransitionsAssignment_12 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==36) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1269:2: rule__StateMachine__TransitionsAssignment_12
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__StateMachine__TransitionsAssignment_12_in_rule__StateMachine__Group__12__Impl2692);
            	    rule__StateMachine__TransitionsAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getTransitionsAssignment_12()); 

            }


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
    // $ANTLR end "rule__StateMachine__Group__12__Impl"


    // $ANTLR start "rule__StateMachine__Group__13"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1280:1: rule__StateMachine__Group__13 : rule__StateMachine__Group__13__Impl ;
    public final void rule__StateMachine__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1284:1: ( rule__StateMachine__Group__13__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1285:2: rule__StateMachine__Group__13__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__13__Impl_in_rule__StateMachine__Group__132725);
            rule__StateMachine__Group__13__Impl();

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
    // $ANTLR end "rule__StateMachine__Group__13"


    // $ANTLR start "rule__StateMachine__Group__13__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1291:1: rule__StateMachine__Group__13__Impl : ( '}' ) ;
    public final void rule__StateMachine__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1295:1: ( ( '}' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1296:1: ( '}' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1296:1: ( '}' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1297:1: '}'
            {
             before(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_13()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__StateMachine__Group__13__Impl2753); 
             after(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_13()); 

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
    // $ANTLR end "rule__StateMachine__Group__13__Impl"


    // $ANTLR start "rule__StateMachine__Group_7__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1338:1: rule__StateMachine__Group_7__0 : rule__StateMachine__Group_7__0__Impl rule__StateMachine__Group_7__1 ;
    public final void rule__StateMachine__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1342:1: ( rule__StateMachine__Group_7__0__Impl rule__StateMachine__Group_7__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1343:2: rule__StateMachine__Group_7__0__Impl rule__StateMachine__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_7__0__Impl_in_rule__StateMachine__Group_7__02812);
            rule__StateMachine__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_7__1_in_rule__StateMachine__Group_7__02815);
            rule__StateMachine__Group_7__1();

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
    // $ANTLR end "rule__StateMachine__Group_7__0"


    // $ANTLR start "rule__StateMachine__Group_7__0__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1350:1: rule__StateMachine__Group_7__0__Impl : ( ',' ) ;
    public final void rule__StateMachine__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1354:1: ( ( ',' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1355:1: ( ',' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1355:1: ( ',' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1356:1: ','
            {
             before(grammarAccess.getStateMachineAccess().getCommaKeyword_7_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__StateMachine__Group_7__0__Impl2843); 
             after(grammarAccess.getStateMachineAccess().getCommaKeyword_7_0()); 

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
    // $ANTLR end "rule__StateMachine__Group_7__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_7__1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1369:1: rule__StateMachine__Group_7__1 : rule__StateMachine__Group_7__1__Impl ;
    public final void rule__StateMachine__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1373:1: ( rule__StateMachine__Group_7__1__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1374:2: rule__StateMachine__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_7__1__Impl_in_rule__StateMachine__Group_7__12874);
            rule__StateMachine__Group_7__1__Impl();

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
    // $ANTLR end "rule__StateMachine__Group_7__1"


    // $ANTLR start "rule__StateMachine__Group_7__1__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1380:1: rule__StateMachine__Group_7__1__Impl : ( ( rule__StateMachine__EventsAssignment_7_1 ) ) ;
    public final void rule__StateMachine__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1384:1: ( ( ( rule__StateMachine__EventsAssignment_7_1 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1385:1: ( ( rule__StateMachine__EventsAssignment_7_1 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1385:1: ( ( rule__StateMachine__EventsAssignment_7_1 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1386:1: ( rule__StateMachine__EventsAssignment_7_1 )
            {
             before(grammarAccess.getStateMachineAccess().getEventsAssignment_7_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1387:1: ( rule__StateMachine__EventsAssignment_7_1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1387:2: rule__StateMachine__EventsAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__EventsAssignment_7_1_in_rule__StateMachine__Group_7__1__Impl2901);
            rule__StateMachine__EventsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getEventsAssignment_7_1()); 

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
    // $ANTLR end "rule__StateMachine__Group_7__1__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1401:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1405:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1406:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__02935);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__02938);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1413:1: rule__Variable__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1417:1: ( ( 'var' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1418:1: ( 'var' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1418:1: ( 'var' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1419:1: 'var'
            {
             before(grammarAccess.getVariableAccess().getVarKeyword_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Variable__Group__0__Impl2966); 
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1432:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1436:1: ( rule__Variable__Group__1__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1437:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__12997);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1443:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__Alternatives_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1447:1: ( ( ( rule__Variable__Alternatives_1 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1448:1: ( ( rule__Variable__Alternatives_1 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1448:1: ( ( rule__Variable__Alternatives_1 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1449:1: ( rule__Variable__Alternatives_1 )
            {
             before(grammarAccess.getVariableAccess().getAlternatives_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1450:1: ( rule__Variable__Alternatives_1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1450:2: rule__Variable__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Alternatives_1_in_rule__Variable__Group__1__Impl3024);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1464:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1468:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1469:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__03058);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__03061);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1476:1: rule__Operation__Group__0__Impl : ( () ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1480:1: ( ( () ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1481:1: ( () )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1481:1: ( () )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1482:1: ()
            {
             before(grammarAccess.getOperationAccess().getOperationAction_0()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1483:1: ()
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1485:1: 
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1495:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1499:1: ( rule__Operation__Group__1__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1500:2: rule__Operation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__13119);
            rule__Operation__Group__1__Impl();

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1506:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__Group_1__0 )? ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1510:1: ( ( ( rule__Operation__Group_1__0 )? ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1511:1: ( ( rule__Operation__Group_1__0 )? )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1511:1: ( ( rule__Operation__Group_1__0 )? )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1512:1: ( rule__Operation__Group_1__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1513:1: ( rule__Operation__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1513:2: rule__Operation__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_1__0_in_rule__Operation__Group__1__Impl3146);
                    rule__Operation__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_1()); 

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


    // $ANTLR start "rule__Operation__Group_1__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1527:1: rule__Operation__Group_1__0 : rule__Operation__Group_1__0__Impl rule__Operation__Group_1__1 ;
    public final void rule__Operation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1531:1: ( rule__Operation__Group_1__0__Impl rule__Operation__Group_1__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1532:2: rule__Operation__Group_1__0__Impl rule__Operation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_1__0__Impl_in_rule__Operation__Group_1__03181);
            rule__Operation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_1__1_in_rule__Operation__Group_1__03184);
            rule__Operation__Group_1__1();

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
    // $ANTLR end "rule__Operation__Group_1__0"


    // $ANTLR start "rule__Operation__Group_1__0__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1539:1: rule__Operation__Group_1__0__Impl : ( '{' ) ;
    public final void rule__Operation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1543:1: ( ( '{' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1544:1: ( '{' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1544:1: ( '{' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1545:1: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Operation__Group_1__0__Impl3212); 
             after(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_1_0()); 

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
    // $ANTLR end "rule__Operation__Group_1__0__Impl"


    // $ANTLR start "rule__Operation__Group_1__1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1558:1: rule__Operation__Group_1__1 : rule__Operation__Group_1__1__Impl rule__Operation__Group_1__2 ;
    public final void rule__Operation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1562:1: ( rule__Operation__Group_1__1__Impl rule__Operation__Group_1__2 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1563:2: rule__Operation__Group_1__1__Impl rule__Operation__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_1__1__Impl_in_rule__Operation__Group_1__13243);
            rule__Operation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_1__2_in_rule__Operation__Group_1__13246);
            rule__Operation__Group_1__2();

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
    // $ANTLR end "rule__Operation__Group_1__1"


    // $ANTLR start "rule__Operation__Group_1__1__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1570:1: rule__Operation__Group_1__1__Impl : ( ( rule__Operation__ContentsAssignment_1_1 ) ) ;
    public final void rule__Operation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1574:1: ( ( ( rule__Operation__ContentsAssignment_1_1 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1575:1: ( ( rule__Operation__ContentsAssignment_1_1 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1575:1: ( ( rule__Operation__ContentsAssignment_1_1 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1576:1: ( rule__Operation__ContentsAssignment_1_1 )
            {
             before(grammarAccess.getOperationAccess().getContentsAssignment_1_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1577:1: ( rule__Operation__ContentsAssignment_1_1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1577:2: rule__Operation__ContentsAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__ContentsAssignment_1_1_in_rule__Operation__Group_1__1__Impl3273);
            rule__Operation__ContentsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getContentsAssignment_1_1()); 

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
    // $ANTLR end "rule__Operation__Group_1__1__Impl"


    // $ANTLR start "rule__Operation__Group_1__2"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1587:1: rule__Operation__Group_1__2 : rule__Operation__Group_1__2__Impl rule__Operation__Group_1__3 ;
    public final void rule__Operation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1591:1: ( rule__Operation__Group_1__2__Impl rule__Operation__Group_1__3 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1592:2: rule__Operation__Group_1__2__Impl rule__Operation__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_1__2__Impl_in_rule__Operation__Group_1__23303);
            rule__Operation__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_1__3_in_rule__Operation__Group_1__23306);
            rule__Operation__Group_1__3();

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
    // $ANTLR end "rule__Operation__Group_1__2"


    // $ANTLR start "rule__Operation__Group_1__2__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1599:1: rule__Operation__Group_1__2__Impl : ( ( rule__Operation__Group_1_2__0 )* ) ;
    public final void rule__Operation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1603:1: ( ( ( rule__Operation__Group_1_2__0 )* ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1604:1: ( ( rule__Operation__Group_1_2__0 )* )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1604:1: ( ( rule__Operation__Group_1_2__0 )* )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1605:1: ( rule__Operation__Group_1_2__0 )*
            {
             before(grammarAccess.getOperationAccess().getGroup_1_2()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1606:1: ( rule__Operation__Group_1_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1606:2: rule__Operation__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_1_2__0_in_rule__Operation__Group_1__2__Impl3333);
            	    rule__Operation__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getOperationAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__Operation__Group_1__2__Impl"


    // $ANTLR start "rule__Operation__Group_1__3"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1616:1: rule__Operation__Group_1__3 : rule__Operation__Group_1__3__Impl ;
    public final void rule__Operation__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1620:1: ( rule__Operation__Group_1__3__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1621:2: rule__Operation__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_1__3__Impl_in_rule__Operation__Group_1__33364);
            rule__Operation__Group_1__3__Impl();

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
    // $ANTLR end "rule__Operation__Group_1__3"


    // $ANTLR start "rule__Operation__Group_1__3__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1627:1: rule__Operation__Group_1__3__Impl : ( '}' ) ;
    public final void rule__Operation__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1631:1: ( ( '}' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1632:1: ( '}' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1632:1: ( '}' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1633:1: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Operation__Group_1__3__Impl3392); 
             after(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_1_3()); 

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
    // $ANTLR end "rule__Operation__Group_1__3__Impl"


    // $ANTLR start "rule__Operation__Group_1_2__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1654:1: rule__Operation__Group_1_2__0 : rule__Operation__Group_1_2__0__Impl rule__Operation__Group_1_2__1 ;
    public final void rule__Operation__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1658:1: ( rule__Operation__Group_1_2__0__Impl rule__Operation__Group_1_2__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1659:2: rule__Operation__Group_1_2__0__Impl rule__Operation__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_1_2__0__Impl_in_rule__Operation__Group_1_2__03431);
            rule__Operation__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_1_2__1_in_rule__Operation__Group_1_2__03434);
            rule__Operation__Group_1_2__1();

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
    // $ANTLR end "rule__Operation__Group_1_2__0"


    // $ANTLR start "rule__Operation__Group_1_2__0__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1666:1: rule__Operation__Group_1_2__0__Impl : ( ';' ) ;
    public final void rule__Operation__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1670:1: ( ( ';' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1671:1: ( ';' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1671:1: ( ';' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1672:1: ';'
            {
             before(grammarAccess.getOperationAccess().getSemicolonKeyword_1_2_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Operation__Group_1_2__0__Impl3462); 
             after(grammarAccess.getOperationAccess().getSemicolonKeyword_1_2_0()); 

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
    // $ANTLR end "rule__Operation__Group_1_2__0__Impl"


    // $ANTLR start "rule__Operation__Group_1_2__1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1685:1: rule__Operation__Group_1_2__1 : rule__Operation__Group_1_2__1__Impl ;
    public final void rule__Operation__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1689:1: ( rule__Operation__Group_1_2__1__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1690:2: rule__Operation__Group_1_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_1_2__1__Impl_in_rule__Operation__Group_1_2__13493);
            rule__Operation__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__Operation__Group_1_2__1"


    // $ANTLR start "rule__Operation__Group_1_2__1__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1696:1: rule__Operation__Group_1_2__1__Impl : ( ( rule__Operation__ContentsAssignment_1_2_1 ) ) ;
    public final void rule__Operation__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1700:1: ( ( ( rule__Operation__ContentsAssignment_1_2_1 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1701:1: ( ( rule__Operation__ContentsAssignment_1_2_1 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1701:1: ( ( rule__Operation__ContentsAssignment_1_2_1 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1702:1: ( rule__Operation__ContentsAssignment_1_2_1 )
            {
             before(grammarAccess.getOperationAccess().getContentsAssignment_1_2_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1703:1: ( rule__Operation__ContentsAssignment_1_2_1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1703:2: rule__Operation__ContentsAssignment_1_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__ContentsAssignment_1_2_1_in_rule__Operation__Group_1_2__1__Impl3520);
            rule__Operation__ContentsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getContentsAssignment_1_2_1()); 

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
    // $ANTLR end "rule__Operation__Group_1_2__1__Impl"


    // $ANTLR start "rule__State_Impl__Group__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1717:1: rule__State_Impl__Group__0 : rule__State_Impl__Group__0__Impl rule__State_Impl__Group__1 ;
    public final void rule__State_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1721:1: ( rule__State_Impl__Group__0__Impl rule__State_Impl__Group__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1722:2: rule__State_Impl__Group__0__Impl rule__State_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State_Impl__Group__0__Impl_in_rule__State_Impl__Group__03554);
            rule__State_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State_Impl__Group__1_in_rule__State_Impl__Group__03557);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1729:1: rule__State_Impl__Group__0__Impl : ( 'state' ) ;
    public final void rule__State_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1733:1: ( ( 'state' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1734:1: ( 'state' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1734:1: ( 'state' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1735:1: 'state'
            {
             before(grammarAccess.getState_ImplAccess().getStateKeyword_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__State_Impl__Group__0__Impl3585); 
             after(grammarAccess.getState_ImplAccess().getStateKeyword_0()); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1748:1: rule__State_Impl__Group__1 : rule__State_Impl__Group__1__Impl rule__State_Impl__Group__2 ;
    public final void rule__State_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1752:1: ( rule__State_Impl__Group__1__Impl rule__State_Impl__Group__2 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1753:2: rule__State_Impl__Group__1__Impl rule__State_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State_Impl__Group__1__Impl_in_rule__State_Impl__Group__13616);
            rule__State_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State_Impl__Group__2_in_rule__State_Impl__Group__13619);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1760:1: rule__State_Impl__Group__1__Impl : ( ( rule__State_Impl__NameAssignment_1 ) ) ;
    public final void rule__State_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1764:1: ( ( ( rule__State_Impl__NameAssignment_1 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1765:1: ( ( rule__State_Impl__NameAssignment_1 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1765:1: ( ( rule__State_Impl__NameAssignment_1 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1766:1: ( rule__State_Impl__NameAssignment_1 )
            {
             before(grammarAccess.getState_ImplAccess().getNameAssignment_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1767:1: ( rule__State_Impl__NameAssignment_1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1767:2: rule__State_Impl__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State_Impl__NameAssignment_1_in_rule__State_Impl__Group__1__Impl3646);
            rule__State_Impl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getState_ImplAccess().getNameAssignment_1()); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1777:1: rule__State_Impl__Group__2 : rule__State_Impl__Group__2__Impl rule__State_Impl__Group__3 ;
    public final void rule__State_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1781:1: ( rule__State_Impl__Group__2__Impl rule__State_Impl__Group__3 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1782:2: rule__State_Impl__Group__2__Impl rule__State_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__State_Impl__Group__2__Impl_in_rule__State_Impl__Group__23676);
            rule__State_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State_Impl__Group__3_in_rule__State_Impl__Group__23679);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1789:1: rule__State_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__State_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1793:1: ( ( '{' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1794:1: ( '{' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1794:1: ( '{' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1795:1: '{'
            {
             before(grammarAccess.getState_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__State_Impl__Group__2__Impl3707); 
             after(grammarAccess.getState_ImplAccess().getLeftCurlyBracketKeyword_2()); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1808:1: rule__State_Impl__Group__3 : rule__State_Impl__Group__3__Impl rule__State_Impl__Group__4 ;
    public final void rule__State_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1812:1: ( rule__State_Impl__Group__3__Impl rule__State_Impl__Group__4 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1813:2: rule__State_Impl__Group__3__Impl rule__State_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__State_Impl__Group__3__Impl_in_rule__State_Impl__Group__33738);
            rule__State_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State_Impl__Group__4_in_rule__State_Impl__Group__33741);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1820:1: rule__State_Impl__Group__3__Impl : ( ( rule__State_Impl__Group_3__0 )? ) ;
    public final void rule__State_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1824:1: ( ( ( rule__State_Impl__Group_3__0 )? ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1825:1: ( ( rule__State_Impl__Group_3__0 )? )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1825:1: ( ( rule__State_Impl__Group_3__0 )? )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1826:1: ( rule__State_Impl__Group_3__0 )?
            {
             before(grammarAccess.getState_ImplAccess().getGroup_3()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1827:1: ( rule__State_Impl__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1827:2: rule__State_Impl__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__State_Impl__Group_3__0_in_rule__State_Impl__Group__3__Impl3768);
                    rule__State_Impl__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getState_ImplAccess().getGroup_3()); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1837:1: rule__State_Impl__Group__4 : rule__State_Impl__Group__4__Impl ;
    public final void rule__State_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1841:1: ( rule__State_Impl__Group__4__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1842:2: rule__State_Impl__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State_Impl__Group__4__Impl_in_rule__State_Impl__Group__43799);
            rule__State_Impl__Group__4__Impl();

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1848:1: rule__State_Impl__Group__4__Impl : ( '}' ) ;
    public final void rule__State_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1852:1: ( ( '}' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1853:1: ( '}' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1853:1: ( '}' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1854:1: '}'
            {
             before(grammarAccess.getState_ImplAccess().getRightCurlyBracketKeyword_4()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__State_Impl__Group__4__Impl3827); 
             after(grammarAccess.getState_ImplAccess().getRightCurlyBracketKeyword_4()); 

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


    // $ANTLR start "rule__State_Impl__Group_3__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1877:1: rule__State_Impl__Group_3__0 : rule__State_Impl__Group_3__0__Impl rule__State_Impl__Group_3__1 ;
    public final void rule__State_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1881:1: ( rule__State_Impl__Group_3__0__Impl rule__State_Impl__Group_3__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1882:2: rule__State_Impl__Group_3__0__Impl rule__State_Impl__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State_Impl__Group_3__0__Impl_in_rule__State_Impl__Group_3__03868);
            rule__State_Impl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State_Impl__Group_3__1_in_rule__State_Impl__Group_3__03871);
            rule__State_Impl__Group_3__1();

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
    // $ANTLR end "rule__State_Impl__Group_3__0"


    // $ANTLR start "rule__State_Impl__Group_3__0__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1889:1: rule__State_Impl__Group_3__0__Impl : ( 'do' ) ;
    public final void rule__State_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1893:1: ( ( 'do' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1894:1: ( 'do' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1894:1: ( 'do' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1895:1: 'do'
            {
             before(grammarAccess.getState_ImplAccess().getDoKeyword_3_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__State_Impl__Group_3__0__Impl3899); 
             after(grammarAccess.getState_ImplAccess().getDoKeyword_3_0()); 

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
    // $ANTLR end "rule__State_Impl__Group_3__0__Impl"


    // $ANTLR start "rule__State_Impl__Group_3__1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1908:1: rule__State_Impl__Group_3__1 : rule__State_Impl__Group_3__1__Impl ;
    public final void rule__State_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1912:1: ( rule__State_Impl__Group_3__1__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1913:2: rule__State_Impl__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State_Impl__Group_3__1__Impl_in_rule__State_Impl__Group_3__13930);
            rule__State_Impl__Group_3__1__Impl();

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
    // $ANTLR end "rule__State_Impl__Group_3__1"


    // $ANTLR start "rule__State_Impl__Group_3__1__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1919:1: rule__State_Impl__Group_3__1__Impl : ( ( rule__State_Impl__OperationAssignment_3_1 ) ) ;
    public final void rule__State_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1923:1: ( ( ( rule__State_Impl__OperationAssignment_3_1 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1924:1: ( ( rule__State_Impl__OperationAssignment_3_1 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1924:1: ( ( rule__State_Impl__OperationAssignment_3_1 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1925:1: ( rule__State_Impl__OperationAssignment_3_1 )
            {
             before(grammarAccess.getState_ImplAccess().getOperationAssignment_3_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1926:1: ( rule__State_Impl__OperationAssignment_3_1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1926:2: rule__State_Impl__OperationAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State_Impl__OperationAssignment_3_1_in_rule__State_Impl__Group_3__1__Impl3957);
            rule__State_Impl__OperationAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getState_ImplAccess().getOperationAssignment_3_1()); 

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
    // $ANTLR end "rule__State_Impl__Group_3__1__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1940:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1944:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1945:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__03991);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__03994);
            rule__Transition__Group__1();

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
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1952:1: rule__Transition__Group__0__Impl : ( 'from' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1956:1: ( ( 'from' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1957:1: ( 'from' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1957:1: ( 'from' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1958:1: 'from'
            {
             before(grammarAccess.getTransitionAccess().getFromKeyword_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Transition__Group__0__Impl4022); 
             after(grammarAccess.getTransitionAccess().getFromKeyword_0()); 

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
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1971:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1975:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1976:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__14053);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__14056);
            rule__Transition__Group__2();

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
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1983:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__SourceAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1987:1: ( ( ( rule__Transition__SourceAssignment_1 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1988:1: ( ( rule__Transition__SourceAssignment_1 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1988:1: ( ( rule__Transition__SourceAssignment_1 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1989:1: ( rule__Transition__SourceAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getSourceAssignment_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1990:1: ( rule__Transition__SourceAssignment_1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:1990:2: rule__Transition__SourceAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__SourceAssignment_1_in_rule__Transition__Group__1__Impl4083);
            rule__Transition__SourceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getSourceAssignment_1()); 

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
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2000:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2004:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2005:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__24113);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__24116);
            rule__Transition__Group__3();

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
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2012:1: rule__Transition__Group__2__Impl : ( 'to' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2016:1: ( ( 'to' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2017:1: ( 'to' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2017:1: ( 'to' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2018:1: 'to'
            {
             before(grammarAccess.getTransitionAccess().getToKeyword_2()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Transition__Group__2__Impl4144); 
             after(grammarAccess.getTransitionAccess().getToKeyword_2()); 

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
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2031:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2035:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2036:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__34175);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__34178);
            rule__Transition__Group__4();

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
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2043:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__TargetAssignment_3 ) ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2047:1: ( ( ( rule__Transition__TargetAssignment_3 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2048:1: ( ( rule__Transition__TargetAssignment_3 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2048:1: ( ( rule__Transition__TargetAssignment_3 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2049:1: ( rule__Transition__TargetAssignment_3 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_3()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2050:1: ( rule__Transition__TargetAssignment_3 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2050:2: rule__Transition__TargetAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__TargetAssignment_3_in_rule__Transition__Group__3__Impl4205);
            rule__Transition__TargetAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTargetAssignment_3()); 

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
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2060:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2064:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2065:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__44235);
            rule__Transition__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__5_in_rule__Transition__Group__44238);
            rule__Transition__Group__5();

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
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2072:1: rule__Transition__Group__4__Impl : ( 'for' ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2076:1: ( ( 'for' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2077:1: ( 'for' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2077:1: ( 'for' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2078:1: 'for'
            {
             before(grammarAccess.getTransitionAccess().getForKeyword_4()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Transition__Group__4__Impl4266); 
             after(grammarAccess.getTransitionAccess().getForKeyword_4()); 

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
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group__5"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2091:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl rule__Transition__Group__6 ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2095:1: ( rule__Transition__Group__5__Impl rule__Transition__Group__6 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2096:2: rule__Transition__Group__5__Impl rule__Transition__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__5__Impl_in_rule__Transition__Group__54297);
            rule__Transition__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__6_in_rule__Transition__Group__54300);
            rule__Transition__Group__6();

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
    // $ANTLR end "rule__Transition__Group__5"


    // $ANTLR start "rule__Transition__Group__5__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2103:1: rule__Transition__Group__5__Impl : ( ( rule__Transition__EventAssignment_5 ) ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2107:1: ( ( ( rule__Transition__EventAssignment_5 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2108:1: ( ( rule__Transition__EventAssignment_5 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2108:1: ( ( rule__Transition__EventAssignment_5 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2109:1: ( rule__Transition__EventAssignment_5 )
            {
             before(grammarAccess.getTransitionAccess().getEventAssignment_5()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2110:1: ( rule__Transition__EventAssignment_5 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2110:2: rule__Transition__EventAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__EventAssignment_5_in_rule__Transition__Group__5__Impl4327);
            rule__Transition__EventAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getEventAssignment_5()); 

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
    // $ANTLR end "rule__Transition__Group__5__Impl"


    // $ANTLR start "rule__Transition__Group__6"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2120:1: rule__Transition__Group__6 : rule__Transition__Group__6__Impl ;
    public final void rule__Transition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2124:1: ( rule__Transition__Group__6__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2125:2: rule__Transition__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__6__Impl_in_rule__Transition__Group__64357);
            rule__Transition__Group__6__Impl();

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
    // $ANTLR end "rule__Transition__Group__6"


    // $ANTLR start "rule__Transition__Group__6__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2131:1: rule__Transition__Group__6__Impl : ( ( rule__Transition__Group_6__0 )? ) ;
    public final void rule__Transition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2135:1: ( ( ( rule__Transition__Group_6__0 )? ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2136:1: ( ( rule__Transition__Group_6__0 )? )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2136:1: ( ( rule__Transition__Group_6__0 )? )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2137:1: ( rule__Transition__Group_6__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_6()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2138:1: ( rule__Transition__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==39) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2138:2: rule__Transition__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_6__0_in_rule__Transition__Group__6__Impl4384);
                    rule__Transition__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Transition__Group__6__Impl"


    // $ANTLR start "rule__Transition__Group_6__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2162:1: rule__Transition__Group_6__0 : rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1 ;
    public final void rule__Transition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2166:1: ( rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2167:2: rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_6__0__Impl_in_rule__Transition__Group_6__04429);
            rule__Transition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_6__1_in_rule__Transition__Group_6__04432);
            rule__Transition__Group_6__1();

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
    // $ANTLR end "rule__Transition__Group_6__0"


    // $ANTLR start "rule__Transition__Group_6__0__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2174:1: rule__Transition__Group_6__0__Impl : ( 'guard' ) ;
    public final void rule__Transition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2178:1: ( ( 'guard' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2179:1: ( 'guard' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2179:1: ( 'guard' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2180:1: 'guard'
            {
             before(grammarAccess.getTransitionAccess().getGuardKeyword_6_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Transition__Group_6__0__Impl4460); 
             after(grammarAccess.getTransitionAccess().getGuardKeyword_6_0()); 

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
    // $ANTLR end "rule__Transition__Group_6__0__Impl"


    // $ANTLR start "rule__Transition__Group_6__1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2193:1: rule__Transition__Group_6__1 : rule__Transition__Group_6__1__Impl ;
    public final void rule__Transition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2197:1: ( rule__Transition__Group_6__1__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2198:2: rule__Transition__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_6__1__Impl_in_rule__Transition__Group_6__14491);
            rule__Transition__Group_6__1__Impl();

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
    // $ANTLR end "rule__Transition__Group_6__1"


    // $ANTLR start "rule__Transition__Group_6__1__Impl"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2204:1: rule__Transition__Group_6__1__Impl : ( ( rule__Transition__GuardAssignment_6_1 ) ) ;
    public final void rule__Transition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2208:1: ( ( ( rule__Transition__GuardAssignment_6_1 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2209:1: ( ( rule__Transition__GuardAssignment_6_1 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2209:1: ( ( rule__Transition__GuardAssignment_6_1 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2210:1: ( rule__Transition__GuardAssignment_6_1 )
            {
             before(grammarAccess.getTransitionAccess().getGuardAssignment_6_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2211:1: ( rule__Transition__GuardAssignment_6_1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2211:2: rule__Transition__GuardAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__GuardAssignment_6_1_in_rule__Transition__Group_6__1__Impl4518);
            rule__Transition__GuardAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGuardAssignment_6_1()); 

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
    // $ANTLR end "rule__Transition__Group_6__1__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2225:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2229:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2230:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__04552);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__1_in_rule__Event__Group__04555);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2237:1: rule__Event__Group__0__Impl : ( () ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2241:1: ( ( () ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2242:1: ( () )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2242:1: ( () )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2243:1: ()
            {
             before(grammarAccess.getEventAccess().getEventAction_0()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2244:1: ()
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2246:1: 
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2256:1: rule__Event__Group__1 : rule__Event__Group__1__Impl ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2260:1: ( rule__Event__Group__1__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2261:2: rule__Event__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__14613);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2267:1: rule__Event__Group__1__Impl : ( ( rule__Event__NameAssignment_1 ) ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2271:1: ( ( ( rule__Event__NameAssignment_1 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2272:1: ( ( rule__Event__NameAssignment_1 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2272:1: ( ( rule__Event__NameAssignment_1 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2273:1: ( rule__Event__NameAssignment_1 )
            {
             before(grammarAccess.getEventAccess().getNameAssignment_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2274:1: ( rule__Event__NameAssignment_1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2274:2: rule__Event__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__NameAssignment_1_in_rule__Event__Group__1__Impl4640);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2288:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2292:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2293:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__04674);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__04677);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2300:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__VariableAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2304:1: ( ( ( rule__Assignment__VariableAssignment_0 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2305:1: ( ( rule__Assignment__VariableAssignment_0 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2305:1: ( ( rule__Assignment__VariableAssignment_0 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2306:1: ( rule__Assignment__VariableAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getVariableAssignment_0()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2307:1: ( rule__Assignment__VariableAssignment_0 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2307:2: rule__Assignment__VariableAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__VariableAssignment_0_in_rule__Assignment__Group__0__Impl4704);
            rule__Assignment__VariableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getVariableAssignment_0()); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2317:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2321:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2322:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__14734);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__14737);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2329:1: rule__Assignment__Group__1__Impl : ( ':=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2333:1: ( ( ':=' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2334:1: ( ':=' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2334:1: ( ':=' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2335:1: ':='
            {
             before(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Assignment__Group__1__Impl4765); 
             after(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1()); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2348:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2352:1: ( rule__Assignment__Group__2__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2353:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__24796);
            rule__Assignment__Group__2__Impl();

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2359:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ExpressionAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2363:1: ( ( ( rule__Assignment__ExpressionAssignment_2 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2364:1: ( ( rule__Assignment__ExpressionAssignment_2 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2364:1: ( ( rule__Assignment__ExpressionAssignment_2 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2365:1: ( rule__Assignment__ExpressionAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getExpressionAssignment_2()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2366:1: ( rule__Assignment__ExpressionAssignment_2 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2366:2: rule__Assignment__ExpressionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__ExpressionAssignment_2_in_rule__Assignment__Group__2__Impl4823);
            rule__Assignment__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getExpressionAssignment_2()); 

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


    // $ANTLR start "rule__Expression__Group__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2382:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2386:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2387:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__04859);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__04862);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2394:1: rule__Expression__Group__0__Impl : ( 'Expression' ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2398:1: ( ( 'Expression' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2399:1: ( 'Expression' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2399:1: ( 'Expression' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2400:1: 'Expression'
            {
             before(grammarAccess.getExpressionAccess().getExpressionKeyword_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Expression__Group__0__Impl4890); 
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2413:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl rule__Expression__Group__2 ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2417:1: ( rule__Expression__Group__1__Impl rule__Expression__Group__2 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2418:2: rule__Expression__Group__1__Impl rule__Expression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__14921);
            rule__Expression__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__2_in_rule__Expression__Group__14924);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2425:1: rule__Expression__Group__1__Impl : ( '{' ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2429:1: ( ( '{' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2430:1: ( '{' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2430:1: ( '{' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2431:1: '{'
            {
             before(grammarAccess.getExpressionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Expression__Group__1__Impl4952); 
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2444:1: rule__Expression__Group__2 : rule__Expression__Group__2__Impl rule__Expression__Group__3 ;
    public final void rule__Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2448:1: ( rule__Expression__Group__2__Impl rule__Expression__Group__3 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2449:2: rule__Expression__Group__2__Impl rule__Expression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__2__Impl_in_rule__Expression__Group__24983);
            rule__Expression__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__3_in_rule__Expression__Group__24986);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2456:1: rule__Expression__Group__2__Impl : ( 'operator' ) ;
    public final void rule__Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2460:1: ( ( 'operator' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2461:1: ( 'operator' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2461:1: ( 'operator' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2462:1: 'operator'
            {
             before(grammarAccess.getExpressionAccess().getOperatorKeyword_2()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Expression__Group__2__Impl5014); 
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2475:1: rule__Expression__Group__3 : rule__Expression__Group__3__Impl rule__Expression__Group__4 ;
    public final void rule__Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2479:1: ( rule__Expression__Group__3__Impl rule__Expression__Group__4 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2480:2: rule__Expression__Group__3__Impl rule__Expression__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__3__Impl_in_rule__Expression__Group__35045);
            rule__Expression__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__4_in_rule__Expression__Group__35048);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2487:1: rule__Expression__Group__3__Impl : ( ( rule__Expression__OperatorAssignment_3 ) ) ;
    public final void rule__Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2491:1: ( ( ( rule__Expression__OperatorAssignment_3 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2492:1: ( ( rule__Expression__OperatorAssignment_3 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2492:1: ( ( rule__Expression__OperatorAssignment_3 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2493:1: ( rule__Expression__OperatorAssignment_3 )
            {
             before(grammarAccess.getExpressionAccess().getOperatorAssignment_3()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2494:1: ( rule__Expression__OperatorAssignment_3 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2494:2: rule__Expression__OperatorAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__OperatorAssignment_3_in_rule__Expression__Group__3__Impl5075);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2504:1: rule__Expression__Group__4 : rule__Expression__Group__4__Impl rule__Expression__Group__5 ;
    public final void rule__Expression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2508:1: ( rule__Expression__Group__4__Impl rule__Expression__Group__5 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2509:2: rule__Expression__Group__4__Impl rule__Expression__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__4__Impl_in_rule__Expression__Group__45105);
            rule__Expression__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__5_in_rule__Expression__Group__45108);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2516:1: rule__Expression__Group__4__Impl : ( ( rule__Expression__Group_4__0 )? ) ;
    public final void rule__Expression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2520:1: ( ( ( rule__Expression__Group_4__0 )? ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2521:1: ( ( rule__Expression__Group_4__0 )? )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2521:1: ( ( rule__Expression__Group_4__0 )? )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2522:1: ( rule__Expression__Group_4__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_4()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2523:1: ( rule__Expression__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==45) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2523:2: rule__Expression__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Expression__Group_4__0_in_rule__Expression__Group__4__Impl5135);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2533:1: rule__Expression__Group__5 : rule__Expression__Group__5__Impl rule__Expression__Group__6 ;
    public final void rule__Expression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2537:1: ( rule__Expression__Group__5__Impl rule__Expression__Group__6 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2538:2: rule__Expression__Group__5__Impl rule__Expression__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__5__Impl_in_rule__Expression__Group__55166);
            rule__Expression__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__6_in_rule__Expression__Group__55169);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2545:1: rule__Expression__Group__5__Impl : ( 'left' ) ;
    public final void rule__Expression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2549:1: ( ( 'left' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2550:1: ( 'left' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2550:1: ( 'left' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2551:1: 'left'
            {
             before(grammarAccess.getExpressionAccess().getLeftKeyword_5()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Expression__Group__5__Impl5197); 
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2564:1: rule__Expression__Group__6 : rule__Expression__Group__6__Impl rule__Expression__Group__7 ;
    public final void rule__Expression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2568:1: ( rule__Expression__Group__6__Impl rule__Expression__Group__7 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2569:2: rule__Expression__Group__6__Impl rule__Expression__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__6__Impl_in_rule__Expression__Group__65228);
            rule__Expression__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__7_in_rule__Expression__Group__65231);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2576:1: rule__Expression__Group__6__Impl : ( ( rule__Expression__LeftAssignment_6 ) ) ;
    public final void rule__Expression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2580:1: ( ( ( rule__Expression__LeftAssignment_6 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2581:1: ( ( rule__Expression__LeftAssignment_6 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2581:1: ( ( rule__Expression__LeftAssignment_6 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2582:1: ( rule__Expression__LeftAssignment_6 )
            {
             before(grammarAccess.getExpressionAccess().getLeftAssignment_6()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2583:1: ( rule__Expression__LeftAssignment_6 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2583:2: rule__Expression__LeftAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__LeftAssignment_6_in_rule__Expression__Group__6__Impl5258);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2593:1: rule__Expression__Group__7 : rule__Expression__Group__7__Impl rule__Expression__Group__8 ;
    public final void rule__Expression__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2597:1: ( rule__Expression__Group__7__Impl rule__Expression__Group__8 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2598:2: rule__Expression__Group__7__Impl rule__Expression__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__7__Impl_in_rule__Expression__Group__75288);
            rule__Expression__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__8_in_rule__Expression__Group__75291);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2605:1: rule__Expression__Group__7__Impl : ( 'right' ) ;
    public final void rule__Expression__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2609:1: ( ( 'right' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2610:1: ( 'right' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2610:1: ( 'right' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2611:1: 'right'
            {
             before(grammarAccess.getExpressionAccess().getRightKeyword_7()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Expression__Group__7__Impl5319); 
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2624:1: rule__Expression__Group__8 : rule__Expression__Group__8__Impl rule__Expression__Group__9 ;
    public final void rule__Expression__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2628:1: ( rule__Expression__Group__8__Impl rule__Expression__Group__9 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2629:2: rule__Expression__Group__8__Impl rule__Expression__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__8__Impl_in_rule__Expression__Group__85350);
            rule__Expression__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__9_in_rule__Expression__Group__85353);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2636:1: rule__Expression__Group__8__Impl : ( ( rule__Expression__RightAssignment_8 ) ) ;
    public final void rule__Expression__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2640:1: ( ( ( rule__Expression__RightAssignment_8 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2641:1: ( ( rule__Expression__RightAssignment_8 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2641:1: ( ( rule__Expression__RightAssignment_8 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2642:1: ( rule__Expression__RightAssignment_8 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_8()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2643:1: ( rule__Expression__RightAssignment_8 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2643:2: rule__Expression__RightAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__RightAssignment_8_in_rule__Expression__Group__8__Impl5380);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2653:1: rule__Expression__Group__9 : rule__Expression__Group__9__Impl ;
    public final void rule__Expression__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2657:1: ( rule__Expression__Group__9__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2658:2: rule__Expression__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__9__Impl_in_rule__Expression__Group__95410);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2664:1: rule__Expression__Group__9__Impl : ( '}' ) ;
    public final void rule__Expression__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2668:1: ( ( '}' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2669:1: ( '}' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2669:1: ( '}' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2670:1: '}'
            {
             before(grammarAccess.getExpressionAccess().getRightCurlyBracketKeyword_9()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Expression__Group__9__Impl5438); 
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2703:1: rule__Expression__Group_4__0 : rule__Expression__Group_4__0__Impl rule__Expression__Group_4__1 ;
    public final void rule__Expression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2707:1: ( rule__Expression__Group_4__0__Impl rule__Expression__Group_4__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2708:2: rule__Expression__Group_4__0__Impl rule__Expression__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group_4__0__Impl_in_rule__Expression__Group_4__05489);
            rule__Expression__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group_4__1_in_rule__Expression__Group_4__05492);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2715:1: rule__Expression__Group_4__0__Impl : ( '_name' ) ;
    public final void rule__Expression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2719:1: ( ( '_name' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2720:1: ( '_name' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2720:1: ( '_name' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2721:1: '_name'
            {
             before(grammarAccess.getExpressionAccess().get_nameKeyword_4_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Expression__Group_4__0__Impl5520); 
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2734:1: rule__Expression__Group_4__1 : rule__Expression__Group_4__1__Impl ;
    public final void rule__Expression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2738:1: ( rule__Expression__Group_4__1__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2739:2: rule__Expression__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group_4__1__Impl_in_rule__Expression__Group_4__15551);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2745:1: rule__Expression__Group_4__1__Impl : ( ( rule__Expression___nameAssignment_4_1 ) ) ;
    public final void rule__Expression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2749:1: ( ( ( rule__Expression___nameAssignment_4_1 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2750:1: ( ( rule__Expression___nameAssignment_4_1 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2750:1: ( ( rule__Expression___nameAssignment_4_1 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2751:1: ( rule__Expression___nameAssignment_4_1 )
            {
             before(grammarAccess.getExpressionAccess().get_nameAssignment_4_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2752:1: ( rule__Expression___nameAssignment_4_1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2752:2: rule__Expression___nameAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression___nameAssignment_4_1_in_rule__Expression__Group_4__1__Impl5578);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2766:1: rule__VariableReference__Group__0 : rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1 ;
    public final void rule__VariableReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2770:1: ( rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2771:2: rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group__0__Impl_in_rule__VariableReference__Group__05612);
            rule__VariableReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group__1_in_rule__VariableReference__Group__05615);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2778:1: rule__VariableReference__Group__0__Impl : ( 'VariableReference' ) ;
    public final void rule__VariableReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2782:1: ( ( 'VariableReference' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2783:1: ( 'VariableReference' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2783:1: ( 'VariableReference' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2784:1: 'VariableReference'
            {
             before(grammarAccess.getVariableReferenceAccess().getVariableReferenceKeyword_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__VariableReference__Group__0__Impl5643); 
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2797:1: rule__VariableReference__Group__1 : rule__VariableReference__Group__1__Impl rule__VariableReference__Group__2 ;
    public final void rule__VariableReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2801:1: ( rule__VariableReference__Group__1__Impl rule__VariableReference__Group__2 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2802:2: rule__VariableReference__Group__1__Impl rule__VariableReference__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group__1__Impl_in_rule__VariableReference__Group__15674);
            rule__VariableReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group__2_in_rule__VariableReference__Group__15677);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2809:1: rule__VariableReference__Group__1__Impl : ( '{' ) ;
    public final void rule__VariableReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2813:1: ( ( '{' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2814:1: ( '{' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2814:1: ( '{' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2815:1: '{'
            {
             before(grammarAccess.getVariableReferenceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__VariableReference__Group__1__Impl5705); 
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2828:1: rule__VariableReference__Group__2 : rule__VariableReference__Group__2__Impl rule__VariableReference__Group__3 ;
    public final void rule__VariableReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2832:1: ( rule__VariableReference__Group__2__Impl rule__VariableReference__Group__3 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2833:2: rule__VariableReference__Group__2__Impl rule__VariableReference__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group__2__Impl_in_rule__VariableReference__Group__25736);
            rule__VariableReference__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group__3_in_rule__VariableReference__Group__25739);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2840:1: rule__VariableReference__Group__2__Impl : ( ( rule__VariableReference__Group_2__0 )? ) ;
    public final void rule__VariableReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2844:1: ( ( ( rule__VariableReference__Group_2__0 )? ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2845:1: ( ( rule__VariableReference__Group_2__0 )? )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2845:1: ( ( rule__VariableReference__Group_2__0 )? )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2846:1: ( rule__VariableReference__Group_2__0 )?
            {
             before(grammarAccess.getVariableReferenceAccess().getGroup_2()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2847:1: ( rule__VariableReference__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==45) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2847:2: rule__VariableReference__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group_2__0_in_rule__VariableReference__Group__2__Impl5766);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2857:1: rule__VariableReference__Group__3 : rule__VariableReference__Group__3__Impl rule__VariableReference__Group__4 ;
    public final void rule__VariableReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2861:1: ( rule__VariableReference__Group__3__Impl rule__VariableReference__Group__4 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2862:2: rule__VariableReference__Group__3__Impl rule__VariableReference__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group__3__Impl_in_rule__VariableReference__Group__35797);
            rule__VariableReference__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group__4_in_rule__VariableReference__Group__35800);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2869:1: rule__VariableReference__Group__3__Impl : ( 'variable' ) ;
    public final void rule__VariableReference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2873:1: ( ( 'variable' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2874:1: ( 'variable' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2874:1: ( 'variable' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2875:1: 'variable'
            {
             before(grammarAccess.getVariableReferenceAccess().getVariableKeyword_3()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__VariableReference__Group__3__Impl5828); 
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2888:1: rule__VariableReference__Group__4 : rule__VariableReference__Group__4__Impl rule__VariableReference__Group__5 ;
    public final void rule__VariableReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2892:1: ( rule__VariableReference__Group__4__Impl rule__VariableReference__Group__5 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2893:2: rule__VariableReference__Group__4__Impl rule__VariableReference__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group__4__Impl_in_rule__VariableReference__Group__45859);
            rule__VariableReference__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group__5_in_rule__VariableReference__Group__45862);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2900:1: rule__VariableReference__Group__4__Impl : ( ( rule__VariableReference__VariableAssignment_4 ) ) ;
    public final void rule__VariableReference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2904:1: ( ( ( rule__VariableReference__VariableAssignment_4 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2905:1: ( ( rule__VariableReference__VariableAssignment_4 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2905:1: ( ( rule__VariableReference__VariableAssignment_4 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2906:1: ( rule__VariableReference__VariableAssignment_4 )
            {
             before(grammarAccess.getVariableReferenceAccess().getVariableAssignment_4()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2907:1: ( rule__VariableReference__VariableAssignment_4 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2907:2: rule__VariableReference__VariableAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__VariableAssignment_4_in_rule__VariableReference__Group__4__Impl5889);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2917:1: rule__VariableReference__Group__5 : rule__VariableReference__Group__5__Impl ;
    public final void rule__VariableReference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2921:1: ( rule__VariableReference__Group__5__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2922:2: rule__VariableReference__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group__5__Impl_in_rule__VariableReference__Group__55919);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2928:1: rule__VariableReference__Group__5__Impl : ( '}' ) ;
    public final void rule__VariableReference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2932:1: ( ( '}' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2933:1: ( '}' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2933:1: ( '}' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2934:1: '}'
            {
             before(grammarAccess.getVariableReferenceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__VariableReference__Group__5__Impl5947); 
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2959:1: rule__VariableReference__Group_2__0 : rule__VariableReference__Group_2__0__Impl rule__VariableReference__Group_2__1 ;
    public final void rule__VariableReference__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2963:1: ( rule__VariableReference__Group_2__0__Impl rule__VariableReference__Group_2__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2964:2: rule__VariableReference__Group_2__0__Impl rule__VariableReference__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group_2__0__Impl_in_rule__VariableReference__Group_2__05990);
            rule__VariableReference__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group_2__1_in_rule__VariableReference__Group_2__05993);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2971:1: rule__VariableReference__Group_2__0__Impl : ( '_name' ) ;
    public final void rule__VariableReference__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2975:1: ( ( '_name' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2976:1: ( '_name' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2976:1: ( '_name' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2977:1: '_name'
            {
             before(grammarAccess.getVariableReferenceAccess().get_nameKeyword_2_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__VariableReference__Group_2__0__Impl6021); 
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2990:1: rule__VariableReference__Group_2__1 : rule__VariableReference__Group_2__1__Impl ;
    public final void rule__VariableReference__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2994:1: ( rule__VariableReference__Group_2__1__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:2995:2: rule__VariableReference__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group_2__1__Impl_in_rule__VariableReference__Group_2__16052);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3001:1: rule__VariableReference__Group_2__1__Impl : ( ( rule__VariableReference___nameAssignment_2_1 ) ) ;
    public final void rule__VariableReference__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3005:1: ( ( ( rule__VariableReference___nameAssignment_2_1 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3006:1: ( ( rule__VariableReference___nameAssignment_2_1 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3006:1: ( ( rule__VariableReference___nameAssignment_2_1 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3007:1: ( rule__VariableReference___nameAssignment_2_1 )
            {
             before(grammarAccess.getVariableReferenceAccess().get_nameAssignment_2_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3008:1: ( rule__VariableReference___nameAssignment_2_1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3008:2: rule__VariableReference___nameAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference___nameAssignment_2_1_in_rule__VariableReference__Group_2__1__Impl6079);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3022:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3026:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3027:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__06113);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__06116);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3034:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3038:1: ( ( ( '-' )? ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3039:1: ( ( '-' )? )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3039:1: ( ( '-' )? )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3040:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3041:1: ( '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==48) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3042:2: '-'
                    {
                    match(input,48,FollowSets000.FOLLOW_48_in_rule__EInt__Group__0__Impl6145); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3053:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3057:1: ( rule__EInt__Group__1__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3058:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__16178);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3064:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3068:1: ( ( RULE_INT ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3069:1: ( RULE_INT )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3069:1: ( RULE_INT )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3070:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl6205); 
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3085:1: rule__CompositeState_Impl__Group__0 : rule__CompositeState_Impl__Group__0__Impl rule__CompositeState_Impl__Group__1 ;
    public final void rule__CompositeState_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3089:1: ( rule__CompositeState_Impl__Group__0__Impl rule__CompositeState_Impl__Group__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3090:2: rule__CompositeState_Impl__Group__0__Impl rule__CompositeState_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__0__Impl_in_rule__CompositeState_Impl__Group__06238);
            rule__CompositeState_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__1_in_rule__CompositeState_Impl__Group__06241);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3097:1: rule__CompositeState_Impl__Group__0__Impl : ( 'state' ) ;
    public final void rule__CompositeState_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3101:1: ( ( 'state' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3102:1: ( 'state' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3102:1: ( 'state' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3103:1: 'state'
            {
             before(grammarAccess.getCompositeState_ImplAccess().getStateKeyword_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__CompositeState_Impl__Group__0__Impl6269); 
             after(grammarAccess.getCompositeState_ImplAccess().getStateKeyword_0()); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3116:1: rule__CompositeState_Impl__Group__1 : rule__CompositeState_Impl__Group__1__Impl rule__CompositeState_Impl__Group__2 ;
    public final void rule__CompositeState_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3120:1: ( rule__CompositeState_Impl__Group__1__Impl rule__CompositeState_Impl__Group__2 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3121:2: rule__CompositeState_Impl__Group__1__Impl rule__CompositeState_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__1__Impl_in_rule__CompositeState_Impl__Group__16300);
            rule__CompositeState_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__2_in_rule__CompositeState_Impl__Group__16303);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3128:1: rule__CompositeState_Impl__Group__1__Impl : ( ( rule__CompositeState_Impl__NameAssignment_1 ) ) ;
    public final void rule__CompositeState_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3132:1: ( ( ( rule__CompositeState_Impl__NameAssignment_1 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3133:1: ( ( rule__CompositeState_Impl__NameAssignment_1 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3133:1: ( ( rule__CompositeState_Impl__NameAssignment_1 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3134:1: ( rule__CompositeState_Impl__NameAssignment_1 )
            {
             before(grammarAccess.getCompositeState_ImplAccess().getNameAssignment_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3135:1: ( rule__CompositeState_Impl__NameAssignment_1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3135:2: rule__CompositeState_Impl__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__NameAssignment_1_in_rule__CompositeState_Impl__Group__1__Impl6330);
            rule__CompositeState_Impl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeState_ImplAccess().getNameAssignment_1()); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3145:1: rule__CompositeState_Impl__Group__2 : rule__CompositeState_Impl__Group__2__Impl rule__CompositeState_Impl__Group__3 ;
    public final void rule__CompositeState_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3149:1: ( rule__CompositeState_Impl__Group__2__Impl rule__CompositeState_Impl__Group__3 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3150:2: rule__CompositeState_Impl__Group__2__Impl rule__CompositeState_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__2__Impl_in_rule__CompositeState_Impl__Group__26360);
            rule__CompositeState_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__3_in_rule__CompositeState_Impl__Group__26363);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3157:1: rule__CompositeState_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__CompositeState_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3161:1: ( ( '{' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3162:1: ( '{' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3162:1: ( '{' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3163:1: '{'
            {
             before(grammarAccess.getCompositeState_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__CompositeState_Impl__Group__2__Impl6391); 
             after(grammarAccess.getCompositeState_ImplAccess().getLeftCurlyBracketKeyword_2()); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3176:1: rule__CompositeState_Impl__Group__3 : rule__CompositeState_Impl__Group__3__Impl rule__CompositeState_Impl__Group__4 ;
    public final void rule__CompositeState_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3180:1: ( rule__CompositeState_Impl__Group__3__Impl rule__CompositeState_Impl__Group__4 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3181:2: rule__CompositeState_Impl__Group__3__Impl rule__CompositeState_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__3__Impl_in_rule__CompositeState_Impl__Group__36422);
            rule__CompositeState_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__4_in_rule__CompositeState_Impl__Group__36425);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3188:1: rule__CompositeState_Impl__Group__3__Impl : ( ( ( rule__CompositeState_Impl__StatesAssignment_3 ) ) ( ( rule__CompositeState_Impl__StatesAssignment_3 )* ) ) ;
    public final void rule__CompositeState_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3192:1: ( ( ( ( rule__CompositeState_Impl__StatesAssignment_3 ) ) ( ( rule__CompositeState_Impl__StatesAssignment_3 )* ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3193:1: ( ( ( rule__CompositeState_Impl__StatesAssignment_3 ) ) ( ( rule__CompositeState_Impl__StatesAssignment_3 )* ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3193:1: ( ( ( rule__CompositeState_Impl__StatesAssignment_3 ) ) ( ( rule__CompositeState_Impl__StatesAssignment_3 )* ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3194:1: ( ( rule__CompositeState_Impl__StatesAssignment_3 ) ) ( ( rule__CompositeState_Impl__StatesAssignment_3 )* )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3194:1: ( ( rule__CompositeState_Impl__StatesAssignment_3 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3195:1: ( rule__CompositeState_Impl__StatesAssignment_3 )
            {
             before(grammarAccess.getCompositeState_ImplAccess().getStatesAssignment_3()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3196:1: ( rule__CompositeState_Impl__StatesAssignment_3 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3196:2: rule__CompositeState_Impl__StatesAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__StatesAssignment_3_in_rule__CompositeState_Impl__Group__3__Impl6454);
            rule__CompositeState_Impl__StatesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCompositeState_ImplAccess().getStatesAssignment_3()); 

            }

            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3199:1: ( ( rule__CompositeState_Impl__StatesAssignment_3 )* )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3200:1: ( rule__CompositeState_Impl__StatesAssignment_3 )*
            {
             before(grammarAccess.getCompositeState_ImplAccess().getStatesAssignment_3()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3201:1: ( rule__CompositeState_Impl__StatesAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26||LA18_0==34) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3201:2: rule__CompositeState_Impl__StatesAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__StatesAssignment_3_in_rule__CompositeState_Impl__Group__3__Impl6466);
            	    rule__CompositeState_Impl__StatesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getCompositeState_ImplAccess().getStatesAssignment_3()); 

            }


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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3212:1: rule__CompositeState_Impl__Group__4 : rule__CompositeState_Impl__Group__4__Impl rule__CompositeState_Impl__Group__5 ;
    public final void rule__CompositeState_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3216:1: ( rule__CompositeState_Impl__Group__4__Impl rule__CompositeState_Impl__Group__5 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3217:2: rule__CompositeState_Impl__Group__4__Impl rule__CompositeState_Impl__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__4__Impl_in_rule__CompositeState_Impl__Group__46499);
            rule__CompositeState_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__5_in_rule__CompositeState_Impl__Group__46502);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3224:1: rule__CompositeState_Impl__Group__4__Impl : ( ( rule__CompositeState_Impl__Group_4__0 )? ) ;
    public final void rule__CompositeState_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3228:1: ( ( ( rule__CompositeState_Impl__Group_4__0 )? ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3229:1: ( ( rule__CompositeState_Impl__Group_4__0 )? )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3229:1: ( ( rule__CompositeState_Impl__Group_4__0 )? )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3230:1: ( rule__CompositeState_Impl__Group_4__0 )?
            {
             before(grammarAccess.getCompositeState_ImplAccess().getGroup_4()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3231:1: ( rule__CompositeState_Impl__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3231:2: rule__CompositeState_Impl__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group_4__0_in_rule__CompositeState_Impl__Group__4__Impl6529);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3241:1: rule__CompositeState_Impl__Group__5 : rule__CompositeState_Impl__Group__5__Impl rule__CompositeState_Impl__Group__6 ;
    public final void rule__CompositeState_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3245:1: ( rule__CompositeState_Impl__Group__5__Impl rule__CompositeState_Impl__Group__6 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3246:2: rule__CompositeState_Impl__Group__5__Impl rule__CompositeState_Impl__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__5__Impl_in_rule__CompositeState_Impl__Group__56560);
            rule__CompositeState_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__6_in_rule__CompositeState_Impl__Group__56563);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3253:1: rule__CompositeState_Impl__Group__5__Impl : ( 'init with' ) ;
    public final void rule__CompositeState_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3257:1: ( ( 'init with' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3258:1: ( 'init with' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3258:1: ( 'init with' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3259:1: 'init with'
            {
             before(grammarAccess.getCompositeState_ImplAccess().getInitWithKeyword_5()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__CompositeState_Impl__Group__5__Impl6591); 
             after(grammarAccess.getCompositeState_ImplAccess().getInitWithKeyword_5()); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3272:1: rule__CompositeState_Impl__Group__6 : rule__CompositeState_Impl__Group__6__Impl rule__CompositeState_Impl__Group__7 ;
    public final void rule__CompositeState_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3276:1: ( rule__CompositeState_Impl__Group__6__Impl rule__CompositeState_Impl__Group__7 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3277:2: rule__CompositeState_Impl__Group__6__Impl rule__CompositeState_Impl__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__6__Impl_in_rule__CompositeState_Impl__Group__66622);
            rule__CompositeState_Impl__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__7_in_rule__CompositeState_Impl__Group__66625);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3284:1: rule__CompositeState_Impl__Group__6__Impl : ( ( rule__CompositeState_Impl__InitialStateAssignment_6 ) ) ;
    public final void rule__CompositeState_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3288:1: ( ( ( rule__CompositeState_Impl__InitialStateAssignment_6 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3289:1: ( ( rule__CompositeState_Impl__InitialStateAssignment_6 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3289:1: ( ( rule__CompositeState_Impl__InitialStateAssignment_6 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3290:1: ( rule__CompositeState_Impl__InitialStateAssignment_6 )
            {
             before(grammarAccess.getCompositeState_ImplAccess().getInitialStateAssignment_6()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3291:1: ( rule__CompositeState_Impl__InitialStateAssignment_6 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3291:2: rule__CompositeState_Impl__InitialStateAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__InitialStateAssignment_6_in_rule__CompositeState_Impl__Group__6__Impl6652);
            rule__CompositeState_Impl__InitialStateAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCompositeState_ImplAccess().getInitialStateAssignment_6()); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3301:1: rule__CompositeState_Impl__Group__7 : rule__CompositeState_Impl__Group__7__Impl ;
    public final void rule__CompositeState_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3305:1: ( rule__CompositeState_Impl__Group__7__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3306:2: rule__CompositeState_Impl__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group__7__Impl_in_rule__CompositeState_Impl__Group__76682);
            rule__CompositeState_Impl__Group__7__Impl();

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3312:1: rule__CompositeState_Impl__Group__7__Impl : ( '}' ) ;
    public final void rule__CompositeState_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3316:1: ( ( '}' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3317:1: ( '}' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3317:1: ( '}' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3318:1: '}'
            {
             before(grammarAccess.getCompositeState_ImplAccess().getRightCurlyBracketKeyword_7()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__CompositeState_Impl__Group__7__Impl6710); 
             after(grammarAccess.getCompositeState_ImplAccess().getRightCurlyBracketKeyword_7()); 

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


    // $ANTLR start "rule__CompositeState_Impl__Group_4__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3347:1: rule__CompositeState_Impl__Group_4__0 : rule__CompositeState_Impl__Group_4__0__Impl rule__CompositeState_Impl__Group_4__1 ;
    public final void rule__CompositeState_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3351:1: ( rule__CompositeState_Impl__Group_4__0__Impl rule__CompositeState_Impl__Group_4__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3352:2: rule__CompositeState_Impl__Group_4__0__Impl rule__CompositeState_Impl__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group_4__0__Impl_in_rule__CompositeState_Impl__Group_4__06757);
            rule__CompositeState_Impl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group_4__1_in_rule__CompositeState_Impl__Group_4__06760);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3359:1: rule__CompositeState_Impl__Group_4__0__Impl : ( 'do' ) ;
    public final void rule__CompositeState_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3363:1: ( ( 'do' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3364:1: ( 'do' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3364:1: ( 'do' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3365:1: 'do'
            {
             before(grammarAccess.getCompositeState_ImplAccess().getDoKeyword_4_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__CompositeState_Impl__Group_4__0__Impl6788); 
             after(grammarAccess.getCompositeState_ImplAccess().getDoKeyword_4_0()); 

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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3378:1: rule__CompositeState_Impl__Group_4__1 : rule__CompositeState_Impl__Group_4__1__Impl ;
    public final void rule__CompositeState_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3382:1: ( rule__CompositeState_Impl__Group_4__1__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3383:2: rule__CompositeState_Impl__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__Group_4__1__Impl_in_rule__CompositeState_Impl__Group_4__16819);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3389:1: rule__CompositeState_Impl__Group_4__1__Impl : ( ( rule__CompositeState_Impl__OperationAssignment_4_1 ) ) ;
    public final void rule__CompositeState_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3393:1: ( ( ( rule__CompositeState_Impl__OperationAssignment_4_1 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3394:1: ( ( rule__CompositeState_Impl__OperationAssignment_4_1 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3394:1: ( ( rule__CompositeState_Impl__OperationAssignment_4_1 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3395:1: ( rule__CompositeState_Impl__OperationAssignment_4_1 )
            {
             before(grammarAccess.getCompositeState_ImplAccess().getOperationAssignment_4_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3396:1: ( rule__CompositeState_Impl__OperationAssignment_4_1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3396:2: rule__CompositeState_Impl__OperationAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState_Impl__OperationAssignment_4_1_in_rule__CompositeState_Impl__Group_4__1__Impl6846);
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


    // $ANTLR start "rule__BooleanVariable__Group__0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3410:1: rule__BooleanVariable__Group__0 : rule__BooleanVariable__Group__0__Impl rule__BooleanVariable__Group__1 ;
    public final void rule__BooleanVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3414:1: ( rule__BooleanVariable__Group__0__Impl rule__BooleanVariable__Group__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3415:2: rule__BooleanVariable__Group__0__Impl rule__BooleanVariable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group__0__Impl_in_rule__BooleanVariable__Group__06880);
            rule__BooleanVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group__1_in_rule__BooleanVariable__Group__06883);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3422:1: rule__BooleanVariable__Group__0__Impl : ( () ) ;
    public final void rule__BooleanVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3426:1: ( ( () ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3427:1: ( () )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3427:1: ( () )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3428:1: ()
            {
             before(grammarAccess.getBooleanVariableAccess().getBooleanVariableAction_0()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3429:1: ()
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3431:1: 
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3441:1: rule__BooleanVariable__Group__1 : rule__BooleanVariable__Group__1__Impl rule__BooleanVariable__Group__2 ;
    public final void rule__BooleanVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3445:1: ( rule__BooleanVariable__Group__1__Impl rule__BooleanVariable__Group__2 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3446:2: rule__BooleanVariable__Group__1__Impl rule__BooleanVariable__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group__1__Impl_in_rule__BooleanVariable__Group__16941);
            rule__BooleanVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group__2_in_rule__BooleanVariable__Group__16944);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3453:1: rule__BooleanVariable__Group__1__Impl : ( ( rule__BooleanVariable__NameAssignment_1 ) ) ;
    public final void rule__BooleanVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3457:1: ( ( ( rule__BooleanVariable__NameAssignment_1 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3458:1: ( ( rule__BooleanVariable__NameAssignment_1 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3458:1: ( ( rule__BooleanVariable__NameAssignment_1 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3459:1: ( rule__BooleanVariable__NameAssignment_1 )
            {
             before(grammarAccess.getBooleanVariableAccess().getNameAssignment_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3460:1: ( rule__BooleanVariable__NameAssignment_1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3460:2: rule__BooleanVariable__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__NameAssignment_1_in_rule__BooleanVariable__Group__1__Impl6971);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3470:1: rule__BooleanVariable__Group__2 : rule__BooleanVariable__Group__2__Impl rule__BooleanVariable__Group__3 ;
    public final void rule__BooleanVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3474:1: ( rule__BooleanVariable__Group__2__Impl rule__BooleanVariable__Group__3 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3475:2: rule__BooleanVariable__Group__2__Impl rule__BooleanVariable__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group__2__Impl_in_rule__BooleanVariable__Group__27001);
            rule__BooleanVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group__3_in_rule__BooleanVariable__Group__27004);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3482:1: rule__BooleanVariable__Group__2__Impl : ( ':' ) ;
    public final void rule__BooleanVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3486:1: ( ( ':' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3487:1: ( ':' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3487:1: ( ':' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3488:1: ':'
            {
             before(grammarAccess.getBooleanVariableAccess().getColonKeyword_2()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__BooleanVariable__Group__2__Impl7032); 
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3501:1: rule__BooleanVariable__Group__3 : rule__BooleanVariable__Group__3__Impl rule__BooleanVariable__Group__4 ;
    public final void rule__BooleanVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3505:1: ( rule__BooleanVariable__Group__3__Impl rule__BooleanVariable__Group__4 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3506:2: rule__BooleanVariable__Group__3__Impl rule__BooleanVariable__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group__3__Impl_in_rule__BooleanVariable__Group__37063);
            rule__BooleanVariable__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group__4_in_rule__BooleanVariable__Group__37066);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3513:1: rule__BooleanVariable__Group__3__Impl : ( 'boolean' ) ;
    public final void rule__BooleanVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3517:1: ( ( 'boolean' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3518:1: ( 'boolean' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3518:1: ( 'boolean' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3519:1: 'boolean'
            {
             before(grammarAccess.getBooleanVariableAccess().getBooleanKeyword_3()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__BooleanVariable__Group__3__Impl7094); 
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3532:1: rule__BooleanVariable__Group__4 : rule__BooleanVariable__Group__4__Impl ;
    public final void rule__BooleanVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3536:1: ( rule__BooleanVariable__Group__4__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3537:2: rule__BooleanVariable__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group__4__Impl_in_rule__BooleanVariable__Group__47125);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3543:1: rule__BooleanVariable__Group__4__Impl : ( ( rule__BooleanVariable__Group_4__0 )? ) ;
    public final void rule__BooleanVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3547:1: ( ( ( rule__BooleanVariable__Group_4__0 )? ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3548:1: ( ( rule__BooleanVariable__Group_4__0 )? )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3548:1: ( ( rule__BooleanVariable__Group_4__0 )? )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3549:1: ( rule__BooleanVariable__Group_4__0 )?
            {
             before(grammarAccess.getBooleanVariableAccess().getGroup_4()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3550:1: ( rule__BooleanVariable__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3550:2: rule__BooleanVariable__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group_4__0_in_rule__BooleanVariable__Group__4__Impl7152);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3570:1: rule__BooleanVariable__Group_4__0 : rule__BooleanVariable__Group_4__0__Impl rule__BooleanVariable__Group_4__1 ;
    public final void rule__BooleanVariable__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3574:1: ( rule__BooleanVariable__Group_4__0__Impl rule__BooleanVariable__Group_4__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3575:2: rule__BooleanVariable__Group_4__0__Impl rule__BooleanVariable__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group_4__0__Impl_in_rule__BooleanVariable__Group_4__07193);
            rule__BooleanVariable__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group_4__1_in_rule__BooleanVariable__Group_4__07196);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3582:1: rule__BooleanVariable__Group_4__0__Impl : ( ':=' ) ;
    public final void rule__BooleanVariable__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3586:1: ( ( ':=' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3587:1: ( ':=' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3587:1: ( ':=' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3588:1: ':='
            {
             before(grammarAccess.getBooleanVariableAccess().getColonEqualsSignKeyword_4_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__BooleanVariable__Group_4__0__Impl7224); 
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3601:1: rule__BooleanVariable__Group_4__1 : rule__BooleanVariable__Group_4__1__Impl ;
    public final void rule__BooleanVariable__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3605:1: ( rule__BooleanVariable__Group_4__1__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3606:2: rule__BooleanVariable__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group_4__1__Impl_in_rule__BooleanVariable__Group_4__17255);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3612:1: rule__BooleanVariable__Group_4__1__Impl : ( ( rule__BooleanVariable__ValueAssignment_4_1 ) ) ;
    public final void rule__BooleanVariable__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3616:1: ( ( ( rule__BooleanVariable__ValueAssignment_4_1 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3617:1: ( ( rule__BooleanVariable__ValueAssignment_4_1 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3617:1: ( ( rule__BooleanVariable__ValueAssignment_4_1 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3618:1: ( rule__BooleanVariable__ValueAssignment_4_1 )
            {
             before(grammarAccess.getBooleanVariableAccess().getValueAssignment_4_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3619:1: ( rule__BooleanVariable__ValueAssignment_4_1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3619:2: rule__BooleanVariable__ValueAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__ValueAssignment_4_1_in_rule__BooleanVariable__Group_4__1__Impl7282);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3633:1: rule__IntegerVariable__Group__0 : rule__IntegerVariable__Group__0__Impl rule__IntegerVariable__Group__1 ;
    public final void rule__IntegerVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3637:1: ( rule__IntegerVariable__Group__0__Impl rule__IntegerVariable__Group__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3638:2: rule__IntegerVariable__Group__0__Impl rule__IntegerVariable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group__0__Impl_in_rule__IntegerVariable__Group__07316);
            rule__IntegerVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group__1_in_rule__IntegerVariable__Group__07319);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3645:1: rule__IntegerVariable__Group__0__Impl : ( () ) ;
    public final void rule__IntegerVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3649:1: ( ( () ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3650:1: ( () )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3650:1: ( () )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3651:1: ()
            {
             before(grammarAccess.getIntegerVariableAccess().getIntegerVariableAction_0()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3652:1: ()
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3654:1: 
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3664:1: rule__IntegerVariable__Group__1 : rule__IntegerVariable__Group__1__Impl rule__IntegerVariable__Group__2 ;
    public final void rule__IntegerVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3668:1: ( rule__IntegerVariable__Group__1__Impl rule__IntegerVariable__Group__2 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3669:2: rule__IntegerVariable__Group__1__Impl rule__IntegerVariable__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group__1__Impl_in_rule__IntegerVariable__Group__17377);
            rule__IntegerVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group__2_in_rule__IntegerVariable__Group__17380);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3676:1: rule__IntegerVariable__Group__1__Impl : ( ( rule__IntegerVariable__NameAssignment_1 ) ) ;
    public final void rule__IntegerVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3680:1: ( ( ( rule__IntegerVariable__NameAssignment_1 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3681:1: ( ( rule__IntegerVariable__NameAssignment_1 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3681:1: ( ( rule__IntegerVariable__NameAssignment_1 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3682:1: ( rule__IntegerVariable__NameAssignment_1 )
            {
             before(grammarAccess.getIntegerVariableAccess().getNameAssignment_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3683:1: ( rule__IntegerVariable__NameAssignment_1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3683:2: rule__IntegerVariable__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__NameAssignment_1_in_rule__IntegerVariable__Group__1__Impl7407);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3693:1: rule__IntegerVariable__Group__2 : rule__IntegerVariable__Group__2__Impl rule__IntegerVariable__Group__3 ;
    public final void rule__IntegerVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3697:1: ( rule__IntegerVariable__Group__2__Impl rule__IntegerVariable__Group__3 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3698:2: rule__IntegerVariable__Group__2__Impl rule__IntegerVariable__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group__2__Impl_in_rule__IntegerVariable__Group__27437);
            rule__IntegerVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group__3_in_rule__IntegerVariable__Group__27440);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3705:1: rule__IntegerVariable__Group__2__Impl : ( ':' ) ;
    public final void rule__IntegerVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3709:1: ( ( ':' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3710:1: ( ':' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3710:1: ( ':' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3711:1: ':'
            {
             before(grammarAccess.getIntegerVariableAccess().getColonKeyword_2()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__IntegerVariable__Group__2__Impl7468); 
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3724:1: rule__IntegerVariable__Group__3 : rule__IntegerVariable__Group__3__Impl rule__IntegerVariable__Group__4 ;
    public final void rule__IntegerVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3728:1: ( rule__IntegerVariable__Group__3__Impl rule__IntegerVariable__Group__4 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3729:2: rule__IntegerVariable__Group__3__Impl rule__IntegerVariable__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group__3__Impl_in_rule__IntegerVariable__Group__37499);
            rule__IntegerVariable__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group__4_in_rule__IntegerVariable__Group__37502);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3736:1: rule__IntegerVariable__Group__3__Impl : ( 'integer' ) ;
    public final void rule__IntegerVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3740:1: ( ( 'integer' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3741:1: ( 'integer' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3741:1: ( 'integer' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3742:1: 'integer'
            {
             before(grammarAccess.getIntegerVariableAccess().getIntegerKeyword_3()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__IntegerVariable__Group__3__Impl7530); 
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3755:1: rule__IntegerVariable__Group__4 : rule__IntegerVariable__Group__4__Impl ;
    public final void rule__IntegerVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3759:1: ( rule__IntegerVariable__Group__4__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3760:2: rule__IntegerVariable__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group__4__Impl_in_rule__IntegerVariable__Group__47561);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3766:1: rule__IntegerVariable__Group__4__Impl : ( ( rule__IntegerVariable__Group_4__0 )? ) ;
    public final void rule__IntegerVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3770:1: ( ( ( rule__IntegerVariable__Group_4__0 )? ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3771:1: ( ( rule__IntegerVariable__Group_4__0 )? )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3771:1: ( ( rule__IntegerVariable__Group_4__0 )? )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3772:1: ( rule__IntegerVariable__Group_4__0 )?
            {
             before(grammarAccess.getIntegerVariableAccess().getGroup_4()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3773:1: ( rule__IntegerVariable__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==40) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3773:2: rule__IntegerVariable__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group_4__0_in_rule__IntegerVariable__Group__4__Impl7588);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3793:1: rule__IntegerVariable__Group_4__0 : rule__IntegerVariable__Group_4__0__Impl rule__IntegerVariable__Group_4__1 ;
    public final void rule__IntegerVariable__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3797:1: ( rule__IntegerVariable__Group_4__0__Impl rule__IntegerVariable__Group_4__1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3798:2: rule__IntegerVariable__Group_4__0__Impl rule__IntegerVariable__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group_4__0__Impl_in_rule__IntegerVariable__Group_4__07629);
            rule__IntegerVariable__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group_4__1_in_rule__IntegerVariable__Group_4__07632);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3805:1: rule__IntegerVariable__Group_4__0__Impl : ( ':=' ) ;
    public final void rule__IntegerVariable__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3809:1: ( ( ':=' ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3810:1: ( ':=' )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3810:1: ( ':=' )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3811:1: ':='
            {
             before(grammarAccess.getIntegerVariableAccess().getColonEqualsSignKeyword_4_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__IntegerVariable__Group_4__0__Impl7660); 
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3824:1: rule__IntegerVariable__Group_4__1 : rule__IntegerVariable__Group_4__1__Impl ;
    public final void rule__IntegerVariable__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3828:1: ( rule__IntegerVariable__Group_4__1__Impl )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3829:2: rule__IntegerVariable__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group_4__1__Impl_in_rule__IntegerVariable__Group_4__17691);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3835:1: rule__IntegerVariable__Group_4__1__Impl : ( ( rule__IntegerVariable__ValueAssignment_4_1 ) ) ;
    public final void rule__IntegerVariable__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3839:1: ( ( ( rule__IntegerVariable__ValueAssignment_4_1 ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3840:1: ( ( rule__IntegerVariable__ValueAssignment_4_1 ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3840:1: ( ( rule__IntegerVariable__ValueAssignment_4_1 ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3841:1: ( rule__IntegerVariable__ValueAssignment_4_1 )
            {
             before(grammarAccess.getIntegerVariableAccess().getValueAssignment_4_1()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3842:1: ( rule__IntegerVariable__ValueAssignment_4_1 )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3842:2: rule__IntegerVariable__ValueAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__ValueAssignment_4_1_in_rule__IntegerVariable__Group_4__1__Impl7718);
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


    // $ANTLR start "rule__StateMachine__NameAssignment_1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3857:1: rule__StateMachine__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__StateMachine__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3861:1: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3862:1: ( ruleEString )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3862:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3863:1: ruleEString
            {
             before(grammarAccess.getStateMachineAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__StateMachine__NameAssignment_17757);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__StateMachine__NameAssignment_1"


    // $ANTLR start "rule__StateMachine__VariablesAssignment_3"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3872:1: rule__StateMachine__VariablesAssignment_3 : ( ruleVariable ) ;
    public final void rule__StateMachine__VariablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3876:1: ( ( ruleVariable ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3877:1: ( ruleVariable )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3877:1: ( ruleVariable )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3878:1: ruleVariable
            {
             before(grammarAccess.getStateMachineAccess().getVariablesVariableParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_rule__StateMachine__VariablesAssignment_37788);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getVariablesVariableParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__StateMachine__VariablesAssignment_3"


    // $ANTLR start "rule__StateMachine__EventsAssignment_6"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3887:1: rule__StateMachine__EventsAssignment_6 : ( ruleEvent ) ;
    public final void rule__StateMachine__EventsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3891:1: ( ( ruleEvent ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3892:1: ( ruleEvent )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3892:1: ( ruleEvent )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3893:1: ruleEvent
            {
             before(grammarAccess.getStateMachineAccess().getEventsEventParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEvent_in_rule__StateMachine__EventsAssignment_67819);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getEventsEventParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__StateMachine__EventsAssignment_6"


    // $ANTLR start "rule__StateMachine__EventsAssignment_7_1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3902:1: rule__StateMachine__EventsAssignment_7_1 : ( ruleEvent ) ;
    public final void rule__StateMachine__EventsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3906:1: ( ( ruleEvent ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3907:1: ( ruleEvent )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3907:1: ( ruleEvent )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3908:1: ruleEvent
            {
             before(grammarAccess.getStateMachineAccess().getEventsEventParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEvent_in_rule__StateMachine__EventsAssignment_7_17850);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getEventsEventParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__StateMachine__EventsAssignment_7_1"


    // $ANTLR start "rule__StateMachine__StatesAssignment_9"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3917:1: rule__StateMachine__StatesAssignment_9 : ( ruleState ) ;
    public final void rule__StateMachine__StatesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3921:1: ( ( ruleState ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3922:1: ( ruleState )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3922:1: ( ruleState )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3923:1: ruleState
            {
             before(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_in_rule__StateMachine__StatesAssignment_97881);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__StateMachine__StatesAssignment_9"


    // $ANTLR start "rule__StateMachine__InitialStateAssignment_11"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3932:1: rule__StateMachine__InitialStateAssignment_11 : ( ruleInitialState ) ;
    public final void rule__StateMachine__InitialStateAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3936:1: ( ( ruleInitialState ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3937:1: ( ruleInitialState )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3937:1: ( ruleInitialState )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3938:1: ruleInitialState
            {
             before(grammarAccess.getStateMachineAccess().getInitialStateInitialStateParserRuleCall_11_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInitialState_in_rule__StateMachine__InitialStateAssignment_117912);
            ruleInitialState();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getInitialStateInitialStateParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__StateMachine__InitialStateAssignment_11"


    // $ANTLR start "rule__StateMachine__TransitionsAssignment_12"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3947:1: rule__StateMachine__TransitionsAssignment_12 : ( ruleTransition ) ;
    public final void rule__StateMachine__TransitionsAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3951:1: ( ( ruleTransition ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3952:1: ( ruleTransition )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3952:1: ( ruleTransition )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3953:1: ruleTransition
            {
             before(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_12_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_rule__StateMachine__TransitionsAssignment_127943);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__StateMachine__TransitionsAssignment_12"


    // $ANTLR start "rule__Operation__ContentsAssignment_1_1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3962:1: rule__Operation__ContentsAssignment_1_1 : ( ruleAssignment ) ;
    public final void rule__Operation__ContentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3966:1: ( ( ruleAssignment ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3967:1: ( ruleAssignment )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3967:1: ( ruleAssignment )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3968:1: ruleAssignment
            {
             before(grammarAccess.getOperationAccess().getContentsAssignmentParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_rule__Operation__ContentsAssignment_1_17974);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getContentsAssignmentParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Operation__ContentsAssignment_1_1"


    // $ANTLR start "rule__Operation__ContentsAssignment_1_2_1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3977:1: rule__Operation__ContentsAssignment_1_2_1 : ( ruleAssignment ) ;
    public final void rule__Operation__ContentsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3981:1: ( ( ruleAssignment ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3982:1: ( ruleAssignment )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3982:1: ( ruleAssignment )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3983:1: ruleAssignment
            {
             before(grammarAccess.getOperationAccess().getContentsAssignmentParserRuleCall_1_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_rule__Operation__ContentsAssignment_1_2_18005);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getContentsAssignmentParserRuleCall_1_2_1_0()); 

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
    // $ANTLR end "rule__Operation__ContentsAssignment_1_2_1"


    // $ANTLR start "rule__State_Impl__NameAssignment_1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3992:1: rule__State_Impl__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__State_Impl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3996:1: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3997:1: ( ruleEString )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3997:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:3998:1: ruleEString
            {
             before(grammarAccess.getState_ImplAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__State_Impl__NameAssignment_18036);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getState_ImplAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__State_Impl__NameAssignment_1"


    // $ANTLR start "rule__State_Impl__OperationAssignment_3_1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4007:1: rule__State_Impl__OperationAssignment_3_1 : ( ruleOperation ) ;
    public final void rule__State_Impl__OperationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4011:1: ( ( ruleOperation ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4012:1: ( ruleOperation )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4012:1: ( ruleOperation )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4013:1: ruleOperation
            {
             before(grammarAccess.getState_ImplAccess().getOperationOperationParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_rule__State_Impl__OperationAssignment_3_18067);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getState_ImplAccess().getOperationOperationParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__State_Impl__OperationAssignment_3_1"


    // $ANTLR start "rule__InitialState__ReferencedStateAssignment"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4022:1: rule__InitialState__ReferencedStateAssignment : ( ( ruleEString ) ) ;
    public final void rule__InitialState__ReferencedStateAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4026:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4027:1: ( ( ruleEString ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4027:1: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4028:1: ( ruleEString )
            {
             before(grammarAccess.getInitialStateAccess().getReferencedStateStateCrossReference_0()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4029:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4030:1: ruleEString
            {
             before(grammarAccess.getInitialStateAccess().getReferencedStateStateEStringParserRuleCall_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InitialState__ReferencedStateAssignment8102);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInitialStateAccess().getReferencedStateStateEStringParserRuleCall_0_1()); 

            }

             after(grammarAccess.getInitialStateAccess().getReferencedStateStateCrossReference_0()); 

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
    // $ANTLR end "rule__InitialState__ReferencedStateAssignment"


    // $ANTLR start "rule__Transition__SourceAssignment_1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4041:1: rule__Transition__SourceAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__SourceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4045:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4046:1: ( ( ruleEString ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4046:1: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4047:1: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getSourceStateCrossReference_1_0()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4048:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4049:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getSourceStateEStringParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__SourceAssignment_18141);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getSourceStateEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getSourceStateCrossReference_1_0()); 

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
    // $ANTLR end "rule__Transition__SourceAssignment_1"


    // $ANTLR start "rule__Transition__TargetAssignment_3"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4060:1: rule__Transition__TargetAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Transition__TargetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4064:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4065:1: ( ( ruleEString ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4065:1: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4066:1: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getTargetStateCrossReference_3_0()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4067:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4068:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getTargetStateEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__TargetAssignment_38180);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getTargetStateEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getTargetStateCrossReference_3_0()); 

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
    // $ANTLR end "rule__Transition__TargetAssignment_3"


    // $ANTLR start "rule__Transition__EventAssignment_5"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4079:1: rule__Transition__EventAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Transition__EventAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4083:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4084:1: ( ( ruleEString ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4084:1: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4085:1: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getEventEventCrossReference_5_0()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4086:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4087:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getEventEventEStringParserRuleCall_5_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__EventAssignment_58219);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getEventEventEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getEventEventCrossReference_5_0()); 

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
    // $ANTLR end "rule__Transition__EventAssignment_5"


    // $ANTLR start "rule__Transition__GuardAssignment_6_1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4098:1: rule__Transition__GuardAssignment_6_1 : ( ruleExpression ) ;
    public final void rule__Transition__GuardAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4102:1: ( ( ruleExpression ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4103:1: ( ruleExpression )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4103:1: ( ruleExpression )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4104:1: ruleExpression
            {
             before(grammarAccess.getTransitionAccess().getGuardExpressionParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Transition__GuardAssignment_6_18254);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getGuardExpressionParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Transition__GuardAssignment_6_1"


    // $ANTLR start "rule__Event__NameAssignment_1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4113:1: rule__Event__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Event__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4117:1: ( ( RULE_STRING ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4118:1: ( RULE_STRING )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4118:1: ( RULE_STRING )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4119:1: RULE_STRING
            {
             before(grammarAccess.getEventAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Event__NameAssignment_18285); 
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


    // $ANTLR start "rule__Assignment__VariableAssignment_0"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4128:1: rule__Assignment__VariableAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Assignment__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4132:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4133:1: ( ( ruleEString ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4133:1: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4134:1: ( ruleEString )
            {
             before(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_0_0()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4135:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4136:1: ruleEString
            {
             before(grammarAccess.getAssignmentAccess().getVariableVariableEStringParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Assignment__VariableAssignment_08320);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getVariableVariableEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_0_0()); 

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
    // $ANTLR end "rule__Assignment__VariableAssignment_0"


    // $ANTLR start "rule__Assignment__ExpressionAssignment_2"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4147:1: rule__Assignment__ExpressionAssignment_2 : ( ruleExpressionElement ) ;
    public final void rule__Assignment__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4151:1: ( ( ruleExpressionElement ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4152:1: ( ruleExpressionElement )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4152:1: ( ruleExpressionElement )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4153:1: ruleExpressionElement
            {
             before(grammarAccess.getAssignmentAccess().getExpressionExpressionElementParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionElement_in_rule__Assignment__ExpressionAssignment_28355);
            ruleExpressionElement();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getExpressionExpressionElementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Assignment__ExpressionAssignment_2"


    // $ANTLR start "rule__Expression__OperatorAssignment_3"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4162:1: rule__Expression__OperatorAssignment_3 : ( ruleOperator ) ;
    public final void rule__Expression__OperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4166:1: ( ( ruleOperator ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4167:1: ( ruleOperator )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4167:1: ( ruleOperator )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4168:1: ruleOperator
            {
             before(grammarAccess.getExpressionAccess().getOperatorOperatorEnumRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperator_in_rule__Expression__OperatorAssignment_38386);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4177:1: rule__Expression___nameAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Expression___nameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4181:1: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4182:1: ( ruleEString )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4182:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4183:1: ruleEString
            {
             before(grammarAccess.getExpressionAccess().get_nameEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Expression___nameAssignment_4_18417);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4192:1: rule__Expression__LeftAssignment_6 : ( ruleExpressionElement ) ;
    public final void rule__Expression__LeftAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4196:1: ( ( ruleExpressionElement ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4197:1: ( ruleExpressionElement )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4197:1: ( ruleExpressionElement )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4198:1: ruleExpressionElement
            {
             before(grammarAccess.getExpressionAccess().getLeftExpressionElementParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionElement_in_rule__Expression__LeftAssignment_68448);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4207:1: rule__Expression__RightAssignment_8 : ( ruleExpressionElement ) ;
    public final void rule__Expression__RightAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4211:1: ( ( ruleExpressionElement ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4212:1: ( ruleExpressionElement )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4212:1: ( ruleExpressionElement )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4213:1: ruleExpressionElement
            {
             before(grammarAccess.getExpressionAccess().getRightExpressionElementParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionElement_in_rule__Expression__RightAssignment_88479);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4222:1: rule__BooleanData__ValueAssignment : ( ruleEBoolean ) ;
    public final void rule__BooleanData__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4226:1: ( ( ruleEBoolean ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4227:1: ( ruleEBoolean )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4227:1: ( ruleEBoolean )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4228:1: ruleEBoolean
            {
             before(grammarAccess.getBooleanDataAccess().getValueEBooleanParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__BooleanData__ValueAssignment8510);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4237:1: rule__IntegerData__ValueAssignment : ( ruleEInt ) ;
    public final void rule__IntegerData__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4241:1: ( ( ruleEInt ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4242:1: ( ruleEInt )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4242:1: ( ruleEInt )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4243:1: ruleEInt
            {
             before(grammarAccess.getIntegerDataAccess().getValueEIntParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__IntegerData__ValueAssignment8541);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4252:1: rule__VariableReference___nameAssignment_2_1 : ( ruleEString ) ;
    public final void rule__VariableReference___nameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4256:1: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4257:1: ( ruleEString )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4257:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4258:1: ruleEString
            {
             before(grammarAccess.getVariableReferenceAccess().get_nameEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__VariableReference___nameAssignment_2_18572);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4267:1: rule__VariableReference__VariableAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__VariableReference__VariableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4271:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4272:1: ( ( ruleEString ) )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4272:1: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4273:1: ( ruleEString )
            {
             before(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_4_0()); 
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4274:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4275:1: ruleEString
            {
             before(grammarAccess.getVariableReferenceAccess().getVariableVariableEStringParserRuleCall_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__VariableReference__VariableAssignment_48607);
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


    // $ANTLR start "rule__CompositeState_Impl__NameAssignment_1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4286:1: rule__CompositeState_Impl__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CompositeState_Impl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4290:1: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4291:1: ( ruleEString )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4291:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4292:1: ruleEString
            {
             before(grammarAccess.getCompositeState_ImplAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CompositeState_Impl__NameAssignment_18642);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeState_ImplAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__CompositeState_Impl__NameAssignment_1"


    // $ANTLR start "rule__CompositeState_Impl__StatesAssignment_3"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4301:1: rule__CompositeState_Impl__StatesAssignment_3 : ( ruleState ) ;
    public final void rule__CompositeState_Impl__StatesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4305:1: ( ( ruleState ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4306:1: ( ruleState )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4306:1: ( ruleState )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4307:1: ruleState
            {
             before(grammarAccess.getCompositeState_ImplAccess().getStatesStateParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_in_rule__CompositeState_Impl__StatesAssignment_38673);
            ruleState();

            state._fsp--;

             after(grammarAccess.getCompositeState_ImplAccess().getStatesStateParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__CompositeState_Impl__StatesAssignment_3"


    // $ANTLR start "rule__CompositeState_Impl__OperationAssignment_4_1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4316:1: rule__CompositeState_Impl__OperationAssignment_4_1 : ( ruleOperation ) ;
    public final void rule__CompositeState_Impl__OperationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4320:1: ( ( ruleOperation ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4321:1: ( ruleOperation )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4321:1: ( ruleOperation )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4322:1: ruleOperation
            {
             before(grammarAccess.getCompositeState_ImplAccess().getOperationOperationParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_rule__CompositeState_Impl__OperationAssignment_4_18704);
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


    // $ANTLR start "rule__CompositeState_Impl__InitialStateAssignment_6"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4331:1: rule__CompositeState_Impl__InitialStateAssignment_6 : ( ruleInitialState ) ;
    public final void rule__CompositeState_Impl__InitialStateAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4335:1: ( ( ruleInitialState ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4336:1: ( ruleInitialState )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4336:1: ( ruleInitialState )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4337:1: ruleInitialState
            {
             before(grammarAccess.getCompositeState_ImplAccess().getInitialStateInitialStateParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInitialState_in_rule__CompositeState_Impl__InitialStateAssignment_68735);
            ruleInitialState();

            state._fsp--;

             after(grammarAccess.getCompositeState_ImplAccess().getInitialStateInitialStateParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__CompositeState_Impl__InitialStateAssignment_6"


    // $ANTLR start "rule__BooleanVariable__NameAssignment_1"
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4346:1: rule__BooleanVariable__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__BooleanVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4350:1: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4351:1: ( ruleEString )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4351:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4352:1: ruleEString
            {
             before(grammarAccess.getBooleanVariableAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BooleanVariable__NameAssignment_18766);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4361:1: rule__BooleanVariable__ValueAssignment_4_1 : ( ruleBooleanData ) ;
    public final void rule__BooleanVariable__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4365:1: ( ( ruleBooleanData ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4366:1: ( ruleBooleanData )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4366:1: ( ruleBooleanData )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4367:1: ruleBooleanData
            {
             before(grammarAccess.getBooleanVariableAccess().getValueBooleanDataParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanData_in_rule__BooleanVariable__ValueAssignment_4_18797);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4376:1: rule__IntegerVariable__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__IntegerVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4380:1: ( ( ruleEString ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4381:1: ( ruleEString )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4381:1: ( ruleEString )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4382:1: ruleEString
            {
             before(grammarAccess.getIntegerVariableAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__IntegerVariable__NameAssignment_18828);
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
    // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4391:1: rule__IntegerVariable__ValueAssignment_4_1 : ( ruleIntegerData ) ;
    public final void rule__IntegerVariable__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4395:1: ( ( ruleIntegerData ) )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4396:1: ( ruleIntegerData )
            {
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4396:1: ( ruleIntegerData )
            // ../org.xtext.StateMachine.sm.ui/src-gen/org/xtext/StateMachine/sm/ui/contentassist/antlr/internal/InternalSM.g:4397:1: ruleIntegerData
            {
             before(grammarAccess.getIntegerVariableAccess().getValueIntegerDataParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerData_in_rule__IntegerVariable__ValueAssignment_4_18859);
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
        public static final BitSet FOLLOW_rule__InitialState__ReferencedStateAssignment_in_ruleInitialState576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition603 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent663 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEvent670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__0_in_ruleEvent696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment723 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__0_in_ruleAssignment756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression783 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__0_in_ruleExpression816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanData_in_entryRuleBooleanData843 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanData850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanData__ValueAssignment_in_ruleBooleanData876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerData_in_entryRuleIntegerData903 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerData910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerData__ValueAssignment_in_ruleIntegerData936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference963 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group__0_in_ruleVariableReference996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1023 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt1056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeState_Impl_in_entryRuleCompositeState_Impl1083 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompositeState_Impl1090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__0_in_ruleCompositeState_Impl1116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanVariable_in_entryRuleBooleanVariable1143 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanVariable1150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group__0_in_ruleBooleanVariable1176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerVariable_in_entryRuleIntegerVariable1203 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerVariable1210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group__0_in_ruleIntegerVariable1236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operator__Alternatives_in_ruleOperator1273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_Impl_in_rule__State__Alternatives1308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateMachine_in_rule__State__Alternatives1325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeState_Impl_in_rule__State__Alternatives1342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanVariable_in_rule__Variable__Alternatives_11374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerVariable_in_rule__Variable__Alternatives_11391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__ExpressionElement__Alternatives1423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanData_in_rule__ExpressionElement__Alternatives1440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerData_in_rule__ExpressionElement__Alternatives1457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_rule__ExpressionElement__Alternatives1474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__EBoolean__Alternatives1557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EBoolean__Alternatives1577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Operator__Alternatives1612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Operator__Alternatives1633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Operator__Alternatives1654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Operator__Alternatives1675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Operator__Alternatives1696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Operator__Alternatives1717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Operator__Alternatives1738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Operator__Alternatives1759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Operator__Alternatives1780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Operator__Alternatives1801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Operator__Alternatives1822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Operator__Alternatives1843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Operator__Alternatives1864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__0__Impl_in_rule__StateMachine__Group__01897 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__1_in_rule__StateMachine__Group__01900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__StateMachine__Group__0__Impl1928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__1__Impl_in_rule__StateMachine__Group__11959 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__2_in_rule__StateMachine__Group__11962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__NameAssignment_1_in_rule__StateMachine__Group__1__Impl1989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__2__Impl_in_rule__StateMachine__Group__22019 = new BitSet(new long[]{0x0000000110000000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__3_in_rule__StateMachine__Group__22022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__StateMachine__Group__2__Impl2050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__3__Impl_in_rule__StateMachine__Group__32081 = new BitSet(new long[]{0x0000000110000000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__4_in_rule__StateMachine__Group__32084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__VariablesAssignment_3_in_rule__StateMachine__Group__3__Impl2111 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__4__Impl_in_rule__StateMachine__Group__42142 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__5_in_rule__StateMachine__Group__42145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__StateMachine__Group__4__Impl2173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__5__Impl_in_rule__StateMachine__Group__52204 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__6_in_rule__StateMachine__Group__52207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__StateMachine__Group__5__Impl2235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__6__Impl_in_rule__StateMachine__Group__62266 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__7_in_rule__StateMachine__Group__62269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__EventsAssignment_6_in_rule__StateMachine__Group__6__Impl2296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__7__Impl_in_rule__StateMachine__Group__72326 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__8_in_rule__StateMachine__Group__72329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_7__0_in_rule__StateMachine__Group__7__Impl2356 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__8__Impl_in_rule__StateMachine__Group__82387 = new BitSet(new long[]{0x0000000404000000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__9_in_rule__StateMachine__Group__82390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__StateMachine__Group__8__Impl2418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__9__Impl_in_rule__StateMachine__Group__92449 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__10_in_rule__StateMachine__Group__92452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__StatesAssignment_9_in_rule__StateMachine__Group__9__Impl2481 = new BitSet(new long[]{0x0000000404000002L});
        public static final BitSet FOLLOW_rule__StateMachine__StatesAssignment_9_in_rule__StateMachine__Group__9__Impl2493 = new BitSet(new long[]{0x0000000404000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__10__Impl_in_rule__StateMachine__Group__102526 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__11_in_rule__StateMachine__Group__102529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__StateMachine__Group__10__Impl2557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__11__Impl_in_rule__StateMachine__Group__112588 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__12_in_rule__StateMachine__Group__112591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__InitialStateAssignment_11_in_rule__StateMachine__Group__11__Impl2618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__12__Impl_in_rule__StateMachine__Group__122648 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__13_in_rule__StateMachine__Group__122651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__TransitionsAssignment_12_in_rule__StateMachine__Group__12__Impl2680 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__TransitionsAssignment_12_in_rule__StateMachine__Group__12__Impl2692 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__13__Impl_in_rule__StateMachine__Group__132725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__StateMachine__Group__13__Impl2753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_7__0__Impl_in_rule__StateMachine__Group_7__02812 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_7__1_in_rule__StateMachine__Group_7__02815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__StateMachine__Group_7__0__Impl2843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_7__1__Impl_in_rule__StateMachine__Group_7__12874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__EventsAssignment_7_1_in_rule__StateMachine__Group_7__1__Impl2901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__02935 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__02938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Variable__Group__0__Impl2966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__12997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Alternatives_1_in_rule__Variable__Group__1__Impl3024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__03058 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__03061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__13119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_1__0_in_rule__Operation__Group__1__Impl3146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_1__0__Impl_in_rule__Operation__Group_1__03181 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Operation__Group_1__1_in_rule__Operation__Group_1__03184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Operation__Group_1__0__Impl3212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_1__1__Impl_in_rule__Operation__Group_1__13243 = new BitSet(new long[]{0x0000000220000000L});
        public static final BitSet FOLLOW_rule__Operation__Group_1__2_in_rule__Operation__Group_1__13246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__ContentsAssignment_1_1_in_rule__Operation__Group_1__1__Impl3273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_1__2__Impl_in_rule__Operation__Group_1__23303 = new BitSet(new long[]{0x0000000220000000L});
        public static final BitSet FOLLOW_rule__Operation__Group_1__3_in_rule__Operation__Group_1__23306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_1_2__0_in_rule__Operation__Group_1__2__Impl3333 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_1__3__Impl_in_rule__Operation__Group_1__33364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Operation__Group_1__3__Impl3392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_1_2__0__Impl_in_rule__Operation__Group_1_2__03431 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Operation__Group_1_2__1_in_rule__Operation__Group_1_2__03434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Operation__Group_1_2__0__Impl3462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_1_2__1__Impl_in_rule__Operation__Group_1_2__13493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__ContentsAssignment_1_2_1_in_rule__Operation__Group_1_2__1__Impl3520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State_Impl__Group__0__Impl_in_rule__State_Impl__Group__03554 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__State_Impl__Group__1_in_rule__State_Impl__Group__03557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__State_Impl__Group__0__Impl3585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State_Impl__Group__1__Impl_in_rule__State_Impl__Group__13616 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__State_Impl__Group__2_in_rule__State_Impl__Group__13619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State_Impl__NameAssignment_1_in_rule__State_Impl__Group__1__Impl3646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State_Impl__Group__2__Impl_in_rule__State_Impl__Group__23676 = new BitSet(new long[]{0x0000000820000000L});
        public static final BitSet FOLLOW_rule__State_Impl__Group__3_in_rule__State_Impl__Group__23679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__State_Impl__Group__2__Impl3707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State_Impl__Group__3__Impl_in_rule__State_Impl__Group__33738 = new BitSet(new long[]{0x0000000820000000L});
        public static final BitSet FOLLOW_rule__State_Impl__Group__4_in_rule__State_Impl__Group__33741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State_Impl__Group_3__0_in_rule__State_Impl__Group__3__Impl3768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State_Impl__Group__4__Impl_in_rule__State_Impl__Group__43799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__State_Impl__Group__4__Impl3827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State_Impl__Group_3__0__Impl_in_rule__State_Impl__Group_3__03868 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__State_Impl__Group_3__1_in_rule__State_Impl__Group_3__03871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__State_Impl__Group_3__0__Impl3899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State_Impl__Group_3__1__Impl_in_rule__State_Impl__Group_3__13930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State_Impl__OperationAssignment_3_1_in_rule__State_Impl__Group_3__1__Impl3957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__03991 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__03994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Transition__Group__0__Impl4022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__14053 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__14056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__SourceAssignment_1_in_rule__Transition__Group__1__Impl4083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__24113 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__24116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Transition__Group__2__Impl4144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__34175 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__34178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__TargetAssignment_3_in_rule__Transition__Group__3__Impl4205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__44235 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group__5_in_rule__Transition__Group__44238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Transition__Group__4__Impl4266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__5__Impl_in_rule__Transition__Group__54297 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__Transition__Group__6_in_rule__Transition__Group__54300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__EventAssignment_5_in_rule__Transition__Group__5__Impl4327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__6__Impl_in_rule__Transition__Group__64357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_6__0_in_rule__Transition__Group__6__Impl4384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_6__0__Impl_in_rule__Transition__Group_6__04429 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Transition__Group_6__1_in_rule__Transition__Group_6__04432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Transition__Group_6__0__Impl4460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_6__1__Impl_in_rule__Transition__Group_6__14491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__GuardAssignment_6_1_in_rule__Transition__Group_6__1__Impl4518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__04552 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__04555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__14613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__NameAssignment_1_in_rule__Event__Group__1__Impl4640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__04674 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__04677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__VariableAssignment_0_in_rule__Assignment__Group__0__Impl4704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__14734 = new BitSet(new long[]{0x0001420000001840L});
        public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__14737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Assignment__Group__1__Impl4765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__24796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__ExpressionAssignment_2_in_rule__Assignment__Group__2__Impl4823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__04859 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__04862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Expression__Group__0__Impl4890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__14921 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Expression__Group__2_in_rule__Expression__Group__14924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Expression__Group__1__Impl4952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__2__Impl_in_rule__Expression__Group__24983 = new BitSet(new long[]{0x0000000003FFE000L});
        public static final BitSet FOLLOW_rule__Expression__Group__3_in_rule__Expression__Group__24986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Expression__Group__2__Impl5014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__3__Impl_in_rule__Expression__Group__35045 = new BitSet(new long[]{0x0000280000000000L});
        public static final BitSet FOLLOW_rule__Expression__Group__4_in_rule__Expression__Group__35048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__OperatorAssignment_3_in_rule__Expression__Group__3__Impl5075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__4__Impl_in_rule__Expression__Group__45105 = new BitSet(new long[]{0x0000280000000000L});
        public static final BitSet FOLLOW_rule__Expression__Group__5_in_rule__Expression__Group__45108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group_4__0_in_rule__Expression__Group__4__Impl5135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__5__Impl_in_rule__Expression__Group__55166 = new BitSet(new long[]{0x0001420000001840L});
        public static final BitSet FOLLOW_rule__Expression__Group__6_in_rule__Expression__Group__55169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Expression__Group__5__Impl5197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__6__Impl_in_rule__Expression__Group__65228 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_rule__Expression__Group__7_in_rule__Expression__Group__65231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__LeftAssignment_6_in_rule__Expression__Group__6__Impl5258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__7__Impl_in_rule__Expression__Group__75288 = new BitSet(new long[]{0x0001420000001840L});
        public static final BitSet FOLLOW_rule__Expression__Group__8_in_rule__Expression__Group__75291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Expression__Group__7__Impl5319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__8__Impl_in_rule__Expression__Group__85350 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Expression__Group__9_in_rule__Expression__Group__85353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__RightAssignment_8_in_rule__Expression__Group__8__Impl5380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__9__Impl_in_rule__Expression__Group__95410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Expression__Group__9__Impl5438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group_4__0__Impl_in_rule__Expression__Group_4__05489 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Expression__Group_4__1_in_rule__Expression__Group_4__05492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Expression__Group_4__0__Impl5520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group_4__1__Impl_in_rule__Expression__Group_4__15551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression___nameAssignment_4_1_in_rule__Expression__Group_4__1__Impl5578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group__0__Impl_in_rule__VariableReference__Group__05612 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__VariableReference__Group__1_in_rule__VariableReference__Group__05615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__VariableReference__Group__0__Impl5643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group__1__Impl_in_rule__VariableReference__Group__15674 = new BitSet(new long[]{0x0000A00000000000L});
        public static final BitSet FOLLOW_rule__VariableReference__Group__2_in_rule__VariableReference__Group__15677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__VariableReference__Group__1__Impl5705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group__2__Impl_in_rule__VariableReference__Group__25736 = new BitSet(new long[]{0x0000A00000000000L});
        public static final BitSet FOLLOW_rule__VariableReference__Group__3_in_rule__VariableReference__Group__25739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group_2__0_in_rule__VariableReference__Group__2__Impl5766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group__3__Impl_in_rule__VariableReference__Group__35797 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__VariableReference__Group__4_in_rule__VariableReference__Group__35800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__VariableReference__Group__3__Impl5828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group__4__Impl_in_rule__VariableReference__Group__45859 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__VariableReference__Group__5_in_rule__VariableReference__Group__45862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__VariableAssignment_4_in_rule__VariableReference__Group__4__Impl5889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group__5__Impl_in_rule__VariableReference__Group__55919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__VariableReference__Group__5__Impl5947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group_2__0__Impl_in_rule__VariableReference__Group_2__05990 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__VariableReference__Group_2__1_in_rule__VariableReference__Group_2__05993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__VariableReference__Group_2__0__Impl6021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group_2__1__Impl_in_rule__VariableReference__Group_2__16052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference___nameAssignment_2_1_in_rule__VariableReference__Group_2__1__Impl6079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__06113 = new BitSet(new long[]{0x0001000000000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__06116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__EInt__Group__0__Impl6145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__16178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl6205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__0__Impl_in_rule__CompositeState_Impl__Group__06238 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__1_in_rule__CompositeState_Impl__Group__06241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__CompositeState_Impl__Group__0__Impl6269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__1__Impl_in_rule__CompositeState_Impl__Group__16300 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__2_in_rule__CompositeState_Impl__Group__16303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__NameAssignment_1_in_rule__CompositeState_Impl__Group__1__Impl6330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__2__Impl_in_rule__CompositeState_Impl__Group__26360 = new BitSet(new long[]{0x0000000404000000L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__3_in_rule__CompositeState_Impl__Group__26363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__CompositeState_Impl__Group__2__Impl6391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__3__Impl_in_rule__CompositeState_Impl__Group__36422 = new BitSet(new long[]{0x0000000840000000L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__4_in_rule__CompositeState_Impl__Group__36425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__StatesAssignment_3_in_rule__CompositeState_Impl__Group__3__Impl6454 = new BitSet(new long[]{0x0000000404000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__StatesAssignment_3_in_rule__CompositeState_Impl__Group__3__Impl6466 = new BitSet(new long[]{0x0000000404000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__4__Impl_in_rule__CompositeState_Impl__Group__46499 = new BitSet(new long[]{0x0000000840000000L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__5_in_rule__CompositeState_Impl__Group__46502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group_4__0_in_rule__CompositeState_Impl__Group__4__Impl6529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__5__Impl_in_rule__CompositeState_Impl__Group__56560 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__6_in_rule__CompositeState_Impl__Group__56563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__CompositeState_Impl__Group__5__Impl6591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__6__Impl_in_rule__CompositeState_Impl__Group__66622 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__7_in_rule__CompositeState_Impl__Group__66625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__InitialStateAssignment_6_in_rule__CompositeState_Impl__Group__6__Impl6652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group__7__Impl_in_rule__CompositeState_Impl__Group__76682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__CompositeState_Impl__Group__7__Impl6710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group_4__0__Impl_in_rule__CompositeState_Impl__Group_4__06757 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group_4__1_in_rule__CompositeState_Impl__Group_4__06760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__CompositeState_Impl__Group_4__0__Impl6788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__Group_4__1__Impl_in_rule__CompositeState_Impl__Group_4__16819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState_Impl__OperationAssignment_4_1_in_rule__CompositeState_Impl__Group_4__1__Impl6846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group__0__Impl_in_rule__BooleanVariable__Group__06880 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group__1_in_rule__BooleanVariable__Group__06883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group__1__Impl_in_rule__BooleanVariable__Group__16941 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group__2_in_rule__BooleanVariable__Group__16944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__NameAssignment_1_in_rule__BooleanVariable__Group__1__Impl6971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group__2__Impl_in_rule__BooleanVariable__Group__27001 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group__3_in_rule__BooleanVariable__Group__27004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__BooleanVariable__Group__2__Impl7032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group__3__Impl_in_rule__BooleanVariable__Group__37063 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group__4_in_rule__BooleanVariable__Group__37066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__BooleanVariable__Group__3__Impl7094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group__4__Impl_in_rule__BooleanVariable__Group__47125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group_4__0_in_rule__BooleanVariable__Group__4__Impl7152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group_4__0__Impl_in_rule__BooleanVariable__Group_4__07193 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group_4__1_in_rule__BooleanVariable__Group_4__07196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__BooleanVariable__Group_4__0__Impl7224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group_4__1__Impl_in_rule__BooleanVariable__Group_4__17255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__ValueAssignment_4_1_in_rule__BooleanVariable__Group_4__1__Impl7282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group__0__Impl_in_rule__IntegerVariable__Group__07316 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group__1_in_rule__IntegerVariable__Group__07319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group__1__Impl_in_rule__IntegerVariable__Group__17377 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group__2_in_rule__IntegerVariable__Group__17380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__NameAssignment_1_in_rule__IntegerVariable__Group__1__Impl7407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group__2__Impl_in_rule__IntegerVariable__Group__27437 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group__3_in_rule__IntegerVariable__Group__27440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__IntegerVariable__Group__2__Impl7468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group__3__Impl_in_rule__IntegerVariable__Group__37499 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group__4_in_rule__IntegerVariable__Group__37502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__IntegerVariable__Group__3__Impl7530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group__4__Impl_in_rule__IntegerVariable__Group__47561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group_4__0_in_rule__IntegerVariable__Group__4__Impl7588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group_4__0__Impl_in_rule__IntegerVariable__Group_4__07629 = new BitSet(new long[]{0x0001000000000040L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group_4__1_in_rule__IntegerVariable__Group_4__07632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__IntegerVariable__Group_4__0__Impl7660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group_4__1__Impl_in_rule__IntegerVariable__Group_4__17691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__ValueAssignment_4_1_in_rule__IntegerVariable__Group_4__1__Impl7718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__StateMachine__NameAssignment_17757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_rule__StateMachine__VariablesAssignment_37788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvent_in_rule__StateMachine__EventsAssignment_67819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvent_in_rule__StateMachine__EventsAssignment_7_17850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_rule__StateMachine__StatesAssignment_97881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitialState_in_rule__StateMachine__InitialStateAssignment_117912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_rule__StateMachine__TransitionsAssignment_127943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_rule__Operation__ContentsAssignment_1_17974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_rule__Operation__ContentsAssignment_1_2_18005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__State_Impl__NameAssignment_18036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_rule__State_Impl__OperationAssignment_3_18067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InitialState__ReferencedStateAssignment8102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__SourceAssignment_18141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__TargetAssignment_38180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__EventAssignment_58219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Transition__GuardAssignment_6_18254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Event__NameAssignment_18285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Assignment__VariableAssignment_08320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionElement_in_rule__Assignment__ExpressionAssignment_28355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperator_in_rule__Expression__OperatorAssignment_38386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Expression___nameAssignment_4_18417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionElement_in_rule__Expression__LeftAssignment_68448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionElement_in_rule__Expression__RightAssignment_88479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__BooleanData__ValueAssignment8510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__IntegerData__ValueAssignment8541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__VariableReference___nameAssignment_2_18572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__VariableReference__VariableAssignment_48607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CompositeState_Impl__NameAssignment_18642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_rule__CompositeState_Impl__StatesAssignment_38673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_rule__CompositeState_Impl__OperationAssignment_4_18704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitialState_in_rule__CompositeState_Impl__InitialStateAssignment_68735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BooleanVariable__NameAssignment_18766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanData_in_rule__BooleanVariable__ValueAssignment_4_18797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__IntegerVariable__NameAssignment_18828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerData_in_rule__IntegerVariable__ValueAssignment_4_18859 = new BitSet(new long[]{0x0000000000000002L});
    }


}