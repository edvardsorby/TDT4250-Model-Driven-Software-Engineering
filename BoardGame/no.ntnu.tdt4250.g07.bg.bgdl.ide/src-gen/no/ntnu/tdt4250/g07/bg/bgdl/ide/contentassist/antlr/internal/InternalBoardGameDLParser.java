package no.ntnu.tdt4250.g07.bg.bgdl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import no.ntnu.tdt4250.g07.bg.bgdl.services.BoardGameDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBoardGameDLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ROW'", "'COLUMN'", "'DIAGONAL'", "'Title'", "'BoardSize'", "'PieceType'", "'{'", "'Symbol'", "'ValidMoves'", "'}'", "','", "'EffectsOnCell'", "'Cellstate'", "'WinCondition'", "'-'", "'ValidMove'", "'valid'", "'if'", "'and'", "'EffectOnCell'", "'relativePosition'", "'('", "')'", "'newCellState'", "'Condition'", "'Line'", "'length'", "'direction'", "'placeAnywhere'"
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

    	public void setGrammarAccess(BoardGameDLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleBoardGame"
    // InternalBoardGameDL.g:53:1: entryRuleBoardGame : ruleBoardGame EOF ;
    public final void entryRuleBoardGame() throws RecognitionException {
        try {
            // InternalBoardGameDL.g:54:1: ( ruleBoardGame EOF )
            // InternalBoardGameDL.g:55:1: ruleBoardGame EOF
            {
             before(grammarAccess.getBoardGameRule()); 
            pushFollow(FOLLOW_1);
            ruleBoardGame();

            state._fsp--;

             after(grammarAccess.getBoardGameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoardGame"


    // $ANTLR start "ruleBoardGame"
    // InternalBoardGameDL.g:62:1: ruleBoardGame : ( ( rule__BoardGame__Group__0 ) ) ;
    public final void ruleBoardGame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:66:2: ( ( ( rule__BoardGame__Group__0 ) ) )
            // InternalBoardGameDL.g:67:2: ( ( rule__BoardGame__Group__0 ) )
            {
            // InternalBoardGameDL.g:67:2: ( ( rule__BoardGame__Group__0 ) )
            // InternalBoardGameDL.g:68:3: ( rule__BoardGame__Group__0 )
            {
             before(grammarAccess.getBoardGameAccess().getGroup()); 
            // InternalBoardGameDL.g:69:3: ( rule__BoardGame__Group__0 )
            // InternalBoardGameDL.g:69:4: rule__BoardGame__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BoardGame__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoardGameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoardGame"


    // $ANTLR start "entryRuleBoardGameElement"
    // InternalBoardGameDL.g:78:1: entryRuleBoardGameElement : ruleBoardGameElement EOF ;
    public final void entryRuleBoardGameElement() throws RecognitionException {
        try {
            // InternalBoardGameDL.g:79:1: ( ruleBoardGameElement EOF )
            // InternalBoardGameDL.g:80:1: ruleBoardGameElement EOF
            {
             before(grammarAccess.getBoardGameElementRule()); 
            pushFollow(FOLLOW_1);
            ruleBoardGameElement();

            state._fsp--;

             after(grammarAccess.getBoardGameElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoardGameElement"


    // $ANTLR start "ruleBoardGameElement"
    // InternalBoardGameDL.g:87:1: ruleBoardGameElement : ( ( rule__BoardGameElement__Alternatives ) ) ;
    public final void ruleBoardGameElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:91:2: ( ( ( rule__BoardGameElement__Alternatives ) ) )
            // InternalBoardGameDL.g:92:2: ( ( rule__BoardGameElement__Alternatives ) )
            {
            // InternalBoardGameDL.g:92:2: ( ( rule__BoardGameElement__Alternatives ) )
            // InternalBoardGameDL.g:93:3: ( rule__BoardGameElement__Alternatives )
            {
             before(grammarAccess.getBoardGameElementAccess().getAlternatives()); 
            // InternalBoardGameDL.g:94:3: ( rule__BoardGameElement__Alternatives )
            // InternalBoardGameDL.g:94:4: rule__BoardGameElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BoardGameElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBoardGameElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoardGameElement"


    // $ANTLR start "entryRulePieceType"
    // InternalBoardGameDL.g:103:1: entryRulePieceType : rulePieceType EOF ;
    public final void entryRulePieceType() throws RecognitionException {
        try {
            // InternalBoardGameDL.g:104:1: ( rulePieceType EOF )
            // InternalBoardGameDL.g:105:1: rulePieceType EOF
            {
             before(grammarAccess.getPieceTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePieceType();

            state._fsp--;

             after(grammarAccess.getPieceTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePieceType"


    // $ANTLR start "rulePieceType"
    // InternalBoardGameDL.g:112:1: rulePieceType : ( ( rule__PieceType__Group__0 ) ) ;
    public final void rulePieceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:116:2: ( ( ( rule__PieceType__Group__0 ) ) )
            // InternalBoardGameDL.g:117:2: ( ( rule__PieceType__Group__0 ) )
            {
            // InternalBoardGameDL.g:117:2: ( ( rule__PieceType__Group__0 ) )
            // InternalBoardGameDL.g:118:3: ( rule__PieceType__Group__0 )
            {
             before(grammarAccess.getPieceTypeAccess().getGroup()); 
            // InternalBoardGameDL.g:119:3: ( rule__PieceType__Group__0 )
            // InternalBoardGameDL.g:119:4: rule__PieceType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPieceTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePieceType"


    // $ANTLR start "entryRuleCellState"
    // InternalBoardGameDL.g:128:1: entryRuleCellState : ruleCellState EOF ;
    public final void entryRuleCellState() throws RecognitionException {
        try {
            // InternalBoardGameDL.g:129:1: ( ruleCellState EOF )
            // InternalBoardGameDL.g:130:1: ruleCellState EOF
            {
             before(grammarAccess.getCellStateRule()); 
            pushFollow(FOLLOW_1);
            ruleCellState();

            state._fsp--;

             after(grammarAccess.getCellStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCellState"


    // $ANTLR start "ruleCellState"
    // InternalBoardGameDL.g:137:1: ruleCellState : ( ( rule__CellState__Group__0 ) ) ;
    public final void ruleCellState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:141:2: ( ( ( rule__CellState__Group__0 ) ) )
            // InternalBoardGameDL.g:142:2: ( ( rule__CellState__Group__0 ) )
            {
            // InternalBoardGameDL.g:142:2: ( ( rule__CellState__Group__0 ) )
            // InternalBoardGameDL.g:143:3: ( rule__CellState__Group__0 )
            {
             before(grammarAccess.getCellStateAccess().getGroup()); 
            // InternalBoardGameDL.g:144:3: ( rule__CellState__Group__0 )
            // InternalBoardGameDL.g:144:4: rule__CellState__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CellState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCellStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCellState"


    // $ANTLR start "entryRuleWinCondition"
    // InternalBoardGameDL.g:153:1: entryRuleWinCondition : ruleWinCondition EOF ;
    public final void entryRuleWinCondition() throws RecognitionException {
        try {
            // InternalBoardGameDL.g:154:1: ( ruleWinCondition EOF )
            // InternalBoardGameDL.g:155:1: ruleWinCondition EOF
            {
             before(grammarAccess.getWinConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleWinCondition();

            state._fsp--;

             after(grammarAccess.getWinConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWinCondition"


    // $ANTLR start "ruleWinCondition"
    // InternalBoardGameDL.g:162:1: ruleWinCondition : ( ( rule__WinCondition__Group__0 ) ) ;
    public final void ruleWinCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:166:2: ( ( ( rule__WinCondition__Group__0 ) ) )
            // InternalBoardGameDL.g:167:2: ( ( rule__WinCondition__Group__0 ) )
            {
            // InternalBoardGameDL.g:167:2: ( ( rule__WinCondition__Group__0 ) )
            // InternalBoardGameDL.g:168:3: ( rule__WinCondition__Group__0 )
            {
             before(grammarAccess.getWinConditionAccess().getGroup()); 
            // InternalBoardGameDL.g:169:3: ( rule__WinCondition__Group__0 )
            // InternalBoardGameDL.g:169:4: rule__WinCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WinCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWinConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWinCondition"


    // $ANTLR start "entryRuleEInt"
    // InternalBoardGameDL.g:178:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalBoardGameDL.g:179:1: ( ruleEInt EOF )
            // InternalBoardGameDL.g:180:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalBoardGameDL.g:187:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:191:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalBoardGameDL.g:192:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalBoardGameDL.g:192:2: ( ( rule__EInt__Group__0 ) )
            // InternalBoardGameDL.g:193:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalBoardGameDL.g:194:3: ( rule__EInt__Group__0 )
            // InternalBoardGameDL.g:194:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // InternalBoardGameDL.g:203:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalBoardGameDL.g:204:1: ( ruleEString EOF )
            // InternalBoardGameDL.g:205:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalBoardGameDL.g:212:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:216:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalBoardGameDL.g:217:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalBoardGameDL.g:217:2: ( ( rule__EString__Alternatives ) )
            // InternalBoardGameDL.g:218:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalBoardGameDL.g:219:3: ( rule__EString__Alternatives )
            // InternalBoardGameDL.g:219:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleValidMove"
    // InternalBoardGameDL.g:228:1: entryRuleValidMove : ruleValidMove EOF ;
    public final void entryRuleValidMove() throws RecognitionException {
        try {
            // InternalBoardGameDL.g:229:1: ( ruleValidMove EOF )
            // InternalBoardGameDL.g:230:1: ruleValidMove EOF
            {
             before(grammarAccess.getValidMoveRule()); 
            pushFollow(FOLLOW_1);
            ruleValidMove();

            state._fsp--;

             after(grammarAccess.getValidMoveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValidMove"


    // $ANTLR start "ruleValidMove"
    // InternalBoardGameDL.g:237:1: ruleValidMove : ( ( rule__ValidMove__Group__0 ) ) ;
    public final void ruleValidMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:241:2: ( ( ( rule__ValidMove__Group__0 ) ) )
            // InternalBoardGameDL.g:242:2: ( ( rule__ValidMove__Group__0 ) )
            {
            // InternalBoardGameDL.g:242:2: ( ( rule__ValidMove__Group__0 ) )
            // InternalBoardGameDL.g:243:3: ( rule__ValidMove__Group__0 )
            {
             before(grammarAccess.getValidMoveAccess().getGroup()); 
            // InternalBoardGameDL.g:244:3: ( rule__ValidMove__Group__0 )
            // InternalBoardGameDL.g:244:4: rule__ValidMove__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ValidMove__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValidMoveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValidMove"


    // $ANTLR start "entryRuleEffectOnCell"
    // InternalBoardGameDL.g:253:1: entryRuleEffectOnCell : ruleEffectOnCell EOF ;
    public final void entryRuleEffectOnCell() throws RecognitionException {
        try {
            // InternalBoardGameDL.g:254:1: ( ruleEffectOnCell EOF )
            // InternalBoardGameDL.g:255:1: ruleEffectOnCell EOF
            {
             before(grammarAccess.getEffectOnCellRule()); 
            pushFollow(FOLLOW_1);
            ruleEffectOnCell();

            state._fsp--;

             after(grammarAccess.getEffectOnCellRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEffectOnCell"


    // $ANTLR start "ruleEffectOnCell"
    // InternalBoardGameDL.g:262:1: ruleEffectOnCell : ( ( rule__EffectOnCell__Group__0 ) ) ;
    public final void ruleEffectOnCell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:266:2: ( ( ( rule__EffectOnCell__Group__0 ) ) )
            // InternalBoardGameDL.g:267:2: ( ( rule__EffectOnCell__Group__0 ) )
            {
            // InternalBoardGameDL.g:267:2: ( ( rule__EffectOnCell__Group__0 ) )
            // InternalBoardGameDL.g:268:3: ( rule__EffectOnCell__Group__0 )
            {
             before(grammarAccess.getEffectOnCellAccess().getGroup()); 
            // InternalBoardGameDL.g:269:3: ( rule__EffectOnCell__Group__0 )
            // InternalBoardGameDL.g:269:4: rule__EffectOnCell__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EffectOnCell__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectOnCellAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectOnCell"


    // $ANTLR start "entryRuleCondition"
    // InternalBoardGameDL.g:278:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalBoardGameDL.g:279:1: ( ruleCondition EOF )
            // InternalBoardGameDL.g:280:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalBoardGameDL.g:287:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:291:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalBoardGameDL.g:292:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalBoardGameDL.g:292:2: ( ( rule__Condition__Group__0 ) )
            // InternalBoardGameDL.g:293:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalBoardGameDL.g:294:3: ( rule__Condition__Group__0 )
            // InternalBoardGameDL.g:294:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleWinConditionElement"
    // InternalBoardGameDL.g:303:1: entryRuleWinConditionElement : ruleWinConditionElement EOF ;
    public final void entryRuleWinConditionElement() throws RecognitionException {
        try {
            // InternalBoardGameDL.g:304:1: ( ruleWinConditionElement EOF )
            // InternalBoardGameDL.g:305:1: ruleWinConditionElement EOF
            {
             before(grammarAccess.getWinConditionElementRule()); 
            pushFollow(FOLLOW_1);
            ruleWinConditionElement();

            state._fsp--;

             after(grammarAccess.getWinConditionElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWinConditionElement"


    // $ANTLR start "ruleWinConditionElement"
    // InternalBoardGameDL.g:312:1: ruleWinConditionElement : ( ruleLine ) ;
    public final void ruleWinConditionElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:316:2: ( ( ruleLine ) )
            // InternalBoardGameDL.g:317:2: ( ruleLine )
            {
            // InternalBoardGameDL.g:317:2: ( ruleLine )
            // InternalBoardGameDL.g:318:3: ruleLine
            {
             before(grammarAccess.getWinConditionElementAccess().getLineParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getWinConditionElementAccess().getLineParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWinConditionElement"


    // $ANTLR start "entryRuleLine"
    // InternalBoardGameDL.g:328:1: entryRuleLine : ruleLine EOF ;
    public final void entryRuleLine() throws RecognitionException {
        try {
            // InternalBoardGameDL.g:329:1: ( ruleLine EOF )
            // InternalBoardGameDL.g:330:1: ruleLine EOF
            {
             before(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_1);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getLineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // InternalBoardGameDL.g:337:1: ruleLine : ( ( rule__Line__Group__0 ) ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:341:2: ( ( ( rule__Line__Group__0 ) ) )
            // InternalBoardGameDL.g:342:2: ( ( rule__Line__Group__0 ) )
            {
            // InternalBoardGameDL.g:342:2: ( ( rule__Line__Group__0 ) )
            // InternalBoardGameDL.g:343:3: ( rule__Line__Group__0 )
            {
             before(grammarAccess.getLineAccess().getGroup()); 
            // InternalBoardGameDL.g:344:3: ( rule__Line__Group__0 )
            // InternalBoardGameDL.g:344:4: rule__Line__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Line__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLine"


    // $ANTLR start "ruleDirection"
    // InternalBoardGameDL.g:353:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:357:1: ( ( ( rule__Direction__Alternatives ) ) )
            // InternalBoardGameDL.g:358:2: ( ( rule__Direction__Alternatives ) )
            {
            // InternalBoardGameDL.g:358:2: ( ( rule__Direction__Alternatives ) )
            // InternalBoardGameDL.g:359:3: ( rule__Direction__Alternatives )
            {
             before(grammarAccess.getDirectionAccess().getAlternatives()); 
            // InternalBoardGameDL.g:360:3: ( rule__Direction__Alternatives )
            // InternalBoardGameDL.g:360:4: rule__Direction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Direction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDirectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirection"


    // $ANTLR start "rule__BoardGameElement__Alternatives"
    // InternalBoardGameDL.g:368:1: rule__BoardGameElement__Alternatives : ( ( rulePieceType ) | ( ruleEffectOnCell ) | ( ruleValidMove ) | ( ruleCellState ) | ( ruleWinCondition ) | ( ruleCondition ) );
    public final void rule__BoardGameElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:372:1: ( ( rulePieceType ) | ( ruleEffectOnCell ) | ( ruleValidMove ) | ( ruleCellState ) | ( ruleWinCondition ) | ( ruleCondition ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt1=1;
                }
                break;
            case 30:
                {
                alt1=2;
                }
                break;
            case 26:
                {
                alt1=3;
                }
                break;
            case 23:
                {
                alt1=4;
                }
                break;
            case 24:
                {
                alt1=5;
                }
                break;
            case 35:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalBoardGameDL.g:373:2: ( rulePieceType )
                    {
                    // InternalBoardGameDL.g:373:2: ( rulePieceType )
                    // InternalBoardGameDL.g:374:3: rulePieceType
                    {
                     before(grammarAccess.getBoardGameElementAccess().getPieceTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePieceType();

                    state._fsp--;

                     after(grammarAccess.getBoardGameElementAccess().getPieceTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBoardGameDL.g:379:2: ( ruleEffectOnCell )
                    {
                    // InternalBoardGameDL.g:379:2: ( ruleEffectOnCell )
                    // InternalBoardGameDL.g:380:3: ruleEffectOnCell
                    {
                     before(grammarAccess.getBoardGameElementAccess().getEffectOnCellParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEffectOnCell();

                    state._fsp--;

                     after(grammarAccess.getBoardGameElementAccess().getEffectOnCellParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBoardGameDL.g:385:2: ( ruleValidMove )
                    {
                    // InternalBoardGameDL.g:385:2: ( ruleValidMove )
                    // InternalBoardGameDL.g:386:3: ruleValidMove
                    {
                     before(grammarAccess.getBoardGameElementAccess().getValidMoveParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleValidMove();

                    state._fsp--;

                     after(grammarAccess.getBoardGameElementAccess().getValidMoveParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBoardGameDL.g:391:2: ( ruleCellState )
                    {
                    // InternalBoardGameDL.g:391:2: ( ruleCellState )
                    // InternalBoardGameDL.g:392:3: ruleCellState
                    {
                     before(grammarAccess.getBoardGameElementAccess().getCellStateParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCellState();

                    state._fsp--;

                     after(grammarAccess.getBoardGameElementAccess().getCellStateParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBoardGameDL.g:397:2: ( ruleWinCondition )
                    {
                    // InternalBoardGameDL.g:397:2: ( ruleWinCondition )
                    // InternalBoardGameDL.g:398:3: ruleWinCondition
                    {
                     before(grammarAccess.getBoardGameElementAccess().getWinConditionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleWinCondition();

                    state._fsp--;

                     after(grammarAccess.getBoardGameElementAccess().getWinConditionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBoardGameDL.g:403:2: ( ruleCondition )
                    {
                    // InternalBoardGameDL.g:403:2: ( ruleCondition )
                    // InternalBoardGameDL.g:404:3: ruleCondition
                    {
                     before(grammarAccess.getBoardGameElementAccess().getConditionParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleCondition();

                    state._fsp--;

                     after(grammarAccess.getBoardGameElementAccess().getConditionParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoardGameElement__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalBoardGameDL.g:413:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:417:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBoardGameDL.g:418:2: ( RULE_STRING )
                    {
                    // InternalBoardGameDL.g:418:2: ( RULE_STRING )
                    // InternalBoardGameDL.g:419:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBoardGameDL.g:424:2: ( RULE_ID )
                    {
                    // InternalBoardGameDL.g:424:2: ( RULE_ID )
                    // InternalBoardGameDL.g:425:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Direction__Alternatives"
    // InternalBoardGameDL.g:434:1: rule__Direction__Alternatives : ( ( ( 'ROW' ) ) | ( ( 'COLUMN' ) ) | ( ( 'DIAGONAL' ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:438:1: ( ( ( 'ROW' ) ) | ( ( 'COLUMN' ) ) | ( ( 'DIAGONAL' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalBoardGameDL.g:439:2: ( ( 'ROW' ) )
                    {
                    // InternalBoardGameDL.g:439:2: ( ( 'ROW' ) )
                    // InternalBoardGameDL.g:440:3: ( 'ROW' )
                    {
                     before(grammarAccess.getDirectionAccess().getROWEnumLiteralDeclaration_0()); 
                    // InternalBoardGameDL.g:441:3: ( 'ROW' )
                    // InternalBoardGameDL.g:441:4: 'ROW'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getROWEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBoardGameDL.g:445:2: ( ( 'COLUMN' ) )
                    {
                    // InternalBoardGameDL.g:445:2: ( ( 'COLUMN' ) )
                    // InternalBoardGameDL.g:446:3: ( 'COLUMN' )
                    {
                     before(grammarAccess.getDirectionAccess().getCOLUMNEnumLiteralDeclaration_1()); 
                    // InternalBoardGameDL.g:447:3: ( 'COLUMN' )
                    // InternalBoardGameDL.g:447:4: 'COLUMN'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getCOLUMNEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBoardGameDL.g:451:2: ( ( 'DIAGONAL' ) )
                    {
                    // InternalBoardGameDL.g:451:2: ( ( 'DIAGONAL' ) )
                    // InternalBoardGameDL.g:452:3: ( 'DIAGONAL' )
                    {
                     before(grammarAccess.getDirectionAccess().getDIAGONALEnumLiteralDeclaration_2()); 
                    // InternalBoardGameDL.g:453:3: ( 'DIAGONAL' )
                    // InternalBoardGameDL.g:453:4: 'DIAGONAL'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getDIAGONALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Alternatives"


    // $ANTLR start "rule__BoardGame__Group__0"
    // InternalBoardGameDL.g:461:1: rule__BoardGame__Group__0 : rule__BoardGame__Group__0__Impl rule__BoardGame__Group__1 ;
    public final void rule__BoardGame__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:465:1: ( rule__BoardGame__Group__0__Impl rule__BoardGame__Group__1 )
            // InternalBoardGameDL.g:466:2: rule__BoardGame__Group__0__Impl rule__BoardGame__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BoardGame__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoardGame__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoardGame__Group__0"


    // $ANTLR start "rule__BoardGame__Group__0__Impl"
    // InternalBoardGameDL.g:473:1: rule__BoardGame__Group__0__Impl : ( 'Title' ) ;
    public final void rule__BoardGame__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:477:1: ( ( 'Title' ) )
            // InternalBoardGameDL.g:478:1: ( 'Title' )
            {
            // InternalBoardGameDL.g:478:1: ( 'Title' )
            // InternalBoardGameDL.g:479:2: 'Title'
            {
             before(grammarAccess.getBoardGameAccess().getTitleKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBoardGameAccess().getTitleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoardGame__Group__0__Impl"


    // $ANTLR start "rule__BoardGame__Group__1"
    // InternalBoardGameDL.g:488:1: rule__BoardGame__Group__1 : rule__BoardGame__Group__1__Impl rule__BoardGame__Group__2 ;
    public final void rule__BoardGame__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:492:1: ( rule__BoardGame__Group__1__Impl rule__BoardGame__Group__2 )
            // InternalBoardGameDL.g:493:2: rule__BoardGame__Group__1__Impl rule__BoardGame__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__BoardGame__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoardGame__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoardGame__Group__1"


    // $ANTLR start "rule__BoardGame__Group__1__Impl"
    // InternalBoardGameDL.g:500:1: rule__BoardGame__Group__1__Impl : ( ( rule__BoardGame__NameAssignment_1 ) ) ;
    public final void rule__BoardGame__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:504:1: ( ( ( rule__BoardGame__NameAssignment_1 ) ) )
            // InternalBoardGameDL.g:505:1: ( ( rule__BoardGame__NameAssignment_1 ) )
            {
            // InternalBoardGameDL.g:505:1: ( ( rule__BoardGame__NameAssignment_1 ) )
            // InternalBoardGameDL.g:506:2: ( rule__BoardGame__NameAssignment_1 )
            {
             before(grammarAccess.getBoardGameAccess().getNameAssignment_1()); 
            // InternalBoardGameDL.g:507:2: ( rule__BoardGame__NameAssignment_1 )
            // InternalBoardGameDL.g:507:3: rule__BoardGame__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BoardGame__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBoardGameAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoardGame__Group__1__Impl"


    // $ANTLR start "rule__BoardGame__Group__2"
    // InternalBoardGameDL.g:515:1: rule__BoardGame__Group__2 : rule__BoardGame__Group__2__Impl rule__BoardGame__Group__3 ;
    public final void rule__BoardGame__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:519:1: ( rule__BoardGame__Group__2__Impl rule__BoardGame__Group__3 )
            // InternalBoardGameDL.g:520:2: rule__BoardGame__Group__2__Impl rule__BoardGame__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__BoardGame__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoardGame__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoardGame__Group__2"


    // $ANTLR start "rule__BoardGame__Group__2__Impl"
    // InternalBoardGameDL.g:527:1: rule__BoardGame__Group__2__Impl : ( 'BoardSize' ) ;
    public final void rule__BoardGame__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:531:1: ( ( 'BoardSize' ) )
            // InternalBoardGameDL.g:532:1: ( 'BoardSize' )
            {
            // InternalBoardGameDL.g:532:1: ( 'BoardSize' )
            // InternalBoardGameDL.g:533:2: 'BoardSize'
            {
             before(grammarAccess.getBoardGameAccess().getBoardSizeKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getBoardGameAccess().getBoardSizeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoardGame__Group__2__Impl"


    // $ANTLR start "rule__BoardGame__Group__3"
    // InternalBoardGameDL.g:542:1: rule__BoardGame__Group__3 : rule__BoardGame__Group__3__Impl rule__BoardGame__Group__4 ;
    public final void rule__BoardGame__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:546:1: ( rule__BoardGame__Group__3__Impl rule__BoardGame__Group__4 )
            // InternalBoardGameDL.g:547:2: rule__BoardGame__Group__3__Impl rule__BoardGame__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__BoardGame__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoardGame__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoardGame__Group__3"


    // $ANTLR start "rule__BoardGame__Group__3__Impl"
    // InternalBoardGameDL.g:554:1: rule__BoardGame__Group__3__Impl : ( ( rule__BoardGame__SizeAssignment_3 ) ) ;
    public final void rule__BoardGame__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:558:1: ( ( ( rule__BoardGame__SizeAssignment_3 ) ) )
            // InternalBoardGameDL.g:559:1: ( ( rule__BoardGame__SizeAssignment_3 ) )
            {
            // InternalBoardGameDL.g:559:1: ( ( rule__BoardGame__SizeAssignment_3 ) )
            // InternalBoardGameDL.g:560:2: ( rule__BoardGame__SizeAssignment_3 )
            {
             before(grammarAccess.getBoardGameAccess().getSizeAssignment_3()); 
            // InternalBoardGameDL.g:561:2: ( rule__BoardGame__SizeAssignment_3 )
            // InternalBoardGameDL.g:561:3: rule__BoardGame__SizeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BoardGame__SizeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBoardGameAccess().getSizeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoardGame__Group__3__Impl"


    // $ANTLR start "rule__BoardGame__Group__4"
    // InternalBoardGameDL.g:569:1: rule__BoardGame__Group__4 : rule__BoardGame__Group__4__Impl ;
    public final void rule__BoardGame__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:573:1: ( rule__BoardGame__Group__4__Impl )
            // InternalBoardGameDL.g:574:2: rule__BoardGame__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoardGame__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoardGame__Group__4"


    // $ANTLR start "rule__BoardGame__Group__4__Impl"
    // InternalBoardGameDL.g:580:1: rule__BoardGame__Group__4__Impl : ( ( rule__BoardGame__BoardGameElementsAssignment_4 )* ) ;
    public final void rule__BoardGame__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:584:1: ( ( ( rule__BoardGame__BoardGameElementsAssignment_4 )* ) )
            // InternalBoardGameDL.g:585:1: ( ( rule__BoardGame__BoardGameElementsAssignment_4 )* )
            {
            // InternalBoardGameDL.g:585:1: ( ( rule__BoardGame__BoardGameElementsAssignment_4 )* )
            // InternalBoardGameDL.g:586:2: ( rule__BoardGame__BoardGameElementsAssignment_4 )*
            {
             before(grammarAccess.getBoardGameAccess().getBoardGameElementsAssignment_4()); 
            // InternalBoardGameDL.g:587:2: ( rule__BoardGame__BoardGameElementsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16||(LA4_0>=23 && LA4_0<=24)||LA4_0==26||LA4_0==30||LA4_0==35) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBoardGameDL.g:587:3: rule__BoardGame__BoardGameElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BoardGame__BoardGameElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getBoardGameAccess().getBoardGameElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoardGame__Group__4__Impl"


    // $ANTLR start "rule__PieceType__Group__0"
    // InternalBoardGameDL.g:596:1: rule__PieceType__Group__0 : rule__PieceType__Group__0__Impl rule__PieceType__Group__1 ;
    public final void rule__PieceType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:600:1: ( rule__PieceType__Group__0__Impl rule__PieceType__Group__1 )
            // InternalBoardGameDL.g:601:2: rule__PieceType__Group__0__Impl rule__PieceType__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PieceType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieceType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group__0"


    // $ANTLR start "rule__PieceType__Group__0__Impl"
    // InternalBoardGameDL.g:608:1: rule__PieceType__Group__0__Impl : ( 'PieceType' ) ;
    public final void rule__PieceType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:612:1: ( ( 'PieceType' ) )
            // InternalBoardGameDL.g:613:1: ( 'PieceType' )
            {
            // InternalBoardGameDL.g:613:1: ( 'PieceType' )
            // InternalBoardGameDL.g:614:2: 'PieceType'
            {
             before(grammarAccess.getPieceTypeAccess().getPieceTypeKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPieceTypeAccess().getPieceTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group__0__Impl"


    // $ANTLR start "rule__PieceType__Group__1"
    // InternalBoardGameDL.g:623:1: rule__PieceType__Group__1 : rule__PieceType__Group__1__Impl rule__PieceType__Group__2 ;
    public final void rule__PieceType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:627:1: ( rule__PieceType__Group__1__Impl rule__PieceType__Group__2 )
            // InternalBoardGameDL.g:628:2: rule__PieceType__Group__1__Impl rule__PieceType__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__PieceType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieceType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group__1"


    // $ANTLR start "rule__PieceType__Group__1__Impl"
    // InternalBoardGameDL.g:635:1: rule__PieceType__Group__1__Impl : ( ( rule__PieceType__NameAssignment_1 ) ) ;
    public final void rule__PieceType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:639:1: ( ( ( rule__PieceType__NameAssignment_1 ) ) )
            // InternalBoardGameDL.g:640:1: ( ( rule__PieceType__NameAssignment_1 ) )
            {
            // InternalBoardGameDL.g:640:1: ( ( rule__PieceType__NameAssignment_1 ) )
            // InternalBoardGameDL.g:641:2: ( rule__PieceType__NameAssignment_1 )
            {
             before(grammarAccess.getPieceTypeAccess().getNameAssignment_1()); 
            // InternalBoardGameDL.g:642:2: ( rule__PieceType__NameAssignment_1 )
            // InternalBoardGameDL.g:642:3: rule__PieceType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPieceTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group__1__Impl"


    // $ANTLR start "rule__PieceType__Group__2"
    // InternalBoardGameDL.g:650:1: rule__PieceType__Group__2 : rule__PieceType__Group__2__Impl rule__PieceType__Group__3 ;
    public final void rule__PieceType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:654:1: ( rule__PieceType__Group__2__Impl rule__PieceType__Group__3 )
            // InternalBoardGameDL.g:655:2: rule__PieceType__Group__2__Impl rule__PieceType__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__PieceType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieceType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group__2"


    // $ANTLR start "rule__PieceType__Group__2__Impl"
    // InternalBoardGameDL.g:662:1: rule__PieceType__Group__2__Impl : ( '{' ) ;
    public final void rule__PieceType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:666:1: ( ( '{' ) )
            // InternalBoardGameDL.g:667:1: ( '{' )
            {
            // InternalBoardGameDL.g:667:1: ( '{' )
            // InternalBoardGameDL.g:668:2: '{'
            {
             before(grammarAccess.getPieceTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPieceTypeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group__2__Impl"


    // $ANTLR start "rule__PieceType__Group__3"
    // InternalBoardGameDL.g:677:1: rule__PieceType__Group__3 : rule__PieceType__Group__3__Impl rule__PieceType__Group__4 ;
    public final void rule__PieceType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:681:1: ( rule__PieceType__Group__3__Impl rule__PieceType__Group__4 )
            // InternalBoardGameDL.g:682:2: rule__PieceType__Group__3__Impl rule__PieceType__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__PieceType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieceType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group__3"


    // $ANTLR start "rule__PieceType__Group__3__Impl"
    // InternalBoardGameDL.g:689:1: rule__PieceType__Group__3__Impl : ( 'Symbol' ) ;
    public final void rule__PieceType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:693:1: ( ( 'Symbol' ) )
            // InternalBoardGameDL.g:694:1: ( 'Symbol' )
            {
            // InternalBoardGameDL.g:694:1: ( 'Symbol' )
            // InternalBoardGameDL.g:695:2: 'Symbol'
            {
             before(grammarAccess.getPieceTypeAccess().getSymbolKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPieceTypeAccess().getSymbolKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group__3__Impl"


    // $ANTLR start "rule__PieceType__Group__4"
    // InternalBoardGameDL.g:704:1: rule__PieceType__Group__4 : rule__PieceType__Group__4__Impl rule__PieceType__Group__5 ;
    public final void rule__PieceType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:708:1: ( rule__PieceType__Group__4__Impl rule__PieceType__Group__5 )
            // InternalBoardGameDL.g:709:2: rule__PieceType__Group__4__Impl rule__PieceType__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__PieceType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieceType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group__4"


    // $ANTLR start "rule__PieceType__Group__4__Impl"
    // InternalBoardGameDL.g:716:1: rule__PieceType__Group__4__Impl : ( ( rule__PieceType__SymbolAssignment_4 ) ) ;
    public final void rule__PieceType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:720:1: ( ( ( rule__PieceType__SymbolAssignment_4 ) ) )
            // InternalBoardGameDL.g:721:1: ( ( rule__PieceType__SymbolAssignment_4 ) )
            {
            // InternalBoardGameDL.g:721:1: ( ( rule__PieceType__SymbolAssignment_4 ) )
            // InternalBoardGameDL.g:722:2: ( rule__PieceType__SymbolAssignment_4 )
            {
             before(grammarAccess.getPieceTypeAccess().getSymbolAssignment_4()); 
            // InternalBoardGameDL.g:723:2: ( rule__PieceType__SymbolAssignment_4 )
            // InternalBoardGameDL.g:723:3: rule__PieceType__SymbolAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__SymbolAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPieceTypeAccess().getSymbolAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group__4__Impl"


    // $ANTLR start "rule__PieceType__Group__5"
    // InternalBoardGameDL.g:731:1: rule__PieceType__Group__5 : rule__PieceType__Group__5__Impl rule__PieceType__Group__6 ;
    public final void rule__PieceType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:735:1: ( rule__PieceType__Group__5__Impl rule__PieceType__Group__6 )
            // InternalBoardGameDL.g:736:2: rule__PieceType__Group__5__Impl rule__PieceType__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__PieceType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieceType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group__5"


    // $ANTLR start "rule__PieceType__Group__5__Impl"
    // InternalBoardGameDL.g:743:1: rule__PieceType__Group__5__Impl : ( 'ValidMoves' ) ;
    public final void rule__PieceType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:747:1: ( ( 'ValidMoves' ) )
            // InternalBoardGameDL.g:748:1: ( 'ValidMoves' )
            {
            // InternalBoardGameDL.g:748:1: ( 'ValidMoves' )
            // InternalBoardGameDL.g:749:2: 'ValidMoves'
            {
             before(grammarAccess.getPieceTypeAccess().getValidMovesKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPieceTypeAccess().getValidMovesKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group__5__Impl"


    // $ANTLR start "rule__PieceType__Group__6"
    // InternalBoardGameDL.g:758:1: rule__PieceType__Group__6 : rule__PieceType__Group__6__Impl rule__PieceType__Group__7 ;
    public final void rule__PieceType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:762:1: ( rule__PieceType__Group__6__Impl rule__PieceType__Group__7 )
            // InternalBoardGameDL.g:763:2: rule__PieceType__Group__6__Impl rule__PieceType__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__PieceType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieceType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group__6"


    // $ANTLR start "rule__PieceType__Group__6__Impl"
    // InternalBoardGameDL.g:770:1: rule__PieceType__Group__6__Impl : ( ( rule__PieceType__ValidMovesAssignment_6 ) ) ;
    public final void rule__PieceType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:774:1: ( ( ( rule__PieceType__ValidMovesAssignment_6 ) ) )
            // InternalBoardGameDL.g:775:1: ( ( rule__PieceType__ValidMovesAssignment_6 ) )
            {
            // InternalBoardGameDL.g:775:1: ( ( rule__PieceType__ValidMovesAssignment_6 ) )
            // InternalBoardGameDL.g:776:2: ( rule__PieceType__ValidMovesAssignment_6 )
            {
             before(grammarAccess.getPieceTypeAccess().getValidMovesAssignment_6()); 
            // InternalBoardGameDL.g:777:2: ( rule__PieceType__ValidMovesAssignment_6 )
            // InternalBoardGameDL.g:777:3: rule__PieceType__ValidMovesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__ValidMovesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPieceTypeAccess().getValidMovesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group__6__Impl"


    // $ANTLR start "rule__PieceType__Group__7"
    // InternalBoardGameDL.g:785:1: rule__PieceType__Group__7 : rule__PieceType__Group__7__Impl rule__PieceType__Group__8 ;
    public final void rule__PieceType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:789:1: ( rule__PieceType__Group__7__Impl rule__PieceType__Group__8 )
            // InternalBoardGameDL.g:790:2: rule__PieceType__Group__7__Impl rule__PieceType__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__PieceType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieceType__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group__7"


    // $ANTLR start "rule__PieceType__Group__7__Impl"
    // InternalBoardGameDL.g:797:1: rule__PieceType__Group__7__Impl : ( ( rule__PieceType__Group_7__0 )* ) ;
    public final void rule__PieceType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:801:1: ( ( ( rule__PieceType__Group_7__0 )* ) )
            // InternalBoardGameDL.g:802:1: ( ( rule__PieceType__Group_7__0 )* )
            {
            // InternalBoardGameDL.g:802:1: ( ( rule__PieceType__Group_7__0 )* )
            // InternalBoardGameDL.g:803:2: ( rule__PieceType__Group_7__0 )*
            {
             before(grammarAccess.getPieceTypeAccess().getGroup_7()); 
            // InternalBoardGameDL.g:804:2: ( rule__PieceType__Group_7__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBoardGameDL.g:804:3: rule__PieceType__Group_7__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__PieceType__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPieceTypeAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group__7__Impl"


    // $ANTLR start "rule__PieceType__Group__8"
    // InternalBoardGameDL.g:812:1: rule__PieceType__Group__8 : rule__PieceType__Group__8__Impl rule__PieceType__Group__9 ;
    public final void rule__PieceType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:816:1: ( rule__PieceType__Group__8__Impl rule__PieceType__Group__9 )
            // InternalBoardGameDL.g:817:2: rule__PieceType__Group__8__Impl rule__PieceType__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__PieceType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieceType__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group__8"


    // $ANTLR start "rule__PieceType__Group__8__Impl"
    // InternalBoardGameDL.g:824:1: rule__PieceType__Group__8__Impl : ( ( rule__PieceType__Group_8__0 )? ) ;
    public final void rule__PieceType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:828:1: ( ( ( rule__PieceType__Group_8__0 )? ) )
            // InternalBoardGameDL.g:829:1: ( ( rule__PieceType__Group_8__0 )? )
            {
            // InternalBoardGameDL.g:829:1: ( ( rule__PieceType__Group_8__0 )? )
            // InternalBoardGameDL.g:830:2: ( rule__PieceType__Group_8__0 )?
            {
             before(grammarAccess.getPieceTypeAccess().getGroup_8()); 
            // InternalBoardGameDL.g:831:2: ( rule__PieceType__Group_8__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBoardGameDL.g:831:3: rule__PieceType__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PieceType__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPieceTypeAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group__8__Impl"


    // $ANTLR start "rule__PieceType__Group__9"
    // InternalBoardGameDL.g:839:1: rule__PieceType__Group__9 : rule__PieceType__Group__9__Impl ;
    public final void rule__PieceType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:843:1: ( rule__PieceType__Group__9__Impl )
            // InternalBoardGameDL.g:844:2: rule__PieceType__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group__9"


    // $ANTLR start "rule__PieceType__Group__9__Impl"
    // InternalBoardGameDL.g:850:1: rule__PieceType__Group__9__Impl : ( '}' ) ;
    public final void rule__PieceType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:854:1: ( ( '}' ) )
            // InternalBoardGameDL.g:855:1: ( '}' )
            {
            // InternalBoardGameDL.g:855:1: ( '}' )
            // InternalBoardGameDL.g:856:2: '}'
            {
             before(grammarAccess.getPieceTypeAccess().getRightCurlyBracketKeyword_9()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPieceTypeAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group__9__Impl"


    // $ANTLR start "rule__PieceType__Group_7__0"
    // InternalBoardGameDL.g:866:1: rule__PieceType__Group_7__0 : rule__PieceType__Group_7__0__Impl rule__PieceType__Group_7__1 ;
    public final void rule__PieceType__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:870:1: ( rule__PieceType__Group_7__0__Impl rule__PieceType__Group_7__1 )
            // InternalBoardGameDL.g:871:2: rule__PieceType__Group_7__0__Impl rule__PieceType__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__PieceType__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieceType__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group_7__0"


    // $ANTLR start "rule__PieceType__Group_7__0__Impl"
    // InternalBoardGameDL.g:878:1: rule__PieceType__Group_7__0__Impl : ( ',' ) ;
    public final void rule__PieceType__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:882:1: ( ( ',' ) )
            // InternalBoardGameDL.g:883:1: ( ',' )
            {
            // InternalBoardGameDL.g:883:1: ( ',' )
            // InternalBoardGameDL.g:884:2: ','
            {
             before(grammarAccess.getPieceTypeAccess().getCommaKeyword_7_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPieceTypeAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group_7__0__Impl"


    // $ANTLR start "rule__PieceType__Group_7__1"
    // InternalBoardGameDL.g:893:1: rule__PieceType__Group_7__1 : rule__PieceType__Group_7__1__Impl ;
    public final void rule__PieceType__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:897:1: ( rule__PieceType__Group_7__1__Impl )
            // InternalBoardGameDL.g:898:2: rule__PieceType__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group_7__1"


    // $ANTLR start "rule__PieceType__Group_7__1__Impl"
    // InternalBoardGameDL.g:904:1: rule__PieceType__Group_7__1__Impl : ( ( rule__PieceType__ValidMovesAssignment_7_1 ) ) ;
    public final void rule__PieceType__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:908:1: ( ( ( rule__PieceType__ValidMovesAssignment_7_1 ) ) )
            // InternalBoardGameDL.g:909:1: ( ( rule__PieceType__ValidMovesAssignment_7_1 ) )
            {
            // InternalBoardGameDL.g:909:1: ( ( rule__PieceType__ValidMovesAssignment_7_1 ) )
            // InternalBoardGameDL.g:910:2: ( rule__PieceType__ValidMovesAssignment_7_1 )
            {
             before(grammarAccess.getPieceTypeAccess().getValidMovesAssignment_7_1()); 
            // InternalBoardGameDL.g:911:2: ( rule__PieceType__ValidMovesAssignment_7_1 )
            // InternalBoardGameDL.g:911:3: rule__PieceType__ValidMovesAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__ValidMovesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPieceTypeAccess().getValidMovesAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group_7__1__Impl"


    // $ANTLR start "rule__PieceType__Group_8__0"
    // InternalBoardGameDL.g:920:1: rule__PieceType__Group_8__0 : rule__PieceType__Group_8__0__Impl rule__PieceType__Group_8__1 ;
    public final void rule__PieceType__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:924:1: ( rule__PieceType__Group_8__0__Impl rule__PieceType__Group_8__1 )
            // InternalBoardGameDL.g:925:2: rule__PieceType__Group_8__0__Impl rule__PieceType__Group_8__1
            {
            pushFollow(FOLLOW_3);
            rule__PieceType__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieceType__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group_8__0"


    // $ANTLR start "rule__PieceType__Group_8__0__Impl"
    // InternalBoardGameDL.g:932:1: rule__PieceType__Group_8__0__Impl : ( 'EffectsOnCell' ) ;
    public final void rule__PieceType__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:936:1: ( ( 'EffectsOnCell' ) )
            // InternalBoardGameDL.g:937:1: ( 'EffectsOnCell' )
            {
            // InternalBoardGameDL.g:937:1: ( 'EffectsOnCell' )
            // InternalBoardGameDL.g:938:2: 'EffectsOnCell'
            {
             before(grammarAccess.getPieceTypeAccess().getEffectsOnCellKeyword_8_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPieceTypeAccess().getEffectsOnCellKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group_8__0__Impl"


    // $ANTLR start "rule__PieceType__Group_8__1"
    // InternalBoardGameDL.g:947:1: rule__PieceType__Group_8__1 : rule__PieceType__Group_8__1__Impl rule__PieceType__Group_8__2 ;
    public final void rule__PieceType__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:951:1: ( rule__PieceType__Group_8__1__Impl rule__PieceType__Group_8__2 )
            // InternalBoardGameDL.g:952:2: rule__PieceType__Group_8__1__Impl rule__PieceType__Group_8__2
            {
            pushFollow(FOLLOW_13);
            rule__PieceType__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieceType__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group_8__1"


    // $ANTLR start "rule__PieceType__Group_8__1__Impl"
    // InternalBoardGameDL.g:959:1: rule__PieceType__Group_8__1__Impl : ( ( rule__PieceType__EffectsoncellAssignment_8_1 ) ) ;
    public final void rule__PieceType__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:963:1: ( ( ( rule__PieceType__EffectsoncellAssignment_8_1 ) ) )
            // InternalBoardGameDL.g:964:1: ( ( rule__PieceType__EffectsoncellAssignment_8_1 ) )
            {
            // InternalBoardGameDL.g:964:1: ( ( rule__PieceType__EffectsoncellAssignment_8_1 ) )
            // InternalBoardGameDL.g:965:2: ( rule__PieceType__EffectsoncellAssignment_8_1 )
            {
             before(grammarAccess.getPieceTypeAccess().getEffectsoncellAssignment_8_1()); 
            // InternalBoardGameDL.g:966:2: ( rule__PieceType__EffectsoncellAssignment_8_1 )
            // InternalBoardGameDL.g:966:3: rule__PieceType__EffectsoncellAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__EffectsoncellAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getPieceTypeAccess().getEffectsoncellAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group_8__1__Impl"


    // $ANTLR start "rule__PieceType__Group_8__2"
    // InternalBoardGameDL.g:974:1: rule__PieceType__Group_8__2 : rule__PieceType__Group_8__2__Impl ;
    public final void rule__PieceType__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:978:1: ( rule__PieceType__Group_8__2__Impl )
            // InternalBoardGameDL.g:979:2: rule__PieceType__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__Group_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group_8__2"


    // $ANTLR start "rule__PieceType__Group_8__2__Impl"
    // InternalBoardGameDL.g:985:1: rule__PieceType__Group_8__2__Impl : ( ( rule__PieceType__Group_8_2__0 )* ) ;
    public final void rule__PieceType__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:989:1: ( ( ( rule__PieceType__Group_8_2__0 )* ) )
            // InternalBoardGameDL.g:990:1: ( ( rule__PieceType__Group_8_2__0 )* )
            {
            // InternalBoardGameDL.g:990:1: ( ( rule__PieceType__Group_8_2__0 )* )
            // InternalBoardGameDL.g:991:2: ( rule__PieceType__Group_8_2__0 )*
            {
             before(grammarAccess.getPieceTypeAccess().getGroup_8_2()); 
            // InternalBoardGameDL.g:992:2: ( rule__PieceType__Group_8_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBoardGameDL.g:992:3: rule__PieceType__Group_8_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__PieceType__Group_8_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPieceTypeAccess().getGroup_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group_8__2__Impl"


    // $ANTLR start "rule__PieceType__Group_8_2__0"
    // InternalBoardGameDL.g:1001:1: rule__PieceType__Group_8_2__0 : rule__PieceType__Group_8_2__0__Impl rule__PieceType__Group_8_2__1 ;
    public final void rule__PieceType__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1005:1: ( rule__PieceType__Group_8_2__0__Impl rule__PieceType__Group_8_2__1 )
            // InternalBoardGameDL.g:1006:2: rule__PieceType__Group_8_2__0__Impl rule__PieceType__Group_8_2__1
            {
            pushFollow(FOLLOW_3);
            rule__PieceType__Group_8_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieceType__Group_8_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group_8_2__0"


    // $ANTLR start "rule__PieceType__Group_8_2__0__Impl"
    // InternalBoardGameDL.g:1013:1: rule__PieceType__Group_8_2__0__Impl : ( ',' ) ;
    public final void rule__PieceType__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1017:1: ( ( ',' ) )
            // InternalBoardGameDL.g:1018:1: ( ',' )
            {
            // InternalBoardGameDL.g:1018:1: ( ',' )
            // InternalBoardGameDL.g:1019:2: ','
            {
             before(grammarAccess.getPieceTypeAccess().getCommaKeyword_8_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPieceTypeAccess().getCommaKeyword_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group_8_2__0__Impl"


    // $ANTLR start "rule__PieceType__Group_8_2__1"
    // InternalBoardGameDL.g:1028:1: rule__PieceType__Group_8_2__1 : rule__PieceType__Group_8_2__1__Impl ;
    public final void rule__PieceType__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1032:1: ( rule__PieceType__Group_8_2__1__Impl )
            // InternalBoardGameDL.g:1033:2: rule__PieceType__Group_8_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__Group_8_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group_8_2__1"


    // $ANTLR start "rule__PieceType__Group_8_2__1__Impl"
    // InternalBoardGameDL.g:1039:1: rule__PieceType__Group_8_2__1__Impl : ( ( rule__PieceType__EffectsoncellAssignment_8_2_1 ) ) ;
    public final void rule__PieceType__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1043:1: ( ( ( rule__PieceType__EffectsoncellAssignment_8_2_1 ) ) )
            // InternalBoardGameDL.g:1044:1: ( ( rule__PieceType__EffectsoncellAssignment_8_2_1 ) )
            {
            // InternalBoardGameDL.g:1044:1: ( ( rule__PieceType__EffectsoncellAssignment_8_2_1 ) )
            // InternalBoardGameDL.g:1045:2: ( rule__PieceType__EffectsoncellAssignment_8_2_1 )
            {
             before(grammarAccess.getPieceTypeAccess().getEffectsoncellAssignment_8_2_1()); 
            // InternalBoardGameDL.g:1046:2: ( rule__PieceType__EffectsoncellAssignment_8_2_1 )
            // InternalBoardGameDL.g:1046:3: rule__PieceType__EffectsoncellAssignment_8_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__EffectsoncellAssignment_8_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPieceTypeAccess().getEffectsoncellAssignment_8_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__Group_8_2__1__Impl"


    // $ANTLR start "rule__CellState__Group__0"
    // InternalBoardGameDL.g:1055:1: rule__CellState__Group__0 : rule__CellState__Group__0__Impl rule__CellState__Group__1 ;
    public final void rule__CellState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1059:1: ( rule__CellState__Group__0__Impl rule__CellState__Group__1 )
            // InternalBoardGameDL.g:1060:2: rule__CellState__Group__0__Impl rule__CellState__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CellState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellState__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group__0"


    // $ANTLR start "rule__CellState__Group__0__Impl"
    // InternalBoardGameDL.g:1067:1: rule__CellState__Group__0__Impl : ( 'Cellstate' ) ;
    public final void rule__CellState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1071:1: ( ( 'Cellstate' ) )
            // InternalBoardGameDL.g:1072:1: ( 'Cellstate' )
            {
            // InternalBoardGameDL.g:1072:1: ( 'Cellstate' )
            // InternalBoardGameDL.g:1073:2: 'Cellstate'
            {
             before(grammarAccess.getCellStateAccess().getCellstateKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCellStateAccess().getCellstateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group__0__Impl"


    // $ANTLR start "rule__CellState__Group__1"
    // InternalBoardGameDL.g:1082:1: rule__CellState__Group__1 : rule__CellState__Group__1__Impl ;
    public final void rule__CellState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1086:1: ( rule__CellState__Group__1__Impl )
            // InternalBoardGameDL.g:1087:2: rule__CellState__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CellState__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group__1"


    // $ANTLR start "rule__CellState__Group__1__Impl"
    // InternalBoardGameDL.g:1093:1: rule__CellState__Group__1__Impl : ( ( rule__CellState__NameAssignment_1 ) ) ;
    public final void rule__CellState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1097:1: ( ( ( rule__CellState__NameAssignment_1 ) ) )
            // InternalBoardGameDL.g:1098:1: ( ( rule__CellState__NameAssignment_1 ) )
            {
            // InternalBoardGameDL.g:1098:1: ( ( rule__CellState__NameAssignment_1 ) )
            // InternalBoardGameDL.g:1099:2: ( rule__CellState__NameAssignment_1 )
            {
             before(grammarAccess.getCellStateAccess().getNameAssignment_1()); 
            // InternalBoardGameDL.g:1100:2: ( rule__CellState__NameAssignment_1 )
            // InternalBoardGameDL.g:1100:3: rule__CellState__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CellState__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCellStateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group__1__Impl"


    // $ANTLR start "rule__WinCondition__Group__0"
    // InternalBoardGameDL.g:1109:1: rule__WinCondition__Group__0 : rule__WinCondition__Group__0__Impl rule__WinCondition__Group__1 ;
    public final void rule__WinCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1113:1: ( rule__WinCondition__Group__0__Impl rule__WinCondition__Group__1 )
            // InternalBoardGameDL.g:1114:2: rule__WinCondition__Group__0__Impl rule__WinCondition__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__WinCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WinCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WinCondition__Group__0"


    // $ANTLR start "rule__WinCondition__Group__0__Impl"
    // InternalBoardGameDL.g:1121:1: rule__WinCondition__Group__0__Impl : ( 'WinCondition' ) ;
    public final void rule__WinCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1125:1: ( ( 'WinCondition' ) )
            // InternalBoardGameDL.g:1126:1: ( 'WinCondition' )
            {
            // InternalBoardGameDL.g:1126:1: ( 'WinCondition' )
            // InternalBoardGameDL.g:1127:2: 'WinCondition'
            {
             before(grammarAccess.getWinConditionAccess().getWinConditionKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getWinConditionAccess().getWinConditionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WinCondition__Group__0__Impl"


    // $ANTLR start "rule__WinCondition__Group__1"
    // InternalBoardGameDL.g:1136:1: rule__WinCondition__Group__1 : rule__WinCondition__Group__1__Impl rule__WinCondition__Group__2 ;
    public final void rule__WinCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1140:1: ( rule__WinCondition__Group__1__Impl rule__WinCondition__Group__2 )
            // InternalBoardGameDL.g:1141:2: rule__WinCondition__Group__1__Impl rule__WinCondition__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__WinCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WinCondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WinCondition__Group__1"


    // $ANTLR start "rule__WinCondition__Group__1__Impl"
    // InternalBoardGameDL.g:1148:1: rule__WinCondition__Group__1__Impl : ( '{' ) ;
    public final void rule__WinCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1152:1: ( ( '{' ) )
            // InternalBoardGameDL.g:1153:1: ( '{' )
            {
            // InternalBoardGameDL.g:1153:1: ( '{' )
            // InternalBoardGameDL.g:1154:2: '{'
            {
             before(grammarAccess.getWinConditionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getWinConditionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WinCondition__Group__1__Impl"


    // $ANTLR start "rule__WinCondition__Group__2"
    // InternalBoardGameDL.g:1163:1: rule__WinCondition__Group__2 : rule__WinCondition__Group__2__Impl rule__WinCondition__Group__3 ;
    public final void rule__WinCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1167:1: ( rule__WinCondition__Group__2__Impl rule__WinCondition__Group__3 )
            // InternalBoardGameDL.g:1168:2: rule__WinCondition__Group__2__Impl rule__WinCondition__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__WinCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WinCondition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WinCondition__Group__2"


    // $ANTLR start "rule__WinCondition__Group__2__Impl"
    // InternalBoardGameDL.g:1175:1: rule__WinCondition__Group__2__Impl : ( ( rule__WinCondition__WinConditionElementsAssignment_2 ) ) ;
    public final void rule__WinCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1179:1: ( ( ( rule__WinCondition__WinConditionElementsAssignment_2 ) ) )
            // InternalBoardGameDL.g:1180:1: ( ( rule__WinCondition__WinConditionElementsAssignment_2 ) )
            {
            // InternalBoardGameDL.g:1180:1: ( ( rule__WinCondition__WinConditionElementsAssignment_2 ) )
            // InternalBoardGameDL.g:1181:2: ( rule__WinCondition__WinConditionElementsAssignment_2 )
            {
             before(grammarAccess.getWinConditionAccess().getWinConditionElementsAssignment_2()); 
            // InternalBoardGameDL.g:1182:2: ( rule__WinCondition__WinConditionElementsAssignment_2 )
            // InternalBoardGameDL.g:1182:3: rule__WinCondition__WinConditionElementsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WinCondition__WinConditionElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWinConditionAccess().getWinConditionElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WinCondition__Group__2__Impl"


    // $ANTLR start "rule__WinCondition__Group__3"
    // InternalBoardGameDL.g:1190:1: rule__WinCondition__Group__3 : rule__WinCondition__Group__3__Impl rule__WinCondition__Group__4 ;
    public final void rule__WinCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1194:1: ( rule__WinCondition__Group__3__Impl rule__WinCondition__Group__4 )
            // InternalBoardGameDL.g:1195:2: rule__WinCondition__Group__3__Impl rule__WinCondition__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__WinCondition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WinCondition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WinCondition__Group__3"


    // $ANTLR start "rule__WinCondition__Group__3__Impl"
    // InternalBoardGameDL.g:1202:1: rule__WinCondition__Group__3__Impl : ( ( rule__WinCondition__WinConditionElementsAssignment_3 )* ) ;
    public final void rule__WinCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1206:1: ( ( ( rule__WinCondition__WinConditionElementsAssignment_3 )* ) )
            // InternalBoardGameDL.g:1207:1: ( ( rule__WinCondition__WinConditionElementsAssignment_3 )* )
            {
            // InternalBoardGameDL.g:1207:1: ( ( rule__WinCondition__WinConditionElementsAssignment_3 )* )
            // InternalBoardGameDL.g:1208:2: ( rule__WinCondition__WinConditionElementsAssignment_3 )*
            {
             before(grammarAccess.getWinConditionAccess().getWinConditionElementsAssignment_3()); 
            // InternalBoardGameDL.g:1209:2: ( rule__WinCondition__WinConditionElementsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==36) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBoardGameDL.g:1209:3: rule__WinCondition__WinConditionElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__WinCondition__WinConditionElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getWinConditionAccess().getWinConditionElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WinCondition__Group__3__Impl"


    // $ANTLR start "rule__WinCondition__Group__4"
    // InternalBoardGameDL.g:1217:1: rule__WinCondition__Group__4 : rule__WinCondition__Group__4__Impl ;
    public final void rule__WinCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1221:1: ( rule__WinCondition__Group__4__Impl )
            // InternalBoardGameDL.g:1222:2: rule__WinCondition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WinCondition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WinCondition__Group__4"


    // $ANTLR start "rule__WinCondition__Group__4__Impl"
    // InternalBoardGameDL.g:1228:1: rule__WinCondition__Group__4__Impl : ( '}' ) ;
    public final void rule__WinCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1232:1: ( ( '}' ) )
            // InternalBoardGameDL.g:1233:1: ( '}' )
            {
            // InternalBoardGameDL.g:1233:1: ( '}' )
            // InternalBoardGameDL.g:1234:2: '}'
            {
             before(grammarAccess.getWinConditionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getWinConditionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WinCondition__Group__4__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalBoardGameDL.g:1244:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1248:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalBoardGameDL.g:1249:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalBoardGameDL.g:1256:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1260:1: ( ( ( '-' )? ) )
            // InternalBoardGameDL.g:1261:1: ( ( '-' )? )
            {
            // InternalBoardGameDL.g:1261:1: ( ( '-' )? )
            // InternalBoardGameDL.g:1262:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalBoardGameDL.g:1263:2: ( '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBoardGameDL.g:1263:3: '-'
                    {
                    match(input,25,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalBoardGameDL.g:1271:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1275:1: ( rule__EInt__Group__1__Impl )
            // InternalBoardGameDL.g:1276:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalBoardGameDL.g:1282:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1286:1: ( ( RULE_INT ) )
            // InternalBoardGameDL.g:1287:1: ( RULE_INT )
            {
            // InternalBoardGameDL.g:1287:1: ( RULE_INT )
            // InternalBoardGameDL.g:1288:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__ValidMove__Group__0"
    // InternalBoardGameDL.g:1298:1: rule__ValidMove__Group__0 : rule__ValidMove__Group__0__Impl rule__ValidMove__Group__1 ;
    public final void rule__ValidMove__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1302:1: ( rule__ValidMove__Group__0__Impl rule__ValidMove__Group__1 )
            // InternalBoardGameDL.g:1303:2: rule__ValidMove__Group__0__Impl rule__ValidMove__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__ValidMove__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidMove__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group__0"


    // $ANTLR start "rule__ValidMove__Group__0__Impl"
    // InternalBoardGameDL.g:1310:1: rule__ValidMove__Group__0__Impl : ( 'ValidMove' ) ;
    public final void rule__ValidMove__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1314:1: ( ( 'ValidMove' ) )
            // InternalBoardGameDL.g:1315:1: ( 'ValidMove' )
            {
            // InternalBoardGameDL.g:1315:1: ( 'ValidMove' )
            // InternalBoardGameDL.g:1316:2: 'ValidMove'
            {
             before(grammarAccess.getValidMoveAccess().getValidMoveKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getValidMoveAccess().getValidMoveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group__0__Impl"


    // $ANTLR start "rule__ValidMove__Group__1"
    // InternalBoardGameDL.g:1325:1: rule__ValidMove__Group__1 : rule__ValidMove__Group__1__Impl rule__ValidMove__Group__2 ;
    public final void rule__ValidMove__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1329:1: ( rule__ValidMove__Group__1__Impl rule__ValidMove__Group__2 )
            // InternalBoardGameDL.g:1330:2: rule__ValidMove__Group__1__Impl rule__ValidMove__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ValidMove__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidMove__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group__1"


    // $ANTLR start "rule__ValidMove__Group__1__Impl"
    // InternalBoardGameDL.g:1337:1: rule__ValidMove__Group__1__Impl : ( ( rule__ValidMove__NameAssignment_1 ) ) ;
    public final void rule__ValidMove__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1341:1: ( ( ( rule__ValidMove__NameAssignment_1 ) ) )
            // InternalBoardGameDL.g:1342:1: ( ( rule__ValidMove__NameAssignment_1 ) )
            {
            // InternalBoardGameDL.g:1342:1: ( ( rule__ValidMove__NameAssignment_1 ) )
            // InternalBoardGameDL.g:1343:2: ( rule__ValidMove__NameAssignment_1 )
            {
             before(grammarAccess.getValidMoveAccess().getNameAssignment_1()); 
            // InternalBoardGameDL.g:1344:2: ( rule__ValidMove__NameAssignment_1 )
            // InternalBoardGameDL.g:1344:3: rule__ValidMove__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ValidMove__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getValidMoveAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group__1__Impl"


    // $ANTLR start "rule__ValidMove__Group__2"
    // InternalBoardGameDL.g:1352:1: rule__ValidMove__Group__2 : rule__ValidMove__Group__2__Impl rule__ValidMove__Group__3 ;
    public final void rule__ValidMove__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1356:1: ( rule__ValidMove__Group__2__Impl rule__ValidMove__Group__3 )
            // InternalBoardGameDL.g:1357:2: rule__ValidMove__Group__2__Impl rule__ValidMove__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__ValidMove__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidMove__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group__2"


    // $ANTLR start "rule__ValidMove__Group__2__Impl"
    // InternalBoardGameDL.g:1364:1: rule__ValidMove__Group__2__Impl : ( '{' ) ;
    public final void rule__ValidMove__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1368:1: ( ( '{' ) )
            // InternalBoardGameDL.g:1369:1: ( '{' )
            {
            // InternalBoardGameDL.g:1369:1: ( '{' )
            // InternalBoardGameDL.g:1370:2: '{'
            {
             before(grammarAccess.getValidMoveAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getValidMoveAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group__2__Impl"


    // $ANTLR start "rule__ValidMove__Group__3"
    // InternalBoardGameDL.g:1379:1: rule__ValidMove__Group__3 : rule__ValidMove__Group__3__Impl rule__ValidMove__Group__4 ;
    public final void rule__ValidMove__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1383:1: ( rule__ValidMove__Group__3__Impl rule__ValidMove__Group__4 )
            // InternalBoardGameDL.g:1384:2: rule__ValidMove__Group__3__Impl rule__ValidMove__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__ValidMove__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidMove__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group__3"


    // $ANTLR start "rule__ValidMove__Group__3__Impl"
    // InternalBoardGameDL.g:1391:1: rule__ValidMove__Group__3__Impl : ( ( rule__ValidMove__PlaceAnywhereAssignment_3 ) ) ;
    public final void rule__ValidMove__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1395:1: ( ( ( rule__ValidMove__PlaceAnywhereAssignment_3 ) ) )
            // InternalBoardGameDL.g:1396:1: ( ( rule__ValidMove__PlaceAnywhereAssignment_3 ) )
            {
            // InternalBoardGameDL.g:1396:1: ( ( rule__ValidMove__PlaceAnywhereAssignment_3 ) )
            // InternalBoardGameDL.g:1397:2: ( rule__ValidMove__PlaceAnywhereAssignment_3 )
            {
             before(grammarAccess.getValidMoveAccess().getPlaceAnywhereAssignment_3()); 
            // InternalBoardGameDL.g:1398:2: ( rule__ValidMove__PlaceAnywhereAssignment_3 )
            // InternalBoardGameDL.g:1398:3: rule__ValidMove__PlaceAnywhereAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ValidMove__PlaceAnywhereAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getValidMoveAccess().getPlaceAnywhereAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group__3__Impl"


    // $ANTLR start "rule__ValidMove__Group__4"
    // InternalBoardGameDL.g:1406:1: rule__ValidMove__Group__4 : rule__ValidMove__Group__4__Impl rule__ValidMove__Group__5 ;
    public final void rule__ValidMove__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1410:1: ( rule__ValidMove__Group__4__Impl rule__ValidMove__Group__5 )
            // InternalBoardGameDL.g:1411:2: rule__ValidMove__Group__4__Impl rule__ValidMove__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__ValidMove__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidMove__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group__4"


    // $ANTLR start "rule__ValidMove__Group__4__Impl"
    // InternalBoardGameDL.g:1418:1: rule__ValidMove__Group__4__Impl : ( ( rule__ValidMove__Group_4__0 )? ) ;
    public final void rule__ValidMove__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1422:1: ( ( ( rule__ValidMove__Group_4__0 )? ) )
            // InternalBoardGameDL.g:1423:1: ( ( rule__ValidMove__Group_4__0 )? )
            {
            // InternalBoardGameDL.g:1423:1: ( ( rule__ValidMove__Group_4__0 )? )
            // InternalBoardGameDL.g:1424:2: ( rule__ValidMove__Group_4__0 )?
            {
             before(grammarAccess.getValidMoveAccess().getGroup_4()); 
            // InternalBoardGameDL.g:1425:2: ( rule__ValidMove__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBoardGameDL.g:1425:3: rule__ValidMove__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ValidMove__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getValidMoveAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group__4__Impl"


    // $ANTLR start "rule__ValidMove__Group__5"
    // InternalBoardGameDL.g:1433:1: rule__ValidMove__Group__5 : rule__ValidMove__Group__5__Impl ;
    public final void rule__ValidMove__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1437:1: ( rule__ValidMove__Group__5__Impl )
            // InternalBoardGameDL.g:1438:2: rule__ValidMove__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValidMove__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group__5"


    // $ANTLR start "rule__ValidMove__Group__5__Impl"
    // InternalBoardGameDL.g:1444:1: rule__ValidMove__Group__5__Impl : ( '}' ) ;
    public final void rule__ValidMove__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1448:1: ( ( '}' ) )
            // InternalBoardGameDL.g:1449:1: ( '}' )
            {
            // InternalBoardGameDL.g:1449:1: ( '}' )
            // InternalBoardGameDL.g:1450:2: '}'
            {
             before(grammarAccess.getValidMoveAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getValidMoveAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group__5__Impl"


    // $ANTLR start "rule__ValidMove__Group_4__0"
    // InternalBoardGameDL.g:1460:1: rule__ValidMove__Group_4__0 : rule__ValidMove__Group_4__0__Impl rule__ValidMove__Group_4__1 ;
    public final void rule__ValidMove__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1464:1: ( rule__ValidMove__Group_4__0__Impl rule__ValidMove__Group_4__1 )
            // InternalBoardGameDL.g:1465:2: rule__ValidMove__Group_4__0__Impl rule__ValidMove__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__ValidMove__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidMove__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group_4__0"


    // $ANTLR start "rule__ValidMove__Group_4__0__Impl"
    // InternalBoardGameDL.g:1472:1: rule__ValidMove__Group_4__0__Impl : ( 'valid' ) ;
    public final void rule__ValidMove__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1476:1: ( ( 'valid' ) )
            // InternalBoardGameDL.g:1477:1: ( 'valid' )
            {
            // InternalBoardGameDL.g:1477:1: ( 'valid' )
            // InternalBoardGameDL.g:1478:2: 'valid'
            {
             before(grammarAccess.getValidMoveAccess().getValidKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getValidMoveAccess().getValidKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group_4__0__Impl"


    // $ANTLR start "rule__ValidMove__Group_4__1"
    // InternalBoardGameDL.g:1487:1: rule__ValidMove__Group_4__1 : rule__ValidMove__Group_4__1__Impl rule__ValidMove__Group_4__2 ;
    public final void rule__ValidMove__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1491:1: ( rule__ValidMove__Group_4__1__Impl rule__ValidMove__Group_4__2 )
            // InternalBoardGameDL.g:1492:2: rule__ValidMove__Group_4__1__Impl rule__ValidMove__Group_4__2
            {
            pushFollow(FOLLOW_3);
            rule__ValidMove__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidMove__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group_4__1"


    // $ANTLR start "rule__ValidMove__Group_4__1__Impl"
    // InternalBoardGameDL.g:1499:1: rule__ValidMove__Group_4__1__Impl : ( 'if' ) ;
    public final void rule__ValidMove__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1503:1: ( ( 'if' ) )
            // InternalBoardGameDL.g:1504:1: ( 'if' )
            {
            // InternalBoardGameDL.g:1504:1: ( 'if' )
            // InternalBoardGameDL.g:1505:2: 'if'
            {
             before(grammarAccess.getValidMoveAccess().getIfKeyword_4_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getValidMoveAccess().getIfKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group_4__1__Impl"


    // $ANTLR start "rule__ValidMove__Group_4__2"
    // InternalBoardGameDL.g:1514:1: rule__ValidMove__Group_4__2 : rule__ValidMove__Group_4__2__Impl rule__ValidMove__Group_4__3 ;
    public final void rule__ValidMove__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1518:1: ( rule__ValidMove__Group_4__2__Impl rule__ValidMove__Group_4__3 )
            // InternalBoardGameDL.g:1519:2: rule__ValidMove__Group_4__2__Impl rule__ValidMove__Group_4__3
            {
            pushFollow(FOLLOW_21);
            rule__ValidMove__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidMove__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group_4__2"


    // $ANTLR start "rule__ValidMove__Group_4__2__Impl"
    // InternalBoardGameDL.g:1526:1: rule__ValidMove__Group_4__2__Impl : ( ( rule__ValidMove__ConditionsAssignment_4_2 ) ) ;
    public final void rule__ValidMove__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1530:1: ( ( ( rule__ValidMove__ConditionsAssignment_4_2 ) ) )
            // InternalBoardGameDL.g:1531:1: ( ( rule__ValidMove__ConditionsAssignment_4_2 ) )
            {
            // InternalBoardGameDL.g:1531:1: ( ( rule__ValidMove__ConditionsAssignment_4_2 ) )
            // InternalBoardGameDL.g:1532:2: ( rule__ValidMove__ConditionsAssignment_4_2 )
            {
             before(grammarAccess.getValidMoveAccess().getConditionsAssignment_4_2()); 
            // InternalBoardGameDL.g:1533:2: ( rule__ValidMove__ConditionsAssignment_4_2 )
            // InternalBoardGameDL.g:1533:3: rule__ValidMove__ConditionsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ValidMove__ConditionsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getValidMoveAccess().getConditionsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group_4__2__Impl"


    // $ANTLR start "rule__ValidMove__Group_4__3"
    // InternalBoardGameDL.g:1541:1: rule__ValidMove__Group_4__3 : rule__ValidMove__Group_4__3__Impl ;
    public final void rule__ValidMove__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1545:1: ( rule__ValidMove__Group_4__3__Impl )
            // InternalBoardGameDL.g:1546:2: rule__ValidMove__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValidMove__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group_4__3"


    // $ANTLR start "rule__ValidMove__Group_4__3__Impl"
    // InternalBoardGameDL.g:1552:1: rule__ValidMove__Group_4__3__Impl : ( ( rule__ValidMove__Group_4_3__0 )* ) ;
    public final void rule__ValidMove__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1556:1: ( ( ( rule__ValidMove__Group_4_3__0 )* ) )
            // InternalBoardGameDL.g:1557:1: ( ( rule__ValidMove__Group_4_3__0 )* )
            {
            // InternalBoardGameDL.g:1557:1: ( ( rule__ValidMove__Group_4_3__0 )* )
            // InternalBoardGameDL.g:1558:2: ( rule__ValidMove__Group_4_3__0 )*
            {
             before(grammarAccess.getValidMoveAccess().getGroup_4_3()); 
            // InternalBoardGameDL.g:1559:2: ( rule__ValidMove__Group_4_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBoardGameDL.g:1559:3: rule__ValidMove__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__ValidMove__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getValidMoveAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group_4__3__Impl"


    // $ANTLR start "rule__ValidMove__Group_4_3__0"
    // InternalBoardGameDL.g:1568:1: rule__ValidMove__Group_4_3__0 : rule__ValidMove__Group_4_3__0__Impl rule__ValidMove__Group_4_3__1 ;
    public final void rule__ValidMove__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1572:1: ( rule__ValidMove__Group_4_3__0__Impl rule__ValidMove__Group_4_3__1 )
            // InternalBoardGameDL.g:1573:2: rule__ValidMove__Group_4_3__0__Impl rule__ValidMove__Group_4_3__1
            {
            pushFollow(FOLLOW_3);
            rule__ValidMove__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidMove__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group_4_3__0"


    // $ANTLR start "rule__ValidMove__Group_4_3__0__Impl"
    // InternalBoardGameDL.g:1580:1: rule__ValidMove__Group_4_3__0__Impl : ( 'and' ) ;
    public final void rule__ValidMove__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1584:1: ( ( 'and' ) )
            // InternalBoardGameDL.g:1585:1: ( 'and' )
            {
            // InternalBoardGameDL.g:1585:1: ( 'and' )
            // InternalBoardGameDL.g:1586:2: 'and'
            {
             before(grammarAccess.getValidMoveAccess().getAndKeyword_4_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getValidMoveAccess().getAndKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group_4_3__0__Impl"


    // $ANTLR start "rule__ValidMove__Group_4_3__1"
    // InternalBoardGameDL.g:1595:1: rule__ValidMove__Group_4_3__1 : rule__ValidMove__Group_4_3__1__Impl ;
    public final void rule__ValidMove__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1599:1: ( rule__ValidMove__Group_4_3__1__Impl )
            // InternalBoardGameDL.g:1600:2: rule__ValidMove__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValidMove__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group_4_3__1"


    // $ANTLR start "rule__ValidMove__Group_4_3__1__Impl"
    // InternalBoardGameDL.g:1606:1: rule__ValidMove__Group_4_3__1__Impl : ( ( rule__ValidMove__ConditionsAssignment_4_3_1 ) ) ;
    public final void rule__ValidMove__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1610:1: ( ( ( rule__ValidMove__ConditionsAssignment_4_3_1 ) ) )
            // InternalBoardGameDL.g:1611:1: ( ( rule__ValidMove__ConditionsAssignment_4_3_1 ) )
            {
            // InternalBoardGameDL.g:1611:1: ( ( rule__ValidMove__ConditionsAssignment_4_3_1 ) )
            // InternalBoardGameDL.g:1612:2: ( rule__ValidMove__ConditionsAssignment_4_3_1 )
            {
             before(grammarAccess.getValidMoveAccess().getConditionsAssignment_4_3_1()); 
            // InternalBoardGameDL.g:1613:2: ( rule__ValidMove__ConditionsAssignment_4_3_1 )
            // InternalBoardGameDL.g:1613:3: rule__ValidMove__ConditionsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ValidMove__ConditionsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getValidMoveAccess().getConditionsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group_4_3__1__Impl"


    // $ANTLR start "rule__EffectOnCell__Group__0"
    // InternalBoardGameDL.g:1622:1: rule__EffectOnCell__Group__0 : rule__EffectOnCell__Group__0__Impl rule__EffectOnCell__Group__1 ;
    public final void rule__EffectOnCell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1626:1: ( rule__EffectOnCell__Group__0__Impl rule__EffectOnCell__Group__1 )
            // InternalBoardGameDL.g:1627:2: rule__EffectOnCell__Group__0__Impl rule__EffectOnCell__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__EffectOnCell__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectOnCell__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__Group__0"


    // $ANTLR start "rule__EffectOnCell__Group__0__Impl"
    // InternalBoardGameDL.g:1634:1: rule__EffectOnCell__Group__0__Impl : ( 'EffectOnCell' ) ;
    public final void rule__EffectOnCell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1638:1: ( ( 'EffectOnCell' ) )
            // InternalBoardGameDL.g:1639:1: ( 'EffectOnCell' )
            {
            // InternalBoardGameDL.g:1639:1: ( 'EffectOnCell' )
            // InternalBoardGameDL.g:1640:2: 'EffectOnCell'
            {
             before(grammarAccess.getEffectOnCellAccess().getEffectOnCellKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEffectOnCellAccess().getEffectOnCellKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__Group__0__Impl"


    // $ANTLR start "rule__EffectOnCell__Group__1"
    // InternalBoardGameDL.g:1649:1: rule__EffectOnCell__Group__1 : rule__EffectOnCell__Group__1__Impl rule__EffectOnCell__Group__2 ;
    public final void rule__EffectOnCell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1653:1: ( rule__EffectOnCell__Group__1__Impl rule__EffectOnCell__Group__2 )
            // InternalBoardGameDL.g:1654:2: rule__EffectOnCell__Group__1__Impl rule__EffectOnCell__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__EffectOnCell__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectOnCell__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__Group__1"


    // $ANTLR start "rule__EffectOnCell__Group__1__Impl"
    // InternalBoardGameDL.g:1661:1: rule__EffectOnCell__Group__1__Impl : ( ( rule__EffectOnCell__NameAssignment_1 ) ) ;
    public final void rule__EffectOnCell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1665:1: ( ( ( rule__EffectOnCell__NameAssignment_1 ) ) )
            // InternalBoardGameDL.g:1666:1: ( ( rule__EffectOnCell__NameAssignment_1 ) )
            {
            // InternalBoardGameDL.g:1666:1: ( ( rule__EffectOnCell__NameAssignment_1 ) )
            // InternalBoardGameDL.g:1667:2: ( rule__EffectOnCell__NameAssignment_1 )
            {
             before(grammarAccess.getEffectOnCellAccess().getNameAssignment_1()); 
            // InternalBoardGameDL.g:1668:2: ( rule__EffectOnCell__NameAssignment_1 )
            // InternalBoardGameDL.g:1668:3: rule__EffectOnCell__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EffectOnCell__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectOnCellAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__Group__1__Impl"


    // $ANTLR start "rule__EffectOnCell__Group__2"
    // InternalBoardGameDL.g:1676:1: rule__EffectOnCell__Group__2 : rule__EffectOnCell__Group__2__Impl rule__EffectOnCell__Group__3 ;
    public final void rule__EffectOnCell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1680:1: ( rule__EffectOnCell__Group__2__Impl rule__EffectOnCell__Group__3 )
            // InternalBoardGameDL.g:1681:2: rule__EffectOnCell__Group__2__Impl rule__EffectOnCell__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__EffectOnCell__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectOnCell__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__Group__2"


    // $ANTLR start "rule__EffectOnCell__Group__2__Impl"
    // InternalBoardGameDL.g:1688:1: rule__EffectOnCell__Group__2__Impl : ( '{' ) ;
    public final void rule__EffectOnCell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1692:1: ( ( '{' ) )
            // InternalBoardGameDL.g:1693:1: ( '{' )
            {
            // InternalBoardGameDL.g:1693:1: ( '{' )
            // InternalBoardGameDL.g:1694:2: '{'
            {
             before(grammarAccess.getEffectOnCellAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEffectOnCellAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__Group__2__Impl"


    // $ANTLR start "rule__EffectOnCell__Group__3"
    // InternalBoardGameDL.g:1703:1: rule__EffectOnCell__Group__3 : rule__EffectOnCell__Group__3__Impl rule__EffectOnCell__Group__4 ;
    public final void rule__EffectOnCell__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1707:1: ( rule__EffectOnCell__Group__3__Impl rule__EffectOnCell__Group__4 )
            // InternalBoardGameDL.g:1708:2: rule__EffectOnCell__Group__3__Impl rule__EffectOnCell__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__EffectOnCell__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectOnCell__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__Group__3"


    // $ANTLR start "rule__EffectOnCell__Group__3__Impl"
    // InternalBoardGameDL.g:1715:1: rule__EffectOnCell__Group__3__Impl : ( ( rule__EffectOnCell__UnorderedGroup_3 ) ) ;
    public final void rule__EffectOnCell__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1719:1: ( ( ( rule__EffectOnCell__UnorderedGroup_3 ) ) )
            // InternalBoardGameDL.g:1720:1: ( ( rule__EffectOnCell__UnorderedGroup_3 ) )
            {
            // InternalBoardGameDL.g:1720:1: ( ( rule__EffectOnCell__UnorderedGroup_3 ) )
            // InternalBoardGameDL.g:1721:2: ( rule__EffectOnCell__UnorderedGroup_3 )
            {
             before(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3()); 
            // InternalBoardGameDL.g:1722:2: ( rule__EffectOnCell__UnorderedGroup_3 )
            // InternalBoardGameDL.g:1722:3: rule__EffectOnCell__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
            rule__EffectOnCell__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__Group__3__Impl"


    // $ANTLR start "rule__EffectOnCell__Group__4"
    // InternalBoardGameDL.g:1730:1: rule__EffectOnCell__Group__4 : rule__EffectOnCell__Group__4__Impl ;
    public final void rule__EffectOnCell__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1734:1: ( rule__EffectOnCell__Group__4__Impl )
            // InternalBoardGameDL.g:1735:2: rule__EffectOnCell__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectOnCell__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__Group__4"


    // $ANTLR start "rule__EffectOnCell__Group__4__Impl"
    // InternalBoardGameDL.g:1741:1: rule__EffectOnCell__Group__4__Impl : ( '}' ) ;
    public final void rule__EffectOnCell__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1745:1: ( ( '}' ) )
            // InternalBoardGameDL.g:1746:1: ( '}' )
            {
            // InternalBoardGameDL.g:1746:1: ( '}' )
            // InternalBoardGameDL.g:1747:2: '}'
            {
             before(grammarAccess.getEffectOnCellAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEffectOnCellAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__Group__4__Impl"


    // $ANTLR start "rule__EffectOnCell__Group_3_0__0"
    // InternalBoardGameDL.g:1757:1: rule__EffectOnCell__Group_3_0__0 : rule__EffectOnCell__Group_3_0__0__Impl rule__EffectOnCell__Group_3_0__1 ;
    public final void rule__EffectOnCell__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1761:1: ( rule__EffectOnCell__Group_3_0__0__Impl rule__EffectOnCell__Group_3_0__1 )
            // InternalBoardGameDL.g:1762:2: rule__EffectOnCell__Group_3_0__0__Impl rule__EffectOnCell__Group_3_0__1
            {
            pushFollow(FOLLOW_25);
            rule__EffectOnCell__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectOnCell__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__Group_3_0__0"


    // $ANTLR start "rule__EffectOnCell__Group_3_0__0__Impl"
    // InternalBoardGameDL.g:1769:1: rule__EffectOnCell__Group_3_0__0__Impl : ( 'relativePosition' ) ;
    public final void rule__EffectOnCell__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1773:1: ( ( 'relativePosition' ) )
            // InternalBoardGameDL.g:1774:1: ( 'relativePosition' )
            {
            // InternalBoardGameDL.g:1774:1: ( 'relativePosition' )
            // InternalBoardGameDL.g:1775:2: 'relativePosition'
            {
             before(grammarAccess.getEffectOnCellAccess().getRelativePositionKeyword_3_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEffectOnCellAccess().getRelativePositionKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__Group_3_0__0__Impl"


    // $ANTLR start "rule__EffectOnCell__Group_3_0__1"
    // InternalBoardGameDL.g:1784:1: rule__EffectOnCell__Group_3_0__1 : rule__EffectOnCell__Group_3_0__1__Impl rule__EffectOnCell__Group_3_0__2 ;
    public final void rule__EffectOnCell__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1788:1: ( rule__EffectOnCell__Group_3_0__1__Impl rule__EffectOnCell__Group_3_0__2 )
            // InternalBoardGameDL.g:1789:2: rule__EffectOnCell__Group_3_0__1__Impl rule__EffectOnCell__Group_3_0__2
            {
            pushFollow(FOLLOW_5);
            rule__EffectOnCell__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectOnCell__Group_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__Group_3_0__1"


    // $ANTLR start "rule__EffectOnCell__Group_3_0__1__Impl"
    // InternalBoardGameDL.g:1796:1: rule__EffectOnCell__Group_3_0__1__Impl : ( '(' ) ;
    public final void rule__EffectOnCell__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1800:1: ( ( '(' ) )
            // InternalBoardGameDL.g:1801:1: ( '(' )
            {
            // InternalBoardGameDL.g:1801:1: ( '(' )
            // InternalBoardGameDL.g:1802:2: '('
            {
             before(grammarAccess.getEffectOnCellAccess().getLeftParenthesisKeyword_3_0_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEffectOnCellAccess().getLeftParenthesisKeyword_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__Group_3_0__1__Impl"


    // $ANTLR start "rule__EffectOnCell__Group_3_0__2"
    // InternalBoardGameDL.g:1811:1: rule__EffectOnCell__Group_3_0__2 : rule__EffectOnCell__Group_3_0__2__Impl rule__EffectOnCell__Group_3_0__3 ;
    public final void rule__EffectOnCell__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1815:1: ( rule__EffectOnCell__Group_3_0__2__Impl rule__EffectOnCell__Group_3_0__3 )
            // InternalBoardGameDL.g:1816:2: rule__EffectOnCell__Group_3_0__2__Impl rule__EffectOnCell__Group_3_0__3
            {
            pushFollow(FOLLOW_13);
            rule__EffectOnCell__Group_3_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectOnCell__Group_3_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__Group_3_0__2"


    // $ANTLR start "rule__EffectOnCell__Group_3_0__2__Impl"
    // InternalBoardGameDL.g:1823:1: rule__EffectOnCell__Group_3_0__2__Impl : ( ( rule__EffectOnCell__XAssignment_3_0_2 ) ) ;
    public final void rule__EffectOnCell__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1827:1: ( ( ( rule__EffectOnCell__XAssignment_3_0_2 ) ) )
            // InternalBoardGameDL.g:1828:1: ( ( rule__EffectOnCell__XAssignment_3_0_2 ) )
            {
            // InternalBoardGameDL.g:1828:1: ( ( rule__EffectOnCell__XAssignment_3_0_2 ) )
            // InternalBoardGameDL.g:1829:2: ( rule__EffectOnCell__XAssignment_3_0_2 )
            {
             before(grammarAccess.getEffectOnCellAccess().getXAssignment_3_0_2()); 
            // InternalBoardGameDL.g:1830:2: ( rule__EffectOnCell__XAssignment_3_0_2 )
            // InternalBoardGameDL.g:1830:3: rule__EffectOnCell__XAssignment_3_0_2
            {
            pushFollow(FOLLOW_2);
            rule__EffectOnCell__XAssignment_3_0_2();

            state._fsp--;


            }

             after(grammarAccess.getEffectOnCellAccess().getXAssignment_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__Group_3_0__2__Impl"


    // $ANTLR start "rule__EffectOnCell__Group_3_0__3"
    // InternalBoardGameDL.g:1838:1: rule__EffectOnCell__Group_3_0__3 : rule__EffectOnCell__Group_3_0__3__Impl rule__EffectOnCell__Group_3_0__4 ;
    public final void rule__EffectOnCell__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1842:1: ( rule__EffectOnCell__Group_3_0__3__Impl rule__EffectOnCell__Group_3_0__4 )
            // InternalBoardGameDL.g:1843:2: rule__EffectOnCell__Group_3_0__3__Impl rule__EffectOnCell__Group_3_0__4
            {
            pushFollow(FOLLOW_5);
            rule__EffectOnCell__Group_3_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectOnCell__Group_3_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__Group_3_0__3"


    // $ANTLR start "rule__EffectOnCell__Group_3_0__3__Impl"
    // InternalBoardGameDL.g:1850:1: rule__EffectOnCell__Group_3_0__3__Impl : ( ',' ) ;
    public final void rule__EffectOnCell__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1854:1: ( ( ',' ) )
            // InternalBoardGameDL.g:1855:1: ( ',' )
            {
            // InternalBoardGameDL.g:1855:1: ( ',' )
            // InternalBoardGameDL.g:1856:2: ','
            {
             before(grammarAccess.getEffectOnCellAccess().getCommaKeyword_3_0_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEffectOnCellAccess().getCommaKeyword_3_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__Group_3_0__3__Impl"


    // $ANTLR start "rule__EffectOnCell__Group_3_0__4"
    // InternalBoardGameDL.g:1865:1: rule__EffectOnCell__Group_3_0__4 : rule__EffectOnCell__Group_3_0__4__Impl rule__EffectOnCell__Group_3_0__5 ;
    public final void rule__EffectOnCell__Group_3_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1869:1: ( rule__EffectOnCell__Group_3_0__4__Impl rule__EffectOnCell__Group_3_0__5 )
            // InternalBoardGameDL.g:1870:2: rule__EffectOnCell__Group_3_0__4__Impl rule__EffectOnCell__Group_3_0__5
            {
            pushFollow(FOLLOW_26);
            rule__EffectOnCell__Group_3_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectOnCell__Group_3_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__Group_3_0__4"


    // $ANTLR start "rule__EffectOnCell__Group_3_0__4__Impl"
    // InternalBoardGameDL.g:1877:1: rule__EffectOnCell__Group_3_0__4__Impl : ( ( rule__EffectOnCell__YAssignment_3_0_4 ) ) ;
    public final void rule__EffectOnCell__Group_3_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1881:1: ( ( ( rule__EffectOnCell__YAssignment_3_0_4 ) ) )
            // InternalBoardGameDL.g:1882:1: ( ( rule__EffectOnCell__YAssignment_3_0_4 ) )
            {
            // InternalBoardGameDL.g:1882:1: ( ( rule__EffectOnCell__YAssignment_3_0_4 ) )
            // InternalBoardGameDL.g:1883:2: ( rule__EffectOnCell__YAssignment_3_0_4 )
            {
             before(grammarAccess.getEffectOnCellAccess().getYAssignment_3_0_4()); 
            // InternalBoardGameDL.g:1884:2: ( rule__EffectOnCell__YAssignment_3_0_4 )
            // InternalBoardGameDL.g:1884:3: rule__EffectOnCell__YAssignment_3_0_4
            {
            pushFollow(FOLLOW_2);
            rule__EffectOnCell__YAssignment_3_0_4();

            state._fsp--;


            }

             after(grammarAccess.getEffectOnCellAccess().getYAssignment_3_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__Group_3_0__4__Impl"


    // $ANTLR start "rule__EffectOnCell__Group_3_0__5"
    // InternalBoardGameDL.g:1892:1: rule__EffectOnCell__Group_3_0__5 : rule__EffectOnCell__Group_3_0__5__Impl ;
    public final void rule__EffectOnCell__Group_3_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1896:1: ( rule__EffectOnCell__Group_3_0__5__Impl )
            // InternalBoardGameDL.g:1897:2: rule__EffectOnCell__Group_3_0__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectOnCell__Group_3_0__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__Group_3_0__5"


    // $ANTLR start "rule__EffectOnCell__Group_3_0__5__Impl"
    // InternalBoardGameDL.g:1903:1: rule__EffectOnCell__Group_3_0__5__Impl : ( ')' ) ;
    public final void rule__EffectOnCell__Group_3_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1907:1: ( ( ')' ) )
            // InternalBoardGameDL.g:1908:1: ( ')' )
            {
            // InternalBoardGameDL.g:1908:1: ( ')' )
            // InternalBoardGameDL.g:1909:2: ')'
            {
             before(grammarAccess.getEffectOnCellAccess().getRightParenthesisKeyword_3_0_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEffectOnCellAccess().getRightParenthesisKeyword_3_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__Group_3_0__5__Impl"


    // $ANTLR start "rule__EffectOnCell__Group_3_1__0"
    // InternalBoardGameDL.g:1919:1: rule__EffectOnCell__Group_3_1__0 : rule__EffectOnCell__Group_3_1__0__Impl rule__EffectOnCell__Group_3_1__1 ;
    public final void rule__EffectOnCell__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1923:1: ( rule__EffectOnCell__Group_3_1__0__Impl rule__EffectOnCell__Group_3_1__1 )
            // InternalBoardGameDL.g:1924:2: rule__EffectOnCell__Group_3_1__0__Impl rule__EffectOnCell__Group_3_1__1
            {
            pushFollow(FOLLOW_3);
            rule__EffectOnCell__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectOnCell__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__Group_3_1__0"


    // $ANTLR start "rule__EffectOnCell__Group_3_1__0__Impl"
    // InternalBoardGameDL.g:1931:1: rule__EffectOnCell__Group_3_1__0__Impl : ( 'newCellState' ) ;
    public final void rule__EffectOnCell__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1935:1: ( ( 'newCellState' ) )
            // InternalBoardGameDL.g:1936:1: ( 'newCellState' )
            {
            // InternalBoardGameDL.g:1936:1: ( 'newCellState' )
            // InternalBoardGameDL.g:1937:2: 'newCellState'
            {
             before(grammarAccess.getEffectOnCellAccess().getNewCellStateKeyword_3_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEffectOnCellAccess().getNewCellStateKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__Group_3_1__0__Impl"


    // $ANTLR start "rule__EffectOnCell__Group_3_1__1"
    // InternalBoardGameDL.g:1946:1: rule__EffectOnCell__Group_3_1__1 : rule__EffectOnCell__Group_3_1__1__Impl ;
    public final void rule__EffectOnCell__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1950:1: ( rule__EffectOnCell__Group_3_1__1__Impl )
            // InternalBoardGameDL.g:1951:2: rule__EffectOnCell__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectOnCell__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__Group_3_1__1"


    // $ANTLR start "rule__EffectOnCell__Group_3_1__1__Impl"
    // InternalBoardGameDL.g:1957:1: rule__EffectOnCell__Group_3_1__1__Impl : ( ( rule__EffectOnCell__CellStateAssignment_3_1_1 ) ) ;
    public final void rule__EffectOnCell__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1961:1: ( ( ( rule__EffectOnCell__CellStateAssignment_3_1_1 ) ) )
            // InternalBoardGameDL.g:1962:1: ( ( rule__EffectOnCell__CellStateAssignment_3_1_1 ) )
            {
            // InternalBoardGameDL.g:1962:1: ( ( rule__EffectOnCell__CellStateAssignment_3_1_1 ) )
            // InternalBoardGameDL.g:1963:2: ( rule__EffectOnCell__CellStateAssignment_3_1_1 )
            {
             before(grammarAccess.getEffectOnCellAccess().getCellStateAssignment_3_1_1()); 
            // InternalBoardGameDL.g:1964:2: ( rule__EffectOnCell__CellStateAssignment_3_1_1 )
            // InternalBoardGameDL.g:1964:3: rule__EffectOnCell__CellStateAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EffectOnCell__CellStateAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectOnCellAccess().getCellStateAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__Group_3_1__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalBoardGameDL.g:1973:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1977:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalBoardGameDL.g:1978:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalBoardGameDL.g:1985:1: rule__Condition__Group__0__Impl : ( 'Condition' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1989:1: ( ( 'Condition' ) )
            // InternalBoardGameDL.g:1990:1: ( 'Condition' )
            {
            // InternalBoardGameDL.g:1990:1: ( 'Condition' )
            // InternalBoardGameDL.g:1991:2: 'Condition'
            {
             before(grammarAccess.getConditionAccess().getConditionKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getConditionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalBoardGameDL.g:2000:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2004:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalBoardGameDL.g:2005:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Condition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalBoardGameDL.g:2012:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__NameAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2016:1: ( ( ( rule__Condition__NameAssignment_1 ) ) )
            // InternalBoardGameDL.g:2017:1: ( ( rule__Condition__NameAssignment_1 ) )
            {
            // InternalBoardGameDL.g:2017:1: ( ( rule__Condition__NameAssignment_1 ) )
            // InternalBoardGameDL.g:2018:2: ( rule__Condition__NameAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getNameAssignment_1()); 
            // InternalBoardGameDL.g:2019:2: ( rule__Condition__NameAssignment_1 )
            // InternalBoardGameDL.g:2019:3: rule__Condition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // InternalBoardGameDL.g:2027:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2031:1: ( rule__Condition__Group__2__Impl )
            // InternalBoardGameDL.g:2032:2: rule__Condition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // InternalBoardGameDL.g:2038:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__CellStateAssignment_2 ) ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2042:1: ( ( ( rule__Condition__CellStateAssignment_2 ) ) )
            // InternalBoardGameDL.g:2043:1: ( ( rule__Condition__CellStateAssignment_2 ) )
            {
            // InternalBoardGameDL.g:2043:1: ( ( rule__Condition__CellStateAssignment_2 ) )
            // InternalBoardGameDL.g:2044:2: ( rule__Condition__CellStateAssignment_2 )
            {
             before(grammarAccess.getConditionAccess().getCellStateAssignment_2()); 
            // InternalBoardGameDL.g:2045:2: ( rule__Condition__CellStateAssignment_2 )
            // InternalBoardGameDL.g:2045:3: rule__Condition__CellStateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Condition__CellStateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getCellStateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Line__Group__0"
    // InternalBoardGameDL.g:2054:1: rule__Line__Group__0 : rule__Line__Group__0__Impl rule__Line__Group__1 ;
    public final void rule__Line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2058:1: ( rule__Line__Group__0__Impl rule__Line__Group__1 )
            // InternalBoardGameDL.g:2059:2: rule__Line__Group__0__Impl rule__Line__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Line__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__0"


    // $ANTLR start "rule__Line__Group__0__Impl"
    // InternalBoardGameDL.g:2066:1: rule__Line__Group__0__Impl : ( 'Line' ) ;
    public final void rule__Line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2070:1: ( ( 'Line' ) )
            // InternalBoardGameDL.g:2071:1: ( 'Line' )
            {
            // InternalBoardGameDL.g:2071:1: ( 'Line' )
            // InternalBoardGameDL.g:2072:2: 'Line'
            {
             before(grammarAccess.getLineAccess().getLineKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getLineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__0__Impl"


    // $ANTLR start "rule__Line__Group__1"
    // InternalBoardGameDL.g:2081:1: rule__Line__Group__1 : rule__Line__Group__1__Impl rule__Line__Group__2 ;
    public final void rule__Line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2085:1: ( rule__Line__Group__1__Impl rule__Line__Group__2 )
            // InternalBoardGameDL.g:2086:2: rule__Line__Group__1__Impl rule__Line__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Line__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__1"


    // $ANTLR start "rule__Line__Group__1__Impl"
    // InternalBoardGameDL.g:2093:1: rule__Line__Group__1__Impl : ( 'length' ) ;
    public final void rule__Line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2097:1: ( ( 'length' ) )
            // InternalBoardGameDL.g:2098:1: ( 'length' )
            {
            // InternalBoardGameDL.g:2098:1: ( 'length' )
            // InternalBoardGameDL.g:2099:2: 'length'
            {
             before(grammarAccess.getLineAccess().getLengthKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getLengthKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__1__Impl"


    // $ANTLR start "rule__Line__Group__2"
    // InternalBoardGameDL.g:2108:1: rule__Line__Group__2 : rule__Line__Group__2__Impl rule__Line__Group__3 ;
    public final void rule__Line__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2112:1: ( rule__Line__Group__2__Impl rule__Line__Group__3 )
            // InternalBoardGameDL.g:2113:2: rule__Line__Group__2__Impl rule__Line__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Line__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__2"


    // $ANTLR start "rule__Line__Group__2__Impl"
    // InternalBoardGameDL.g:2120:1: rule__Line__Group__2__Impl : ( ( rule__Line__LengthAssignment_2 ) ) ;
    public final void rule__Line__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2124:1: ( ( ( rule__Line__LengthAssignment_2 ) ) )
            // InternalBoardGameDL.g:2125:1: ( ( rule__Line__LengthAssignment_2 ) )
            {
            // InternalBoardGameDL.g:2125:1: ( ( rule__Line__LengthAssignment_2 ) )
            // InternalBoardGameDL.g:2126:2: ( rule__Line__LengthAssignment_2 )
            {
             before(grammarAccess.getLineAccess().getLengthAssignment_2()); 
            // InternalBoardGameDL.g:2127:2: ( rule__Line__LengthAssignment_2 )
            // InternalBoardGameDL.g:2127:3: rule__Line__LengthAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Line__LengthAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getLengthAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__2__Impl"


    // $ANTLR start "rule__Line__Group__3"
    // InternalBoardGameDL.g:2135:1: rule__Line__Group__3 : rule__Line__Group__3__Impl rule__Line__Group__4 ;
    public final void rule__Line__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2139:1: ( rule__Line__Group__3__Impl rule__Line__Group__4 )
            // InternalBoardGameDL.g:2140:2: rule__Line__Group__3__Impl rule__Line__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Line__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__3"


    // $ANTLR start "rule__Line__Group__3__Impl"
    // InternalBoardGameDL.g:2147:1: rule__Line__Group__3__Impl : ( 'direction' ) ;
    public final void rule__Line__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2151:1: ( ( 'direction' ) )
            // InternalBoardGameDL.g:2152:1: ( 'direction' )
            {
            // InternalBoardGameDL.g:2152:1: ( 'direction' )
            // InternalBoardGameDL.g:2153:2: 'direction'
            {
             before(grammarAccess.getLineAccess().getDirectionKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getDirectionKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__3__Impl"


    // $ANTLR start "rule__Line__Group__4"
    // InternalBoardGameDL.g:2162:1: rule__Line__Group__4 : rule__Line__Group__4__Impl ;
    public final void rule__Line__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2166:1: ( rule__Line__Group__4__Impl )
            // InternalBoardGameDL.g:2167:2: rule__Line__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Line__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__4"


    // $ANTLR start "rule__Line__Group__4__Impl"
    // InternalBoardGameDL.g:2173:1: rule__Line__Group__4__Impl : ( ( rule__Line__DirectionAssignment_4 ) ) ;
    public final void rule__Line__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2177:1: ( ( ( rule__Line__DirectionAssignment_4 ) ) )
            // InternalBoardGameDL.g:2178:1: ( ( rule__Line__DirectionAssignment_4 ) )
            {
            // InternalBoardGameDL.g:2178:1: ( ( rule__Line__DirectionAssignment_4 ) )
            // InternalBoardGameDL.g:2179:2: ( rule__Line__DirectionAssignment_4 )
            {
             before(grammarAccess.getLineAccess().getDirectionAssignment_4()); 
            // InternalBoardGameDL.g:2180:2: ( rule__Line__DirectionAssignment_4 )
            // InternalBoardGameDL.g:2180:3: rule__Line__DirectionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Line__DirectionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getDirectionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__4__Impl"


    // $ANTLR start "rule__EffectOnCell__UnorderedGroup_3"
    // InternalBoardGameDL.g:2189:1: rule__EffectOnCell__UnorderedGroup_3 : rule__EffectOnCell__UnorderedGroup_3__0 {...}?;
    public final void rule__EffectOnCell__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3());
        	
        try {
            // InternalBoardGameDL.g:2194:1: ( rule__EffectOnCell__UnorderedGroup_3__0 {...}?)
            // InternalBoardGameDL.g:2195:2: rule__EffectOnCell__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__EffectOnCell__UnorderedGroup_3__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "rule__EffectOnCell__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__UnorderedGroup_3"


    // $ANTLR start "rule__EffectOnCell__UnorderedGroup_3__Impl"
    // InternalBoardGameDL.g:2203:1: rule__EffectOnCell__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__EffectOnCell__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EffectOnCell__Group_3_1__0 ) ) ) ) ) ;
    public final void rule__EffectOnCell__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalBoardGameDL.g:2208:1: ( ( ({...}? => ( ( ( rule__EffectOnCell__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EffectOnCell__Group_3_1__0 ) ) ) ) ) )
            // InternalBoardGameDL.g:2209:3: ( ({...}? => ( ( ( rule__EffectOnCell__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EffectOnCell__Group_3_1__0 ) ) ) ) )
            {
            // InternalBoardGameDL.g:2209:3: ( ({...}? => ( ( ( rule__EffectOnCell__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EffectOnCell__Group_3_1__0 ) ) ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( LA12_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 0) ) {
                alt12=1;
            }
            else if ( LA12_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 1) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalBoardGameDL.g:2210:3: ({...}? => ( ( ( rule__EffectOnCell__Group_3_0__0 ) ) ) )
                    {
                    // InternalBoardGameDL.g:2210:3: ({...}? => ( ( ( rule__EffectOnCell__Group_3_0__0 ) ) ) )
                    // InternalBoardGameDL.g:2211:4: {...}? => ( ( ( rule__EffectOnCell__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__EffectOnCell__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalBoardGameDL.g:2211:108: ( ( ( rule__EffectOnCell__Group_3_0__0 ) ) )
                    // InternalBoardGameDL.g:2212:5: ( ( rule__EffectOnCell__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalBoardGameDL.g:2218:5: ( ( rule__EffectOnCell__Group_3_0__0 ) )
                    // InternalBoardGameDL.g:2219:6: ( rule__EffectOnCell__Group_3_0__0 )
                    {
                     before(grammarAccess.getEffectOnCellAccess().getGroup_3_0()); 
                    // InternalBoardGameDL.g:2220:6: ( rule__EffectOnCell__Group_3_0__0 )
                    // InternalBoardGameDL.g:2220:7: rule__EffectOnCell__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EffectOnCell__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEffectOnCellAccess().getGroup_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBoardGameDL.g:2225:3: ({...}? => ( ( ( rule__EffectOnCell__Group_3_1__0 ) ) ) )
                    {
                    // InternalBoardGameDL.g:2225:3: ({...}? => ( ( ( rule__EffectOnCell__Group_3_1__0 ) ) ) )
                    // InternalBoardGameDL.g:2226:4: {...}? => ( ( ( rule__EffectOnCell__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__EffectOnCell__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalBoardGameDL.g:2226:108: ( ( ( rule__EffectOnCell__Group_3_1__0 ) ) )
                    // InternalBoardGameDL.g:2227:5: ( ( rule__EffectOnCell__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalBoardGameDL.g:2233:5: ( ( rule__EffectOnCell__Group_3_1__0 ) )
                    // InternalBoardGameDL.g:2234:6: ( rule__EffectOnCell__Group_3_1__0 )
                    {
                     before(grammarAccess.getEffectOnCellAccess().getGroup_3_1()); 
                    // InternalBoardGameDL.g:2235:6: ( rule__EffectOnCell__Group_3_1__0 )
                    // InternalBoardGameDL.g:2235:7: rule__EffectOnCell__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EffectOnCell__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEffectOnCellAccess().getGroup_3_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__EffectOnCell__UnorderedGroup_3__0"
    // InternalBoardGameDL.g:2248:1: rule__EffectOnCell__UnorderedGroup_3__0 : rule__EffectOnCell__UnorderedGroup_3__Impl ( rule__EffectOnCell__UnorderedGroup_3__1 )? ;
    public final void rule__EffectOnCell__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2252:1: ( rule__EffectOnCell__UnorderedGroup_3__Impl ( rule__EffectOnCell__UnorderedGroup_3__1 )? )
            // InternalBoardGameDL.g:2253:2: rule__EffectOnCell__UnorderedGroup_3__Impl ( rule__EffectOnCell__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_30);
            rule__EffectOnCell__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalBoardGameDL.g:2254:2: ( rule__EffectOnCell__UnorderedGroup_3__1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( LA13_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 0) ) {
                alt13=1;
            }
            else if ( LA13_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 1) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBoardGameDL.g:2254:2: rule__EffectOnCell__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__EffectOnCell__UnorderedGroup_3__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__UnorderedGroup_3__0"


    // $ANTLR start "rule__EffectOnCell__UnorderedGroup_3__1"
    // InternalBoardGameDL.g:2260:1: rule__EffectOnCell__UnorderedGroup_3__1 : rule__EffectOnCell__UnorderedGroup_3__Impl ;
    public final void rule__EffectOnCell__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2264:1: ( rule__EffectOnCell__UnorderedGroup_3__Impl )
            // InternalBoardGameDL.g:2265:2: rule__EffectOnCell__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectOnCell__UnorderedGroup_3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__UnorderedGroup_3__1"


    // $ANTLR start "rule__BoardGame__NameAssignment_1"
    // InternalBoardGameDL.g:2272:1: rule__BoardGame__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__BoardGame__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2276:1: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2277:2: ( ruleEString )
            {
            // InternalBoardGameDL.g:2277:2: ( ruleEString )
            // InternalBoardGameDL.g:2278:3: ruleEString
            {
             before(grammarAccess.getBoardGameAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBoardGameAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoardGame__NameAssignment_1"


    // $ANTLR start "rule__BoardGame__SizeAssignment_3"
    // InternalBoardGameDL.g:2287:1: rule__BoardGame__SizeAssignment_3 : ( ruleEInt ) ;
    public final void rule__BoardGame__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2291:1: ( ( ruleEInt ) )
            // InternalBoardGameDL.g:2292:2: ( ruleEInt )
            {
            // InternalBoardGameDL.g:2292:2: ( ruleEInt )
            // InternalBoardGameDL.g:2293:3: ruleEInt
            {
             before(grammarAccess.getBoardGameAccess().getSizeEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getBoardGameAccess().getSizeEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoardGame__SizeAssignment_3"


    // $ANTLR start "rule__BoardGame__BoardGameElementsAssignment_4"
    // InternalBoardGameDL.g:2302:1: rule__BoardGame__BoardGameElementsAssignment_4 : ( ruleBoardGameElement ) ;
    public final void rule__BoardGame__BoardGameElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2306:1: ( ( ruleBoardGameElement ) )
            // InternalBoardGameDL.g:2307:2: ( ruleBoardGameElement )
            {
            // InternalBoardGameDL.g:2307:2: ( ruleBoardGameElement )
            // InternalBoardGameDL.g:2308:3: ruleBoardGameElement
            {
             before(grammarAccess.getBoardGameAccess().getBoardGameElementsBoardGameElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBoardGameElement();

            state._fsp--;

             after(grammarAccess.getBoardGameAccess().getBoardGameElementsBoardGameElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoardGame__BoardGameElementsAssignment_4"


    // $ANTLR start "rule__PieceType__NameAssignment_1"
    // InternalBoardGameDL.g:2317:1: rule__PieceType__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__PieceType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2321:1: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2322:2: ( ruleEString )
            {
            // InternalBoardGameDL.g:2322:2: ( ruleEString )
            // InternalBoardGameDL.g:2323:3: ruleEString
            {
             before(grammarAccess.getPieceTypeAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPieceTypeAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__NameAssignment_1"


    // $ANTLR start "rule__PieceType__SymbolAssignment_4"
    // InternalBoardGameDL.g:2332:1: rule__PieceType__SymbolAssignment_4 : ( ruleEString ) ;
    public final void rule__PieceType__SymbolAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2336:1: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2337:2: ( ruleEString )
            {
            // InternalBoardGameDL.g:2337:2: ( ruleEString )
            // InternalBoardGameDL.g:2338:3: ruleEString
            {
             before(grammarAccess.getPieceTypeAccess().getSymbolEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPieceTypeAccess().getSymbolEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__SymbolAssignment_4"


    // $ANTLR start "rule__PieceType__ValidMovesAssignment_6"
    // InternalBoardGameDL.g:2347:1: rule__PieceType__ValidMovesAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__PieceType__ValidMovesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2351:1: ( ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:2352:2: ( ( ruleEString ) )
            {
            // InternalBoardGameDL.g:2352:2: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2353:3: ( ruleEString )
            {
             before(grammarAccess.getPieceTypeAccess().getValidMovesValidMoveCrossReference_6_0()); 
            // InternalBoardGameDL.g:2354:3: ( ruleEString )
            // InternalBoardGameDL.g:2355:4: ruleEString
            {
             before(grammarAccess.getPieceTypeAccess().getValidMovesValidMoveEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPieceTypeAccess().getValidMovesValidMoveEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getPieceTypeAccess().getValidMovesValidMoveCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__ValidMovesAssignment_6"


    // $ANTLR start "rule__PieceType__ValidMovesAssignment_7_1"
    // InternalBoardGameDL.g:2366:1: rule__PieceType__ValidMovesAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__PieceType__ValidMovesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2370:1: ( ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:2371:2: ( ( ruleEString ) )
            {
            // InternalBoardGameDL.g:2371:2: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2372:3: ( ruleEString )
            {
             before(grammarAccess.getPieceTypeAccess().getValidMovesValidMoveCrossReference_7_1_0()); 
            // InternalBoardGameDL.g:2373:3: ( ruleEString )
            // InternalBoardGameDL.g:2374:4: ruleEString
            {
             before(grammarAccess.getPieceTypeAccess().getValidMovesValidMoveEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPieceTypeAccess().getValidMovesValidMoveEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getPieceTypeAccess().getValidMovesValidMoveCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__ValidMovesAssignment_7_1"


    // $ANTLR start "rule__PieceType__EffectsoncellAssignment_8_1"
    // InternalBoardGameDL.g:2385:1: rule__PieceType__EffectsoncellAssignment_8_1 : ( ( ruleEString ) ) ;
    public final void rule__PieceType__EffectsoncellAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2389:1: ( ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:2390:2: ( ( ruleEString ) )
            {
            // InternalBoardGameDL.g:2390:2: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2391:3: ( ruleEString )
            {
             before(grammarAccess.getPieceTypeAccess().getEffectsoncellEffectOnCellCrossReference_8_1_0()); 
            // InternalBoardGameDL.g:2392:3: ( ruleEString )
            // InternalBoardGameDL.g:2393:4: ruleEString
            {
             before(grammarAccess.getPieceTypeAccess().getEffectsoncellEffectOnCellEStringParserRuleCall_8_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPieceTypeAccess().getEffectsoncellEffectOnCellEStringParserRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getPieceTypeAccess().getEffectsoncellEffectOnCellCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__EffectsoncellAssignment_8_1"


    // $ANTLR start "rule__PieceType__EffectsoncellAssignment_8_2_1"
    // InternalBoardGameDL.g:2404:1: rule__PieceType__EffectsoncellAssignment_8_2_1 : ( ( ruleEString ) ) ;
    public final void rule__PieceType__EffectsoncellAssignment_8_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2408:1: ( ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:2409:2: ( ( ruleEString ) )
            {
            // InternalBoardGameDL.g:2409:2: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2410:3: ( ruleEString )
            {
             before(grammarAccess.getPieceTypeAccess().getEffectsoncellEffectOnCellCrossReference_8_2_1_0()); 
            // InternalBoardGameDL.g:2411:3: ( ruleEString )
            // InternalBoardGameDL.g:2412:4: ruleEString
            {
             before(grammarAccess.getPieceTypeAccess().getEffectsoncellEffectOnCellEStringParserRuleCall_8_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPieceTypeAccess().getEffectsoncellEffectOnCellEStringParserRuleCall_8_2_1_0_1()); 

            }

             after(grammarAccess.getPieceTypeAccess().getEffectsoncellEffectOnCellCrossReference_8_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__EffectsoncellAssignment_8_2_1"


    // $ANTLR start "rule__CellState__NameAssignment_1"
    // InternalBoardGameDL.g:2423:1: rule__CellState__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CellState__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2427:1: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2428:2: ( ruleEString )
            {
            // InternalBoardGameDL.g:2428:2: ( ruleEString )
            // InternalBoardGameDL.g:2429:3: ruleEString
            {
             before(grammarAccess.getCellStateAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCellStateAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__NameAssignment_1"


    // $ANTLR start "rule__WinCondition__WinConditionElementsAssignment_2"
    // InternalBoardGameDL.g:2438:1: rule__WinCondition__WinConditionElementsAssignment_2 : ( ruleWinConditionElement ) ;
    public final void rule__WinCondition__WinConditionElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2442:1: ( ( ruleWinConditionElement ) )
            // InternalBoardGameDL.g:2443:2: ( ruleWinConditionElement )
            {
            // InternalBoardGameDL.g:2443:2: ( ruleWinConditionElement )
            // InternalBoardGameDL.g:2444:3: ruleWinConditionElement
            {
             before(grammarAccess.getWinConditionAccess().getWinConditionElementsWinConditionElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleWinConditionElement();

            state._fsp--;

             after(grammarAccess.getWinConditionAccess().getWinConditionElementsWinConditionElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WinCondition__WinConditionElementsAssignment_2"


    // $ANTLR start "rule__WinCondition__WinConditionElementsAssignment_3"
    // InternalBoardGameDL.g:2453:1: rule__WinCondition__WinConditionElementsAssignment_3 : ( ruleWinConditionElement ) ;
    public final void rule__WinCondition__WinConditionElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2457:1: ( ( ruleWinConditionElement ) )
            // InternalBoardGameDL.g:2458:2: ( ruleWinConditionElement )
            {
            // InternalBoardGameDL.g:2458:2: ( ruleWinConditionElement )
            // InternalBoardGameDL.g:2459:3: ruleWinConditionElement
            {
             before(grammarAccess.getWinConditionAccess().getWinConditionElementsWinConditionElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleWinConditionElement();

            state._fsp--;

             after(grammarAccess.getWinConditionAccess().getWinConditionElementsWinConditionElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WinCondition__WinConditionElementsAssignment_3"


    // $ANTLR start "rule__ValidMove__NameAssignment_1"
    // InternalBoardGameDL.g:2468:1: rule__ValidMove__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ValidMove__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2472:1: ( ( RULE_ID ) )
            // InternalBoardGameDL.g:2473:2: ( RULE_ID )
            {
            // InternalBoardGameDL.g:2473:2: ( RULE_ID )
            // InternalBoardGameDL.g:2474:3: RULE_ID
            {
             before(grammarAccess.getValidMoveAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getValidMoveAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__NameAssignment_1"


    // $ANTLR start "rule__ValidMove__PlaceAnywhereAssignment_3"
    // InternalBoardGameDL.g:2483:1: rule__ValidMove__PlaceAnywhereAssignment_3 : ( ( 'placeAnywhere' ) ) ;
    public final void rule__ValidMove__PlaceAnywhereAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2487:1: ( ( ( 'placeAnywhere' ) ) )
            // InternalBoardGameDL.g:2488:2: ( ( 'placeAnywhere' ) )
            {
            // InternalBoardGameDL.g:2488:2: ( ( 'placeAnywhere' ) )
            // InternalBoardGameDL.g:2489:3: ( 'placeAnywhere' )
            {
             before(grammarAccess.getValidMoveAccess().getPlaceAnywherePlaceAnywhereKeyword_3_0()); 
            // InternalBoardGameDL.g:2490:3: ( 'placeAnywhere' )
            // InternalBoardGameDL.g:2491:4: 'placeAnywhere'
            {
             before(grammarAccess.getValidMoveAccess().getPlaceAnywherePlaceAnywhereKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getValidMoveAccess().getPlaceAnywherePlaceAnywhereKeyword_3_0()); 

            }

             after(grammarAccess.getValidMoveAccess().getPlaceAnywherePlaceAnywhereKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__PlaceAnywhereAssignment_3"


    // $ANTLR start "rule__ValidMove__ConditionsAssignment_4_2"
    // InternalBoardGameDL.g:2502:1: rule__ValidMove__ConditionsAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__ValidMove__ConditionsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2506:1: ( ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:2507:2: ( ( ruleEString ) )
            {
            // InternalBoardGameDL.g:2507:2: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2508:3: ( ruleEString )
            {
             before(grammarAccess.getValidMoveAccess().getConditionsConditionCrossReference_4_2_0()); 
            // InternalBoardGameDL.g:2509:3: ( ruleEString )
            // InternalBoardGameDL.g:2510:4: ruleEString
            {
             before(grammarAccess.getValidMoveAccess().getConditionsConditionEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getValidMoveAccess().getConditionsConditionEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getValidMoveAccess().getConditionsConditionCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__ConditionsAssignment_4_2"


    // $ANTLR start "rule__ValidMove__ConditionsAssignment_4_3_1"
    // InternalBoardGameDL.g:2521:1: rule__ValidMove__ConditionsAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ValidMove__ConditionsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2525:1: ( ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:2526:2: ( ( ruleEString ) )
            {
            // InternalBoardGameDL.g:2526:2: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2527:3: ( ruleEString )
            {
             before(grammarAccess.getValidMoveAccess().getConditionsConditionCrossReference_4_3_1_0()); 
            // InternalBoardGameDL.g:2528:3: ( ruleEString )
            // InternalBoardGameDL.g:2529:4: ruleEString
            {
             before(grammarAccess.getValidMoveAccess().getConditionsConditionEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getValidMoveAccess().getConditionsConditionEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getValidMoveAccess().getConditionsConditionCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__ConditionsAssignment_4_3_1"


    // $ANTLR start "rule__EffectOnCell__NameAssignment_1"
    // InternalBoardGameDL.g:2540:1: rule__EffectOnCell__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EffectOnCell__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2544:1: ( ( RULE_ID ) )
            // InternalBoardGameDL.g:2545:2: ( RULE_ID )
            {
            // InternalBoardGameDL.g:2545:2: ( RULE_ID )
            // InternalBoardGameDL.g:2546:3: RULE_ID
            {
             before(grammarAccess.getEffectOnCellAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEffectOnCellAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__NameAssignment_1"


    // $ANTLR start "rule__EffectOnCell__XAssignment_3_0_2"
    // InternalBoardGameDL.g:2555:1: rule__EffectOnCell__XAssignment_3_0_2 : ( ruleEInt ) ;
    public final void rule__EffectOnCell__XAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2559:1: ( ( ruleEInt ) )
            // InternalBoardGameDL.g:2560:2: ( ruleEInt )
            {
            // InternalBoardGameDL.g:2560:2: ( ruleEInt )
            // InternalBoardGameDL.g:2561:3: ruleEInt
            {
             before(grammarAccess.getEffectOnCellAccess().getXEIntParserRuleCall_3_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEffectOnCellAccess().getXEIntParserRuleCall_3_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__XAssignment_3_0_2"


    // $ANTLR start "rule__EffectOnCell__YAssignment_3_0_4"
    // InternalBoardGameDL.g:2570:1: rule__EffectOnCell__YAssignment_3_0_4 : ( ruleEInt ) ;
    public final void rule__EffectOnCell__YAssignment_3_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2574:1: ( ( ruleEInt ) )
            // InternalBoardGameDL.g:2575:2: ( ruleEInt )
            {
            // InternalBoardGameDL.g:2575:2: ( ruleEInt )
            // InternalBoardGameDL.g:2576:3: ruleEInt
            {
             before(grammarAccess.getEffectOnCellAccess().getYEIntParserRuleCall_3_0_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEffectOnCellAccess().getYEIntParserRuleCall_3_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__YAssignment_3_0_4"


    // $ANTLR start "rule__EffectOnCell__CellStateAssignment_3_1_1"
    // InternalBoardGameDL.g:2585:1: rule__EffectOnCell__CellStateAssignment_3_1_1 : ( ( ruleEString ) ) ;
    public final void rule__EffectOnCell__CellStateAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2589:1: ( ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:2590:2: ( ( ruleEString ) )
            {
            // InternalBoardGameDL.g:2590:2: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2591:3: ( ruleEString )
            {
             before(grammarAccess.getEffectOnCellAccess().getCellStateCellStateCrossReference_3_1_1_0()); 
            // InternalBoardGameDL.g:2592:3: ( ruleEString )
            // InternalBoardGameDL.g:2593:4: ruleEString
            {
             before(grammarAccess.getEffectOnCellAccess().getCellStateCellStateEStringParserRuleCall_3_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEffectOnCellAccess().getCellStateCellStateEStringParserRuleCall_3_1_1_0_1()); 

            }

             after(grammarAccess.getEffectOnCellAccess().getCellStateCellStateCrossReference_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__CellStateAssignment_3_1_1"


    // $ANTLR start "rule__Condition__NameAssignment_1"
    // InternalBoardGameDL.g:2604:1: rule__Condition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Condition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2608:1: ( ( RULE_ID ) )
            // InternalBoardGameDL.g:2609:2: ( RULE_ID )
            {
            // InternalBoardGameDL.g:2609:2: ( RULE_ID )
            // InternalBoardGameDL.g:2610:3: RULE_ID
            {
             before(grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__NameAssignment_1"


    // $ANTLR start "rule__Condition__CellStateAssignment_2"
    // InternalBoardGameDL.g:2619:1: rule__Condition__CellStateAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Condition__CellStateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2623:1: ( ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:2624:2: ( ( ruleEString ) )
            {
            // InternalBoardGameDL.g:2624:2: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2625:3: ( ruleEString )
            {
             before(grammarAccess.getConditionAccess().getCellStateCellStateCrossReference_2_0()); 
            // InternalBoardGameDL.g:2626:3: ( ruleEString )
            // InternalBoardGameDL.g:2627:4: ruleEString
            {
             before(grammarAccess.getConditionAccess().getCellStateCellStateEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getCellStateCellStateEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getConditionAccess().getCellStateCellStateCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__CellStateAssignment_2"


    // $ANTLR start "rule__Line__LengthAssignment_2"
    // InternalBoardGameDL.g:2638:1: rule__Line__LengthAssignment_2 : ( ruleEInt ) ;
    public final void rule__Line__LengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2642:1: ( ( ruleEInt ) )
            // InternalBoardGameDL.g:2643:2: ( ruleEInt )
            {
            // InternalBoardGameDL.g:2643:2: ( ruleEInt )
            // InternalBoardGameDL.g:2644:3: ruleEInt
            {
             before(grammarAccess.getLineAccess().getLengthEIntParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getLineAccess().getLengthEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__LengthAssignment_2"


    // $ANTLR start "rule__Line__DirectionAssignment_4"
    // InternalBoardGameDL.g:2653:1: rule__Line__DirectionAssignment_4 : ( ruleDirection ) ;
    public final void rule__Line__DirectionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2657:1: ( ( ruleDirection ) )
            // InternalBoardGameDL.g:2658:2: ( ruleDirection )
            {
            // InternalBoardGameDL.g:2658:2: ( ruleDirection )
            // InternalBoardGameDL.g:2659:3: ruleDirection
            {
             before(grammarAccess.getLineAccess().getDirectionDirectionEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getLineAccess().getDirectionDirectionEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__DirectionAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000845810000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000845810002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000480000002L});

}
