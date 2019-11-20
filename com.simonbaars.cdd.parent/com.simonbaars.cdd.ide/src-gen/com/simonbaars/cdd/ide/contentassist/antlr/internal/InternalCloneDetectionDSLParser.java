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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'Subtree'", "'LLOC'", "'SLOC'", "'tokens'", "'declarations'", "'statements'", "'nodes'", "'lines'", "'cyclomatic_complexity'", "'&'", "'|'", "'Subnodes'", "'StringMatch'", "'CompleteMatch'", "'FQI'", "'->'", "'=>'", "'Project'", "'FindInterProjectDuplicates'", "'LibraryPath'", "'SearchRoot'", "'Match'", "'Exclude'", "','", "'Size'", "'('", "')'", "'DoNotCompare'", "'Compare'", "'%'"
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
    public static final int T__40=40;
    public static final int T__41=41;
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


    // $ANTLR start "entryRuleLibraryPath"
    // InternalCloneDetectionDSL.g:103:1: entryRuleLibraryPath : ruleLibraryPath EOF ;
    public final void entryRuleLibraryPath() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:104:1: ( ruleLibraryPath EOF )
            // InternalCloneDetectionDSL.g:105:1: ruleLibraryPath EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLibraryPathRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLibraryPath();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLibraryPathRule()); 
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
    // $ANTLR end "entryRuleLibraryPath"


    // $ANTLR start "ruleLibraryPath"
    // InternalCloneDetectionDSL.g:112:1: ruleLibraryPath : ( ( rule__LibraryPath__Group__0 ) ) ;
    public final void ruleLibraryPath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:116:2: ( ( ( rule__LibraryPath__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:117:2: ( ( rule__LibraryPath__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:117:2: ( ( rule__LibraryPath__Group__0 ) )
            // InternalCloneDetectionDSL.g:118:3: ( rule__LibraryPath__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLibraryPathAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:119:3: ( rule__LibraryPath__Group__0 )
            // InternalCloneDetectionDSL.g:119:4: rule__LibraryPath__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LibraryPath__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLibraryPathAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLibraryPath"


    // $ANTLR start "entryRuleSearchRoot"
    // InternalCloneDetectionDSL.g:128:1: entryRuleSearchRoot : ruleSearchRoot EOF ;
    public final void entryRuleSearchRoot() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:129:1: ( ruleSearchRoot EOF )
            // InternalCloneDetectionDSL.g:130:1: ruleSearchRoot EOF
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
    // InternalCloneDetectionDSL.g:137:1: ruleSearchRoot : ( ( rule__SearchRoot__Group__0 ) ) ;
    public final void ruleSearchRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:141:2: ( ( ( rule__SearchRoot__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:142:2: ( ( rule__SearchRoot__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:142:2: ( ( rule__SearchRoot__Group__0 ) )
            // InternalCloneDetectionDSL.g:143:3: ( rule__SearchRoot__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSearchRootAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:144:3: ( rule__SearchRoot__Group__0 )
            // InternalCloneDetectionDSL.g:144:4: rule__SearchRoot__Group__0
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
    // InternalCloneDetectionDSL.g:153:1: entryRuleMatch : ruleMatch EOF ;
    public final void entryRuleMatch() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:154:1: ( ruleMatch EOF )
            // InternalCloneDetectionDSL.g:155:1: ruleMatch EOF
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
    // InternalCloneDetectionDSL.g:162:1: ruleMatch : ( ( rule__Match__Group__0 ) ) ;
    public final void ruleMatch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:166:2: ( ( ( rule__Match__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:167:2: ( ( rule__Match__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:167:2: ( ( rule__Match__Group__0 ) )
            // InternalCloneDetectionDSL.g:168:3: ( rule__Match__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:169:3: ( rule__Match__Group__0 )
            // InternalCloneDetectionDSL.g:169:4: rule__Match__Group__0
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
    // InternalCloneDetectionDSL.g:178:1: entryRuleExclude : ruleExclude EOF ;
    public final void entryRuleExclude() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:179:1: ( ruleExclude EOF )
            // InternalCloneDetectionDSL.g:180:1: ruleExclude EOF
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
    // InternalCloneDetectionDSL.g:187:1: ruleExclude : ( ( rule__Exclude__Group__0 ) ) ;
    public final void ruleExclude() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:191:2: ( ( ( rule__Exclude__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:192:2: ( ( rule__Exclude__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:192:2: ( ( rule__Exclude__Group__0 ) )
            // InternalCloneDetectionDSL.g:193:3: ( rule__Exclude__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExcludeAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:194:3: ( rule__Exclude__Group__0 )
            // InternalCloneDetectionDSL.g:194:4: rule__Exclude__Group__0
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
    // InternalCloneDetectionDSL.g:203:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:204:1: ( ruleNode EOF )
            // InternalCloneDetectionDSL.g:205:1: ruleNode EOF
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
    // InternalCloneDetectionDSL.g:212:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:216:2: ( ( ( rule__Node__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:217:2: ( ( rule__Node__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:217:2: ( ( rule__Node__Group__0 ) )
            // InternalCloneDetectionDSL.g:218:3: ( rule__Node__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:219:3: ( rule__Node__Group__0 )
            // InternalCloneDetectionDSL.g:219:4: rule__Node__Group__0
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
    // InternalCloneDetectionDSL.g:228:1: entryRuleNodes : ruleNodes EOF ;
    public final void entryRuleNodes() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:229:1: ( ruleNodes EOF )
            // InternalCloneDetectionDSL.g:230:1: ruleNodes EOF
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
    // InternalCloneDetectionDSL.g:237:1: ruleNodes : ( ( rule__Nodes__Group__0 ) ) ;
    public final void ruleNodes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:241:2: ( ( ( rule__Nodes__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:242:2: ( ( rule__Nodes__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:242:2: ( ( rule__Nodes__Group__0 ) )
            // InternalCloneDetectionDSL.g:243:3: ( rule__Nodes__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodesAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:244:3: ( rule__Nodes__Group__0 )
            // InternalCloneDetectionDSL.g:244:4: rule__Nodes__Group__0
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
    // InternalCloneDetectionDSL.g:253:1: entryRuleSize : ruleSize EOF ;
    public final void entryRuleSize() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:254:1: ( ruleSize EOF )
            // InternalCloneDetectionDSL.g:255:1: ruleSize EOF
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
    // InternalCloneDetectionDSL.g:262:1: ruleSize : ( ( rule__Size__Group__0 ) ) ;
    public final void ruleSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:266:2: ( ( ( rule__Size__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:267:2: ( ( rule__Size__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:267:2: ( ( rule__Size__Group__0 ) )
            // InternalCloneDetectionDSL.g:268:3: ( rule__Size__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:269:3: ( rule__Size__Group__0 )
            // InternalCloneDetectionDSL.g:269:4: rule__Size__Group__0
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
    // InternalCloneDetectionDSL.g:278:1: entryRuleMinSize : ruleMinSize EOF ;
    public final void entryRuleMinSize() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:279:1: ( ruleMinSize EOF )
            // InternalCloneDetectionDSL.g:280:1: ruleMinSize EOF
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
    // InternalCloneDetectionDSL.g:287:1: ruleMinSize : ( ( rule__MinSize__Group__0 ) ) ;
    public final void ruleMinSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:291:2: ( ( ( rule__MinSize__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:292:2: ( ( rule__MinSize__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:292:2: ( ( rule__MinSize__Group__0 ) )
            // InternalCloneDetectionDSL.g:293:3: ( rule__MinSize__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:294:3: ( rule__MinSize__Group__0 )
            // InternalCloneDetectionDSL.g:294:4: rule__MinSize__Group__0
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
    // InternalCloneDetectionDSL.g:303:1: entryRuleMetricExpr : ruleMetricExpr EOF ;
    public final void entryRuleMetricExpr() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:304:1: ( ruleMetricExpr EOF )
            // InternalCloneDetectionDSL.g:305:1: ruleMetricExpr EOF
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
    // InternalCloneDetectionDSL.g:312:1: ruleMetricExpr : ( ( rule__MetricExpr__Group__0 ) ) ;
    public final void ruleMetricExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:316:2: ( ( ( rule__MetricExpr__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:317:2: ( ( rule__MetricExpr__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:317:2: ( ( rule__MetricExpr__Group__0 ) )
            // InternalCloneDetectionDSL.g:318:3: ( rule__MetricExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricExprAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:319:3: ( rule__MetricExpr__Group__0 )
            // InternalCloneDetectionDSL.g:319:4: rule__MetricExpr__Group__0
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
    // InternalCloneDetectionDSL.g:328:1: entryRuleDoNotCompare : ruleDoNotCompare EOF ;
    public final void entryRuleDoNotCompare() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:329:1: ( ruleDoNotCompare EOF )
            // InternalCloneDetectionDSL.g:330:1: ruleDoNotCompare EOF
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
    // InternalCloneDetectionDSL.g:337:1: ruleDoNotCompare : ( ( rule__DoNotCompare__Group__0 ) ) ;
    public final void ruleDoNotCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:341:2: ( ( ( rule__DoNotCompare__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:342:2: ( ( rule__DoNotCompare__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:342:2: ( ( rule__DoNotCompare__Group__0 ) )
            // InternalCloneDetectionDSL.g:343:3: ( rule__DoNotCompare__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoNotCompareAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:344:3: ( rule__DoNotCompare__Group__0 )
            // InternalCloneDetectionDSL.g:344:4: rule__DoNotCompare__Group__0
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
    // InternalCloneDetectionDSL.g:353:1: entryRuleCompare : ruleCompare EOF ;
    public final void entryRuleCompare() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:354:1: ( ruleCompare EOF )
            // InternalCloneDetectionDSL.g:355:1: ruleCompare EOF
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
    // InternalCloneDetectionDSL.g:362:1: ruleCompare : ( ( rule__Compare__Group__0 ) ) ;
    public final void ruleCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:366:2: ( ( ( rule__Compare__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:367:2: ( ( rule__Compare__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:367:2: ( ( rule__Compare__Group__0 ) )
            // InternalCloneDetectionDSL.g:368:3: ( rule__Compare__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:369:3: ( rule__Compare__Group__0 )
            // InternalCloneDetectionDSL.g:369:4: rule__Compare__Group__0
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
    // InternalCloneDetectionDSL.g:378:1: entryRulePercentage : rulePercentage EOF ;
    public final void entryRulePercentage() throws RecognitionException {
        try {
            // InternalCloneDetectionDSL.g:379:1: ( rulePercentage EOF )
            // InternalCloneDetectionDSL.g:380:1: rulePercentage EOF
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
    // InternalCloneDetectionDSL.g:387:1: rulePercentage : ( ( rule__Percentage__Group__0 ) ) ;
    public final void rulePercentage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:391:2: ( ( ( rule__Percentage__Group__0 ) ) )
            // InternalCloneDetectionDSL.g:392:2: ( ( rule__Percentage__Group__0 ) )
            {
            // InternalCloneDetectionDSL.g:392:2: ( ( rule__Percentage__Group__0 ) )
            // InternalCloneDetectionDSL.g:393:3: ( rule__Percentage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPercentageAccess().getGroup()); 
            }
            // InternalCloneDetectionDSL.g:394:3: ( rule__Percentage__Group__0 )
            // InternalCloneDetectionDSL.g:394:4: rule__Percentage__Group__0
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
    // InternalCloneDetectionDSL.g:403:1: ruleMatchTarget : ( ( rule__MatchTarget__Alternatives ) ) ;
    public final void ruleMatchTarget() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:407:1: ( ( ( rule__MatchTarget__Alternatives ) ) )
            // InternalCloneDetectionDSL.g:408:2: ( ( rule__MatchTarget__Alternatives ) )
            {
            // InternalCloneDetectionDSL.g:408:2: ( ( rule__MatchTarget__Alternatives ) )
            // InternalCloneDetectionDSL.g:409:3: ( rule__MatchTarget__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchTargetAccess().getAlternatives()); 
            }
            // InternalCloneDetectionDSL.g:410:3: ( rule__MatchTarget__Alternatives )
            // InternalCloneDetectionDSL.g:410:4: rule__MatchTarget__Alternatives
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
    // InternalCloneDetectionDSL.g:419:1: ruleSizeMetric : ( ( rule__SizeMetric__Alternatives ) ) ;
    public final void ruleSizeMetric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:423:1: ( ( ( rule__SizeMetric__Alternatives ) ) )
            // InternalCloneDetectionDSL.g:424:2: ( ( rule__SizeMetric__Alternatives ) )
            {
            // InternalCloneDetectionDSL.g:424:2: ( ( rule__SizeMetric__Alternatives ) )
            // InternalCloneDetectionDSL.g:425:3: ( rule__SizeMetric__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeMetricAccess().getAlternatives()); 
            }
            // InternalCloneDetectionDSL.g:426:3: ( rule__SizeMetric__Alternatives )
            // InternalCloneDetectionDSL.g:426:4: rule__SizeMetric__Alternatives
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
    // InternalCloneDetectionDSL.g:435:1: ruleBoolOperator : ( ( rule__BoolOperator__Alternatives ) ) ;
    public final void ruleBoolOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:439:1: ( ( ( rule__BoolOperator__Alternatives ) ) )
            // InternalCloneDetectionDSL.g:440:2: ( ( rule__BoolOperator__Alternatives ) )
            {
            // InternalCloneDetectionDSL.g:440:2: ( ( rule__BoolOperator__Alternatives ) )
            // InternalCloneDetectionDSL.g:441:3: ( rule__BoolOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolOperatorAccess().getAlternatives()); 
            }
            // InternalCloneDetectionDSL.g:442:3: ( rule__BoolOperator__Alternatives )
            // InternalCloneDetectionDSL.g:442:4: rule__BoolOperator__Alternatives
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
    // InternalCloneDetectionDSL.g:451:1: ruleMethod : ( ( rule__Method__Alternatives ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:455:1: ( ( ( rule__Method__Alternatives ) ) )
            // InternalCloneDetectionDSL.g:456:2: ( ( rule__Method__Alternatives ) )
            {
            // InternalCloneDetectionDSL.g:456:2: ( ( rule__Method__Alternatives ) )
            // InternalCloneDetectionDSL.g:457:3: ( rule__Method__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getAlternatives()); 
            }
            // InternalCloneDetectionDSL.g:458:3: ( rule__Method__Alternatives )
            // InternalCloneDetectionDSL.g:458:4: rule__Method__Alternatives
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
    // InternalCloneDetectionDSL.g:467:1: ruleUnder : ( ( rule__Under__Alternatives ) ) ;
    public final void ruleUnder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:471:1: ( ( ( rule__Under__Alternatives ) ) )
            // InternalCloneDetectionDSL.g:472:2: ( ( rule__Under__Alternatives ) )
            {
            // InternalCloneDetectionDSL.g:472:2: ( ( rule__Under__Alternatives ) )
            // InternalCloneDetectionDSL.g:473:3: ( rule__Under__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnderAccess().getAlternatives()); 
            }
            // InternalCloneDetectionDSL.g:474:3: ( rule__Under__Alternatives )
            // InternalCloneDetectionDSL.g:474:4: rule__Under__Alternatives
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
    // InternalCloneDetectionDSL.g:482:1: rule__Node__Alternatives_0 : ( ( ( rule__Node__NameAssignment_0_0 ) ) | ( '*' ) );
    public final void rule__Node__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:486:1: ( ( ( rule__Node__NameAssignment_0_0 ) ) | ( '*' ) )
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
                    // InternalCloneDetectionDSL.g:487:2: ( ( rule__Node__NameAssignment_0_0 ) )
                    {
                    // InternalCloneDetectionDSL.g:487:2: ( ( rule__Node__NameAssignment_0_0 ) )
                    // InternalCloneDetectionDSL.g:488:3: ( rule__Node__NameAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getNameAssignment_0_0()); 
                    }
                    // InternalCloneDetectionDSL.g:489:3: ( rule__Node__NameAssignment_0_0 )
                    // InternalCloneDetectionDSL.g:489:4: rule__Node__NameAssignment_0_0
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
                    // InternalCloneDetectionDSL.g:493:2: ( '*' )
                    {
                    // InternalCloneDetectionDSL.g:493:2: ( '*' )
                    // InternalCloneDetectionDSL.g:494:3: '*'
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
    // InternalCloneDetectionDSL.g:503:1: rule__MinSize__Alternatives_0 : ( ( ( rule__MinSize__ExprAssignment_0_0 ) ) | ( ( rule__MinSize__Group_0_1__0 ) ) );
    public final void rule__MinSize__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:507:1: ( ( ( rule__MinSize__ExprAssignment_0_0 ) ) | ( ( rule__MinSize__Group_0_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                alt2=1;
            }
            else if ( (LA2_0==37) ) {
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
                    // InternalCloneDetectionDSL.g:508:2: ( ( rule__MinSize__ExprAssignment_0_0 ) )
                    {
                    // InternalCloneDetectionDSL.g:508:2: ( ( rule__MinSize__ExprAssignment_0_0 ) )
                    // InternalCloneDetectionDSL.g:509:3: ( rule__MinSize__ExprAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMinSizeAccess().getExprAssignment_0_0()); 
                    }
                    // InternalCloneDetectionDSL.g:510:3: ( rule__MinSize__ExprAssignment_0_0 )
                    // InternalCloneDetectionDSL.g:510:4: rule__MinSize__ExprAssignment_0_0
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
                    // InternalCloneDetectionDSL.g:514:2: ( ( rule__MinSize__Group_0_1__0 ) )
                    {
                    // InternalCloneDetectionDSL.g:514:2: ( ( rule__MinSize__Group_0_1__0 ) )
                    // InternalCloneDetectionDSL.g:515:3: ( rule__MinSize__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMinSizeAccess().getGroup_0_1()); 
                    }
                    // InternalCloneDetectionDSL.g:516:3: ( rule__MinSize__Group_0_1__0 )
                    // InternalCloneDetectionDSL.g:516:4: rule__MinSize__Group_0_1__0
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
    // InternalCloneDetectionDSL.g:524:1: rule__MatchTarget__Alternatives : ( ( ( 'Subtree' ) ) | ( ( 'LLOC' ) ) | ( ( 'SLOC' ) ) );
    public final void rule__MatchTarget__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:528:1: ( ( ( 'Subtree' ) ) | ( ( 'LLOC' ) ) | ( ( 'SLOC' ) ) )
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
                    // InternalCloneDetectionDSL.g:529:2: ( ( 'Subtree' ) )
                    {
                    // InternalCloneDetectionDSL.g:529:2: ( ( 'Subtree' ) )
                    // InternalCloneDetectionDSL.g:530:3: ( 'Subtree' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMatchTargetAccess().getSubtreeEnumLiteralDeclaration_0()); 
                    }
                    // InternalCloneDetectionDSL.g:531:3: ( 'Subtree' )
                    // InternalCloneDetectionDSL.g:531:4: 'Subtree'
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
                    // InternalCloneDetectionDSL.g:535:2: ( ( 'LLOC' ) )
                    {
                    // InternalCloneDetectionDSL.g:535:2: ( ( 'LLOC' ) )
                    // InternalCloneDetectionDSL.g:536:3: ( 'LLOC' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMatchTargetAccess().getLLOCEnumLiteralDeclaration_1()); 
                    }
                    // InternalCloneDetectionDSL.g:537:3: ( 'LLOC' )
                    // InternalCloneDetectionDSL.g:537:4: 'LLOC'
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
                    // InternalCloneDetectionDSL.g:541:2: ( ( 'SLOC' ) )
                    {
                    // InternalCloneDetectionDSL.g:541:2: ( ( 'SLOC' ) )
                    // InternalCloneDetectionDSL.g:542:3: ( 'SLOC' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMatchTargetAccess().getSLOCEnumLiteralDeclaration_2()); 
                    }
                    // InternalCloneDetectionDSL.g:543:3: ( 'SLOC' )
                    // InternalCloneDetectionDSL.g:543:4: 'SLOC'
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
    // InternalCloneDetectionDSL.g:551:1: rule__SizeMetric__Alternatives : ( ( ( 'tokens' ) ) | ( ( 'declarations' ) ) | ( ( 'statements' ) ) | ( ( 'nodes' ) ) | ( ( 'lines' ) ) | ( ( 'cyclomatic_complexity' ) ) );
    public final void rule__SizeMetric__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:555:1: ( ( ( 'tokens' ) ) | ( ( 'declarations' ) ) | ( ( 'statements' ) ) | ( ( 'nodes' ) ) | ( ( 'lines' ) ) | ( ( 'cyclomatic_complexity' ) ) )
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
                    // InternalCloneDetectionDSL.g:556:2: ( ( 'tokens' ) )
                    {
                    // InternalCloneDetectionDSL.g:556:2: ( ( 'tokens' ) )
                    // InternalCloneDetectionDSL.g:557:3: ( 'tokens' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSizeMetricAccess().getTokensEnumLiteralDeclaration_0()); 
                    }
                    // InternalCloneDetectionDSL.g:558:3: ( 'tokens' )
                    // InternalCloneDetectionDSL.g:558:4: 'tokens'
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
                    // InternalCloneDetectionDSL.g:562:2: ( ( 'declarations' ) )
                    {
                    // InternalCloneDetectionDSL.g:562:2: ( ( 'declarations' ) )
                    // InternalCloneDetectionDSL.g:563:3: ( 'declarations' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSizeMetricAccess().getDeclarationsEnumLiteralDeclaration_1()); 
                    }
                    // InternalCloneDetectionDSL.g:564:3: ( 'declarations' )
                    // InternalCloneDetectionDSL.g:564:4: 'declarations'
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
                    // InternalCloneDetectionDSL.g:568:2: ( ( 'statements' ) )
                    {
                    // InternalCloneDetectionDSL.g:568:2: ( ( 'statements' ) )
                    // InternalCloneDetectionDSL.g:569:3: ( 'statements' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSizeMetricAccess().getStatementsEnumLiteralDeclaration_2()); 
                    }
                    // InternalCloneDetectionDSL.g:570:3: ( 'statements' )
                    // InternalCloneDetectionDSL.g:570:4: 'statements'
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
                    // InternalCloneDetectionDSL.g:574:2: ( ( 'nodes' ) )
                    {
                    // InternalCloneDetectionDSL.g:574:2: ( ( 'nodes' ) )
                    // InternalCloneDetectionDSL.g:575:3: ( 'nodes' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSizeMetricAccess().getNodesEnumLiteralDeclaration_3()); 
                    }
                    // InternalCloneDetectionDSL.g:576:3: ( 'nodes' )
                    // InternalCloneDetectionDSL.g:576:4: 'nodes'
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
                    // InternalCloneDetectionDSL.g:580:2: ( ( 'lines' ) )
                    {
                    // InternalCloneDetectionDSL.g:580:2: ( ( 'lines' ) )
                    // InternalCloneDetectionDSL.g:581:3: ( 'lines' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSizeMetricAccess().getLinesEnumLiteralDeclaration_4()); 
                    }
                    // InternalCloneDetectionDSL.g:582:3: ( 'lines' )
                    // InternalCloneDetectionDSL.g:582:4: 'lines'
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
                    // InternalCloneDetectionDSL.g:586:2: ( ( 'cyclomatic_complexity' ) )
                    {
                    // InternalCloneDetectionDSL.g:586:2: ( ( 'cyclomatic_complexity' ) )
                    // InternalCloneDetectionDSL.g:587:3: ( 'cyclomatic_complexity' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSizeMetricAccess().getCyclomatic_complexityEnumLiteralDeclaration_5()); 
                    }
                    // InternalCloneDetectionDSL.g:588:3: ( 'cyclomatic_complexity' )
                    // InternalCloneDetectionDSL.g:588:4: 'cyclomatic_complexity'
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
    // InternalCloneDetectionDSL.g:596:1: rule__BoolOperator__Alternatives : ( ( ( '&' ) ) | ( ( '|' ) ) );
    public final void rule__BoolOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:600:1: ( ( ( '&' ) ) | ( ( '|' ) ) )
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
                    // InternalCloneDetectionDSL.g:601:2: ( ( '&' ) )
                    {
                    // InternalCloneDetectionDSL.g:601:2: ( ( '&' ) )
                    // InternalCloneDetectionDSL.g:602:3: ( '&' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoolOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }
                    // InternalCloneDetectionDSL.g:603:3: ( '&' )
                    // InternalCloneDetectionDSL.g:603:4: '&'
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
                    // InternalCloneDetectionDSL.g:607:2: ( ( '|' ) )
                    {
                    // InternalCloneDetectionDSL.g:607:2: ( ( '|' ) )
                    // InternalCloneDetectionDSL.g:608:3: ( '|' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoolOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    }
                    // InternalCloneDetectionDSL.g:609:3: ( '|' )
                    // InternalCloneDetectionDSL.g:609:4: '|'
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
    // InternalCloneDetectionDSL.g:617:1: rule__Method__Alternatives : ( ( ( 'Subnodes' ) ) | ( ( 'StringMatch' ) ) | ( ( 'CompleteMatch' ) ) | ( ( 'FQI' ) ) );
    public final void rule__Method__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:621:1: ( ( ( 'Subnodes' ) ) | ( ( 'StringMatch' ) ) | ( ( 'CompleteMatch' ) ) | ( ( 'FQI' ) ) )
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
                    // InternalCloneDetectionDSL.g:622:2: ( ( 'Subnodes' ) )
                    {
                    // InternalCloneDetectionDSL.g:622:2: ( ( 'Subnodes' ) )
                    // InternalCloneDetectionDSL.g:623:3: ( 'Subnodes' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodAccess().getSubnodesEnumLiteralDeclaration_0()); 
                    }
                    // InternalCloneDetectionDSL.g:624:3: ( 'Subnodes' )
                    // InternalCloneDetectionDSL.g:624:4: 'Subnodes'
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
                    // InternalCloneDetectionDSL.g:628:2: ( ( 'StringMatch' ) )
                    {
                    // InternalCloneDetectionDSL.g:628:2: ( ( 'StringMatch' ) )
                    // InternalCloneDetectionDSL.g:629:3: ( 'StringMatch' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodAccess().getStringMatchEnumLiteralDeclaration_1()); 
                    }
                    // InternalCloneDetectionDSL.g:630:3: ( 'StringMatch' )
                    // InternalCloneDetectionDSL.g:630:4: 'StringMatch'
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
                    // InternalCloneDetectionDSL.g:634:2: ( ( 'CompleteMatch' ) )
                    {
                    // InternalCloneDetectionDSL.g:634:2: ( ( 'CompleteMatch' ) )
                    // InternalCloneDetectionDSL.g:635:3: ( 'CompleteMatch' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodAccess().getCompleteMatchEnumLiteralDeclaration_2()); 
                    }
                    // InternalCloneDetectionDSL.g:636:3: ( 'CompleteMatch' )
                    // InternalCloneDetectionDSL.g:636:4: 'CompleteMatch'
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
                    // InternalCloneDetectionDSL.g:640:2: ( ( 'FQI' ) )
                    {
                    // InternalCloneDetectionDSL.g:640:2: ( ( 'FQI' ) )
                    // InternalCloneDetectionDSL.g:641:3: ( 'FQI' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodAccess().getFQIEnumLiteralDeclaration_3()); 
                    }
                    // InternalCloneDetectionDSL.g:642:3: ( 'FQI' )
                    // InternalCloneDetectionDSL.g:642:4: 'FQI'
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
    // InternalCloneDetectionDSL.g:650:1: rule__Under__Alternatives : ( ( ( '->' ) ) | ( ( '=>' ) ) );
    public final void rule__Under__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:654:1: ( ( ( '->' ) ) | ( ( '=>' ) ) )
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
                    // InternalCloneDetectionDSL.g:655:2: ( ( '->' ) )
                    {
                    // InternalCloneDetectionDSL.g:655:2: ( ( '->' ) )
                    // InternalCloneDetectionDSL.g:656:3: ( '->' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnderAccess().getOneLevelEnumLiteralDeclaration_0()); 
                    }
                    // InternalCloneDetectionDSL.g:657:3: ( '->' )
                    // InternalCloneDetectionDSL.g:657:4: '->'
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
                    // InternalCloneDetectionDSL.g:661:2: ( ( '=>' ) )
                    {
                    // InternalCloneDetectionDSL.g:661:2: ( ( '=>' ) )
                    // InternalCloneDetectionDSL.g:662:3: ( '=>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnderAccess().getAnyLevelEnumLiteralDeclaration_1()); 
                    }
                    // InternalCloneDetectionDSL.g:663:3: ( '=>' )
                    // InternalCloneDetectionDSL.g:663:4: '=>'
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
    // InternalCloneDetectionDSL.g:671:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:675:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // InternalCloneDetectionDSL.g:676:2: rule__Project__Group__0__Impl rule__Project__Group__1
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
    // InternalCloneDetectionDSL.g:683:1: rule__Project__Group__0__Impl : ( 'Project' ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:687:1: ( ( 'Project' ) )
            // InternalCloneDetectionDSL.g:688:1: ( 'Project' )
            {
            // InternalCloneDetectionDSL.g:688:1: ( 'Project' )
            // InternalCloneDetectionDSL.g:689:2: 'Project'
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
    // InternalCloneDetectionDSL.g:698:1: rule__Project__Group__1 : rule__Project__Group__1__Impl rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:702:1: ( rule__Project__Group__1__Impl rule__Project__Group__2 )
            // InternalCloneDetectionDSL.g:703:2: rule__Project__Group__1__Impl rule__Project__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Project__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Project__Group__2();

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
    // InternalCloneDetectionDSL.g:710:1: rule__Project__Group__1__Impl : ( ( rule__Project__PathAssignment_1 ) ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:714:1: ( ( ( rule__Project__PathAssignment_1 ) ) )
            // InternalCloneDetectionDSL.g:715:1: ( ( rule__Project__PathAssignment_1 ) )
            {
            // InternalCloneDetectionDSL.g:715:1: ( ( rule__Project__PathAssignment_1 ) )
            // InternalCloneDetectionDSL.g:716:2: ( rule__Project__PathAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectAccess().getPathAssignment_1()); 
            }
            // InternalCloneDetectionDSL.g:717:2: ( rule__Project__PathAssignment_1 )
            // InternalCloneDetectionDSL.g:717:3: rule__Project__PathAssignment_1
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


    // $ANTLR start "rule__Project__Group__2"
    // InternalCloneDetectionDSL.g:725:1: rule__Project__Group__2 : rule__Project__Group__2__Impl ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:729:1: ( rule__Project__Group__2__Impl )
            // InternalCloneDetectionDSL.g:730:2: rule__Project__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__2__Impl();

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
    // $ANTLR end "rule__Project__Group__2"


    // $ANTLR start "rule__Project__Group__2__Impl"
    // InternalCloneDetectionDSL.g:736:1: rule__Project__Group__2__Impl : ( ( 'FindInterProjectDuplicates' )? ) ;
    public final void rule__Project__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:740:1: ( ( ( 'FindInterProjectDuplicates' )? ) )
            // InternalCloneDetectionDSL.g:741:1: ( ( 'FindInterProjectDuplicates' )? )
            {
            // InternalCloneDetectionDSL.g:741:1: ( ( 'FindInterProjectDuplicates' )? )
            // InternalCloneDetectionDSL.g:742:2: ( 'FindInterProjectDuplicates' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectAccess().getFindInterProjectDuplicatesKeyword_2()); 
            }
            // InternalCloneDetectionDSL.g:743:2: ( 'FindInterProjectDuplicates' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCloneDetectionDSL.g:743:3: 'FindInterProjectDuplicates'
                    {
                    match(input,30,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProjectAccess().getFindInterProjectDuplicatesKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__2__Impl"


    // $ANTLR start "rule__LibraryPath__Group__0"
    // InternalCloneDetectionDSL.g:752:1: rule__LibraryPath__Group__0 : rule__LibraryPath__Group__0__Impl rule__LibraryPath__Group__1 ;
    public final void rule__LibraryPath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:756:1: ( rule__LibraryPath__Group__0__Impl rule__LibraryPath__Group__1 )
            // InternalCloneDetectionDSL.g:757:2: rule__LibraryPath__Group__0__Impl rule__LibraryPath__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__LibraryPath__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LibraryPath__Group__1();

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
    // $ANTLR end "rule__LibraryPath__Group__0"


    // $ANTLR start "rule__LibraryPath__Group__0__Impl"
    // InternalCloneDetectionDSL.g:764:1: rule__LibraryPath__Group__0__Impl : ( 'LibraryPath' ) ;
    public final void rule__LibraryPath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:768:1: ( ( 'LibraryPath' ) )
            // InternalCloneDetectionDSL.g:769:1: ( 'LibraryPath' )
            {
            // InternalCloneDetectionDSL.g:769:1: ( 'LibraryPath' )
            // InternalCloneDetectionDSL.g:770:2: 'LibraryPath'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLibraryPathAccess().getLibraryPathKeyword_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLibraryPathAccess().getLibraryPathKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryPath__Group__0__Impl"


    // $ANTLR start "rule__LibraryPath__Group__1"
    // InternalCloneDetectionDSL.g:779:1: rule__LibraryPath__Group__1 : rule__LibraryPath__Group__1__Impl ;
    public final void rule__LibraryPath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:783:1: ( rule__LibraryPath__Group__1__Impl )
            // InternalCloneDetectionDSL.g:784:2: rule__LibraryPath__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LibraryPath__Group__1__Impl();

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
    // $ANTLR end "rule__LibraryPath__Group__1"


    // $ANTLR start "rule__LibraryPath__Group__1__Impl"
    // InternalCloneDetectionDSL.g:790:1: rule__LibraryPath__Group__1__Impl : ( ( rule__LibraryPath__PathAssignment_1 ) ) ;
    public final void rule__LibraryPath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:794:1: ( ( ( rule__LibraryPath__PathAssignment_1 ) ) )
            // InternalCloneDetectionDSL.g:795:1: ( ( rule__LibraryPath__PathAssignment_1 ) )
            {
            // InternalCloneDetectionDSL.g:795:1: ( ( rule__LibraryPath__PathAssignment_1 ) )
            // InternalCloneDetectionDSL.g:796:2: ( rule__LibraryPath__PathAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLibraryPathAccess().getPathAssignment_1()); 
            }
            // InternalCloneDetectionDSL.g:797:2: ( rule__LibraryPath__PathAssignment_1 )
            // InternalCloneDetectionDSL.g:797:3: rule__LibraryPath__PathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LibraryPath__PathAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLibraryPathAccess().getPathAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryPath__Group__1__Impl"


    // $ANTLR start "rule__SearchRoot__Group__0"
    // InternalCloneDetectionDSL.g:806:1: rule__SearchRoot__Group__0 : rule__SearchRoot__Group__0__Impl rule__SearchRoot__Group__1 ;
    public final void rule__SearchRoot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:810:1: ( rule__SearchRoot__Group__0__Impl rule__SearchRoot__Group__1 )
            // InternalCloneDetectionDSL.g:811:2: rule__SearchRoot__Group__0__Impl rule__SearchRoot__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalCloneDetectionDSL.g:818:1: rule__SearchRoot__Group__0__Impl : ( 'SearchRoot' ) ;
    public final void rule__SearchRoot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:822:1: ( ( 'SearchRoot' ) )
            // InternalCloneDetectionDSL.g:823:1: ( 'SearchRoot' )
            {
            // InternalCloneDetectionDSL.g:823:1: ( 'SearchRoot' )
            // InternalCloneDetectionDSL.g:824:2: 'SearchRoot'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSearchRootAccess().getSearchRootKeyword_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalCloneDetectionDSL.g:833:1: rule__SearchRoot__Group__1 : rule__SearchRoot__Group__1__Impl ;
    public final void rule__SearchRoot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:837:1: ( rule__SearchRoot__Group__1__Impl )
            // InternalCloneDetectionDSL.g:838:2: rule__SearchRoot__Group__1__Impl
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
    // InternalCloneDetectionDSL.g:844:1: rule__SearchRoot__Group__1__Impl : ( ( rule__SearchRoot__NodesAssignment_1 ) ) ;
    public final void rule__SearchRoot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:848:1: ( ( ( rule__SearchRoot__NodesAssignment_1 ) ) )
            // InternalCloneDetectionDSL.g:849:1: ( ( rule__SearchRoot__NodesAssignment_1 ) )
            {
            // InternalCloneDetectionDSL.g:849:1: ( ( rule__SearchRoot__NodesAssignment_1 ) )
            // InternalCloneDetectionDSL.g:850:2: ( rule__SearchRoot__NodesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSearchRootAccess().getNodesAssignment_1()); 
            }
            // InternalCloneDetectionDSL.g:851:2: ( rule__SearchRoot__NodesAssignment_1 )
            // InternalCloneDetectionDSL.g:851:3: rule__SearchRoot__NodesAssignment_1
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
    // InternalCloneDetectionDSL.g:860:1: rule__Match__Group__0 : rule__Match__Group__0__Impl rule__Match__Group__1 ;
    public final void rule__Match__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:864:1: ( rule__Match__Group__0__Impl rule__Match__Group__1 )
            // InternalCloneDetectionDSL.g:865:2: rule__Match__Group__0__Impl rule__Match__Group__1
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
    // InternalCloneDetectionDSL.g:872:1: rule__Match__Group__0__Impl : ( 'Match' ) ;
    public final void rule__Match__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:876:1: ( ( 'Match' ) )
            // InternalCloneDetectionDSL.g:877:1: ( 'Match' )
            {
            // InternalCloneDetectionDSL.g:877:1: ( 'Match' )
            // InternalCloneDetectionDSL.g:878:2: 'Match'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchAccess().getMatchKeyword_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalCloneDetectionDSL.g:887:1: rule__Match__Group__1 : rule__Match__Group__1__Impl ;
    public final void rule__Match__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:891:1: ( rule__Match__Group__1__Impl )
            // InternalCloneDetectionDSL.g:892:2: rule__Match__Group__1__Impl
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
    // InternalCloneDetectionDSL.g:898:1: rule__Match__Group__1__Impl : ( ( rule__Match__TargetAssignment_1 ) ) ;
    public final void rule__Match__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:902:1: ( ( ( rule__Match__TargetAssignment_1 ) ) )
            // InternalCloneDetectionDSL.g:903:1: ( ( rule__Match__TargetAssignment_1 ) )
            {
            // InternalCloneDetectionDSL.g:903:1: ( ( rule__Match__TargetAssignment_1 ) )
            // InternalCloneDetectionDSL.g:904:2: ( rule__Match__TargetAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchAccess().getTargetAssignment_1()); 
            }
            // InternalCloneDetectionDSL.g:905:2: ( rule__Match__TargetAssignment_1 )
            // InternalCloneDetectionDSL.g:905:3: rule__Match__TargetAssignment_1
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
    // InternalCloneDetectionDSL.g:914:1: rule__Exclude__Group__0 : rule__Exclude__Group__0__Impl rule__Exclude__Group__1 ;
    public final void rule__Exclude__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:918:1: ( rule__Exclude__Group__0__Impl rule__Exclude__Group__1 )
            // InternalCloneDetectionDSL.g:919:2: rule__Exclude__Group__0__Impl rule__Exclude__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalCloneDetectionDSL.g:926:1: rule__Exclude__Group__0__Impl : ( 'Exclude' ) ;
    public final void rule__Exclude__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:930:1: ( ( 'Exclude' ) )
            // InternalCloneDetectionDSL.g:931:1: ( 'Exclude' )
            {
            // InternalCloneDetectionDSL.g:931:1: ( 'Exclude' )
            // InternalCloneDetectionDSL.g:932:2: 'Exclude'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExcludeAccess().getExcludeKeyword_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalCloneDetectionDSL.g:941:1: rule__Exclude__Group__1 : rule__Exclude__Group__1__Impl ;
    public final void rule__Exclude__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:945:1: ( rule__Exclude__Group__1__Impl )
            // InternalCloneDetectionDSL.g:946:2: rule__Exclude__Group__1__Impl
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
    // InternalCloneDetectionDSL.g:952:1: rule__Exclude__Group__1__Impl : ( ruleNodes ) ;
    public final void rule__Exclude__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:956:1: ( ( ruleNodes ) )
            // InternalCloneDetectionDSL.g:957:1: ( ruleNodes )
            {
            // InternalCloneDetectionDSL.g:957:1: ( ruleNodes )
            // InternalCloneDetectionDSL.g:958:2: ruleNodes
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
    // InternalCloneDetectionDSL.g:968:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:972:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalCloneDetectionDSL.g:973:2: rule__Node__Group__0__Impl rule__Node__Group__1
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
    // InternalCloneDetectionDSL.g:980:1: rule__Node__Group__0__Impl : ( ( rule__Node__Alternatives_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:984:1: ( ( ( rule__Node__Alternatives_0 ) ) )
            // InternalCloneDetectionDSL.g:985:1: ( ( rule__Node__Alternatives_0 ) )
            {
            // InternalCloneDetectionDSL.g:985:1: ( ( rule__Node__Alternatives_0 ) )
            // InternalCloneDetectionDSL.g:986:2: ( rule__Node__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getAlternatives_0()); 
            }
            // InternalCloneDetectionDSL.g:987:2: ( rule__Node__Alternatives_0 )
            // InternalCloneDetectionDSL.g:987:3: rule__Node__Alternatives_0
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
    // InternalCloneDetectionDSL.g:995:1: rule__Node__Group__1 : rule__Node__Group__1__Impl ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:999:1: ( rule__Node__Group__1__Impl )
            // InternalCloneDetectionDSL.g:1000:2: rule__Node__Group__1__Impl
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
    // InternalCloneDetectionDSL.g:1006:1: rule__Node__Group__1__Impl : ( ( rule__Node__Group_1__0 )? ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1010:1: ( ( ( rule__Node__Group_1__0 )? ) )
            // InternalCloneDetectionDSL.g:1011:1: ( ( rule__Node__Group_1__0 )? )
            {
            // InternalCloneDetectionDSL.g:1011:1: ( ( rule__Node__Group_1__0 )? )
            // InternalCloneDetectionDSL.g:1012:2: ( rule__Node__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup_1()); 
            }
            // InternalCloneDetectionDSL.g:1013:2: ( rule__Node__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=27 && LA9_0<=28)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1013:3: rule__Node__Group_1__0
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
    // InternalCloneDetectionDSL.g:1022:1: rule__Node__Group_1__0 : rule__Node__Group_1__0__Impl rule__Node__Group_1__1 ;
    public final void rule__Node__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1026:1: ( rule__Node__Group_1__0__Impl rule__Node__Group_1__1 )
            // InternalCloneDetectionDSL.g:1027:2: rule__Node__Group_1__0__Impl rule__Node__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalCloneDetectionDSL.g:1034:1: rule__Node__Group_1__0__Impl : ( ( rule__Node__UnderAssignment_1_0 ) ) ;
    public final void rule__Node__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1038:1: ( ( ( rule__Node__UnderAssignment_1_0 ) ) )
            // InternalCloneDetectionDSL.g:1039:1: ( ( rule__Node__UnderAssignment_1_0 ) )
            {
            // InternalCloneDetectionDSL.g:1039:1: ( ( rule__Node__UnderAssignment_1_0 ) )
            // InternalCloneDetectionDSL.g:1040:2: ( rule__Node__UnderAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getUnderAssignment_1_0()); 
            }
            // InternalCloneDetectionDSL.g:1041:2: ( rule__Node__UnderAssignment_1_0 )
            // InternalCloneDetectionDSL.g:1041:3: rule__Node__UnderAssignment_1_0
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
    // InternalCloneDetectionDSL.g:1049:1: rule__Node__Group_1__1 : rule__Node__Group_1__1__Impl ;
    public final void rule__Node__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1053:1: ( rule__Node__Group_1__1__Impl )
            // InternalCloneDetectionDSL.g:1054:2: rule__Node__Group_1__1__Impl
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
    // InternalCloneDetectionDSL.g:1060:1: rule__Node__Group_1__1__Impl : ( ( rule__Node__NodeAssignment_1_1 ) ) ;
    public final void rule__Node__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1064:1: ( ( ( rule__Node__NodeAssignment_1_1 ) ) )
            // InternalCloneDetectionDSL.g:1065:1: ( ( rule__Node__NodeAssignment_1_1 ) )
            {
            // InternalCloneDetectionDSL.g:1065:1: ( ( rule__Node__NodeAssignment_1_1 ) )
            // InternalCloneDetectionDSL.g:1066:2: ( rule__Node__NodeAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getNodeAssignment_1_1()); 
            }
            // InternalCloneDetectionDSL.g:1067:2: ( rule__Node__NodeAssignment_1_1 )
            // InternalCloneDetectionDSL.g:1067:3: rule__Node__NodeAssignment_1_1
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
    // InternalCloneDetectionDSL.g:1076:1: rule__Nodes__Group__0 : rule__Nodes__Group__0__Impl rule__Nodes__Group__1 ;
    public final void rule__Nodes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1080:1: ( rule__Nodes__Group__0__Impl rule__Nodes__Group__1 )
            // InternalCloneDetectionDSL.g:1081:2: rule__Nodes__Group__0__Impl rule__Nodes__Group__1
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
    // InternalCloneDetectionDSL.g:1088:1: rule__Nodes__Group__0__Impl : ( ( rule__Nodes__NodeAssignment_0 ) ) ;
    public final void rule__Nodes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1092:1: ( ( ( rule__Nodes__NodeAssignment_0 ) ) )
            // InternalCloneDetectionDSL.g:1093:1: ( ( rule__Nodes__NodeAssignment_0 ) )
            {
            // InternalCloneDetectionDSL.g:1093:1: ( ( rule__Nodes__NodeAssignment_0 ) )
            // InternalCloneDetectionDSL.g:1094:2: ( rule__Nodes__NodeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodesAccess().getNodeAssignment_0()); 
            }
            // InternalCloneDetectionDSL.g:1095:2: ( rule__Nodes__NodeAssignment_0 )
            // InternalCloneDetectionDSL.g:1095:3: rule__Nodes__NodeAssignment_0
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
    // InternalCloneDetectionDSL.g:1103:1: rule__Nodes__Group__1 : rule__Nodes__Group__1__Impl ;
    public final void rule__Nodes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1107:1: ( rule__Nodes__Group__1__Impl )
            // InternalCloneDetectionDSL.g:1108:2: rule__Nodes__Group__1__Impl
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
    // InternalCloneDetectionDSL.g:1114:1: rule__Nodes__Group__1__Impl : ( ( rule__Nodes__Group_1__0 )? ) ;
    public final void rule__Nodes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1118:1: ( ( ( rule__Nodes__Group_1__0 )? ) )
            // InternalCloneDetectionDSL.g:1119:1: ( ( rule__Nodes__Group_1__0 )? )
            {
            // InternalCloneDetectionDSL.g:1119:1: ( ( rule__Nodes__Group_1__0 )? )
            // InternalCloneDetectionDSL.g:1120:2: ( rule__Nodes__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodesAccess().getGroup_1()); 
            }
            // InternalCloneDetectionDSL.g:1121:2: ( rule__Nodes__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==35) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1121:3: rule__Nodes__Group_1__0
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
    // InternalCloneDetectionDSL.g:1130:1: rule__Nodes__Group_1__0 : rule__Nodes__Group_1__0__Impl rule__Nodes__Group_1__1 ;
    public final void rule__Nodes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1134:1: ( rule__Nodes__Group_1__0__Impl rule__Nodes__Group_1__1 )
            // InternalCloneDetectionDSL.g:1135:2: rule__Nodes__Group_1__0__Impl rule__Nodes__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalCloneDetectionDSL.g:1142:1: rule__Nodes__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Nodes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1146:1: ( ( ',' ) )
            // InternalCloneDetectionDSL.g:1147:1: ( ',' )
            {
            // InternalCloneDetectionDSL.g:1147:1: ( ',' )
            // InternalCloneDetectionDSL.g:1148:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodesAccess().getCommaKeyword_1_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalCloneDetectionDSL.g:1157:1: rule__Nodes__Group_1__1 : rule__Nodes__Group_1__1__Impl ;
    public final void rule__Nodes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1161:1: ( rule__Nodes__Group_1__1__Impl )
            // InternalCloneDetectionDSL.g:1162:2: rule__Nodes__Group_1__1__Impl
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
    // InternalCloneDetectionDSL.g:1168:1: rule__Nodes__Group_1__1__Impl : ( ( rule__Nodes__NodesAssignment_1_1 ) ) ;
    public final void rule__Nodes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1172:1: ( ( ( rule__Nodes__NodesAssignment_1_1 ) ) )
            // InternalCloneDetectionDSL.g:1173:1: ( ( rule__Nodes__NodesAssignment_1_1 ) )
            {
            // InternalCloneDetectionDSL.g:1173:1: ( ( rule__Nodes__NodesAssignment_1_1 ) )
            // InternalCloneDetectionDSL.g:1174:2: ( rule__Nodes__NodesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodesAccess().getNodesAssignment_1_1()); 
            }
            // InternalCloneDetectionDSL.g:1175:2: ( rule__Nodes__NodesAssignment_1_1 )
            // InternalCloneDetectionDSL.g:1175:3: rule__Nodes__NodesAssignment_1_1
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
    // InternalCloneDetectionDSL.g:1184:1: rule__Size__Group__0 : rule__Size__Group__0__Impl rule__Size__Group__1 ;
    public final void rule__Size__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1188:1: ( rule__Size__Group__0__Impl rule__Size__Group__1 )
            // InternalCloneDetectionDSL.g:1189:2: rule__Size__Group__0__Impl rule__Size__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalCloneDetectionDSL.g:1196:1: rule__Size__Group__0__Impl : ( 'Size' ) ;
    public final void rule__Size__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1200:1: ( ( 'Size' ) )
            // InternalCloneDetectionDSL.g:1201:1: ( 'Size' )
            {
            // InternalCloneDetectionDSL.g:1201:1: ( 'Size' )
            // InternalCloneDetectionDSL.g:1202:2: 'Size'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeAccess().getSizeKeyword_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalCloneDetectionDSL.g:1211:1: rule__Size__Group__1 : rule__Size__Group__1__Impl ;
    public final void rule__Size__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1215:1: ( rule__Size__Group__1__Impl )
            // InternalCloneDetectionDSL.g:1216:2: rule__Size__Group__1__Impl
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
    // InternalCloneDetectionDSL.g:1222:1: rule__Size__Group__1__Impl : ( ruleMinSize ) ;
    public final void rule__Size__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1226:1: ( ( ruleMinSize ) )
            // InternalCloneDetectionDSL.g:1227:1: ( ruleMinSize )
            {
            // InternalCloneDetectionDSL.g:1227:1: ( ruleMinSize )
            // InternalCloneDetectionDSL.g:1228:2: ruleMinSize
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
    // InternalCloneDetectionDSL.g:1238:1: rule__MinSize__Group__0 : rule__MinSize__Group__0__Impl rule__MinSize__Group__1 ;
    public final void rule__MinSize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1242:1: ( rule__MinSize__Group__0__Impl rule__MinSize__Group__1 )
            // InternalCloneDetectionDSL.g:1243:2: rule__MinSize__Group__0__Impl rule__MinSize__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalCloneDetectionDSL.g:1250:1: rule__MinSize__Group__0__Impl : ( ( rule__MinSize__Alternatives_0 ) ) ;
    public final void rule__MinSize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1254:1: ( ( ( rule__MinSize__Alternatives_0 ) ) )
            // InternalCloneDetectionDSL.g:1255:1: ( ( rule__MinSize__Alternatives_0 ) )
            {
            // InternalCloneDetectionDSL.g:1255:1: ( ( rule__MinSize__Alternatives_0 ) )
            // InternalCloneDetectionDSL.g:1256:2: ( rule__MinSize__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getAlternatives_0()); 
            }
            // InternalCloneDetectionDSL.g:1257:2: ( rule__MinSize__Alternatives_0 )
            // InternalCloneDetectionDSL.g:1257:3: rule__MinSize__Alternatives_0
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
    // InternalCloneDetectionDSL.g:1265:1: rule__MinSize__Group__1 : rule__MinSize__Group__1__Impl ;
    public final void rule__MinSize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1269:1: ( rule__MinSize__Group__1__Impl )
            // InternalCloneDetectionDSL.g:1270:2: rule__MinSize__Group__1__Impl
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
    // InternalCloneDetectionDSL.g:1276:1: rule__MinSize__Group__1__Impl : ( ( rule__MinSize__Group_1__0 )? ) ;
    public final void rule__MinSize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1280:1: ( ( ( rule__MinSize__Group_1__0 )? ) )
            // InternalCloneDetectionDSL.g:1281:1: ( ( rule__MinSize__Group_1__0 )? )
            {
            // InternalCloneDetectionDSL.g:1281:1: ( ( rule__MinSize__Group_1__0 )? )
            // InternalCloneDetectionDSL.g:1282:2: ( rule__MinSize__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getGroup_1()); 
            }
            // InternalCloneDetectionDSL.g:1283:2: ( rule__MinSize__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=21 && LA11_0<=22)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1283:3: rule__MinSize__Group_1__0
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
    // InternalCloneDetectionDSL.g:1292:1: rule__MinSize__Group_0_1__0 : rule__MinSize__Group_0_1__0__Impl rule__MinSize__Group_0_1__1 ;
    public final void rule__MinSize__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1296:1: ( rule__MinSize__Group_0_1__0__Impl rule__MinSize__Group_0_1__1 )
            // InternalCloneDetectionDSL.g:1297:2: rule__MinSize__Group_0_1__0__Impl rule__MinSize__Group_0_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalCloneDetectionDSL.g:1304:1: rule__MinSize__Group_0_1__0__Impl : ( '(' ) ;
    public final void rule__MinSize__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1308:1: ( ( '(' ) )
            // InternalCloneDetectionDSL.g:1309:1: ( '(' )
            {
            // InternalCloneDetectionDSL.g:1309:1: ( '(' )
            // InternalCloneDetectionDSL.g:1310:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getLeftParenthesisKeyword_0_1_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalCloneDetectionDSL.g:1319:1: rule__MinSize__Group_0_1__1 : rule__MinSize__Group_0_1__1__Impl rule__MinSize__Group_0_1__2 ;
    public final void rule__MinSize__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1323:1: ( rule__MinSize__Group_0_1__1__Impl rule__MinSize__Group_0_1__2 )
            // InternalCloneDetectionDSL.g:1324:2: rule__MinSize__Group_0_1__1__Impl rule__MinSize__Group_0_1__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalCloneDetectionDSL.g:1331:1: rule__MinSize__Group_0_1__1__Impl : ( ( rule__MinSize__BracketsAssignment_0_1_1 ) ) ;
    public final void rule__MinSize__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1335:1: ( ( ( rule__MinSize__BracketsAssignment_0_1_1 ) ) )
            // InternalCloneDetectionDSL.g:1336:1: ( ( rule__MinSize__BracketsAssignment_0_1_1 ) )
            {
            // InternalCloneDetectionDSL.g:1336:1: ( ( rule__MinSize__BracketsAssignment_0_1_1 ) )
            // InternalCloneDetectionDSL.g:1337:2: ( rule__MinSize__BracketsAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getBracketsAssignment_0_1_1()); 
            }
            // InternalCloneDetectionDSL.g:1338:2: ( rule__MinSize__BracketsAssignment_0_1_1 )
            // InternalCloneDetectionDSL.g:1338:3: rule__MinSize__BracketsAssignment_0_1_1
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
    // InternalCloneDetectionDSL.g:1346:1: rule__MinSize__Group_0_1__2 : rule__MinSize__Group_0_1__2__Impl ;
    public final void rule__MinSize__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1350:1: ( rule__MinSize__Group_0_1__2__Impl )
            // InternalCloneDetectionDSL.g:1351:2: rule__MinSize__Group_0_1__2__Impl
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
    // InternalCloneDetectionDSL.g:1357:1: rule__MinSize__Group_0_1__2__Impl : ( ')' ) ;
    public final void rule__MinSize__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1361:1: ( ( ')' ) )
            // InternalCloneDetectionDSL.g:1362:1: ( ')' )
            {
            // InternalCloneDetectionDSL.g:1362:1: ( ')' )
            // InternalCloneDetectionDSL.g:1363:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getRightParenthesisKeyword_0_1_2()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalCloneDetectionDSL.g:1373:1: rule__MinSize__Group_1__0 : rule__MinSize__Group_1__0__Impl rule__MinSize__Group_1__1 ;
    public final void rule__MinSize__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1377:1: ( rule__MinSize__Group_1__0__Impl rule__MinSize__Group_1__1 )
            // InternalCloneDetectionDSL.g:1378:2: rule__MinSize__Group_1__0__Impl rule__MinSize__Group_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalCloneDetectionDSL.g:1385:1: rule__MinSize__Group_1__0__Impl : ( ( rule__MinSize__OperatorAssignment_1_0 ) ) ;
    public final void rule__MinSize__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1389:1: ( ( ( rule__MinSize__OperatorAssignment_1_0 ) ) )
            // InternalCloneDetectionDSL.g:1390:1: ( ( rule__MinSize__OperatorAssignment_1_0 ) )
            {
            // InternalCloneDetectionDSL.g:1390:1: ( ( rule__MinSize__OperatorAssignment_1_0 ) )
            // InternalCloneDetectionDSL.g:1391:2: ( rule__MinSize__OperatorAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getOperatorAssignment_1_0()); 
            }
            // InternalCloneDetectionDSL.g:1392:2: ( rule__MinSize__OperatorAssignment_1_0 )
            // InternalCloneDetectionDSL.g:1392:3: rule__MinSize__OperatorAssignment_1_0
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
    // InternalCloneDetectionDSL.g:1400:1: rule__MinSize__Group_1__1 : rule__MinSize__Group_1__1__Impl ;
    public final void rule__MinSize__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1404:1: ( rule__MinSize__Group_1__1__Impl )
            // InternalCloneDetectionDSL.g:1405:2: rule__MinSize__Group_1__1__Impl
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
    // InternalCloneDetectionDSL.g:1411:1: rule__MinSize__Group_1__1__Impl : ( ( rule__MinSize__SizeAssignment_1_1 ) ) ;
    public final void rule__MinSize__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1415:1: ( ( ( rule__MinSize__SizeAssignment_1_1 ) ) )
            // InternalCloneDetectionDSL.g:1416:1: ( ( rule__MinSize__SizeAssignment_1_1 ) )
            {
            // InternalCloneDetectionDSL.g:1416:1: ( ( rule__MinSize__SizeAssignment_1_1 ) )
            // InternalCloneDetectionDSL.g:1417:2: ( rule__MinSize__SizeAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinSizeAccess().getSizeAssignment_1_1()); 
            }
            // InternalCloneDetectionDSL.g:1418:2: ( rule__MinSize__SizeAssignment_1_1 )
            // InternalCloneDetectionDSL.g:1418:3: rule__MinSize__SizeAssignment_1_1
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
    // InternalCloneDetectionDSL.g:1427:1: rule__MetricExpr__Group__0 : rule__MetricExpr__Group__0__Impl rule__MetricExpr__Group__1 ;
    public final void rule__MetricExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1431:1: ( rule__MetricExpr__Group__0__Impl rule__MetricExpr__Group__1 )
            // InternalCloneDetectionDSL.g:1432:2: rule__MetricExpr__Group__0__Impl rule__MetricExpr__Group__1
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
    // InternalCloneDetectionDSL.g:1439:1: rule__MetricExpr__Group__0__Impl : ( ( rule__MetricExpr__AmountAssignment_0 ) ) ;
    public final void rule__MetricExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1443:1: ( ( ( rule__MetricExpr__AmountAssignment_0 ) ) )
            // InternalCloneDetectionDSL.g:1444:1: ( ( rule__MetricExpr__AmountAssignment_0 ) )
            {
            // InternalCloneDetectionDSL.g:1444:1: ( ( rule__MetricExpr__AmountAssignment_0 ) )
            // InternalCloneDetectionDSL.g:1445:2: ( rule__MetricExpr__AmountAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricExprAccess().getAmountAssignment_0()); 
            }
            // InternalCloneDetectionDSL.g:1446:2: ( rule__MetricExpr__AmountAssignment_0 )
            // InternalCloneDetectionDSL.g:1446:3: rule__MetricExpr__AmountAssignment_0
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
    // InternalCloneDetectionDSL.g:1454:1: rule__MetricExpr__Group__1 : rule__MetricExpr__Group__1__Impl ;
    public final void rule__MetricExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1458:1: ( rule__MetricExpr__Group__1__Impl )
            // InternalCloneDetectionDSL.g:1459:2: rule__MetricExpr__Group__1__Impl
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
    // InternalCloneDetectionDSL.g:1465:1: rule__MetricExpr__Group__1__Impl : ( ( rule__MetricExpr__MetricAssignment_1 ) ) ;
    public final void rule__MetricExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1469:1: ( ( ( rule__MetricExpr__MetricAssignment_1 ) ) )
            // InternalCloneDetectionDSL.g:1470:1: ( ( rule__MetricExpr__MetricAssignment_1 ) )
            {
            // InternalCloneDetectionDSL.g:1470:1: ( ( rule__MetricExpr__MetricAssignment_1 ) )
            // InternalCloneDetectionDSL.g:1471:2: ( rule__MetricExpr__MetricAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricExprAccess().getMetricAssignment_1()); 
            }
            // InternalCloneDetectionDSL.g:1472:2: ( rule__MetricExpr__MetricAssignment_1 )
            // InternalCloneDetectionDSL.g:1472:3: rule__MetricExpr__MetricAssignment_1
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
    // InternalCloneDetectionDSL.g:1481:1: rule__DoNotCompare__Group__0 : rule__DoNotCompare__Group__0__Impl rule__DoNotCompare__Group__1 ;
    public final void rule__DoNotCompare__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1485:1: ( rule__DoNotCompare__Group__0__Impl rule__DoNotCompare__Group__1 )
            // InternalCloneDetectionDSL.g:1486:2: rule__DoNotCompare__Group__0__Impl rule__DoNotCompare__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalCloneDetectionDSL.g:1493:1: rule__DoNotCompare__Group__0__Impl : ( 'DoNotCompare' ) ;
    public final void rule__DoNotCompare__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1497:1: ( ( 'DoNotCompare' ) )
            // InternalCloneDetectionDSL.g:1498:1: ( 'DoNotCompare' )
            {
            // InternalCloneDetectionDSL.g:1498:1: ( 'DoNotCompare' )
            // InternalCloneDetectionDSL.g:1499:2: 'DoNotCompare'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoNotCompareAccess().getDoNotCompareKeyword_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalCloneDetectionDSL.g:1508:1: rule__DoNotCompare__Group__1 : rule__DoNotCompare__Group__1__Impl ;
    public final void rule__DoNotCompare__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1512:1: ( rule__DoNotCompare__Group__1__Impl )
            // InternalCloneDetectionDSL.g:1513:2: rule__DoNotCompare__Group__1__Impl
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
    // InternalCloneDetectionDSL.g:1519:1: rule__DoNotCompare__Group__1__Impl : ( ruleNodes ) ;
    public final void rule__DoNotCompare__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1523:1: ( ( ruleNodes ) )
            // InternalCloneDetectionDSL.g:1524:1: ( ruleNodes )
            {
            // InternalCloneDetectionDSL.g:1524:1: ( ruleNodes )
            // InternalCloneDetectionDSL.g:1525:2: ruleNodes
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
    // InternalCloneDetectionDSL.g:1535:1: rule__Compare__Group__0 : rule__Compare__Group__0__Impl rule__Compare__Group__1 ;
    public final void rule__Compare__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1539:1: ( rule__Compare__Group__0__Impl rule__Compare__Group__1 )
            // InternalCloneDetectionDSL.g:1540:2: rule__Compare__Group__0__Impl rule__Compare__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalCloneDetectionDSL.g:1547:1: rule__Compare__Group__0__Impl : ( 'Compare' ) ;
    public final void rule__Compare__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1551:1: ( ( 'Compare' ) )
            // InternalCloneDetectionDSL.g:1552:1: ( 'Compare' )
            {
            // InternalCloneDetectionDSL.g:1552:1: ( 'Compare' )
            // InternalCloneDetectionDSL.g:1553:2: 'Compare'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getCompareKeyword_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalCloneDetectionDSL.g:1562:1: rule__Compare__Group__1 : rule__Compare__Group__1__Impl rule__Compare__Group__2 ;
    public final void rule__Compare__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1566:1: ( rule__Compare__Group__1__Impl rule__Compare__Group__2 )
            // InternalCloneDetectionDSL.g:1567:2: rule__Compare__Group__1__Impl rule__Compare__Group__2
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
    // InternalCloneDetectionDSL.g:1574:1: rule__Compare__Group__1__Impl : ( ( rule__Compare__NodesAssignment_1 ) ) ;
    public final void rule__Compare__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1578:1: ( ( ( rule__Compare__NodesAssignment_1 ) ) )
            // InternalCloneDetectionDSL.g:1579:1: ( ( rule__Compare__NodesAssignment_1 ) )
            {
            // InternalCloneDetectionDSL.g:1579:1: ( ( rule__Compare__NodesAssignment_1 ) )
            // InternalCloneDetectionDSL.g:1580:2: ( rule__Compare__NodesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getNodesAssignment_1()); 
            }
            // InternalCloneDetectionDSL.g:1581:2: ( rule__Compare__NodesAssignment_1 )
            // InternalCloneDetectionDSL.g:1581:3: rule__Compare__NodesAssignment_1
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
    // InternalCloneDetectionDSL.g:1589:1: rule__Compare__Group__2 : rule__Compare__Group__2__Impl rule__Compare__Group__3 ;
    public final void rule__Compare__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1593:1: ( rule__Compare__Group__2__Impl rule__Compare__Group__3 )
            // InternalCloneDetectionDSL.g:1594:2: rule__Compare__Group__2__Impl rule__Compare__Group__3
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
    // InternalCloneDetectionDSL.g:1601:1: rule__Compare__Group__2__Impl : ( ( rule__Compare__ComparisonMethodAssignment_2 ) ) ;
    public final void rule__Compare__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1605:1: ( ( ( rule__Compare__ComparisonMethodAssignment_2 ) ) )
            // InternalCloneDetectionDSL.g:1606:1: ( ( rule__Compare__ComparisonMethodAssignment_2 ) )
            {
            // InternalCloneDetectionDSL.g:1606:1: ( ( rule__Compare__ComparisonMethodAssignment_2 ) )
            // InternalCloneDetectionDSL.g:1607:2: ( rule__Compare__ComparisonMethodAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getComparisonMethodAssignment_2()); 
            }
            // InternalCloneDetectionDSL.g:1608:2: ( rule__Compare__ComparisonMethodAssignment_2 )
            // InternalCloneDetectionDSL.g:1608:3: rule__Compare__ComparisonMethodAssignment_2
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
    // InternalCloneDetectionDSL.g:1616:1: rule__Compare__Group__3 : rule__Compare__Group__3__Impl rule__Compare__Group__4 ;
    public final void rule__Compare__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1620:1: ( rule__Compare__Group__3__Impl rule__Compare__Group__4 )
            // InternalCloneDetectionDSL.g:1621:2: rule__Compare__Group__3__Impl rule__Compare__Group__4
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
    // InternalCloneDetectionDSL.g:1628:1: rule__Compare__Group__3__Impl : ( ( rule__Compare__DeepestNodeAssignment_3 )? ) ;
    public final void rule__Compare__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1632:1: ( ( ( rule__Compare__DeepestNodeAssignment_3 )? ) )
            // InternalCloneDetectionDSL.g:1633:1: ( ( rule__Compare__DeepestNodeAssignment_3 )? )
            {
            // InternalCloneDetectionDSL.g:1633:1: ( ( rule__Compare__DeepestNodeAssignment_3 )? )
            // InternalCloneDetectionDSL.g:1634:2: ( rule__Compare__DeepestNodeAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getDeepestNodeAssignment_3()); 
            }
            // InternalCloneDetectionDSL.g:1635:2: ( rule__Compare__DeepestNodeAssignment_3 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||LA12_0==11) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1635:3: rule__Compare__DeepestNodeAssignment_3
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
    // InternalCloneDetectionDSL.g:1643:1: rule__Compare__Group__4 : rule__Compare__Group__4__Impl ;
    public final void rule__Compare__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1647:1: ( rule__Compare__Group__4__Impl )
            // InternalCloneDetectionDSL.g:1648:2: rule__Compare__Group__4__Impl
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
    // InternalCloneDetectionDSL.g:1654:1: rule__Compare__Group__4__Impl : ( ( rule__Compare__PercAssignment_4 )? ) ;
    public final void rule__Compare__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1658:1: ( ( ( rule__Compare__PercAssignment_4 )? ) )
            // InternalCloneDetectionDSL.g:1659:1: ( ( rule__Compare__PercAssignment_4 )? )
            {
            // InternalCloneDetectionDSL.g:1659:1: ( ( rule__Compare__PercAssignment_4 )? )
            // InternalCloneDetectionDSL.g:1660:2: ( rule__Compare__PercAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getPercAssignment_4()); 
            }
            // InternalCloneDetectionDSL.g:1661:2: ( rule__Compare__PercAssignment_4 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1661:3: rule__Compare__PercAssignment_4
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
    // InternalCloneDetectionDSL.g:1670:1: rule__Percentage__Group__0 : rule__Percentage__Group__0__Impl rule__Percentage__Group__1 ;
    public final void rule__Percentage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1674:1: ( rule__Percentage__Group__0__Impl rule__Percentage__Group__1 )
            // InternalCloneDetectionDSL.g:1675:2: rule__Percentage__Group__0__Impl rule__Percentage__Group__1
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
    // InternalCloneDetectionDSL.g:1682:1: rule__Percentage__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Percentage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1686:1: ( ( RULE_INT ) )
            // InternalCloneDetectionDSL.g:1687:1: ( RULE_INT )
            {
            // InternalCloneDetectionDSL.g:1687:1: ( RULE_INT )
            // InternalCloneDetectionDSL.g:1688:2: RULE_INT
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
    // InternalCloneDetectionDSL.g:1697:1: rule__Percentage__Group__1 : rule__Percentage__Group__1__Impl ;
    public final void rule__Percentage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1701:1: ( rule__Percentage__Group__1__Impl )
            // InternalCloneDetectionDSL.g:1702:2: rule__Percentage__Group__1__Impl
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
    // InternalCloneDetectionDSL.g:1708:1: rule__Percentage__Group__1__Impl : ( '%' ) ;
    public final void rule__Percentage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1712:1: ( ( '%' ) )
            // InternalCloneDetectionDSL.g:1713:1: ( '%' )
            {
            // InternalCloneDetectionDSL.g:1713:1: ( '%' )
            // InternalCloneDetectionDSL.g:1714:2: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPercentageAccess().getPercentSignKeyword_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalCloneDetectionDSL.g:1724:1: rule__CloneDetection__UnorderedGroup : rule__CloneDetection__UnorderedGroup__0 {...}?;
    public final void rule__CloneDetection__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getCloneDetectionAccess().getUnorderedGroup());
        	
        try {
            // InternalCloneDetectionDSL.g:1729:1: ( rule__CloneDetection__UnorderedGroup__0 {...}?)
            // InternalCloneDetectionDSL.g:1730:2: rule__CloneDetection__UnorderedGroup__0 {...}?
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
    // InternalCloneDetectionDSL.g:1738:1: rule__CloneDetection__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__RootAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__PathsAssignment_5 ) ) ( ( ( rule__CloneDetection__PathsAssignment_5 )=> rule__CloneDetection__PathsAssignment_5 )* ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__NotCompareAssignment_6 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_6 )=> rule__CloneDetection__NotCompareAssignment_6 )* ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__CompareAssignment_7 ) ) ( ( ( rule__CloneDetection__CompareAssignment_7 )=> rule__CloneDetection__CompareAssignment_7 )* ) ) ) ) ) ;
    public final void rule__CloneDetection__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalCloneDetectionDSL.g:1743:1: ( ( ({...}? => ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__RootAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__PathsAssignment_5 ) ) ( ( ( rule__CloneDetection__PathsAssignment_5 )=> rule__CloneDetection__PathsAssignment_5 )* ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__NotCompareAssignment_6 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_6 )=> rule__CloneDetection__NotCompareAssignment_6 )* ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__CompareAssignment_7 ) ) ( ( ( rule__CloneDetection__CompareAssignment_7 )=> rule__CloneDetection__CompareAssignment_7 )* ) ) ) ) ) )
            // InternalCloneDetectionDSL.g:1744:3: ( ({...}? => ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__RootAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__PathsAssignment_5 ) ) ( ( ( rule__CloneDetection__PathsAssignment_5 )=> rule__CloneDetection__PathsAssignment_5 )* ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__NotCompareAssignment_6 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_6 )=> rule__CloneDetection__NotCompareAssignment_6 )* ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__CompareAssignment_7 ) ) ( ( ( rule__CloneDetection__CompareAssignment_7 )=> rule__CloneDetection__CompareAssignment_7 )* ) ) ) ) )
            {
            // InternalCloneDetectionDSL.g:1744:3: ( ({...}? => ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__RootAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) ) ) | ({...}? => ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__PathsAssignment_5 ) ) ( ( ( rule__CloneDetection__PathsAssignment_5 )=> rule__CloneDetection__PathsAssignment_5 )* ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__NotCompareAssignment_6 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_6 )=> rule__CloneDetection__NotCompareAssignment_6 )* ) ) ) ) | ({...}? => ( ( ( ( rule__CloneDetection__CompareAssignment_7 ) ) ( ( ( rule__CloneDetection__CompareAssignment_7 )=> rule__CloneDetection__CompareAssignment_7 )* ) ) ) ) )
            int alt17=8;
            int LA17_0 = input.LA(1);

            if ( LA17_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0) ) {
                alt17=1;
            }
            else if ( LA17_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1) ) {
                alt17=2;
            }
            else if ( LA17_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2) ) {
                alt17=3;
            }
            else if ( LA17_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3) ) {
                alt17=4;
            }
            else if ( LA17_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4) ) {
                alt17=5;
            }
            else if ( LA17_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5) ) {
                alt17=6;
            }
            else if ( LA17_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6) ) {
                alt17=7;
            }
            else if ( LA17_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 7) ) {
                alt17=8;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1745:3: ({...}? => ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) ) )
                    {
                    // InternalCloneDetectionDSL.g:1745:3: ({...}? => ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) ) )
                    // InternalCloneDetectionDSL.g:1746:4: {...}? => ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__CloneDetection__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalCloneDetectionDSL.g:1746:108: ( ( ( rule__CloneDetection__ProjectAssignment_0 ) ) )
                    // InternalCloneDetectionDSL.g:1747:5: ( ( rule__CloneDetection__ProjectAssignment_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0);
                    selected = true;
                    // InternalCloneDetectionDSL.g:1753:5: ( ( rule__CloneDetection__ProjectAssignment_0 ) )
                    // InternalCloneDetectionDSL.g:1754:6: ( rule__CloneDetection__ProjectAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getProjectAssignment_0()); 
                    }
                    // InternalCloneDetectionDSL.g:1755:6: ( rule__CloneDetection__ProjectAssignment_0 )
                    // InternalCloneDetectionDSL.g:1755:7: rule__CloneDetection__ProjectAssignment_0
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
                    // InternalCloneDetectionDSL.g:1760:3: ({...}? => ( ( ( rule__CloneDetection__RootAssignment_1 ) ) ) )
                    {
                    // InternalCloneDetectionDSL.g:1760:3: ({...}? => ( ( ( rule__CloneDetection__RootAssignment_1 ) ) ) )
                    // InternalCloneDetectionDSL.g:1761:4: {...}? => ( ( ( rule__CloneDetection__RootAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__CloneDetection__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalCloneDetectionDSL.g:1761:108: ( ( ( rule__CloneDetection__RootAssignment_1 ) ) )
                    // InternalCloneDetectionDSL.g:1762:5: ( ( rule__CloneDetection__RootAssignment_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1);
                    selected = true;
                    // InternalCloneDetectionDSL.g:1768:5: ( ( rule__CloneDetection__RootAssignment_1 ) )
                    // InternalCloneDetectionDSL.g:1769:6: ( rule__CloneDetection__RootAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getRootAssignment_1()); 
                    }
                    // InternalCloneDetectionDSL.g:1770:6: ( rule__CloneDetection__RootAssignment_1 )
                    // InternalCloneDetectionDSL.g:1770:7: rule__CloneDetection__RootAssignment_1
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
                    // InternalCloneDetectionDSL.g:1775:3: ({...}? => ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) ) )
                    {
                    // InternalCloneDetectionDSL.g:1775:3: ({...}? => ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) ) )
                    // InternalCloneDetectionDSL.g:1776:4: {...}? => ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__CloneDetection__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalCloneDetectionDSL.g:1776:108: ( ( ( rule__CloneDetection__MatchAssignment_2 ) ) )
                    // InternalCloneDetectionDSL.g:1777:5: ( ( rule__CloneDetection__MatchAssignment_2 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2);
                    selected = true;
                    // InternalCloneDetectionDSL.g:1783:5: ( ( rule__CloneDetection__MatchAssignment_2 ) )
                    // InternalCloneDetectionDSL.g:1784:6: ( rule__CloneDetection__MatchAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getMatchAssignment_2()); 
                    }
                    // InternalCloneDetectionDSL.g:1785:6: ( rule__CloneDetection__MatchAssignment_2 )
                    // InternalCloneDetectionDSL.g:1785:7: rule__CloneDetection__MatchAssignment_2
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
                    // InternalCloneDetectionDSL.g:1790:3: ({...}? => ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) ) )
                    {
                    // InternalCloneDetectionDSL.g:1790:3: ({...}? => ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) ) )
                    // InternalCloneDetectionDSL.g:1791:4: {...}? => ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__CloneDetection__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3)");
                    }
                    // InternalCloneDetectionDSL.g:1791:108: ( ( ( rule__CloneDetection__ExcludeAssignment_3 ) ) )
                    // InternalCloneDetectionDSL.g:1792:5: ( ( rule__CloneDetection__ExcludeAssignment_3 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3);
                    selected = true;
                    // InternalCloneDetectionDSL.g:1798:5: ( ( rule__CloneDetection__ExcludeAssignment_3 ) )
                    // InternalCloneDetectionDSL.g:1799:6: ( rule__CloneDetection__ExcludeAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getExcludeAssignment_3()); 
                    }
                    // InternalCloneDetectionDSL.g:1800:6: ( rule__CloneDetection__ExcludeAssignment_3 )
                    // InternalCloneDetectionDSL.g:1800:7: rule__CloneDetection__ExcludeAssignment_3
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
                    // InternalCloneDetectionDSL.g:1805:3: ({...}? => ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) ) )
                    {
                    // InternalCloneDetectionDSL.g:1805:3: ({...}? => ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) ) )
                    // InternalCloneDetectionDSL.g:1806:4: {...}? => ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__CloneDetection__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4)");
                    }
                    // InternalCloneDetectionDSL.g:1806:108: ( ( ( rule__CloneDetection__SizeAssignment_4 ) ) )
                    // InternalCloneDetectionDSL.g:1807:5: ( ( rule__CloneDetection__SizeAssignment_4 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4);
                    selected = true;
                    // InternalCloneDetectionDSL.g:1813:5: ( ( rule__CloneDetection__SizeAssignment_4 ) )
                    // InternalCloneDetectionDSL.g:1814:6: ( rule__CloneDetection__SizeAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getSizeAssignment_4()); 
                    }
                    // InternalCloneDetectionDSL.g:1815:6: ( rule__CloneDetection__SizeAssignment_4 )
                    // InternalCloneDetectionDSL.g:1815:7: rule__CloneDetection__SizeAssignment_4
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
                    // InternalCloneDetectionDSL.g:1820:3: ({...}? => ( ( ( ( rule__CloneDetection__PathsAssignment_5 ) ) ( ( ( rule__CloneDetection__PathsAssignment_5 )=> rule__CloneDetection__PathsAssignment_5 )* ) ) ) )
                    {
                    // InternalCloneDetectionDSL.g:1820:3: ({...}? => ( ( ( ( rule__CloneDetection__PathsAssignment_5 ) ) ( ( ( rule__CloneDetection__PathsAssignment_5 )=> rule__CloneDetection__PathsAssignment_5 )* ) ) ) )
                    // InternalCloneDetectionDSL.g:1821:4: {...}? => ( ( ( ( rule__CloneDetection__PathsAssignment_5 ) ) ( ( ( rule__CloneDetection__PathsAssignment_5 )=> rule__CloneDetection__PathsAssignment_5 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__CloneDetection__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5)");
                    }
                    // InternalCloneDetectionDSL.g:1821:108: ( ( ( ( rule__CloneDetection__PathsAssignment_5 ) ) ( ( ( rule__CloneDetection__PathsAssignment_5 )=> rule__CloneDetection__PathsAssignment_5 )* ) ) )
                    // InternalCloneDetectionDSL.g:1822:5: ( ( ( rule__CloneDetection__PathsAssignment_5 ) ) ( ( ( rule__CloneDetection__PathsAssignment_5 )=> rule__CloneDetection__PathsAssignment_5 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5);
                    selected = true;
                    // InternalCloneDetectionDSL.g:1828:5: ( ( ( rule__CloneDetection__PathsAssignment_5 ) ) ( ( ( rule__CloneDetection__PathsAssignment_5 )=> rule__CloneDetection__PathsAssignment_5 )* ) )
                    // InternalCloneDetectionDSL.g:1829:6: ( ( rule__CloneDetection__PathsAssignment_5 ) ) ( ( ( rule__CloneDetection__PathsAssignment_5 )=> rule__CloneDetection__PathsAssignment_5 )* )
                    {
                    // InternalCloneDetectionDSL.g:1829:6: ( ( rule__CloneDetection__PathsAssignment_5 ) )
                    // InternalCloneDetectionDSL.g:1830:7: ( rule__CloneDetection__PathsAssignment_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getPathsAssignment_5()); 
                    }
                    // InternalCloneDetectionDSL.g:1831:7: ( rule__CloneDetection__PathsAssignment_5 )
                    // InternalCloneDetectionDSL.g:1831:8: rule__CloneDetection__PathsAssignment_5
                    {
                    pushFollow(FOLLOW_16);
                    rule__CloneDetection__PathsAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCloneDetectionAccess().getPathsAssignment_5()); 
                    }

                    }

                    // InternalCloneDetectionDSL.g:1834:6: ( ( ( rule__CloneDetection__PathsAssignment_5 )=> rule__CloneDetection__PathsAssignment_5 )* )
                    // InternalCloneDetectionDSL.g:1835:7: ( ( rule__CloneDetection__PathsAssignment_5 )=> rule__CloneDetection__PathsAssignment_5 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getPathsAssignment_5()); 
                    }
                    // InternalCloneDetectionDSL.g:1836:7: ( ( rule__CloneDetection__PathsAssignment_5 )=> rule__CloneDetection__PathsAssignment_5 )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==31) ) {
                            int LA14_2 = input.LA(2);

                            if ( (LA14_2==RULE_STRING) ) {
                                int LA14_3 = input.LA(3);

                                if ( (synpred1_InternalCloneDetectionDSL()) ) {
                                    alt14=1;
                                }


                            }


                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalCloneDetectionDSL.g:1836:8: ( rule__CloneDetection__PathsAssignment_5 )=> rule__CloneDetection__PathsAssignment_5
                    	    {
                    	    pushFollow(FOLLOW_16);
                    	    rule__CloneDetection__PathsAssignment_5();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCloneDetectionAccess().getPathsAssignment_5()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalCloneDetectionDSL.g:1842:3: ({...}? => ( ( ( ( rule__CloneDetection__NotCompareAssignment_6 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_6 )=> rule__CloneDetection__NotCompareAssignment_6 )* ) ) ) )
                    {
                    // InternalCloneDetectionDSL.g:1842:3: ({...}? => ( ( ( ( rule__CloneDetection__NotCompareAssignment_6 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_6 )=> rule__CloneDetection__NotCompareAssignment_6 )* ) ) ) )
                    // InternalCloneDetectionDSL.g:1843:4: {...}? => ( ( ( ( rule__CloneDetection__NotCompareAssignment_6 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_6 )=> rule__CloneDetection__NotCompareAssignment_6 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__CloneDetection__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6)");
                    }
                    // InternalCloneDetectionDSL.g:1843:108: ( ( ( ( rule__CloneDetection__NotCompareAssignment_6 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_6 )=> rule__CloneDetection__NotCompareAssignment_6 )* ) ) )
                    // InternalCloneDetectionDSL.g:1844:5: ( ( ( rule__CloneDetection__NotCompareAssignment_6 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_6 )=> rule__CloneDetection__NotCompareAssignment_6 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6);
                    selected = true;
                    // InternalCloneDetectionDSL.g:1850:5: ( ( ( rule__CloneDetection__NotCompareAssignment_6 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_6 )=> rule__CloneDetection__NotCompareAssignment_6 )* ) )
                    // InternalCloneDetectionDSL.g:1851:6: ( ( rule__CloneDetection__NotCompareAssignment_6 ) ) ( ( ( rule__CloneDetection__NotCompareAssignment_6 )=> rule__CloneDetection__NotCompareAssignment_6 )* )
                    {
                    // InternalCloneDetectionDSL.g:1851:6: ( ( rule__CloneDetection__NotCompareAssignment_6 ) )
                    // InternalCloneDetectionDSL.g:1852:7: ( rule__CloneDetection__NotCompareAssignment_6 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getNotCompareAssignment_6()); 
                    }
                    // InternalCloneDetectionDSL.g:1853:7: ( rule__CloneDetection__NotCompareAssignment_6 )
                    // InternalCloneDetectionDSL.g:1853:8: rule__CloneDetection__NotCompareAssignment_6
                    {
                    pushFollow(FOLLOW_17);
                    rule__CloneDetection__NotCompareAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCloneDetectionAccess().getNotCompareAssignment_6()); 
                    }

                    }

                    // InternalCloneDetectionDSL.g:1856:6: ( ( ( rule__CloneDetection__NotCompareAssignment_6 )=> rule__CloneDetection__NotCompareAssignment_6 )* )
                    // InternalCloneDetectionDSL.g:1857:7: ( ( rule__CloneDetection__NotCompareAssignment_6 )=> rule__CloneDetection__NotCompareAssignment_6 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getNotCompareAssignment_6()); 
                    }
                    // InternalCloneDetectionDSL.g:1858:7: ( ( rule__CloneDetection__NotCompareAssignment_6 )=> rule__CloneDetection__NotCompareAssignment_6 )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==39) ) {
                            int LA15_2 = input.LA(2);

                            if ( (LA15_2==RULE_ID) ) {
                                int LA15_3 = input.LA(3);

                                if ( (synpred2_InternalCloneDetectionDSL()) ) {
                                    alt15=1;
                                }


                            }
                            else if ( (LA15_2==11) ) {
                                int LA15_4 = input.LA(3);

                                if ( (synpred2_InternalCloneDetectionDSL()) ) {
                                    alt15=1;
                                }


                            }


                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalCloneDetectionDSL.g:1858:8: ( rule__CloneDetection__NotCompareAssignment_6 )=> rule__CloneDetection__NotCompareAssignment_6
                    	    {
                    	    pushFollow(FOLLOW_17);
                    	    rule__CloneDetection__NotCompareAssignment_6();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCloneDetectionAccess().getNotCompareAssignment_6()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalCloneDetectionDSL.g:1864:3: ({...}? => ( ( ( ( rule__CloneDetection__CompareAssignment_7 ) ) ( ( ( rule__CloneDetection__CompareAssignment_7 )=> rule__CloneDetection__CompareAssignment_7 )* ) ) ) )
                    {
                    // InternalCloneDetectionDSL.g:1864:3: ({...}? => ( ( ( ( rule__CloneDetection__CompareAssignment_7 ) ) ( ( ( rule__CloneDetection__CompareAssignment_7 )=> rule__CloneDetection__CompareAssignment_7 )* ) ) ) )
                    // InternalCloneDetectionDSL.g:1865:4: {...}? => ( ( ( ( rule__CloneDetection__CompareAssignment_7 ) ) ( ( ( rule__CloneDetection__CompareAssignment_7 )=> rule__CloneDetection__CompareAssignment_7 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 7) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__CloneDetection__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 7)");
                    }
                    // InternalCloneDetectionDSL.g:1865:108: ( ( ( ( rule__CloneDetection__CompareAssignment_7 ) ) ( ( ( rule__CloneDetection__CompareAssignment_7 )=> rule__CloneDetection__CompareAssignment_7 )* ) ) )
                    // InternalCloneDetectionDSL.g:1866:5: ( ( ( rule__CloneDetection__CompareAssignment_7 ) ) ( ( ( rule__CloneDetection__CompareAssignment_7 )=> rule__CloneDetection__CompareAssignment_7 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 7);
                    selected = true;
                    // InternalCloneDetectionDSL.g:1872:5: ( ( ( rule__CloneDetection__CompareAssignment_7 ) ) ( ( ( rule__CloneDetection__CompareAssignment_7 )=> rule__CloneDetection__CompareAssignment_7 )* ) )
                    // InternalCloneDetectionDSL.g:1873:6: ( ( rule__CloneDetection__CompareAssignment_7 ) ) ( ( ( rule__CloneDetection__CompareAssignment_7 )=> rule__CloneDetection__CompareAssignment_7 )* )
                    {
                    // InternalCloneDetectionDSL.g:1873:6: ( ( rule__CloneDetection__CompareAssignment_7 ) )
                    // InternalCloneDetectionDSL.g:1874:7: ( rule__CloneDetection__CompareAssignment_7 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getCompareAssignment_7()); 
                    }
                    // InternalCloneDetectionDSL.g:1875:7: ( rule__CloneDetection__CompareAssignment_7 )
                    // InternalCloneDetectionDSL.g:1875:8: rule__CloneDetection__CompareAssignment_7
                    {
                    pushFollow(FOLLOW_18);
                    rule__CloneDetection__CompareAssignment_7();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCloneDetectionAccess().getCompareAssignment_7()); 
                    }

                    }

                    // InternalCloneDetectionDSL.g:1878:6: ( ( ( rule__CloneDetection__CompareAssignment_7 )=> rule__CloneDetection__CompareAssignment_7 )* )
                    // InternalCloneDetectionDSL.g:1879:7: ( ( rule__CloneDetection__CompareAssignment_7 )=> rule__CloneDetection__CompareAssignment_7 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCloneDetectionAccess().getCompareAssignment_7()); 
                    }
                    // InternalCloneDetectionDSL.g:1880:7: ( ( rule__CloneDetection__CompareAssignment_7 )=> rule__CloneDetection__CompareAssignment_7 )*
                    loop16:
                    do {
                        int alt16=2;
                        alt16 = dfa16.predict(input);
                        switch (alt16) {
                    	case 1 :
                    	    // InternalCloneDetectionDSL.g:1880:8: ( rule__CloneDetection__CompareAssignment_7 )=> rule__CloneDetection__CompareAssignment_7
                    	    {
                    	    pushFollow(FOLLOW_18);
                    	    rule__CloneDetection__CompareAssignment_7();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCloneDetectionAccess().getCompareAssignment_7()); 
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
    // InternalCloneDetectionDSL.g:1894:1: rule__CloneDetection__UnorderedGroup__0 : rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__1 )? ;
    public final void rule__CloneDetection__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1898:1: ( rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__1 )? )
            // InternalCloneDetectionDSL.g:1899:2: rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_19);
            rule__CloneDetection__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalCloneDetectionDSL.g:1900:2: ( rule__CloneDetection__UnorderedGroup__1 )?
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1900:2: rule__CloneDetection__UnorderedGroup__1
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
    // InternalCloneDetectionDSL.g:1906:1: rule__CloneDetection__UnorderedGroup__1 : rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__2 )? ;
    public final void rule__CloneDetection__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1910:1: ( rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__2 )? )
            // InternalCloneDetectionDSL.g:1911:2: rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_19);
            rule__CloneDetection__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalCloneDetectionDSL.g:1912:2: ( rule__CloneDetection__UnorderedGroup__2 )?
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1912:2: rule__CloneDetection__UnorderedGroup__2
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
    // InternalCloneDetectionDSL.g:1918:1: rule__CloneDetection__UnorderedGroup__2 : rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__3 )? ;
    public final void rule__CloneDetection__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1922:1: ( rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__3 )? )
            // InternalCloneDetectionDSL.g:1923:2: rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__3 )?
            {
            pushFollow(FOLLOW_19);
            rule__CloneDetection__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalCloneDetectionDSL.g:1924:2: ( rule__CloneDetection__UnorderedGroup__3 )?
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1924:2: rule__CloneDetection__UnorderedGroup__3
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
    // InternalCloneDetectionDSL.g:1930:1: rule__CloneDetection__UnorderedGroup__3 : rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__4 )? ;
    public final void rule__CloneDetection__UnorderedGroup__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1934:1: ( rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__4 )? )
            // InternalCloneDetectionDSL.g:1935:2: rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__4 )?
            {
            pushFollow(FOLLOW_19);
            rule__CloneDetection__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalCloneDetectionDSL.g:1936:2: ( rule__CloneDetection__UnorderedGroup__4 )?
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1936:2: rule__CloneDetection__UnorderedGroup__4
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
    // InternalCloneDetectionDSL.g:1942:1: rule__CloneDetection__UnorderedGroup__4 : rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__5 )? ;
    public final void rule__CloneDetection__UnorderedGroup__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1946:1: ( rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__5 )? )
            // InternalCloneDetectionDSL.g:1947:2: rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__5 )?
            {
            pushFollow(FOLLOW_19);
            rule__CloneDetection__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalCloneDetectionDSL.g:1948:2: ( rule__CloneDetection__UnorderedGroup__5 )?
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1948:2: rule__CloneDetection__UnorderedGroup__5
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
    // InternalCloneDetectionDSL.g:1954:1: rule__CloneDetection__UnorderedGroup__5 : rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__6 )? ;
    public final void rule__CloneDetection__UnorderedGroup__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1958:1: ( rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__6 )? )
            // InternalCloneDetectionDSL.g:1959:2: rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__6 )?
            {
            pushFollow(FOLLOW_19);
            rule__CloneDetection__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalCloneDetectionDSL.g:1960:2: ( rule__CloneDetection__UnorderedGroup__6 )?
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1960:2: rule__CloneDetection__UnorderedGroup__6
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
    // InternalCloneDetectionDSL.g:1966:1: rule__CloneDetection__UnorderedGroup__6 : rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__7 )? ;
    public final void rule__CloneDetection__UnorderedGroup__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1970:1: ( rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__7 )? )
            // InternalCloneDetectionDSL.g:1971:2: rule__CloneDetection__UnorderedGroup__Impl ( rule__CloneDetection__UnorderedGroup__7 )?
            {
            pushFollow(FOLLOW_19);
            rule__CloneDetection__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalCloneDetectionDSL.g:1972:2: ( rule__CloneDetection__UnorderedGroup__7 )?
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1972:2: rule__CloneDetection__UnorderedGroup__7
                    {
                    pushFollow(FOLLOW_2);
                    rule__CloneDetection__UnorderedGroup__7();

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
    // $ANTLR end "rule__CloneDetection__UnorderedGroup__6"


    // $ANTLR start "rule__CloneDetection__UnorderedGroup__7"
    // InternalCloneDetectionDSL.g:1978:1: rule__CloneDetection__UnorderedGroup__7 : rule__CloneDetection__UnorderedGroup__Impl ;
    public final void rule__CloneDetection__UnorderedGroup__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1982:1: ( rule__CloneDetection__UnorderedGroup__Impl )
            // InternalCloneDetectionDSL.g:1983:2: rule__CloneDetection__UnorderedGroup__Impl
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
    // $ANTLR end "rule__CloneDetection__UnorderedGroup__7"


    // $ANTLR start "rule__CloneDetection__ProjectAssignment_0"
    // InternalCloneDetectionDSL.g:1990:1: rule__CloneDetection__ProjectAssignment_0 : ( ruleProject ) ;
    public final void rule__CloneDetection__ProjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:1994:1: ( ( ruleProject ) )
            // InternalCloneDetectionDSL.g:1995:2: ( ruleProject )
            {
            // InternalCloneDetectionDSL.g:1995:2: ( ruleProject )
            // InternalCloneDetectionDSL.g:1996:3: ruleProject
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
    // InternalCloneDetectionDSL.g:2005:1: rule__CloneDetection__RootAssignment_1 : ( ruleSearchRoot ) ;
    public final void rule__CloneDetection__RootAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2009:1: ( ( ruleSearchRoot ) )
            // InternalCloneDetectionDSL.g:2010:2: ( ruleSearchRoot )
            {
            // InternalCloneDetectionDSL.g:2010:2: ( ruleSearchRoot )
            // InternalCloneDetectionDSL.g:2011:3: ruleSearchRoot
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
    // InternalCloneDetectionDSL.g:2020:1: rule__CloneDetection__MatchAssignment_2 : ( ruleMatch ) ;
    public final void rule__CloneDetection__MatchAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2024:1: ( ( ruleMatch ) )
            // InternalCloneDetectionDSL.g:2025:2: ( ruleMatch )
            {
            // InternalCloneDetectionDSL.g:2025:2: ( ruleMatch )
            // InternalCloneDetectionDSL.g:2026:3: ruleMatch
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
    // InternalCloneDetectionDSL.g:2035:1: rule__CloneDetection__ExcludeAssignment_3 : ( ruleExclude ) ;
    public final void rule__CloneDetection__ExcludeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2039:1: ( ( ruleExclude ) )
            // InternalCloneDetectionDSL.g:2040:2: ( ruleExclude )
            {
            // InternalCloneDetectionDSL.g:2040:2: ( ruleExclude )
            // InternalCloneDetectionDSL.g:2041:3: ruleExclude
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
    // InternalCloneDetectionDSL.g:2050:1: rule__CloneDetection__SizeAssignment_4 : ( ruleSize ) ;
    public final void rule__CloneDetection__SizeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2054:1: ( ( ruleSize ) )
            // InternalCloneDetectionDSL.g:2055:2: ( ruleSize )
            {
            // InternalCloneDetectionDSL.g:2055:2: ( ruleSize )
            // InternalCloneDetectionDSL.g:2056:3: ruleSize
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


    // $ANTLR start "rule__CloneDetection__PathsAssignment_5"
    // InternalCloneDetectionDSL.g:2065:1: rule__CloneDetection__PathsAssignment_5 : ( ruleLibraryPath ) ;
    public final void rule__CloneDetection__PathsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2069:1: ( ( ruleLibraryPath ) )
            // InternalCloneDetectionDSL.g:2070:2: ( ruleLibraryPath )
            {
            // InternalCloneDetectionDSL.g:2070:2: ( ruleLibraryPath )
            // InternalCloneDetectionDSL.g:2071:3: ruleLibraryPath
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCloneDetectionAccess().getPathsLibraryPathParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLibraryPath();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCloneDetectionAccess().getPathsLibraryPathParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloneDetection__PathsAssignment_5"


    // $ANTLR start "rule__CloneDetection__NotCompareAssignment_6"
    // InternalCloneDetectionDSL.g:2080:1: rule__CloneDetection__NotCompareAssignment_6 : ( ruleDoNotCompare ) ;
    public final void rule__CloneDetection__NotCompareAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2084:1: ( ( ruleDoNotCompare ) )
            // InternalCloneDetectionDSL.g:2085:2: ( ruleDoNotCompare )
            {
            // InternalCloneDetectionDSL.g:2085:2: ( ruleDoNotCompare )
            // InternalCloneDetectionDSL.g:2086:3: ruleDoNotCompare
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCloneDetectionAccess().getNotCompareDoNotCompareParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDoNotCompare();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCloneDetectionAccess().getNotCompareDoNotCompareParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloneDetection__NotCompareAssignment_6"


    // $ANTLR start "rule__CloneDetection__CompareAssignment_7"
    // InternalCloneDetectionDSL.g:2095:1: rule__CloneDetection__CompareAssignment_7 : ( ruleCompare ) ;
    public final void rule__CloneDetection__CompareAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2099:1: ( ( ruleCompare ) )
            // InternalCloneDetectionDSL.g:2100:2: ( ruleCompare )
            {
            // InternalCloneDetectionDSL.g:2100:2: ( ruleCompare )
            // InternalCloneDetectionDSL.g:2101:3: ruleCompare
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCloneDetectionAccess().getCompareCompareParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCompare();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCloneDetectionAccess().getCompareCompareParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloneDetection__CompareAssignment_7"


    // $ANTLR start "rule__Project__PathAssignment_1"
    // InternalCloneDetectionDSL.g:2110:1: rule__Project__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Project__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2114:1: ( ( RULE_STRING ) )
            // InternalCloneDetectionDSL.g:2115:2: ( RULE_STRING )
            {
            // InternalCloneDetectionDSL.g:2115:2: ( RULE_STRING )
            // InternalCloneDetectionDSL.g:2116:3: RULE_STRING
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


    // $ANTLR start "rule__LibraryPath__PathAssignment_1"
    // InternalCloneDetectionDSL.g:2125:1: rule__LibraryPath__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__LibraryPath__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2129:1: ( ( RULE_STRING ) )
            // InternalCloneDetectionDSL.g:2130:2: ( RULE_STRING )
            {
            // InternalCloneDetectionDSL.g:2130:2: ( RULE_STRING )
            // InternalCloneDetectionDSL.g:2131:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLibraryPathAccess().getPathSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLibraryPathAccess().getPathSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryPath__PathAssignment_1"


    // $ANTLR start "rule__SearchRoot__NodesAssignment_1"
    // InternalCloneDetectionDSL.g:2140:1: rule__SearchRoot__NodesAssignment_1 : ( ruleNodes ) ;
    public final void rule__SearchRoot__NodesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2144:1: ( ( ruleNodes ) )
            // InternalCloneDetectionDSL.g:2145:2: ( ruleNodes )
            {
            // InternalCloneDetectionDSL.g:2145:2: ( ruleNodes )
            // InternalCloneDetectionDSL.g:2146:3: ruleNodes
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
    // InternalCloneDetectionDSL.g:2155:1: rule__Match__TargetAssignment_1 : ( ruleMatchTarget ) ;
    public final void rule__Match__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2159:1: ( ( ruleMatchTarget ) )
            // InternalCloneDetectionDSL.g:2160:2: ( ruleMatchTarget )
            {
            // InternalCloneDetectionDSL.g:2160:2: ( ruleMatchTarget )
            // InternalCloneDetectionDSL.g:2161:3: ruleMatchTarget
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
    // InternalCloneDetectionDSL.g:2170:1: rule__Node__NameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2174:1: ( ( RULE_ID ) )
            // InternalCloneDetectionDSL.g:2175:2: ( RULE_ID )
            {
            // InternalCloneDetectionDSL.g:2175:2: ( RULE_ID )
            // InternalCloneDetectionDSL.g:2176:3: RULE_ID
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
    // InternalCloneDetectionDSL.g:2185:1: rule__Node__UnderAssignment_1_0 : ( ruleUnder ) ;
    public final void rule__Node__UnderAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2189:1: ( ( ruleUnder ) )
            // InternalCloneDetectionDSL.g:2190:2: ( ruleUnder )
            {
            // InternalCloneDetectionDSL.g:2190:2: ( ruleUnder )
            // InternalCloneDetectionDSL.g:2191:3: ruleUnder
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
    // InternalCloneDetectionDSL.g:2200:1: rule__Node__NodeAssignment_1_1 : ( ruleNode ) ;
    public final void rule__Node__NodeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2204:1: ( ( ruleNode ) )
            // InternalCloneDetectionDSL.g:2205:2: ( ruleNode )
            {
            // InternalCloneDetectionDSL.g:2205:2: ( ruleNode )
            // InternalCloneDetectionDSL.g:2206:3: ruleNode
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
    // InternalCloneDetectionDSL.g:2215:1: rule__Nodes__NodeAssignment_0 : ( ruleNode ) ;
    public final void rule__Nodes__NodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2219:1: ( ( ruleNode ) )
            // InternalCloneDetectionDSL.g:2220:2: ( ruleNode )
            {
            // InternalCloneDetectionDSL.g:2220:2: ( ruleNode )
            // InternalCloneDetectionDSL.g:2221:3: ruleNode
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
    // InternalCloneDetectionDSL.g:2230:1: rule__Nodes__NodesAssignment_1_1 : ( ruleNodes ) ;
    public final void rule__Nodes__NodesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2234:1: ( ( ruleNodes ) )
            // InternalCloneDetectionDSL.g:2235:2: ( ruleNodes )
            {
            // InternalCloneDetectionDSL.g:2235:2: ( ruleNodes )
            // InternalCloneDetectionDSL.g:2236:3: ruleNodes
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
    // InternalCloneDetectionDSL.g:2245:1: rule__MinSize__ExprAssignment_0_0 : ( ruleMetricExpr ) ;
    public final void rule__MinSize__ExprAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2249:1: ( ( ruleMetricExpr ) )
            // InternalCloneDetectionDSL.g:2250:2: ( ruleMetricExpr )
            {
            // InternalCloneDetectionDSL.g:2250:2: ( ruleMetricExpr )
            // InternalCloneDetectionDSL.g:2251:3: ruleMetricExpr
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
    // InternalCloneDetectionDSL.g:2260:1: rule__MinSize__BracketsAssignment_0_1_1 : ( ruleMinSize ) ;
    public final void rule__MinSize__BracketsAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2264:1: ( ( ruleMinSize ) )
            // InternalCloneDetectionDSL.g:2265:2: ( ruleMinSize )
            {
            // InternalCloneDetectionDSL.g:2265:2: ( ruleMinSize )
            // InternalCloneDetectionDSL.g:2266:3: ruleMinSize
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
    // InternalCloneDetectionDSL.g:2275:1: rule__MinSize__OperatorAssignment_1_0 : ( ruleBoolOperator ) ;
    public final void rule__MinSize__OperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2279:1: ( ( ruleBoolOperator ) )
            // InternalCloneDetectionDSL.g:2280:2: ( ruleBoolOperator )
            {
            // InternalCloneDetectionDSL.g:2280:2: ( ruleBoolOperator )
            // InternalCloneDetectionDSL.g:2281:3: ruleBoolOperator
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
    // InternalCloneDetectionDSL.g:2290:1: rule__MinSize__SizeAssignment_1_1 : ( ruleMinSize ) ;
    public final void rule__MinSize__SizeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2294:1: ( ( ruleMinSize ) )
            // InternalCloneDetectionDSL.g:2295:2: ( ruleMinSize )
            {
            // InternalCloneDetectionDSL.g:2295:2: ( ruleMinSize )
            // InternalCloneDetectionDSL.g:2296:3: ruleMinSize
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
    // InternalCloneDetectionDSL.g:2305:1: rule__MetricExpr__AmountAssignment_0 : ( RULE_INT ) ;
    public final void rule__MetricExpr__AmountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2309:1: ( ( RULE_INT ) )
            // InternalCloneDetectionDSL.g:2310:2: ( RULE_INT )
            {
            // InternalCloneDetectionDSL.g:2310:2: ( RULE_INT )
            // InternalCloneDetectionDSL.g:2311:3: RULE_INT
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
    // InternalCloneDetectionDSL.g:2320:1: rule__MetricExpr__MetricAssignment_1 : ( ruleSizeMetric ) ;
    public final void rule__MetricExpr__MetricAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2324:1: ( ( ruleSizeMetric ) )
            // InternalCloneDetectionDSL.g:2325:2: ( ruleSizeMetric )
            {
            // InternalCloneDetectionDSL.g:2325:2: ( ruleSizeMetric )
            // InternalCloneDetectionDSL.g:2326:3: ruleSizeMetric
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
    // InternalCloneDetectionDSL.g:2335:1: rule__Compare__NodesAssignment_1 : ( ruleNodes ) ;
    public final void rule__Compare__NodesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2339:1: ( ( ruleNodes ) )
            // InternalCloneDetectionDSL.g:2340:2: ( ruleNodes )
            {
            // InternalCloneDetectionDSL.g:2340:2: ( ruleNodes )
            // InternalCloneDetectionDSL.g:2341:3: ruleNodes
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
    // InternalCloneDetectionDSL.g:2350:1: rule__Compare__ComparisonMethodAssignment_2 : ( ruleMethod ) ;
    public final void rule__Compare__ComparisonMethodAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2354:1: ( ( ruleMethod ) )
            // InternalCloneDetectionDSL.g:2355:2: ( ruleMethod )
            {
            // InternalCloneDetectionDSL.g:2355:2: ( ruleMethod )
            // InternalCloneDetectionDSL.g:2356:3: ruleMethod
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
    // InternalCloneDetectionDSL.g:2365:1: rule__Compare__DeepestNodeAssignment_3 : ( ruleNode ) ;
    public final void rule__Compare__DeepestNodeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2369:1: ( ( ruleNode ) )
            // InternalCloneDetectionDSL.g:2370:2: ( ruleNode )
            {
            // InternalCloneDetectionDSL.g:2370:2: ( ruleNode )
            // InternalCloneDetectionDSL.g:2371:3: ruleNode
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
    // InternalCloneDetectionDSL.g:2380:1: rule__Compare__PercAssignment_4 : ( rulePercentage ) ;
    public final void rule__Compare__PercAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCloneDetectionDSL.g:2384:1: ( ( rulePercentage ) )
            // InternalCloneDetectionDSL.g:2385:2: ( rulePercentage )
            {
            // InternalCloneDetectionDSL.g:2385:2: ( rulePercentage )
            // InternalCloneDetectionDSL.g:2386:3: rulePercentage
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
        // InternalCloneDetectionDSL.g:1836:8: ( rule__CloneDetection__PathsAssignment_5 )
        // InternalCloneDetectionDSL.g:1836:9: rule__CloneDetection__PathsAssignment_5
        {
        pushFollow(FOLLOW_2);
        rule__CloneDetection__PathsAssignment_5();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalCloneDetectionDSL

    // $ANTLR start synpred2_InternalCloneDetectionDSL
    public final void synpred2_InternalCloneDetectionDSL_fragment() throws RecognitionException {   
        // InternalCloneDetectionDSL.g:1858:8: ( rule__CloneDetection__NotCompareAssignment_6 )
        // InternalCloneDetectionDSL.g:1858:9: rule__CloneDetection__NotCompareAssignment_6
        {
        pushFollow(FOLLOW_2);
        rule__CloneDetection__NotCompareAssignment_6();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalCloneDetectionDSL

    // $ANTLR start synpred3_InternalCloneDetectionDSL
    public final void synpred3_InternalCloneDetectionDSL_fragment() throws RecognitionException {   
        // InternalCloneDetectionDSL.g:1880:8: ( rule__CloneDetection__CompareAssignment_7 )
        // InternalCloneDetectionDSL.g:1880:9: rule__CloneDetection__CompareAssignment_7
        {
        pushFollow(FOLLOW_2);
        rule__CloneDetection__CompareAssignment_7();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalCloneDetectionDSL

    // Delegated rules

    public final boolean synpred3_InternalCloneDetectionDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalCloneDetectionDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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


    protected DFA16 dfa16 = new DFA16(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\1\12\uffff";
    static final String dfa_3s = "\1\35\7\uffff\1\0\2\uffff";
    static final String dfa_4s = "\1\50\7\uffff\1\0\2\uffff";
    static final String dfa_5s = "\1\uffff\1\2\10\uffff\1\1";
    static final String dfa_6s = "\10\uffff\1\0\2\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\uffff\4\1\1\uffff\1\1\2\uffff\1\1\1\10",
            "",
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

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 1880:7: ( ( rule__CloneDetection__CompareAssignment_7 )=> rule__CloneDetection__CompareAssignment_7 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_8 = input.LA(1);

                         
                        int index16_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalCloneDetectionDSL()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\1\11\11\uffff";
    static final String dfa_10s = "\1\35\11\uffff";
    static final String dfa_11s = "\1\50\11\uffff";
    static final String dfa_12s = "\1\uffff\10\1\1\2";
    static final String dfa_13s = "\1\0\11\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\1\uffff\1\6\1\2\1\3\1\4\1\uffff\1\5\2\uffff\1\7\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1900:2: ( rule__CloneDetection__UnorderedGroup__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_0 = input.LA(1);

                         
                        int index18_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA18_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA18_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA18_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA18_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA18_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA18_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA18_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA18_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( (LA18_0==EOF) ) {s = 9;}

                         
                        input.seek(index18_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1912:2: ( rule__CloneDetection__UnorderedGroup__2 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_0 = input.LA(1);

                         
                        int index19_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA19_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA19_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA19_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA19_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA19_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA19_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA19_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA19_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( (LA19_0==EOF) ) {s = 9;}

                         
                        input.seek(index19_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1924:2: ( rule__CloneDetection__UnorderedGroup__3 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_0 = input.LA(1);

                         
                        int index20_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA20_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA20_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA20_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA20_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA20_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA20_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA20_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA20_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( (LA20_0==EOF) ) {s = 9;}

                         
                        input.seek(index20_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1936:2: ( rule__CloneDetection__UnorderedGroup__4 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_0 = input.LA(1);

                         
                        int index21_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA21_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA21_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA21_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA21_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA21_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA21_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA21_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA21_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( (LA21_0==EOF) ) {s = 9;}

                         
                        input.seek(index21_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1948:2: ( rule__CloneDetection__UnorderedGroup__5 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_0 = input.LA(1);

                         
                        int index22_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA22_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA22_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA22_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA22_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA22_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA22_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA22_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA22_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( (LA22_0==EOF) ) {s = 9;}

                         
                        input.seek(index22_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1960:2: ( rule__CloneDetection__UnorderedGroup__6 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_0 = input.LA(1);

                         
                        int index23_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA23_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA23_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA23_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA23_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA23_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA23_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA23_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA23_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( (LA23_0==EOF) ) {s = 9;}

                         
                        input.seek(index23_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1972:2: ( rule__CloneDetection__UnorderedGroup__7 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_0 = input.LA(1);

                         
                        int index24_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA24_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA24_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA24_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA24_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA24_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA24_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA24_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA24_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( (LA24_0==EOF) ) {s = 9;}

                         
                        input.seek(index24_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000001F8000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000850L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000197A0000002L});

}
