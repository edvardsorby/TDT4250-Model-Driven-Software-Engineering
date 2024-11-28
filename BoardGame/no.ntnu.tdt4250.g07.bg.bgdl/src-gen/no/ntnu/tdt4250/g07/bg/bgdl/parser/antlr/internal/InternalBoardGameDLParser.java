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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Title'", "'BoardSize'", "'validMoves'", "'['", "','", "']'", "'cellStates'", "'effectsOnCell'", "'winConditions'", "'pieceTypes'", "'{'", "'PieceType'", "'('", "'Symbol'", "'ValidMoves'", "'EffectsOnCell'", "')'", "'}'", "'InARow'", "'-'", "'ValidMove'", "'placeAnywhere'", "'when'", "'and'", "'EffectOnCell'", "'relativePosition'", "'newCellState'", "'Condition'", "'applies'", "'count'", "'horizontal'", "'vertical'", "'diagonal'"
    };
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
    // InternalBoardGameDL.g:71:1: ruleBoardGame returns [EObject current=null] : (otherlv_0= 'Title' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'BoardSize' ( (lv_size_3_0= ruleEInt ) ) otherlv_4= 'validMoves' otherlv_5= '[' ( (lv_validmoves_6_0= ruleValidMove ) ) (otherlv_7= ',' ( (lv_validmoves_8_0= ruleValidMove ) ) )* otherlv_9= ']' (otherlv_10= 'cellStates' otherlv_11= '[' ( (lv_cellstates_12_0= ruleCellState ) ) (otherlv_13= ',' ( (lv_cellstates_14_0= ruleCellState ) ) )* otherlv_15= ']' )? (otherlv_16= 'effectsOnCell' otherlv_17= '[' ( (lv_effectsoncell_18_0= ruleEffectOnCell ) ) (otherlv_19= ',' ( (lv_effectsoncell_20_0= ruleEffectOnCell ) ) )* otherlv_21= ']' )? otherlv_22= 'winConditions' otherlv_23= '[' ( (lv_winConditions_24_0= ruleWinCondition ) ) (otherlv_25= ',' ( (lv_winConditions_26_0= ruleWinCondition ) ) )* otherlv_27= ']' otherlv_28= 'pieceTypes' otherlv_29= '[' ( (lv_piecetypes_30_0= rulePieceType ) ) (otherlv_31= ',' ( (lv_piecetypes_32_0= rulePieceType ) ) )* otherlv_33= ']' ) ;
    public final EObject ruleBoardGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_size_3_0 = null;

        EObject lv_validmoves_6_0 = null;

        EObject lv_validmoves_8_0 = null;

        EObject lv_cellstates_12_0 = null;

        EObject lv_cellstates_14_0 = null;

        EObject lv_effectsoncell_18_0 = null;

        EObject lv_effectsoncell_20_0 = null;

        EObject lv_winConditions_24_0 = null;

        EObject lv_winConditions_26_0 = null;

        EObject lv_piecetypes_30_0 = null;

        EObject lv_piecetypes_32_0 = null;



        	enterRule();

        try {
            // InternalBoardGameDL.g:77:2: ( (otherlv_0= 'Title' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'BoardSize' ( (lv_size_3_0= ruleEInt ) ) otherlv_4= 'validMoves' otherlv_5= '[' ( (lv_validmoves_6_0= ruleValidMove ) ) (otherlv_7= ',' ( (lv_validmoves_8_0= ruleValidMove ) ) )* otherlv_9= ']' (otherlv_10= 'cellStates' otherlv_11= '[' ( (lv_cellstates_12_0= ruleCellState ) ) (otherlv_13= ',' ( (lv_cellstates_14_0= ruleCellState ) ) )* otherlv_15= ']' )? (otherlv_16= 'effectsOnCell' otherlv_17= '[' ( (lv_effectsoncell_18_0= ruleEffectOnCell ) ) (otherlv_19= ',' ( (lv_effectsoncell_20_0= ruleEffectOnCell ) ) )* otherlv_21= ']' )? otherlv_22= 'winConditions' otherlv_23= '[' ( (lv_winConditions_24_0= ruleWinCondition ) ) (otherlv_25= ',' ( (lv_winConditions_26_0= ruleWinCondition ) ) )* otherlv_27= ']' otherlv_28= 'pieceTypes' otherlv_29= '[' ( (lv_piecetypes_30_0= rulePieceType ) ) (otherlv_31= ',' ( (lv_piecetypes_32_0= rulePieceType ) ) )* otherlv_33= ']' ) )
            // InternalBoardGameDL.g:78:2: (otherlv_0= 'Title' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'BoardSize' ( (lv_size_3_0= ruleEInt ) ) otherlv_4= 'validMoves' otherlv_5= '[' ( (lv_validmoves_6_0= ruleValidMove ) ) (otherlv_7= ',' ( (lv_validmoves_8_0= ruleValidMove ) ) )* otherlv_9= ']' (otherlv_10= 'cellStates' otherlv_11= '[' ( (lv_cellstates_12_0= ruleCellState ) ) (otherlv_13= ',' ( (lv_cellstates_14_0= ruleCellState ) ) )* otherlv_15= ']' )? (otherlv_16= 'effectsOnCell' otherlv_17= '[' ( (lv_effectsoncell_18_0= ruleEffectOnCell ) ) (otherlv_19= ',' ( (lv_effectsoncell_20_0= ruleEffectOnCell ) ) )* otherlv_21= ']' )? otherlv_22= 'winConditions' otherlv_23= '[' ( (lv_winConditions_24_0= ruleWinCondition ) ) (otherlv_25= ',' ( (lv_winConditions_26_0= ruleWinCondition ) ) )* otherlv_27= ']' otherlv_28= 'pieceTypes' otherlv_29= '[' ( (lv_piecetypes_30_0= rulePieceType ) ) (otherlv_31= ',' ( (lv_piecetypes_32_0= rulePieceType ) ) )* otherlv_33= ']' )
            {
            // InternalBoardGameDL.g:78:2: (otherlv_0= 'Title' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'BoardSize' ( (lv_size_3_0= ruleEInt ) ) otherlv_4= 'validMoves' otherlv_5= '[' ( (lv_validmoves_6_0= ruleValidMove ) ) (otherlv_7= ',' ( (lv_validmoves_8_0= ruleValidMove ) ) )* otherlv_9= ']' (otherlv_10= 'cellStates' otherlv_11= '[' ( (lv_cellstates_12_0= ruleCellState ) ) (otherlv_13= ',' ( (lv_cellstates_14_0= ruleCellState ) ) )* otherlv_15= ']' )? (otherlv_16= 'effectsOnCell' otherlv_17= '[' ( (lv_effectsoncell_18_0= ruleEffectOnCell ) ) (otherlv_19= ',' ( (lv_effectsoncell_20_0= ruleEffectOnCell ) ) )* otherlv_21= ']' )? otherlv_22= 'winConditions' otherlv_23= '[' ( (lv_winConditions_24_0= ruleWinCondition ) ) (otherlv_25= ',' ( (lv_winConditions_26_0= ruleWinCondition ) ) )* otherlv_27= ']' otherlv_28= 'pieceTypes' otherlv_29= '[' ( (lv_piecetypes_30_0= rulePieceType ) ) (otherlv_31= ',' ( (lv_piecetypes_32_0= rulePieceType ) ) )* otherlv_33= ']' )
            // InternalBoardGameDL.g:79:3: otherlv_0= 'Title' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'BoardSize' ( (lv_size_3_0= ruleEInt ) ) otherlv_4= 'validMoves' otherlv_5= '[' ( (lv_validmoves_6_0= ruleValidMove ) ) (otherlv_7= ',' ( (lv_validmoves_8_0= ruleValidMove ) ) )* otherlv_9= ']' (otherlv_10= 'cellStates' otherlv_11= '[' ( (lv_cellstates_12_0= ruleCellState ) ) (otherlv_13= ',' ( (lv_cellstates_14_0= ruleCellState ) ) )* otherlv_15= ']' )? (otherlv_16= 'effectsOnCell' otherlv_17= '[' ( (lv_effectsoncell_18_0= ruleEffectOnCell ) ) (otherlv_19= ',' ( (lv_effectsoncell_20_0= ruleEffectOnCell ) ) )* otherlv_21= ']' )? otherlv_22= 'winConditions' otherlv_23= '[' ( (lv_winConditions_24_0= ruleWinCondition ) ) (otherlv_25= ',' ( (lv_winConditions_26_0= ruleWinCondition ) ) )* otherlv_27= ']' otherlv_28= 'pieceTypes' otherlv_29= '[' ( (lv_piecetypes_30_0= rulePieceType ) ) (otherlv_31= ',' ( (lv_piecetypes_32_0= rulePieceType ) ) )* otherlv_33= ']'
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

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getBoardGameAccess().getValidMovesKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getBoardGameAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalBoardGameDL.g:133:3: ( (lv_validmoves_6_0= ruleValidMove ) )
            // InternalBoardGameDL.g:134:4: (lv_validmoves_6_0= ruleValidMove )
            {
            // InternalBoardGameDL.g:134:4: (lv_validmoves_6_0= ruleValidMove )
            // InternalBoardGameDL.g:135:5: lv_validmoves_6_0= ruleValidMove
            {

            					newCompositeNode(grammarAccess.getBoardGameAccess().getValidmovesValidMoveParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_validmoves_6_0=ruleValidMove();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoardGameRule());
            					}
            					add(
            						current,
            						"validmoves",
            						lv_validmoves_6_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.ValidMove");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBoardGameDL.g:152:3: (otherlv_7= ',' ( (lv_validmoves_8_0= ruleValidMove ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBoardGameDL.g:153:4: otherlv_7= ',' ( (lv_validmoves_8_0= ruleValidMove ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_8); 

            	    				newLeafNode(otherlv_7, grammarAccess.getBoardGameAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalBoardGameDL.g:157:4: ( (lv_validmoves_8_0= ruleValidMove ) )
            	    // InternalBoardGameDL.g:158:5: (lv_validmoves_8_0= ruleValidMove )
            	    {
            	    // InternalBoardGameDL.g:158:5: (lv_validmoves_8_0= ruleValidMove )
            	    // InternalBoardGameDL.g:159:6: lv_validmoves_8_0= ruleValidMove
            	    {

            	    						newCompositeNode(grammarAccess.getBoardGameAccess().getValidmovesValidMoveParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_validmoves_8_0=ruleValidMove();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBoardGameRule());
            	    						}
            	    						add(
            	    							current,
            	    							"validmoves",
            	    							lv_validmoves_8_0,
            	    							"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.ValidMove");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getBoardGameAccess().getRightSquareBracketKeyword_8());
            		
            // InternalBoardGameDL.g:181:3: (otherlv_10= 'cellStates' otherlv_11= '[' ( (lv_cellstates_12_0= ruleCellState ) ) (otherlv_13= ',' ( (lv_cellstates_14_0= ruleCellState ) ) )* otherlv_15= ']' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalBoardGameDL.g:182:4: otherlv_10= 'cellStates' otherlv_11= '[' ( (lv_cellstates_12_0= ruleCellState ) ) (otherlv_13= ',' ( (lv_cellstates_14_0= ruleCellState ) ) )* otherlv_15= ']'
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getBoardGameAccess().getCellStatesKeyword_9_0());
                    			
                    otherlv_11=(Token)match(input,14,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getBoardGameAccess().getLeftSquareBracketKeyword_9_1());
                    			
                    // InternalBoardGameDL.g:190:4: ( (lv_cellstates_12_0= ruleCellState ) )
                    // InternalBoardGameDL.g:191:5: (lv_cellstates_12_0= ruleCellState )
                    {
                    // InternalBoardGameDL.g:191:5: (lv_cellstates_12_0= ruleCellState )
                    // InternalBoardGameDL.g:192:6: lv_cellstates_12_0= ruleCellState
                    {

                    						newCompositeNode(grammarAccess.getBoardGameAccess().getCellstatesCellStateParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_cellstates_12_0=ruleCellState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoardGameRule());
                    						}
                    						add(
                    							current,
                    							"cellstates",
                    							lv_cellstates_12_0,
                    							"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.CellState");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBoardGameDL.g:209:4: (otherlv_13= ',' ( (lv_cellstates_14_0= ruleCellState ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalBoardGameDL.g:210:5: otherlv_13= ',' ( (lv_cellstates_14_0= ruleCellState ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_11); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getBoardGameAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalBoardGameDL.g:214:5: ( (lv_cellstates_14_0= ruleCellState ) )
                    	    // InternalBoardGameDL.g:215:6: (lv_cellstates_14_0= ruleCellState )
                    	    {
                    	    // InternalBoardGameDL.g:215:6: (lv_cellstates_14_0= ruleCellState )
                    	    // InternalBoardGameDL.g:216:7: lv_cellstates_14_0= ruleCellState
                    	    {

                    	    							newCompositeNode(grammarAccess.getBoardGameAccess().getCellstatesCellStateParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_cellstates_14_0=ruleCellState();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBoardGameRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"cellstates",
                    	    								lv_cellstates_14_0,
                    	    								"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.CellState");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_15, grammarAccess.getBoardGameAccess().getRightSquareBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalBoardGameDL.g:239:3: (otherlv_16= 'effectsOnCell' otherlv_17= '[' ( (lv_effectsoncell_18_0= ruleEffectOnCell ) ) (otherlv_19= ',' ( (lv_effectsoncell_20_0= ruleEffectOnCell ) ) )* otherlv_21= ']' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBoardGameDL.g:240:4: otherlv_16= 'effectsOnCell' otherlv_17= '[' ( (lv_effectsoncell_18_0= ruleEffectOnCell ) ) (otherlv_19= ',' ( (lv_effectsoncell_20_0= ruleEffectOnCell ) ) )* otherlv_21= ']'
                    {
                    otherlv_16=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_16, grammarAccess.getBoardGameAccess().getEffectsOnCellKeyword_10_0());
                    			
                    otherlv_17=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_17, grammarAccess.getBoardGameAccess().getLeftSquareBracketKeyword_10_1());
                    			
                    // InternalBoardGameDL.g:248:4: ( (lv_effectsoncell_18_0= ruleEffectOnCell ) )
                    // InternalBoardGameDL.g:249:5: (lv_effectsoncell_18_0= ruleEffectOnCell )
                    {
                    // InternalBoardGameDL.g:249:5: (lv_effectsoncell_18_0= ruleEffectOnCell )
                    // InternalBoardGameDL.g:250:6: lv_effectsoncell_18_0= ruleEffectOnCell
                    {

                    						newCompositeNode(grammarAccess.getBoardGameAccess().getEffectsoncellEffectOnCellParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_effectsoncell_18_0=ruleEffectOnCell();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoardGameRule());
                    						}
                    						add(
                    							current,
                    							"effectsoncell",
                    							lv_effectsoncell_18_0,
                    							"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.EffectOnCell");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBoardGameDL.g:267:4: (otherlv_19= ',' ( (lv_effectsoncell_20_0= ruleEffectOnCell ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalBoardGameDL.g:268:5: otherlv_19= ',' ( (lv_effectsoncell_20_0= ruleEffectOnCell ) )
                    	    {
                    	    otherlv_19=(Token)match(input,15,FOLLOW_8); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getBoardGameAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalBoardGameDL.g:272:5: ( (lv_effectsoncell_20_0= ruleEffectOnCell ) )
                    	    // InternalBoardGameDL.g:273:6: (lv_effectsoncell_20_0= ruleEffectOnCell )
                    	    {
                    	    // InternalBoardGameDL.g:273:6: (lv_effectsoncell_20_0= ruleEffectOnCell )
                    	    // InternalBoardGameDL.g:274:7: lv_effectsoncell_20_0= ruleEffectOnCell
                    	    {

                    	    							newCompositeNode(grammarAccess.getBoardGameAccess().getEffectsoncellEffectOnCellParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_effectsoncell_20_0=ruleEffectOnCell();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBoardGameRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"effectsoncell",
                    	    								lv_effectsoncell_20_0,
                    	    								"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.EffectOnCell");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_21, grammarAccess.getBoardGameAccess().getRightSquareBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_22, grammarAccess.getBoardGameAccess().getWinConditionsKeyword_11());
            		
            otherlv_23=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_23, grammarAccess.getBoardGameAccess().getLeftSquareBracketKeyword_12());
            		
            // InternalBoardGameDL.g:305:3: ( (lv_winConditions_24_0= ruleWinCondition ) )
            // InternalBoardGameDL.g:306:4: (lv_winConditions_24_0= ruleWinCondition )
            {
            // InternalBoardGameDL.g:306:4: (lv_winConditions_24_0= ruleWinCondition )
            // InternalBoardGameDL.g:307:5: lv_winConditions_24_0= ruleWinCondition
            {

            					newCompositeNode(grammarAccess.getBoardGameAccess().getWinConditionsWinConditionParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_9);
            lv_winConditions_24_0=ruleWinCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoardGameRule());
            					}
            					add(
            						current,
            						"winConditions",
            						lv_winConditions_24_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.WinCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBoardGameDL.g:324:3: (otherlv_25= ',' ( (lv_winConditions_26_0= ruleWinCondition ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBoardGameDL.g:325:4: otherlv_25= ',' ( (lv_winConditions_26_0= ruleWinCondition ) )
            	    {
            	    otherlv_25=(Token)match(input,15,FOLLOW_14); 

            	    				newLeafNode(otherlv_25, grammarAccess.getBoardGameAccess().getCommaKeyword_14_0());
            	    			
            	    // InternalBoardGameDL.g:329:4: ( (lv_winConditions_26_0= ruleWinCondition ) )
            	    // InternalBoardGameDL.g:330:5: (lv_winConditions_26_0= ruleWinCondition )
            	    {
            	    // InternalBoardGameDL.g:330:5: (lv_winConditions_26_0= ruleWinCondition )
            	    // InternalBoardGameDL.g:331:6: lv_winConditions_26_0= ruleWinCondition
            	    {

            	    						newCompositeNode(grammarAccess.getBoardGameAccess().getWinConditionsWinConditionParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_winConditions_26_0=ruleWinCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBoardGameRule());
            	    						}
            	    						add(
            	    							current,
            	    							"winConditions",
            	    							lv_winConditions_26_0,
            	    							"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.WinCondition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_27=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_27, grammarAccess.getBoardGameAccess().getRightSquareBracketKeyword_15());
            		
            otherlv_28=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_28, grammarAccess.getBoardGameAccess().getPieceTypesKeyword_16());
            		
            otherlv_29=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_29, grammarAccess.getBoardGameAccess().getLeftSquareBracketKeyword_17());
            		
            // InternalBoardGameDL.g:361:3: ( (lv_piecetypes_30_0= rulePieceType ) )
            // InternalBoardGameDL.g:362:4: (lv_piecetypes_30_0= rulePieceType )
            {
            // InternalBoardGameDL.g:362:4: (lv_piecetypes_30_0= rulePieceType )
            // InternalBoardGameDL.g:363:5: lv_piecetypes_30_0= rulePieceType
            {

            					newCompositeNode(grammarAccess.getBoardGameAccess().getPiecetypesPieceTypeParserRuleCall_18_0());
            				
            pushFollow(FOLLOW_9);
            lv_piecetypes_30_0=rulePieceType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoardGameRule());
            					}
            					add(
            						current,
            						"piecetypes",
            						lv_piecetypes_30_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.PieceType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBoardGameDL.g:380:3: (otherlv_31= ',' ( (lv_piecetypes_32_0= rulePieceType ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBoardGameDL.g:381:4: otherlv_31= ',' ( (lv_piecetypes_32_0= rulePieceType ) )
            	    {
            	    otherlv_31=(Token)match(input,15,FOLLOW_8); 

            	    				newLeafNode(otherlv_31, grammarAccess.getBoardGameAccess().getCommaKeyword_19_0());
            	    			
            	    // InternalBoardGameDL.g:385:4: ( (lv_piecetypes_32_0= rulePieceType ) )
            	    // InternalBoardGameDL.g:386:5: (lv_piecetypes_32_0= rulePieceType )
            	    {
            	    // InternalBoardGameDL.g:386:5: (lv_piecetypes_32_0= rulePieceType )
            	    // InternalBoardGameDL.g:387:6: lv_piecetypes_32_0= rulePieceType
            	    {

            	    						newCompositeNode(grammarAccess.getBoardGameAccess().getPiecetypesPieceTypeParserRuleCall_19_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_piecetypes_32_0=rulePieceType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBoardGameRule());
            	    						}
            	    						add(
            	    							current,
            	    							"piecetypes",
            	    							lv_piecetypes_32_0,
            	    							"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.PieceType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_33=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_33, grammarAccess.getBoardGameAccess().getRightSquareBracketKeyword_20());
            		

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


    // $ANTLR start "entryRulePieceType"
    // InternalBoardGameDL.g:413:1: entryRulePieceType returns [EObject current=null] : iv_rulePieceType= rulePieceType EOF ;
    public final EObject entryRulePieceType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePieceType = null;


        try {
            // InternalBoardGameDL.g:413:50: (iv_rulePieceType= rulePieceType EOF )
            // InternalBoardGameDL.g:414:2: iv_rulePieceType= rulePieceType EOF
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
    // InternalBoardGameDL.g:420:1: rulePieceType returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'PieceType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' otherlv_4= 'Symbol' ( (lv_symbol_5_0= ruleEString ) ) otherlv_6= 'ValidMoves' otherlv_7= '[' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ']' (otherlv_12= 'EffectsOnCell' otherlv_13= '[' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ']' )? otherlv_18= ')' otherlv_19= '}' ) ;
    public final EObject rulePieceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_symbol_5_0 = null;



        	enterRule();

        try {
            // InternalBoardGameDL.g:426:2: ( (otherlv_0= '{' otherlv_1= 'PieceType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' otherlv_4= 'Symbol' ( (lv_symbol_5_0= ruleEString ) ) otherlv_6= 'ValidMoves' otherlv_7= '[' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ']' (otherlv_12= 'EffectsOnCell' otherlv_13= '[' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ']' )? otherlv_18= ')' otherlv_19= '}' ) )
            // InternalBoardGameDL.g:427:2: (otherlv_0= '{' otherlv_1= 'PieceType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' otherlv_4= 'Symbol' ( (lv_symbol_5_0= ruleEString ) ) otherlv_6= 'ValidMoves' otherlv_7= '[' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ']' (otherlv_12= 'EffectsOnCell' otherlv_13= '[' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ']' )? otherlv_18= ')' otherlv_19= '}' )
            {
            // InternalBoardGameDL.g:427:2: (otherlv_0= '{' otherlv_1= 'PieceType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' otherlv_4= 'Symbol' ( (lv_symbol_5_0= ruleEString ) ) otherlv_6= 'ValidMoves' otherlv_7= '[' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ']' (otherlv_12= 'EffectsOnCell' otherlv_13= '[' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ']' )? otherlv_18= ')' otherlv_19= '}' )
            // InternalBoardGameDL.g:428:3: otherlv_0= '{' otherlv_1= 'PieceType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' otherlv_4= 'Symbol' ( (lv_symbol_5_0= ruleEString ) ) otherlv_6= 'ValidMoves' otherlv_7= '[' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ']' (otherlv_12= 'EffectsOnCell' otherlv_13= '[' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ']' )? otherlv_18= ')' otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getPieceTypeAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPieceTypeAccess().getPieceTypeKeyword_1());
            		
            // InternalBoardGameDL.g:436:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBoardGameDL.g:437:4: (lv_name_2_0= ruleEString )
            {
            // InternalBoardGameDL.g:437:4: (lv_name_2_0= ruleEString )
            // InternalBoardGameDL.g:438:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPieceTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPieceTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getPieceTypeAccess().getLeftParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getPieceTypeAccess().getSymbolKeyword_4());
            		
            // InternalBoardGameDL.g:463:3: ( (lv_symbol_5_0= ruleEString ) )
            // InternalBoardGameDL.g:464:4: (lv_symbol_5_0= ruleEString )
            {
            // InternalBoardGameDL.g:464:4: (lv_symbol_5_0= ruleEString )
            // InternalBoardGameDL.g:465:5: lv_symbol_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPieceTypeAccess().getSymbolEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_19);
            lv_symbol_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPieceTypeRule());
            					}
            					set(
            						current,
            						"symbol",
            						lv_symbol_5_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getPieceTypeAccess().getValidMovesKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getPieceTypeAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalBoardGameDL.g:490:3: ( ( ruleEString ) )
            // InternalBoardGameDL.g:491:4: ( ruleEString )
            {
            // InternalBoardGameDL.g:491:4: ( ruleEString )
            // InternalBoardGameDL.g:492:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPieceTypeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPieceTypeAccess().getValidmovesValidMoveCrossReference_8_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBoardGameDL.g:506:3: (otherlv_9= ',' ( ( ruleEString ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBoardGameDL.g:507:4: otherlv_9= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_9, grammarAccess.getPieceTypeAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalBoardGameDL.g:511:4: ( ( ruleEString ) )
            	    // InternalBoardGameDL.g:512:5: ( ruleEString )
            	    {
            	    // InternalBoardGameDL.g:512:5: ( ruleEString )
            	    // InternalBoardGameDL.g:513:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPieceTypeRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getPieceTypeAccess().getValidmovesValidMoveCrossReference_9_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
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

            otherlv_11=(Token)match(input,16,FOLLOW_20); 

            			newLeafNode(otherlv_11, grammarAccess.getPieceTypeAccess().getRightSquareBracketKeyword_10());
            		
            // InternalBoardGameDL.g:532:3: (otherlv_12= 'EffectsOnCell' otherlv_13= '[' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ']' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBoardGameDL.g:533:4: otherlv_12= 'EffectsOnCell' otherlv_13= '[' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ']'
                    {
                    otherlv_12=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getPieceTypeAccess().getEffectsOnCellKeyword_11_0());
                    			
                    otherlv_13=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getPieceTypeAccess().getLeftSquareBracketKeyword_11_1());
                    			
                    // InternalBoardGameDL.g:541:4: ( ( ruleEString ) )
                    // InternalBoardGameDL.g:542:5: ( ruleEString )
                    {
                    // InternalBoardGameDL.g:542:5: ( ruleEString )
                    // InternalBoardGameDL.g:543:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPieceTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPieceTypeAccess().getEffectsoncellEffectOnCellCrossReference_11_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBoardGameDL.g:557:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==15) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalBoardGameDL.g:558:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getPieceTypeAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalBoardGameDL.g:562:5: ( ( ruleEString ) )
                    	    // InternalBoardGameDL.g:563:6: ( ruleEString )
                    	    {
                    	    // InternalBoardGameDL.g:563:6: ( ruleEString )
                    	    // InternalBoardGameDL.g:564:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPieceTypeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getPieceTypeAccess().getEffectsoncellEffectOnCellCrossReference_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
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

                    otherlv_17=(Token)match(input,16,FOLLOW_21); 

                    				newLeafNode(otherlv_17, grammarAccess.getPieceTypeAccess().getRightSquareBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,27,FOLLOW_22); 

            			newLeafNode(otherlv_18, grammarAccess.getPieceTypeAccess().getRightParenthesisKeyword_12());
            		
            otherlv_19=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getPieceTypeAccess().getRightCurlyBracketKeyword_13());
            		

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
    // InternalBoardGameDL.g:596:1: entryRuleCellState returns [EObject current=null] : iv_ruleCellState= ruleCellState EOF ;
    public final EObject entryRuleCellState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellState = null;


        try {
            // InternalBoardGameDL.g:596:50: (iv_ruleCellState= ruleCellState EOF )
            // InternalBoardGameDL.g:597:2: iv_ruleCellState= ruleCellState EOF
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
    // InternalBoardGameDL.g:603:1: ruleCellState returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleCellState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBoardGameDL.g:609:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBoardGameDL.g:610:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBoardGameDL.g:610:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBoardGameDL.g:611:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBoardGameDL.g:611:3: (lv_name_0_0= RULE_ID )
            // InternalBoardGameDL.g:612:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getCellStateAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCellStateRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // InternalBoardGameDL.g:631:1: entryRuleWinCondition returns [EObject current=null] : iv_ruleWinCondition= ruleWinCondition EOF ;
    public final EObject entryRuleWinCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWinCondition = null;


        try {
            // InternalBoardGameDL.g:631:53: (iv_ruleWinCondition= ruleWinCondition EOF )
            // InternalBoardGameDL.g:632:2: iv_ruleWinCondition= ruleWinCondition EOF
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
    // InternalBoardGameDL.g:638:1: ruleWinCondition returns [EObject current=null] : (otherlv_0= 'InARow' ( (lv_inarow_1_0= ruleInARow ) ) ) ;
    public final EObject ruleWinCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_inarow_1_0 = null;



        	enterRule();

        try {
            // InternalBoardGameDL.g:644:2: ( (otherlv_0= 'InARow' ( (lv_inarow_1_0= ruleInARow ) ) ) )
            // InternalBoardGameDL.g:645:2: (otherlv_0= 'InARow' ( (lv_inarow_1_0= ruleInARow ) ) )
            {
            // InternalBoardGameDL.g:645:2: (otherlv_0= 'InARow' ( (lv_inarow_1_0= ruleInARow ) ) )
            // InternalBoardGameDL.g:646:3: otherlv_0= 'InARow' ( (lv_inarow_1_0= ruleInARow ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getWinConditionAccess().getInARowKeyword_0());
            		
            // InternalBoardGameDL.g:650:3: ( (lv_inarow_1_0= ruleInARow ) )
            // InternalBoardGameDL.g:651:4: (lv_inarow_1_0= ruleInARow )
            {
            // InternalBoardGameDL.g:651:4: (lv_inarow_1_0= ruleInARow )
            // InternalBoardGameDL.g:652:5: lv_inarow_1_0= ruleInARow
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
    // InternalBoardGameDL.g:673:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalBoardGameDL.g:673:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalBoardGameDL.g:674:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalBoardGameDL.g:680:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalBoardGameDL.g:686:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalBoardGameDL.g:687:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalBoardGameDL.g:687:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalBoardGameDL.g:688:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalBoardGameDL.g:688:3: (kw= '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBoardGameDL.g:689:4: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_24); 

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
    // InternalBoardGameDL.g:706:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBoardGameDL.g:706:47: (iv_ruleEString= ruleEString EOF )
            // InternalBoardGameDL.g:707:2: iv_ruleEString= ruleEString EOF
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
    // InternalBoardGameDL.g:713:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBoardGameDL.g:719:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBoardGameDL.g:720:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBoardGameDL.g:720:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalBoardGameDL.g:721:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBoardGameDL.g:729:3: this_ID_1= RULE_ID
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
    // InternalBoardGameDL.g:740:1: entryRuleValidMove returns [EObject current=null] : iv_ruleValidMove= ruleValidMove EOF ;
    public final EObject entryRuleValidMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidMove = null;


        try {
            // InternalBoardGameDL.g:740:50: (iv_ruleValidMove= ruleValidMove EOF )
            // InternalBoardGameDL.g:741:2: iv_ruleValidMove= ruleValidMove EOF
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
    // InternalBoardGameDL.g:747:1: ruleValidMove returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'ValidMove' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_placeAnywhere_4_0= 'placeAnywhere' ) ) (otherlv_5= 'when' ( (lv_conditions_6_0= ruleCondition ) ) (otherlv_7= 'and' ( (lv_conditions_8_0= ruleCondition ) ) )* )? otherlv_9= ')' otherlv_10= '}' ) ;
    public final EObject ruleValidMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_placeAnywhere_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_conditions_6_0 = null;

        EObject lv_conditions_8_0 = null;



        	enterRule();

        try {
            // InternalBoardGameDL.g:753:2: ( (otherlv_0= '{' otherlv_1= 'ValidMove' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_placeAnywhere_4_0= 'placeAnywhere' ) ) (otherlv_5= 'when' ( (lv_conditions_6_0= ruleCondition ) ) (otherlv_7= 'and' ( (lv_conditions_8_0= ruleCondition ) ) )* )? otherlv_9= ')' otherlv_10= '}' ) )
            // InternalBoardGameDL.g:754:2: (otherlv_0= '{' otherlv_1= 'ValidMove' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_placeAnywhere_4_0= 'placeAnywhere' ) ) (otherlv_5= 'when' ( (lv_conditions_6_0= ruleCondition ) ) (otherlv_7= 'and' ( (lv_conditions_8_0= ruleCondition ) ) )* )? otherlv_9= ')' otherlv_10= '}' )
            {
            // InternalBoardGameDL.g:754:2: (otherlv_0= '{' otherlv_1= 'ValidMove' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_placeAnywhere_4_0= 'placeAnywhere' ) ) (otherlv_5= 'when' ( (lv_conditions_6_0= ruleCondition ) ) (otherlv_7= 'and' ( (lv_conditions_8_0= ruleCondition ) ) )* )? otherlv_9= ')' otherlv_10= '}' )
            // InternalBoardGameDL.g:755:3: otherlv_0= '{' otherlv_1= 'ValidMove' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_placeAnywhere_4_0= 'placeAnywhere' ) ) (otherlv_5= 'when' ( (lv_conditions_6_0= ruleCondition ) ) (otherlv_7= 'and' ( (lv_conditions_8_0= ruleCondition ) ) )* )? otherlv_9= ')' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getValidMoveAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getValidMoveAccess().getValidMoveKeyword_1());
            		
            // InternalBoardGameDL.g:763:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBoardGameDL.g:764:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBoardGameDL.g:764:4: (lv_name_2_0= RULE_ID )
            // InternalBoardGameDL.g:765:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_2_0, grammarAccess.getValidMoveAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValidMoveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getValidMoveAccess().getLeftParenthesisKeyword_3());
            		
            // InternalBoardGameDL.g:785:3: ( (lv_placeAnywhere_4_0= 'placeAnywhere' ) )
            // InternalBoardGameDL.g:786:4: (lv_placeAnywhere_4_0= 'placeAnywhere' )
            {
            // InternalBoardGameDL.g:786:4: (lv_placeAnywhere_4_0= 'placeAnywhere' )
            // InternalBoardGameDL.g:787:5: lv_placeAnywhere_4_0= 'placeAnywhere'
            {
            lv_placeAnywhere_4_0=(Token)match(input,32,FOLLOW_27); 

            					newLeafNode(lv_placeAnywhere_4_0, grammarAccess.getValidMoveAccess().getPlaceAnywherePlaceAnywhereKeyword_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValidMoveRule());
            					}
            					setWithLastConsumed(current, "placeAnywhere", lv_placeAnywhere_4_0 != null, "placeAnywhere");
            				

            }


            }

            // InternalBoardGameDL.g:799:3: (otherlv_5= 'when' ( (lv_conditions_6_0= ruleCondition ) ) (otherlv_7= 'and' ( (lv_conditions_8_0= ruleCondition ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBoardGameDL.g:800:4: otherlv_5= 'when' ( (lv_conditions_6_0= ruleCondition ) ) (otherlv_7= 'and' ( (lv_conditions_8_0= ruleCondition ) ) )*
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_28); 

                    				newLeafNode(otherlv_5, grammarAccess.getValidMoveAccess().getWhenKeyword_5_0());
                    			
                    // InternalBoardGameDL.g:804:4: ( (lv_conditions_6_0= ruleCondition ) )
                    // InternalBoardGameDL.g:805:5: (lv_conditions_6_0= ruleCondition )
                    {
                    // InternalBoardGameDL.g:805:5: (lv_conditions_6_0= ruleCondition )
                    // InternalBoardGameDL.g:806:6: lv_conditions_6_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getValidMoveAccess().getConditionsConditionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_conditions_6_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValidMoveRule());
                    						}
                    						add(
                    							current,
                    							"conditions",
                    							lv_conditions_6_0,
                    							"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBoardGameDL.g:823:4: (otherlv_7= 'and' ( (lv_conditions_8_0= ruleCondition ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==34) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalBoardGameDL.g:824:5: otherlv_7= 'and' ( (lv_conditions_8_0= ruleCondition ) )
                    	    {
                    	    otherlv_7=(Token)match(input,34,FOLLOW_28); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getValidMoveAccess().getAndKeyword_5_2_0());
                    	    				
                    	    // InternalBoardGameDL.g:828:5: ( (lv_conditions_8_0= ruleCondition ) )
                    	    // InternalBoardGameDL.g:829:6: (lv_conditions_8_0= ruleCondition )
                    	    {
                    	    // InternalBoardGameDL.g:829:6: (lv_conditions_8_0= ruleCondition )
                    	    // InternalBoardGameDL.g:830:7: lv_conditions_8_0= ruleCondition
                    	    {

                    	    							newCompositeNode(grammarAccess.getValidMoveAccess().getConditionsConditionParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
                    	    lv_conditions_8_0=ruleCondition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getValidMoveRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"conditions",
                    	    								lv_conditions_8_0,
                    	    								"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.Condition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,27,FOLLOW_22); 

            			newLeafNode(otherlv_9, grammarAccess.getValidMoveAccess().getRightParenthesisKeyword_6());
            		
            otherlv_10=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getValidMoveAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalBoardGameDL.g:861:1: entryRuleEffectOnCell returns [EObject current=null] : iv_ruleEffectOnCell= ruleEffectOnCell EOF ;
    public final EObject entryRuleEffectOnCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectOnCell = null;


        try {
            // InternalBoardGameDL.g:861:53: (iv_ruleEffectOnCell= ruleEffectOnCell EOF )
            // InternalBoardGameDL.g:862:2: iv_ruleEffectOnCell= ruleEffectOnCell EOF
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
    // InternalBoardGameDL.g:868:1: ruleEffectOnCell returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'EffectOnCell' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' otherlv_10= 'newCellState' otherlv_11= '(' ( ( ruleEString ) ) otherlv_13= ')' otherlv_14= ')' otherlv_15= '}' ) ;
    public final EObject ruleEffectOnCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_x_6_0 = null;

        AntlrDatatypeRuleToken lv_y_8_0 = null;



        	enterRule();

        try {
            // InternalBoardGameDL.g:874:2: ( (otherlv_0= '{' otherlv_1= 'EffectOnCell' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' otherlv_10= 'newCellState' otherlv_11= '(' ( ( ruleEString ) ) otherlv_13= ')' otherlv_14= ')' otherlv_15= '}' ) )
            // InternalBoardGameDL.g:875:2: (otherlv_0= '{' otherlv_1= 'EffectOnCell' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' otherlv_10= 'newCellState' otherlv_11= '(' ( ( ruleEString ) ) otherlv_13= ')' otherlv_14= ')' otherlv_15= '}' )
            {
            // InternalBoardGameDL.g:875:2: (otherlv_0= '{' otherlv_1= 'EffectOnCell' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' otherlv_10= 'newCellState' otherlv_11= '(' ( ( ruleEString ) ) otherlv_13= ')' otherlv_14= ')' otherlv_15= '}' )
            // InternalBoardGameDL.g:876:3: otherlv_0= '{' otherlv_1= 'EffectOnCell' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' otherlv_4= 'relativePosition' otherlv_5= '(' ( (lv_x_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_y_8_0= ruleEInt ) ) otherlv_9= ')' otherlv_10= 'newCellState' otherlv_11= '(' ( ( ruleEString ) ) otherlv_13= ')' otherlv_14= ')' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectOnCellAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectOnCellAccess().getEffectOnCellKeyword_1());
            		
            // InternalBoardGameDL.g:884:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBoardGameDL.g:885:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBoardGameDL.g:885:4: (lv_name_2_0= RULE_ID )
            // InternalBoardGameDL.g:886:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEffectOnCellAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEffectOnCellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getEffectOnCellAccess().getLeftParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,36,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getEffectOnCellAccess().getRelativePositionKeyword_4());
            		
            otherlv_5=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getEffectOnCellAccess().getLeftParenthesisKeyword_5());
            		
            // InternalBoardGameDL.g:914:3: ( (lv_x_6_0= ruleEInt ) )
            // InternalBoardGameDL.g:915:4: (lv_x_6_0= ruleEInt )
            {
            // InternalBoardGameDL.g:915:4: (lv_x_6_0= ruleEInt )
            // InternalBoardGameDL.g:916:5: lv_x_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getEffectOnCellAccess().getXEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_32);
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

            otherlv_7=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getEffectOnCellAccess().getCommaKeyword_7());
            		
            // InternalBoardGameDL.g:937:3: ( (lv_y_8_0= ruleEInt ) )
            // InternalBoardGameDL.g:938:4: (lv_y_8_0= ruleEInt )
            {
            // InternalBoardGameDL.g:938:4: (lv_y_8_0= ruleEInt )
            // InternalBoardGameDL.g:939:5: lv_y_8_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getEffectOnCellAccess().getYEIntParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_9=(Token)match(input,27,FOLLOW_33); 

            			newLeafNode(otherlv_9, grammarAccess.getEffectOnCellAccess().getRightParenthesisKeyword_9());
            		
            otherlv_10=(Token)match(input,37,FOLLOW_17); 

            			newLeafNode(otherlv_10, grammarAccess.getEffectOnCellAccess().getNewCellStateKeyword_10());
            		
            otherlv_11=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getEffectOnCellAccess().getLeftParenthesisKeyword_11());
            		
            // InternalBoardGameDL.g:968:3: ( ( ruleEString ) )
            // InternalBoardGameDL.g:969:4: ( ruleEString )
            {
            // InternalBoardGameDL.g:969:4: ( ruleEString )
            // InternalBoardGameDL.g:970:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEffectOnCellRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEffectOnCellAccess().getCellstateCellStateCrossReference_12_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,27,FOLLOW_21); 

            			newLeafNode(otherlv_13, grammarAccess.getEffectOnCellAccess().getRightParenthesisKeyword_13());
            		
            otherlv_14=(Token)match(input,27,FOLLOW_22); 

            			newLeafNode(otherlv_14, grammarAccess.getEffectOnCellAccess().getRightParenthesisKeyword_14());
            		
            otherlv_15=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getEffectOnCellAccess().getRightCurlyBracketKeyword_15());
            		

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
    // InternalBoardGameDL.g:1000:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalBoardGameDL.g:1000:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalBoardGameDL.g:1001:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalBoardGameDL.g:1007:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'Condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'applies' otherlv_3= 'when' ( ( ruleEString ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalBoardGameDL.g:1013:2: ( (otherlv_0= 'Condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'applies' otherlv_3= 'when' ( ( ruleEString ) ) ) )
            // InternalBoardGameDL.g:1014:2: (otherlv_0= 'Condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'applies' otherlv_3= 'when' ( ( ruleEString ) ) )
            {
            // InternalBoardGameDL.g:1014:2: (otherlv_0= 'Condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'applies' otherlv_3= 'when' ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:1015:3: otherlv_0= 'Condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'applies' otherlv_3= 'when' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getConditionKeyword_0());
            		
            // InternalBoardGameDL.g:1019:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBoardGameDL.g:1020:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBoardGameDL.g:1020:4: (lv_name_1_0= RULE_ID )
            // InternalBoardGameDL.g:1021:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

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

            otherlv_2=(Token)match(input,39,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getAppliesKeyword_2());
            		
            otherlv_3=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getWhenKeyword_3());
            		
            // InternalBoardGameDL.g:1045:3: ( ( ruleEString ) )
            // InternalBoardGameDL.g:1046:4: ( ruleEString )
            {
            // InternalBoardGameDL.g:1046:4: ( ruleEString )
            // InternalBoardGameDL.g:1047:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConditionAccess().getCellstateCellStateCrossReference_4_0());
            				
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
    // InternalBoardGameDL.g:1065:1: entryRuleInARow returns [EObject current=null] : iv_ruleInARow= ruleInARow EOF ;
    public final EObject entryRuleInARow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInARow = null;


        try {
            // InternalBoardGameDL.g:1065:47: (iv_ruleInARow= ruleInARow EOF )
            // InternalBoardGameDL.g:1066:2: iv_ruleInARow= ruleInARow EOF
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
    // InternalBoardGameDL.g:1072:1: ruleInARow returns [EObject current=null] : (otherlv_0= 'count' ( (lv_count_1_0= ruleEInt ) ) ( (lv_horizontal_2_0= 'horizontal' ) ) ( (lv_vertical_3_0= 'vertical' ) ) ( (lv_diagonal_4_0= 'diagonal' ) ) ) ;
    public final EObject ruleInARow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_horizontal_2_0=null;
        Token lv_vertical_3_0=null;
        Token lv_diagonal_4_0=null;
        AntlrDatatypeRuleToken lv_count_1_0 = null;



        	enterRule();

        try {
            // InternalBoardGameDL.g:1078:2: ( (otherlv_0= 'count' ( (lv_count_1_0= ruleEInt ) ) ( (lv_horizontal_2_0= 'horizontal' ) ) ( (lv_vertical_3_0= 'vertical' ) ) ( (lv_diagonal_4_0= 'diagonal' ) ) ) )
            // InternalBoardGameDL.g:1079:2: (otherlv_0= 'count' ( (lv_count_1_0= ruleEInt ) ) ( (lv_horizontal_2_0= 'horizontal' ) ) ( (lv_vertical_3_0= 'vertical' ) ) ( (lv_diagonal_4_0= 'diagonal' ) ) )
            {
            // InternalBoardGameDL.g:1079:2: (otherlv_0= 'count' ( (lv_count_1_0= ruleEInt ) ) ( (lv_horizontal_2_0= 'horizontal' ) ) ( (lv_vertical_3_0= 'vertical' ) ) ( (lv_diagonal_4_0= 'diagonal' ) ) )
            // InternalBoardGameDL.g:1080:3: otherlv_0= 'count' ( (lv_count_1_0= ruleEInt ) ) ( (lv_horizontal_2_0= 'horizontal' ) ) ( (lv_vertical_3_0= 'vertical' ) ) ( (lv_diagonal_4_0= 'diagonal' ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInARowAccess().getCountKeyword_0());
            		
            // InternalBoardGameDL.g:1084:3: ( (lv_count_1_0= ruleEInt ) )
            // InternalBoardGameDL.g:1085:4: (lv_count_1_0= ruleEInt )
            {
            // InternalBoardGameDL.g:1085:4: (lv_count_1_0= ruleEInt )
            // InternalBoardGameDL.g:1086:5: lv_count_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getInARowAccess().getCountEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_36);
            lv_count_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInARowRule());
            					}
            					set(
            						current,
            						"count",
            						lv_count_1_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBoardGameDL.g:1103:3: ( (lv_horizontal_2_0= 'horizontal' ) )
            // InternalBoardGameDL.g:1104:4: (lv_horizontal_2_0= 'horizontal' )
            {
            // InternalBoardGameDL.g:1104:4: (lv_horizontal_2_0= 'horizontal' )
            // InternalBoardGameDL.g:1105:5: lv_horizontal_2_0= 'horizontal'
            {
            lv_horizontal_2_0=(Token)match(input,41,FOLLOW_37); 

            					newLeafNode(lv_horizontal_2_0, grammarAccess.getInARowAccess().getHorizontalHorizontalKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInARowRule());
            					}
            					setWithLastConsumed(current, "horizontal", lv_horizontal_2_0 != null, "horizontal");
            				

            }


            }

            // InternalBoardGameDL.g:1117:3: ( (lv_vertical_3_0= 'vertical' ) )
            // InternalBoardGameDL.g:1118:4: (lv_vertical_3_0= 'vertical' )
            {
            // InternalBoardGameDL.g:1118:4: (lv_vertical_3_0= 'vertical' )
            // InternalBoardGameDL.g:1119:5: lv_vertical_3_0= 'vertical'
            {
            lv_vertical_3_0=(Token)match(input,42,FOLLOW_38); 

            					newLeafNode(lv_vertical_3_0, grammarAccess.getInARowAccess().getVerticalVerticalKeyword_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInARowRule());
            					}
            					setWithLastConsumed(current, "vertical", lv_vertical_3_0 != null, "vertical");
            				

            }


            }

            // InternalBoardGameDL.g:1131:3: ( (lv_diagonal_4_0= 'diagonal' ) )
            // InternalBoardGameDL.g:1132:4: (lv_diagonal_4_0= 'diagonal' )
            {
            // InternalBoardGameDL.g:1132:4: (lv_diagonal_4_0= 'diagonal' )
            // InternalBoardGameDL.g:1133:5: lv_diagonal_4_0= 'diagonal'
            {
            lv_diagonal_4_0=(Token)match(input,43,FOLLOW_2); 

            					newLeafNode(lv_diagonal_4_0, grammarAccess.getInARowAccess().getDiagonalDiagonalKeyword_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInARowRule());
            					}
            					setWithLastConsumed(current, "diagonal", lv_diagonal_4_0 != null, "diagonal");
            				

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
    // $ANTLR end "ruleInARow"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000408000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000000L});

}