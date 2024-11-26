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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Rules'", "'{'", "'board'", "','", "'}'", "'Board'", "'Name'", "'Width'", "'Height'", "'cell'", "'('", "')'", "'boardstate'", "'playerbrickset'", "'validmove'", "'PlayerBrickSet'", "'win'", "'draw'", "'brick'", "'-'", "'ValidMove'", "'brickchange'", "'cellchange'", "'Brick'", "'bricktype'", "'startCell'", "'LineElement'", "'Position'", "'celltype'", "'cellstate'", "'brickstate'"
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
        	return "Rules";
       	}

       	@Override
       	protected BoardgameDLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRules"
    // InternalBoardgameDL.g:64:1: entryRuleRules returns [EObject current=null] : iv_ruleRules= ruleRules EOF ;
    public final EObject entryRuleRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRules = null;


        try {
            // InternalBoardgameDL.g:64:46: (iv_ruleRules= ruleRules EOF )
            // InternalBoardgameDL.g:65:2: iv_ruleRules= ruleRules EOF
            {
             newCompositeNode(grammarAccess.getRulesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRules=ruleRules();

            state._fsp--;

             current =iv_ruleRules; 
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
    // $ANTLR end "entryRuleRules"


    // $ANTLR start "ruleRules"
    // InternalBoardgameDL.g:71:1: ruleRules returns [EObject current=null] : (otherlv_0= 'Rules' otherlv_1= '{' otherlv_2= 'board' otherlv_3= '{' ( (lv_board_4_0= ruleBoard ) ) (otherlv_5= ',' ( (lv_board_6_0= ruleBoard ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleRules() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_board_4_0 = null;

        EObject lv_board_6_0 = null;



        	enterRule();

        try {
            // InternalBoardgameDL.g:77:2: ( (otherlv_0= 'Rules' otherlv_1= '{' otherlv_2= 'board' otherlv_3= '{' ( (lv_board_4_0= ruleBoard ) ) (otherlv_5= ',' ( (lv_board_6_0= ruleBoard ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalBoardgameDL.g:78:2: (otherlv_0= 'Rules' otherlv_1= '{' otherlv_2= 'board' otherlv_3= '{' ( (lv_board_4_0= ruleBoard ) ) (otherlv_5= ',' ( (lv_board_6_0= ruleBoard ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalBoardgameDL.g:78:2: (otherlv_0= 'Rules' otherlv_1= '{' otherlv_2= 'board' otherlv_3= '{' ( (lv_board_4_0= ruleBoard ) ) (otherlv_5= ',' ( (lv_board_6_0= ruleBoard ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalBoardgameDL.g:79:3: otherlv_0= 'Rules' otherlv_1= '{' otherlv_2= 'board' otherlv_3= '{' ( (lv_board_4_0= ruleBoard ) ) (otherlv_5= ',' ( (lv_board_6_0= ruleBoard ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRulesAccess().getRulesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRulesAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRulesAccess().getBoardKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRulesAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBoardgameDL.g:95:3: ( (lv_board_4_0= ruleBoard ) )
            // InternalBoardgameDL.g:96:4: (lv_board_4_0= ruleBoard )
            {
            // InternalBoardgameDL.g:96:4: (lv_board_4_0= ruleBoard )
            // InternalBoardgameDL.g:97:5: lv_board_4_0= ruleBoard
            {

            					newCompositeNode(grammarAccess.getRulesAccess().getBoardBoardParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_board_4_0=ruleBoard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRulesRule());
            					}
            					add(
            						current,
            						"board",
            						lv_board_4_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardgameDL.Board");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBoardgameDL.g:114:3: (otherlv_5= ',' ( (lv_board_6_0= ruleBoard ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBoardgameDL.g:115:4: otherlv_5= ',' ( (lv_board_6_0= ruleBoard ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getRulesAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalBoardgameDL.g:119:4: ( (lv_board_6_0= ruleBoard ) )
            	    // InternalBoardgameDL.g:120:5: (lv_board_6_0= ruleBoard )
            	    {
            	    // InternalBoardgameDL.g:120:5: (lv_board_6_0= ruleBoard )
            	    // InternalBoardgameDL.g:121:6: lv_board_6_0= ruleBoard
            	    {

            	    						newCompositeNode(grammarAccess.getRulesAccess().getBoardBoardParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_board_6_0=ruleBoard();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRulesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"board",
            	    							lv_board_6_0,
            	    							"no.ntnu.tdt4250.g07.bg.bgdl.BoardgameDL.Board");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getRulesAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRulesAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleRules"


    // $ANTLR start "entryRuleBoard"
    // InternalBoardgameDL.g:151:1: entryRuleBoard returns [EObject current=null] : iv_ruleBoard= ruleBoard EOF ;
    public final EObject entryRuleBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoard = null;


        try {
            // InternalBoardgameDL.g:151:46: (iv_ruleBoard= ruleBoard EOF )
            // InternalBoardgameDL.g:152:2: iv_ruleBoard= ruleBoard EOF
            {
             newCompositeNode(grammarAccess.getBoardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoard=ruleBoard();

            state._fsp--;

             current =iv_ruleBoard; 
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
    // $ANTLR end "entryRuleBoard"


    // $ANTLR start "ruleBoard"
    // InternalBoardgameDL.g:158:1: ruleBoard returns [EObject current=null] : (otherlv_0= 'Board' otherlv_1= '{' otherlv_2= 'Name' ( (lv_Name_3_0= ruleEString ) ) otherlv_4= 'Width' ( (lv_Width_5_0= ruleEInt ) ) otherlv_6= 'Height' ( (lv_Height_7_0= ruleEInt ) ) otherlv_8= 'cell' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' (otherlv_14= 'boardstate' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? otherlv_20= 'playerbrickset' otherlv_21= '{' ( (lv_playerbrickset_22_0= rulePlayerBrickSet ) ) (otherlv_23= ',' ( (lv_playerbrickset_24_0= rulePlayerBrickSet ) ) )* otherlv_25= '}' otherlv_26= 'validmove' otherlv_27= '{' ( (lv_validmove_28_0= ruleValidMove ) ) (otherlv_29= ',' ( (lv_validmove_30_0= ruleValidMove ) ) )* otherlv_31= '}' otherlv_32= '}' ) ;
    public final EObject ruleBoard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        AntlrDatatypeRuleToken lv_Name_3_0 = null;

        AntlrDatatypeRuleToken lv_Width_5_0 = null;

        AntlrDatatypeRuleToken lv_Height_7_0 = null;

        EObject lv_playerbrickset_22_0 = null;

        EObject lv_playerbrickset_24_0 = null;

        EObject lv_validmove_28_0 = null;

        EObject lv_validmove_30_0 = null;



        	enterRule();

        try {
            // InternalBoardgameDL.g:164:2: ( (otherlv_0= 'Board' otherlv_1= '{' otherlv_2= 'Name' ( (lv_Name_3_0= ruleEString ) ) otherlv_4= 'Width' ( (lv_Width_5_0= ruleEInt ) ) otherlv_6= 'Height' ( (lv_Height_7_0= ruleEInt ) ) otherlv_8= 'cell' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' (otherlv_14= 'boardstate' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? otherlv_20= 'playerbrickset' otherlv_21= '{' ( (lv_playerbrickset_22_0= rulePlayerBrickSet ) ) (otherlv_23= ',' ( (lv_playerbrickset_24_0= rulePlayerBrickSet ) ) )* otherlv_25= '}' otherlv_26= 'validmove' otherlv_27= '{' ( (lv_validmove_28_0= ruleValidMove ) ) (otherlv_29= ',' ( (lv_validmove_30_0= ruleValidMove ) ) )* otherlv_31= '}' otherlv_32= '}' ) )
            // InternalBoardgameDL.g:165:2: (otherlv_0= 'Board' otherlv_1= '{' otherlv_2= 'Name' ( (lv_Name_3_0= ruleEString ) ) otherlv_4= 'Width' ( (lv_Width_5_0= ruleEInt ) ) otherlv_6= 'Height' ( (lv_Height_7_0= ruleEInt ) ) otherlv_8= 'cell' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' (otherlv_14= 'boardstate' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? otherlv_20= 'playerbrickset' otherlv_21= '{' ( (lv_playerbrickset_22_0= rulePlayerBrickSet ) ) (otherlv_23= ',' ( (lv_playerbrickset_24_0= rulePlayerBrickSet ) ) )* otherlv_25= '}' otherlv_26= 'validmove' otherlv_27= '{' ( (lv_validmove_28_0= ruleValidMove ) ) (otherlv_29= ',' ( (lv_validmove_30_0= ruleValidMove ) ) )* otherlv_31= '}' otherlv_32= '}' )
            {
            // InternalBoardgameDL.g:165:2: (otherlv_0= 'Board' otherlv_1= '{' otherlv_2= 'Name' ( (lv_Name_3_0= ruleEString ) ) otherlv_4= 'Width' ( (lv_Width_5_0= ruleEInt ) ) otherlv_6= 'Height' ( (lv_Height_7_0= ruleEInt ) ) otherlv_8= 'cell' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' (otherlv_14= 'boardstate' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? otherlv_20= 'playerbrickset' otherlv_21= '{' ( (lv_playerbrickset_22_0= rulePlayerBrickSet ) ) (otherlv_23= ',' ( (lv_playerbrickset_24_0= rulePlayerBrickSet ) ) )* otherlv_25= '}' otherlv_26= 'validmove' otherlv_27= '{' ( (lv_validmove_28_0= ruleValidMove ) ) (otherlv_29= ',' ( (lv_validmove_30_0= ruleValidMove ) ) )* otherlv_31= '}' otherlv_32= '}' )
            // InternalBoardgameDL.g:166:3: otherlv_0= 'Board' otherlv_1= '{' otherlv_2= 'Name' ( (lv_Name_3_0= ruleEString ) ) otherlv_4= 'Width' ( (lv_Width_5_0= ruleEInt ) ) otherlv_6= 'Height' ( (lv_Height_7_0= ruleEInt ) ) otherlv_8= 'cell' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' (otherlv_14= 'boardstate' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? otherlv_20= 'playerbrickset' otherlv_21= '{' ( (lv_playerbrickset_22_0= rulePlayerBrickSet ) ) (otherlv_23= ',' ( (lv_playerbrickset_24_0= rulePlayerBrickSet ) ) )* otherlv_25= '}' otherlv_26= 'validmove' otherlv_27= '{' ( (lv_validmove_28_0= ruleValidMove ) ) (otherlv_29= ',' ( (lv_validmove_30_0= ruleValidMove ) ) )* otherlv_31= '}' otherlv_32= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBoardAccess().getBoardKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getBoardAccess().getNameKeyword_2());
            		
            // InternalBoardgameDL.g:178:3: ( (lv_Name_3_0= ruleEString ) )
            // InternalBoardgameDL.g:179:4: (lv_Name_3_0= ruleEString )
            {
            // InternalBoardgameDL.g:179:4: (lv_Name_3_0= ruleEString )
            // InternalBoardgameDL.g:180:5: lv_Name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBoardAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_Name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoardRule());
            					}
            					set(
            						current,
            						"Name",
            						lv_Name_3_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardgameDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getBoardAccess().getWidthKeyword_4());
            		
            // InternalBoardgameDL.g:201:3: ( (lv_Width_5_0= ruleEInt ) )
            // InternalBoardgameDL.g:202:4: (lv_Width_5_0= ruleEInt )
            {
            // InternalBoardgameDL.g:202:4: (lv_Width_5_0= ruleEInt )
            // InternalBoardgameDL.g:203:5: lv_Width_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getBoardAccess().getWidthEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_Width_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoardRule());
            					}
            					set(
            						current,
            						"Width",
            						lv_Width_5_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardgameDL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getBoardAccess().getHeightKeyword_6());
            		
            // InternalBoardgameDL.g:224:3: ( (lv_Height_7_0= ruleEInt ) )
            // InternalBoardgameDL.g:225:4: (lv_Height_7_0= ruleEInt )
            {
            // InternalBoardgameDL.g:225:4: (lv_Height_7_0= ruleEInt )
            // InternalBoardgameDL.g:226:5: lv_Height_7_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getBoardAccess().getHeightEIntParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_13);
            lv_Height_7_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoardRule());
            					}
            					set(
            						current,
            						"Height",
            						lv_Height_7_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardgameDL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getBoardAccess().getCellKeyword_8());
            		
            otherlv_9=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getBoardAccess().getLeftParenthesisKeyword_9());
            		
            // InternalBoardgameDL.g:251:3: ( ( ruleEString ) )
            // InternalBoardgameDL.g:252:4: ( ruleEString )
            {
            // InternalBoardgameDL.g:252:4: ( ruleEString )
            // InternalBoardgameDL.g:253:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoardRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBoardAccess().getCellCellCrossReference_10_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBoardgameDL.g:267:3: (otherlv_11= ',' ( ( ruleEString ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBoardgameDL.g:268:4: otherlv_11= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_11=(Token)match(input,14,FOLLOW_9); 

            	    				newLeafNode(otherlv_11, grammarAccess.getBoardAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalBoardgameDL.g:272:4: ( ( ruleEString ) )
            	    // InternalBoardgameDL.g:273:5: ( ruleEString )
            	    {
            	    // InternalBoardgameDL.g:273:5: ( ruleEString )
            	    // InternalBoardgameDL.g:274:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getBoardRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getBoardAccess().getCellCellCrossReference_11_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_13=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_13, grammarAccess.getBoardAccess().getRightParenthesisKeyword_12());
            		
            // InternalBoardgameDL.g:293:3: (otherlv_14= 'boardstate' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBoardgameDL.g:294:4: otherlv_14= 'boardstate' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')'
                    {
                    otherlv_14=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_14, grammarAccess.getBoardAccess().getBoardstateKeyword_13_0());
                    			
                    otherlv_15=(Token)match(input,21,FOLLOW_9); 

                    				newLeafNode(otherlv_15, grammarAccess.getBoardAccess().getLeftParenthesisKeyword_13_1());
                    			
                    // InternalBoardgameDL.g:302:4: ( ( ruleEString ) )
                    // InternalBoardgameDL.g:303:5: ( ruleEString )
                    {
                    // InternalBoardgameDL.g:303:5: ( ruleEString )
                    // InternalBoardgameDL.g:304:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBoardRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBoardAccess().getBoardstateBoardStateCrossReference_13_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBoardgameDL.g:318:4: (otherlv_17= ',' ( ( ruleEString ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalBoardgameDL.g:319:5: otherlv_17= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_17=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getBoardAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalBoardgameDL.g:323:5: ( ( ruleEString ) )
                    	    // InternalBoardgameDL.g:324:6: ( ruleEString )
                    	    {
                    	    // InternalBoardgameDL.g:324:6: ( ruleEString )
                    	    // InternalBoardgameDL.g:325:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBoardRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getBoardAccess().getBoardstateBoardStateCrossReference_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
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

                    otherlv_19=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_19, grammarAccess.getBoardAccess().getRightParenthesisKeyword_13_4());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_20, grammarAccess.getBoardAccess().getPlayerbricksetKeyword_14());
            		
            otherlv_21=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_21, grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_15());
            		
            // InternalBoardgameDL.g:353:3: ( (lv_playerbrickset_22_0= rulePlayerBrickSet ) )
            // InternalBoardgameDL.g:354:4: (lv_playerbrickset_22_0= rulePlayerBrickSet )
            {
            // InternalBoardgameDL.g:354:4: (lv_playerbrickset_22_0= rulePlayerBrickSet )
            // InternalBoardgameDL.g:355:5: lv_playerbrickset_22_0= rulePlayerBrickSet
            {

            					newCompositeNode(grammarAccess.getBoardAccess().getPlayerbricksetPlayerBrickSetParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_6);
            lv_playerbrickset_22_0=rulePlayerBrickSet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoardRule());
            					}
            					add(
            						current,
            						"playerbrickset",
            						lv_playerbrickset_22_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardgameDL.PlayerBrickSet");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBoardgameDL.g:372:3: (otherlv_23= ',' ( (lv_playerbrickset_24_0= rulePlayerBrickSet ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBoardgameDL.g:373:4: otherlv_23= ',' ( (lv_playerbrickset_24_0= rulePlayerBrickSet ) )
            	    {
            	    otherlv_23=(Token)match(input,14,FOLLOW_18); 

            	    				newLeafNode(otherlv_23, grammarAccess.getBoardAccess().getCommaKeyword_17_0());
            	    			
            	    // InternalBoardgameDL.g:377:4: ( (lv_playerbrickset_24_0= rulePlayerBrickSet ) )
            	    // InternalBoardgameDL.g:378:5: (lv_playerbrickset_24_0= rulePlayerBrickSet )
            	    {
            	    // InternalBoardgameDL.g:378:5: (lv_playerbrickset_24_0= rulePlayerBrickSet )
            	    // InternalBoardgameDL.g:379:6: lv_playerbrickset_24_0= rulePlayerBrickSet
            	    {

            	    						newCompositeNode(grammarAccess.getBoardAccess().getPlayerbricksetPlayerBrickSetParserRuleCall_17_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_playerbrickset_24_0=rulePlayerBrickSet();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBoardRule());
            	    						}
            	    						add(
            	    							current,
            	    							"playerbrickset",
            	    							lv_playerbrickset_24_0,
            	    							"no.ntnu.tdt4250.g07.bg.bgdl.BoardgameDL.PlayerBrickSet");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_25=(Token)match(input,15,FOLLOW_19); 

            			newLeafNode(otherlv_25, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_18());
            		
            otherlv_26=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_26, grammarAccess.getBoardAccess().getValidmoveKeyword_19());
            		
            otherlv_27=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_27, grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_20());
            		
            // InternalBoardgameDL.g:409:3: ( (lv_validmove_28_0= ruleValidMove ) )
            // InternalBoardgameDL.g:410:4: (lv_validmove_28_0= ruleValidMove )
            {
            // InternalBoardgameDL.g:410:4: (lv_validmove_28_0= ruleValidMove )
            // InternalBoardgameDL.g:411:5: lv_validmove_28_0= ruleValidMove
            {

            					newCompositeNode(grammarAccess.getBoardAccess().getValidmoveValidMoveParserRuleCall_21_0());
            				
            pushFollow(FOLLOW_6);
            lv_validmove_28_0=ruleValidMove();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoardRule());
            					}
            					add(
            						current,
            						"validmove",
            						lv_validmove_28_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardgameDL.ValidMove");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBoardgameDL.g:428:3: (otherlv_29= ',' ( (lv_validmove_30_0= ruleValidMove ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBoardgameDL.g:429:4: otherlv_29= ',' ( (lv_validmove_30_0= ruleValidMove ) )
            	    {
            	    otherlv_29=(Token)match(input,14,FOLLOW_20); 

            	    				newLeafNode(otherlv_29, grammarAccess.getBoardAccess().getCommaKeyword_22_0());
            	    			
            	    // InternalBoardgameDL.g:433:4: ( (lv_validmove_30_0= ruleValidMove ) )
            	    // InternalBoardgameDL.g:434:5: (lv_validmove_30_0= ruleValidMove )
            	    {
            	    // InternalBoardgameDL.g:434:5: (lv_validmove_30_0= ruleValidMove )
            	    // InternalBoardgameDL.g:435:6: lv_validmove_30_0= ruleValidMove
            	    {

            	    						newCompositeNode(grammarAccess.getBoardAccess().getValidmoveValidMoveParserRuleCall_22_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_validmove_30_0=ruleValidMove();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBoardRule());
            	    						}
            	    						add(
            	    							current,
            	    							"validmove",
            	    							lv_validmove_30_0,
            	    							"no.ntnu.tdt4250.g07.bg.bgdl.BoardgameDL.ValidMove");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_31=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_31, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_23());
            		
            otherlv_32=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_32, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_24());
            		

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
    // $ANTLR end "ruleBoard"


    // $ANTLR start "entryRuleEString"
    // InternalBoardgameDL.g:465:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBoardgameDL.g:465:47: (iv_ruleEString= ruleEString EOF )
            // InternalBoardgameDL.g:466:2: iv_ruleEString= ruleEString EOF
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
    // InternalBoardgameDL.g:472:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBoardgameDL.g:478:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBoardgameDL.g:479:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBoardgameDL.g:479:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalBoardgameDL.g:480:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBoardgameDL.g:488:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRulePlayerBrickSet"
    // InternalBoardgameDL.g:499:1: entryRulePlayerBrickSet returns [EObject current=null] : iv_rulePlayerBrickSet= rulePlayerBrickSet EOF ;
    public final EObject entryRulePlayerBrickSet() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlayerBrickSet = null;


        try {
            // InternalBoardgameDL.g:499:55: (iv_rulePlayerBrickSet= rulePlayerBrickSet EOF )
            // InternalBoardgameDL.g:500:2: iv_rulePlayerBrickSet= rulePlayerBrickSet EOF
            {
             newCompositeNode(grammarAccess.getPlayerBrickSetRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlayerBrickSet=rulePlayerBrickSet();

            state._fsp--;

             current =iv_rulePlayerBrickSet; 
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
    // $ANTLR end "entryRulePlayerBrickSet"


    // $ANTLR start "rulePlayerBrickSet"
    // InternalBoardgameDL.g:506:1: rulePlayerBrickSet returns [EObject current=null] : (otherlv_0= 'PlayerBrickSet' otherlv_1= '{' otherlv_2= 'Name' ( (lv_Name_3_0= ruleEString ) ) otherlv_4= 'win' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' (otherlv_10= 'draw' ( ( ruleEString ) ) )? otherlv_12= 'brick' otherlv_13= '{' ( (lv_brick_14_0= ruleBrick ) ) (otherlv_15= ',' ( (lv_brick_16_0= ruleBrick ) ) )* otherlv_17= '}' otherlv_18= '}' ) ;
    public final EObject rulePlayerBrickSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_Name_3_0 = null;

        EObject lv_brick_14_0 = null;

        EObject lv_brick_16_0 = null;



        	enterRule();

        try {
            // InternalBoardgameDL.g:512:2: ( (otherlv_0= 'PlayerBrickSet' otherlv_1= '{' otherlv_2= 'Name' ( (lv_Name_3_0= ruleEString ) ) otherlv_4= 'win' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' (otherlv_10= 'draw' ( ( ruleEString ) ) )? otherlv_12= 'brick' otherlv_13= '{' ( (lv_brick_14_0= ruleBrick ) ) (otherlv_15= ',' ( (lv_brick_16_0= ruleBrick ) ) )* otherlv_17= '}' otherlv_18= '}' ) )
            // InternalBoardgameDL.g:513:2: (otherlv_0= 'PlayerBrickSet' otherlv_1= '{' otherlv_2= 'Name' ( (lv_Name_3_0= ruleEString ) ) otherlv_4= 'win' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' (otherlv_10= 'draw' ( ( ruleEString ) ) )? otherlv_12= 'brick' otherlv_13= '{' ( (lv_brick_14_0= ruleBrick ) ) (otherlv_15= ',' ( (lv_brick_16_0= ruleBrick ) ) )* otherlv_17= '}' otherlv_18= '}' )
            {
            // InternalBoardgameDL.g:513:2: (otherlv_0= 'PlayerBrickSet' otherlv_1= '{' otherlv_2= 'Name' ( (lv_Name_3_0= ruleEString ) ) otherlv_4= 'win' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' (otherlv_10= 'draw' ( ( ruleEString ) ) )? otherlv_12= 'brick' otherlv_13= '{' ( (lv_brick_14_0= ruleBrick ) ) (otherlv_15= ',' ( (lv_brick_16_0= ruleBrick ) ) )* otherlv_17= '}' otherlv_18= '}' )
            // InternalBoardgameDL.g:514:3: otherlv_0= 'PlayerBrickSet' otherlv_1= '{' otherlv_2= 'Name' ( (lv_Name_3_0= ruleEString ) ) otherlv_4= 'win' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' (otherlv_10= 'draw' ( ( ruleEString ) ) )? otherlv_12= 'brick' otherlv_13= '{' ( (lv_brick_14_0= ruleBrick ) ) (otherlv_15= ',' ( (lv_brick_16_0= ruleBrick ) ) )* otherlv_17= '}' otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlayerBrickSetAccess().getPlayerBrickSetKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getPlayerBrickSetAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getPlayerBrickSetAccess().getNameKeyword_2());
            		
            // InternalBoardgameDL.g:526:3: ( (lv_Name_3_0= ruleEString ) )
            // InternalBoardgameDL.g:527:4: (lv_Name_3_0= ruleEString )
            {
            // InternalBoardgameDL.g:527:4: (lv_Name_3_0= ruleEString )
            // InternalBoardgameDL.g:528:5: lv_Name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPlayerBrickSetAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_Name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlayerBrickSetRule());
            					}
            					set(
            						current,
            						"Name",
            						lv_Name_3_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardgameDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getPlayerBrickSetAccess().getWinKeyword_4());
            		
            otherlv_5=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getPlayerBrickSetAccess().getLeftParenthesisKeyword_5());
            		
            // InternalBoardgameDL.g:553:3: ( ( ruleEString ) )
            // InternalBoardgameDL.g:554:4: ( ruleEString )
            {
            // InternalBoardgameDL.g:554:4: ( ruleEString )
            // InternalBoardgameDL.g:555:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlayerBrickSetRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlayerBrickSetAccess().getWinOutcomeCrossReference_6_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBoardgameDL.g:569:3: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBoardgameDL.g:570:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,14,FOLLOW_9); 

            	    				newLeafNode(otherlv_7, grammarAccess.getPlayerBrickSetAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalBoardgameDL.g:574:4: ( ( ruleEString ) )
            	    // InternalBoardgameDL.g:575:5: ( ruleEString )
            	    {
            	    // InternalBoardgameDL.g:575:5: ( ruleEString )
            	    // InternalBoardgameDL.g:576:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPlayerBrickSetRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getPlayerBrickSetAccess().getWinOutcomeCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
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

            otherlv_9=(Token)match(input,22,FOLLOW_22); 

            			newLeafNode(otherlv_9, grammarAccess.getPlayerBrickSetAccess().getRightParenthesisKeyword_8());
            		
            // InternalBoardgameDL.g:595:3: (otherlv_10= 'draw' ( ( ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBoardgameDL.g:596:4: otherlv_10= 'draw' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,28,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getPlayerBrickSetAccess().getDrawKeyword_9_0());
                    			
                    // InternalBoardgameDL.g:600:4: ( ( ruleEString ) )
                    // InternalBoardgameDL.g:601:5: ( ruleEString )
                    {
                    // InternalBoardgameDL.g:601:5: ( ruleEString )
                    // InternalBoardgameDL.g:602:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlayerBrickSetRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPlayerBrickSetAccess().getDrawOutcomeCrossReference_9_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getPlayerBrickSetAccess().getBrickKeyword_10());
            		
            otherlv_13=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_13, grammarAccess.getPlayerBrickSetAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalBoardgameDL.g:625:3: ( (lv_brick_14_0= ruleBrick ) )
            // InternalBoardgameDL.g:626:4: (lv_brick_14_0= ruleBrick )
            {
            // InternalBoardgameDL.g:626:4: (lv_brick_14_0= ruleBrick )
            // InternalBoardgameDL.g:627:5: lv_brick_14_0= ruleBrick
            {

            					newCompositeNode(grammarAccess.getPlayerBrickSetAccess().getBrickBrickParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_6);
            lv_brick_14_0=ruleBrick();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlayerBrickSetRule());
            					}
            					add(
            						current,
            						"brick",
            						lv_brick_14_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardgameDL.Brick");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBoardgameDL.g:644:3: (otherlv_15= ',' ( (lv_brick_16_0= ruleBrick ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==14) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBoardgameDL.g:645:4: otherlv_15= ',' ( (lv_brick_16_0= ruleBrick ) )
            	    {
            	    otherlv_15=(Token)match(input,14,FOLLOW_24); 

            	    				newLeafNode(otherlv_15, grammarAccess.getPlayerBrickSetAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalBoardgameDL.g:649:4: ( (lv_brick_16_0= ruleBrick ) )
            	    // InternalBoardgameDL.g:650:5: (lv_brick_16_0= ruleBrick )
            	    {
            	    // InternalBoardgameDL.g:650:5: (lv_brick_16_0= ruleBrick )
            	    // InternalBoardgameDL.g:651:6: lv_brick_16_0= ruleBrick
            	    {

            	    						newCompositeNode(grammarAccess.getPlayerBrickSetAccess().getBrickBrickParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_brick_16_0=ruleBrick();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlayerBrickSetRule());
            	    						}
            	    						add(
            	    							current,
            	    							"brick",
            	    							lv_brick_16_0,
            	    							"no.ntnu.tdt4250.g07.bg.bgdl.BoardgameDL.Brick");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_17=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_17, grammarAccess.getPlayerBrickSetAccess().getRightCurlyBracketKeyword_14());
            		
            otherlv_18=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getPlayerBrickSetAccess().getRightCurlyBracketKeyword_15());
            		

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
    // $ANTLR end "rulePlayerBrickSet"


    // $ANTLR start "entryRuleEInt"
    // InternalBoardgameDL.g:681:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalBoardgameDL.g:681:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalBoardgameDL.g:682:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalBoardgameDL.g:688:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalBoardgameDL.g:694:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalBoardgameDL.g:695:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalBoardgameDL.g:695:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalBoardgameDL.g:696:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalBoardgameDL.g:696:3: (kw= '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBoardgameDL.g:697:4: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_25); 

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


    // $ANTLR start "entryRuleValidMove"
    // InternalBoardgameDL.g:714:1: entryRuleValidMove returns [EObject current=null] : iv_ruleValidMove= ruleValidMove EOF ;
    public final EObject entryRuleValidMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidMove = null;


        try {
            // InternalBoardgameDL.g:714:50: (iv_ruleValidMove= ruleValidMove EOF )
            // InternalBoardgameDL.g:715:2: iv_ruleValidMove= ruleValidMove EOF
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
    // InternalBoardgameDL.g:721:1: ruleValidMove returns [EObject current=null] : (otherlv_0= 'ValidMove' otherlv_1= '{' otherlv_2= 'Name' ( (lv_Name_3_0= ruleEString ) ) (otherlv_4= 'brickchange' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'cellchange' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
    public final EObject ruleValidMove() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_Name_3_0 = null;



        	enterRule();

        try {
            // InternalBoardgameDL.g:727:2: ( (otherlv_0= 'ValidMove' otherlv_1= '{' otherlv_2= 'Name' ( (lv_Name_3_0= ruleEString ) ) (otherlv_4= 'brickchange' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'cellchange' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalBoardgameDL.g:728:2: (otherlv_0= 'ValidMove' otherlv_1= '{' otherlv_2= 'Name' ( (lv_Name_3_0= ruleEString ) ) (otherlv_4= 'brickchange' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'cellchange' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalBoardgameDL.g:728:2: (otherlv_0= 'ValidMove' otherlv_1= '{' otherlv_2= 'Name' ( (lv_Name_3_0= ruleEString ) ) (otherlv_4= 'brickchange' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'cellchange' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalBoardgameDL.g:729:3: otherlv_0= 'ValidMove' otherlv_1= '{' otherlv_2= 'Name' ( (lv_Name_3_0= ruleEString ) ) (otherlv_4= 'brickchange' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'cellchange' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getValidMoveAccess().getValidMoveKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getValidMoveAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getValidMoveAccess().getNameKeyword_2());
            		
            // InternalBoardgameDL.g:741:3: ( (lv_Name_3_0= ruleEString ) )
            // InternalBoardgameDL.g:742:4: (lv_Name_3_0= ruleEString )
            {
            // InternalBoardgameDL.g:742:4: (lv_Name_3_0= ruleEString )
            // InternalBoardgameDL.g:743:5: lv_Name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getValidMoveAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
            lv_Name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValidMoveRule());
            					}
            					set(
            						current,
            						"Name",
            						lv_Name_3_0,
            						"no.ntnu.tdt4250.g07.bg.bgdl.BoardgameDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBoardgameDL.g:760:3: (otherlv_4= 'brickchange' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBoardgameDL.g:761:4: otherlv_4= 'brickchange' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getValidMoveAccess().getBrickchangeKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,21,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getValidMoveAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalBoardgameDL.g:769:4: ( ( ruleEString ) )
                    // InternalBoardgameDL.g:770:5: ( ruleEString )
                    {
                    // InternalBoardgameDL.g:770:5: ( ruleEString )
                    // InternalBoardgameDL.g:771:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValidMoveRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getValidMoveAccess().getBrickchangeBrickChangeCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBoardgameDL.g:785:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalBoardgameDL.g:786:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getValidMoveAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalBoardgameDL.g:790:5: ( ( ruleEString ) )
                    	    // InternalBoardgameDL.g:791:6: ( ruleEString )
                    	    {
                    	    // InternalBoardgameDL.g:791:6: ( ruleEString )
                    	    // InternalBoardgameDL.g:792:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getValidMoveRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getValidMoveAccess().getBrickchangeBrickChangeCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,22,FOLLOW_27); 

                    				newLeafNode(otherlv_9, grammarAccess.getValidMoveAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalBoardgameDL.g:812:3: (otherlv_10= 'cellchange' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBoardgameDL.g:813:4: otherlv_10= 'cellchange' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,33,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getValidMoveAccess().getCellchangeKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,21,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getValidMoveAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalBoardgameDL.g:821:4: ( ( ruleEString ) )
                    // InternalBoardgameDL.g:822:5: ( ruleEString )
                    {
                    // InternalBoardgameDL.g:822:5: ( ruleEString )
                    // InternalBoardgameDL.g:823:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValidMoveRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getValidMoveAccess().getCellchangeCellChangeCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBoardgameDL.g:837:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalBoardgameDL.g:838:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getValidMoveAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalBoardgameDL.g:842:5: ( ( ruleEString ) )
                    	    // InternalBoardgameDL.g:843:6: ( ruleEString )
                    	    {
                    	    // InternalBoardgameDL.g:843:6: ( ruleEString )
                    	    // InternalBoardgameDL.g:844:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getValidMoveRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getValidMoveAccess().getCellchangeCellChangeCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,22,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getValidMoveAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getValidMoveAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleBrick"
    // InternalBoardgameDL.g:872:1: entryRuleBrick returns [EObject current=null] : iv_ruleBrick= ruleBrick EOF ;
    public final EObject entryRuleBrick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrick = null;


        try {
            // InternalBoardgameDL.g:872:46: (iv_ruleBrick= ruleBrick EOF )
            // InternalBoardgameDL.g:873:2: iv_ruleBrick= ruleBrick EOF
            {
             newCompositeNode(grammarAccess.getBrickRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBrick=ruleBrick();

            state._fsp--;

             current =iv_ruleBrick; 
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
    // $ANTLR end "entryRuleBrick"


    // $ANTLR start "ruleBrick"
    // InternalBoardgameDL.g:879:1: ruleBrick returns [EObject current=null] : (otherlv_0= 'Brick' otherlv_1= '{' otherlv_2= 'bricktype' ( ( ruleEString ) ) (otherlv_4= 'startCell' ( ( ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleBrick() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalBoardgameDL.g:885:2: ( (otherlv_0= 'Brick' otherlv_1= '{' otherlv_2= 'bricktype' ( ( ruleEString ) ) (otherlv_4= 'startCell' ( ( ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalBoardgameDL.g:886:2: (otherlv_0= 'Brick' otherlv_1= '{' otherlv_2= 'bricktype' ( ( ruleEString ) ) (otherlv_4= 'startCell' ( ( ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalBoardgameDL.g:886:2: (otherlv_0= 'Brick' otherlv_1= '{' otherlv_2= 'bricktype' ( ( ruleEString ) ) (otherlv_4= 'startCell' ( ( ruleEString ) ) )? otherlv_6= '}' )
            // InternalBoardgameDL.g:887:3: otherlv_0= 'Brick' otherlv_1= '{' otherlv_2= 'bricktype' ( ( ruleEString ) ) (otherlv_4= 'startCell' ( ( ruleEString ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBrickAccess().getBrickKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getBrickAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getBrickAccess().getBricktypeKeyword_2());
            		
            // InternalBoardgameDL.g:899:3: ( ( ruleEString ) )
            // InternalBoardgameDL.g:900:4: ( ruleEString )
            {
            // InternalBoardgameDL.g:900:4: ( ruleEString )
            // InternalBoardgameDL.g:901:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBrickRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBrickAccess().getBricktypeBrickTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_29);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBoardgameDL.g:915:3: (otherlv_4= 'startCell' ( ( ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBoardgameDL.g:916:4: otherlv_4= 'startCell' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getBrickAccess().getStartCellKeyword_4_0());
                    			
                    // InternalBoardgameDL.g:920:4: ( ( ruleEString ) )
                    // InternalBoardgameDL.g:921:5: ( ruleEString )
                    {
                    // InternalBoardgameDL.g:921:5: ( ruleEString )
                    // InternalBoardgameDL.g:922:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBrickRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBrickAccess().getStartCellCellCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBrickAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleBrick"


    // $ANTLR start "entryRuleLineElement"
    // InternalBoardgameDL.g:945:1: entryRuleLineElement returns [EObject current=null] : iv_ruleLineElement= ruleLineElement EOF ;
    public final EObject entryRuleLineElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineElement = null;


        try {
            // InternalBoardgameDL.g:945:52: (iv_ruleLineElement= ruleLineElement EOF )
            // InternalBoardgameDL.g:946:2: iv_ruleLineElement= ruleLineElement EOF
            {
             newCompositeNode(grammarAccess.getLineElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLineElement=ruleLineElement();

            state._fsp--;

             current =iv_ruleLineElement; 
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
    // $ANTLR end "entryRuleLineElement"


    // $ANTLR start "ruleLineElement"
    // InternalBoardgameDL.g:952:1: ruleLineElement returns [EObject current=null] : ( () otherlv_1= 'LineElement' otherlv_2= '{' (otherlv_3= 'Position' ( (lv_Position_4_0= ruleEInt ) ) )? (otherlv_5= 'celltype' ( ( ruleEString ) ) )? (otherlv_7= 'cellstate' ( ( ruleEString ) ) )? (otherlv_9= 'brickstate' ( ( ruleEString ) ) )? (otherlv_11= 'bricktype' ( ( ruleEString ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleLineElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_Position_4_0 = null;



        	enterRule();

        try {
            // InternalBoardgameDL.g:958:2: ( ( () otherlv_1= 'LineElement' otherlv_2= '{' (otherlv_3= 'Position' ( (lv_Position_4_0= ruleEInt ) ) )? (otherlv_5= 'celltype' ( ( ruleEString ) ) )? (otherlv_7= 'cellstate' ( ( ruleEString ) ) )? (otherlv_9= 'brickstate' ( ( ruleEString ) ) )? (otherlv_11= 'bricktype' ( ( ruleEString ) ) )? otherlv_13= '}' ) )
            // InternalBoardgameDL.g:959:2: ( () otherlv_1= 'LineElement' otherlv_2= '{' (otherlv_3= 'Position' ( (lv_Position_4_0= ruleEInt ) ) )? (otherlv_5= 'celltype' ( ( ruleEString ) ) )? (otherlv_7= 'cellstate' ( ( ruleEString ) ) )? (otherlv_9= 'brickstate' ( ( ruleEString ) ) )? (otherlv_11= 'bricktype' ( ( ruleEString ) ) )? otherlv_13= '}' )
            {
            // InternalBoardgameDL.g:959:2: ( () otherlv_1= 'LineElement' otherlv_2= '{' (otherlv_3= 'Position' ( (lv_Position_4_0= ruleEInt ) ) )? (otherlv_5= 'celltype' ( ( ruleEString ) ) )? (otherlv_7= 'cellstate' ( ( ruleEString ) ) )? (otherlv_9= 'brickstate' ( ( ruleEString ) ) )? (otherlv_11= 'bricktype' ( ( ruleEString ) ) )? otherlv_13= '}' )
            // InternalBoardgameDL.g:960:3: () otherlv_1= 'LineElement' otherlv_2= '{' (otherlv_3= 'Position' ( (lv_Position_4_0= ruleEInt ) ) )? (otherlv_5= 'celltype' ( ( ruleEString ) ) )? (otherlv_7= 'cellstate' ( ( ruleEString ) ) )? (otherlv_9= 'brickstate' ( ( ruleEString ) ) )? (otherlv_11= 'bricktype' ( ( ruleEString ) ) )? otherlv_13= '}'
            {
            // InternalBoardgameDL.g:960:3: ()
            // InternalBoardgameDL.g:961:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLineElementAccess().getLineElementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLineElementAccess().getLineElementKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getLineElementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBoardgameDL.g:975:3: (otherlv_3= 'Position' ( (lv_Position_4_0= ruleEInt ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==38) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBoardgameDL.g:976:4: otherlv_3= 'Position' ( (lv_Position_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getLineElementAccess().getPositionKeyword_3_0());
                    			
                    // InternalBoardgameDL.g:980:4: ( (lv_Position_4_0= ruleEInt ) )
                    // InternalBoardgameDL.g:981:5: (lv_Position_4_0= ruleEInt )
                    {
                    // InternalBoardgameDL.g:981:5: (lv_Position_4_0= ruleEInt )
                    // InternalBoardgameDL.g:982:6: lv_Position_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getLineElementAccess().getPositionEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_Position_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineElementRule());
                    						}
                    						set(
                    							current,
                    							"Position",
                    							lv_Position_4_0,
                    							"no.ntnu.tdt4250.g07.bg.bgdl.BoardgameDL.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBoardgameDL.g:1000:3: (otherlv_5= 'celltype' ( ( ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBoardgameDL.g:1001:4: otherlv_5= 'celltype' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,39,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getLineElementAccess().getCelltypeKeyword_4_0());
                    			
                    // InternalBoardgameDL.g:1005:4: ( ( ruleEString ) )
                    // InternalBoardgameDL.g:1006:5: ( ruleEString )
                    {
                    // InternalBoardgameDL.g:1006:5: ( ruleEString )
                    // InternalBoardgameDL.g:1007:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLineElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLineElementAccess().getCelltypeCellTypeCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBoardgameDL.g:1022:3: (otherlv_7= 'cellstate' ( ( ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==40) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBoardgameDL.g:1023:4: otherlv_7= 'cellstate' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,40,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getLineElementAccess().getCellstateKeyword_5_0());
                    			
                    // InternalBoardgameDL.g:1027:4: ( ( ruleEString ) )
                    // InternalBoardgameDL.g:1028:5: ( ruleEString )
                    {
                    // InternalBoardgameDL.g:1028:5: ( ruleEString )
                    // InternalBoardgameDL.g:1029:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLineElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLineElementAccess().getCellstateCellStateCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBoardgameDL.g:1044:3: (otherlv_9= 'brickstate' ( ( ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==41) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBoardgameDL.g:1045:4: otherlv_9= 'brickstate' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,41,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getLineElementAccess().getBrickstateKeyword_6_0());
                    			
                    // InternalBoardgameDL.g:1049:4: ( ( ruleEString ) )
                    // InternalBoardgameDL.g:1050:5: ( ruleEString )
                    {
                    // InternalBoardgameDL.g:1050:5: ( ruleEString )
                    // InternalBoardgameDL.g:1051:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLineElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLineElementAccess().getBrickstateBrickStateCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBoardgameDL.g:1066:3: (otherlv_11= 'bricktype' ( ( ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBoardgameDL.g:1067:4: otherlv_11= 'bricktype' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,35,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getLineElementAccess().getBricktypeKeyword_7_0());
                    			
                    // InternalBoardgameDL.g:1071:4: ( ( ruleEString ) )
                    // InternalBoardgameDL.g:1072:5: ( ruleEString )
                    {
                    // InternalBoardgameDL.g:1072:5: ( ruleEString )
                    // InternalBoardgameDL.g:1073:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLineElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLineElementAccess().getBricktypeBrickTypeCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getLineElementAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleLineElement"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000300008000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000003C800008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000038800008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000030800008000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020800008000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800008000L});

}