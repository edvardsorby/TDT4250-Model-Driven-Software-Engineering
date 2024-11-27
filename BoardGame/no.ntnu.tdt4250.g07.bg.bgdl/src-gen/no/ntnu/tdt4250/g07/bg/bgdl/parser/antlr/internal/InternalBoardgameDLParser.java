package no.ntnu.tdt4250.g07.bg.bgdl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import no.ntnu.tdt4250.g07.bg.bgdl.services.BoardgameDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBoardgameDLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Size'", "'PieceType'", "'{'", "'symbol'", "'validmove'", "','", "'}'", "'effectoncell'", "'CellState'", "'WinCondition'", "'inarow'", "'placeAnywhere'", "'ValidMove'", "'condition'", "'EffectOnCell'", "'x'", "'y'", "'cellstate'", "'Condition'", "'('", "')'", "'-'", "'diagonal'", "'horizontal'", "'vertical'", "'InARow'", "'count'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
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
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBoardgameDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBoardgameDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBoardgameDLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBoardgameDL.g"; }



     	private BoardgameDLGrammarAccess grammarAccess;

        public InternalBoardgameDLParser(TokenStream input, BoardgameDLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "BoardGame";
       	}

       	@Override
       	protected BoardgameDLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBoardGame"
    // InternalBoardgameDL.g:64:1: entryRuleBoardGame returns [EObject current=null] : iv_ruleBoardGame= ruleBoardGame EOF ;
    public final EObject entryRuleBoardGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoardGame = null;


        try {
            // InternalBoardgameDL.g:64:50: (iv_ruleBoardGame= ruleBoardGame EOF )
            // InternalBoardgameDL.g:65:2: iv_ruleBoardGame= ruleBoardGame EOF
            {
             newCompositeNode(grammarAccess.getBoardGameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoardGame=ruleBoardGame();

            state._fsp--;

             current =iv_ruleBoardGame; 
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
    // $ANTLR end "entryRuleBoardGame"


    // $ANTLR start "ruleBoardGame"
    // InternalBoardgameDL.g:71:1: ruleBoardGame returns [EObject current=null] : ( ( (lv_piecetypes_0_0= rulePieceType ) )* ( (lv_cellstate_1_0= ruleCellState ) )* ( (lv_wincondition_2_0= ruleWinCondition ) )* otherlv_3= 'Size' ( (lv_size_4_0= ruleEInt ) ) ) ;
    public final EObject ruleBoardGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_piecetypes_0_0 = null;

        EObject lv_cellstate_1_0 = null;

        EObject lv_wincondition_2_0 = null;

        AntlrDatatypeRuleToken lv_size_4_0 = null;



        	enterRule();

        try {
            // InternalBoardgameDL.g:77:2: ( ( ( (lv_piecetypes_0_0= rulePieceType ) )* ( (lv_cellstate_1_0= ruleCellState ) )* ( (lv_wincondition_2_0= ruleWinCondition ) )* otherlv_3= 'Size' ( (lv_size_4_0= ruleEInt ) ) ) )
            // InternalBoardgameDL.g:78:2: ( ( (lv_piecetypes_0_0= rulePieceType ) )* ( (lv_cellstate_1_0= ruleCellState ) )* ( (lv_wincondition_2_0= ruleWinCondition ) )* otherlv_3= 'Size' ( (lv_size_4_0= ruleEInt ) ) )
            {
            // InternalBoardgameDL.g:78:2: ( ( (lv_piecetypes_0_0= rulePieceType ) )* ( (lv_cellstate_1_0= ruleCellState ) )* ( (lv_wincondition_2_0= ruleWinCondition ) )* otherlv_3= 'Size' ( (lv_size_4_0= ruleEInt ) ) )
            // InternalBoardgameDL.g:79:3: ( (lv_piecetypes_0_0= rulePieceType ) )* ( (lv_cellstate_1_0= ruleCellState ) )* ( (lv_wincondition_2_0= ruleWinCondition ) )* otherlv_3= 'Size' ( (lv_size_4_0= ruleEInt ) )
            {
            // InternalBoardgameDL.g:79:3: ( (lv_piecetypes_0_0= rulePieceType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBoardgameDL.g:80:4: (lv_piecetypes_0_0= rulePieceType )
            	    {
            	    // InternalBoardgameDL.g:80:4: (lv_piecetypes_0_0= rulePieceType )
            	    // InternalBoardgameDL.g:81:5: lv_piecetypes_0_0= rulePieceType
            	    {

            	    					newCompositeNode(grammarAccess.getBoardGameAccess().getPiecetypesPieceTypeParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_piecetypes_0_0=rulePieceType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBoardGameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"piecetypes",
            	    						lv_piecetypes_0_0,
            	    						"no.ntnu.tdt4250.g07.bg.bgdl.BoardgameDL.PieceType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalBoardgameDL.g:98:3: ( (lv_cellstate_1_0= ruleCellState ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBoardgameDL.g:99:4: (lv_cellstate_1_0= ruleCellState )
            	    {
            	    // InternalBoardgameDL.g:99:4: (lv_cellstate_1_0= ruleCellState )
            	    // InternalBoardgameDL.g:100:5: lv_cellstate_1_0= ruleCellState
            	    {

            	    					newCompositeNode(grammarAccess.getBoardGameAccess().getCellstateCellStateParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_cellstate_1_0=ruleCellState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBoardGameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cellstate",
            	    						lv_cellstate_1_0,
            	    						"no.ntnu.tdt4250.g07.bg.bgdl.BoardgameDL.CellState");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalBoardgameDL.g:117:3: ( (lv_wincondition_2_0= ruleWinCondition ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBoardgameDL.g:118:4: (lv_wincondition_2_0= ruleWinCondition )
            	    {
            	    // InternalBoardgameDL.g:118:4: (lv_wincondition_2_0= ruleWinCondition )
            	    // InternalBoardgameDL.g:119:5: lv_wincondition_2_0= ruleWinCondition
            	    {

            	    					newCompositeNode(grammarAccess.getBoardGameAccess().getWinconditionWinConditionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_wincondition_2_0=ruleWinCondition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBoardGameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"wincondition",
            	    						lv_wincondition_2_0,
            	    						"no.ntnu.tdt4250.g07.bg.bgdl.BoardgameDL.WinCondition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_3=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getBoardGameAccess().getSizeKeyword_3());
            		
            // InternalBoardgameDL.g:140:3: ( (lv_size_4_0= ruleEInt ) )
            // InternalBoardgameDL.g:141:4: (lv_size_4_0= ruleEInt )
            {
            // InternalBoardgameDL.g:141:4: (lv_size_4_0= ruleEInt )
            // InternalBoardgameDL.g:142:5: lv_size_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getBoardGameAccess().getSizeEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_size_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoardGameRule());
            					}
            					set(
            						current,
            						"size",
            						lv_size_4_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardgameDL.EInt");
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
    // $ANTLR end "ruleBoardGame"


    // $ANTLR start "entryRuleEString"
    // InternalBoardgameDL.g:163:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBoardgameDL.g:163:47: (iv_ruleEString= ruleEString EOF )
            // InternalBoardgameDL.g:164:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalBoardgameDL.g:170:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBoardgameDL.g:176:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBoardgameDL.g:177:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBoardgameDL.g:177:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalBoardgameDL.g:178:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBoardgameDL.g:186:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePieceType"
    // InternalBoardgameDL.g:197:1: entryRulePieceType returns [EObject current=null] : iv_rulePieceType= rulePieceType EOF ;
    public final EObject entryRulePieceType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePieceType = null;


        try {
            // InternalBoardgameDL.g:197:50: (iv_rulePieceType= rulePieceType EOF )
            // InternalBoardgameDL.g:198:2: iv_rulePieceType= rulePieceType EOF
            {
             newCompositeNode(grammarAccess.getPieceTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePieceType=rulePieceType();

            state._fsp--;

             current =iv_rulePieceType; 
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
    // $ANTLR end "entryRulePieceType"


    // $ANTLR start "rulePieceType"
    // InternalBoardgameDL.g:204:1: rulePieceType returns [EObject current=null] : (otherlv_0= 'PieceType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'symbol' ( (lv_symbol_4_0= ruleEString ) ) otherlv_5= 'validmove' otherlv_6= '{' ( (lv_validmove_7_0= ruleValidMove ) ) (otherlv_8= ',' ( (lv_validmove_9_0= ruleValidMove ) ) )* otherlv_10= '}' (otherlv_11= 'effectoncell' otherlv_12= '{' ( (lv_effectoncell_13_0= ruleEffectOnCell ) ) (otherlv_14= ',' ( (lv_effectoncell_15_0= ruleEffectOnCell ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) ;
    public final EObject rulePieceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_symbol_4_0 = null;

        EObject lv_validmove_7_0 = null;

        EObject lv_validmove_9_0 = null;

        EObject lv_effectoncell_13_0 = null;

        EObject lv_effectoncell_15_0 = null;



        	enterRule();

        try {
            // InternalBoardgameDL.g:210:2: ( (otherlv_0= 'PieceType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'symbol' ( (lv_symbol_4_0= ruleEString ) ) otherlv_5= 'validmove' otherlv_6= '{' ( (lv_validmove_7_0= ruleValidMove ) ) (otherlv_8= ',' ( (lv_validmove_9_0= ruleValidMove ) ) )* otherlv_10= '}' (otherlv_11= 'effectoncell' otherlv_12= '{' ( (lv_effectoncell_13_0= ruleEffectOnCell ) ) (otherlv_14= ',' ( (lv_effectoncell_15_0= ruleEffectOnCell ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) )
            // InternalBoardgameDL.g:211:2: (otherlv_0= 'PieceType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'symbol' ( (lv_symbol_4_0= ruleEString ) ) otherlv_5= 'validmove' otherlv_6= '{' ( (lv_validmove_7_0= ruleValidMove ) ) (otherlv_8= ',' ( (lv_validmove_9_0= ruleValidMove ) ) )* otherlv_10= '}' (otherlv_11= 'effectoncell' otherlv_12= '{' ( (lv_effectoncell_13_0= ruleEffectOnCell ) ) (otherlv_14= ',' ( (lv_effectoncell_15_0= ruleEffectOnCell ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            {
            // InternalBoardgameDL.g:211:2: (otherlv_0= 'PieceType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'symbol' ( (lv_symbol_4_0= ruleEString ) ) otherlv_5= 'validmove' otherlv_6= '{' ( (lv_validmove_7_0= ruleValidMove ) ) (otherlv_8= ',' ( (lv_validmove_9_0= ruleValidMove ) ) )* otherlv_10= '}' (otherlv_11= 'effectoncell' otherlv_12= '{' ( (lv_effectoncell_13_0= ruleEffectOnCell ) ) (otherlv_14= ',' ( (lv_effectoncell_15_0= ruleEffectOnCell ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            // InternalBoardgameDL.g:212:3: otherlv_0= 'PieceType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'symbol' ( (lv_symbol_4_0= ruleEString ) ) otherlv_5= 'validmove' otherlv_6= '{' ( (lv_validmove_7_0= ruleValidMove ) ) (otherlv_8= ',' ( (lv_validmove_9_0= ruleValidMove ) ) )* otherlv_10= '}' (otherlv_11= 'effectoncell' otherlv_12= '{' ( (lv_effectoncell_13_0= ruleEffectOnCell ) ) (otherlv_14= ',' ( (lv_effectoncell_15_0= ruleEffectOnCell ) ) )* otherlv_16= '}' )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPieceTypeAccess().getPieceTypeKeyword_0());
            		
            // InternalBoardgameDL.g:216:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBoardgameDL.g:217:4: (lv_name_1_0= ruleEString )
            {
            // InternalBoardgameDL.g:217:4: (lv_name_1_0= ruleEString )
            // InternalBoardgameDL.g:218:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPieceTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPieceTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardgameDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getPieceTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getPieceTypeAccess().getSymbolKeyword_3());
            		
            // InternalBoardgameDL.g:243:3: ( (lv_symbol_4_0= ruleEString ) )
            // InternalBoardgameDL.g:244:4: (lv_symbol_4_0= ruleEString )
            {
            // InternalBoardgameDL.g:244:4: (lv_symbol_4_0= ruleEString )
            // InternalBoardgameDL.g:245:5: lv_symbol_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPieceTypeAccess().getSymbolEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_symbol_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPieceTypeRule());
            					}
            					set(
            						current,
            						"symbol",
            						lv_symbol_4_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardgameDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getPieceTypeAccess().getValidmoveKeyword_5());
            		
            otherlv_6=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getPieceTypeAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalBoardgameDL.g:270:3: ( (lv_validmove_7_0= ruleValidMove ) )
            // InternalBoardgameDL.g:271:4: (lv_validmove_7_0= ruleValidMove )
            {
            // InternalBoardgameDL.g:271:4: (lv_validmove_7_0= ruleValidMove )
            // InternalBoardgameDL.g:272:5: lv_validmove_7_0= ruleValidMove
            {

            					newCompositeNode(grammarAccess.getPieceTypeAccess().getValidmoveValidMoveParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_12);
            lv_validmove_7_0=ruleValidMove();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPieceTypeRule());
            					}
            					add(
            						current,
            						"validmove",
            						lv_validmove_7_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardgameDL.ValidMove");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBoardgameDL.g:289:3: (otherlv_8= ',' ( (lv_validmove_9_0= ruleValidMove ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBoardgameDL.g:290:4: otherlv_8= ',' ( (lv_validmove_9_0= ruleValidMove ) )
            	    {
            	    otherlv_8=(Token)match(input,16,FOLLOW_11); 

            	    				newLeafNode(otherlv_8, grammarAccess.getPieceTypeAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalBoardgameDL.g:294:4: ( (lv_validmove_9_0= ruleValidMove ) )
            	    // InternalBoardgameDL.g:295:5: (lv_validmove_9_0= ruleValidMove )
            	    {
            	    // InternalBoardgameDL.g:295:5: (lv_validmove_9_0= ruleValidMove )
            	    // InternalBoardgameDL.g:296:6: lv_validmove_9_0= ruleValidMove
            	    {

            	    						newCompositeNode(grammarAccess.getPieceTypeAccess().getValidmoveValidMoveParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_validmove_9_0=ruleValidMove();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPieceTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"validmove",
            	    							lv_validmove_9_0,
            	    							"no.ntnu.tdt4250.g07.bg.bgdl.BoardgameDL.ValidMove");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_10=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_10, grammarAccess.getPieceTypeAccess().getRightCurlyBracketKeyword_9());
            		
            // InternalBoardgameDL.g:318:3: (otherlv_11= 'effectoncell' otherlv_12= '{' ( (lv_effectoncell_13_0= ruleEffectOnCell ) ) (otherlv_14= ',' ( (lv_effectoncell_15_0= ruleEffectOnCell ) ) )* otherlv_16= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBoardgameDL.g:319:4: otherlv_11= 'effectoncell' otherlv_12= '{' ( (lv_effectoncell_13_0= ruleEffectOnCell ) ) (otherlv_14= ',' ( (lv_effectoncell_15_0= ruleEffectOnCell ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_11, grammarAccess.getPieceTypeAccess().getEffectoncellKeyword_10_0());
                    			
                    otherlv_12=(Token)match(input,13,FOLLOW_14); 

                    				newLeafNode(otherlv_12, grammarAccess.getPieceTypeAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalBoardgameDL.g:327:4: ( (lv_effectoncell_13_0= ruleEffectOnCell ) )
                    // InternalBoardgameDL.g:328:5: (lv_effectoncell_13_0= ruleEffectOnCell )
                    {
                    // InternalBoardgameDL.g:328:5: (lv_effectoncell_13_0= ruleEffectOnCell )
                    // InternalBoardgameDL.g:329:6: lv_effectoncell_13_0= ruleEffectOnCell
                    {

                    						newCompositeNode(grammarAccess.getPieceTypeAccess().getEffectoncellEffectOnCellParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_effectoncell_13_0=ruleEffectOnCell();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPieceTypeRule());
                    						}
                    						add(
                    							current,
                    							"effectoncell",
                    							lv_effectoncell_13_0,
                    							"no.ntnu.tdt4250.g07.bg.bgdl.BoardgameDL.EffectOnCell");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBoardgameDL.g:346:4: (otherlv_14= ',' ( (lv_effectoncell_15_0= ruleEffectOnCell ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==16) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalBoardgameDL.g:347:5: otherlv_14= ',' ( (lv_effectoncell_15_0= ruleEffectOnCell ) )
                    	    {
                    	    otherlv_14=(Token)match(input,16,FOLLOW_14); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getPieceTypeAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalBoardgameDL.g:351:5: ( (lv_effectoncell_15_0= ruleEffectOnCell ) )
                    	    // InternalBoardgameDL.g:352:6: (lv_effectoncell_15_0= ruleEffectOnCell )
                    	    {
                    	    // InternalBoardgameDL.g:352:6: (lv_effectoncell_15_0= ruleEffectOnCell )
                    	    // InternalBoardgameDL.g:353:7: lv_effectoncell_15_0= ruleEffectOnCell
                    	    {

                    	    							newCompositeNode(grammarAccess.getPieceTypeAccess().getEffectoncellEffectOnCellParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_effectoncell_15_0=ruleEffectOnCell();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPieceTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"effectoncell",
                    	    								lv_effectoncell_15_0,
                    	    								"no.ntnu.tdt4250.g07.bg.bgdl.BoardgameDL.EffectOnCell");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_16, grammarAccess.getPieceTypeAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getPieceTypeAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "rulePieceType"


    // $ANTLR start "entryRuleCellState"
    // InternalBoardgameDL.g:384:1: entryRuleCellState returns [EObject current=null] : iv_ruleCellState= ruleCellState EOF ;
    public final EObject entryRuleCellState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellState = null;


        try {
            // InternalBoardgameDL.g:384:50: (iv_ruleCellState= ruleCellState EOF )
            // InternalBoardgameDL.g:385:2: iv_ruleCellState= ruleCellState EOF
            {
             newCompositeNode(grammarAccess.getCellStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCellState=ruleCellState();

            state._fsp--;

             current =iv_ruleCellState; 
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
    // $ANTLR end "entryRuleCellState"


    // $ANTLR start "ruleCellState"
    // InternalBoardgameDL.g:391:1: ruleCellState returns [EObject current=null] : ( () otherlv_1= 'CellState' ) ;
    public final EObject ruleCellState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBoardgameDL.g:397:2: ( ( () otherlv_1= 'CellState' ) )
            // InternalBoardgameDL.g:398:2: ( () otherlv_1= 'CellState' )
            {
            // InternalBoardgameDL.g:398:2: ( () otherlv_1= 'CellState' )
            // InternalBoardgameDL.g:399:3: () otherlv_1= 'CellState'
            {
            // InternalBoardgameDL.g:399:3: ()
            // InternalBoardgameDL.g:400:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCellStateAccess().getCellStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getCellStateAccess().getCellStateKeyword_1());
            		

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
    // $ANTLR end "ruleCellState"


    // $ANTLR start "entryRuleWinCondition"
    // InternalBoardgameDL.g:414:1: entryRuleWinCondition returns [EObject current=null] : iv_ruleWinCondition= ruleWinCondition EOF ;
    public final EObject entryRuleWinCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWinCondition = null;


        try {
            // InternalBoardgameDL.g:414:53: (iv_ruleWinCondition= ruleWinCondition EOF )
            // InternalBoardgameDL.g:415:2: iv_ruleWinCondition= ruleWinCondition EOF
            {
             newCompositeNode(grammarAccess.getWinConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWinCondition=ruleWinCondition();

            state._fsp--;

             current =iv_ruleWinCondition; 
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
    // $ANTLR end "entryRuleWinCondition"


    // $ANTLR start "ruleWinCondition"
    // InternalBoardgameDL.g:421:1: ruleWinCondition returns [EObject current=null] : (otherlv_0= 'WinCondition' otherlv_1= '{' otherlv_2= 'inarow' ( (lv_inarow_3_0= ruleInARow ) ) otherlv_4= '}' ) ;
    public final EObject ruleWinCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_inarow_3_0 = null;



        	enterRule();

        try {
            // InternalBoardgameDL.g:427:2: ( (otherlv_0= 'WinCondition' otherlv_1= '{' otherlv_2= 'inarow' ( (lv_inarow_3_0= ruleInARow ) ) otherlv_4= '}' ) )
            // InternalBoardgameDL.g:428:2: (otherlv_0= 'WinCondition' otherlv_1= '{' otherlv_2= 'inarow' ( (lv_inarow_3_0= ruleInARow ) ) otherlv_4= '}' )
            {
            // InternalBoardgameDL.g:428:2: (otherlv_0= 'WinCondition' otherlv_1= '{' otherlv_2= 'inarow' ( (lv_inarow_3_0= ruleInARow ) ) otherlv_4= '}' )
            // InternalBoardgameDL.g:429:3: otherlv_0= 'WinCondition' otherlv_1= '{' otherlv_2= 'inarow' ( (lv_inarow_3_0= ruleInARow ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getWinConditionAccess().getWinConditionKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getWinConditionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getWinConditionAccess().getInarowKeyword_2());
            		
            // InternalBoardgameDL.g:441:3: ( (lv_inarow_3_0= ruleInARow ) )
            // InternalBoardgameDL.g:442:4: (lv_inarow_3_0= ruleInARow )
            {
            // InternalBoardgameDL.g:442:4: (lv_inarow_3_0= ruleInARow )
            // InternalBoardgameDL.g:443:5: lv_inarow_3_0= ruleInARow
            {

            					newCompositeNode(grammarAccess.getWinConditionAccess().getInarowInARowParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_inarow_3_0=ruleInARow();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWinConditionRule());
            					}
            					set(
            						current,
            						"inarow",
            						lv_inarow_3_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardgameDL.InARow");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getWinConditionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleWinCondition"


    // $ANTLR start "entryRuleValidMove"
    // InternalBoardgameDL.g:468:1: entryRuleValidMove returns [EObject current=null] : iv_ruleValidMove= ruleValidMove EOF ;
    public final EObject entryRuleValidMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidMove = null;


        try {
            // InternalBoardgameDL.g:468:50: (iv_ruleValidMove= ruleValidMove EOF )
            // InternalBoardgameDL.g:469:2: iv_ruleValidMove= ruleValidMove EOF
            {
             newCompositeNode(grammarAccess.getValidMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValidMove=ruleValidMove();

            state._fsp--;

             current =iv_ruleValidMove; 
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
    // $ANTLR end "entryRuleValidMove"


    // $ANTLR start "ruleValidMove"
    // InternalBoardgameDL.g:475:1: ruleValidMove returns [EObject current=null] : ( ( (lv_placeAnywhere_0_0= 'placeAnywhere' ) ) otherlv_1= 'ValidMove' otherlv_2= '{' (otherlv_3= 'condition' otherlv_4= '{' ( (lv_condition_5_0= ruleCondition ) ) (otherlv_6= ',' ( (lv_condition_7_0= ruleCondition ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleValidMove() throws RecognitionException {
        EObject current = null;

        Token lv_placeAnywhere_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_condition_5_0 = null;

        EObject lv_condition_7_0 = null;



        	enterRule();

        try {
            // InternalBoardgameDL.g:481:2: ( ( ( (lv_placeAnywhere_0_0= 'placeAnywhere' ) ) otherlv_1= 'ValidMove' otherlv_2= '{' (otherlv_3= 'condition' otherlv_4= '{' ( (lv_condition_5_0= ruleCondition ) ) (otherlv_6= ',' ( (lv_condition_7_0= ruleCondition ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalBoardgameDL.g:482:2: ( ( (lv_placeAnywhere_0_0= 'placeAnywhere' ) ) otherlv_1= 'ValidMove' otherlv_2= '{' (otherlv_3= 'condition' otherlv_4= '{' ( (lv_condition_5_0= ruleCondition ) ) (otherlv_6= ',' ( (lv_condition_7_0= ruleCondition ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalBoardgameDL.g:482:2: ( ( (lv_placeAnywhere_0_0= 'placeAnywhere' ) ) otherlv_1= 'ValidMove' otherlv_2= '{' (otherlv_3= 'condition' otherlv_4= '{' ( (lv_condition_5_0= ruleCondition ) ) (otherlv_6= ',' ( (lv_condition_7_0= ruleCondition ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalBoardgameDL.g:483:3: ( (lv_placeAnywhere_0_0= 'placeAnywhere' ) ) otherlv_1= 'ValidMove' otherlv_2= '{' (otherlv_3= 'condition' otherlv_4= '{' ( (lv_condition_5_0= ruleCondition ) ) (otherlv_6= ',' ( (lv_condition_7_0= ruleCondition ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalBoardgameDL.g:483:3: ( (lv_placeAnywhere_0_0= 'placeAnywhere' ) )
            // InternalBoardgameDL.g:484:4: (lv_placeAnywhere_0_0= 'placeAnywhere' )
            {
            // InternalBoardgameDL.g:484:4: (lv_placeAnywhere_0_0= 'placeAnywhere' )
            // InternalBoardgameDL.g:485:5: lv_placeAnywhere_0_0= 'placeAnywhere'
            {
            lv_placeAnywhere_0_0=(Token)match(input,22,FOLLOW_18); 

            					newLeafNode(lv_placeAnywhere_0_0, grammarAccess.getValidMoveAccess().getPlaceAnywherePlaceAnywhereKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValidMoveRule());
            					}
            					setWithLastConsumed(current, "placeAnywhere", lv_placeAnywhere_0_0 != null, "placeAnywhere");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getValidMoveAccess().getValidMoveKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getValidMoveAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBoardgameDL.g:505:3: (otherlv_3= 'condition' otherlv_4= '{' ( (lv_condition_5_0= ruleCondition ) ) (otherlv_6= ',' ( (lv_condition_7_0= ruleCondition ) ) )* otherlv_8= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBoardgameDL.g:506:4: otherlv_3= 'condition' otherlv_4= '{' ( (lv_condition_5_0= ruleCondition ) ) (otherlv_6= ',' ( (lv_condition_7_0= ruleCondition ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getValidMoveAccess().getConditionKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,13,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getValidMoveAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalBoardgameDL.g:514:4: ( (lv_condition_5_0= ruleCondition ) )
                    // InternalBoardgameDL.g:515:5: (lv_condition_5_0= ruleCondition )
                    {
                    // InternalBoardgameDL.g:515:5: (lv_condition_5_0= ruleCondition )
                    // InternalBoardgameDL.g:516:6: lv_condition_5_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getValidMoveAccess().getConditionConditionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_condition_5_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValidMoveRule());
                    						}
                    						add(
                    							current,
                    							"condition",
                    							lv_condition_5_0,
                    							"no.ntnu.tdt4250.g07.bg.bgdl.BoardgameDL.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBoardgameDL.g:533:4: (otherlv_6= ',' ( (lv_condition_7_0= ruleCondition ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==16) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalBoardgameDL.g:534:5: otherlv_6= ',' ( (lv_condition_7_0= ruleCondition ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_20); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getValidMoveAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalBoardgameDL.g:538:5: ( (lv_condition_7_0= ruleCondition ) )
                    	    // InternalBoardgameDL.g:539:6: (lv_condition_7_0= ruleCondition )
                    	    {
                    	    // InternalBoardgameDL.g:539:6: (lv_condition_7_0= ruleCondition )
                    	    // InternalBoardgameDL.g:540:7: lv_condition_7_0= ruleCondition
                    	    {

                    	    							newCompositeNode(grammarAccess.getValidMoveAccess().getConditionConditionParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_condition_7_0=ruleCondition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getValidMoveRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"condition",
                    	    								lv_condition_7_0,
                    	    								"no.ntnu.tdt4250.g07.bg.bgdl.BoardgameDL.Condition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getValidMoveAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getValidMoveAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleValidMove"


    // $ANTLR start "entryRuleEffectOnCell"
    // InternalBoardgameDL.g:571:1: entryRuleEffectOnCell returns [EObject current=null] : iv_ruleEffectOnCell= ruleEffectOnCell EOF ;
    public final EObject entryRuleEffectOnCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectOnCell = null;


        try {
            // InternalBoardgameDL.g:571:53: (iv_ruleEffectOnCell= ruleEffectOnCell EOF )
            // InternalBoardgameDL.g:572:2: iv_ruleEffectOnCell= ruleEffectOnCell EOF
            {
             newCompositeNode(grammarAccess.getEffectOnCellRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectOnCell=ruleEffectOnCell();

            state._fsp--;

             current =iv_ruleEffectOnCell; 
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
    // $ANTLR end "entryRuleEffectOnCell"


    // $ANTLR start "ruleEffectOnCell"
    // InternalBoardgameDL.g:578:1: ruleEffectOnCell returns [EObject current=null] : (otherlv_0= 'EffectOnCell' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) otherlv_6= 'cellstate' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleEffectOnCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_x_3_0 = null;

        AntlrDatatypeRuleToken lv_y_5_0 = null;



        	enterRule();

        try {
            // InternalBoardgameDL.g:584:2: ( (otherlv_0= 'EffectOnCell' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) otherlv_6= 'cellstate' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalBoardgameDL.g:585:2: (otherlv_0= 'EffectOnCell' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) otherlv_6= 'cellstate' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalBoardgameDL.g:585:2: (otherlv_0= 'EffectOnCell' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) otherlv_6= 'cellstate' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalBoardgameDL.g:586:3: otherlv_0= 'EffectOnCell' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) otherlv_6= 'cellstate' ( ( ruleEString ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectOnCellAccess().getEffectOnCellKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectOnCellAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getEffectOnCellAccess().getXKeyword_2());
            		
            // InternalBoardgameDL.g:598:3: ( (lv_x_3_0= ruleEInt ) )
            // InternalBoardgameDL.g:599:4: (lv_x_3_0= ruleEInt )
            {
            // InternalBoardgameDL.g:599:4: (lv_x_3_0= ruleEInt )
            // InternalBoardgameDL.g:600:5: lv_x_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getEffectOnCellAccess().getXEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_x_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectOnCellRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_3_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardgameDL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getEffectOnCellAccess().getYKeyword_4());
            		
            // InternalBoardgameDL.g:621:3: ( (lv_y_5_0= ruleEInt ) )
            // InternalBoardgameDL.g:622:4: (lv_y_5_0= ruleEInt )
            {
            // InternalBoardgameDL.g:622:4: (lv_y_5_0= ruleEInt )
            // InternalBoardgameDL.g:623:5: lv_y_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getEffectOnCellAccess().getYEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_23);
            lv_y_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectOnCellRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_5_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardgameDL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getEffectOnCellAccess().getCellstateKeyword_6());
            		
            // InternalBoardgameDL.g:644:3: ( ( ruleEString ) )
            // InternalBoardgameDL.g:645:4: ( ruleEString )
            {
            // InternalBoardgameDL.g:645:4: ( ruleEString )
            // InternalBoardgameDL.g:646:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEffectOnCellRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEffectOnCellAccess().getCellstateCellStateCrossReference_7_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getEffectOnCellAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleEffectOnCell"


    // $ANTLR start "entryRuleCondition"
    // InternalBoardgameDL.g:668:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalBoardgameDL.g:668:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalBoardgameDL.g:669:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalBoardgameDL.g:675:1: ruleCondition returns [EObject current=null] : ( () otherlv_1= 'Condition' otherlv_2= '{' (otherlv_3= 'cellstate' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalBoardgameDL.g:681:2: ( ( () otherlv_1= 'Condition' otherlv_2= '{' (otherlv_3= 'cellstate' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' ) )
            // InternalBoardgameDL.g:682:2: ( () otherlv_1= 'Condition' otherlv_2= '{' (otherlv_3= 'cellstate' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' )
            {
            // InternalBoardgameDL.g:682:2: ( () otherlv_1= 'Condition' otherlv_2= '{' (otherlv_3= 'cellstate' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' )
            // InternalBoardgameDL.g:683:3: () otherlv_1= 'Condition' otherlv_2= '{' (otherlv_3= 'cellstate' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}'
            {
            // InternalBoardgameDL.g:683:3: ()
            // InternalBoardgameDL.g:684:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConditionAccess().getConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getConditionKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBoardgameDL.g:698:3: (otherlv_3= 'cellstate' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBoardgameDL.g:699:4: otherlv_3= 'cellstate' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_25); 

                    				newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getCellstateKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,30,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalBoardgameDL.g:707:4: ( ( ruleEString ) )
                    // InternalBoardgameDL.g:708:5: ( ruleEString )
                    {
                    // InternalBoardgameDL.g:708:5: ( ruleEString )
                    // InternalBoardgameDL.g:709:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConditionAccess().getCellstateCellStateCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBoardgameDL.g:723:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==16) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalBoardgameDL.g:724:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_7); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getConditionAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalBoardgameDL.g:728:5: ( ( ruleEString ) )
                    	    // InternalBoardgameDL.g:729:6: ( ruleEString )
                    	    {
                    	    // InternalBoardgameDL.g:729:6: ( ruleEString )
                    	    // InternalBoardgameDL.g:730:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getConditionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getConditionAccess().getCellstateCellStateCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,31,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getConditionAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleEInt"
    // InternalBoardgameDL.g:758:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalBoardgameDL.g:758:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalBoardgameDL.g:759:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalBoardgameDL.g:765:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalBoardgameDL.g:771:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalBoardgameDL.g:772:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalBoardgameDL.g:772:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalBoardgameDL.g:773:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalBoardgameDL.g:773:3: (kw= '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBoardgameDL.g:774:4: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_27); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleInARow"
    // InternalBoardgameDL.g:791:1: entryRuleInARow returns [EObject current=null] : iv_ruleInARow= ruleInARow EOF ;
    public final EObject entryRuleInARow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInARow = null;


        try {
            // InternalBoardgameDL.g:791:47: (iv_ruleInARow= ruleInARow EOF )
            // InternalBoardgameDL.g:792:2: iv_ruleInARow= ruleInARow EOF
            {
             newCompositeNode(grammarAccess.getInARowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInARow=ruleInARow();

            state._fsp--;

             current =iv_ruleInARow; 
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
    // $ANTLR end "entryRuleInARow"


    // $ANTLR start "ruleInARow"
    // InternalBoardgameDL.g:798:1: ruleInARow returns [EObject current=null] : ( ( (lv_diagonal_0_0= 'diagonal' ) ) ( (lv_horizontal_1_0= 'horizontal' ) ) ( (lv_vertical_2_0= 'vertical' ) ) otherlv_3= 'InARow' otherlv_4= '{' otherlv_5= 'count' ( (lv_count_6_0= ruleEInt ) ) otherlv_7= '}' ) ;
    public final EObject ruleInARow() throws RecognitionException {
        EObject current = null;

        Token lv_diagonal_0_0=null;
        Token lv_horizontal_1_0=null;
        Token lv_vertical_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_count_6_0 = null;



        	enterRule();

        try {
            // InternalBoardgameDL.g:804:2: ( ( ( (lv_diagonal_0_0= 'diagonal' ) ) ( (lv_horizontal_1_0= 'horizontal' ) ) ( (lv_vertical_2_0= 'vertical' ) ) otherlv_3= 'InARow' otherlv_4= '{' otherlv_5= 'count' ( (lv_count_6_0= ruleEInt ) ) otherlv_7= '}' ) )
            // InternalBoardgameDL.g:805:2: ( ( (lv_diagonal_0_0= 'diagonal' ) ) ( (lv_horizontal_1_0= 'horizontal' ) ) ( (lv_vertical_2_0= 'vertical' ) ) otherlv_3= 'InARow' otherlv_4= '{' otherlv_5= 'count' ( (lv_count_6_0= ruleEInt ) ) otherlv_7= '}' )
            {
            // InternalBoardgameDL.g:805:2: ( ( (lv_diagonal_0_0= 'diagonal' ) ) ( (lv_horizontal_1_0= 'horizontal' ) ) ( (lv_vertical_2_0= 'vertical' ) ) otherlv_3= 'InARow' otherlv_4= '{' otherlv_5= 'count' ( (lv_count_6_0= ruleEInt ) ) otherlv_7= '}' )
            // InternalBoardgameDL.g:806:3: ( (lv_diagonal_0_0= 'diagonal' ) ) ( (lv_horizontal_1_0= 'horizontal' ) ) ( (lv_vertical_2_0= 'vertical' ) ) otherlv_3= 'InARow' otherlv_4= '{' otherlv_5= 'count' ( (lv_count_6_0= ruleEInt ) ) otherlv_7= '}'
            {
            // InternalBoardgameDL.g:806:3: ( (lv_diagonal_0_0= 'diagonal' ) )
            // InternalBoardgameDL.g:807:4: (lv_diagonal_0_0= 'diagonal' )
            {
            // InternalBoardgameDL.g:807:4: (lv_diagonal_0_0= 'diagonal' )
            // InternalBoardgameDL.g:808:5: lv_diagonal_0_0= 'diagonal'
            {
            lv_diagonal_0_0=(Token)match(input,33,FOLLOW_28); 

            					newLeafNode(lv_diagonal_0_0, grammarAccess.getInARowAccess().getDiagonalDiagonalKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInARowRule());
            					}
            					setWithLastConsumed(current, "diagonal", lv_diagonal_0_0 != null, "diagonal");
            				

            }


            }

            // InternalBoardgameDL.g:820:3: ( (lv_horizontal_1_0= 'horizontal' ) )
            // InternalBoardgameDL.g:821:4: (lv_horizontal_1_0= 'horizontal' )
            {
            // InternalBoardgameDL.g:821:4: (lv_horizontal_1_0= 'horizontal' )
            // InternalBoardgameDL.g:822:5: lv_horizontal_1_0= 'horizontal'
            {
            lv_horizontal_1_0=(Token)match(input,34,FOLLOW_29); 

            					newLeafNode(lv_horizontal_1_0, grammarAccess.getInARowAccess().getHorizontalHorizontalKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInARowRule());
            					}
            					setWithLastConsumed(current, "horizontal", lv_horizontal_1_0 != null, "horizontal");
            				

            }


            }

            // InternalBoardgameDL.g:834:3: ( (lv_vertical_2_0= 'vertical' ) )
            // InternalBoardgameDL.g:835:4: (lv_vertical_2_0= 'vertical' )
            {
            // InternalBoardgameDL.g:835:4: (lv_vertical_2_0= 'vertical' )
            // InternalBoardgameDL.g:836:5: lv_vertical_2_0= 'vertical'
            {
            lv_vertical_2_0=(Token)match(input,35,FOLLOW_30); 

            					newLeafNode(lv_vertical_2_0, grammarAccess.getInARowAccess().getVerticalVerticalKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInARowRule());
            					}
            					setWithLastConsumed(current, "vertical", lv_vertical_2_0 != null, "vertical");
            				

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getInARowAccess().getInARowKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_31); 

            			newLeafNode(otherlv_4, grammarAccess.getInARowAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getInARowAccess().getCountKeyword_5());
            		
            // InternalBoardgameDL.g:860:3: ( (lv_count_6_0= ruleEInt ) )
            // InternalBoardgameDL.g:861:4: (lv_count_6_0= ruleEInt )
            {
            // InternalBoardgameDL.g:861:4: (lv_count_6_0= ruleEInt )
            // InternalBoardgameDL.g:862:5: lv_count_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getInARowAccess().getCountEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_15);
            lv_count_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInARowRule());
            					}
            					set(
            						current,
            						"count",
            						lv_count_6_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardgameDL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getInARowAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleInARow"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000181800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000180800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});

}