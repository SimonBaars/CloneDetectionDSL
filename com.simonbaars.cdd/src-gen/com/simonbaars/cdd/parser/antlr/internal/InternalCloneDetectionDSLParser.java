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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCloneDetectionDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_BOOL_LITERAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Project'", "'SearchRoot'", "'Match'", "'Exclude'", "'*'", "','", "'Size'", "'('", "')'", "'DoNotCompare'", "'Compare'", "'%'", "'NOT'", "'+'", "'-'", "'/'", "'max'", "'min'", "'mod'", "'^'", "'Subtree'", "'LLOC'", "'SLOC'", "'tokens'", "'declarations'", "'statements'", "'nodes'", "'lines'", "'&'", "'|'", "'Subnodes'", "'StringMatch'", "'CompleteMatch'", "'FQI'", "'->'", "'=>'", "'CyclomaticComplexity'", "'LineVolume'", "'TokenVolume'", "'StatementVolume'", "'NumberOfParameters'", "'AND'", "'OR'", "'=='", "'!='", "'>='", "'>'", "'<='", "'<'"
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCloneDetectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCloneDetection=ruleCloneDetection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCloneDetection; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalCloneDetectionDSL.g:72:1: ruleCloneDetection returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_project_1_0= ruleProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= ruleSearchRoot ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_match_3_0= ruleMatch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exclude_4_0= ruleExclude ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_5_0= ruleMinSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notCompare_6_0= ruleDoNotCompare ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_compare_7_0= ruleCompare ) ) )+ ) ) )+ {...}?) ) ) ;
    public final EObject ruleCloneDetection() throws RecognitionException {
        EObject current = null;

        EObject lv_project_1_0 = null;

        EObject lv_root_2_0 = null;

        EObject lv_match_3_0 = null;

        EObject lv_exclude_4_0 = null;

        EObject lv_size_5_0 = null;

        EObject lv_notCompare_6_0 = null;

        EObject lv_compare_7_0 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:78:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_project_1_0= ruleProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= ruleSearchRoot ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_match_3_0= ruleMatch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exclude_4_0= ruleExclude ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_5_0= ruleMinSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notCompare_6_0= ruleDoNotCompare ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_compare_7_0= ruleCompare ) ) )+ ) ) )+ {...}?) ) ) )
            // InternalCloneDetectionDSL.g:79:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_project_1_0= ruleProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= ruleSearchRoot ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_match_3_0= ruleMatch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exclude_4_0= ruleExclude ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_5_0= ruleMinSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notCompare_6_0= ruleDoNotCompare ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_compare_7_0= ruleCompare ) ) )+ ) ) )+ {...}?) ) )
            {
            // InternalCloneDetectionDSL.g:79:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_project_1_0= ruleProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= ruleSearchRoot ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_match_3_0= ruleMatch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exclude_4_0= ruleExclude ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_5_0= ruleMinSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notCompare_6_0= ruleDoNotCompare ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_compare_7_0= ruleCompare ) ) )+ ) ) )+ {...}?) ) )
            // InternalCloneDetectionDSL.g:80:3: ( ( ( ({...}? => ( ({...}? => ( (lv_project_1_0= ruleProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= ruleSearchRoot ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_match_3_0= ruleMatch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exclude_4_0= ruleExclude ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_5_0= ruleMinSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notCompare_6_0= ruleDoNotCompare ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_compare_7_0= ruleCompare ) ) )+ ) ) )+ {...}?) )
            {
            // InternalCloneDetectionDSL.g:80:3: ( ( ( ({...}? => ( ({...}? => ( (lv_project_1_0= ruleProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= ruleSearchRoot ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_match_3_0= ruleMatch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exclude_4_0= ruleExclude ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_5_0= ruleMinSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notCompare_6_0= ruleDoNotCompare ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_compare_7_0= ruleCompare ) ) )+ ) ) )+ {...}?) )
            // InternalCloneDetectionDSL.g:81:4: ( ( ({...}? => ( ({...}? => ( (lv_project_1_0= ruleProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= ruleSearchRoot ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_match_3_0= ruleMatch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exclude_4_0= ruleExclude ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_5_0= ruleMinSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notCompare_6_0= ruleDoNotCompare ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_compare_7_0= ruleCompare ) ) )+ ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getCloneDetectionAccess().getUnorderedGroup());
            // InternalCloneDetectionDSL.g:84:4: ( ( ({...}? => ( ({...}? => ( (lv_project_1_0= ruleProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= ruleSearchRoot ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_match_3_0= ruleMatch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exclude_4_0= ruleExclude ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_5_0= ruleMinSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notCompare_6_0= ruleDoNotCompare ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_compare_7_0= ruleCompare ) ) )+ ) ) )+ {...}?)
            // InternalCloneDetectionDSL.g:85:5: ( ({...}? => ( ({...}? => ( (lv_project_1_0= ruleProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= ruleSearchRoot ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_match_3_0= ruleMatch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exclude_4_0= ruleExclude ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_5_0= ruleMinSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notCompare_6_0= ruleDoNotCompare ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_compare_7_0= ruleCompare ) ) )+ ) ) )+ {...}?
            {
            // InternalCloneDetectionDSL.g:85:5: ( ({...}? => ( ({...}? => ( (lv_project_1_0= ruleProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= ruleSearchRoot ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_match_3_0= ruleMatch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exclude_4_0= ruleExclude ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_5_0= ruleMinSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notCompare_6_0= ruleDoNotCompare ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_compare_7_0= ruleCompare ) ) )+ ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=8;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 1) ) {
                    alt3=2;
                }
                else if ( LA3_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 2) ) {
                    alt3=3;
                }
                else if ( LA3_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 3) ) {
                    alt3=4;
                }
                else if ( LA3_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4) ) {
                    alt3=5;
                }
                else if ( LA3_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5) ) {
                    alt3=6;
                }
                else if ( LA3_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6) ) {
                    alt3=7;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCloneDetectionDSL.g:86:3: ({...}? => ( ({...}? => ( (lv_project_1_0= ruleProject ) ) ) ) )
            	    {
            	    // InternalCloneDetectionDSL.g:86:3: ({...}? => ( ({...}? => ( (lv_project_1_0= ruleProject ) ) ) ) )
            	    // InternalCloneDetectionDSL.g:87:4: {...}? => ( ({...}? => ( (lv_project_1_0= ruleProject ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
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
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleCloneDetection", "true");
            	    }
            	    // InternalCloneDetectionDSL.g:91:18: ( (lv_project_1_0= ruleProject ) )
            	    // InternalCloneDetectionDSL.g:91:19: (lv_project_1_0= ruleProject )
            	    {
            	    // InternalCloneDetectionDSL.g:91:19: (lv_project_1_0= ruleProject )
            	    // InternalCloneDetectionDSL.g:92:9: lv_project_1_0= ruleProject
            	    {
            	    if ( state.backtracking==0 ) {

            	      									newCompositeNode(grammarAccess.getCloneDetectionAccess().getProjectProjectParserRuleCall_0_0());
            	      								
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_project_1_0=ruleProject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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
            	        if (state.backtracking>0) {state.failed=true; return current;}
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
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleCloneDetection", "true");
            	    }
            	    // InternalCloneDetectionDSL.g:119:18: ( (lv_root_2_0= ruleSearchRoot ) )
            	    // InternalCloneDetectionDSL.g:119:19: (lv_root_2_0= ruleSearchRoot )
            	    {
            	    // InternalCloneDetectionDSL.g:119:19: (lv_root_2_0= ruleSearchRoot )
            	    // InternalCloneDetectionDSL.g:120:9: lv_root_2_0= ruleSearchRoot
            	    {
            	    if ( state.backtracking==0 ) {

            	      									newCompositeNode(grammarAccess.getCloneDetectionAccess().getRootSearchRootParserRuleCall_1_0());
            	      								
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_root_2_0=ruleSearchRoot();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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
            	        if (state.backtracking>0) {state.failed=true; return current;}
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
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleCloneDetection", "true");
            	    }
            	    // InternalCloneDetectionDSL.g:147:18: ( (lv_match_3_0= ruleMatch ) )
            	    // InternalCloneDetectionDSL.g:147:19: (lv_match_3_0= ruleMatch )
            	    {
            	    // InternalCloneDetectionDSL.g:147:19: (lv_match_3_0= ruleMatch )
            	    // InternalCloneDetectionDSL.g:148:9: lv_match_3_0= ruleMatch
            	    {
            	    if ( state.backtracking==0 ) {

            	      									newCompositeNode(grammarAccess.getCloneDetectionAccess().getMatchMatchParserRuleCall_2_0());
            	      								
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_match_3_0=ruleMatch();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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
            	        if (state.backtracking>0) {state.failed=true; return current;}
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
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleCloneDetection", "true");
            	    }
            	    // InternalCloneDetectionDSL.g:175:18: ( (lv_exclude_4_0= ruleExclude ) )
            	    // InternalCloneDetectionDSL.g:175:19: (lv_exclude_4_0= ruleExclude )
            	    {
            	    // InternalCloneDetectionDSL.g:175:19: (lv_exclude_4_0= ruleExclude )
            	    // InternalCloneDetectionDSL.g:176:9: lv_exclude_4_0= ruleExclude
            	    {
            	    if ( state.backtracking==0 ) {

            	      									newCompositeNode(grammarAccess.getCloneDetectionAccess().getExcludeExcludeParserRuleCall_3_0());
            	      								
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_exclude_4_0=ruleExclude();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCloneDetectionAccess().getUnorderedGroup());

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalCloneDetectionDSL.g:198:3: ({...}? => ( ({...}? => ( (lv_size_5_0= ruleMinSize ) ) ) ) )
            	    {
            	    // InternalCloneDetectionDSL.g:198:3: ({...}? => ( ({...}? => ( (lv_size_5_0= ruleMinSize ) ) ) ) )
            	    // InternalCloneDetectionDSL.g:199:4: {...}? => ( ({...}? => ( (lv_size_5_0= ruleMinSize ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleCloneDetection", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalCloneDetectionDSL.g:199:108: ( ({...}? => ( (lv_size_5_0= ruleMinSize ) ) ) )
            	    // InternalCloneDetectionDSL.g:200:5: ({...}? => ( (lv_size_5_0= ruleMinSize ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 4);
            	    // InternalCloneDetectionDSL.g:203:8: ({...}? => ( (lv_size_5_0= ruleMinSize ) ) )
            	    // InternalCloneDetectionDSL.g:203:9: {...}? => ( (lv_size_5_0= ruleMinSize ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleCloneDetection", "true");
            	    }
            	    // InternalCloneDetectionDSL.g:203:18: ( (lv_size_5_0= ruleMinSize ) )
            	    // InternalCloneDetectionDSL.g:203:19: (lv_size_5_0= ruleMinSize )
            	    {
            	    // InternalCloneDetectionDSL.g:203:19: (lv_size_5_0= ruleMinSize )
            	    // InternalCloneDetectionDSL.g:204:9: lv_size_5_0= ruleMinSize
            	    {
            	    if ( state.backtracking==0 ) {

            	      									newCompositeNode(grammarAccess.getCloneDetectionAccess().getSizeMinSizeParserRuleCall_4_0());
            	      								
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_size_5_0=ruleMinSize();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									if (current==null) {
            	      										current = createModelElementForParent(grammarAccess.getCloneDetectionRule());
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


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCloneDetectionAccess().getUnorderedGroup());

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalCloneDetectionDSL.g:226:3: ({...}? => ( ({...}? => ( (lv_notCompare_6_0= ruleDoNotCompare ) ) )+ ) )
            	    {
            	    // InternalCloneDetectionDSL.g:226:3: ({...}? => ( ({...}? => ( (lv_notCompare_6_0= ruleDoNotCompare ) ) )+ ) )
            	    // InternalCloneDetectionDSL.g:227:4: {...}? => ( ({...}? => ( (lv_notCompare_6_0= ruleDoNotCompare ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleCloneDetection", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalCloneDetectionDSL.g:227:108: ( ({...}? => ( (lv_notCompare_6_0= ruleDoNotCompare ) ) )+ )
            	    // InternalCloneDetectionDSL.g:228:5: ({...}? => ( (lv_notCompare_6_0= ruleDoNotCompare ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 5);
            	    // InternalCloneDetectionDSL.g:231:8: ({...}? => ( (lv_notCompare_6_0= ruleDoNotCompare ) ) )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==21) ) {
            	            int LA1_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt1=1;
            	            }


            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalCloneDetectionDSL.g:231:9: {...}? => ( (lv_notCompare_6_0= ruleDoNotCompare ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "ruleCloneDetection", "true");
            	    	    }
            	    	    // InternalCloneDetectionDSL.g:231:18: ( (lv_notCompare_6_0= ruleDoNotCompare ) )
            	    	    // InternalCloneDetectionDSL.g:231:19: (lv_notCompare_6_0= ruleDoNotCompare )
            	    	    {
            	    	    // InternalCloneDetectionDSL.g:231:19: (lv_notCompare_6_0= ruleDoNotCompare )
            	    	    // InternalCloneDetectionDSL.g:232:9: lv_notCompare_6_0= ruleDoNotCompare
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      									newCompositeNode(grammarAccess.getCloneDetectionAccess().getNotCompareDoNotCompareParserRuleCall_5_0());
            	    	      								
            	    	    }
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_notCompare_6_0=ruleDoNotCompare();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      									if (current==null) {
            	    	      										current = createModelElementForParent(grammarAccess.getCloneDetectionRule());
            	    	      									}
            	    	      									add(
            	    	      										current,
            	    	      										"notCompare",
            	    	      										lv_notCompare_6_0,
            	    	      										"com.simonbaars.cdd.CloneDetectionDSL.DoNotCompare");
            	    	      									afterParserOrEnumRuleCall();
            	    	      								
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt1 >= 1 ) break loop1;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
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
            	    // InternalCloneDetectionDSL.g:254:3: ({...}? => ( ({...}? => ( (lv_compare_7_0= ruleCompare ) ) )+ ) )
            	    {
            	    // InternalCloneDetectionDSL.g:254:3: ({...}? => ( ({...}? => ( (lv_compare_7_0= ruleCompare ) ) )+ ) )
            	    // InternalCloneDetectionDSL.g:255:4: {...}? => ( ({...}? => ( (lv_compare_7_0= ruleCompare ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleCloneDetection", "getUnorderedGroupHelper().canSelect(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalCloneDetectionDSL.g:255:108: ( ({...}? => ( (lv_compare_7_0= ruleCompare ) ) )+ )
            	    // InternalCloneDetectionDSL.g:256:5: ({...}? => ( (lv_compare_7_0= ruleCompare ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), 6);
            	    // InternalCloneDetectionDSL.g:259:8: ({...}? => ( (lv_compare_7_0= ruleCompare ) ) )+
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
            	    	    // InternalCloneDetectionDSL.g:259:9: {...}? => ( (lv_compare_7_0= ruleCompare ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "ruleCloneDetection", "true");
            	    	    }
            	    	    // InternalCloneDetectionDSL.g:259:18: ( (lv_compare_7_0= ruleCompare ) )
            	    	    // InternalCloneDetectionDSL.g:259:19: (lv_compare_7_0= ruleCompare )
            	    	    {
            	    	    // InternalCloneDetectionDSL.g:259:19: (lv_compare_7_0= ruleCompare )
            	    	    // InternalCloneDetectionDSL.g:260:9: lv_compare_7_0= ruleCompare
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      									newCompositeNode(grammarAccess.getCloneDetectionAccess().getCompareCompareParserRuleCall_6_0());
            	    	      								
            	    	    }
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_compare_7_0=ruleCompare();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      									if (current==null) {
            	    	      										current = createModelElementForParent(grammarAccess.getCloneDetectionRule());
            	    	      									}
            	    	      									add(
            	    	      										current,
            	    	      										"compare",
            	    	      										lv_compare_7_0,
            	    	      										"com.simonbaars.cdd.CloneDetectionDSL.Compare");
            	    	      									afterParserOrEnumRuleCall();
            	    	      								
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt2 >= 1 ) break loop2;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
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

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getCloneDetectionAccess().getUnorderedGroup()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleCloneDetection", "getUnorderedGroupHelper().canLeave(grammarAccess.getCloneDetectionAccess().getUnorderedGroup())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getCloneDetectionAccess().getUnorderedGroup());

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCloneDetection"


    // $ANTLR start "entryRuleProject"
    // InternalCloneDetectionDSL.g:293:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalCloneDetectionDSL.g:293:48: (iv_ruleProject= ruleProject EOF )
            // InternalCloneDetectionDSL.g:294:2: iv_ruleProject= ruleProject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProject=ruleProject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProject; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalCloneDetectionDSL.g:300:1: ruleProject returns [EObject current=null] : (otherlv_0= 'Project' ( (lv_path_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_path_1_0=null;


        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:306:2: ( (otherlv_0= 'Project' ( (lv_path_1_0= RULE_STRING ) ) ) )
            // InternalCloneDetectionDSL.g:307:2: (otherlv_0= 'Project' ( (lv_path_1_0= RULE_STRING ) ) )
            {
            // InternalCloneDetectionDSL.g:307:2: (otherlv_0= 'Project' ( (lv_path_1_0= RULE_STRING ) ) )
            // InternalCloneDetectionDSL.g:308:3: otherlv_0= 'Project' ( (lv_path_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getProjectAccess().getProjectKeyword_0());
              		
            }
            // InternalCloneDetectionDSL.g:312:3: ( (lv_path_1_0= RULE_STRING ) )
            // InternalCloneDetectionDSL.g:313:4: (lv_path_1_0= RULE_STRING )
            {
            // InternalCloneDetectionDSL.g:313:4: (lv_path_1_0= RULE_STRING )
            // InternalCloneDetectionDSL.g:314:5: lv_path_1_0= RULE_STRING
            {
            lv_path_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_path_1_0, grammarAccess.getProjectAccess().getPathSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleSearchRoot"
    // InternalCloneDetectionDSL.g:334:1: entryRuleSearchRoot returns [EObject current=null] : iv_ruleSearchRoot= ruleSearchRoot EOF ;
    public final EObject entryRuleSearchRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSearchRoot = null;


        try {
            // InternalCloneDetectionDSL.g:334:51: (iv_ruleSearchRoot= ruleSearchRoot EOF )
            // InternalCloneDetectionDSL.g:335:2: iv_ruleSearchRoot= ruleSearchRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSearchRootRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSearchRoot=ruleSearchRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSearchRoot; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalCloneDetectionDSL.g:341:1: ruleSearchRoot returns [EObject current=null] : (otherlv_0= 'SearchRoot' ( (lv_nodes_1_0= ruleNodes ) ) ( (lv_condition_2_0= ruleComparisonExpression ) )? ) ;
    public final EObject ruleSearchRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_nodes_1_0 = null;

        EObject lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:347:2: ( (otherlv_0= 'SearchRoot' ( (lv_nodes_1_0= ruleNodes ) ) ( (lv_condition_2_0= ruleComparisonExpression ) )? ) )
            // InternalCloneDetectionDSL.g:348:2: (otherlv_0= 'SearchRoot' ( (lv_nodes_1_0= ruleNodes ) ) ( (lv_condition_2_0= ruleComparisonExpression ) )? )
            {
            // InternalCloneDetectionDSL.g:348:2: (otherlv_0= 'SearchRoot' ( (lv_nodes_1_0= ruleNodes ) ) ( (lv_condition_2_0= ruleComparisonExpression ) )? )
            // InternalCloneDetectionDSL.g:349:3: otherlv_0= 'SearchRoot' ( (lv_nodes_1_0= ruleNodes ) ) ( (lv_condition_2_0= ruleComparisonExpression ) )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSearchRootAccess().getSearchRootKeyword_0());
              		
            }
            // InternalCloneDetectionDSL.g:353:3: ( (lv_nodes_1_0= ruleNodes ) )
            // InternalCloneDetectionDSL.g:354:4: (lv_nodes_1_0= ruleNodes )
            {
            // InternalCloneDetectionDSL.g:354:4: (lv_nodes_1_0= ruleNodes )
            // InternalCloneDetectionDSL.g:355:5: lv_nodes_1_0= ruleNodes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSearchRootAccess().getNodesNodesParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_nodes_1_0=ruleNodes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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

            // InternalCloneDetectionDSL.g:372:3: ( (lv_condition_2_0= ruleComparisonExpression ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT||LA4_0==19||(LA4_0>=25 && LA4_0<=26)||(LA4_0>=48 && LA4_0<=52)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCloneDetectionDSL.g:373:4: (lv_condition_2_0= ruleComparisonExpression )
                    {
                    // InternalCloneDetectionDSL.g:373:4: (lv_condition_2_0= ruleComparisonExpression )
                    // InternalCloneDetectionDSL.g:374:5: lv_condition_2_0= ruleComparisonExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSearchRootAccess().getConditionComparisonExpressionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_condition_2_0=ruleComparisonExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSearchRootRule());
                      					}
                      					set(
                      						current,
                      						"condition",
                      						lv_condition_2_0,
                      						"com.simonbaars.cdd.CloneDetectionDSL.ComparisonExpression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSearchRoot"


    // $ANTLR start "entryRuleMatch"
    // InternalCloneDetectionDSL.g:395:1: entryRuleMatch returns [EObject current=null] : iv_ruleMatch= ruleMatch EOF ;
    public final EObject entryRuleMatch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatch = null;


        try {
            // InternalCloneDetectionDSL.g:395:46: (iv_ruleMatch= ruleMatch EOF )
            // InternalCloneDetectionDSL.g:396:2: iv_ruleMatch= ruleMatch EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMatchRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMatch=ruleMatch();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMatch; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalCloneDetectionDSL.g:402:1: ruleMatch returns [EObject current=null] : (otherlv_0= 'Match' ( (lv_target_1_0= ruleMatchTarget ) ) ) ;
    public final EObject ruleMatch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_target_1_0 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:408:2: ( (otherlv_0= 'Match' ( (lv_target_1_0= ruleMatchTarget ) ) ) )
            // InternalCloneDetectionDSL.g:409:2: (otherlv_0= 'Match' ( (lv_target_1_0= ruleMatchTarget ) ) )
            {
            // InternalCloneDetectionDSL.g:409:2: (otherlv_0= 'Match' ( (lv_target_1_0= ruleMatchTarget ) ) )
            // InternalCloneDetectionDSL.g:410:3: otherlv_0= 'Match' ( (lv_target_1_0= ruleMatchTarget ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMatchAccess().getMatchKeyword_0());
              		
            }
            // InternalCloneDetectionDSL.g:414:3: ( (lv_target_1_0= ruleMatchTarget ) )
            // InternalCloneDetectionDSL.g:415:4: (lv_target_1_0= ruleMatchTarget )
            {
            // InternalCloneDetectionDSL.g:415:4: (lv_target_1_0= ruleMatchTarget )
            // InternalCloneDetectionDSL.g:416:5: lv_target_1_0= ruleMatchTarget
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMatchAccess().getTargetMatchTargetEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_target_1_0=ruleMatchTarget();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMatch"


    // $ANTLR start "entryRuleExclude"
    // InternalCloneDetectionDSL.g:437:1: entryRuleExclude returns [EObject current=null] : iv_ruleExclude= ruleExclude EOF ;
    public final EObject entryRuleExclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExclude = null;


        try {
            // InternalCloneDetectionDSL.g:437:48: (iv_ruleExclude= ruleExclude EOF )
            // InternalCloneDetectionDSL.g:438:2: iv_ruleExclude= ruleExclude EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExcludeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExclude=ruleExclude();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExclude; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalCloneDetectionDSL.g:444:1: ruleExclude returns [EObject current=null] : (otherlv_0= 'Exclude' this_Nodes_1= ruleNodes ) ;
    public final EObject ruleExclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Nodes_1 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:450:2: ( (otherlv_0= 'Exclude' this_Nodes_1= ruleNodes ) )
            // InternalCloneDetectionDSL.g:451:2: (otherlv_0= 'Exclude' this_Nodes_1= ruleNodes )
            {
            // InternalCloneDetectionDSL.g:451:2: (otherlv_0= 'Exclude' this_Nodes_1= ruleNodes )
            // InternalCloneDetectionDSL.g:452:3: otherlv_0= 'Exclude' this_Nodes_1= ruleNodes
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExcludeAccess().getExcludeKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExcludeAccess().getNodesParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_Nodes_1=ruleNodes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Nodes_1;
              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExclude"


    // $ANTLR start "entryRuleNode"
    // InternalCloneDetectionDSL.g:468:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalCloneDetectionDSL.g:468:45: (iv_ruleNode= ruleNode EOF )
            // InternalCloneDetectionDSL.g:469:2: iv_ruleNode= ruleNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNode; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalCloneDetectionDSL.g:475:1: ruleNode returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) | otherlv_1= '*' ) ( ( (lv_under_2_0= ruleUnder ) ) ( (lv_node_3_0= ruleNode ) ) )? ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_under_2_0 = null;

        EObject lv_node_3_0 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:481:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) | otherlv_1= '*' ) ( ( (lv_under_2_0= ruleUnder ) ) ( (lv_node_3_0= ruleNode ) ) )? ) )
            // InternalCloneDetectionDSL.g:482:2: ( ( ( (lv_name_0_0= RULE_ID ) ) | otherlv_1= '*' ) ( ( (lv_under_2_0= ruleUnder ) ) ( (lv_node_3_0= ruleNode ) ) )? )
            {
            // InternalCloneDetectionDSL.g:482:2: ( ( ( (lv_name_0_0= RULE_ID ) ) | otherlv_1= '*' ) ( ( (lv_under_2_0= ruleUnder ) ) ( (lv_node_3_0= ruleNode ) ) )? )
            // InternalCloneDetectionDSL.g:483:3: ( ( (lv_name_0_0= RULE_ID ) ) | otherlv_1= '*' ) ( ( (lv_under_2_0= ruleUnder ) ) ( (lv_node_3_0= ruleNode ) ) )?
            {
            // InternalCloneDetectionDSL.g:483:3: ( ( (lv_name_0_0= RULE_ID ) ) | otherlv_1= '*' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCloneDetectionDSL.g:484:4: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // InternalCloneDetectionDSL.g:484:4: ( (lv_name_0_0= RULE_ID ) )
                    // InternalCloneDetectionDSL.g:485:5: (lv_name_0_0= RULE_ID )
                    {
                    // InternalCloneDetectionDSL.g:485:5: (lv_name_0_0= RULE_ID )
                    // InternalCloneDetectionDSL.g:486:6: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_0_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:503:4: otherlv_1= '*'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getNodeAccess().getAsteriskKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalCloneDetectionDSL.g:508:3: ( ( (lv_under_2_0= ruleUnder ) ) ( (lv_node_3_0= ruleNode ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=46 && LA6_0<=47)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCloneDetectionDSL.g:509:4: ( (lv_under_2_0= ruleUnder ) ) ( (lv_node_3_0= ruleNode ) )
                    {
                    // InternalCloneDetectionDSL.g:509:4: ( (lv_under_2_0= ruleUnder ) )
                    // InternalCloneDetectionDSL.g:510:5: (lv_under_2_0= ruleUnder )
                    {
                    // InternalCloneDetectionDSL.g:510:5: (lv_under_2_0= ruleUnder )
                    // InternalCloneDetectionDSL.g:511:6: lv_under_2_0= ruleUnder
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNodeAccess().getUnderUnderEnumRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_5);
                    lv_under_2_0=ruleUnder();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    // InternalCloneDetectionDSL.g:528:4: ( (lv_node_3_0= ruleNode ) )
                    // InternalCloneDetectionDSL.g:529:5: (lv_node_3_0= ruleNode )
                    {
                    // InternalCloneDetectionDSL.g:529:5: (lv_node_3_0= ruleNode )
                    // InternalCloneDetectionDSL.g:530:6: lv_node_3_0= ruleNode
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNodeAccess().getNodeNodeParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_node_3_0=ruleNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleNodes"
    // InternalCloneDetectionDSL.g:552:1: entryRuleNodes returns [EObject current=null] : iv_ruleNodes= ruleNodes EOF ;
    public final EObject entryRuleNodes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodes = null;


        try {
            // InternalCloneDetectionDSL.g:552:46: (iv_ruleNodes= ruleNodes EOF )
            // InternalCloneDetectionDSL.g:553:2: iv_ruleNodes= ruleNodes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNodes=ruleNodes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodes; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalCloneDetectionDSL.g:559:1: ruleNodes returns [EObject current=null] : ( ( (lv_node_0_0= ruleNode ) ) (otherlv_1= ',' ( (lv_nodes_2_0= ruleNodes ) ) )? ) ;
    public final EObject ruleNodes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_node_0_0 = null;

        EObject lv_nodes_2_0 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:565:2: ( ( ( (lv_node_0_0= ruleNode ) ) (otherlv_1= ',' ( (lv_nodes_2_0= ruleNodes ) ) )? ) )
            // InternalCloneDetectionDSL.g:566:2: ( ( (lv_node_0_0= ruleNode ) ) (otherlv_1= ',' ( (lv_nodes_2_0= ruleNodes ) ) )? )
            {
            // InternalCloneDetectionDSL.g:566:2: ( ( (lv_node_0_0= ruleNode ) ) (otherlv_1= ',' ( (lv_nodes_2_0= ruleNodes ) ) )? )
            // InternalCloneDetectionDSL.g:567:3: ( (lv_node_0_0= ruleNode ) ) (otherlv_1= ',' ( (lv_nodes_2_0= ruleNodes ) ) )?
            {
            // InternalCloneDetectionDSL.g:567:3: ( (lv_node_0_0= ruleNode ) )
            // InternalCloneDetectionDSL.g:568:4: (lv_node_0_0= ruleNode )
            {
            // InternalCloneDetectionDSL.g:568:4: (lv_node_0_0= ruleNode )
            // InternalCloneDetectionDSL.g:569:5: lv_node_0_0= ruleNode
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNodesAccess().getNodeNodeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_node_0_0=ruleNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // InternalCloneDetectionDSL.g:586:3: (otherlv_1= ',' ( (lv_nodes_2_0= ruleNodes ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCloneDetectionDSL.g:587:4: otherlv_1= ',' ( (lv_nodes_2_0= ruleNodes ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getNodesAccess().getCommaKeyword_1_0());
                      			
                    }
                    // InternalCloneDetectionDSL.g:591:4: ( (lv_nodes_2_0= ruleNodes ) )
                    // InternalCloneDetectionDSL.g:592:5: (lv_nodes_2_0= ruleNodes )
                    {
                    // InternalCloneDetectionDSL.g:592:5: (lv_nodes_2_0= ruleNodes )
                    // InternalCloneDetectionDSL.g:593:6: lv_nodes_2_0= ruleNodes
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNodesAccess().getNodesNodesParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_nodes_2_0=ruleNodes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNodes"


    // $ANTLR start "entryRuleMinSize"
    // InternalCloneDetectionDSL.g:615:1: entryRuleMinSize returns [EObject current=null] : iv_ruleMinSize= ruleMinSize EOF ;
    public final EObject entryRuleMinSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinSize = null;


        try {
            // InternalCloneDetectionDSL.g:615:48: (iv_ruleMinSize= ruleMinSize EOF )
            // InternalCloneDetectionDSL.g:616:2: iv_ruleMinSize= ruleMinSize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinSizeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMinSize=ruleMinSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinSize; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalCloneDetectionDSL.g:622:1: ruleMinSize returns [EObject current=null] : (otherlv_0= 'Size' ( ( (lv_expr_1_0= ruleMetricExpr ) ) | (otherlv_2= '(' ( (lv_brackets_3_0= ruleMinSize ) ) otherlv_4= ')' ) ) ( ( (lv_operator_5_0= ruleBoolOperator ) ) ( (lv_size_6_0= ruleMinSize ) ) )? ) ;
    public final EObject ruleMinSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_1_0 = null;

        EObject lv_brackets_3_0 = null;

        Enumerator lv_operator_5_0 = null;

        EObject lv_size_6_0 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:628:2: ( (otherlv_0= 'Size' ( ( (lv_expr_1_0= ruleMetricExpr ) ) | (otherlv_2= '(' ( (lv_brackets_3_0= ruleMinSize ) ) otherlv_4= ')' ) ) ( ( (lv_operator_5_0= ruleBoolOperator ) ) ( (lv_size_6_0= ruleMinSize ) ) )? ) )
            // InternalCloneDetectionDSL.g:629:2: (otherlv_0= 'Size' ( ( (lv_expr_1_0= ruleMetricExpr ) ) | (otherlv_2= '(' ( (lv_brackets_3_0= ruleMinSize ) ) otherlv_4= ')' ) ) ( ( (lv_operator_5_0= ruleBoolOperator ) ) ( (lv_size_6_0= ruleMinSize ) ) )? )
            {
            // InternalCloneDetectionDSL.g:629:2: (otherlv_0= 'Size' ( ( (lv_expr_1_0= ruleMetricExpr ) ) | (otherlv_2= '(' ( (lv_brackets_3_0= ruleMinSize ) ) otherlv_4= ')' ) ) ( ( (lv_operator_5_0= ruleBoolOperator ) ) ( (lv_size_6_0= ruleMinSize ) ) )? )
            // InternalCloneDetectionDSL.g:630:3: otherlv_0= 'Size' ( ( (lv_expr_1_0= ruleMetricExpr ) ) | (otherlv_2= '(' ( (lv_brackets_3_0= ruleMinSize ) ) otherlv_4= ')' ) ) ( ( (lv_operator_5_0= ruleBoolOperator ) ) ( (lv_size_6_0= ruleMinSize ) ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMinSizeAccess().getSizeKeyword_0());
              		
            }
            // InternalCloneDetectionDSL.g:634:3: ( ( (lv_expr_1_0= ruleMetricExpr ) ) | (otherlv_2= '(' ( (lv_brackets_3_0= ruleMinSize ) ) otherlv_4= ')' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCloneDetectionDSL.g:635:4: ( (lv_expr_1_0= ruleMetricExpr ) )
                    {
                    // InternalCloneDetectionDSL.g:635:4: ( (lv_expr_1_0= ruleMetricExpr ) )
                    // InternalCloneDetectionDSL.g:636:5: (lv_expr_1_0= ruleMetricExpr )
                    {
                    // InternalCloneDetectionDSL.g:636:5: (lv_expr_1_0= ruleMetricExpr )
                    // InternalCloneDetectionDSL.g:637:6: lv_expr_1_0= ruleMetricExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMinSizeAccess().getExprMetricExprParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_expr_1_0=ruleMetricExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMinSizeRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_1_0,
                      							"com.simonbaars.cdd.CloneDetectionDSL.MetricExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:655:4: (otherlv_2= '(' ( (lv_brackets_3_0= ruleMinSize ) ) otherlv_4= ')' )
                    {
                    // InternalCloneDetectionDSL.g:655:4: (otherlv_2= '(' ( (lv_brackets_3_0= ruleMinSize ) ) otherlv_4= ')' )
                    // InternalCloneDetectionDSL.g:656:5: otherlv_2= '(' ( (lv_brackets_3_0= ruleMinSize ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getMinSizeAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalCloneDetectionDSL.g:660:5: ( (lv_brackets_3_0= ruleMinSize ) )
                    // InternalCloneDetectionDSL.g:661:6: (lv_brackets_3_0= ruleMinSize )
                    {
                    // InternalCloneDetectionDSL.g:661:6: (lv_brackets_3_0= ruleMinSize )
                    // InternalCloneDetectionDSL.g:662:7: lv_brackets_3_0= ruleMinSize
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMinSizeAccess().getBracketsMinSizeParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_13);
                    lv_brackets_3_0=ruleMinSize();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getMinSizeRule());
                      							}
                      							set(
                      								current,
                      								"brackets",
                      								lv_brackets_3_0,
                      								"com.simonbaars.cdd.CloneDetectionDSL.MinSize");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getMinSizeAccess().getRightParenthesisKeyword_1_1_2());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCloneDetectionDSL.g:685:3: ( ( (lv_operator_5_0= ruleBoolOperator ) ) ( (lv_size_6_0= ruleMinSize ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=40 && LA9_0<=41)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCloneDetectionDSL.g:686:4: ( (lv_operator_5_0= ruleBoolOperator ) ) ( (lv_size_6_0= ruleMinSize ) )
                    {
                    // InternalCloneDetectionDSL.g:686:4: ( (lv_operator_5_0= ruleBoolOperator ) )
                    // InternalCloneDetectionDSL.g:687:5: (lv_operator_5_0= ruleBoolOperator )
                    {
                    // InternalCloneDetectionDSL.g:687:5: (lv_operator_5_0= ruleBoolOperator )
                    // InternalCloneDetectionDSL.g:688:6: lv_operator_5_0= ruleBoolOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMinSizeAccess().getOperatorBoolOperatorEnumRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_operator_5_0=ruleBoolOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMinSizeRule());
                      						}
                      						set(
                      							current,
                      							"operator",
                      							lv_operator_5_0,
                      							"com.simonbaars.cdd.CloneDetectionDSL.BoolOperator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCloneDetectionDSL.g:705:4: ( (lv_size_6_0= ruleMinSize ) )
                    // InternalCloneDetectionDSL.g:706:5: (lv_size_6_0= ruleMinSize )
                    {
                    // InternalCloneDetectionDSL.g:706:5: (lv_size_6_0= ruleMinSize )
                    // InternalCloneDetectionDSL.g:707:6: lv_size_6_0= ruleMinSize
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMinSizeAccess().getSizeMinSizeParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_size_6_0=ruleMinSize();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMinSizeRule());
                      						}
                      						set(
                      							current,
                      							"size",
                      							lv_size_6_0,
                      							"com.simonbaars.cdd.CloneDetectionDSL.MinSize");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMinSize"


    // $ANTLR start "entryRuleMetricExpr"
    // InternalCloneDetectionDSL.g:729:1: entryRuleMetricExpr returns [EObject current=null] : iv_ruleMetricExpr= ruleMetricExpr EOF ;
    public final EObject entryRuleMetricExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetricExpr = null;


        try {
            // InternalCloneDetectionDSL.g:729:51: (iv_ruleMetricExpr= ruleMetricExpr EOF )
            // InternalCloneDetectionDSL.g:730:2: iv_ruleMetricExpr= ruleMetricExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetricExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMetricExpr=ruleMetricExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetricExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalCloneDetectionDSL.g:736:1: ruleMetricExpr returns [EObject current=null] : ( ( (lv_amount_0_0= RULE_INT ) ) ( (lv_metric_1_0= ruleSizeMetric ) ) ) ;
    public final EObject ruleMetricExpr() throws RecognitionException {
        EObject current = null;

        Token lv_amount_0_0=null;
        Enumerator lv_metric_1_0 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:742:2: ( ( ( (lv_amount_0_0= RULE_INT ) ) ( (lv_metric_1_0= ruleSizeMetric ) ) ) )
            // InternalCloneDetectionDSL.g:743:2: ( ( (lv_amount_0_0= RULE_INT ) ) ( (lv_metric_1_0= ruleSizeMetric ) ) )
            {
            // InternalCloneDetectionDSL.g:743:2: ( ( (lv_amount_0_0= RULE_INT ) ) ( (lv_metric_1_0= ruleSizeMetric ) ) )
            // InternalCloneDetectionDSL.g:744:3: ( (lv_amount_0_0= RULE_INT ) ) ( (lv_metric_1_0= ruleSizeMetric ) )
            {
            // InternalCloneDetectionDSL.g:744:3: ( (lv_amount_0_0= RULE_INT ) )
            // InternalCloneDetectionDSL.g:745:4: (lv_amount_0_0= RULE_INT )
            {
            // InternalCloneDetectionDSL.g:745:4: (lv_amount_0_0= RULE_INT )
            // InternalCloneDetectionDSL.g:746:5: lv_amount_0_0= RULE_INT
            {
            lv_amount_0_0=(Token)match(input,RULE_INT,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_amount_0_0, grammarAccess.getMetricExprAccess().getAmountINTTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            // InternalCloneDetectionDSL.g:762:3: ( (lv_metric_1_0= ruleSizeMetric ) )
            // InternalCloneDetectionDSL.g:763:4: (lv_metric_1_0= ruleSizeMetric )
            {
            // InternalCloneDetectionDSL.g:763:4: (lv_metric_1_0= ruleSizeMetric )
            // InternalCloneDetectionDSL.g:764:5: lv_metric_1_0= ruleSizeMetric
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMetricExprAccess().getMetricSizeMetricEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_metric_1_0=ruleSizeMetric();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMetricExpr"


    // $ANTLR start "entryRuleDoNotCompare"
    // InternalCloneDetectionDSL.g:785:1: entryRuleDoNotCompare returns [EObject current=null] : iv_ruleDoNotCompare= ruleDoNotCompare EOF ;
    public final EObject entryRuleDoNotCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoNotCompare = null;


        try {
            // InternalCloneDetectionDSL.g:785:53: (iv_ruleDoNotCompare= ruleDoNotCompare EOF )
            // InternalCloneDetectionDSL.g:786:2: iv_ruleDoNotCompare= ruleDoNotCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoNotCompareRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDoNotCompare=ruleDoNotCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoNotCompare; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalCloneDetectionDSL.g:792:1: ruleDoNotCompare returns [EObject current=null] : (otherlv_0= 'DoNotCompare' this_Nodes_1= ruleNodes ) ;
    public final EObject ruleDoNotCompare() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Nodes_1 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:798:2: ( (otherlv_0= 'DoNotCompare' this_Nodes_1= ruleNodes ) )
            // InternalCloneDetectionDSL.g:799:2: (otherlv_0= 'DoNotCompare' this_Nodes_1= ruleNodes )
            {
            // InternalCloneDetectionDSL.g:799:2: (otherlv_0= 'DoNotCompare' this_Nodes_1= ruleNodes )
            // InternalCloneDetectionDSL.g:800:3: otherlv_0= 'DoNotCompare' this_Nodes_1= ruleNodes
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDoNotCompareAccess().getDoNotCompareKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDoNotCompareAccess().getNodesParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_Nodes_1=ruleNodes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Nodes_1;
              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDoNotCompare"


    // $ANTLR start "entryRuleCompare"
    // InternalCloneDetectionDSL.g:816:1: entryRuleCompare returns [EObject current=null] : iv_ruleCompare= ruleCompare EOF ;
    public final EObject entryRuleCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompare = null;


        try {
            // InternalCloneDetectionDSL.g:816:48: (iv_ruleCompare= ruleCompare EOF )
            // InternalCloneDetectionDSL.g:817:2: iv_ruleCompare= ruleCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCompare=ruleCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompare; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalCloneDetectionDSL.g:823:1: ruleCompare returns [EObject current=null] : (otherlv_0= 'Compare' ( (lv_nodes_1_0= ruleNodes ) ) ( (lv_comparisonMethod_2_0= ruleMethod ) ) ( (lv_deepestNode_3_0= ruleNode ) )? ( (lv_perc_4_0= rulePercentage ) )? ) ;
    public final EObject ruleCompare() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_nodes_1_0 = null;

        Enumerator lv_comparisonMethod_2_0 = null;

        EObject lv_deepestNode_3_0 = null;

        AntlrDatatypeRuleToken lv_perc_4_0 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:829:2: ( (otherlv_0= 'Compare' ( (lv_nodes_1_0= ruleNodes ) ) ( (lv_comparisonMethod_2_0= ruleMethod ) ) ( (lv_deepestNode_3_0= ruleNode ) )? ( (lv_perc_4_0= rulePercentage ) )? ) )
            // InternalCloneDetectionDSL.g:830:2: (otherlv_0= 'Compare' ( (lv_nodes_1_0= ruleNodes ) ) ( (lv_comparisonMethod_2_0= ruleMethod ) ) ( (lv_deepestNode_3_0= ruleNode ) )? ( (lv_perc_4_0= rulePercentage ) )? )
            {
            // InternalCloneDetectionDSL.g:830:2: (otherlv_0= 'Compare' ( (lv_nodes_1_0= ruleNodes ) ) ( (lv_comparisonMethod_2_0= ruleMethod ) ) ( (lv_deepestNode_3_0= ruleNode ) )? ( (lv_perc_4_0= rulePercentage ) )? )
            // InternalCloneDetectionDSL.g:831:3: otherlv_0= 'Compare' ( (lv_nodes_1_0= ruleNodes ) ) ( (lv_comparisonMethod_2_0= ruleMethod ) ) ( (lv_deepestNode_3_0= ruleNode ) )? ( (lv_perc_4_0= rulePercentage ) )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCompareAccess().getCompareKeyword_0());
              		
            }
            // InternalCloneDetectionDSL.g:835:3: ( (lv_nodes_1_0= ruleNodes ) )
            // InternalCloneDetectionDSL.g:836:4: (lv_nodes_1_0= ruleNodes )
            {
            // InternalCloneDetectionDSL.g:836:4: (lv_nodes_1_0= ruleNodes )
            // InternalCloneDetectionDSL.g:837:5: lv_nodes_1_0= ruleNodes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCompareAccess().getNodesNodesParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_nodes_1_0=ruleNodes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // InternalCloneDetectionDSL.g:854:3: ( (lv_comparisonMethod_2_0= ruleMethod ) )
            // InternalCloneDetectionDSL.g:855:4: (lv_comparisonMethod_2_0= ruleMethod )
            {
            // InternalCloneDetectionDSL.g:855:4: (lv_comparisonMethod_2_0= ruleMethod )
            // InternalCloneDetectionDSL.g:856:5: lv_comparisonMethod_2_0= ruleMethod
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCompareAccess().getComparisonMethodMethodEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_comparisonMethod_2_0=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // InternalCloneDetectionDSL.g:873:3: ( (lv_deepestNode_3_0= ruleNode ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCloneDetectionDSL.g:874:4: (lv_deepestNode_3_0= ruleNode )
                    {
                    // InternalCloneDetectionDSL.g:874:4: (lv_deepestNode_3_0= ruleNode )
                    // InternalCloneDetectionDSL.g:875:5: lv_deepestNode_3_0= ruleNode
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCompareAccess().getDeepestNodeNodeParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_17);
                    lv_deepestNode_3_0=ruleNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }

            // InternalCloneDetectionDSL.g:892:3: ( (lv_perc_4_0= rulePercentage ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCloneDetectionDSL.g:893:4: (lv_perc_4_0= rulePercentage )
                    {
                    // InternalCloneDetectionDSL.g:893:4: (lv_perc_4_0= rulePercentage )
                    // InternalCloneDetectionDSL.g:894:5: lv_perc_4_0= rulePercentage
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCompareAccess().getPercPercentageParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_perc_4_0=rulePercentage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCompare"


    // $ANTLR start "entryRulePercentage"
    // InternalCloneDetectionDSL.g:915:1: entryRulePercentage returns [String current=null] : iv_rulePercentage= rulePercentage EOF ;
    public final String entryRulePercentage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePercentage = null;


        try {
            // InternalCloneDetectionDSL.g:915:50: (iv_rulePercentage= rulePercentage EOF )
            // InternalCloneDetectionDSL.g:916:2: iv_rulePercentage= rulePercentage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPercentageRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePercentage=rulePercentage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePercentage.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalCloneDetectionDSL.g:922:1: rulePercentage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '%' ) ;
    public final AntlrDatatypeRuleToken rulePercentage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:928:2: ( (this_INT_0= RULE_INT kw= '%' ) )
            // InternalCloneDetectionDSL.g:929:2: (this_INT_0= RULE_INT kw= '%' )
            {
            // InternalCloneDetectionDSL.g:929:2: (this_INT_0= RULE_INT kw= '%' )
            // InternalCloneDetectionDSL.g:930:3: this_INT_0= RULE_INT kw= '%'
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getPercentageAccess().getINTTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getPercentageAccess().getPercentSignKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePercentage"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalCloneDetectionDSL.g:946:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // InternalCloneDetectionDSL.g:946:58: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // InternalCloneDetectionDSL.g:947:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalCloneDetectionDSL.g:953:1: ruleBooleanExpression returns [EObject current=null] : this_BooleanExpressionLevel1_0= ruleBooleanExpressionLevel1 ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanExpressionLevel1_0 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:959:2: (this_BooleanExpressionLevel1_0= ruleBooleanExpressionLevel1 )
            // InternalCloneDetectionDSL.g:960:2: this_BooleanExpressionLevel1_0= ruleBooleanExpressionLevel1
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getBooleanExpressionAccess().getBooleanExpressionLevel1ParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_BooleanExpressionLevel1_0=ruleBooleanExpressionLevel1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_BooleanExpressionLevel1_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleBooleanExpressionLevel1"
    // InternalCloneDetectionDSL.g:971:1: entryRuleBooleanExpressionLevel1 returns [EObject current=null] : iv_ruleBooleanExpressionLevel1= ruleBooleanExpressionLevel1 EOF ;
    public final EObject entryRuleBooleanExpressionLevel1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpressionLevel1 = null;


        try {
            // InternalCloneDetectionDSL.g:971:64: (iv_ruleBooleanExpressionLevel1= ruleBooleanExpressionLevel1 EOF )
            // InternalCloneDetectionDSL.g:972:2: iv_ruleBooleanExpressionLevel1= ruleBooleanExpressionLevel1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionLevel1Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpressionLevel1=ruleBooleanExpressionLevel1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpressionLevel1; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanExpressionLevel1"


    // $ANTLR start "ruleBooleanExpressionLevel1"
    // InternalCloneDetectionDSL.g:978:1: ruleBooleanExpressionLevel1 returns [EObject current=null] : (this_BooleanExpressionLevel2_0= ruleBooleanExpressionLevel2 ( () ( (lv_bop_2_0= ruleBinaryBooleanOperator ) ) ( (lv_right_3_0= ruleBooleanExpressionLevel2 ) ) )* ) ;
    public final EObject ruleBooleanExpressionLevel1() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanExpressionLevel2_0 = null;

        Enumerator lv_bop_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:984:2: ( (this_BooleanExpressionLevel2_0= ruleBooleanExpressionLevel2 ( () ( (lv_bop_2_0= ruleBinaryBooleanOperator ) ) ( (lv_right_3_0= ruleBooleanExpressionLevel2 ) ) )* ) )
            // InternalCloneDetectionDSL.g:985:2: (this_BooleanExpressionLevel2_0= ruleBooleanExpressionLevel2 ( () ( (lv_bop_2_0= ruleBinaryBooleanOperator ) ) ( (lv_right_3_0= ruleBooleanExpressionLevel2 ) ) )* )
            {
            // InternalCloneDetectionDSL.g:985:2: (this_BooleanExpressionLevel2_0= ruleBooleanExpressionLevel2 ( () ( (lv_bop_2_0= ruleBinaryBooleanOperator ) ) ( (lv_right_3_0= ruleBooleanExpressionLevel2 ) ) )* )
            // InternalCloneDetectionDSL.g:986:3: this_BooleanExpressionLevel2_0= ruleBooleanExpressionLevel2 ( () ( (lv_bop_2_0= ruleBinaryBooleanOperator ) ) ( (lv_right_3_0= ruleBooleanExpressionLevel2 ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBooleanExpressionLevel1Access().getBooleanExpressionLevel2ParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_19);
            this_BooleanExpressionLevel2_0=ruleBooleanExpressionLevel2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BooleanExpressionLevel2_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCloneDetectionDSL.g:994:3: ( () ( (lv_bop_2_0= ruleBinaryBooleanOperator ) ) ( (lv_right_3_0= ruleBooleanExpressionLevel2 ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=53 && LA12_0<=54)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCloneDetectionDSL.g:995:4: () ( (lv_bop_2_0= ruleBinaryBooleanOperator ) ) ( (lv_right_3_0= ruleBooleanExpressionLevel2 ) )
            	    {
            	    // InternalCloneDetectionDSL.g:995:4: ()
            	    // InternalCloneDetectionDSL.g:996:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getBooleanExpressionLevel1Access().getExpressionBinOpLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalCloneDetectionDSL.g:1002:4: ( (lv_bop_2_0= ruleBinaryBooleanOperator ) )
            	    // InternalCloneDetectionDSL.g:1003:5: (lv_bop_2_0= ruleBinaryBooleanOperator )
            	    {
            	    // InternalCloneDetectionDSL.g:1003:5: (lv_bop_2_0= ruleBinaryBooleanOperator )
            	    // InternalCloneDetectionDSL.g:1004:6: lv_bop_2_0= ruleBinaryBooleanOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBooleanExpressionLevel1Access().getBopBinaryBooleanOperatorEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_bop_2_0=ruleBinaryBooleanOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBooleanExpressionLevel1Rule());
            	      						}
            	      						set(
            	      							current,
            	      							"bop",
            	      							lv_bop_2_0,
            	      							"com.simonbaars.cdd.CloneDetectionDSL.BinaryBooleanOperator");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalCloneDetectionDSL.g:1021:4: ( (lv_right_3_0= ruleBooleanExpressionLevel2 ) )
            	    // InternalCloneDetectionDSL.g:1022:5: (lv_right_3_0= ruleBooleanExpressionLevel2 )
            	    {
            	    // InternalCloneDetectionDSL.g:1022:5: (lv_right_3_0= ruleBooleanExpressionLevel2 )
            	    // InternalCloneDetectionDSL.g:1023:6: lv_right_3_0= ruleBooleanExpressionLevel2
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBooleanExpressionLevel1Access().getRightBooleanExpressionLevel2ParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_right_3_0=ruleBooleanExpressionLevel2();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBooleanExpressionLevel1Rule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"com.simonbaars.cdd.CloneDetectionDSL.BooleanExpressionLevel2");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBooleanExpressionLevel1"


    // $ANTLR start "entryRuleBooleanExpressionLevel2"
    // InternalCloneDetectionDSL.g:1045:1: entryRuleBooleanExpressionLevel2 returns [EObject current=null] : iv_ruleBooleanExpressionLevel2= ruleBooleanExpressionLevel2 EOF ;
    public final EObject entryRuleBooleanExpressionLevel2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpressionLevel2 = null;


        try {
            // InternalCloneDetectionDSL.g:1045:64: (iv_ruleBooleanExpressionLevel2= ruleBooleanExpressionLevel2 EOF )
            // InternalCloneDetectionDSL.g:1046:2: iv_ruleBooleanExpressionLevel2= ruleBooleanExpressionLevel2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionLevel2Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpressionLevel2=ruleBooleanExpressionLevel2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpressionLevel2; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanExpressionLevel2"


    // $ANTLR start "ruleBooleanExpressionLevel2"
    // InternalCloneDetectionDSL.g:1052:1: ruleBooleanExpressionLevel2 returns [EObject current=null] : (this_NotExpression_0= ruleNotExpression | this_BooleanExpressionLevel3_1= ruleBooleanExpressionLevel3 ) ;
    public final EObject ruleBooleanExpressionLevel2() throws RecognitionException {
        EObject current = null;

        EObject this_NotExpression_0 = null;

        EObject this_BooleanExpressionLevel3_1 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:1058:2: ( (this_NotExpression_0= ruleNotExpression | this_BooleanExpressionLevel3_1= ruleBooleanExpressionLevel3 ) )
            // InternalCloneDetectionDSL.g:1059:2: (this_NotExpression_0= ruleNotExpression | this_BooleanExpressionLevel3_1= ruleBooleanExpressionLevel3 )
            {
            // InternalCloneDetectionDSL.g:1059:2: (this_NotExpression_0= ruleNotExpression | this_BooleanExpressionLevel3_1= ruleBooleanExpressionLevel3 )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=RULE_INT && LA13_0<=RULE_BOOL_LITERAL)||LA13_0==19||(LA13_0>=25 && LA13_0<=26)||(LA13_0>=48 && LA13_0<=52)) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1060:3: this_NotExpression_0= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBooleanExpressionLevel2Access().getNotExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NotExpression_0=ruleNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NotExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:1069:3: this_BooleanExpressionLevel3_1= ruleBooleanExpressionLevel3
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBooleanExpressionLevel2Access().getBooleanExpressionLevel3ParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanExpressionLevel3_1=ruleBooleanExpressionLevel3();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanExpressionLevel3_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBooleanExpressionLevel2"


    // $ANTLR start "entryRuleNotExpression"
    // InternalCloneDetectionDSL.g:1081:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // InternalCloneDetectionDSL.g:1081:54: (iv_ruleNotExpression= ruleNotExpression EOF )
            // InternalCloneDetectionDSL.g:1082:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // InternalCloneDetectionDSL.g:1088:1: ruleNotExpression returns [EObject current=null] : (otherlv_0= 'NOT' ( (lv_sub_1_0= ruleBooleanExpressionLevel3 ) ) ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:1094:2: ( (otherlv_0= 'NOT' ( (lv_sub_1_0= ruleBooleanExpressionLevel3 ) ) ) )
            // InternalCloneDetectionDSL.g:1095:2: (otherlv_0= 'NOT' ( (lv_sub_1_0= ruleBooleanExpressionLevel3 ) ) )
            {
            // InternalCloneDetectionDSL.g:1095:2: (otherlv_0= 'NOT' ( (lv_sub_1_0= ruleBooleanExpressionLevel3 ) ) )
            // InternalCloneDetectionDSL.g:1096:3: otherlv_0= 'NOT' ( (lv_sub_1_0= ruleBooleanExpressionLevel3 ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNotExpressionAccess().getNOTKeyword_0());
              		
            }
            // InternalCloneDetectionDSL.g:1100:3: ( (lv_sub_1_0= ruleBooleanExpressionLevel3 ) )
            // InternalCloneDetectionDSL.g:1101:4: (lv_sub_1_0= ruleBooleanExpressionLevel3 )
            {
            // InternalCloneDetectionDSL.g:1101:4: (lv_sub_1_0= ruleBooleanExpressionLevel3 )
            // InternalCloneDetectionDSL.g:1102:5: lv_sub_1_0= ruleBooleanExpressionLevel3
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNotExpressionAccess().getSubBooleanExpressionLevel3ParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_sub_1_0=ruleBooleanExpressionLevel3();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNotExpressionRule());
              					}
              					set(
              						current,
              						"sub",
              						lv_sub_1_0,
              						"com.simonbaars.cdd.CloneDetectionDSL.BooleanExpressionLevel3");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleBooleanExpressionLevel3"
    // InternalCloneDetectionDSL.g:1123:1: entryRuleBooleanExpressionLevel3 returns [EObject current=null] : iv_ruleBooleanExpressionLevel3= ruleBooleanExpressionLevel3 EOF ;
    public final EObject entryRuleBooleanExpressionLevel3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpressionLevel3 = null;


        try {
            // InternalCloneDetectionDSL.g:1123:64: (iv_ruleBooleanExpressionLevel3= ruleBooleanExpressionLevel3 EOF )
            // InternalCloneDetectionDSL.g:1124:2: iv_ruleBooleanExpressionLevel3= ruleBooleanExpressionLevel3 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionLevel3Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpressionLevel3=ruleBooleanExpressionLevel3();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpressionLevel3; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanExpressionLevel3"


    // $ANTLR start "ruleBooleanExpressionLevel3"
    // InternalCloneDetectionDSL.g:1130:1: ruleBooleanExpressionLevel3 returns [EObject current=null] : ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) | this_BooleanExpressionBracket_1= ruleBooleanExpressionBracket | this_BooleanExpressionConstant_2= ruleBooleanExpressionConstant ) ;
    public final EObject ruleBooleanExpressionLevel3() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonExpression_0 = null;

        EObject this_BooleanExpressionBracket_1 = null;

        EObject this_BooleanExpressionConstant_2 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:1136:2: ( ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) | this_BooleanExpressionBracket_1= ruleBooleanExpressionBracket | this_BooleanExpressionConstant_2= ruleBooleanExpressionConstant ) )
            // InternalCloneDetectionDSL.g:1137:2: ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) | this_BooleanExpressionBracket_1= ruleBooleanExpressionBracket | this_BooleanExpressionConstant_2= ruleBooleanExpressionConstant )
            {
            // InternalCloneDetectionDSL.g:1137:2: ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) | this_BooleanExpressionBracket_1= ruleBooleanExpressionBracket | this_BooleanExpressionConstant_2= ruleBooleanExpressionConstant )
            int alt14=3;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1138:3: ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression )
                    {
                    // InternalCloneDetectionDSL.g:1138:3: ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression )
                    // InternalCloneDetectionDSL.g:1139:4: ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getBooleanExpressionLevel3Access().getComparisonExpressionParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ComparisonExpression_0=ruleComparisonExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ComparisonExpression_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:1150:3: this_BooleanExpressionBracket_1= ruleBooleanExpressionBracket
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionBracketParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanExpressionBracket_1=ruleBooleanExpressionBracket();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanExpressionBracket_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCloneDetectionDSL.g:1159:3: this_BooleanExpressionConstant_2= ruleBooleanExpressionConstant
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionConstantParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanExpressionConstant_2=ruleBooleanExpressionConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanExpressionConstant_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBooleanExpressionLevel3"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalCloneDetectionDSL.g:1171:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalCloneDetectionDSL.g:1171:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalCloneDetectionDSL.g:1172:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalCloneDetectionDSL.g:1178:1: ruleComparisonExpression returns [EObject current=null] : ( () ( (lv_left_1_0= ruleIntExpression ) ) ( (lv_op_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleIntExpression ) ) ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_1_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:1184:2: ( ( () ( (lv_left_1_0= ruleIntExpression ) ) ( (lv_op_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleIntExpression ) ) ) )
            // InternalCloneDetectionDSL.g:1185:2: ( () ( (lv_left_1_0= ruleIntExpression ) ) ( (lv_op_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleIntExpression ) ) )
            {
            // InternalCloneDetectionDSL.g:1185:2: ( () ( (lv_left_1_0= ruleIntExpression ) ) ( (lv_op_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleIntExpression ) ) )
            // InternalCloneDetectionDSL.g:1186:3: () ( (lv_left_1_0= ruleIntExpression ) ) ( (lv_op_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleIntExpression ) )
            {
            // InternalCloneDetectionDSL.g:1186:3: ()
            // InternalCloneDetectionDSL.g:1187:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getComparisonExpressionAccess().getExpressionCompOpAction_0(),
              					current);
              			
            }

            }

            // InternalCloneDetectionDSL.g:1193:3: ( (lv_left_1_0= ruleIntExpression ) )
            // InternalCloneDetectionDSL.g:1194:4: (lv_left_1_0= ruleIntExpression )
            {
            // InternalCloneDetectionDSL.g:1194:4: (lv_left_1_0= ruleIntExpression )
            // InternalCloneDetectionDSL.g:1195:5: lv_left_1_0= ruleIntExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComparisonExpressionAccess().getLeftIntExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_left_1_0=ruleIntExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_1_0,
              						"com.simonbaars.cdd.CloneDetectionDSL.IntExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCloneDetectionDSL.g:1212:3: ( (lv_op_2_0= ruleCompareOperator ) )
            // InternalCloneDetectionDSL.g:1213:4: (lv_op_2_0= ruleCompareOperator )
            {
            // InternalCloneDetectionDSL.g:1213:4: (lv_op_2_0= ruleCompareOperator )
            // InternalCloneDetectionDSL.g:1214:5: lv_op_2_0= ruleCompareOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComparisonExpressionAccess().getOpCompareOperatorEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_op_2_0=ruleCompareOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_2_0,
              						"com.simonbaars.cdd.CloneDetectionDSL.CompareOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCloneDetectionDSL.g:1231:3: ( (lv_right_3_0= ruleIntExpression ) )
            // InternalCloneDetectionDSL.g:1232:4: (lv_right_3_0= ruleIntExpression )
            {
            // InternalCloneDetectionDSL.g:1232:4: (lv_right_3_0= ruleIntExpression )
            // InternalCloneDetectionDSL.g:1233:5: lv_right_3_0= ruleIntExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightIntExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_right_3_0=ruleIntExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_3_0,
              						"com.simonbaars.cdd.CloneDetectionDSL.IntExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleBooleanExpressionBracket"
    // InternalCloneDetectionDSL.g:1254:1: entryRuleBooleanExpressionBracket returns [EObject current=null] : iv_ruleBooleanExpressionBracket= ruleBooleanExpressionBracket EOF ;
    public final EObject entryRuleBooleanExpressionBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpressionBracket = null;


        try {
            // InternalCloneDetectionDSL.g:1254:65: (iv_ruleBooleanExpressionBracket= ruleBooleanExpressionBracket EOF )
            // InternalCloneDetectionDSL.g:1255:2: iv_ruleBooleanExpressionBracket= ruleBooleanExpressionBracket EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionBracketRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpressionBracket=ruleBooleanExpressionBracket();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpressionBracket; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanExpressionBracket"


    // $ANTLR start "ruleBooleanExpressionBracket"
    // InternalCloneDetectionDSL.g:1261:1: ruleBooleanExpressionBracket returns [EObject current=null] : (otherlv_0= '(' ( (lv_sub_1_0= ruleBooleanExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleBooleanExpressionBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:1267:2: ( (otherlv_0= '(' ( (lv_sub_1_0= ruleBooleanExpression ) ) otherlv_2= ')' ) )
            // InternalCloneDetectionDSL.g:1268:2: (otherlv_0= '(' ( (lv_sub_1_0= ruleBooleanExpression ) ) otherlv_2= ')' )
            {
            // InternalCloneDetectionDSL.g:1268:2: (otherlv_0= '(' ( (lv_sub_1_0= ruleBooleanExpression ) ) otherlv_2= ')' )
            // InternalCloneDetectionDSL.g:1269:3: otherlv_0= '(' ( (lv_sub_1_0= ruleBooleanExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBooleanExpressionBracketAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalCloneDetectionDSL.g:1273:3: ( (lv_sub_1_0= ruleBooleanExpression ) )
            // InternalCloneDetectionDSL.g:1274:4: (lv_sub_1_0= ruleBooleanExpression )
            {
            // InternalCloneDetectionDSL.g:1274:4: (lv_sub_1_0= ruleBooleanExpression )
            // InternalCloneDetectionDSL.g:1275:5: lv_sub_1_0= ruleBooleanExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBooleanExpressionBracketAccess().getSubBooleanExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_sub_1_0=ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBooleanExpressionBracketRule());
              					}
              					set(
              						current,
              						"sub",
              						lv_sub_1_0,
              						"com.simonbaars.cdd.CloneDetectionDSL.BooleanExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBooleanExpressionBracketAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBooleanExpressionBracket"


    // $ANTLR start "entryRuleBooleanExpressionConstant"
    // InternalCloneDetectionDSL.g:1300:1: entryRuleBooleanExpressionConstant returns [EObject current=null] : iv_ruleBooleanExpressionConstant= ruleBooleanExpressionConstant EOF ;
    public final EObject entryRuleBooleanExpressionConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpressionConstant = null;


        try {
            // InternalCloneDetectionDSL.g:1300:66: (iv_ruleBooleanExpressionConstant= ruleBooleanExpressionConstant EOF )
            // InternalCloneDetectionDSL.g:1301:2: iv_ruleBooleanExpressionConstant= ruleBooleanExpressionConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpressionConstant=ruleBooleanExpressionConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpressionConstant; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanExpressionConstant"


    // $ANTLR start "ruleBooleanExpressionConstant"
    // InternalCloneDetectionDSL.g:1307:1: ruleBooleanExpressionConstant returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOL_LITERAL ) ) ;
    public final EObject ruleBooleanExpressionConstant() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:1313:2: ( ( (lv_value_0_0= RULE_BOOL_LITERAL ) ) )
            // InternalCloneDetectionDSL.g:1314:2: ( (lv_value_0_0= RULE_BOOL_LITERAL ) )
            {
            // InternalCloneDetectionDSL.g:1314:2: ( (lv_value_0_0= RULE_BOOL_LITERAL ) )
            // InternalCloneDetectionDSL.g:1315:3: (lv_value_0_0= RULE_BOOL_LITERAL )
            {
            // InternalCloneDetectionDSL.g:1315:3: (lv_value_0_0= RULE_BOOL_LITERAL )
            // InternalCloneDetectionDSL.g:1316:4: lv_value_0_0= RULE_BOOL_LITERAL
            {
            lv_value_0_0=(Token)match(input,RULE_BOOL_LITERAL,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getBooleanExpressionConstantAccess().getValueBOOL_LITERALTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getBooleanExpressionConstantRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"com.simonbaars.cdd.CloneDetectionDSL.BOOL_LITERAL");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBooleanExpressionConstant"


    // $ANTLR start "entryRuleIntExpression"
    // InternalCloneDetectionDSL.g:1335:1: entryRuleIntExpression returns [EObject current=null] : iv_ruleIntExpression= ruleIntExpression EOF ;
    public final EObject entryRuleIntExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntExpression = null;


        try {
            // InternalCloneDetectionDSL.g:1335:54: (iv_ruleIntExpression= ruleIntExpression EOF )
            // InternalCloneDetectionDSL.g:1336:2: iv_ruleIntExpression= ruleIntExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntExpression=ruleIntExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntExpression"


    // $ANTLR start "ruleIntExpression"
    // InternalCloneDetectionDSL.g:1342:1: ruleIntExpression returns [EObject current=null] : this_ExpressionLevel1_0= ruleExpressionLevel1 ;
    public final EObject ruleIntExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionLevel1_0 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:1348:2: (this_ExpressionLevel1_0= ruleExpressionLevel1 )
            // InternalCloneDetectionDSL.g:1349:2: this_ExpressionLevel1_0= ruleExpressionLevel1
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getIntExpressionAccess().getExpressionLevel1ParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_ExpressionLevel1_0=ruleExpressionLevel1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_ExpressionLevel1_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIntExpression"


    // $ANTLR start "entryRuleExpressionLevel1"
    // InternalCloneDetectionDSL.g:1360:1: entryRuleExpressionLevel1 returns [EObject current=null] : iv_ruleExpressionLevel1= ruleExpressionLevel1 EOF ;
    public final EObject entryRuleExpressionLevel1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel1 = null;


        try {
            // InternalCloneDetectionDSL.g:1360:57: (iv_ruleExpressionLevel1= ruleExpressionLevel1 EOF )
            // InternalCloneDetectionDSL.g:1361:2: iv_ruleExpressionLevel1= ruleExpressionLevel1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLevel1Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel1=ruleExpressionLevel1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLevel1; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionLevel1"


    // $ANTLR start "ruleExpressionLevel1"
    // InternalCloneDetectionDSL.g:1367:1: ruleExpressionLevel1 returns [EObject current=null] : (this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) ) )* ) ;
    public final EObject ruleExpressionLevel1() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_ExpressionLevel2_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:1373:2: ( (this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) ) )* ) )
            // InternalCloneDetectionDSL.g:1374:2: (this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) ) )* )
            {
            // InternalCloneDetectionDSL.g:1374:2: (this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) ) )* )
            // InternalCloneDetectionDSL.g:1375:3: this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionLevel1Access().getExpressionLevel2ParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_23);
            this_ExpressionLevel2_0=ruleExpressionLevel2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ExpressionLevel2_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCloneDetectionDSL.g:1383:3: ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) ) )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==25) ) {
                    alt15=1;
                }
                else if ( (LA15_0==26) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCloneDetectionDSL.g:1384:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) )
            	    {
            	    // InternalCloneDetectionDSL.g:1384:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) )
            	    // InternalCloneDetectionDSL.g:1385:5: () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) )
            	    {
            	    // InternalCloneDetectionDSL.g:1385:5: ()
            	    // InternalCloneDetectionDSL.g:1386:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLevel1Access().getExpressionAdditionLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,25,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getExpressionLevel1Access().getPlusSignKeyword_1_0_1());
            	      				
            	    }
            	    // InternalCloneDetectionDSL.g:1396:5: ( (lv_right_3_0= ruleExpressionLevel2 ) )
            	    // InternalCloneDetectionDSL.g:1397:6: (lv_right_3_0= ruleExpressionLevel2 )
            	    {
            	    // InternalCloneDetectionDSL.g:1397:6: (lv_right_3_0= ruleExpressionLevel2 )
            	    // InternalCloneDetectionDSL.g:1398:7: lv_right_3_0= ruleExpressionLevel2
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_right_3_0=ruleExpressionLevel2();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLevel1Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_3_0,
            	      								"com.simonbaars.cdd.CloneDetectionDSL.ExpressionLevel2");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCloneDetectionDSL.g:1417:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) )
            	    {
            	    // InternalCloneDetectionDSL.g:1417:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) )
            	    // InternalCloneDetectionDSL.g:1418:5: () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) )
            	    {
            	    // InternalCloneDetectionDSL.g:1418:5: ()
            	    // InternalCloneDetectionDSL.g:1419:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLevel1Access().getExpressionSubtractionLeftAction_1_1_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_5=(Token)match(input,26,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getExpressionLevel1Access().getHyphenMinusKeyword_1_1_1());
            	      				
            	    }
            	    // InternalCloneDetectionDSL.g:1429:5: ( (lv_right_6_0= ruleExpressionLevel2 ) )
            	    // InternalCloneDetectionDSL.g:1430:6: (lv_right_6_0= ruleExpressionLevel2 )
            	    {
            	    // InternalCloneDetectionDSL.g:1430:6: (lv_right_6_0= ruleExpressionLevel2 )
            	    // InternalCloneDetectionDSL.g:1431:7: lv_right_6_0= ruleExpressionLevel2
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_1_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_right_6_0=ruleExpressionLevel2();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLevel1Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_6_0,
            	      								"com.simonbaars.cdd.CloneDetectionDSL.ExpressionLevel2");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionLevel1"


    // $ANTLR start "entryRuleExpressionLevel2"
    // InternalCloneDetectionDSL.g:1454:1: entryRuleExpressionLevel2 returns [EObject current=null] : iv_ruleExpressionLevel2= ruleExpressionLevel2 EOF ;
    public final EObject entryRuleExpressionLevel2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel2 = null;


        try {
            // InternalCloneDetectionDSL.g:1454:57: (iv_ruleExpressionLevel2= ruleExpressionLevel2 EOF )
            // InternalCloneDetectionDSL.g:1455:2: iv_ruleExpressionLevel2= ruleExpressionLevel2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLevel2Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel2=ruleExpressionLevel2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLevel2; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionLevel2"


    // $ANTLR start "ruleExpressionLevel2"
    // InternalCloneDetectionDSL.g:1461:1: ruleExpressionLevel2 returns [EObject current=null] : (this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) ) )* ) ;
    public final EObject ruleExpressionLevel2() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        EObject this_ExpressionLevel3_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_right_9_0 = null;

        EObject lv_right_12_0 = null;

        EObject lv_right_15_0 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:1467:2: ( (this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) ) )* ) )
            // InternalCloneDetectionDSL.g:1468:2: (this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) ) )* )
            {
            // InternalCloneDetectionDSL.g:1468:2: (this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) ) )* )
            // InternalCloneDetectionDSL.g:1469:3: this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionLevel2Access().getExpressionLevel3ParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_24);
            this_ExpressionLevel3_0=ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ExpressionLevel3_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCloneDetectionDSL.g:1477:3: ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) ) )*
            loop16:
            do {
                int alt16=6;
                switch ( input.LA(1) ) {
                case 16:
                    {
                    alt16=1;
                    }
                    break;
                case 27:
                    {
                    alt16=2;
                    }
                    break;
                case 28:
                    {
                    alt16=3;
                    }
                    break;
                case 29:
                    {
                    alt16=4;
                    }
                    break;
                case 30:
                    {
                    alt16=5;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // InternalCloneDetectionDSL.g:1478:4: ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )
            	    {
            	    // InternalCloneDetectionDSL.g:1478:4: ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )
            	    // InternalCloneDetectionDSL.g:1479:5: () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) )
            	    {
            	    // InternalCloneDetectionDSL.g:1479:5: ()
            	    // InternalCloneDetectionDSL.g:1480:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLevel2Access().getExpressionMultiplyLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getExpressionLevel2Access().getAsteriskKeyword_1_0_1());
            	      				
            	    }
            	    // InternalCloneDetectionDSL.g:1490:5: ( (lv_right_3_0= ruleExpressionLevel3 ) )
            	    // InternalCloneDetectionDSL.g:1491:6: (lv_right_3_0= ruleExpressionLevel3 )
            	    {
            	    // InternalCloneDetectionDSL.g:1491:6: (lv_right_3_0= ruleExpressionLevel3 )
            	    // InternalCloneDetectionDSL.g:1492:7: lv_right_3_0= ruleExpressionLevel3
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_right_3_0=ruleExpressionLevel3();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLevel2Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_3_0,
            	      								"com.simonbaars.cdd.CloneDetectionDSL.ExpressionLevel3");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCloneDetectionDSL.g:1511:4: ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) )
            	    {
            	    // InternalCloneDetectionDSL.g:1511:4: ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) )
            	    // InternalCloneDetectionDSL.g:1512:5: () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) )
            	    {
            	    // InternalCloneDetectionDSL.g:1512:5: ()
            	    // InternalCloneDetectionDSL.g:1513:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLevel2Access().getExpressionDivisionLeftAction_1_1_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_5=(Token)match(input,27,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getExpressionLevel2Access().getSolidusKeyword_1_1_1());
            	      				
            	    }
            	    // InternalCloneDetectionDSL.g:1523:5: ( (lv_right_6_0= ruleExpressionLevel3 ) )
            	    // InternalCloneDetectionDSL.g:1524:6: (lv_right_6_0= ruleExpressionLevel3 )
            	    {
            	    // InternalCloneDetectionDSL.g:1524:6: (lv_right_6_0= ruleExpressionLevel3 )
            	    // InternalCloneDetectionDSL.g:1525:7: lv_right_6_0= ruleExpressionLevel3
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_1_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_right_6_0=ruleExpressionLevel3();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLevel2Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_6_0,
            	      								"com.simonbaars.cdd.CloneDetectionDSL.ExpressionLevel3");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalCloneDetectionDSL.g:1544:4: ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) )
            	    {
            	    // InternalCloneDetectionDSL.g:1544:4: ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) )
            	    // InternalCloneDetectionDSL.g:1545:5: () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) )
            	    {
            	    // InternalCloneDetectionDSL.g:1545:5: ()
            	    // InternalCloneDetectionDSL.g:1546:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLevel2Access().getExpressionMaximumLeftAction_1_2_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_8=(Token)match(input,28,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_8, grammarAccess.getExpressionLevel2Access().getMaxKeyword_1_2_1());
            	      				
            	    }
            	    // InternalCloneDetectionDSL.g:1556:5: ( (lv_right_9_0= ruleExpressionLevel3 ) )
            	    // InternalCloneDetectionDSL.g:1557:6: (lv_right_9_0= ruleExpressionLevel3 )
            	    {
            	    // InternalCloneDetectionDSL.g:1557:6: (lv_right_9_0= ruleExpressionLevel3 )
            	    // InternalCloneDetectionDSL.g:1558:7: lv_right_9_0= ruleExpressionLevel3
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_2_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_right_9_0=ruleExpressionLevel3();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLevel2Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_9_0,
            	      								"com.simonbaars.cdd.CloneDetectionDSL.ExpressionLevel3");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalCloneDetectionDSL.g:1577:4: ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) )
            	    {
            	    // InternalCloneDetectionDSL.g:1577:4: ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) )
            	    // InternalCloneDetectionDSL.g:1578:5: () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) )
            	    {
            	    // InternalCloneDetectionDSL.g:1578:5: ()
            	    // InternalCloneDetectionDSL.g:1579:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLevel2Access().getExpressionMinimumLeftAction_1_3_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_11=(Token)match(input,29,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_11, grammarAccess.getExpressionLevel2Access().getMinKeyword_1_3_1());
            	      				
            	    }
            	    // InternalCloneDetectionDSL.g:1589:5: ( (lv_right_12_0= ruleExpressionLevel3 ) )
            	    // InternalCloneDetectionDSL.g:1590:6: (lv_right_12_0= ruleExpressionLevel3 )
            	    {
            	    // InternalCloneDetectionDSL.g:1590:6: (lv_right_12_0= ruleExpressionLevel3 )
            	    // InternalCloneDetectionDSL.g:1591:7: lv_right_12_0= ruleExpressionLevel3
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_3_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_right_12_0=ruleExpressionLevel3();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLevel2Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_12_0,
            	      								"com.simonbaars.cdd.CloneDetectionDSL.ExpressionLevel3");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalCloneDetectionDSL.g:1610:4: ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) )
            	    {
            	    // InternalCloneDetectionDSL.g:1610:4: ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) )
            	    // InternalCloneDetectionDSL.g:1611:5: () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) )
            	    {
            	    // InternalCloneDetectionDSL.g:1611:5: ()
            	    // InternalCloneDetectionDSL.g:1612:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLevel2Access().getExpressionModuloLeftAction_1_4_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_14=(Token)match(input,30,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_14, grammarAccess.getExpressionLevel2Access().getModKeyword_1_4_1());
            	      				
            	    }
            	    // InternalCloneDetectionDSL.g:1622:5: ( (lv_right_15_0= ruleExpressionLevel3 ) )
            	    // InternalCloneDetectionDSL.g:1623:6: (lv_right_15_0= ruleExpressionLevel3 )
            	    {
            	    // InternalCloneDetectionDSL.g:1623:6: (lv_right_15_0= ruleExpressionLevel3 )
            	    // InternalCloneDetectionDSL.g:1624:7: lv_right_15_0= ruleExpressionLevel3
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_4_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_right_15_0=ruleExpressionLevel3();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLevel2Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_15_0,
            	      								"com.simonbaars.cdd.CloneDetectionDSL.ExpressionLevel3");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionLevel2"


    // $ANTLR start "entryRuleExpressionLevel3"
    // InternalCloneDetectionDSL.g:1647:1: entryRuleExpressionLevel3 returns [EObject current=null] : iv_ruleExpressionLevel3= ruleExpressionLevel3 EOF ;
    public final EObject entryRuleExpressionLevel3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel3 = null;


        try {
            // InternalCloneDetectionDSL.g:1647:57: (iv_ruleExpressionLevel3= ruleExpressionLevel3 EOF )
            // InternalCloneDetectionDSL.g:1648:2: iv_ruleExpressionLevel3= ruleExpressionLevel3 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLevel3Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel3=ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLevel3; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionLevel3"


    // $ANTLR start "ruleExpressionLevel3"
    // InternalCloneDetectionDSL.g:1654:1: ruleExpressionLevel3 returns [EObject current=null] : (this_ExpressionLevel4_0= ruleExpressionLevel4 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )? ) ;
    public final EObject ruleExpressionLevel3() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ExpressionLevel4_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:1660:2: ( (this_ExpressionLevel4_0= ruleExpressionLevel4 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )? ) )
            // InternalCloneDetectionDSL.g:1661:2: (this_ExpressionLevel4_0= ruleExpressionLevel4 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )? )
            {
            // InternalCloneDetectionDSL.g:1661:2: (this_ExpressionLevel4_0= ruleExpressionLevel4 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )? )
            // InternalCloneDetectionDSL.g:1662:3: this_ExpressionLevel4_0= ruleExpressionLevel4 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionLevel3Access().getExpressionLevel4ParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_25);
            this_ExpressionLevel4_0=ruleExpressionLevel4();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ExpressionLevel4_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCloneDetectionDSL.g:1670:3: ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1671:4: () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) )
                    {
                    // InternalCloneDetectionDSL.g:1671:4: ()
                    // InternalCloneDetectionDSL.g:1672:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getExpressionLevel3Access().getExpressionPowerLeftAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,31,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getExpressionLevel3Access().getCircumflexAccentKeyword_1_1());
                      			
                    }
                    // InternalCloneDetectionDSL.g:1682:4: ( (lv_right_3_0= ruleExpressionLevel3 ) )
                    // InternalCloneDetectionDSL.g:1683:5: (lv_right_3_0= ruleExpressionLevel3 )
                    {
                    // InternalCloneDetectionDSL.g:1683:5: (lv_right_3_0= ruleExpressionLevel3 )
                    // InternalCloneDetectionDSL.g:1684:6: lv_right_3_0= ruleExpressionLevel3
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel3ParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleExpressionLevel3();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionLevel3Rule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"com.simonbaars.cdd.CloneDetectionDSL.ExpressionLevel3");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionLevel3"


    // $ANTLR start "entryRuleExpressionLevel4"
    // InternalCloneDetectionDSL.g:1706:1: entryRuleExpressionLevel4 returns [EObject current=null] : iv_ruleExpressionLevel4= ruleExpressionLevel4 EOF ;
    public final EObject entryRuleExpressionLevel4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel4 = null;


        try {
            // InternalCloneDetectionDSL.g:1706:57: (iv_ruleExpressionLevel4= ruleExpressionLevel4 EOF )
            // InternalCloneDetectionDSL.g:1707:2: iv_ruleExpressionLevel4= ruleExpressionLevel4 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLevel4Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel4=ruleExpressionLevel4();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLevel4; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionLevel4"


    // $ANTLR start "ruleExpressionLevel4"
    // InternalCloneDetectionDSL.g:1713:1: ruleExpressionLevel4 returns [EObject current=null] : (this_ExpressionMinus_0= ruleExpressionMinus | this_ExpressionPlus_1= ruleExpressionPlus | this_ExpressionLevel5_2= ruleExpressionLevel5 ) ;
    public final EObject ruleExpressionLevel4() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionMinus_0 = null;

        EObject this_ExpressionPlus_1 = null;

        EObject this_ExpressionLevel5_2 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:1719:2: ( (this_ExpressionMinus_0= ruleExpressionMinus | this_ExpressionPlus_1= ruleExpressionPlus | this_ExpressionLevel5_2= ruleExpressionLevel5 ) )
            // InternalCloneDetectionDSL.g:1720:2: (this_ExpressionMinus_0= ruleExpressionMinus | this_ExpressionPlus_1= ruleExpressionPlus | this_ExpressionLevel5_2= ruleExpressionLevel5 )
            {
            // InternalCloneDetectionDSL.g:1720:2: (this_ExpressionMinus_0= ruleExpressionMinus | this_ExpressionPlus_1= ruleExpressionPlus | this_ExpressionLevel5_2= ruleExpressionLevel5 )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt18=1;
                }
                break;
            case 25:
                {
                alt18=2;
                }
                break;
            case RULE_INT:
            case 19:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1721:3: this_ExpressionMinus_0= ruleExpressionMinus
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionLevel4Access().getExpressionMinusParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionMinus_0=ruleExpressionMinus();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExpressionMinus_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:1730:3: this_ExpressionPlus_1= ruleExpressionPlus
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionLevel4Access().getExpressionPlusParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionPlus_1=ruleExpressionPlus();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExpressionPlus_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCloneDetectionDSL.g:1739:3: this_ExpressionLevel5_2= ruleExpressionLevel5
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionLevel4Access().getExpressionLevel5ParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionLevel5_2=ruleExpressionLevel5();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExpressionLevel5_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionLevel4"


    // $ANTLR start "entryRuleExpressionMinus"
    // InternalCloneDetectionDSL.g:1751:1: entryRuleExpressionMinus returns [EObject current=null] : iv_ruleExpressionMinus= ruleExpressionMinus EOF ;
    public final EObject entryRuleExpressionMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionMinus = null;


        try {
            // InternalCloneDetectionDSL.g:1751:56: (iv_ruleExpressionMinus= ruleExpressionMinus EOF )
            // InternalCloneDetectionDSL.g:1752:2: iv_ruleExpressionMinus= ruleExpressionMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionMinus=ruleExpressionMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionMinus; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionMinus"


    // $ANTLR start "ruleExpressionMinus"
    // InternalCloneDetectionDSL.g:1758:1: ruleExpressionMinus returns [EObject current=null] : (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) ) ;
    public final EObject ruleExpressionMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:1764:2: ( (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) ) )
            // InternalCloneDetectionDSL.g:1765:2: (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) )
            {
            // InternalCloneDetectionDSL.g:1765:2: (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) )
            // InternalCloneDetectionDSL.g:1766:3: otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel5 ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExpressionMinusAccess().getHyphenMinusKeyword_0());
              		
            }
            // InternalCloneDetectionDSL.g:1770:3: ( (lv_sub_1_0= ruleExpressionLevel5 ) )
            // InternalCloneDetectionDSL.g:1771:4: (lv_sub_1_0= ruleExpressionLevel5 )
            {
            // InternalCloneDetectionDSL.g:1771:4: (lv_sub_1_0= ruleExpressionLevel5 )
            // InternalCloneDetectionDSL.g:1772:5: lv_sub_1_0= ruleExpressionLevel5
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressionMinusAccess().getSubExpressionLevel5ParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_sub_1_0=ruleExpressionLevel5();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpressionMinusRule());
              					}
              					set(
              						current,
              						"sub",
              						lv_sub_1_0,
              						"com.simonbaars.cdd.CloneDetectionDSL.ExpressionLevel5");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionMinus"


    // $ANTLR start "entryRuleExpressionPlus"
    // InternalCloneDetectionDSL.g:1793:1: entryRuleExpressionPlus returns [EObject current=null] : iv_ruleExpressionPlus= ruleExpressionPlus EOF ;
    public final EObject entryRuleExpressionPlus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionPlus = null;


        try {
            // InternalCloneDetectionDSL.g:1793:55: (iv_ruleExpressionPlus= ruleExpressionPlus EOF )
            // InternalCloneDetectionDSL.g:1794:2: iv_ruleExpressionPlus= ruleExpressionPlus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionPlusRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionPlus=ruleExpressionPlus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionPlus; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionPlus"


    // $ANTLR start "ruleExpressionPlus"
    // InternalCloneDetectionDSL.g:1800:1: ruleExpressionPlus returns [EObject current=null] : (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) ) ;
    public final EObject ruleExpressionPlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:1806:2: ( (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) ) )
            // InternalCloneDetectionDSL.g:1807:2: (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) )
            {
            // InternalCloneDetectionDSL.g:1807:2: (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) )
            // InternalCloneDetectionDSL.g:1808:3: otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel5 ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExpressionPlusAccess().getPlusSignKeyword_0());
              		
            }
            // InternalCloneDetectionDSL.g:1812:3: ( (lv_sub_1_0= ruleExpressionLevel5 ) )
            // InternalCloneDetectionDSL.g:1813:4: (lv_sub_1_0= ruleExpressionLevel5 )
            {
            // InternalCloneDetectionDSL.g:1813:4: (lv_sub_1_0= ruleExpressionLevel5 )
            // InternalCloneDetectionDSL.g:1814:5: lv_sub_1_0= ruleExpressionLevel5
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressionPlusAccess().getSubExpressionLevel5ParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_sub_1_0=ruleExpressionLevel5();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpressionPlusRule());
              					}
              					set(
              						current,
              						"sub",
              						lv_sub_1_0,
              						"com.simonbaars.cdd.CloneDetectionDSL.ExpressionLevel5");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionPlus"


    // $ANTLR start "entryRuleExpressionLevel5"
    // InternalCloneDetectionDSL.g:1835:1: entryRuleExpressionLevel5 returns [EObject current=null] : iv_ruleExpressionLevel5= ruleExpressionLevel5 EOF ;
    public final EObject entryRuleExpressionLevel5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel5 = null;


        try {
            // InternalCloneDetectionDSL.g:1835:57: (iv_ruleExpressionLevel5= ruleExpressionLevel5 EOF )
            // InternalCloneDetectionDSL.g:1836:2: iv_ruleExpressionLevel5= ruleExpressionLevel5 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLevel5Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel5=ruleExpressionLevel5();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLevel5; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionLevel5"


    // $ANTLR start "ruleExpressionLevel5"
    // InternalCloneDetectionDSL.g:1842:1: ruleExpressionLevel5 returns [EObject current=null] : (this_ExpressionBracket_0= ruleExpressionBracket | this_ExpressionConstantInt_1= ruleExpressionConstantInt | ( (lv_metric_2_0= ruleMetric ) ) ) ;
    public final EObject ruleExpressionLevel5() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionBracket_0 = null;

        EObject this_ExpressionConstantInt_1 = null;

        Enumerator lv_metric_2_0 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:1848:2: ( (this_ExpressionBracket_0= ruleExpressionBracket | this_ExpressionConstantInt_1= ruleExpressionConstantInt | ( (lv_metric_2_0= ruleMetric ) ) ) )
            // InternalCloneDetectionDSL.g:1849:2: (this_ExpressionBracket_0= ruleExpressionBracket | this_ExpressionConstantInt_1= ruleExpressionConstantInt | ( (lv_metric_2_0= ruleMetric ) ) )
            {
            // InternalCloneDetectionDSL.g:1849:2: (this_ExpressionBracket_0= ruleExpressionBracket | this_ExpressionConstantInt_1= ruleExpressionConstantInt | ( (lv_metric_2_0= ruleMetric ) ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt19=1;
                }
                break;
            case RULE_INT:
                {
                alt19=2;
                }
                break;
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1850:3: this_ExpressionBracket_0= ruleExpressionBracket
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionLevel5Access().getExpressionBracketParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionBracket_0=ruleExpressionBracket();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExpressionBracket_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:1859:3: this_ExpressionConstantInt_1= ruleExpressionConstantInt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionLevel5Access().getExpressionConstantIntParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionConstantInt_1=ruleExpressionConstantInt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExpressionConstantInt_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCloneDetectionDSL.g:1868:3: ( (lv_metric_2_0= ruleMetric ) )
                    {
                    // InternalCloneDetectionDSL.g:1868:3: ( (lv_metric_2_0= ruleMetric ) )
                    // InternalCloneDetectionDSL.g:1869:4: (lv_metric_2_0= ruleMetric )
                    {
                    // InternalCloneDetectionDSL.g:1869:4: (lv_metric_2_0= ruleMetric )
                    // InternalCloneDetectionDSL.g:1870:5: lv_metric_2_0= ruleMetric
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpressionLevel5Access().getMetricMetricEnumRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_metric_2_0=ruleMetric();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpressionLevel5Rule());
                      					}
                      					set(
                      						current,
                      						"metric",
                      						lv_metric_2_0,
                      						"com.simonbaars.cdd.CloneDetectionDSL.Metric");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionLevel5"


    // $ANTLR start "entryRuleExpressionBracket"
    // InternalCloneDetectionDSL.g:1891:1: entryRuleExpressionBracket returns [EObject current=null] : iv_ruleExpressionBracket= ruleExpressionBracket EOF ;
    public final EObject entryRuleExpressionBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionBracket = null;


        try {
            // InternalCloneDetectionDSL.g:1891:58: (iv_ruleExpressionBracket= ruleExpressionBracket EOF )
            // InternalCloneDetectionDSL.g:1892:2: iv_ruleExpressionBracket= ruleExpressionBracket EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionBracketRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionBracket=ruleExpressionBracket();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionBracket; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionBracket"


    // $ANTLR start "ruleExpressionBracket"
    // InternalCloneDetectionDSL.g:1898:1: ruleExpressionBracket returns [EObject current=null] : (otherlv_0= '(' ( (lv_sub_1_0= ruleIntExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleExpressionBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:1904:2: ( (otherlv_0= '(' ( (lv_sub_1_0= ruleIntExpression ) ) otherlv_2= ')' ) )
            // InternalCloneDetectionDSL.g:1905:2: (otherlv_0= '(' ( (lv_sub_1_0= ruleIntExpression ) ) otherlv_2= ')' )
            {
            // InternalCloneDetectionDSL.g:1905:2: (otherlv_0= '(' ( (lv_sub_1_0= ruleIntExpression ) ) otherlv_2= ')' )
            // InternalCloneDetectionDSL.g:1906:3: otherlv_0= '(' ( (lv_sub_1_0= ruleIntExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalCloneDetectionDSL.g:1910:3: ( (lv_sub_1_0= ruleIntExpression ) )
            // InternalCloneDetectionDSL.g:1911:4: (lv_sub_1_0= ruleIntExpression )
            {
            // InternalCloneDetectionDSL.g:1911:4: (lv_sub_1_0= ruleIntExpression )
            // InternalCloneDetectionDSL.g:1912:5: lv_sub_1_0= ruleIntExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressionBracketAccess().getSubIntExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_sub_1_0=ruleIntExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpressionBracketRule());
              					}
              					set(
              						current,
              						"sub",
              						lv_sub_1_0,
              						"com.simonbaars.cdd.CloneDetectionDSL.IntExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getExpressionBracketAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionBracket"


    // $ANTLR start "entryRuleExpressionConstantInt"
    // InternalCloneDetectionDSL.g:1937:1: entryRuleExpressionConstantInt returns [EObject current=null] : iv_ruleExpressionConstantInt= ruleExpressionConstantInt EOF ;
    public final EObject entryRuleExpressionConstantInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionConstantInt = null;


        try {
            // InternalCloneDetectionDSL.g:1937:62: (iv_ruleExpressionConstantInt= ruleExpressionConstantInt EOF )
            // InternalCloneDetectionDSL.g:1938:2: iv_ruleExpressionConstantInt= ruleExpressionConstantInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionConstantIntRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionConstantInt=ruleExpressionConstantInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionConstantInt; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionConstantInt"


    // $ANTLR start "ruleExpressionConstantInt"
    // InternalCloneDetectionDSL.g:1944:1: ruleExpressionConstantInt returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleExpressionConstantInt() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:1950:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalCloneDetectionDSL.g:1951:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalCloneDetectionDSL.g:1951:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalCloneDetectionDSL.g:1952:3: (lv_value_0_0= RULE_INT )
            {
            // InternalCloneDetectionDSL.g:1952:3: (lv_value_0_0= RULE_INT )
            // InternalCloneDetectionDSL.g:1953:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getExpressionConstantIntAccess().getValueINTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getExpressionConstantIntRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.eclipse.xtext.common.Terminals.INT");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionConstantInt"


    // $ANTLR start "ruleMatchTarget"
    // InternalCloneDetectionDSL.g:1972:1: ruleMatchTarget returns [Enumerator current=null] : ( (enumLiteral_0= 'Subtree' ) | (enumLiteral_1= 'LLOC' ) | (enumLiteral_2= 'SLOC' ) ) ;
    public final Enumerator ruleMatchTarget() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:1978:2: ( ( (enumLiteral_0= 'Subtree' ) | (enumLiteral_1= 'LLOC' ) | (enumLiteral_2= 'SLOC' ) ) )
            // InternalCloneDetectionDSL.g:1979:2: ( (enumLiteral_0= 'Subtree' ) | (enumLiteral_1= 'LLOC' ) | (enumLiteral_2= 'SLOC' ) )
            {
            // InternalCloneDetectionDSL.g:1979:2: ( (enumLiteral_0= 'Subtree' ) | (enumLiteral_1= 'LLOC' ) | (enumLiteral_2= 'SLOC' ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt20=1;
                }
                break;
            case 33:
                {
                alt20=2;
                }
                break;
            case 34:
                {
                alt20=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalCloneDetectionDSL.g:1980:3: (enumLiteral_0= 'Subtree' )
                    {
                    // InternalCloneDetectionDSL.g:1980:3: (enumLiteral_0= 'Subtree' )
                    // InternalCloneDetectionDSL.g:1981:4: enumLiteral_0= 'Subtree'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMatchTargetAccess().getSubtreeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMatchTargetAccess().getSubtreeEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:1988:3: (enumLiteral_1= 'LLOC' )
                    {
                    // InternalCloneDetectionDSL.g:1988:3: (enumLiteral_1= 'LLOC' )
                    // InternalCloneDetectionDSL.g:1989:4: enumLiteral_1= 'LLOC'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMatchTargetAccess().getLLOCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMatchTargetAccess().getLLOCEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCloneDetectionDSL.g:1996:3: (enumLiteral_2= 'SLOC' )
                    {
                    // InternalCloneDetectionDSL.g:1996:3: (enumLiteral_2= 'SLOC' )
                    // InternalCloneDetectionDSL.g:1997:4: enumLiteral_2= 'SLOC'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMatchTargetAccess().getSLOCEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getMatchTargetAccess().getSLOCEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMatchTarget"


    // $ANTLR start "ruleSizeMetric"
    // InternalCloneDetectionDSL.g:2007:1: ruleSizeMetric returns [Enumerator current=null] : ( (enumLiteral_0= 'tokens' ) | (enumLiteral_1= 'declarations' ) | (enumLiteral_2= 'statements' ) | (enumLiteral_3= 'nodes' ) | (enumLiteral_4= 'lines' ) ) ;
    public final Enumerator ruleSizeMetric() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:2013:2: ( ( (enumLiteral_0= 'tokens' ) | (enumLiteral_1= 'declarations' ) | (enumLiteral_2= 'statements' ) | (enumLiteral_3= 'nodes' ) | (enumLiteral_4= 'lines' ) ) )
            // InternalCloneDetectionDSL.g:2014:2: ( (enumLiteral_0= 'tokens' ) | (enumLiteral_1= 'declarations' ) | (enumLiteral_2= 'statements' ) | (enumLiteral_3= 'nodes' ) | (enumLiteral_4= 'lines' ) )
            {
            // InternalCloneDetectionDSL.g:2014:2: ( (enumLiteral_0= 'tokens' ) | (enumLiteral_1= 'declarations' ) | (enumLiteral_2= 'statements' ) | (enumLiteral_3= 'nodes' ) | (enumLiteral_4= 'lines' ) )
            int alt21=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt21=1;
                }
                break;
            case 36:
                {
                alt21=2;
                }
                break;
            case 37:
                {
                alt21=3;
                }
                break;
            case 38:
                {
                alt21=4;
                }
                break;
            case 39:
                {
                alt21=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalCloneDetectionDSL.g:2015:3: (enumLiteral_0= 'tokens' )
                    {
                    // InternalCloneDetectionDSL.g:2015:3: (enumLiteral_0= 'tokens' )
                    // InternalCloneDetectionDSL.g:2016:4: enumLiteral_0= 'tokens'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSizeMetricAccess().getTokensEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getSizeMetricAccess().getTokensEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:2023:3: (enumLiteral_1= 'declarations' )
                    {
                    // InternalCloneDetectionDSL.g:2023:3: (enumLiteral_1= 'declarations' )
                    // InternalCloneDetectionDSL.g:2024:4: enumLiteral_1= 'declarations'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSizeMetricAccess().getDeclarationsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getSizeMetricAccess().getDeclarationsEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCloneDetectionDSL.g:2031:3: (enumLiteral_2= 'statements' )
                    {
                    // InternalCloneDetectionDSL.g:2031:3: (enumLiteral_2= 'statements' )
                    // InternalCloneDetectionDSL.g:2032:4: enumLiteral_2= 'statements'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSizeMetricAccess().getStatementsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getSizeMetricAccess().getStatementsEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCloneDetectionDSL.g:2039:3: (enumLiteral_3= 'nodes' )
                    {
                    // InternalCloneDetectionDSL.g:2039:3: (enumLiteral_3= 'nodes' )
                    // InternalCloneDetectionDSL.g:2040:4: enumLiteral_3= 'nodes'
                    {
                    enumLiteral_3=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSizeMetricAccess().getNodesEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getSizeMetricAccess().getNodesEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalCloneDetectionDSL.g:2047:3: (enumLiteral_4= 'lines' )
                    {
                    // InternalCloneDetectionDSL.g:2047:3: (enumLiteral_4= 'lines' )
                    // InternalCloneDetectionDSL.g:2048:4: enumLiteral_4= 'lines'
                    {
                    enumLiteral_4=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSizeMetricAccess().getLinesEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getSizeMetricAccess().getLinesEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSizeMetric"


    // $ANTLR start "ruleBoolOperator"
    // InternalCloneDetectionDSL.g:2058:1: ruleBoolOperator returns [Enumerator current=null] : ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) ) ;
    public final Enumerator ruleBoolOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:2064:2: ( ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) ) )
            // InternalCloneDetectionDSL.g:2065:2: ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) )
            {
            // InternalCloneDetectionDSL.g:2065:2: ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            else if ( (LA22_0==41) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalCloneDetectionDSL.g:2066:3: (enumLiteral_0= '&' )
                    {
                    // InternalCloneDetectionDSL.g:2066:3: (enumLiteral_0= '&' )
                    // InternalCloneDetectionDSL.g:2067:4: enumLiteral_0= '&'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBoolOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBoolOperatorAccess().getANDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:2074:3: (enumLiteral_1= '|' )
                    {
                    // InternalCloneDetectionDSL.g:2074:3: (enumLiteral_1= '|' )
                    // InternalCloneDetectionDSL.g:2075:4: enumLiteral_1= '|'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBoolOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getBoolOperatorAccess().getOREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBoolOperator"


    // $ANTLR start "ruleMethod"
    // InternalCloneDetectionDSL.g:2085:1: ruleMethod returns [Enumerator current=null] : ( (enumLiteral_0= 'Subnodes' ) | (enumLiteral_1= 'StringMatch' ) | (enumLiteral_2= 'CompleteMatch' ) | (enumLiteral_3= 'FQI' ) ) ;
    public final Enumerator ruleMethod() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:2091:2: ( ( (enumLiteral_0= 'Subnodes' ) | (enumLiteral_1= 'StringMatch' ) | (enumLiteral_2= 'CompleteMatch' ) | (enumLiteral_3= 'FQI' ) ) )
            // InternalCloneDetectionDSL.g:2092:2: ( (enumLiteral_0= 'Subnodes' ) | (enumLiteral_1= 'StringMatch' ) | (enumLiteral_2= 'CompleteMatch' ) | (enumLiteral_3= 'FQI' ) )
            {
            // InternalCloneDetectionDSL.g:2092:2: ( (enumLiteral_0= 'Subnodes' ) | (enumLiteral_1= 'StringMatch' ) | (enumLiteral_2= 'CompleteMatch' ) | (enumLiteral_3= 'FQI' ) )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt23=1;
                }
                break;
            case 43:
                {
                alt23=2;
                }
                break;
            case 44:
                {
                alt23=3;
                }
                break;
            case 45:
                {
                alt23=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalCloneDetectionDSL.g:2093:3: (enumLiteral_0= 'Subnodes' )
                    {
                    // InternalCloneDetectionDSL.g:2093:3: (enumLiteral_0= 'Subnodes' )
                    // InternalCloneDetectionDSL.g:2094:4: enumLiteral_0= 'Subnodes'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMethodAccess().getSubnodesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMethodAccess().getSubnodesEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:2101:3: (enumLiteral_1= 'StringMatch' )
                    {
                    // InternalCloneDetectionDSL.g:2101:3: (enumLiteral_1= 'StringMatch' )
                    // InternalCloneDetectionDSL.g:2102:4: enumLiteral_1= 'StringMatch'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMethodAccess().getStringMatchEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMethodAccess().getStringMatchEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCloneDetectionDSL.g:2109:3: (enumLiteral_2= 'CompleteMatch' )
                    {
                    // InternalCloneDetectionDSL.g:2109:3: (enumLiteral_2= 'CompleteMatch' )
                    // InternalCloneDetectionDSL.g:2110:4: enumLiteral_2= 'CompleteMatch'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMethodAccess().getCompleteMatchEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getMethodAccess().getCompleteMatchEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCloneDetectionDSL.g:2117:3: (enumLiteral_3= 'FQI' )
                    {
                    // InternalCloneDetectionDSL.g:2117:3: (enumLiteral_3= 'FQI' )
                    // InternalCloneDetectionDSL.g:2118:4: enumLiteral_3= 'FQI'
                    {
                    enumLiteral_3=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMethodAccess().getFQIEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getMethodAccess().getFQIEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "ruleUnder"
    // InternalCloneDetectionDSL.g:2128:1: ruleUnder returns [Enumerator current=null] : ( (enumLiteral_0= '->' ) | (enumLiteral_1= '=>' ) ) ;
    public final Enumerator ruleUnder() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:2134:2: ( ( (enumLiteral_0= '->' ) | (enumLiteral_1= '=>' ) ) )
            // InternalCloneDetectionDSL.g:2135:2: ( (enumLiteral_0= '->' ) | (enumLiteral_1= '=>' ) )
            {
            // InternalCloneDetectionDSL.g:2135:2: ( (enumLiteral_0= '->' ) | (enumLiteral_1= '=>' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==46) ) {
                alt24=1;
            }
            else if ( (LA24_0==47) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalCloneDetectionDSL.g:2136:3: (enumLiteral_0= '->' )
                    {
                    // InternalCloneDetectionDSL.g:2136:3: (enumLiteral_0= '->' )
                    // InternalCloneDetectionDSL.g:2137:4: enumLiteral_0= '->'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnderAccess().getOneLevelEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getUnderAccess().getOneLevelEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:2144:3: (enumLiteral_1= '=>' )
                    {
                    // InternalCloneDetectionDSL.g:2144:3: (enumLiteral_1= '=>' )
                    // InternalCloneDetectionDSL.g:2145:4: enumLiteral_1= '=>'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnderAccess().getAnyLevelEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getUnderAccess().getAnyLevelEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUnder"


    // $ANTLR start "ruleMetric"
    // InternalCloneDetectionDSL.g:2155:1: ruleMetric returns [Enumerator current=null] : ( (enumLiteral_0= 'CyclomaticComplexity' ) | (enumLiteral_1= 'LineVolume' ) | (enumLiteral_2= 'TokenVolume' ) | (enumLiteral_3= 'StatementVolume' ) | (enumLiteral_4= 'NumberOfParameters' ) ) ;
    public final Enumerator ruleMetric() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:2161:2: ( ( (enumLiteral_0= 'CyclomaticComplexity' ) | (enumLiteral_1= 'LineVolume' ) | (enumLiteral_2= 'TokenVolume' ) | (enumLiteral_3= 'StatementVolume' ) | (enumLiteral_4= 'NumberOfParameters' ) ) )
            // InternalCloneDetectionDSL.g:2162:2: ( (enumLiteral_0= 'CyclomaticComplexity' ) | (enumLiteral_1= 'LineVolume' ) | (enumLiteral_2= 'TokenVolume' ) | (enumLiteral_3= 'StatementVolume' ) | (enumLiteral_4= 'NumberOfParameters' ) )
            {
            // InternalCloneDetectionDSL.g:2162:2: ( (enumLiteral_0= 'CyclomaticComplexity' ) | (enumLiteral_1= 'LineVolume' ) | (enumLiteral_2= 'TokenVolume' ) | (enumLiteral_3= 'StatementVolume' ) | (enumLiteral_4= 'NumberOfParameters' ) )
            int alt25=5;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt25=1;
                }
                break;
            case 49:
                {
                alt25=2;
                }
                break;
            case 50:
                {
                alt25=3;
                }
                break;
            case 51:
                {
                alt25=4;
                }
                break;
            case 52:
                {
                alt25=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalCloneDetectionDSL.g:2163:3: (enumLiteral_0= 'CyclomaticComplexity' )
                    {
                    // InternalCloneDetectionDSL.g:2163:3: (enumLiteral_0= 'CyclomaticComplexity' )
                    // InternalCloneDetectionDSL.g:2164:4: enumLiteral_0= 'CyclomaticComplexity'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMetricAccess().getCyclomaticComplexityEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMetricAccess().getCyclomaticComplexityEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:2171:3: (enumLiteral_1= 'LineVolume' )
                    {
                    // InternalCloneDetectionDSL.g:2171:3: (enumLiteral_1= 'LineVolume' )
                    // InternalCloneDetectionDSL.g:2172:4: enumLiteral_1= 'LineVolume'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMetricAccess().getLineVolumeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMetricAccess().getLineVolumeEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCloneDetectionDSL.g:2179:3: (enumLiteral_2= 'TokenVolume' )
                    {
                    // InternalCloneDetectionDSL.g:2179:3: (enumLiteral_2= 'TokenVolume' )
                    // InternalCloneDetectionDSL.g:2180:4: enumLiteral_2= 'TokenVolume'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMetricAccess().getTokenVolumeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getMetricAccess().getTokenVolumeEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCloneDetectionDSL.g:2187:3: (enumLiteral_3= 'StatementVolume' )
                    {
                    // InternalCloneDetectionDSL.g:2187:3: (enumLiteral_3= 'StatementVolume' )
                    // InternalCloneDetectionDSL.g:2188:4: enumLiteral_3= 'StatementVolume'
                    {
                    enumLiteral_3=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMetricAccess().getStatementVolumeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getMetricAccess().getStatementVolumeEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalCloneDetectionDSL.g:2195:3: (enumLiteral_4= 'NumberOfParameters' )
                    {
                    // InternalCloneDetectionDSL.g:2195:3: (enumLiteral_4= 'NumberOfParameters' )
                    // InternalCloneDetectionDSL.g:2196:4: enumLiteral_4= 'NumberOfParameters'
                    {
                    enumLiteral_4=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMetricAccess().getNumberOfParametersEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getMetricAccess().getNumberOfParametersEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMetric"


    // $ANTLR start "ruleBinaryBooleanOperator"
    // InternalCloneDetectionDSL.g:2206:1: ruleBinaryBooleanOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) ;
    public final Enumerator ruleBinaryBooleanOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:2212:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) )
            // InternalCloneDetectionDSL.g:2213:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            {
            // InternalCloneDetectionDSL.g:2213:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==53) ) {
                alt26=1;
            }
            else if ( (LA26_0==54) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalCloneDetectionDSL.g:2214:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalCloneDetectionDSL.g:2214:3: (enumLiteral_0= 'AND' )
                    // InternalCloneDetectionDSL.g:2215:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryBooleanOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBinaryBooleanOperatorAccess().getANDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:2222:3: (enumLiteral_1= 'OR' )
                    {
                    // InternalCloneDetectionDSL.g:2222:3: (enumLiteral_1= 'OR' )
                    // InternalCloneDetectionDSL.g:2223:4: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryBooleanOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getBinaryBooleanOperatorAccess().getOREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBinaryBooleanOperator"


    // $ANTLR start "ruleCompareOperator"
    // InternalCloneDetectionDSL.g:2233:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalCloneDetectionDSL.g:2239:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) ) )
            // InternalCloneDetectionDSL.g:2240:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) )
            {
            // InternalCloneDetectionDSL.g:2240:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) )
            int alt27=6;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt27=1;
                }
                break;
            case 56:
                {
                alt27=2;
                }
                break;
            case 57:
                {
                alt27=3;
                }
                break;
            case 58:
                {
                alt27=4;
                }
                break;
            case 59:
                {
                alt27=5;
                }
                break;
            case 60:
                {
                alt27=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalCloneDetectionDSL.g:2241:3: (enumLiteral_0= '==' )
                    {
                    // InternalCloneDetectionDSL.g:2241:3: (enumLiteral_0= '==' )
                    // InternalCloneDetectionDSL.g:2242:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:2249:3: (enumLiteral_1= '!=' )
                    {
                    // InternalCloneDetectionDSL.g:2249:3: (enumLiteral_1= '!=' )
                    // InternalCloneDetectionDSL.g:2250:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCloneDetectionDSL.g:2257:3: (enumLiteral_2= '>=' )
                    {
                    // InternalCloneDetectionDSL.g:2257:3: (enumLiteral_2= '>=' )
                    // InternalCloneDetectionDSL.g:2258:4: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCloneDetectionDSL.g:2265:3: (enumLiteral_3= '>' )
                    {
                    // InternalCloneDetectionDSL.g:2265:3: (enumLiteral_3= '>' )
                    // InternalCloneDetectionDSL.g:2266:4: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalCloneDetectionDSL.g:2273:3: (enumLiteral_4= '<=' )
                    {
                    // InternalCloneDetectionDSL.g:2273:3: (enumLiteral_4= '<=' )
                    // InternalCloneDetectionDSL.g:2274:4: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalCloneDetectionDSL.g:2281:3: (enumLiteral_5= '<' )
                    {
                    // InternalCloneDetectionDSL.g:2281:3: (enumLiteral_5= '<' )
                    // InternalCloneDetectionDSL.g:2282:4: enumLiteral_5= '<'
                    {
                    enumLiteral_5=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getLEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getCompareOperatorAccess().getLEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCompareOperator"

    // $ANTLR start synpred1_InternalCloneDetectionDSL
    public final void synpred1_InternalCloneDetectionDSL_fragment() throws RecognitionException {   
        // InternalCloneDetectionDSL.g:1139:4: ( ruleComparisonExpression )
        // InternalCloneDetectionDSL.g:1139:5: ruleComparisonExpression
        {
        pushFollow(FOLLOW_2);
        ruleComparisonExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalCloneDetectionDSL

    // Delegated rules

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
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\6\2\uffff\1\0\10\uffff";
    static final String dfa_3s = "\1\64\2\uffff\1\0\10\uffff";
    static final String dfa_4s = "\1\uffff\2\1\1\uffff\6\1\1\3\1\2";
    static final String dfa_5s = "\1\0\2\uffff\1\1\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\1\12\13\uffff\1\3\5\uffff\1\2\1\1\25\uffff\1\5\1\6\1\7\1\10\1\11",
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

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1137:2: ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) | this_BooleanExpressionBracket_1= ruleBooleanExpressionBracket | this_BooleanExpressionConstant_2= ruleBooleanExpressionConstant )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                         
                        int index14_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_0==26) && (synpred1_InternalCloneDetectionDSL())) {s = 1;}

                        else if ( (LA14_0==25) && (synpred1_InternalCloneDetectionDSL())) {s = 2;}

                        else if ( (LA14_0==19) ) {s = 3;}

                        else if ( (LA14_0==RULE_INT) && (synpred1_InternalCloneDetectionDSL())) {s = 4;}

                        else if ( (LA14_0==48) && (synpred1_InternalCloneDetectionDSL())) {s = 5;}

                        else if ( (LA14_0==49) && (synpred1_InternalCloneDetectionDSL())) {s = 6;}

                        else if ( (LA14_0==50) && (synpred1_InternalCloneDetectionDSL())) {s = 7;}

                        else if ( (LA14_0==51) && (synpred1_InternalCloneDetectionDSL())) {s = 8;}

                        else if ( (LA14_0==52) && (synpred1_InternalCloneDetectionDSL())) {s = 9;}

                        else if ( (LA14_0==RULE_BOOL_LITERAL) ) {s = 10;}

                         
                        input.seek(index14_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_3 = input.LA(1);

                         
                        int index14_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalCloneDetectionDSL()) ) {s = 9;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index14_3);
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000064F002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x001F000006080042L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000F800000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00003C0000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010062L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x001F0000070800C0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x1F80000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x001F000006080040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000078010002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000002L});

}
