package no.ntnu.tdt4250.g07.bg.bgdl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBoardGameDLLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalBoardGameDLLexer() {;} 
    public InternalBoardGameDLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalBoardGameDLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalBoardGameDL.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBoardGameDL.g:11:7: ( 'Title' )
            // InternalBoardGameDL.g:11:9: 'Title'
            {
            match("Title"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBoardGameDL.g:12:7: ( 'BoardSize' )
            // InternalBoardGameDL.g:12:9: 'BoardSize'
            {
            match("BoardSize"); 


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
            // InternalBoardGameDL.g:13:7: ( 'validMoves' )
            // InternalBoardGameDL.g:13:9: 'validMoves'
            {
            match("validMoves"); 


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
            // InternalBoardGameDL.g:14:7: ( '[' )
            // InternalBoardGameDL.g:14:9: '['
            {
            match('['); 

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
            // InternalBoardGameDL.g:15:7: ( ',' )
            // InternalBoardGameDL.g:15:9: ','
            {
            match(','); 

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
            // InternalBoardGameDL.g:16:7: ( ']' )
            // InternalBoardGameDL.g:16:9: ']'
            {
            match(']'); 

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
            // InternalBoardGameDL.g:17:7: ( 'cellStates' )
            // InternalBoardGameDL.g:17:9: 'cellStates'
            {
            match("cellStates"); 


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
            // InternalBoardGameDL.g:18:7: ( 'effectsOnCell' )
            // InternalBoardGameDL.g:18:9: 'effectsOnCell'
            {
            match("effectsOnCell"); 


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
            // InternalBoardGameDL.g:19:7: ( 'winConditions' )
            // InternalBoardGameDL.g:19:9: 'winConditions'
            {
            match("winConditions"); 


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
            // InternalBoardGameDL.g:20:7: ( 'pieceTypes' )
            // InternalBoardGameDL.g:20:9: 'pieceTypes'
            {
            match("pieceTypes"); 


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
            // InternalBoardGameDL.g:21:7: ( '{' )
            // InternalBoardGameDL.g:21:9: '{'
            {
            match('{'); 

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
            // InternalBoardGameDL.g:22:7: ( 'PieceType' )
            // InternalBoardGameDL.g:22:9: 'PieceType'
            {
            match("PieceType"); 


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
            // InternalBoardGameDL.g:23:7: ( '(' )
            // InternalBoardGameDL.g:23:9: '('
            {
            match('('); 

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
            // InternalBoardGameDL.g:24:7: ( 'Symbol' )
            // InternalBoardGameDL.g:24:9: 'Symbol'
            {
            match("Symbol"); 


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
            // InternalBoardGameDL.g:25:7: ( 'ValidMoves' )
            // InternalBoardGameDL.g:25:9: 'ValidMoves'
            {
            match("ValidMoves"); 


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
            // InternalBoardGameDL.g:26:7: ( 'EffectsOnCell' )
            // InternalBoardGameDL.g:26:9: 'EffectsOnCell'
            {
            match("EffectsOnCell"); 


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
            // InternalBoardGameDL.g:27:7: ( ')' )
            // InternalBoardGameDL.g:27:9: ')'
            {
            match(')'); 

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
            // InternalBoardGameDL.g:28:7: ( '}' )
            // InternalBoardGameDL.g:28:9: '}'
            {
            match('}'); 

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
            // InternalBoardGameDL.g:29:7: ( 'InARow' )
            // InternalBoardGameDL.g:29:9: 'InARow'
            {
            match("InARow"); 


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
            // InternalBoardGameDL.g:30:7: ( '-' )
            // InternalBoardGameDL.g:30:9: '-'
            {
            match('-'); 

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
            // InternalBoardGameDL.g:31:7: ( 'ValidMove' )
            // InternalBoardGameDL.g:31:9: 'ValidMove'
            {
            match("ValidMove"); 


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
            // InternalBoardGameDL.g:32:7: ( 'placeAnywhere' )
            // InternalBoardGameDL.g:32:9: 'placeAnywhere'
            {
            match("placeAnywhere"); 


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
            // InternalBoardGameDL.g:33:7: ( 'when' )
            // InternalBoardGameDL.g:33:9: 'when'
            {
            match("when"); 


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
            // InternalBoardGameDL.g:34:7: ( 'and' )
            // InternalBoardGameDL.g:34:9: 'and'
            {
            match("and"); 


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
            // InternalBoardGameDL.g:35:7: ( 'EffectOnCell' )
            // InternalBoardGameDL.g:35:9: 'EffectOnCell'
            {
            match("EffectOnCell"); 


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
            // InternalBoardGameDL.g:36:7: ( 'relativePosition' )
            // InternalBoardGameDL.g:36:9: 'relativePosition'
            {
            match("relativePosition"); 


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
            // InternalBoardGameDL.g:37:7: ( 'newCellState' )
            // InternalBoardGameDL.g:37:9: 'newCellState'
            {
            match("newCellState"); 


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
            // InternalBoardGameDL.g:38:7: ( 'Condition' )
            // InternalBoardGameDL.g:38:9: 'Condition'
            {
            match("Condition"); 


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
            // InternalBoardGameDL.g:39:7: ( 'applies' )
            // InternalBoardGameDL.g:39:9: 'applies'
            {
            match("applies"); 


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
            // InternalBoardGameDL.g:40:7: ( 'count' )
            // InternalBoardGameDL.g:40:9: 'count'
            {
            match("count"); 


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
            // InternalBoardGameDL.g:41:7: ( 'horizontal' )
            // InternalBoardGameDL.g:41:9: 'horizontal'
            {
            match("horizontal"); 


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
            // InternalBoardGameDL.g:42:7: ( 'vertical' )
            // InternalBoardGameDL.g:42:9: 'vertical'
            {
            match("vertical"); 


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
            // InternalBoardGameDL.g:43:7: ( 'diagonal' )
            // InternalBoardGameDL.g:43:9: 'diagonal'
            {
            match("diagonal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBoardGameDL.g:1148:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalBoardGameDL.g:1148:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalBoardGameDL.g:1148:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalBoardGameDL.g:1148:11: '^'
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

            // InternalBoardGameDL.g:1148:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBoardGameDL.g:
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
            	    break loop2;
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
            // InternalBoardGameDL.g:1150:10: ( ( '0' .. '9' )+ )
            // InternalBoardGameDL.g:1150:12: ( '0' .. '9' )+
            {
            // InternalBoardGameDL.g:1150:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBoardGameDL.g:1150:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
            // InternalBoardGameDL.g:1152:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalBoardGameDL.g:1152:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalBoardGameDL.g:1152:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBoardGameDL.g:1152:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalBoardGameDL.g:1152:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalBoardGameDL.g:1152:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBoardGameDL.g:1152:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalBoardGameDL.g:1152:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalBoardGameDL.g:1152:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalBoardGameDL.g:1152:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBoardGameDL.g:1152:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
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
            // InternalBoardGameDL.g:1154:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalBoardGameDL.g:1154:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalBoardGameDL.g:1154:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBoardGameDL.g:1154:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // InternalBoardGameDL.g:1156:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalBoardGameDL.g:1156:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalBoardGameDL.g:1156:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBoardGameDL.g:1156:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // InternalBoardGameDL.g:1156:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBoardGameDL.g:1156:41: ( '\\r' )? '\\n'
                    {
                    // InternalBoardGameDL.g:1156:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalBoardGameDL.g:1156:41: '\\r'
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
            // InternalBoardGameDL.g:1158:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalBoardGameDL.g:1158:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalBoardGameDL.g:1158:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBoardGameDL.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // InternalBoardGameDL.g:1160:16: ( . )
            // InternalBoardGameDL.g:1160:18: .
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
        // InternalBoardGameDL.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=40;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalBoardGameDL.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalBoardGameDL.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalBoardGameDL.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalBoardGameDL.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalBoardGameDL.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalBoardGameDL.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalBoardGameDL.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalBoardGameDL.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalBoardGameDL.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalBoardGameDL.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalBoardGameDL.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalBoardGameDL.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalBoardGameDL.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalBoardGameDL.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalBoardGameDL.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalBoardGameDL.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalBoardGameDL.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalBoardGameDL.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalBoardGameDL.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalBoardGameDL.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalBoardGameDL.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalBoardGameDL.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalBoardGameDL.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalBoardGameDL.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalBoardGameDL.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalBoardGameDL.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalBoardGameDL.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalBoardGameDL.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalBoardGameDL.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalBoardGameDL.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalBoardGameDL.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalBoardGameDL.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalBoardGameDL.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalBoardGameDL.g:1:208: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 35 :
                // InternalBoardGameDL.g:1:216: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 36 :
                // InternalBoardGameDL.g:1:225: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 37 :
                // InternalBoardGameDL.g:1:237: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 38 :
                // InternalBoardGameDL.g:1:253: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 39 :
                // InternalBoardGameDL.g:1:269: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 40 :
                // InternalBoardGameDL.g:1:277: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\3\44\3\uffff\4\44\1\uffff\1\44\1\uffff\3\44\2\uffff\1\44\1\uffff\6\44\1\42\2\uffff\3\42\2\uffff\1\44\1\uffff\3\44\3\uffff\7\44\1\uffff\1\44\1\uffff\3\44\2\uffff\1\44\1\uffff\7\44\5\uffff\20\44\1\157\16\44\1\176\7\44\1\uffff\6\44\1\u008c\4\44\1\u0091\2\44\1\uffff\15\44\1\uffff\4\44\1\uffff\5\44\1\u00aa\2\44\1\u00ae\17\44\1\uffff\3\44\1\uffff\1\u00c1\7\44\1\u00c9\11\44\1\uffff\4\44\1\u00d7\1\u00d8\1\44\1\uffff\5\44\1\u00df\1\u00e1\4\44\1\u00e6\1\44\2\uffff\1\u00e8\1\u00e9\2\44\1\u00ec\1\44\1\uffff\1\u00ee\1\uffff\4\44\1\uffff\1\u00f3\2\uffff\2\44\1\uffff\1\44\1\uffff\4\44\1\uffff\4\44\1\u00ff\1\44\1\u0101\1\u0102\1\u0103\1\u0104\1\u0105\1\uffff\1\44\5\uffff\2\44\1\u0109\1\uffff";
    static final String DFA12_eofS =
        "\u010a\uffff";
    static final String DFA12_minS =
        "\1\0\1\151\1\157\1\141\3\uffff\1\145\1\146\1\150\1\151\1\uffff\1\151\1\uffff\1\171\1\141\1\146\2\uffff\1\156\1\uffff\1\156\2\145\2\157\1\151\1\101\2\uffff\2\0\1\52\2\uffff\1\164\1\uffff\1\141\1\154\1\162\3\uffff\1\154\1\165\1\146\1\156\2\145\1\141\1\uffff\1\145\1\uffff\1\155\1\154\1\146\2\uffff\1\101\1\uffff\1\144\1\160\1\154\1\167\1\156\1\162\1\141\5\uffff\1\154\1\162\1\151\1\164\1\154\1\156\1\145\1\103\1\156\3\143\1\142\1\151\1\145\1\122\1\60\1\154\1\141\1\103\1\144\1\151\1\147\1\145\2\144\1\151\1\123\1\164\1\143\1\157\1\60\3\145\1\157\1\144\1\143\1\157\1\uffff\1\151\1\164\1\145\1\151\1\172\1\157\1\60\1\123\1\115\1\143\1\164\1\60\1\164\1\156\1\uffff\1\124\1\101\1\124\1\154\1\115\1\164\1\167\1\145\1\151\1\154\1\164\1\157\1\156\1\uffff\1\151\1\157\2\141\1\uffff\1\163\1\144\1\171\1\156\1\171\1\60\1\157\1\117\1\60\1\163\1\166\1\154\1\151\1\156\1\141\1\172\1\166\1\154\1\164\1\117\1\151\1\160\1\171\1\160\1\uffff\1\166\1\117\1\156\1\uffff\1\60\1\145\1\123\1\157\1\164\1\154\2\145\1\60\1\145\1\156\1\164\1\145\1\167\2\145\1\156\1\103\1\uffff\1\120\1\164\1\156\1\141\2\60\1\163\1\uffff\1\163\1\103\1\151\1\163\1\150\2\60\1\103\1\145\1\157\1\141\1\60\1\154\2\uffff\2\60\1\145\1\157\1\60\1\145\1\uffff\1\60\1\uffff\1\145\1\154\1\163\1\164\1\uffff\1\60\2\uffff\1\154\1\156\1\uffff\1\162\1\uffff\2\154\1\151\1\145\1\uffff\1\154\1\163\1\145\1\154\1\60\1\164\5\60\1\uffff\1\151\5\uffff\1\157\1\156\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\151\1\157\1\145\3\uffff\1\157\1\146\1\151\1\154\1\uffff\1\151\1\uffff\1\171\1\141\1\146\2\uffff\1\156\1\uffff\1\160\2\145\2\157\1\151\1\172\2\uffff\2\uffff\1\57\2\uffff\1\164\1\uffff\1\141\1\154\1\162\3\uffff\1\154\1\165\1\146\1\156\2\145\1\141\1\uffff\1\145\1\uffff\1\155\1\154\1\146\2\uffff\1\101\1\uffff\1\144\1\160\1\154\1\167\1\156\1\162\1\141\5\uffff\1\154\1\162\1\151\1\164\1\154\1\156\1\145\1\103\1\156\3\143\1\142\1\151\1\145\1\122\1\172\1\154\1\141\1\103\1\144\1\151\1\147\1\145\2\144\1\151\1\123\1\164\1\143\1\157\1\172\3\145\1\157\1\144\1\143\1\157\1\uffff\1\151\1\164\1\145\1\151\1\172\1\157\1\172\1\123\1\115\1\143\1\164\1\172\1\164\1\156\1\uffff\1\124\1\101\1\124\1\154\1\115\1\164\1\167\1\145\1\151\1\154\1\164\1\157\1\156\1\uffff\1\151\1\157\2\141\1\uffff\1\163\1\144\1\171\1\156\1\171\1\172\1\157\1\163\1\172\1\163\1\166\1\154\1\151\1\156\1\141\1\172\1\166\1\154\1\164\1\117\1\151\1\160\1\171\1\160\1\uffff\1\166\1\117\1\156\1\uffff\1\172\1\145\1\123\1\157\1\164\1\154\2\145\1\172\1\145\1\156\1\164\1\145\1\167\2\145\1\156\1\103\1\uffff\1\120\1\164\1\156\1\141\2\172\1\163\1\uffff\1\163\1\103\1\151\1\163\1\150\2\172\1\103\1\145\1\157\1\141\1\172\1\154\2\uffff\2\172\1\145\1\157\1\172\1\145\1\uffff\1\172\1\uffff\1\145\1\154\1\163\1\164\1\uffff\1\172\2\uffff\1\154\1\156\1\uffff\1\162\1\uffff\2\154\1\151\1\145\1\uffff\1\154\1\163\1\145\1\154\1\172\1\164\5\172\1\uffff\1\151\5\uffff\1\157\1\156\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\4\uffff\1\4\1\5\1\6\4\uffff\1\13\1\uffff\1\15\3\uffff\1\21\1\22\1\uffff\1\24\7\uffff\1\42\1\43\3\uffff\1\47\1\50\1\uffff\1\42\3\uffff\1\4\1\5\1\6\7\uffff\1\13\1\uffff\1\15\3\uffff\1\21\1\22\1\uffff\1\24\7\uffff\1\43\1\44\1\45\1\46\1\47\47\uffff\1\30\16\uffff\1\27\15\uffff\1\1\4\uffff\1\36\30\uffff\1\16\3\uffff\1\23\22\uffff\1\35\7\uffff\1\40\15\uffff\1\41\1\2\6\uffff\1\14\1\uffff\1\25\4\uffff\1\34\1\uffff\1\3\1\7\2\uffff\1\12\1\uffff\1\17\4\uffff\1\37\13\uffff\1\31\1\uffff\1\33\1\10\1\11\1\26\1\20\3\uffff\1\32";
    static final String DFA12_specialS =
        "\1\1\35\uffff\1\2\1\0\u00ea\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\42\2\41\2\42\1\41\22\42\1\41\1\42\1\36\4\42\1\37\1\15\1\21\2\42\1\5\1\24\1\42\1\40\12\35\7\42\1\34\1\2\1\30\1\34\1\20\3\34\1\23\6\34\1\14\2\34\1\16\1\1\1\34\1\17\4\34\1\4\1\42\1\6\1\33\1\34\1\42\1\25\1\34\1\7\1\32\1\10\2\34\1\31\5\34\1\27\1\34\1\12\1\34\1\26\3\34\1\3\1\11\3\34\1\13\1\42\1\22\uff82\42",
            "\1\43",
            "\1\45",
            "\1\46\3\uffff\1\47",
            "",
            "",
            "",
            "\1\53\11\uffff\1\54",
            "\1\55",
            "\1\57\1\56",
            "\1\60\2\uffff\1\61",
            "",
            "\1\63",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "",
            "",
            "\1\72",
            "",
            "\1\74\1\uffff\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\0\104",
            "\0\104",
            "\1\105\4\uffff\1\106",
            "",
            "",
            "\1\110",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "",
            "",
            "",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "\1\123",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "",
            "\1\127",
            "",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "",
            "",
            "",
            "",
            "",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0092",
            "\1\u0093",
            "",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00ab",
            "\1\u00ad\43\uffff\1\u00ac",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00d9",
            "",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\22\44\1\u00e0\7\44",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00e7",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00ea",
            "\1\u00eb",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00ed",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\1\u00f4",
            "\1\u00f5",
            "",
            "\1\u00f6",
            "",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0100",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u0106",
            "",
            "",
            "",
            "",
            "",
            "\1\u0107",
            "\1\u0108",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_31 = input.LA(1);

                        s = -1;
                        if ( ((LA12_31>='\u0000' && LA12_31<='\uFFFF')) ) {s = 68;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='T') ) {s = 1;}

                        else if ( (LA12_0=='B') ) {s = 2;}

                        else if ( (LA12_0=='v') ) {s = 3;}

                        else if ( (LA12_0=='[') ) {s = 4;}

                        else if ( (LA12_0==',') ) {s = 5;}

                        else if ( (LA12_0==']') ) {s = 6;}

                        else if ( (LA12_0=='c') ) {s = 7;}

                        else if ( (LA12_0=='e') ) {s = 8;}

                        else if ( (LA12_0=='w') ) {s = 9;}

                        else if ( (LA12_0=='p') ) {s = 10;}

                        else if ( (LA12_0=='{') ) {s = 11;}

                        else if ( (LA12_0=='P') ) {s = 12;}

                        else if ( (LA12_0=='(') ) {s = 13;}

                        else if ( (LA12_0=='S') ) {s = 14;}

                        else if ( (LA12_0=='V') ) {s = 15;}

                        else if ( (LA12_0=='E') ) {s = 16;}

                        else if ( (LA12_0==')') ) {s = 17;}

                        else if ( (LA12_0=='}') ) {s = 18;}

                        else if ( (LA12_0=='I') ) {s = 19;}

                        else if ( (LA12_0=='-') ) {s = 20;}

                        else if ( (LA12_0=='a') ) {s = 21;}

                        else if ( (LA12_0=='r') ) {s = 22;}

                        else if ( (LA12_0=='n') ) {s = 23;}

                        else if ( (LA12_0=='C') ) {s = 24;}

                        else if ( (LA12_0=='h') ) {s = 25;}

                        else if ( (LA12_0=='d') ) {s = 26;}

                        else if ( (LA12_0=='^') ) {s = 27;}

                        else if ( (LA12_0=='A'||LA12_0=='D'||(LA12_0>='F' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='O')||(LA12_0>='Q' && LA12_0<='R')||LA12_0=='U'||(LA12_0>='W' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||(LA12_0>='f' && LA12_0<='g')||(LA12_0>='i' && LA12_0<='m')||LA12_0=='o'||LA12_0=='q'||(LA12_0>='s' && LA12_0<='u')||(LA12_0>='x' && LA12_0<='z')) ) {s = 28;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 29;}

                        else if ( (LA12_0=='\"') ) {s = 30;}

                        else if ( (LA12_0=='\'') ) {s = 31;}

                        else if ( (LA12_0=='/') ) {s = 32;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 33;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||LA12_0=='.'||(LA12_0>=':' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 34;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_30 = input.LA(1);

                        s = -1;
                        if ( ((LA12_30>='\u0000' && LA12_30<='\uFFFF')) ) {s = 68;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}