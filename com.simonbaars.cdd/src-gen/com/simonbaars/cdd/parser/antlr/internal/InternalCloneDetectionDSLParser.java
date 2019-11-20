package com.simonbaars.cdd.parser.antlr.internal;

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
import com.simonbaars.cdd.services.CloneDetectionDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCloneDetectionDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Project'", "'FindInterProjectDuplicates'", "'LibraryPath'", "'SearchRoot'", "'Match'", "'Exclude'", "'*'", "','", "'Size'", "'('", "')'", "'DoNotCompare'", "'Compare'", "'%'", "'Subtree'", "'LLOC'", "'SLOC'", "'tokens'", "'declarations'", "'statements'", "'nodes'", "'lines'", "'cyclomatic_complexity'", "'&'", "'|'", "'Subnodes'", "'StringMatch'", "'CompleteMatch'", "'FQI'", "'->'", "'=>'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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

        public InternalCloneDetectionDSLParser(TokenStream input, CloneDetectionDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "CloneDetection";
       	}

       	@Override
       	protected CloneDetectionDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCloneDetection"
    // InternalCloneDetectionDSL.g:65:1: entryRuleCloneDetection returns [EObject current=null] : iv_ruleCloneDetection= ruleCloneDetection EOF ;
    public final EObject entryRuleCloneDetection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCloneDetection = null;


        try {
            // InternalCloneDetectionDSL.g:65:55: (iv_ruleCloneDetection= ruleCloneDetection EOF )
            // InternalCloneDetectionDSL.g:66:2: iv_ruleCloneDetection= ruleCloneDetection EOF
            {
             newCompositeNode(grammarAccess.getCloneDetectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCloneDetection=ruleCloneDetection();

            state._fsp--;

             current =iv_ruleCloneDetection; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCloneDetection"


    // $ANTLR start "ruleCloneDetection"
    // InternalCloneDetectionDSL.g:72:1: ruleCloneDetection returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_project_1_0= ruleProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= ruleSearchRoot ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_match_3_0= ruleMatch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exclude_4_0= ruleExclude ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_5_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_paths_6_0= ruleLibraryPath ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_notCompare_7_0= ruleDoNotCompare ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_compare_8_0= ruleCompare ) ) )+ ) ) )+ {...}?) ) ) ;
    public final EObject ruleCloneDetection() throws RecognitionException {
        EObject current = null;

        EObject lv_project_1_0 = null;

        EObject lv_root_2_0 = null;

        EObject lv_match_3_0 = null;

        EObject lv_exclude_4_0 = null;

        EObject lv_size_5_0 = null;

        EObject lv_paths_6_0 = null;

        EObject lv_notCompare_7_0 = null;

        EObject lv_compare_8_0 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:78:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_project_1_0= ruleProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= ruleSearchRoot ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_match_3_0= ruleMatch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exclude_4_0= ruleExclude ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_5_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_paths_6_0= ruleLibraryPath ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_notCompare_7_0= ruleDoNotCompare ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_compare_8_0= ruleCompare ) ) )+ ) ) )+ {...}?) ) ) )
            // InternalCloneDetectionDSL.g:79:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_project_1_0= ruleProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= ruleSearchRoot ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_match_3_0= ruleMatch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exclude_4_0= ruleExclude ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_5_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_paths_6_0= ruleLibraryPath ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_notCompare_7_0= ruleDoNotCompare ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_compare_8_0= ruleCompare ) ) )+ ) ) )+ {...}?) ) )
            {
            // InternalCloneDetectionDSL.g:79:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_project_1_0= ruleProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= ruleSearchRoot ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_match_3_0= ruleMatch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exclude_4_0= ruleExclude ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_5_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_paths_6_0= ruleLibraryPath ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_notCompare_7_0= ruleDoNotCompare ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_compare_8_0= ruleCompare ) ) )+ ) ) )+ {...}?) ) )
            // InternalCloneDetectionDSL.g:80:3: ( ( ( ({...}? => ( ({...}? => ( (lv_project_1_0= ruleProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= ruleSearchRoot ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_match_3_0= ruleMatch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exclude_4_0= ruleExclude ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_5_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_paths_6_0= ruleLibraryPath ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_notCompare_7_0= ruleDoNotCompare ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_compare_8_0= ruleCompare ) ) )+ ) ) )+ {...}?) )
            {
            // InternalCloneDetectionDSL.g:80:3: ( ( ( ({...}? => ( ({...}? => ( (lv_project_1_0= ruleProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= ruleSearchRoot ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_match_3_0= ruleMatch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exclude_4_0= ruleExclude ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_5_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_paths_6_0= ruleLibraryPath ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_notCompare_7_0= ruleDoNotCompare ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_compare_8_0= ruleCompare ) ) )+ ) ) )+ {...}?) )
            // InternalCloneDetectionDSL.g:81:4: ( ( ({...}? => ( ({...}? => ( (lv_project_1_0= ruleProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= ruleSearchRoot ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_match_3_0= ruleMatch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exclude_4_0= ruleExclude ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_5_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_paths_6_0= ruleLibraryPath ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_notCompare_7_0= ruleDoNotCompare ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_compare_8_0= ruleCompare ) ) )+ ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getCloneDetectionAccess().getUnorderedGroup());
            			
            // InternalCloneDetectionDSL.g:84:4: ( ( ({...}? => ( ({...}? => ( (lv_project_1_0= ruleProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= ruleSearchRoot ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_match_3_0= ruleMatch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exclude_4_0= ruleExclude ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_5_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_paths_6_0= ruleLibraryPath ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_notCompare_7_0= ruleDoNotCompare ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_compare_8_0= ruleCompare ) ) )+ ) ) )+ {...}?)
            // InternalCloneDetectionDSL.g:85:5: ( ({...}? => ( ({...}? => ( (lv_project_1_0= ruleProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= ruleSearchRoot ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_match_3_0= ruleMatch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exclude_4_0= ruleExclude ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_5_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_paths_6_0= ruleLibraryPath ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_notCompare_7_0= ruleDoNotCompare ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_compare_8_0= ruleCompare ) ) )+ ) ) )+ {...}?
            {
            // InternalCloneDetectionDSL.g:85:5: ( ({...}? => ( ({...}? => ( (lv_project_1_0= ruleProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= ruleSearchRoot ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_match_3_0= ruleMatch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exclude_4_0= ruleExclude ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_5_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_paths_6_0= ruleLibraryPath ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_notCompare_7_0= ruleDoNotCompare ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_compare_8_0= ruleCompare ) ) )+ ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=9;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // InternalCloneDetectionDSL.g:86:3: ({...}? => ( ({...}? => ( (lv_project_1_0= ruleProject ) ) ) ) )
            	    {
            	    // InternalCloneDetectionDSL.g:86:3: ({...}? => ( ({...}? => ( (lv_project_1_0= ruleProject ) ) ) ) )
            	    // InternalCloneDetectionDSL.g:87:4: {...}? => ( ({...}? => ( (lv_project_1_0= ruleProject ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleCloneDetection", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalCloneDetectionDSL.g:87:108: ( ({...}? => ( (lv_project_1_0= ruleProject ) ) ) )
            	    // InternalCloneDetectionDSL.g:88:5: ({...}? => ( (lv_project_1_0= ruleProject ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalCloneDetectionDSL.g:91:8: ({...}? => ( (lv_project_1_0= ruleProject ) ) )
            	    // InternalCloneDetectionDSL.g:91:9: {...}? => ( (lv_project_1_0= ruleProject ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCloneDetection", "true");
            	    }
            	    // InternalCloneDetectionDSL.g:91:18: ( (lv_project_1_0= ruleProject ) )
            	    // InternalCloneDetectionDSL.g:91:19: (lv_project_1_0= ruleProject )
            	    {
            	    // InternalCloneDetectionDSL.g:91:19: (lv_project_1_0= ruleProject )
            	    // InternalCloneDetectionDSL.g:92:9: lv_project_1_0= ruleProject
            	    {

            	    									newCompositeNode(grammarAccess.getCloneDetectionAccess().getProjectProjectParserRuleCall_0_0());
            	    								
            	    pushFollow(FOLLOW_3);
            	    lv_project_1_0=ruleProject();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getCloneDetectionRule());
            	    									}
            	    									set(
            	    										current,
            	    										"project",
            	    										lv_project_1_0,
            	    										"com.simonbaars.cdd.CloneDetectionDSL.Project");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCloneDetectionAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCloneDetectionDSL.g:114:3: ({...}? => ( ({...}? => ( (lv_root_2_0= ruleSearchRoot ) ) ) ) )
            	    {
            	    // InternalCloneDetectionDSL.g:114:3: ({...}? => ( ({...}? => ( (lv_root_2_0= ruleSearchRoot ) ) ) ) )
            	    // InternalCloneDetectionDSL.g:115:4: {...}? => ( ({...}? => ( (lv_root_2_0= ruleSearchRoot ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleCloneDetection", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalCloneDetectionDSL.g:115:108: ( ({...}? => ( (lv_root_2_0= ruleSearchRoot ) ) ) )
            	    // InternalCloneDetectionDSL.g:116:5: ({...}? => ( (lv_root_2_0= ruleSearchRoot ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalCloneDetectionDSL.g:119:8: ({...}? => ( (lv_root_2_0= ruleSearchRoot ) ) )
            	    // InternalCloneDetectionDSL.g:119:9: {...}? => ( (lv_root_2_0= ruleSearchRoot ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCloneDetection", "true");
            	    }
            	    // InternalCloneDetectionDSL.g:119:18: ( (lv_root_2_0= ruleSearchRoot ) )
            	    // InternalCloneDetectionDSL.g:119:19: (lv_root_2_0= ruleSearchRoot )
            	    {
            	    // InternalCloneDetectionDSL.g:119:19: (lv_root_2_0= ruleSearchRoot )
            	    // InternalCloneDetectionDSL.g:120:9: lv_root_2_0= ruleSearchRoot
            	    {

            	    									newCompositeNode(grammarAccess.getCloneDetectionAccess().getRootSearchRootParserRuleCall_1_0());
            	    								
            	    pushFollow(FOLLOW_3);
            	    lv_root_2_0=ruleSearchRoot();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getCloneDetectionRule());
            	    									}
            	    									set(
            	    										current,
            	    										"root",
            	    										true,
            	    										"com.simonbaars.cdd.CloneDetectionDSL.SearchRoot");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCloneDetectionAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalCloneDetectionDSL.g:142:3: ({...}? => ( ({...}? => ( (lv_match_3_0= ruleMatch ) ) ) ) )
            	    {
            	    // InternalCloneDetectionDSL.g:142:3: ({...}? => ( ({...}? => ( (lv_match_3_0= ruleMatch ) ) ) ) )
            	    // InternalCloneDetectionDSL.g:143:4: {...}? => ( ({...}? => ( (lv_match_3_0= ruleMatch ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleCloneDetection", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalCloneDetectionDSL.g:143:108: ( ({...}? => ( (lv_match_3_0= ruleMatch ) ) ) )
            	    // InternalCloneDetectionDSL.g:144:5: ({...}? => ( (lv_match_3_0= ruleMatch ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalCloneDetectionDSL.g:147:8: ({...}? => ( (lv_match_3_0= ruleMatch ) ) )
            	    // InternalCloneDetectionDSL.g:147:9: {...}? => ( (lv_match_3_0= ruleMatch ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCloneDetection", "true");
            	    }
            	    // InternalCloneDetectionDSL.g:147:18: ( (lv_match_3_0= ruleMatch ) )
            	    // InternalCloneDetectionDSL.g:147:19: (lv_match_3_0= ruleMatch )
            	    {
            	    // InternalCloneDetectionDSL.g:147:19: (lv_match_3_0= ruleMatch )
            	    // InternalCloneDetectionDSL.g:148:9: lv_match_3_0= ruleMatch
            	    {

            	    									newCompositeNode(grammarAccess.getCloneDetectionAccess().getMatchMatchParserRuleCall_2_0());
            	    								
            	    pushFollow(FOLLOW_3);
            	    lv_match_3_0=ruleMatch();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getCloneDetectionRule());
            	    									}
            	    									set(
            	    										current,
            	    										"match",
            	    										true,
            	    										"com.simonbaars.cdd.CloneDetectionDSL.Match");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCloneDetectionAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalCloneDetectionDSL.g:170:3: ({...}? => ( ({...}? => ( (lv_exclude_4_0= ruleExclude ) ) ) ) )
            	    {
            	    // InternalCloneDetectionDSL.g:170:3: ({...}? => ( ({...}? => ( (lv_exclude_4_0= ruleExclude ) ) ) ) )
            	    // InternalCloneDetectionDSL.g:171:4: {...}? => ( ({...}? => ( (lv_exclude_4_0= ruleExclude ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleCloneDetection", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalCloneDetectionDSL.g:171:108: ( ({...}? => ( (lv_exclude_4_0= ruleExclude ) ) ) )
            	    // InternalCloneDetectionDSL.g:172:5: ({...}? => ( (lv_exclude_4_0= ruleExclude ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalCloneDetectionDSL.g:175:8: ({...}? => ( (lv_exclude_4_0= ruleExclude ) ) )
            	    // InternalCloneDetectionDSL.g:175:9: {...}? => ( (lv_exclude_4_0= ruleExclude ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCloneDetection", "true");
            	    }
            	    // InternalCloneDetectionDSL.g:175:18: ( (lv_exclude_4_0= ruleExclude ) )
            	    // InternalCloneDetectionDSL.g:175:19: (lv_exclude_4_0= ruleExclude )
            	    {
            	    // InternalCloneDetectionDSL.g:175:19: (lv_exclude_4_0= ruleExclude )
            	    // InternalCloneDetectionDSL.g:176:9: lv_exclude_4_0= ruleExclude
            	    {

            	    									newCompositeNode(grammarAccess.getCloneDetectionAccess().getExcludeExcludeParserRuleCall_3_0());
            	    								
            	    pushFollow(FOLLOW_3);
            	    lv_exclude_4_0=ruleExclude();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getCloneDetectionRule());
            	    									}
            	    									set(
            	    										current,
            	    										"exclude",
            	    										true,
            	    										"com.simonbaars.cdd.CloneDetectionDSL.Exclude");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCloneDetectionAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalCloneDetectionDSL.g:198:3: ({...}? => ( ({...}? => ( (lv_size_5_0= ruleSize ) ) ) ) )
            	    {
            	    // InternalCloneDetectionDSL.g:198:3: ({...}? => ( ({...}? => ( (lv_size_5_0= ruleSize ) ) ) ) )
            	    // InternalCloneDetectionDSL.g:199:4: {...}? => ( ({...}? => ( (lv_size_5_0= ruleSize ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleCloneDetection", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalCloneDetectionDSL.g:199:108: ( ({...}? => ( (lv_size_5_0= ruleSize ) ) ) )
            	    // InternalCloneDetectionDSL.g:200:5: ({...}? => ( (lv_size_5_0= ruleSize ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalCloneDetectionDSL.g:203:8: ({...}? => ( (lv_size_5_0= ruleSize ) ) )
            	    // InternalCloneDetectionDSL.g:203:9: {...}? => ( (lv_size_5_0= ruleSize ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCloneDetection", "true");
            	    }
            	    // InternalCloneDetectionDSL.g:203:18: ( (lv_size_5_0= ruleSize ) )
            	    // InternalCloneDetectionDSL.g:203:19: (lv_size_5_0= ruleSize )
            	    {
            	    // InternalCloneDetectionDSL.g:203:19: (lv_size_5_0= ruleSize )
            	    // InternalCloneDetectionDSL.g:204:9: lv_size_5_0= ruleSize
            	    {

            	    									newCompositeNode(grammarAccess.getCloneDetectionAccess().getSizeSizeParserRuleCall_4_0());
            	    								
            	    pushFollow(FOLLOW_3);
            	    lv_size_5_0=ruleSize();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getCloneDetectionRule());
            	    									}
            	    									set(
            	    										current,
            	    										"size",
            	    										lv_size_5_0,
            	    										"com.simonbaars.cdd.CloneDetectionDSL.Size");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCloneDetectionAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalCloneDetectionDSL.g:226:3: ({...}? => ( ({...}? => ( (lv_paths_6_0= ruleLibraryPath ) ) )+ ) )
            	    {
            	    // InternalCloneDetectionDSL.g:226:3: ({...}? => ( ({...}? => ( (lv_paths_6_0= ruleLibraryPath ) ) )+ ) )
            	    // InternalCloneDetectionDSL.g:227:4: {...}? => ( ({...}? => ( (lv_paths_6_0= ruleLibraryPath ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleCloneDetection", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalCloneDetectionDSL.g:227:108: ( ({...}? => ( (lv_paths_6_0= ruleLibraryPath ) ) )+ )
            	    // InternalCloneDetectionDSL.g:228:5: ({...}? => ( (lv_paths_6_0= ruleLibraryPath ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalCloneDetectionDSL.g:231:8: ({...}? => ( (lv_paths_6_0= ruleLibraryPath ) ) )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==13) ) {
            	            int LA1_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt1=1;
            	            }


            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalCloneDetectionDSL.g:231:9: {...}? => ( (lv_paths_6_0= ruleLibraryPath ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleCloneDetection", "true");
            	    	    }
            	    	    // InternalCloneDetectionDSL.g:231:18: ( (lv_paths_6_0= ruleLibraryPath ) )
            	    	    // InternalCloneDetectionDSL.g:231:19: (lv_paths_6_0= ruleLibraryPath )
            	    	    {
            	    	    // InternalCloneDetectionDSL.g:231:19: (lv_paths_6_0= ruleLibraryPath )
            	    	    // InternalCloneDetectionDSL.g:232:9: lv_paths_6_0= ruleLibraryPath
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getCloneDetectionAccess().getPathsLibraryPathParserRuleCall_5_0());
            	    	    								
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_paths_6_0=ruleLibraryPath();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getCloneDetectionRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"paths",
            	    	    										lv_paths_6_0,
            	    	    										"com.simonbaars.cdd.CloneDetectionDSL.LibraryPath");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt1 >= 1 ) break loop1;
            	                EarlyExitException eee =
            	                    new EarlyExitException(1, input);
            	                throw eee;
            	        }
            	        cnt1++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCloneDetectionAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalCloneDetectionDSL.g:254:3: ({...}? => ( ({...}? => ( (lv_notCompare_7_0= ruleDoNotCompare ) ) )+ ) )
            	    {
            	    // InternalCloneDetectionDSL.g:254:3: ({...}? => ( ({...}? => ( (lv_notCompare_7_0= ruleDoNotCompare ) ) )+ ) )
            	    // InternalCloneDetectionDSL.g:255:4: {...}? => ( ({...}? => ( (lv_notCompare_7_0= ruleDoNotCompare ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleCloneDetection", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalCloneDetectionDSL.g:255:108: ( ({...}? => ( (lv_notCompare_7_0= ruleDoNotCompare ) ) )+ )
            	    // InternalCloneDetectionDSL.g:256:5: ({...}? => ( (lv_notCompare_7_0= ruleDoNotCompare ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalCloneDetectionDSL.g:259:8: ({...}? => ( (lv_notCompare_7_0= ruleDoNotCompare ) ) )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==22) ) {
            	            int LA2_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt2=1;
            	            }


            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalCloneDetectionDSL.g:259:9: {...}? => ( (lv_notCompare_7_0= ruleDoNotCompare ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleCloneDetection", "true");
            	    	    }
            	    	    // InternalCloneDetectionDSL.g:259:18: ( (lv_notCompare_7_0= ruleDoNotCompare ) )
            	    	    // InternalCloneDetectionDSL.g:259:19: (lv_notCompare_7_0= ruleDoNotCompare )
            	    	    {
            	    	    // InternalCloneDetectionDSL.g:259:19: (lv_notCompare_7_0= ruleDoNotCompare )
            	    	    // InternalCloneDetectionDSL.g:260:9: lv_notCompare_7_0= ruleDoNotCompare
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getCloneDetectionAccess().getNotCompareDoNotCompareParserRuleCall_6_0());
            	    	    								
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_notCompare_7_0=ruleDoNotCompare();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getCloneDetectionRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"notCompare",
            	    	    										lv_notCompare_7_0,
            	    	    										"com.simonbaars.cdd.CloneDetectionDSL.DoNotCompare");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt2 >= 1 ) break loop2;
            	                EarlyExitException eee =
            	                    new EarlyExitException(2, input);
            	                throw eee;
            	        }
            	        cnt2++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCloneDetectionAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalCloneDetectionDSL.g:282:3: ({...}? => ( ({...}? => ( (lv_compare_8_0= ruleCompare ) ) )+ ) )
            	    {
            	    // InternalCloneDetectionDSL.g:282:3: ({...}? => ( ({...}? => ( (lv_compare_8_0= ruleCompare ) ) )+ ) )
            	    // InternalCloneDetectionDSL.g:283:4: {...}? => ( ({...}? => ( (lv_compare_8_0= ruleCompare ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleCloneDetection", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalCloneDetectionDSL.g:283:108: ( ({...}? => ( (lv_compare_8_0= ruleCompare ) ) )+ )
            	    // InternalCloneDetectionDSL.g:284:5: ({...}? => ( (lv_compare_8_0= ruleCompare ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 7);
            	    				
            	    // InternalCloneDetectionDSL.g:287:8: ({...}? => ( (lv_compare_8_0= ruleCompare ) ) )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==23) ) {
            	            int LA3_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt3=1;
            	            }


            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalCloneDetectionDSL.g:287:9: {...}? => ( (lv_compare_8_0= ruleCompare ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleCloneDetection", "true");
            	    	    }
            	    	    // InternalCloneDetectionDSL.g:287:18: ( (lv_compare_8_0= ruleCompare ) )
            	    	    // InternalCloneDetectionDSL.g:287:19: (lv_compare_8_0= ruleCompare )
            	    	    {
            	    	    // InternalCloneDetectionDSL.g:287:19: (lv_compare_8_0= ruleCompare )
            	    	    // InternalCloneDetectionDSL.g:288:9: lv_compare_8_0= ruleCompare
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getCloneDetectionAccess().getCompareCompareParserRuleCall_7_0());
            	    	    								
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_compare_8_0=ruleCompare();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getCloneDetectionRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"compare",
            	    	    										lv_compare_8_0,
            	    	    										"com.simonbaars.cdd.CloneDetectionDSL.Compare");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


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

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCloneDetectionAccess().getUnorderedGroup());
            	    				

            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getCloneDetectionAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleCloneDetection", "getUnorderedGroupHelper().canLeave(grammarAccess.getCloneDetectionAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getCloneDetectionAccess().getUnorderedGroup());
            			

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
    // $ANTLR end "ruleCloneDetection"


    // $ANTLR start "entryRuleProject"
    // InternalCloneDetectionDSL.g:321:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalCloneDetectionDSL.g:321:48: (iv_ruleProject= ruleProject EOF )
            // InternalCloneDetectionDSL.g:322:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalCloneDetectionDSL.g:328:1: ruleProject returns [EObject current=null] : (otherlv_0= 'Project' ( (lv_path_1_0= RULE_STRING ) ) (otherlv_2= 'FindInterProjectDuplicates' )? ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_path_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:334:2: ( (otherlv_0= 'Project' ( (lv_path_1_0= RULE_STRING ) ) (otherlv_2= 'FindInterProjectDuplicates' )? ) )
            // InternalCloneDetectionDSL.g:335:2: (otherlv_0= 'Project' ( (lv_path_1_0= RULE_STRING ) ) (otherlv_2= 'FindInterProjectDuplicates' )? )
            {
            // InternalCloneDetectionDSL.g:335:2: (otherlv_0= 'Project' ( (lv_path_1_0= RULE_STRING ) ) (otherlv_2= 'FindInterProjectDuplicates' )? )
            // InternalCloneDetectionDSL.g:336:3: otherlv_0= 'Project' ( (lv_path_1_0= RULE_STRING ) ) (otherlv_2= 'FindInterProjectDuplicates' )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectAccess().getProjectKeyword_0());
            		
            // InternalCloneDetectionDSL.g:340:3: ( (lv_path_1_0= RULE_STRING ) )
            // InternalCloneDetectionDSL.g:341:4: (lv_path_1_0= RULE_STRING )
            {
            // InternalCloneDetectionDSL.g:341:4: (lv_path_1_0= RULE_STRING )
            // InternalCloneDetectionDSL.g:342:5: lv_path_1_0= RULE_STRING
            {
            lv_path_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_path_1_0, grammarAccess.getProjectAccess().getPathSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalCloneDetectionDSL.g:358:3: (otherlv_2= 'FindInterProjectDuplicates' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCloneDetectionDSL.g:359:4: otherlv_2= 'FindInterProjectDuplicates'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getProjectAccess().getFindInterProjectDuplicatesKeyword_2());
                    			

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
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleLibraryPath"
    // InternalCloneDetectionDSL.g:368:1: entryRuleLibraryPath returns [EObject current=null] : iv_ruleLibraryPath= ruleLibraryPath EOF ;
    public final EObject entryRuleLibraryPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibraryPath = null;


        try {
            // InternalCloneDetectionDSL.g:368:52: (iv_ruleLibraryPath= ruleLibraryPath EOF )
            // InternalCloneDetectionDSL.g:369:2: iv_ruleLibraryPath= ruleLibraryPath EOF
            {
             newCompositeNode(grammarAccess.getLibraryPathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLibraryPath=ruleLibraryPath();

            state._fsp--;

             current =iv_ruleLibraryPath; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLibraryPath"


    // $ANTLR start "ruleLibraryPath"
    // InternalCloneDetectionDSL.g:375:1: ruleLibraryPath returns [EObject current=null] : (otherlv_0= 'LibraryPath' ( (lv_path_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleLibraryPath() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_path_1_0=null;


        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:381:2: ( (otherlv_0= 'LibraryPath' ( (lv_path_1_0= RULE_STRING ) ) ) )
            // InternalCloneDetectionDSL.g:382:2: (otherlv_0= 'LibraryPath' ( (lv_path_1_0= RULE_STRING ) ) )
            {
            // InternalCloneDetectionDSL.g:382:2: (otherlv_0= 'LibraryPath' ( (lv_path_1_0= RULE_STRING ) ) )
            // InternalCloneDetectionDSL.g:383:3: otherlv_0= 'LibraryPath' ( (lv_path_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLibraryPathAccess().getLibraryPathKeyword_0());
            		
            // InternalCloneDetectionDSL.g:387:3: ( (lv_path_1_0= RULE_STRING ) )
            // InternalCloneDetectionDSL.g:388:4: (lv_path_1_0= RULE_STRING )
            {
            // InternalCloneDetectionDSL.g:388:4: (lv_path_1_0= RULE_STRING )
            // InternalCloneDetectionDSL.g:389:5: lv_path_1_0= RULE_STRING
            {
            lv_path_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_path_1_0, grammarAccess.getLibraryPathAccess().getPathSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLibraryPathRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleLibraryPath"


    // $ANTLR start "entryRuleSearchRoot"
    // InternalCloneDetectionDSL.g:409:1: entryRuleSearchRoot returns [EObject current=null] : iv_ruleSearchRoot= ruleSearchRoot EOF ;
    public final EObject entryRuleSearchRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSearchRoot = null;


        try {
            // InternalCloneDetectionDSL.g:409:51: (iv_ruleSearchRoot= ruleSearchRoot EOF )
            // InternalCloneDetectionDSL.g:410:2: iv_ruleSearchRoot= ruleSearchRoot EOF
            {
             newCompositeNode(grammarAccess.getSearchRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSearchRoot=ruleSearchRoot();

            state._fsp--;

             current =iv_ruleSearchRoot; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSearchRoot"


    // $ANTLR start "ruleSearchRoot"
    // InternalCloneDetectionDSL.g:416:1: ruleSearchRoot returns [EObject current=null] : (otherlv_0= 'SearchRoot' ( (lv_nodes_1_0= ruleNodes ) ) ) ;
    public final EObject ruleSearchRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_nodes_1_0 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:422:2: ( (otherlv_0= 'SearchRoot' ( (lv_nodes_1_0= ruleNodes ) ) ) )
            // InternalCloneDetectionDSL.g:423:2: (otherlv_0= 'SearchRoot' ( (lv_nodes_1_0= ruleNodes ) ) )
            {
            // InternalCloneDetectionDSL.g:423:2: (otherlv_0= 'SearchRoot' ( (lv_nodes_1_0= ruleNodes ) ) )
            // InternalCloneDetectionDSL.g:424:3: otherlv_0= 'SearchRoot' ( (lv_nodes_1_0= ruleNodes ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSearchRootAccess().getSearchRootKeyword_0());
            		
            // InternalCloneDetectionDSL.g:428:3: ( (lv_nodes_1_0= ruleNodes ) )
            // InternalCloneDetectionDSL.g:429:4: (lv_nodes_1_0= ruleNodes )
            {
            // InternalCloneDetectionDSL.g:429:4: (lv_nodes_1_0= ruleNodes )
            // InternalCloneDetectionDSL.g:430:5: lv_nodes_1_0= ruleNodes
            {

            					newCompositeNode(grammarAccess.getSearchRootAccess().getNodesNodesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_nodes_1_0=ruleNodes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSearchRootRule());
            					}
            					set(
            						current,
            						"nodes",
            						lv_nodes_1_0,
            						"com.simonbaars.cdd.CloneDetectionDSL.Nodes");
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
    // $ANTLR end "ruleSearchRoot"


    // $ANTLR start "entryRuleMatch"
    // InternalCloneDetectionDSL.g:451:1: entryRuleMatch returns [EObject current=null] : iv_ruleMatch= ruleMatch EOF ;
    public final EObject entryRuleMatch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatch = null;


        try {
            // InternalCloneDetectionDSL.g:451:46: (iv_ruleMatch= ruleMatch EOF )
            // InternalCloneDetectionDSL.g:452:2: iv_ruleMatch= ruleMatch EOF
            {
             newCompositeNode(grammarAccess.getMatchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMatch=ruleMatch();

            state._fsp--;

             current =iv_ruleMatch; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMatch"


    // $ANTLR start "ruleMatch"
    // InternalCloneDetectionDSL.g:458:1: ruleMatch returns [EObject current=null] : (otherlv_0= 'Match' ( (lv_target_1_0= ruleMatchTarget ) ) ) ;
    public final EObject ruleMatch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_target_1_0 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:464:2: ( (otherlv_0= 'Match' ( (lv_target_1_0= ruleMatchTarget ) ) ) )
            // InternalCloneDetectionDSL.g:465:2: (otherlv_0= 'Match' ( (lv_target_1_0= ruleMatchTarget ) ) )
            {
            // InternalCloneDetectionDSL.g:465:2: (otherlv_0= 'Match' ( (lv_target_1_0= ruleMatchTarget ) ) )
            // InternalCloneDetectionDSL.g:466:3: otherlv_0= 'Match' ( (lv_target_1_0= ruleMatchTarget ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMatchAccess().getMatchKeyword_0());
            		
            // InternalCloneDetectionDSL.g:470:3: ( (lv_target_1_0= ruleMatchTarget ) )
            // InternalCloneDetectionDSL.g:471:4: (lv_target_1_0= ruleMatchTarget )
            {
            // InternalCloneDetectionDSL.g:471:4: (lv_target_1_0= ruleMatchTarget )
            // InternalCloneDetectionDSL.g:472:5: lv_target_1_0= ruleMatchTarget
            {

            					newCompositeNode(grammarAccess.getMatchAccess().getTargetMatchTargetEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_target_1_0=ruleMatchTarget();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMatchRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_1_0,
            						"com.simonbaars.cdd.CloneDetectionDSL.MatchTarget");
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
    // $ANTLR end "ruleMatch"


    // $ANTLR start "entryRuleExclude"
    // InternalCloneDetectionDSL.g:493:1: entryRuleExclude returns [EObject current=null] : iv_ruleExclude= ruleExclude EOF ;
    public final EObject entryRuleExclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExclude = null;


        try {
            // InternalCloneDetectionDSL.g:493:48: (iv_ruleExclude= ruleExclude EOF )
            // InternalCloneDetectionDSL.g:494:2: iv_ruleExclude= ruleExclude EOF
            {
             newCompositeNode(grammarAccess.getExcludeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExclude=ruleExclude();

            state._fsp--;

             current =iv_ruleExclude; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExclude"


    // $ANTLR start "ruleExclude"
    // InternalCloneDetectionDSL.g:500:1: ruleExclude returns [EObject current=null] : (otherlv_0= 'Exclude' this_Nodes_1= ruleNodes ) ;
    public final EObject ruleExclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Nodes_1 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:506:2: ( (otherlv_0= 'Exclude' this_Nodes_1= ruleNodes ) )
            // InternalCloneDetectionDSL.g:507:2: (otherlv_0= 'Exclude' this_Nodes_1= ruleNodes )
            {
            // InternalCloneDetectionDSL.g:507:2: (otherlv_0= 'Exclude' this_Nodes_1= ruleNodes )
            // InternalCloneDetectionDSL.g:508:3: otherlv_0= 'Exclude' this_Nodes_1= ruleNodes
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExcludeAccess().getExcludeKeyword_0());
            		

            			newCompositeNode(grammarAccess.getExcludeAccess().getNodesParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Nodes_1=ruleNodes();

            state._fsp--;


            			current = this_Nodes_1;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleExclude"


    // $ANTLR start "entryRuleNode"
    // InternalCloneDetectionDSL.g:524:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalCloneDetectionDSL.g:524:45: (iv_ruleNode= ruleNode EOF )
            // InternalCloneDetectionDSL.g:525:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalCloneDetectionDSL.g:531:1: ruleNode returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) | otherlv_1= '*' ) ( ( (lv_under_2_0= ruleUnder ) ) ( (lv_node_3_0= ruleNode ) ) )? ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_under_2_0 = null;

        EObject lv_node_3_0 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:537:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) | otherlv_1= '*' ) ( ( (lv_under_2_0= ruleUnder ) ) ( (lv_node_3_0= ruleNode ) ) )? ) )
            // InternalCloneDetectionDSL.g:538:2: ( ( ( (lv_name_0_0= RULE_ID ) ) | otherlv_1= '*' ) ( ( (lv_under_2_0= ruleUnder ) ) ( (lv_node_3_0= ruleNode ) ) )? )
            {
            // InternalCloneDetectionDSL.g:538:2: ( ( ( (lv_name_0_0= RULE_ID ) ) | otherlv_1= '*' ) ( ( (lv_under_2_0= ruleUnder ) ) ( (lv_node_3_0= ruleNode ) ) )? )
            // InternalCloneDetectionDSL.g:539:3: ( ( (lv_name_0_0= RULE_ID ) ) | otherlv_1= '*' ) ( ( (lv_under_2_0= ruleUnder ) ) ( (lv_node_3_0= ruleNode ) ) )?
            {
            // InternalCloneDetectionDSL.g:539:3: ( ( (lv_name_0_0= RULE_ID ) ) | otherlv_1= '*' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCloneDetectionDSL.g:540:4: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // InternalCloneDetectionDSL.g:540:4: ( (lv_name_0_0= RULE_ID ) )
                    // InternalCloneDetectionDSL.g:541:5: (lv_name_0_0= RULE_ID )
                    {
                    // InternalCloneDetectionDSL.g:541:5: (lv_name_0_0= RULE_ID )
                    // InternalCloneDetectionDSL.g:542:6: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(lv_name_0_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_0_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:559:4: otherlv_1= '*'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getNodeAccess().getAsteriskKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalCloneDetectionDSL.g:564:3: ( ( (lv_under_2_0= ruleUnder ) ) ( (lv_node_3_0= ruleNode ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=40 && LA7_0<=41)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCloneDetectionDSL.g:565:4: ( (lv_under_2_0= ruleUnder ) ) ( (lv_node_3_0= ruleNode ) )
                    {
                    // InternalCloneDetectionDSL.g:565:4: ( (lv_under_2_0= ruleUnder ) )
                    // InternalCloneDetectionDSL.g:566:5: (lv_under_2_0= ruleUnder )
                    {
                    // InternalCloneDetectionDSL.g:566:5: (lv_under_2_0= ruleUnder )
                    // InternalCloneDetectionDSL.g:567:6: lv_under_2_0= ruleUnder
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getUnderUnderEnumRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_under_2_0=ruleUnder();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    						}
                    						set(
                    							current,
                    							"under",
                    							lv_under_2_0,
                    							"com.simonbaars.cdd.CloneDetectionDSL.Under");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCloneDetectionDSL.g:584:4: ( (lv_node_3_0= ruleNode ) )
                    // InternalCloneDetectionDSL.g:585:5: (lv_node_3_0= ruleNode )
                    {
                    // InternalCloneDetectionDSL.g:585:5: (lv_node_3_0= ruleNode )
                    // InternalCloneDetectionDSL.g:586:6: lv_node_3_0= ruleNode
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getNodeNodeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_node_3_0=ruleNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    						}
                    						set(
                    							current,
                    							"node",
                    							lv_node_3_0,
                    							"com.simonbaars.cdd.CloneDetectionDSL.Node");
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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleNodes"
    // InternalCloneDetectionDSL.g:608:1: entryRuleNodes returns [EObject current=null] : iv_ruleNodes= ruleNodes EOF ;
    public final EObject entryRuleNodes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodes = null;


        try {
            // InternalCloneDetectionDSL.g:608:46: (iv_ruleNodes= ruleNodes EOF )
            // InternalCloneDetectionDSL.g:609:2: iv_ruleNodes= ruleNodes EOF
            {
             newCompositeNode(grammarAccess.getNodesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodes=ruleNodes();

            state._fsp--;

             current =iv_ruleNodes; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNodes"


    // $ANTLR start "ruleNodes"
    // InternalCloneDetectionDSL.g:615:1: ruleNodes returns [EObject current=null] : ( ( (lv_node_0_0= ruleNode ) ) (otherlv_1= ',' ( (lv_nodes_2_0= ruleNodes ) ) )? ) ;
    public final EObject ruleNodes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_node_0_0 = null;

        EObject lv_nodes_2_0 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:621:2: ( ( ( (lv_node_0_0= ruleNode ) ) (otherlv_1= ',' ( (lv_nodes_2_0= ruleNodes ) ) )? ) )
            // InternalCloneDetectionDSL.g:622:2: ( ( (lv_node_0_0= ruleNode ) ) (otherlv_1= ',' ( (lv_nodes_2_0= ruleNodes ) ) )? )
            {
            // InternalCloneDetectionDSL.g:622:2: ( ( (lv_node_0_0= ruleNode ) ) (otherlv_1= ',' ( (lv_nodes_2_0= ruleNodes ) ) )? )
            // InternalCloneDetectionDSL.g:623:3: ( (lv_node_0_0= ruleNode ) ) (otherlv_1= ',' ( (lv_nodes_2_0= ruleNodes ) ) )?
            {
            // InternalCloneDetectionDSL.g:623:3: ( (lv_node_0_0= ruleNode ) )
            // InternalCloneDetectionDSL.g:624:4: (lv_node_0_0= ruleNode )
            {
            // InternalCloneDetectionDSL.g:624:4: (lv_node_0_0= ruleNode )
            // InternalCloneDetectionDSL.g:625:5: lv_node_0_0= ruleNode
            {

            					newCompositeNode(grammarAccess.getNodesAccess().getNodeNodeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_node_0_0=ruleNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodesRule());
            					}
            					set(
            						current,
            						"node",
            						lv_node_0_0,
            						"com.simonbaars.cdd.CloneDetectionDSL.Node");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCloneDetectionDSL.g:642:3: (otherlv_1= ',' ( (lv_nodes_2_0= ruleNodes ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCloneDetectionDSL.g:643:4: otherlv_1= ',' ( (lv_nodes_2_0= ruleNodes ) )
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getNodesAccess().getCommaKeyword_1_0());
                    			
                    // InternalCloneDetectionDSL.g:647:4: ( (lv_nodes_2_0= ruleNodes ) )
                    // InternalCloneDetectionDSL.g:648:5: (lv_nodes_2_0= ruleNodes )
                    {
                    // InternalCloneDetectionDSL.g:648:5: (lv_nodes_2_0= ruleNodes )
                    // InternalCloneDetectionDSL.g:649:6: lv_nodes_2_0= ruleNodes
                    {

                    						newCompositeNode(grammarAccess.getNodesAccess().getNodesNodesParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_nodes_2_0=ruleNodes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodesRule());
                    						}
                    						set(
                    							current,
                    							"nodes",
                    							lv_nodes_2_0,
                    							"com.simonbaars.cdd.CloneDetectionDSL.Nodes");
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
    // $ANTLR end "ruleNodes"


    // $ANTLR start "entryRuleSize"
    // InternalCloneDetectionDSL.g:671:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // InternalCloneDetectionDSL.g:671:45: (iv_ruleSize= ruleSize EOF )
            // InternalCloneDetectionDSL.g:672:2: iv_ruleSize= ruleSize EOF
            {
             newCompositeNode(grammarAccess.getSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSize=ruleSize();

            state._fsp--;

             current =iv_ruleSize; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSize"


    // $ANTLR start "ruleSize"
    // InternalCloneDetectionDSL.g:678:1: ruleSize returns [EObject current=null] : (otherlv_0= 'Size' this_MinSize_1= ruleMinSize ) ;
    public final EObject ruleSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_MinSize_1 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:684:2: ( (otherlv_0= 'Size' this_MinSize_1= ruleMinSize ) )
            // InternalCloneDetectionDSL.g:685:2: (otherlv_0= 'Size' this_MinSize_1= ruleMinSize )
            {
            // InternalCloneDetectionDSL.g:685:2: (otherlv_0= 'Size' this_MinSize_1= ruleMinSize )
            // InternalCloneDetectionDSL.g:686:3: otherlv_0= 'Size' this_MinSize_1= ruleMinSize
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getSizeAccess().getSizeKeyword_0());
            		

            			newCompositeNode(grammarAccess.getSizeAccess().getMinSizeParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_MinSize_1=ruleMinSize();

            state._fsp--;


            			current = this_MinSize_1;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleSize"


    // $ANTLR start "entryRuleMinSize"
    // InternalCloneDetectionDSL.g:702:1: entryRuleMinSize returns [EObject current=null] : iv_ruleMinSize= ruleMinSize EOF ;
    public final EObject entryRuleMinSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinSize = null;


        try {
            // InternalCloneDetectionDSL.g:702:48: (iv_ruleMinSize= ruleMinSize EOF )
            // InternalCloneDetectionDSL.g:703:2: iv_ruleMinSize= ruleMinSize EOF
            {
             newCompositeNode(grammarAccess.getMinSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinSize=ruleMinSize();

            state._fsp--;

             current =iv_ruleMinSize; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMinSize"


    // $ANTLR start "ruleMinSize"
    // InternalCloneDetectionDSL.g:709:1: ruleMinSize returns [EObject current=null] : ( ( ( (lv_expr_0_0= ruleMetricExpr ) ) | (otherlv_1= '(' ( (lv_brackets_2_0= ruleMinSize ) ) otherlv_3= ')' ) ) ( ( (lv_operator_4_0= ruleBoolOperator ) ) ( (lv_size_5_0= ruleMinSize ) ) )? ) ;
    public final EObject ruleMinSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expr_0_0 = null;

        EObject lv_brackets_2_0 = null;

        Enumerator lv_operator_4_0 = null;

        EObject lv_size_5_0 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:715:2: ( ( ( ( (lv_expr_0_0= ruleMetricExpr ) ) | (otherlv_1= '(' ( (lv_brackets_2_0= ruleMinSize ) ) otherlv_3= ')' ) ) ( ( (lv_operator_4_0= ruleBoolOperator ) ) ( (lv_size_5_0= ruleMinSize ) ) )? ) )
            // InternalCloneDetectionDSL.g:716:2: ( ( ( (lv_expr_0_0= ruleMetricExpr ) ) | (otherlv_1= '(' ( (lv_brackets_2_0= ruleMinSize ) ) otherlv_3= ')' ) ) ( ( (lv_operator_4_0= ruleBoolOperator ) ) ( (lv_size_5_0= ruleMinSize ) ) )? )
            {
            // InternalCloneDetectionDSL.g:716:2: ( ( ( (lv_expr_0_0= ruleMetricExpr ) ) | (otherlv_1= '(' ( (lv_brackets_2_0= ruleMinSize ) ) otherlv_3= ')' ) ) ( ( (lv_operator_4_0= ruleBoolOperator ) ) ( (lv_size_5_0= ruleMinSize ) ) )? )
            // InternalCloneDetectionDSL.g:717:3: ( ( (lv_expr_0_0= ruleMetricExpr ) ) | (otherlv_1= '(' ( (lv_brackets_2_0= ruleMinSize ) ) otherlv_3= ')' ) ) ( ( (lv_operator_4_0= ruleBoolOperator ) ) ( (lv_size_5_0= ruleMinSize ) ) )?
            {
            // InternalCloneDetectionDSL.g:717:3: ( ( (lv_expr_0_0= ruleMetricExpr ) ) | (otherlv_1= '(' ( (lv_brackets_2_0= ruleMinSize ) ) otherlv_3= ')' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            else if ( (LA9_0==20) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalCloneDetectionDSL.g:718:4: ( (lv_expr_0_0= ruleMetricExpr ) )
                    {
                    // InternalCloneDetectionDSL.g:718:4: ( (lv_expr_0_0= ruleMetricExpr ) )
                    // InternalCloneDetectionDSL.g:719:5: (lv_expr_0_0= ruleMetricExpr )
                    {
                    // InternalCloneDetectionDSL.g:719:5: (lv_expr_0_0= ruleMetricExpr )
                    // InternalCloneDetectionDSL.g:720:6: lv_expr_0_0= ruleMetricExpr
                    {

                    						newCompositeNode(grammarAccess.getMinSizeAccess().getExprMetricExprParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_expr_0_0=ruleMetricExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMinSizeRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_0_0,
                    							"com.simonbaars.cdd.CloneDetectionDSL.MetricExpr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:738:4: (otherlv_1= '(' ( (lv_brackets_2_0= ruleMinSize ) ) otherlv_3= ')' )
                    {
                    // InternalCloneDetectionDSL.g:738:4: (otherlv_1= '(' ( (lv_brackets_2_0= ruleMinSize ) ) otherlv_3= ')' )
                    // InternalCloneDetectionDSL.g:739:5: otherlv_1= '(' ( (lv_brackets_2_0= ruleMinSize ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_10); 

                    					newLeafNode(otherlv_1, grammarAccess.getMinSizeAccess().getLeftParenthesisKeyword_0_1_0());
                    				
                    // InternalCloneDetectionDSL.g:743:5: ( (lv_brackets_2_0= ruleMinSize ) )
                    // InternalCloneDetectionDSL.g:744:6: (lv_brackets_2_0= ruleMinSize )
                    {
                    // InternalCloneDetectionDSL.g:744:6: (lv_brackets_2_0= ruleMinSize )
                    // InternalCloneDetectionDSL.g:745:7: lv_brackets_2_0= ruleMinSize
                    {

                    							newCompositeNode(grammarAccess.getMinSizeAccess().getBracketsMinSizeParserRuleCall_0_1_1_0());
                    						
                    pushFollow(FOLLOW_12);
                    lv_brackets_2_0=ruleMinSize();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getMinSizeRule());
                    							}
                    							set(
                    								current,
                    								"brackets",
                    								lv_brackets_2_0,
                    								"com.simonbaars.cdd.CloneDetectionDSL.MinSize");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_11); 

                    					newLeafNode(otherlv_3, grammarAccess.getMinSizeAccess().getRightParenthesisKeyword_0_1_2());
                    				

                    }


                    }
                    break;

            }

            // InternalCloneDetectionDSL.g:768:3: ( ( (lv_operator_4_0= ruleBoolOperator ) ) ( (lv_size_5_0= ruleMinSize ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=34 && LA10_0<=35)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCloneDetectionDSL.g:769:4: ( (lv_operator_4_0= ruleBoolOperator ) ) ( (lv_size_5_0= ruleMinSize ) )
                    {
                    // InternalCloneDetectionDSL.g:769:4: ( (lv_operator_4_0= ruleBoolOperator ) )
                    // InternalCloneDetectionDSL.g:770:5: (lv_operator_4_0= ruleBoolOperator )
                    {
                    // InternalCloneDetectionDSL.g:770:5: (lv_operator_4_0= ruleBoolOperator )
                    // InternalCloneDetectionDSL.g:771:6: lv_operator_4_0= ruleBoolOperator
                    {

                    						newCompositeNode(grammarAccess.getMinSizeAccess().getOperatorBoolOperatorEnumRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_operator_4_0=ruleBoolOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMinSizeRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_4_0,
                    							"com.simonbaars.cdd.CloneDetectionDSL.BoolOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCloneDetectionDSL.g:788:4: ( (lv_size_5_0= ruleMinSize ) )
                    // InternalCloneDetectionDSL.g:789:5: (lv_size_5_0= ruleMinSize )
                    {
                    // InternalCloneDetectionDSL.g:789:5: (lv_size_5_0= ruleMinSize )
                    // InternalCloneDetectionDSL.g:790:6: lv_size_5_0= ruleMinSize
                    {

                    						newCompositeNode(grammarAccess.getMinSizeAccess().getSizeMinSizeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_size_5_0=ruleMinSize();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMinSizeRule());
                    						}
                    						set(
                    							current,
                    							"size",
                    							lv_size_5_0,
                    							"com.simonbaars.cdd.CloneDetectionDSL.MinSize");
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
    // $ANTLR end "ruleMinSize"


    // $ANTLR start "entryRuleMetricExpr"
    // InternalCloneDetectionDSL.g:812:1: entryRuleMetricExpr returns [EObject current=null] : iv_ruleMetricExpr= ruleMetricExpr EOF ;
    public final EObject entryRuleMetricExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetricExpr = null;


        try {
            // InternalCloneDetectionDSL.g:812:51: (iv_ruleMetricExpr= ruleMetricExpr EOF )
            // InternalCloneDetectionDSL.g:813:2: iv_ruleMetricExpr= ruleMetricExpr EOF
            {
             newCompositeNode(grammarAccess.getMetricExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetricExpr=ruleMetricExpr();

            state._fsp--;

             current =iv_ruleMetricExpr; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMetricExpr"


    // $ANTLR start "ruleMetricExpr"
    // InternalCloneDetectionDSL.g:819:1: ruleMetricExpr returns [EObject current=null] : ( ( (lv_amount_0_0= RULE_INT ) ) ( (lv_metric_1_0= ruleSizeMetric ) ) ) ;
    public final EObject ruleMetricExpr() throws RecognitionException {
        EObject current = null;

        Token lv_amount_0_0=null;
        Enumerator lv_metric_1_0 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:825:2: ( ( ( (lv_amount_0_0= RULE_INT ) ) ( (lv_metric_1_0= ruleSizeMetric ) ) ) )
            // InternalCloneDetectionDSL.g:826:2: ( ( (lv_amount_0_0= RULE_INT ) ) ( (lv_metric_1_0= ruleSizeMetric ) ) )
            {
            // InternalCloneDetectionDSL.g:826:2: ( ( (lv_amount_0_0= RULE_INT ) ) ( (lv_metric_1_0= ruleSizeMetric ) ) )
            // InternalCloneDetectionDSL.g:827:3: ( (lv_amount_0_0= RULE_INT ) ) ( (lv_metric_1_0= ruleSizeMetric ) )
            {
            // InternalCloneDetectionDSL.g:827:3: ( (lv_amount_0_0= RULE_INT ) )
            // InternalCloneDetectionDSL.g:828:4: (lv_amount_0_0= RULE_INT )
            {
            // InternalCloneDetectionDSL.g:828:4: (lv_amount_0_0= RULE_INT )
            // InternalCloneDetectionDSL.g:829:5: lv_amount_0_0= RULE_INT
            {
            lv_amount_0_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_amount_0_0, grammarAccess.getMetricExprAccess().getAmountINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetricExprRule());
            					}
            					setWithLastConsumed(
            						current,
            						"amount",
            						lv_amount_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalCloneDetectionDSL.g:845:3: ( (lv_metric_1_0= ruleSizeMetric ) )
            // InternalCloneDetectionDSL.g:846:4: (lv_metric_1_0= ruleSizeMetric )
            {
            // InternalCloneDetectionDSL.g:846:4: (lv_metric_1_0= ruleSizeMetric )
            // InternalCloneDetectionDSL.g:847:5: lv_metric_1_0= ruleSizeMetric
            {

            					newCompositeNode(grammarAccess.getMetricExprAccess().getMetricSizeMetricEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_metric_1_0=ruleSizeMetric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetricExprRule());
            					}
            					set(
            						current,
            						"metric",
            						lv_metric_1_0,
            						"com.simonbaars.cdd.CloneDetectionDSL.SizeMetric");
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
    // $ANTLR end "ruleMetricExpr"


    // $ANTLR start "entryRuleDoNotCompare"
    // InternalCloneDetectionDSL.g:868:1: entryRuleDoNotCompare returns [EObject current=null] : iv_ruleDoNotCompare= ruleDoNotCompare EOF ;
    public final EObject entryRuleDoNotCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoNotCompare = null;


        try {
            // InternalCloneDetectionDSL.g:868:53: (iv_ruleDoNotCompare= ruleDoNotCompare EOF )
            // InternalCloneDetectionDSL.g:869:2: iv_ruleDoNotCompare= ruleDoNotCompare EOF
            {
             newCompositeNode(grammarAccess.getDoNotCompareRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoNotCompare=ruleDoNotCompare();

            state._fsp--;

             current =iv_ruleDoNotCompare; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDoNotCompare"


    // $ANTLR start "ruleDoNotCompare"
    // InternalCloneDetectionDSL.g:875:1: ruleDoNotCompare returns [EObject current=null] : (otherlv_0= 'DoNotCompare' this_Nodes_1= ruleNodes ) ;
    public final EObject ruleDoNotCompare() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Nodes_1 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:881:2: ( (otherlv_0= 'DoNotCompare' this_Nodes_1= ruleNodes ) )
            // InternalCloneDetectionDSL.g:882:2: (otherlv_0= 'DoNotCompare' this_Nodes_1= ruleNodes )
            {
            // InternalCloneDetectionDSL.g:882:2: (otherlv_0= 'DoNotCompare' this_Nodes_1= ruleNodes )
            // InternalCloneDetectionDSL.g:883:3: otherlv_0= 'DoNotCompare' this_Nodes_1= ruleNodes
            {
            otherlv_0=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDoNotCompareAccess().getDoNotCompareKeyword_0());
            		

            			newCompositeNode(grammarAccess.getDoNotCompareAccess().getNodesParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Nodes_1=ruleNodes();

            state._fsp--;


            			current = this_Nodes_1;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleDoNotCompare"


    // $ANTLR start "entryRuleCompare"
    // InternalCloneDetectionDSL.g:899:1: entryRuleCompare returns [EObject current=null] : iv_ruleCompare= ruleCompare EOF ;
    public final EObject entryRuleCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompare = null;


        try {
            // InternalCloneDetectionDSL.g:899:48: (iv_ruleCompare= ruleCompare EOF )
            // InternalCloneDetectionDSL.g:900:2: iv_ruleCompare= ruleCompare EOF
            {
             newCompositeNode(grammarAccess.getCompareRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompare=ruleCompare();

            state._fsp--;

             current =iv_ruleCompare; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCompare"


    // $ANTLR start "ruleCompare"
    // InternalCloneDetectionDSL.g:906:1: ruleCompare returns [EObject current=null] : (otherlv_0= 'Compare' ( (lv_nodes_1_0= ruleNodes ) ) ( (lv_comparisonMethod_2_0= ruleMethod ) ) ( (lv_deepestNode_3_0= ruleNode ) )? ( (lv_perc_4_0= rulePercentage ) )? ) ;
    public final EObject ruleCompare() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_nodes_1_0 = null;

        Enumerator lv_comparisonMethod_2_0 = null;

        EObject lv_deepestNode_3_0 = null;

        AntlrDatatypeRuleToken lv_perc_4_0 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:912:2: ( (otherlv_0= 'Compare' ( (lv_nodes_1_0= ruleNodes ) ) ( (lv_comparisonMethod_2_0= ruleMethod ) ) ( (lv_deepestNode_3_0= ruleNode ) )? ( (lv_perc_4_0= rulePercentage ) )? ) )
            // InternalCloneDetectionDSL.g:913:2: (otherlv_0= 'Compare' ( (lv_nodes_1_0= ruleNodes ) ) ( (lv_comparisonMethod_2_0= ruleMethod ) ) ( (lv_deepestNode_3_0= ruleNode ) )? ( (lv_perc_4_0= rulePercentage ) )? )
            {
            // InternalCloneDetectionDSL.g:913:2: (otherlv_0= 'Compare' ( (lv_nodes_1_0= ruleNodes ) ) ( (lv_comparisonMethod_2_0= ruleMethod ) ) ( (lv_deepestNode_3_0= ruleNode ) )? ( (lv_perc_4_0= rulePercentage ) )? )
            // InternalCloneDetectionDSL.g:914:3: otherlv_0= 'Compare' ( (lv_nodes_1_0= ruleNodes ) ) ( (lv_comparisonMethod_2_0= ruleMethod ) ) ( (lv_deepestNode_3_0= ruleNode ) )? ( (lv_perc_4_0= rulePercentage ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCompareAccess().getCompareKeyword_0());
            		
            // InternalCloneDetectionDSL.g:918:3: ( (lv_nodes_1_0= ruleNodes ) )
            // InternalCloneDetectionDSL.g:919:4: (lv_nodes_1_0= ruleNodes )
            {
            // InternalCloneDetectionDSL.g:919:4: (lv_nodes_1_0= ruleNodes )
            // InternalCloneDetectionDSL.g:920:5: lv_nodes_1_0= ruleNodes
            {

            					newCompositeNode(grammarAccess.getCompareAccess().getNodesNodesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_nodes_1_0=ruleNodes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompareRule());
            					}
            					set(
            						current,
            						"nodes",
            						lv_nodes_1_0,
            						"com.simonbaars.cdd.CloneDetectionDSL.Nodes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCloneDetectionDSL.g:937:3: ( (lv_comparisonMethod_2_0= ruleMethod ) )
            // InternalCloneDetectionDSL.g:938:4: (lv_comparisonMethod_2_0= ruleMethod )
            {
            // InternalCloneDetectionDSL.g:938:4: (lv_comparisonMethod_2_0= ruleMethod )
            // InternalCloneDetectionDSL.g:939:5: lv_comparisonMethod_2_0= ruleMethod
            {

            					newCompositeNode(grammarAccess.getCompareAccess().getComparisonMethodMethodEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_comparisonMethod_2_0=ruleMethod();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompareRule());
            					}
            					set(
            						current,
            						"comparisonMethod",
            						lv_comparisonMethod_2_0,
            						"com.simonbaars.cdd.CloneDetectionDSL.Method");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCloneDetectionDSL.g:956:3: ( (lv_deepestNode_3_0= ruleNode ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID||LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCloneDetectionDSL.g:957:4: (lv_deepestNode_3_0= ruleNode )
                    {
                    // InternalCloneDetectionDSL.g:957:4: (lv_deepestNode_3_0= ruleNode )
                    // InternalCloneDetectionDSL.g:958:5: lv_deepestNode_3_0= ruleNode
                    {

                    					newCompositeNode(grammarAccess.getCompareAccess().getDeepestNodeNodeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_deepestNode_3_0=ruleNode();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCompareRule());
                    					}
                    					set(
                    						current,
                    						"deepestNode",
                    						lv_deepestNode_3_0,
                    						"com.simonbaars.cdd.CloneDetectionDSL.Node");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCloneDetectionDSL.g:975:3: ( (lv_perc_4_0= rulePercentage ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCloneDetectionDSL.g:976:4: (lv_perc_4_0= rulePercentage )
                    {
                    // InternalCloneDetectionDSL.g:976:4: (lv_perc_4_0= rulePercentage )
                    // InternalCloneDetectionDSL.g:977:5: lv_perc_4_0= rulePercentage
                    {

                    					newCompositeNode(grammarAccess.getCompareAccess().getPercPercentageParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_perc_4_0=rulePercentage();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCompareRule());
                    					}
                    					set(
                    						current,
                    						"perc",
                    						lv_perc_4_0,
                    						"com.simonbaars.cdd.CloneDetectionDSL.Percentage");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleCompare"


    // $ANTLR start "entryRulePercentage"
    // InternalCloneDetectionDSL.g:998:1: entryRulePercentage returns [String current=null] : iv_rulePercentage= rulePercentage EOF ;
    public final String entryRulePercentage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePercentage = null;


        try {
            // InternalCloneDetectionDSL.g:998:50: (iv_rulePercentage= rulePercentage EOF )
            // InternalCloneDetectionDSL.g:999:2: iv_rulePercentage= rulePercentage EOF
            {
             newCompositeNode(grammarAccess.getPercentageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePercentage=rulePercentage();

            state._fsp--;

             current =iv_rulePercentage.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePercentage"


    // $ANTLR start "rulePercentage"
    // InternalCloneDetectionDSL.g:1005:1: rulePercentage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '%' ) ;
    public final AntlrDatatypeRuleToken rulePercentage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:1011:2: ( (this_INT_0= RULE_INT kw= '%' ) )
            // InternalCloneDetectionDSL.g:1012:2: (this_INT_0= RULE_INT kw= '%' )
            {
            // InternalCloneDetectionDSL.g:1012:2: (this_INT_0= RULE_INT kw= '%' )
            // InternalCloneDetectionDSL.g:1013:3: this_INT_0= RULE_INT kw= '%'
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getPercentageAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,24,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPercentageAccess().getPercentSignKeyword_1());
            		

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
    // $ANTLR end "rulePercentage"


    // $ANTLR start "ruleMatchTarget"
    // InternalCloneDetectionDSL.g:1029:1: ruleMatchTarget returns [Enumerator current=null] : ( (enumLiteral_0= 'Subtree' ) | (enumLiteral_1= 'LLOC' ) | (enumLiteral_2= 'SLOC' ) ) ;
    public final Enumerator ruleMatchTarget() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:1035:2: ( ( (enumLiteral_0= 'Subtree' ) | (enumLiteral_1= 'LLOC' ) | (enumLiteral_2= 'SLOC' ) ) )
            // InternalCloneDetectionDSL.g:1036:2: ( (enumLiteral_0= 'Subtree' ) | (enumLiteral_1= 'LLOC' ) | (enumLiteral_2= 'SLOC' ) )
            {
            // InternalCloneDetectionDSL.g:1036:2: ( (enumLiteral_0= 'Subtree' ) | (enumLiteral_1= 'LLOC' ) | (enumLiteral_2= 'SLOC' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt13=1;
                }
                break;
            case 26:
                {
                alt13=2;
                }
                break;
            case 27:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1037:3: (enumLiteral_0= 'Subtree' )
                    {
                    // InternalCloneDetectionDSL.g:1037:3: (enumLiteral_0= 'Subtree' )
                    // InternalCloneDetectionDSL.g:1038:4: enumLiteral_0= 'Subtree'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getMatchTargetAccess().getSubtreeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMatchTargetAccess().getSubtreeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:1045:3: (enumLiteral_1= 'LLOC' )
                    {
                    // InternalCloneDetectionDSL.g:1045:3: (enumLiteral_1= 'LLOC' )
                    // InternalCloneDetectionDSL.g:1046:4: enumLiteral_1= 'LLOC'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getMatchTargetAccess().getLLOCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMatchTargetAccess().getLLOCEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCloneDetectionDSL.g:1053:3: (enumLiteral_2= 'SLOC' )
                    {
                    // InternalCloneDetectionDSL.g:1053:3: (enumLiteral_2= 'SLOC' )
                    // InternalCloneDetectionDSL.g:1054:4: enumLiteral_2= 'SLOC'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getMatchTargetAccess().getSLOCEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMatchTargetAccess().getSLOCEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleMatchTarget"


    // $ANTLR start "ruleSizeMetric"
    // InternalCloneDetectionDSL.g:1064:1: ruleSizeMetric returns [Enumerator current=null] : ( (enumLiteral_0= 'tokens' ) | (enumLiteral_1= 'declarations' ) | (enumLiteral_2= 'statements' ) | (enumLiteral_3= 'nodes' ) | (enumLiteral_4= 'lines' ) | (enumLiteral_5= 'cyclomatic_complexity' ) ) ;
    public final Enumerator ruleSizeMetric() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:1070:2: ( ( (enumLiteral_0= 'tokens' ) | (enumLiteral_1= 'declarations' ) | (enumLiteral_2= 'statements' ) | (enumLiteral_3= 'nodes' ) | (enumLiteral_4= 'lines' ) | (enumLiteral_5= 'cyclomatic_complexity' ) ) )
            // InternalCloneDetectionDSL.g:1071:2: ( (enumLiteral_0= 'tokens' ) | (enumLiteral_1= 'declarations' ) | (enumLiteral_2= 'statements' ) | (enumLiteral_3= 'nodes' ) | (enumLiteral_4= 'lines' ) | (enumLiteral_5= 'cyclomatic_complexity' ) )
            {
            // InternalCloneDetectionDSL.g:1071:2: ( (enumLiteral_0= 'tokens' ) | (enumLiteral_1= 'declarations' ) | (enumLiteral_2= 'statements' ) | (enumLiteral_3= 'nodes' ) | (enumLiteral_4= 'lines' ) | (enumLiteral_5= 'cyclomatic_complexity' ) )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt14=1;
                }
                break;
            case 29:
                {
                alt14=2;
                }
                break;
            case 30:
                {
                alt14=3;
                }
                break;
            case 31:
                {
                alt14=4;
                }
                break;
            case 32:
                {
                alt14=5;
                }
                break;
            case 33:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1072:3: (enumLiteral_0= 'tokens' )
                    {
                    // InternalCloneDetectionDSL.g:1072:3: (enumLiteral_0= 'tokens' )
                    // InternalCloneDetectionDSL.g:1073:4: enumLiteral_0= 'tokens'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getSizeMetricAccess().getTokensEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSizeMetricAccess().getTokensEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:1080:3: (enumLiteral_1= 'declarations' )
                    {
                    // InternalCloneDetectionDSL.g:1080:3: (enumLiteral_1= 'declarations' )
                    // InternalCloneDetectionDSL.g:1081:4: enumLiteral_1= 'declarations'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getSizeMetricAccess().getDeclarationsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSizeMetricAccess().getDeclarationsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCloneDetectionDSL.g:1088:3: (enumLiteral_2= 'statements' )
                    {
                    // InternalCloneDetectionDSL.g:1088:3: (enumLiteral_2= 'statements' )
                    // InternalCloneDetectionDSL.g:1089:4: enumLiteral_2= 'statements'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getSizeMetricAccess().getStatementsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSizeMetricAccess().getStatementsEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCloneDetectionDSL.g:1096:3: (enumLiteral_3= 'nodes' )
                    {
                    // InternalCloneDetectionDSL.g:1096:3: (enumLiteral_3= 'nodes' )
                    // InternalCloneDetectionDSL.g:1097:4: enumLiteral_3= 'nodes'
                    {
                    enumLiteral_3=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getSizeMetricAccess().getNodesEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSizeMetricAccess().getNodesEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCloneDetectionDSL.g:1104:3: (enumLiteral_4= 'lines' )
                    {
                    // InternalCloneDetectionDSL.g:1104:3: (enumLiteral_4= 'lines' )
                    // InternalCloneDetectionDSL.g:1105:4: enumLiteral_4= 'lines'
                    {
                    enumLiteral_4=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getSizeMetricAccess().getLinesEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSizeMetricAccess().getLinesEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCloneDetectionDSL.g:1112:3: (enumLiteral_5= 'cyclomatic_complexity' )
                    {
                    // InternalCloneDetectionDSL.g:1112:3: (enumLiteral_5= 'cyclomatic_complexity' )
                    // InternalCloneDetectionDSL.g:1113:4: enumLiteral_5= 'cyclomatic_complexity'
                    {
                    enumLiteral_5=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getSizeMetricAccess().getCyclomatic_complexityEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSizeMetricAccess().getCyclomatic_complexityEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleSizeMetric"


    // $ANTLR start "ruleBoolOperator"
    // InternalCloneDetectionDSL.g:1123:1: ruleBoolOperator returns [Enumerator current=null] : ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) ) ;
    public final Enumerator ruleBoolOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:1129:2: ( ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) ) )
            // InternalCloneDetectionDSL.g:1130:2: ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) )
            {
            // InternalCloneDetectionDSL.g:1130:2: ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            else if ( (LA15_0==35) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1131:3: (enumLiteral_0= '&' )
                    {
                    // InternalCloneDetectionDSL.g:1131:3: (enumLiteral_0= '&' )
                    // InternalCloneDetectionDSL.g:1132:4: enumLiteral_0= '&'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getBoolOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBoolOperatorAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:1139:3: (enumLiteral_1= '|' )
                    {
                    // InternalCloneDetectionDSL.g:1139:3: (enumLiteral_1= '|' )
                    // InternalCloneDetectionDSL.g:1140:4: enumLiteral_1= '|'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getBoolOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBoolOperatorAccess().getOREnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleBoolOperator"


    // $ANTLR start "ruleMethod"
    // InternalCloneDetectionDSL.g:1150:1: ruleMethod returns [Enumerator current=null] : ( (enumLiteral_0= 'Subnodes' ) | (enumLiteral_1= 'StringMatch' ) | (enumLiteral_2= 'CompleteMatch' ) | (enumLiteral_3= 'FQI' ) ) ;
    public final Enumerator ruleMethod() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:1156:2: ( ( (enumLiteral_0= 'Subnodes' ) | (enumLiteral_1= 'StringMatch' ) | (enumLiteral_2= 'CompleteMatch' ) | (enumLiteral_3= 'FQI' ) ) )
            // InternalCloneDetectionDSL.g:1157:2: ( (enumLiteral_0= 'Subnodes' ) | (enumLiteral_1= 'StringMatch' ) | (enumLiteral_2= 'CompleteMatch' ) | (enumLiteral_3= 'FQI' ) )
            {
            // InternalCloneDetectionDSL.g:1157:2: ( (enumLiteral_0= 'Subnodes' ) | (enumLiteral_1= 'StringMatch' ) | (enumLiteral_2= 'CompleteMatch' ) | (enumLiteral_3= 'FQI' ) )
            int alt16=4;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1158:3: (enumLiteral_0= 'Subnodes' )
                    {
                    // InternalCloneDetectionDSL.g:1158:3: (enumLiteral_0= 'Subnodes' )
                    // InternalCloneDetectionDSL.g:1159:4: enumLiteral_0= 'Subnodes'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getMethodAccess().getSubnodesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMethodAccess().getSubnodesEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:1166:3: (enumLiteral_1= 'StringMatch' )
                    {
                    // InternalCloneDetectionDSL.g:1166:3: (enumLiteral_1= 'StringMatch' )
                    // InternalCloneDetectionDSL.g:1167:4: enumLiteral_1= 'StringMatch'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getMethodAccess().getStringMatchEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMethodAccess().getStringMatchEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCloneDetectionDSL.g:1174:3: (enumLiteral_2= 'CompleteMatch' )
                    {
                    // InternalCloneDetectionDSL.g:1174:3: (enumLiteral_2= 'CompleteMatch' )
                    // InternalCloneDetectionDSL.g:1175:4: enumLiteral_2= 'CompleteMatch'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getMethodAccess().getCompleteMatchEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMethodAccess().getCompleteMatchEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCloneDetectionDSL.g:1182:3: (enumLiteral_3= 'FQI' )
                    {
                    // InternalCloneDetectionDSL.g:1182:3: (enumLiteral_3= 'FQI' )
                    // InternalCloneDetectionDSL.g:1183:4: enumLiteral_3= 'FQI'
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getMethodAccess().getFQIEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMethodAccess().getFQIEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "ruleUnder"
    // InternalCloneDetectionDSL.g:1193:1: ruleUnder returns [Enumerator current=null] : ( (enumLiteral_0= '->' ) | (enumLiteral_1= '=>' ) ) ;
    public final Enumerator ruleUnder() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:1199:2: ( ( (enumLiteral_0= '->' ) | (enumLiteral_1= '=>' ) ) )
            // InternalCloneDetectionDSL.g:1200:2: ( (enumLiteral_0= '->' ) | (enumLiteral_1= '=>' ) )
            {
            // InternalCloneDetectionDSL.g:1200:2: ( (enumLiteral_0= '->' ) | (enumLiteral_1= '=>' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==40) ) {
                alt17=1;
            }
            else if ( (LA17_0==41) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1201:3: (enumLiteral_0= '->' )
                    {
                    // InternalCloneDetectionDSL.g:1201:3: (enumLiteral_0= '->' )
                    // InternalCloneDetectionDSL.g:1202:4: enumLiteral_0= '->'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getUnderAccess().getOneLevelEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUnderAccess().getOneLevelEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:1209:3: (enumLiteral_1= '=>' )
                    {
                    // InternalCloneDetectionDSL.g:1209:3: (enumLiteral_1= '=>' )
                    // InternalCloneDetectionDSL.g:1210:4: enumLiteral_1= '=>'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getUnderAccess().getAnyLevelEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getUnderAccess().getAnyLevelEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleUnder"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\1\11\uffff";
    static final String dfa_3s = "\1\13\11\uffff";
    static final String dfa_4s = "\1\27\11\uffff";
    static final String dfa_5s = "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_6s = "\1\0\11\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\uffff\1\7\1\3\1\4\1\5\2\uffff\1\6\2\uffff\1\10\1\11",
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

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 85:5: ( ({...}? => ( ({...}? => ( (lv_project_1_0= ruleProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= ruleSearchRoot ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_match_3_0= ruleMatch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exclude_4_0= ruleExclude ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_5_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_paths_6_0= ruleLibraryPath ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_notCompare_7_0= ruleDoNotCompare ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_compare_8_0= ruleCompare ) ) )+ ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_0 = input.LA(1);

                         
                        int index4_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA4_0==EOF) ) {s = 1;}

                        else if ( LA4_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0) ) {s = 2;}

                        else if ( LA4_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1) ) {s = 3;}

                        else if ( LA4_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2) ) {s = 4;}

                        else if ( LA4_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3) ) {s = 5;}

                        else if ( LA4_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4) ) {s = 6;}

                        else if ( LA4_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5) ) {s = 7;}

                        else if ( LA4_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6) ) {s = 8;}

                        else if ( LA4_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 7) ) {s = 9;}

                         
                        input.seek(index4_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000C9E802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000003F0000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000F000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020062L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});

}
