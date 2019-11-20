package com.simonbaars.cdd.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.simonbaars.cdd.services.CloneDetectionDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCloneDetectionDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_BOOL_LITERAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'Subtree'", "'LLOC'", "'SLOC'", "'tokens'", "'declarations'", "'statements'", "'nodes'", "'lines'", "'&'", "'|'", "'Subnodes'", "'StringMatch'", "'CompleteMatch'", "'FQI'", "'->'", "'=>'", "'CyclomaticComplexity'", "'LineVolume'", "'TokenVolume'", "'StatementVolume'", "'NumberOfParameters'", "'AND'", "'OR'", "'=='", "'!='", "'>='", "'>'", "'<='", "'<'", "'Project'", "'SearchRoot'", "'Match'", "'Exclude'", "','", "'Size'", "'('", "')'", "'DoNotCompare'", "'Compare'", "'%'", "'NOT'", "'+'", "'-'", "'/'", "'max'", "'min'", "'mod'", "'^'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_BOOL_LITERAL=7;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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


        public InternalCloneDetectionDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCloneDetectionDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCloneDetectionDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCloneDetectionDSL.g"; }


    	private CloneDetectionDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(CloneDetectionDSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleCloneDetection"
    // InternalCloneDetectionDSL.g:54:1: entryRuleCloneDetection : ruleCloneDetection EOF ;
    public final void entryRuleCloneDetection() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:55:1: ( ruleCloneDetection EOF )
            // InternalCloneDetectionDSL.g:56:1: ruleCloneDetection EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCloneDetectionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCloneDetection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCloneDetectionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCloneDetection"


    // $ANTLR start "ruleCloneDetection"
    // InternalCloneDetectionDSL.g:63:1: ruleCloneDetection : ( ( rule__CloneDetection__UnorderedGroup ) ) ;
    public final void ruleCloneDetection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:67:2: ( ( ( rule__CloneDetection__UnorderedGroup ) ) )
            // InternalCloneDetectionDSL.g:68:2: ( ( rule__CloneDetection__UnorderedGroup ) )
            {
            // InternalCloneDetectionDSL.g:68:2: ( ( rule__CloneDetection__UnorderedGroup ) )
            // InternalCloneDetectionDSL.g:69:3: ( rule__CloneDetection__UnorderedGroup )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCloneDetectionAccess().getUnorderedGroup()); 
            }
            // InternalCloneDetectionDSL.g:70:3: ( rule__CloneDetection__UnorderedGroup )
            // InternalCloneDetectionDSL.g:70:4: rule__CloneDetection__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__CloneDetection__UnorderedGroup();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCloneDetectionAccess().getUnorderedGroup()); 
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
    // $ANTLR end "ruleCloneDetection"


    // $ANTLR start "entryRuleProject"
    // InternalCloneDetectionDSL.g:79:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:80:1: ( ruleProject EOF )
            // InternalCloneDetectionDSL.g:81:1: ruleProject EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleProject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProjectRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalCloneDetectionDSL.g:88:1: ruleProject : ( ( rule__Project__Group__0 ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:92:2: ( ( ( rule__Project__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:93:2: ( ( rule__Project__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:93:2: ( ( rule__Project__Group__0 ) )
            // InternalCloneDetectionDSL.g:94:3: ( rule__Project__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:95:3: ( rule__Project__Group__0 )
            // InternalCloneDetectionDSL.g:95:4: rule__Project__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProjectAccess().getGroup()); 
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
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleSearchRoot"
    // InternalCloneDetectionDSL.g:104:1: entryRuleSearchRoot : ruleSearchRoot EOF ;
    public final void entryRuleSearchRoot() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:105:1: ( ruleSearchRoot EOF )
            // InternalCloneDetectionDSL.g:106:1: ruleSearchRoot EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSearchRootRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSearchRoot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSearchRootRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSearchRoot"


    // $ANTLR start "ruleSearchRoot"
    // InternalCloneDetectionDSL.g:113:1: ruleSearchRoot : ( ( rule__SearchRoot__Group__0 ) ) ;
    public final void ruleSearchRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:117:2: ( ( ( rule__SearchRoot__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:118:2: ( ( rule__SearchRoot__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:118:2: ( ( rule__SearchRoot__Group__0 ) )
            // InternalCloneDetectionDSL.g:119:3: ( rule__SearchRoot__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSearchRootAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:120:3: ( rule__SearchRoot__Group__0 )
            // InternalCloneDetectionDSL.g:120:4: rule__SearchRoot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SearchRoot__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSearchRootAccess().getGroup()); 
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
    // $ANTLR end "ruleSearchRoot"


    // $ANTLR start "entryRuleMatch"
    // InternalCloneDetectionDSL.g:129:1: entryRuleMatch : ruleMatch EOF ;
    public final void entryRuleMatch() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:130:1: ( ruleMatch EOF )
            // InternalCloneDetectionDSL.g:131:1: ruleMatch EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMatch();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMatch"


    // $ANTLR start "ruleMatch"
    // InternalCloneDetectionDSL.g:138:1: ruleMatch : ( ( rule__Match__Group__0 ) ) ;
    public final void ruleMatch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:142:2: ( ( ( rule__Match__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:143:2: ( ( rule__Match__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:143:2: ( ( rule__Match__Group__0 ) )
            // InternalCloneDetectionDSL.g:144:3: ( rule__Match__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:145:3: ( rule__Match__Group__0 )
            // InternalCloneDetectionDSL.g:145:4: rule__Match__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Match__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchAccess().getGroup()); 
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
    // $ANTLR end "ruleMatch"


    // $ANTLR start "entryRuleExclude"
    // InternalCloneDetectionDSL.g:154:1: entryRuleExclude : ruleExclude EOF ;
    public final void entryRuleExclude() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:155:1: ( ruleExclude EOF )
            // InternalCloneDetectionDSL.g:156:1: ruleExclude EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExcludeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExclude();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExcludeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExclude"


    // $ANTLR start "ruleExclude"
    // InternalCloneDetectionDSL.g:163:1: ruleExclude : ( ( rule__Exclude__Group__0 ) ) ;
    public final void ruleExclude() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:167:2: ( ( ( rule__Exclude__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:168:2: ( ( rule__Exclude__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:168:2: ( ( rule__Exclude__Group__0 ) )
            // InternalCloneDetectionDSL.g:169:3: ( rule__Exclude__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExcludeAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:170:3: ( rule__Exclude__Group__0 )
            // InternalCloneDetectionDSL.g:170:4: rule__Exclude__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exclude__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExcludeAccess().getGroup()); 
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
    // $ANTLR end "ruleExclude"


    // $ANTLR start "entryRuleNode"
    // InternalCloneDetectionDSL.g:179:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:180:1: ( ruleNode EOF )
            // InternalCloneDetectionDSL.g:181:1: ruleNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalCloneDetectionDSL.g:188:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:192:2: ( ( ( rule__Node__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:193:2: ( ( rule__Node__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:193:2: ( ( rule__Node__Group__0 ) )
            // InternalCloneDetectionDSL.g:194:3: ( rule__Node__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:195:3: ( rule__Node__Group__0 )
            // InternalCloneDetectionDSL.g:195:4: rule__Node__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getGroup()); 
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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleNodes"
    // InternalCloneDetectionDSL.g:204:1: entryRuleNodes : ruleNodes EOF ;
    public final void entryRuleNodes() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:205:1: ( ruleNodes EOF )
            // InternalCloneDetectionDSL.g:206:1: ruleNodes EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNodes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodesRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNodes"


    // $ANTLR start "ruleNodes"
    // InternalCloneDetectionDSL.g:213:1: ruleNodes : ( ( rule__Nodes__Group__0 ) ) ;
    public final void ruleNodes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:217:2: ( ( ( rule__Nodes__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:218:2: ( ( rule__Nodes__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:218:2: ( ( rule__Nodes__Group__0 ) )
            // InternalCloneDetectionDSL.g:219:3: ( rule__Nodes__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodesAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:220:3: ( rule__Nodes__Group__0 )
            // InternalCloneDetectionDSL.g:220:4: rule__Nodes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Nodes__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodesAccess().getGroup()); 
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
    // $ANTLR end "ruleNodes"


    // $ANTLR start "entryRuleMinSize"
    // InternalCloneDetectionDSL.g:229:1: entryRuleMinSize : ruleMinSize EOF ;
    public final void entryRuleMinSize() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:230:1: ( ruleMinSize EOF )
            // InternalCloneDetectionDSL.g:231:1: ruleMinSize EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMinSize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinSizeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMinSize"


    // $ANTLR start "ruleMinSize"
    // InternalCloneDetectionDSL.g:238:1: ruleMinSize : ( ( rule__MinSize__Group__0 ) ) ;
    public final void ruleMinSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:242:2: ( ( ( rule__MinSize__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:243:2: ( ( rule__MinSize__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:243:2: ( ( rule__MinSize__Group__0 ) )
            // InternalCloneDetectionDSL.g:244:3: ( rule__MinSize__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:245:3: ( rule__MinSize__Group__0 )
            // InternalCloneDetectionDSL.g:245:4: rule__MinSize__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MinSize__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinSizeAccess().getGroup()); 
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
    // $ANTLR end "ruleMinSize"


    // $ANTLR start "entryRuleMetricExpr"
    // InternalCloneDetectionDSL.g:254:1: entryRuleMetricExpr : ruleMetricExpr EOF ;
    public final void entryRuleMetricExpr() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:255:1: ( ruleMetricExpr EOF )
            // InternalCloneDetectionDSL.g:256:1: ruleMetricExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricExprRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMetricExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetricExprRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMetricExpr"


    // $ANTLR start "ruleMetricExpr"
    // InternalCloneDetectionDSL.g:263:1: ruleMetricExpr : ( ( rule__MetricExpr__Group__0 ) ) ;
    public final void ruleMetricExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:267:2: ( ( ( rule__MetricExpr__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:268:2: ( ( rule__MetricExpr__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:268:2: ( ( rule__MetricExpr__Group__0 ) )
            // InternalCloneDetectionDSL.g:269:3: ( rule__MetricExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricExprAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:270:3: ( rule__MetricExpr__Group__0 )
            // InternalCloneDetectionDSL.g:270:4: rule__MetricExpr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MetricExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetricExprAccess().getGroup()); 
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
    // $ANTLR end "ruleMetricExpr"


    // $ANTLR start "entryRuleDoNotCompare"
    // InternalCloneDetectionDSL.g:279:1: entryRuleDoNotCompare : ruleDoNotCompare EOF ;
    public final void entryRuleDoNotCompare() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:280:1: ( ruleDoNotCompare EOF )
            // InternalCloneDetectionDSL.g:281:1: ruleDoNotCompare EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoNotCompareRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDoNotCompare();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoNotCompareRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDoNotCompare"


    // $ANTLR start "ruleDoNotCompare"
    // InternalCloneDetectionDSL.g:288:1: ruleDoNotCompare : ( ( rule__DoNotCompare__Group__0 ) ) ;
    public final void ruleDoNotCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:292:2: ( ( ( rule__DoNotCompare__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:293:2: ( ( rule__DoNotCompare__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:293:2: ( ( rule__DoNotCompare__Group__0 ) )
            // InternalCloneDetectionDSL.g:294:3: ( rule__DoNotCompare__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoNotCompareAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:295:3: ( rule__DoNotCompare__Group__0 )
            // InternalCloneDetectionDSL.g:295:4: rule__DoNotCompare__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DoNotCompare__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoNotCompareAccess().getGroup()); 
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
    // $ANTLR end "ruleDoNotCompare"


    // $ANTLR start "entryRuleCompare"
    // InternalCloneDetectionDSL.g:304:1: entryRuleCompare : ruleCompare EOF ;
    public final void entryRuleCompare() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:305:1: ( ruleCompare EOF )
            // InternalCloneDetectionDSL.g:306:1: ruleCompare EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCompare();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCompare"


    // $ANTLR start "ruleCompare"
    // InternalCloneDetectionDSL.g:313:1: ruleCompare : ( ( rule__Compare__Group__0 ) ) ;
    public final void ruleCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:317:2: ( ( ( rule__Compare__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:318:2: ( ( rule__Compare__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:318:2: ( ( rule__Compare__Group__0 ) )
            // InternalCloneDetectionDSL.g:319:3: ( rule__Compare__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:320:3: ( rule__Compare__Group__0 )
            // InternalCloneDetectionDSL.g:320:4: rule__Compare__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Compare__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getGroup()); 
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
    // $ANTLR end "ruleCompare"


    // $ANTLR start "entryRulePercentage"
    // InternalCloneDetectionDSL.g:329:1: entryRulePercentage : rulePercentage EOF ;
    public final void entryRulePercentage() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:330:1: ( rulePercentage EOF )
            // InternalCloneDetectionDSL.g:331:1: rulePercentage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPercentageRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePercentage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPercentageRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePercentage"


    // $ANTLR start "rulePercentage"
    // InternalCloneDetectionDSL.g:338:1: rulePercentage : ( ( rule__Percentage__Group__0 ) ) ;
    public final void rulePercentage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:342:2: ( ( ( rule__Percentage__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:343:2: ( ( rule__Percentage__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:343:2: ( ( rule__Percentage__Group__0 ) )
            // InternalCloneDetectionDSL.g:344:3: ( rule__Percentage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPercentageAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:345:3: ( rule__Percentage__Group__0 )
            // InternalCloneDetectionDSL.g:345:4: rule__Percentage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Percentage__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPercentageAccess().getGroup()); 
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
    // $ANTLR end "rulePercentage"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalCloneDetectionDSL.g:354:1: entryRuleBooleanExpression : ruleBooleanExpression EOF ;
    public final void entryRuleBooleanExpression() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:355:1: ( ruleBooleanExpression EOF )
            // InternalCloneDetectionDSL.g:356:1: ruleBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalCloneDetectionDSL.g:363:1: ruleBooleanExpression : ( ruleBooleanExpressionLevel1 ) ;
    public final void ruleBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:367:2: ( ( ruleBooleanExpressionLevel1 ) )
            // InternalCloneDetectionDSL.g:368:2: ( ruleBooleanExpressionLevel1 )
            {
            // InternalCloneDetectionDSL.g:368:2: ( ruleBooleanExpressionLevel1 )
            // InternalCloneDetectionDSL.g:369:3: ruleBooleanExpressionLevel1
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getBooleanExpressionLevel1ParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanExpressionLevel1();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getBooleanExpressionLevel1ParserRuleCall()); 
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
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleBooleanExpressionLevel1"
    // InternalCloneDetectionDSL.g:379:1: entryRuleBooleanExpressionLevel1 : ruleBooleanExpressionLevel1 EOF ;
    public final void entryRuleBooleanExpressionLevel1() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:380:1: ( ruleBooleanExpressionLevel1 EOF )
            // InternalCloneDetectionDSL.g:381:1: ruleBooleanExpressionLevel1 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanExpressionLevel1();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBooleanExpressionLevel1"


    // $ANTLR start "ruleBooleanExpressionLevel1"
    // InternalCloneDetectionDSL.g:388:1: ruleBooleanExpressionLevel1 : ( ( rule__BooleanExpressionLevel1__Group__0 ) ) ;
    public final void ruleBooleanExpressionLevel1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:392:2: ( ( ( rule__BooleanExpressionLevel1__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:393:2: ( ( rule__BooleanExpressionLevel1__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:393:2: ( ( rule__BooleanExpressionLevel1__Group__0 ) )
            // InternalCloneDetectionDSL.g:394:3: ( rule__BooleanExpressionLevel1__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:395:3: ( rule__BooleanExpressionLevel1__Group__0 )
            // InternalCloneDetectionDSL.g:395:4: rule__BooleanExpressionLevel1__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getGroup()); 
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
    // $ANTLR end "ruleBooleanExpressionLevel1"


    // $ANTLR start "entryRuleBooleanExpressionLevel2"
    // InternalCloneDetectionDSL.g:404:1: entryRuleBooleanExpressionLevel2 : ruleBooleanExpressionLevel2 EOF ;
    public final void entryRuleBooleanExpressionLevel2() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:405:1: ( ruleBooleanExpressionLevel2 EOF )
            // InternalCloneDetectionDSL.g:406:1: ruleBooleanExpressionLevel2 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel2Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel2Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBooleanExpressionLevel2"


    // $ANTLR start "ruleBooleanExpressionLevel2"
    // InternalCloneDetectionDSL.g:413:1: ruleBooleanExpressionLevel2 : ( ( rule__BooleanExpressionLevel2__Alternatives ) ) ;
    public final void ruleBooleanExpressionLevel2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:417:2: ( ( ( rule__BooleanExpressionLevel2__Alternatives ) ) )
            // InternalCloneDetectionDSL.g:418:2: ( ( rule__BooleanExpressionLevel2__Alternatives ) )
            {
            // InternalCloneDetectionDSL.g:418:2: ( ( rule__BooleanExpressionLevel2__Alternatives ) )
            // InternalCloneDetectionDSL.g:419:3: ( rule__BooleanExpressionLevel2__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel2Access().getAlternatives()); 
            }
            // InternalCloneDetectionDSL.g:420:3: ( rule__BooleanExpressionLevel2__Alternatives )
            // InternalCloneDetectionDSL.g:420:4: rule__BooleanExpressionLevel2__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel2__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel2Access().getAlternatives()); 
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
    // $ANTLR end "ruleBooleanExpressionLevel2"


    // $ANTLR start "entryRuleNotExpression"
    // InternalCloneDetectionDSL.g:429:1: entryRuleNotExpression : ruleNotExpression EOF ;
    public final void entryRuleNotExpression() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:430:1: ( ruleNotExpression EOF )
            // InternalCloneDetectionDSL.g:431:1: ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNotExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // InternalCloneDetectionDSL.g:438:1: ruleNotExpression : ( ( rule__NotExpression__Group__0 ) ) ;
    public final void ruleNotExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:442:2: ( ( ( rule__NotExpression__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:443:2: ( ( rule__NotExpression__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:443:2: ( ( rule__NotExpression__Group__0 ) )
            // InternalCloneDetectionDSL.g:444:3: ( rule__NotExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:445:3: ( rule__NotExpression__Group__0 )
            // InternalCloneDetectionDSL.g:445:4: rule__NotExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NotExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleBooleanExpressionLevel3"
    // InternalCloneDetectionDSL.g:454:1: entryRuleBooleanExpressionLevel3 : ruleBooleanExpressionLevel3 EOF ;
    public final void entryRuleBooleanExpressionLevel3() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:455:1: ( ruleBooleanExpressionLevel3 EOF )
            // InternalCloneDetectionDSL.g:456:1: ruleBooleanExpressionLevel3 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel3Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel3Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBooleanExpressionLevel3"


    // $ANTLR start "ruleBooleanExpressionLevel3"
    // InternalCloneDetectionDSL.g:463:1: ruleBooleanExpressionLevel3 : ( ( rule__BooleanExpressionLevel3__Alternatives ) ) ;
    public final void ruleBooleanExpressionLevel3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:467:2: ( ( ( rule__BooleanExpressionLevel3__Alternatives ) ) )
            // InternalCloneDetectionDSL.g:468:2: ( ( rule__BooleanExpressionLevel3__Alternatives ) )
            {
            // InternalCloneDetectionDSL.g:468:2: ( ( rule__BooleanExpressionLevel3__Alternatives ) )
            // InternalCloneDetectionDSL.g:469:3: ( rule__BooleanExpressionLevel3__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel3Access().getAlternatives()); 
            }
            // InternalCloneDetectionDSL.g:470:3: ( rule__BooleanExpressionLevel3__Alternatives )
            // InternalCloneDetectionDSL.g:470:4: rule__BooleanExpressionLevel3__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel3__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel3Access().getAlternatives()); 
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
    // $ANTLR end "ruleBooleanExpressionLevel3"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalCloneDetectionDSL.g:479:1: entryRuleComparisonExpression : ruleComparisonExpression EOF ;
    public final void entryRuleComparisonExpression() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:480:1: ( ruleComparisonExpression EOF )
            // InternalCloneDetectionDSL.g:481:1: ruleComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalCloneDetectionDSL.g:488:1: ruleComparisonExpression : ( ( rule__ComparisonExpression__Group__0 ) ) ;
    public final void ruleComparisonExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:492:2: ( ( ( rule__ComparisonExpression__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:493:2: ( ( rule__ComparisonExpression__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:493:2: ( ( rule__ComparisonExpression__Group__0 ) )
            // InternalCloneDetectionDSL.g:494:3: ( rule__ComparisonExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:495:3: ( rule__ComparisonExpression__Group__0 )
            // InternalCloneDetectionDSL.g:495:4: rule__ComparisonExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleBooleanExpressionBracket"
    // InternalCloneDetectionDSL.g:504:1: entryRuleBooleanExpressionBracket : ruleBooleanExpressionBracket EOF ;
    public final void entryRuleBooleanExpressionBracket() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:505:1: ( ruleBooleanExpressionBracket EOF )
            // InternalCloneDetectionDSL.g:506:1: ruleBooleanExpressionBracket EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionBracketRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanExpressionBracket();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionBracketRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBooleanExpressionBracket"


    // $ANTLR start "ruleBooleanExpressionBracket"
    // InternalCloneDetectionDSL.g:513:1: ruleBooleanExpressionBracket : ( ( rule__BooleanExpressionBracket__Group__0 ) ) ;
    public final void ruleBooleanExpressionBracket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:517:2: ( ( ( rule__BooleanExpressionBracket__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:518:2: ( ( rule__BooleanExpressionBracket__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:518:2: ( ( rule__BooleanExpressionBracket__Group__0 ) )
            // InternalCloneDetectionDSL.g:519:3: ( rule__BooleanExpressionBracket__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionBracketAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:520:3: ( rule__BooleanExpressionBracket__Group__0 )
            // InternalCloneDetectionDSL.g:520:4: rule__BooleanExpressionBracket__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionBracket__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionBracketAccess().getGroup()); 
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
    // $ANTLR end "ruleBooleanExpressionBracket"


    // $ANTLR start "entryRuleBooleanExpressionConstant"
    // InternalCloneDetectionDSL.g:529:1: entryRuleBooleanExpressionConstant : ruleBooleanExpressionConstant EOF ;
    public final void entryRuleBooleanExpressionConstant() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:530:1: ( ruleBooleanExpressionConstant EOF )
            // InternalCloneDetectionDSL.g:531:1: ruleBooleanExpressionConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanExpressionConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionConstantRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBooleanExpressionConstant"


    // $ANTLR start "ruleBooleanExpressionConstant"
    // InternalCloneDetectionDSL.g:538:1: ruleBooleanExpressionConstant : ( ( rule__BooleanExpressionConstant__ValueAssignment ) ) ;
    public final void ruleBooleanExpressionConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:542:2: ( ( ( rule__BooleanExpressionConstant__ValueAssignment ) ) )
            // InternalCloneDetectionDSL.g:543:2: ( ( rule__BooleanExpressionConstant__ValueAssignment ) )
            {
            // InternalCloneDetectionDSL.g:543:2: ( ( rule__BooleanExpressionConstant__ValueAssignment ) )
            // InternalCloneDetectionDSL.g:544:3: ( rule__BooleanExpressionConstant__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionConstantAccess().getValueAssignment()); 
            }
            // InternalCloneDetectionDSL.g:545:3: ( rule__BooleanExpressionConstant__ValueAssignment )
            // InternalCloneDetectionDSL.g:545:4: rule__BooleanExpressionConstant__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionConstant__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionConstantAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleBooleanExpressionConstant"


    // $ANTLR start "entryRuleIntExpression"
    // InternalCloneDetectionDSL.g:554:1: entryRuleIntExpression : ruleIntExpression EOF ;
    public final void entryRuleIntExpression() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:555:1: ( ruleIntExpression EOF )
            // InternalCloneDetectionDSL.g:556:1: ruleIntExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIntExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIntExpression"


    // $ANTLR start "ruleIntExpression"
    // InternalCloneDetectionDSL.g:563:1: ruleIntExpression : ( ruleExpressionLevel1 ) ;
    public final void ruleIntExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:567:2: ( ( ruleExpressionLevel1 ) )
            // InternalCloneDetectionDSL.g:568:2: ( ruleExpressionLevel1 )
            {
            // InternalCloneDetectionDSL.g:568:2: ( ruleExpressionLevel1 )
            // InternalCloneDetectionDSL.g:569:3: ruleExpressionLevel1
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntExpressionAccess().getExpressionLevel1ParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel1();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntExpressionAccess().getExpressionLevel1ParserRuleCall()); 
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
    // $ANTLR end "ruleIntExpression"


    // $ANTLR start "entryRuleExpressionLevel1"
    // InternalCloneDetectionDSL.g:579:1: entryRuleExpressionLevel1 : ruleExpressionLevel1 EOF ;
    public final void entryRuleExpressionLevel1() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:580:1: ( ruleExpressionLevel1 EOF )
            // InternalCloneDetectionDSL.g:581:1: ruleExpressionLevel1 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionLevel1();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpressionLevel1"


    // $ANTLR start "ruleExpressionLevel1"
    // InternalCloneDetectionDSL.g:588:1: ruleExpressionLevel1 : ( ( rule__ExpressionLevel1__Group__0 ) ) ;
    public final void ruleExpressionLevel1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:592:2: ( ( ( rule__ExpressionLevel1__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:593:2: ( ( rule__ExpressionLevel1__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:593:2: ( ( rule__ExpressionLevel1__Group__0 ) )
            // InternalCloneDetectionDSL.g:594:3: ( rule__ExpressionLevel1__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:595:3: ( rule__ExpressionLevel1__Group__0 )
            // InternalCloneDetectionDSL.g:595:4: rule__ExpressionLevel1__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getGroup()); 
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
    // $ANTLR end "ruleExpressionLevel1"


    // $ANTLR start "entryRuleExpressionLevel2"
    // InternalCloneDetectionDSL.g:604:1: entryRuleExpressionLevel2 : ruleExpressionLevel2 EOF ;
    public final void entryRuleExpressionLevel2() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:605:1: ( ruleExpressionLevel2 EOF )
            // InternalCloneDetectionDSL.g:606:1: ruleExpressionLevel2 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpressionLevel2"


    // $ANTLR start "ruleExpressionLevel2"
    // InternalCloneDetectionDSL.g:613:1: ruleExpressionLevel2 : ( ( rule__ExpressionLevel2__Group__0 ) ) ;
    public final void ruleExpressionLevel2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:617:2: ( ( ( rule__ExpressionLevel2__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:618:2: ( ( rule__ExpressionLevel2__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:618:2: ( ( rule__ExpressionLevel2__Group__0 ) )
            // InternalCloneDetectionDSL.g:619:3: ( rule__ExpressionLevel2__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:620:3: ( rule__ExpressionLevel2__Group__0 )
            // InternalCloneDetectionDSL.g:620:4: rule__ExpressionLevel2__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getGroup()); 
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
    // $ANTLR end "ruleExpressionLevel2"


    // $ANTLR start "entryRuleExpressionLevel3"
    // InternalCloneDetectionDSL.g:629:1: entryRuleExpressionLevel3 : ruleExpressionLevel3 EOF ;
    public final void entryRuleExpressionLevel3() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:630:1: ( ruleExpressionLevel3 EOF )
            // InternalCloneDetectionDSL.g:631:1: ruleExpressionLevel3 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpressionLevel3"


    // $ANTLR start "ruleExpressionLevel3"
    // InternalCloneDetectionDSL.g:638:1: ruleExpressionLevel3 : ( ( rule__ExpressionLevel3__Group__0 ) ) ;
    public final void ruleExpressionLevel3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:642:2: ( ( ( rule__ExpressionLevel3__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:643:2: ( ( rule__ExpressionLevel3__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:643:2: ( ( rule__ExpressionLevel3__Group__0 ) )
            // InternalCloneDetectionDSL.g:644:3: ( rule__ExpressionLevel3__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:645:3: ( rule__ExpressionLevel3__Group__0 )
            // InternalCloneDetectionDSL.g:645:4: rule__ExpressionLevel3__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getGroup()); 
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
    // $ANTLR end "ruleExpressionLevel3"


    // $ANTLR start "entryRuleExpressionLevel4"
    // InternalCloneDetectionDSL.g:654:1: entryRuleExpressionLevel4 : ruleExpressionLevel4 EOF ;
    public final void entryRuleExpressionLevel4() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:655:1: ( ruleExpressionLevel4 EOF )
            // InternalCloneDetectionDSL.g:656:1: ruleExpressionLevel4 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel4Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionLevel4();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel4Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpressionLevel4"


    // $ANTLR start "ruleExpressionLevel4"
    // InternalCloneDetectionDSL.g:663:1: ruleExpressionLevel4 : ( ( rule__ExpressionLevel4__Alternatives ) ) ;
    public final void ruleExpressionLevel4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:667:2: ( ( ( rule__ExpressionLevel4__Alternatives ) ) )
            // InternalCloneDetectionDSL.g:668:2: ( ( rule__ExpressionLevel4__Alternatives ) )
            {
            // InternalCloneDetectionDSL.g:668:2: ( ( rule__ExpressionLevel4__Alternatives ) )
            // InternalCloneDetectionDSL.g:669:3: ( rule__ExpressionLevel4__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel4Access().getAlternatives()); 
            }
            // InternalCloneDetectionDSL.g:670:3: ( rule__ExpressionLevel4__Alternatives )
            // InternalCloneDetectionDSL.g:670:4: rule__ExpressionLevel4__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel4__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel4Access().getAlternatives()); 
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
    // $ANTLR end "ruleExpressionLevel4"


    // $ANTLR start "entryRuleExpressionMinus"
    // InternalCloneDetectionDSL.g:679:1: entryRuleExpressionMinus : ruleExpressionMinus EOF ;
    public final void entryRuleExpressionMinus() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:680:1: ( ruleExpressionMinus EOF )
            // InternalCloneDetectionDSL.g:681:1: ruleExpressionMinus EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionMinusRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpressionMinus"


    // $ANTLR start "ruleExpressionMinus"
    // InternalCloneDetectionDSL.g:688:1: ruleExpressionMinus : ( ( rule__ExpressionMinus__Group__0 ) ) ;
    public final void ruleExpressionMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:692:2: ( ( ( rule__ExpressionMinus__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:693:2: ( ( rule__ExpressionMinus__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:693:2: ( ( rule__ExpressionMinus__Group__0 ) )
            // InternalCloneDetectionDSL.g:694:3: ( rule__ExpressionMinus__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionMinusAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:695:3: ( rule__ExpressionMinus__Group__0 )
            // InternalCloneDetectionDSL.g:695:4: rule__ExpressionMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionMinus__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionMinusAccess().getGroup()); 
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
    // $ANTLR end "ruleExpressionMinus"


    // $ANTLR start "entryRuleExpressionPlus"
    // InternalCloneDetectionDSL.g:704:1: entryRuleExpressionPlus : ruleExpressionPlus EOF ;
    public final void entryRuleExpressionPlus() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:705:1: ( ruleExpressionPlus EOF )
            // InternalCloneDetectionDSL.g:706:1: ruleExpressionPlus EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionPlusRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionPlus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionPlusRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpressionPlus"


    // $ANTLR start "ruleExpressionPlus"
    // InternalCloneDetectionDSL.g:713:1: ruleExpressionPlus : ( ( rule__ExpressionPlus__Group__0 ) ) ;
    public final void ruleExpressionPlus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:717:2: ( ( ( rule__ExpressionPlus__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:718:2: ( ( rule__ExpressionPlus__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:718:2: ( ( rule__ExpressionPlus__Group__0 ) )
            // InternalCloneDetectionDSL.g:719:3: ( rule__ExpressionPlus__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionPlusAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:720:3: ( rule__ExpressionPlus__Group__0 )
            // InternalCloneDetectionDSL.g:720:4: rule__ExpressionPlus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionPlus__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionPlusAccess().getGroup()); 
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
    // $ANTLR end "ruleExpressionPlus"


    // $ANTLR start "entryRuleExpressionLevel5"
    // InternalCloneDetectionDSL.g:729:1: entryRuleExpressionLevel5 : ruleExpressionLevel5 EOF ;
    public final void entryRuleExpressionLevel5() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:730:1: ( ruleExpressionLevel5 EOF )
            // InternalCloneDetectionDSL.g:731:1: ruleExpressionLevel5 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel5Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionLevel5();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel5Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpressionLevel5"


    // $ANTLR start "ruleExpressionLevel5"
    // InternalCloneDetectionDSL.g:738:1: ruleExpressionLevel5 : ( ( rule__ExpressionLevel5__Alternatives ) ) ;
    public final void ruleExpressionLevel5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:742:2: ( ( ( rule__ExpressionLevel5__Alternatives ) ) )
            // InternalCloneDetectionDSL.g:743:2: ( ( rule__ExpressionLevel5__Alternatives ) )
            {
            // InternalCloneDetectionDSL.g:743:2: ( ( rule__ExpressionLevel5__Alternatives ) )
            // InternalCloneDetectionDSL.g:744:3: ( rule__ExpressionLevel5__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel5Access().getAlternatives()); 
            }
            // InternalCloneDetectionDSL.g:745:3: ( rule__ExpressionLevel5__Alternatives )
            // InternalCloneDetectionDSL.g:745:4: rule__ExpressionLevel5__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel5__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel5Access().getAlternatives()); 
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
    // $ANTLR end "ruleExpressionLevel5"


    // $ANTLR start "entryRuleExpressionBracket"
    // InternalCloneDetectionDSL.g:754:1: entryRuleExpressionBracket : ruleExpressionBracket EOF ;
    public final void entryRuleExpressionBracket() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:755:1: ( ruleExpressionBracket EOF )
            // InternalCloneDetectionDSL.g:756:1: ruleExpressionBracket EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBracketRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionBracket();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBracketRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpressionBracket"


    // $ANTLR start "ruleExpressionBracket"
    // InternalCloneDetectionDSL.g:763:1: ruleExpressionBracket : ( ( rule__ExpressionBracket__Group__0 ) ) ;
    public final void ruleExpressionBracket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:767:2: ( ( ( rule__ExpressionBracket__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:768:2: ( ( rule__ExpressionBracket__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:768:2: ( ( rule__ExpressionBracket__Group__0 ) )
            // InternalCloneDetectionDSL.g:769:3: ( rule__ExpressionBracket__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBracketAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:770:3: ( rule__ExpressionBracket__Group__0 )
            // InternalCloneDetectionDSL.g:770:4: rule__ExpressionBracket__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBracketAccess().getGroup()); 
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
    // $ANTLR end "ruleExpressionBracket"


    // $ANTLR start "entryRuleExpressionConstantInt"
    // InternalCloneDetectionDSL.g:779:1: entryRuleExpressionConstantInt : ruleExpressionConstantInt EOF ;
    public final void entryRuleExpressionConstantInt() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:780:1: ( ruleExpressionConstantInt EOF )
            // InternalCloneDetectionDSL.g:781:1: ruleExpressionConstantInt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionConstantIntRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionConstantInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionConstantIntRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpressionConstantInt"


    // $ANTLR start "ruleExpressionConstantInt"
    // InternalCloneDetectionDSL.g:788:1: ruleExpressionConstantInt : ( ( rule__ExpressionConstantInt__ValueAssignment ) ) ;
    public final void ruleExpressionConstantInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:792:2: ( ( ( rule__ExpressionConstantInt__ValueAssignment ) ) )
            // InternalCloneDetectionDSL.g:793:2: ( ( rule__ExpressionConstantInt__ValueAssignment ) )
            {
            // InternalCloneDetectionDSL.g:793:2: ( ( rule__ExpressionConstantInt__ValueAssignment ) )
            // InternalCloneDetectionDSL.g:794:3: ( rule__ExpressionConstantInt__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionConstantIntAccess().getValueAssignment()); 
            }
            // InternalCloneDetectionDSL.g:795:3: ( rule__ExpressionConstantInt__ValueAssignment )
            // InternalCloneDetectionDSL.g:795:4: rule__ExpressionConstantInt__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionConstantInt__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionConstantIntAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleExpressionConstantInt"


    // $ANTLR start "ruleMatchTarget"
    // InternalCloneDetectionDSL.g:804:1: ruleMatchTarget : ( ( rule__MatchTarget__Alternatives ) ) ;
    public final void ruleMatchTarget() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:808:1: ( ( ( rule__MatchTarget__Alternatives ) ) )
            // InternalCloneDetectionDSL.g:809:2: ( ( rule__MatchTarget__Alternatives ) )
            {
            // InternalCloneDetectionDSL.g:809:2: ( ( rule__MatchTarget__Alternatives ) )
            // InternalCloneDetectionDSL.g:810:3: ( rule__MatchTarget__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTargetAccess().getAlternatives()); 
            }
            // InternalCloneDetectionDSL.g:811:3: ( rule__MatchTarget__Alternatives )
            // InternalCloneDetectionDSL.g:811:4: rule__MatchTarget__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MatchTarget__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchTargetAccess().getAlternatives()); 
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
    // $ANTLR end "ruleMatchTarget"


    // $ANTLR start "ruleSizeMetric"
    // InternalCloneDetectionDSL.g:820:1: ruleSizeMetric : ( ( rule__SizeMetric__Alternatives ) ) ;
    public final void ruleSizeMetric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:824:1: ( ( ( rule__SizeMetric__Alternatives ) ) )
            // InternalCloneDetectionDSL.g:825:2: ( ( rule__SizeMetric__Alternatives ) )
            {
            // InternalCloneDetectionDSL.g:825:2: ( ( rule__SizeMetric__Alternatives ) )
            // InternalCloneDetectionDSL.g:826:3: ( rule__SizeMetric__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeMetricAccess().getAlternatives()); 
            }
            // InternalCloneDetectionDSL.g:827:3: ( rule__SizeMetric__Alternatives )
            // InternalCloneDetectionDSL.g:827:4: rule__SizeMetric__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SizeMetric__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSizeMetricAccess().getAlternatives()); 
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
    // $ANTLR end "ruleSizeMetric"


    // $ANTLR start "ruleBoolOperator"
    // InternalCloneDetectionDSL.g:836:1: ruleBoolOperator : ( ( rule__BoolOperator__Alternatives ) ) ;
    public final void ruleBoolOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:840:1: ( ( ( rule__BoolOperator__Alternatives ) ) )
            // InternalCloneDetectionDSL.g:841:2: ( ( rule__BoolOperator__Alternatives ) )
            {
            // InternalCloneDetectionDSL.g:841:2: ( ( rule__BoolOperator__Alternatives ) )
            // InternalCloneDetectionDSL.g:842:3: ( rule__BoolOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolOperatorAccess().getAlternatives()); 
            }
            // InternalCloneDetectionDSL.g:843:3: ( rule__BoolOperator__Alternatives )
            // InternalCloneDetectionDSL.g:843:4: rule__BoolOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BoolOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolOperatorAccess().getAlternatives()); 
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
    // $ANTLR end "ruleBoolOperator"


    // $ANTLR start "ruleMethod"
    // InternalCloneDetectionDSL.g:852:1: ruleMethod : ( ( rule__Method__Alternatives ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:856:1: ( ( ( rule__Method__Alternatives ) ) )
            // InternalCloneDetectionDSL.g:857:2: ( ( rule__Method__Alternatives ) )
            {
            // InternalCloneDetectionDSL.g:857:2: ( ( rule__Method__Alternatives ) )
            // InternalCloneDetectionDSL.g:858:3: ( rule__Method__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getAlternatives()); 
            }
            // InternalCloneDetectionDSL.g:859:3: ( rule__Method__Alternatives )
            // InternalCloneDetectionDSL.g:859:4: rule__Method__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Method__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getAlternatives()); 
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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "ruleUnder"
    // InternalCloneDetectionDSL.g:868:1: ruleUnder : ( ( rule__Under__Alternatives ) ) ;
    public final void ruleUnder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:872:1: ( ( ( rule__Under__Alternatives ) ) )
            // InternalCloneDetectionDSL.g:873:2: ( ( rule__Under__Alternatives ) )
            {
            // InternalCloneDetectionDSL.g:873:2: ( ( rule__Under__Alternatives ) )
            // InternalCloneDetectionDSL.g:874:3: ( rule__Under__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnderAccess().getAlternatives()); 
            }
            // InternalCloneDetectionDSL.g:875:3: ( rule__Under__Alternatives )
            // InternalCloneDetectionDSL.g:875:4: rule__Under__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Under__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnderAccess().getAlternatives()); 
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
    // $ANTLR end "ruleUnder"


    // $ANTLR start "ruleMetric"
    // InternalCloneDetectionDSL.g:884:1: ruleMetric : ( ( rule__Metric__Alternatives ) ) ;
    public final void ruleMetric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:888:1: ( ( ( rule__Metric__Alternatives ) ) )
            // InternalCloneDetectionDSL.g:889:2: ( ( rule__Metric__Alternatives ) )
            {
            // InternalCloneDetectionDSL.g:889:2: ( ( rule__Metric__Alternatives ) )
            // InternalCloneDetectionDSL.g:890:3: ( rule__Metric__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricAccess().getAlternatives()); 
            }
            // InternalCloneDetectionDSL.g:891:3: ( rule__Metric__Alternatives )
            // InternalCloneDetectionDSL.g:891:4: rule__Metric__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Metric__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetricAccess().getAlternatives()); 
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
    // $ANTLR end "ruleMetric"


    // $ANTLR start "ruleBinaryBooleanOperator"
    // InternalCloneDetectionDSL.g:900:1: ruleBinaryBooleanOperator : ( ( rule__BinaryBooleanOperator__Alternatives ) ) ;
    public final void ruleBinaryBooleanOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:904:1: ( ( ( rule__BinaryBooleanOperator__Alternatives ) ) )
            // InternalCloneDetectionDSL.g:905:2: ( ( rule__BinaryBooleanOperator__Alternatives ) )
            {
            // InternalCloneDetectionDSL.g:905:2: ( ( rule__BinaryBooleanOperator__Alternatives ) )
            // InternalCloneDetectionDSL.g:906:3: ( rule__BinaryBooleanOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryBooleanOperatorAccess().getAlternatives()); 
            }
            // InternalCloneDetectionDSL.g:907:3: ( rule__BinaryBooleanOperator__Alternatives )
            // InternalCloneDetectionDSL.g:907:4: rule__BinaryBooleanOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BinaryBooleanOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryBooleanOperatorAccess().getAlternatives()); 
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
    // $ANTLR end "ruleBinaryBooleanOperator"


    // $ANTLR start "ruleCompareOperator"
    // InternalCloneDetectionDSL.g:916:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:920:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // InternalCloneDetectionDSL.g:921:2: ( ( rule__CompareOperator__Alternatives ) )
            {
            // InternalCloneDetectionDSL.g:921:2: ( ( rule__CompareOperator__Alternatives ) )
            // InternalCloneDetectionDSL.g:922:3: ( rule__CompareOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // InternalCloneDetectionDSL.g:923:3: ( rule__CompareOperator__Alternatives )
            // InternalCloneDetectionDSL.g:923:4: rule__CompareOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
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
    // $ANTLR end "ruleCompareOperator"


    // $ANTLR start "rule__Node__Alternatives_0"
    // InternalCloneDetectionDSL.g:931:1: rule__Node__Alternatives_0 : ( ( ( rule__Node__NameAssignment_0_0 ) ) | ( '*' ) );
    public final void rule__Node__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:935:1: ( ( ( rule__Node__NameAssignment_0_0 ) ) | ( '*' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCloneDetectionDSL.g:936:2: ( ( rule__Node__NameAssignment_0_0 ) )
                    {
                    // InternalCloneDetectionDSL.g:936:2: ( ( rule__Node__NameAssignment_0_0 ) )
                    // InternalCloneDetectionDSL.g:937:3: ( rule__Node__NameAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getNameAssignment_0_0()); 
                    }
                    // InternalCloneDetectionDSL.g:938:3: ( rule__Node__NameAssignment_0_0 )
                    // InternalCloneDetectionDSL.g:938:4: rule__Node__NameAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__NameAssignment_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNodeAccess().getNameAssignment_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:942:2: ( '*' )
                    {
                    // InternalCloneDetectionDSL.g:942:2: ( '*' )
                    // InternalCloneDetectionDSL.g:943:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getAsteriskKeyword_0_1()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNodeAccess().getAsteriskKeyword_0_1()); 
                    }

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
    // $ANTLR end "rule__Node__Alternatives_0"


    // $ANTLR start "rule__MinSize__Alternatives_1"
    // InternalCloneDetectionDSL.g:952:1: rule__MinSize__Alternatives_1 : ( ( ( rule__MinSize__ExprAssignment_1_0 ) ) | ( ( rule__MinSize__Group_1_1__0 ) ) );
    public final void rule__MinSize__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:956:1: ( ( ( rule__MinSize__ExprAssignment_1_0 ) ) | ( ( rule__MinSize__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                alt2=1;
            }
            else if ( (LA2_0==48) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCloneDetectionDSL.g:957:2: ( ( rule__MinSize__ExprAssignment_1_0 ) )
                    {
                    // InternalCloneDetectionDSL.g:957:2: ( ( rule__MinSize__ExprAssignment_1_0 ) )
                    // InternalCloneDetectionDSL.g:958:3: ( rule__MinSize__ExprAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMinSizeAccess().getExprAssignment_1_0()); 
                    }
                    // InternalCloneDetectionDSL.g:959:3: ( rule__MinSize__ExprAssignment_1_0 )
                    // InternalCloneDetectionDSL.g:959:4: rule__MinSize__ExprAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MinSize__ExprAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMinSizeAccess().getExprAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:963:2: ( ( rule__MinSize__Group_1_1__0 ) )
                    {
                    // InternalCloneDetectionDSL.g:963:2: ( ( rule__MinSize__Group_1_1__0 ) )
                    // InternalCloneDetectionDSL.g:964:3: ( rule__MinSize__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMinSizeAccess().getGroup_1_1()); 
                    }
                    // InternalCloneDetectionDSL.g:965:3: ( rule__MinSize__Group_1_1__0 )
                    // InternalCloneDetectionDSL.g:965:4: rule__MinSize__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MinSize__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMinSizeAccess().getGroup_1_1()); 
                    }

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
    // $ANTLR end "rule__MinSize__Alternatives_1"


    // $ANTLR start "rule__BooleanExpressionLevel2__Alternatives"
    // InternalCloneDetectionDSL.g:973:1: rule__BooleanExpressionLevel2__Alternatives : ( ( ruleNotExpression ) | ( ruleBooleanExpressionLevel3 ) );
    public final void rule__BooleanExpressionLevel2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:977:1: ( ( ruleNotExpression ) | ( ruleBooleanExpressionLevel3 ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==53) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INT||LA3_0==RULE_BOOL_LITERAL||(LA3_0>=29 && LA3_0<=33)||LA3_0==48||(LA3_0>=54 && LA3_0<=55)) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCloneDetectionDSL.g:978:2: ( ruleNotExpression )
                    {
                    // InternalCloneDetectionDSL.g:978:2: ( ruleNotExpression )
                    // InternalCloneDetectionDSL.g:979:3: ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionLevel2Access().getNotExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNotExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionLevel2Access().getNotExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:984:2: ( ruleBooleanExpressionLevel3 )
                    {
                    // InternalCloneDetectionDSL.g:984:2: ( ruleBooleanExpressionLevel3 )
                    // InternalCloneDetectionDSL.g:985:3: ruleBooleanExpressionLevel3
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionLevel2Access().getBooleanExpressionLevel3ParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBooleanExpressionLevel3();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionLevel2Access().getBooleanExpressionLevel3ParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__BooleanExpressionLevel2__Alternatives"


    // $ANTLR start "rule__BooleanExpressionLevel3__Alternatives"
    // InternalCloneDetectionDSL.g:994:1: rule__BooleanExpressionLevel3__Alternatives : ( ( ( ruleComparisonExpression ) ) | ( ruleBooleanExpressionBracket ) | ( ruleBooleanExpressionConstant ) );
    public final void rule__BooleanExpressionLevel3__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:998:1: ( ( ( ruleComparisonExpression ) ) | ( ruleBooleanExpressionBracket ) | ( ruleBooleanExpressionConstant ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalCloneDetectionDSL.g:999:2: ( ( ruleComparisonExpression ) )
                    {
                    // InternalCloneDetectionDSL.g:999:2: ( ( ruleComparisonExpression ) )
                    // InternalCloneDetectionDSL.g:1000:3: ( ruleComparisonExpression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionLevel3Access().getComparisonExpressionParserRuleCall_0()); 
                    }
                    // InternalCloneDetectionDSL.g:1001:3: ( ruleComparisonExpression )
                    // InternalCloneDetectionDSL.g:1001:4: ruleComparisonExpression
                    {
                    pushFollow(FOLLOW_2);
                    ruleComparisonExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionLevel3Access().getComparisonExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:1005:2: ( ruleBooleanExpressionBracket )
                    {
                    // InternalCloneDetectionDSL.g:1005:2: ( ruleBooleanExpressionBracket )
                    // InternalCloneDetectionDSL.g:1006:3: ruleBooleanExpressionBracket
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionBracketParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBooleanExpressionBracket();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionBracketParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCloneDetectionDSL.g:1011:2: ( ruleBooleanExpressionConstant )
                    {
                    // InternalCloneDetectionDSL.g:1011:2: ( ruleBooleanExpressionConstant )
                    // InternalCloneDetectionDSL.g:1012:3: ruleBooleanExpressionConstant
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionConstantParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBooleanExpressionConstant();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionConstantParserRuleCall_2()); 
                    }

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
    // $ANTLR end "rule__BooleanExpressionLevel3__Alternatives"


    // $ANTLR start "rule__ExpressionLevel1__Alternatives_1"
    // InternalCloneDetectionDSL.g:1021:1: rule__ExpressionLevel1__Alternatives_1 : ( ( ( rule__ExpressionLevel1__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel1__Group_1_1__0 ) ) );
    public final void rule__ExpressionLevel1__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1025:1: ( ( ( rule__ExpressionLevel1__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel1__Group_1_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==54) ) {
                alt5=1;
            }
            else if ( (LA5_0==55) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1026:2: ( ( rule__ExpressionLevel1__Group_1_0__0 ) )
                    {
                    // InternalCloneDetectionDSL.g:1026:2: ( ( rule__ExpressionLevel1__Group_1_0__0 ) )
                    // InternalCloneDetectionDSL.g:1027:3: ( rule__ExpressionLevel1__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel1Access().getGroup_1_0()); 
                    }
                    // InternalCloneDetectionDSL.g:1028:3: ( rule__ExpressionLevel1__Group_1_0__0 )
                    // InternalCloneDetectionDSL.g:1028:4: rule__ExpressionLevel1__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel1__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel1Access().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:1032:2: ( ( rule__ExpressionLevel1__Group_1_1__0 ) )
                    {
                    // InternalCloneDetectionDSL.g:1032:2: ( ( rule__ExpressionLevel1__Group_1_1__0 ) )
                    // InternalCloneDetectionDSL.g:1033:3: ( rule__ExpressionLevel1__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel1Access().getGroup_1_1()); 
                    }
                    // InternalCloneDetectionDSL.g:1034:3: ( rule__ExpressionLevel1__Group_1_1__0 )
                    // InternalCloneDetectionDSL.g:1034:4: rule__ExpressionLevel1__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel1__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel1Access().getGroup_1_1()); 
                    }

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
    // $ANTLR end "rule__ExpressionLevel1__Alternatives_1"


    // $ANTLR start "rule__ExpressionLevel2__Alternatives_1"
    // InternalCloneDetectionDSL.g:1042:1: rule__ExpressionLevel2__Alternatives_1 : ( ( ( rule__ExpressionLevel2__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_1__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_2__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_3__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_4__0 ) ) );
    public final void rule__ExpressionLevel2__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1046:1: ( ( ( rule__ExpressionLevel2__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_1__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_2__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_3__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_4__0 ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt6=1;
                }
                break;
            case 56:
                {
                alt6=2;
                }
                break;
            case 57:
                {
                alt6=3;
                }
                break;
            case 58:
                {
                alt6=4;
                }
                break;
            case 59:
                {
                alt6=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1047:2: ( ( rule__ExpressionLevel2__Group_1_0__0 ) )
                    {
                    // InternalCloneDetectionDSL.g:1047:2: ( ( rule__ExpressionLevel2__Group_1_0__0 ) )
                    // InternalCloneDetectionDSL.g:1048:3: ( rule__ExpressionLevel2__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel2Access().getGroup_1_0()); 
                    }
                    // InternalCloneDetectionDSL.g:1049:3: ( rule__ExpressionLevel2__Group_1_0__0 )
                    // InternalCloneDetectionDSL.g:1049:4: rule__ExpressionLevel2__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel2__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel2Access().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:1053:2: ( ( rule__ExpressionLevel2__Group_1_1__0 ) )
                    {
                    // InternalCloneDetectionDSL.g:1053:2: ( ( rule__ExpressionLevel2__Group_1_1__0 ) )
                    // InternalCloneDetectionDSL.g:1054:3: ( rule__ExpressionLevel2__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel2Access().getGroup_1_1()); 
                    }
                    // InternalCloneDetectionDSL.g:1055:3: ( rule__ExpressionLevel2__Group_1_1__0 )
                    // InternalCloneDetectionDSL.g:1055:4: rule__ExpressionLevel2__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel2__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel2Access().getGroup_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCloneDetectionDSL.g:1059:2: ( ( rule__ExpressionLevel2__Group_1_2__0 ) )
                    {
                    // InternalCloneDetectionDSL.g:1059:2: ( ( rule__ExpressionLevel2__Group_1_2__0 ) )
                    // InternalCloneDetectionDSL.g:1060:3: ( rule__ExpressionLevel2__Group_1_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel2Access().getGroup_1_2()); 
                    }
                    // InternalCloneDetectionDSL.g:1061:3: ( rule__ExpressionLevel2__Group_1_2__0 )
                    // InternalCloneDetectionDSL.g:1061:4: rule__ExpressionLevel2__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel2__Group_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel2Access().getGroup_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCloneDetectionDSL.g:1065:2: ( ( rule__ExpressionLevel2__Group_1_3__0 ) )
                    {
                    // InternalCloneDetectionDSL.g:1065:2: ( ( rule__ExpressionLevel2__Group_1_3__0 ) )
                    // InternalCloneDetectionDSL.g:1066:3: ( rule__ExpressionLevel2__Group_1_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel2Access().getGroup_1_3()); 
                    }
                    // InternalCloneDetectionDSL.g:1067:3: ( rule__ExpressionLevel2__Group_1_3__0 )
                    // InternalCloneDetectionDSL.g:1067:4: rule__ExpressionLevel2__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel2__Group_1_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel2Access().getGroup_1_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalCloneDetectionDSL.g:1071:2: ( ( rule__ExpressionLevel2__Group_1_4__0 ) )
                    {
                    // InternalCloneDetectionDSL.g:1071:2: ( ( rule__ExpressionLevel2__Group_1_4__0 ) )
                    // InternalCloneDetectionDSL.g:1072:3: ( rule__ExpressionLevel2__Group_1_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel2Access().getGroup_1_4()); 
                    }
                    // InternalCloneDetectionDSL.g:1073:3: ( rule__ExpressionLevel2__Group_1_4__0 )
                    // InternalCloneDetectionDSL.g:1073:4: rule__ExpressionLevel2__Group_1_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel2__Group_1_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel2Access().getGroup_1_4()); 
                    }

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
    // $ANTLR end "rule__ExpressionLevel2__Alternatives_1"


    // $ANTLR start "rule__ExpressionLevel4__Alternatives"
    // InternalCloneDetectionDSL.g:1081:1: rule__ExpressionLevel4__Alternatives : ( ( ruleExpressionMinus ) | ( ruleExpressionPlus ) | ( ruleExpressionLevel5 ) );
    public final void rule__ExpressionLevel4__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1085:1: ( ( ruleExpressionMinus ) | ( ruleExpressionPlus ) | ( ruleExpressionLevel5 ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt7=1;
                }
                break;
            case 54:
                {
                alt7=2;
                }
                break;
            case RULE_INT:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 48:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1086:2: ( ruleExpressionMinus )
                    {
                    // InternalCloneDetectionDSL.g:1086:2: ( ruleExpressionMinus )
                    // InternalCloneDetectionDSL.g:1087:3: ruleExpressionMinus
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel4Access().getExpressionMinusParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpressionMinus();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel4Access().getExpressionMinusParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:1092:2: ( ruleExpressionPlus )
                    {
                    // InternalCloneDetectionDSL.g:1092:2: ( ruleExpressionPlus )
                    // InternalCloneDetectionDSL.g:1093:3: ruleExpressionPlus
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel4Access().getExpressionPlusParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpressionPlus();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel4Access().getExpressionPlusParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCloneDetectionDSL.g:1098:2: ( ruleExpressionLevel5 )
                    {
                    // InternalCloneDetectionDSL.g:1098:2: ( ruleExpressionLevel5 )
                    // InternalCloneDetectionDSL.g:1099:3: ruleExpressionLevel5
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel4Access().getExpressionLevel5ParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpressionLevel5();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel4Access().getExpressionLevel5ParserRuleCall_2()); 
                    }

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
    // $ANTLR end "rule__ExpressionLevel4__Alternatives"


    // $ANTLR start "rule__ExpressionLevel5__Alternatives"
    // InternalCloneDetectionDSL.g:1108:1: rule__ExpressionLevel5__Alternatives : ( ( ruleExpressionBracket ) | ( ruleExpressionConstantInt ) | ( ( rule__ExpressionLevel5__MetricAssignment_2 ) ) );
    public final void rule__ExpressionLevel5__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1112:1: ( ( ruleExpressionBracket ) | ( ruleExpressionConstantInt ) | ( ( rule__ExpressionLevel5__MetricAssignment_2 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt8=1;
                }
                break;
            case RULE_INT:
                {
                alt8=2;
                }
                break;
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1113:2: ( ruleExpressionBracket )
                    {
                    // InternalCloneDetectionDSL.g:1113:2: ( ruleExpressionBracket )
                    // InternalCloneDetectionDSL.g:1114:3: ruleExpressionBracket
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel5Access().getExpressionBracketParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpressionBracket();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel5Access().getExpressionBracketParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:1119:2: ( ruleExpressionConstantInt )
                    {
                    // InternalCloneDetectionDSL.g:1119:2: ( ruleExpressionConstantInt )
                    // InternalCloneDetectionDSL.g:1120:3: ruleExpressionConstantInt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel5Access().getExpressionConstantIntParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpressionConstantInt();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel5Access().getExpressionConstantIntParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCloneDetectionDSL.g:1125:2: ( ( rule__ExpressionLevel5__MetricAssignment_2 ) )
                    {
                    // InternalCloneDetectionDSL.g:1125:2: ( ( rule__ExpressionLevel5__MetricAssignment_2 ) )
                    // InternalCloneDetectionDSL.g:1126:3: ( rule__ExpressionLevel5__MetricAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel5Access().getMetricAssignment_2()); 
                    }
                    // InternalCloneDetectionDSL.g:1127:3: ( rule__ExpressionLevel5__MetricAssignment_2 )
                    // InternalCloneDetectionDSL.g:1127:4: rule__ExpressionLevel5__MetricAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel5__MetricAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel5Access().getMetricAssignment_2()); 
                    }

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
    // $ANTLR end "rule__ExpressionLevel5__Alternatives"


    // $ANTLR start "rule__MatchTarget__Alternatives"
    // InternalCloneDetectionDSL.g:1135:1: rule__MatchTarget__Alternatives : ( ( ( 'Subtree' ) ) | ( ( 'LLOC' ) ) | ( ( 'SLOC' ) ) );
    public final void rule__MatchTarget__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1139:1: ( ( ( 'Subtree' ) ) | ( ( 'LLOC' ) ) | ( ( 'SLOC' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt9=1;
                }
                break;
            case 14:
                {
                alt9=2;
                }
                break;
            case 15:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1140:2: ( ( 'Subtree' ) )
                    {
                    // InternalCloneDetectionDSL.g:1140:2: ( ( 'Subtree' ) )
                    // InternalCloneDetectionDSL.g:1141:3: ( 'Subtree' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMatchTargetAccess().getSubtreeEnumLiteralDeclaration_0()); 
                    }
                    // InternalCloneDetectionDSL.g:1142:3: ( 'Subtree' )
                    // InternalCloneDetectionDSL.g:1142:4: 'Subtree'
                    {
                    match(input,13,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMatchTargetAccess().getSubtreeEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:1146:2: ( ( 'LLOC' ) )
                    {
                    // InternalCloneDetectionDSL.g:1146:2: ( ( 'LLOC' ) )
                    // InternalCloneDetectionDSL.g:1147:3: ( 'LLOC' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMatchTargetAccess().getLLOCEnumLiteralDeclaration_1()); 
                    }
                    // InternalCloneDetectionDSL.g:1148:3: ( 'LLOC' )
                    // InternalCloneDetectionDSL.g:1148:4: 'LLOC'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMatchTargetAccess().getLLOCEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCloneDetectionDSL.g:1152:2: ( ( 'SLOC' ) )
                    {
                    // InternalCloneDetectionDSL.g:1152:2: ( ( 'SLOC' ) )
                    // InternalCloneDetectionDSL.g:1153:3: ( 'SLOC' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMatchTargetAccess().getSLOCEnumLiteralDeclaration_2()); 
                    }
                    // InternalCloneDetectionDSL.g:1154:3: ( 'SLOC' )
                    // InternalCloneDetectionDSL.g:1154:4: 'SLOC'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMatchTargetAccess().getSLOCEnumLiteralDeclaration_2()); 
                    }

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
    // $ANTLR end "rule__MatchTarget__Alternatives"


    // $ANTLR start "rule__SizeMetric__Alternatives"
    // InternalCloneDetectionDSL.g:1162:1: rule__SizeMetric__Alternatives : ( ( ( 'tokens' ) ) | ( ( 'declarations' ) ) | ( ( 'statements' ) ) | ( ( 'nodes' ) ) | ( ( 'lines' ) ) );
    public final void rule__SizeMetric__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1166:1: ( ( ( 'tokens' ) ) | ( ( 'declarations' ) ) | ( ( 'statements' ) ) | ( ( 'nodes' ) ) | ( ( 'lines' ) ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt10=1;
                }
                break;
            case 17:
                {
                alt10=2;
                }
                break;
            case 18:
                {
                alt10=3;
                }
                break;
            case 19:
                {
                alt10=4;
                }
                break;
            case 20:
                {
                alt10=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1167:2: ( ( 'tokens' ) )
                    {
                    // InternalCloneDetectionDSL.g:1167:2: ( ( 'tokens' ) )
                    // InternalCloneDetectionDSL.g:1168:3: ( 'tokens' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSizeMetricAccess().getTokensEnumLiteralDeclaration_0()); 
                    }
                    // InternalCloneDetectionDSL.g:1169:3: ( 'tokens' )
                    // InternalCloneDetectionDSL.g:1169:4: 'tokens'
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSizeMetricAccess().getTokensEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:1173:2: ( ( 'declarations' ) )
                    {
                    // InternalCloneDetectionDSL.g:1173:2: ( ( 'declarations' ) )
                    // InternalCloneDetectionDSL.g:1174:3: ( 'declarations' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSizeMetricAccess().getDeclarationsEnumLiteralDeclaration_1()); 
                    }
                    // InternalCloneDetectionDSL.g:1175:3: ( 'declarations' )
                    // InternalCloneDetectionDSL.g:1175:4: 'declarations'
                    {
                    match(input,17,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSizeMetricAccess().getDeclarationsEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCloneDetectionDSL.g:1179:2: ( ( 'statements' ) )
                    {
                    // InternalCloneDetectionDSL.g:1179:2: ( ( 'statements' ) )
                    // InternalCloneDetectionDSL.g:1180:3: ( 'statements' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSizeMetricAccess().getStatementsEnumLiteralDeclaration_2()); 
                    }
                    // InternalCloneDetectionDSL.g:1181:3: ( 'statements' )
                    // InternalCloneDetectionDSL.g:1181:4: 'statements'
                    {
                    match(input,18,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSizeMetricAccess().getStatementsEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCloneDetectionDSL.g:1185:2: ( ( 'nodes' ) )
                    {
                    // InternalCloneDetectionDSL.g:1185:2: ( ( 'nodes' ) )
                    // InternalCloneDetectionDSL.g:1186:3: ( 'nodes' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSizeMetricAccess().getNodesEnumLiteralDeclaration_3()); 
                    }
                    // InternalCloneDetectionDSL.g:1187:3: ( 'nodes' )
                    // InternalCloneDetectionDSL.g:1187:4: 'nodes'
                    {
                    match(input,19,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSizeMetricAccess().getNodesEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalCloneDetectionDSL.g:1191:2: ( ( 'lines' ) )
                    {
                    // InternalCloneDetectionDSL.g:1191:2: ( ( 'lines' ) )
                    // InternalCloneDetectionDSL.g:1192:3: ( 'lines' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSizeMetricAccess().getLinesEnumLiteralDeclaration_4()); 
                    }
                    // InternalCloneDetectionDSL.g:1193:3: ( 'lines' )
                    // InternalCloneDetectionDSL.g:1193:4: 'lines'
                    {
                    match(input,20,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSizeMetricAccess().getLinesEnumLiteralDeclaration_4()); 
                    }

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
    // $ANTLR end "rule__SizeMetric__Alternatives"


    // $ANTLR start "rule__BoolOperator__Alternatives"
    // InternalCloneDetectionDSL.g:1201:1: rule__BoolOperator__Alternatives : ( ( ( '&' ) ) | ( ( '|' ) ) );
    public final void rule__BoolOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1205:1: ( ( ( '&' ) ) | ( ( '|' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            else if ( (LA11_0==22) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1206:2: ( ( '&' ) )
                    {
                    // InternalCloneDetectionDSL.g:1206:2: ( ( '&' ) )
                    // InternalCloneDetectionDSL.g:1207:3: ( '&' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoolOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }
                    // InternalCloneDetectionDSL.g:1208:3: ( '&' )
                    // InternalCloneDetectionDSL.g:1208:4: '&'
                    {
                    match(input,21,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBoolOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:1212:2: ( ( '|' ) )
                    {
                    // InternalCloneDetectionDSL.g:1212:2: ( ( '|' ) )
                    // InternalCloneDetectionDSL.g:1213:3: ( '|' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoolOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    }
                    // InternalCloneDetectionDSL.g:1214:3: ( '|' )
                    // InternalCloneDetectionDSL.g:1214:4: '|'
                    {
                    match(input,22,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBoolOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    }

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
    // $ANTLR end "rule__BoolOperator__Alternatives"


    // $ANTLR start "rule__Method__Alternatives"
    // InternalCloneDetectionDSL.g:1222:1: rule__Method__Alternatives : ( ( ( 'Subnodes' ) ) | ( ( 'StringMatch' ) ) | ( ( 'CompleteMatch' ) ) | ( ( 'FQI' ) ) );
    public final void rule__Method__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1226:1: ( ( ( 'Subnodes' ) ) | ( ( 'StringMatch' ) ) | ( ( 'CompleteMatch' ) ) | ( ( 'FQI' ) ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt12=1;
                }
                break;
            case 24:
                {
                alt12=2;
                }
                break;
            case 25:
                {
                alt12=3;
                }
                break;
            case 26:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1227:2: ( ( 'Subnodes' ) )
                    {
                    // InternalCloneDetectionDSL.g:1227:2: ( ( 'Subnodes' ) )
                    // InternalCloneDetectionDSL.g:1228:3: ( 'Subnodes' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodAccess().getSubnodesEnumLiteralDeclaration_0()); 
                    }
                    // InternalCloneDetectionDSL.g:1229:3: ( 'Subnodes' )
                    // InternalCloneDetectionDSL.g:1229:4: 'Subnodes'
                    {
                    match(input,23,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodAccess().getSubnodesEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:1233:2: ( ( 'StringMatch' ) )
                    {
                    // InternalCloneDetectionDSL.g:1233:2: ( ( 'StringMatch' ) )
                    // InternalCloneDetectionDSL.g:1234:3: ( 'StringMatch' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodAccess().getStringMatchEnumLiteralDeclaration_1()); 
                    }
                    // InternalCloneDetectionDSL.g:1235:3: ( 'StringMatch' )
                    // InternalCloneDetectionDSL.g:1235:4: 'StringMatch'
                    {
                    match(input,24,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodAccess().getStringMatchEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCloneDetectionDSL.g:1239:2: ( ( 'CompleteMatch' ) )
                    {
                    // InternalCloneDetectionDSL.g:1239:2: ( ( 'CompleteMatch' ) )
                    // InternalCloneDetectionDSL.g:1240:3: ( 'CompleteMatch' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodAccess().getCompleteMatchEnumLiteralDeclaration_2()); 
                    }
                    // InternalCloneDetectionDSL.g:1241:3: ( 'CompleteMatch' )
                    // InternalCloneDetectionDSL.g:1241:4: 'CompleteMatch'
                    {
                    match(input,25,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodAccess().getCompleteMatchEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCloneDetectionDSL.g:1245:2: ( ( 'FQI' ) )
                    {
                    // InternalCloneDetectionDSL.g:1245:2: ( ( 'FQI' ) )
                    // InternalCloneDetectionDSL.g:1246:3: ( 'FQI' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodAccess().getFQIEnumLiteralDeclaration_3()); 
                    }
                    // InternalCloneDetectionDSL.g:1247:3: ( 'FQI' )
                    // InternalCloneDetectionDSL.g:1247:4: 'FQI'
                    {
                    match(input,26,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodAccess().getFQIEnumLiteralDeclaration_3()); 
                    }

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
    // $ANTLR end "rule__Method__Alternatives"


    // $ANTLR start "rule__Under__Alternatives"
    // InternalCloneDetectionDSL.g:1255:1: rule__Under__Alternatives : ( ( ( '->' ) ) | ( ( '=>' ) ) );
    public final void rule__Under__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1259:1: ( ( ( '->' ) ) | ( ( '=>' ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            else if ( (LA13_0==28) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1260:2: ( ( '->' ) )
                    {
                    // InternalCloneDetectionDSL.g:1260:2: ( ( '->' ) )
                    // InternalCloneDetectionDSL.g:1261:3: ( '->' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnderAccess().getOneLevelEnumLiteralDeclaration_0()); 
                    }
                    // InternalCloneDetectionDSL.g:1262:3: ( '->' )
                    // InternalCloneDetectionDSL.g:1262:4: '->'
                    {
                    match(input,27,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnderAccess().getOneLevelEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:1266:2: ( ( '=>' ) )
                    {
                    // InternalCloneDetectionDSL.g:1266:2: ( ( '=>' ) )
                    // InternalCloneDetectionDSL.g:1267:3: ( '=>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnderAccess().getAnyLevelEnumLiteralDeclaration_1()); 
                    }
                    // InternalCloneDetectionDSL.g:1268:3: ( '=>' )
                    // InternalCloneDetectionDSL.g:1268:4: '=>'
                    {
                    match(input,28,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnderAccess().getAnyLevelEnumLiteralDeclaration_1()); 
                    }

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
    // $ANTLR end "rule__Under__Alternatives"


    // $ANTLR start "rule__Metric__Alternatives"
    // InternalCloneDetectionDSL.g:1276:1: rule__Metric__Alternatives : ( ( ( 'CyclomaticComplexity' ) ) | ( ( 'LineVolume' ) ) | ( ( 'TokenVolume' ) ) | ( ( 'StatementVolume' ) ) | ( ( 'NumberOfParameters' ) ) );
    public final void rule__Metric__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1280:1: ( ( ( 'CyclomaticComplexity' ) ) | ( ( 'LineVolume' ) ) | ( ( 'TokenVolume' ) ) | ( ( 'StatementVolume' ) ) | ( ( 'NumberOfParameters' ) ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt14=1;
                }
                break;
            case 30:
                {
                alt14=2;
                }
                break;
            case 31:
                {
                alt14=3;
                }
                break;
            case 32:
                {
                alt14=4;
                }
                break;
            case 33:
                {
                alt14=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1281:2: ( ( 'CyclomaticComplexity' ) )
                    {
                    // InternalCloneDetectionDSL.g:1281:2: ( ( 'CyclomaticComplexity' ) )
                    // InternalCloneDetectionDSL.g:1282:3: ( 'CyclomaticComplexity' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMetricAccess().getCyclomaticComplexityEnumLiteralDeclaration_0()); 
                    }
                    // InternalCloneDetectionDSL.g:1283:3: ( 'CyclomaticComplexity' )
                    // InternalCloneDetectionDSL.g:1283:4: 'CyclomaticComplexity'
                    {
                    match(input,29,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMetricAccess().getCyclomaticComplexityEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:1287:2: ( ( 'LineVolume' ) )
                    {
                    // InternalCloneDetectionDSL.g:1287:2: ( ( 'LineVolume' ) )
                    // InternalCloneDetectionDSL.g:1288:3: ( 'LineVolume' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMetricAccess().getLineVolumeEnumLiteralDeclaration_1()); 
                    }
                    // InternalCloneDetectionDSL.g:1289:3: ( 'LineVolume' )
                    // InternalCloneDetectionDSL.g:1289:4: 'LineVolume'
                    {
                    match(input,30,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMetricAccess().getLineVolumeEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCloneDetectionDSL.g:1293:2: ( ( 'TokenVolume' ) )
                    {
                    // InternalCloneDetectionDSL.g:1293:2: ( ( 'TokenVolume' ) )
                    // InternalCloneDetectionDSL.g:1294:3: ( 'TokenVolume' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMetricAccess().getTokenVolumeEnumLiteralDeclaration_2()); 
                    }
                    // InternalCloneDetectionDSL.g:1295:3: ( 'TokenVolume' )
                    // InternalCloneDetectionDSL.g:1295:4: 'TokenVolume'
                    {
                    match(input,31,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMetricAccess().getTokenVolumeEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCloneDetectionDSL.g:1299:2: ( ( 'StatementVolume' ) )
                    {
                    // InternalCloneDetectionDSL.g:1299:2: ( ( 'StatementVolume' ) )
                    // InternalCloneDetectionDSL.g:1300:3: ( 'StatementVolume' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMetricAccess().getStatementVolumeEnumLiteralDeclaration_3()); 
                    }
                    // InternalCloneDetectionDSL.g:1301:3: ( 'StatementVolume' )
                    // InternalCloneDetectionDSL.g:1301:4: 'StatementVolume'
                    {
                    match(input,32,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMetricAccess().getStatementVolumeEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalCloneDetectionDSL.g:1305:2: ( ( 'NumberOfParameters' ) )
                    {
                    // InternalCloneDetectionDSL.g:1305:2: ( ( 'NumberOfParameters' ) )
                    // InternalCloneDetectionDSL.g:1306:3: ( 'NumberOfParameters' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMetricAccess().getNumberOfParametersEnumLiteralDeclaration_4()); 
                    }
                    // InternalCloneDetectionDSL.g:1307:3: ( 'NumberOfParameters' )
                    // InternalCloneDetectionDSL.g:1307:4: 'NumberOfParameters'
                    {
                    match(input,33,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMetricAccess().getNumberOfParametersEnumLiteralDeclaration_4()); 
                    }

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
    // $ANTLR end "rule__Metric__Alternatives"


    // $ANTLR start "rule__BinaryBooleanOperator__Alternatives"
    // InternalCloneDetectionDSL.g:1315:1: rule__BinaryBooleanOperator__Alternatives : ( ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__BinaryBooleanOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1319:1: ( ( ( 'AND' ) ) | ( ( 'OR' ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            else if ( (LA15_0==35) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1320:2: ( ( 'AND' ) )
                    {
                    // InternalCloneDetectionDSL.g:1320:2: ( ( 'AND' ) )
                    // InternalCloneDetectionDSL.g:1321:3: ( 'AND' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryBooleanOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }
                    // InternalCloneDetectionDSL.g:1322:3: ( 'AND' )
                    // InternalCloneDetectionDSL.g:1322:4: 'AND'
                    {
                    match(input,34,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryBooleanOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:1326:2: ( ( 'OR' ) )
                    {
                    // InternalCloneDetectionDSL.g:1326:2: ( ( 'OR' ) )
                    // InternalCloneDetectionDSL.g:1327:3: ( 'OR' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryBooleanOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    }
                    // InternalCloneDetectionDSL.g:1328:3: ( 'OR' )
                    // InternalCloneDetectionDSL.g:1328:4: 'OR'
                    {
                    match(input,35,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryBooleanOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    }

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
    // $ANTLR end "rule__BinaryBooleanOperator__Alternatives"


    // $ANTLR start "rule__CompareOperator__Alternatives"
    // InternalCloneDetectionDSL.g:1336:1: rule__CompareOperator__Alternatives : ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1340:1: ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) )
            int alt16=6;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt16=1;
                }
                break;
            case 37:
                {
                alt16=2;
                }
                break;
            case 38:
                {
                alt16=3;
                }
                break;
            case 39:
                {
                alt16=4;
                }
                break;
            case 40:
                {
                alt16=5;
                }
                break;
            case 41:
                {
                alt16=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1341:2: ( ( '==' ) )
                    {
                    // InternalCloneDetectionDSL.g:1341:2: ( ( '==' ) )
                    // InternalCloneDetectionDSL.g:1342:3: ( '==' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // InternalCloneDetectionDSL.g:1343:3: ( '==' )
                    // InternalCloneDetectionDSL.g:1343:4: '=='
                    {
                    match(input,36,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:1347:2: ( ( '!=' ) )
                    {
                    // InternalCloneDetectionDSL.g:1347:2: ( ( '!=' ) )
                    // InternalCloneDetectionDSL.g:1348:3: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1()); 
                    }
                    // InternalCloneDetectionDSL.g:1349:3: ( '!=' )
                    // InternalCloneDetectionDSL.g:1349:4: '!='
                    {
                    match(input,37,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCloneDetectionDSL.g:1353:2: ( ( '>=' ) )
                    {
                    // InternalCloneDetectionDSL.g:1353:2: ( ( '>=' ) )
                    // InternalCloneDetectionDSL.g:1354:3: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2()); 
                    }
                    // InternalCloneDetectionDSL.g:1355:3: ( '>=' )
                    // InternalCloneDetectionDSL.g:1355:4: '>='
                    {
                    match(input,38,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCloneDetectionDSL.g:1359:2: ( ( '>' ) )
                    {
                    // InternalCloneDetectionDSL.g:1359:2: ( ( '>' ) )
                    // InternalCloneDetectionDSL.g:1360:3: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3()); 
                    }
                    // InternalCloneDetectionDSL.g:1361:3: ( '>' )
                    // InternalCloneDetectionDSL.g:1361:4: '>'
                    {
                    match(input,39,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalCloneDetectionDSL.g:1365:2: ( ( '<=' ) )
                    {
                    // InternalCloneDetectionDSL.g:1365:2: ( ( '<=' ) )
                    // InternalCloneDetectionDSL.g:1366:3: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4()); 
                    }
                    // InternalCloneDetectionDSL.g:1367:3: ( '<=' )
                    // InternalCloneDetectionDSL.g:1367:4: '<='
                    {
                    match(input,40,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalCloneDetectionDSL.g:1371:2: ( ( '<' ) )
                    {
                    // InternalCloneDetectionDSL.g:1371:2: ( ( '<' ) )
                    // InternalCloneDetectionDSL.g:1372:3: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEnumLiteralDeclaration_5()); 
                    }
                    // InternalCloneDetectionDSL.g:1373:3: ( '<' )
                    // InternalCloneDetectionDSL.g:1373:4: '<'
                    {
                    match(input,41,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEnumLiteralDeclaration_5()); 
                    }

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
    // $ANTLR end "rule__CompareOperator__Alternatives"


    // $ANTLR start "rule__Project__Group__0"
    // InternalCloneDetectionDSL.g:1381:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1385:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // InternalCloneDetectionDSL.g:1386:2: rule__Project__Group__0__Impl rule__Project__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Project__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Project__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__0"


    // $ANTLR start "rule__Project__Group__0__Impl"
    // InternalCloneDetectionDSL.g:1393:1: rule__Project__Group__0__Impl : ( 'Project' ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1397:1: ( ( 'Project' ) )
            // InternalCloneDetectionDSL.g:1398:1: ( 'Project' )
            {
            // InternalCloneDetectionDSL.g:1398:1: ( 'Project' )
            // InternalCloneDetectionDSL.g:1399:2: 'Project'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectAccess().getProjectKeyword_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProjectAccess().getProjectKeyword_0()); 
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
    // $ANTLR end "rule__Project__Group__0__Impl"


    // $ANTLR start "rule__Project__Group__1"
    // InternalCloneDetectionDSL.g:1408:1: rule__Project__Group__1 : rule__Project__Group__1__Impl ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1412:1: ( rule__Project__Group__1__Impl )
            // InternalCloneDetectionDSL.g:1413:2: rule__Project__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__1"


    // $ANTLR start "rule__Project__Group__1__Impl"
    // InternalCloneDetectionDSL.g:1419:1: rule__Project__Group__1__Impl : ( ( rule__Project__PathAssignment_1 ) ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1423:1: ( ( ( rule__Project__PathAssignment_1 ) ) )
            // InternalCloneDetectionDSL.g:1424:1: ( ( rule__Project__PathAssignment_1 ) )
            {
            // InternalCloneDetectionDSL.g:1424:1: ( ( rule__Project__PathAssignment_1 ) )
            // InternalCloneDetectionDSL.g:1425:2: ( rule__Project__PathAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectAccess().getPathAssignment_1()); 
            }
            // InternalCloneDetectionDSL.g:1426:2: ( rule__Project__PathAssignment_1 )
            // InternalCloneDetectionDSL.g:1426:3: rule__Project__PathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Project__PathAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProjectAccess().getPathAssignment_1()); 
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
    // $ANTLR end "rule__Project__Group__1__Impl"


    // $ANTLR start "rule__SearchRoot__Group__0"
    // InternalCloneDetectionDSL.g:1435:1: rule__SearchRoot__Group__0 : rule__SearchRoot__Group__0__Impl rule__SearchRoot__Group__1 ;
    public final void rule__SearchRoot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1439:1: ( rule__SearchRoot__Group__0__Impl rule__SearchRoot__Group__1 )
            // InternalCloneDetectionDSL.g:1440:2: rule__SearchRoot__Group__0__Impl rule__SearchRoot__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SearchRoot__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SearchRoot__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SearchRoot__Group__0"


    // $ANTLR start "rule__SearchRoot__Group__0__Impl"
    // InternalCloneDetectionDSL.g:1447:1: rule__SearchRoot__Group__0__Impl : ( 'SearchRoot' ) ;
    public final void rule__SearchRoot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1451:1: ( ( 'SearchRoot' ) )
            // InternalCloneDetectionDSL.g:1452:1: ( 'SearchRoot' )
            {
            // InternalCloneDetectionDSL.g:1452:1: ( 'SearchRoot' )
            // InternalCloneDetectionDSL.g:1453:2: 'SearchRoot'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSearchRootAccess().getSearchRootKeyword_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSearchRootAccess().getSearchRootKeyword_0()); 
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
    // $ANTLR end "rule__SearchRoot__Group__0__Impl"


    // $ANTLR start "rule__SearchRoot__Group__1"
    // InternalCloneDetectionDSL.g:1462:1: rule__SearchRoot__Group__1 : rule__SearchRoot__Group__1__Impl rule__SearchRoot__Group__2 ;
    public final void rule__SearchRoot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1466:1: ( rule__SearchRoot__Group__1__Impl rule__SearchRoot__Group__2 )
            // InternalCloneDetectionDSL.g:1467:2: rule__SearchRoot__Group__1__Impl rule__SearchRoot__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SearchRoot__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SearchRoot__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SearchRoot__Group__1"


    // $ANTLR start "rule__SearchRoot__Group__1__Impl"
    // InternalCloneDetectionDSL.g:1474:1: rule__SearchRoot__Group__1__Impl : ( ( rule__SearchRoot__NodesAssignment_1 ) ) ;
    public final void rule__SearchRoot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1478:1: ( ( ( rule__SearchRoot__NodesAssignment_1 ) ) )
            // InternalCloneDetectionDSL.g:1479:1: ( ( rule__SearchRoot__NodesAssignment_1 ) )
            {
            // InternalCloneDetectionDSL.g:1479:1: ( ( rule__SearchRoot__NodesAssignment_1 ) )
            // InternalCloneDetectionDSL.g:1480:2: ( rule__SearchRoot__NodesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSearchRootAccess().getNodesAssignment_1()); 
            }
            // InternalCloneDetectionDSL.g:1481:2: ( rule__SearchRoot__NodesAssignment_1 )
            // InternalCloneDetectionDSL.g:1481:3: rule__SearchRoot__NodesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SearchRoot__NodesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSearchRootAccess().getNodesAssignment_1()); 
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
    // $ANTLR end "rule__SearchRoot__Group__1__Impl"


    // $ANTLR start "rule__SearchRoot__Group__2"
    // InternalCloneDetectionDSL.g:1489:1: rule__SearchRoot__Group__2 : rule__SearchRoot__Group__2__Impl ;
    public final void rule__SearchRoot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1493:1: ( rule__SearchRoot__Group__2__Impl )
            // InternalCloneDetectionDSL.g:1494:2: rule__SearchRoot__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SearchRoot__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SearchRoot__Group__2"


    // $ANTLR start "rule__SearchRoot__Group__2__Impl"
    // InternalCloneDetectionDSL.g:1500:1: rule__SearchRoot__Group__2__Impl : ( ( rule__SearchRoot__ConditionAssignment_2 )? ) ;
    public final void rule__SearchRoot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1504:1: ( ( ( rule__SearchRoot__ConditionAssignment_2 )? ) )
            // InternalCloneDetectionDSL.g:1505:1: ( ( rule__SearchRoot__ConditionAssignment_2 )? )
            {
            // InternalCloneDetectionDSL.g:1505:1: ( ( rule__SearchRoot__ConditionAssignment_2 )? )
            // InternalCloneDetectionDSL.g:1506:2: ( rule__SearchRoot__ConditionAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSearchRootAccess().getConditionAssignment_2()); 
            }
            // InternalCloneDetectionDSL.g:1507:2: ( rule__SearchRoot__ConditionAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT||(LA17_0>=29 && LA17_0<=33)||LA17_0==48||(LA17_0>=54 && LA17_0<=55)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1507:3: rule__SearchRoot__ConditionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SearchRoot__ConditionAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSearchRootAccess().getConditionAssignment_2()); 
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
    // $ANTLR end "rule__SearchRoot__Group__2__Impl"


    // $ANTLR start "rule__Match__Group__0"
    // InternalCloneDetectionDSL.g:1516:1: rule__Match__Group__0 : rule__Match__Group__0__Impl rule__Match__Group__1 ;
    public final void rule__Match__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1520:1: ( rule__Match__Group__0__Impl rule__Match__Group__1 )
            // InternalCloneDetectionDSL.g:1521:2: rule__Match__Group__0__Impl rule__Match__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Match__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Match__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group__0"


    // $ANTLR start "rule__Match__Group__0__Impl"
    // InternalCloneDetectionDSL.g:1528:1: rule__Match__Group__0__Impl : ( 'Match' ) ;
    public final void rule__Match__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1532:1: ( ( 'Match' ) )
            // InternalCloneDetectionDSL.g:1533:1: ( 'Match' )
            {
            // InternalCloneDetectionDSL.g:1533:1: ( 'Match' )
            // InternalCloneDetectionDSL.g:1534:2: 'Match'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchAccess().getMatchKeyword_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchAccess().getMatchKeyword_0()); 
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
    // $ANTLR end "rule__Match__Group__0__Impl"


    // $ANTLR start "rule__Match__Group__1"
    // InternalCloneDetectionDSL.g:1543:1: rule__Match__Group__1 : rule__Match__Group__1__Impl ;
    public final void rule__Match__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1547:1: ( rule__Match__Group__1__Impl )
            // InternalCloneDetectionDSL.g:1548:2: rule__Match__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Match__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group__1"


    // $ANTLR start "rule__Match__Group__1__Impl"
    // InternalCloneDetectionDSL.g:1554:1: rule__Match__Group__1__Impl : ( ( rule__Match__TargetAssignment_1 ) ) ;
    public final void rule__Match__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1558:1: ( ( ( rule__Match__TargetAssignment_1 ) ) )
            // InternalCloneDetectionDSL.g:1559:1: ( ( rule__Match__TargetAssignment_1 ) )
            {
            // InternalCloneDetectionDSL.g:1559:1: ( ( rule__Match__TargetAssignment_1 ) )
            // InternalCloneDetectionDSL.g:1560:2: ( rule__Match__TargetAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchAccess().getTargetAssignment_1()); 
            }
            // InternalCloneDetectionDSL.g:1561:2: ( rule__Match__TargetAssignment_1 )
            // InternalCloneDetectionDSL.g:1561:3: rule__Match__TargetAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Match__TargetAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchAccess().getTargetAssignment_1()); 
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
    // $ANTLR end "rule__Match__Group__1__Impl"


    // $ANTLR start "rule__Exclude__Group__0"
    // InternalCloneDetectionDSL.g:1570:1: rule__Exclude__Group__0 : rule__Exclude__Group__0__Impl rule__Exclude__Group__1 ;
    public final void rule__Exclude__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1574:1: ( rule__Exclude__Group__0__Impl rule__Exclude__Group__1 )
            // InternalCloneDetectionDSL.g:1575:2: rule__Exclude__Group__0__Impl rule__Exclude__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Exclude__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Exclude__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exclude__Group__0"


    // $ANTLR start "rule__Exclude__Group__0__Impl"
    // InternalCloneDetectionDSL.g:1582:1: rule__Exclude__Group__0__Impl : ( 'Exclude' ) ;
    public final void rule__Exclude__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1586:1: ( ( 'Exclude' ) )
            // InternalCloneDetectionDSL.g:1587:1: ( 'Exclude' )
            {
            // InternalCloneDetectionDSL.g:1587:1: ( 'Exclude' )
            // InternalCloneDetectionDSL.g:1588:2: 'Exclude'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExcludeAccess().getExcludeKeyword_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExcludeAccess().getExcludeKeyword_0()); 
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
    // $ANTLR end "rule__Exclude__Group__0__Impl"


    // $ANTLR start "rule__Exclude__Group__1"
    // InternalCloneDetectionDSL.g:1597:1: rule__Exclude__Group__1 : rule__Exclude__Group__1__Impl ;
    public final void rule__Exclude__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1601:1: ( rule__Exclude__Group__1__Impl )
            // InternalCloneDetectionDSL.g:1602:2: rule__Exclude__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exclude__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exclude__Group__1"


    // $ANTLR start "rule__Exclude__Group__1__Impl"
    // InternalCloneDetectionDSL.g:1608:1: rule__Exclude__Group__1__Impl : ( ruleNodes ) ;
    public final void rule__Exclude__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1612:1: ( ( ruleNodes ) )
            // InternalCloneDetectionDSL.g:1613:1: ( ruleNodes )
            {
            // InternalCloneDetectionDSL.g:1613:1: ( ruleNodes )
            // InternalCloneDetectionDSL.g:1614:2: ruleNodes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExcludeAccess().getNodesParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleNodes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExcludeAccess().getNodesParserRuleCall_1()); 
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
    // $ANTLR end "rule__Exclude__Group__1__Impl"


    // $ANTLR start "rule__Node__Group__0"
    // InternalCloneDetectionDSL.g:1624:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1628:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalCloneDetectionDSL.g:1629:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Node__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Node__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__0"


    // $ANTLR start "rule__Node__Group__0__Impl"
    // InternalCloneDetectionDSL.g:1636:1: rule__Node__Group__0__Impl : ( ( rule__Node__Alternatives_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1640:1: ( ( ( rule__Node__Alternatives_0 ) ) )
            // InternalCloneDetectionDSL.g:1641:1: ( ( rule__Node__Alternatives_0 ) )
            {
            // InternalCloneDetectionDSL.g:1641:1: ( ( rule__Node__Alternatives_0 ) )
            // InternalCloneDetectionDSL.g:1642:2: ( rule__Node__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getAlternatives_0()); 
            }
            // InternalCloneDetectionDSL.g:1643:2: ( rule__Node__Alternatives_0 )
            // InternalCloneDetectionDSL.g:1643:3: rule__Node__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Node__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getAlternatives_0()); 
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
    // $ANTLR end "rule__Node__Group__0__Impl"


    // $ANTLR start "rule__Node__Group__1"
    // InternalCloneDetectionDSL.g:1651:1: rule__Node__Group__1 : rule__Node__Group__1__Impl ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1655:1: ( rule__Node__Group__1__Impl )
            // InternalCloneDetectionDSL.g:1656:2: rule__Node__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__1"


    // $ANTLR start "rule__Node__Group__1__Impl"
    // InternalCloneDetectionDSL.g:1662:1: rule__Node__Group__1__Impl : ( ( rule__Node__Group_1__0 )? ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1666:1: ( ( ( rule__Node__Group_1__0 )? ) )
            // InternalCloneDetectionDSL.g:1667:1: ( ( rule__Node__Group_1__0 )? )
            {
            // InternalCloneDetectionDSL.g:1667:1: ( ( rule__Node__Group_1__0 )? )
            // InternalCloneDetectionDSL.g:1668:2: ( rule__Node__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup_1()); 
            }
            // InternalCloneDetectionDSL.g:1669:2: ( rule__Node__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=27 && LA18_0<=28)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1669:3: rule__Node__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Node__Group__1__Impl"


    // $ANTLR start "rule__Node__Group_1__0"
    // InternalCloneDetectionDSL.g:1678:1: rule__Node__Group_1__0 : rule__Node__Group_1__0__Impl rule__Node__Group_1__1 ;
    public final void rule__Node__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1682:1: ( rule__Node__Group_1__0__Impl rule__Node__Group_1__1 )
            // InternalCloneDetectionDSL.g:1683:2: rule__Node__Group_1__0__Impl rule__Node__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Node__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Node__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_1__0"


    // $ANTLR start "rule__Node__Group_1__0__Impl"
    // InternalCloneDetectionDSL.g:1690:1: rule__Node__Group_1__0__Impl : ( ( rule__Node__UnderAssignment_1_0 ) ) ;
    public final void rule__Node__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1694:1: ( ( ( rule__Node__UnderAssignment_1_0 ) ) )
            // InternalCloneDetectionDSL.g:1695:1: ( ( rule__Node__UnderAssignment_1_0 ) )
            {
            // InternalCloneDetectionDSL.g:1695:1: ( ( rule__Node__UnderAssignment_1_0 ) )
            // InternalCloneDetectionDSL.g:1696:2: ( rule__Node__UnderAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getUnderAssignment_1_0()); 
            }
            // InternalCloneDetectionDSL.g:1697:2: ( rule__Node__UnderAssignment_1_0 )
            // InternalCloneDetectionDSL.g:1697:3: rule__Node__UnderAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Node__UnderAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getUnderAssignment_1_0()); 
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
    // $ANTLR end "rule__Node__Group_1__0__Impl"


    // $ANTLR start "rule__Node__Group_1__1"
    // InternalCloneDetectionDSL.g:1705:1: rule__Node__Group_1__1 : rule__Node__Group_1__1__Impl ;
    public final void rule__Node__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1709:1: ( rule__Node__Group_1__1__Impl )
            // InternalCloneDetectionDSL.g:1710:2: rule__Node__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_1__1"


    // $ANTLR start "rule__Node__Group_1__1__Impl"
    // InternalCloneDetectionDSL.g:1716:1: rule__Node__Group_1__1__Impl : ( ( rule__Node__NodeAssignment_1_1 ) ) ;
    public final void rule__Node__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1720:1: ( ( ( rule__Node__NodeAssignment_1_1 ) ) )
            // InternalCloneDetectionDSL.g:1721:1: ( ( rule__Node__NodeAssignment_1_1 ) )
            {
            // InternalCloneDetectionDSL.g:1721:1: ( ( rule__Node__NodeAssignment_1_1 ) )
            // InternalCloneDetectionDSL.g:1722:2: ( rule__Node__NodeAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getNodeAssignment_1_1()); 
            }
            // InternalCloneDetectionDSL.g:1723:2: ( rule__Node__NodeAssignment_1_1 )
            // InternalCloneDetectionDSL.g:1723:3: rule__Node__NodeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Node__NodeAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getNodeAssignment_1_1()); 
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
    // $ANTLR end "rule__Node__Group_1__1__Impl"


    // $ANTLR start "rule__Nodes__Group__0"
    // InternalCloneDetectionDSL.g:1732:1: rule__Nodes__Group__0 : rule__Nodes__Group__0__Impl rule__Nodes__Group__1 ;
    public final void rule__Nodes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1736:1: ( rule__Nodes__Group__0__Impl rule__Nodes__Group__1 )
            // InternalCloneDetectionDSL.g:1737:2: rule__Nodes__Group__0__Impl rule__Nodes__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Nodes__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Nodes__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nodes__Group__0"


    // $ANTLR start "rule__Nodes__Group__0__Impl"
    // InternalCloneDetectionDSL.g:1744:1: rule__Nodes__Group__0__Impl : ( ( rule__Nodes__NodeAssignment_0 ) ) ;
    public final void rule__Nodes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1748:1: ( ( ( rule__Nodes__NodeAssignment_0 ) ) )
            // InternalCloneDetectionDSL.g:1749:1: ( ( rule__Nodes__NodeAssignment_0 ) )
            {
            // InternalCloneDetectionDSL.g:1749:1: ( ( rule__Nodes__NodeAssignment_0 ) )
            // InternalCloneDetectionDSL.g:1750:2: ( rule__Nodes__NodeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodesAccess().getNodeAssignment_0()); 
            }
            // InternalCloneDetectionDSL.g:1751:2: ( rule__Nodes__NodeAssignment_0 )
            // InternalCloneDetectionDSL.g:1751:3: rule__Nodes__NodeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Nodes__NodeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodesAccess().getNodeAssignment_0()); 
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
    // $ANTLR end "rule__Nodes__Group__0__Impl"


    // $ANTLR start "rule__Nodes__Group__1"
    // InternalCloneDetectionDSL.g:1759:1: rule__Nodes__Group__1 : rule__Nodes__Group__1__Impl ;
    public final void rule__Nodes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1763:1: ( rule__Nodes__Group__1__Impl )
            // InternalCloneDetectionDSL.g:1764:2: rule__Nodes__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Nodes__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nodes__Group__1"


    // $ANTLR start "rule__Nodes__Group__1__Impl"
    // InternalCloneDetectionDSL.g:1770:1: rule__Nodes__Group__1__Impl : ( ( rule__Nodes__Group_1__0 )? ) ;
    public final void rule__Nodes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1774:1: ( ( ( rule__Nodes__Group_1__0 )? ) )
            // InternalCloneDetectionDSL.g:1775:1: ( ( rule__Nodes__Group_1__0 )? )
            {
            // InternalCloneDetectionDSL.g:1775:1: ( ( rule__Nodes__Group_1__0 )? )
            // InternalCloneDetectionDSL.g:1776:2: ( rule__Nodes__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodesAccess().getGroup_1()); 
            }
            // InternalCloneDetectionDSL.g:1777:2: ( rule__Nodes__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==46) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1777:3: rule__Nodes__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Nodes__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodesAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Nodes__Group__1__Impl"


    // $ANTLR start "rule__Nodes__Group_1__0"
    // InternalCloneDetectionDSL.g:1786:1: rule__Nodes__Group_1__0 : rule__Nodes__Group_1__0__Impl rule__Nodes__Group_1__1 ;
    public final void rule__Nodes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1790:1: ( rule__Nodes__Group_1__0__Impl rule__Nodes__Group_1__1 )
            // InternalCloneDetectionDSL.g:1791:2: rule__Nodes__Group_1__0__Impl rule__Nodes__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Nodes__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Nodes__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nodes__Group_1__0"


    // $ANTLR start "rule__Nodes__Group_1__0__Impl"
    // InternalCloneDetectionDSL.g:1798:1: rule__Nodes__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Nodes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1802:1: ( ( ',' ) )
            // InternalCloneDetectionDSL.g:1803:1: ( ',' )
            {
            // InternalCloneDetectionDSL.g:1803:1: ( ',' )
            // InternalCloneDetectionDSL.g:1804:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodesAccess().getCommaKeyword_1_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodesAccess().getCommaKeyword_1_0()); 
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
    // $ANTLR end "rule__Nodes__Group_1__0__Impl"


    // $ANTLR start "rule__Nodes__Group_1__1"
    // InternalCloneDetectionDSL.g:1813:1: rule__Nodes__Group_1__1 : rule__Nodes__Group_1__1__Impl ;
    public final void rule__Nodes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1817:1: ( rule__Nodes__Group_1__1__Impl )
            // InternalCloneDetectionDSL.g:1818:2: rule__Nodes__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Nodes__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nodes__Group_1__1"


    // $ANTLR start "rule__Nodes__Group_1__1__Impl"
    // InternalCloneDetectionDSL.g:1824:1: rule__Nodes__Group_1__1__Impl : ( ( rule__Nodes__NodesAssignment_1_1 ) ) ;
    public final void rule__Nodes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1828:1: ( ( ( rule__Nodes__NodesAssignment_1_1 ) ) )
            // InternalCloneDetectionDSL.g:1829:1: ( ( rule__Nodes__NodesAssignment_1_1 ) )
            {
            // InternalCloneDetectionDSL.g:1829:1: ( ( rule__Nodes__NodesAssignment_1_1 ) )
            // InternalCloneDetectionDSL.g:1830:2: ( rule__Nodes__NodesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodesAccess().getNodesAssignment_1_1()); 
            }
            // InternalCloneDetectionDSL.g:1831:2: ( rule__Nodes__NodesAssignment_1_1 )
            // InternalCloneDetectionDSL.g:1831:3: rule__Nodes__NodesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Nodes__NodesAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodesAccess().getNodesAssignment_1_1()); 
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
    // $ANTLR end "rule__Nodes__Group_1__1__Impl"


    // $ANTLR start "rule__MinSize__Group__0"
    // InternalCloneDetectionDSL.g:1840:1: rule__MinSize__Group__0 : rule__MinSize__Group__0__Impl rule__MinSize__Group__1 ;
    public final void rule__MinSize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1844:1: ( rule__MinSize__Group__0__Impl rule__MinSize__Group__1 )
            // InternalCloneDetectionDSL.g:1845:2: rule__MinSize__Group__0__Impl rule__MinSize__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MinSize__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MinSize__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinSize__Group__0"


    // $ANTLR start "rule__MinSize__Group__0__Impl"
    // InternalCloneDetectionDSL.g:1852:1: rule__MinSize__Group__0__Impl : ( 'Size' ) ;
    public final void rule__MinSize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1856:1: ( ( 'Size' ) )
            // InternalCloneDetectionDSL.g:1857:1: ( 'Size' )
            {
            // InternalCloneDetectionDSL.g:1857:1: ( 'Size' )
            // InternalCloneDetectionDSL.g:1858:2: 'Size'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getSizeKeyword_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinSizeAccess().getSizeKeyword_0()); 
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
    // $ANTLR end "rule__MinSize__Group__0__Impl"


    // $ANTLR start "rule__MinSize__Group__1"
    // InternalCloneDetectionDSL.g:1867:1: rule__MinSize__Group__1 : rule__MinSize__Group__1__Impl rule__MinSize__Group__2 ;
    public final void rule__MinSize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1871:1: ( rule__MinSize__Group__1__Impl rule__MinSize__Group__2 )
            // InternalCloneDetectionDSL.g:1872:2: rule__MinSize__Group__1__Impl rule__MinSize__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__MinSize__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MinSize__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinSize__Group__1"


    // $ANTLR start "rule__MinSize__Group__1__Impl"
    // InternalCloneDetectionDSL.g:1879:1: rule__MinSize__Group__1__Impl : ( ( rule__MinSize__Alternatives_1 ) ) ;
    public final void rule__MinSize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1883:1: ( ( ( rule__MinSize__Alternatives_1 ) ) )
            // InternalCloneDetectionDSL.g:1884:1: ( ( rule__MinSize__Alternatives_1 ) )
            {
            // InternalCloneDetectionDSL.g:1884:1: ( ( rule__MinSize__Alternatives_1 ) )
            // InternalCloneDetectionDSL.g:1885:2: ( rule__MinSize__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getAlternatives_1()); 
            }
            // InternalCloneDetectionDSL.g:1886:2: ( rule__MinSize__Alternatives_1 )
            // InternalCloneDetectionDSL.g:1886:3: rule__MinSize__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__MinSize__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinSizeAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__MinSize__Group__1__Impl"


    // $ANTLR start "rule__MinSize__Group__2"
    // InternalCloneDetectionDSL.g:1894:1: rule__MinSize__Group__2 : rule__MinSize__Group__2__Impl ;
    public final void rule__MinSize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1898:1: ( rule__MinSize__Group__2__Impl )
            // InternalCloneDetectionDSL.g:1899:2: rule__MinSize__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MinSize__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinSize__Group__2"


    // $ANTLR start "rule__MinSize__Group__2__Impl"
    // InternalCloneDetectionDSL.g:1905:1: rule__MinSize__Group__2__Impl : ( ( rule__MinSize__Group_2__0 )? ) ;
    public final void rule__MinSize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1909:1: ( ( ( rule__MinSize__Group_2__0 )? ) )
            // InternalCloneDetectionDSL.g:1910:1: ( ( rule__MinSize__Group_2__0 )? )
            {
            // InternalCloneDetectionDSL.g:1910:1: ( ( rule__MinSize__Group_2__0 )? )
            // InternalCloneDetectionDSL.g:1911:2: ( rule__MinSize__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getGroup_2()); 
            }
            // InternalCloneDetectionDSL.g:1912:2: ( rule__MinSize__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=21 && LA20_0<=22)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1912:3: rule__MinSize__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MinSize__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinSizeAccess().getGroup_2()); 
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
    // $ANTLR end "rule__MinSize__Group__2__Impl"


    // $ANTLR start "rule__MinSize__Group_1_1__0"
    // InternalCloneDetectionDSL.g:1921:1: rule__MinSize__Group_1_1__0 : rule__MinSize__Group_1_1__0__Impl rule__MinSize__Group_1_1__1 ;
    public final void rule__MinSize__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1925:1: ( rule__MinSize__Group_1_1__0__Impl rule__MinSize__Group_1_1__1 )
            // InternalCloneDetectionDSL.g:1926:2: rule__MinSize__Group_1_1__0__Impl rule__MinSize__Group_1_1__1
            {
            pushFollow(FOLLOW_11);
            rule__MinSize__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MinSize__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinSize__Group_1_1__0"


    // $ANTLR start "rule__MinSize__Group_1_1__0__Impl"
    // InternalCloneDetectionDSL.g:1933:1: rule__MinSize__Group_1_1__0__Impl : ( '(' ) ;
    public final void rule__MinSize__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1937:1: ( ( '(' ) )
            // InternalCloneDetectionDSL.g:1938:1: ( '(' )
            {
            // InternalCloneDetectionDSL.g:1938:1: ( '(' )
            // InternalCloneDetectionDSL.g:1939:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getLeftParenthesisKeyword_1_1_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinSizeAccess().getLeftParenthesisKeyword_1_1_0()); 
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
    // $ANTLR end "rule__MinSize__Group_1_1__0__Impl"


    // $ANTLR start "rule__MinSize__Group_1_1__1"
    // InternalCloneDetectionDSL.g:1948:1: rule__MinSize__Group_1_1__1 : rule__MinSize__Group_1_1__1__Impl rule__MinSize__Group_1_1__2 ;
    public final void rule__MinSize__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1952:1: ( rule__MinSize__Group_1_1__1__Impl rule__MinSize__Group_1_1__2 )
            // InternalCloneDetectionDSL.g:1953:2: rule__MinSize__Group_1_1__1__Impl rule__MinSize__Group_1_1__2
            {
            pushFollow(FOLLOW_12);
            rule__MinSize__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MinSize__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinSize__Group_1_1__1"


    // $ANTLR start "rule__MinSize__Group_1_1__1__Impl"
    // InternalCloneDetectionDSL.g:1960:1: rule__MinSize__Group_1_1__1__Impl : ( ( rule__MinSize__BracketsAssignment_1_1_1 ) ) ;
    public final void rule__MinSize__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1964:1: ( ( ( rule__MinSize__BracketsAssignment_1_1_1 ) ) )
            // InternalCloneDetectionDSL.g:1965:1: ( ( rule__MinSize__BracketsAssignment_1_1_1 ) )
            {
            // InternalCloneDetectionDSL.g:1965:1: ( ( rule__MinSize__BracketsAssignment_1_1_1 ) )
            // InternalCloneDetectionDSL.g:1966:2: ( rule__MinSize__BracketsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getBracketsAssignment_1_1_1()); 
            }
            // InternalCloneDetectionDSL.g:1967:2: ( rule__MinSize__BracketsAssignment_1_1_1 )
            // InternalCloneDetectionDSL.g:1967:3: rule__MinSize__BracketsAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MinSize__BracketsAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinSizeAccess().getBracketsAssignment_1_1_1()); 
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
    // $ANTLR end "rule__MinSize__Group_1_1__1__Impl"


    // $ANTLR start "rule__MinSize__Group_1_1__2"
    // InternalCloneDetectionDSL.g:1975:1: rule__MinSize__Group_1_1__2 : rule__MinSize__Group_1_1__2__Impl ;
    public final void rule__MinSize__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1979:1: ( rule__MinSize__Group_1_1__2__Impl )
            // InternalCloneDetectionDSL.g:1980:2: rule__MinSize__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MinSize__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinSize__Group_1_1__2"


    // $ANTLR start "rule__MinSize__Group_1_1__2__Impl"
    // InternalCloneDetectionDSL.g:1986:1: rule__MinSize__Group_1_1__2__Impl : ( ')' ) ;
    public final void rule__MinSize__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1990:1: ( ( ')' ) )
            // InternalCloneDetectionDSL.g:1991:1: ( ')' )
            {
            // InternalCloneDetectionDSL.g:1991:1: ( ')' )
            // InternalCloneDetectionDSL.g:1992:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getRightParenthesisKeyword_1_1_2()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinSizeAccess().getRightParenthesisKeyword_1_1_2()); 
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
    // $ANTLR end "rule__MinSize__Group_1_1__2__Impl"


    // $ANTLR start "rule__MinSize__Group_2__0"
    // InternalCloneDetectionDSL.g:2002:1: rule__MinSize__Group_2__0 : rule__MinSize__Group_2__0__Impl rule__MinSize__Group_2__1 ;
    public final void rule__MinSize__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2006:1: ( rule__MinSize__Group_2__0__Impl rule__MinSize__Group_2__1 )
            // InternalCloneDetectionDSL.g:2007:2: rule__MinSize__Group_2__0__Impl rule__MinSize__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__MinSize__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MinSize__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinSize__Group_2__0"


    // $ANTLR start "rule__MinSize__Group_2__0__Impl"
    // InternalCloneDetectionDSL.g:2014:1: rule__MinSize__Group_2__0__Impl : ( ( rule__MinSize__OperatorAssignment_2_0 ) ) ;
    public final void rule__MinSize__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2018:1: ( ( ( rule__MinSize__OperatorAssignment_2_0 ) ) )
            // InternalCloneDetectionDSL.g:2019:1: ( ( rule__MinSize__OperatorAssignment_2_0 ) )
            {
            // InternalCloneDetectionDSL.g:2019:1: ( ( rule__MinSize__OperatorAssignment_2_0 ) )
            // InternalCloneDetectionDSL.g:2020:2: ( rule__MinSize__OperatorAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getOperatorAssignment_2_0()); 
            }
            // InternalCloneDetectionDSL.g:2021:2: ( rule__MinSize__OperatorAssignment_2_0 )
            // InternalCloneDetectionDSL.g:2021:3: rule__MinSize__OperatorAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__MinSize__OperatorAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinSizeAccess().getOperatorAssignment_2_0()); 
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
    // $ANTLR end "rule__MinSize__Group_2__0__Impl"


    // $ANTLR start "rule__MinSize__Group_2__1"
    // InternalCloneDetectionDSL.g:2029:1: rule__MinSize__Group_2__1 : rule__MinSize__Group_2__1__Impl ;
    public final void rule__MinSize__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2033:1: ( rule__MinSize__Group_2__1__Impl )
            // InternalCloneDetectionDSL.g:2034:2: rule__MinSize__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MinSize__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinSize__Group_2__1"


    // $ANTLR start "rule__MinSize__Group_2__1__Impl"
    // InternalCloneDetectionDSL.g:2040:1: rule__MinSize__Group_2__1__Impl : ( ( rule__MinSize__SizeAssignment_2_1 ) ) ;
    public final void rule__MinSize__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2044:1: ( ( ( rule__MinSize__SizeAssignment_2_1 ) ) )
            // InternalCloneDetectionDSL.g:2045:1: ( ( rule__MinSize__SizeAssignment_2_1 ) )
            {
            // InternalCloneDetectionDSL.g:2045:1: ( ( rule__MinSize__SizeAssignment_2_1 ) )
            // InternalCloneDetectionDSL.g:2046:2: ( rule__MinSize__SizeAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getSizeAssignment_2_1()); 
            }
            // InternalCloneDetectionDSL.g:2047:2: ( rule__MinSize__SizeAssignment_2_1 )
            // InternalCloneDetectionDSL.g:2047:3: rule__MinSize__SizeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MinSize__SizeAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinSizeAccess().getSizeAssignment_2_1()); 
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
    // $ANTLR end "rule__MinSize__Group_2__1__Impl"


    // $ANTLR start "rule__MetricExpr__Group__0"
    // InternalCloneDetectionDSL.g:2056:1: rule__MetricExpr__Group__0 : rule__MetricExpr__Group__0__Impl rule__MetricExpr__Group__1 ;
    public final void rule__MetricExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2060:1: ( rule__MetricExpr__Group__0__Impl rule__MetricExpr__Group__1 )
            // InternalCloneDetectionDSL.g:2061:2: rule__MetricExpr__Group__0__Impl rule__MetricExpr__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__MetricExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MetricExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricExpr__Group__0"


    // $ANTLR start "rule__MetricExpr__Group__0__Impl"
    // InternalCloneDetectionDSL.g:2068:1: rule__MetricExpr__Group__0__Impl : ( ( rule__MetricExpr__AmountAssignment_0 ) ) ;
    public final void rule__MetricExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2072:1: ( ( ( rule__MetricExpr__AmountAssignment_0 ) ) )
            // InternalCloneDetectionDSL.g:2073:1: ( ( rule__MetricExpr__AmountAssignment_0 ) )
            {
            // InternalCloneDetectionDSL.g:2073:1: ( ( rule__MetricExpr__AmountAssignment_0 ) )
            // InternalCloneDetectionDSL.g:2074:2: ( rule__MetricExpr__AmountAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricExprAccess().getAmountAssignment_0()); 
            }
            // InternalCloneDetectionDSL.g:2075:2: ( rule__MetricExpr__AmountAssignment_0 )
            // InternalCloneDetectionDSL.g:2075:3: rule__MetricExpr__AmountAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MetricExpr__AmountAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetricExprAccess().getAmountAssignment_0()); 
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
    // $ANTLR end "rule__MetricExpr__Group__0__Impl"


    // $ANTLR start "rule__MetricExpr__Group__1"
    // InternalCloneDetectionDSL.g:2083:1: rule__MetricExpr__Group__1 : rule__MetricExpr__Group__1__Impl ;
    public final void rule__MetricExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2087:1: ( rule__MetricExpr__Group__1__Impl )
            // InternalCloneDetectionDSL.g:2088:2: rule__MetricExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MetricExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricExpr__Group__1"


    // $ANTLR start "rule__MetricExpr__Group__1__Impl"
    // InternalCloneDetectionDSL.g:2094:1: rule__MetricExpr__Group__1__Impl : ( ( rule__MetricExpr__MetricAssignment_1 ) ) ;
    public final void rule__MetricExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2098:1: ( ( ( rule__MetricExpr__MetricAssignment_1 ) ) )
            // InternalCloneDetectionDSL.g:2099:1: ( ( rule__MetricExpr__MetricAssignment_1 ) )
            {
            // InternalCloneDetectionDSL.g:2099:1: ( ( rule__MetricExpr__MetricAssignment_1 ) )
            // InternalCloneDetectionDSL.g:2100:2: ( rule__MetricExpr__MetricAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricExprAccess().getMetricAssignment_1()); 
            }
            // InternalCloneDetectionDSL.g:2101:2: ( rule__MetricExpr__MetricAssignment_1 )
            // InternalCloneDetectionDSL.g:2101:3: rule__MetricExpr__MetricAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MetricExpr__MetricAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetricExprAccess().getMetricAssignment_1()); 
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
    // $ANTLR end "rule__MetricExpr__Group__1__Impl"


    // $ANTLR start "rule__DoNotCompare__Group__0"
    // InternalCloneDetectionDSL.g:2110:1: rule__DoNotCompare__Group__0 : rule__DoNotCompare__Group__0__Impl rule__DoNotCompare__Group__1 ;
    public final void rule__DoNotCompare__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2114:1: ( rule__DoNotCompare__Group__0__Impl rule__DoNotCompare__Group__1 )
            // InternalCloneDetectionDSL.g:2115:2: rule__DoNotCompare__Group__0__Impl rule__DoNotCompare__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DoNotCompare__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DoNotCompare__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoNotCompare__Group__0"


    // $ANTLR start "rule__DoNotCompare__Group__0__Impl"
    // InternalCloneDetectionDSL.g:2122:1: rule__DoNotCompare__Group__0__Impl : ( 'DoNotCompare' ) ;
    public final void rule__DoNotCompare__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2126:1: ( ( 'DoNotCompare' ) )
            // InternalCloneDetectionDSL.g:2127:1: ( 'DoNotCompare' )
            {
            // InternalCloneDetectionDSL.g:2127:1: ( 'DoNotCompare' )
            // InternalCloneDetectionDSL.g:2128:2: 'DoNotCompare'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoNotCompareAccess().getDoNotCompareKeyword_0()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoNotCompareAccess().getDoNotCompareKeyword_0()); 
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
    // $ANTLR end "rule__DoNotCompare__Group__0__Impl"


    // $ANTLR start "rule__DoNotCompare__Group__1"
    // InternalCloneDetectionDSL.g:2137:1: rule__DoNotCompare__Group__1 : rule__DoNotCompare__Group__1__Impl ;
    public final void rule__DoNotCompare__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2141:1: ( rule__DoNotCompare__Group__1__Impl )
            // InternalCloneDetectionDSL.g:2142:2: rule__DoNotCompare__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoNotCompare__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoNotCompare__Group__1"


    // $ANTLR start "rule__DoNotCompare__Group__1__Impl"
    // InternalCloneDetectionDSL.g:2148:1: rule__DoNotCompare__Group__1__Impl : ( ruleNodes ) ;
    public final void rule__DoNotCompare__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2152:1: ( ( ruleNodes ) )
            // InternalCloneDetectionDSL.g:2153:1: ( ruleNodes )
            {
            // InternalCloneDetectionDSL.g:2153:1: ( ruleNodes )
            // InternalCloneDetectionDSL.g:2154:2: ruleNodes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoNotCompareAccess().getNodesParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleNodes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoNotCompareAccess().getNodesParserRuleCall_1()); 
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
    // $ANTLR end "rule__DoNotCompare__Group__1__Impl"


    // $ANTLR start "rule__Compare__Group__0"
    // InternalCloneDetectionDSL.g:2164:1: rule__Compare__Group__0 : rule__Compare__Group__0__Impl rule__Compare__Group__1 ;
    public final void rule__Compare__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2168:1: ( rule__Compare__Group__0__Impl rule__Compare__Group__1 )
            // InternalCloneDetectionDSL.g:2169:2: rule__Compare__Group__0__Impl rule__Compare__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Compare__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Compare__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group__0"


    // $ANTLR start "rule__Compare__Group__0__Impl"
    // InternalCloneDetectionDSL.g:2176:1: rule__Compare__Group__0__Impl : ( 'Compare' ) ;
    public final void rule__Compare__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2180:1: ( ( 'Compare' ) )
            // InternalCloneDetectionDSL.g:2181:1: ( 'Compare' )
            {
            // InternalCloneDetectionDSL.g:2181:1: ( 'Compare' )
            // InternalCloneDetectionDSL.g:2182:2: 'Compare'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getCompareKeyword_0()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getCompareKeyword_0()); 
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
    // $ANTLR end "rule__Compare__Group__0__Impl"


    // $ANTLR start "rule__Compare__Group__1"
    // InternalCloneDetectionDSL.g:2191:1: rule__Compare__Group__1 : rule__Compare__Group__1__Impl rule__Compare__Group__2 ;
    public final void rule__Compare__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2195:1: ( rule__Compare__Group__1__Impl rule__Compare__Group__2 )
            // InternalCloneDetectionDSL.g:2196:2: rule__Compare__Group__1__Impl rule__Compare__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Compare__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Compare__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group__1"


    // $ANTLR start "rule__Compare__Group__1__Impl"
    // InternalCloneDetectionDSL.g:2203:1: rule__Compare__Group__1__Impl : ( ( rule__Compare__NodesAssignment_1 ) ) ;
    public final void rule__Compare__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2207:1: ( ( ( rule__Compare__NodesAssignment_1 ) ) )
            // InternalCloneDetectionDSL.g:2208:1: ( ( rule__Compare__NodesAssignment_1 ) )
            {
            // InternalCloneDetectionDSL.g:2208:1: ( ( rule__Compare__NodesAssignment_1 ) )
            // InternalCloneDetectionDSL.g:2209:2: ( rule__Compare__NodesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getNodesAssignment_1()); 
            }
            // InternalCloneDetectionDSL.g:2210:2: ( rule__Compare__NodesAssignment_1 )
            // InternalCloneDetectionDSL.g:2210:3: rule__Compare__NodesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Compare__NodesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getNodesAssignment_1()); 
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
    // $ANTLR end "rule__Compare__Group__1__Impl"


    // $ANTLR start "rule__Compare__Group__2"
    // InternalCloneDetectionDSL.g:2218:1: rule__Compare__Group__2 : rule__Compare__Group__2__Impl rule__Compare__Group__3 ;
    public final void rule__Compare__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2222:1: ( rule__Compare__Group__2__Impl rule__Compare__Group__3 )
            // InternalCloneDetectionDSL.g:2223:2: rule__Compare__Group__2__Impl rule__Compare__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Compare__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Compare__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group__2"


    // $ANTLR start "rule__Compare__Group__2__Impl"
    // InternalCloneDetectionDSL.g:2230:1: rule__Compare__Group__2__Impl : ( ( rule__Compare__ComparisonMethodAssignment_2 ) ) ;
    public final void rule__Compare__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2234:1: ( ( ( rule__Compare__ComparisonMethodAssignment_2 ) ) )
            // InternalCloneDetectionDSL.g:2235:1: ( ( rule__Compare__ComparisonMethodAssignment_2 ) )
            {
            // InternalCloneDetectionDSL.g:2235:1: ( ( rule__Compare__ComparisonMethodAssignment_2 ) )
            // InternalCloneDetectionDSL.g:2236:2: ( rule__Compare__ComparisonMethodAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getComparisonMethodAssignment_2()); 
            }
            // InternalCloneDetectionDSL.g:2237:2: ( rule__Compare__ComparisonMethodAssignment_2 )
            // InternalCloneDetectionDSL.g:2237:3: rule__Compare__ComparisonMethodAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Compare__ComparisonMethodAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getComparisonMethodAssignment_2()); 
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
    // $ANTLR end "rule__Compare__Group__2__Impl"


    // $ANTLR start "rule__Compare__Group__3"
    // InternalCloneDetectionDSL.g:2245:1: rule__Compare__Group__3 : rule__Compare__Group__3__Impl rule__Compare__Group__4 ;
    public final void rule__Compare__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2249:1: ( rule__Compare__Group__3__Impl rule__Compare__Group__4 )
            // InternalCloneDetectionDSL.g:2250:2: rule__Compare__Group__3__Impl rule__Compare__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Compare__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Compare__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group__3"


    // $ANTLR start "rule__Compare__Group__3__Impl"
    // InternalCloneDetectionDSL.g:2257:1: rule__Compare__Group__3__Impl : ( ( rule__Compare__DeepestNodeAssignment_3 )? ) ;
    public final void rule__Compare__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2261:1: ( ( ( rule__Compare__DeepestNodeAssignment_3 )? ) )
            // InternalCloneDetectionDSL.g:2262:1: ( ( rule__Compare__DeepestNodeAssignment_3 )? )
            {
            // InternalCloneDetectionDSL.g:2262:1: ( ( rule__Compare__DeepestNodeAssignment_3 )? )
            // InternalCloneDetectionDSL.g:2263:2: ( rule__Compare__DeepestNodeAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getDeepestNodeAssignment_3()); 
            }
            // InternalCloneDetectionDSL.g:2264:2: ( rule__Compare__DeepestNodeAssignment_3 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID||LA21_0==12) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCloneDetectionDSL.g:2264:3: rule__Compare__DeepestNodeAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compare__DeepestNodeAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getDeepestNodeAssignment_3()); 
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
    // $ANTLR end "rule__Compare__Group__3__Impl"


    // $ANTLR start "rule__Compare__Group__4"
    // InternalCloneDetectionDSL.g:2272:1: rule__Compare__Group__4 : rule__Compare__Group__4__Impl ;
    public final void rule__Compare__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2276:1: ( rule__Compare__Group__4__Impl )
            // InternalCloneDetectionDSL.g:2277:2: rule__Compare__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compare__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group__4"


    // $ANTLR start "rule__Compare__Group__4__Impl"
    // InternalCloneDetectionDSL.g:2283:1: rule__Compare__Group__4__Impl : ( ( rule__Compare__PercAssignment_4 )? ) ;
    public final void rule__Compare__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2287:1: ( ( ( rule__Compare__PercAssignment_4 )? ) )
            // InternalCloneDetectionDSL.g:2288:1: ( ( rule__Compare__PercAssignment_4 )? )
            {
            // InternalCloneDetectionDSL.g:2288:1: ( ( rule__Compare__PercAssignment_4 )? )
            // InternalCloneDetectionDSL.g:2289:2: ( rule__Compare__PercAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getPercAssignment_4()); 
            }
            // InternalCloneDetectionDSL.g:2290:2: ( rule__Compare__PercAssignment_4 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCloneDetectionDSL.g:2290:3: rule__Compare__PercAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compare__PercAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getPercAssignment_4()); 
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
    // $ANTLR end "rule__Compare__Group__4__Impl"


    // $ANTLR start "rule__Percentage__Group__0"
    // InternalCloneDetectionDSL.g:2299:1: rule__Percentage__Group__0 : rule__Percentage__Group__0__Impl rule__Percentage__Group__1 ;
    public final void rule__Percentage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2303:1: ( rule__Percentage__Group__0__Impl rule__Percentage__Group__1 )
            // InternalCloneDetectionDSL.g:2304:2: rule__Percentage__Group__0__Impl rule__Percentage__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Percentage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Percentage__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Percentage__Group__0"


    // $ANTLR start "rule__Percentage__Group__0__Impl"
    // InternalCloneDetectionDSL.g:2311:1: rule__Percentage__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Percentage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2315:1: ( ( RULE_INT ) )
            // InternalCloneDetectionDSL.g:2316:1: ( RULE_INT )
            {
            // InternalCloneDetectionDSL.g:2316:1: ( RULE_INT )
            // InternalCloneDetectionDSL.g:2317:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPercentageAccess().getINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPercentageAccess().getINTTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__Percentage__Group__0__Impl"


    // $ANTLR start "rule__Percentage__Group__1"
    // InternalCloneDetectionDSL.g:2326:1: rule__Percentage__Group__1 : rule__Percentage__Group__1__Impl ;
    public final void rule__Percentage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2330:1: ( rule__Percentage__Group__1__Impl )
            // InternalCloneDetectionDSL.g:2331:2: rule__Percentage__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Percentage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Percentage__Group__1"


    // $ANTLR start "rule__Percentage__Group__1__Impl"
    // InternalCloneDetectionDSL.g:2337:1: rule__Percentage__Group__1__Impl : ( '%' ) ;
    public final void rule__Percentage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2341:1: ( ( '%' ) )
            // InternalCloneDetectionDSL.g:2342:1: ( '%' )
            {
            // InternalCloneDetectionDSL.g:2342:1: ( '%' )
            // InternalCloneDetectionDSL.g:2343:2: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPercentageAccess().getPercentSignKeyword_1()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPercentageAccess().getPercentSignKeyword_1()); 
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
    // $ANTLR end "rule__Percentage__Group__1__Impl"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group__0"
    // InternalCloneDetectionDSL.g:2353:1: rule__BooleanExpressionLevel1__Group__0 : rule__BooleanExpressionLevel1__Group__0__Impl rule__BooleanExpressionLevel1__Group__1 ;
    public final void rule__BooleanExpressionLevel1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2357:1: ( rule__BooleanExpressionLevel1__Group__0__Impl rule__BooleanExpressionLevel1__Group__1 )
            // InternalCloneDetectionDSL.g:2358:2: rule__BooleanExpressionLevel1__Group__0__Impl rule__BooleanExpressionLevel1__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__BooleanExpressionLevel1__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel1__Group__0"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group__0__Impl"
    // InternalCloneDetectionDSL.g:2365:1: rule__BooleanExpressionLevel1__Group__0__Impl : ( ruleBooleanExpressionLevel2 ) ;
    public final void rule__BooleanExpressionLevel1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2369:1: ( ( ruleBooleanExpressionLevel2 ) )
            // InternalCloneDetectionDSL.g:2370:1: ( ruleBooleanExpressionLevel2 )
            {
            // InternalCloneDetectionDSL.g:2370:1: ( ruleBooleanExpressionLevel2 )
            // InternalCloneDetectionDSL.g:2371:2: ruleBooleanExpressionLevel2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getBooleanExpressionLevel2ParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getBooleanExpressionLevel2ParserRuleCall_0()); 
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
    // $ANTLR end "rule__BooleanExpressionLevel1__Group__0__Impl"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group__1"
    // InternalCloneDetectionDSL.g:2380:1: rule__BooleanExpressionLevel1__Group__1 : rule__BooleanExpressionLevel1__Group__1__Impl ;
    public final void rule__BooleanExpressionLevel1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2384:1: ( rule__BooleanExpressionLevel1__Group__1__Impl )
            // InternalCloneDetectionDSL.g:2385:2: rule__BooleanExpressionLevel1__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel1__Group__1"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group__1__Impl"
    // InternalCloneDetectionDSL.g:2391:1: rule__BooleanExpressionLevel1__Group__1__Impl : ( ( rule__BooleanExpressionLevel1__Group_1__0 )* ) ;
    public final void rule__BooleanExpressionLevel1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2395:1: ( ( ( rule__BooleanExpressionLevel1__Group_1__0 )* ) )
            // InternalCloneDetectionDSL.g:2396:1: ( ( rule__BooleanExpressionLevel1__Group_1__0 )* )
            {
            // InternalCloneDetectionDSL.g:2396:1: ( ( rule__BooleanExpressionLevel1__Group_1__0 )* )
            // InternalCloneDetectionDSL.g:2397:2: ( rule__BooleanExpressionLevel1__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getGroup_1()); 
            }
            // InternalCloneDetectionDSL.g:2398:2: ( rule__BooleanExpressionLevel1__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=34 && LA23_0<=35)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalCloneDetectionDSL.g:2398:3: rule__BooleanExpressionLevel1__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__BooleanExpressionLevel1__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getGroup_1()); 
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
    // $ANTLR end "rule__BooleanExpressionLevel1__Group__1__Impl"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group_1__0"
    // InternalCloneDetectionDSL.g:2407:1: rule__BooleanExpressionLevel1__Group_1__0 : rule__BooleanExpressionLevel1__Group_1__0__Impl rule__BooleanExpressionLevel1__Group_1__1 ;
    public final void rule__BooleanExpressionLevel1__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2411:1: ( rule__BooleanExpressionLevel1__Group_1__0__Impl rule__BooleanExpressionLevel1__Group_1__1 )
            // InternalCloneDetectionDSL.g:2412:2: rule__BooleanExpressionLevel1__Group_1__0__Impl rule__BooleanExpressionLevel1__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__BooleanExpressionLevel1__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel1__Group_1__0"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group_1__0__Impl"
    // InternalCloneDetectionDSL.g:2419:1: rule__BooleanExpressionLevel1__Group_1__0__Impl : ( () ) ;
    public final void rule__BooleanExpressionLevel1__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2423:1: ( ( () ) )
            // InternalCloneDetectionDSL.g:2424:1: ( () )
            {
            // InternalCloneDetectionDSL.g:2424:1: ( () )
            // InternalCloneDetectionDSL.g:2425:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getExpressionBinOpLeftAction_1_0()); 
            }
            // InternalCloneDetectionDSL.g:2426:2: ()
            // InternalCloneDetectionDSL.g:2426:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getExpressionBinOpLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel1__Group_1__0__Impl"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group_1__1"
    // InternalCloneDetectionDSL.g:2434:1: rule__BooleanExpressionLevel1__Group_1__1 : rule__BooleanExpressionLevel1__Group_1__1__Impl rule__BooleanExpressionLevel1__Group_1__2 ;
    public final void rule__BooleanExpressionLevel1__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2438:1: ( rule__BooleanExpressionLevel1__Group_1__1__Impl rule__BooleanExpressionLevel1__Group_1__2 )
            // InternalCloneDetectionDSL.g:2439:2: rule__BooleanExpressionLevel1__Group_1__1__Impl rule__BooleanExpressionLevel1__Group_1__2
            {
            pushFollow(FOLLOW_19);
            rule__BooleanExpressionLevel1__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel1__Group_1__1"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group_1__1__Impl"
    // InternalCloneDetectionDSL.g:2446:1: rule__BooleanExpressionLevel1__Group_1__1__Impl : ( ( rule__BooleanExpressionLevel1__BopAssignment_1_1 ) ) ;
    public final void rule__BooleanExpressionLevel1__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2450:1: ( ( ( rule__BooleanExpressionLevel1__BopAssignment_1_1 ) ) )
            // InternalCloneDetectionDSL.g:2451:1: ( ( rule__BooleanExpressionLevel1__BopAssignment_1_1 ) )
            {
            // InternalCloneDetectionDSL.g:2451:1: ( ( rule__BooleanExpressionLevel1__BopAssignment_1_1 ) )
            // InternalCloneDetectionDSL.g:2452:2: ( rule__BooleanExpressionLevel1__BopAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getBopAssignment_1_1()); 
            }
            // InternalCloneDetectionDSL.g:2453:2: ( rule__BooleanExpressionLevel1__BopAssignment_1_1 )
            // InternalCloneDetectionDSL.g:2453:3: rule__BooleanExpressionLevel1__BopAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__BopAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getBopAssignment_1_1()); 
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
    // $ANTLR end "rule__BooleanExpressionLevel1__Group_1__1__Impl"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group_1__2"
    // InternalCloneDetectionDSL.g:2461:1: rule__BooleanExpressionLevel1__Group_1__2 : rule__BooleanExpressionLevel1__Group_1__2__Impl ;
    public final void rule__BooleanExpressionLevel1__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2465:1: ( rule__BooleanExpressionLevel1__Group_1__2__Impl )
            // InternalCloneDetectionDSL.g:2466:2: rule__BooleanExpressionLevel1__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel1__Group_1__2"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group_1__2__Impl"
    // InternalCloneDetectionDSL.g:2472:1: rule__BooleanExpressionLevel1__Group_1__2__Impl : ( ( rule__BooleanExpressionLevel1__RightAssignment_1_2 ) ) ;
    public final void rule__BooleanExpressionLevel1__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2476:1: ( ( ( rule__BooleanExpressionLevel1__RightAssignment_1_2 ) ) )
            // InternalCloneDetectionDSL.g:2477:1: ( ( rule__BooleanExpressionLevel1__RightAssignment_1_2 ) )
            {
            // InternalCloneDetectionDSL.g:2477:1: ( ( rule__BooleanExpressionLevel1__RightAssignment_1_2 ) )
            // InternalCloneDetectionDSL.g:2478:2: ( rule__BooleanExpressionLevel1__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getRightAssignment_1_2()); 
            }
            // InternalCloneDetectionDSL.g:2479:2: ( rule__BooleanExpressionLevel1__RightAssignment_1_2 )
            // InternalCloneDetectionDSL.g:2479:3: rule__BooleanExpressionLevel1__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__BooleanExpressionLevel1__Group_1__2__Impl"


    // $ANTLR start "rule__NotExpression__Group__0"
    // InternalCloneDetectionDSL.g:2488:1: rule__NotExpression__Group__0 : rule__NotExpression__Group__0__Impl rule__NotExpression__Group__1 ;
    public final void rule__NotExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2492:1: ( rule__NotExpression__Group__0__Impl rule__NotExpression__Group__1 )
            // InternalCloneDetectionDSL.g:2493:2: rule__NotExpression__Group__0__Impl rule__NotExpression__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__NotExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NotExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Group__0"


    // $ANTLR start "rule__NotExpression__Group__0__Impl"
    // InternalCloneDetectionDSL.g:2500:1: rule__NotExpression__Group__0__Impl : ( 'NOT' ) ;
    public final void rule__NotExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2504:1: ( ( 'NOT' ) )
            // InternalCloneDetectionDSL.g:2505:1: ( 'NOT' )
            {
            // InternalCloneDetectionDSL.g:2505:1: ( 'NOT' )
            // InternalCloneDetectionDSL.g:2506:2: 'NOT'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getNOTKeyword_0()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getNOTKeyword_0()); 
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
    // $ANTLR end "rule__NotExpression__Group__0__Impl"


    // $ANTLR start "rule__NotExpression__Group__1"
    // InternalCloneDetectionDSL.g:2515:1: rule__NotExpression__Group__1 : rule__NotExpression__Group__1__Impl ;
    public final void rule__NotExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2519:1: ( rule__NotExpression__Group__1__Impl )
            // InternalCloneDetectionDSL.g:2520:2: rule__NotExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NotExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Group__1"


    // $ANTLR start "rule__NotExpression__Group__1__Impl"
    // InternalCloneDetectionDSL.g:2526:1: rule__NotExpression__Group__1__Impl : ( ( rule__NotExpression__SubAssignment_1 ) ) ;
    public final void rule__NotExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2530:1: ( ( ( rule__NotExpression__SubAssignment_1 ) ) )
            // InternalCloneDetectionDSL.g:2531:1: ( ( rule__NotExpression__SubAssignment_1 ) )
            {
            // InternalCloneDetectionDSL.g:2531:1: ( ( rule__NotExpression__SubAssignment_1 ) )
            // InternalCloneDetectionDSL.g:2532:2: ( rule__NotExpression__SubAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubAssignment_1()); 
            }
            // InternalCloneDetectionDSL.g:2533:2: ( rule__NotExpression__SubAssignment_1 )
            // InternalCloneDetectionDSL.g:2533:3: rule__NotExpression__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NotExpression__SubAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getSubAssignment_1()); 
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
    // $ANTLR end "rule__NotExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__0"
    // InternalCloneDetectionDSL.g:2542:1: rule__ComparisonExpression__Group__0 : rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 ;
    public final void rule__ComparisonExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2546:1: ( rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 )
            // InternalCloneDetectionDSL.g:2547:2: rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ComparisonExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__0"


    // $ANTLR start "rule__ComparisonExpression__Group__0__Impl"
    // InternalCloneDetectionDSL.g:2554:1: rule__ComparisonExpression__Group__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2558:1: ( ( () ) )
            // InternalCloneDetectionDSL.g:2559:1: ( () )
            {
            // InternalCloneDetectionDSL.g:2559:1: ( () )
            // InternalCloneDetectionDSL.g:2560:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getExpressionCompOpAction_0()); 
            }
            // InternalCloneDetectionDSL.g:2561:2: ()
            // InternalCloneDetectionDSL.g:2561:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getExpressionCompOpAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__1"
    // InternalCloneDetectionDSL.g:2569:1: rule__ComparisonExpression__Group__1 : rule__ComparisonExpression__Group__1__Impl rule__ComparisonExpression__Group__2 ;
    public final void rule__ComparisonExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2573:1: ( rule__ComparisonExpression__Group__1__Impl rule__ComparisonExpression__Group__2 )
            // InternalCloneDetectionDSL.g:2574:2: rule__ComparisonExpression__Group__1__Impl rule__ComparisonExpression__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__ComparisonExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__1"


    // $ANTLR start "rule__ComparisonExpression__Group__1__Impl"
    // InternalCloneDetectionDSL.g:2581:1: rule__ComparisonExpression__Group__1__Impl : ( ( rule__ComparisonExpression__LeftAssignment_1 ) ) ;
    public final void rule__ComparisonExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2585:1: ( ( ( rule__ComparisonExpression__LeftAssignment_1 ) ) )
            // InternalCloneDetectionDSL.g:2586:1: ( ( rule__ComparisonExpression__LeftAssignment_1 ) )
            {
            // InternalCloneDetectionDSL.g:2586:1: ( ( rule__ComparisonExpression__LeftAssignment_1 ) )
            // InternalCloneDetectionDSL.g:2587:2: ( rule__ComparisonExpression__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getLeftAssignment_1()); 
            }
            // InternalCloneDetectionDSL.g:2588:2: ( rule__ComparisonExpression__LeftAssignment_1 )
            // InternalCloneDetectionDSL.g:2588:3: rule__ComparisonExpression__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getLeftAssignment_1()); 
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
    // $ANTLR end "rule__ComparisonExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__2"
    // InternalCloneDetectionDSL.g:2596:1: rule__ComparisonExpression__Group__2 : rule__ComparisonExpression__Group__2__Impl rule__ComparisonExpression__Group__3 ;
    public final void rule__ComparisonExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2600:1: ( rule__ComparisonExpression__Group__2__Impl rule__ComparisonExpression__Group__3 )
            // InternalCloneDetectionDSL.g:2601:2: rule__ComparisonExpression__Group__2__Impl rule__ComparisonExpression__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ComparisonExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__2"


    // $ANTLR start "rule__ComparisonExpression__Group__2__Impl"
    // InternalCloneDetectionDSL.g:2608:1: rule__ComparisonExpression__Group__2__Impl : ( ( rule__ComparisonExpression__OpAssignment_2 ) ) ;
    public final void rule__ComparisonExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2612:1: ( ( ( rule__ComparisonExpression__OpAssignment_2 ) ) )
            // InternalCloneDetectionDSL.g:2613:1: ( ( rule__ComparisonExpression__OpAssignment_2 ) )
            {
            // InternalCloneDetectionDSL.g:2613:1: ( ( rule__ComparisonExpression__OpAssignment_2 ) )
            // InternalCloneDetectionDSL.g:2614:2: ( rule__ComparisonExpression__OpAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getOpAssignment_2()); 
            }
            // InternalCloneDetectionDSL.g:2615:2: ( rule__ComparisonExpression__OpAssignment_2 )
            // InternalCloneDetectionDSL.g:2615:3: rule__ComparisonExpression__OpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__OpAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getOpAssignment_2()); 
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
    // $ANTLR end "rule__ComparisonExpression__Group__2__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__3"
    // InternalCloneDetectionDSL.g:2623:1: rule__ComparisonExpression__Group__3 : rule__ComparisonExpression__Group__3__Impl ;
    public final void rule__ComparisonExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2627:1: ( rule__ComparisonExpression__Group__3__Impl )
            // InternalCloneDetectionDSL.g:2628:2: rule__ComparisonExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__3"


    // $ANTLR start "rule__ComparisonExpression__Group__3__Impl"
    // InternalCloneDetectionDSL.g:2634:1: rule__ComparisonExpression__Group__3__Impl : ( ( rule__ComparisonExpression__RightAssignment_3 ) ) ;
    public final void rule__ComparisonExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2638:1: ( ( ( rule__ComparisonExpression__RightAssignment_3 ) ) )
            // InternalCloneDetectionDSL.g:2639:1: ( ( rule__ComparisonExpression__RightAssignment_3 ) )
            {
            // InternalCloneDetectionDSL.g:2639:1: ( ( rule__ComparisonExpression__RightAssignment_3 ) )
            // InternalCloneDetectionDSL.g:2640:2: ( rule__ComparisonExpression__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getRightAssignment_3()); 
            }
            // InternalCloneDetectionDSL.g:2641:2: ( rule__ComparisonExpression__RightAssignment_3 )
            // InternalCloneDetectionDSL.g:2641:3: rule__ComparisonExpression__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__RightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getRightAssignment_3()); 
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
    // $ANTLR end "rule__ComparisonExpression__Group__3__Impl"


    // $ANTLR start "rule__BooleanExpressionBracket__Group__0"
    // InternalCloneDetectionDSL.g:2650:1: rule__BooleanExpressionBracket__Group__0 : rule__BooleanExpressionBracket__Group__0__Impl rule__BooleanExpressionBracket__Group__1 ;
    public final void rule__BooleanExpressionBracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2654:1: ( rule__BooleanExpressionBracket__Group__0__Impl rule__BooleanExpressionBracket__Group__1 )
            // InternalCloneDetectionDSL.g:2655:2: rule__BooleanExpressionBracket__Group__0__Impl rule__BooleanExpressionBracket__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__BooleanExpressionBracket__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionBracket__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionBracket__Group__0"


    // $ANTLR start "rule__BooleanExpressionBracket__Group__0__Impl"
    // InternalCloneDetectionDSL.g:2662:1: rule__BooleanExpressionBracket__Group__0__Impl : ( '(' ) ;
    public final void rule__BooleanExpressionBracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2666:1: ( ( '(' ) )
            // InternalCloneDetectionDSL.g:2667:1: ( '(' )
            {
            // InternalCloneDetectionDSL.g:2667:1: ( '(' )
            // InternalCloneDetectionDSL.g:2668:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionBracketAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionBracketAccess().getLeftParenthesisKeyword_0()); 
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
    // $ANTLR end "rule__BooleanExpressionBracket__Group__0__Impl"


    // $ANTLR start "rule__BooleanExpressionBracket__Group__1"
    // InternalCloneDetectionDSL.g:2677:1: rule__BooleanExpressionBracket__Group__1 : rule__BooleanExpressionBracket__Group__1__Impl rule__BooleanExpressionBracket__Group__2 ;
    public final void rule__BooleanExpressionBracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2681:1: ( rule__BooleanExpressionBracket__Group__1__Impl rule__BooleanExpressionBracket__Group__2 )
            // InternalCloneDetectionDSL.g:2682:2: rule__BooleanExpressionBracket__Group__1__Impl rule__BooleanExpressionBracket__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__BooleanExpressionBracket__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionBracket__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionBracket__Group__1"


    // $ANTLR start "rule__BooleanExpressionBracket__Group__1__Impl"
    // InternalCloneDetectionDSL.g:2689:1: rule__BooleanExpressionBracket__Group__1__Impl : ( ( rule__BooleanExpressionBracket__SubAssignment_1 ) ) ;
    public final void rule__BooleanExpressionBracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2693:1: ( ( ( rule__BooleanExpressionBracket__SubAssignment_1 ) ) )
            // InternalCloneDetectionDSL.g:2694:1: ( ( rule__BooleanExpressionBracket__SubAssignment_1 ) )
            {
            // InternalCloneDetectionDSL.g:2694:1: ( ( rule__BooleanExpressionBracket__SubAssignment_1 ) )
            // InternalCloneDetectionDSL.g:2695:2: ( rule__BooleanExpressionBracket__SubAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionBracketAccess().getSubAssignment_1()); 
            }
            // InternalCloneDetectionDSL.g:2696:2: ( rule__BooleanExpressionBracket__SubAssignment_1 )
            // InternalCloneDetectionDSL.g:2696:3: rule__BooleanExpressionBracket__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionBracket__SubAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionBracketAccess().getSubAssignment_1()); 
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
    // $ANTLR end "rule__BooleanExpressionBracket__Group__1__Impl"


    // $ANTLR start "rule__BooleanExpressionBracket__Group__2"
    // InternalCloneDetectionDSL.g:2704:1: rule__BooleanExpressionBracket__Group__2 : rule__BooleanExpressionBracket__Group__2__Impl ;
    public final void rule__BooleanExpressionBracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2708:1: ( rule__BooleanExpressionBracket__Group__2__Impl )
            // InternalCloneDetectionDSL.g:2709:2: rule__BooleanExpressionBracket__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionBracket__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionBracket__Group__2"


    // $ANTLR start "rule__BooleanExpressionBracket__Group__2__Impl"
    // InternalCloneDetectionDSL.g:2715:1: rule__BooleanExpressionBracket__Group__2__Impl : ( ')' ) ;
    public final void rule__BooleanExpressionBracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2719:1: ( ( ')' ) )
            // InternalCloneDetectionDSL.g:2720:1: ( ')' )
            {
            // InternalCloneDetectionDSL.g:2720:1: ( ')' )
            // InternalCloneDetectionDSL.g:2721:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionBracketAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionBracketAccess().getRightParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__BooleanExpressionBracket__Group__2__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group__0"
    // InternalCloneDetectionDSL.g:2731:1: rule__ExpressionLevel1__Group__0 : rule__ExpressionLevel1__Group__0__Impl rule__ExpressionLevel1__Group__1 ;
    public final void rule__ExpressionLevel1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2735:1: ( rule__ExpressionLevel1__Group__0__Impl rule__ExpressionLevel1__Group__1 )
            // InternalCloneDetectionDSL.g:2736:2: rule__ExpressionLevel1__Group__0__Impl rule__ExpressionLevel1__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ExpressionLevel1__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group__0"


    // $ANTLR start "rule__ExpressionLevel1__Group__0__Impl"
    // InternalCloneDetectionDSL.g:2743:1: rule__ExpressionLevel1__Group__0__Impl : ( ruleExpressionLevel2 ) ;
    public final void rule__ExpressionLevel1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2747:1: ( ( ruleExpressionLevel2 ) )
            // InternalCloneDetectionDSL.g:2748:1: ( ruleExpressionLevel2 )
            {
            // InternalCloneDetectionDSL.g:2748:1: ( ruleExpressionLevel2 )
            // InternalCloneDetectionDSL.g:2749:2: ruleExpressionLevel2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getExpressionLevel2ParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getExpressionLevel2ParserRuleCall_0()); 
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
    // $ANTLR end "rule__ExpressionLevel1__Group__0__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group__1"
    // InternalCloneDetectionDSL.g:2758:1: rule__ExpressionLevel1__Group__1 : rule__ExpressionLevel1__Group__1__Impl ;
    public final void rule__ExpressionLevel1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2762:1: ( rule__ExpressionLevel1__Group__1__Impl )
            // InternalCloneDetectionDSL.g:2763:2: rule__ExpressionLevel1__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group__1"


    // $ANTLR start "rule__ExpressionLevel1__Group__1__Impl"
    // InternalCloneDetectionDSL.g:2769:1: rule__ExpressionLevel1__Group__1__Impl : ( ( rule__ExpressionLevel1__Alternatives_1 )* ) ;
    public final void rule__ExpressionLevel1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2773:1: ( ( ( rule__ExpressionLevel1__Alternatives_1 )* ) )
            // InternalCloneDetectionDSL.g:2774:1: ( ( rule__ExpressionLevel1__Alternatives_1 )* )
            {
            // InternalCloneDetectionDSL.g:2774:1: ( ( rule__ExpressionLevel1__Alternatives_1 )* )
            // InternalCloneDetectionDSL.g:2775:2: ( rule__ExpressionLevel1__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getAlternatives_1()); 
            }
            // InternalCloneDetectionDSL.g:2776:2: ( rule__ExpressionLevel1__Alternatives_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=54 && LA24_0<=55)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalCloneDetectionDSL.g:2776:3: rule__ExpressionLevel1__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__ExpressionLevel1__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getAlternatives_1()); 
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
    // $ANTLR end "rule__ExpressionLevel1__Group__1__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__0"
    // InternalCloneDetectionDSL.g:2785:1: rule__ExpressionLevel1__Group_1_0__0 : rule__ExpressionLevel1__Group_1_0__0__Impl rule__ExpressionLevel1__Group_1_0__1 ;
    public final void rule__ExpressionLevel1__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2789:1: ( rule__ExpressionLevel1__Group_1_0__0__Impl rule__ExpressionLevel1__Group_1_0__1 )
            // InternalCloneDetectionDSL.g:2790:2: rule__ExpressionLevel1__Group_1_0__0__Impl rule__ExpressionLevel1__Group_1_0__1
            {
            pushFollow(FOLLOW_23);
            rule__ExpressionLevel1__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__0"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__0__Impl"
    // InternalCloneDetectionDSL.g:2797:1: rule__ExpressionLevel1__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel1__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2801:1: ( ( () ) )
            // InternalCloneDetectionDSL.g:2802:1: ( () )
            {
            // InternalCloneDetectionDSL.g:2802:1: ( () )
            // InternalCloneDetectionDSL.g:2803:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getExpressionAdditionLeftAction_1_0_0()); 
            }
            // InternalCloneDetectionDSL.g:2804:2: ()
            // InternalCloneDetectionDSL.g:2804:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getExpressionAdditionLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__0__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__1"
    // InternalCloneDetectionDSL.g:2812:1: rule__ExpressionLevel1__Group_1_0__1 : rule__ExpressionLevel1__Group_1_0__1__Impl rule__ExpressionLevel1__Group_1_0__2 ;
    public final void rule__ExpressionLevel1__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2816:1: ( rule__ExpressionLevel1__Group_1_0__1__Impl rule__ExpressionLevel1__Group_1_0__2 )
            // InternalCloneDetectionDSL.g:2817:2: rule__ExpressionLevel1__Group_1_0__1__Impl rule__ExpressionLevel1__Group_1_0__2
            {
            pushFollow(FOLLOW_5);
            rule__ExpressionLevel1__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__1"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__1__Impl"
    // InternalCloneDetectionDSL.g:2824:1: rule__ExpressionLevel1__Group_1_0__1__Impl : ( '+' ) ;
    public final void rule__ExpressionLevel1__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2828:1: ( ( '+' ) )
            // InternalCloneDetectionDSL.g:2829:1: ( '+' )
            {
            // InternalCloneDetectionDSL.g:2829:1: ( '+' )
            // InternalCloneDetectionDSL.g:2830:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getPlusSignKeyword_1_0_1()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getPlusSignKeyword_1_0_1()); 
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
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__1__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__2"
    // InternalCloneDetectionDSL.g:2839:1: rule__ExpressionLevel1__Group_1_0__2 : rule__ExpressionLevel1__Group_1_0__2__Impl ;
    public final void rule__ExpressionLevel1__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2843:1: ( rule__ExpressionLevel1__Group_1_0__2__Impl )
            // InternalCloneDetectionDSL.g:2844:2: rule__ExpressionLevel1__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__2"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__2__Impl"
    // InternalCloneDetectionDSL.g:2850:1: rule__ExpressionLevel1__Group_1_0__2__Impl : ( ( rule__ExpressionLevel1__RightAssignment_1_0_2 ) ) ;
    public final void rule__ExpressionLevel1__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2854:1: ( ( ( rule__ExpressionLevel1__RightAssignment_1_0_2 ) ) )
            // InternalCloneDetectionDSL.g:2855:1: ( ( rule__ExpressionLevel1__RightAssignment_1_0_2 ) )
            {
            // InternalCloneDetectionDSL.g:2855:1: ( ( rule__ExpressionLevel1__RightAssignment_1_0_2 ) )
            // InternalCloneDetectionDSL.g:2856:2: ( rule__ExpressionLevel1__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getRightAssignment_1_0_2()); 
            }
            // InternalCloneDetectionDSL.g:2857:2: ( rule__ExpressionLevel1__RightAssignment_1_0_2 )
            // InternalCloneDetectionDSL.g:2857:3: rule__ExpressionLevel1__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__RightAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getRightAssignment_1_0_2()); 
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
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__2__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__0"
    // InternalCloneDetectionDSL.g:2866:1: rule__ExpressionLevel1__Group_1_1__0 : rule__ExpressionLevel1__Group_1_1__0__Impl rule__ExpressionLevel1__Group_1_1__1 ;
    public final void rule__ExpressionLevel1__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2870:1: ( rule__ExpressionLevel1__Group_1_1__0__Impl rule__ExpressionLevel1__Group_1_1__1 )
            // InternalCloneDetectionDSL.g:2871:2: rule__ExpressionLevel1__Group_1_1__0__Impl rule__ExpressionLevel1__Group_1_1__1
            {
            pushFollow(FOLLOW_21);
            rule__ExpressionLevel1__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__0"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__0__Impl"
    // InternalCloneDetectionDSL.g:2878:1: rule__ExpressionLevel1__Group_1_1__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel1__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2882:1: ( ( () ) )
            // InternalCloneDetectionDSL.g:2883:1: ( () )
            {
            // InternalCloneDetectionDSL.g:2883:1: ( () )
            // InternalCloneDetectionDSL.g:2884:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getExpressionSubtractionLeftAction_1_1_0()); 
            }
            // InternalCloneDetectionDSL.g:2885:2: ()
            // InternalCloneDetectionDSL.g:2885:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getExpressionSubtractionLeftAction_1_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__0__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__1"
    // InternalCloneDetectionDSL.g:2893:1: rule__ExpressionLevel1__Group_1_1__1 : rule__ExpressionLevel1__Group_1_1__1__Impl rule__ExpressionLevel1__Group_1_1__2 ;
    public final void rule__ExpressionLevel1__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2897:1: ( rule__ExpressionLevel1__Group_1_1__1__Impl rule__ExpressionLevel1__Group_1_1__2 )
            // InternalCloneDetectionDSL.g:2898:2: rule__ExpressionLevel1__Group_1_1__1__Impl rule__ExpressionLevel1__Group_1_1__2
            {
            pushFollow(FOLLOW_5);
            rule__ExpressionLevel1__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__1"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__1__Impl"
    // InternalCloneDetectionDSL.g:2905:1: rule__ExpressionLevel1__Group_1_1__1__Impl : ( '-' ) ;
    public final void rule__ExpressionLevel1__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2909:1: ( ( '-' ) )
            // InternalCloneDetectionDSL.g:2910:1: ( '-' )
            {
            // InternalCloneDetectionDSL.g:2910:1: ( '-' )
            // InternalCloneDetectionDSL.g:2911:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getHyphenMinusKeyword_1_1_1()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getHyphenMinusKeyword_1_1_1()); 
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
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__1__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__2"
    // InternalCloneDetectionDSL.g:2920:1: rule__ExpressionLevel1__Group_1_1__2 : rule__ExpressionLevel1__Group_1_1__2__Impl ;
    public final void rule__ExpressionLevel1__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2924:1: ( rule__ExpressionLevel1__Group_1_1__2__Impl )
            // InternalCloneDetectionDSL.g:2925:2: rule__ExpressionLevel1__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__2"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__2__Impl"
    // InternalCloneDetectionDSL.g:2931:1: rule__ExpressionLevel1__Group_1_1__2__Impl : ( ( rule__ExpressionLevel1__RightAssignment_1_1_2 ) ) ;
    public final void rule__ExpressionLevel1__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2935:1: ( ( ( rule__ExpressionLevel1__RightAssignment_1_1_2 ) ) )
            // InternalCloneDetectionDSL.g:2936:1: ( ( rule__ExpressionLevel1__RightAssignment_1_1_2 ) )
            {
            // InternalCloneDetectionDSL.g:2936:1: ( ( rule__ExpressionLevel1__RightAssignment_1_1_2 ) )
            // InternalCloneDetectionDSL.g:2937:2: ( rule__ExpressionLevel1__RightAssignment_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getRightAssignment_1_1_2()); 
            }
            // InternalCloneDetectionDSL.g:2938:2: ( rule__ExpressionLevel1__RightAssignment_1_1_2 )
            // InternalCloneDetectionDSL.g:2938:3: rule__ExpressionLevel1__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__RightAssignment_1_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getRightAssignment_1_1_2()); 
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
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__2__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group__0"
    // InternalCloneDetectionDSL.g:2947:1: rule__ExpressionLevel2__Group__0 : rule__ExpressionLevel2__Group__0__Impl rule__ExpressionLevel2__Group__1 ;
    public final void rule__ExpressionLevel2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2951:1: ( rule__ExpressionLevel2__Group__0__Impl rule__ExpressionLevel2__Group__1 )
            // InternalCloneDetectionDSL.g:2952:2: rule__ExpressionLevel2__Group__0__Impl rule__ExpressionLevel2__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__ExpressionLevel2__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group__0"


    // $ANTLR start "rule__ExpressionLevel2__Group__0__Impl"
    // InternalCloneDetectionDSL.g:2959:1: rule__ExpressionLevel2__Group__0__Impl : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2963:1: ( ( ruleExpressionLevel3 ) )
            // InternalCloneDetectionDSL.g:2964:1: ( ruleExpressionLevel3 )
            {
            // InternalCloneDetectionDSL.g:2964:1: ( ruleExpressionLevel3 )
            // InternalCloneDetectionDSL.g:2965:2: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getExpressionLevel3ParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getExpressionLevel3ParserRuleCall_0()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group__1"
    // InternalCloneDetectionDSL.g:2974:1: rule__ExpressionLevel2__Group__1 : rule__ExpressionLevel2__Group__1__Impl ;
    public final void rule__ExpressionLevel2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2978:1: ( rule__ExpressionLevel2__Group__1__Impl )
            // InternalCloneDetectionDSL.g:2979:2: rule__ExpressionLevel2__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group__1"


    // $ANTLR start "rule__ExpressionLevel2__Group__1__Impl"
    // InternalCloneDetectionDSL.g:2985:1: rule__ExpressionLevel2__Group__1__Impl : ( ( rule__ExpressionLevel2__Alternatives_1 )* ) ;
    public final void rule__ExpressionLevel2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2989:1: ( ( ( rule__ExpressionLevel2__Alternatives_1 )* ) )
            // InternalCloneDetectionDSL.g:2990:1: ( ( rule__ExpressionLevel2__Alternatives_1 )* )
            {
            // InternalCloneDetectionDSL.g:2990:1: ( ( rule__ExpressionLevel2__Alternatives_1 )* )
            // InternalCloneDetectionDSL.g:2991:2: ( rule__ExpressionLevel2__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getAlternatives_1()); 
            }
            // InternalCloneDetectionDSL.g:2992:2: ( rule__ExpressionLevel2__Alternatives_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==12||(LA25_0>=56 && LA25_0<=59)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalCloneDetectionDSL.g:2992:3: rule__ExpressionLevel2__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__ExpressionLevel2__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getAlternatives_1()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__0"
    // InternalCloneDetectionDSL.g:3001:1: rule__ExpressionLevel2__Group_1_0__0 : rule__ExpressionLevel2__Group_1_0__0__Impl rule__ExpressionLevel2__Group_1_0__1 ;
    public final void rule__ExpressionLevel2__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3005:1: ( rule__ExpressionLevel2__Group_1_0__0__Impl rule__ExpressionLevel2__Group_1_0__1 )
            // InternalCloneDetectionDSL.g:3006:2: rule__ExpressionLevel2__Group_1_0__0__Impl rule__ExpressionLevel2__Group_1_0__1
            {
            pushFollow(FOLLOW_26);
            rule__ExpressionLevel2__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__0"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__0__Impl"
    // InternalCloneDetectionDSL.g:3013:1: rule__ExpressionLevel2__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel2__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3017:1: ( ( () ) )
            // InternalCloneDetectionDSL.g:3018:1: ( () )
            {
            // InternalCloneDetectionDSL.g:3018:1: ( () )
            // InternalCloneDetectionDSL.g:3019:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getExpressionMultiplyLeftAction_1_0_0()); 
            }
            // InternalCloneDetectionDSL.g:3020:2: ()
            // InternalCloneDetectionDSL.g:3020:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getExpressionMultiplyLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__1"
    // InternalCloneDetectionDSL.g:3028:1: rule__ExpressionLevel2__Group_1_0__1 : rule__ExpressionLevel2__Group_1_0__1__Impl rule__ExpressionLevel2__Group_1_0__2 ;
    public final void rule__ExpressionLevel2__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3032:1: ( rule__ExpressionLevel2__Group_1_0__1__Impl rule__ExpressionLevel2__Group_1_0__2 )
            // InternalCloneDetectionDSL.g:3033:2: rule__ExpressionLevel2__Group_1_0__1__Impl rule__ExpressionLevel2__Group_1_0__2
            {
            pushFollow(FOLLOW_5);
            rule__ExpressionLevel2__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__1"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__1__Impl"
    // InternalCloneDetectionDSL.g:3040:1: rule__ExpressionLevel2__Group_1_0__1__Impl : ( '*' ) ;
    public final void rule__ExpressionLevel2__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3044:1: ( ( '*' ) )
            // InternalCloneDetectionDSL.g:3045:1: ( '*' )
            {
            // InternalCloneDetectionDSL.g:3045:1: ( '*' )
            // InternalCloneDetectionDSL.g:3046:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getAsteriskKeyword_1_0_1()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getAsteriskKeyword_1_0_1()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__2"
    // InternalCloneDetectionDSL.g:3055:1: rule__ExpressionLevel2__Group_1_0__2 : rule__ExpressionLevel2__Group_1_0__2__Impl ;
    public final void rule__ExpressionLevel2__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3059:1: ( rule__ExpressionLevel2__Group_1_0__2__Impl )
            // InternalCloneDetectionDSL.g:3060:2: rule__ExpressionLevel2__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__2"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__2__Impl"
    // InternalCloneDetectionDSL.g:3066:1: rule__ExpressionLevel2__Group_1_0__2__Impl : ( ( rule__ExpressionLevel2__RightAssignment_1_0_2 ) ) ;
    public final void rule__ExpressionLevel2__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3070:1: ( ( ( rule__ExpressionLevel2__RightAssignment_1_0_2 ) ) )
            // InternalCloneDetectionDSL.g:3071:1: ( ( rule__ExpressionLevel2__RightAssignment_1_0_2 ) )
            {
            // InternalCloneDetectionDSL.g:3071:1: ( ( rule__ExpressionLevel2__RightAssignment_1_0_2 ) )
            // InternalCloneDetectionDSL.g:3072:2: ( rule__ExpressionLevel2__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_0_2()); 
            }
            // InternalCloneDetectionDSL.g:3073:2: ( rule__ExpressionLevel2__RightAssignment_1_0_2 )
            // InternalCloneDetectionDSL.g:3073:3: rule__ExpressionLevel2__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__RightAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_0_2()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__2__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__0"
    // InternalCloneDetectionDSL.g:3082:1: rule__ExpressionLevel2__Group_1_1__0 : rule__ExpressionLevel2__Group_1_1__0__Impl rule__ExpressionLevel2__Group_1_1__1 ;
    public final void rule__ExpressionLevel2__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3086:1: ( rule__ExpressionLevel2__Group_1_1__0__Impl rule__ExpressionLevel2__Group_1_1__1 )
            // InternalCloneDetectionDSL.g:3087:2: rule__ExpressionLevel2__Group_1_1__0__Impl rule__ExpressionLevel2__Group_1_1__1
            {
            pushFollow(FOLLOW_27);
            rule__ExpressionLevel2__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__0"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__0__Impl"
    // InternalCloneDetectionDSL.g:3094:1: rule__ExpressionLevel2__Group_1_1__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel2__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3098:1: ( ( () ) )
            // InternalCloneDetectionDSL.g:3099:1: ( () )
            {
            // InternalCloneDetectionDSL.g:3099:1: ( () )
            // InternalCloneDetectionDSL.g:3100:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getExpressionDivisionLeftAction_1_1_0()); 
            }
            // InternalCloneDetectionDSL.g:3101:2: ()
            // InternalCloneDetectionDSL.g:3101:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getExpressionDivisionLeftAction_1_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__1"
    // InternalCloneDetectionDSL.g:3109:1: rule__ExpressionLevel2__Group_1_1__1 : rule__ExpressionLevel2__Group_1_1__1__Impl rule__ExpressionLevel2__Group_1_1__2 ;
    public final void rule__ExpressionLevel2__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3113:1: ( rule__ExpressionLevel2__Group_1_1__1__Impl rule__ExpressionLevel2__Group_1_1__2 )
            // InternalCloneDetectionDSL.g:3114:2: rule__ExpressionLevel2__Group_1_1__1__Impl rule__ExpressionLevel2__Group_1_1__2
            {
            pushFollow(FOLLOW_5);
            rule__ExpressionLevel2__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__1"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__1__Impl"
    // InternalCloneDetectionDSL.g:3121:1: rule__ExpressionLevel2__Group_1_1__1__Impl : ( '/' ) ;
    public final void rule__ExpressionLevel2__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3125:1: ( ( '/' ) )
            // InternalCloneDetectionDSL.g:3126:1: ( '/' )
            {
            // InternalCloneDetectionDSL.g:3126:1: ( '/' )
            // InternalCloneDetectionDSL.g:3127:2: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getSolidusKeyword_1_1_1()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getSolidusKeyword_1_1_1()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__2"
    // InternalCloneDetectionDSL.g:3136:1: rule__ExpressionLevel2__Group_1_1__2 : rule__ExpressionLevel2__Group_1_1__2__Impl ;
    public final void rule__ExpressionLevel2__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3140:1: ( rule__ExpressionLevel2__Group_1_1__2__Impl )
            // InternalCloneDetectionDSL.g:3141:2: rule__ExpressionLevel2__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__2"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__2__Impl"
    // InternalCloneDetectionDSL.g:3147:1: rule__ExpressionLevel2__Group_1_1__2__Impl : ( ( rule__ExpressionLevel2__RightAssignment_1_1_2 ) ) ;
    public final void rule__ExpressionLevel2__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3151:1: ( ( ( rule__ExpressionLevel2__RightAssignment_1_1_2 ) ) )
            // InternalCloneDetectionDSL.g:3152:1: ( ( rule__ExpressionLevel2__RightAssignment_1_1_2 ) )
            {
            // InternalCloneDetectionDSL.g:3152:1: ( ( rule__ExpressionLevel2__RightAssignment_1_1_2 ) )
            // InternalCloneDetectionDSL.g:3153:2: ( rule__ExpressionLevel2__RightAssignment_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_1_2()); 
            }
            // InternalCloneDetectionDSL.g:3154:2: ( rule__ExpressionLevel2__RightAssignment_1_1_2 )
            // InternalCloneDetectionDSL.g:3154:3: rule__ExpressionLevel2__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__RightAssignment_1_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_1_2()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__2__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_2__0"
    // InternalCloneDetectionDSL.g:3163:1: rule__ExpressionLevel2__Group_1_2__0 : rule__ExpressionLevel2__Group_1_2__0__Impl rule__ExpressionLevel2__Group_1_2__1 ;
    public final void rule__ExpressionLevel2__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3167:1: ( rule__ExpressionLevel2__Group_1_2__0__Impl rule__ExpressionLevel2__Group_1_2__1 )
            // InternalCloneDetectionDSL.g:3168:2: rule__ExpressionLevel2__Group_1_2__0__Impl rule__ExpressionLevel2__Group_1_2__1
            {
            pushFollow(FOLLOW_28);
            rule__ExpressionLevel2__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_2__0"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_2__0__Impl"
    // InternalCloneDetectionDSL.g:3175:1: rule__ExpressionLevel2__Group_1_2__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel2__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3179:1: ( ( () ) )
            // InternalCloneDetectionDSL.g:3180:1: ( () )
            {
            // InternalCloneDetectionDSL.g:3180:1: ( () )
            // InternalCloneDetectionDSL.g:3181:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getExpressionMaximumLeftAction_1_2_0()); 
            }
            // InternalCloneDetectionDSL.g:3182:2: ()
            // InternalCloneDetectionDSL.g:3182:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getExpressionMaximumLeftAction_1_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_2__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_2__1"
    // InternalCloneDetectionDSL.g:3190:1: rule__ExpressionLevel2__Group_1_2__1 : rule__ExpressionLevel2__Group_1_2__1__Impl rule__ExpressionLevel2__Group_1_2__2 ;
    public final void rule__ExpressionLevel2__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3194:1: ( rule__ExpressionLevel2__Group_1_2__1__Impl rule__ExpressionLevel2__Group_1_2__2 )
            // InternalCloneDetectionDSL.g:3195:2: rule__ExpressionLevel2__Group_1_2__1__Impl rule__ExpressionLevel2__Group_1_2__2
            {
            pushFollow(FOLLOW_5);
            rule__ExpressionLevel2__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_2__1"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_2__1__Impl"
    // InternalCloneDetectionDSL.g:3202:1: rule__ExpressionLevel2__Group_1_2__1__Impl : ( 'max' ) ;
    public final void rule__ExpressionLevel2__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3206:1: ( ( 'max' ) )
            // InternalCloneDetectionDSL.g:3207:1: ( 'max' )
            {
            // InternalCloneDetectionDSL.g:3207:1: ( 'max' )
            // InternalCloneDetectionDSL.g:3208:2: 'max'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getMaxKeyword_1_2_1()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getMaxKeyword_1_2_1()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_2__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_2__2"
    // InternalCloneDetectionDSL.g:3217:1: rule__ExpressionLevel2__Group_1_2__2 : rule__ExpressionLevel2__Group_1_2__2__Impl ;
    public final void rule__ExpressionLevel2__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3221:1: ( rule__ExpressionLevel2__Group_1_2__2__Impl )
            // InternalCloneDetectionDSL.g:3222:2: rule__ExpressionLevel2__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_2__2"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_2__2__Impl"
    // InternalCloneDetectionDSL.g:3228:1: rule__ExpressionLevel2__Group_1_2__2__Impl : ( ( rule__ExpressionLevel2__RightAssignment_1_2_2 ) ) ;
    public final void rule__ExpressionLevel2__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3232:1: ( ( ( rule__ExpressionLevel2__RightAssignment_1_2_2 ) ) )
            // InternalCloneDetectionDSL.g:3233:1: ( ( rule__ExpressionLevel2__RightAssignment_1_2_2 ) )
            {
            // InternalCloneDetectionDSL.g:3233:1: ( ( rule__ExpressionLevel2__RightAssignment_1_2_2 ) )
            // InternalCloneDetectionDSL.g:3234:2: ( rule__ExpressionLevel2__RightAssignment_1_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_2_2()); 
            }
            // InternalCloneDetectionDSL.g:3235:2: ( rule__ExpressionLevel2__RightAssignment_1_2_2 )
            // InternalCloneDetectionDSL.g:3235:3: rule__ExpressionLevel2__RightAssignment_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__RightAssignment_1_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_2_2()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_2__2__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_3__0"
    // InternalCloneDetectionDSL.g:3244:1: rule__ExpressionLevel2__Group_1_3__0 : rule__ExpressionLevel2__Group_1_3__0__Impl rule__ExpressionLevel2__Group_1_3__1 ;
    public final void rule__ExpressionLevel2__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3248:1: ( rule__ExpressionLevel2__Group_1_3__0__Impl rule__ExpressionLevel2__Group_1_3__1 )
            // InternalCloneDetectionDSL.g:3249:2: rule__ExpressionLevel2__Group_1_3__0__Impl rule__ExpressionLevel2__Group_1_3__1
            {
            pushFollow(FOLLOW_29);
            rule__ExpressionLevel2__Group_1_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_3__0"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_3__0__Impl"
    // InternalCloneDetectionDSL.g:3256:1: rule__ExpressionLevel2__Group_1_3__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel2__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3260:1: ( ( () ) )
            // InternalCloneDetectionDSL.g:3261:1: ( () )
            {
            // InternalCloneDetectionDSL.g:3261:1: ( () )
            // InternalCloneDetectionDSL.g:3262:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getExpressionMinimumLeftAction_1_3_0()); 
            }
            // InternalCloneDetectionDSL.g:3263:2: ()
            // InternalCloneDetectionDSL.g:3263:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getExpressionMinimumLeftAction_1_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_3__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_3__1"
    // InternalCloneDetectionDSL.g:3271:1: rule__ExpressionLevel2__Group_1_3__1 : rule__ExpressionLevel2__Group_1_3__1__Impl rule__ExpressionLevel2__Group_1_3__2 ;
    public final void rule__ExpressionLevel2__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3275:1: ( rule__ExpressionLevel2__Group_1_3__1__Impl rule__ExpressionLevel2__Group_1_3__2 )
            // InternalCloneDetectionDSL.g:3276:2: rule__ExpressionLevel2__Group_1_3__1__Impl rule__ExpressionLevel2__Group_1_3__2
            {
            pushFollow(FOLLOW_5);
            rule__ExpressionLevel2__Group_1_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_3__1"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_3__1__Impl"
    // InternalCloneDetectionDSL.g:3283:1: rule__ExpressionLevel2__Group_1_3__1__Impl : ( 'min' ) ;
    public final void rule__ExpressionLevel2__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3287:1: ( ( 'min' ) )
            // InternalCloneDetectionDSL.g:3288:1: ( 'min' )
            {
            // InternalCloneDetectionDSL.g:3288:1: ( 'min' )
            // InternalCloneDetectionDSL.g:3289:2: 'min'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getMinKeyword_1_3_1()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getMinKeyword_1_3_1()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_3__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_3__2"
    // InternalCloneDetectionDSL.g:3298:1: rule__ExpressionLevel2__Group_1_3__2 : rule__ExpressionLevel2__Group_1_3__2__Impl ;
    public final void rule__ExpressionLevel2__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3302:1: ( rule__ExpressionLevel2__Group_1_3__2__Impl )
            // InternalCloneDetectionDSL.g:3303:2: rule__ExpressionLevel2__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_3__2"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_3__2__Impl"
    // InternalCloneDetectionDSL.g:3309:1: rule__ExpressionLevel2__Group_1_3__2__Impl : ( ( rule__ExpressionLevel2__RightAssignment_1_3_2 ) ) ;
    public final void rule__ExpressionLevel2__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3313:1: ( ( ( rule__ExpressionLevel2__RightAssignment_1_3_2 ) ) )
            // InternalCloneDetectionDSL.g:3314:1: ( ( rule__ExpressionLevel2__RightAssignment_1_3_2 ) )
            {
            // InternalCloneDetectionDSL.g:3314:1: ( ( rule__ExpressionLevel2__RightAssignment_1_3_2 ) )
            // InternalCloneDetectionDSL.g:3315:2: ( rule__ExpressionLevel2__RightAssignment_1_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_3_2()); 
            }
            // InternalCloneDetectionDSL.g:3316:2: ( rule__ExpressionLevel2__RightAssignment_1_3_2 )
            // InternalCloneDetectionDSL.g:3316:3: rule__ExpressionLevel2__RightAssignment_1_3_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__RightAssignment_1_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_3_2()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_3__2__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_4__0"
    // InternalCloneDetectionDSL.g:3325:1: rule__ExpressionLevel2__Group_1_4__0 : rule__ExpressionLevel2__Group_1_4__0__Impl rule__ExpressionLevel2__Group_1_4__1 ;
    public final void rule__ExpressionLevel2__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3329:1: ( rule__ExpressionLevel2__Group_1_4__0__Impl rule__ExpressionLevel2__Group_1_4__1 )
            // InternalCloneDetectionDSL.g:3330:2: rule__ExpressionLevel2__Group_1_4__0__Impl rule__ExpressionLevel2__Group_1_4__1
            {
            pushFollow(FOLLOW_24);
            rule__ExpressionLevel2__Group_1_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_4__0"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_4__0__Impl"
    // InternalCloneDetectionDSL.g:3337:1: rule__ExpressionLevel2__Group_1_4__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel2__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3341:1: ( ( () ) )
            // InternalCloneDetectionDSL.g:3342:1: ( () )
            {
            // InternalCloneDetectionDSL.g:3342:1: ( () )
            // InternalCloneDetectionDSL.g:3343:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getExpressionModuloLeftAction_1_4_0()); 
            }
            // InternalCloneDetectionDSL.g:3344:2: ()
            // InternalCloneDetectionDSL.g:3344:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getExpressionModuloLeftAction_1_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_4__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_4__1"
    // InternalCloneDetectionDSL.g:3352:1: rule__ExpressionLevel2__Group_1_4__1 : rule__ExpressionLevel2__Group_1_4__1__Impl rule__ExpressionLevel2__Group_1_4__2 ;
    public final void rule__ExpressionLevel2__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3356:1: ( rule__ExpressionLevel2__Group_1_4__1__Impl rule__ExpressionLevel2__Group_1_4__2 )
            // InternalCloneDetectionDSL.g:3357:2: rule__ExpressionLevel2__Group_1_4__1__Impl rule__ExpressionLevel2__Group_1_4__2
            {
            pushFollow(FOLLOW_5);
            rule__ExpressionLevel2__Group_1_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_4__1"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_4__1__Impl"
    // InternalCloneDetectionDSL.g:3364:1: rule__ExpressionLevel2__Group_1_4__1__Impl : ( 'mod' ) ;
    public final void rule__ExpressionLevel2__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3368:1: ( ( 'mod' ) )
            // InternalCloneDetectionDSL.g:3369:1: ( 'mod' )
            {
            // InternalCloneDetectionDSL.g:3369:1: ( 'mod' )
            // InternalCloneDetectionDSL.g:3370:2: 'mod'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getModKeyword_1_4_1()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getModKeyword_1_4_1()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_4__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_4__2"
    // InternalCloneDetectionDSL.g:3379:1: rule__ExpressionLevel2__Group_1_4__2 : rule__ExpressionLevel2__Group_1_4__2__Impl ;
    public final void rule__ExpressionLevel2__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3383:1: ( rule__ExpressionLevel2__Group_1_4__2__Impl )
            // InternalCloneDetectionDSL.g:3384:2: rule__ExpressionLevel2__Group_1_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_4__2"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_4__2__Impl"
    // InternalCloneDetectionDSL.g:3390:1: rule__ExpressionLevel2__Group_1_4__2__Impl : ( ( rule__ExpressionLevel2__RightAssignment_1_4_2 ) ) ;
    public final void rule__ExpressionLevel2__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3394:1: ( ( ( rule__ExpressionLevel2__RightAssignment_1_4_2 ) ) )
            // InternalCloneDetectionDSL.g:3395:1: ( ( rule__ExpressionLevel2__RightAssignment_1_4_2 ) )
            {
            // InternalCloneDetectionDSL.g:3395:1: ( ( rule__ExpressionLevel2__RightAssignment_1_4_2 ) )
            // InternalCloneDetectionDSL.g:3396:2: ( rule__ExpressionLevel2__RightAssignment_1_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_4_2()); 
            }
            // InternalCloneDetectionDSL.g:3397:2: ( rule__ExpressionLevel2__RightAssignment_1_4_2 )
            // InternalCloneDetectionDSL.g:3397:3: rule__ExpressionLevel2__RightAssignment_1_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__RightAssignment_1_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_4_2()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_4__2__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group__0"
    // InternalCloneDetectionDSL.g:3406:1: rule__ExpressionLevel3__Group__0 : rule__ExpressionLevel3__Group__0__Impl rule__ExpressionLevel3__Group__1 ;
    public final void rule__ExpressionLevel3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3410:1: ( rule__ExpressionLevel3__Group__0__Impl rule__ExpressionLevel3__Group__1 )
            // InternalCloneDetectionDSL.g:3411:2: rule__ExpressionLevel3__Group__0__Impl rule__ExpressionLevel3__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__ExpressionLevel3__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group__0"


    // $ANTLR start "rule__ExpressionLevel3__Group__0__Impl"
    // InternalCloneDetectionDSL.g:3418:1: rule__ExpressionLevel3__Group__0__Impl : ( ruleExpressionLevel4 ) ;
    public final void rule__ExpressionLevel3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3422:1: ( ( ruleExpressionLevel4 ) )
            // InternalCloneDetectionDSL.g:3423:1: ( ruleExpressionLevel4 )
            {
            // InternalCloneDetectionDSL.g:3423:1: ( ruleExpressionLevel4 )
            // InternalCloneDetectionDSL.g:3424:2: ruleExpressionLevel4
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getExpressionLevel4ParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel4();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getExpressionLevel4ParserRuleCall_0()); 
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
    // $ANTLR end "rule__ExpressionLevel3__Group__0__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group__1"
    // InternalCloneDetectionDSL.g:3433:1: rule__ExpressionLevel3__Group__1 : rule__ExpressionLevel3__Group__1__Impl ;
    public final void rule__ExpressionLevel3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3437:1: ( rule__ExpressionLevel3__Group__1__Impl )
            // InternalCloneDetectionDSL.g:3438:2: rule__ExpressionLevel3__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group__1"


    // $ANTLR start "rule__ExpressionLevel3__Group__1__Impl"
    // InternalCloneDetectionDSL.g:3444:1: rule__ExpressionLevel3__Group__1__Impl : ( ( rule__ExpressionLevel3__Group_1__0 )? ) ;
    public final void rule__ExpressionLevel3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3448:1: ( ( ( rule__ExpressionLevel3__Group_1__0 )? ) )
            // InternalCloneDetectionDSL.g:3449:1: ( ( rule__ExpressionLevel3__Group_1__0 )? )
            {
            // InternalCloneDetectionDSL.g:3449:1: ( ( rule__ExpressionLevel3__Group_1__0 )? )
            // InternalCloneDetectionDSL.g:3450:2: ( rule__ExpressionLevel3__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getGroup_1()); 
            }
            // InternalCloneDetectionDSL.g:3451:2: ( rule__ExpressionLevel3__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==60) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCloneDetectionDSL.g:3451:3: rule__ExpressionLevel3__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel3__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getGroup_1()); 
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
    // $ANTLR end "rule__ExpressionLevel3__Group__1__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group_1__0"
    // InternalCloneDetectionDSL.g:3460:1: rule__ExpressionLevel3__Group_1__0 : rule__ExpressionLevel3__Group_1__0__Impl rule__ExpressionLevel3__Group_1__1 ;
    public final void rule__ExpressionLevel3__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3464:1: ( rule__ExpressionLevel3__Group_1__0__Impl rule__ExpressionLevel3__Group_1__1 )
            // InternalCloneDetectionDSL.g:3465:2: rule__ExpressionLevel3__Group_1__0__Impl rule__ExpressionLevel3__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__ExpressionLevel3__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1__0"


    // $ANTLR start "rule__ExpressionLevel3__Group_1__0__Impl"
    // InternalCloneDetectionDSL.g:3472:1: rule__ExpressionLevel3__Group_1__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel3__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3476:1: ( ( () ) )
            // InternalCloneDetectionDSL.g:3477:1: ( () )
            {
            // InternalCloneDetectionDSL.g:3477:1: ( () )
            // InternalCloneDetectionDSL.g:3478:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getExpressionPowerLeftAction_1_0()); 
            }
            // InternalCloneDetectionDSL.g:3479:2: ()
            // InternalCloneDetectionDSL.g:3479:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getExpressionPowerLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1__0__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group_1__1"
    // InternalCloneDetectionDSL.g:3487:1: rule__ExpressionLevel3__Group_1__1 : rule__ExpressionLevel3__Group_1__1__Impl rule__ExpressionLevel3__Group_1__2 ;
    public final void rule__ExpressionLevel3__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3491:1: ( rule__ExpressionLevel3__Group_1__1__Impl rule__ExpressionLevel3__Group_1__2 )
            // InternalCloneDetectionDSL.g:3492:2: rule__ExpressionLevel3__Group_1__1__Impl rule__ExpressionLevel3__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__ExpressionLevel3__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1__1"


    // $ANTLR start "rule__ExpressionLevel3__Group_1__1__Impl"
    // InternalCloneDetectionDSL.g:3499:1: rule__ExpressionLevel3__Group_1__1__Impl : ( '^' ) ;
    public final void rule__ExpressionLevel3__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3503:1: ( ( '^' ) )
            // InternalCloneDetectionDSL.g:3504:1: ( '^' )
            {
            // InternalCloneDetectionDSL.g:3504:1: ( '^' )
            // InternalCloneDetectionDSL.g:3505:2: '^'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getCircumflexAccentKeyword_1_1()); 
            }
            match(input,60,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getCircumflexAccentKeyword_1_1()); 
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
    // $ANTLR end "rule__ExpressionLevel3__Group_1__1__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group_1__2"
    // InternalCloneDetectionDSL.g:3514:1: rule__ExpressionLevel3__Group_1__2 : rule__ExpressionLevel3__Group_1__2__Impl ;
    public final void rule__ExpressionLevel3__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3518:1: ( rule__ExpressionLevel3__Group_1__2__Impl )
            // InternalCloneDetectionDSL.g:3519:2: rule__ExpressionLevel3__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1__2"


    // $ANTLR start "rule__ExpressionLevel3__Group_1__2__Impl"
    // InternalCloneDetectionDSL.g:3525:1: rule__ExpressionLevel3__Group_1__2__Impl : ( ( rule__ExpressionLevel3__RightAssignment_1_2 ) ) ;
    public final void rule__ExpressionLevel3__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3529:1: ( ( ( rule__ExpressionLevel3__RightAssignment_1_2 ) ) )
            // InternalCloneDetectionDSL.g:3530:1: ( ( rule__ExpressionLevel3__RightAssignment_1_2 ) )
            {
            // InternalCloneDetectionDSL.g:3530:1: ( ( rule__ExpressionLevel3__RightAssignment_1_2 ) )
            // InternalCloneDetectionDSL.g:3531:2: ( rule__ExpressionLevel3__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getRightAssignment_1_2()); 
            }
            // InternalCloneDetectionDSL.g:3532:2: ( rule__ExpressionLevel3__RightAssignment_1_2 )
            // InternalCloneDetectionDSL.g:3532:3: rule__ExpressionLevel3__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__ExpressionLevel3__Group_1__2__Impl"


    // $ANTLR start "rule__ExpressionMinus__Group__0"
    // InternalCloneDetectionDSL.g:3541:1: rule__ExpressionMinus__Group__0 : rule__ExpressionMinus__Group__0__Impl rule__ExpressionMinus__Group__1 ;
    public final void rule__ExpressionMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3545:1: ( rule__ExpressionMinus__Group__0__Impl rule__ExpressionMinus__Group__1 )
            // InternalCloneDetectionDSL.g:3546:2: rule__ExpressionMinus__Group__0__Impl rule__ExpressionMinus__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ExpressionMinus__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionMinus__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionMinus__Group__0"


    // $ANTLR start "rule__ExpressionMinus__Group__0__Impl"
    // InternalCloneDetectionDSL.g:3553:1: rule__ExpressionMinus__Group__0__Impl : ( '-' ) ;
    public final void rule__ExpressionMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3557:1: ( ( '-' ) )
            // InternalCloneDetectionDSL.g:3558:1: ( '-' )
            {
            // InternalCloneDetectionDSL.g:3558:1: ( '-' )
            // InternalCloneDetectionDSL.g:3559:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionMinusAccess().getHyphenMinusKeyword_0()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionMinusAccess().getHyphenMinusKeyword_0()); 
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
    // $ANTLR end "rule__ExpressionMinus__Group__0__Impl"


    // $ANTLR start "rule__ExpressionMinus__Group__1"
    // InternalCloneDetectionDSL.g:3568:1: rule__ExpressionMinus__Group__1 : rule__ExpressionMinus__Group__1__Impl ;
    public final void rule__ExpressionMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3572:1: ( rule__ExpressionMinus__Group__1__Impl )
            // InternalCloneDetectionDSL.g:3573:2: rule__ExpressionMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionMinus__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionMinus__Group__1"


    // $ANTLR start "rule__ExpressionMinus__Group__1__Impl"
    // InternalCloneDetectionDSL.g:3579:1: rule__ExpressionMinus__Group__1__Impl : ( ( rule__ExpressionMinus__SubAssignment_1 ) ) ;
    public final void rule__ExpressionMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3583:1: ( ( ( rule__ExpressionMinus__SubAssignment_1 ) ) )
            // InternalCloneDetectionDSL.g:3584:1: ( ( rule__ExpressionMinus__SubAssignment_1 ) )
            {
            // InternalCloneDetectionDSL.g:3584:1: ( ( rule__ExpressionMinus__SubAssignment_1 ) )
            // InternalCloneDetectionDSL.g:3585:2: ( rule__ExpressionMinus__SubAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionMinusAccess().getSubAssignment_1()); 
            }
            // InternalCloneDetectionDSL.g:3586:2: ( rule__ExpressionMinus__SubAssignment_1 )
            // InternalCloneDetectionDSL.g:3586:3: rule__ExpressionMinus__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionMinus__SubAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionMinusAccess().getSubAssignment_1()); 
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
    // $ANTLR end "rule__ExpressionMinus__Group__1__Impl"


    // $ANTLR start "rule__ExpressionPlus__Group__0"
    // InternalCloneDetectionDSL.g:3595:1: rule__ExpressionPlus__Group__0 : rule__ExpressionPlus__Group__0__Impl rule__ExpressionPlus__Group__1 ;
    public final void rule__ExpressionPlus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3599:1: ( rule__ExpressionPlus__Group__0__Impl rule__ExpressionPlus__Group__1 )
            // InternalCloneDetectionDSL.g:3600:2: rule__ExpressionPlus__Group__0__Impl rule__ExpressionPlus__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ExpressionPlus__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionPlus__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionPlus__Group__0"


    // $ANTLR start "rule__ExpressionPlus__Group__0__Impl"
    // InternalCloneDetectionDSL.g:3607:1: rule__ExpressionPlus__Group__0__Impl : ( '+' ) ;
    public final void rule__ExpressionPlus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3611:1: ( ( '+' ) )
            // InternalCloneDetectionDSL.g:3612:1: ( '+' )
            {
            // InternalCloneDetectionDSL.g:3612:1: ( '+' )
            // InternalCloneDetectionDSL.g:3613:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionPlusAccess().getPlusSignKeyword_0()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionPlusAccess().getPlusSignKeyword_0()); 
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
    // $ANTLR end "rule__ExpressionPlus__Group__0__Impl"


    // $ANTLR start "rule__ExpressionPlus__Group__1"
    // InternalCloneDetectionDSL.g:3622:1: rule__ExpressionPlus__Group__1 : rule__ExpressionPlus__Group__1__Impl ;
    public final void rule__ExpressionPlus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3626:1: ( rule__ExpressionPlus__Group__1__Impl )
            // InternalCloneDetectionDSL.g:3627:2: rule__ExpressionPlus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionPlus__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionPlus__Group__1"


    // $ANTLR start "rule__ExpressionPlus__Group__1__Impl"
    // InternalCloneDetectionDSL.g:3633:1: rule__ExpressionPlus__Group__1__Impl : ( ( rule__ExpressionPlus__SubAssignment_1 ) ) ;
    public final void rule__ExpressionPlus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3637:1: ( ( ( rule__ExpressionPlus__SubAssignment_1 ) ) )
            // InternalCloneDetectionDSL.g:3638:1: ( ( rule__ExpressionPlus__SubAssignment_1 ) )
            {
            // InternalCloneDetectionDSL.g:3638:1: ( ( rule__ExpressionPlus__SubAssignment_1 ) )
            // InternalCloneDetectionDSL.g:3639:2: ( rule__ExpressionPlus__SubAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionPlusAccess().getSubAssignment_1()); 
            }
            // InternalCloneDetectionDSL.g:3640:2: ( rule__ExpressionPlus__SubAssignment_1 )
            // InternalCloneDetectionDSL.g:3640:3: rule__ExpressionPlus__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionPlus__SubAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionPlusAccess().getSubAssignment_1()); 
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
    // $ANTLR end "rule__ExpressionPlus__Group__1__Impl"


    // $ANTLR start "rule__ExpressionBracket__Group__0"
    // InternalCloneDetectionDSL.g:3649:1: rule__ExpressionBracket__Group__0 : rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1 ;
    public final void rule__ExpressionBracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3653:1: ( rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1 )
            // InternalCloneDetectionDSL.g:3654:2: rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ExpressionBracket__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__0"


    // $ANTLR start "rule__ExpressionBracket__Group__0__Impl"
    // InternalCloneDetectionDSL.g:3661:1: rule__ExpressionBracket__Group__0__Impl : ( '(' ) ;
    public final void rule__ExpressionBracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3665:1: ( ( '(' ) )
            // InternalCloneDetectionDSL.g:3666:1: ( '(' )
            {
            // InternalCloneDetectionDSL.g:3666:1: ( '(' )
            // InternalCloneDetectionDSL.g:3667:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0()); 
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
    // $ANTLR end "rule__ExpressionBracket__Group__0__Impl"


    // $ANTLR start "rule__ExpressionBracket__Group__1"
    // InternalCloneDetectionDSL.g:3676:1: rule__ExpressionBracket__Group__1 : rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2 ;
    public final void rule__ExpressionBracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3680:1: ( rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2 )
            // InternalCloneDetectionDSL.g:3681:2: rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ExpressionBracket__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__1"


    // $ANTLR start "rule__ExpressionBracket__Group__1__Impl"
    // InternalCloneDetectionDSL.g:3688:1: rule__ExpressionBracket__Group__1__Impl : ( ( rule__ExpressionBracket__SubAssignment_1 ) ) ;
    public final void rule__ExpressionBracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3692:1: ( ( ( rule__ExpressionBracket__SubAssignment_1 ) ) )
            // InternalCloneDetectionDSL.g:3693:1: ( ( rule__ExpressionBracket__SubAssignment_1 ) )
            {
            // InternalCloneDetectionDSL.g:3693:1: ( ( rule__ExpressionBracket__SubAssignment_1 ) )
            // InternalCloneDetectionDSL.g:3694:2: ( rule__ExpressionBracket__SubAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBracketAccess().getSubAssignment_1()); 
            }
            // InternalCloneDetectionDSL.g:3695:2: ( rule__ExpressionBracket__SubAssignment_1 )
            // InternalCloneDetectionDSL.g:3695:3: rule__ExpressionBracket__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__SubAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBracketAccess().getSubAssignment_1()); 
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
    // $ANTLR end "rule__ExpressionBracket__Group__1__Impl"


    // $ANTLR start "rule__ExpressionBracket__Group__2"
    // InternalCloneDetectionDSL.g:3703:1: rule__ExpressionBracket__Group__2 : rule__ExpressionBracket__Group__2__Impl ;
    public final void rule__ExpressionBracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3707:1: ( rule__ExpressionBracket__Group__2__Impl )
            // InternalCloneDetectionDSL.g:3708:2: rule__ExpressionBracket__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__2"


    // $ANTLR start "rule__ExpressionBracket__Group__2__Impl"
    // InternalCloneDetectionDSL.g:3714:1: rule__ExpressionBracket__Group__2__Impl : ( ')' ) ;
    public final void rule__ExpressionBracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3718:1: ( ( ')' ) )
            // InternalCloneDetectionDSL.g:3719:1: ( ')' )
            {
            // InternalCloneDetectionDSL.g:3719:1: ( ')' )
            // InternalCloneDetectionDSL.g:3720:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBracketAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBracketAccess().getRightParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__ExpressionBracket__Group__2__Impl"


    // $ANTLR start "rule__CloneDetection__UnorderedGroup"
    // InternalCloneDetectionDSL.g:3730:1: rule__CloneDetection__UnorderedGroup : rule__CloneDetection__UnorderedGroup__0 {...}?;
    public final void rule__CloneDetection__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getCloneDetectionAccess().getUnorderedGroup());
        	
        try {
            // InternalCloneDetectionDSL.g:3735:1: ( rule__CloneDetection__UnorderedGroup__0 {...}?)
            // InternalCloneDetectionDSL.g:3736:2: rule__CloneDetection__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__CloneDetection__UnorderedGroup__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getCloneDetectionAccess().getUnorderedGroup()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__CloneDetection__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getCloneDetectionAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getCloneDetectionAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloneDetection__UnorderedGroup"


    // $ANTLR start "rule__CloneDetection__UnorderedGroup__Impl"
    // InternalCloneDetectionDSL.g:3744:1: rule__CloneDetection__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__RootAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* ) ) ) ) ) ;
    public final void rule__CloneDetection__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalCloneDetectionDSL.g:3749:1: ( ( ({...}? => ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__RootAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* ) ) ) ) ) )
            // InternalCloneDetectionDSL.g:3750:3: ( ({...}? => ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__RootAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* ) ) ) ) )
            {
            // InternalCloneDetectionDSL.g:3750:3: ( ({...}? => ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__RootAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* ) ) ) ) )
            int alt29=7;
            int LA29_0 = input.LA(1);

            if ( LA29_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0) ) {
                alt29=1;
            }
            else if ( LA29_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1) ) {
                alt29=2;
            }
            else if ( LA29_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2) ) {
                alt29=3;
            }
            else if ( LA29_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3) ) {
                alt29=4;
            }
            else if ( LA29_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4) ) {
                alt29=5;
            }
            else if ( LA29_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5) ) {
                alt29=6;
            }
            else if ( LA29_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6) ) {
                alt29=7;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalCloneDetectionDSL.g:3751:3: ({...}? => ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) ) )
                    {
                    // InternalCloneDetectionDSL.g:3751:3: ({...}? => ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) ) )
                    // InternalCloneDetectionDSL.g:3752:4: {...}? => ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__CloneDetection__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalCloneDetectionDSL.g:3752:108: ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) )
                    // InternalCloneDetectionDSL.g:3753:5: ( ( rule__CloneDetection__ProjectAssignment_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0);
                    selected = true;
                    // InternalCloneDetectionDSL.g:3759:5: ( ( rule__CloneDetection__ProjectAssignment_0 ) )
                    // InternalCloneDetectionDSL.g:3760:6: ( rule__CloneDetection__ProjectAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getProjectAssignment_0()); 
                    }
                    // InternalCloneDetectionDSL.g:3761:6: ( rule__CloneDetection__ProjectAssignment_0 )
                    // InternalCloneDetectionDSL.g:3761:7: rule__CloneDetection__ProjectAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CloneDetection__ProjectAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCloneDetectionAccess().getProjectAssignment_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:3766:3: ({...}? => ( ( ( rule__CloneDetection__RootAssignment_1 ) ) ) )
                    {
                    // InternalCloneDetectionDSL.g:3766:3: ({...}? => ( ( ( rule__CloneDetection__RootAssignment_1 ) ) ) )
                    // InternalCloneDetectionDSL.g:3767:4: {...}? => ( ( ( rule__CloneDetection__RootAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__CloneDetection__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalCloneDetectionDSL.g:3767:108: ( ( ( rule__CloneDetection__RootAssignment_1 ) ) )
                    // InternalCloneDetectionDSL.g:3768:5: ( ( rule__CloneDetection__RootAssignment_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1);
                    selected = true;
                    // InternalCloneDetectionDSL.g:3774:5: ( ( rule__CloneDetection__RootAssignment_1 ) )
                    // InternalCloneDetectionDSL.g:3775:6: ( rule__CloneDetection__RootAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getRootAssignment_1()); 
                    }
                    // InternalCloneDetectionDSL.g:3776:6: ( rule__CloneDetection__RootAssignment_1 )
                    // InternalCloneDetectionDSL.g:3776:7: rule__CloneDetection__RootAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CloneDetection__RootAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCloneDetectionAccess().getRootAssignment_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCloneDetectionDSL.g:3781:3: ({...}? => ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) ) )
                    {
                    // InternalCloneDetectionDSL.g:3781:3: ({...}? => ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) ) )
                    // InternalCloneDetectionDSL.g:3782:4: {...}? => ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__CloneDetection__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalCloneDetectionDSL.g:3782:108: ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) )
                    // InternalCloneDetectionDSL.g:3783:5: ( ( rule__CloneDetection__MatchAssignment_2 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2);
                    selected = true;
                    // InternalCloneDetectionDSL.g:3789:5: ( ( rule__CloneDetection__MatchAssignment_2 ) )
                    // InternalCloneDetectionDSL.g:3790:6: ( rule__CloneDetection__MatchAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getMatchAssignment_2()); 
                    }
                    // InternalCloneDetectionDSL.g:3791:6: ( rule__CloneDetection__MatchAssignment_2 )
                    // InternalCloneDetectionDSL.g:3791:7: rule__CloneDetection__MatchAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__CloneDetection__MatchAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCloneDetectionAccess().getMatchAssignment_2()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalCloneDetectionDSL.g:3796:3: ({...}? => ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) ) )
                    {
                    // InternalCloneDetectionDSL.g:3796:3: ({...}? => ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) ) )
                    // InternalCloneDetectionDSL.g:3797:4: {...}? => ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__CloneDetection__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3)");
                    }
                    // InternalCloneDetectionDSL.g:3797:108: ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) )
                    // InternalCloneDetectionDSL.g:3798:5: ( ( rule__CloneDetection__ExcludeAssignment_3 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3);
                    selected = true;
                    // InternalCloneDetectionDSL.g:3804:5: ( ( rule__CloneDetection__ExcludeAssignment_3 ) )
                    // InternalCloneDetectionDSL.g:3805:6: ( rule__CloneDetection__ExcludeAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getExcludeAssignment_3()); 
                    }
                    // InternalCloneDetectionDSL.g:3806:6: ( rule__CloneDetection__ExcludeAssignment_3 )
                    // InternalCloneDetectionDSL.g:3806:7: rule__CloneDetection__ExcludeAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__CloneDetection__ExcludeAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCloneDetectionAccess().getExcludeAssignment_3()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalCloneDetectionDSL.g:3811:3: ({...}? => ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) ) )
                    {
                    // InternalCloneDetectionDSL.g:3811:3: ({...}? => ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) ) )
                    // InternalCloneDetectionDSL.g:3812:4: {...}? => ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__CloneDetection__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4)");
                    }
                    // InternalCloneDetectionDSL.g:3812:108: ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) )
                    // InternalCloneDetectionDSL.g:3813:5: ( ( rule__CloneDetection__SizeAssignment_4 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4);
                    selected = true;
                    // InternalCloneDetectionDSL.g:3819:5: ( ( rule__CloneDetection__SizeAssignment_4 ) )
                    // InternalCloneDetectionDSL.g:3820:6: ( rule__CloneDetection__SizeAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getSizeAssignment_4()); 
                    }
                    // InternalCloneDetectionDSL.g:3821:6: ( rule__CloneDetection__SizeAssignment_4 )
                    // InternalCloneDetectionDSL.g:3821:7: rule__CloneDetection__SizeAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__CloneDetection__SizeAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCloneDetectionAccess().getSizeAssignment_4()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalCloneDetectionDSL.g:3826:3: ({...}? => ( ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) ) ) )
                    {
                    // InternalCloneDetectionDSL.g:3826:3: ({...}? => ( ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) ) ) )
                    // InternalCloneDetectionDSL.g:3827:4: {...}? => ( ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__CloneDetection__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5)");
                    }
                    // InternalCloneDetectionDSL.g:3827:108: ( ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) ) )
                    // InternalCloneDetectionDSL.g:3828:5: ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5);
                    selected = true;
                    // InternalCloneDetectionDSL.g:3834:5: ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) )
                    // InternalCloneDetectionDSL.g:3835:6: ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* )
                    {
                    // InternalCloneDetectionDSL.g:3835:6: ( ( rule__CloneDetection__NotCompareAssignment_5 ) )
                    // InternalCloneDetectionDSL.g:3836:7: ( rule__CloneDetection__NotCompareAssignment_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getNotCompareAssignment_5()); 
                    }
                    // InternalCloneDetectionDSL.g:3837:7: ( rule__CloneDetection__NotCompareAssignment_5 )
                    // InternalCloneDetectionDSL.g:3837:8: rule__CloneDetection__NotCompareAssignment_5
                    {
                    pushFollow(FOLLOW_31);
                    rule__CloneDetection__NotCompareAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCloneDetectionAccess().getNotCompareAssignment_5()); 
                    }

                    }

                    // InternalCloneDetectionDSL.g:3840:6: ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* )
                    // InternalCloneDetectionDSL.g:3841:7: ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getNotCompareAssignment_5()); 
                    }
                    // InternalCloneDetectionDSL.g:3842:7: ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==50) ) {
                            int LA27_2 = input.LA(2);

                            if ( (LA27_2==RULE_ID) ) {
                                int LA27_3 = input.LA(3);

                                if ( (synpred51_InternalCloneDetectionDSL()) ) {
                                    alt27=1;
                                }


                            }
                            else if ( (LA27_2==12) ) {
                                int LA27_4 = input.LA(3);

                                if ( (synpred51_InternalCloneDetectionDSL()) ) {
                                    alt27=1;
                                }


                            }


                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalCloneDetectionDSL.g:3842:8: ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5
                    	    {
                    	    pushFollow(FOLLOW_31);
                    	    rule__CloneDetection__NotCompareAssignment_5();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCloneDetectionAccess().getNotCompareAssignment_5()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalCloneDetectionDSL.g:3848:3: ({...}? => ( ( ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* ) ) ) )
                    {
                    // InternalCloneDetectionDSL.g:3848:3: ({...}? => ( ( ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* ) ) ) )
                    // InternalCloneDetectionDSL.g:3849:4: {...}? => ( ( ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__CloneDetection__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6)");
                    }
                    // InternalCloneDetectionDSL.g:3849:108: ( ( ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* ) ) )
                    // InternalCloneDetectionDSL.g:3850:5: ( ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6);
                    selected = true;
                    // InternalCloneDetectionDSL.g:3856:5: ( ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* ) )
                    // InternalCloneDetectionDSL.g:3857:6: ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* )
                    {
                    // InternalCloneDetectionDSL.g:3857:6: ( ( rule__CloneDetection__CompareAssignment_6 ) )
                    // InternalCloneDetectionDSL.g:3858:7: ( rule__CloneDetection__CompareAssignment_6 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getCompareAssignment_6()); 
                    }
                    // InternalCloneDetectionDSL.g:3859:7: ( rule__CloneDetection__CompareAssignment_6 )
                    // InternalCloneDetectionDSL.g:3859:8: rule__CloneDetection__CompareAssignment_6
                    {
                    pushFollow(FOLLOW_32);
                    rule__CloneDetection__CompareAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCloneDetectionAccess().getCompareAssignment_6()); 
                    }

                    }

                    // InternalCloneDetectionDSL.g:3862:6: ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* )
                    // InternalCloneDetectionDSL.g:3863:7: ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getCompareAssignment_6()); 
                    }
                    // InternalCloneDetectionDSL.g:3864:7: ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )*
                    loop28:
                    do {
                        int alt28=2;
                        alt28 = dfa28.predict(input);
                        switch (alt28) {
                    	case 1 :
                    	    // InternalCloneDetectionDSL.g:3864:8: ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6
                    	    {
                    	    pushFollow(FOLLOW_32);
                    	    rule__CloneDetection__CompareAssignment_6();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCloneDetectionAccess().getCompareAssignment_6()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCloneDetectionAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloneDetection__UnorderedGroup__Impl"


    // $ANTLR start "rule__CloneDetection__UnorderedGroup__0"
    // InternalCloneDetectionDSL.g:3878:1: rule__CloneDetection__UnorderedGroup__0 : rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__1 )? ;
    public final void rule__CloneDetection__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3882:1: ( rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__1 )? )
            // InternalCloneDetectionDSL.g:3883:2: rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_33);
            rule__CloneDetection__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalCloneDetectionDSL.g:3884:2: ( rule__CloneDetection__UnorderedGroup__1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( LA30_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0) ) {
                alt30=1;
            }
            else if ( LA30_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1) ) {
                alt30=1;
            }
            else if ( LA30_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2) ) {
                alt30=1;
            }
            else if ( LA30_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3) ) {
                alt30=1;
            }
            else if ( LA30_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4) ) {
                alt30=1;
            }
            else if ( LA30_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5) ) {
                alt30=1;
            }
            else if ( LA30_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCloneDetectionDSL.g:0:0: rule__CloneDetection__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CloneDetection__UnorderedGroup__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloneDetection__UnorderedGroup__0"


    // $ANTLR start "rule__CloneDetection__UnorderedGroup__1"
    // InternalCloneDetectionDSL.g:3890:1: rule__CloneDetection__UnorderedGroup__1 : rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__2 )? ;
    public final void rule__CloneDetection__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3894:1: ( rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__2 )? )
            // InternalCloneDetectionDSL.g:3895:2: rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_33);
            rule__CloneDetection__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalCloneDetectionDSL.g:3896:2: ( rule__CloneDetection__UnorderedGroup__2 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( LA31_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0) ) {
                alt31=1;
            }
            else if ( LA31_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1) ) {
                alt31=1;
            }
            else if ( LA31_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2) ) {
                alt31=1;
            }
            else if ( LA31_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3) ) {
                alt31=1;
            }
            else if ( LA31_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4) ) {
                alt31=1;
            }
            else if ( LA31_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5) ) {
                alt31=1;
            }
            else if ( LA31_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCloneDetectionDSL.g:0:0: rule__CloneDetection__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__CloneDetection__UnorderedGroup__2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloneDetection__UnorderedGroup__1"


    // $ANTLR start "rule__CloneDetection__UnorderedGroup__2"
    // InternalCloneDetectionDSL.g:3902:1: rule__CloneDetection__UnorderedGroup__2 : rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__3 )? ;
    public final void rule__CloneDetection__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3906:1: ( rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__3 )? )
            // InternalCloneDetectionDSL.g:3907:2: rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__3 )?
            {
            pushFollow(FOLLOW_33);
            rule__CloneDetection__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalCloneDetectionDSL.g:3908:2: ( rule__CloneDetection__UnorderedGroup__3 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( LA32_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0) ) {
                alt32=1;
            }
            else if ( LA32_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1) ) {
                alt32=1;
            }
            else if ( LA32_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2) ) {
                alt32=1;
            }
            else if ( LA32_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3) ) {
                alt32=1;
            }
            else if ( LA32_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4) ) {
                alt32=1;
            }
            else if ( LA32_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5) ) {
                alt32=1;
            }
            else if ( LA32_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCloneDetectionDSL.g:0:0: rule__CloneDetection__UnorderedGroup__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__CloneDetection__UnorderedGroup__3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloneDetection__UnorderedGroup__2"


    // $ANTLR start "rule__CloneDetection__UnorderedGroup__3"
    // InternalCloneDetectionDSL.g:3914:1: rule__CloneDetection__UnorderedGroup__3 : rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__4 )? ;
    public final void rule__CloneDetection__UnorderedGroup__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3918:1: ( rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__4 )? )
            // InternalCloneDetectionDSL.g:3919:2: rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__4 )?
            {
            pushFollow(FOLLOW_33);
            rule__CloneDetection__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalCloneDetectionDSL.g:3920:2: ( rule__CloneDetection__UnorderedGroup__4 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( LA33_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0) ) {
                alt33=1;
            }
            else if ( LA33_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1) ) {
                alt33=1;
            }
            else if ( LA33_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2) ) {
                alt33=1;
            }
            else if ( LA33_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3) ) {
                alt33=1;
            }
            else if ( LA33_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4) ) {
                alt33=1;
            }
            else if ( LA33_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5) ) {
                alt33=1;
            }
            else if ( LA33_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCloneDetectionDSL.g:0:0: rule__CloneDetection__UnorderedGroup__4
                    {
                    pushFollow(FOLLOW_2);
                    rule__CloneDetection__UnorderedGroup__4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloneDetection__UnorderedGroup__3"


    // $ANTLR start "rule__CloneDetection__UnorderedGroup__4"
    // InternalCloneDetectionDSL.g:3926:1: rule__CloneDetection__UnorderedGroup__4 : rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__5 )? ;
    public final void rule__CloneDetection__UnorderedGroup__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3930:1: ( rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__5 )? )
            // InternalCloneDetectionDSL.g:3931:2: rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__5 )?
            {
            pushFollow(FOLLOW_33);
            rule__CloneDetection__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalCloneDetectionDSL.g:3932:2: ( rule__CloneDetection__UnorderedGroup__5 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( LA34_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0) ) {
                alt34=1;
            }
            else if ( LA34_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1) ) {
                alt34=1;
            }
            else if ( LA34_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2) ) {
                alt34=1;
            }
            else if ( LA34_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3) ) {
                alt34=1;
            }
            else if ( LA34_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4) ) {
                alt34=1;
            }
            else if ( LA34_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5) ) {
                alt34=1;
            }
            else if ( LA34_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCloneDetectionDSL.g:0:0: rule__CloneDetection__UnorderedGroup__5
                    {
                    pushFollow(FOLLOW_2);
                    rule__CloneDetection__UnorderedGroup__5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloneDetection__UnorderedGroup__4"


    // $ANTLR start "rule__CloneDetection__UnorderedGroup__5"
    // InternalCloneDetectionDSL.g:3938:1: rule__CloneDetection__UnorderedGroup__5 : rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__6 )? ;
    public final void rule__CloneDetection__UnorderedGroup__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3942:1: ( rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__6 )? )
            // InternalCloneDetectionDSL.g:3943:2: rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__6 )?
            {
            pushFollow(FOLLOW_33);
            rule__CloneDetection__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalCloneDetectionDSL.g:3944:2: ( rule__CloneDetection__UnorderedGroup__6 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( LA35_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0) ) {
                alt35=1;
            }
            else if ( LA35_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1) ) {
                alt35=1;
            }
            else if ( LA35_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2) ) {
                alt35=1;
            }
            else if ( LA35_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3) ) {
                alt35=1;
            }
            else if ( LA35_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4) ) {
                alt35=1;
            }
            else if ( LA35_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5) ) {
                alt35=1;
            }
            else if ( LA35_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCloneDetectionDSL.g:0:0: rule__CloneDetection__UnorderedGroup__6
                    {
                    pushFollow(FOLLOW_2);
                    rule__CloneDetection__UnorderedGroup__6();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloneDetection__UnorderedGroup__5"


    // $ANTLR start "rule__CloneDetection__UnorderedGroup__6"
    // InternalCloneDetectionDSL.g:3950:1: rule__CloneDetection__UnorderedGroup__6 : rule__CloneDetection__UnorderedGroup__Impl ;
    public final void rule__CloneDetection__UnorderedGroup__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3954:1: ( rule__CloneDetection__UnorderedGroup__Impl )
            // InternalCloneDetectionDSL.g:3955:2: rule__CloneDetection__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CloneDetection__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloneDetection__UnorderedGroup__6"


    // $ANTLR start "rule__CloneDetection__ProjectAssignment_0"
    // InternalCloneDetectionDSL.g:3962:1: rule__CloneDetection__ProjectAssignment_0 : ( ruleProject ) ;
    public final void rule__CloneDetection__ProjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3966:1: ( ( ruleProject ) )
            // InternalCloneDetectionDSL.g:3967:2: ( ruleProject )
            {
            // InternalCloneDetectionDSL.g:3967:2: ( ruleProject )
            // InternalCloneDetectionDSL.g:3968:3: ruleProject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCloneDetectionAccess().getProjectProjectParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleProject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCloneDetectionAccess().getProjectProjectParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__CloneDetection__ProjectAssignment_0"


    // $ANTLR start "rule__CloneDetection__RootAssignment_1"
    // InternalCloneDetectionDSL.g:3977:1: rule__CloneDetection__RootAssignment_1 : ( ruleSearchRoot ) ;
    public final void rule__CloneDetection__RootAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3981:1: ( ( ruleSearchRoot ) )
            // InternalCloneDetectionDSL.g:3982:2: ( ruleSearchRoot )
            {
            // InternalCloneDetectionDSL.g:3982:2: ( ruleSearchRoot )
            // InternalCloneDetectionDSL.g:3983:3: ruleSearchRoot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCloneDetectionAccess().getRootSearchRootParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSearchRoot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCloneDetectionAccess().getRootSearchRootParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__CloneDetection__RootAssignment_1"


    // $ANTLR start "rule__CloneDetection__MatchAssignment_2"
    // InternalCloneDetectionDSL.g:3992:1: rule__CloneDetection__MatchAssignment_2 : ( ruleMatch ) ;
    public final void rule__CloneDetection__MatchAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:3996:1: ( ( ruleMatch ) )
            // InternalCloneDetectionDSL.g:3997:2: ( ruleMatch )
            {
            // InternalCloneDetectionDSL.g:3997:2: ( ruleMatch )
            // InternalCloneDetectionDSL.g:3998:3: ruleMatch
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCloneDetectionAccess().getMatchMatchParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMatch();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCloneDetectionAccess().getMatchMatchParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__CloneDetection__MatchAssignment_2"


    // $ANTLR start "rule__CloneDetection__ExcludeAssignment_3"
    // InternalCloneDetectionDSL.g:4007:1: rule__CloneDetection__ExcludeAssignment_3 : ( ruleExclude ) ;
    public final void rule__CloneDetection__ExcludeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4011:1: ( ( ruleExclude ) )
            // InternalCloneDetectionDSL.g:4012:2: ( ruleExclude )
            {
            // InternalCloneDetectionDSL.g:4012:2: ( ruleExclude )
            // InternalCloneDetectionDSL.g:4013:3: ruleExclude
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCloneDetectionAccess().getExcludeExcludeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExclude();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCloneDetectionAccess().getExcludeExcludeParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__CloneDetection__ExcludeAssignment_3"


    // $ANTLR start "rule__CloneDetection__SizeAssignment_4"
    // InternalCloneDetectionDSL.g:4022:1: rule__CloneDetection__SizeAssignment_4 : ( ruleMinSize ) ;
    public final void rule__CloneDetection__SizeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4026:1: ( ( ruleMinSize ) )
            // InternalCloneDetectionDSL.g:4027:2: ( ruleMinSize )
            {
            // InternalCloneDetectionDSL.g:4027:2: ( ruleMinSize )
            // InternalCloneDetectionDSL.g:4028:3: ruleMinSize
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCloneDetectionAccess().getSizeMinSizeParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMinSize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCloneDetectionAccess().getSizeMinSizeParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__CloneDetection__SizeAssignment_4"


    // $ANTLR start "rule__CloneDetection__NotCompareAssignment_5"
    // InternalCloneDetectionDSL.g:4037:1: rule__CloneDetection__NotCompareAssignment_5 : ( ruleDoNotCompare ) ;
    public final void rule__CloneDetection__NotCompareAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4041:1: ( ( ruleDoNotCompare ) )
            // InternalCloneDetectionDSL.g:4042:2: ( ruleDoNotCompare )
            {
            // InternalCloneDetectionDSL.g:4042:2: ( ruleDoNotCompare )
            // InternalCloneDetectionDSL.g:4043:3: ruleDoNotCompare
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCloneDetectionAccess().getNotCompareDoNotCompareParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDoNotCompare();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCloneDetectionAccess().getNotCompareDoNotCompareParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__CloneDetection__NotCompareAssignment_5"


    // $ANTLR start "rule__CloneDetection__CompareAssignment_6"
    // InternalCloneDetectionDSL.g:4052:1: rule__CloneDetection__CompareAssignment_6 : ( ruleCompare ) ;
    public final void rule__CloneDetection__CompareAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4056:1: ( ( ruleCompare ) )
            // InternalCloneDetectionDSL.g:4057:2: ( ruleCompare )
            {
            // InternalCloneDetectionDSL.g:4057:2: ( ruleCompare )
            // InternalCloneDetectionDSL.g:4058:3: ruleCompare
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCloneDetectionAccess().getCompareCompareParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCompare();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCloneDetectionAccess().getCompareCompareParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__CloneDetection__CompareAssignment_6"


    // $ANTLR start "rule__Project__PathAssignment_1"
    // InternalCloneDetectionDSL.g:4067:1: rule__Project__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Project__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4071:1: ( ( RULE_STRING ) )
            // InternalCloneDetectionDSL.g:4072:2: ( RULE_STRING )
            {
            // InternalCloneDetectionDSL.g:4072:2: ( RULE_STRING )
            // InternalCloneDetectionDSL.g:4073:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectAccess().getPathSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProjectAccess().getPathSTRINGTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Project__PathAssignment_1"


    // $ANTLR start "rule__SearchRoot__NodesAssignment_1"
    // InternalCloneDetectionDSL.g:4082:1: rule__SearchRoot__NodesAssignment_1 : ( ruleNodes ) ;
    public final void rule__SearchRoot__NodesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4086:1: ( ( ruleNodes ) )
            // InternalCloneDetectionDSL.g:4087:2: ( ruleNodes )
            {
            // InternalCloneDetectionDSL.g:4087:2: ( ruleNodes )
            // InternalCloneDetectionDSL.g:4088:3: ruleNodes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSearchRootAccess().getNodesNodesParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNodes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSearchRootAccess().getNodesNodesParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__SearchRoot__NodesAssignment_1"


    // $ANTLR start "rule__SearchRoot__ConditionAssignment_2"
    // InternalCloneDetectionDSL.g:4097:1: rule__SearchRoot__ConditionAssignment_2 : ( ruleComparisonExpression ) ;
    public final void rule__SearchRoot__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4101:1: ( ( ruleComparisonExpression ) )
            // InternalCloneDetectionDSL.g:4102:2: ( ruleComparisonExpression )
            {
            // InternalCloneDetectionDSL.g:4102:2: ( ruleComparisonExpression )
            // InternalCloneDetectionDSL.g:4103:3: ruleComparisonExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSearchRootAccess().getConditionComparisonExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSearchRootAccess().getConditionComparisonExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__SearchRoot__ConditionAssignment_2"


    // $ANTLR start "rule__Match__TargetAssignment_1"
    // InternalCloneDetectionDSL.g:4112:1: rule__Match__TargetAssignment_1 : ( ruleMatchTarget ) ;
    public final void rule__Match__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4116:1: ( ( ruleMatchTarget ) )
            // InternalCloneDetectionDSL.g:4117:2: ( ruleMatchTarget )
            {
            // InternalCloneDetectionDSL.g:4117:2: ( ruleMatchTarget )
            // InternalCloneDetectionDSL.g:4118:3: ruleMatchTarget
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchAccess().getTargetMatchTargetEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMatchTarget();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchAccess().getTargetMatchTargetEnumRuleCall_1_0()); 
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
    // $ANTLR end "rule__Match__TargetAssignment_1"


    // $ANTLR start "rule__Node__NameAssignment_0_0"
    // InternalCloneDetectionDSL.g:4127:1: rule__Node__NameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4131:1: ( ( RULE_ID ) )
            // InternalCloneDetectionDSL.g:4132:2: ( RULE_ID )
            {
            // InternalCloneDetectionDSL.g:4132:2: ( RULE_ID )
            // InternalCloneDetectionDSL.g:4133:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0_0()); 
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
    // $ANTLR end "rule__Node__NameAssignment_0_0"


    // $ANTLR start "rule__Node__UnderAssignment_1_0"
    // InternalCloneDetectionDSL.g:4142:1: rule__Node__UnderAssignment_1_0 : ( ruleUnder ) ;
    public final void rule__Node__UnderAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4146:1: ( ( ruleUnder ) )
            // InternalCloneDetectionDSL.g:4147:2: ( ruleUnder )
            {
            // InternalCloneDetectionDSL.g:4147:2: ( ruleUnder )
            // InternalCloneDetectionDSL.g:4148:3: ruleUnder
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getUnderUnderEnumRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUnder();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getUnderUnderEnumRuleCall_1_0_0()); 
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
    // $ANTLR end "rule__Node__UnderAssignment_1_0"


    // $ANTLR start "rule__Node__NodeAssignment_1_1"
    // InternalCloneDetectionDSL.g:4157:1: rule__Node__NodeAssignment_1_1 : ( ruleNode ) ;
    public final void rule__Node__NodeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4161:1: ( ( ruleNode ) )
            // InternalCloneDetectionDSL.g:4162:2: ( ruleNode )
            {
            // InternalCloneDetectionDSL.g:4162:2: ( ruleNode )
            // InternalCloneDetectionDSL.g:4163:3: ruleNode
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getNodeNodeParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getNodeNodeParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Node__NodeAssignment_1_1"


    // $ANTLR start "rule__Nodes__NodeAssignment_0"
    // InternalCloneDetectionDSL.g:4172:1: rule__Nodes__NodeAssignment_0 : ( ruleNode ) ;
    public final void rule__Nodes__NodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4176:1: ( ( ruleNode ) )
            // InternalCloneDetectionDSL.g:4177:2: ( ruleNode )
            {
            // InternalCloneDetectionDSL.g:4177:2: ( ruleNode )
            // InternalCloneDetectionDSL.g:4178:3: ruleNode
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodesAccess().getNodeNodeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodesAccess().getNodeNodeParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Nodes__NodeAssignment_0"


    // $ANTLR start "rule__Nodes__NodesAssignment_1_1"
    // InternalCloneDetectionDSL.g:4187:1: rule__Nodes__NodesAssignment_1_1 : ( ruleNodes ) ;
    public final void rule__Nodes__NodesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4191:1: ( ( ruleNodes ) )
            // InternalCloneDetectionDSL.g:4192:2: ( ruleNodes )
            {
            // InternalCloneDetectionDSL.g:4192:2: ( ruleNodes )
            // InternalCloneDetectionDSL.g:4193:3: ruleNodes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodesAccess().getNodesNodesParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNodes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodesAccess().getNodesNodesParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Nodes__NodesAssignment_1_1"


    // $ANTLR start "rule__MinSize__ExprAssignment_1_0"
    // InternalCloneDetectionDSL.g:4202:1: rule__MinSize__ExprAssignment_1_0 : ( ruleMetricExpr ) ;
    public final void rule__MinSize__ExprAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4206:1: ( ( ruleMetricExpr ) )
            // InternalCloneDetectionDSL.g:4207:2: ( ruleMetricExpr )
            {
            // InternalCloneDetectionDSL.g:4207:2: ( ruleMetricExpr )
            // InternalCloneDetectionDSL.g:4208:3: ruleMetricExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getExprMetricExprParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMetricExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinSizeAccess().getExprMetricExprParserRuleCall_1_0_0()); 
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
    // $ANTLR end "rule__MinSize__ExprAssignment_1_0"


    // $ANTLR start "rule__MinSize__BracketsAssignment_1_1_1"
    // InternalCloneDetectionDSL.g:4217:1: rule__MinSize__BracketsAssignment_1_1_1 : ( ruleMinSize ) ;
    public final void rule__MinSize__BracketsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4221:1: ( ( ruleMinSize ) )
            // InternalCloneDetectionDSL.g:4222:2: ( ruleMinSize )
            {
            // InternalCloneDetectionDSL.g:4222:2: ( ruleMinSize )
            // InternalCloneDetectionDSL.g:4223:3: ruleMinSize
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getBracketsMinSizeParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMinSize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinSizeAccess().getBracketsMinSizeParserRuleCall_1_1_1_0()); 
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
    // $ANTLR end "rule__MinSize__BracketsAssignment_1_1_1"


    // $ANTLR start "rule__MinSize__OperatorAssignment_2_0"
    // InternalCloneDetectionDSL.g:4232:1: rule__MinSize__OperatorAssignment_2_0 : ( ruleBoolOperator ) ;
    public final void rule__MinSize__OperatorAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4236:1: ( ( ruleBoolOperator ) )
            // InternalCloneDetectionDSL.g:4237:2: ( ruleBoolOperator )
            {
            // InternalCloneDetectionDSL.g:4237:2: ( ruleBoolOperator )
            // InternalCloneDetectionDSL.g:4238:3: ruleBoolOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getOperatorBoolOperatorEnumRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBoolOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinSizeAccess().getOperatorBoolOperatorEnumRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__MinSize__OperatorAssignment_2_0"


    // $ANTLR start "rule__MinSize__SizeAssignment_2_1"
    // InternalCloneDetectionDSL.g:4247:1: rule__MinSize__SizeAssignment_2_1 : ( ruleMinSize ) ;
    public final void rule__MinSize__SizeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4251:1: ( ( ruleMinSize ) )
            // InternalCloneDetectionDSL.g:4252:2: ( ruleMinSize )
            {
            // InternalCloneDetectionDSL.g:4252:2: ( ruleMinSize )
            // InternalCloneDetectionDSL.g:4253:3: ruleMinSize
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getSizeMinSizeParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMinSize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinSizeAccess().getSizeMinSizeParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__MinSize__SizeAssignment_2_1"


    // $ANTLR start "rule__MetricExpr__AmountAssignment_0"
    // InternalCloneDetectionDSL.g:4262:1: rule__MetricExpr__AmountAssignment_0 : ( RULE_INT ) ;
    public final void rule__MetricExpr__AmountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4266:1: ( ( RULE_INT ) )
            // InternalCloneDetectionDSL.g:4267:2: ( RULE_INT )
            {
            // InternalCloneDetectionDSL.g:4267:2: ( RULE_INT )
            // InternalCloneDetectionDSL.g:4268:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricExprAccess().getAmountINTTerminalRuleCall_0_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetricExprAccess().getAmountINTTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__MetricExpr__AmountAssignment_0"


    // $ANTLR start "rule__MetricExpr__MetricAssignment_1"
    // InternalCloneDetectionDSL.g:4277:1: rule__MetricExpr__MetricAssignment_1 : ( ruleSizeMetric ) ;
    public final void rule__MetricExpr__MetricAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4281:1: ( ( ruleSizeMetric ) )
            // InternalCloneDetectionDSL.g:4282:2: ( ruleSizeMetric )
            {
            // InternalCloneDetectionDSL.g:4282:2: ( ruleSizeMetric )
            // InternalCloneDetectionDSL.g:4283:3: ruleSizeMetric
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricExprAccess().getMetricSizeMetricEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSizeMetric();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetricExprAccess().getMetricSizeMetricEnumRuleCall_1_0()); 
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
    // $ANTLR end "rule__MetricExpr__MetricAssignment_1"


    // $ANTLR start "rule__Compare__NodesAssignment_1"
    // InternalCloneDetectionDSL.g:4292:1: rule__Compare__NodesAssignment_1 : ( ruleNodes ) ;
    public final void rule__Compare__NodesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4296:1: ( ( ruleNodes ) )
            // InternalCloneDetectionDSL.g:4297:2: ( ruleNodes )
            {
            // InternalCloneDetectionDSL.g:4297:2: ( ruleNodes )
            // InternalCloneDetectionDSL.g:4298:3: ruleNodes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getNodesNodesParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNodes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getNodesNodesParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Compare__NodesAssignment_1"


    // $ANTLR start "rule__Compare__ComparisonMethodAssignment_2"
    // InternalCloneDetectionDSL.g:4307:1: rule__Compare__ComparisonMethodAssignment_2 : ( ruleMethod ) ;
    public final void rule__Compare__ComparisonMethodAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4311:1: ( ( ruleMethod ) )
            // InternalCloneDetectionDSL.g:4312:2: ( ruleMethod )
            {
            // InternalCloneDetectionDSL.g:4312:2: ( ruleMethod )
            // InternalCloneDetectionDSL.g:4313:3: ruleMethod
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getComparisonMethodMethodEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getComparisonMethodMethodEnumRuleCall_2_0()); 
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
    // $ANTLR end "rule__Compare__ComparisonMethodAssignment_2"


    // $ANTLR start "rule__Compare__DeepestNodeAssignment_3"
    // InternalCloneDetectionDSL.g:4322:1: rule__Compare__DeepestNodeAssignment_3 : ( ruleNode ) ;
    public final void rule__Compare__DeepestNodeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4326:1: ( ( ruleNode ) )
            // InternalCloneDetectionDSL.g:4327:2: ( ruleNode )
            {
            // InternalCloneDetectionDSL.g:4327:2: ( ruleNode )
            // InternalCloneDetectionDSL.g:4328:3: ruleNode
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getDeepestNodeNodeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getDeepestNodeNodeParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Compare__DeepestNodeAssignment_3"


    // $ANTLR start "rule__Compare__PercAssignment_4"
    // InternalCloneDetectionDSL.g:4337:1: rule__Compare__PercAssignment_4 : ( rulePercentage ) ;
    public final void rule__Compare__PercAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4341:1: ( ( rulePercentage ) )
            // InternalCloneDetectionDSL.g:4342:2: ( rulePercentage )
            {
            // InternalCloneDetectionDSL.g:4342:2: ( rulePercentage )
            // InternalCloneDetectionDSL.g:4343:3: rulePercentage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getPercPercentageParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePercentage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getPercPercentageParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Compare__PercAssignment_4"


    // $ANTLR start "rule__BooleanExpressionLevel1__BopAssignment_1_1"
    // InternalCloneDetectionDSL.g:4352:1: rule__BooleanExpressionLevel1__BopAssignment_1_1 : ( ruleBinaryBooleanOperator ) ;
    public final void rule__BooleanExpressionLevel1__BopAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4356:1: ( ( ruleBinaryBooleanOperator ) )
            // InternalCloneDetectionDSL.g:4357:2: ( ruleBinaryBooleanOperator )
            {
            // InternalCloneDetectionDSL.g:4357:2: ( ruleBinaryBooleanOperator )
            // InternalCloneDetectionDSL.g:4358:3: ruleBinaryBooleanOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getBopBinaryBooleanOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBinaryBooleanOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getBopBinaryBooleanOperatorEnumRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__BooleanExpressionLevel1__BopAssignment_1_1"


    // $ANTLR start "rule__BooleanExpressionLevel1__RightAssignment_1_2"
    // InternalCloneDetectionDSL.g:4367:1: rule__BooleanExpressionLevel1__RightAssignment_1_2 : ( ruleBooleanExpressionLevel2 ) ;
    public final void rule__BooleanExpressionLevel1__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4371:1: ( ( ruleBooleanExpressionLevel2 ) )
            // InternalCloneDetectionDSL.g:4372:2: ( ruleBooleanExpressionLevel2 )
            {
            // InternalCloneDetectionDSL.g:4372:2: ( ruleBooleanExpressionLevel2 )
            // InternalCloneDetectionDSL.g:4373:3: ruleBooleanExpressionLevel2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getRightBooleanExpressionLevel2ParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getRightBooleanExpressionLevel2ParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__BooleanExpressionLevel1__RightAssignment_1_2"


    // $ANTLR start "rule__NotExpression__SubAssignment_1"
    // InternalCloneDetectionDSL.g:4382:1: rule__NotExpression__SubAssignment_1 : ( ruleBooleanExpressionLevel3 ) ;
    public final void rule__NotExpression__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4386:1: ( ( ruleBooleanExpressionLevel3 ) )
            // InternalCloneDetectionDSL.g:4387:2: ( ruleBooleanExpressionLevel3 )
            {
            // InternalCloneDetectionDSL.g:4387:2: ( ruleBooleanExpressionLevel3 )
            // InternalCloneDetectionDSL.g:4388:3: ruleBooleanExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubBooleanExpressionLevel3ParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getSubBooleanExpressionLevel3ParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__NotExpression__SubAssignment_1"


    // $ANTLR start "rule__ComparisonExpression__LeftAssignment_1"
    // InternalCloneDetectionDSL.g:4397:1: rule__ComparisonExpression__LeftAssignment_1 : ( ruleIntExpression ) ;
    public final void rule__ComparisonExpression__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4401:1: ( ( ruleIntExpression ) )
            // InternalCloneDetectionDSL.g:4402:2: ( ruleIntExpression )
            {
            // InternalCloneDetectionDSL.g:4402:2: ( ruleIntExpression )
            // InternalCloneDetectionDSL.g:4403:3: ruleIntExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getLeftIntExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIntExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getLeftIntExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ComparisonExpression__LeftAssignment_1"


    // $ANTLR start "rule__ComparisonExpression__OpAssignment_2"
    // InternalCloneDetectionDSL.g:4412:1: rule__ComparisonExpression__OpAssignment_2 : ( ruleCompareOperator ) ;
    public final void rule__ComparisonExpression__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4416:1: ( ( ruleCompareOperator ) )
            // InternalCloneDetectionDSL.g:4417:2: ( ruleCompareOperator )
            {
            // InternalCloneDetectionDSL.g:4417:2: ( ruleCompareOperator )
            // InternalCloneDetectionDSL.g:4418:3: ruleCompareOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getOpCompareOperatorEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCompareOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getOpCompareOperatorEnumRuleCall_2_0()); 
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
    // $ANTLR end "rule__ComparisonExpression__OpAssignment_2"


    // $ANTLR start "rule__ComparisonExpression__RightAssignment_3"
    // InternalCloneDetectionDSL.g:4427:1: rule__ComparisonExpression__RightAssignment_3 : ( ruleIntExpression ) ;
    public final void rule__ComparisonExpression__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4431:1: ( ( ruleIntExpression ) )
            // InternalCloneDetectionDSL.g:4432:2: ( ruleIntExpression )
            {
            // InternalCloneDetectionDSL.g:4432:2: ( ruleIntExpression )
            // InternalCloneDetectionDSL.g:4433:3: ruleIntExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getRightIntExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIntExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getRightIntExpressionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__ComparisonExpression__RightAssignment_3"


    // $ANTLR start "rule__BooleanExpressionBracket__SubAssignment_1"
    // InternalCloneDetectionDSL.g:4442:1: rule__BooleanExpressionBracket__SubAssignment_1 : ( ruleBooleanExpression ) ;
    public final void rule__BooleanExpressionBracket__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4446:1: ( ( ruleBooleanExpression ) )
            // InternalCloneDetectionDSL.g:4447:2: ( ruleBooleanExpression )
            {
            // InternalCloneDetectionDSL.g:4447:2: ( ruleBooleanExpression )
            // InternalCloneDetectionDSL.g:4448:3: ruleBooleanExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionBracketAccess().getSubBooleanExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionBracketAccess().getSubBooleanExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__BooleanExpressionBracket__SubAssignment_1"


    // $ANTLR start "rule__BooleanExpressionConstant__ValueAssignment"
    // InternalCloneDetectionDSL.g:4457:1: rule__BooleanExpressionConstant__ValueAssignment : ( RULE_BOOL_LITERAL ) ;
    public final void rule__BooleanExpressionConstant__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4461:1: ( ( RULE_BOOL_LITERAL ) )
            // InternalCloneDetectionDSL.g:4462:2: ( RULE_BOOL_LITERAL )
            {
            // InternalCloneDetectionDSL.g:4462:2: ( RULE_BOOL_LITERAL )
            // InternalCloneDetectionDSL.g:4463:3: RULE_BOOL_LITERAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionConstantAccess().getValueBOOL_LITERALTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOL_LITERAL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionConstantAccess().getValueBOOL_LITERALTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__BooleanExpressionConstant__ValueAssignment"


    // $ANTLR start "rule__ExpressionLevel1__RightAssignment_1_0_2"
    // InternalCloneDetectionDSL.g:4472:1: rule__ExpressionLevel1__RightAssignment_1_0_2 : ( ruleExpressionLevel2 ) ;
    public final void rule__ExpressionLevel1__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4476:1: ( ( ruleExpressionLevel2 ) )
            // InternalCloneDetectionDSL.g:4477:2: ( ruleExpressionLevel2 )
            {
            // InternalCloneDetectionDSL.g:4477:2: ( ruleExpressionLevel2 )
            // InternalCloneDetectionDSL.g:4478:3: ruleExpressionLevel2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_0_2_0()); 
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
    // $ANTLR end "rule__ExpressionLevel1__RightAssignment_1_0_2"


    // $ANTLR start "rule__ExpressionLevel1__RightAssignment_1_1_2"
    // InternalCloneDetectionDSL.g:4487:1: rule__ExpressionLevel1__RightAssignment_1_1_2 : ( ruleExpressionLevel2 ) ;
    public final void rule__ExpressionLevel1__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4491:1: ( ( ruleExpressionLevel2 ) )
            // InternalCloneDetectionDSL.g:4492:2: ( ruleExpressionLevel2 )
            {
            // InternalCloneDetectionDSL.g:4492:2: ( ruleExpressionLevel2 )
            // InternalCloneDetectionDSL.g:4493:3: ruleExpressionLevel2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_1_2_0()); 
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
    // $ANTLR end "rule__ExpressionLevel1__RightAssignment_1_1_2"


    // $ANTLR start "rule__ExpressionLevel2__RightAssignment_1_0_2"
    // InternalCloneDetectionDSL.g:4502:1: rule__ExpressionLevel2__RightAssignment_1_0_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4506:1: ( ( ruleExpressionLevel3 ) )
            // InternalCloneDetectionDSL.g:4507:2: ( ruleExpressionLevel3 )
            {
            // InternalCloneDetectionDSL.g:4507:2: ( ruleExpressionLevel3 )
            // InternalCloneDetectionDSL.g:4508:3: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_0_2_0()); 
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
    // $ANTLR end "rule__ExpressionLevel2__RightAssignment_1_0_2"


    // $ANTLR start "rule__ExpressionLevel2__RightAssignment_1_1_2"
    // InternalCloneDetectionDSL.g:4517:1: rule__ExpressionLevel2__RightAssignment_1_1_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4521:1: ( ( ruleExpressionLevel3 ) )
            // InternalCloneDetectionDSL.g:4522:2: ( ruleExpressionLevel3 )
            {
            // InternalCloneDetectionDSL.g:4522:2: ( ruleExpressionLevel3 )
            // InternalCloneDetectionDSL.g:4523:3: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_1_2_0()); 
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
    // $ANTLR end "rule__ExpressionLevel2__RightAssignment_1_1_2"


    // $ANTLR start "rule__ExpressionLevel2__RightAssignment_1_2_2"
    // InternalCloneDetectionDSL.g:4532:1: rule__ExpressionLevel2__RightAssignment_1_2_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4536:1: ( ( ruleExpressionLevel3 ) )
            // InternalCloneDetectionDSL.g:4537:2: ( ruleExpressionLevel3 )
            {
            // InternalCloneDetectionDSL.g:4537:2: ( ruleExpressionLevel3 )
            // InternalCloneDetectionDSL.g:4538:3: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_2_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_2_2_0()); 
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
    // $ANTLR end "rule__ExpressionLevel2__RightAssignment_1_2_2"


    // $ANTLR start "rule__ExpressionLevel2__RightAssignment_1_3_2"
    // InternalCloneDetectionDSL.g:4547:1: rule__ExpressionLevel2__RightAssignment_1_3_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__RightAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4551:1: ( ( ruleExpressionLevel3 ) )
            // InternalCloneDetectionDSL.g:4552:2: ( ruleExpressionLevel3 )
            {
            // InternalCloneDetectionDSL.g:4552:2: ( ruleExpressionLevel3 )
            // InternalCloneDetectionDSL.g:4553:3: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_3_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_3_2_0()); 
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
    // $ANTLR end "rule__ExpressionLevel2__RightAssignment_1_3_2"


    // $ANTLR start "rule__ExpressionLevel2__RightAssignment_1_4_2"
    // InternalCloneDetectionDSL.g:4562:1: rule__ExpressionLevel2__RightAssignment_1_4_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__RightAssignment_1_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4566:1: ( ( ruleExpressionLevel3 ) )
            // InternalCloneDetectionDSL.g:4567:2: ( ruleExpressionLevel3 )
            {
            // InternalCloneDetectionDSL.g:4567:2: ( ruleExpressionLevel3 )
            // InternalCloneDetectionDSL.g:4568:3: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_4_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_4_2_0()); 
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
    // $ANTLR end "rule__ExpressionLevel2__RightAssignment_1_4_2"


    // $ANTLR start "rule__ExpressionLevel3__RightAssignment_1_2"
    // InternalCloneDetectionDSL.g:4577:1: rule__ExpressionLevel3__RightAssignment_1_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel3__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4581:1: ( ( ruleExpressionLevel3 ) )
            // InternalCloneDetectionDSL.g:4582:2: ( ruleExpressionLevel3 )
            {
            // InternalCloneDetectionDSL.g:4582:2: ( ruleExpressionLevel3 )
            // InternalCloneDetectionDSL.g:4583:3: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel3ParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel3ParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__ExpressionLevel3__RightAssignment_1_2"


    // $ANTLR start "rule__ExpressionMinus__SubAssignment_1"
    // InternalCloneDetectionDSL.g:4592:1: rule__ExpressionMinus__SubAssignment_1 : ( ruleExpressionLevel5 ) ;
    public final void rule__ExpressionMinus__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4596:1: ( ( ruleExpressionLevel5 ) )
            // InternalCloneDetectionDSL.g:4597:2: ( ruleExpressionLevel5 )
            {
            // InternalCloneDetectionDSL.g:4597:2: ( ruleExpressionLevel5 )
            // InternalCloneDetectionDSL.g:4598:3: ruleExpressionLevel5
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionMinusAccess().getSubExpressionLevel5ParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel5();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionMinusAccess().getSubExpressionLevel5ParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ExpressionMinus__SubAssignment_1"


    // $ANTLR start "rule__ExpressionPlus__SubAssignment_1"
    // InternalCloneDetectionDSL.g:4607:1: rule__ExpressionPlus__SubAssignment_1 : ( ruleExpressionLevel5 ) ;
    public final void rule__ExpressionPlus__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4611:1: ( ( ruleExpressionLevel5 ) )
            // InternalCloneDetectionDSL.g:4612:2: ( ruleExpressionLevel5 )
            {
            // InternalCloneDetectionDSL.g:4612:2: ( ruleExpressionLevel5 )
            // InternalCloneDetectionDSL.g:4613:3: ruleExpressionLevel5
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionPlusAccess().getSubExpressionLevel5ParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel5();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionPlusAccess().getSubExpressionLevel5ParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ExpressionPlus__SubAssignment_1"


    // $ANTLR start "rule__ExpressionLevel5__MetricAssignment_2"
    // InternalCloneDetectionDSL.g:4622:1: rule__ExpressionLevel5__MetricAssignment_2 : ( ruleMetric ) ;
    public final void rule__ExpressionLevel5__MetricAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4626:1: ( ( ruleMetric ) )
            // InternalCloneDetectionDSL.g:4627:2: ( ruleMetric )
            {
            // InternalCloneDetectionDSL.g:4627:2: ( ruleMetric )
            // InternalCloneDetectionDSL.g:4628:3: ruleMetric
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel5Access().getMetricMetricEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMetric();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel5Access().getMetricMetricEnumRuleCall_2_0()); 
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
    // $ANTLR end "rule__ExpressionLevel5__MetricAssignment_2"


    // $ANTLR start "rule__ExpressionBracket__SubAssignment_1"
    // InternalCloneDetectionDSL.g:4637:1: rule__ExpressionBracket__SubAssignment_1 : ( ruleIntExpression ) ;
    public final void rule__ExpressionBracket__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4641:1: ( ( ruleIntExpression ) )
            // InternalCloneDetectionDSL.g:4642:2: ( ruleIntExpression )
            {
            // InternalCloneDetectionDSL.g:4642:2: ( ruleIntExpression )
            // InternalCloneDetectionDSL.g:4643:3: ruleIntExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBracketAccess().getSubIntExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIntExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBracketAccess().getSubIntExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ExpressionBracket__SubAssignment_1"


    // $ANTLR start "rule__ExpressionConstantInt__ValueAssignment"
    // InternalCloneDetectionDSL.g:4652:1: rule__ExpressionConstantInt__ValueAssignment : ( RULE_INT ) ;
    public final void rule__ExpressionConstantInt__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:4656:1: ( ( RULE_INT ) )
            // InternalCloneDetectionDSL.g:4657:2: ( RULE_INT )
            {
            // InternalCloneDetectionDSL.g:4657:2: ( RULE_INT )
            // InternalCloneDetectionDSL.g:4658:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionConstantIntAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionConstantIntAccess().getValueINTTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__ExpressionConstantInt__ValueAssignment"

    // $ANTLR start synpred4_InternalCloneDetectionDSL
    public final void synpred4_InternalCloneDetectionDSL_fragment() throws RecognitionException {   
        // InternalCloneDetectionDSL.g:999:2: ( ( ( ruleComparisonExpression ) ) )
        // InternalCloneDetectionDSL.g:999:2: ( ( ruleComparisonExpression ) )
        {
        // InternalCloneDetectionDSL.g:999:2: ( ( ruleComparisonExpression ) )
        // InternalCloneDetectionDSL.g:1000:3: ( ruleComparisonExpression )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBooleanExpressionLevel3Access().getComparisonExpressionParserRuleCall_0()); 
        }
        // InternalCloneDetectionDSL.g:1001:3: ( ruleComparisonExpression )
        // InternalCloneDetectionDSL.g:1001:4: ruleComparisonExpression
        {
        pushFollow(FOLLOW_2);
        ruleComparisonExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred4_InternalCloneDetectionDSL

    // $ANTLR start synpred5_InternalCloneDetectionDSL
    public final void synpred5_InternalCloneDetectionDSL_fragment() throws RecognitionException {   
        // InternalCloneDetectionDSL.g:1005:2: ( ( ruleBooleanExpressionBracket ) )
        // InternalCloneDetectionDSL.g:1005:2: ( ruleBooleanExpressionBracket )
        {
        // InternalCloneDetectionDSL.g:1005:2: ( ruleBooleanExpressionBracket )
        // InternalCloneDetectionDSL.g:1006:3: ruleBooleanExpressionBracket
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionBracketParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_2);
        ruleBooleanExpressionBracket();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalCloneDetectionDSL

    // $ANTLR start synpred46_InternalCloneDetectionDSL
    public final void synpred46_InternalCloneDetectionDSL_fragment() throws RecognitionException {   
        // InternalCloneDetectionDSL.g:3751:3: ( ({...}? => ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) ) ) )
        // InternalCloneDetectionDSL.g:3751:3: ({...}? => ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) ) )
        {
        // InternalCloneDetectionDSL.g:3751:3: ({...}? => ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) ) )
        // InternalCloneDetectionDSL.g:3752:4: {...}? => ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred46_InternalCloneDetectionDSL", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0)");
        }
        // InternalCloneDetectionDSL.g:3752:108: ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) )
        // InternalCloneDetectionDSL.g:3753:5: ( ( rule__CloneDetection__ProjectAssignment_0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0);
        // InternalCloneDetectionDSL.g:3759:5: ( ( rule__CloneDetection__ProjectAssignment_0 ) )
        // InternalCloneDetectionDSL.g:3760:6: ( rule__CloneDetection__ProjectAssignment_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCloneDetectionAccess().getProjectAssignment_0()); 
        }
        // InternalCloneDetectionDSL.g:3761:6: ( rule__CloneDetection__ProjectAssignment_0 )
        // InternalCloneDetectionDSL.g:3761:7: rule__CloneDetection__ProjectAssignment_0
        {
        pushFollow(FOLLOW_2);
        rule__CloneDetection__ProjectAssignment_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred46_InternalCloneDetectionDSL

    // $ANTLR start synpred47_InternalCloneDetectionDSL
    public final void synpred47_InternalCloneDetectionDSL_fragment() throws RecognitionException {   
        // InternalCloneDetectionDSL.g:3766:3: ( ({...}? => ( ( ( rule__CloneDetection__RootAssignment_1 ) ) ) ) )
        // InternalCloneDetectionDSL.g:3766:3: ({...}? => ( ( ( rule__CloneDetection__RootAssignment_1 ) ) ) )
        {
        // InternalCloneDetectionDSL.g:3766:3: ({...}? => ( ( ( rule__CloneDetection__RootAssignment_1 ) ) ) )
        // InternalCloneDetectionDSL.g:3767:4: {...}? => ( ( ( rule__CloneDetection__RootAssignment_1 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred47_InternalCloneDetectionDSL", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1)");
        }
        // InternalCloneDetectionDSL.g:3767:108: ( ( ( rule__CloneDetection__RootAssignment_1 ) ) )
        // InternalCloneDetectionDSL.g:3768:5: ( ( rule__CloneDetection__RootAssignment_1 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1);
        // InternalCloneDetectionDSL.g:3774:5: ( ( rule__CloneDetection__RootAssignment_1 ) )
        // InternalCloneDetectionDSL.g:3775:6: ( rule__CloneDetection__RootAssignment_1 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCloneDetectionAccess().getRootAssignment_1()); 
        }
        // InternalCloneDetectionDSL.g:3776:6: ( rule__CloneDetection__RootAssignment_1 )
        // InternalCloneDetectionDSL.g:3776:7: rule__CloneDetection__RootAssignment_1
        {
        pushFollow(FOLLOW_2);
        rule__CloneDetection__RootAssignment_1();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred47_InternalCloneDetectionDSL

    // $ANTLR start synpred48_InternalCloneDetectionDSL
    public final void synpred48_InternalCloneDetectionDSL_fragment() throws RecognitionException {   
        // InternalCloneDetectionDSL.g:3781:3: ( ({...}? => ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) ) ) )
        // InternalCloneDetectionDSL.g:3781:3: ({...}? => ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) ) )
        {
        // InternalCloneDetectionDSL.g:3781:3: ({...}? => ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) ) )
        // InternalCloneDetectionDSL.g:3782:4: {...}? => ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred48_InternalCloneDetectionDSL", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2)");
        }
        // InternalCloneDetectionDSL.g:3782:108: ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) )
        // InternalCloneDetectionDSL.g:3783:5: ( ( rule__CloneDetection__MatchAssignment_2 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2);
        // InternalCloneDetectionDSL.g:3789:5: ( ( rule__CloneDetection__MatchAssignment_2 ) )
        // InternalCloneDetectionDSL.g:3790:6: ( rule__CloneDetection__MatchAssignment_2 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCloneDetectionAccess().getMatchAssignment_2()); 
        }
        // InternalCloneDetectionDSL.g:3791:6: ( rule__CloneDetection__MatchAssignment_2 )
        // InternalCloneDetectionDSL.g:3791:7: rule__CloneDetection__MatchAssignment_2
        {
        pushFollow(FOLLOW_2);
        rule__CloneDetection__MatchAssignment_2();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred48_InternalCloneDetectionDSL

    // $ANTLR start synpred49_InternalCloneDetectionDSL
    public final void synpred49_InternalCloneDetectionDSL_fragment() throws RecognitionException {   
        // InternalCloneDetectionDSL.g:3796:3: ( ({...}? => ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) ) ) )
        // InternalCloneDetectionDSL.g:3796:3: ({...}? => ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) ) )
        {
        // InternalCloneDetectionDSL.g:3796:3: ({...}? => ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) ) )
        // InternalCloneDetectionDSL.g:3797:4: {...}? => ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred49_InternalCloneDetectionDSL", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3)");
        }
        // InternalCloneDetectionDSL.g:3797:108: ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) )
        // InternalCloneDetectionDSL.g:3798:5: ( ( rule__CloneDetection__ExcludeAssignment_3 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3);
        // InternalCloneDetectionDSL.g:3804:5: ( ( rule__CloneDetection__ExcludeAssignment_3 ) )
        // InternalCloneDetectionDSL.g:3805:6: ( rule__CloneDetection__ExcludeAssignment_3 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCloneDetectionAccess().getExcludeAssignment_3()); 
        }
        // InternalCloneDetectionDSL.g:3806:6: ( rule__CloneDetection__ExcludeAssignment_3 )
        // InternalCloneDetectionDSL.g:3806:7: rule__CloneDetection__ExcludeAssignment_3
        {
        pushFollow(FOLLOW_2);
        rule__CloneDetection__ExcludeAssignment_3();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred49_InternalCloneDetectionDSL

    // $ANTLR start synpred50_InternalCloneDetectionDSL
    public final void synpred50_InternalCloneDetectionDSL_fragment() throws RecognitionException {   
        // InternalCloneDetectionDSL.g:3811:3: ( ({...}? => ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) ) ) )
        // InternalCloneDetectionDSL.g:3811:3: ({...}? => ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) ) )
        {
        // InternalCloneDetectionDSL.g:3811:3: ({...}? => ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) ) )
        // InternalCloneDetectionDSL.g:3812:4: {...}? => ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred50_InternalCloneDetectionDSL", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4)");
        }
        // InternalCloneDetectionDSL.g:3812:108: ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) )
        // InternalCloneDetectionDSL.g:3813:5: ( ( rule__CloneDetection__SizeAssignment_4 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4);
        // InternalCloneDetectionDSL.g:3819:5: ( ( rule__CloneDetection__SizeAssignment_4 ) )
        // InternalCloneDetectionDSL.g:3820:6: ( rule__CloneDetection__SizeAssignment_4 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCloneDetectionAccess().getSizeAssignment_4()); 
        }
        // InternalCloneDetectionDSL.g:3821:6: ( rule__CloneDetection__SizeAssignment_4 )
        // InternalCloneDetectionDSL.g:3821:7: rule__CloneDetection__SizeAssignment_4
        {
        pushFollow(FOLLOW_2);
        rule__CloneDetection__SizeAssignment_4();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred50_InternalCloneDetectionDSL

    // $ANTLR start synpred51_InternalCloneDetectionDSL
    public final void synpred51_InternalCloneDetectionDSL_fragment() throws RecognitionException {   
        // InternalCloneDetectionDSL.g:3842:8: ( rule__CloneDetection__NotCompareAssignment_5 )
        // InternalCloneDetectionDSL.g:3842:9: rule__CloneDetection__NotCompareAssignment_5
        {
        pushFollow(FOLLOW_2);
        rule__CloneDetection__NotCompareAssignment_5();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_InternalCloneDetectionDSL

    // $ANTLR start synpred52_InternalCloneDetectionDSL
    public final void synpred52_InternalCloneDetectionDSL_fragment() throws RecognitionException {   
        // InternalCloneDetectionDSL.g:3826:3: ( ({...}? => ( ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) ) ) ) )
        // InternalCloneDetectionDSL.g:3826:3: ({...}? => ( ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) ) ) )
        {
        // InternalCloneDetectionDSL.g:3826:3: ({...}? => ( ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) ) ) )
        // InternalCloneDetectionDSL.g:3827:4: {...}? => ( ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred52_InternalCloneDetectionDSL", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5)");
        }
        // InternalCloneDetectionDSL.g:3827:108: ( ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) ) )
        // InternalCloneDetectionDSL.g:3828:5: ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5);
        // InternalCloneDetectionDSL.g:3834:5: ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) )
        // InternalCloneDetectionDSL.g:3835:6: ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* )
        {
        // InternalCloneDetectionDSL.g:3835:6: ( ( rule__CloneDetection__NotCompareAssignment_5 ) )
        // InternalCloneDetectionDSL.g:3836:7: ( rule__CloneDetection__NotCompareAssignment_5 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCloneDetectionAccess().getNotCompareAssignment_5()); 
        }
        // InternalCloneDetectionDSL.g:3837:7: ( rule__CloneDetection__NotCompareAssignment_5 )
        // InternalCloneDetectionDSL.g:3837:8: rule__CloneDetection__NotCompareAssignment_5
        {
        pushFollow(FOLLOW_31);
        rule__CloneDetection__NotCompareAssignment_5();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalCloneDetectionDSL.g:3840:6: ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* )
        // InternalCloneDetectionDSL.g:3841:7: ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )*
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCloneDetectionAccess().getNotCompareAssignment_5()); 
        }
        // InternalCloneDetectionDSL.g:3842:7: ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )*
        loop36:
        do {
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==50) && (synpred51_InternalCloneDetectionDSL())) {
                alt36=1;
            }


            switch (alt36) {
        	case 1 :
        	    // InternalCloneDetectionDSL.g:3842:8: ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5
        	    {
        	    pushFollow(FOLLOW_31);
        	    rule__CloneDetection__NotCompareAssignment_5();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop36;
            }
        } while (true);


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred52_InternalCloneDetectionDSL

    // $ANTLR start synpred53_InternalCloneDetectionDSL
    public final void synpred53_InternalCloneDetectionDSL_fragment() throws RecognitionException {   
        // InternalCloneDetectionDSL.g:3864:8: ( rule__CloneDetection__CompareAssignment_6 )
        // InternalCloneDetectionDSL.g:3864:9: rule__CloneDetection__CompareAssignment_6
        {
        pushFollow(FOLLOW_2);
        rule__CloneDetection__CompareAssignment_6();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_InternalCloneDetectionDSL

    // $ANTLR start synpred54_InternalCloneDetectionDSL
    public final void synpred54_InternalCloneDetectionDSL_fragment() throws RecognitionException {   
        // InternalCloneDetectionDSL.g:3884:2: ( rule__CloneDetection__UnorderedGroup__1 )
        // InternalCloneDetectionDSL.g:3884:2: rule__CloneDetection__UnorderedGroup__1
        {
        pushFollow(FOLLOW_2);
        rule__CloneDetection__UnorderedGroup__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_InternalCloneDetectionDSL

    // $ANTLR start synpred55_InternalCloneDetectionDSL
    public final void synpred55_InternalCloneDetectionDSL_fragment() throws RecognitionException {   
        // InternalCloneDetectionDSL.g:3896:2: ( rule__CloneDetection__UnorderedGroup__2 )
        // InternalCloneDetectionDSL.g:3896:2: rule__CloneDetection__UnorderedGroup__2
        {
        pushFollow(FOLLOW_2);
        rule__CloneDetection__UnorderedGroup__2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_InternalCloneDetectionDSL

    // $ANTLR start synpred56_InternalCloneDetectionDSL
    public final void synpred56_InternalCloneDetectionDSL_fragment() throws RecognitionException {   
        // InternalCloneDetectionDSL.g:3908:2: ( rule__CloneDetection__UnorderedGroup__3 )
        // InternalCloneDetectionDSL.g:3908:2: rule__CloneDetection__UnorderedGroup__3
        {
        pushFollow(FOLLOW_2);
        rule__CloneDetection__UnorderedGroup__3();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_InternalCloneDetectionDSL

    // $ANTLR start synpred57_InternalCloneDetectionDSL
    public final void synpred57_InternalCloneDetectionDSL_fragment() throws RecognitionException {   
        // InternalCloneDetectionDSL.g:3920:2: ( rule__CloneDetection__UnorderedGroup__4 )
        // InternalCloneDetectionDSL.g:3920:2: rule__CloneDetection__UnorderedGroup__4
        {
        pushFollow(FOLLOW_2);
        rule__CloneDetection__UnorderedGroup__4();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_InternalCloneDetectionDSL

    // $ANTLR start synpred58_InternalCloneDetectionDSL
    public final void synpred58_InternalCloneDetectionDSL_fragment() throws RecognitionException {   
        // InternalCloneDetectionDSL.g:3932:2: ( rule__CloneDetection__UnorderedGroup__5 )
        // InternalCloneDetectionDSL.g:3932:2: rule__CloneDetection__UnorderedGroup__5
        {
        pushFollow(FOLLOW_2);
        rule__CloneDetection__UnorderedGroup__5();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_InternalCloneDetectionDSL

    // $ANTLR start synpred59_InternalCloneDetectionDSL
    public final void synpred59_InternalCloneDetectionDSL_fragment() throws RecognitionException {   
        // InternalCloneDetectionDSL.g:3944:2: ( rule__CloneDetection__UnorderedGroup__6 )
        // InternalCloneDetectionDSL.g:3944:2: rule__CloneDetection__UnorderedGroup__6
        {
        pushFollow(FOLLOW_2);
        rule__CloneDetection__UnorderedGroup__6();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_InternalCloneDetectionDSL

    // Delegated rules

    public final boolean synpred46_InternalCloneDetectionDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_InternalCloneDetectionDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalCloneDetectionDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalCloneDetectionDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_InternalCloneDetectionDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_InternalCloneDetectionDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_InternalCloneDetectionDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_InternalCloneDetectionDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_InternalCloneDetectionDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_InternalCloneDetectionDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_InternalCloneDetectionDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_InternalCloneDetectionDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_InternalCloneDetectionDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_InternalCloneDetectionDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_InternalCloneDetectionDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_InternalCloneDetectionDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_InternalCloneDetectionDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_InternalCloneDetectionDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalCloneDetectionDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalCloneDetectionDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_InternalCloneDetectionDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_InternalCloneDetectionDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_InternalCloneDetectionDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_InternalCloneDetectionDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_InternalCloneDetectionDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_InternalCloneDetectionDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_InternalCloneDetectionDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_InternalCloneDetectionDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_InternalCloneDetectionDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_InternalCloneDetectionDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_InternalCloneDetectionDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_InternalCloneDetectionDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA28 dfa28 = new DFA28(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\4\2\uffff\1\0\10\uffff";
    static final String dfa_3s = "\1\67\2\uffff\1\0\10\uffff";
    static final String dfa_4s = "\1\uffff\1\1\10\uffff\1\3\1\2";
    static final String dfa_5s = "\3\uffff\1\0\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\12\25\uffff\5\1\16\uffff\1\3\5\uffff\2\1",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "994:1: rule__BooleanExpressionLevel3__Alternatives : ( ( ( ruleComparisonExpression ) ) | ( ruleBooleanExpressionBracket ) | ( ruleBooleanExpressionConstant ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_3 = input.LA(1);

                         
                        int index4_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalCloneDetectionDSL()) ) {s = 1;}

                        else if ( (synpred5_InternalCloneDetectionDSL()) ) {s = 11;}

                         
                        input.seek(index4_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\1\1\11\uffff";
    static final String dfa_9s = "\1\52\6\uffff\1\0\2\uffff";
    static final String dfa_10s = "\1\63\6\uffff\1\0\2\uffff";
    static final String dfa_11s = "\1\uffff\1\2\7\uffff\1\1";
    static final String dfa_12s = "\7\uffff\1\0\2\uffff}>";
    static final String[] dfa_13s = {
            "\4\1\1\uffff\1\1\2\uffff\1\1\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 3864:7: ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_7 = input.LA(1);

                         
                        int index28_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_InternalCloneDetectionDSL()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index28_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00C10003E0000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000001F0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001050L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00E10003E0000090L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000003F000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0F00000000001000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0F00000000001002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000CBC0000000002L});

}
