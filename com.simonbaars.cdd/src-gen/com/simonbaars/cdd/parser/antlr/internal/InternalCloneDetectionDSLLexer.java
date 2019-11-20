package com.simonbaars.cdd.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCloneDetectionDSLLexer extends Lexer {
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

    public InternalCloneDetectionDSLLexer() {;} 
    public InternalCloneDetectionDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCloneDetectionDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCloneDetectionDSL.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:11:7: ( 'Project' )
            // InternalCloneDetectionDSL.g:11:9: 'Project'
            {
            match("Project"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:12:7: ( 'SearchRoot' )
            // InternalCloneDetectionDSL.g:12:9: 'SearchRoot'
            {
            match("SearchRoot"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:13:7: ( 'Match' )
            // InternalCloneDetectionDSL.g:13:9: 'Match'
            {
            match("Match"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:14:7: ( 'Exclude' )
            // InternalCloneDetectionDSL.g:14:9: 'Exclude'
            {
            match("Exclude"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:15:7: ( '*' )
            // InternalCloneDetectionDSL.g:15:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:16:7: ( ',' )
            // InternalCloneDetectionDSL.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:17:7: ( 'Size' )
            // InternalCloneDetectionDSL.g:17:9: 'Size'
            {
            match("Size"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:18:7: ( '(' )
            // InternalCloneDetectionDSL.g:18:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:19:7: ( ')' )
            // InternalCloneDetectionDSL.g:19:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:20:7: ( 'DoNotCompare' )
            // InternalCloneDetectionDSL.g:20:9: 'DoNotCompare'
            {
            match("DoNotCompare"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:21:7: ( 'Compare' )
            // InternalCloneDetectionDSL.g:21:9: 'Compare'
            {
            match("Compare"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:22:7: ( '%' )
            // InternalCloneDetectionDSL.g:22:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:23:7: ( 'NOT' )
            // InternalCloneDetectionDSL.g:23:9: 'NOT'
            {
            match("NOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:24:7: ( '+' )
            // InternalCloneDetectionDSL.g:24:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:25:7: ( '-' )
            // InternalCloneDetectionDSL.g:25:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:26:7: ( '/' )
            // InternalCloneDetectionDSL.g:26:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:27:7: ( 'max' )
            // InternalCloneDetectionDSL.g:27:9: 'max'
            {
            match("max"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:28:7: ( 'min' )
            // InternalCloneDetectionDSL.g:28:9: 'min'
            {
            match("min"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:29:7: ( 'mod' )
            // InternalCloneDetectionDSL.g:29:9: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:30:7: ( '^' )
            // InternalCloneDetectionDSL.g:30:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:31:7: ( 'Subtree' )
            // InternalCloneDetectionDSL.g:31:9: 'Subtree'
            {
            match("Subtree"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:32:7: ( 'LLOC' )
            // InternalCloneDetectionDSL.g:32:9: 'LLOC'
            {
            match("LLOC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:33:7: ( 'SLOC' )
            // InternalCloneDetectionDSL.g:33:9: 'SLOC'
            {
            match("SLOC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:34:7: ( 'tokens' )
            // InternalCloneDetectionDSL.g:34:9: 'tokens'
            {
            match("tokens"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:35:7: ( 'declarations' )
            // InternalCloneDetectionDSL.g:35:9: 'declarations'
            {
            match("declarations"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:36:7: ( 'statements' )
            // InternalCloneDetectionDSL.g:36:9: 'statements'
            {
            match("statements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:37:7: ( 'nodes' )
            // InternalCloneDetectionDSL.g:37:9: 'nodes'
            {
            match("nodes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:38:7: ( 'lines' )
            // InternalCloneDetectionDSL.g:38:9: 'lines'
            {
            match("lines"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:39:7: ( '&' )
            // InternalCloneDetectionDSL.g:39:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:40:7: ( '|' )
            // InternalCloneDetectionDSL.g:40:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:41:7: ( 'Subnodes' )
            // InternalCloneDetectionDSL.g:41:9: 'Subnodes'
            {
            match("Subnodes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:42:7: ( 'StringMatch' )
            // InternalCloneDetectionDSL.g:42:9: 'StringMatch'
            {
            match("StringMatch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:43:7: ( 'CompleteMatch' )
            // InternalCloneDetectionDSL.g:43:9: 'CompleteMatch'
            {
            match("CompleteMatch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:44:7: ( 'FQI' )
            // InternalCloneDetectionDSL.g:44:9: 'FQI'
            {
            match("FQI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:45:7: ( '->' )
            // InternalCloneDetectionDSL.g:45:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:46:7: ( '=>' )
            // InternalCloneDetectionDSL.g:46:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:47:7: ( 'CyclomaticComplexity' )
            // InternalCloneDetectionDSL.g:47:9: 'CyclomaticComplexity'
            {
            match("CyclomaticComplexity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:48:7: ( 'LineVolume' )
            // InternalCloneDetectionDSL.g:48:9: 'LineVolume'
            {
            match("LineVolume"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:49:7: ( 'TokenVolume' )
            // InternalCloneDetectionDSL.g:49:9: 'TokenVolume'
            {
            match("TokenVolume"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:50:7: ( 'StatementVolume' )
            // InternalCloneDetectionDSL.g:50:9: 'StatementVolume'
            {
            match("StatementVolume"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:51:7: ( 'NumberOfParameters' )
            // InternalCloneDetectionDSL.g:51:9: 'NumberOfParameters'
            {
            match("NumberOfParameters"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:52:7: ( 'AND' )
            // InternalCloneDetectionDSL.g:52:9: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:53:7: ( 'OR' )
            // InternalCloneDetectionDSL.g:53:9: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:54:7: ( '==' )
            // InternalCloneDetectionDSL.g:54:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:55:7: ( '!=' )
            // InternalCloneDetectionDSL.g:55:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:56:7: ( '>=' )
            // InternalCloneDetectionDSL.g:56:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:57:7: ( '>' )
            // InternalCloneDetectionDSL.g:57:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:58:7: ( '<=' )
            // InternalCloneDetectionDSL.g:58:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:59:7: ( '<' )
            // InternalCloneDetectionDSL.g:59:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "RULE_BOOL_LITERAL"
    public final void mRULE_BOOL_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_BOOL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:2291:19: ( ( 'true' | 'false' | 'TRUE' | 'FALSE' ) )
            // InternalCloneDetectionDSL.g:2291:21: ( 'true' | 'false' | 'TRUE' | 'FALSE' )
            {
            // InternalCloneDetectionDSL.g:2291:21: ( 'true' | 'false' | 'TRUE' | 'FALSE' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 't':
                {
                alt1=1;
                }
                break;
            case 'f':
                {
                alt1=2;
                }
                break;
            case 'T':
                {
                alt1=3;
                }
                break;
            case 'F':
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalCloneDetectionDSL.g:2291:22: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:2291:29: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 3 :
                    // InternalCloneDetectionDSL.g:2291:37: 'TRUE'
                    {
                    match("TRUE"); 


                    }
                    break;
                case 4 :
                    // InternalCloneDetectionDSL.g:2291:44: 'FALSE'
                    {
                    match("FALSE"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOL_LITERAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:2293:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalCloneDetectionDSL.g:2293:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalCloneDetectionDSL.g:2293:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCloneDetectionDSL.g:2293:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalCloneDetectionDSL.g:2293:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCloneDetectionDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:2295:10: ( ( '0' .. '9' )+ )
            // InternalCloneDetectionDSL.g:2295:12: ( '0' .. '9' )+
            {
            // InternalCloneDetectionDSL.g:2295:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCloneDetectionDSL.g:2295:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:2297:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalCloneDetectionDSL.g:2297:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalCloneDetectionDSL.g:2297:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCloneDetectionDSL.g:2297:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalCloneDetectionDSL.g:2297:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCloneDetectionDSL.g:2297:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCloneDetectionDSL.g:2297:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalCloneDetectionDSL.g:2297:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalCloneDetectionDSL.g:2297:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalCloneDetectionDSL.g:2297:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCloneDetectionDSL.g:2297:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:2299:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalCloneDetectionDSL.g:2299:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalCloneDetectionDSL.g:2299:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCloneDetectionDSL.g:2299:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:2301:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalCloneDetectionDSL.g:2301:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalCloneDetectionDSL.g:2301:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCloneDetectionDSL.g:2301:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalCloneDetectionDSL.g:2301:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCloneDetectionDSL.g:2301:41: ( '\\r' )? '\\n'
                    {
                    // InternalCloneDetectionDSL.g:2301:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalCloneDetectionDSL.g:2301:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:2303:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalCloneDetectionDSL.g:2303:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalCloneDetectionDSL.g:2303:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCloneDetectionDSL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCloneDetectionDSL.g:2305:16: ( . )
            // InternalCloneDetectionDSL.g:2305:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalCloneDetectionDSL.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | RULE_BOOL_LITERAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=57;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalCloneDetectionDSL.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalCloneDetectionDSL.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalCloneDetectionDSL.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalCloneDetectionDSL.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalCloneDetectionDSL.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalCloneDetectionDSL.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalCloneDetectionDSL.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalCloneDetectionDSL.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalCloneDetectionDSL.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalCloneDetectionDSL.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalCloneDetectionDSL.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalCloneDetectionDSL.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalCloneDetectionDSL.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalCloneDetectionDSL.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalCloneDetectionDSL.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalCloneDetectionDSL.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalCloneDetectionDSL.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalCloneDetectionDSL.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalCloneDetectionDSL.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalCloneDetectionDSL.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalCloneDetectionDSL.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalCloneDetectionDSL.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalCloneDetectionDSL.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalCloneDetectionDSL.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalCloneDetectionDSL.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalCloneDetectionDSL.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalCloneDetectionDSL.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalCloneDetectionDSL.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalCloneDetectionDSL.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalCloneDetectionDSL.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalCloneDetectionDSL.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalCloneDetectionDSL.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalCloneDetectionDSL.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalCloneDetectionDSL.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalCloneDetectionDSL.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalCloneDetectionDSL.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalCloneDetectionDSL.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // InternalCloneDetectionDSL.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // InternalCloneDetectionDSL.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // InternalCloneDetectionDSL.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // InternalCloneDetectionDSL.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // InternalCloneDetectionDSL.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // InternalCloneDetectionDSL.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // InternalCloneDetectionDSL.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // InternalCloneDetectionDSL.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // InternalCloneDetectionDSL.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // InternalCloneDetectionDSL.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // InternalCloneDetectionDSL.g:1:292: T__59
                {
                mT__59(); 

                }
                break;
            case 49 :
                // InternalCloneDetectionDSL.g:1:298: T__60
                {
                mT__60(); 

                }
                break;
            case 50 :
                // InternalCloneDetectionDSL.g:1:304: RULE_BOOL_LITERAL
                {
                mRULE_BOOL_LITERAL(); 

                }
                break;
            case 51 :
                // InternalCloneDetectionDSL.g:1:322: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 52 :
                // InternalCloneDetectionDSL.g:1:330: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 53 :
                // InternalCloneDetectionDSL.g:1:339: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 54 :
                // InternalCloneDetectionDSL.g:1:351: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 55 :
                // InternalCloneDetectionDSL.g:1:367: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 56 :
                // InternalCloneDetectionDSL.g:1:383: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 57 :
                // InternalCloneDetectionDSL.g:1:391: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\4\52\4\uffff\2\52\1\uffff\1\52\1\uffff\1\76\1\101\1\52\1\105\6\52\2\uffff\1\52\1\50\3\52\1\50\1\132\1\134\1\52\2\uffff\2\50\2\uffff\1\52\1\uffff\7\52\4\uffff\3\52\1\uffff\2\52\6\uffff\3\52\1\uffff\10\52\2\uffff\2\52\2\uffff\3\52\1\177\5\uffff\1\52\3\uffff\14\52\1\u008e\1\52\1\u0090\1\u0091\1\u0092\10\52\1\u009b\3\52\1\u009f\1\uffff\3\52\1\u00a3\2\52\1\u00a6\7\52\1\uffff\1\52\3\uffff\1\u00b0\2\52\1\u00b3\4\52\1\uffff\2\52\1\u00b3\1\uffff\3\52\1\uffff\2\52\1\uffff\2\52\1\u00c1\6\52\1\uffff\2\52\1\uffff\2\52\1\u00cc\1\u00cd\1\u00b3\1\52\1\u00b3\6\52\1\uffff\7\52\1\u00dc\2\52\2\uffff\1\52\1\u00e0\1\52\1\u00e2\3\52\1\u00e6\1\52\1\u00e8\4\52\1\uffff\3\52\1\uffff\1\52\1\uffff\1\u00f1\2\52\1\uffff\1\52\1\uffff\10\52\1\uffff\12\52\1\u0107\6\52\1\u010e\1\52\1\u0110\1\52\1\uffff\1\u0112\5\52\1\uffff\1\52\1\uffff\1\u0119\1\uffff\1\52\1\u011b\3\52\1\u011f\1\uffff\1\52\1\uffff\1\u0121\2\52\1\uffff\1\52\1\uffff\2\52\1\u0127\2\52\1\uffff\5\52\1\u012f\1\52\1\uffff\1\u0131\1\uffff";
    static final String DFA13_eofS =
        "\u0132\uffff";
    static final String DFA13_minS =
        "\1\0\1\162\1\114\1\141\1\170\4\uffff\2\157\1\uffff\1\117\1\uffff\1\76\1\52\1\141\1\101\1\114\1\157\1\145\1\164\1\157\1\151\2\uffff\1\101\1\75\1\122\1\116\1\122\3\75\1\141\2\uffff\2\0\2\uffff\1\157\1\uffff\1\141\1\172\1\142\1\117\1\141\1\164\1\143\4\uffff\1\116\1\155\1\143\1\uffff\1\124\1\155\6\uffff\1\170\1\156\1\144\1\uffff\1\117\1\156\1\153\1\165\1\143\1\141\1\144\1\156\2\uffff\1\111\1\114\2\uffff\1\153\1\125\1\104\1\60\5\uffff\1\154\3\uffff\1\152\1\162\1\145\1\156\1\103\1\151\1\164\1\143\1\154\1\157\1\160\1\154\1\60\1\142\3\60\1\103\3\145\1\154\1\164\2\145\1\60\1\123\1\145\1\105\1\60\1\uffff\1\163\1\145\1\143\1\60\1\162\1\157\1\60\1\156\1\145\1\150\1\165\1\164\1\141\1\157\1\uffff\1\145\3\uffff\1\60\1\126\1\156\1\60\1\141\1\145\2\163\1\uffff\1\105\1\156\1\60\1\uffff\1\145\1\143\1\150\1\uffff\1\145\1\144\1\uffff\1\147\1\155\1\60\1\144\1\103\1\162\1\145\1\155\1\162\1\uffff\1\157\1\163\1\uffff\1\162\1\155\3\60\1\126\1\60\1\164\1\122\2\145\1\115\1\145\1\uffff\1\145\1\157\1\145\1\164\1\141\1\117\1\154\1\60\1\141\1\145\2\uffff\1\157\1\60\1\157\1\60\1\163\1\141\1\156\1\60\1\155\1\60\1\145\1\164\1\146\1\165\1\uffff\1\164\1\156\1\154\1\uffff\1\157\1\uffff\1\60\2\164\1\uffff\1\160\1\uffff\1\115\1\151\1\120\1\155\1\151\1\164\1\165\1\164\1\uffff\1\143\1\126\2\141\1\143\1\141\1\145\1\157\1\163\1\155\1\60\1\150\1\157\1\162\1\164\1\103\1\162\1\60\1\156\1\60\1\145\1\uffff\1\60\1\154\1\145\1\143\1\157\1\141\1\uffff\1\163\1\uffff\1\60\1\uffff\1\165\1\60\1\150\2\155\1\60\1\uffff\1\155\1\uffff\1\60\1\160\1\145\1\uffff\1\145\1\uffff\1\154\1\164\1\60\2\145\1\uffff\1\170\1\162\1\151\1\163\1\164\1\60\1\171\1\uffff\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\162\1\165\1\141\1\170\4\uffff\1\157\1\171\1\uffff\1\165\1\uffff\1\76\1\57\1\157\1\172\1\151\1\162\1\145\1\164\1\157\1\151\2\uffff\1\121\1\76\1\157\1\116\1\122\3\75\1\141\2\uffff\2\uffff\2\uffff\1\157\1\uffff\1\141\1\172\1\142\1\117\1\162\1\164\1\143\4\uffff\1\116\1\155\1\143\1\uffff\1\124\1\155\6\uffff\1\170\1\156\1\144\1\uffff\1\117\1\156\1\153\1\165\1\143\1\141\1\144\1\156\2\uffff\1\111\1\114\2\uffff\1\153\1\125\1\104\1\172\5\uffff\1\154\3\uffff\1\152\1\162\1\145\1\164\1\103\1\151\1\164\1\143\1\154\1\157\1\160\1\154\1\172\1\142\3\172\1\103\3\145\1\154\1\164\2\145\1\172\1\123\1\145\1\105\1\172\1\uffff\1\163\1\145\1\143\1\172\1\162\1\157\1\172\1\156\1\145\1\150\1\165\1\164\1\154\1\157\1\uffff\1\145\3\uffff\1\172\1\126\1\156\1\172\1\141\1\145\2\163\1\uffff\1\105\1\156\1\172\1\uffff\1\145\1\143\1\150\1\uffff\1\145\1\144\1\uffff\1\147\1\155\1\172\1\144\1\103\1\162\1\145\1\155\1\162\1\uffff\1\157\1\163\1\uffff\1\162\1\155\3\172\1\126\1\172\1\164\1\122\2\145\1\115\1\145\1\uffff\1\145\1\157\1\145\1\164\1\141\1\117\1\154\1\172\1\141\1\145\2\uffff\1\157\1\172\1\157\1\172\1\163\1\141\1\156\1\172\1\155\1\172\1\145\1\164\1\146\1\165\1\uffff\1\164\1\156\1\154\1\uffff\1\157\1\uffff\1\172\2\164\1\uffff\1\160\1\uffff\1\115\1\151\1\120\1\155\1\151\1\164\1\165\1\164\1\uffff\1\143\1\126\2\141\1\143\1\141\1\145\1\157\1\163\1\155\1\172\1\150\1\157\1\162\1\164\1\103\1\162\1\172\1\156\1\172\1\145\1\uffff\1\172\1\154\1\145\1\143\1\157\1\141\1\uffff\1\163\1\uffff\1\172\1\uffff\1\165\1\172\1\150\2\155\1\172\1\uffff\1\155\1\uffff\1\172\1\160\1\145\1\uffff\1\145\1\uffff\1\154\1\164\1\172\2\145\1\uffff\1\170\1\162\1\151\1\163\1\164\1\172\1\171\1\uffff\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\5\uffff\1\5\1\6\1\10\1\11\2\uffff\1\14\1\uffff\1\16\12\uffff\1\35\1\36\11\uffff\1\63\1\64\2\uffff\1\70\1\71\1\uffff\1\63\7\uffff\1\5\1\6\1\10\1\11\3\uffff\1\14\2\uffff\1\16\1\43\1\17\1\66\1\67\1\20\3\uffff\1\24\10\uffff\1\35\1\36\2\uffff\1\44\1\54\4\uffff\1\55\1\56\1\57\1\60\1\61\1\uffff\1\64\1\65\1\70\36\uffff\1\53\16\uffff\1\15\1\uffff\1\21\1\22\1\23\10\uffff\1\42\3\uffff\1\52\3\uffff\1\7\2\uffff\1\27\11\uffff\1\26\2\uffff\1\62\15\uffff\1\3\12\uffff\1\33\1\34\16\uffff\1\30\3\uffff\1\1\1\uffff\1\25\3\uffff\1\4\1\uffff\1\13\10\uffff\1\37\25\uffff\1\2\6\uffff\1\46\1\uffff\1\32\1\uffff\1\40\6\uffff\1\47\1\uffff\1\12\3\uffff\1\31\1\uffff\1\41\5\uffff\1\50\7\uffff\1\51\1\uffff\1\45";
    static final String DFA13_specialS =
        "\1\2\44\uffff\1\0\1\1\u010b\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\50\2\47\2\50\1\47\22\50\1\47\1\37\1\45\2\50\1\13\1\30\1\46\1\7\1\10\1\5\1\15\1\6\1\16\1\50\1\17\12\44\2\50\1\41\1\33\1\40\2\50\1\35\1\43\1\12\1\11\1\4\1\32\5\43\1\22\1\3\1\14\1\36\1\1\2\43\1\2\1\34\6\43\3\50\1\21\1\43\1\50\3\43\1\24\1\43\1\42\5\43\1\27\1\20\1\26\4\43\1\25\1\23\6\43\1\50\1\31\uff83\50",
            "\1\51",
            "\1\56\30\uffff\1\53\3\uffff\1\54\12\uffff\1\57\1\55",
            "\1\60",
            "\1\61",
            "",
            "",
            "",
            "",
            "\1\66",
            "\1\67\11\uffff\1\70",
            "",
            "\1\72\45\uffff\1\73",
            "",
            "\1\75",
            "\1\77\4\uffff\1\100",
            "\1\102\7\uffff\1\103\5\uffff\1\104",
            "\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\106\34\uffff\1\107",
            "\1\110\2\uffff\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "",
            "\1\121\17\uffff\1\120",
            "\1\123\1\122",
            "\1\125\34\uffff\1\124",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\133",
            "\1\135",
            "",
            "",
            "\0\137",
            "\0\137",
            "",
            "",
            "\1\141",
            "",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\147\20\uffff\1\146",
            "\1\150",
            "\1\151",
            "",
            "",
            "",
            "",
            "\1\152",
            "\1\153",
            "\1\154",
            "",
            "\1\155",
            "\1\156",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "",
            "",
            "\1\172",
            "\1\173",
            "",
            "",
            "\1\174",
            "\1\175",
            "\1\176",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "",
            "",
            "\1\u0080",
            "",
            "",
            "",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0085\5\uffff\1\u0084",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u008f",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00a4",
            "\1\u00a5",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac\12\uffff\1\u00ad",
            "\1\u00ae",
            "",
            "\1\u00af",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00b1",
            "\1\u00b2",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "",
            "\1\u00b8",
            "\1\u00b9",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "",
            "\1\u00bd",
            "\1\u00be",
            "",
            "\1\u00bf",
            "\1\u00c0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "",
            "\1\u00c8",
            "\1\u00c9",
            "",
            "\1\u00ca",
            "\1\u00cb",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00ce",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00dd",
            "\1\u00de",
            "",
            "",
            "\1\u00df",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00e1",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00e7",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "",
            "\1\u00f0",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00f2",
            "\1\u00f3",
            "",
            "\1\u00f4",
            "",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u010f",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0111",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "",
            "\1\u0118",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u011a",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0120",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0122",
            "\1\u0123",
            "",
            "\1\u0124",
            "",
            "\1\u0125",
            "\1\u0126",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0128",
            "\1\u0129",
            "",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0130",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | RULE_BOOL_LITERAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_37 = input.LA(1);

                        s = -1;
                        if ( ((LA13_37>='\u0000' && LA13_37<='\uFFFF')) ) {s = 95;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_38 = input.LA(1);

                        s = -1;
                        if ( ((LA13_38>='\u0000' && LA13_38<='\uFFFF')) ) {s = 95;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='P') ) {s = 1;}

                        else if ( (LA13_0=='S') ) {s = 2;}

                        else if ( (LA13_0=='M') ) {s = 3;}

                        else if ( (LA13_0=='E') ) {s = 4;}

                        else if ( (LA13_0=='*') ) {s = 5;}

                        else if ( (LA13_0==',') ) {s = 6;}

                        else if ( (LA13_0=='(') ) {s = 7;}

                        else if ( (LA13_0==')') ) {s = 8;}

                        else if ( (LA13_0=='D') ) {s = 9;}

                        else if ( (LA13_0=='C') ) {s = 10;}

                        else if ( (LA13_0=='%') ) {s = 11;}

                        else if ( (LA13_0=='N') ) {s = 12;}

                        else if ( (LA13_0=='+') ) {s = 13;}

                        else if ( (LA13_0=='-') ) {s = 14;}

                        else if ( (LA13_0=='/') ) {s = 15;}

                        else if ( (LA13_0=='m') ) {s = 16;}

                        else if ( (LA13_0=='^') ) {s = 17;}

                        else if ( (LA13_0=='L') ) {s = 18;}

                        else if ( (LA13_0=='t') ) {s = 19;}

                        else if ( (LA13_0=='d') ) {s = 20;}

                        else if ( (LA13_0=='s') ) {s = 21;}

                        else if ( (LA13_0=='n') ) {s = 22;}

                        else if ( (LA13_0=='l') ) {s = 23;}

                        else if ( (LA13_0=='&') ) {s = 24;}

                        else if ( (LA13_0=='|') ) {s = 25;}

                        else if ( (LA13_0=='F') ) {s = 26;}

                        else if ( (LA13_0=='=') ) {s = 27;}

                        else if ( (LA13_0=='T') ) {s = 28;}

                        else if ( (LA13_0=='A') ) {s = 29;}

                        else if ( (LA13_0=='O') ) {s = 30;}

                        else if ( (LA13_0=='!') ) {s = 31;}

                        else if ( (LA13_0=='>') ) {s = 32;}

                        else if ( (LA13_0=='<') ) {s = 33;}

                        else if ( (LA13_0=='f') ) {s = 34;}

                        else if ( (LA13_0=='B'||(LA13_0>='G' && LA13_0<='K')||(LA13_0>='Q' && LA13_0<='R')||(LA13_0>='U' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='c')||LA13_0=='e'||(LA13_0>='g' && LA13_0<='k')||(LA13_0>='o' && LA13_0<='r')||(LA13_0>='u' && LA13_0<='z')) ) {s = 35;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 36;}

                        else if ( (LA13_0=='\"') ) {s = 37;}

                        else if ( (LA13_0=='\'') ) {s = 38;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 39;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='#' && LA13_0<='$')||LA13_0=='.'||(LA13_0>=':' && LA13_0<=';')||(LA13_0>='?' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='{'||(LA13_0>='}' && LA13_0<='\uFFFF')) ) {s = 40;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}