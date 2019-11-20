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


    // $ANTLR start "entryRuleSize"
    // InternalCloneDetectionDSL.g:228:1: entryRuleSize : ruleSize EOF ;
    public final void entryRuleSize() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:229:1: ( ruleSize EOF )
            // InternalCloneDetectionDSL.g:230:1: ruleSize EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSizeRule()); 
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
    // $ANTLR end "entryRuleSize"


    // $ANTLR start "ruleSize"
    // InternalCloneDetectionDSL.g:237:1: ruleSize : ( ( rule__Size__Group__0 ) ) ;
    public final void ruleSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:241:2: ( ( ( rule__Size__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:242:2: ( ( rule__Size__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:242:2: ( ( rule__Size__Group__0 ) )
            // InternalCloneDetectionDSL.g:243:3: ( rule__Size__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:244:3: ( rule__Size__Group__0 )
            // InternalCloneDetectionDSL.g:244:4: rule__Size__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Size__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSizeAccess().getGroup()); 
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
    // $ANTLR end "ruleSize"


    // $ANTLR start "entryRuleMinSize"
    // InternalCloneDetectionDSL.g:253:1: entryRuleMinSize : ruleMinSize EOF ;
    public final void entryRuleMinSize() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:254:1: ( ruleMinSize EOF )
            // InternalCloneDetectionDSL.g:255:1: ruleMinSize EOF
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
    // InternalCloneDetectionDSL.g:262:1: ruleMinSize : ( ( rule__MinSize__Group__0 ) ) ;
    public final void ruleMinSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:266:2: ( ( ( rule__MinSize__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:267:2: ( ( rule__MinSize__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:267:2: ( ( rule__MinSize__Group__0 ) )
            // InternalCloneDetectionDSL.g:268:3: ( rule__MinSize__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:269:3: ( rule__MinSize__Group__0 )
            // InternalCloneDetectionDSL.g:269:4: rule__MinSize__Group__0
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
    // InternalCloneDetectionDSL.g:278:1: entryRuleMetricExpr : ruleMetricExpr EOF ;
    public final void entryRuleMetricExpr() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:279:1: ( ruleMetricExpr EOF )
            // InternalCloneDetectionDSL.g:280:1: ruleMetricExpr EOF
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
    // InternalCloneDetectionDSL.g:287:1: ruleMetricExpr : ( ( rule__MetricExpr__Group__0 ) ) ;
    public final void ruleMetricExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:291:2: ( ( ( rule__MetricExpr__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:292:2: ( ( rule__MetricExpr__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:292:2: ( ( rule__MetricExpr__Group__0 ) )
            // InternalCloneDetectionDSL.g:293:3: ( rule__MetricExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricExprAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:294:3: ( rule__MetricExpr__Group__0 )
            // InternalCloneDetectionDSL.g:294:4: rule__MetricExpr__Group__0
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
    // InternalCloneDetectionDSL.g:303:1: entryRuleDoNotCompare : ruleDoNotCompare EOF ;
    public final void entryRuleDoNotCompare() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:304:1: ( ruleDoNotCompare EOF )
            // InternalCloneDetectionDSL.g:305:1: ruleDoNotCompare EOF
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
    // InternalCloneDetectionDSL.g:312:1: ruleDoNotCompare : ( ( rule__DoNotCompare__Group__0 ) ) ;
    public final void ruleDoNotCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:316:2: ( ( ( rule__DoNotCompare__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:317:2: ( ( rule__DoNotCompare__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:317:2: ( ( rule__DoNotCompare__Group__0 ) )
            // InternalCloneDetectionDSL.g:318:3: ( rule__DoNotCompare__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoNotCompareAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:319:3: ( rule__DoNotCompare__Group__0 )
            // InternalCloneDetectionDSL.g:319:4: rule__DoNotCompare__Group__0
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
    // InternalCloneDetectionDSL.g:328:1: entryRuleCompare : ruleCompare EOF ;
    public final void entryRuleCompare() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:329:1: ( ruleCompare EOF )
            // InternalCloneDetectionDSL.g:330:1: ruleCompare EOF
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
    // InternalCloneDetectionDSL.g:337:1: ruleCompare : ( ( rule__Compare__Group__0 ) ) ;
    public final void ruleCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:341:2: ( ( ( rule__Compare__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:342:2: ( ( rule__Compare__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:342:2: ( ( rule__Compare__Group__0 ) )
            // InternalCloneDetectionDSL.g:343:3: ( rule__Compare__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:344:3: ( rule__Compare__Group__0 )
            // InternalCloneDetectionDSL.g:344:4: rule__Compare__Group__0
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
    // InternalCloneDetectionDSL.g:353:1: entryRulePercentage : rulePercentage EOF ;
    public final void entryRulePercentage() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:354:1: ( rulePercentage EOF )
            // InternalCloneDetectionDSL.g:355:1: rulePercentage EOF
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
    // InternalCloneDetectionDSL.g:362:1: rulePercentage : ( ( rule__Percentage__Group__0 ) ) ;
    public final void rulePercentage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:366:2: ( ( ( rule__Percentage__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:367:2: ( ( rule__Percentage__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:367:2: ( ( rule__Percentage__Group__0 ) )
            // InternalCloneDetectionDSL.g:368:3: ( rule__Percentage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPercentageAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:369:3: ( rule__Percentage__Group__0 )
            // InternalCloneDetectionDSL.g:369:4: rule__Percentage__Group__0
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
    // InternalCloneDetectionDSL.g:378:1: ruleMatchTarget : ( ( rule__MatchTarget__Alternatives ) ) ;
    public final void ruleMatchTarget() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:382:1: ( ( ( rule__MatchTarget__Alternatives ) ) )
            // InternalCloneDetectionDSL.g:383:2: ( ( rule__MatchTarget__Alternatives ) )
            {
            // InternalCloneDetectionDSL.g:383:2: ( ( rule__MatchTarget__Alternatives ) )
            // InternalCloneDetectionDSL.g:384:3: ( rule__MatchTarget__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTargetAccess().getAlternatives()); 
            }
            // InternalCloneDetectionDSL.g:385:3: ( rule__MatchTarget__Alternatives )
            // InternalCloneDetectionDSL.g:385:4: rule__MatchTarget__Alternatives
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
    // InternalCloneDetectionDSL.g:394:1: ruleSizeMetric : ( ( rule__SizeMetric__Alternatives ) ) ;
    public final void ruleSizeMetric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:398:1: ( ( ( rule__SizeMetric__Alternatives ) ) )
            // InternalCloneDetectionDSL.g:399:2: ( ( rule__SizeMetric__Alternatives ) )
            {
            // InternalCloneDetectionDSL.g:399:2: ( ( rule__SizeMetric__Alternatives ) )
            // InternalCloneDetectionDSL.g:400:3: ( rule__SizeMetric__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeMetricAccess().getAlternatives()); 
            }
            // InternalCloneDetectionDSL.g:401:3: ( rule__SizeMetric__Alternatives )
            // InternalCloneDetectionDSL.g:401:4: rule__SizeMetric__Alternatives
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
    // InternalCloneDetectionDSL.g:410:1: ruleBoolOperator : ( ( rule__BoolOperator__Alternatives ) ) ;
    public final void ruleBoolOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:414:1: ( ( ( rule__BoolOperator__Alternatives ) ) )
            // InternalCloneDetectionDSL.g:415:2: ( ( rule__BoolOperator__Alternatives ) )
            {
            // InternalCloneDetectionDSL.g:415:2: ( ( rule__BoolOperator__Alternatives ) )
            // InternalCloneDetectionDSL.g:416:3: ( rule__BoolOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolOperatorAccess().getAlternatives()); 
            }
            // InternalCloneDetectionDSL.g:417:3: ( rule__BoolOperator__Alternatives )
            // InternalCloneDetectionDSL.g:417:4: rule__BoolOperator__Alternatives
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
    // InternalCloneDetectionDSL.g:426:1: ruleMethod : ( ( rule__Method__Alternatives ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:430:1: ( ( ( rule__Method__Alternatives ) ) )
            // InternalCloneDetectionDSL.g:431:2: ( ( rule__Method__Alternatives ) )
            {
            // InternalCloneDetectionDSL.g:431:2: ( ( rule__Method__Alternatives ) )
            // InternalCloneDetectionDSL.g:432:3: ( rule__Method__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getAlternatives()); 
            }
            // InternalCloneDetectionDSL.g:433:3: ( rule__Method__Alternatives )
            // InternalCloneDetectionDSL.g:433:4: rule__Method__Alternatives
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
    // InternalCloneDetectionDSL.g:442:1: ruleUnder : ( ( rule__Under__Alternatives ) ) ;
    public final void ruleUnder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:446:1: ( ( ( rule__Under__Alternatives ) ) )
            // InternalCloneDetectionDSL.g:447:2: ( ( rule__Under__Alternatives ) )
            {
            // InternalCloneDetectionDSL.g:447:2: ( ( rule__Under__Alternatives ) )
            // InternalCloneDetectionDSL.g:448:3: ( rule__Under__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnderAccess().getAlternatives()); 
            }
            // InternalCloneDetectionDSL.g:449:3: ( rule__Under__Alternatives )
            // InternalCloneDetectionDSL.g:449:4: rule__Under__Alternatives
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
    // InternalCloneDetectionDSL.g:457:1: rule__Node__Alternatives_0 : ( ( ( rule__Node__NameAssignment_0_0 ) ) | ( '*' ) );
    public final void rule__Node__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:461:1: ( ( ( rule__Node__NameAssignment_0_0 ) ) | ( '*' ) )
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
                    // InternalCloneDetectionDSL.g:462:2: ( ( rule__Node__NameAssignment_0_0 ) )
                    {
                    // InternalCloneDetectionDSL.g:462:2: ( ( rule__Node__NameAssignment_0_0 ) )
                    // InternalCloneDetectionDSL.g:463:3: ( rule__Node__NameAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getNameAssignment_0_0()); 
                    }
                    // InternalCloneDetectionDSL.g:464:3: ( rule__Node__NameAssignment_0_0 )
                    // InternalCloneDetectionDSL.g:464:4: rule__Node__NameAssignment_0_0
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
                    // InternalCloneDetectionDSL.g:468:2: ( '*' )
                    {
                    // InternalCloneDetectionDSL.g:468:2: ( '*' )
                    // InternalCloneDetectionDSL.g:469:3: '*'
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


    // $ANTLR start "rule__MinSize__Alternatives_0"
    // InternalCloneDetectionDSL.g:478:1: rule__MinSize__Alternatives_0 : ( ( ( rule__MinSize__ExprAssignment_0_0 ) ) | ( ( rule__MinSize__Group_0_1__0 ) ) );
    public final void rule__MinSize__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:482:1: ( ( ( rule__MinSize__ExprAssignment_0_0 ) ) | ( ( rule__MinSize__Group_0_1__0 ) ) )
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
                    // InternalCloneDetectionDSL.g:483:2: ( ( rule__MinSize__ExprAssignment_0_0 ) )
                    {
                    // InternalCloneDetectionDSL.g:483:2: ( ( rule__MinSize__ExprAssignment_0_0 ) )
                    // InternalCloneDetectionDSL.g:484:3: ( rule__MinSize__ExprAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMinSizeAccess().getExprAssignment_0_0()); 
                    }
                    // InternalCloneDetectionDSL.g:485:3: ( rule__MinSize__ExprAssignment_0_0 )
                    // InternalCloneDetectionDSL.g:485:4: rule__MinSize__ExprAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MinSize__ExprAssignment_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMinSizeAccess().getExprAssignment_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:489:2: ( ( rule__MinSize__Group_0_1__0 ) )
                    {
                    // InternalCloneDetectionDSL.g:489:2: ( ( rule__MinSize__Group_0_1__0 ) )
                    // InternalCloneDetectionDSL.g:490:3: ( rule__MinSize__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMinSizeAccess().getGroup_0_1()); 
                    }
                    // InternalCloneDetectionDSL.g:491:3: ( rule__MinSize__Group_0_1__0 )
                    // InternalCloneDetectionDSL.g:491:4: rule__MinSize__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MinSize__Group_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMinSizeAccess().getGroup_0_1()); 
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
    // $ANTLR end "rule__MinSize__Alternatives_0"


    // $ANTLR start "rule__MatchTarget__Alternatives"
    // InternalCloneDetectionDSL.g:499:1: rule__MatchTarget__Alternatives : ( ( ( 'Subtree' ) ) | ( ( 'LLOC' ) ) | ( ( 'SLOC' ) ) );
    public final void rule__MatchTarget__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:503:1: ( ( ( 'Subtree' ) ) | ( ( 'LLOC' ) ) | ( ( 'SLOC' ) ) )
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
                    // InternalCloneDetectionDSL.g:504:2: ( ( 'Subtree' ) )
                    {
                    // InternalCloneDetectionDSL.g:504:2: ( ( 'Subtree' ) )
                    // InternalCloneDetectionDSL.g:505:3: ( 'Subtree' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMatchTargetAccess().getSubtreeEnumLiteralDeclaration_0()); 
                    }
                    // InternalCloneDetectionDSL.g:506:3: ( 'Subtree' )
                    // InternalCloneDetectionDSL.g:506:4: 'Subtree'
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
                    // InternalCloneDetectionDSL.g:510:2: ( ( 'LLOC' ) )
                    {
                    // InternalCloneDetectionDSL.g:510:2: ( ( 'LLOC' ) )
                    // InternalCloneDetectionDSL.g:511:3: ( 'LLOC' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMatchTargetAccess().getLLOCEnumLiteralDeclaration_1()); 
                    }
                    // InternalCloneDetectionDSL.g:512:3: ( 'LLOC' )
                    // InternalCloneDetectionDSL.g:512:4: 'LLOC'
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
                    // InternalCloneDetectionDSL.g:516:2: ( ( 'SLOC' ) )
                    {
                    // InternalCloneDetectionDSL.g:516:2: ( ( 'SLOC' ) )
                    // InternalCloneDetectionDSL.g:517:3: ( 'SLOC' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMatchTargetAccess().getSLOCEnumLiteralDeclaration_2()); 
                    }
                    // InternalCloneDetectionDSL.g:518:3: ( 'SLOC' )
                    // InternalCloneDetectionDSL.g:518:4: 'SLOC'
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
    // InternalCloneDetectionDSL.g:526:1: rule__SizeMetric__Alternatives : ( ( ( 'tokens' ) ) | ( ( 'declarations' ) ) | ( ( 'statements' ) ) | ( ( 'nodes' ) ) | ( ( 'lines' ) ) | ( ( 'cyclomatic_complexity' ) ) );
    public final void rule__SizeMetric__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:530:1: ( ( ( 'tokens' ) ) | ( ( 'declarations' ) ) | ( ( 'statements' ) ) | ( ( 'nodes' ) ) | ( ( 'lines' ) ) | ( ( 'cyclomatic_complexity' ) ) )
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
                    // InternalCloneDetectionDSL.g:531:2: ( ( 'tokens' ) )
                    {
                    // InternalCloneDetectionDSL.g:531:2: ( ( 'tokens' ) )
                    // InternalCloneDetectionDSL.g:532:3: ( 'tokens' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSizeMetricAccess().getTokensEnumLiteralDeclaration_0()); 
                    }
                    // InternalCloneDetectionDSL.g:533:3: ( 'tokens' )
                    // InternalCloneDetectionDSL.g:533:4: 'tokens'
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
                    // InternalCloneDetectionDSL.g:537:2: ( ( 'declarations' ) )
                    {
                    // InternalCloneDetectionDSL.g:537:2: ( ( 'declarations' ) )
                    // InternalCloneDetectionDSL.g:538:3: ( 'declarations' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSizeMetricAccess().getDeclarationsEnumLiteralDeclaration_1()); 
                    }
                    // InternalCloneDetectionDSL.g:539:3: ( 'declarations' )
                    // InternalCloneDetectionDSL.g:539:4: 'declarations'
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
                    // InternalCloneDetectionDSL.g:543:2: ( ( 'statements' ) )
                    {
                    // InternalCloneDetectionDSL.g:543:2: ( ( 'statements' ) )
                    // InternalCloneDetectionDSL.g:544:3: ( 'statements' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSizeMetricAccess().getStatementsEnumLiteralDeclaration_2()); 
                    }
                    // InternalCloneDetectionDSL.g:545:3: ( 'statements' )
                    // InternalCloneDetectionDSL.g:545:4: 'statements'
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
                    // InternalCloneDetectionDSL.g:549:2: ( ( 'nodes' ) )
                    {
                    // InternalCloneDetectionDSL.g:549:2: ( ( 'nodes' ) )
                    // InternalCloneDetectionDSL.g:550:3: ( 'nodes' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSizeMetricAccess().getNodesEnumLiteralDeclaration_3()); 
                    }
                    // InternalCloneDetectionDSL.g:551:3: ( 'nodes' )
                    // InternalCloneDetectionDSL.g:551:4: 'nodes'
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
                    // InternalCloneDetectionDSL.g:555:2: ( ( 'lines' ) )
                    {
                    // InternalCloneDetectionDSL.g:555:2: ( ( 'lines' ) )
                    // InternalCloneDetectionDSL.g:556:3: ( 'lines' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSizeMetricAccess().getLinesEnumLiteralDeclaration_4()); 
                    }
                    // InternalCloneDetectionDSL.g:557:3: ( 'lines' )
                    // InternalCloneDetectionDSL.g:557:4: 'lines'
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
                    // InternalCloneDetectionDSL.g:561:2: ( ( 'cyclomatic_complexity' ) )
                    {
                    // InternalCloneDetectionDSL.g:561:2: ( ( 'cyclomatic_complexity' ) )
                    // InternalCloneDetectionDSL.g:562:3: ( 'cyclomatic_complexity' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSizeMetricAccess().getCyclomatic_complexityEnumLiteralDeclaration_5()); 
                    }
                    // InternalCloneDetectionDSL.g:563:3: ( 'cyclomatic_complexity' )
                    // InternalCloneDetectionDSL.g:563:4: 'cyclomatic_complexity'
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
    // InternalCloneDetectionDSL.g:571:1: rule__BoolOperator__Alternatives : ( ( ( '&' ) ) | ( ( '|' ) ) );
    public final void rule__BoolOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:575:1: ( ( ( '&' ) ) | ( ( '|' ) ) )
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
                    // InternalCloneDetectionDSL.g:576:2: ( ( '&' ) )
                    {
                    // InternalCloneDetectionDSL.g:576:2: ( ( '&' ) )
                    // InternalCloneDetectionDSL.g:577:3: ( '&' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoolOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }
                    // InternalCloneDetectionDSL.g:578:3: ( '&' )
                    // InternalCloneDetectionDSL.g:578:4: '&'
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
                    // InternalCloneDetectionDSL.g:582:2: ( ( '|' ) )
                    {
                    // InternalCloneDetectionDSL.g:582:2: ( ( '|' ) )
                    // InternalCloneDetectionDSL.g:583:3: ( '|' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoolOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    }
                    // InternalCloneDetectionDSL.g:584:3: ( '|' )
                    // InternalCloneDetectionDSL.g:584:4: '|'
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
    // InternalCloneDetectionDSL.g:592:1: rule__Method__Alternatives : ( ( ( 'Subnodes' ) ) | ( ( 'StringMatch' ) ) | ( ( 'CompleteMatch' ) ) | ( ( 'FQI' ) ) );
    public final void rule__Method__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:596:1: ( ( ( 'Subnodes' ) ) | ( ( 'StringMatch' ) ) | ( ( 'CompleteMatch' ) ) | ( ( 'FQI' ) ) )
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
                    // InternalCloneDetectionDSL.g:597:2: ( ( 'Subnodes' ) )
                    {
                    // InternalCloneDetectionDSL.g:597:2: ( ( 'Subnodes' ) )
                    // InternalCloneDetectionDSL.g:598:3: ( 'Subnodes' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodAccess().getSubnodesEnumLiteralDeclaration_0()); 
                    }
                    // InternalCloneDetectionDSL.g:599:3: ( 'Subnodes' )
                    // InternalCloneDetectionDSL.g:599:4: 'Subnodes'
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
                    // InternalCloneDetectionDSL.g:603:2: ( ( 'StringMatch' ) )
                    {
                    // InternalCloneDetectionDSL.g:603:2: ( ( 'StringMatch' ) )
                    // InternalCloneDetectionDSL.g:604:3: ( 'StringMatch' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodAccess().getStringMatchEnumLiteralDeclaration_1()); 
                    }
                    // InternalCloneDetectionDSL.g:605:3: ( 'StringMatch' )
                    // InternalCloneDetectionDSL.g:605:4: 'StringMatch'
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
                    // InternalCloneDetectionDSL.g:609:2: ( ( 'CompleteMatch' ) )
                    {
                    // InternalCloneDetectionDSL.g:609:2: ( ( 'CompleteMatch' ) )
                    // InternalCloneDetectionDSL.g:610:3: ( 'CompleteMatch' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodAccess().getCompleteMatchEnumLiteralDeclaration_2()); 
                    }
                    // InternalCloneDetectionDSL.g:611:3: ( 'CompleteMatch' )
                    // InternalCloneDetectionDSL.g:611:4: 'CompleteMatch'
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
                    // InternalCloneDetectionDSL.g:615:2: ( ( 'FQI' ) )
                    {
                    // InternalCloneDetectionDSL.g:615:2: ( ( 'FQI' ) )
                    // InternalCloneDetectionDSL.g:616:3: ( 'FQI' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodAccess().getFQIEnumLiteralDeclaration_3()); 
                    }
                    // InternalCloneDetectionDSL.g:617:3: ( 'FQI' )
                    // InternalCloneDetectionDSL.g:617:4: 'FQI'
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
    // InternalCloneDetectionDSL.g:625:1: rule__Under__Alternatives : ( ( ( '->' ) ) | ( ( '=>' ) ) );
    public final void rule__Under__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:629:1: ( ( ( '->' ) ) | ( ( '=>' ) ) )
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
                    // InternalCloneDetectionDSL.g:630:2: ( ( '->' ) )
                    {
                    // InternalCloneDetectionDSL.g:630:2: ( ( '->' ) )
                    // InternalCloneDetectionDSL.g:631:3: ( '->' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnderAccess().getOneLevelEnumLiteralDeclaration_0()); 
                    }
                    // InternalCloneDetectionDSL.g:632:3: ( '->' )
                    // InternalCloneDetectionDSL.g:632:4: '->'
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
                    // InternalCloneDetectionDSL.g:636:2: ( ( '=>' ) )
                    {
                    // InternalCloneDetectionDSL.g:636:2: ( ( '=>' ) )
                    // InternalCloneDetectionDSL.g:637:3: ( '=>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnderAccess().getAnyLevelEnumLiteralDeclaration_1()); 
                    }
                    // InternalCloneDetectionDSL.g:638:3: ( '=>' )
                    // InternalCloneDetectionDSL.g:638:4: '=>'
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
    // InternalCloneDetectionDSL.g:646:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:650:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // InternalCloneDetectionDSL.g:651:2: rule__Project__Group__0__Impl rule__Project__Group__1
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
    // InternalCloneDetectionDSL.g:658:1: rule__Project__Group__0__Impl : ( 'Project' ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:662:1: ( ( 'Project' ) )
            // InternalCloneDetectionDSL.g:663:1: ( 'Project' )
            {
            // InternalCloneDetectionDSL.g:663:1: ( 'Project' )
            // InternalCloneDetectionDSL.g:664:2: 'Project'
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
    // InternalCloneDetectionDSL.g:673:1: rule__Project__Group__1 : rule__Project__Group__1__Impl ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:677:1: ( rule__Project__Group__1__Impl )
            // InternalCloneDetectionDSL.g:678:2: rule__Project__Group__1__Impl
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
    // InternalCloneDetectionDSL.g:684:1: rule__Project__Group__1__Impl : ( ( rule__Project__PathAssignment_1 ) ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:688:1: ( ( ( rule__Project__PathAssignment_1 ) ) )
            // InternalCloneDetectionDSL.g:689:1: ( ( rule__Project__PathAssignment_1 ) )
            {
            // InternalCloneDetectionDSL.g:689:1: ( ( rule__Project__PathAssignment_1 ) )
            // InternalCloneDetectionDSL.g:690:2: ( rule__Project__PathAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectAccess().getPathAssignment_1()); 
            }
            // InternalCloneDetectionDSL.g:691:2: ( rule__Project__PathAssignment_1 )
            // InternalCloneDetectionDSL.g:691:3: rule__Project__PathAssignment_1
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
    // InternalCloneDetectionDSL.g:700:1: rule__SearchRoot__Group__0 : rule__SearchRoot__Group__0__Impl rule__SearchRoot__Group__1 ;
    public final void rule__SearchRoot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:704:1: ( rule__SearchRoot__Group__0__Impl rule__SearchRoot__Group__1 )
            // InternalCloneDetectionDSL.g:705:2: rule__SearchRoot__Group__0__Impl rule__SearchRoot__Group__1
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
    // InternalCloneDetectionDSL.g:712:1: rule__SearchRoot__Group__0__Impl : ( 'SearchRoot' ) ;
    public final void rule__SearchRoot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:716:1: ( ( 'SearchRoot' ) )
            // InternalCloneDetectionDSL.g:717:1: ( 'SearchRoot' )
            {
            // InternalCloneDetectionDSL.g:717:1: ( 'SearchRoot' )
            // InternalCloneDetectionDSL.g:718:2: 'SearchRoot'
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
    // InternalCloneDetectionDSL.g:727:1: rule__SearchRoot__Group__1 : rule__SearchRoot__Group__1__Impl ;
    public final void rule__SearchRoot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:731:1: ( rule__SearchRoot__Group__1__Impl )
            // InternalCloneDetectionDSL.g:732:2: rule__SearchRoot__Group__1__Impl
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
    // InternalCloneDetectionDSL.g:738:1: rule__SearchRoot__Group__1__Impl : ( ( rule__SearchRoot__NodesAssignment_1 ) ) ;
    public final void rule__SearchRoot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:742:1: ( ( ( rule__SearchRoot__NodesAssignment_1 ) ) )
            // InternalCloneDetectionDSL.g:743:1: ( ( rule__SearchRoot__NodesAssignment_1 ) )
            {
            // InternalCloneDetectionDSL.g:743:1: ( ( rule__SearchRoot__NodesAssignment_1 ) )
            // InternalCloneDetectionDSL.g:744:2: ( rule__SearchRoot__NodesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSearchRootAccess().getNodesAssignment_1()); 
            }
            // InternalCloneDetectionDSL.g:745:2: ( rule__SearchRoot__NodesAssignment_1 )
            // InternalCloneDetectionDSL.g:745:3: rule__SearchRoot__NodesAssignment_1
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
    // InternalCloneDetectionDSL.g:754:1: rule__Match__Group__0 : rule__Match__Group__0__Impl rule__Match__Group__1 ;
    public final void rule__Match__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:758:1: ( rule__Match__Group__0__Impl rule__Match__Group__1 )
            // InternalCloneDetectionDSL.g:759:2: rule__Match__Group__0__Impl rule__Match__Group__1
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
    // InternalCloneDetectionDSL.g:766:1: rule__Match__Group__0__Impl : ( 'Match' ) ;
    public final void rule__Match__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:770:1: ( ( 'Match' ) )
            // InternalCloneDetectionDSL.g:771:1: ( 'Match' )
            {
            // InternalCloneDetectionDSL.g:771:1: ( 'Match' )
            // InternalCloneDetectionDSL.g:772:2: 'Match'
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
    // InternalCloneDetectionDSL.g:781:1: rule__Match__Group__1 : rule__Match__Group__1__Impl ;
    public final void rule__Match__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:785:1: ( rule__Match__Group__1__Impl )
            // InternalCloneDetectionDSL.g:786:2: rule__Match__Group__1__Impl
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
    // InternalCloneDetectionDSL.g:792:1: rule__Match__Group__1__Impl : ( ( rule__Match__TargetAssignment_1 ) ) ;
    public final void rule__Match__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:796:1: ( ( ( rule__Match__TargetAssignment_1 ) ) )
            // InternalCloneDetectionDSL.g:797:1: ( ( rule__Match__TargetAssignment_1 ) )
            {
            // InternalCloneDetectionDSL.g:797:1: ( ( rule__Match__TargetAssignment_1 ) )
            // InternalCloneDetectionDSL.g:798:2: ( rule__Match__TargetAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchAccess().getTargetAssignment_1()); 
            }
            // InternalCloneDetectionDSL.g:799:2: ( rule__Match__TargetAssignment_1 )
            // InternalCloneDetectionDSL.g:799:3: rule__Match__TargetAssignment_1
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
    // InternalCloneDetectionDSL.g:808:1: rule__Exclude__Group__0 : rule__Exclude__Group__0__Impl rule__Exclude__Group__1 ;
    public final void rule__Exclude__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:812:1: ( rule__Exclude__Group__0__Impl rule__Exclude__Group__1 )
            // InternalCloneDetectionDSL.g:813:2: rule__Exclude__Group__0__Impl rule__Exclude__Group__1
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
    // InternalCloneDetectionDSL.g:820:1: rule__Exclude__Group__0__Impl : ( 'Exclude' ) ;
    public final void rule__Exclude__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:824:1: ( ( 'Exclude' ) )
            // InternalCloneDetectionDSL.g:825:1: ( 'Exclude' )
            {
            // InternalCloneDetectionDSL.g:825:1: ( 'Exclude' )
            // InternalCloneDetectionDSL.g:826:2: 'Exclude'
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
    // InternalCloneDetectionDSL.g:835:1: rule__Exclude__Group__1 : rule__Exclude__Group__1__Impl ;
    public final void rule__Exclude__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:839:1: ( rule__Exclude__Group__1__Impl )
            // InternalCloneDetectionDSL.g:840:2: rule__Exclude__Group__1__Impl
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
    // InternalCloneDetectionDSL.g:846:1: rule__Exclude__Group__1__Impl : ( ruleNodes ) ;
    public final void rule__Exclude__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:850:1: ( ( ruleNodes ) )
            // InternalCloneDetectionDSL.g:851:1: ( ruleNodes )
            {
            // InternalCloneDetectionDSL.g:851:1: ( ruleNodes )
            // InternalCloneDetectionDSL.g:852:2: ruleNodes
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
    // InternalCloneDetectionDSL.g:862:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:866:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalCloneDetectionDSL.g:867:2: rule__Node__Group__0__Impl rule__Node__Group__1
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
    // InternalCloneDetectionDSL.g:874:1: rule__Node__Group__0__Impl : ( ( rule__Node__Alternatives_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:878:1: ( ( ( rule__Node__Alternatives_0 ) ) )
            // InternalCloneDetectionDSL.g:879:1: ( ( rule__Node__Alternatives_0 ) )
            {
            // InternalCloneDetectionDSL.g:879:1: ( ( rule__Node__Alternatives_0 ) )
            // InternalCloneDetectionDSL.g:880:2: ( rule__Node__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getAlternatives_0()); 
            }
            // InternalCloneDetectionDSL.g:881:2: ( rule__Node__Alternatives_0 )
            // InternalCloneDetectionDSL.g:881:3: rule__Node__Alternatives_0
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
    // InternalCloneDetectionDSL.g:889:1: rule__Node__Group__1 : rule__Node__Group__1__Impl ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:893:1: ( rule__Node__Group__1__Impl )
            // InternalCloneDetectionDSL.g:894:2: rule__Node__Group__1__Impl
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
    // InternalCloneDetectionDSL.g:900:1: rule__Node__Group__1__Impl : ( ( rule__Node__Group_1__0 )? ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:904:1: ( ( ( rule__Node__Group_1__0 )? ) )
            // InternalCloneDetectionDSL.g:905:1: ( ( rule__Node__Group_1__0 )? )
            {
            // InternalCloneDetectionDSL.g:905:1: ( ( rule__Node__Group_1__0 )? )
            // InternalCloneDetectionDSL.g:906:2: ( rule__Node__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup_1()); 
            }
            // InternalCloneDetectionDSL.g:907:2: ( rule__Node__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=27 && LA8_0<=28)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCloneDetectionDSL.g:907:3: rule__Node__Group_1__0
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
    // InternalCloneDetectionDSL.g:916:1: rule__Node__Group_1__0 : rule__Node__Group_1__0__Impl rule__Node__Group_1__1 ;
    public final void rule__Node__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:920:1: ( rule__Node__Group_1__0__Impl rule__Node__Group_1__1 )
            // InternalCloneDetectionDSL.g:921:2: rule__Node__Group_1__0__Impl rule__Node__Group_1__1
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
    // InternalCloneDetectionDSL.g:928:1: rule__Node__Group_1__0__Impl : ( ( rule__Node__UnderAssignment_1_0 ) ) ;
    public final void rule__Node__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:932:1: ( ( ( rule__Node__UnderAssignment_1_0 ) ) )
            // InternalCloneDetectionDSL.g:933:1: ( ( rule__Node__UnderAssignment_1_0 ) )
            {
            // InternalCloneDetectionDSL.g:933:1: ( ( rule__Node__UnderAssignment_1_0 ) )
            // InternalCloneDetectionDSL.g:934:2: ( rule__Node__UnderAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getUnderAssignment_1_0()); 
            }
            // InternalCloneDetectionDSL.g:935:2: ( rule__Node__UnderAssignment_1_0 )
            // InternalCloneDetectionDSL.g:935:3: rule__Node__UnderAssignment_1_0
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
    // InternalCloneDetectionDSL.g:943:1: rule__Node__Group_1__1 : rule__Node__Group_1__1__Impl ;
    public final void rule__Node__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:947:1: ( rule__Node__Group_1__1__Impl )
            // InternalCloneDetectionDSL.g:948:2: rule__Node__Group_1__1__Impl
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
    // InternalCloneDetectionDSL.g:954:1: rule__Node__Group_1__1__Impl : ( ( rule__Node__NodeAssignment_1_1 ) ) ;
    public final void rule__Node__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:958:1: ( ( ( rule__Node__NodeAssignment_1_1 ) ) )
            // InternalCloneDetectionDSL.g:959:1: ( ( rule__Node__NodeAssignment_1_1 ) )
            {
            // InternalCloneDetectionDSL.g:959:1: ( ( rule__Node__NodeAssignment_1_1 ) )
            // InternalCloneDetectionDSL.g:960:2: ( rule__Node__NodeAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getNodeAssignment_1_1()); 
            }
            // InternalCloneDetectionDSL.g:961:2: ( rule__Node__NodeAssignment_1_1 )
            // InternalCloneDetectionDSL.g:961:3: rule__Node__NodeAssignment_1_1
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
    // InternalCloneDetectionDSL.g:970:1: rule__Nodes__Group__0 : rule__Nodes__Group__0__Impl rule__Nodes__Group__1 ;
    public final void rule__Nodes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:974:1: ( rule__Nodes__Group__0__Impl rule__Nodes__Group__1 )
            // InternalCloneDetectionDSL.g:975:2: rule__Nodes__Group__0__Impl rule__Nodes__Group__1
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
    // InternalCloneDetectionDSL.g:982:1: rule__Nodes__Group__0__Impl : ( ( rule__Nodes__NodeAssignment_0 ) ) ;
    public final void rule__Nodes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:986:1: ( ( ( rule__Nodes__NodeAssignment_0 ) ) )
            // InternalCloneDetectionDSL.g:987:1: ( ( rule__Nodes__NodeAssignment_0 ) )
            {
            // InternalCloneDetectionDSL.g:987:1: ( ( rule__Nodes__NodeAssignment_0 ) )
            // InternalCloneDetectionDSL.g:988:2: ( rule__Nodes__NodeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodesAccess().getNodeAssignment_0()); 
            }
            // InternalCloneDetectionDSL.g:989:2: ( rule__Nodes__NodeAssignment_0 )
            // InternalCloneDetectionDSL.g:989:3: rule__Nodes__NodeAssignment_0
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
    // InternalCloneDetectionDSL.g:997:1: rule__Nodes__Group__1 : rule__Nodes__Group__1__Impl ;
    public final void rule__Nodes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1001:1: ( rule__Nodes__Group__1__Impl )
            // InternalCloneDetectionDSL.g:1002:2: rule__Nodes__Group__1__Impl
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
    // InternalCloneDetectionDSL.g:1008:1: rule__Nodes__Group__1__Impl : ( ( rule__Nodes__Group_1__0 )? ) ;
    public final void rule__Nodes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1012:1: ( ( ( rule__Nodes__Group_1__0 )? ) )
            // InternalCloneDetectionDSL.g:1013:1: ( ( rule__Nodes__Group_1__0 )? )
            {
            // InternalCloneDetectionDSL.g:1013:1: ( ( rule__Nodes__Group_1__0 )? )
            // InternalCloneDetectionDSL.g:1014:2: ( rule__Nodes__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodesAccess().getGroup_1()); 
            }
            // InternalCloneDetectionDSL.g:1015:2: ( rule__Nodes__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==33) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1015:3: rule__Nodes__Group_1__0
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
    // InternalCloneDetectionDSL.g:1024:1: rule__Nodes__Group_1__0 : rule__Nodes__Group_1__0__Impl rule__Nodes__Group_1__1 ;
    public final void rule__Nodes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1028:1: ( rule__Nodes__Group_1__0__Impl rule__Nodes__Group_1__1 )
            // InternalCloneDetectionDSL.g:1029:2: rule__Nodes__Group_1__0__Impl rule__Nodes__Group_1__1
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
    // InternalCloneDetectionDSL.g:1036:1: rule__Nodes__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Nodes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1040:1: ( ( ',' ) )
            // InternalCloneDetectionDSL.g:1041:1: ( ',' )
            {
            // InternalCloneDetectionDSL.g:1041:1: ( ',' )
            // InternalCloneDetectionDSL.g:1042:2: ','
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
    // InternalCloneDetectionDSL.g:1051:1: rule__Nodes__Group_1__1 : rule__Nodes__Group_1__1__Impl ;
    public final void rule__Nodes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1055:1: ( rule__Nodes__Group_1__1__Impl )
            // InternalCloneDetectionDSL.g:1056:2: rule__Nodes__Group_1__1__Impl
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
    // InternalCloneDetectionDSL.g:1062:1: rule__Nodes__Group_1__1__Impl : ( ( rule__Nodes__NodesAssignment_1_1 ) ) ;
    public final void rule__Nodes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1066:1: ( ( ( rule__Nodes__NodesAssignment_1_1 ) ) )
            // InternalCloneDetectionDSL.g:1067:1: ( ( rule__Nodes__NodesAssignment_1_1 ) )
            {
            // InternalCloneDetectionDSL.g:1067:1: ( ( rule__Nodes__NodesAssignment_1_1 ) )
            // InternalCloneDetectionDSL.g:1068:2: ( rule__Nodes__NodesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodesAccess().getNodesAssignment_1_1()); 
            }
            // InternalCloneDetectionDSL.g:1069:2: ( rule__Nodes__NodesAssignment_1_1 )
            // InternalCloneDetectionDSL.g:1069:3: rule__Nodes__NodesAssignment_1_1
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


    // $ANTLR start "rule__Size__Group__0"
    // InternalCloneDetectionDSL.g:1078:1: rule__Size__Group__0 : rule__Size__Group__0__Impl rule__Size__Group__1 ;
    public final void rule__Size__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1082:1: ( rule__Size__Group__0__Impl rule__Size__Group__1 )
            // InternalCloneDetectionDSL.g:1083:2: rule__Size__Group__0__Impl rule__Size__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Size__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Size__Group__1();

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
    // $ANTLR end "rule__Size__Group__0"


    // $ANTLR start "rule__Size__Group__0__Impl"
    // InternalCloneDetectionDSL.g:1090:1: rule__Size__Group__0__Impl : ( 'Size' ) ;
    public final void rule__Size__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1094:1: ( ( 'Size' ) )
            // InternalCloneDetectionDSL.g:1095:1: ( 'Size' )
            {
            // InternalCloneDetectionDSL.g:1095:1: ( 'Size' )
            // InternalCloneDetectionDSL.g:1096:2: 'Size'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeAccess().getSizeKeyword_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSizeAccess().getSizeKeyword_0()); 
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
    // $ANTLR end "rule__Size__Group__0__Impl"


    // $ANTLR start "rule__Size__Group__1"
    // InternalCloneDetectionDSL.g:1105:1: rule__Size__Group__1 : rule__Size__Group__1__Impl ;
    public final void rule__Size__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1109:1: ( rule__Size__Group__1__Impl )
            // InternalCloneDetectionDSL.g:1110:2: rule__Size__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Size__Group__1__Impl();

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
    // $ANTLR end "rule__Size__Group__1"


    // $ANTLR start "rule__Size__Group__1__Impl"
    // InternalCloneDetectionDSL.g:1116:1: rule__Size__Group__1__Impl : ( ruleMinSize ) ;
    public final void rule__Size__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1120:1: ( ( ruleMinSize ) )
            // InternalCloneDetectionDSL.g:1121:1: ( ruleMinSize )
            {
            // InternalCloneDetectionDSL.g:1121:1: ( ruleMinSize )
            // InternalCloneDetectionDSL.g:1122:2: ruleMinSize
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeAccess().getMinSizeParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleMinSize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSizeAccess().getMinSizeParserRuleCall_1()); 
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
    // $ANTLR end "rule__Size__Group__1__Impl"


    // $ANTLR start "rule__MinSize__Group__0"
    // InternalCloneDetectionDSL.g:1132:1: rule__MinSize__Group__0 : rule__MinSize__Group__0__Impl rule__MinSize__Group__1 ;
    public final void rule__MinSize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1136:1: ( rule__MinSize__Group__0__Impl rule__MinSize__Group__1 )
            // InternalCloneDetectionDSL.g:1137:2: rule__MinSize__Group__0__Impl rule__MinSize__Group__1
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
    // InternalCloneDetectionDSL.g:1144:1: rule__MinSize__Group__0__Impl : ( ( rule__MinSize__Alternatives_0 ) ) ;
    public final void rule__MinSize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1148:1: ( ( ( rule__MinSize__Alternatives_0 ) ) )
            // InternalCloneDetectionDSL.g:1149:1: ( ( rule__MinSize__Alternatives_0 ) )
            {
            // InternalCloneDetectionDSL.g:1149:1: ( ( rule__MinSize__Alternatives_0 ) )
            // InternalCloneDetectionDSL.g:1150:2: ( rule__MinSize__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getAlternatives_0()); 
            }
            // InternalCloneDetectionDSL.g:1151:2: ( rule__MinSize__Alternatives_0 )
            // InternalCloneDetectionDSL.g:1151:3: rule__MinSize__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__MinSize__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinSizeAccess().getAlternatives_0()); 
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
    // InternalCloneDetectionDSL.g:1159:1: rule__MinSize__Group__1 : rule__MinSize__Group__1__Impl ;
    public final void rule__MinSize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1163:1: ( rule__MinSize__Group__1__Impl )
            // InternalCloneDetectionDSL.g:1164:2: rule__MinSize__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MinSize__Group__1__Impl();

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
    // InternalCloneDetectionDSL.g:1170:1: rule__MinSize__Group__1__Impl : ( ( rule__MinSize__Group_1__0 )? ) ;
    public final void rule__MinSize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1174:1: ( ( ( rule__MinSize__Group_1__0 )? ) )
            // InternalCloneDetectionDSL.g:1175:1: ( ( rule__MinSize__Group_1__0 )? )
            {
            // InternalCloneDetectionDSL.g:1175:1: ( ( rule__MinSize__Group_1__0 )? )
            // InternalCloneDetectionDSL.g:1176:2: ( rule__MinSize__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getGroup_1()); 
            }
            // InternalCloneDetectionDSL.g:1177:2: ( rule__MinSize__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=21 && LA10_0<=22)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1177:3: rule__MinSize__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MinSize__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinSizeAccess().getGroup_1()); 
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


    // $ANTLR start "rule__MinSize__Group_0_1__0"
    // InternalCloneDetectionDSL.g:1186:1: rule__MinSize__Group_0_1__0 : rule__MinSize__Group_0_1__0__Impl rule__MinSize__Group_0_1__1 ;
    public final void rule__MinSize__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1190:1: ( rule__MinSize__Group_0_1__0__Impl rule__MinSize__Group_0_1__1 )
            // InternalCloneDetectionDSL.g:1191:2: rule__MinSize__Group_0_1__0__Impl rule__MinSize__Group_0_1__1
            {
            pushFollow(FOLLOW_8);
            rule__MinSize__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MinSize__Group_0_1__1();

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
    // $ANTLR end "rule__MinSize__Group_0_1__0"


    // $ANTLR start "rule__MinSize__Group_0_1__0__Impl"
    // InternalCloneDetectionDSL.g:1198:1: rule__MinSize__Group_0_1__0__Impl : ( '(' ) ;
    public final void rule__MinSize__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1202:1: ( ( '(' ) )
            // InternalCloneDetectionDSL.g:1203:1: ( '(' )
            {
            // InternalCloneDetectionDSL.g:1203:1: ( '(' )
            // InternalCloneDetectionDSL.g:1204:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getLeftParenthesisKeyword_0_1_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinSizeAccess().getLeftParenthesisKeyword_0_1_0()); 
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
    // $ANTLR end "rule__MinSize__Group_0_1__0__Impl"


    // $ANTLR start "rule__MinSize__Group_0_1__1"
    // InternalCloneDetectionDSL.g:1213:1: rule__MinSize__Group_0_1__1 : rule__MinSize__Group_0_1__1__Impl rule__MinSize__Group_0_1__2 ;
    public final void rule__MinSize__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1217:1: ( rule__MinSize__Group_0_1__1__Impl rule__MinSize__Group_0_1__2 )
            // InternalCloneDetectionDSL.g:1218:2: rule__MinSize__Group_0_1__1__Impl rule__MinSize__Group_0_1__2
            {
            pushFollow(FOLLOW_10);
            rule__MinSize__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MinSize__Group_0_1__2();

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
    // $ANTLR end "rule__MinSize__Group_0_1__1"


    // $ANTLR start "rule__MinSize__Group_0_1__1__Impl"
    // InternalCloneDetectionDSL.g:1225:1: rule__MinSize__Group_0_1__1__Impl : ( ( rule__MinSize__BracketsAssignment_0_1_1 ) ) ;
    public final void rule__MinSize__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1229:1: ( ( ( rule__MinSize__BracketsAssignment_0_1_1 ) ) )
            // InternalCloneDetectionDSL.g:1230:1: ( ( rule__MinSize__BracketsAssignment_0_1_1 ) )
            {
            // InternalCloneDetectionDSL.g:1230:1: ( ( rule__MinSize__BracketsAssignment_0_1_1 ) )
            // InternalCloneDetectionDSL.g:1231:2: ( rule__MinSize__BracketsAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getBracketsAssignment_0_1_1()); 
            }
            // InternalCloneDetectionDSL.g:1232:2: ( rule__MinSize__BracketsAssignment_0_1_1 )
            // InternalCloneDetectionDSL.g:1232:3: rule__MinSize__BracketsAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MinSize__BracketsAssignment_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinSizeAccess().getBracketsAssignment_0_1_1()); 
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
    // $ANTLR end "rule__MinSize__Group_0_1__1__Impl"


    // $ANTLR start "rule__MinSize__Group_0_1__2"
    // InternalCloneDetectionDSL.g:1240:1: rule__MinSize__Group_0_1__2 : rule__MinSize__Group_0_1__2__Impl ;
    public final void rule__MinSize__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1244:1: ( rule__MinSize__Group_0_1__2__Impl )
            // InternalCloneDetectionDSL.g:1245:2: rule__MinSize__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MinSize__Group_0_1__2__Impl();

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
    // $ANTLR end "rule__MinSize__Group_0_1__2"


    // $ANTLR start "rule__MinSize__Group_0_1__2__Impl"
    // InternalCloneDetectionDSL.g:1251:1: rule__MinSize__Group_0_1__2__Impl : ( ')' ) ;
    public final void rule__MinSize__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1255:1: ( ( ')' ) )
            // InternalCloneDetectionDSL.g:1256:1: ( ')' )
            {
            // InternalCloneDetectionDSL.g:1256:1: ( ')' )
            // InternalCloneDetectionDSL.g:1257:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getRightParenthesisKeyword_0_1_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinSizeAccess().getRightParenthesisKeyword_0_1_2()); 
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
    // $ANTLR end "rule__MinSize__Group_0_1__2__Impl"


    // $ANTLR start "rule__MinSize__Group_1__0"
    // InternalCloneDetectionDSL.g:1267:1: rule__MinSize__Group_1__0 : rule__MinSize__Group_1__0__Impl rule__MinSize__Group_1__1 ;
    public final void rule__MinSize__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1271:1: ( rule__MinSize__Group_1__0__Impl rule__MinSize__Group_1__1 )
            // InternalCloneDetectionDSL.g:1272:2: rule__MinSize__Group_1__0__Impl rule__MinSize__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__MinSize__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MinSize__Group_1__1();

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
    // $ANTLR end "rule__MinSize__Group_1__0"


    // $ANTLR start "rule__MinSize__Group_1__0__Impl"
    // InternalCloneDetectionDSL.g:1279:1: rule__MinSize__Group_1__0__Impl : ( ( rule__MinSize__OperatorAssignment_1_0 ) ) ;
    public final void rule__MinSize__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1283:1: ( ( ( rule__MinSize__OperatorAssignment_1_0 ) ) )
            // InternalCloneDetectionDSL.g:1284:1: ( ( rule__MinSize__OperatorAssignment_1_0 ) )
            {
            // InternalCloneDetectionDSL.g:1284:1: ( ( rule__MinSize__OperatorAssignment_1_0 ) )
            // InternalCloneDetectionDSL.g:1285:2: ( rule__MinSize__OperatorAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getOperatorAssignment_1_0()); 
            }
            // InternalCloneDetectionDSL.g:1286:2: ( rule__MinSize__OperatorAssignment_1_0 )
            // InternalCloneDetectionDSL.g:1286:3: rule__MinSize__OperatorAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MinSize__OperatorAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinSizeAccess().getOperatorAssignment_1_0()); 
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
    // $ANTLR end "rule__MinSize__Group_1__0__Impl"


    // $ANTLR start "rule__MinSize__Group_1__1"
    // InternalCloneDetectionDSL.g:1294:1: rule__MinSize__Group_1__1 : rule__MinSize__Group_1__1__Impl ;
    public final void rule__MinSize__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1298:1: ( rule__MinSize__Group_1__1__Impl )
            // InternalCloneDetectionDSL.g:1299:2: rule__MinSize__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MinSize__Group_1__1__Impl();

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
    // $ANTLR end "rule__MinSize__Group_1__1"


    // $ANTLR start "rule__MinSize__Group_1__1__Impl"
    // InternalCloneDetectionDSL.g:1305:1: rule__MinSize__Group_1__1__Impl : ( ( rule__MinSize__SizeAssignment_1_1 ) ) ;
    public final void rule__MinSize__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1309:1: ( ( ( rule__MinSize__SizeAssignment_1_1 ) ) )
            // InternalCloneDetectionDSL.g:1310:1: ( ( rule__MinSize__SizeAssignment_1_1 ) )
            {
            // InternalCloneDetectionDSL.g:1310:1: ( ( rule__MinSize__SizeAssignment_1_1 ) )
            // InternalCloneDetectionDSL.g:1311:2: ( rule__MinSize__SizeAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getSizeAssignment_1_1()); 
            }
            // InternalCloneDetectionDSL.g:1312:2: ( rule__MinSize__SizeAssignment_1_1 )
            // InternalCloneDetectionDSL.g:1312:3: rule__MinSize__SizeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MinSize__SizeAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinSizeAccess().getSizeAssignment_1_1()); 
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
    // $ANTLR end "rule__MinSize__Group_1__1__Impl"


    // $ANTLR start "rule__MetricExpr__Group__0"
    // InternalCloneDetectionDSL.g:1321:1: rule__MetricExpr__Group__0 : rule__MetricExpr__Group__0__Impl rule__MetricExpr__Group__1 ;
    public final void rule__MetricExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1325:1: ( rule__MetricExpr__Group__0__Impl rule__MetricExpr__Group__1 )
            // InternalCloneDetectionDSL.g:1326:2: rule__MetricExpr__Group__0__Impl rule__MetricExpr__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalCloneDetectionDSL.g:1333:1: rule__MetricExpr__Group__0__Impl : ( ( rule__MetricExpr__AmountAssignment_0 ) ) ;
    public final void rule__MetricExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1337:1: ( ( ( rule__MetricExpr__AmountAssignment_0 ) ) )
            // InternalCloneDetectionDSL.g:1338:1: ( ( rule__MetricExpr__AmountAssignment_0 ) )
            {
            // InternalCloneDetectionDSL.g:1338:1: ( ( rule__MetricExpr__AmountAssignment_0 ) )
            // InternalCloneDetectionDSL.g:1339:2: ( rule__MetricExpr__AmountAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricExprAccess().getAmountAssignment_0()); 
            }
            // InternalCloneDetectionDSL.g:1340:2: ( rule__MetricExpr__AmountAssignment_0 )
            // InternalCloneDetectionDSL.g:1340:3: rule__MetricExpr__AmountAssignment_0
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
    // InternalCloneDetectionDSL.g:1348:1: rule__MetricExpr__Group__1 : rule__MetricExpr__Group__1__Impl ;
    public final void rule__MetricExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1352:1: ( rule__MetricExpr__Group__1__Impl )
            // InternalCloneDetectionDSL.g:1353:2: rule__MetricExpr__Group__1__Impl
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
    // InternalCloneDetectionDSL.g:1359:1: rule__MetricExpr__Group__1__Impl : ( ( rule__MetricExpr__MetricAssignment_1 ) ) ;
    public final void rule__MetricExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1363:1: ( ( ( rule__MetricExpr__MetricAssignment_1 ) ) )
            // InternalCloneDetectionDSL.g:1364:1: ( ( rule__MetricExpr__MetricAssignment_1 ) )
            {
            // InternalCloneDetectionDSL.g:1364:1: ( ( rule__MetricExpr__MetricAssignment_1 ) )
            // InternalCloneDetectionDSL.g:1365:2: ( rule__MetricExpr__MetricAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricExprAccess().getMetricAssignment_1()); 
            }
            // InternalCloneDetectionDSL.g:1366:2: ( rule__MetricExpr__MetricAssignment_1 )
            // InternalCloneDetectionDSL.g:1366:3: rule__MetricExpr__MetricAssignment_1
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
    // InternalCloneDetectionDSL.g:1375:1: rule__DoNotCompare__Group__0 : rule__DoNotCompare__Group__0__Impl rule__DoNotCompare__Group__1 ;
    public final void rule__DoNotCompare__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1379:1: ( rule__DoNotCompare__Group__0__Impl rule__DoNotCompare__Group__1 )
            // InternalCloneDetectionDSL.g:1380:2: rule__DoNotCompare__Group__0__Impl rule__DoNotCompare__Group__1
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
    // InternalCloneDetectionDSL.g:1387:1: rule__DoNotCompare__Group__0__Impl : ( 'DoNotCompare' ) ;
    public final void rule__DoNotCompare__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1391:1: ( ( 'DoNotCompare' ) )
            // InternalCloneDetectionDSL.g:1392:1: ( 'DoNotCompare' )
            {
            // InternalCloneDetectionDSL.g:1392:1: ( 'DoNotCompare' )
            // InternalCloneDetectionDSL.g:1393:2: 'DoNotCompare'
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
    // InternalCloneDetectionDSL.g:1402:1: rule__DoNotCompare__Group__1 : rule__DoNotCompare__Group__1__Impl ;
    public final void rule__DoNotCompare__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1406:1: ( rule__DoNotCompare__Group__1__Impl )
            // InternalCloneDetectionDSL.g:1407:2: rule__DoNotCompare__Group__1__Impl
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
    // InternalCloneDetectionDSL.g:1413:1: rule__DoNotCompare__Group__1__Impl : ( ruleNodes ) ;
    public final void rule__DoNotCompare__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1417:1: ( ( ruleNodes ) )
            // InternalCloneDetectionDSL.g:1418:1: ( ruleNodes )
            {
            // InternalCloneDetectionDSL.g:1418:1: ( ruleNodes )
            // InternalCloneDetectionDSL.g:1419:2: ruleNodes
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
    // InternalCloneDetectionDSL.g:1429:1: rule__Compare__Group__0 : rule__Compare__Group__0__Impl rule__Compare__Group__1 ;
    public final void rule__Compare__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1433:1: ( rule__Compare__Group__0__Impl rule__Compare__Group__1 )
            // InternalCloneDetectionDSL.g:1434:2: rule__Compare__Group__0__Impl rule__Compare__Group__1
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
    // InternalCloneDetectionDSL.g:1441:1: rule__Compare__Group__0__Impl : ( 'Compare' ) ;
    public final void rule__Compare__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1445:1: ( ( 'Compare' ) )
            // InternalCloneDetectionDSL.g:1446:1: ( 'Compare' )
            {
            // InternalCloneDetectionDSL.g:1446:1: ( 'Compare' )
            // InternalCloneDetectionDSL.g:1447:2: 'Compare'
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
    // InternalCloneDetectionDSL.g:1456:1: rule__Compare__Group__1 : rule__Compare__Group__1__Impl rule__Compare__Group__2 ;
    public final void rule__Compare__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1460:1: ( rule__Compare__Group__1__Impl rule__Compare__Group__2 )
            // InternalCloneDetectionDSL.g:1461:2: rule__Compare__Group__1__Impl rule__Compare__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalCloneDetectionDSL.g:1468:1: rule__Compare__Group__1__Impl : ( ( rule__Compare__NodesAssignment_1 ) ) ;
    public final void rule__Compare__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1472:1: ( ( ( rule__Compare__NodesAssignment_1 ) ) )
            // InternalCloneDetectionDSL.g:1473:1: ( ( rule__Compare__NodesAssignment_1 ) )
            {
            // InternalCloneDetectionDSL.g:1473:1: ( ( rule__Compare__NodesAssignment_1 ) )
            // InternalCloneDetectionDSL.g:1474:2: ( rule__Compare__NodesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getNodesAssignment_1()); 
            }
            // InternalCloneDetectionDSL.g:1475:2: ( rule__Compare__NodesAssignment_1 )
            // InternalCloneDetectionDSL.g:1475:3: rule__Compare__NodesAssignment_1
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
    // InternalCloneDetectionDSL.g:1483:1: rule__Compare__Group__2 : rule__Compare__Group__2__Impl rule__Compare__Group__3 ;
    public final void rule__Compare__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1487:1: ( rule__Compare__Group__2__Impl rule__Compare__Group__3 )
            // InternalCloneDetectionDSL.g:1488:2: rule__Compare__Group__2__Impl rule__Compare__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalCloneDetectionDSL.g:1495:1: rule__Compare__Group__2__Impl : ( ( rule__Compare__ComparisonMethodAssignment_2 ) ) ;
    public final void rule__Compare__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1499:1: ( ( ( rule__Compare__ComparisonMethodAssignment_2 ) ) )
            // InternalCloneDetectionDSL.g:1500:1: ( ( rule__Compare__ComparisonMethodAssignment_2 ) )
            {
            // InternalCloneDetectionDSL.g:1500:1: ( ( rule__Compare__ComparisonMethodAssignment_2 ) )
            // InternalCloneDetectionDSL.g:1501:2: ( rule__Compare__ComparisonMethodAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getComparisonMethodAssignment_2()); 
            }
            // InternalCloneDetectionDSL.g:1502:2: ( rule__Compare__ComparisonMethodAssignment_2 )
            // InternalCloneDetectionDSL.g:1502:3: rule__Compare__ComparisonMethodAssignment_2
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
    // InternalCloneDetectionDSL.g:1510:1: rule__Compare__Group__3 : rule__Compare__Group__3__Impl rule__Compare__Group__4 ;
    public final void rule__Compare__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1514:1: ( rule__Compare__Group__3__Impl rule__Compare__Group__4 )
            // InternalCloneDetectionDSL.g:1515:2: rule__Compare__Group__3__Impl rule__Compare__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalCloneDetectionDSL.g:1522:1: rule__Compare__Group__3__Impl : ( ( rule__Compare__DeepestNodeAssignment_3 )? ) ;
    public final void rule__Compare__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1526:1: ( ( ( rule__Compare__DeepestNodeAssignment_3 )? ) )
            // InternalCloneDetectionDSL.g:1527:1: ( ( rule__Compare__DeepestNodeAssignment_3 )? )
            {
            // InternalCloneDetectionDSL.g:1527:1: ( ( rule__Compare__DeepestNodeAssignment_3 )? )
            // InternalCloneDetectionDSL.g:1528:2: ( rule__Compare__DeepestNodeAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getDeepestNodeAssignment_3()); 
            }
            // InternalCloneDetectionDSL.g:1529:2: ( rule__Compare__DeepestNodeAssignment_3 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID||LA11_0==11) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1529:3: rule__Compare__DeepestNodeAssignment_3
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
    // InternalCloneDetectionDSL.g:1537:1: rule__Compare__Group__4 : rule__Compare__Group__4__Impl ;
    public final void rule__Compare__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1541:1: ( rule__Compare__Group__4__Impl )
            // InternalCloneDetectionDSL.g:1542:2: rule__Compare__Group__4__Impl
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
    // InternalCloneDetectionDSL.g:1548:1: rule__Compare__Group__4__Impl : ( ( rule__Compare__PercAssignment_4 )? ) ;
    public final void rule__Compare__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1552:1: ( ( ( rule__Compare__PercAssignment_4 )? ) )
            // InternalCloneDetectionDSL.g:1553:1: ( ( rule__Compare__PercAssignment_4 )? )
            {
            // InternalCloneDetectionDSL.g:1553:1: ( ( rule__Compare__PercAssignment_4 )? )
            // InternalCloneDetectionDSL.g:1554:2: ( rule__Compare__PercAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getPercAssignment_4()); 
            }
            // InternalCloneDetectionDSL.g:1555:2: ( rule__Compare__PercAssignment_4 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1555:3: rule__Compare__PercAssignment_4
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
    // InternalCloneDetectionDSL.g:1564:1: rule__Percentage__Group__0 : rule__Percentage__Group__0__Impl rule__Percentage__Group__1 ;
    public final void rule__Percentage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1568:1: ( rule__Percentage__Group__0__Impl rule__Percentage__Group__1 )
            // InternalCloneDetectionDSL.g:1569:2: rule__Percentage__Group__0__Impl rule__Percentage__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalCloneDetectionDSL.g:1576:1: rule__Percentage__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Percentage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1580:1: ( ( RULE_INT ) )
            // InternalCloneDetectionDSL.g:1581:1: ( RULE_INT )
            {
            // InternalCloneDetectionDSL.g:1581:1: ( RULE_INT )
            // InternalCloneDetectionDSL.g:1582:2: RULE_INT
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
    // InternalCloneDetectionDSL.g:1591:1: rule__Percentage__Group__1 : rule__Percentage__Group__1__Impl ;
    public final void rule__Percentage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1595:1: ( rule__Percentage__Group__1__Impl )
            // InternalCloneDetectionDSL.g:1596:2: rule__Percentage__Group__1__Impl
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
    // InternalCloneDetectionDSL.g:1602:1: rule__Percentage__Group__1__Impl : ( '%' ) ;
    public final void rule__Percentage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1606:1: ( ( '%' ) )
            // InternalCloneDetectionDSL.g:1607:1: ( '%' )
            {
            // InternalCloneDetectionDSL.g:1607:1: ( '%' )
            // InternalCloneDetectionDSL.g:1608:2: '%'
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
    // InternalCloneDetectionDSL.g:1618:1: rule__CloneDetection__UnorderedGroup : rule__CloneDetection__UnorderedGroup__0 {...}?;
    public final void rule__CloneDetection__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getCloneDetectionAccess().getUnorderedGroup());
        	
        try {
            // InternalCloneDetectionDSL.g:1623:1: ( rule__CloneDetection__UnorderedGroup__0 {...}?)
            // InternalCloneDetectionDSL.g:1624:2: rule__CloneDetection__UnorderedGroup__0 {...}?
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
    // InternalCloneDetectionDSL.g:1632:1: rule__CloneDetection__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__RootAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* ) ) ) ) ) ;
    public final void rule__CloneDetection__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalCloneDetectionDSL.g:1637:1: ( ( ({...}? => ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__RootAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* ) ) ) ) ) )
            // InternalCloneDetectionDSL.g:1638:3: ( ({...}? => ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__RootAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* ) ) ) ) )
            {
            // InternalCloneDetectionDSL.g:1638:3: ( ({...}? => ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__RootAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* ) ) ) ) )
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
                    // InternalCloneDetectionDSL.g:1639:3: ({...}? => ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) ) )
                    {
                    // InternalCloneDetectionDSL.g:1639:3: ({...}? => ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) ) )
                    // InternalCloneDetectionDSL.g:1640:4: {...}? => ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__CloneDetection__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalCloneDetectionDSL.g:1640:108: ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) )
                    // InternalCloneDetectionDSL.g:1641:5: ( ( rule__CloneDetection__ProjectAssignment_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0);
                    selected = true;
                    // InternalCloneDetectionDSL.g:1647:5: ( ( rule__CloneDetection__ProjectAssignment_0 ) )
                    // InternalCloneDetectionDSL.g:1648:6: ( rule__CloneDetection__ProjectAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getProjectAssignment_0()); 
                    }
                    // InternalCloneDetectionDSL.g:1649:6: ( rule__CloneDetection__ProjectAssignment_0 )
                    // InternalCloneDetectionDSL.g:1649:7: rule__CloneDetection__ProjectAssignment_0
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
                    // InternalCloneDetectionDSL.g:1654:3: ({...}? => ( ( ( rule__CloneDetection__RootAssignment_1 ) ) ) )
                    {
                    // InternalCloneDetectionDSL.g:1654:3: ({...}? => ( ( ( rule__CloneDetection__RootAssignment_1 ) ) ) )
                    // InternalCloneDetectionDSL.g:1655:4: {...}? => ( ( ( rule__CloneDetection__RootAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__CloneDetection__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalCloneDetectionDSL.g:1655:108: ( ( ( rule__CloneDetection__RootAssignment_1 ) ) )
                    // InternalCloneDetectionDSL.g:1656:5: ( ( rule__CloneDetection__RootAssignment_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1);
                    selected = true;
                    // InternalCloneDetectionDSL.g:1662:5: ( ( rule__CloneDetection__RootAssignment_1 ) )
                    // InternalCloneDetectionDSL.g:1663:6: ( rule__CloneDetection__RootAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getRootAssignment_1()); 
                    }
                    // InternalCloneDetectionDSL.g:1664:6: ( rule__CloneDetection__RootAssignment_1 )
                    // InternalCloneDetectionDSL.g:1664:7: rule__CloneDetection__RootAssignment_1
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
                    // InternalCloneDetectionDSL.g:1669:3: ({...}? => ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) ) )
                    {
                    // InternalCloneDetectionDSL.g:1669:3: ({...}? => ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) ) )
                    // InternalCloneDetectionDSL.g:1670:4: {...}? => ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__CloneDetection__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalCloneDetectionDSL.g:1670:108: ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) )
                    // InternalCloneDetectionDSL.g:1671:5: ( ( rule__CloneDetection__MatchAssignment_2 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2);
                    selected = true;
                    // InternalCloneDetectionDSL.g:1677:5: ( ( rule__CloneDetection__MatchAssignment_2 ) )
                    // InternalCloneDetectionDSL.g:1678:6: ( rule__CloneDetection__MatchAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getMatchAssignment_2()); 
                    }
                    // InternalCloneDetectionDSL.g:1679:6: ( rule__CloneDetection__MatchAssignment_2 )
                    // InternalCloneDetectionDSL.g:1679:7: rule__CloneDetection__MatchAssignment_2
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
                    // InternalCloneDetectionDSL.g:1684:3: ({...}? => ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) ) )
                    {
                    // InternalCloneDetectionDSL.g:1684:3: ({...}? => ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) ) )
                    // InternalCloneDetectionDSL.g:1685:4: {...}? => ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__CloneDetection__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3)");
                    }
                    // InternalCloneDetectionDSL.g:1685:108: ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) )
                    // InternalCloneDetectionDSL.g:1686:5: ( ( rule__CloneDetection__ExcludeAssignment_3 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3);
                    selected = true;
                    // InternalCloneDetectionDSL.g:1692:5: ( ( rule__CloneDetection__ExcludeAssignment_3 ) )
                    // InternalCloneDetectionDSL.g:1693:6: ( rule__CloneDetection__ExcludeAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getExcludeAssignment_3()); 
                    }
                    // InternalCloneDetectionDSL.g:1694:6: ( rule__CloneDetection__ExcludeAssignment_3 )
                    // InternalCloneDetectionDSL.g:1694:7: rule__CloneDetection__ExcludeAssignment_3
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
                    // InternalCloneDetectionDSL.g:1699:3: ({...}? => ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) ) )
                    {
                    // InternalCloneDetectionDSL.g:1699:3: ({...}? => ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) ) )
                    // InternalCloneDetectionDSL.g:1700:4: {...}? => ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__CloneDetection__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4)");
                    }
                    // InternalCloneDetectionDSL.g:1700:108: ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) )
                    // InternalCloneDetectionDSL.g:1701:5: ( ( rule__CloneDetection__SizeAssignment_4 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4);
                    selected = true;
                    // InternalCloneDetectionDSL.g:1707:5: ( ( rule__CloneDetection__SizeAssignment_4 ) )
                    // InternalCloneDetectionDSL.g:1708:6: ( rule__CloneDetection__SizeAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getSizeAssignment_4()); 
                    }
                    // InternalCloneDetectionDSL.g:1709:6: ( rule__CloneDetection__SizeAssignment_4 )
                    // InternalCloneDetectionDSL.g:1709:7: rule__CloneDetection__SizeAssignment_4
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
                    // InternalCloneDetectionDSL.g:1714:3: ({...}? => ( ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) ) ) )
                    {
                    // InternalCloneDetectionDSL.g:1714:3: ({...}? => ( ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) ) ) )
                    // InternalCloneDetectionDSL.g:1715:4: {...}? => ( ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__CloneDetection__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5)");
                    }
                    // InternalCloneDetectionDSL.g:1715:108: ( ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) ) )
                    // InternalCloneDetectionDSL.g:1716:5: ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5);
                    selected = true;
                    // InternalCloneDetectionDSL.g:1722:5: ( ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* ) )
                    // InternalCloneDetectionDSL.g:1723:6: ( ( rule__CloneDetection__NotCompareAssignment_5 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* )
                    {
                    // InternalCloneDetectionDSL.g:1723:6: ( ( rule__CloneDetection__NotCompareAssignment_5 ) )
                    // InternalCloneDetectionDSL.g:1724:7: ( rule__CloneDetection__NotCompareAssignment_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getNotCompareAssignment_5()); 
                    }
                    // InternalCloneDetectionDSL.g:1725:7: ( rule__CloneDetection__NotCompareAssignment_5 )
                    // InternalCloneDetectionDSL.g:1725:8: rule__CloneDetection__NotCompareAssignment_5
                    {
                    pushFollow(FOLLOW_15);
                    rule__CloneDetection__NotCompareAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCloneDetectionAccess().getNotCompareAssignment_5()); 
                    }

                    }

                    // InternalCloneDetectionDSL.g:1728:6: ( ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )* )
                    // InternalCloneDetectionDSL.g:1729:7: ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getNotCompareAssignment_5()); 
                    }
                    // InternalCloneDetectionDSL.g:1730:7: ( ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5 )*
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
                    	    // InternalCloneDetectionDSL.g:1730:8: ( rule__CloneDetection__NotCompareAssignment_5 )=> rule__CloneDetection__NotCompareAssignment_5
                    	    {
                    	    pushFollow(FOLLOW_15);
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
                    // InternalCloneDetectionDSL.g:1736:3: ({...}? => ( ( ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* ) ) ) )
                    {
                    // InternalCloneDetectionDSL.g:1736:3: ({...}? => ( ( ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* ) ) ) )
                    // InternalCloneDetectionDSL.g:1737:4: {...}? => ( ( ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__CloneDetection__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6)");
                    }
                    // InternalCloneDetectionDSL.g:1737:108: ( ( ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* ) ) )
                    // InternalCloneDetectionDSL.g:1738:5: ( ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6);
                    selected = true;
                    // InternalCloneDetectionDSL.g:1744:5: ( ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* ) )
                    // InternalCloneDetectionDSL.g:1745:6: ( ( rule__CloneDetection__CompareAssignment_6 ) ) ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* )
                    {
                    // InternalCloneDetectionDSL.g:1745:6: ( ( rule__CloneDetection__CompareAssignment_6 ) )
                    // InternalCloneDetectionDSL.g:1746:7: ( rule__CloneDetection__CompareAssignment_6 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getCompareAssignment_6()); 
                    }
                    // InternalCloneDetectionDSL.g:1747:7: ( rule__CloneDetection__CompareAssignment_6 )
                    // InternalCloneDetectionDSL.g:1747:8: rule__CloneDetection__CompareAssignment_6
                    {
                    pushFollow(FOLLOW_16);
                    rule__CloneDetection__CompareAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCloneDetectionAccess().getCompareAssignment_6()); 
                    }

                    }

                    // InternalCloneDetectionDSL.g:1750:6: ( ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )* )
                    // InternalCloneDetectionDSL.g:1751:7: ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getCompareAssignment_6()); 
                    }
                    // InternalCloneDetectionDSL.g:1752:7: ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )*
                    loop14:
                    do {
                        int alt14=2;
                        alt14 = dfa14.predict(input);
                        switch (alt14) {
                    	case 1 :
                    	    // InternalCloneDetectionDSL.g:1752:8: ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6
                    	    {
                    	    pushFollow(FOLLOW_16);
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
    // InternalCloneDetectionDSL.g:1766:1: rule__CloneDetection__UnorderedGroup__0 : rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__1 )? ;
    public final void rule__CloneDetection__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1770:1: ( rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__1 )? )
            // InternalCloneDetectionDSL.g:1771:2: rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_17);
            rule__CloneDetection__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalCloneDetectionDSL.g:1772:2: ( rule__CloneDetection__UnorderedGroup__1 )?
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
                    // InternalCloneDetectionDSL.g:1772:2: rule__CloneDetection__UnorderedGroup__1
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
    // InternalCloneDetectionDSL.g:1778:1: rule__CloneDetection__UnorderedGroup__1 : rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__2 )? ;
    public final void rule__CloneDetection__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1782:1: ( rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__2 )? )
            // InternalCloneDetectionDSL.g:1783:2: rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_17);
            rule__CloneDetection__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalCloneDetectionDSL.g:1784:2: ( rule__CloneDetection__UnorderedGroup__2 )?
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
                    // InternalCloneDetectionDSL.g:1784:2: rule__CloneDetection__UnorderedGroup__2
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
    // InternalCloneDetectionDSL.g:1790:1: rule__CloneDetection__UnorderedGroup__2 : rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__3 )? ;
    public final void rule__CloneDetection__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1794:1: ( rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__3 )? )
            // InternalCloneDetectionDSL.g:1795:2: rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__3 )?
            {
            pushFollow(FOLLOW_17);
            rule__CloneDetection__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalCloneDetectionDSL.g:1796:2: ( rule__CloneDetection__UnorderedGroup__3 )?
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
                    // InternalCloneDetectionDSL.g:1796:2: rule__CloneDetection__UnorderedGroup__3
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
    // InternalCloneDetectionDSL.g:1802:1: rule__CloneDetection__UnorderedGroup__3 : rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__4 )? ;
    public final void rule__CloneDetection__UnorderedGroup__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1806:1: ( rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__4 )? )
            // InternalCloneDetectionDSL.g:1807:2: rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__4 )?
            {
            pushFollow(FOLLOW_17);
            rule__CloneDetection__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalCloneDetectionDSL.g:1808:2: ( rule__CloneDetection__UnorderedGroup__4 )?
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
                    // InternalCloneDetectionDSL.g:1808:2: rule__CloneDetection__UnorderedGroup__4
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
    // InternalCloneDetectionDSL.g:1814:1: rule__CloneDetection__UnorderedGroup__4 : rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__5 )? ;
    public final void rule__CloneDetection__UnorderedGroup__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1818:1: ( rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__5 )? )
            // InternalCloneDetectionDSL.g:1819:2: rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__5 )?
            {
            pushFollow(FOLLOW_17);
            rule__CloneDetection__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalCloneDetectionDSL.g:1820:2: ( rule__CloneDetection__UnorderedGroup__5 )?
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
                    // InternalCloneDetectionDSL.g:1820:2: rule__CloneDetection__UnorderedGroup__5
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
    // InternalCloneDetectionDSL.g:1826:1: rule__CloneDetection__UnorderedGroup__5 : rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__6 )? ;
    public final void rule__CloneDetection__UnorderedGroup__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1830:1: ( rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__6 )? )
            // InternalCloneDetectionDSL.g:1831:2: rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__6 )?
            {
            pushFollow(FOLLOW_17);
            rule__CloneDetection__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalCloneDetectionDSL.g:1832:2: ( rule__CloneDetection__UnorderedGroup__6 )?
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
                    // InternalCloneDetectionDSL.g:1832:2: rule__CloneDetection__UnorderedGroup__6
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
    // InternalCloneDetectionDSL.g:1838:1: rule__CloneDetection__UnorderedGroup__6 : rule__CloneDetection__UnorderedGroup__Impl ;
    public final void rule__CloneDetection__UnorderedGroup__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1842:1: ( rule__CloneDetection__UnorderedGroup__Impl )
            // InternalCloneDetectionDSL.g:1843:2: rule__CloneDetection__UnorderedGroup__Impl
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
    // InternalCloneDetectionDSL.g:1850:1: rule__CloneDetection__ProjectAssignment_0 : ( ruleProject ) ;
    public final void rule__CloneDetection__ProjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1854:1: ( ( ruleProject ) )
            // InternalCloneDetectionDSL.g:1855:2: ( ruleProject )
            {
            // InternalCloneDetectionDSL.g:1855:2: ( ruleProject )
            // InternalCloneDetectionDSL.g:1856:3: ruleProject
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
    // InternalCloneDetectionDSL.g:1865:1: rule__CloneDetection__RootAssignment_1 : ( ruleSearchRoot ) ;
    public final void rule__CloneDetection__RootAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1869:1: ( ( ruleSearchRoot ) )
            // InternalCloneDetectionDSL.g:1870:2: ( ruleSearchRoot )
            {
            // InternalCloneDetectionDSL.g:1870:2: ( ruleSearchRoot )
            // InternalCloneDetectionDSL.g:1871:3: ruleSearchRoot
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
    // InternalCloneDetectionDSL.g:1880:1: rule__CloneDetection__MatchAssignment_2 : ( ruleMatch ) ;
    public final void rule__CloneDetection__MatchAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1884:1: ( ( ruleMatch ) )
            // InternalCloneDetectionDSL.g:1885:2: ( ruleMatch )
            {
            // InternalCloneDetectionDSL.g:1885:2: ( ruleMatch )
            // InternalCloneDetectionDSL.g:1886:3: ruleMatch
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
    // InternalCloneDetectionDSL.g:1895:1: rule__CloneDetection__ExcludeAssignment_3 : ( ruleExclude ) ;
    public final void rule__CloneDetection__ExcludeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1899:1: ( ( ruleExclude ) )
            // InternalCloneDetectionDSL.g:1900:2: ( ruleExclude )
            {
            // InternalCloneDetectionDSL.g:1900:2: ( ruleExclude )
            // InternalCloneDetectionDSL.g:1901:3: ruleExclude
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
    // InternalCloneDetectionDSL.g:1910:1: rule__CloneDetection__SizeAssignment_4 : ( ruleSize ) ;
    public final void rule__CloneDetection__SizeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1914:1: ( ( ruleSize ) )
            // InternalCloneDetectionDSL.g:1915:2: ( ruleSize )
            {
            // InternalCloneDetectionDSL.g:1915:2: ( ruleSize )
            // InternalCloneDetectionDSL.g:1916:3: ruleSize
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCloneDetectionAccess().getSizeSizeParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCloneDetectionAccess().getSizeSizeParserRuleCall_4_0()); 
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
    // InternalCloneDetectionDSL.g:1925:1: rule__CloneDetection__NotCompareAssignment_5 : ( ruleDoNotCompare ) ;
    public final void rule__CloneDetection__NotCompareAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1929:1: ( ( ruleDoNotCompare ) )
            // InternalCloneDetectionDSL.g:1930:2: ( ruleDoNotCompare )
            {
            // InternalCloneDetectionDSL.g:1930:2: ( ruleDoNotCompare )
            // InternalCloneDetectionDSL.g:1931:3: ruleDoNotCompare
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
    // InternalCloneDetectionDSL.g:1940:1: rule__CloneDetection__CompareAssignment_6 : ( ruleCompare ) ;
    public final void rule__CloneDetection__CompareAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1944:1: ( ( ruleCompare ) )
            // InternalCloneDetectionDSL.g:1945:2: ( ruleCompare )
            {
            // InternalCloneDetectionDSL.g:1945:2: ( ruleCompare )
            // InternalCloneDetectionDSL.g:1946:3: ruleCompare
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
    // InternalCloneDetectionDSL.g:1955:1: rule__Project__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Project__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1959:1: ( ( RULE_STRING ) )
            // InternalCloneDetectionDSL.g:1960:2: ( RULE_STRING )
            {
            // InternalCloneDetectionDSL.g:1960:2: ( RULE_STRING )
            // InternalCloneDetectionDSL.g:1961:3: RULE_STRING
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
    // InternalCloneDetectionDSL.g:1970:1: rule__SearchRoot__NodesAssignment_1 : ( ruleNodes ) ;
    public final void rule__SearchRoot__NodesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1974:1: ( ( ruleNodes ) )
            // InternalCloneDetectionDSL.g:1975:2: ( ruleNodes )
            {
            // InternalCloneDetectionDSL.g:1975:2: ( ruleNodes )
            // InternalCloneDetectionDSL.g:1976:3: ruleNodes
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
    // InternalCloneDetectionDSL.g:1985:1: rule__Match__TargetAssignment_1 : ( ruleMatchTarget ) ;
    public final void rule__Match__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1989:1: ( ( ruleMatchTarget ) )
            // InternalCloneDetectionDSL.g:1990:2: ( ruleMatchTarget )
            {
            // InternalCloneDetectionDSL.g:1990:2: ( ruleMatchTarget )
            // InternalCloneDetectionDSL.g:1991:3: ruleMatchTarget
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
    // InternalCloneDetectionDSL.g:2000:1: rule__Node__NameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2004:1: ( ( RULE_ID ) )
            // InternalCloneDetectionDSL.g:2005:2: ( RULE_ID )
            {
            // InternalCloneDetectionDSL.g:2005:2: ( RULE_ID )
            // InternalCloneDetectionDSL.g:2006:3: RULE_ID
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
    // InternalCloneDetectionDSL.g:2015:1: rule__Node__UnderAssignment_1_0 : ( ruleUnder ) ;
    public final void rule__Node__UnderAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2019:1: ( ( ruleUnder ) )
            // InternalCloneDetectionDSL.g:2020:2: ( ruleUnder )
            {
            // InternalCloneDetectionDSL.g:2020:2: ( ruleUnder )
            // InternalCloneDetectionDSL.g:2021:3: ruleUnder
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
    // InternalCloneDetectionDSL.g:2030:1: rule__Node__NodeAssignment_1_1 : ( ruleNode ) ;
    public final void rule__Node__NodeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2034:1: ( ( ruleNode ) )
            // InternalCloneDetectionDSL.g:2035:2: ( ruleNode )
            {
            // InternalCloneDetectionDSL.g:2035:2: ( ruleNode )
            // InternalCloneDetectionDSL.g:2036:3: ruleNode
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
    // InternalCloneDetectionDSL.g:2045:1: rule__Nodes__NodeAssignment_0 : ( ruleNode ) ;
    public final void rule__Nodes__NodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2049:1: ( ( ruleNode ) )
            // InternalCloneDetectionDSL.g:2050:2: ( ruleNode )
            {
            // InternalCloneDetectionDSL.g:2050:2: ( ruleNode )
            // InternalCloneDetectionDSL.g:2051:3: ruleNode
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
    // InternalCloneDetectionDSL.g:2060:1: rule__Nodes__NodesAssignment_1_1 : ( ruleNodes ) ;
    public final void rule__Nodes__NodesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2064:1: ( ( ruleNodes ) )
            // InternalCloneDetectionDSL.g:2065:2: ( ruleNodes )
            {
            // InternalCloneDetectionDSL.g:2065:2: ( ruleNodes )
            // InternalCloneDetectionDSL.g:2066:3: ruleNodes
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


    // $ANTLR start "rule__MinSize__ExprAssignment_0_0"
    // InternalCloneDetectionDSL.g:2075:1: rule__MinSize__ExprAssignment_0_0 : ( ruleMetricExpr ) ;
    public final void rule__MinSize__ExprAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2079:1: ( ( ruleMetricExpr ) )
            // InternalCloneDetectionDSL.g:2080:2: ( ruleMetricExpr )
            {
            // InternalCloneDetectionDSL.g:2080:2: ( ruleMetricExpr )
            // InternalCloneDetectionDSL.g:2081:3: ruleMetricExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getExprMetricExprParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMetricExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinSizeAccess().getExprMetricExprParserRuleCall_0_0_0()); 
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
    // $ANTLR end "rule__MinSize__ExprAssignment_0_0"


    // $ANTLR start "rule__MinSize__BracketsAssignment_0_1_1"
    // InternalCloneDetectionDSL.g:2090:1: rule__MinSize__BracketsAssignment_0_1_1 : ( ruleMinSize ) ;
    public final void rule__MinSize__BracketsAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2094:1: ( ( ruleMinSize ) )
            // InternalCloneDetectionDSL.g:2095:2: ( ruleMinSize )
            {
            // InternalCloneDetectionDSL.g:2095:2: ( ruleMinSize )
            // InternalCloneDetectionDSL.g:2096:3: ruleMinSize
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getBracketsMinSizeParserRuleCall_0_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMinSize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinSizeAccess().getBracketsMinSizeParserRuleCall_0_1_1_0()); 
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
    // $ANTLR end "rule__MinSize__BracketsAssignment_0_1_1"


    // $ANTLR start "rule__MinSize__OperatorAssignment_1_0"
    // InternalCloneDetectionDSL.g:2105:1: rule__MinSize__OperatorAssignment_1_0 : ( ruleBoolOperator ) ;
    public final void rule__MinSize__OperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2109:1: ( ( ruleBoolOperator ) )
            // InternalCloneDetectionDSL.g:2110:2: ( ruleBoolOperator )
            {
            // InternalCloneDetectionDSL.g:2110:2: ( ruleBoolOperator )
            // InternalCloneDetectionDSL.g:2111:3: ruleBoolOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getOperatorBoolOperatorEnumRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBoolOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinSizeAccess().getOperatorBoolOperatorEnumRuleCall_1_0_0()); 
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
    // $ANTLR end "rule__MinSize__OperatorAssignment_1_0"


    // $ANTLR start "rule__MinSize__SizeAssignment_1_1"
    // InternalCloneDetectionDSL.g:2120:1: rule__MinSize__SizeAssignment_1_1 : ( ruleMinSize ) ;
    public final void rule__MinSize__SizeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2124:1: ( ( ruleMinSize ) )
            // InternalCloneDetectionDSL.g:2125:2: ( ruleMinSize )
            {
            // InternalCloneDetectionDSL.g:2125:2: ( ruleMinSize )
            // InternalCloneDetectionDSL.g:2126:3: ruleMinSize
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getSizeMinSizeParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMinSize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinSizeAccess().getSizeMinSizeParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__MinSize__SizeAssignment_1_1"


    // $ANTLR start "rule__MetricExpr__AmountAssignment_0"
    // InternalCloneDetectionDSL.g:2135:1: rule__MetricExpr__AmountAssignment_0 : ( RULE_INT ) ;
    public final void rule__MetricExpr__AmountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2139:1: ( ( RULE_INT ) )
            // InternalCloneDetectionDSL.g:2140:2: ( RULE_INT )
            {
            // InternalCloneDetectionDSL.g:2140:2: ( RULE_INT )
            // InternalCloneDetectionDSL.g:2141:3: RULE_INT
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
    // InternalCloneDetectionDSL.g:2150:1: rule__MetricExpr__MetricAssignment_1 : ( ruleSizeMetric ) ;
    public final void rule__MetricExpr__MetricAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2154:1: ( ( ruleSizeMetric ) )
            // InternalCloneDetectionDSL.g:2155:2: ( ruleSizeMetric )
            {
            // InternalCloneDetectionDSL.g:2155:2: ( ruleSizeMetric )
            // InternalCloneDetectionDSL.g:2156:3: ruleSizeMetric
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
    // InternalCloneDetectionDSL.g:2165:1: rule__Compare__NodesAssignment_1 : ( ruleNodes ) ;
    public final void rule__Compare__NodesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2169:1: ( ( ruleNodes ) )
            // InternalCloneDetectionDSL.g:2170:2: ( ruleNodes )
            {
            // InternalCloneDetectionDSL.g:2170:2: ( ruleNodes )
            // InternalCloneDetectionDSL.g:2171:3: ruleNodes
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
    // InternalCloneDetectionDSL.g:2180:1: rule__Compare__ComparisonMethodAssignment_2 : ( ruleMethod ) ;
    public final void rule__Compare__ComparisonMethodAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2184:1: ( ( ruleMethod ) )
            // InternalCloneDetectionDSL.g:2185:2: ( ruleMethod )
            {
            // InternalCloneDetectionDSL.g:2185:2: ( ruleMethod )
            // InternalCloneDetectionDSL.g:2186:3: ruleMethod
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
    // InternalCloneDetectionDSL.g:2195:1: rule__Compare__DeepestNodeAssignment_3 : ( ruleNode ) ;
    public final void rule__Compare__DeepestNodeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2199:1: ( ( ruleNode ) )
            // InternalCloneDetectionDSL.g:2200:2: ( ruleNode )
            {
            // InternalCloneDetectionDSL.g:2200:2: ( ruleNode )
            // InternalCloneDetectionDSL.g:2201:3: ruleNode
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
    // InternalCloneDetectionDSL.g:2210:1: rule__Compare__PercAssignment_4 : ( rulePercentage ) ;
    public final void rule__Compare__PercAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2214:1: ( ( rulePercentage ) )
            // InternalCloneDetectionDSL.g:2215:2: ( rulePercentage )
            {
            // InternalCloneDetectionDSL.g:2215:2: ( rulePercentage )
            // InternalCloneDetectionDSL.g:2216:3: rulePercentage
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
        // InternalCloneDetectionDSL.g:1730:8: ( rule__CloneDetection__NotCompareAssignment_5 )
        // InternalCloneDetectionDSL.g:1730:9: rule__CloneDetection__NotCompareAssignment_5
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
        // InternalCloneDetectionDSL.g:1752:8: ( rule__CloneDetection__CompareAssignment_6 )
        // InternalCloneDetectionDSL.g:1752:9: rule__CloneDetection__CompareAssignment_6
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
            return "()* loopback of 1752:7: ( ( rule__CloneDetection__CompareAssignment_6 )=> rule__CloneDetection__CompareAssignment_6 )*";
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
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000001F8000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000850L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000065E0000002L});

}
