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
import no.ntnu.tdt4250.g07.bg.bgdl.services.BoardGameDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBoardGameDLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Title'", "'BoardSize'", "'PieceType'", "'{'", "'Symbol'", "'ValidMoves'", "'['", "','", "']'", "'EffectsOnCell'", "'}'", "'Cellstate'", "'WinCondition'", "'-'", "'ValidMove'", "'placeAnywhere'", "'valid'", "'if'", "'and'", "'EffectOnCell'", "'relativePosition'", "'('", "')'", "'newCellState'", "'Condition'", "'count'", "'horizontal'", "'vertical'", "'diagonal'"
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
    // InternalBoardGameDL.g:64:1: entryRuleBoardGame returns [EObject current=null] : iv_ruleBoardGame= ruleBoardGame EOF ;
    public final EObject entryRuleBoardGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoardGame = null;


        try {
            // InternalBoardGameDL.g:64:50: (iv_ruleBoardGame= ruleBoardGame EOF )
            // InternalBoardGameDL.g:65:2: iv_ruleBoardGame= ruleBoardGame EOF
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
    // InternalBoardGameDL.g:71:1: ruleBoardGame returns [EObject current=null] : (otherlv_0= 'Title' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'BoardSize' ( (lv_size_3_0= ruleEInt ) ) ( (lv_boardgameelements_4_0= ruleBoardGameElement ) )* ) ;
    public final EObject ruleBoardGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_size_3_0 = null;

        EObject lv_boardgameelements_4_0 = null;



        	enterRule();

        try {
            // InternalBoardGameDL.g:77:2: ( (otherlv_0= 'Title' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'BoardSize' ( (lv_size_3_0= ruleEInt ) ) ( (lv_boardgameelements_4_0= ruleBoardGameElement ) )* ) )
            // InternalBoardGameDL.g:78:2: (otherlv_0= 'Title' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'BoardSize' ( (lv_size_3_0= ruleEInt ) ) ( (lv_boardgameelements_4_0= ruleBoardGameElement ) )* )
            {
            // InternalBoardGameDL.g:78:2: (otherlv_0= 'Title' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'BoardSize' ( (lv_size_3_0= ruleEInt ) ) ( (lv_boardgameelements_4_0= ruleBoardGameElement ) )* )
            // InternalBoardGameDL.g:79:3: otherlv_0= 'Title' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'BoardSize' ( (lv_size_3_0= ruleEInt ) ) ( (lv_boardgameelements_4_0= ruleBoardGameElement ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBoardGameAccess().getTitleKeyword_0());
            		
            // InternalBoardGameDL.g:83:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBoardGameDL.g:84:4: (lv_name_1_0= ruleEString )
            {
            // InternalBoardGameDL.g:84:4: (lv_name_1_0= ruleEString )
            // InternalBoardGameDL.g:85:5: lv_name_1_0= ruleEString
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
            		
            // InternalBoardGameDL.g:106:3: ( (lv_size_3_0= ruleEInt ) )
            // InternalBoardGameDL.g:107:4: (lv_size_3_0= ruleEInt )
            {
            // InternalBoardGameDL.g:107:4: (lv_size_3_0= ruleEInt )
            // InternalBoardGameDL.g:108:5: lv_size_3_0= ruleEInt
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

            // InternalBoardGameDL.g:125:3: ( (lv_boardgameelements_4_0= ruleBoardGameElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||(LA1_0>=22 && LA1_0<=23)||LA1_0==25||LA1_0==30||LA1_0==35) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBoardGameDL.g:126:4: (lv_boardgameelements_4_0= ruleBoardGameElement )
            	    {
            	    // InternalBoardGameDL.g:126:4: (lv_boardgameelements_4_0= ruleBoardGameElement )
            	    // InternalBoardGameDL.g:127:5: lv_boardgameelements_4_0= ruleBoardGameElement
            	    {

            	    					newCompositeNode(grammarAccess.getBoardGameAccess().getBoardgameelementsBoardGameElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_boardgameelements_4_0=ruleBoardGameElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBoardGameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"boardgameelements",
            	    						lv_boardgameelements_4_0,
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
    // InternalBoardGameDL.g:148:1: entryRuleBoardGameElement returns [EObject current=null] : iv_ruleBoardGameElement= ruleBoardGameElement EOF ;
    public final EObject entryRuleBoardGameElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoardGameElement = null;


        try {
            // InternalBoardGameDL.g:148:57: (iv_ruleBoardGameElement= ruleBoardGameElement EOF )
            // InternalBoardGameDL.g:149:2: iv_ruleBoardGameElement= ruleBoardGameElement EOF
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
    // InternalBoardGameDL.g:155:1: ruleBoardGameElement returns [EObject current=null] : (this_PieceType_0= rulePieceType | this_EffectOnCell_1= ruleEffectOnCell | this_ValidMove_2= ruleValidMove | this_CellState_3= ruleCellState | this_WinCondition_4= ruleWinCondition | this_Condition_5= ruleCondition ) ;
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
            // InternalBoardGameDL.g:161:2: ( (this_PieceType_0= rulePieceType | this_EffectOnCell_1= ruleEffectOnCell | this_ValidMove_2= ruleValidMove | this_CellState_3= ruleCellState | this_WinCondition_4= ruleWinCondition | this_Condition_5= ruleCondition ) )
            // InternalBoardGameDL.g:162:2: (this_PieceType_0= rulePieceType | this_EffectOnCell_1= ruleEffectOnCell | this_ValidMove_2= ruleValidMove | this_CellState_3= ruleCellState | this_WinCondition_4= ruleWinCondition | this_Condition_5= ruleCondition )
            {
            // InternalBoardGameDL.g:162:2: (this_PieceType_0= rulePieceType | this_EffectOnCell_1= ruleEffectOnCell | this_ValidMove_2= ruleValidMove | this_CellState_3= ruleCellState | this_WinCondition_4= ruleWinCondition | this_Condition_5= ruleCondition )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 30:
                {
                alt2=2;
                }
                break;
            case 25:
                {
                alt2=3;
                }
                break;
            case 22:
                {
                alt2=4;
                }
                break;
            case 23:
                {
                alt2=5;
                }
                break;
            case 35:
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
                    // InternalBoardGameDL.g:163:3: this_PieceType_0= rulePieceType
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
                    // InternalBoardGameDL.g:172:3: this_EffectOnCell_1= ruleEffectOnCell
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
                    // InternalBoardGameDL.g:181:3: this_ValidMove_2= ruleValidMove
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
                    // InternalBoardGameDL.g:190:3: this_CellState_3= ruleCellState
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
                    // InternalBoardGameDL.g:199:3: this_WinCondition_4= ruleWinCondition
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
                    // InternalBoardGameDL.g:208:3: this_Condition_5= ruleCondition
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
    // InternalBoardGameDL.g:220:1: entryRulePieceType returns [EObject current=null] : iv_rulePieceType= rulePieceType EOF ;
    public final EObject entryRulePieceType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePieceType = null;


        try {
            // InternalBoardGameDL.g:220:50: (iv_rulePieceType= rulePieceType EOF )
            // InternalBoardGameDL.g:221:2: iv_rulePieceType= rulePieceType EOF
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
    // InternalBoardGameDL.g:227:1: rulePieceType returns [EObject current=null] : (otherlv_0= 'PieceType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Symbol' ( (lv_symbol_4_0= ruleEString ) ) otherlv_5= 'ValidMoves' otherlv_6= '[' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ']' (otherlv_11= 'EffectsOnCell' otherlv_12= '[' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ']' )? otherlv_17= '}' ) ;
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



        	enterRule();

        try {
            // InternalBoardGameDL.g:233:2: ( (otherlv_0= 'PieceType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Symbol' ( (lv_symbol_4_0= ruleEString ) ) otherlv_5= 'ValidMoves' otherlv_6= '[' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ']' (otherlv_11= 'EffectsOnCell' otherlv_12= '[' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ']' )? otherlv_17= '}' ) )
            // InternalBoardGameDL.g:234:2: (otherlv_0= 'PieceType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Symbol' ( (lv_symbol_4_0= ruleEString ) ) otherlv_5= 'ValidMoves' otherlv_6= '[' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ']' (otherlv_11= 'EffectsOnCell' otherlv_12= '[' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ']' )? otherlv_17= '}' )
            {
            // InternalBoardGameDL.g:234:2: (otherlv_0= 'PieceType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Symbol' ( (lv_symbol_4_0= ruleEString ) ) otherlv_5= 'ValidMoves' otherlv_6= '[' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ']' (otherlv_11= 'EffectsOnCell' otherlv_12= '[' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ']' )? otherlv_17= '}' )
            // InternalBoardGameDL.g:235:3: otherlv_0= 'PieceType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Symbol' ( (lv_symbol_4_0= ruleEString ) ) otherlv_5= 'ValidMoves' otherlv_6= '[' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ']' (otherlv_11= 'EffectsOnCell' otherlv_12= '[' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ']' )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPieceTypeAccess().getPieceTypeKeyword_0());
            		
            // InternalBoardGameDL.g:239:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBoardGameDL.g:240:4: (lv_name_1_0= ruleEString )
            {
            // InternalBoardGameDL.g:240:4: (lv_name_1_0= ruleEString )
            // InternalBoardGameDL.g:241:5: lv_name_1_0= ruleEString
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
            		
            // InternalBoardGameDL.g:266:3: ( (lv_symbol_4_0= ruleEString ) )
            // InternalBoardGameDL.g:267:4: (lv_symbol_4_0= ruleEString )
            {
            // InternalBoardGameDL.g:267:4: (lv_symbol_4_0= ruleEString )
            // InternalBoardGameDL.g:268:5: lv_symbol_4_0= ruleEString
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

            otherlv_5=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getPieceTypeAccess().getValidMovesKeyword_5());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getPieceTypeAccess().getLeftSquareBracketKeyword_6());
            		
            // InternalBoardGameDL.g:293:3: ( ( ruleEString ) )
            // InternalBoardGameDL.g:294:4: ( ruleEString )
            {
            // InternalBoardGameDL.g:294:4: ( ruleEString )
            // InternalBoardGameDL.g:295:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPieceTypeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPieceTypeAccess().getValidmovesValidMoveCrossReference_7_0());
            				
            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBoardGameDL.g:309:3: (otherlv_8= ',' ( ( ruleEString ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBoardGameDL.g:310:4: otherlv_8= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,18,FOLLOW_3); 

            	    				newLeafNode(otherlv_8, grammarAccess.getPieceTypeAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalBoardGameDL.g:314:4: ( ( ruleEString ) )
            	    // InternalBoardGameDL.g:315:5: ( ruleEString )
            	    {
            	    // InternalBoardGameDL.g:315:5: ( ruleEString )
            	    // InternalBoardGameDL.g:316:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPieceTypeRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getPieceTypeAccess().getValidmovesValidMoveCrossReference_8_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
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

            otherlv_10=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_10, grammarAccess.getPieceTypeAccess().getRightSquareBracketKeyword_9());
            		
            // InternalBoardGameDL.g:335:3: (otherlv_11= 'EffectsOnCell' otherlv_12= '[' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ']' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBoardGameDL.g:336:4: otherlv_11= 'EffectsOnCell' otherlv_12= '[' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ']'
                    {
                    otherlv_11=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getPieceTypeAccess().getEffectsOnCellKeyword_10_0());
                    			
                    otherlv_12=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getPieceTypeAccess().getLeftSquareBracketKeyword_10_1());
                    			
                    // InternalBoardGameDL.g:344:4: ( ( ruleEString ) )
                    // InternalBoardGameDL.g:345:5: ( ruleEString )
                    {
                    // InternalBoardGameDL.g:345:5: ( ruleEString )
                    // InternalBoardGameDL.g:346:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPieceTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPieceTypeAccess().getEffectsoncellEffectOnCellCrossReference_10_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBoardGameDL.g:360:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==18) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalBoardGameDL.g:361:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,18,FOLLOW_3); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getPieceTypeAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalBoardGameDL.g:365:5: ( ( ruleEString ) )
                    	    // InternalBoardGameDL.g:366:6: ( ruleEString )
                    	    {
                    	    // InternalBoardGameDL.g:366:6: ( ruleEString )
                    	    // InternalBoardGameDL.g:367:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPieceTypeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getPieceTypeAccess().getEffectsoncellEffectOnCellCrossReference_10_3_1_0());
                    	    						
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

                    otherlv_16=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_16, grammarAccess.getPieceTypeAccess().getRightSquareBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,21,FOLLOW_2); 

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
    // InternalBoardGameDL.g:395:1: entryRuleCellState returns [EObject current=null] : iv_ruleCellState= ruleCellState EOF ;
    public final EObject entryRuleCellState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellState = null;


        try {
            // InternalBoardGameDL.g:395:50: (iv_ruleCellState= ruleCellState EOF )
            // InternalBoardGameDL.g:396:2: iv_ruleCellState= ruleCellState EOF
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
    // InternalBoardGameDL.g:402:1: ruleCellState returns [EObject current=null] : (otherlv_0= 'Cellstate' ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleCellState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalBoardGameDL.g:408:2: ( (otherlv_0= 'Cellstate' ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalBoardGameDL.g:409:2: (otherlv_0= 'Cellstate' ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalBoardGameDL.g:409:2: (otherlv_0= 'Cellstate' ( (lv_name_1_0= ruleEString ) ) )
            // InternalBoardGameDL.g:410:3: otherlv_0= 'Cellstate' ( (lv_name_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCellStateAccess().getCellstateKeyword_0());
            		
            // InternalBoardGameDL.g:414:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBoardGameDL.g:415:4: (lv_name_1_0= ruleEString )
            {
            // InternalBoardGameDL.g:415:4: (lv_name_1_0= ruleEString )
            // InternalBoardGameDL.g:416:5: lv_name_1_0= ruleEString
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
    // InternalBoardGameDL.g:437:1: entryRuleWinCondition returns [EObject current=null] : iv_ruleWinCondition= ruleWinCondition EOF ;
    public final EObject entryRuleWinCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWinCondition = null;


        try {
            // InternalBoardGameDL.g:437:53: (iv_ruleWinCondition= ruleWinCondition EOF )
            // InternalBoardGameDL.g:438:2: iv_ruleWinCondition= ruleWinCondition EOF
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
    // InternalBoardGameDL.g:444:1: ruleWinCondition returns [EObject current=null] : (otherlv_0= 'WinCondition' ( (lv_inarow_1_0= ruleInARow ) ) ) ;
    public final EObject ruleWinCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_inarow_1_0 = null;



        	enterRule();

        try {
            // InternalBoardGameDL.g:450:2: ( (otherlv_0= 'WinCondition' ( (lv_inarow_1_0= ruleInARow ) ) ) )
            // InternalBoardGameDL.g:451:2: (otherlv_0= 'WinCondition' ( (lv_inarow_1_0= ruleInARow ) ) )
            {
            // InternalBoardGameDL.g:451:2: (otherlv_0= 'WinCondition' ( (lv_inarow_1_0= ruleInARow ) ) )
            // InternalBoardGameDL.g:452:3: otherlv_0= 'WinCondition' ( (lv_inarow_1_0= ruleInARow ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getWinConditionAccess().getWinConditionKeyword_0());
            		
            // InternalBoardGameDL.g:456:3: ( (lv_inarow_1_0= ruleInARow ) )
            // InternalBoardGameDL.g:457:4: (lv_inarow_1_0= ruleInARow )
            {
            // InternalBoardGameDL.g:457:4: (lv_inarow_1_0= ruleInARow )
            // InternalBoardGameDL.g:458:5: lv_inarow_1_0= ruleInARow
            {

            					newCompositeNode(grammarAccess.getWinConditionAccess().getInarowInARowParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_inarow_1_0=ruleInARow();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWinConditionRule());
            					}
            					set(
            						current,
            						"inarow",
            						lv_inarow_1_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.InARow");
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
    // $ANTLR end "ruleWinCondition"


    // $ANTLR start "entryRuleEInt"
    // InternalBoardGameDL.g:479:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalBoardGameDL.g:479:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalBoardGameDL.g:480:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalBoardGameDL.g:486:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalBoardGameDL.g:492:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalBoardGameDL.g:493:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalBoardGameDL.g:493:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalBoardGameDL.g:494:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalBoardGameDL.g:494:3: (kw= '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBoardGameDL.g:495:4: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_15); 

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
    // InternalBoardGameDL.g:512:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBoardGameDL.g:512:47: (iv_ruleEString= ruleEString EOF )
            // InternalBoardGameDL.g:513:2: iv_ruleEString= ruleEString EOF
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
    // InternalBoardGameDL.g:519:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBoardGameDL.g:525:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBoardGameDL.g:526:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBoardGameDL.g:526:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalBoardGameDL.g:527:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBoardGameDL.g:535:3: this_ID_1= RULE_ID
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
    // InternalBoardGameDL.g:546:1: entryRuleValidMove returns [EObject current=null] : iv_ruleValidMove= ruleValidMove EOF ;
    public final EObject entryRuleValidMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidMove = null;


        try {
            // InternalBoardGameDL.g:546:50: (iv_ruleValidMove= ruleValidMove EOF )
            // InternalBoardGameDL.g:547:2: iv_ruleValidMove= ruleValidMove EOF
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
    // InternalBoardGameDL.g:553:1: ruleValidMove returns [EObject current=null] : (otherlv_0= 'ValidMove' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_placeAnywhere_3_0= 'placeAnywhere' ) ) (otherlv_4= 'valid' otherlv_5= 'if' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* )? otherlv_9= '}' ) ;
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
            // InternalBoardGameDL.g:559:2: ( (otherlv_0= 'ValidMove' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_placeAnywhere_3_0= 'placeAnywhere' ) ) (otherlv_4= 'valid' otherlv_5= 'if' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* )? otherlv_9= '}' ) )
            // InternalBoardGameDL.g:560:2: (otherlv_0= 'ValidMove' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_placeAnywhere_3_0= 'placeAnywhere' ) ) (otherlv_4= 'valid' otherlv_5= 'if' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* )? otherlv_9= '}' )
            {
            // InternalBoardGameDL.g:560:2: (otherlv_0= 'ValidMove' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_placeAnywhere_3_0= 'placeAnywhere' ) ) (otherlv_4= 'valid' otherlv_5= 'if' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* )? otherlv_9= '}' )
            // InternalBoardGameDL.g:561:3: otherlv_0= 'ValidMove' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_placeAnywhere_3_0= 'placeAnywhere' ) ) (otherlv_4= 'valid' otherlv_5= 'if' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getValidMoveAccess().getValidMoveKeyword_0());
            		
            // InternalBoardGameDL.g:565:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBoardGameDL.g:566:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBoardGameDL.g:566:4: (lv_name_1_0= RULE_ID )
            // InternalBoardGameDL.g:567:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,14,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getValidMoveAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBoardGameDL.g:587:3: ( (lv_placeAnywhere_3_0= 'placeAnywhere' ) )
            // InternalBoardGameDL.g:588:4: (lv_placeAnywhere_3_0= 'placeAnywhere' )
            {
            // InternalBoardGameDL.g:588:4: (lv_placeAnywhere_3_0= 'placeAnywhere' )
            // InternalBoardGameDL.g:589:5: lv_placeAnywhere_3_0= 'placeAnywhere'
            {
            lv_placeAnywhere_3_0=(Token)match(input,26,FOLLOW_18); 

            					newLeafNode(lv_placeAnywhere_3_0, grammarAccess.getValidMoveAccess().getPlaceAnywherePlaceAnywhereKeyword_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValidMoveRule());
            					}
            					setWithLastConsumed(current, "placeAnywhere", lv_placeAnywhere_3_0 != null, "placeAnywhere");
            				

            }


            }

            // InternalBoardGameDL.g:601:3: (otherlv_4= 'valid' otherlv_5= 'if' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBoardGameDL.g:602:4: otherlv_4= 'valid' otherlv_5= 'if' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )*
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getValidMoveAccess().getValidKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getValidMoveAccess().getIfKeyword_4_1());
                    			
                    // InternalBoardGameDL.g:610:4: ( ( ruleEString ) )
                    // InternalBoardGameDL.g:611:5: ( ruleEString )
                    {
                    // InternalBoardGameDL.g:611:5: ( ruleEString )
                    // InternalBoardGameDL.g:612:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValidMoveRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getValidMoveAccess().getConditionsConditionCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBoardGameDL.g:626:4: (otherlv_7= 'and' ( ( ruleEString ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==29) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalBoardGameDL.g:627:5: otherlv_7= 'and' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,29,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getValidMoveAccess().getAndKeyword_4_3_0());
                    	    				
                    	    // InternalBoardGameDL.g:631:5: ( ( ruleEString ) )
                    	    // InternalBoardGameDL.g:632:6: ( ruleEString )
                    	    {
                    	    // InternalBoardGameDL.g:632:6: ( ruleEString )
                    	    // InternalBoardGameDL.g:633:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getValidMoveRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getValidMoveAccess().getConditionsConditionCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,21,FOLLOW_2); 

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
    // InternalBoardGameDL.g:657:1: entryRuleEffectOnCell returns [EObject current=null] : iv_ruleEffectOnCell= ruleEffectOnCell EOF ;
    public final EObject entryRuleEffectOnCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectOnCell = null;


        try {
            // InternalBoardGameDL.g:657:53: (iv_ruleEffectOnCell= ruleEffectOnCell EOF )
            // InternalBoardGameDL.g:658:2: iv_ruleEffectOnCell= ruleEffectOnCell EOF
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
    // InternalBoardGameDL.g:664:1: ruleEffectOnCell returns [EObject current=null] : (otherlv_0= 'EffectOnCell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' otherlv_11= '(' ( ( ruleEString ) ) otherlv_13= ')' ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' ) ;
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
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_x_6_0 = null;

        AntlrDatatypeRuleToken lv_y_8_0 = null;



        	enterRule();

        try {
            // InternalBoardGameDL.g:670:2: ( (otherlv_0= 'EffectOnCell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' otherlv_11= '(' ( ( ruleEString ) ) otherlv_13= ')' ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' ) )
            // InternalBoardGameDL.g:671:2: (otherlv_0= 'EffectOnCell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' otherlv_11= '(' ( ( ruleEString ) ) otherlv_13= ')' ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' )
            {
            // InternalBoardGameDL.g:671:2: (otherlv_0= 'EffectOnCell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' otherlv_11= '(' ( ( ruleEString ) ) otherlv_13= ')' ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' )
            // InternalBoardGameDL.g:672:3: otherlv_0= 'EffectOnCell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' otherlv_11= '(' ( ( ruleEString ) ) otherlv_13= ')' ) ) ) ) )+ {...}?) ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectOnCellAccess().getEffectOnCellKeyword_0());
            		
            // InternalBoardGameDL.g:676:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBoardGameDL.g:677:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBoardGameDL.g:677:4: (lv_name_1_0= RULE_ID )
            // InternalBoardGameDL.g:678:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,14,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getEffectOnCellAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBoardGameDL.g:698:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' otherlv_11= '(' ( ( ruleEString ) ) otherlv_13= ')' ) ) ) ) )+ {...}?) ) )
            // InternalBoardGameDL.g:699:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' otherlv_11= '(' ( ( ruleEString ) ) otherlv_13= ')' ) ) ) ) )+ {...}?) )
            {
            // InternalBoardGameDL.g:699:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' otherlv_11= '(' ( ( ruleEString ) ) otherlv_13= ')' ) ) ) ) )+ {...}?) )
            // InternalBoardGameDL.g:700:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' otherlv_11= '(' ( ( ruleEString ) ) otherlv_13= ')' ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3());
            				
            // InternalBoardGameDL.g:703:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' otherlv_11= '(' ( ( ruleEString ) ) otherlv_13= ')' ) ) ) ) )+ {...}?)
            // InternalBoardGameDL.g:704:6: ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' otherlv_11= '(' ( ( ruleEString ) ) otherlv_13= ')' ) ) ) ) )+ {...}?
            {
            // InternalBoardGameDL.g:704:6: ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' otherlv_11= '(' ( ( ruleEString ) ) otherlv_13= ')' ) ) ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( LA10_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 0) ) {
                    alt10=1;
                }
                else if ( LA10_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 1) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBoardGameDL.g:705:4: ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) )
            	    {
            	    // InternalBoardGameDL.g:705:4: ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) )
            	    // InternalBoardGameDL.g:706:5: {...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEffectOnCell", "getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalBoardGameDL.g:706:109: ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) )
            	    // InternalBoardGameDL.g:707:6: ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalBoardGameDL.g:710:9: ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) )
            	    // InternalBoardGameDL.g:710:10: {...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEffectOnCell", "true");
            	    }
            	    // InternalBoardGameDL.g:710:19: (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' )
            	    // InternalBoardGameDL.g:710:20: otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')'
            	    {
            	    otherlv_4=(Token)match(input,31,FOLLOW_22); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEffectOnCellAccess().getRelativePositionKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,32,FOLLOW_5); 

            	    									newLeafNode(otherlv_5, grammarAccess.getEffectOnCellAccess().getLeftParenthesisKeyword_3_0_1());
            	    								
            	    // InternalBoardGameDL.g:718:9: ( (lv_x_6_0= ruleEInt ) )
            	    // InternalBoardGameDL.g:719:10: (lv_x_6_0= ruleEInt )
            	    {
            	    // InternalBoardGameDL.g:719:10: (lv_x_6_0= ruleEInt )
            	    // InternalBoardGameDL.g:720:11: lv_x_6_0= ruleEInt
            	    {

            	    											newCompositeNode(grammarAccess.getEffectOnCellAccess().getXEIntParserRuleCall_3_0_2_0());
            	    										
            	    pushFollow(FOLLOW_23);
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

            	    otherlv_7=(Token)match(input,18,FOLLOW_5); 

            	    									newLeafNode(otherlv_7, grammarAccess.getEffectOnCellAccess().getCommaKeyword_3_0_3());
            	    								
            	    // InternalBoardGameDL.g:741:9: ( (lv_y_8_0= ruleEInt ) )
            	    // InternalBoardGameDL.g:742:10: (lv_y_8_0= ruleEInt )
            	    {
            	    // InternalBoardGameDL.g:742:10: (lv_y_8_0= ruleEInt )
            	    // InternalBoardGameDL.g:743:11: lv_y_8_0= ruleEInt
            	    {

            	    											newCompositeNode(grammarAccess.getEffectOnCellAccess().getYEIntParserRuleCall_3_0_4_0());
            	    										
            	    pushFollow(FOLLOW_24);
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

            	    otherlv_9=(Token)match(input,33,FOLLOW_25); 

            	    									newLeafNode(otherlv_9, grammarAccess.getEffectOnCellAccess().getRightParenthesisKeyword_3_0_5());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBoardGameDL.g:770:4: ({...}? => ( ({...}? => (otherlv_10= 'newCellState' otherlv_11= '(' ( ( ruleEString ) ) otherlv_13= ')' ) ) ) )
            	    {
            	    // InternalBoardGameDL.g:770:4: ({...}? => ( ({...}? => (otherlv_10= 'newCellState' otherlv_11= '(' ( ( ruleEString ) ) otherlv_13= ')' ) ) ) )
            	    // InternalBoardGameDL.g:771:5: {...}? => ( ({...}? => (otherlv_10= 'newCellState' otherlv_11= '(' ( ( ruleEString ) ) otherlv_13= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEffectOnCell", "getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalBoardGameDL.g:771:109: ( ({...}? => (otherlv_10= 'newCellState' otherlv_11= '(' ( ( ruleEString ) ) otherlv_13= ')' ) ) )
            	    // InternalBoardGameDL.g:772:6: ({...}? => (otherlv_10= 'newCellState' otherlv_11= '(' ( ( ruleEString ) ) otherlv_13= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalBoardGameDL.g:775:9: ({...}? => (otherlv_10= 'newCellState' otherlv_11= '(' ( ( ruleEString ) ) otherlv_13= ')' ) )
            	    // InternalBoardGameDL.g:775:10: {...}? => (otherlv_10= 'newCellState' otherlv_11= '(' ( ( ruleEString ) ) otherlv_13= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEffectOnCell", "true");
            	    }
            	    // InternalBoardGameDL.g:775:19: (otherlv_10= 'newCellState' otherlv_11= '(' ( ( ruleEString ) ) otherlv_13= ')' )
            	    // InternalBoardGameDL.g:775:20: otherlv_10= 'newCellState' otherlv_11= '(' ( ( ruleEString ) ) otherlv_13= ')'
            	    {
            	    otherlv_10=(Token)match(input,34,FOLLOW_22); 

            	    									newLeafNode(otherlv_10, grammarAccess.getEffectOnCellAccess().getNewCellStateKeyword_3_1_0());
            	    								
            	    otherlv_11=(Token)match(input,32,FOLLOW_3); 

            	    									newLeafNode(otherlv_11, grammarAccess.getEffectOnCellAccess().getLeftParenthesisKeyword_3_1_1());
            	    								
            	    // InternalBoardGameDL.g:783:9: ( ( ruleEString ) )
            	    // InternalBoardGameDL.g:784:10: ( ruleEString )
            	    {
            	    // InternalBoardGameDL.g:784:10: ( ruleEString )
            	    // InternalBoardGameDL.g:785:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEffectOnCellRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getEffectOnCellAccess().getCellstateCellStateCrossReference_3_1_2_0());
            	    										
            	    pushFollow(FOLLOW_24);
            	    ruleEString();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_13=(Token)match(input,33,FOLLOW_25); 

            	    									newLeafNode(otherlv_13, grammarAccess.getEffectOnCellAccess().getRightParenthesisKeyword_3_1_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleEffectOnCell", "getUnorderedGroupHelper().canLeave(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3());
            				

            }

            otherlv_14=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getEffectOnCellAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalBoardGameDL.g:825:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalBoardGameDL.g:825:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalBoardGameDL.g:826:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalBoardGameDL.g:832:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'Condition' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleEString ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBoardGameDL.g:838:2: ( (otherlv_0= 'Condition' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleEString ) ) ) )
            // InternalBoardGameDL.g:839:2: (otherlv_0= 'Condition' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleEString ) ) )
            {
            // InternalBoardGameDL.g:839:2: (otherlv_0= 'Condition' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:840:3: otherlv_0= 'Condition' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getConditionKeyword_0());
            		
            // InternalBoardGameDL.g:844:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBoardGameDL.g:845:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBoardGameDL.g:845:4: (lv_name_1_0= RULE_ID )
            // InternalBoardGameDL.g:846:5: lv_name_1_0= RULE_ID
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

            // InternalBoardGameDL.g:862:3: ( ( ruleEString ) )
            // InternalBoardGameDL.g:863:4: ( ruleEString )
            {
            // InternalBoardGameDL.g:863:4: ( ruleEString )
            // InternalBoardGameDL.g:864:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConditionAccess().getCellstateCellStateCrossReference_2_0());
            				
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


    // $ANTLR start "entryRuleInARow"
    // InternalBoardGameDL.g:882:1: entryRuleInARow returns [EObject current=null] : iv_ruleInARow= ruleInARow EOF ;
    public final EObject entryRuleInARow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInARow = null;


        try {
            // InternalBoardGameDL.g:882:47: (iv_ruleInARow= ruleInARow EOF )
            // InternalBoardGameDL.g:883:2: iv_ruleInARow= ruleInARow EOF
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
    // InternalBoardGameDL.g:889:1: ruleInARow returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'count' ( (lv_count_2_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_horizontal_3_0= 'horizontal' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vertical_4_0= 'vertical' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_diagonal_5_0= 'diagonal' ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleInARow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_horizontal_3_0=null;
        Token lv_vertical_4_0=null;
        Token lv_diagonal_5_0=null;
        AntlrDatatypeRuleToken lv_count_2_0 = null;



        	enterRule();

        try {
            // InternalBoardGameDL.g:895:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'count' ( (lv_count_2_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_horizontal_3_0= 'horizontal' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vertical_4_0= 'vertical' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_diagonal_5_0= 'diagonal' ) ) ) ) ) )+ {...}?) ) ) )
            // InternalBoardGameDL.g:896:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'count' ( (lv_count_2_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_horizontal_3_0= 'horizontal' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vertical_4_0= 'vertical' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_diagonal_5_0= 'diagonal' ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalBoardGameDL.g:896:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'count' ( (lv_count_2_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_horizontal_3_0= 'horizontal' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vertical_4_0= 'vertical' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_diagonal_5_0= 'diagonal' ) ) ) ) ) )+ {...}?) ) )
            // InternalBoardGameDL.g:897:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'count' ( (lv_count_2_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_horizontal_3_0= 'horizontal' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vertical_4_0= 'vertical' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_diagonal_5_0= 'diagonal' ) ) ) ) ) )+ {...}?) )
            {
            // InternalBoardGameDL.g:897:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'count' ( (lv_count_2_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_horizontal_3_0= 'horizontal' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vertical_4_0= 'vertical' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_diagonal_5_0= 'diagonal' ) ) ) ) ) )+ {...}?) )
            // InternalBoardGameDL.g:898:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'count' ( (lv_count_2_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_horizontal_3_0= 'horizontal' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vertical_4_0= 'vertical' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_diagonal_5_0= 'diagonal' ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getInARowAccess().getUnorderedGroup());
            			
            // InternalBoardGameDL.g:901:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'count' ( (lv_count_2_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_horizontal_3_0= 'horizontal' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vertical_4_0= 'vertical' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_diagonal_5_0= 'diagonal' ) ) ) ) ) )+ {...}?)
            // InternalBoardGameDL.g:902:5: ( ({...}? => ( ({...}? => (otherlv_1= 'count' ( (lv_count_2_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_horizontal_3_0= 'horizontal' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vertical_4_0= 'vertical' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_diagonal_5_0= 'diagonal' ) ) ) ) ) )+ {...}?
            {
            // InternalBoardGameDL.g:902:5: ( ({...}? => ( ({...}? => (otherlv_1= 'count' ( (lv_count_2_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_horizontal_3_0= 'horizontal' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vertical_4_0= 'vertical' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_diagonal_5_0= 'diagonal' ) ) ) ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=5;
                int LA11_0 = input.LA(1);

                if ( LA11_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 1) ) {
                    alt11=2;
                }
                else if ( LA11_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 2) ) {
                    alt11=3;
                }
                else if ( LA11_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 3) ) {
                    alt11=4;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBoardGameDL.g:903:3: ({...}? => ( ({...}? => (otherlv_1= 'count' ( (lv_count_2_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // InternalBoardGameDL.g:903:3: ({...}? => ( ({...}? => (otherlv_1= 'count' ( (lv_count_2_0= ruleEInt ) ) ) ) ) )
            	    // InternalBoardGameDL.g:904:4: {...}? => ( ({...}? => (otherlv_1= 'count' ( (lv_count_2_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleInARow", "getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalBoardGameDL.g:904:100: ( ({...}? => (otherlv_1= 'count' ( (lv_count_2_0= ruleEInt ) ) ) ) )
            	    // InternalBoardGameDL.g:905:5: ({...}? => (otherlv_1= 'count' ( (lv_count_2_0= ruleEInt ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getInARowAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalBoardGameDL.g:908:8: ({...}? => (otherlv_1= 'count' ( (lv_count_2_0= ruleEInt ) ) ) )
            	    // InternalBoardGameDL.g:908:9: {...}? => (otherlv_1= 'count' ( (lv_count_2_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInARow", "true");
            	    }
            	    // InternalBoardGameDL.g:908:18: (otherlv_1= 'count' ( (lv_count_2_0= ruleEInt ) ) )
            	    // InternalBoardGameDL.g:908:19: otherlv_1= 'count' ( (lv_count_2_0= ruleEInt ) )
            	    {
            	    otherlv_1=(Token)match(input,36,FOLLOW_5); 

            	    								newLeafNode(otherlv_1, grammarAccess.getInARowAccess().getCountKeyword_0_0());
            	    							
            	    // InternalBoardGameDL.g:912:8: ( (lv_count_2_0= ruleEInt ) )
            	    // InternalBoardGameDL.g:913:9: (lv_count_2_0= ruleEInt )
            	    {
            	    // InternalBoardGameDL.g:913:9: (lv_count_2_0= ruleEInt )
            	    // InternalBoardGameDL.g:914:10: lv_count_2_0= ruleEInt
            	    {

            	    										newCompositeNode(grammarAccess.getInARowAccess().getCountEIntParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_26);
            	    lv_count_2_0=ruleEInt();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getInARowRule());
            	    										}
            	    										set(
            	    											current,
            	    											"count",
            	    											lv_count_2_0,
            	    											"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.EInt");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInARowAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBoardGameDL.g:937:3: ({...}? => ( ({...}? => ( (lv_horizontal_3_0= 'horizontal' ) ) ) ) )
            	    {
            	    // InternalBoardGameDL.g:937:3: ({...}? => ( ({...}? => ( (lv_horizontal_3_0= 'horizontal' ) ) ) ) )
            	    // InternalBoardGameDL.g:938:4: {...}? => ( ({...}? => ( (lv_horizontal_3_0= 'horizontal' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleInARow", "getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalBoardGameDL.g:938:100: ( ({...}? => ( (lv_horizontal_3_0= 'horizontal' ) ) ) )
            	    // InternalBoardGameDL.g:939:5: ({...}? => ( (lv_horizontal_3_0= 'horizontal' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getInARowAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalBoardGameDL.g:942:8: ({...}? => ( (lv_horizontal_3_0= 'horizontal' ) ) )
            	    // InternalBoardGameDL.g:942:9: {...}? => ( (lv_horizontal_3_0= 'horizontal' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInARow", "true");
            	    }
            	    // InternalBoardGameDL.g:942:18: ( (lv_horizontal_3_0= 'horizontal' ) )
            	    // InternalBoardGameDL.g:942:19: (lv_horizontal_3_0= 'horizontal' )
            	    {
            	    // InternalBoardGameDL.g:942:19: (lv_horizontal_3_0= 'horizontal' )
            	    // InternalBoardGameDL.g:943:9: lv_horizontal_3_0= 'horizontal'
            	    {
            	    lv_horizontal_3_0=(Token)match(input,37,FOLLOW_26); 

            	    									newLeafNode(lv_horizontal_3_0, grammarAccess.getInARowAccess().getHorizontalHorizontalKeyword_1_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getInARowRule());
            	    									}
            	    									setWithLastConsumed(current, "horizontal", lv_horizontal_3_0 != null, "horizontal");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInARowAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBoardGameDL.g:960:3: ({...}? => ( ({...}? => ( (lv_vertical_4_0= 'vertical' ) ) ) ) )
            	    {
            	    // InternalBoardGameDL.g:960:3: ({...}? => ( ({...}? => ( (lv_vertical_4_0= 'vertical' ) ) ) ) )
            	    // InternalBoardGameDL.g:961:4: {...}? => ( ({...}? => ( (lv_vertical_4_0= 'vertical' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleInARow", "getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalBoardGameDL.g:961:100: ( ({...}? => ( (lv_vertical_4_0= 'vertical' ) ) ) )
            	    // InternalBoardGameDL.g:962:5: ({...}? => ( (lv_vertical_4_0= 'vertical' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getInARowAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalBoardGameDL.g:965:8: ({...}? => ( (lv_vertical_4_0= 'vertical' ) ) )
            	    // InternalBoardGameDL.g:965:9: {...}? => ( (lv_vertical_4_0= 'vertical' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInARow", "true");
            	    }
            	    // InternalBoardGameDL.g:965:18: ( (lv_vertical_4_0= 'vertical' ) )
            	    // InternalBoardGameDL.g:965:19: (lv_vertical_4_0= 'vertical' )
            	    {
            	    // InternalBoardGameDL.g:965:19: (lv_vertical_4_0= 'vertical' )
            	    // InternalBoardGameDL.g:966:9: lv_vertical_4_0= 'vertical'
            	    {
            	    lv_vertical_4_0=(Token)match(input,38,FOLLOW_26); 

            	    									newLeafNode(lv_vertical_4_0, grammarAccess.getInARowAccess().getVerticalVerticalKeyword_2_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getInARowRule());
            	    									}
            	    									setWithLastConsumed(current, "vertical", lv_vertical_4_0 != null, "vertical");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInARowAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalBoardGameDL.g:983:3: ({...}? => ( ({...}? => ( (lv_diagonal_5_0= 'diagonal' ) ) ) ) )
            	    {
            	    // InternalBoardGameDL.g:983:3: ({...}? => ( ({...}? => ( (lv_diagonal_5_0= 'diagonal' ) ) ) ) )
            	    // InternalBoardGameDL.g:984:4: {...}? => ( ({...}? => ( (lv_diagonal_5_0= 'diagonal' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleInARow", "getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalBoardGameDL.g:984:100: ( ({...}? => ( (lv_diagonal_5_0= 'diagonal' ) ) ) )
            	    // InternalBoardGameDL.g:985:5: ({...}? => ( (lv_diagonal_5_0= 'diagonal' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getInARowAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalBoardGameDL.g:988:8: ({...}? => ( (lv_diagonal_5_0= 'diagonal' ) ) )
            	    // InternalBoardGameDL.g:988:9: {...}? => ( (lv_diagonal_5_0= 'diagonal' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInARow", "true");
            	    }
            	    // InternalBoardGameDL.g:988:18: ( (lv_diagonal_5_0= 'diagonal' ) )
            	    // InternalBoardGameDL.g:988:19: (lv_diagonal_5_0= 'diagonal' )
            	    {
            	    // InternalBoardGameDL.g:988:19: (lv_diagonal_5_0= 'diagonal' )
            	    // InternalBoardGameDL.g:989:9: lv_diagonal_5_0= 'diagonal'
            	    {
            	    lv_diagonal_5_0=(Token)match(input,39,FOLLOW_26); 

            	    									newLeafNode(lv_diagonal_5_0, grammarAccess.getInARowAccess().getDiagonalDiagonalKeyword_3_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getInARowRule());
            	    									}
            	    									setWithLastConsumed(current, "diagonal", lv_diagonal_5_0 != null, "diagonal");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInARowAccess().getUnorderedGroup());
            	    				

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getInARowAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleInARow", "getUnorderedGroupHelper().canLeave(grammarAccess.getInARowAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getInARowAccess().getUnorderedGroup());
            			

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000842C02002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000F000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000480200000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000F000000002L});

}
