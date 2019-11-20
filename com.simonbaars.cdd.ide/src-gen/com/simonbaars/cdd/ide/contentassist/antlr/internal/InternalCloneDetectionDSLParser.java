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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'Subtree'", "'LLOC'", "'SLOC'", "'tokens'", "'declarations'", "'statements'", "'nodes'", "'lines'", "'cyclomatic_complexity'", "'&'", "'|'", "'Subnodes'", "'StringMatch'", "'CompleteMatch'", "'FQI'", "'->'", "'=>'", "'Project'", "'SearchRoot'", "'Match'", "'Exclude'", "','", "'Size'", "'('", "')'", "'DoNotCompare'", "'Compare'", "'%'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalCloneDetectionDSL.g:53:1: entryRuleCloneDetection : ruleCloneDetection EOF ;
    public final void entryRuleCloneDetection() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:54:1: ( ruleCloneDetection EOF )
            // InternalCloneDetectionDSL.g:55:1: ruleCloneDetection EOF
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
    // InternalCloneDetectionDSL.g:62:1: ruleCloneDetection : ( ( rule__CloneDetection__UnorderedGroup ) ) ;
    public final void ruleCloneDetection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:66:2: ( ( ( rule__CloneDetection__UnorderedGroup ) ) )
            // InternalCloneDetectionDSL.g:67:2: ( ( rule__CloneDetection__UnorderedGroup ) )
            {
            // InternalCloneDetectionDSL.g:67:2: ( ( rule__CloneDetection__UnorderedGroup ) )
            // InternalCloneDetectionDSL.g:68:3: ( rule__CloneDetection__UnorderedGroup )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCloneDetectionAccess().getUnorderedGroup()); 
            }
            // InternalCloneDetectionDSL.g:69:3: ( rule__CloneDetection__UnorderedGroup )
            // InternalCloneDetectionDSL.g:69:4: rule__CloneDetection__UnorderedGroup
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
    // InternalCloneDetectionDSL.g:78:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:79:1: ( ruleProject EOF )
            // InternalCloneDetectionDSL.g:80:1: ruleProject EOF
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
    // InternalCloneDetectionDSL.g:87:1: ruleProject : ( ( rule__Project__Group__0 ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:91:2: ( ( ( rule__Project__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:92:2: ( ( rule__Project__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:92:2: ( ( rule__Project__Group__0 ) )
            // InternalCloneDetectionDSL.g:93:3: ( rule__Project__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:94:3: ( rule__Project__Group__0 )
            // InternalCloneDetectionDSL.g:94:4: rule__Project__Group__0
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
    // InternalCloneDetectionDSL.g:103:1: entryRuleSearchRoot : ruleSearchRoot EOF ;
    public final void entryRuleSearchRoot() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:104:1: ( ruleSearchRoot EOF )
            // InternalCloneDetectionDSL.g:105:1: ruleSearchRoot EOF
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
    // InternalCloneDetectionDSL.g:112:1: ruleSearchRoot : ( ( rule__SearchRoot__Group__0 ) ) ;
    public final void ruleSearchRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:116:2: ( ( ( rule__SearchRoot__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:117:2: ( ( rule__SearchRoot__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:117:2: ( ( rule__SearchRoot__Group__0 ) )
            // InternalCloneDetectionDSL.g:118:3: ( rule__SearchRoot__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSearchRootAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:119:3: ( rule__SearchRoot__Group__0 )
            // InternalCloneDetectionDSL.g:119:4: rule__SearchRoot__Group__0
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
    // InternalCloneDetectionDSL.g:128:1: entryRuleMatch : ruleMatch EOF ;
    public final void entryRuleMatch() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:129:1: ( ruleMatch EOF )
            // InternalCloneDetectionDSL.g:130:1: ruleMatch EOF
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
    // InternalCloneDetectionDSL.g:137:1: ruleMatch : ( ( rule__Match__Group__0 ) ) ;
    public final void ruleMatch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:141:2: ( ( ( rule__Match__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:142:2: ( ( rule__Match__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:142:2: ( ( rule__Match__Group__0 ) )
            // InternalCloneDetectionDSL.g:143:3: ( rule__Match__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:144:3: ( rule__Match__Group__0 )
            // InternalCloneDetectionDSL.g:144:4: rule__Match__Group__0
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
    // InternalCloneDetectionDSL.g:153:1: entryRuleExclude : ruleExclude EOF ;
    public final void entryRuleExclude() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:154:1: ( ruleExclude EOF )
            // InternalCloneDetectionDSL.g:155:1: ruleExclude EOF
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
    // InternalCloneDetectionDSL.g:162:1: ruleExclude : ( ( rule__Exclude__Group__0 ) ) ;
    public final void ruleExclude() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:166:2: ( ( ( rule__Exclude__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:167:2: ( ( rule__Exclude__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:167:2: ( ( rule__Exclude__Group__0 ) )
            // InternalCloneDetectionDSL.g:168:3: ( rule__Exclude__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExcludeAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:169:3: ( rule__Exclude__Group__0 )
            // InternalCloneDetectionDSL.g:169:4: rule__Exclude__Group__0
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
    // InternalCloneDetectionDSL.g:178:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:179:1: ( ruleNode EOF )
            // InternalCloneDetectionDSL.g:180:1: ruleNode EOF
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
    // InternalCloneDetectionDSL.g:187:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:191:2: ( ( ( rule__Node__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:192:2: ( ( rule__Node__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:192:2: ( ( rule__Node__Group__0 ) )
            // InternalCloneDetectionDSL.g:193:3: ( rule__Node__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:194:3: ( rule__Node__Group__0 )
            // InternalCloneDetectionDSL.g:194:4: rule__Node__Group__0
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
    // InternalCloneDetectionDSL.g:203:1: entryRuleNodes : ruleNodes EOF ;
    public final void entryRuleNodes() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:204:1: ( ruleNodes EOF )
            // InternalCloneDetectionDSL.g:205:1: ruleNodes EOF
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
    // InternalCloneDetectionDSL.g:212:1: ruleNodes : ( ( rule__Nodes__Group__0 ) ) ;
    public final void ruleNodes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:216:2: ( ( ( rule__Nodes__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:217:2: ( ( rule__Nodes__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:217:2: ( ( rule__Nodes__Group__0 ) )
            // InternalCloneDetectionDSL.g:218:3: ( rule__Nodes__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodesAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:219:3: ( rule__Nodes__Group__0 )
            // InternalCloneDetectionDSL.g:219:4: rule__Nodes__Group__0
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
    // InternalCloneDetectionDSL.g:228:1: entryRuleMinSize : ruleMinSize EOF ;
    public final void entryRuleMinSize() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:229:1: ( ruleMinSize EOF )
            // InternalCloneDetectionDSL.g:230:1: ruleMinSize EOF
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
    // InternalCloneDetectionDSL.g:237:1: ruleMinSize : ( ( rule__MinSize__Group__0 ) ) ;
    public final void ruleMinSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:241:2: ( ( ( rule__MinSize__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:242:2: ( ( rule__MinSize__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:242:2: ( ( rule__MinSize__Group__0 ) )
            // InternalCloneDetectionDSL.g:243:3: ( rule__MinSize__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:244:3: ( rule__MinSize__Group__0 )
            // InternalCloneDetectionDSL.g:244:4: rule__MinSize__Group__0
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
    // InternalCloneDetectionDSL.g:253:1: entryRuleMetricExpr : ruleMetricExpr EOF ;
    public final void entryRuleMetricExpr() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:254:1: ( ruleMetricExpr EOF )
            // InternalCloneDetectionDSL.g:255:1: ruleMetricExpr EOF
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
    // InternalCloneDetectionDSL.g:262:1: ruleMetricExpr : ( ( rule__MetricExpr__Group__0 ) ) ;
    public final void ruleMetricExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:266:2: ( ( ( rule__MetricExpr__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:267:2: ( ( rule__MetricExpr__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:267:2: ( ( rule__MetricExpr__Group__0 ) )
            // InternalCloneDetectionDSL.g:268:3: ( rule__MetricExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricExprAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:269:3: ( rule__MetricExpr__Group__0 )
            // InternalCloneDetectionDSL.g:269:4: rule__MetricExpr__Group__0
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
    // InternalCloneDetectionDSL.g:278:1: entryRuleDoNotCompare : ruleDoNotCompare EOF ;
    public final void entryRuleDoNotCompare() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:279:1: ( ruleDoNotCompare EOF )
            // InternalCloneDetectionDSL.g:280:1: ruleDoNotCompare EOF
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
    // InternalCloneDetectionDSL.g:287:1: ruleDoNotCompare : ( ( rule__DoNotCompare__Group__0 ) ) ;
    public final void ruleDoNotCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:291:2: ( ( ( rule__DoNotCompare__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:292:2: ( ( rule__DoNotCompare__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:292:2: ( ( rule__DoNotCompare__Group__0 ) )
            // InternalCloneDetectionDSL.g:293:3: ( rule__DoNotCompare__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoNotCompareAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:294:3: ( rule__DoNotCompare__Group__0 )
            // InternalCloneDetectionDSL.g:294:4: rule__DoNotCompare__Group__0
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
    // InternalCloneDetectionDSL.g:303:1: entryRuleCompare : ruleCompare EOF ;
    public final void entryRuleCompare() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:304:1: ( ruleCompare EOF )
            // InternalCloneDetectionDSL.g:305:1: ruleCompare EOF
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
    // InternalCloneDetectionDSL.g:312:1: ruleCompare : ( ( rule__Compare__Group__0 ) ) ;
    public final void ruleCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:316:2: ( ( ( rule__Compare__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:317:2: ( ( rule__Compare__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:317:2: ( ( rule__Compare__Group__0 ) )
            // InternalCloneDetectionDSL.g:318:3: ( rule__Compare__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:319:3: ( rule__Compare__Group__0 )
            // InternalCloneDetectionDSL.g:319:4: rule__Compare__Group__0
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
    // InternalCloneDetectionDSL.g:328:1: entryRulePercentage : rulePercentage EOF ;
    public final void entryRulePercentage() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:329:1: ( rulePercentage EOF )
            // InternalCloneDetectionDSL.g:330:1: rulePercentage EOF
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
    // InternalCloneDetectionDSL.g:337:1: rulePercentage : ( ( rule__Percentage__Group__0 ) ) ;
    public final void rulePercentage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:341:2: ( ( ( rule__Percentage__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:342:2: ( ( rule__Percentage__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:342:2: ( ( rule__Percentage__Group__0 ) )
            // InternalCloneDetectionDSL.g:343:3: ( rule__Percentage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPercentageAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:344:3: ( rule__Percentage__Group__0 )
            // InternalCloneDetectionDSL.g:344:4: rule__Percentage__Group__0
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


    // $ANTLR start "ruleMatchTarget"
    // InternalCloneDetectionDSL.g:353:1: ruleMatchTarget : ( ( rule__MatchTarget__Alternatives ) ) ;
    public final void ruleMatchTarget() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:357:1: ( ( ( rule__MatchTarget__Alternatives ) ) )
            // InternalCloneDetectionDSL.g:358:2: ( ( rule__MatchTarget__Alternatives ) )
            {
            // InternalCloneDetectionDSL.g:358:2: ( ( rule__MatchTarget__Alternatives ) )
            // InternalCloneDetectionDSL.g:359:3: ( rule__MatchTarget__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTargetAccess().getAlternatives()); 
            }
            // InternalCloneDetectionDSL.g:360:3: ( rule__MatchTarget__Alternatives )
            // InternalCloneDetectionDSL.g:360:4: rule__MatchTarget__Alternatives
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
    // InternalCloneDetectionDSL.g:369:1: ruleSizeMetric : ( ( rule__SizeMetric__Alternatives ) ) ;
    public final void ruleSizeMetric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:373:1: ( ( ( rule__SizeMetric__Alternatives ) ) )
            // InternalCloneDetectionDSL.g:374:2: ( ( rule__SizeMetric__Alternatives ) )
            {
            // InternalCloneDetectionDSL.g:374:2: ( ( rule__SizeMetric__Alternatives ) )
            // InternalCloneDetectionDSL.g:375:3: ( rule__SizeMetric__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeMetricAccess().getAlternatives()); 
            }
            // InternalCloneDetectionDSL.g:376:3: ( rule__SizeMetric__Alternatives )
            // InternalCloneDetectionDSL.g:376:4: rule__SizeMetric__Alternatives
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
    // InternalCloneDetectionDSL.g:385:1: ruleBoolOperator : ( ( rule__BoolOperator__Alternatives ) ) ;
    public final void ruleBoolOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:389:1: ( ( ( rule__BoolOperator__Alternatives ) ) )
            // InternalCloneDetectionDSL.g:390:2: ( ( rule__BoolOperator__Alternatives ) )
            {
            // InternalCloneDetectionDSL.g:390:2: ( ( rule__BoolOperator__Alternatives ) )
            // InternalCloneDetectionDSL.g:391:3: ( rule__BoolOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolOperatorAccess().getAlternatives()); 
            }
            // InternalCloneDetectionDSL.g:392:3: ( rule__BoolOperator__Alternatives )
            // InternalCloneDetectionDSL.g:392:4: rule__BoolOperator__Alternatives
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
    // InternalCloneDetectionDSL.g:401:1: ruleMethod : ( ( rule__Method__Alternatives ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:405:1: ( ( ( rule__Method__Alternatives ) ) )
            // InternalCloneDetectionDSL.g:406:2: ( ( rule__Method__Alternatives ) )
            {
            // InternalCloneDetectionDSL.g:406:2: ( ( rule__Method__Alternatives ) )
            // InternalCloneDetectionDSL.g:407:3: ( rule__Method__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getAlternatives()); 
            }
            // InternalCloneDetectionDSL.g:408:3: ( rule__Method__Alternatives )
            // InternalCloneDetectionDSL.g:408:4: rule__Method__Alternatives
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
    // InternalCloneDetectionDSL.g:417:1: ruleUnder : ( ( rule__Under__Alternatives ) ) ;
    public final void ruleUnder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:421:1: ( ( ( rule__Under__Alternatives ) ) )
            // InternalCloneDetectionDSL.g:422:2: ( ( rule__Under__Alternatives ) )
            {
            // InternalCloneDetectionDSL.g:422:2: ( ( rule__Under__Alternatives ) )
            // InternalCloneDetectionDSL.g:423:3: ( rule__Under__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnderAccess().getAlternatives()); 
            }
            // InternalCloneDetectionDSL.g:424:3: ( rule__Under__Alternatives )
            // InternalCloneDetectionDSL.g:424:4: rule__Under__Alternatives
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


    // $ANTLR start "rule__Node__Alternatives_0"
    // InternalCloneDetectionDSL.g:432:1: rule__Node__Alternatives_0 : ( ( ( rule__Node__NameAssignment_0_0 ) ) | ( '*' ) );
    public final void rule__Node__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:436:1: ( ( ( rule__Node__NameAssignment_0_0 ) ) | ( '*' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==11) ) {
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
                    // InternalCloneDetectionDSL.g:437:2: ( ( rule__Node__NameAssignment_0_0 ) )
                    {
                    // InternalCloneDetectionDSL.g:437:2: ( ( rule__Node__NameAssignment_0_0 ) )
                    // InternalCloneDetectionDSL.g:438:3: ( rule__Node__NameAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getNameAssignment_0_0()); 
                    }
                    // InternalCloneDetectionDSL.g:439:3: ( rule__Node__NameAssignment_0_0 )
                    // InternalCloneDetectionDSL.g:439:4: rule__Node__NameAssignment_0_0
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
                    // InternalCloneDetectionDSL.g:443:2: ( '*' )
                    {
                    // InternalCloneDetectionDSL.g:443:2: ( '*' )
                    // InternalCloneDetectionDSL.g:444:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getAsteriskKeyword_0_1()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
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
    // InternalCloneDetectionDSL.g:453:1: rule__MinSize__Alternatives_1 : ( ( ( rule__MinSize__ExprAssignment_1_0 ) ) | ( ( rule__MinSize__Group_1_1__0 ) ) );
    public final void rule__MinSize__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:457:1: ( ( ( rule__MinSize__ExprAssignment_1_0 ) ) | ( ( rule__MinSize__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                alt2=1;
            }
            else if ( (LA2_0==35) ) {
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
                    // InternalCloneDetectionDSL.g:458:2: ( ( rule__MinSize__ExprAssignment_1_0 ) )
                    {
                    // InternalCloneDetectionDSL.g:458:2: ( ( rule__MinSize__ExprAssignment_1_0 ) )
                    // InternalCloneDetectionDSL.g:459:3: ( rule__MinSize__ExprAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMinSizeAccess().getExprAssignment_1_0()); 
                    }
                    // InternalCloneDetectionDSL.g:460:3: ( rule__MinSize__ExprAssignment_1_0 )
                    // InternalCloneDetectionDSL.g:460:4: rule__MinSize__ExprAssignment_1_0
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
                    // InternalCloneDetectionDSL.g:464:2: ( ( rule__MinSize__Group_1_1__0 ) )
                    {
                    // InternalCloneDetectionDSL.g:464:2: ( ( rule__MinSize__Group_1_1__0 ) )
                    // InternalCloneDetectionDSL.g:465:3: ( rule__MinSize__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMinSizeAccess().getGroup_1_1()); 
                    }
                    // InternalCloneDetectionDSL.g:466:3: ( rule__MinSize__Group_1_1__0 )
                    // InternalCloneDetectionDSL.g:466:4: rule__MinSize__Group_1_1__0
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


    // $ANTLR start "rule__MatchTarget__Alternatives"
    // InternalCloneDetectionDSL.g:474:1: rule__MatchTarget__Alternatives : ( ( ( 'Subtree' ) ) | ( ( 'LLOC' ) ) | ( ( 'SLOC' ) ) );
    public final void rule__MatchTarget__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:478:1: ( ( ( 'Subtree' ) ) | ( ( 'LLOC' ) ) | ( ( 'SLOC' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalCloneDetectionDSL.g:479:2: ( ( 'Subtree' ) )
                    {
                    // InternalCloneDetectionDSL.g:479:2: ( ( 'Subtree' ) )
                    // InternalCloneDetectionDSL.g:480:3: ( 'Subtree' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMatchTargetAccess().getSubtreeEnumLiteralDeclaration_0()); 
                    }
                    // InternalCloneDetectionDSL.g:481:3: ( 'Subtree' )
                    // InternalCloneDetectionDSL.g:481:4: 'Subtree'
                    {
                    match(input,12,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMatchTargetAccess().getSubtreeEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:485:2: ( ( 'LLOC' ) )
                    {
                    // InternalCloneDetectionDSL.g:485:2: ( ( 'LLOC' ) )
                    // InternalCloneDetectionDSL.g:486:3: ( 'LLOC' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMatchTargetAccess().getLLOCEnumLiteralDeclaration_1()); 
                    }
                    // InternalCloneDetectionDSL.g:487:3: ( 'LLOC' )
                    // InternalCloneDetectionDSL.g:487:4: 'LLOC'
                    {
                    match(input,13,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMatchTargetAccess().getLLOCEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCloneDetectionDSL.g:491:2: ( ( 'SLOC' ) )
                    {
                    // InternalCloneDetectionDSL.g:491:2: ( ( 'SLOC' ) )
                    // InternalCloneDetectionDSL.g:492:3: ( 'SLOC' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMatchTargetAccess().getSLOCEnumLiteralDeclaration_2()); 
                    }
                    // InternalCloneDetectionDSL.g:493:3: ( 'SLOC' )
                    // InternalCloneDetectionDSL.g:493:4: 'SLOC'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

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
    // InternalCloneDetectionDSL.g:501:1: rule__SizeMetric__Alternatives : ( ( ( 'tokens' ) ) | ( ( 'declarations' ) ) | ( ( 'statements' ) ) | ( ( 'nodes' ) ) | ( ( 'lines' ) ) | ( ( 'cyclomatic_complexity' ) ) );
    public final void rule__SizeMetric__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:505:1: ( ( ( 'tokens' ) ) | ( ( 'declarations' ) ) | ( ( 'statements' ) ) | ( ( 'nodes' ) ) | ( ( 'lines' ) ) | ( ( 'cyclomatic_complexity' ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            case 18:
                {
                alt4=4;
                }
                break;
            case 19:
                {
                alt4=5;
                }
                break;
            case 20:
                {
                alt4=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalCloneDetectionDSL.g:506:2: ( ( 'tokens' ) )
                    {
                    // InternalCloneDetectionDSL.g:506:2: ( ( 'tokens' ) )
                    // InternalCloneDetectionDSL.g:507:3: ( 'tokens' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSizeMetricAccess().getTokensEnumLiteralDeclaration_0()); 
                    }
                    // InternalCloneDetectionDSL.g:508:3: ( 'tokens' )
                    // InternalCloneDetectionDSL.g:508:4: 'tokens'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSizeMetricAccess().getTokensEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:512:2: ( ( 'declarations' ) )
                    {
                    // InternalCloneDetectionDSL.g:512:2: ( ( 'declarations' ) )
                    // InternalCloneDetectionDSL.g:513:3: ( 'declarations' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSizeMetricAccess().getDeclarationsEnumLiteralDeclaration_1()); 
                    }
                    // InternalCloneDetectionDSL.g:514:3: ( 'declarations' )
                    // InternalCloneDetectionDSL.g:514:4: 'declarations'
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSizeMetricAccess().getDeclarationsEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCloneDetectionDSL.g:518:2: ( ( 'statements' ) )
                    {
                    // InternalCloneDetectionDSL.g:518:2: ( ( 'statements' ) )
                    // InternalCloneDetectionDSL.g:519:3: ( 'statements' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSizeMetricAccess().getStatementsEnumLiteralDeclaration_2()); 
                    }
                    // InternalCloneDetectionDSL.g:520:3: ( 'statements' )
                    // InternalCloneDetectionDSL.g:520:4: 'statements'
                    {
                    match(input,17,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSizeMetricAccess().getStatementsEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCloneDetectionDSL.g:524:2: ( ( 'nodes' ) )
                    {
                    // InternalCloneDetectionDSL.g:524:2: ( ( 'nodes' ) )
                    // InternalCloneDetectionDSL.g:525:3: ( 'nodes' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSizeMetricAccess().getNodesEnumLiteralDeclaration_3()); 
                    }
                    // InternalCloneDetectionDSL.g:526:3: ( 'nodes' )
                    // InternalCloneDetectionDSL.g:526:4: 'nodes'
                    {
                    match(input,18,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSizeMetricAccess().getNodesEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalCloneDetectionDSL.g:530:2: ( ( 'lines' ) )
                    {
                    // InternalCloneDetectionDSL.g:530:2: ( ( 'lines' ) )
                    // InternalCloneDetectionDSL.g:531:3: ( 'lines' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSizeMetricAccess().getLinesEnumLiteralDeclaration_4()); 
                    }
                    // InternalCloneDetectionDSL.g:532:3: ( 'lines' )
                    // InternalCloneDetectionDSL.g:532:4: 'lines'
                    {
                    match(input,19,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSizeMetricAccess().getLinesEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalCloneDetectionDSL.g:536:2: ( ( 'cyclomatic_complexity' ) )
                    {
                    // InternalCloneDetectionDSL.g:536:2: ( ( 'cyclomatic_complexity' ) )
                    // InternalCloneDetectionDSL.g:537:3: ( 'cyclomatic_complexity' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSizeMetricAccess().getCyclomatic_complexityEnumLiteralDeclaration_5()); 
                    }
                    // InternalCloneDetectionDSL.g:538:3: ( 'cyclomatic_complexity' )
                    // InternalCloneDetectionDSL.g:538:4: 'cyclomatic_complexity'
                    {
                    match(input,20,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSizeMetricAccess().getCyclomatic_complexityEnumLiteralDeclaration_5()); 
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
    // InternalCloneDetectionDSL.g:546:1: rule__BoolOperator__Alternatives : ( ( ( '&' ) ) | ( ( '|' ) ) );
    public final void rule__BoolOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:550:1: ( ( ( '&' ) ) | ( ( '|' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
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
                    // InternalCloneDetectionDSL.g:551:2: ( ( '&' ) )
                    {
                    // InternalCloneDetectionDSL.g:551:2: ( ( '&' ) )
                    // InternalCloneDetectionDSL.g:552:3: ( '&' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoolOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }
                    // InternalCloneDetectionDSL.g:553:3: ( '&' )
                    // InternalCloneDetectionDSL.g:553:4: '&'
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
                    // InternalCloneDetectionDSL.g:557:2: ( ( '|' ) )
                    {
                    // InternalCloneDetectionDSL.g:557:2: ( ( '|' ) )
                    // InternalCloneDetectionDSL.g:558:3: ( '|' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoolOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    }
                    // InternalCloneDetectionDSL.g:559:3: ( '|' )
                    // InternalCloneDetectionDSL.g:559:4: '|'
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
    // InternalCloneDetectionDSL.g:567:1: rule__Method__Alternatives : ( ( ( 'Subnodes' ) ) | ( ( 'StringMatch' ) ) | ( ( 'CompleteMatch' ) ) | ( ( 'FQI' ) ) );
    public final void rule__Method__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:571:1: ( ( ( 'Subnodes' ) ) | ( ( 'StringMatch' ) ) | ( ( 'CompleteMatch' ) ) | ( ( 'FQI' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 25:
                {
                alt6=3;
                }
                break;
            case 26:
                {
                alt6=4;
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
                    // InternalCloneDetectionDSL.g:572:2: ( ( 'Subnodes' ) )
                    {
                    // InternalCloneDetectionDSL.g:572:2: ( ( 'Subnodes' ) )
                    // InternalCloneDetectionDSL.g:573:3: ( 'Subnodes' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodAccess().getSubnodesEnumLiteralDeclaration_0()); 
                    }
                    // InternalCloneDetectionDSL.g:574:3: ( 'Subnodes' )
                    // InternalCloneDetectionDSL.g:574:4: 'Subnodes'
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
                    // InternalCloneDetectionDSL.g:578:2: ( ( 'StringMatch' ) )
                    {
                    // InternalCloneDetectionDSL.g:578:2: ( ( 'StringMatch' ) )
                    // InternalCloneDetectionDSL.g:579:3: ( 'StringMatch' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodAccess().getStringMatchEnumLiteralDeclaration_1()); 
                    }
                    // InternalCloneDetectionDSL.g:580:3: ( 'StringMatch' )
                    // InternalCloneDetectionDSL.g:580:4: 'StringMatch'
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
                    // InternalCloneDetectionDSL.g:584:2: ( ( 'CompleteMatch' ) )
                    {
                    // InternalCloneDetectionDSL.g:584:2: ( ( 'CompleteMatch' ) )
                    // InternalCloneDetectionDSL.g:585:3: ( 'CompleteMatch' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodAccess().getCompleteMatchEnumLiteralDeclaration_2()); 
                    }
                    // InternalCloneDetectionDSL.g:586:3: ( 'CompleteMatch' )
                    // InternalCloneDetectionDSL.g:586:4: 'CompleteMatch'
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
                    // InternalCloneDetectionDSL.g:590:2: ( ( 'FQI' ) )
                    {
                    // InternalCloneDetectionDSL.g:590:2: ( ( 'FQI' ) )
                    // InternalCloneDetectionDSL.g:591:3: ( 'FQI' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodAccess().getFQIEnumLiteralDeclaration_3()); 
                    }
                    // InternalCloneDetectionDSL.g:592:3: ( 'FQI' )
                    // InternalCloneDetectionDSL.g:592:4: 'FQI'
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
    // InternalCloneDetectionDSL.g:600:1: rule__Under__Alternatives : ( ( ( '->' ) ) | ( ( '=>' ) ) );
    public final void rule__Under__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:604:1: ( ( ( '->' ) ) | ( ( '=>' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            else if ( (LA7_0==28) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCloneDetectionDSL.g:605:2: ( ( '->' ) )
                    {
                    // InternalCloneDetectionDSL.g:605:2: ( ( '->' ) )
                    // InternalCloneDetectionDSL.g:606:3: ( '->' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnderAccess().getOneLevelEnumLiteralDeclaration_0()); 
                    }
                    // InternalCloneDetectionDSL.g:607:3: ( '->' )
                    // InternalCloneDetectionDSL.g:607:4: '->'
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
                    // InternalCloneDetectionDSL.g:611:2: ( ( '=>' ) )
                    {
                    // InternalCloneDetectionDSL.g:611:2: ( ( '=>' ) )
                    // InternalCloneDetectionDSL.g:612:3: ( '=>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnderAccess().getAnyLevelEnumLiteralDeclaration_1()); 
                    }
                    // InternalCloneDetectionDSL.g:613:3: ( '=>' )
                    // InternalCloneDetectionDSL.g:613:4: '=>'
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


    // $ANTLR start "rule__Project__Group__0"
    // InternalCloneDetectionDSL.g:621:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:625:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // InternalCloneDetectionDSL.g:626:2: rule__Project__Group__0__Impl rule__Project__Group__1
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
    // InternalCloneDetectionDSL.g:633:1: rule__Project__Group__0__Impl : ( 'Project' ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:637:1: ( ( 'Project' ) )
            // InternalCloneDetectionDSL.g:638:1: ( 'Project' )
            {
            // InternalCloneDetectionDSL.g:638:1: ( 'Project' )
            // InternalCloneDetectionDSL.g:639:2: 'Project'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectAccess().getProjectKeyword_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalCloneDetectionDSL.g:648:1: rule__Project__Group__1 : rule__Project__Group__1__Impl ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:652:1: ( rule__Project__Group__1__Impl )
            // InternalCloneDetectionDSL.g:653:2: rule__Project__Group__1__Impl
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
    // InternalCloneDetectionDSL.g:659:1: rule__Project__Group__1__Impl : ( ( rule__Project__PathAssignment_1 ) ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:663:1: ( ( ( rule__Project__PathAssignment_1 ) ) )
            // InternalCloneDetectionDSL.g:664:1: ( ( rule__Project__PathAssignment_1 ) )
            {
            // InternalCloneDetectionDSL.g:664:1: ( ( rule__Project__PathAssignment_1 ) )
            // InternalCloneDetectionDSL.g:665:2: ( rule__Project__PathAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectAccess().getPathAssignment_1()); 
            }
            // InternalCloneDetectionDSL.g:666:2: ( rule__Project__PathAssignment_1 )
            // InternalCloneDetectionDSL.g:666:3: rule__Project__PathAssignment_1
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
    // InternalCloneDetectionDSL.g:675:1: rule__SearchRoot__Group__0 : rule__SearchRoot__Group__0__Impl rule__SearchRoot__Group__1 ;
    public final void rule__SearchRoot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:679:1: ( rule__SearchRoot__Group__0__Impl rule__SearchRoot__Group__1 )
            // InternalCloneDetectionDSL.g:680:2: rule__SearchRoot__Group__0__Impl rule__SearchRoot__Group__1
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
    // InternalCloneDetectionDSL.g:687:1: rule__SearchRoot__Group__0__Impl : ( 'SearchRoot' ) ;
    public final void rule__SearchRoot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:691:1: ( ( 'SearchRoot' ) )
            // InternalCloneDetectionDSL.g:692:1: ( 'SearchRoot' )
            {
            // InternalCloneDetectionDSL.g:692:1: ( 'SearchRoot' )
            // InternalCloneDetectionDSL.g:693:2: 'SearchRoot'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSearchRootAccess().getSearchRootKeyword_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalCloneDetectionDSL.g:702:1: rule__SearchRoot__Group__1 : rule__SearchRoot__Group__1__Impl ;
    public final void rule__SearchRoot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:706:1: ( rule__SearchRoot__Group__1__Impl )
            // InternalCloneDetectionDSL.g:707:2: rule__SearchRoot__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SearchRoot__Group__1__Impl();

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
    // InternalCloneDetectionDSL.g:713:1: rule__SearchRoot__Group__1__Impl : ( ( rule__SearchRoot__NodesAssignment_1 ) ) ;
    public final void rule__SearchRoot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:717:1: ( ( ( rule__SearchRoot__NodesAssignment_1 ) ) )
            // InternalCloneDetectionDSL.g:718:1: ( ( rule__SearchRoot__NodesAssignment_1 ) )
            {
            // InternalCloneDetectionDSL.g:718:1: ( ( rule__SearchRoot__NodesAssignment_1 ) )
            // InternalCloneDetectionDSL.g:719:2: ( rule__SearchRoot__NodesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSearchRootAccess().getNodesAssignment_1()); 
            }
            // InternalCloneDetectionDSL.g:720:2: ( rule__SearchRoot__NodesAssignment_1 )
            // InternalCloneDetectionDSL.g:720:3: rule__SearchRoot__NodesAssignment_1
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


    // $ANTLR start "rule__Match__Group__0"
    // InternalCloneDetectionDSL.g:729:1: rule__Match__Group__0 : rule__Match__Group__0__Impl rule__Match__Group__1 ;
    public final void rule__Match__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:733:1: ( rule__Match__Group__0__Impl rule__Match__Group__1 )
            // InternalCloneDetectionDSL.g:734:2: rule__Match__Group__0__Impl rule__Match__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalCloneDetectionDSL.g:741:1: rule__Match__Group__0__Impl : ( 'Match' ) ;
    public final void rule__Match__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:745:1: ( ( 'Match' ) )
            // InternalCloneDetectionDSL.g:746:1: ( 'Match' )
            {
            // InternalCloneDetectionDSL.g:746:1: ( 'Match' )
            // InternalCloneDetectionDSL.g:747:2: 'Match'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchAccess().getMatchKeyword_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalCloneDetectionDSL.g:756:1: rule__Match__Group__1 : rule__Match__Group__1__Impl ;
    public final void rule__Match__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:760:1: ( rule__Match__Group__1__Impl )
            // InternalCloneDetectionDSL.g:761:2: rule__Match__Group__1__Impl
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
    // InternalCloneDetectionDSL.g:767:1: rule__Match__Group__1__Impl : ( ( rule__Match__TargetAssignment_1 ) ) ;
    public final void rule__Match__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:771:1: ( ( ( rule__Match__TargetAssignment_1 ) ) )
            // InternalCloneDetectionDSL.g:772:1: ( ( rule__Match__TargetAssignment_1 ) )
            {
            // InternalCloneDetectionDSL.g:772:1: ( ( rule__Match__TargetAssignment_1 ) )
            // InternalCloneDetectionDSL.g:773:2: ( rule__Match__TargetAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchAccess().getTargetAssignment_1()); 
            }
            // InternalCloneDetectionDSL.g:774:2: ( rule__Match__TargetAssignment_1 )
            // InternalCloneDetectionDSL.g:774:3: rule__Match__TargetAssignment_1
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
    // InternalCloneDetectionDSL.g:783:1: rule__Exclude__Group__0 : rule__Exclude__Group__0__Impl rule__Exclude__Group__1 ;
    public final void rule__Exclude__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:787:1: ( rule__Exclude__Group__0__Impl rule__Exclude__Group__1 )
            // InternalCloneDetectionDSL.g:788:2: rule__Exclude__Group__0__Impl rule__Exclude__Group__1
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
    // InternalCloneDetectionDSL.g:795:1: rule__Exclude__Group__0__Impl : ( 'Exclude' ) ;
    public final void rule__Exclude__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:799:1: ( ( 'Exclude' ) )
            // InternalCloneDetectionDSL.g:800:1: ( 'Exclude' )
            {
            // InternalCloneDetectionDSL.g:800:1: ( 'Exclude' )
            // InternalCloneDetectionDSL.g:801:2: 'Exclude'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExcludeAccess().getExcludeKeyword_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalCloneDetectionDSL.g:810:1: rule__Exclude__Group__1 : rule__Exclude__Group__1__Impl ;
    public final void rule__Exclude__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:814:1: ( rule__Exclude__Group__1__Impl )
            // InternalCloneDetectionDSL.g:815:2: rule__Exclude__Group__1__Impl
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
    // InternalCloneDetectionDSL.g:821:1: rule__Exclude__Group__1__Impl : ( ruleNodes ) ;
    public final void rule__Exclude__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:825:1: ( ( ruleNodes ) )
            // InternalCloneDetectionDSL.g:826:1: ( ruleNodes )
            {
            // InternalCloneDetectionDSL.g:826:1: ( ruleNodes )
            // InternalCloneDetectionDSL.g:827:2: ruleNodes
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
    // InternalCloneDetectionDSL.g:837:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:841:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalCloneDetectionDSL.g:842:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalCloneDetectionDSL.g:849:1: rule__Node__Group__0__Impl : ( ( rule__Node__Alternatives_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:853:1: ( ( ( rule__Node__Alternatives_0 ) ) )
            // InternalCloneDetectionDSL.g:854:1: ( ( rule__Node__Alternatives_0 ) )
            {
            // InternalCloneDetectionDSL.g:854:1: ( ( rule__Node__Alternatives_0 ) )
            // InternalCloneDetectionDSL.g:855:2: ( rule__Node__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getAlternatives_0()); 
            }
            // InternalCloneDetectionDSL.g:856:2: ( rule__Node__Alternatives_0 )
            // InternalCloneDetectionDSL.g:856:3: rule__Node__Alternatives_0
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
    // InternalCloneDetectionDSL.g:864:1: rule__Node__Group__1 : rule__Node__Group__1__Impl ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:868:1: ( rule__Node__Group__1__Impl )
            // InternalCloneDetectionDSL.g:869:2: rule__Node__Group__1__Impl
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
    // InternalCloneDetectionDSL.g:875:1: rule__Node__Group__1__Impl : ( ( rule__Node__Group_1__0 )? ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:879:1: ( ( ( rule__Node__Group_1__0 )? ) )
            // InternalCloneDetectionDSL.g:880:1: ( ( rule__Node__Group_1__0 )? )
            {
            // InternalCloneDetectionDSL.g:880:1: ( ( rule__Node__Group_1__0 )? )
            // InternalCloneDetectionDSL.g:881:2: ( rule__Node__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup_1()); 
            }
            // InternalCloneDetectionDSL.g:882:2: ( rule__Node__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=27 && LA8_0<=28)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCloneDetectionDSL.g:882:3: rule__Node__Group_1__0
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
    // InternalCloneDetectionDSL.g:891:1: rule__Node__Group_1__0 : rule__Node__Group_1__0__Impl rule__Node__Group_1__1 ;
    public final void rule__Node__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:895:1: ( rule__Node__Group_1__0__Impl rule__Node__Group_1__1 )
            // InternalCloneDetectionDSL.g:896:2: rule__Node__Group_1__0__Impl rule__Node__Group_1__1
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
    // InternalCloneDetectionDSL.g:903:1: rule__Node__Group_1__0__Impl : ( ( rule__Node__UnderAssignment_1_0 ) ) ;
    public final void rule__Node__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:907:1: ( ( ( rule__Node__UnderAssignment_1_0 ) ) )
            // InternalCloneDetectionDSL.g:908:1: ( ( rule__Node__UnderAssignment_1_0 ) )
            {
            // InternalCloneDetectionDSL.g:908:1: ( ( rule__Node__UnderAssignment_1_0 ) )
            // InternalCloneDetectionDSL.g:909:2: ( rule__Node__UnderAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getUnderAssignment_1_0()); 
            }
            // InternalCloneDetectionDSL.g:910:2: ( rule__Node__UnderAssignment_1_0 )
            // InternalCloneDetectionDSL.g:910:3: rule__Node__UnderAssignment_1_0
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
    // InternalCloneDetectionDSL.g:918:1: rule__Node__Group_1__1 : rule__Node__Group_1__1__Impl ;
    public final void rule__Node__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:922:1: ( rule__Node__Group_1__1__Impl )
            // InternalCloneDetectionDSL.g:923:2: rule__Node__Group_1__1__Impl
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
    // InternalCloneDetectionDSL.g:929:1: rule__Node__Group_1__1__Impl : ( ( rule__Node__NodeAssignment_1_1 ) ) ;
    public final void rule__Node__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:933:1: ( ( ( rule__Node__NodeAssignment_1_1 ) ) )
            // InternalCloneDetectionDSL.g:934:1: ( ( rule__Node__NodeAssignment_1_1 ) )
            {
            // InternalCloneDetectionDSL.g:934:1: ( ( rule__Node__NodeAssignment_1_1 ) )
            // InternalCloneDetectionDSL.g:935:2: ( rule__Node__NodeAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getNodeAssignment_1_1()); 
            }
            // InternalCloneDetectionDSL.g:936:2: ( rule__Node__NodeAssignment_1_1 )
            // InternalCloneDetectionDSL.g:936:3: rule__Node__NodeAssignment_1_1
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
    // InternalCloneDetectionDSL.g:945:1: rule__Nodes__Group__0 : rule__Nodes__Group__0__Impl rule__Nodes__Group__1 ;
    public final void rule__Nodes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:949:1: ( rule__Nodes__Group__0__Impl rule__Nodes__Group__1 )
            // InternalCloneDetectionDSL.g:950:2: rule__Nodes__Group__0__Impl rule__Nodes__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCloneDetectionDSL.g:957:1: rule__Nodes__Group__0__Impl : ( ( rule__Nodes__NodeAssignment_0 ) ) ;
    public final void rule__Nodes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:961:1: ( ( ( rule__Nodes__NodeAssignment_0 ) ) )
            // InternalCloneDetectionDSL.g:962:1: ( ( rule__Nodes__NodeAssignment_0 ) )
            {
            // InternalCloneDetectionDSL.g:962:1: ( ( rule__Nodes__NodeAssignment_0 ) )
            // InternalCloneDetectionDSL.g:963:2: ( rule__Nodes__NodeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodesAccess().getNodeAssignment_0()); 
            }
            // InternalCloneDetectionDSL.g:964:2: ( rule__Nodes__NodeAssignment_0 )
            // InternalCloneDetectionDSL.g:964:3: rule__Nodes__NodeAssignment_0
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
    // InternalCloneDetectionDSL.g:972:1: rule__Nodes__Group__1 : rule__Nodes__Group__1__Impl ;
    public final void rule__Nodes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:976:1: ( rule__Nodes__Group__1__Impl )
            // InternalCloneDetectionDSL.g:977:2: rule__Nodes__Group__1__Impl
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
    // InternalCloneDetectionDSL.g:983:1: rule__Nodes__Group__1__Impl : ( ( rule__Nodes__Group_1__0 )? ) ;
    public final void rule__Nodes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:987:1: ( ( ( rule__Nodes__Group_1__0 )? ) )
            // InternalCloneDetectionDSL.g:988:1: ( ( rule__Nodes__Group_1__0 )? )
            {
            // InternalCloneDetectionDSL.g:988:1: ( ( rule__Nodes__Group_1__0 )? )
            // InternalCloneDetectionDSL.g:989:2: ( rule__Nodes__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodesAccess().getGroup_1()); 
            }
            // InternalCloneDetectionDSL.g:990:2: ( rule__Nodes__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==33) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCloneDetectionDSL.g:990:3: rule__Nodes__Group_1__0
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
    // InternalCloneDetectionDSL.g:999:1: rule__Nodes__Group_1__0 : rule__Nodes__Group_1__0__Impl rule__Nodes__Group_1__1 ;
    public final void rule__Nodes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1003:1: ( rule__Nodes__Group_1__0__Impl rule__Nodes__Group_1__1 )
            // InternalCloneDetectionDSL.g:1004:2: rule__Nodes__Group_1__0__Impl rule__Nodes__Group_1__1
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
    // InternalCloneDetectionDSL.g:1011:1: rule__Nodes__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Nodes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1015:1: ( ( ',' ) )
            // InternalCloneDetectionDSL.g:1016:1: ( ',' )
            {
            // InternalCloneDetectionDSL.g:1016:1: ( ',' )
            // InternalCloneDetectionDSL.g:1017:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodesAccess().getCommaKeyword_1_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalCloneDetectionDSL.g:1026:1: rule__Nodes__Group_1__1 : rule__Nodes__Group_1__1__Impl ;
    public final void rule__Nodes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1030:1: ( rule__Nodes__Group_1__1__Impl )
            // InternalCloneDetectionDSL.g:1031:2: rule__Nodes__Group_1__1__Impl
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
    // InternalCloneDetectionDSL.g:1037:1: rule__Nodes__Group_1__1__Impl : ( ( rule__Nodes__NodesAssignment_1_1 ) ) ;
    public final void rule__Nodes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1041:1: ( ( ( rule__Nodes__NodesAssignment_1_1 ) ) )
            // InternalCloneDetectionDSL.g:1042:1: ( ( rule__Nodes__NodesAssignment_1_1 ) )
            {
            // InternalCloneDetectionDSL.g:1042:1: ( ( rule__Nodes__NodesAssignment_1_1 ) )
            // InternalCloneDetectionDSL.g:1043:2: ( rule__Nodes__NodesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodesAccess().getNodesAssignment_1_1()); 
            }
            // InternalCloneDetectionDSL.g:1044:2: ( rule__Nodes__NodesAssignment_1_1 )
            // InternalCloneDetectionDSL.g:1044:3: rule__Nodes__NodesAssignment_1_1
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
    // InternalCloneDetectionDSL.g:1053:1: rule__MinSize__Group__0 : rule__MinSize__Group__0__Impl rule__MinSize__Group__1 ;
    public final void rule__MinSize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1057:1: ( rule__MinSize__Group__0__Impl rule__MinSize__Group__1 )
            // InternalCloneDetectionDSL.g:1058:2: rule__MinSize__Group__0__Impl rule__MinSize__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCloneDetectionDSL.g:1065:1: rule__MinSize__Group__0__Impl : ( 'Size' ) ;
    public final void rule__MinSize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1069:1: ( ( 'Size' ) )
            // InternalCloneDetectionDSL.g:1070:1: ( 'Size' )
            {
            // InternalCloneDetectionDSL.g:1070:1: ( 'Size' )
            // InternalCloneDetectionDSL.g:1071:2: 'Size'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getSizeKeyword_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalCloneDetectionDSL.g:1080:1: rule__MinSize__Group__1 : rule__MinSize__Group__1__Impl rule__MinSize__Group__2 ;
    public final void rule__MinSize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1084:1: ( rule__MinSize__Group__1__Impl rule__MinSize__Group__2 )
            // InternalCloneDetectionDSL.g:1085:2: rule__MinSize__Group__1__Impl rule__MinSize__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalCloneDetectionDSL.g:1092:1: rule__MinSize__Group__1__Impl : ( ( rule__MinSize__Alternatives_1 ) ) ;
    public final void rule__MinSize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1096:1: ( ( ( rule__MinSize__Alternatives_1 ) ) )
            // InternalCloneDetectionDSL.g:1097:1: ( ( rule__MinSize__Alternatives_1 ) )
            {
            // InternalCloneDetectionDSL.g:1097:1: ( ( rule__MinSize__Alternatives_1 ) )
            // InternalCloneDetectionDSL.g:1098:2: ( rule__MinSize__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getAlternatives_1()); 
            }
            // InternalCloneDetectionDSL.g:1099:2: ( rule__MinSize__Alternatives_1 )
            // InternalCloneDetectionDSL.g:1099:3: rule__MinSize__Alternatives_1
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
    // InternalCloneDetectionDSL.g:1107:1: rule__MinSize__Group__2 : rule__MinSize__Group__2__Impl ;
    public final void rule__MinSize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1111:1: ( rule__MinSize__Group__2__Impl )
            // InternalCloneDetectionDSL.g:1112:2: rule__MinSize__Group__2__Impl
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
    // InternalCloneDetectionDSL.g:1118:1: rule__MinSize__Group__2__Impl : ( ( rule__MinSize__Group_2__0 )? ) ;
    public final void rule__MinSize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1122:1: ( ( ( rule__MinSize__Group_2__0 )? ) )
            // InternalCloneDetectionDSL.g:1123:1: ( ( rule__MinSize__Group_2__0 )? )
            {
            // InternalCloneDetectionDSL.g:1123:1: ( ( rule__MinSize__Group_2__0 )? )
            // InternalCloneDetectionDSL.g:1124:2: ( rule__MinSize__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getGroup_2()); 
            }
            // InternalCloneDetectionDSL.g:1125:2: ( rule__MinSize__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=21 && LA10_0<=22)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1125:3: rule__MinSize__Group_2__0
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
    // InternalCloneDetectionDSL.g:1134:1: rule__MinSize__Group_1_1__0 : rule__MinSize__Group_1_1__0__Impl rule__MinSize__Group_1_1__1 ;
    public final void rule__MinSize__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1138:1: ( rule__MinSize__Group_1_1__0__Impl rule__MinSize__Group_1_1__1 )
            // InternalCloneDetectionDSL.g:1139:2: rule__MinSize__Group_1_1__0__Impl rule__MinSize__Group_1_1__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalCloneDetectionDSL.g:1146:1: rule__MinSize__Group_1_1__0__Impl : ( '(' ) ;
    public final void rule__MinSize__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1150:1: ( ( '(' ) )
            // InternalCloneDetectionDSL.g:1151:1: ( '(' )
            {
            // InternalCloneDetectionDSL.g:1151:1: ( '(' )
            // InternalCloneDetectionDSL.g:1152:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getLeftParenthesisKeyword_1_1_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalCloneDetectionDSL.g:1161:1: rule__MinSize__Group_1_1__1 : rule__MinSize__Group_1_1__1__Impl rule__MinSize__Group_1_1__2 ;
    public final void rule__MinSize__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1165:1: ( rule__MinSize__Group_1_1__1__Impl rule__MinSize__Group_1_1__2 )
            // InternalCloneDetectionDSL.g:1166:2: rule__MinSize__Group_1_1__1__Impl rule__MinSize__Group_1_1__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalCloneDetectionDSL.g:1173:1: rule__MinSize__Group_1_1__1__Impl : ( ( rule__MinSize__BracketsAssignment_1_1_1 ) ) ;
    public final void rule__MinSize__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1177:1: ( ( ( rule__MinSize__BracketsAssignment_1_1_1 ) ) )
            // InternalCloneDetectionDSL.g:1178:1: ( ( rule__MinSize__BracketsAssignment_1_1_1 ) )
            {
            // InternalCloneDetectionDSL.g:1178:1: ( ( rule__MinSize__BracketsAssignment_1_1_1 ) )
            // InternalCloneDetectionDSL.g:1179:2: ( rule__MinSize__BracketsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getBracketsAssignment_1_1_1()); 
            }
            // InternalCloneDetectionDSL.g:1180:2: ( rule__MinSize__BracketsAssignment_1_1_1 )
            // InternalCloneDetectionDSL.g:1180:3: rule__MinSize__BracketsAssignment_1_1_1
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
    // InternalCloneDetectionDSL.g:1188:1: rule__MinSize__Group_1_1__2 : rule__MinSize__Group_1_1__2__Impl ;
    public final void rule__MinSize__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1192:1: ( rule__MinSize__Group_1_1__2__Impl )
            // InternalCloneDetectionDSL.g:1193:2: rule__MinSize__Group_1_1__2__Impl
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
    // InternalCloneDetectionDSL.g:1199:1: rule__MinSize__Group_1_1__2__Impl : ( ')' ) ;
    public final void rule__MinSize__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1203:1: ( ( ')' ) )
            // InternalCloneDetectionDSL.g:1204:1: ( ')' )
            {
            // InternalCloneDetectionDSL.g:1204:1: ( ')' )
            // InternalCloneDetectionDSL.g:1205:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getRightParenthesisKeyword_1_1_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalCloneDetectionDSL.g:1215:1: rule__MinSize__Group_2__0 : rule__MinSize__Group_2__0__Impl rule__MinSize__Group_2__1 ;
    public final void rule__MinSize__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1219:1: ( rule__MinSize__Group_2__0__Impl rule__MinSize__Group_2__1 )
            // InternalCloneDetectionDSL.g:1220:2: rule__MinSize__Group_2__0__Impl rule__MinSize__Group_2__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalCloneDetectionDSL.g:1227:1: rule__MinSize__Group_2__0__Impl : ( ( rule__MinSize__OperatorAssignment_2_0 ) ) ;
    public final void rule__MinSize__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1231:1: ( ( ( rule__MinSize__OperatorAssignment_2_0 ) ) )
            // InternalCloneDetectionDSL.g:1232:1: ( ( rule__MinSize__OperatorAssignment_2_0 ) )
            {
            // InternalCloneDetectionDSL.g:1232:1: ( ( rule__MinSize__OperatorAssignment_2_0 ) )
            // InternalCloneDetectionDSL.g:1233:2: ( rule__MinSize__OperatorAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getOperatorAssignment_2_0()); 
            }
            // InternalCloneDetectionDSL.g:1234:2: ( rule__MinSize__OperatorAssignment_2_0 )
            // InternalCloneDetectionDSL.g:1234:3: rule__MinSize__OperatorAssignment_2_0
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
    // InternalCloneDetectionDSL.g:1242:1: rule__MinSize__Group_2__1 : rule__MinSize__Group_2__1__Impl ;
    public final void rule__MinSize__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1246:1: ( rule__MinSize__Group_2__1__Impl )
            // InternalCloneDetectionDSL.g:1247:2: rule__MinSize__Group_2__1__Impl
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
    // InternalCloneDetectionDSL.g:1253:1: rule__MinSize__Group_2__1__Impl : ( ( rule__MinSize__SizeAssignment_2_1 ) ) ;
    public final void rule__MinSize__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1257:1: ( ( ( rule__MinSize__SizeAssignment_2_1 ) ) )
            // InternalCloneDetectionDSL.g:1258:1: ( ( rule__MinSize__SizeAssignment_2_1 ) )
            {
            // InternalCloneDetectionDSL.g:1258:1: ( ( rule__MinSize__SizeAssignment_2_1 ) )
            // InternalCloneDetectionDSL.g:1259:2: ( rule__MinSize__SizeAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getSizeAssignment_2_1()); 
            }
            // InternalCloneDetectionDSL.g:1260:2: ( rule__MinSize__SizeAssignment_2_1 )
            // InternalCloneDetectionDSL.g:1260:3: rule__MinSize__SizeAssignment_2_1
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
    // InternalCloneDetectionDSL.g:1269:1: rule__MetricExpr__Group__0 : rule__MetricExpr__Group__0__Impl rule__MetricExpr__Group__1 ;
    public final void rule__MetricExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1273:1: ( rule__MetricExpr__Group__0__Impl rule__MetricExpr__Group__1 )
            // InternalCloneDetectionDSL.g:1274:2: rule__MetricExpr__Group__0__Impl rule__MetricExpr__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalCloneDetectionDSL.g:1281:1: rule__MetricExpr__Group__0__Impl : ( ( rule__MetricExpr__AmountAssignment_0 ) ) ;
    public final void rule__MetricExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1285:1: ( ( ( rule__MetricExpr__AmountAssignment_0 ) ) )
            // InternalCloneDetectionDSL.g:1286:1: ( ( rule__MetricExpr__AmountAssignment_0 ) )
            {
            // InternalCloneDetectionDSL.g:1286:1: ( ( rule__MetricExpr__AmountAssignment_0 ) )
            // InternalCloneDetectionDSL.g:1287:2: ( rule__MetricExpr__AmountAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricExprAccess().getAmountAssignment_0()); 
            }
            // InternalCloneDetectionDSL.g:1288:2: ( rule__MetricExpr__AmountAssignment_0 )
            // InternalCloneDetectionDSL.g:1288:3: rule__MetricExpr__AmountAssignment_0
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
    // InternalCloneDetectionDSL.g:1296:1: rule__MetricExpr__Group__1 : rule__MetricExpr__Group__1__Impl ;
    public final void rule__MetricExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1300:1: ( rule__MetricExpr__Group__1__Impl )
            // InternalCloneDetectionDSL.g:1301:2: rule__MetricExpr__Group__1__Impl
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
    // InternalCloneDetectionDSL.g:1307:1: rule__MetricExpr__Group__1__Impl : ( ( rule__MetricExpr__MetricAssignment_1 ) ) ;
    public final void rule__MetricExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1311:1: ( ( ( rule__MetricExpr__MetricAssignment_1 ) ) )
            // InternalCloneDetectionDSL.g:1312:1: ( ( rule__MetricExpr__MetricAssignment_1 ) )
            {
            // InternalCloneDetectionDSL.g:1312:1: ( ( rule__MetricExpr__MetricAssignment_1 ) )
            // InternalCloneDetectionDSL.g:1313:2: ( rule__MetricExpr__MetricAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricExprAccess().getMetricAssignment_1()); 
            }
            // InternalCloneDetectionDSL.g:1314:2: ( rule__MetricExpr__MetricAssignment_1 )
            // InternalCloneDetectionDSL.g:1314:3: rule__MetricExpr__MetricAssignment_1
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
    // InternalCloneDetectionDSL.g:1323:1: rule__DoNotCompare__Group__0 : rule__DoNotCompare__Group__0__Impl rule__DoNotCompare__Group__1 ;
    public final void rule__DoNotCompare__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1327:1: ( rule__DoNotCompare__Group__0__Impl rule__DoNotCompare__Group__1 )
            // InternalCloneDetectionDSL.g:1328:2: rule__DoNotCompare__Group__0__Impl rule__DoNotCompare__Group__1
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
    // InternalCloneDetectionDSL.g:1335:1: rule__DoNotCompare__Group__0__Impl : ( 'DoNotCompare' ) ;
    public final void rule__DoNotCompare__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1339:1: ( ( 'DoNotCompare' ) )
            // InternalCloneDetectionDSL.g:1340:1: ( 'DoNotCompare' )
            {
            // InternalCloneDetectionDSL.g:1340:1: ( 'DoNotCompare' )
            // InternalCloneDetectionDSL.g:1341:2: 'DoNotCompare'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoNotCompareAccess().getDoNotCompareKeyword_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalCloneDetectionDSL.g:1350:1: rule__DoNotCompare__Group__1 : rule__DoNotCompare__Group__1__Impl ;
    public final void rule__DoNotCompare__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1354:1: ( rule__DoNotCompare__Group__1__Impl )
            // InternalCloneDetectionDSL.g:1355:2: rule__DoNotCompare__Group__1__Impl
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
    // InternalCloneDetectionDSL.g:1361:1: rule__DoNotCompare__Group__1__Impl : ( ruleNodes ) ;
    public final void rule__DoNotCompare__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1365:1: ( ( ruleNodes ) )
            // InternalCloneDetectionDSL.g:1366:1: ( ruleNodes )
            {
            // InternalCloneDetectionDSL.g:1366:1: ( ruleNodes )
            // InternalCloneDetectionDSL.g:1367:2: ruleNodes
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
    // InternalCloneDetectionDSL.g:1377:1: rule__Compare__Group__0 : rule__Compare__Group__0__Impl rule__Compare__Group__1 ;
    public final void rule__Compare__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1381:1: ( rule__Compare__Group__0__Impl rule__Compare__Group__1 )
            // InternalCloneDetectionDSL.g:1382:2: rule__Compare__Group__0__Impl rule__Compare__Group__1
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
    // InternalCloneDetectionDSL.g:1389:1: rule__Compare__Group__0__Impl : ( 'Compare' ) ;
    public final void rule__Compare__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1393:1: ( ( 'Compare' ) )
            // InternalCloneDetectionDSL.g:1394:1: ( 'Compare' )
            {
            // InternalCloneDetectionDSL.g:1394:1: ( 'Compare' )
            // InternalCloneDetectionDSL.g:1395:2: 'Compare'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getCompareKeyword_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalCloneDetectionDSL.g:1404:1: rule__Compare__Group__1 : rule__Compare__Group__1__Impl rule__Compare__Group__2 ;
    public final void rule__Compare__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1408:1: ( rule__Compare__Group__1__Impl rule__Compare__Group__2 )
            // InternalCloneDetectionDSL.g:1409:2: rule__Compare__Group__1__Impl rule__Compare__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalCloneDetectionDSL.g:1416:1: rule__Compare__Group__1__Impl : ( ( rule__Compare__NodesAssignment_1 ) ) ;
    public final void rule__Compare__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1420:1: ( ( ( rule__Compare__NodesAssignment_1 ) ) )
            // InternalCloneDetectionDSL.g:1421:1: ( ( rule__Compare__NodesAssignment_1 ) )
            {
            // InternalCloneDetectionDSL.g:1421:1: ( ( rule__Compare__NodesAssignment_1 ) )
            // InternalCloneDetectionDSL.g:1422:2: ( rule__Compare__NodesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getNodesAssignment_1()); 
            }
            // InternalCloneDetectionDSL.g:1423:2: ( rule__Compare__NodesAssignment_1 )
            // InternalCloneDetectionDSL.g:1423:3: rule__Compare__NodesAssignment_1
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
    // InternalCloneDetectionDSL.g:1431:1: rule__Compare__Group__2 : rule__Compare__Group__2__Impl rule__Compare__Group__3 ;
    public final void rule__Compare__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1435:1: ( rule__Compare__Group__2__Impl rule__Compare__Group__3 )
            // InternalCloneDetectionDSL.g:1436:2: rule__Compare__Group__2__Impl rule__Compare__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalCloneDetectionDSL.g:1443:1: rule__Compare__Group__2__Impl : ( ( rule__Compare__ComparisonMethodAssignment_2 ) ) ;
    public final void rule__Compare__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1447:1: ( ( ( rule__Compare__ComparisonMethodAssignment_2 ) ) )
            // InternalCloneDetectionDSL.g:1448:1: ( ( rule__Compare__ComparisonMethodAssignment_2 ) )
            {
            // InternalCloneDetectionDSL.g:1448:1: ( ( rule__Compare__ComparisonMethodAssignment_2 ) )
            // InternalCloneDetectionDSL.g:1449:2: ( rule__Compare__ComparisonMethodAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getComparisonMethodAssignment_2()); 
            }
            // InternalCloneDetectionDSL.g:1450:2: ( rule__Compare__ComparisonMethodAssignment_2 )
            // InternalCloneDetectionDSL.g:1450:3: rule__Compare__ComparisonMethodAssignment_2
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
    // InternalCloneDetectionDSL.g:1458:1: rule__Compare__Group__3 : rule__Compare__Group__3__Impl rule__Compare__Group__4 ;
    public final void rule__Compare__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1462:1: ( rule__Compare__Group__3__Impl rule__Compare__Group__4 )
            // InternalCloneDetectionDSL.g:1463:2: rule__Compare__Group__3__Impl rule__Compare__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalCloneDetectionDSL.g:1470:1: rule__Compare__Group__3__Impl : ( ( rule__Compare__DeepestNodeAssignment_3 )? ) ;
    public final void rule__Compare__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1474:1: ( ( ( rule__Compare__DeepestNodeAssignment_3 )? ) )
            // InternalCloneDetectionDSL.g:1475:1: ( ( rule__Compare__DeepestNodeAssignment_3 )? )
            {
            // InternalCloneDetectionDSL.g:1475:1: ( ( rule__Compare__DeepestNodeAssignment_3 )? )
            // InternalCloneDetectionDSL.g:1476:2: ( rule__Compare__DeepestNodeAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getDeepestNodeAssignment_3()); 
            }
            // InternalCloneDetectionDSL.g:1477:2: ( rule__Compare__DeepestNodeAssignment_3 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID||LA11_0==11) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1477:3: rule__Compare__DeepestNodeAssignment_3
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
    // InternalCloneDetectionDSL.g:1485:1: rule__Compare__Group__4 : rule__Compare__Group__4__Impl ;
    public final void rule__Compare__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1489:1: ( rule__Compare__Group__4__Impl )
            // InternalCloneDetectionDSL.g:1490:2: rule__Compare__Group__4__Impl
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
    // InternalCloneDetectionDSL.g:1496:1: rule__Compare__Group__4__Impl : ( ( rule__Compare__PercAssignment_4 )? ) ;
    public final void rule__Compare__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1500:1: ( ( ( rule__Compare__PercAssignment_4 )? ) )
            // InternalCloneDetectionDSL.g:1501:1: ( ( rule__Compare__PercAssignment_4 )? )
            {
            // InternalCloneDetectionDSL.g:1501:1: ( ( rule__Compare__PercAssignment_4 )? )
            // InternalCloneDetectionDSL.g:1502:2: ( rule__Compare__PercAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getPercAssignment_4()); 
            }
            // InternalCloneDetectionDSL.g:1503:2: ( rule__Compare__PercAssignment_4 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1503:3: rule__Compare__PercAssignment_4
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
    // InternalCloneDetectionDSL.g:1512:1: rule__Percentage__Group__0 : rule__Percentage__Group__0__Impl rule__Percentage__Group__1 ;
    public final void rule__Percentage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1516:1: ( rule__Percentage__Group__0__Impl rule__Percentage__Group__1 )
            // InternalCloneDetectionDSL.g:1517:2: rule__Percentage__Group__0__Impl rule__Percentage__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalCloneDetectionDSL.g:1524:1: rule__Percentage__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Percentage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1528:1: ( ( RULE_INT ) )
            // InternalCloneDetectionDSL.g:1529:1: ( RULE_INT )
            {
            // InternalCloneDetectionDSL.g:1529:1: ( RULE_INT )
            // InternalCloneDetectionDSL.g:1530:2: RULE_INT
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
    // InternalCloneDetectionDSL.g:1539:1: rule__Percentage__Group__1 : rule__Percentage__Group__1__Impl ;
    public final void rule__Percentage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1543:1: ( rule__Percentage__Group__1__Impl )
            // InternalCloneDetectionDSL.g:1544:2: rule__Percentage__Group__1__Impl
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
    // InternalCloneDetectionDSL.g:1550:1: rule__Percentage__Group__1__Impl : ( '%' ) ;
    public final void rule__Percentage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1554:1: ( ( '%' ) )
            // InternalCloneDetectionDSL.g:1555:1: ( '%' )
            {
            // InternalCloneDetectionDSL.g:1555:1: ( '%' )
            // InternalCloneDetectionDSL.g:1556:2: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPercentageAccess().getPercentSignKeyword_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__CloneDetection__UnorderedGroup"
    // InternalCloneDetectionDSL.g:1566:1: rule__CloneDetection__UnorderedGroup : rule__CloneDetection__UnorderedGroup__0 {...}?;
    public final void rule__CloneDetection__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getCloneDetectionAccess().getUnorderedGroup());
        	
        try {
            // InternalCloneDetectionDSL.g:1571:1: ( rule__CloneDetection__UnorderedGroup__0 {...}?)
            // InternalCloneDetectionDSL.g:1572:2: rule__CloneDetection__UnorderedGroup__0 {...}?
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
    // InternalCloneDetectionDSL.g:1580:1: rule__CloneDetection__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__RootAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* ) ) ) ) ) ;
    public final void rule__CloneDetection__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalCloneDetectionDSL.g:1585:1: ( ( ({...}? => ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__RootAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* ) ) ) ) ) )
            // InternalCloneDetectionDSL.g:1586:3: ( ({...}? => ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__RootAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* ) ) ) ) )
            {
            // InternalCloneDetectionDSL.g:1586:3: ( ({...}? => ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__RootAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* ) ) ) ) )
            int alt15=7;
            int LA15_0 = input.LA(1);

            if ( LA15_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0) ) {
                alt15=1;
            }
            else if ( LA15_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1) ) {
                alt15=2;
            }
            else if ( LA15_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2) ) {
                alt15=3;
            }
            else if ( LA15_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3) ) {
                alt15=4;
            }
            else if ( LA15_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4) ) {
                alt15=5;
            }
            else if ( LA15_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5) ) {
                alt15=6;
            }
            else if ( LA15_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6) ) {
                alt15=7;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1587:3: ({...}? => ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) ) )
                    {
                    // InternalCloneDetectionDSL.g:1587:3: ({...}? => ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) ) )
                    // InternalCloneDetectionDSL.g:1588:4: {...}? => ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__CloneDetection__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalCloneDetectionDSL.g:1588:108: ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) )
                    // InternalCloneDetectionDSL.g:1589:5: ( ( rule__CloneDetection__ProjectAssignment_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0);
                    selected = true;
                    // InternalCloneDetectionDSL.g:1595:5: ( ( rule__CloneDetection__ProjectAssignment_0 ) )
                    // InternalCloneDetectionDSL.g:1596:6: ( rule__CloneDetection__ProjectAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getProjectAssignment_0()); 
                    }
                    // InternalCloneDetectionDSL.g:1597:6: ( rule__CloneDetection__ProjectAssignment_0 )
                    // InternalCloneDetectionDSL.g:1597:7: rule__CloneDetection__ProjectAssignment_0
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
                    // InternalCloneDetectionDSL.g:1602:3: ({...}? => ( ( ( rule__CloneDetection__RootAssignment_1 ) ) ) )
                    {
                    // InternalCloneDetectionDSL.g:1602:3: ({...}? => ( ( ( rule__CloneDetection__RootAssignment_1 ) ) ) )
                    // InternalCloneDetectionDSL.g:1603:4: {...}? => ( ( ( rule__CloneDetection__RootAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__CloneDetection__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalCloneDetectionDSL.g:1603:108: ( ( ( rule__CloneDetection__RootAssignment_1 ) ) )
                    // InternalCloneDetectionDSL.g:1604:5: ( ( rule__CloneDetection__RootAssignment_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1);
                    selected = true;
                    // InternalCloneDetectionDSL.g:1610:5: ( ( rule__CloneDetection__RootAssignment_1 ) )
                    // InternalCloneDetectionDSL.g:1611:6: ( rule__CloneDetection__RootAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getRootAssignment_1()); 
                    }
                    // InternalCloneDetectionDSL.g:1612:6: ( rule__CloneDetection__RootAssignment_1 )
                    // InternalCloneDetectionDSL.g:1612:7: rule__CloneDetection__RootAssignment_1
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
                    // InternalCloneDetectionDSL.g:1617:3: ({...}? => ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) ) )
                    {
                    // InternalCloneDetectionDSL.g:1617:3: ({...}? => ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) ) )
                    // InternalCloneDetectionDSL.g:1618:4: {...}? => ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__CloneDetection__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalCloneDetectionDSL.g:1618:108: ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) )
                    // InternalCloneDetectionDSL.g:1619:5: ( ( rule__CloneDetection__MatchAssignment_2 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2);
                    selected = true;
                    // InternalCloneDetectionDSL.g:1625:5: ( ( rule__CloneDetection__MatchAssignment_2 ) )
                    // InternalCloneDetectionDSL.g:1626:6: ( rule__CloneDetection__MatchAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getMatchAssignment_2()); 
                    }
                    // InternalCloneDetectionDSL.g:1627:6: ( rule__CloneDetection__MatchAssignment_2 )
                    // InternalCloneDetectionDSL.g:1627:7: rule__CloneDetection__MatchAssignment_2
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
                    // InternalCloneDetectionDSL.g:1632:3: ({...}? => ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) ) )
                    {
                    // InternalCloneDetectionDSL.g:1632:3: ({...}? => ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) ) )
                    // InternalCloneDetectionDSL.g:1633:4: {...}? => ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__CloneDetection__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3)");
                    }
                    // InternalCloneDetectionDSL.g:1633:108: ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) )
                    // InternalCloneDetectionDSL.g:1634:5: ( ( rule__CloneDetection__ExcludeAssignment_3 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3);
                    selected = true;
                    // InternalCloneDetectionDSL.g:1640:5: ( ( rule__CloneDetection__ExcludeAssignment_3 ) )
                    // InternalCloneDetectionDSL.g:1641:6: ( rule__CloneDetection__ExcludeAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getExcludeAssignment_3()); 
                    }
                    // InternalCloneDetectionDSL.g:1642:6: ( rule__CloneDetection__ExcludeAssignment_3 )
                    // InternalCloneDetectionDSL.g:1642:7: rule__CloneDetection__ExcludeAssignment_3
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
                    // InternalCloneDetectionDSL.g:1647:3: ({...}? => ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) ) )
                    {
                    // InternalCloneDetectionDSL.g:1647:3: ({...}? => ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) ) )
                    // InternalCloneDetectionDSL.g:1648:4: {...}? => ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__CloneDetection__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4)");
                    }
                    // InternalCloneDetectionDSL.g:1648:108: ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) )
                    // InternalCloneDetectionDSL.g:1649:5: ( ( rule__CloneDetection__SizeAssignment_4 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4);
                    selected = true;
                    // InternalCloneDetectionDSL.g:1655:5: ( ( rule__CloneDetection__SizeAssignment_4 ) )
                    // InternalCloneDetectionDSL.g:1656:6: ( rule__CloneDetection__SizeAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getSizeAssignment_4()); 
                    }
                    // InternalCloneDetectionDSL.g:1657:6: ( rule__CloneDetection__SizeAssignment_4 )
                    // InternalCloneDetectionDSL.g:1657:7: rule__CloneDetection__SizeAssignment_4
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
                    // InternalCloneDetectionDSL.g:1662:3: ({...}? => ( ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) ) ) )
                    {
                    // InternalCloneDetectionDSL.g:1662:3: ({...}? => ( ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) ) ) )
                    // InternalCloneDetectionDSL.g:1663:4: {...}? => ( ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__CloneDetection__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5)");
                    }
                    // InternalCloneDetectionDSL.g:1663:108: ( ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) ) )
                    // InternalCloneDetectionDSL.g:1664:5: ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5);
                    selected = true;
                    // InternalCloneDetectionDSL.g:1670:5: ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) )
                    // InternalCloneDetectionDSL.g:1671:6: ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* )
                    {
                    // InternalCloneDetectionDSL.g:1671:6: ( ( rule__CloneDetection__NotCompareAssignment_5 ) )
                    // InternalCloneDetectionDSL.g:1672:7: ( rule__CloneDetection__NotCompareAssignment_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getNotCompareAssignment_5()); 
                    }
                    // InternalCloneDetectionDSL.g:1673:7: ( rule__CloneDetection__NotCompareAssignment_5 )
                    // InternalCloneDetectionDSL.g:1673:8: rule__CloneDetection__NotCompareAssignment_5
                    {
                    pushFollow(FOLLOW_16);
                    rule__CloneDetection__NotCompareAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCloneDetectionAccess().getNotCompareAssignment_5()); 
                    }

                    }

                    // InternalCloneDetectionDSL.g:1676:6: ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* )
                    // InternalCloneDetectionDSL.g:1677:7: ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getNotCompareAssignment_5()); 
                    }
                    // InternalCloneDetectionDSL.g:1678:7: ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==37) ) {
                            int LA13_2 = input.LA(2);

                            if ( (LA13_2==RULE_ID) ) {
                                int LA13_3 = input.LA(3);

                                if ( (synpred1_InternalCloneDetectionDSL()) ) {
                                    alt13=1;
                                }


                            }
                            else if ( (LA13_2==11) ) {
                                int LA13_4 = input.LA(3);

                                if ( (synpred1_InternalCloneDetectionDSL()) ) {
                                    alt13=1;
                                }


                            }


                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalCloneDetectionDSL.g:1678:8: ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5
                    	    {
                    	    pushFollow(FOLLOW_16);
                    	    rule__CloneDetection__NotCompareAssignment_5();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
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
                    // InternalCloneDetectionDSL.g:1684:3: ({...}? => ( ( ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* ) ) ) )
                    {
                    // InternalCloneDetectionDSL.g:1684:3: ({...}? => ( ( ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* ) ) ) )
                    // InternalCloneDetectionDSL.g:1685:4: {...}? => ( ( ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__CloneDetection__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6)");
                    }
                    // InternalCloneDetectionDSL.g:1685:108: ( ( ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* ) ) )
                    // InternalCloneDetectionDSL.g:1686:5: ( ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6);
                    selected = true;
                    // InternalCloneDetectionDSL.g:1692:5: ( ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* ) )
                    // InternalCloneDetectionDSL.g:1693:6: ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* )
                    {
                    // InternalCloneDetectionDSL.g:1693:6: ( ( rule__CloneDetection__CompareAssignment_6 ) )
                    // InternalCloneDetectionDSL.g:1694:7: ( rule__CloneDetection__CompareAssignment_6 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getCompareAssignment_6()); 
                    }
                    // InternalCloneDetectionDSL.g:1695:7: ( rule__CloneDetection__CompareAssignment_6 )
                    // InternalCloneDetectionDSL.g:1695:8: rule__CloneDetection__CompareAssignment_6
                    {
                    pushFollow(FOLLOW_17);
                    rule__CloneDetection__CompareAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCloneDetectionAccess().getCompareAssignment_6()); 
                    }

                    }

                    // InternalCloneDetectionDSL.g:1698:6: ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* )
                    // InternalCloneDetectionDSL.g:1699:7: ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getCompareAssignment_6()); 
                    }
                    // InternalCloneDetectionDSL.g:1700:7: ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )*
                    loop14:
                    do {
                        int alt14=2;
                        alt14 = dfa14.predict(input);
                        switch (alt14) {
                    	case 1 :
                    	    // InternalCloneDetectionDSL.g:1700:8: ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6
                    	    {
                    	    pushFollow(FOLLOW_17);
                    	    rule__CloneDetection__CompareAssignment_6();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
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
    // InternalCloneDetectionDSL.g:1714:1: rule__CloneDetection__UnorderedGroup__0 : rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__1 )? ;
    public final void rule__CloneDetection__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1718:1: ( rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__1 )? )
            // InternalCloneDetectionDSL.g:1719:2: rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_18);
            rule__CloneDetection__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalCloneDetectionDSL.g:1720:2: ( rule__CloneDetection__UnorderedGroup__1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( LA16_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0) ) {
                alt16=1;
            }
            else if ( LA16_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1) ) {
                alt16=1;
            }
            else if ( LA16_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2) ) {
                alt16=1;
            }
            else if ( LA16_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3) ) {
                alt16=1;
            }
            else if ( LA16_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4) ) {
                alt16=1;
            }
            else if ( LA16_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5) ) {
                alt16=1;
            }
            else if ( LA16_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1720:2: rule__CloneDetection__UnorderedGroup__1
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
    // InternalCloneDetectionDSL.g:1726:1: rule__CloneDetection__UnorderedGroup__1 : rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__2 )? ;
    public final void rule__CloneDetection__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1730:1: ( rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__2 )? )
            // InternalCloneDetectionDSL.g:1731:2: rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_18);
            rule__CloneDetection__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalCloneDetectionDSL.g:1732:2: ( rule__CloneDetection__UnorderedGroup__2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( LA17_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0) ) {
                alt17=1;
            }
            else if ( LA17_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1) ) {
                alt17=1;
            }
            else if ( LA17_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2) ) {
                alt17=1;
            }
            else if ( LA17_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3) ) {
                alt17=1;
            }
            else if ( LA17_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4) ) {
                alt17=1;
            }
            else if ( LA17_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5) ) {
                alt17=1;
            }
            else if ( LA17_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1732:2: rule__CloneDetection__UnorderedGroup__2
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
    // InternalCloneDetectionDSL.g:1738:1: rule__CloneDetection__UnorderedGroup__2 : rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__3 )? ;
    public final void rule__CloneDetection__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1742:1: ( rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__3 )? )
            // InternalCloneDetectionDSL.g:1743:2: rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__3 )?
            {
            pushFollow(FOLLOW_18);
            rule__CloneDetection__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalCloneDetectionDSL.g:1744:2: ( rule__CloneDetection__UnorderedGroup__3 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( LA18_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0) ) {
                alt18=1;
            }
            else if ( LA18_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1) ) {
                alt18=1;
            }
            else if ( LA18_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2) ) {
                alt18=1;
            }
            else if ( LA18_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3) ) {
                alt18=1;
            }
            else if ( LA18_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4) ) {
                alt18=1;
            }
            else if ( LA18_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5) ) {
                alt18=1;
            }
            else if ( LA18_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1744:2: rule__CloneDetection__UnorderedGroup__3
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
    // InternalCloneDetectionDSL.g:1750:1: rule__CloneDetection__UnorderedGroup__3 : rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__4 )? ;
    public final void rule__CloneDetection__UnorderedGroup__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1754:1: ( rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__4 )? )
            // InternalCloneDetectionDSL.g:1755:2: rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__4 )?
            {
            pushFollow(FOLLOW_18);
            rule__CloneDetection__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalCloneDetectionDSL.g:1756:2: ( rule__CloneDetection__UnorderedGroup__4 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( LA19_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0) ) {
                alt19=1;
            }
            else if ( LA19_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1) ) {
                alt19=1;
            }
            else if ( LA19_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2) ) {
                alt19=1;
            }
            else if ( LA19_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3) ) {
                alt19=1;
            }
            else if ( LA19_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4) ) {
                alt19=1;
            }
            else if ( LA19_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5) ) {
                alt19=1;
            }
            else if ( LA19_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1756:2: rule__CloneDetection__UnorderedGroup__4
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
    // InternalCloneDetectionDSL.g:1762:1: rule__CloneDetection__UnorderedGroup__4 : rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__5 )? ;
    public final void rule__CloneDetection__UnorderedGroup__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1766:1: ( rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__5 )? )
            // InternalCloneDetectionDSL.g:1767:2: rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__5 )?
            {
            pushFollow(FOLLOW_18);
            rule__CloneDetection__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalCloneDetectionDSL.g:1768:2: ( rule__CloneDetection__UnorderedGroup__5 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( LA20_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0) ) {
                alt20=1;
            }
            else if ( LA20_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1) ) {
                alt20=1;
            }
            else if ( LA20_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2) ) {
                alt20=1;
            }
            else if ( LA20_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3) ) {
                alt20=1;
            }
            else if ( LA20_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4) ) {
                alt20=1;
            }
            else if ( LA20_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5) ) {
                alt20=1;
            }
            else if ( LA20_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1768:2: rule__CloneDetection__UnorderedGroup__5
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
    // InternalCloneDetectionDSL.g:1774:1: rule__CloneDetection__UnorderedGroup__5 : rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__6 )? ;
    public final void rule__CloneDetection__UnorderedGroup__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1778:1: ( rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__6 )? )
            // InternalCloneDetectionDSL.g:1779:2: rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__6 )?
            {
            pushFollow(FOLLOW_18);
            rule__CloneDetection__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalCloneDetectionDSL.g:1780:2: ( rule__CloneDetection__UnorderedGroup__6 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( LA21_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0) ) {
                alt21=1;
            }
            else if ( LA21_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1) ) {
                alt21=1;
            }
            else if ( LA21_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2) ) {
                alt21=1;
            }
            else if ( LA21_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3) ) {
                alt21=1;
            }
            else if ( LA21_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4) ) {
                alt21=1;
            }
            else if ( LA21_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5) ) {
                alt21=1;
            }
            else if ( LA21_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1780:2: rule__CloneDetection__UnorderedGroup__6
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
    // InternalCloneDetectionDSL.g:1786:1: rule__CloneDetection__UnorderedGroup__6 : rule__CloneDetection__UnorderedGroup__Impl ;
    public final void rule__CloneDetection__UnorderedGroup__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1790:1: ( rule__CloneDetection__UnorderedGroup__Impl )
            // InternalCloneDetectionDSL.g:1791:2: rule__CloneDetection__UnorderedGroup__Impl
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
    // InternalCloneDetectionDSL.g:1798:1: rule__CloneDetection__ProjectAssignment_0 : ( ruleProject ) ;
    public final void rule__CloneDetection__ProjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1802:1: ( ( ruleProject ) )
            // InternalCloneDetectionDSL.g:1803:2: ( ruleProject )
            {
            // InternalCloneDetectionDSL.g:1803:2: ( ruleProject )
            // InternalCloneDetectionDSL.g:1804:3: ruleProject
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
    // InternalCloneDetectionDSL.g:1813:1: rule__CloneDetection__RootAssignment_1 : ( ruleSearchRoot ) ;
    public final void rule__CloneDetection__RootAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1817:1: ( ( ruleSearchRoot ) )
            // InternalCloneDetectionDSL.g:1818:2: ( ruleSearchRoot )
            {
            // InternalCloneDetectionDSL.g:1818:2: ( ruleSearchRoot )
            // InternalCloneDetectionDSL.g:1819:3: ruleSearchRoot
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
    // InternalCloneDetectionDSL.g:1828:1: rule__CloneDetection__MatchAssignment_2 : ( ruleMatch ) ;
    public final void rule__CloneDetection__MatchAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1832:1: ( ( ruleMatch ) )
            // InternalCloneDetectionDSL.g:1833:2: ( ruleMatch )
            {
            // InternalCloneDetectionDSL.g:1833:2: ( ruleMatch )
            // InternalCloneDetectionDSL.g:1834:3: ruleMatch
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
    // InternalCloneDetectionDSL.g:1843:1: rule__CloneDetection__ExcludeAssignment_3 : ( ruleExclude ) ;
    public final void rule__CloneDetection__ExcludeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1847:1: ( ( ruleExclude ) )
            // InternalCloneDetectionDSL.g:1848:2: ( ruleExclude )
            {
            // InternalCloneDetectionDSL.g:1848:2: ( ruleExclude )
            // InternalCloneDetectionDSL.g:1849:3: ruleExclude
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
    // InternalCloneDetectionDSL.g:1858:1: rule__CloneDetection__SizeAssignment_4 : ( ruleMinSize ) ;
    public final void rule__CloneDetection__SizeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1862:1: ( ( ruleMinSize ) )
            // InternalCloneDetectionDSL.g:1863:2: ( ruleMinSize )
            {
            // InternalCloneDetectionDSL.g:1863:2: ( ruleMinSize )
            // InternalCloneDetectionDSL.g:1864:3: ruleMinSize
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
    // InternalCloneDetectionDSL.g:1873:1: rule__CloneDetection__NotCompareAssignment_5 : ( ruleDoNotCompare ) ;
    public final void rule__CloneDetection__NotCompareAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1877:1: ( ( ruleDoNotCompare ) )
            // InternalCloneDetectionDSL.g:1878:2: ( ruleDoNotCompare )
            {
            // InternalCloneDetectionDSL.g:1878:2: ( ruleDoNotCompare )
            // InternalCloneDetectionDSL.g:1879:3: ruleDoNotCompare
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
    // InternalCloneDetectionDSL.g:1888:1: rule__CloneDetection__CompareAssignment_6 : ( ruleCompare ) ;
    public final void rule__CloneDetection__CompareAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1892:1: ( ( ruleCompare ) )
            // InternalCloneDetectionDSL.g:1893:2: ( ruleCompare )
            {
            // InternalCloneDetectionDSL.g:1893:2: ( ruleCompare )
            // InternalCloneDetectionDSL.g:1894:3: ruleCompare
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
    // InternalCloneDetectionDSL.g:1903:1: rule__Project__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Project__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1907:1: ( ( RULE_STRING ) )
            // InternalCloneDetectionDSL.g:1908:2: ( RULE_STRING )
            {
            // InternalCloneDetectionDSL.g:1908:2: ( RULE_STRING )
            // InternalCloneDetectionDSL.g:1909:3: RULE_STRING
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
    // InternalCloneDetectionDSL.g:1918:1: rule__SearchRoot__NodesAssignment_1 : ( ruleNodes ) ;
    public final void rule__SearchRoot__NodesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1922:1: ( ( ruleNodes ) )
            // InternalCloneDetectionDSL.g:1923:2: ( ruleNodes )
            {
            // InternalCloneDetectionDSL.g:1923:2: ( ruleNodes )
            // InternalCloneDetectionDSL.g:1924:3: ruleNodes
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


    // $ANTLR start "rule__Match__TargetAssignment_1"
    // InternalCloneDetectionDSL.g:1933:1: rule__Match__TargetAssignment_1 : ( ruleMatchTarget ) ;
    public final void rule__Match__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1937:1: ( ( ruleMatchTarget ) )
            // InternalCloneDetectionDSL.g:1938:2: ( ruleMatchTarget )
            {
            // InternalCloneDetectionDSL.g:1938:2: ( ruleMatchTarget )
            // InternalCloneDetectionDSL.g:1939:3: ruleMatchTarget
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
    // InternalCloneDetectionDSL.g:1948:1: rule__Node__NameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1952:1: ( ( RULE_ID ) )
            // InternalCloneDetectionDSL.g:1953:2: ( RULE_ID )
            {
            // InternalCloneDetectionDSL.g:1953:2: ( RULE_ID )
            // InternalCloneDetectionDSL.g:1954:3: RULE_ID
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
    // InternalCloneDetectionDSL.g:1963:1: rule__Node__UnderAssignment_1_0 : ( ruleUnder ) ;
    public final void rule__Node__UnderAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1967:1: ( ( ruleUnder ) )
            // InternalCloneDetectionDSL.g:1968:2: ( ruleUnder )
            {
            // InternalCloneDetectionDSL.g:1968:2: ( ruleUnder )
            // InternalCloneDetectionDSL.g:1969:3: ruleUnder
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
    // InternalCloneDetectionDSL.g:1978:1: rule__Node__NodeAssignment_1_1 : ( ruleNode ) ;
    public final void rule__Node__NodeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1982:1: ( ( ruleNode ) )
            // InternalCloneDetectionDSL.g:1983:2: ( ruleNode )
            {
            // InternalCloneDetectionDSL.g:1983:2: ( ruleNode )
            // InternalCloneDetectionDSL.g:1984:3: ruleNode
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
    // InternalCloneDetectionDSL.g:1993:1: rule__Nodes__NodeAssignment_0 : ( ruleNode ) ;
    public final void rule__Nodes__NodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1997:1: ( ( ruleNode ) )
            // InternalCloneDetectionDSL.g:1998:2: ( ruleNode )
            {
            // InternalCloneDetectionDSL.g:1998:2: ( ruleNode )
            // InternalCloneDetectionDSL.g:1999:3: ruleNode
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
    // InternalCloneDetectionDSL.g:2008:1: rule__Nodes__NodesAssignment_1_1 : ( ruleNodes ) ;
    public final void rule__Nodes__NodesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2012:1: ( ( ruleNodes ) )
            // InternalCloneDetectionDSL.g:2013:2: ( ruleNodes )
            {
            // InternalCloneDetectionDSL.g:2013:2: ( ruleNodes )
            // InternalCloneDetectionDSL.g:2014:3: ruleNodes
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
    // InternalCloneDetectionDSL.g:2023:1: rule__MinSize__ExprAssignment_1_0 : ( ruleMetricExpr ) ;
    public final void rule__MinSize__ExprAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2027:1: ( ( ruleMetricExpr ) )
            // InternalCloneDetectionDSL.g:2028:2: ( ruleMetricExpr )
            {
            // InternalCloneDetectionDSL.g:2028:2: ( ruleMetricExpr )
            // InternalCloneDetectionDSL.g:2029:3: ruleMetricExpr
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
    // InternalCloneDetectionDSL.g:2038:1: rule__MinSize__BracketsAssignment_1_1_1 : ( ruleMinSize ) ;
    public final void rule__MinSize__BracketsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2042:1: ( ( ruleMinSize ) )
            // InternalCloneDetectionDSL.g:2043:2: ( ruleMinSize )
            {
            // InternalCloneDetectionDSL.g:2043:2: ( ruleMinSize )
            // InternalCloneDetectionDSL.g:2044:3: ruleMinSize
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
    // InternalCloneDetectionDSL.g:2053:1: rule__MinSize__OperatorAssignment_2_0 : ( ruleBoolOperator ) ;
    public final void rule__MinSize__OperatorAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2057:1: ( ( ruleBoolOperator ) )
            // InternalCloneDetectionDSL.g:2058:2: ( ruleBoolOperator )
            {
            // InternalCloneDetectionDSL.g:2058:2: ( ruleBoolOperator )
            // InternalCloneDetectionDSL.g:2059:3: ruleBoolOperator
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
    // InternalCloneDetectionDSL.g:2068:1: rule__MinSize__SizeAssignment_2_1 : ( ruleMinSize ) ;
    public final void rule__MinSize__SizeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2072:1: ( ( ruleMinSize ) )
            // InternalCloneDetectionDSL.g:2073:2: ( ruleMinSize )
            {
            // InternalCloneDetectionDSL.g:2073:2: ( ruleMinSize )
            // InternalCloneDetectionDSL.g:2074:3: ruleMinSize
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
    // InternalCloneDetectionDSL.g:2083:1: rule__MetricExpr__AmountAssignment_0 : ( RULE_INT ) ;
    public final void rule__MetricExpr__AmountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2087:1: ( ( RULE_INT ) )
            // InternalCloneDetectionDSL.g:2088:2: ( RULE_INT )
            {
            // InternalCloneDetectionDSL.g:2088:2: ( RULE_INT )
            // InternalCloneDetectionDSL.g:2089:3: RULE_INT
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
    // InternalCloneDetectionDSL.g:2098:1: rule__MetricExpr__MetricAssignment_1 : ( ruleSizeMetric ) ;
    public final void rule__MetricExpr__MetricAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2102:1: ( ( ruleSizeMetric ) )
            // InternalCloneDetectionDSL.g:2103:2: ( ruleSizeMetric )
            {
            // InternalCloneDetectionDSL.g:2103:2: ( ruleSizeMetric )
            // InternalCloneDetectionDSL.g:2104:3: ruleSizeMetric
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
    // InternalCloneDetectionDSL.g:2113:1: rule__Compare__NodesAssignment_1 : ( ruleNodes ) ;
    public final void rule__Compare__NodesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2117:1: ( ( ruleNodes ) )
            // InternalCloneDetectionDSL.g:2118:2: ( ruleNodes )
            {
            // InternalCloneDetectionDSL.g:2118:2: ( ruleNodes )
            // InternalCloneDetectionDSL.g:2119:3: ruleNodes
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
    // InternalCloneDetectionDSL.g:2128:1: rule__Compare__ComparisonMethodAssignment_2 : ( ruleMethod ) ;
    public final void rule__Compare__ComparisonMethodAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2132:1: ( ( ruleMethod ) )
            // InternalCloneDetectionDSL.g:2133:2: ( ruleMethod )
            {
            // InternalCloneDetectionDSL.g:2133:2: ( ruleMethod )
            // InternalCloneDetectionDSL.g:2134:3: ruleMethod
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
    // InternalCloneDetectionDSL.g:2143:1: rule__Compare__DeepestNodeAssignment_3 : ( ruleNode ) ;
    public final void rule__Compare__DeepestNodeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2147:1: ( ( ruleNode ) )
            // InternalCloneDetectionDSL.g:2148:2: ( ruleNode )
            {
            // InternalCloneDetectionDSL.g:2148:2: ( ruleNode )
            // InternalCloneDetectionDSL.g:2149:3: ruleNode
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
    // InternalCloneDetectionDSL.g:2158:1: rule__Compare__PercAssignment_4 : ( rulePercentage ) ;
    public final void rule__Compare__PercAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2162:1: ( ( rulePercentage ) )
            // InternalCloneDetectionDSL.g:2163:2: ( rulePercentage )
            {
            // InternalCloneDetectionDSL.g:2163:2: ( rulePercentage )
            // InternalCloneDetectionDSL.g:2164:3: rulePercentage
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

    // $ANTLR start synpred1_InternalCloneDetectionDSL
    public final void synpred1_InternalCloneDetectionDSL_fragment() throws RecognitionException {   
        // InternalCloneDetectionDSL.g:1678:8: ( rule__CloneDetection__NotCompareAssignment_5 )
        // InternalCloneDetectionDSL.g:1678:9: rule__CloneDetection__NotCompareAssignment_5
        {
        pushFollow(FOLLOW_2);
        rule__CloneDetection__NotCompareAssignment_5();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalCloneDetectionDSL

    // $ANTLR start synpred2_InternalCloneDetectionDSL
    public final void synpred2_InternalCloneDetectionDSL_fragment() throws RecognitionException {   
        // InternalCloneDetectionDSL.g:1700:8: ( rule__CloneDetection__CompareAssignment_6 )
        // InternalCloneDetectionDSL.g:1700:9: rule__CloneDetection__CompareAssignment_6
        {
        pushFollow(FOLLOW_2);
        rule__CloneDetection__CompareAssignment_6();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalCloneDetectionDSL

    // Delegated rules

    public final boolean synpred2_InternalCloneDetectionDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalCloneDetectionDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalCloneDetectionDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalCloneDetectionDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\1\11\uffff";
    static final String dfa_3s = "\1\35\6\uffff\1\0\2\uffff";
    static final String dfa_4s = "\1\46\6\uffff\1\0\2\uffff";
    static final String dfa_5s = "\1\uffff\1\2\7\uffff\1\1";
    static final String dfa_6s = "\7\uffff\1\0\2\uffff}>";
    static final String[] dfa_7s = {
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

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 1700:7: ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_7 = input.LA(1);

                         
                        int index14_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalCloneDetectionDSL()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000001F8000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000850L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000065E0000002L});

}
