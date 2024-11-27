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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BoardGame'", "'{'", "'size'", "'piecetypes'", "','", "'}'", "'cellstates'", "'winConditions'", "'PieceType'", "'symbol'", "'validmoves'", "'effectsoncell'", "'CellState'", "'WinCondition'", "'inarow'", "'-'", "'placeAnywhere'", "'ValidMove'", "'conditions'", "'EffectOnCell'", "'x'", "'y'", "'cellstate'", "'Condition'", "'diagonal'", "'horizontal'", "'vertical'", "'InARow'", "'count'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    // InternalBoardGameDL.g:71:1: ruleBoardGame returns [EObject current=null] : (otherlv_0= 'BoardGame' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= ruleEInt ) ) otherlv_4= 'piecetypes' otherlv_5= '{' ( (lv_piecetypes_6_0= rulePieceType ) ) (otherlv_7= ',' ( (lv_piecetypes_8_0= rulePieceType ) ) )* otherlv_9= '}' (otherlv_10= 'cellstates' otherlv_11= '{' ( (lv_cellstates_12_0= ruleCellState ) ) (otherlv_13= ',' ( (lv_cellstates_14_0= ruleCellState ) ) )* otherlv_15= '}' )? otherlv_16= 'winConditions' otherlv_17= '{' ( (lv_winConditions_18_0= ruleWinCondition ) ) (otherlv_19= ',' ( (lv_winConditions_20_0= ruleWinCondition ) ) )* otherlv_21= '}' otherlv_22= '}' ) ;
    public final EObject ruleBoardGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
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
        AntlrDatatypeRuleToken lv_size_3_0 = null;

        EObject lv_piecetypes_6_0 = null;

        EObject lv_piecetypes_8_0 = null;

        EObject lv_cellstates_12_0 = null;

        EObject lv_cellstates_14_0 = null;

        EObject lv_winConditions_18_0 = null;

        EObject lv_winConditions_20_0 = null;



        	enterRule();

        try {
            // InternalBoardGameDL.g:77:2: ( (otherlv_0= 'BoardGame' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= ruleEInt ) ) otherlv_4= 'piecetypes' otherlv_5= '{' ( (lv_piecetypes_6_0= rulePieceType ) ) (otherlv_7= ',' ( (lv_piecetypes_8_0= rulePieceType ) ) )* otherlv_9= '}' (otherlv_10= 'cellstates' otherlv_11= '{' ( (lv_cellstates_12_0= ruleCellState ) ) (otherlv_13= ',' ( (lv_cellstates_14_0= ruleCellState ) ) )* otherlv_15= '}' )? otherlv_16= 'winConditions' otherlv_17= '{' ( (lv_winConditions_18_0= ruleWinCondition ) ) (otherlv_19= ',' ( (lv_winConditions_20_0= ruleWinCondition ) ) )* otherlv_21= '}' otherlv_22= '}' ) )
            // InternalBoardGameDL.g:78:2: (otherlv_0= 'BoardGame' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= ruleEInt ) ) otherlv_4= 'piecetypes' otherlv_5= '{' ( (lv_piecetypes_6_0= rulePieceType ) ) (otherlv_7= ',' ( (lv_piecetypes_8_0= rulePieceType ) ) )* otherlv_9= '}' (otherlv_10= 'cellstates' otherlv_11= '{' ( (lv_cellstates_12_0= ruleCellState ) ) (otherlv_13= ',' ( (lv_cellstates_14_0= ruleCellState ) ) )* otherlv_15= '}' )? otherlv_16= 'winConditions' otherlv_17= '{' ( (lv_winConditions_18_0= ruleWinCondition ) ) (otherlv_19= ',' ( (lv_winConditions_20_0= ruleWinCondition ) ) )* otherlv_21= '}' otherlv_22= '}' )
            {
            // InternalBoardGameDL.g:78:2: (otherlv_0= 'BoardGame' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= ruleEInt ) ) otherlv_4= 'piecetypes' otherlv_5= '{' ( (lv_piecetypes_6_0= rulePieceType ) ) (otherlv_7= ',' ( (lv_piecetypes_8_0= rulePieceType ) ) )* otherlv_9= '}' (otherlv_10= 'cellstates' otherlv_11= '{' ( (lv_cellstates_12_0= ruleCellState ) ) (otherlv_13= ',' ( (lv_cellstates_14_0= ruleCellState ) ) )* otherlv_15= '}' )? otherlv_16= 'winConditions' otherlv_17= '{' ( (lv_winConditions_18_0= ruleWinCondition ) ) (otherlv_19= ',' ( (lv_winConditions_20_0= ruleWinCondition ) ) )* otherlv_21= '}' otherlv_22= '}' )
            // InternalBoardGameDL.g:79:3: otherlv_0= 'BoardGame' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= ruleEInt ) ) otherlv_4= 'piecetypes' otherlv_5= '{' ( (lv_piecetypes_6_0= rulePieceType ) ) (otherlv_7= ',' ( (lv_piecetypes_8_0= rulePieceType ) ) )* otherlv_9= '}' (otherlv_10= 'cellstates' otherlv_11= '{' ( (lv_cellstates_12_0= ruleCellState ) ) (otherlv_13= ',' ( (lv_cellstates_14_0= ruleCellState ) ) )* otherlv_15= '}' )? otherlv_16= 'winConditions' otherlv_17= '{' ( (lv_winConditions_18_0= ruleWinCondition ) ) (otherlv_19= ',' ( (lv_winConditions_20_0= ruleWinCondition ) ) )* otherlv_21= '}' otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBoardGameAccess().getBoardGameKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBoardGameAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getBoardGameAccess().getSizeKeyword_2());
            		
            // InternalBoardGameDL.g:91:3: ( (lv_size_3_0= ruleEInt ) )
            // InternalBoardGameDL.g:92:4: (lv_size_3_0= ruleEInt )
            {
            // InternalBoardGameDL.g:92:4: (lv_size_3_0= ruleEInt )
            // InternalBoardGameDL.g:93:5: lv_size_3_0= ruleEInt
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

            otherlv_4=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getBoardGameAccess().getPiecetypesKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getBoardGameAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalBoardGameDL.g:118:3: ( (lv_piecetypes_6_0= rulePieceType ) )
            // InternalBoardGameDL.g:119:4: (lv_piecetypes_6_0= rulePieceType )
            {
            // InternalBoardGameDL.g:119:4: (lv_piecetypes_6_0= rulePieceType )
            // InternalBoardGameDL.g:120:5: lv_piecetypes_6_0= rulePieceType
            {

            					newCompositeNode(grammarAccess.getBoardGameAccess().getPiecetypesPieceTypeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_piecetypes_6_0=rulePieceType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoardGameRule());
            					}
            					add(
            						current,
            						"piecetypes",
            						lv_piecetypes_6_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.PieceType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBoardGameDL.g:137:3: (otherlv_7= ',' ( (lv_piecetypes_8_0= rulePieceType ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBoardGameDL.g:138:4: otherlv_7= ',' ( (lv_piecetypes_8_0= rulePieceType ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_7); 

            	    				newLeafNode(otherlv_7, grammarAccess.getBoardGameAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalBoardGameDL.g:142:4: ( (lv_piecetypes_8_0= rulePieceType ) )
            	    // InternalBoardGameDL.g:143:5: (lv_piecetypes_8_0= rulePieceType )
            	    {
            	    // InternalBoardGameDL.g:143:5: (lv_piecetypes_8_0= rulePieceType )
            	    // InternalBoardGameDL.g:144:6: lv_piecetypes_8_0= rulePieceType
            	    {

            	    						newCompositeNode(grammarAccess.getBoardGameAccess().getPiecetypesPieceTypeParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_piecetypes_8_0=rulePieceType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBoardGameRule());
            	    						}
            	    						add(
            	    							current,
            	    							"piecetypes",
            	    							lv_piecetypes_8_0,
            	    							"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.PieceType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getBoardGameAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalBoardGameDL.g:166:3: (otherlv_10= 'cellstates' otherlv_11= '{' ( (lv_cellstates_12_0= ruleCellState ) ) (otherlv_13= ',' ( (lv_cellstates_14_0= ruleCellState ) ) )* otherlv_15= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalBoardGameDL.g:167:4: otherlv_10= 'cellstates' otherlv_11= '{' ( (lv_cellstates_12_0= ruleCellState ) ) (otherlv_13= ',' ( (lv_cellstates_14_0= ruleCellState ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getBoardGameAccess().getCellstatesKeyword_9_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getBoardGameAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalBoardGameDL.g:175:4: ( (lv_cellstates_12_0= ruleCellState ) )
                    // InternalBoardGameDL.g:176:5: (lv_cellstates_12_0= ruleCellState )
                    {
                    // InternalBoardGameDL.g:176:5: (lv_cellstates_12_0= ruleCellState )
                    // InternalBoardGameDL.g:177:6: lv_cellstates_12_0= ruleCellState
                    {

                    						newCompositeNode(grammarAccess.getBoardGameAccess().getCellstatesCellStateParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalBoardGameDL.g:194:4: (otherlv_13= ',' ( (lv_cellstates_14_0= ruleCellState ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalBoardGameDL.g:195:5: otherlv_13= ',' ( (lv_cellstates_14_0= ruleCellState ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_10); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getBoardGameAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalBoardGameDL.g:199:5: ( (lv_cellstates_14_0= ruleCellState ) )
                    	    // InternalBoardGameDL.g:200:6: (lv_cellstates_14_0= ruleCellState )
                    	    {
                    	    // InternalBoardGameDL.g:200:6: (lv_cellstates_14_0= ruleCellState )
                    	    // InternalBoardGameDL.g:201:7: lv_cellstates_14_0= ruleCellState
                    	    {

                    	    							newCompositeNode(grammarAccess.getBoardGameAccess().getCellstatesCellStateParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
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

                    otherlv_15=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_15, grammarAccess.getBoardGameAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_16, grammarAccess.getBoardGameAccess().getWinConditionsKeyword_10());
            		
            otherlv_17=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_17, grammarAccess.getBoardGameAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalBoardGameDL.g:232:3: ( (lv_winConditions_18_0= ruleWinCondition ) )
            // InternalBoardGameDL.g:233:4: (lv_winConditions_18_0= ruleWinCondition )
            {
            // InternalBoardGameDL.g:233:4: (lv_winConditions_18_0= ruleWinCondition )
            // InternalBoardGameDL.g:234:5: lv_winConditions_18_0= ruleWinCondition
            {

            					newCompositeNode(grammarAccess.getBoardGameAccess().getWinConditionsWinConditionParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_8);
            lv_winConditions_18_0=ruleWinCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoardGameRule());
            					}
            					add(
            						current,
            						"winConditions",
            						lv_winConditions_18_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.WinCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBoardGameDL.g:251:3: (otherlv_19= ',' ( (lv_winConditions_20_0= ruleWinCondition ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBoardGameDL.g:252:4: otherlv_19= ',' ( (lv_winConditions_20_0= ruleWinCondition ) )
            	    {
            	    otherlv_19=(Token)match(input,15,FOLLOW_12); 

            	    				newLeafNode(otherlv_19, grammarAccess.getBoardGameAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalBoardGameDL.g:256:4: ( (lv_winConditions_20_0= ruleWinCondition ) )
            	    // InternalBoardGameDL.g:257:5: (lv_winConditions_20_0= ruleWinCondition )
            	    {
            	    // InternalBoardGameDL.g:257:5: (lv_winConditions_20_0= ruleWinCondition )
            	    // InternalBoardGameDL.g:258:6: lv_winConditions_20_0= ruleWinCondition
            	    {

            	    						newCompositeNode(grammarAccess.getBoardGameAccess().getWinConditionsWinConditionParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_winConditions_20_0=ruleWinCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBoardGameRule());
            	    						}
            	    						add(
            	    							current,
            	    							"winConditions",
            	    							lv_winConditions_20_0,
            	    							"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.WinCondition");
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

            			newLeafNode(otherlv_21, grammarAccess.getBoardGameAccess().getRightCurlyBracketKeyword_14());
            		
            otherlv_22=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getBoardGameAccess().getRightCurlyBracketKeyword_15());
            		

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
    // InternalBoardGameDL.g:288:1: entryRulePieceType returns [EObject current=null] : iv_rulePieceType= rulePieceType EOF ;
    public final EObject entryRulePieceType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePieceType = null;


        try {
            // InternalBoardGameDL.g:288:50: (iv_rulePieceType= rulePieceType EOF )
            // InternalBoardGameDL.g:289:2: iv_rulePieceType= rulePieceType EOF
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
    // InternalBoardGameDL.g:295:1: rulePieceType returns [EObject current=null] : (otherlv_0= 'PieceType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'symbol' ( (lv_symbol_4_0= ruleEString ) ) otherlv_5= 'validmoves' otherlv_6= '{' ( (lv_validmoves_7_0= ruleValidMove ) ) (otherlv_8= ',' ( (lv_validmoves_9_0= ruleValidMove ) ) )* otherlv_10= '}' (otherlv_11= 'effectsoncell' otherlv_12= '{' ( (lv_effectsoncell_13_0= ruleEffectOnCell ) ) (otherlv_14= ',' ( (lv_effectsoncell_15_0= ruleEffectOnCell ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) ;
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

        EObject lv_validmoves_7_0 = null;

        EObject lv_validmoves_9_0 = null;

        EObject lv_effectsoncell_13_0 = null;

        EObject lv_effectsoncell_15_0 = null;



        	enterRule();

        try {
            // InternalBoardGameDL.g:301:2: ( (otherlv_0= 'PieceType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'symbol' ( (lv_symbol_4_0= ruleEString ) ) otherlv_5= 'validmoves' otherlv_6= '{' ( (lv_validmoves_7_0= ruleValidMove ) ) (otherlv_8= ',' ( (lv_validmoves_9_0= ruleValidMove ) ) )* otherlv_10= '}' (otherlv_11= 'effectsoncell' otherlv_12= '{' ( (lv_effectsoncell_13_0= ruleEffectOnCell ) ) (otherlv_14= ',' ( (lv_effectsoncell_15_0= ruleEffectOnCell ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) )
            // InternalBoardGameDL.g:302:2: (otherlv_0= 'PieceType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'symbol' ( (lv_symbol_4_0= ruleEString ) ) otherlv_5= 'validmoves' otherlv_6= '{' ( (lv_validmoves_7_0= ruleValidMove ) ) (otherlv_8= ',' ( (lv_validmoves_9_0= ruleValidMove ) ) )* otherlv_10= '}' (otherlv_11= 'effectsoncell' otherlv_12= '{' ( (lv_effectsoncell_13_0= ruleEffectOnCell ) ) (otherlv_14= ',' ( (lv_effectsoncell_15_0= ruleEffectOnCell ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            {
            // InternalBoardGameDL.g:302:2: (otherlv_0= 'PieceType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'symbol' ( (lv_symbol_4_0= ruleEString ) ) otherlv_5= 'validmoves' otherlv_6= '{' ( (lv_validmoves_7_0= ruleValidMove ) ) (otherlv_8= ',' ( (lv_validmoves_9_0= ruleValidMove ) ) )* otherlv_10= '}' (otherlv_11= 'effectsoncell' otherlv_12= '{' ( (lv_effectsoncell_13_0= ruleEffectOnCell ) ) (otherlv_14= ',' ( (lv_effectsoncell_15_0= ruleEffectOnCell ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            // InternalBoardGameDL.g:303:3: otherlv_0= 'PieceType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'symbol' ( (lv_symbol_4_0= ruleEString ) ) otherlv_5= 'validmoves' otherlv_6= '{' ( (lv_validmoves_7_0= ruleValidMove ) ) (otherlv_8= ',' ( (lv_validmoves_9_0= ruleValidMove ) ) )* otherlv_10= '}' (otherlv_11= 'effectsoncell' otherlv_12= '{' ( (lv_effectsoncell_13_0= ruleEffectOnCell ) ) (otherlv_14= ',' ( (lv_effectsoncell_15_0= ruleEffectOnCell ) ) )* otherlv_16= '}' )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getPieceTypeAccess().getPieceTypeKeyword_0());
            		
            // InternalBoardGameDL.g:307:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBoardGameDL.g:308:4: (lv_name_1_0= ruleEString )
            {
            // InternalBoardGameDL.g:308:4: (lv_name_1_0= ruleEString )
            // InternalBoardGameDL.g:309:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPieceTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getPieceTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getPieceTypeAccess().getSymbolKeyword_3());
            		
            // InternalBoardGameDL.g:334:3: ( (lv_symbol_4_0= ruleEString ) )
            // InternalBoardGameDL.g:335:4: (lv_symbol_4_0= ruleEString )
            {
            // InternalBoardGameDL.g:335:4: (lv_symbol_4_0= ruleEString )
            // InternalBoardGameDL.g:336:5: lv_symbol_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPieceTypeAccess().getSymbolEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_16);
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

            otherlv_5=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getPieceTypeAccess().getValidmovesKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getPieceTypeAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalBoardGameDL.g:361:3: ( (lv_validmoves_7_0= ruleValidMove ) )
            // InternalBoardGameDL.g:362:4: (lv_validmoves_7_0= ruleValidMove )
            {
            // InternalBoardGameDL.g:362:4: (lv_validmoves_7_0= ruleValidMove )
            // InternalBoardGameDL.g:363:5: lv_validmoves_7_0= ruleValidMove
            {

            					newCompositeNode(grammarAccess.getPieceTypeAccess().getValidmovesValidMoveParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_validmoves_7_0=ruleValidMove();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPieceTypeRule());
            					}
            					add(
            						current,
            						"validmoves",
            						lv_validmoves_7_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.ValidMove");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBoardGameDL.g:380:3: (otherlv_8= ',' ( (lv_validmoves_9_0= ruleValidMove ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBoardGameDL.g:381:4: otherlv_8= ',' ( (lv_validmoves_9_0= ruleValidMove ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_17); 

            	    				newLeafNode(otherlv_8, grammarAccess.getPieceTypeAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalBoardGameDL.g:385:4: ( (lv_validmoves_9_0= ruleValidMove ) )
            	    // InternalBoardGameDL.g:386:5: (lv_validmoves_9_0= ruleValidMove )
            	    {
            	    // InternalBoardGameDL.g:386:5: (lv_validmoves_9_0= ruleValidMove )
            	    // InternalBoardGameDL.g:387:6: lv_validmoves_9_0= ruleValidMove
            	    {

            	    						newCompositeNode(grammarAccess.getPieceTypeAccess().getValidmovesValidMoveParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_validmoves_9_0=ruleValidMove();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPieceTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"validmoves",
            	    							lv_validmoves_9_0,
            	    							"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.ValidMove");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_18); 

            			newLeafNode(otherlv_10, grammarAccess.getPieceTypeAccess().getRightCurlyBracketKeyword_9());
            		
            // InternalBoardGameDL.g:409:3: (otherlv_11= 'effectsoncell' otherlv_12= '{' ( (lv_effectsoncell_13_0= ruleEffectOnCell ) ) (otherlv_14= ',' ( (lv_effectsoncell_15_0= ruleEffectOnCell ) ) )* otherlv_16= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBoardGameDL.g:410:4: otherlv_11= 'effectsoncell' otherlv_12= '{' ( (lv_effectsoncell_13_0= ruleEffectOnCell ) ) (otherlv_14= ',' ( (lv_effectsoncell_15_0= ruleEffectOnCell ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getPieceTypeAccess().getEffectsoncellKeyword_10_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getPieceTypeAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalBoardGameDL.g:418:4: ( (lv_effectsoncell_13_0= ruleEffectOnCell ) )
                    // InternalBoardGameDL.g:419:5: (lv_effectsoncell_13_0= ruleEffectOnCell )
                    {
                    // InternalBoardGameDL.g:419:5: (lv_effectsoncell_13_0= ruleEffectOnCell )
                    // InternalBoardGameDL.g:420:6: lv_effectsoncell_13_0= ruleEffectOnCell
                    {

                    						newCompositeNode(grammarAccess.getPieceTypeAccess().getEffectsoncellEffectOnCellParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_effectsoncell_13_0=ruleEffectOnCell();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPieceTypeRule());
                    						}
                    						add(
                    							current,
                    							"effectsoncell",
                    							lv_effectsoncell_13_0,
                    							"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.EffectOnCell");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBoardGameDL.g:437:4: (otherlv_14= ',' ( (lv_effectsoncell_15_0= ruleEffectOnCell ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalBoardGameDL.g:438:5: otherlv_14= ',' ( (lv_effectsoncell_15_0= ruleEffectOnCell ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_19); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getPieceTypeAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalBoardGameDL.g:442:5: ( (lv_effectsoncell_15_0= ruleEffectOnCell ) )
                    	    // InternalBoardGameDL.g:443:6: (lv_effectsoncell_15_0= ruleEffectOnCell )
                    	    {
                    	    // InternalBoardGameDL.g:443:6: (lv_effectsoncell_15_0= ruleEffectOnCell )
                    	    // InternalBoardGameDL.g:444:7: lv_effectsoncell_15_0= ruleEffectOnCell
                    	    {

                    	    							newCompositeNode(grammarAccess.getPieceTypeAccess().getEffectsoncellEffectOnCellParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_effectsoncell_15_0=ruleEffectOnCell();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPieceTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"effectsoncell",
                    	    								lv_effectsoncell_15_0,
                    	    								"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.EffectOnCell");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_16, grammarAccess.getPieceTypeAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,16,FOLLOW_2); 

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
    // InternalBoardGameDL.g:475:1: entryRuleCellState returns [EObject current=null] : iv_ruleCellState= ruleCellState EOF ;
    public final EObject entryRuleCellState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellState = null;


        try {
            // InternalBoardGameDL.g:475:50: (iv_ruleCellState= ruleCellState EOF )
            // InternalBoardGameDL.g:476:2: iv_ruleCellState= ruleCellState EOF
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
    // InternalBoardGameDL.g:482:1: ruleCellState returns [EObject current=null] : (otherlv_0= 'CellState' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleCellState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBoardGameDL.g:488:2: ( (otherlv_0= 'CellState' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalBoardGameDL.g:489:2: (otherlv_0= 'CellState' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalBoardGameDL.g:489:2: (otherlv_0= 'CellState' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalBoardGameDL.g:490:3: otherlv_0= 'CellState' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getCellStateAccess().getCellStateKeyword_0());
            		
            // InternalBoardGameDL.g:494:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBoardGameDL.g:495:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBoardGameDL.g:495:4: (lv_name_1_0= RULE_ID )
            // InternalBoardGameDL.g:496:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCellStateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCellStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // InternalBoardGameDL.g:516:1: entryRuleWinCondition returns [EObject current=null] : iv_ruleWinCondition= ruleWinCondition EOF ;
    public final EObject entryRuleWinCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWinCondition = null;


        try {
            // InternalBoardGameDL.g:516:53: (iv_ruleWinCondition= ruleWinCondition EOF )
            // InternalBoardGameDL.g:517:2: iv_ruleWinCondition= ruleWinCondition EOF
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
    // InternalBoardGameDL.g:523:1: ruleWinCondition returns [EObject current=null] : (otherlv_0= 'WinCondition' otherlv_1= '{' otherlv_2= 'inarow' ( (lv_inarow_3_0= ruleInARow ) ) otherlv_4= '}' ) ;
    public final EObject ruleWinCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_inarow_3_0 = null;



        	enterRule();

        try {
            // InternalBoardGameDL.g:529:2: ( (otherlv_0= 'WinCondition' otherlv_1= '{' otherlv_2= 'inarow' ( (lv_inarow_3_0= ruleInARow ) ) otherlv_4= '}' ) )
            // InternalBoardGameDL.g:530:2: (otherlv_0= 'WinCondition' otherlv_1= '{' otherlv_2= 'inarow' ( (lv_inarow_3_0= ruleInARow ) ) otherlv_4= '}' )
            {
            // InternalBoardGameDL.g:530:2: (otherlv_0= 'WinCondition' otherlv_1= '{' otherlv_2= 'inarow' ( (lv_inarow_3_0= ruleInARow ) ) otherlv_4= '}' )
            // InternalBoardGameDL.g:531:3: otherlv_0= 'WinCondition' otherlv_1= '{' otherlv_2= 'inarow' ( (lv_inarow_3_0= ruleInARow ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWinConditionAccess().getWinConditionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getWinConditionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getWinConditionAccess().getInarowKeyword_2());
            		
            // InternalBoardGameDL.g:543:3: ( (lv_inarow_3_0= ruleInARow ) )
            // InternalBoardGameDL.g:544:4: (lv_inarow_3_0= ruleInARow )
            {
            // InternalBoardGameDL.g:544:4: (lv_inarow_3_0= ruleInARow )
            // InternalBoardGameDL.g:545:5: lv_inarow_3_0= ruleInARow
            {

            					newCompositeNode(grammarAccess.getWinConditionAccess().getInarowInARowParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_inarow_3_0=ruleInARow();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWinConditionRule());
            					}
            					set(
            						current,
            						"inarow",
            						lv_inarow_3_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.InARow");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalBoardGameDL.g:570:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalBoardGameDL.g:570:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalBoardGameDL.g:571:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalBoardGameDL.g:577:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalBoardGameDL.g:583:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalBoardGameDL.g:584:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalBoardGameDL.g:584:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalBoardGameDL.g:585:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalBoardGameDL.g:585:3: (kw= '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBoardGameDL.g:586:4: kw= '-'
                    {
                    kw=(Token)match(input,26,FOLLOW_23); 

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
    // InternalBoardGameDL.g:603:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBoardGameDL.g:603:47: (iv_ruleEString= ruleEString EOF )
            // InternalBoardGameDL.g:604:2: iv_ruleEString= ruleEString EOF
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
    // InternalBoardGameDL.g:610:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBoardGameDL.g:616:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBoardGameDL.g:617:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBoardGameDL.g:617:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalBoardGameDL.g:618:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBoardGameDL.g:626:3: this_ID_1= RULE_ID
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
    // InternalBoardGameDL.g:637:1: entryRuleValidMove returns [EObject current=null] : iv_ruleValidMove= ruleValidMove EOF ;
    public final EObject entryRuleValidMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidMove = null;


        try {
            // InternalBoardGameDL.g:637:50: (iv_ruleValidMove= ruleValidMove EOF )
            // InternalBoardGameDL.g:638:2: iv_ruleValidMove= ruleValidMove EOF
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
    // InternalBoardGameDL.g:644:1: ruleValidMove returns [EObject current=null] : ( ( (lv_placeAnywhere_0_0= 'placeAnywhere' ) ) otherlv_1= 'ValidMove' otherlv_2= '{' (otherlv_3= 'conditions' otherlv_4= '{' ( (lv_conditions_5_0= ruleCondition ) ) (otherlv_6= ',' ( (lv_conditions_7_0= ruleCondition ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
        EObject lv_conditions_5_0 = null;

        EObject lv_conditions_7_0 = null;



        	enterRule();

        try {
            // InternalBoardGameDL.g:650:2: ( ( ( (lv_placeAnywhere_0_0= 'placeAnywhere' ) ) otherlv_1= 'ValidMove' otherlv_2= '{' (otherlv_3= 'conditions' otherlv_4= '{' ( (lv_conditions_5_0= ruleCondition ) ) (otherlv_6= ',' ( (lv_conditions_7_0= ruleCondition ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalBoardGameDL.g:651:2: ( ( (lv_placeAnywhere_0_0= 'placeAnywhere' ) ) otherlv_1= 'ValidMove' otherlv_2= '{' (otherlv_3= 'conditions' otherlv_4= '{' ( (lv_conditions_5_0= ruleCondition ) ) (otherlv_6= ',' ( (lv_conditions_7_0= ruleCondition ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalBoardGameDL.g:651:2: ( ( (lv_placeAnywhere_0_0= 'placeAnywhere' ) ) otherlv_1= 'ValidMove' otherlv_2= '{' (otherlv_3= 'conditions' otherlv_4= '{' ( (lv_conditions_5_0= ruleCondition ) ) (otherlv_6= ',' ( (lv_conditions_7_0= ruleCondition ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalBoardGameDL.g:652:3: ( (lv_placeAnywhere_0_0= 'placeAnywhere' ) ) otherlv_1= 'ValidMove' otherlv_2= '{' (otherlv_3= 'conditions' otherlv_4= '{' ( (lv_conditions_5_0= ruleCondition ) ) (otherlv_6= ',' ( (lv_conditions_7_0= ruleCondition ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalBoardGameDL.g:652:3: ( (lv_placeAnywhere_0_0= 'placeAnywhere' ) )
            // InternalBoardGameDL.g:653:4: (lv_placeAnywhere_0_0= 'placeAnywhere' )
            {
            // InternalBoardGameDL.g:653:4: (lv_placeAnywhere_0_0= 'placeAnywhere' )
            // InternalBoardGameDL.g:654:5: lv_placeAnywhere_0_0= 'placeAnywhere'
            {
            lv_placeAnywhere_0_0=(Token)match(input,27,FOLLOW_24); 

            					newLeafNode(lv_placeAnywhere_0_0, grammarAccess.getValidMoveAccess().getPlaceAnywherePlaceAnywhereKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValidMoveRule());
            					}
            					setWithLastConsumed(current, "placeAnywhere", lv_placeAnywhere_0_0 != null, "placeAnywhere");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getValidMoveAccess().getValidMoveKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getValidMoveAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBoardGameDL.g:674:3: (otherlv_3= 'conditions' otherlv_4= '{' ( (lv_conditions_5_0= ruleCondition ) ) (otherlv_6= ',' ( (lv_conditions_7_0= ruleCondition ) ) )* otherlv_8= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBoardGameDL.g:675:4: otherlv_3= 'conditions' otherlv_4= '{' ( (lv_conditions_5_0= ruleCondition ) ) (otherlv_6= ',' ( (lv_conditions_7_0= ruleCondition ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getValidMoveAccess().getConditionsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getValidMoveAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalBoardGameDL.g:683:4: ( (lv_conditions_5_0= ruleCondition ) )
                    // InternalBoardGameDL.g:684:5: (lv_conditions_5_0= ruleCondition )
                    {
                    // InternalBoardGameDL.g:684:5: (lv_conditions_5_0= ruleCondition )
                    // InternalBoardGameDL.g:685:6: lv_conditions_5_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getValidMoveAccess().getConditionsConditionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_conditions_5_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValidMoveRule());
                    						}
                    						add(
                    							current,
                    							"conditions",
                    							lv_conditions_5_0,
                    							"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBoardGameDL.g:702:4: (otherlv_6= ',' ( (lv_conditions_7_0= ruleCondition ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==15) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalBoardGameDL.g:703:5: otherlv_6= ',' ( (lv_conditions_7_0= ruleCondition ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_26); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getValidMoveAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalBoardGameDL.g:707:5: ( (lv_conditions_7_0= ruleCondition ) )
                    	    // InternalBoardGameDL.g:708:6: (lv_conditions_7_0= ruleCondition )
                    	    {
                    	    // InternalBoardGameDL.g:708:6: (lv_conditions_7_0= ruleCondition )
                    	    // InternalBoardGameDL.g:709:7: lv_conditions_7_0= ruleCondition
                    	    {

                    	    							newCompositeNode(grammarAccess.getValidMoveAccess().getConditionsConditionParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_conditions_7_0=ruleCondition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getValidMoveRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"conditions",
                    	    								lv_conditions_7_0,
                    	    								"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.Condition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getValidMoveAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

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
    // InternalBoardGameDL.g:740:1: entryRuleEffectOnCell returns [EObject current=null] : iv_ruleEffectOnCell= ruleEffectOnCell EOF ;
    public final EObject entryRuleEffectOnCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectOnCell = null;


        try {
            // InternalBoardGameDL.g:740:53: (iv_ruleEffectOnCell= ruleEffectOnCell EOF )
            // InternalBoardGameDL.g:741:2: iv_ruleEffectOnCell= ruleEffectOnCell EOF
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
    // InternalBoardGameDL.g:747:1: ruleEffectOnCell returns [EObject current=null] : (otherlv_0= 'EffectOnCell' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) otherlv_6= 'cellstate' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalBoardGameDL.g:753:2: ( (otherlv_0= 'EffectOnCell' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) otherlv_6= 'cellstate' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalBoardGameDL.g:754:2: (otherlv_0= 'EffectOnCell' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) otherlv_6= 'cellstate' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalBoardGameDL.g:754:2: (otherlv_0= 'EffectOnCell' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) otherlv_6= 'cellstate' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalBoardGameDL.g:755:3: otherlv_0= 'EffectOnCell' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) otherlv_6= 'cellstate' ( ( ruleEString ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectOnCellAccess().getEffectOnCellKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectOnCellAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getEffectOnCellAccess().getXKeyword_2());
            		
            // InternalBoardGameDL.g:767:3: ( (lv_x_3_0= ruleEInt ) )
            // InternalBoardGameDL.g:768:4: (lv_x_3_0= ruleEInt )
            {
            // InternalBoardGameDL.g:768:4: (lv_x_3_0= ruleEInt )
            // InternalBoardGameDL.g:769:5: lv_x_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getEffectOnCellAccess().getXEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
            lv_x_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectOnCellRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_3_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getEffectOnCellAccess().getYKeyword_4());
            		
            // InternalBoardGameDL.g:790:3: ( (lv_y_5_0= ruleEInt ) )
            // InternalBoardGameDL.g:791:4: (lv_y_5_0= ruleEInt )
            {
            // InternalBoardGameDL.g:791:4: (lv_y_5_0= ruleEInt )
            // InternalBoardGameDL.g:792:5: lv_y_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getEffectOnCellAccess().getYEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_29);
            lv_y_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectOnCellRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_5_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,33,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getEffectOnCellAccess().getCellstateKeyword_6());
            		
            // InternalBoardGameDL.g:813:3: ( ( ruleEString ) )
            // InternalBoardGameDL.g:814:4: ( ruleEString )
            {
            // InternalBoardGameDL.g:814:4: ( ruleEString )
            // InternalBoardGameDL.g:815:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEffectOnCellRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEffectOnCellAccess().getCellstateCellStateCrossReference_7_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

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
    // InternalBoardGameDL.g:837:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalBoardGameDL.g:837:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalBoardGameDL.g:838:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalBoardGameDL.g:844:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'Condition' otherlv_1= '{' otherlv_2= 'cellstate' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalBoardGameDL.g:850:2: ( (otherlv_0= 'Condition' otherlv_1= '{' otherlv_2= 'cellstate' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalBoardGameDL.g:851:2: (otherlv_0= 'Condition' otherlv_1= '{' otherlv_2= 'cellstate' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalBoardGameDL.g:851:2: (otherlv_0= 'Condition' otherlv_1= '{' otherlv_2= 'cellstate' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalBoardGameDL.g:852:3: otherlv_0= 'Condition' otherlv_1= '{' otherlv_2= 'cellstate' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getConditionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getCellstateKeyword_2());
            		
            // InternalBoardGameDL.g:864:3: ( ( ruleEString ) )
            // InternalBoardGameDL.g:865:4: ( ruleEString )
            {
            // InternalBoardGameDL.g:865:4: ( ruleEString )
            // InternalBoardGameDL.g:866:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConditionAccess().getCellstateCellStateCrossReference_3_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalBoardGameDL.g:888:1: entryRuleInARow returns [EObject current=null] : iv_ruleInARow= ruleInARow EOF ;
    public final EObject entryRuleInARow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInARow = null;


        try {
            // InternalBoardGameDL.g:888:47: (iv_ruleInARow= ruleInARow EOF )
            // InternalBoardGameDL.g:889:2: iv_ruleInARow= ruleInARow EOF
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
    // InternalBoardGameDL.g:895:1: ruleInARow returns [EObject current=null] : ( ( (lv_diagonal_0_0= 'diagonal' ) ) ( (lv_horizontal_1_0= 'horizontal' ) ) ( (lv_vertical_2_0= 'vertical' ) ) otherlv_3= 'InARow' otherlv_4= '{' otherlv_5= 'count' ( (lv_count_6_0= ruleEInt ) ) otherlv_7= '}' ) ;
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
            // InternalBoardGameDL.g:901:2: ( ( ( (lv_diagonal_0_0= 'diagonal' ) ) ( (lv_horizontal_1_0= 'horizontal' ) ) ( (lv_vertical_2_0= 'vertical' ) ) otherlv_3= 'InARow' otherlv_4= '{' otherlv_5= 'count' ( (lv_count_6_0= ruleEInt ) ) otherlv_7= '}' ) )
            // InternalBoardGameDL.g:902:2: ( ( (lv_diagonal_0_0= 'diagonal' ) ) ( (lv_horizontal_1_0= 'horizontal' ) ) ( (lv_vertical_2_0= 'vertical' ) ) otherlv_3= 'InARow' otherlv_4= '{' otherlv_5= 'count' ( (lv_count_6_0= ruleEInt ) ) otherlv_7= '}' )
            {
            // InternalBoardGameDL.g:902:2: ( ( (lv_diagonal_0_0= 'diagonal' ) ) ( (lv_horizontal_1_0= 'horizontal' ) ) ( (lv_vertical_2_0= 'vertical' ) ) otherlv_3= 'InARow' otherlv_4= '{' otherlv_5= 'count' ( (lv_count_6_0= ruleEInt ) ) otherlv_7= '}' )
            // InternalBoardGameDL.g:903:3: ( (lv_diagonal_0_0= 'diagonal' ) ) ( (lv_horizontal_1_0= 'horizontal' ) ) ( (lv_vertical_2_0= 'vertical' ) ) otherlv_3= 'InARow' otherlv_4= '{' otherlv_5= 'count' ( (lv_count_6_0= ruleEInt ) ) otherlv_7= '}'
            {
            // InternalBoardGameDL.g:903:3: ( (lv_diagonal_0_0= 'diagonal' ) )
            // InternalBoardGameDL.g:904:4: (lv_diagonal_0_0= 'diagonal' )
            {
            // InternalBoardGameDL.g:904:4: (lv_diagonal_0_0= 'diagonal' )
            // InternalBoardGameDL.g:905:5: lv_diagonal_0_0= 'diagonal'
            {
            lv_diagonal_0_0=(Token)match(input,35,FOLLOW_30); 

            					newLeafNode(lv_diagonal_0_0, grammarAccess.getInARowAccess().getDiagonalDiagonalKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInARowRule());
            					}
            					setWithLastConsumed(current, "diagonal", lv_diagonal_0_0 != null, "diagonal");
            				

            }


            }

            // InternalBoardGameDL.g:917:3: ( (lv_horizontal_1_0= 'horizontal' ) )
            // InternalBoardGameDL.g:918:4: (lv_horizontal_1_0= 'horizontal' )
            {
            // InternalBoardGameDL.g:918:4: (lv_horizontal_1_0= 'horizontal' )
            // InternalBoardGameDL.g:919:5: lv_horizontal_1_0= 'horizontal'
            {
            lv_horizontal_1_0=(Token)match(input,36,FOLLOW_31); 

            					newLeafNode(lv_horizontal_1_0, grammarAccess.getInARowAccess().getHorizontalHorizontalKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInARowRule());
            					}
            					setWithLastConsumed(current, "horizontal", lv_horizontal_1_0 != null, "horizontal");
            				

            }


            }

            // InternalBoardGameDL.g:931:3: ( (lv_vertical_2_0= 'vertical' ) )
            // InternalBoardGameDL.g:932:4: (lv_vertical_2_0= 'vertical' )
            {
            // InternalBoardGameDL.g:932:4: (lv_vertical_2_0= 'vertical' )
            // InternalBoardGameDL.g:933:5: lv_vertical_2_0= 'vertical'
            {
            lv_vertical_2_0=(Token)match(input,37,FOLLOW_32); 

            					newLeafNode(lv_vertical_2_0, grammarAccess.getInARowAccess().getVerticalVerticalKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInARowRule());
            					}
            					setWithLastConsumed(current, "vertical", lv_vertical_2_0 != null, "vertical");
            				

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getInARowAccess().getInARowKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_4, grammarAccess.getInARowAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getInARowAccess().getCountKeyword_5());
            		
            // InternalBoardGameDL.g:957:3: ( (lv_count_6_0= ruleEInt ) )
            // InternalBoardGameDL.g:958:4: (lv_count_6_0= ruleEInt )
            {
            // InternalBoardGameDL.g:958:4: (lv_count_6_0= ruleEInt )
            // InternalBoardGameDL.g:959:5: lv_count_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getInARowAccess().getCountEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_13);
            lv_count_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInARowRule());
            					}
            					set(
            						current,
            						"count",
            						lv_count_6_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardGameDL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020010000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});

}