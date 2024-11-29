package no.ntnu.tdt4250.g07.bg.bgdl.parser.antlr.internal;

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
import no.ntnu.tdt4250.g07.bg.bgdl.services.BoardGameDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBoardGameDLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Title'", "'BoardSize'", "'PieceType'", "'{'", "'Symbol'", "'ValidMoves'", "','", "'EffectsOnCell'", "'}'", "'Cellstate'", "'WinCondition'", "'-'", "'ValidMove'", "'placeAnywhere'", "'valid'", "'if'", "'and'", "'EffectOnCell'", "'relativePosition'", "'('", "')'", "'newCellState'", "'Condition'", "'Line'", "'length'", "'direction'", "'ROW'", "'COLUMN'", "'DIAGONAL'"
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


        public InternalBoardGameDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBoardGameDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBoardGameDLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBoardGameDL.g"; }



     	private BoardGameDLGrammarAccess grammarAccess;

        public InternalBoardGameDLParser(TokenStream input, BoardGameDLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "BoardGame";
       	}

       	@Override
       	protected BoardGameDLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBoardGame"
    // InternalBoardGameDL.g:65:1: entryRuleBoardGame returns [EObject current=null] : iv_ruleBoardGame= ruleBoardGame EOF ;
    public final EObject entryRuleBoardGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoardGame = null;


        try {
            // InternalBoardGameDL.g:65:50: (iv_ruleBoardGame= ruleBoardGame EOF )
            // InternalBoardGameDL.g:66:2: iv_ruleBoardGame= ruleBoardGame EOF
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
    // InternalBoardGameDL.g:72:1: ruleBoardGame returns [EObject current=null] : (otherlv_0= 'Title' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'BoardSize' ( (lv_size_3_0= ruleEInt ) ) ( (lv_boardGameElements_4_0= ruleBoardGameElement ) )* ) ;
    public final EObject ruleBoardGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_size_3_0 = null;

        EObject lv_boardGameElements_4_0 = null;



        	enterRule();

        try {
            // InternalBoardGameDL.g:78:2: ( (otherlv_0= 'Title' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'BoardSize' ( (lv_size_3_0= ruleEInt ) ) ( (lv_boardGameElements_4_0= ruleBoardGameElement ) )* ) )
            // InternalBoardGameDL.g:79:2: (otherlv_0= 'Title' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'BoardSize' ( (lv_size_3_0= ruleEInt ) ) ( (lv_boardGameElements_4_0= ruleBoardGameElement ) )* )
            {
            // InternalBoardGameDL.g:79:2: (otherlv_0= 'Title' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'BoardSize' ( (lv_size_3_0= ruleEInt ) ) ( (lv_boardGameElements_4_0= ruleBoardGameElement ) )* )
            // InternalBoardGameDL.g:80:3: otherlv_0= 'Title' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'BoardSize' ( (lv_size_3_0= ruleEInt ) ) ( (lv_boardGameElements_4_0= ruleBoardGameElement ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBoardGameAccess().getTitleKeyword_0());
            		
            // InternalBoardGameDL.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBoardGameDL.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalBoardGameDL.g:85:4: (lv_name_1_0= ruleEString )
            // InternalBoardGameDL.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBoardGameAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoardGameRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getBoardGameAccess().getBoardSizeKeyword_2());
            		
            // InternalBoardGameDL.g:107:3: ( (lv_size_3_0= ruleEInt ) )
            // InternalBoardGameDL.g:108:4: (lv_size_3_0= ruleEInt )
            {
            // InternalBoardGameDL.g:108:4: (lv_size_3_0= ruleEInt )
            // InternalBoardGameDL.g:109:5: lv_size_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getBoardGameAccess().getSizeEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_size_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoardGameRule());
            					}
            					set(
            						current,
            						"size",
            						lv_size_3_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBoardGameDL.g:126:3: ( (lv_boardGameElements_4_0= ruleBoardGameElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||(LA1_0>=20 && LA1_0<=21)||LA1_0==23||LA1_0==28||LA1_0==33) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBoardGameDL.g:127:4: (lv_boardGameElements_4_0= ruleBoardGameElement )
            	    {
            	    // InternalBoardGameDL.g:127:4: (lv_boardGameElements_4_0= ruleBoardGameElement )
            	    // InternalBoardGameDL.g:128:5: lv_boardGameElements_4_0= ruleBoardGameElement
            	    {

            	    					newCompositeNode(grammarAccess.getBoardGameAccess().getBoardGameElementsBoardGameElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_boardGameElements_4_0=ruleBoardGameElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBoardGameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"boardGameElements",
            	    						lv_boardGameElements_4_0,
            	    						"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.BoardGameElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleBoardGameElement"
    // InternalBoardGameDL.g:149:1: entryRuleBoardGameElement returns [EObject current=null] : iv_ruleBoardGameElement= ruleBoardGameElement EOF ;
    public final EObject entryRuleBoardGameElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoardGameElement = null;


        try {
            // InternalBoardGameDL.g:149:57: (iv_ruleBoardGameElement= ruleBoardGameElement EOF )
            // InternalBoardGameDL.g:150:2: iv_ruleBoardGameElement= ruleBoardGameElement EOF
            {
             newCompositeNode(grammarAccess.getBoardGameElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoardGameElement=ruleBoardGameElement();

            state._fsp--;

             current =iv_ruleBoardGameElement; 
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
    // $ANTLR end "entryRuleBoardGameElement"


    // $ANTLR start "ruleBoardGameElement"
    // InternalBoardGameDL.g:156:1: ruleBoardGameElement returns [EObject current=null] : (this_PieceType_0= rulePieceType | this_EffectOnCell_1= ruleEffectOnCell | this_ValidMove_2= ruleValidMove | this_CellState_3= ruleCellState | this_WinCondition_4= ruleWinCondition | this_Condition_5= ruleCondition ) ;
    public final EObject ruleBoardGameElement() throws RecognitionException {
        EObject current = null;

        EObject this_PieceType_0 = null;

        EObject this_EffectOnCell_1 = null;

        EObject this_ValidMove_2 = null;

        EObject this_CellState_3 = null;

        EObject this_WinCondition_4 = null;

        EObject this_Condition_5 = null;



        	enterRule();

        try {
            // InternalBoardGameDL.g:162:2: ( (this_PieceType_0= rulePieceType | this_EffectOnCell_1= ruleEffectOnCell | this_ValidMove_2= ruleValidMove | this_CellState_3= ruleCellState | this_WinCondition_4= ruleWinCondition | this_Condition_5= ruleCondition ) )
            // InternalBoardGameDL.g:163:2: (this_PieceType_0= rulePieceType | this_EffectOnCell_1= ruleEffectOnCell | this_ValidMove_2= ruleValidMove | this_CellState_3= ruleCellState | this_WinCondition_4= ruleWinCondition | this_Condition_5= ruleCondition )
            {
            // InternalBoardGameDL.g:163:2: (this_PieceType_0= rulePieceType | this_EffectOnCell_1= ruleEffectOnCell | this_ValidMove_2= ruleValidMove | this_CellState_3= ruleCellState | this_WinCondition_4= ruleWinCondition | this_Condition_5= ruleCondition )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 28:
                {
                alt2=2;
                }
                break;
            case 23:
                {
                alt2=3;
                }
                break;
            case 20:
                {
                alt2=4;
                }
                break;
            case 21:
                {
                alt2=5;
                }
                break;
            case 33:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBoardGameDL.g:164:3: this_PieceType_0= rulePieceType
                    {

                    			newCompositeNode(grammarAccess.getBoardGameElementAccess().getPieceTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PieceType_0=rulePieceType();

                    state._fsp--;


                    			current = this_PieceType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBoardGameDL.g:173:3: this_EffectOnCell_1= ruleEffectOnCell
                    {

                    			newCompositeNode(grammarAccess.getBoardGameElementAccess().getEffectOnCellParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectOnCell_1=ruleEffectOnCell();

                    state._fsp--;


                    			current = this_EffectOnCell_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBoardGameDL.g:182:3: this_ValidMove_2= ruleValidMove
                    {

                    			newCompositeNode(grammarAccess.getBoardGameElementAccess().getValidMoveParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValidMove_2=ruleValidMove();

                    state._fsp--;


                    			current = this_ValidMove_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBoardGameDL.g:191:3: this_CellState_3= ruleCellState
                    {

                    			newCompositeNode(grammarAccess.getBoardGameElementAccess().getCellStateParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CellState_3=ruleCellState();

                    state._fsp--;


                    			current = this_CellState_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBoardGameDL.g:200:3: this_WinCondition_4= ruleWinCondition
                    {

                    			newCompositeNode(grammarAccess.getBoardGameElementAccess().getWinConditionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_WinCondition_4=ruleWinCondition();

                    state._fsp--;


                    			current = this_WinCondition_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalBoardGameDL.g:209:3: this_Condition_5= ruleCondition
                    {

                    			newCompositeNode(grammarAccess.getBoardGameElementAccess().getConditionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Condition_5=ruleCondition();

                    state._fsp--;


                    			current = this_Condition_5;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleBoardGameElement"


    // $ANTLR start "entryRulePieceType"
    // InternalBoardGameDL.g:221:1: entryRulePieceType returns [EObject current=null] : iv_rulePieceType= rulePieceType EOF ;
    public final EObject entryRulePieceType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePieceType = null;


        try {
            // InternalBoardGameDL.g:221:50: (iv_rulePieceType= rulePieceType EOF )
            // InternalBoardGameDL.g:222:2: iv_rulePieceType= rulePieceType EOF
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
    // InternalBoardGameDL.g:228:1: rulePieceType returns [EObject current=null] : (otherlv_0= 'PieceType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Symbol' ( (lv_symbol_4_0= ruleEString ) ) otherlv_5= 'ValidMoves' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* (otherlv_9= 'EffectsOnCell' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* )? otherlv_13= '}' ) ;
    public final EObject rulePieceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_symbol_4_0 = null;



        	enterRule();

        try {
            // InternalBoardGameDL.g:234:2: ( (otherlv_0= 'PieceType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Symbol' ( (lv_symbol_4_0= ruleEString ) ) otherlv_5= 'ValidMoves' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* (otherlv_9= 'EffectsOnCell' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* )? otherlv_13= '}' ) )
            // InternalBoardGameDL.g:235:2: (otherlv_0= 'PieceType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Symbol' ( (lv_symbol_4_0= ruleEString ) ) otherlv_5= 'ValidMoves' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* (otherlv_9= 'EffectsOnCell' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* )? otherlv_13= '}' )
            {
            // InternalBoardGameDL.g:235:2: (otherlv_0= 'PieceType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Symbol' ( (lv_symbol_4_0= ruleEString ) ) otherlv_5= 'ValidMoves' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* (otherlv_9= 'EffectsOnCell' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* )? otherlv_13= '}' )
            // InternalBoardGameDL.g:236:3: otherlv_0= 'PieceType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Symbol' ( (lv_symbol_4_0= ruleEString ) ) otherlv_5= 'ValidMoves' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* (otherlv_9= 'EffectsOnCell' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPieceTypeAccess().getPieceTypeKeyword_0());
            		
            // InternalBoardGameDL.g:240:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBoardGameDL.g:241:4: (lv_name_1_0= ruleEString )
            {
            // InternalBoardGameDL.g:241:4: (lv_name_1_0= ruleEString )
            // InternalBoardGameDL.g:242:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPieceTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPieceTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getPieceTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPieceTypeAccess().getSymbolKeyword_3());
            		
            // InternalBoardGameDL.g:267:3: ( (lv_symbol_4_0= ruleEString ) )
            // InternalBoardGameDL.g:268:4: (lv_symbol_4_0= ruleEString )
            {
            // InternalBoardGameDL.g:268:4: (lv_symbol_4_0= ruleEString )
            // InternalBoardGameDL.g:269:5: lv_symbol_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPieceTypeAccess().getSymbolEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_symbol_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPieceTypeRule());
            					}
            					set(
            						current,
            						"symbol",
            						lv_symbol_4_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getPieceTypeAccess().getValidMovesKeyword_5());
            		
            // InternalBoardGameDL.g:290:3: ( ( ruleEString ) )
            // InternalBoardGameDL.g:291:4: ( ruleEString )
            {
            // InternalBoardGameDL.g:291:4: ( ruleEString )
            // InternalBoardGameDL.g:292:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPieceTypeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPieceTypeAccess().getValidMovesValidMoveCrossReference_6_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBoardGameDL.g:306:3: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBoardGameDL.g:307:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,17,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getPieceTypeAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalBoardGameDL.g:311:4: ( ( ruleEString ) )
            	    // InternalBoardGameDL.g:312:5: ( ruleEString )
            	    {
            	    // InternalBoardGameDL.g:312:5: ( ruleEString )
            	    // InternalBoardGameDL.g:313:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPieceTypeRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getPieceTypeAccess().getValidMovesValidMoveCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalBoardGameDL.g:328:3: (otherlv_9= 'EffectsOnCell' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBoardGameDL.g:329:4: otherlv_9= 'EffectsOnCell' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_9=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getPieceTypeAccess().getEffectsOnCellKeyword_8_0());
                    			
                    // InternalBoardGameDL.g:333:4: ( ( ruleEString ) )
                    // InternalBoardGameDL.g:334:5: ( ruleEString )
                    {
                    // InternalBoardGameDL.g:334:5: ( ruleEString )
                    // InternalBoardGameDL.g:335:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPieceTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPieceTypeAccess().getEffectsoncellEffectOnCellCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBoardGameDL.g:349:4: (otherlv_11= ',' ( ( ruleEString ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalBoardGameDL.g:350:5: otherlv_11= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getPieceTypeAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalBoardGameDL.g:354:5: ( ( ruleEString ) )
                    	    // InternalBoardGameDL.g:355:6: ( ruleEString )
                    	    {
                    	    // InternalBoardGameDL.g:355:6: ( ruleEString )
                    	    // InternalBoardGameDL.g:356:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPieceTypeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getPieceTypeAccess().getEffectsoncellEffectOnCellCrossReference_8_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getPieceTypeAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalBoardGameDL.g:380:1: entryRuleCellState returns [EObject current=null] : iv_ruleCellState= ruleCellState EOF ;
    public final EObject entryRuleCellState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellState = null;


        try {
            // InternalBoardGameDL.g:380:50: (iv_ruleCellState= ruleCellState EOF )
            // InternalBoardGameDL.g:381:2: iv_ruleCellState= ruleCellState EOF
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
    // InternalBoardGameDL.g:387:1: ruleCellState returns [EObject current=null] : (otherlv_0= 'Cellstate' ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleCellState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalBoardGameDL.g:393:2: ( (otherlv_0= 'Cellstate' ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalBoardGameDL.g:394:2: (otherlv_0= 'Cellstate' ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalBoardGameDL.g:394:2: (otherlv_0= 'Cellstate' ( (lv_name_1_0= ruleEString ) ) )
            // InternalBoardGameDL.g:395:3: otherlv_0= 'Cellstate' ( (lv_name_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCellStateAccess().getCellstateKeyword_0());
            		
            // InternalBoardGameDL.g:399:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBoardGameDL.g:400:4: (lv_name_1_0= ruleEString )
            {
            // InternalBoardGameDL.g:400:4: (lv_name_1_0= ruleEString )
            // InternalBoardGameDL.g:401:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCellStateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCellStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.EString");
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
    // $ANTLR end "ruleCellState"


    // $ANTLR start "entryRuleWinCondition"
    // InternalBoardGameDL.g:422:1: entryRuleWinCondition returns [EObject current=null] : iv_ruleWinCondition= ruleWinCondition EOF ;
    public final EObject entryRuleWinCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWinCondition = null;


        try {
            // InternalBoardGameDL.g:422:53: (iv_ruleWinCondition= ruleWinCondition EOF )
            // InternalBoardGameDL.g:423:2: iv_ruleWinCondition= ruleWinCondition EOF
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
    // InternalBoardGameDL.g:429:1: ruleWinCondition returns [EObject current=null] : (otherlv_0= 'WinCondition' otherlv_1= '{' ( (lv_winConditionElements_2_0= ruleWinConditionElement ) ) ( (lv_winConditionElements_3_0= ruleWinConditionElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleWinCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_winConditionElements_2_0 = null;

        EObject lv_winConditionElements_3_0 = null;



        	enterRule();

        try {
            // InternalBoardGameDL.g:435:2: ( (otherlv_0= 'WinCondition' otherlv_1= '{' ( (lv_winConditionElements_2_0= ruleWinConditionElement ) ) ( (lv_winConditionElements_3_0= ruleWinConditionElement ) )* otherlv_4= '}' ) )
            // InternalBoardGameDL.g:436:2: (otherlv_0= 'WinCondition' otherlv_1= '{' ( (lv_winConditionElements_2_0= ruleWinConditionElement ) ) ( (lv_winConditionElements_3_0= ruleWinConditionElement ) )* otherlv_4= '}' )
            {
            // InternalBoardGameDL.g:436:2: (otherlv_0= 'WinCondition' otherlv_1= '{' ( (lv_winConditionElements_2_0= ruleWinConditionElement ) ) ( (lv_winConditionElements_3_0= ruleWinConditionElement ) )* otherlv_4= '}' )
            // InternalBoardGameDL.g:437:3: otherlv_0= 'WinCondition' otherlv_1= '{' ( (lv_winConditionElements_2_0= ruleWinConditionElement ) ) ( (lv_winConditionElements_3_0= ruleWinConditionElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getWinConditionAccess().getWinConditionKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getWinConditionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBoardGameDL.g:445:3: ( (lv_winConditionElements_2_0= ruleWinConditionElement ) )
            // InternalBoardGameDL.g:446:4: (lv_winConditionElements_2_0= ruleWinConditionElement )
            {
            // InternalBoardGameDL.g:446:4: (lv_winConditionElements_2_0= ruleWinConditionElement )
            // InternalBoardGameDL.g:447:5: lv_winConditionElements_2_0= ruleWinConditionElement
            {

            					newCompositeNode(grammarAccess.getWinConditionAccess().getWinConditionElementsWinConditionElementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_winConditionElements_2_0=ruleWinConditionElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWinConditionRule());
            					}
            					add(
            						current,
            						"winConditionElements",
            						lv_winConditionElements_2_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.WinConditionElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBoardGameDL.g:464:3: ( (lv_winConditionElements_3_0= ruleWinConditionElement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==34) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBoardGameDL.g:465:4: (lv_winConditionElements_3_0= ruleWinConditionElement )
            	    {
            	    // InternalBoardGameDL.g:465:4: (lv_winConditionElements_3_0= ruleWinConditionElement )
            	    // InternalBoardGameDL.g:466:5: lv_winConditionElements_3_0= ruleWinConditionElement
            	    {

            	    					newCompositeNode(grammarAccess.getWinConditionAccess().getWinConditionElementsWinConditionElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_winConditionElements_3_0=ruleWinConditionElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWinConditionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"winConditionElements",
            	    						lv_winConditionElements_3_0,
            	    						"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.WinConditionElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEInt"
    // InternalBoardGameDL.g:491:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalBoardGameDL.g:491:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalBoardGameDL.g:492:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalBoardGameDL.g:498:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalBoardGameDL.g:504:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalBoardGameDL.g:505:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalBoardGameDL.g:505:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalBoardGameDL.g:506:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalBoardGameDL.g:506:3: (kw= '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBoardGameDL.g:507:4: kw= '-'
                    {
                    kw=(Token)match(input,22,FOLLOW_14); 

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


    // $ANTLR start "entryRuleEString"
    // InternalBoardGameDL.g:524:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBoardGameDL.g:524:47: (iv_ruleEString= ruleEString EOF )
            // InternalBoardGameDL.g:525:2: iv_ruleEString= ruleEString EOF
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
    // InternalBoardGameDL.g:531:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBoardGameDL.g:537:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBoardGameDL.g:538:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBoardGameDL.g:538:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalBoardGameDL.g:539:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBoardGameDL.g:547:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleValidMove"
    // InternalBoardGameDL.g:558:1: entryRuleValidMove returns [EObject current=null] : iv_ruleValidMove= ruleValidMove EOF ;
    public final EObject entryRuleValidMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidMove = null;


        try {
            // InternalBoardGameDL.g:558:50: (iv_ruleValidMove= ruleValidMove EOF )
            // InternalBoardGameDL.g:559:2: iv_ruleValidMove= ruleValidMove EOF
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
    // InternalBoardGameDL.g:565:1: ruleValidMove returns [EObject current=null] : (otherlv_0= 'ValidMove' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_placeAnywhere_3_0= 'placeAnywhere' ) ) (otherlv_4= 'valid' otherlv_5= 'if' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* )? otherlv_9= '}' ) ;
    public final EObject ruleValidMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_placeAnywhere_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalBoardGameDL.g:571:2: ( (otherlv_0= 'ValidMove' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_placeAnywhere_3_0= 'placeAnywhere' ) ) (otherlv_4= 'valid' otherlv_5= 'if' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* )? otherlv_9= '}' ) )
            // InternalBoardGameDL.g:572:2: (otherlv_0= 'ValidMove' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_placeAnywhere_3_0= 'placeAnywhere' ) ) (otherlv_4= 'valid' otherlv_5= 'if' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* )? otherlv_9= '}' )
            {
            // InternalBoardGameDL.g:572:2: (otherlv_0= 'ValidMove' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_placeAnywhere_3_0= 'placeAnywhere' ) ) (otherlv_4= 'valid' otherlv_5= 'if' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* )? otherlv_9= '}' )
            // InternalBoardGameDL.g:573:3: otherlv_0= 'ValidMove' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_placeAnywhere_3_0= 'placeAnywhere' ) ) (otherlv_4= 'valid' otherlv_5= 'if' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getValidMoveAccess().getValidMoveKeyword_0());
            		
            // InternalBoardGameDL.g:577:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBoardGameDL.g:578:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBoardGameDL.g:578:4: (lv_name_1_0= RULE_ID )
            // InternalBoardGameDL.g:579:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getValidMoveAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValidMoveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getValidMoveAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBoardGameDL.g:599:3: ( (lv_placeAnywhere_3_0= 'placeAnywhere' ) )
            // InternalBoardGameDL.g:600:4: (lv_placeAnywhere_3_0= 'placeAnywhere' )
            {
            // InternalBoardGameDL.g:600:4: (lv_placeAnywhere_3_0= 'placeAnywhere' )
            // InternalBoardGameDL.g:601:5: lv_placeAnywhere_3_0= 'placeAnywhere'
            {
            lv_placeAnywhere_3_0=(Token)match(input,24,FOLLOW_17); 

            					newLeafNode(lv_placeAnywhere_3_0, grammarAccess.getValidMoveAccess().getPlaceAnywherePlaceAnywhereKeyword_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValidMoveRule());
            					}
            					setWithLastConsumed(current, "placeAnywhere", lv_placeAnywhere_3_0 != null, "placeAnywhere");
            				

            }


            }

            // InternalBoardGameDL.g:613:3: (otherlv_4= 'valid' otherlv_5= 'if' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBoardGameDL.g:614:4: otherlv_4= 'valid' otherlv_5= 'if' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )*
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getValidMoveAccess().getValidKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getValidMoveAccess().getIfKeyword_4_1());
                    			
                    // InternalBoardGameDL.g:622:4: ( ( ruleEString ) )
                    // InternalBoardGameDL.g:623:5: ( ruleEString )
                    {
                    // InternalBoardGameDL.g:623:5: ( ruleEString )
                    // InternalBoardGameDL.g:624:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValidMoveRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getValidMoveAccess().getConditionsConditionCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBoardGameDL.g:638:4: (otherlv_7= 'and' ( ( ruleEString ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==27) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalBoardGameDL.g:639:5: otherlv_7= 'and' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getValidMoveAccess().getAndKeyword_4_3_0());
                    	    				
                    	    // InternalBoardGameDL.g:643:5: ( ( ruleEString ) )
                    	    // InternalBoardGameDL.g:644:6: ( ruleEString )
                    	    {
                    	    // InternalBoardGameDL.g:644:6: ( ruleEString )
                    	    // InternalBoardGameDL.g:645:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getValidMoveRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getValidMoveAccess().getConditionsConditionCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getValidMoveAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalBoardGameDL.g:669:1: entryRuleEffectOnCell returns [EObject current=null] : iv_ruleEffectOnCell= ruleEffectOnCell EOF ;
    public final EObject entryRuleEffectOnCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectOnCell = null;


        try {
            // InternalBoardGameDL.g:669:53: (iv_ruleEffectOnCell= ruleEffectOnCell EOF )
            // InternalBoardGameDL.g:670:2: iv_ruleEffectOnCell= ruleEffectOnCell EOF
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
    // InternalBoardGameDL.g:676:1: ruleEffectOnCell returns [EObject current=null] : (otherlv_0= 'EffectOnCell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' ) ;
    public final EObject ruleEffectOnCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_x_6_0 = null;

        AntlrDatatypeRuleToken lv_y_8_0 = null;



        	enterRule();

        try {
            // InternalBoardGameDL.g:682:2: ( (otherlv_0= 'EffectOnCell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' ) )
            // InternalBoardGameDL.g:683:2: (otherlv_0= 'EffectOnCell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' )
            {
            // InternalBoardGameDL.g:683:2: (otherlv_0= 'EffectOnCell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' )
            // InternalBoardGameDL.g:684:3: otherlv_0= 'EffectOnCell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectOnCellAccess().getEffectOnCellKeyword_0());
            		
            // InternalBoardGameDL.g:688:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBoardGameDL.g:689:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBoardGameDL.g:689:4: (lv_name_1_0= RULE_ID )
            // InternalBoardGameDL.g:690:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEffectOnCellAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEffectOnCellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getEffectOnCellAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBoardGameDL.g:710:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) ) ) ) )+ {...}?) ) )
            // InternalBoardGameDL.g:711:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalBoardGameDL.g:711:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) ) ) ) )+ {...}?) )
            // InternalBoardGameDL.g:712:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3());
            				
            // InternalBoardGameDL.g:715:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) ) ) ) )+ {...}?)
            // InternalBoardGameDL.g:716:6: ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) ) ) ) )+ {...}?
            {
            // InternalBoardGameDL.g:716:6: ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) ) ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( LA11_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 1) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBoardGameDL.g:717:4: ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) )
            	    {
            	    // InternalBoardGameDL.g:717:4: ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) )
            	    // InternalBoardGameDL.g:718:5: {...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEffectOnCell", "getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalBoardGameDL.g:718:109: ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) )
            	    // InternalBoardGameDL.g:719:6: ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalBoardGameDL.g:722:9: ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) )
            	    // InternalBoardGameDL.g:722:10: {...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEffectOnCell", "true");
            	    }
            	    // InternalBoardGameDL.g:722:19: (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' )
            	    // InternalBoardGameDL.g:722:20: otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')'
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_21); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEffectOnCellAccess().getRelativePositionKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,30,FOLLOW_5); 

            	    									newLeafNode(otherlv_5, grammarAccess.getEffectOnCellAccess().getLeftParenthesisKeyword_3_0_1());
            	    								
            	    // InternalBoardGameDL.g:730:9: ( (lv_x_6_0= ruleEInt ) )
            	    // InternalBoardGameDL.g:731:10: (lv_x_6_0= ruleEInt )
            	    {
            	    // InternalBoardGameDL.g:731:10: (lv_x_6_0= ruleEInt )
            	    // InternalBoardGameDL.g:732:11: lv_x_6_0= ruleEInt
            	    {

            	    											newCompositeNode(grammarAccess.getEffectOnCellAccess().getXEIntParserRuleCall_3_0_2_0());
            	    										
            	    pushFollow(FOLLOW_22);
            	    lv_x_6_0=ruleEInt();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEffectOnCellRule());
            	    											}
            	    											set(
            	    												current,
            	    												"x",
            	    												lv_x_6_0,
            	    												"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.EInt");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_7=(Token)match(input,17,FOLLOW_5); 

            	    									newLeafNode(otherlv_7, grammarAccess.getEffectOnCellAccess().getCommaKeyword_3_0_3());
            	    								
            	    // InternalBoardGameDL.g:753:9: ( (lv_y_8_0= ruleEInt ) )
            	    // InternalBoardGameDL.g:754:10: (lv_y_8_0= ruleEInt )
            	    {
            	    // InternalBoardGameDL.g:754:10: (lv_y_8_0= ruleEInt )
            	    // InternalBoardGameDL.g:755:11: lv_y_8_0= ruleEInt
            	    {

            	    											newCompositeNode(grammarAccess.getEffectOnCellAccess().getYEIntParserRuleCall_3_0_4_0());
            	    										
            	    pushFollow(FOLLOW_23);
            	    lv_y_8_0=ruleEInt();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEffectOnCellRule());
            	    											}
            	    											set(
            	    												current,
            	    												"y",
            	    												lv_y_8_0,
            	    												"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.EInt");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_9=(Token)match(input,31,FOLLOW_24); 

            	    									newLeafNode(otherlv_9, grammarAccess.getEffectOnCellAccess().getRightParenthesisKeyword_3_0_5());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBoardGameDL.g:782:4: ({...}? => ( ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // InternalBoardGameDL.g:782:4: ({...}? => ( ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) ) ) )
            	    // InternalBoardGameDL.g:783:5: {...}? => ( ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEffectOnCell", "getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalBoardGameDL.g:783:109: ( ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) ) )
            	    // InternalBoardGameDL.g:784:6: ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalBoardGameDL.g:787:9: ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) )
            	    // InternalBoardGameDL.g:787:10: {...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEffectOnCell", "true");
            	    }
            	    // InternalBoardGameDL.g:787:19: (otherlv_10= 'newCellState' ( ( ruleEString ) ) )
            	    // InternalBoardGameDL.g:787:20: otherlv_10= 'newCellState' ( ( ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,32,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getEffectOnCellAccess().getNewCellStateKeyword_3_1_0());
            	    								
            	    // InternalBoardGameDL.g:791:9: ( ( ruleEString ) )
            	    // InternalBoardGameDL.g:792:10: ( ruleEString )
            	    {
            	    // InternalBoardGameDL.g:792:10: ( ruleEString )
            	    // InternalBoardGameDL.g:793:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEffectOnCellRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getEffectOnCellAccess().getCellStateCellStateCrossReference_3_1_1_0());
            	    										
            	    pushFollow(FOLLOW_24);
            	    ruleEString();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleEffectOnCell", "getUnorderedGroupHelper().canLeave(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3());
            				

            }

            otherlv_12=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getEffectOnCellAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalBoardGameDL.g:829:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalBoardGameDL.g:829:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalBoardGameDL.g:830:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalBoardGameDL.g:836:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'Condition' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleEString ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBoardGameDL.g:842:2: ( (otherlv_0= 'Condition' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleEString ) ) ) )
            // InternalBoardGameDL.g:843:2: (otherlv_0= 'Condition' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleEString ) ) )
            {
            // InternalBoardGameDL.g:843:2: (otherlv_0= 'Condition' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:844:3: otherlv_0= 'Condition' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getConditionKeyword_0());
            		
            // InternalBoardGameDL.g:848:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBoardGameDL.g:849:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBoardGameDL.g:849:4: (lv_name_1_0= RULE_ID )
            // InternalBoardGameDL.g:850:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBoardGameDL.g:866:3: ( ( ruleEString ) )
            // InternalBoardGameDL.g:867:4: ( ruleEString )
            {
            // InternalBoardGameDL.g:867:4: ( ruleEString )
            // InternalBoardGameDL.g:868:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConditionAccess().getCellStateCellStateCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleWinConditionElement"
    // InternalBoardGameDL.g:886:1: entryRuleWinConditionElement returns [EObject current=null] : iv_ruleWinConditionElement= ruleWinConditionElement EOF ;
    public final EObject entryRuleWinConditionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWinConditionElement = null;


        try {
            // InternalBoardGameDL.g:886:60: (iv_ruleWinConditionElement= ruleWinConditionElement EOF )
            // InternalBoardGameDL.g:887:2: iv_ruleWinConditionElement= ruleWinConditionElement EOF
            {
             newCompositeNode(grammarAccess.getWinConditionElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWinConditionElement=ruleWinConditionElement();

            state._fsp--;

             current =iv_ruleWinConditionElement; 
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
    // $ANTLR end "entryRuleWinConditionElement"


    // $ANTLR start "ruleWinConditionElement"
    // InternalBoardGameDL.g:893:1: ruleWinConditionElement returns [EObject current=null] : this_Line_0= ruleLine ;
    public final EObject ruleWinConditionElement() throws RecognitionException {
        EObject current = null;

        EObject this_Line_0 = null;



        	enterRule();

        try {
            // InternalBoardGameDL.g:899:2: (this_Line_0= ruleLine )
            // InternalBoardGameDL.g:900:2: this_Line_0= ruleLine
            {

            		newCompositeNode(grammarAccess.getWinConditionElementAccess().getLineParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Line_0=ruleLine();

            state._fsp--;


            		current = this_Line_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleWinConditionElement"


    // $ANTLR start "entryRuleLine"
    // InternalBoardGameDL.g:911:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // InternalBoardGameDL.g:911:45: (iv_ruleLine= ruleLine EOF )
            // InternalBoardGameDL.g:912:2: iv_ruleLine= ruleLine EOF
            {
             newCompositeNode(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLine=ruleLine();

            state._fsp--;

             current =iv_ruleLine; 
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
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // InternalBoardGameDL.g:918:1: ruleLine returns [EObject current=null] : (otherlv_0= 'Line' otherlv_1= 'length' ( (lv_length_2_0= ruleEInt ) ) otherlv_3= 'direction' ( (lv_direction_4_0= ruleDirection ) ) ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_length_2_0 = null;

        Enumerator lv_direction_4_0 = null;



        	enterRule();

        try {
            // InternalBoardGameDL.g:924:2: ( (otherlv_0= 'Line' otherlv_1= 'length' ( (lv_length_2_0= ruleEInt ) ) otherlv_3= 'direction' ( (lv_direction_4_0= ruleDirection ) ) ) )
            // InternalBoardGameDL.g:925:2: (otherlv_0= 'Line' otherlv_1= 'length' ( (lv_length_2_0= ruleEInt ) ) otherlv_3= 'direction' ( (lv_direction_4_0= ruleDirection ) ) )
            {
            // InternalBoardGameDL.g:925:2: (otherlv_0= 'Line' otherlv_1= 'length' ( (lv_length_2_0= ruleEInt ) ) otherlv_3= 'direction' ( (lv_direction_4_0= ruleDirection ) ) )
            // InternalBoardGameDL.g:926:3: otherlv_0= 'Line' otherlv_1= 'length' ( (lv_length_2_0= ruleEInt ) ) otherlv_3= 'direction' ( (lv_direction_4_0= ruleDirection ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getLineAccess().getLineKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getLineAccess().getLengthKeyword_1());
            		
            // InternalBoardGameDL.g:934:3: ( (lv_length_2_0= ruleEInt ) )
            // InternalBoardGameDL.g:935:4: (lv_length_2_0= ruleEInt )
            {
            // InternalBoardGameDL.g:935:4: (lv_length_2_0= ruleEInt )
            // InternalBoardGameDL.g:936:5: lv_length_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getLineAccess().getLengthEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
            lv_length_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLineRule());
            					}
            					set(
            						current,
            						"length",
            						lv_length_2_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getLineAccess().getDirectionKeyword_3());
            		
            // InternalBoardGameDL.g:957:3: ( (lv_direction_4_0= ruleDirection ) )
            // InternalBoardGameDL.g:958:4: (lv_direction_4_0= ruleDirection )
            {
            // InternalBoardGameDL.g:958:4: (lv_direction_4_0= ruleDirection )
            // InternalBoardGameDL.g:959:5: lv_direction_4_0= ruleDirection
            {

            					newCompositeNode(grammarAccess.getLineAccess().getDirectionDirectionEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_direction_4_0=ruleDirection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLineRule());
            					}
            					set(
            						current,
            						"direction",
            						lv_direction_4_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.Direction");
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
    // $ANTLR end "ruleLine"


    // $ANTLR start "ruleDirection"
    // InternalBoardGameDL.g:980:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'ROW' ) | (enumLiteral_1= 'COLUMN' ) | (enumLiteral_2= 'DIAGONAL' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalBoardGameDL.g:986:2: ( ( (enumLiteral_0= 'ROW' ) | (enumLiteral_1= 'COLUMN' ) | (enumLiteral_2= 'DIAGONAL' ) ) )
            // InternalBoardGameDL.g:987:2: ( (enumLiteral_0= 'ROW' ) | (enumLiteral_1= 'COLUMN' ) | (enumLiteral_2= 'DIAGONAL' ) )
            {
            // InternalBoardGameDL.g:987:2: ( (enumLiteral_0= 'ROW' ) | (enumLiteral_1= 'COLUMN' ) | (enumLiteral_2= 'DIAGONAL' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt12=1;
                }
                break;
            case 38:
                {
                alt12=2;
                }
                break;
            case 39:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalBoardGameDL.g:988:3: (enumLiteral_0= 'ROW' )
                    {
                    // InternalBoardGameDL.g:988:3: (enumLiteral_0= 'ROW' )
                    // InternalBoardGameDL.g:989:4: enumLiteral_0= 'ROW'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getROWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getROWEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBoardGameDL.g:996:3: (enumLiteral_1= 'COLUMN' )
                    {
                    // InternalBoardGameDL.g:996:3: (enumLiteral_1= 'COLUMN' )
                    // InternalBoardGameDL.g:997:4: enumLiteral_1= 'COLUMN'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getCOLUMNEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getCOLUMNEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBoardGameDL.g:1004:3: (enumLiteral_2= 'DIAGONAL' )
                    {
                    // InternalBoardGameDL.g:1004:3: (enumLiteral_2= 'DIAGONAL' )
                    // InternalBoardGameDL.g:1005:4: enumLiteral_2= 'DIAGONAL'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getDIAGONALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDirectionAccess().getDIAGONALEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleDirection"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000210B02002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000120080000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000E000000000L});

}
