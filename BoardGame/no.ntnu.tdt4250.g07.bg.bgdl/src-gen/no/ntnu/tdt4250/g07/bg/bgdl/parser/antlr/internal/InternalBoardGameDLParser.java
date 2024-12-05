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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Title'", "'BoardSize'", "'PieceType'", "'{'", "'Symbol'", "'DisallowedStates'", "','", "'EffectsOnCell'", "'}'", "'Cellstate'", "'WinCondition'", "'-'", "'EffectOnCell'", "'relativePosition'", "'('", "')'", "'newCellState'", "'Line'", "'length'", "'direction'", "'ROW'", "'COLUMN'", "'DIAGONAL'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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

                if ( (LA1_0==13||(LA1_0>=20 && LA1_0<=21)||LA1_0==23) ) {
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
    // InternalBoardGameDL.g:156:1: ruleBoardGameElement returns [EObject current=null] : (this_PieceType_0= rulePieceType | this_EffectOnCell_1= ruleEffectOnCell | this_CellState_2= ruleCellState | this_WinCondition_3= ruleWinCondition ) ;
    public final EObject ruleBoardGameElement() throws RecognitionException {
        EObject current = null;

        EObject this_PieceType_0 = null;

        EObject this_EffectOnCell_1 = null;

        EObject this_CellState_2 = null;

        EObject this_WinCondition_3 = null;



        	enterRule();

        try {
            // InternalBoardGameDL.g:162:2: ( (this_PieceType_0= rulePieceType | this_EffectOnCell_1= ruleEffectOnCell | this_CellState_2= ruleCellState | this_WinCondition_3= ruleWinCondition ) )
            // InternalBoardGameDL.g:163:2: (this_PieceType_0= rulePieceType | this_EffectOnCell_1= ruleEffectOnCell | this_CellState_2= ruleCellState | this_WinCondition_3= ruleWinCondition )
            {
            // InternalBoardGameDL.g:163:2: (this_PieceType_0= rulePieceType | this_EffectOnCell_1= ruleEffectOnCell | this_CellState_2= ruleCellState | this_WinCondition_3= ruleWinCondition )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            case 21:
                {
                alt2=4;
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
                    // InternalBoardGameDL.g:182:3: this_CellState_2= ruleCellState
                    {

                    			newCompositeNode(grammarAccess.getBoardGameElementAccess().getCellStateParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CellState_2=ruleCellState();

                    state._fsp--;


                    			current = this_CellState_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBoardGameDL.g:191:3: this_WinCondition_3= ruleWinCondition
                    {

                    			newCompositeNode(grammarAccess.getBoardGameElementAccess().getWinConditionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_WinCondition_3=ruleWinCondition();

                    state._fsp--;


                    			current = this_WinCondition_3;
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
    // InternalBoardGameDL.g:203:1: entryRulePieceType returns [EObject current=null] : iv_rulePieceType= rulePieceType EOF ;
    public final EObject entryRulePieceType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePieceType = null;


        try {
            // InternalBoardGameDL.g:203:50: (iv_rulePieceType= rulePieceType EOF )
            // InternalBoardGameDL.g:204:2: iv_rulePieceType= rulePieceType EOF
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
    // InternalBoardGameDL.g:210:1: rulePieceType returns [EObject current=null] : (otherlv_0= 'PieceType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Symbol' ( (lv_symbol_4_0= ruleEString ) ) otherlv_5= 'DisallowedStates' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* (otherlv_9= 'EffectsOnCell' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* )? otherlv_13= '}' ) ;
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
            // InternalBoardGameDL.g:216:2: ( (otherlv_0= 'PieceType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Symbol' ( (lv_symbol_4_0= ruleEString ) ) otherlv_5= 'DisallowedStates' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* (otherlv_9= 'EffectsOnCell' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* )? otherlv_13= '}' ) )
            // InternalBoardGameDL.g:217:2: (otherlv_0= 'PieceType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Symbol' ( (lv_symbol_4_0= ruleEString ) ) otherlv_5= 'DisallowedStates' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* (otherlv_9= 'EffectsOnCell' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* )? otherlv_13= '}' )
            {
            // InternalBoardGameDL.g:217:2: (otherlv_0= 'PieceType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Symbol' ( (lv_symbol_4_0= ruleEString ) ) otherlv_5= 'DisallowedStates' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* (otherlv_9= 'EffectsOnCell' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* )? otherlv_13= '}' )
            // InternalBoardGameDL.g:218:3: otherlv_0= 'PieceType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Symbol' ( (lv_symbol_4_0= ruleEString ) ) otherlv_5= 'DisallowedStates' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* (otherlv_9= 'EffectsOnCell' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPieceTypeAccess().getPieceTypeKeyword_0());
            		
            // InternalBoardGameDL.g:222:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBoardGameDL.g:223:4: (lv_name_1_0= ruleEString )
            {
            // InternalBoardGameDL.g:223:4: (lv_name_1_0= ruleEString )
            // InternalBoardGameDL.g:224:5: lv_name_1_0= ruleEString
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
            		
            // InternalBoardGameDL.g:249:3: ( (lv_symbol_4_0= ruleEString ) )
            // InternalBoardGameDL.g:250:4: (lv_symbol_4_0= ruleEString )
            {
            // InternalBoardGameDL.g:250:4: (lv_symbol_4_0= ruleEString )
            // InternalBoardGameDL.g:251:5: lv_symbol_4_0= ruleEString
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

            			newLeafNode(otherlv_5, grammarAccess.getPieceTypeAccess().getDisallowedStatesKeyword_5());
            		
            // InternalBoardGameDL.g:272:3: ( ( ruleEString ) )
            // InternalBoardGameDL.g:273:4: ( ruleEString )
            {
            // InternalBoardGameDL.g:273:4: ( ruleEString )
            // InternalBoardGameDL.g:274:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPieceTypeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPieceTypeAccess().getDisallowedStatesCellStateCrossReference_6_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBoardGameDL.g:288:3: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBoardGameDL.g:289:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,17,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getPieceTypeAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalBoardGameDL.g:293:4: ( ( ruleEString ) )
            	    // InternalBoardGameDL.g:294:5: ( ruleEString )
            	    {
            	    // InternalBoardGameDL.g:294:5: ( ruleEString )
            	    // InternalBoardGameDL.g:295:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPieceTypeRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getPieceTypeAccess().getDisallowedStatesCellStateCrossReference_7_1_0());
            	    					
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

            // InternalBoardGameDL.g:310:3: (otherlv_9= 'EffectsOnCell' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBoardGameDL.g:311:4: otherlv_9= 'EffectsOnCell' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_9=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getPieceTypeAccess().getEffectsOnCellKeyword_8_0());
                    			
                    // InternalBoardGameDL.g:315:4: ( ( ruleEString ) )
                    // InternalBoardGameDL.g:316:5: ( ruleEString )
                    {
                    // InternalBoardGameDL.g:316:5: ( ruleEString )
                    // InternalBoardGameDL.g:317:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPieceTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPieceTypeAccess().getEffectsOnCellEffectOnCellCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBoardGameDL.g:331:4: (otherlv_11= ',' ( ( ruleEString ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalBoardGameDL.g:332:5: otherlv_11= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getPieceTypeAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalBoardGameDL.g:336:5: ( ( ruleEString ) )
                    	    // InternalBoardGameDL.g:337:6: ( ruleEString )
                    	    {
                    	    // InternalBoardGameDL.g:337:6: ( ruleEString )
                    	    // InternalBoardGameDL.g:338:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPieceTypeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getPieceTypeAccess().getEffectsOnCellEffectOnCellCrossReference_8_2_1_0());
                    	    						
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
    // InternalBoardGameDL.g:362:1: entryRuleCellState returns [EObject current=null] : iv_ruleCellState= ruleCellState EOF ;
    public final EObject entryRuleCellState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellState = null;


        try {
            // InternalBoardGameDL.g:362:50: (iv_ruleCellState= ruleCellState EOF )
            // InternalBoardGameDL.g:363:2: iv_ruleCellState= ruleCellState EOF
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
    // InternalBoardGameDL.g:369:1: ruleCellState returns [EObject current=null] : (otherlv_0= 'Cellstate' ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleCellState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalBoardGameDL.g:375:2: ( (otherlv_0= 'Cellstate' ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalBoardGameDL.g:376:2: (otherlv_0= 'Cellstate' ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalBoardGameDL.g:376:2: (otherlv_0= 'Cellstate' ( (lv_name_1_0= ruleEString ) ) )
            // InternalBoardGameDL.g:377:3: otherlv_0= 'Cellstate' ( (lv_name_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCellStateAccess().getCellstateKeyword_0());
            		
            // InternalBoardGameDL.g:381:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBoardGameDL.g:382:4: (lv_name_1_0= ruleEString )
            {
            // InternalBoardGameDL.g:382:4: (lv_name_1_0= ruleEString )
            // InternalBoardGameDL.g:383:5: lv_name_1_0= ruleEString
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
    // InternalBoardGameDL.g:404:1: entryRuleWinCondition returns [EObject current=null] : iv_ruleWinCondition= ruleWinCondition EOF ;
    public final EObject entryRuleWinCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWinCondition = null;


        try {
            // InternalBoardGameDL.g:404:53: (iv_ruleWinCondition= ruleWinCondition EOF )
            // InternalBoardGameDL.g:405:2: iv_ruleWinCondition= ruleWinCondition EOF
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
    // InternalBoardGameDL.g:411:1: ruleWinCondition returns [EObject current=null] : (otherlv_0= 'WinCondition' otherlv_1= '{' ( (lv_winConditionElements_2_0= ruleWinConditionElement ) ) ( (lv_winConditionElements_3_0= ruleWinConditionElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleWinCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_winConditionElements_2_0 = null;

        EObject lv_winConditionElements_3_0 = null;



        	enterRule();

        try {
            // InternalBoardGameDL.g:417:2: ( (otherlv_0= 'WinCondition' otherlv_1= '{' ( (lv_winConditionElements_2_0= ruleWinConditionElement ) ) ( (lv_winConditionElements_3_0= ruleWinConditionElement ) )* otherlv_4= '}' ) )
            // InternalBoardGameDL.g:418:2: (otherlv_0= 'WinCondition' otherlv_1= '{' ( (lv_winConditionElements_2_0= ruleWinConditionElement ) ) ( (lv_winConditionElements_3_0= ruleWinConditionElement ) )* otherlv_4= '}' )
            {
            // InternalBoardGameDL.g:418:2: (otherlv_0= 'WinCondition' otherlv_1= '{' ( (lv_winConditionElements_2_0= ruleWinConditionElement ) ) ( (lv_winConditionElements_3_0= ruleWinConditionElement ) )* otherlv_4= '}' )
            // InternalBoardGameDL.g:419:3: otherlv_0= 'WinCondition' otherlv_1= '{' ( (lv_winConditionElements_2_0= ruleWinConditionElement ) ) ( (lv_winConditionElements_3_0= ruleWinConditionElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getWinConditionAccess().getWinConditionKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getWinConditionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBoardGameDL.g:427:3: ( (lv_winConditionElements_2_0= ruleWinConditionElement ) )
            // InternalBoardGameDL.g:428:4: (lv_winConditionElements_2_0= ruleWinConditionElement )
            {
            // InternalBoardGameDL.g:428:4: (lv_winConditionElements_2_0= ruleWinConditionElement )
            // InternalBoardGameDL.g:429:5: lv_winConditionElements_2_0= ruleWinConditionElement
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

            // InternalBoardGameDL.g:446:3: ( (lv_winConditionElements_3_0= ruleWinConditionElement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBoardGameDL.g:447:4: (lv_winConditionElements_3_0= ruleWinConditionElement )
            	    {
            	    // InternalBoardGameDL.g:447:4: (lv_winConditionElements_3_0= ruleWinConditionElement )
            	    // InternalBoardGameDL.g:448:5: lv_winConditionElements_3_0= ruleWinConditionElement
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
    // InternalBoardGameDL.g:473:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalBoardGameDL.g:473:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalBoardGameDL.g:474:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalBoardGameDL.g:480:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalBoardGameDL.g:486:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalBoardGameDL.g:487:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalBoardGameDL.g:487:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalBoardGameDL.g:488:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalBoardGameDL.g:488:3: (kw= '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBoardGameDL.g:489:4: kw= '-'
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
    // InternalBoardGameDL.g:506:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBoardGameDL.g:506:47: (iv_ruleEString= ruleEString EOF )
            // InternalBoardGameDL.g:507:2: iv_ruleEString= ruleEString EOF
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
    // InternalBoardGameDL.g:513:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBoardGameDL.g:519:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBoardGameDL.g:520:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBoardGameDL.g:520:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalBoardGameDL.g:521:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBoardGameDL.g:529:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleEffectOnCell"
    // InternalBoardGameDL.g:540:1: entryRuleEffectOnCell returns [EObject current=null] : iv_ruleEffectOnCell= ruleEffectOnCell EOF ;
    public final EObject entryRuleEffectOnCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectOnCell = null;


        try {
            // InternalBoardGameDL.g:540:53: (iv_ruleEffectOnCell= ruleEffectOnCell EOF )
            // InternalBoardGameDL.g:541:2: iv_ruleEffectOnCell= ruleEffectOnCell EOF
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
    // InternalBoardGameDL.g:547:1: ruleEffectOnCell returns [EObject current=null] : (otherlv_0= 'EffectOnCell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' ) ;
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
            // InternalBoardGameDL.g:553:2: ( (otherlv_0= 'EffectOnCell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' ) )
            // InternalBoardGameDL.g:554:2: (otherlv_0= 'EffectOnCell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' )
            {
            // InternalBoardGameDL.g:554:2: (otherlv_0= 'EffectOnCell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' )
            // InternalBoardGameDL.g:555:3: otherlv_0= 'EffectOnCell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectOnCellAccess().getEffectOnCellKeyword_0());
            		
            // InternalBoardGameDL.g:559:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBoardGameDL.g:560:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBoardGameDL.g:560:4: (lv_name_1_0= RULE_ID )
            // InternalBoardGameDL.g:561:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getEffectOnCellAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBoardGameDL.g:581:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) ) ) ) )+ {...}?) ) )
            // InternalBoardGameDL.g:582:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalBoardGameDL.g:582:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) ) ) ) )+ {...}?) )
            // InternalBoardGameDL.g:583:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3());
            				
            // InternalBoardGameDL.g:586:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) ) ) ) )+ {...}?)
            // InternalBoardGameDL.g:587:6: ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) ) ) ) )+ {...}?
            {
            // InternalBoardGameDL.g:587:6: ( ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) ) ) ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( LA9_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 0) ) {
                    alt9=1;
                }
                else if ( LA9_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 1) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBoardGameDL.g:588:4: ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) )
            	    {
            	    // InternalBoardGameDL.g:588:4: ({...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) ) )
            	    // InternalBoardGameDL.g:589:5: {...}? => ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEffectOnCell", "getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalBoardGameDL.g:589:109: ( ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) ) )
            	    // InternalBoardGameDL.g:590:6: ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalBoardGameDL.g:593:9: ({...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' ) )
            	    // InternalBoardGameDL.g:593:10: {...}? => (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEffectOnCell", "true");
            	    }
            	    // InternalBoardGameDL.g:593:19: (otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' )
            	    // InternalBoardGameDL.g:593:20: otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')'
            	    {
            	    otherlv_4=(Token)match(input,24,FOLLOW_17); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEffectOnCellAccess().getRelativePositionKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,25,FOLLOW_5); 

            	    									newLeafNode(otherlv_5, grammarAccess.getEffectOnCellAccess().getLeftParenthesisKeyword_3_0_1());
            	    								
            	    // InternalBoardGameDL.g:601:9: ( (lv_x_6_0= ruleEInt ) )
            	    // InternalBoardGameDL.g:602:10: (lv_x_6_0= ruleEInt )
            	    {
            	    // InternalBoardGameDL.g:602:10: (lv_x_6_0= ruleEInt )
            	    // InternalBoardGameDL.g:603:11: lv_x_6_0= ruleEInt
            	    {

            	    											newCompositeNode(grammarAccess.getEffectOnCellAccess().getXEIntParserRuleCall_3_0_2_0());
            	    										
            	    pushFollow(FOLLOW_18);
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
            	    								
            	    // InternalBoardGameDL.g:624:9: ( (lv_y_8_0= ruleEInt ) )
            	    // InternalBoardGameDL.g:625:10: (lv_y_8_0= ruleEInt )
            	    {
            	    // InternalBoardGameDL.g:625:10: (lv_y_8_0= ruleEInt )
            	    // InternalBoardGameDL.g:626:11: lv_y_8_0= ruleEInt
            	    {

            	    											newCompositeNode(grammarAccess.getEffectOnCellAccess().getYEIntParserRuleCall_3_0_4_0());
            	    										
            	    pushFollow(FOLLOW_19);
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

            	    otherlv_9=(Token)match(input,26,FOLLOW_20); 

            	    									newLeafNode(otherlv_9, grammarAccess.getEffectOnCellAccess().getRightParenthesisKeyword_3_0_5());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBoardGameDL.g:653:4: ({...}? => ( ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // InternalBoardGameDL.g:653:4: ({...}? => ( ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) ) ) )
            	    // InternalBoardGameDL.g:654:5: {...}? => ( ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEffectOnCell", "getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalBoardGameDL.g:654:109: ( ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) ) )
            	    // InternalBoardGameDL.g:655:6: ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalBoardGameDL.g:658:9: ({...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) ) )
            	    // InternalBoardGameDL.g:658:10: {...}? => (otherlv_10= 'newCellState' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEffectOnCell", "true");
            	    }
            	    // InternalBoardGameDL.g:658:19: (otherlv_10= 'newCellState' ( ( ruleEString ) ) )
            	    // InternalBoardGameDL.g:658:20: otherlv_10= 'newCellState' ( ( ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,27,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getEffectOnCellAccess().getNewCellStateKeyword_3_1_0());
            	    								
            	    // InternalBoardGameDL.g:662:9: ( ( ruleEString ) )
            	    // InternalBoardGameDL.g:663:10: ( ruleEString )
            	    {
            	    // InternalBoardGameDL.g:663:10: ( ruleEString )
            	    // InternalBoardGameDL.g:664:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEffectOnCellRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getEffectOnCellAccess().getCellStateCellStateCrossReference_3_1_1_0());
            	    										
            	    pushFollow(FOLLOW_20);
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
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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


    // $ANTLR start "entryRuleWinConditionElement"
    // InternalBoardGameDL.g:700:1: entryRuleWinConditionElement returns [EObject current=null] : iv_ruleWinConditionElement= ruleWinConditionElement EOF ;
    public final EObject entryRuleWinConditionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWinConditionElement = null;


        try {
            // InternalBoardGameDL.g:700:60: (iv_ruleWinConditionElement= ruleWinConditionElement EOF )
            // InternalBoardGameDL.g:701:2: iv_ruleWinConditionElement= ruleWinConditionElement EOF
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
    // InternalBoardGameDL.g:707:1: ruleWinConditionElement returns [EObject current=null] : this_Line_0= ruleLine ;
    public final EObject ruleWinConditionElement() throws RecognitionException {
        EObject current = null;

        EObject this_Line_0 = null;



        	enterRule();

        try {
            // InternalBoardGameDL.g:713:2: (this_Line_0= ruleLine )
            // InternalBoardGameDL.g:714:2: this_Line_0= ruleLine
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
    // InternalBoardGameDL.g:725:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // InternalBoardGameDL.g:725:45: (iv_ruleLine= ruleLine EOF )
            // InternalBoardGameDL.g:726:2: iv_ruleLine= ruleLine EOF
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
    // InternalBoardGameDL.g:732:1: ruleLine returns [EObject current=null] : (otherlv_0= 'Line' otherlv_1= 'length' ( (lv_length_2_0= ruleEInt ) ) otherlv_3= 'direction' ( (lv_direction_4_0= ruleDirection ) ) ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_length_2_0 = null;

        Enumerator lv_direction_4_0 = null;



        	enterRule();

        try {
            // InternalBoardGameDL.g:738:2: ( (otherlv_0= 'Line' otherlv_1= 'length' ( (lv_length_2_0= ruleEInt ) ) otherlv_3= 'direction' ( (lv_direction_4_0= ruleDirection ) ) ) )
            // InternalBoardGameDL.g:739:2: (otherlv_0= 'Line' otherlv_1= 'length' ( (lv_length_2_0= ruleEInt ) ) otherlv_3= 'direction' ( (lv_direction_4_0= ruleDirection ) ) )
            {
            // InternalBoardGameDL.g:739:2: (otherlv_0= 'Line' otherlv_1= 'length' ( (lv_length_2_0= ruleEInt ) ) otherlv_3= 'direction' ( (lv_direction_4_0= ruleDirection ) ) )
            // InternalBoardGameDL.g:740:3: otherlv_0= 'Line' otherlv_1= 'length' ( (lv_length_2_0= ruleEInt ) ) otherlv_3= 'direction' ( (lv_direction_4_0= ruleDirection ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getLineAccess().getLineKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getLineAccess().getLengthKeyword_1());
            		
            // InternalBoardGameDL.g:748:3: ( (lv_length_2_0= ruleEInt ) )
            // InternalBoardGameDL.g:749:4: (lv_length_2_0= ruleEInt )
            {
            // InternalBoardGameDL.g:749:4: (lv_length_2_0= ruleEInt )
            // InternalBoardGameDL.g:750:5: lv_length_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getLineAccess().getLengthEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_3=(Token)match(input,30,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getLineAccess().getDirectionKeyword_3());
            		
            // InternalBoardGameDL.g:771:3: ( (lv_direction_4_0= ruleDirection ) )
            // InternalBoardGameDL.g:772:4: (lv_direction_4_0= ruleDirection )
            {
            // InternalBoardGameDL.g:772:4: (lv_direction_4_0= ruleDirection )
            // InternalBoardGameDL.g:773:5: lv_direction_4_0= ruleDirection
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
    // InternalBoardGameDL.g:794:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'ROW' ) | (enumLiteral_1= 'COLUMN' ) | (enumLiteral_2= 'DIAGONAL' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalBoardGameDL.g:800:2: ( ( (enumLiteral_0= 'ROW' ) | (enumLiteral_1= 'COLUMN' ) | (enumLiteral_2= 'DIAGONAL' ) ) )
            // InternalBoardGameDL.g:801:2: ( (enumLiteral_0= 'ROW' ) | (enumLiteral_1= 'COLUMN' ) | (enumLiteral_2= 'DIAGONAL' ) )
            {
            // InternalBoardGameDL.g:801:2: ( (enumLiteral_0= 'ROW' ) | (enumLiteral_1= 'COLUMN' ) | (enumLiteral_2= 'DIAGONAL' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt10=1;
                }
                break;
            case 32:
                {
                alt10=2;
                }
                break;
            case 33:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalBoardGameDL.g:802:3: (enumLiteral_0= 'ROW' )
                    {
                    // InternalBoardGameDL.g:802:3: (enumLiteral_0= 'ROW' )
                    // InternalBoardGameDL.g:803:4: enumLiteral_0= 'ROW'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getROWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getROWEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBoardGameDL.g:810:3: (enumLiteral_1= 'COLUMN' )
                    {
                    // InternalBoardGameDL.g:810:3: (enumLiteral_1= 'COLUMN' )
                    // InternalBoardGameDL.g:811:4: enumLiteral_1= 'COLUMN'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getCOLUMNEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getCOLUMNEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBoardGameDL.g:818:3: (enumLiteral_2= 'DIAGONAL' )
                    {
                    // InternalBoardGameDL.g:818:3: (enumLiteral_2= 'DIAGONAL' )
                    // InternalBoardGameDL.g:819:4: enumLiteral_2= 'DIAGONAL'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000B02002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000009080000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000380000000L});

}
