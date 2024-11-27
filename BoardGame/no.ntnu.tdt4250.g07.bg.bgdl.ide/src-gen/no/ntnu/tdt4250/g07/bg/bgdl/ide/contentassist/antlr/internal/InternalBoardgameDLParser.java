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
import no.ntnu.tdt4250.g07.bg.bgdl.services.BoardgameDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBoardgameDLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Size'", "'PieceType'", "'{'", "'symbol'", "'validmove'", "'}'", "','", "'effectoncell'", "'CellState'", "'WinCondition'", "'inarow'", "'ValidMove'", "'condition'", "'EffectOnCell'", "'x'", "'y'", "'cellstate'", "'Condition'", "'('", "')'", "'-'", "'InARow'", "'count'", "'placeAnywhere'", "'diagonal'", "'horizontal'", "'vertical'"
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

    	public void setGrammarAccess(BoardgameDLGrammarAccess grammarAccess) {
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
    // InternalBoardgameDL.g:53:1: entryRuleBoardGame : ruleBoardGame EOF ;
    public final void entryRuleBoardGame() throws RecognitionException {
        try {
            // InternalBoardgameDL.g:54:1: ( ruleBoardGame EOF )
            // InternalBoardgameDL.g:55:1: ruleBoardGame EOF
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
    // InternalBoardgameDL.g:62:1: ruleBoardGame : ( ( rule__BoardGame__Group__0 ) ) ;
    public final void ruleBoardGame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:66:2: ( ( ( rule__BoardGame__Group__0 ) ) )
            // InternalBoardgameDL.g:67:2: ( ( rule__BoardGame__Group__0 ) )
            {
            // InternalBoardgameDL.g:67:2: ( ( rule__BoardGame__Group__0 ) )
            // InternalBoardgameDL.g:68:3: ( rule__BoardGame__Group__0 )
            {
             before(grammarAccess.getBoardGameAccess().getGroup()); 
            // InternalBoardgameDL.g:69:3: ( rule__BoardGame__Group__0 )
            // InternalBoardgameDL.g:69:4: rule__BoardGame__Group__0
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


    // $ANTLR start "entryRuleEString"
    // InternalBoardgameDL.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalBoardgameDL.g:79:1: ( ruleEString EOF )
            // InternalBoardgameDL.g:80:1: ruleEString EOF
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
    // InternalBoardgameDL.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalBoardgameDL.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalBoardgameDL.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalBoardgameDL.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalBoardgameDL.g:94:3: ( rule__EString__Alternatives )
            // InternalBoardgameDL.g:94:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRulePieceType"
    // InternalBoardgameDL.g:103:1: entryRulePieceType : rulePieceType EOF ;
    public final void entryRulePieceType() throws RecognitionException {
        try {
            // InternalBoardgameDL.g:104:1: ( rulePieceType EOF )
            // InternalBoardgameDL.g:105:1: rulePieceType EOF
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
    // InternalBoardgameDL.g:112:1: rulePieceType : ( ( rule__PieceType__Group__0 ) ) ;
    public final void rulePieceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:116:2: ( ( ( rule__PieceType__Group__0 ) ) )
            // InternalBoardgameDL.g:117:2: ( ( rule__PieceType__Group__0 ) )
            {
            // InternalBoardgameDL.g:117:2: ( ( rule__PieceType__Group__0 ) )
            // InternalBoardgameDL.g:118:3: ( rule__PieceType__Group__0 )
            {
             before(grammarAccess.getPieceTypeAccess().getGroup()); 
            // InternalBoardgameDL.g:119:3: ( rule__PieceType__Group__0 )
            // InternalBoardgameDL.g:119:4: rule__PieceType__Group__0
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
    // InternalBoardgameDL.g:128:1: entryRuleCellState : ruleCellState EOF ;
    public final void entryRuleCellState() throws RecognitionException {
        try {
            // InternalBoardgameDL.g:129:1: ( ruleCellState EOF )
            // InternalBoardgameDL.g:130:1: ruleCellState EOF
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
    // InternalBoardgameDL.g:137:1: ruleCellState : ( ( rule__CellState__Group__0 ) ) ;
    public final void ruleCellState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:141:2: ( ( ( rule__CellState__Group__0 ) ) )
            // InternalBoardgameDL.g:142:2: ( ( rule__CellState__Group__0 ) )
            {
            // InternalBoardgameDL.g:142:2: ( ( rule__CellState__Group__0 ) )
            // InternalBoardgameDL.g:143:3: ( rule__CellState__Group__0 )
            {
             before(grammarAccess.getCellStateAccess().getGroup()); 
            // InternalBoardgameDL.g:144:3: ( rule__CellState__Group__0 )
            // InternalBoardgameDL.g:144:4: rule__CellState__Group__0
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
    // InternalBoardgameDL.g:153:1: entryRuleWinCondition : ruleWinCondition EOF ;
    public final void entryRuleWinCondition() throws RecognitionException {
        try {
            // InternalBoardgameDL.g:154:1: ( ruleWinCondition EOF )
            // InternalBoardgameDL.g:155:1: ruleWinCondition EOF
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
    // InternalBoardgameDL.g:162:1: ruleWinCondition : ( ( rule__WinCondition__Group__0 ) ) ;
    public final void ruleWinCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:166:2: ( ( ( rule__WinCondition__Group__0 ) ) )
            // InternalBoardgameDL.g:167:2: ( ( rule__WinCondition__Group__0 ) )
            {
            // InternalBoardgameDL.g:167:2: ( ( rule__WinCondition__Group__0 ) )
            // InternalBoardgameDL.g:168:3: ( rule__WinCondition__Group__0 )
            {
             before(grammarAccess.getWinConditionAccess().getGroup()); 
            // InternalBoardgameDL.g:169:3: ( rule__WinCondition__Group__0 )
            // InternalBoardgameDL.g:169:4: rule__WinCondition__Group__0
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


    // $ANTLR start "entryRuleValidMove"
    // InternalBoardgameDL.g:178:1: entryRuleValidMove : ruleValidMove EOF ;
    public final void entryRuleValidMove() throws RecognitionException {
        try {
            // InternalBoardgameDL.g:179:1: ( ruleValidMove EOF )
            // InternalBoardgameDL.g:180:1: ruleValidMove EOF
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
    // InternalBoardgameDL.g:187:1: ruleValidMove : ( ( rule__ValidMove__Group__0 ) ) ;
    public final void ruleValidMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:191:2: ( ( ( rule__ValidMove__Group__0 ) ) )
            // InternalBoardgameDL.g:192:2: ( ( rule__ValidMove__Group__0 ) )
            {
            // InternalBoardgameDL.g:192:2: ( ( rule__ValidMove__Group__0 ) )
            // InternalBoardgameDL.g:193:3: ( rule__ValidMove__Group__0 )
            {
             before(grammarAccess.getValidMoveAccess().getGroup()); 
            // InternalBoardgameDL.g:194:3: ( rule__ValidMove__Group__0 )
            // InternalBoardgameDL.g:194:4: rule__ValidMove__Group__0
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
    // InternalBoardgameDL.g:203:1: entryRuleEffectOnCell : ruleEffectOnCell EOF ;
    public final void entryRuleEffectOnCell() throws RecognitionException {
        try {
            // InternalBoardgameDL.g:204:1: ( ruleEffectOnCell EOF )
            // InternalBoardgameDL.g:205:1: ruleEffectOnCell EOF
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
    // InternalBoardgameDL.g:212:1: ruleEffectOnCell : ( ( rule__EffectOnCell__Group__0 ) ) ;
    public final void ruleEffectOnCell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:216:2: ( ( ( rule__EffectOnCell__Group__0 ) ) )
            // InternalBoardgameDL.g:217:2: ( ( rule__EffectOnCell__Group__0 ) )
            {
            // InternalBoardgameDL.g:217:2: ( ( rule__EffectOnCell__Group__0 ) )
            // InternalBoardgameDL.g:218:3: ( rule__EffectOnCell__Group__0 )
            {
             before(grammarAccess.getEffectOnCellAccess().getGroup()); 
            // InternalBoardgameDL.g:219:3: ( rule__EffectOnCell__Group__0 )
            // InternalBoardgameDL.g:219:4: rule__EffectOnCell__Group__0
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
    // InternalBoardgameDL.g:228:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalBoardgameDL.g:229:1: ( ruleCondition EOF )
            // InternalBoardgameDL.g:230:1: ruleCondition EOF
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
    // InternalBoardgameDL.g:237:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:241:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalBoardgameDL.g:242:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalBoardgameDL.g:242:2: ( ( rule__Condition__Group__0 ) )
            // InternalBoardgameDL.g:243:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalBoardgameDL.g:244:3: ( rule__Condition__Group__0 )
            // InternalBoardgameDL.g:244:4: rule__Condition__Group__0
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


    // $ANTLR start "entryRuleEInt"
    // InternalBoardgameDL.g:253:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalBoardgameDL.g:254:1: ( ruleEInt EOF )
            // InternalBoardgameDL.g:255:1: ruleEInt EOF
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
    // InternalBoardgameDL.g:262:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:266:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalBoardgameDL.g:267:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalBoardgameDL.g:267:2: ( ( rule__EInt__Group__0 ) )
            // InternalBoardgameDL.g:268:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalBoardgameDL.g:269:3: ( rule__EInt__Group__0 )
            // InternalBoardgameDL.g:269:4: rule__EInt__Group__0
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


    // $ANTLR start "entryRuleInARow"
    // InternalBoardgameDL.g:278:1: entryRuleInARow : ruleInARow EOF ;
    public final void entryRuleInARow() throws RecognitionException {
        try {
            // InternalBoardgameDL.g:279:1: ( ruleInARow EOF )
            // InternalBoardgameDL.g:280:1: ruleInARow EOF
            {
             before(grammarAccess.getInARowRule()); 
            pushFollow(FOLLOW_1);
            ruleInARow();

            state._fsp--;

             after(grammarAccess.getInARowRule()); 
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
    // $ANTLR end "entryRuleInARow"


    // $ANTLR start "ruleInARow"
    // InternalBoardgameDL.g:287:1: ruleInARow : ( ( rule__InARow__Group__0 ) ) ;
    public final void ruleInARow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:291:2: ( ( ( rule__InARow__Group__0 ) ) )
            // InternalBoardgameDL.g:292:2: ( ( rule__InARow__Group__0 ) )
            {
            // InternalBoardgameDL.g:292:2: ( ( rule__InARow__Group__0 ) )
            // InternalBoardgameDL.g:293:3: ( rule__InARow__Group__0 )
            {
             before(grammarAccess.getInARowAccess().getGroup()); 
            // InternalBoardgameDL.g:294:3: ( rule__InARow__Group__0 )
            // InternalBoardgameDL.g:294:4: rule__InARow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InARow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInARowAccess().getGroup()); 

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
    // $ANTLR end "ruleInARow"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalBoardgameDL.g:302:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:306:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalBoardgameDL.g:307:2: ( RULE_STRING )
                    {
                    // InternalBoardgameDL.g:307:2: ( RULE_STRING )
                    // InternalBoardgameDL.g:308:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBoardgameDL.g:313:2: ( RULE_ID )
                    {
                    // InternalBoardgameDL.g:313:2: ( RULE_ID )
                    // InternalBoardgameDL.g:314:3: RULE_ID
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


    // $ANTLR start "rule__BoardGame__Group__0"
    // InternalBoardgameDL.g:323:1: rule__BoardGame__Group__0 : rule__BoardGame__Group__0__Impl rule__BoardGame__Group__1 ;
    public final void rule__BoardGame__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:327:1: ( rule__BoardGame__Group__0__Impl rule__BoardGame__Group__1 )
            // InternalBoardgameDL.g:328:2: rule__BoardGame__Group__0__Impl rule__BoardGame__Group__1
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
    // InternalBoardgameDL.g:335:1: rule__BoardGame__Group__0__Impl : ( ( rule__BoardGame__PiecetypesAssignment_0 )* ) ;
    public final void rule__BoardGame__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:339:1: ( ( ( rule__BoardGame__PiecetypesAssignment_0 )* ) )
            // InternalBoardgameDL.g:340:1: ( ( rule__BoardGame__PiecetypesAssignment_0 )* )
            {
            // InternalBoardgameDL.g:340:1: ( ( rule__BoardGame__PiecetypesAssignment_0 )* )
            // InternalBoardgameDL.g:341:2: ( rule__BoardGame__PiecetypesAssignment_0 )*
            {
             before(grammarAccess.getBoardGameAccess().getPiecetypesAssignment_0()); 
            // InternalBoardgameDL.g:342:2: ( rule__BoardGame__PiecetypesAssignment_0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBoardgameDL.g:342:3: rule__BoardGame__PiecetypesAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__BoardGame__PiecetypesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getBoardGameAccess().getPiecetypesAssignment_0()); 

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
    // InternalBoardgameDL.g:350:1: rule__BoardGame__Group__1 : rule__BoardGame__Group__1__Impl rule__BoardGame__Group__2 ;
    public final void rule__BoardGame__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:354:1: ( rule__BoardGame__Group__1__Impl rule__BoardGame__Group__2 )
            // InternalBoardgameDL.g:355:2: rule__BoardGame__Group__1__Impl rule__BoardGame__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalBoardgameDL.g:362:1: rule__BoardGame__Group__1__Impl : ( ( rule__BoardGame__CellstateAssignment_1 )* ) ;
    public final void rule__BoardGame__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:366:1: ( ( ( rule__BoardGame__CellstateAssignment_1 )* ) )
            // InternalBoardgameDL.g:367:1: ( ( rule__BoardGame__CellstateAssignment_1 )* )
            {
            // InternalBoardgameDL.g:367:1: ( ( rule__BoardGame__CellstateAssignment_1 )* )
            // InternalBoardgameDL.g:368:2: ( rule__BoardGame__CellstateAssignment_1 )*
            {
             before(grammarAccess.getBoardGameAccess().getCellstateAssignment_1()); 
            // InternalBoardgameDL.g:369:2: ( rule__BoardGame__CellstateAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBoardgameDL.g:369:3: rule__BoardGame__CellstateAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__BoardGame__CellstateAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getBoardGameAccess().getCellstateAssignment_1()); 

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
    // InternalBoardgameDL.g:377:1: rule__BoardGame__Group__2 : rule__BoardGame__Group__2__Impl rule__BoardGame__Group__3 ;
    public final void rule__BoardGame__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:381:1: ( rule__BoardGame__Group__2__Impl rule__BoardGame__Group__3 )
            // InternalBoardgameDL.g:382:2: rule__BoardGame__Group__2__Impl rule__BoardGame__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalBoardgameDL.g:389:1: rule__BoardGame__Group__2__Impl : ( ( rule__BoardGame__WinconditionAssignment_2 )* ) ;
    public final void rule__BoardGame__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:393:1: ( ( ( rule__BoardGame__WinconditionAssignment_2 )* ) )
            // InternalBoardgameDL.g:394:1: ( ( rule__BoardGame__WinconditionAssignment_2 )* )
            {
            // InternalBoardgameDL.g:394:1: ( ( rule__BoardGame__WinconditionAssignment_2 )* )
            // InternalBoardgameDL.g:395:2: ( rule__BoardGame__WinconditionAssignment_2 )*
            {
             before(grammarAccess.getBoardGameAccess().getWinconditionAssignment_2()); 
            // InternalBoardgameDL.g:396:2: ( rule__BoardGame__WinconditionAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBoardgameDL.g:396:3: rule__BoardGame__WinconditionAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__BoardGame__WinconditionAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getBoardGameAccess().getWinconditionAssignment_2()); 

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
    // InternalBoardgameDL.g:404:1: rule__BoardGame__Group__3 : rule__BoardGame__Group__3__Impl rule__BoardGame__Group__4 ;
    public final void rule__BoardGame__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:408:1: ( rule__BoardGame__Group__3__Impl rule__BoardGame__Group__4 )
            // InternalBoardgameDL.g:409:2: rule__BoardGame__Group__3__Impl rule__BoardGame__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalBoardgameDL.g:416:1: rule__BoardGame__Group__3__Impl : ( 'Size' ) ;
    public final void rule__BoardGame__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:420:1: ( ( 'Size' ) )
            // InternalBoardgameDL.g:421:1: ( 'Size' )
            {
            // InternalBoardgameDL.g:421:1: ( 'Size' )
            // InternalBoardgameDL.g:422:2: 'Size'
            {
             before(grammarAccess.getBoardGameAccess().getSizeKeyword_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getBoardGameAccess().getSizeKeyword_3()); 

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
    // InternalBoardgameDL.g:431:1: rule__BoardGame__Group__4 : rule__BoardGame__Group__4__Impl ;
    public final void rule__BoardGame__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:435:1: ( rule__BoardGame__Group__4__Impl )
            // InternalBoardgameDL.g:436:2: rule__BoardGame__Group__4__Impl
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
    // InternalBoardgameDL.g:442:1: rule__BoardGame__Group__4__Impl : ( ( rule__BoardGame__SizeAssignment_4 ) ) ;
    public final void rule__BoardGame__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:446:1: ( ( ( rule__BoardGame__SizeAssignment_4 ) ) )
            // InternalBoardgameDL.g:447:1: ( ( rule__BoardGame__SizeAssignment_4 ) )
            {
            // InternalBoardgameDL.g:447:1: ( ( rule__BoardGame__SizeAssignment_4 ) )
            // InternalBoardgameDL.g:448:2: ( rule__BoardGame__SizeAssignment_4 )
            {
             before(grammarAccess.getBoardGameAccess().getSizeAssignment_4()); 
            // InternalBoardgameDL.g:449:2: ( rule__BoardGame__SizeAssignment_4 )
            // InternalBoardgameDL.g:449:3: rule__BoardGame__SizeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__BoardGame__SizeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBoardGameAccess().getSizeAssignment_4()); 

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
    // InternalBoardgameDL.g:458:1: rule__PieceType__Group__0 : rule__PieceType__Group__0__Impl rule__PieceType__Group__1 ;
    public final void rule__PieceType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:462:1: ( rule__PieceType__Group__0__Impl rule__PieceType__Group__1 )
            // InternalBoardgameDL.g:463:2: rule__PieceType__Group__0__Impl rule__PieceType__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalBoardgameDL.g:470:1: rule__PieceType__Group__0__Impl : ( 'PieceType' ) ;
    public final void rule__PieceType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:474:1: ( ( 'PieceType' ) )
            // InternalBoardgameDL.g:475:1: ( 'PieceType' )
            {
            // InternalBoardgameDL.g:475:1: ( 'PieceType' )
            // InternalBoardgameDL.g:476:2: 'PieceType'
            {
             before(grammarAccess.getPieceTypeAccess().getPieceTypeKeyword_0()); 
            match(input,12,FOLLOW_2); 
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
    // InternalBoardgameDL.g:485:1: rule__PieceType__Group__1 : rule__PieceType__Group__1__Impl rule__PieceType__Group__2 ;
    public final void rule__PieceType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:489:1: ( rule__PieceType__Group__1__Impl rule__PieceType__Group__2 )
            // InternalBoardgameDL.g:490:2: rule__PieceType__Group__1__Impl rule__PieceType__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalBoardgameDL.g:497:1: rule__PieceType__Group__1__Impl : ( ( rule__PieceType__NameAssignment_1 ) ) ;
    public final void rule__PieceType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:501:1: ( ( ( rule__PieceType__NameAssignment_1 ) ) )
            // InternalBoardgameDL.g:502:1: ( ( rule__PieceType__NameAssignment_1 ) )
            {
            // InternalBoardgameDL.g:502:1: ( ( rule__PieceType__NameAssignment_1 ) )
            // InternalBoardgameDL.g:503:2: ( rule__PieceType__NameAssignment_1 )
            {
             before(grammarAccess.getPieceTypeAccess().getNameAssignment_1()); 
            // InternalBoardgameDL.g:504:2: ( rule__PieceType__NameAssignment_1 )
            // InternalBoardgameDL.g:504:3: rule__PieceType__NameAssignment_1
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
    // InternalBoardgameDL.g:512:1: rule__PieceType__Group__2 : rule__PieceType__Group__2__Impl rule__PieceType__Group__3 ;
    public final void rule__PieceType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:516:1: ( rule__PieceType__Group__2__Impl rule__PieceType__Group__3 )
            // InternalBoardgameDL.g:517:2: rule__PieceType__Group__2__Impl rule__PieceType__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalBoardgameDL.g:524:1: rule__PieceType__Group__2__Impl : ( '{' ) ;
    public final void rule__PieceType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:528:1: ( ( '{' ) )
            // InternalBoardgameDL.g:529:1: ( '{' )
            {
            // InternalBoardgameDL.g:529:1: ( '{' )
            // InternalBoardgameDL.g:530:2: '{'
            {
             before(grammarAccess.getPieceTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
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
    // InternalBoardgameDL.g:539:1: rule__PieceType__Group__3 : rule__PieceType__Group__3__Impl rule__PieceType__Group__4 ;
    public final void rule__PieceType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:543:1: ( rule__PieceType__Group__3__Impl rule__PieceType__Group__4 )
            // InternalBoardgameDL.g:544:2: rule__PieceType__Group__3__Impl rule__PieceType__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalBoardgameDL.g:551:1: rule__PieceType__Group__3__Impl : ( 'symbol' ) ;
    public final void rule__PieceType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:555:1: ( ( 'symbol' ) )
            // InternalBoardgameDL.g:556:1: ( 'symbol' )
            {
            // InternalBoardgameDL.g:556:1: ( 'symbol' )
            // InternalBoardgameDL.g:557:2: 'symbol'
            {
             before(grammarAccess.getPieceTypeAccess().getSymbolKeyword_3()); 
            match(input,14,FOLLOW_2); 
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
    // InternalBoardgameDL.g:566:1: rule__PieceType__Group__4 : rule__PieceType__Group__4__Impl rule__PieceType__Group__5 ;
    public final void rule__PieceType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:570:1: ( rule__PieceType__Group__4__Impl rule__PieceType__Group__5 )
            // InternalBoardgameDL.g:571:2: rule__PieceType__Group__4__Impl rule__PieceType__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalBoardgameDL.g:578:1: rule__PieceType__Group__4__Impl : ( ( rule__PieceType__SymbolAssignment_4 ) ) ;
    public final void rule__PieceType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:582:1: ( ( ( rule__PieceType__SymbolAssignment_4 ) ) )
            // InternalBoardgameDL.g:583:1: ( ( rule__PieceType__SymbolAssignment_4 ) )
            {
            // InternalBoardgameDL.g:583:1: ( ( rule__PieceType__SymbolAssignment_4 ) )
            // InternalBoardgameDL.g:584:2: ( rule__PieceType__SymbolAssignment_4 )
            {
             before(grammarAccess.getPieceTypeAccess().getSymbolAssignment_4()); 
            // InternalBoardgameDL.g:585:2: ( rule__PieceType__SymbolAssignment_4 )
            // InternalBoardgameDL.g:585:3: rule__PieceType__SymbolAssignment_4
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
    // InternalBoardgameDL.g:593:1: rule__PieceType__Group__5 : rule__PieceType__Group__5__Impl rule__PieceType__Group__6 ;
    public final void rule__PieceType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:597:1: ( rule__PieceType__Group__5__Impl rule__PieceType__Group__6 )
            // InternalBoardgameDL.g:598:2: rule__PieceType__Group__5__Impl rule__PieceType__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalBoardgameDL.g:605:1: rule__PieceType__Group__5__Impl : ( 'validmove' ) ;
    public final void rule__PieceType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:609:1: ( ( 'validmove' ) )
            // InternalBoardgameDL.g:610:1: ( 'validmove' )
            {
            // InternalBoardgameDL.g:610:1: ( 'validmove' )
            // InternalBoardgameDL.g:611:2: 'validmove'
            {
             before(grammarAccess.getPieceTypeAccess().getValidmoveKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPieceTypeAccess().getValidmoveKeyword_5()); 

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
    // InternalBoardgameDL.g:620:1: rule__PieceType__Group__6 : rule__PieceType__Group__6__Impl rule__PieceType__Group__7 ;
    public final void rule__PieceType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:624:1: ( rule__PieceType__Group__6__Impl rule__PieceType__Group__7 )
            // InternalBoardgameDL.g:625:2: rule__PieceType__Group__6__Impl rule__PieceType__Group__7
            {
            pushFollow(FOLLOW_12);
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
    // InternalBoardgameDL.g:632:1: rule__PieceType__Group__6__Impl : ( '{' ) ;
    public final void rule__PieceType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:636:1: ( ( '{' ) )
            // InternalBoardgameDL.g:637:1: ( '{' )
            {
            // InternalBoardgameDL.g:637:1: ( '{' )
            // InternalBoardgameDL.g:638:2: '{'
            {
             before(grammarAccess.getPieceTypeAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPieceTypeAccess().getLeftCurlyBracketKeyword_6()); 

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
    // InternalBoardgameDL.g:647:1: rule__PieceType__Group__7 : rule__PieceType__Group__7__Impl rule__PieceType__Group__8 ;
    public final void rule__PieceType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:651:1: ( rule__PieceType__Group__7__Impl rule__PieceType__Group__8 )
            // InternalBoardgameDL.g:652:2: rule__PieceType__Group__7__Impl rule__PieceType__Group__8
            {
            pushFollow(FOLLOW_13);
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
    // InternalBoardgameDL.g:659:1: rule__PieceType__Group__7__Impl : ( ( rule__PieceType__ValidmoveAssignment_7 ) ) ;
    public final void rule__PieceType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:663:1: ( ( ( rule__PieceType__ValidmoveAssignment_7 ) ) )
            // InternalBoardgameDL.g:664:1: ( ( rule__PieceType__ValidmoveAssignment_7 ) )
            {
            // InternalBoardgameDL.g:664:1: ( ( rule__PieceType__ValidmoveAssignment_7 ) )
            // InternalBoardgameDL.g:665:2: ( rule__PieceType__ValidmoveAssignment_7 )
            {
             before(grammarAccess.getPieceTypeAccess().getValidmoveAssignment_7()); 
            // InternalBoardgameDL.g:666:2: ( rule__PieceType__ValidmoveAssignment_7 )
            // InternalBoardgameDL.g:666:3: rule__PieceType__ValidmoveAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__ValidmoveAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPieceTypeAccess().getValidmoveAssignment_7()); 

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
    // InternalBoardgameDL.g:674:1: rule__PieceType__Group__8 : rule__PieceType__Group__8__Impl rule__PieceType__Group__9 ;
    public final void rule__PieceType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:678:1: ( rule__PieceType__Group__8__Impl rule__PieceType__Group__9 )
            // InternalBoardgameDL.g:679:2: rule__PieceType__Group__8__Impl rule__PieceType__Group__9
            {
            pushFollow(FOLLOW_13);
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
    // InternalBoardgameDL.g:686:1: rule__PieceType__Group__8__Impl : ( ( rule__PieceType__Group_8__0 )* ) ;
    public final void rule__PieceType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:690:1: ( ( ( rule__PieceType__Group_8__0 )* ) )
            // InternalBoardgameDL.g:691:1: ( ( rule__PieceType__Group_8__0 )* )
            {
            // InternalBoardgameDL.g:691:1: ( ( rule__PieceType__Group_8__0 )* )
            // InternalBoardgameDL.g:692:2: ( rule__PieceType__Group_8__0 )*
            {
             before(grammarAccess.getPieceTypeAccess().getGroup_8()); 
            // InternalBoardgameDL.g:693:2: ( rule__PieceType__Group_8__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBoardgameDL.g:693:3: rule__PieceType__Group_8__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__PieceType__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

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
    // InternalBoardgameDL.g:701:1: rule__PieceType__Group__9 : rule__PieceType__Group__9__Impl rule__PieceType__Group__10 ;
    public final void rule__PieceType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:705:1: ( rule__PieceType__Group__9__Impl rule__PieceType__Group__10 )
            // InternalBoardgameDL.g:706:2: rule__PieceType__Group__9__Impl rule__PieceType__Group__10
            {
            pushFollow(FOLLOW_15);
            rule__PieceType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieceType__Group__10();

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
    // InternalBoardgameDL.g:713:1: rule__PieceType__Group__9__Impl : ( '}' ) ;
    public final void rule__PieceType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:717:1: ( ( '}' ) )
            // InternalBoardgameDL.g:718:1: ( '}' )
            {
            // InternalBoardgameDL.g:718:1: ( '}' )
            // InternalBoardgameDL.g:719:2: '}'
            {
             before(grammarAccess.getPieceTypeAccess().getRightCurlyBracketKeyword_9()); 
            match(input,16,FOLLOW_2); 
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


    // $ANTLR start "rule__PieceType__Group__10"
    // InternalBoardgameDL.g:728:1: rule__PieceType__Group__10 : rule__PieceType__Group__10__Impl rule__PieceType__Group__11 ;
    public final void rule__PieceType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:732:1: ( rule__PieceType__Group__10__Impl rule__PieceType__Group__11 )
            // InternalBoardgameDL.g:733:2: rule__PieceType__Group__10__Impl rule__PieceType__Group__11
            {
            pushFollow(FOLLOW_15);
            rule__PieceType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieceType__Group__11();

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
    // $ANTLR end "rule__PieceType__Group__10"


    // $ANTLR start "rule__PieceType__Group__10__Impl"
    // InternalBoardgameDL.g:740:1: rule__PieceType__Group__10__Impl : ( ( rule__PieceType__Group_10__0 )? ) ;
    public final void rule__PieceType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:744:1: ( ( ( rule__PieceType__Group_10__0 )? ) )
            // InternalBoardgameDL.g:745:1: ( ( rule__PieceType__Group_10__0 )? )
            {
            // InternalBoardgameDL.g:745:1: ( ( rule__PieceType__Group_10__0 )? )
            // InternalBoardgameDL.g:746:2: ( rule__PieceType__Group_10__0 )?
            {
             before(grammarAccess.getPieceTypeAccess().getGroup_10()); 
            // InternalBoardgameDL.g:747:2: ( rule__PieceType__Group_10__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBoardgameDL.g:747:3: rule__PieceType__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PieceType__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPieceTypeAccess().getGroup_10()); 

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
    // $ANTLR end "rule__PieceType__Group__10__Impl"


    // $ANTLR start "rule__PieceType__Group__11"
    // InternalBoardgameDL.g:755:1: rule__PieceType__Group__11 : rule__PieceType__Group__11__Impl ;
    public final void rule__PieceType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:759:1: ( rule__PieceType__Group__11__Impl )
            // InternalBoardgameDL.g:760:2: rule__PieceType__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__Group__11__Impl();

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
    // $ANTLR end "rule__PieceType__Group__11"


    // $ANTLR start "rule__PieceType__Group__11__Impl"
    // InternalBoardgameDL.g:766:1: rule__PieceType__Group__11__Impl : ( '}' ) ;
    public final void rule__PieceType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:770:1: ( ( '}' ) )
            // InternalBoardgameDL.g:771:1: ( '}' )
            {
            // InternalBoardgameDL.g:771:1: ( '}' )
            // InternalBoardgameDL.g:772:2: '}'
            {
             before(grammarAccess.getPieceTypeAccess().getRightCurlyBracketKeyword_11()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPieceTypeAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__PieceType__Group__11__Impl"


    // $ANTLR start "rule__PieceType__Group_8__0"
    // InternalBoardgameDL.g:782:1: rule__PieceType__Group_8__0 : rule__PieceType__Group_8__0__Impl rule__PieceType__Group_8__1 ;
    public final void rule__PieceType__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:786:1: ( rule__PieceType__Group_8__0__Impl rule__PieceType__Group_8__1 )
            // InternalBoardgameDL.g:787:2: rule__PieceType__Group_8__0__Impl rule__PieceType__Group_8__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalBoardgameDL.g:794:1: rule__PieceType__Group_8__0__Impl : ( ',' ) ;
    public final void rule__PieceType__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:798:1: ( ( ',' ) )
            // InternalBoardgameDL.g:799:1: ( ',' )
            {
            // InternalBoardgameDL.g:799:1: ( ',' )
            // InternalBoardgameDL.g:800:2: ','
            {
             before(grammarAccess.getPieceTypeAccess().getCommaKeyword_8_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPieceTypeAccess().getCommaKeyword_8_0()); 

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
    // InternalBoardgameDL.g:809:1: rule__PieceType__Group_8__1 : rule__PieceType__Group_8__1__Impl ;
    public final void rule__PieceType__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:813:1: ( rule__PieceType__Group_8__1__Impl )
            // InternalBoardgameDL.g:814:2: rule__PieceType__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__Group_8__1__Impl();

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
    // InternalBoardgameDL.g:820:1: rule__PieceType__Group_8__1__Impl : ( ( rule__PieceType__ValidmoveAssignment_8_1 ) ) ;
    public final void rule__PieceType__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:824:1: ( ( ( rule__PieceType__ValidmoveAssignment_8_1 ) ) )
            // InternalBoardgameDL.g:825:1: ( ( rule__PieceType__ValidmoveAssignment_8_1 ) )
            {
            // InternalBoardgameDL.g:825:1: ( ( rule__PieceType__ValidmoveAssignment_8_1 ) )
            // InternalBoardgameDL.g:826:2: ( rule__PieceType__ValidmoveAssignment_8_1 )
            {
             before(grammarAccess.getPieceTypeAccess().getValidmoveAssignment_8_1()); 
            // InternalBoardgameDL.g:827:2: ( rule__PieceType__ValidmoveAssignment_8_1 )
            // InternalBoardgameDL.g:827:3: rule__PieceType__ValidmoveAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__ValidmoveAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getPieceTypeAccess().getValidmoveAssignment_8_1()); 

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


    // $ANTLR start "rule__PieceType__Group_10__0"
    // InternalBoardgameDL.g:836:1: rule__PieceType__Group_10__0 : rule__PieceType__Group_10__0__Impl rule__PieceType__Group_10__1 ;
    public final void rule__PieceType__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:840:1: ( rule__PieceType__Group_10__0__Impl rule__PieceType__Group_10__1 )
            // InternalBoardgameDL.g:841:2: rule__PieceType__Group_10__0__Impl rule__PieceType__Group_10__1
            {
            pushFollow(FOLLOW_9);
            rule__PieceType__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieceType__Group_10__1();

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
    // $ANTLR end "rule__PieceType__Group_10__0"


    // $ANTLR start "rule__PieceType__Group_10__0__Impl"
    // InternalBoardgameDL.g:848:1: rule__PieceType__Group_10__0__Impl : ( 'effectoncell' ) ;
    public final void rule__PieceType__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:852:1: ( ( 'effectoncell' ) )
            // InternalBoardgameDL.g:853:1: ( 'effectoncell' )
            {
            // InternalBoardgameDL.g:853:1: ( 'effectoncell' )
            // InternalBoardgameDL.g:854:2: 'effectoncell'
            {
             before(grammarAccess.getPieceTypeAccess().getEffectoncellKeyword_10_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPieceTypeAccess().getEffectoncellKeyword_10_0()); 

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
    // $ANTLR end "rule__PieceType__Group_10__0__Impl"


    // $ANTLR start "rule__PieceType__Group_10__1"
    // InternalBoardgameDL.g:863:1: rule__PieceType__Group_10__1 : rule__PieceType__Group_10__1__Impl rule__PieceType__Group_10__2 ;
    public final void rule__PieceType__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:867:1: ( rule__PieceType__Group_10__1__Impl rule__PieceType__Group_10__2 )
            // InternalBoardgameDL.g:868:2: rule__PieceType__Group_10__1__Impl rule__PieceType__Group_10__2
            {
            pushFollow(FOLLOW_16);
            rule__PieceType__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieceType__Group_10__2();

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
    // $ANTLR end "rule__PieceType__Group_10__1"


    // $ANTLR start "rule__PieceType__Group_10__1__Impl"
    // InternalBoardgameDL.g:875:1: rule__PieceType__Group_10__1__Impl : ( '{' ) ;
    public final void rule__PieceType__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:879:1: ( ( '{' ) )
            // InternalBoardgameDL.g:880:1: ( '{' )
            {
            // InternalBoardgameDL.g:880:1: ( '{' )
            // InternalBoardgameDL.g:881:2: '{'
            {
             before(grammarAccess.getPieceTypeAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPieceTypeAccess().getLeftCurlyBracketKeyword_10_1()); 

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
    // $ANTLR end "rule__PieceType__Group_10__1__Impl"


    // $ANTLR start "rule__PieceType__Group_10__2"
    // InternalBoardgameDL.g:890:1: rule__PieceType__Group_10__2 : rule__PieceType__Group_10__2__Impl rule__PieceType__Group_10__3 ;
    public final void rule__PieceType__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:894:1: ( rule__PieceType__Group_10__2__Impl rule__PieceType__Group_10__3 )
            // InternalBoardgameDL.g:895:2: rule__PieceType__Group_10__2__Impl rule__PieceType__Group_10__3
            {
            pushFollow(FOLLOW_13);
            rule__PieceType__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieceType__Group_10__3();

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
    // $ANTLR end "rule__PieceType__Group_10__2"


    // $ANTLR start "rule__PieceType__Group_10__2__Impl"
    // InternalBoardgameDL.g:902:1: rule__PieceType__Group_10__2__Impl : ( ( rule__PieceType__EffectoncellAssignment_10_2 ) ) ;
    public final void rule__PieceType__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:906:1: ( ( ( rule__PieceType__EffectoncellAssignment_10_2 ) ) )
            // InternalBoardgameDL.g:907:1: ( ( rule__PieceType__EffectoncellAssignment_10_2 ) )
            {
            // InternalBoardgameDL.g:907:1: ( ( rule__PieceType__EffectoncellAssignment_10_2 ) )
            // InternalBoardgameDL.g:908:2: ( rule__PieceType__EffectoncellAssignment_10_2 )
            {
             before(grammarAccess.getPieceTypeAccess().getEffectoncellAssignment_10_2()); 
            // InternalBoardgameDL.g:909:2: ( rule__PieceType__EffectoncellAssignment_10_2 )
            // InternalBoardgameDL.g:909:3: rule__PieceType__EffectoncellAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__EffectoncellAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getPieceTypeAccess().getEffectoncellAssignment_10_2()); 

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
    // $ANTLR end "rule__PieceType__Group_10__2__Impl"


    // $ANTLR start "rule__PieceType__Group_10__3"
    // InternalBoardgameDL.g:917:1: rule__PieceType__Group_10__3 : rule__PieceType__Group_10__3__Impl rule__PieceType__Group_10__4 ;
    public final void rule__PieceType__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:921:1: ( rule__PieceType__Group_10__3__Impl rule__PieceType__Group_10__4 )
            // InternalBoardgameDL.g:922:2: rule__PieceType__Group_10__3__Impl rule__PieceType__Group_10__4
            {
            pushFollow(FOLLOW_13);
            rule__PieceType__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieceType__Group_10__4();

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
    // $ANTLR end "rule__PieceType__Group_10__3"


    // $ANTLR start "rule__PieceType__Group_10__3__Impl"
    // InternalBoardgameDL.g:929:1: rule__PieceType__Group_10__3__Impl : ( ( rule__PieceType__Group_10_3__0 )* ) ;
    public final void rule__PieceType__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:933:1: ( ( ( rule__PieceType__Group_10_3__0 )* ) )
            // InternalBoardgameDL.g:934:1: ( ( rule__PieceType__Group_10_3__0 )* )
            {
            // InternalBoardgameDL.g:934:1: ( ( rule__PieceType__Group_10_3__0 )* )
            // InternalBoardgameDL.g:935:2: ( rule__PieceType__Group_10_3__0 )*
            {
             before(grammarAccess.getPieceTypeAccess().getGroup_10_3()); 
            // InternalBoardgameDL.g:936:2: ( rule__PieceType__Group_10_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBoardgameDL.g:936:3: rule__PieceType__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__PieceType__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPieceTypeAccess().getGroup_10_3()); 

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
    // $ANTLR end "rule__PieceType__Group_10__3__Impl"


    // $ANTLR start "rule__PieceType__Group_10__4"
    // InternalBoardgameDL.g:944:1: rule__PieceType__Group_10__4 : rule__PieceType__Group_10__4__Impl ;
    public final void rule__PieceType__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:948:1: ( rule__PieceType__Group_10__4__Impl )
            // InternalBoardgameDL.g:949:2: rule__PieceType__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__Group_10__4__Impl();

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
    // $ANTLR end "rule__PieceType__Group_10__4"


    // $ANTLR start "rule__PieceType__Group_10__4__Impl"
    // InternalBoardgameDL.g:955:1: rule__PieceType__Group_10__4__Impl : ( '}' ) ;
    public final void rule__PieceType__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:959:1: ( ( '}' ) )
            // InternalBoardgameDL.g:960:1: ( '}' )
            {
            // InternalBoardgameDL.g:960:1: ( '}' )
            // InternalBoardgameDL.g:961:2: '}'
            {
             before(grammarAccess.getPieceTypeAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPieceTypeAccess().getRightCurlyBracketKeyword_10_4()); 

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
    // $ANTLR end "rule__PieceType__Group_10__4__Impl"


    // $ANTLR start "rule__PieceType__Group_10_3__0"
    // InternalBoardgameDL.g:971:1: rule__PieceType__Group_10_3__0 : rule__PieceType__Group_10_3__0__Impl rule__PieceType__Group_10_3__1 ;
    public final void rule__PieceType__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:975:1: ( rule__PieceType__Group_10_3__0__Impl rule__PieceType__Group_10_3__1 )
            // InternalBoardgameDL.g:976:2: rule__PieceType__Group_10_3__0__Impl rule__PieceType__Group_10_3__1
            {
            pushFollow(FOLLOW_16);
            rule__PieceType__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieceType__Group_10_3__1();

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
    // $ANTLR end "rule__PieceType__Group_10_3__0"


    // $ANTLR start "rule__PieceType__Group_10_3__0__Impl"
    // InternalBoardgameDL.g:983:1: rule__PieceType__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__PieceType__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:987:1: ( ( ',' ) )
            // InternalBoardgameDL.g:988:1: ( ',' )
            {
            // InternalBoardgameDL.g:988:1: ( ',' )
            // InternalBoardgameDL.g:989:2: ','
            {
             before(grammarAccess.getPieceTypeAccess().getCommaKeyword_10_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPieceTypeAccess().getCommaKeyword_10_3_0()); 

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
    // $ANTLR end "rule__PieceType__Group_10_3__0__Impl"


    // $ANTLR start "rule__PieceType__Group_10_3__1"
    // InternalBoardgameDL.g:998:1: rule__PieceType__Group_10_3__1 : rule__PieceType__Group_10_3__1__Impl ;
    public final void rule__PieceType__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1002:1: ( rule__PieceType__Group_10_3__1__Impl )
            // InternalBoardgameDL.g:1003:2: rule__PieceType__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__Group_10_3__1__Impl();

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
    // $ANTLR end "rule__PieceType__Group_10_3__1"


    // $ANTLR start "rule__PieceType__Group_10_3__1__Impl"
    // InternalBoardgameDL.g:1009:1: rule__PieceType__Group_10_3__1__Impl : ( ( rule__PieceType__EffectoncellAssignment_10_3_1 ) ) ;
    public final void rule__PieceType__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1013:1: ( ( ( rule__PieceType__EffectoncellAssignment_10_3_1 ) ) )
            // InternalBoardgameDL.g:1014:1: ( ( rule__PieceType__EffectoncellAssignment_10_3_1 ) )
            {
            // InternalBoardgameDL.g:1014:1: ( ( rule__PieceType__EffectoncellAssignment_10_3_1 ) )
            // InternalBoardgameDL.g:1015:2: ( rule__PieceType__EffectoncellAssignment_10_3_1 )
            {
             before(grammarAccess.getPieceTypeAccess().getEffectoncellAssignment_10_3_1()); 
            // InternalBoardgameDL.g:1016:2: ( rule__PieceType__EffectoncellAssignment_10_3_1 )
            // InternalBoardgameDL.g:1016:3: rule__PieceType__EffectoncellAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__EffectoncellAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPieceTypeAccess().getEffectoncellAssignment_10_3_1()); 

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
    // $ANTLR end "rule__PieceType__Group_10_3__1__Impl"


    // $ANTLR start "rule__CellState__Group__0"
    // InternalBoardgameDL.g:1025:1: rule__CellState__Group__0 : rule__CellState__Group__0__Impl rule__CellState__Group__1 ;
    public final void rule__CellState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1029:1: ( rule__CellState__Group__0__Impl rule__CellState__Group__1 )
            // InternalBoardgameDL.g:1030:2: rule__CellState__Group__0__Impl rule__CellState__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBoardgameDL.g:1037:1: rule__CellState__Group__0__Impl : ( () ) ;
    public final void rule__CellState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1041:1: ( ( () ) )
            // InternalBoardgameDL.g:1042:1: ( () )
            {
            // InternalBoardgameDL.g:1042:1: ( () )
            // InternalBoardgameDL.g:1043:2: ()
            {
             before(grammarAccess.getCellStateAccess().getCellStateAction_0()); 
            // InternalBoardgameDL.g:1044:2: ()
            // InternalBoardgameDL.g:1044:3: 
            {
            }

             after(grammarAccess.getCellStateAccess().getCellStateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group__0__Impl"


    // $ANTLR start "rule__CellState__Group__1"
    // InternalBoardgameDL.g:1052:1: rule__CellState__Group__1 : rule__CellState__Group__1__Impl ;
    public final void rule__CellState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1056:1: ( rule__CellState__Group__1__Impl )
            // InternalBoardgameDL.g:1057:2: rule__CellState__Group__1__Impl
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
    // InternalBoardgameDL.g:1063:1: rule__CellState__Group__1__Impl : ( 'CellState' ) ;
    public final void rule__CellState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1067:1: ( ( 'CellState' ) )
            // InternalBoardgameDL.g:1068:1: ( 'CellState' )
            {
            // InternalBoardgameDL.g:1068:1: ( 'CellState' )
            // InternalBoardgameDL.g:1069:2: 'CellState'
            {
             before(grammarAccess.getCellStateAccess().getCellStateKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCellStateAccess().getCellStateKeyword_1()); 

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
    // InternalBoardgameDL.g:1079:1: rule__WinCondition__Group__0 : rule__WinCondition__Group__0__Impl rule__WinCondition__Group__1 ;
    public final void rule__WinCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1083:1: ( rule__WinCondition__Group__0__Impl rule__WinCondition__Group__1 )
            // InternalBoardgameDL.g:1084:2: rule__WinCondition__Group__0__Impl rule__WinCondition__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalBoardgameDL.g:1091:1: rule__WinCondition__Group__0__Impl : ( 'WinCondition' ) ;
    public final void rule__WinCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1095:1: ( ( 'WinCondition' ) )
            // InternalBoardgameDL.g:1096:1: ( 'WinCondition' )
            {
            // InternalBoardgameDL.g:1096:1: ( 'WinCondition' )
            // InternalBoardgameDL.g:1097:2: 'WinCondition'
            {
             before(grammarAccess.getWinConditionAccess().getWinConditionKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBoardgameDL.g:1106:1: rule__WinCondition__Group__1 : rule__WinCondition__Group__1__Impl rule__WinCondition__Group__2 ;
    public final void rule__WinCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1110:1: ( rule__WinCondition__Group__1__Impl rule__WinCondition__Group__2 )
            // InternalBoardgameDL.g:1111:2: rule__WinCondition__Group__1__Impl rule__WinCondition__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalBoardgameDL.g:1118:1: rule__WinCondition__Group__1__Impl : ( '{' ) ;
    public final void rule__WinCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1122:1: ( ( '{' ) )
            // InternalBoardgameDL.g:1123:1: ( '{' )
            {
            // InternalBoardgameDL.g:1123:1: ( '{' )
            // InternalBoardgameDL.g:1124:2: '{'
            {
             before(grammarAccess.getWinConditionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
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
    // InternalBoardgameDL.g:1133:1: rule__WinCondition__Group__2 : rule__WinCondition__Group__2__Impl rule__WinCondition__Group__3 ;
    public final void rule__WinCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1137:1: ( rule__WinCondition__Group__2__Impl rule__WinCondition__Group__3 )
            // InternalBoardgameDL.g:1138:2: rule__WinCondition__Group__2__Impl rule__WinCondition__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalBoardgameDL.g:1145:1: rule__WinCondition__Group__2__Impl : ( 'inarow' ) ;
    public final void rule__WinCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1149:1: ( ( 'inarow' ) )
            // InternalBoardgameDL.g:1150:1: ( 'inarow' )
            {
            // InternalBoardgameDL.g:1150:1: ( 'inarow' )
            // InternalBoardgameDL.g:1151:2: 'inarow'
            {
             before(grammarAccess.getWinConditionAccess().getInarowKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWinConditionAccess().getInarowKeyword_2()); 

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
    // InternalBoardgameDL.g:1160:1: rule__WinCondition__Group__3 : rule__WinCondition__Group__3__Impl rule__WinCondition__Group__4 ;
    public final void rule__WinCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1164:1: ( rule__WinCondition__Group__3__Impl rule__WinCondition__Group__4 )
            // InternalBoardgameDL.g:1165:2: rule__WinCondition__Group__3__Impl rule__WinCondition__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalBoardgameDL.g:1172:1: rule__WinCondition__Group__3__Impl : ( ( rule__WinCondition__InarowAssignment_3 ) ) ;
    public final void rule__WinCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1176:1: ( ( ( rule__WinCondition__InarowAssignment_3 ) ) )
            // InternalBoardgameDL.g:1177:1: ( ( rule__WinCondition__InarowAssignment_3 ) )
            {
            // InternalBoardgameDL.g:1177:1: ( ( rule__WinCondition__InarowAssignment_3 ) )
            // InternalBoardgameDL.g:1178:2: ( rule__WinCondition__InarowAssignment_3 )
            {
             before(grammarAccess.getWinConditionAccess().getInarowAssignment_3()); 
            // InternalBoardgameDL.g:1179:2: ( rule__WinCondition__InarowAssignment_3 )
            // InternalBoardgameDL.g:1179:3: rule__WinCondition__InarowAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__WinCondition__InarowAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWinConditionAccess().getInarowAssignment_3()); 

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
    // InternalBoardgameDL.g:1187:1: rule__WinCondition__Group__4 : rule__WinCondition__Group__4__Impl ;
    public final void rule__WinCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1191:1: ( rule__WinCondition__Group__4__Impl )
            // InternalBoardgameDL.g:1192:2: rule__WinCondition__Group__4__Impl
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
    // InternalBoardgameDL.g:1198:1: rule__WinCondition__Group__4__Impl : ( '}' ) ;
    public final void rule__WinCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1202:1: ( ( '}' ) )
            // InternalBoardgameDL.g:1203:1: ( '}' )
            {
            // InternalBoardgameDL.g:1203:1: ( '}' )
            // InternalBoardgameDL.g:1204:2: '}'
            {
             before(grammarAccess.getWinConditionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
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


    // $ANTLR start "rule__ValidMove__Group__0"
    // InternalBoardgameDL.g:1214:1: rule__ValidMove__Group__0 : rule__ValidMove__Group__0__Impl rule__ValidMove__Group__1 ;
    public final void rule__ValidMove__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1218:1: ( rule__ValidMove__Group__0__Impl rule__ValidMove__Group__1 )
            // InternalBoardgameDL.g:1219:2: rule__ValidMove__Group__0__Impl rule__ValidMove__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalBoardgameDL.g:1226:1: rule__ValidMove__Group__0__Impl : ( ( rule__ValidMove__PlaceAnywhereAssignment_0 ) ) ;
    public final void rule__ValidMove__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1230:1: ( ( ( rule__ValidMove__PlaceAnywhereAssignment_0 ) ) )
            // InternalBoardgameDL.g:1231:1: ( ( rule__ValidMove__PlaceAnywhereAssignment_0 ) )
            {
            // InternalBoardgameDL.g:1231:1: ( ( rule__ValidMove__PlaceAnywhereAssignment_0 ) )
            // InternalBoardgameDL.g:1232:2: ( rule__ValidMove__PlaceAnywhereAssignment_0 )
            {
             before(grammarAccess.getValidMoveAccess().getPlaceAnywhereAssignment_0()); 
            // InternalBoardgameDL.g:1233:2: ( rule__ValidMove__PlaceAnywhereAssignment_0 )
            // InternalBoardgameDL.g:1233:3: rule__ValidMove__PlaceAnywhereAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ValidMove__PlaceAnywhereAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getValidMoveAccess().getPlaceAnywhereAssignment_0()); 

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
    // InternalBoardgameDL.g:1241:1: rule__ValidMove__Group__1 : rule__ValidMove__Group__1__Impl rule__ValidMove__Group__2 ;
    public final void rule__ValidMove__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1245:1: ( rule__ValidMove__Group__1__Impl rule__ValidMove__Group__2 )
            // InternalBoardgameDL.g:1246:2: rule__ValidMove__Group__1__Impl rule__ValidMove__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalBoardgameDL.g:1253:1: rule__ValidMove__Group__1__Impl : ( 'ValidMove' ) ;
    public final void rule__ValidMove__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1257:1: ( ( 'ValidMove' ) )
            // InternalBoardgameDL.g:1258:1: ( 'ValidMove' )
            {
            // InternalBoardgameDL.g:1258:1: ( 'ValidMove' )
            // InternalBoardgameDL.g:1259:2: 'ValidMove'
            {
             before(grammarAccess.getValidMoveAccess().getValidMoveKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getValidMoveAccess().getValidMoveKeyword_1()); 

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
    // InternalBoardgameDL.g:1268:1: rule__ValidMove__Group__2 : rule__ValidMove__Group__2__Impl rule__ValidMove__Group__3 ;
    public final void rule__ValidMove__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1272:1: ( rule__ValidMove__Group__2__Impl rule__ValidMove__Group__3 )
            // InternalBoardgameDL.g:1273:2: rule__ValidMove__Group__2__Impl rule__ValidMove__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalBoardgameDL.g:1280:1: rule__ValidMove__Group__2__Impl : ( '{' ) ;
    public final void rule__ValidMove__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1284:1: ( ( '{' ) )
            // InternalBoardgameDL.g:1285:1: ( '{' )
            {
            // InternalBoardgameDL.g:1285:1: ( '{' )
            // InternalBoardgameDL.g:1286:2: '{'
            {
             before(grammarAccess.getValidMoveAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
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
    // InternalBoardgameDL.g:1295:1: rule__ValidMove__Group__3 : rule__ValidMove__Group__3__Impl rule__ValidMove__Group__4 ;
    public final void rule__ValidMove__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1299:1: ( rule__ValidMove__Group__3__Impl rule__ValidMove__Group__4 )
            // InternalBoardgameDL.g:1300:2: rule__ValidMove__Group__3__Impl rule__ValidMove__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalBoardgameDL.g:1307:1: rule__ValidMove__Group__3__Impl : ( ( rule__ValidMove__Group_3__0 )? ) ;
    public final void rule__ValidMove__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1311:1: ( ( ( rule__ValidMove__Group_3__0 )? ) )
            // InternalBoardgameDL.g:1312:1: ( ( rule__ValidMove__Group_3__0 )? )
            {
            // InternalBoardgameDL.g:1312:1: ( ( rule__ValidMove__Group_3__0 )? )
            // InternalBoardgameDL.g:1313:2: ( rule__ValidMove__Group_3__0 )?
            {
             before(grammarAccess.getValidMoveAccess().getGroup_3()); 
            // InternalBoardgameDL.g:1314:2: ( rule__ValidMove__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBoardgameDL.g:1314:3: rule__ValidMove__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ValidMove__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getValidMoveAccess().getGroup_3()); 

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
    // InternalBoardgameDL.g:1322:1: rule__ValidMove__Group__4 : rule__ValidMove__Group__4__Impl ;
    public final void rule__ValidMove__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1326:1: ( rule__ValidMove__Group__4__Impl )
            // InternalBoardgameDL.g:1327:2: rule__ValidMove__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValidMove__Group__4__Impl();

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
    // InternalBoardgameDL.g:1333:1: rule__ValidMove__Group__4__Impl : ( '}' ) ;
    public final void rule__ValidMove__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1337:1: ( ( '}' ) )
            // InternalBoardgameDL.g:1338:1: ( '}' )
            {
            // InternalBoardgameDL.g:1338:1: ( '}' )
            // InternalBoardgameDL.g:1339:2: '}'
            {
             before(grammarAccess.getValidMoveAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getValidMoveAccess().getRightCurlyBracketKeyword_4()); 

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


    // $ANTLR start "rule__ValidMove__Group_3__0"
    // InternalBoardgameDL.g:1349:1: rule__ValidMove__Group_3__0 : rule__ValidMove__Group_3__0__Impl rule__ValidMove__Group_3__1 ;
    public final void rule__ValidMove__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1353:1: ( rule__ValidMove__Group_3__0__Impl rule__ValidMove__Group_3__1 )
            // InternalBoardgameDL.g:1354:2: rule__ValidMove__Group_3__0__Impl rule__ValidMove__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__ValidMove__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidMove__Group_3__1();

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
    // $ANTLR end "rule__ValidMove__Group_3__0"


    // $ANTLR start "rule__ValidMove__Group_3__0__Impl"
    // InternalBoardgameDL.g:1361:1: rule__ValidMove__Group_3__0__Impl : ( 'condition' ) ;
    public final void rule__ValidMove__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1365:1: ( ( 'condition' ) )
            // InternalBoardgameDL.g:1366:1: ( 'condition' )
            {
            // InternalBoardgameDL.g:1366:1: ( 'condition' )
            // InternalBoardgameDL.g:1367:2: 'condition'
            {
             before(grammarAccess.getValidMoveAccess().getConditionKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getValidMoveAccess().getConditionKeyword_3_0()); 

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
    // $ANTLR end "rule__ValidMove__Group_3__0__Impl"


    // $ANTLR start "rule__ValidMove__Group_3__1"
    // InternalBoardgameDL.g:1376:1: rule__ValidMove__Group_3__1 : rule__ValidMove__Group_3__1__Impl rule__ValidMove__Group_3__2 ;
    public final void rule__ValidMove__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1380:1: ( rule__ValidMove__Group_3__1__Impl rule__ValidMove__Group_3__2 )
            // InternalBoardgameDL.g:1381:2: rule__ValidMove__Group_3__1__Impl rule__ValidMove__Group_3__2
            {
            pushFollow(FOLLOW_23);
            rule__ValidMove__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidMove__Group_3__2();

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
    // $ANTLR end "rule__ValidMove__Group_3__1"


    // $ANTLR start "rule__ValidMove__Group_3__1__Impl"
    // InternalBoardgameDL.g:1388:1: rule__ValidMove__Group_3__1__Impl : ( '{' ) ;
    public final void rule__ValidMove__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1392:1: ( ( '{' ) )
            // InternalBoardgameDL.g:1393:1: ( '{' )
            {
            // InternalBoardgameDL.g:1393:1: ( '{' )
            // InternalBoardgameDL.g:1394:2: '{'
            {
             before(grammarAccess.getValidMoveAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getValidMoveAccess().getLeftCurlyBracketKeyword_3_1()); 

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
    // $ANTLR end "rule__ValidMove__Group_3__1__Impl"


    // $ANTLR start "rule__ValidMove__Group_3__2"
    // InternalBoardgameDL.g:1403:1: rule__ValidMove__Group_3__2 : rule__ValidMove__Group_3__2__Impl rule__ValidMove__Group_3__3 ;
    public final void rule__ValidMove__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1407:1: ( rule__ValidMove__Group_3__2__Impl rule__ValidMove__Group_3__3 )
            // InternalBoardgameDL.g:1408:2: rule__ValidMove__Group_3__2__Impl rule__ValidMove__Group_3__3
            {
            pushFollow(FOLLOW_13);
            rule__ValidMove__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidMove__Group_3__3();

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
    // $ANTLR end "rule__ValidMove__Group_3__2"


    // $ANTLR start "rule__ValidMove__Group_3__2__Impl"
    // InternalBoardgameDL.g:1415:1: rule__ValidMove__Group_3__2__Impl : ( ( rule__ValidMove__ConditionAssignment_3_2 ) ) ;
    public final void rule__ValidMove__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1419:1: ( ( ( rule__ValidMove__ConditionAssignment_3_2 ) ) )
            // InternalBoardgameDL.g:1420:1: ( ( rule__ValidMove__ConditionAssignment_3_2 ) )
            {
            // InternalBoardgameDL.g:1420:1: ( ( rule__ValidMove__ConditionAssignment_3_2 ) )
            // InternalBoardgameDL.g:1421:2: ( rule__ValidMove__ConditionAssignment_3_2 )
            {
             before(grammarAccess.getValidMoveAccess().getConditionAssignment_3_2()); 
            // InternalBoardgameDL.g:1422:2: ( rule__ValidMove__ConditionAssignment_3_2 )
            // InternalBoardgameDL.g:1422:3: rule__ValidMove__ConditionAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__ValidMove__ConditionAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getValidMoveAccess().getConditionAssignment_3_2()); 

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
    // $ANTLR end "rule__ValidMove__Group_3__2__Impl"


    // $ANTLR start "rule__ValidMove__Group_3__3"
    // InternalBoardgameDL.g:1430:1: rule__ValidMove__Group_3__3 : rule__ValidMove__Group_3__3__Impl rule__ValidMove__Group_3__4 ;
    public final void rule__ValidMove__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1434:1: ( rule__ValidMove__Group_3__3__Impl rule__ValidMove__Group_3__4 )
            // InternalBoardgameDL.g:1435:2: rule__ValidMove__Group_3__3__Impl rule__ValidMove__Group_3__4
            {
            pushFollow(FOLLOW_13);
            rule__ValidMove__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidMove__Group_3__4();

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
    // $ANTLR end "rule__ValidMove__Group_3__3"


    // $ANTLR start "rule__ValidMove__Group_3__3__Impl"
    // InternalBoardgameDL.g:1442:1: rule__ValidMove__Group_3__3__Impl : ( ( rule__ValidMove__Group_3_3__0 )* ) ;
    public final void rule__ValidMove__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1446:1: ( ( ( rule__ValidMove__Group_3_3__0 )* ) )
            // InternalBoardgameDL.g:1447:1: ( ( rule__ValidMove__Group_3_3__0 )* )
            {
            // InternalBoardgameDL.g:1447:1: ( ( rule__ValidMove__Group_3_3__0 )* )
            // InternalBoardgameDL.g:1448:2: ( rule__ValidMove__Group_3_3__0 )*
            {
             before(grammarAccess.getValidMoveAccess().getGroup_3_3()); 
            // InternalBoardgameDL.g:1449:2: ( rule__ValidMove__Group_3_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBoardgameDL.g:1449:3: rule__ValidMove__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__ValidMove__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getValidMoveAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__ValidMove__Group_3__3__Impl"


    // $ANTLR start "rule__ValidMove__Group_3__4"
    // InternalBoardgameDL.g:1457:1: rule__ValidMove__Group_3__4 : rule__ValidMove__Group_3__4__Impl ;
    public final void rule__ValidMove__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1461:1: ( rule__ValidMove__Group_3__4__Impl )
            // InternalBoardgameDL.g:1462:2: rule__ValidMove__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValidMove__Group_3__4__Impl();

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
    // $ANTLR end "rule__ValidMove__Group_3__4"


    // $ANTLR start "rule__ValidMove__Group_3__4__Impl"
    // InternalBoardgameDL.g:1468:1: rule__ValidMove__Group_3__4__Impl : ( '}' ) ;
    public final void rule__ValidMove__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1472:1: ( ( '}' ) )
            // InternalBoardgameDL.g:1473:1: ( '}' )
            {
            // InternalBoardgameDL.g:1473:1: ( '}' )
            // InternalBoardgameDL.g:1474:2: '}'
            {
             before(grammarAccess.getValidMoveAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getValidMoveAccess().getRightCurlyBracketKeyword_3_4()); 

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
    // $ANTLR end "rule__ValidMove__Group_3__4__Impl"


    // $ANTLR start "rule__ValidMove__Group_3_3__0"
    // InternalBoardgameDL.g:1484:1: rule__ValidMove__Group_3_3__0 : rule__ValidMove__Group_3_3__0__Impl rule__ValidMove__Group_3_3__1 ;
    public final void rule__ValidMove__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1488:1: ( rule__ValidMove__Group_3_3__0__Impl rule__ValidMove__Group_3_3__1 )
            // InternalBoardgameDL.g:1489:2: rule__ValidMove__Group_3_3__0__Impl rule__ValidMove__Group_3_3__1
            {
            pushFollow(FOLLOW_23);
            rule__ValidMove__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidMove__Group_3_3__1();

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
    // $ANTLR end "rule__ValidMove__Group_3_3__0"


    // $ANTLR start "rule__ValidMove__Group_3_3__0__Impl"
    // InternalBoardgameDL.g:1496:1: rule__ValidMove__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__ValidMove__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1500:1: ( ( ',' ) )
            // InternalBoardgameDL.g:1501:1: ( ',' )
            {
            // InternalBoardgameDL.g:1501:1: ( ',' )
            // InternalBoardgameDL.g:1502:2: ','
            {
             before(grammarAccess.getValidMoveAccess().getCommaKeyword_3_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getValidMoveAccess().getCommaKeyword_3_3_0()); 

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
    // $ANTLR end "rule__ValidMove__Group_3_3__0__Impl"


    // $ANTLR start "rule__ValidMove__Group_3_3__1"
    // InternalBoardgameDL.g:1511:1: rule__ValidMove__Group_3_3__1 : rule__ValidMove__Group_3_3__1__Impl ;
    public final void rule__ValidMove__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1515:1: ( rule__ValidMove__Group_3_3__1__Impl )
            // InternalBoardgameDL.g:1516:2: rule__ValidMove__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValidMove__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__ValidMove__Group_3_3__1"


    // $ANTLR start "rule__ValidMove__Group_3_3__1__Impl"
    // InternalBoardgameDL.g:1522:1: rule__ValidMove__Group_3_3__1__Impl : ( ( rule__ValidMove__ConditionAssignment_3_3_1 ) ) ;
    public final void rule__ValidMove__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1526:1: ( ( ( rule__ValidMove__ConditionAssignment_3_3_1 ) ) )
            // InternalBoardgameDL.g:1527:1: ( ( rule__ValidMove__ConditionAssignment_3_3_1 ) )
            {
            // InternalBoardgameDL.g:1527:1: ( ( rule__ValidMove__ConditionAssignment_3_3_1 ) )
            // InternalBoardgameDL.g:1528:2: ( rule__ValidMove__ConditionAssignment_3_3_1 )
            {
             before(grammarAccess.getValidMoveAccess().getConditionAssignment_3_3_1()); 
            // InternalBoardgameDL.g:1529:2: ( rule__ValidMove__ConditionAssignment_3_3_1 )
            // InternalBoardgameDL.g:1529:3: rule__ValidMove__ConditionAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ValidMove__ConditionAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getValidMoveAccess().getConditionAssignment_3_3_1()); 

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
    // $ANTLR end "rule__ValidMove__Group_3_3__1__Impl"


    // $ANTLR start "rule__EffectOnCell__Group__0"
    // InternalBoardgameDL.g:1538:1: rule__EffectOnCell__Group__0 : rule__EffectOnCell__Group__0__Impl rule__EffectOnCell__Group__1 ;
    public final void rule__EffectOnCell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1542:1: ( rule__EffectOnCell__Group__0__Impl rule__EffectOnCell__Group__1 )
            // InternalBoardgameDL.g:1543:2: rule__EffectOnCell__Group__0__Impl rule__EffectOnCell__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalBoardgameDL.g:1550:1: rule__EffectOnCell__Group__0__Impl : ( 'EffectOnCell' ) ;
    public final void rule__EffectOnCell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1554:1: ( ( 'EffectOnCell' ) )
            // InternalBoardgameDL.g:1555:1: ( 'EffectOnCell' )
            {
            // InternalBoardgameDL.g:1555:1: ( 'EffectOnCell' )
            // InternalBoardgameDL.g:1556:2: 'EffectOnCell'
            {
             before(grammarAccess.getEffectOnCellAccess().getEffectOnCellKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalBoardgameDL.g:1565:1: rule__EffectOnCell__Group__1 : rule__EffectOnCell__Group__1__Impl rule__EffectOnCell__Group__2 ;
    public final void rule__EffectOnCell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1569:1: ( rule__EffectOnCell__Group__1__Impl rule__EffectOnCell__Group__2 )
            // InternalBoardgameDL.g:1570:2: rule__EffectOnCell__Group__1__Impl rule__EffectOnCell__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalBoardgameDL.g:1577:1: rule__EffectOnCell__Group__1__Impl : ( '{' ) ;
    public final void rule__EffectOnCell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1581:1: ( ( '{' ) )
            // InternalBoardgameDL.g:1582:1: ( '{' )
            {
            // InternalBoardgameDL.g:1582:1: ( '{' )
            // InternalBoardgameDL.g:1583:2: '{'
            {
             before(grammarAccess.getEffectOnCellAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEffectOnCellAccess().getLeftCurlyBracketKeyword_1()); 

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
    // InternalBoardgameDL.g:1592:1: rule__EffectOnCell__Group__2 : rule__EffectOnCell__Group__2__Impl rule__EffectOnCell__Group__3 ;
    public final void rule__EffectOnCell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1596:1: ( rule__EffectOnCell__Group__2__Impl rule__EffectOnCell__Group__3 )
            // InternalBoardgameDL.g:1597:2: rule__EffectOnCell__Group__2__Impl rule__EffectOnCell__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalBoardgameDL.g:1604:1: rule__EffectOnCell__Group__2__Impl : ( 'x' ) ;
    public final void rule__EffectOnCell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1608:1: ( ( 'x' ) )
            // InternalBoardgameDL.g:1609:1: ( 'x' )
            {
            // InternalBoardgameDL.g:1609:1: ( 'x' )
            // InternalBoardgameDL.g:1610:2: 'x'
            {
             before(grammarAccess.getEffectOnCellAccess().getXKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEffectOnCellAccess().getXKeyword_2()); 

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
    // InternalBoardgameDL.g:1619:1: rule__EffectOnCell__Group__3 : rule__EffectOnCell__Group__3__Impl rule__EffectOnCell__Group__4 ;
    public final void rule__EffectOnCell__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1623:1: ( rule__EffectOnCell__Group__3__Impl rule__EffectOnCell__Group__4 )
            // InternalBoardgameDL.g:1624:2: rule__EffectOnCell__Group__3__Impl rule__EffectOnCell__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalBoardgameDL.g:1631:1: rule__EffectOnCell__Group__3__Impl : ( ( rule__EffectOnCell__XAssignment_3 ) ) ;
    public final void rule__EffectOnCell__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1635:1: ( ( ( rule__EffectOnCell__XAssignment_3 ) ) )
            // InternalBoardgameDL.g:1636:1: ( ( rule__EffectOnCell__XAssignment_3 ) )
            {
            // InternalBoardgameDL.g:1636:1: ( ( rule__EffectOnCell__XAssignment_3 ) )
            // InternalBoardgameDL.g:1637:2: ( rule__EffectOnCell__XAssignment_3 )
            {
             before(grammarAccess.getEffectOnCellAccess().getXAssignment_3()); 
            // InternalBoardgameDL.g:1638:2: ( rule__EffectOnCell__XAssignment_3 )
            // InternalBoardgameDL.g:1638:3: rule__EffectOnCell__XAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EffectOnCell__XAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEffectOnCellAccess().getXAssignment_3()); 

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
    // InternalBoardgameDL.g:1646:1: rule__EffectOnCell__Group__4 : rule__EffectOnCell__Group__4__Impl rule__EffectOnCell__Group__5 ;
    public final void rule__EffectOnCell__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1650:1: ( rule__EffectOnCell__Group__4__Impl rule__EffectOnCell__Group__5 )
            // InternalBoardgameDL.g:1651:2: rule__EffectOnCell__Group__4__Impl rule__EffectOnCell__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__EffectOnCell__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectOnCell__Group__5();

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
    // InternalBoardgameDL.g:1658:1: rule__EffectOnCell__Group__4__Impl : ( 'y' ) ;
    public final void rule__EffectOnCell__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1662:1: ( ( 'y' ) )
            // InternalBoardgameDL.g:1663:1: ( 'y' )
            {
            // InternalBoardgameDL.g:1663:1: ( 'y' )
            // InternalBoardgameDL.g:1664:2: 'y'
            {
             before(grammarAccess.getEffectOnCellAccess().getYKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEffectOnCellAccess().getYKeyword_4()); 

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


    // $ANTLR start "rule__EffectOnCell__Group__5"
    // InternalBoardgameDL.g:1673:1: rule__EffectOnCell__Group__5 : rule__EffectOnCell__Group__5__Impl rule__EffectOnCell__Group__6 ;
    public final void rule__EffectOnCell__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1677:1: ( rule__EffectOnCell__Group__5__Impl rule__EffectOnCell__Group__6 )
            // InternalBoardgameDL.g:1678:2: rule__EffectOnCell__Group__5__Impl rule__EffectOnCell__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__EffectOnCell__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectOnCell__Group__6();

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
    // $ANTLR end "rule__EffectOnCell__Group__5"


    // $ANTLR start "rule__EffectOnCell__Group__5__Impl"
    // InternalBoardgameDL.g:1685:1: rule__EffectOnCell__Group__5__Impl : ( ( rule__EffectOnCell__YAssignment_5 ) ) ;
    public final void rule__EffectOnCell__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1689:1: ( ( ( rule__EffectOnCell__YAssignment_5 ) ) )
            // InternalBoardgameDL.g:1690:1: ( ( rule__EffectOnCell__YAssignment_5 ) )
            {
            // InternalBoardgameDL.g:1690:1: ( ( rule__EffectOnCell__YAssignment_5 ) )
            // InternalBoardgameDL.g:1691:2: ( rule__EffectOnCell__YAssignment_5 )
            {
             before(grammarAccess.getEffectOnCellAccess().getYAssignment_5()); 
            // InternalBoardgameDL.g:1692:2: ( rule__EffectOnCell__YAssignment_5 )
            // InternalBoardgameDL.g:1692:3: rule__EffectOnCell__YAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__EffectOnCell__YAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEffectOnCellAccess().getYAssignment_5()); 

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
    // $ANTLR end "rule__EffectOnCell__Group__5__Impl"


    // $ANTLR start "rule__EffectOnCell__Group__6"
    // InternalBoardgameDL.g:1700:1: rule__EffectOnCell__Group__6 : rule__EffectOnCell__Group__6__Impl rule__EffectOnCell__Group__7 ;
    public final void rule__EffectOnCell__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1704:1: ( rule__EffectOnCell__Group__6__Impl rule__EffectOnCell__Group__7 )
            // InternalBoardgameDL.g:1705:2: rule__EffectOnCell__Group__6__Impl rule__EffectOnCell__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__EffectOnCell__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectOnCell__Group__7();

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
    // $ANTLR end "rule__EffectOnCell__Group__6"


    // $ANTLR start "rule__EffectOnCell__Group__6__Impl"
    // InternalBoardgameDL.g:1712:1: rule__EffectOnCell__Group__6__Impl : ( 'cellstate' ) ;
    public final void rule__EffectOnCell__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1716:1: ( ( 'cellstate' ) )
            // InternalBoardgameDL.g:1717:1: ( 'cellstate' )
            {
            // InternalBoardgameDL.g:1717:1: ( 'cellstate' )
            // InternalBoardgameDL.g:1718:2: 'cellstate'
            {
             before(grammarAccess.getEffectOnCellAccess().getCellstateKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEffectOnCellAccess().getCellstateKeyword_6()); 

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
    // $ANTLR end "rule__EffectOnCell__Group__6__Impl"


    // $ANTLR start "rule__EffectOnCell__Group__7"
    // InternalBoardgameDL.g:1727:1: rule__EffectOnCell__Group__7 : rule__EffectOnCell__Group__7__Impl rule__EffectOnCell__Group__8 ;
    public final void rule__EffectOnCell__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1731:1: ( rule__EffectOnCell__Group__7__Impl rule__EffectOnCell__Group__8 )
            // InternalBoardgameDL.g:1732:2: rule__EffectOnCell__Group__7__Impl rule__EffectOnCell__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__EffectOnCell__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectOnCell__Group__8();

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
    // $ANTLR end "rule__EffectOnCell__Group__7"


    // $ANTLR start "rule__EffectOnCell__Group__7__Impl"
    // InternalBoardgameDL.g:1739:1: rule__EffectOnCell__Group__7__Impl : ( ( rule__EffectOnCell__CellstateAssignment_7 ) ) ;
    public final void rule__EffectOnCell__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1743:1: ( ( ( rule__EffectOnCell__CellstateAssignment_7 ) ) )
            // InternalBoardgameDL.g:1744:1: ( ( rule__EffectOnCell__CellstateAssignment_7 ) )
            {
            // InternalBoardgameDL.g:1744:1: ( ( rule__EffectOnCell__CellstateAssignment_7 ) )
            // InternalBoardgameDL.g:1745:2: ( rule__EffectOnCell__CellstateAssignment_7 )
            {
             before(grammarAccess.getEffectOnCellAccess().getCellstateAssignment_7()); 
            // InternalBoardgameDL.g:1746:2: ( rule__EffectOnCell__CellstateAssignment_7 )
            // InternalBoardgameDL.g:1746:3: rule__EffectOnCell__CellstateAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__EffectOnCell__CellstateAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getEffectOnCellAccess().getCellstateAssignment_7()); 

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
    // $ANTLR end "rule__EffectOnCell__Group__7__Impl"


    // $ANTLR start "rule__EffectOnCell__Group__8"
    // InternalBoardgameDL.g:1754:1: rule__EffectOnCell__Group__8 : rule__EffectOnCell__Group__8__Impl ;
    public final void rule__EffectOnCell__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1758:1: ( rule__EffectOnCell__Group__8__Impl )
            // InternalBoardgameDL.g:1759:2: rule__EffectOnCell__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectOnCell__Group__8__Impl();

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
    // $ANTLR end "rule__EffectOnCell__Group__8"


    // $ANTLR start "rule__EffectOnCell__Group__8__Impl"
    // InternalBoardgameDL.g:1765:1: rule__EffectOnCell__Group__8__Impl : ( '}' ) ;
    public final void rule__EffectOnCell__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1769:1: ( ( '}' ) )
            // InternalBoardgameDL.g:1770:1: ( '}' )
            {
            // InternalBoardgameDL.g:1770:1: ( '}' )
            // InternalBoardgameDL.g:1771:2: '}'
            {
             before(grammarAccess.getEffectOnCellAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEffectOnCellAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__EffectOnCell__Group__8__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalBoardgameDL.g:1781:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1785:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalBoardgameDL.g:1786:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalBoardgameDL.g:1793:1: rule__Condition__Group__0__Impl : ( () ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1797:1: ( ( () ) )
            // InternalBoardgameDL.g:1798:1: ( () )
            {
            // InternalBoardgameDL.g:1798:1: ( () )
            // InternalBoardgameDL.g:1799:2: ()
            {
             before(grammarAccess.getConditionAccess().getConditionAction_0()); 
            // InternalBoardgameDL.g:1800:2: ()
            // InternalBoardgameDL.g:1800:3: 
            {
            }

             after(grammarAccess.getConditionAccess().getConditionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalBoardgameDL.g:1808:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1812:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalBoardgameDL.g:1813:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalBoardgameDL.g:1820:1: rule__Condition__Group__1__Impl : ( 'Condition' ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1824:1: ( ( 'Condition' ) )
            // InternalBoardgameDL.g:1825:1: ( 'Condition' )
            {
            // InternalBoardgameDL.g:1825:1: ( 'Condition' )
            // InternalBoardgameDL.g:1826:2: 'Condition'
            {
             before(grammarAccess.getConditionAccess().getConditionKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getConditionKeyword_1()); 

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
    // InternalBoardgameDL.g:1835:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1839:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // InternalBoardgameDL.g:1840:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Condition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__3();

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
    // InternalBoardgameDL.g:1847:1: rule__Condition__Group__2__Impl : ( '{' ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1851:1: ( ( '{' ) )
            // InternalBoardgameDL.g:1852:1: ( '{' )
            {
            // InternalBoardgameDL.g:1852:1: ( '{' )
            // InternalBoardgameDL.g:1853:2: '{'
            {
             before(grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_2()); 

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


    // $ANTLR start "rule__Condition__Group__3"
    // InternalBoardgameDL.g:1862:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl rule__Condition__Group__4 ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1866:1: ( rule__Condition__Group__3__Impl rule__Condition__Group__4 )
            // InternalBoardgameDL.g:1867:2: rule__Condition__Group__3__Impl rule__Condition__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Condition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__4();

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
    // $ANTLR end "rule__Condition__Group__3"


    // $ANTLR start "rule__Condition__Group__3__Impl"
    // InternalBoardgameDL.g:1874:1: rule__Condition__Group__3__Impl : ( ( rule__Condition__Group_3__0 )? ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1878:1: ( ( ( rule__Condition__Group_3__0 )? ) )
            // InternalBoardgameDL.g:1879:1: ( ( rule__Condition__Group_3__0 )? )
            {
            // InternalBoardgameDL.g:1879:1: ( ( rule__Condition__Group_3__0 )? )
            // InternalBoardgameDL.g:1880:2: ( rule__Condition__Group_3__0 )?
            {
             before(grammarAccess.getConditionAccess().getGroup_3()); 
            // InternalBoardgameDL.g:1881:2: ( rule__Condition__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBoardgameDL.g:1881:3: rule__Condition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Condition__Group__3__Impl"


    // $ANTLR start "rule__Condition__Group__4"
    // InternalBoardgameDL.g:1889:1: rule__Condition__Group__4 : rule__Condition__Group__4__Impl ;
    public final void rule__Condition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1893:1: ( rule__Condition__Group__4__Impl )
            // InternalBoardgameDL.g:1894:2: rule__Condition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__4__Impl();

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
    // $ANTLR end "rule__Condition__Group__4"


    // $ANTLR start "rule__Condition__Group__4__Impl"
    // InternalBoardgameDL.g:1900:1: rule__Condition__Group__4__Impl : ( '}' ) ;
    public final void rule__Condition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1904:1: ( ( '}' ) )
            // InternalBoardgameDL.g:1905:1: ( '}' )
            {
            // InternalBoardgameDL.g:1905:1: ( '}' )
            // InternalBoardgameDL.g:1906:2: '}'
            {
             before(grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Condition__Group__4__Impl"


    // $ANTLR start "rule__Condition__Group_3__0"
    // InternalBoardgameDL.g:1916:1: rule__Condition__Group_3__0 : rule__Condition__Group_3__0__Impl rule__Condition__Group_3__1 ;
    public final void rule__Condition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1920:1: ( rule__Condition__Group_3__0__Impl rule__Condition__Group_3__1 )
            // InternalBoardgameDL.g:1921:2: rule__Condition__Group_3__0__Impl rule__Condition__Group_3__1
            {
            pushFollow(FOLLOW_28);
            rule__Condition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_3__1();

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
    // $ANTLR end "rule__Condition__Group_3__0"


    // $ANTLR start "rule__Condition__Group_3__0__Impl"
    // InternalBoardgameDL.g:1928:1: rule__Condition__Group_3__0__Impl : ( 'cellstate' ) ;
    public final void rule__Condition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1932:1: ( ( 'cellstate' ) )
            // InternalBoardgameDL.g:1933:1: ( 'cellstate' )
            {
            // InternalBoardgameDL.g:1933:1: ( 'cellstate' )
            // InternalBoardgameDL.g:1934:2: 'cellstate'
            {
             before(grammarAccess.getConditionAccess().getCellstateKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getCellstateKeyword_3_0()); 

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
    // $ANTLR end "rule__Condition__Group_3__0__Impl"


    // $ANTLR start "rule__Condition__Group_3__1"
    // InternalBoardgameDL.g:1943:1: rule__Condition__Group_3__1 : rule__Condition__Group_3__1__Impl rule__Condition__Group_3__2 ;
    public final void rule__Condition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1947:1: ( rule__Condition__Group_3__1__Impl rule__Condition__Group_3__2 )
            // InternalBoardgameDL.g:1948:2: rule__Condition__Group_3__1__Impl rule__Condition__Group_3__2
            {
            pushFollow(FOLLOW_8);
            rule__Condition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_3__2();

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
    // $ANTLR end "rule__Condition__Group_3__1"


    // $ANTLR start "rule__Condition__Group_3__1__Impl"
    // InternalBoardgameDL.g:1955:1: rule__Condition__Group_3__1__Impl : ( '(' ) ;
    public final void rule__Condition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1959:1: ( ( '(' ) )
            // InternalBoardgameDL.g:1960:1: ( '(' )
            {
            // InternalBoardgameDL.g:1960:1: ( '(' )
            // InternalBoardgameDL.g:1961:2: '('
            {
             before(grammarAccess.getConditionAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getLeftParenthesisKeyword_3_1()); 

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
    // $ANTLR end "rule__Condition__Group_3__1__Impl"


    // $ANTLR start "rule__Condition__Group_3__2"
    // InternalBoardgameDL.g:1970:1: rule__Condition__Group_3__2 : rule__Condition__Group_3__2__Impl rule__Condition__Group_3__3 ;
    public final void rule__Condition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1974:1: ( rule__Condition__Group_3__2__Impl rule__Condition__Group_3__3 )
            // InternalBoardgameDL.g:1975:2: rule__Condition__Group_3__2__Impl rule__Condition__Group_3__3
            {
            pushFollow(FOLLOW_29);
            rule__Condition__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_3__3();

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
    // $ANTLR end "rule__Condition__Group_3__2"


    // $ANTLR start "rule__Condition__Group_3__2__Impl"
    // InternalBoardgameDL.g:1982:1: rule__Condition__Group_3__2__Impl : ( ( rule__Condition__CellstateAssignment_3_2 ) ) ;
    public final void rule__Condition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1986:1: ( ( ( rule__Condition__CellstateAssignment_3_2 ) ) )
            // InternalBoardgameDL.g:1987:1: ( ( rule__Condition__CellstateAssignment_3_2 ) )
            {
            // InternalBoardgameDL.g:1987:1: ( ( rule__Condition__CellstateAssignment_3_2 ) )
            // InternalBoardgameDL.g:1988:2: ( rule__Condition__CellstateAssignment_3_2 )
            {
             before(grammarAccess.getConditionAccess().getCellstateAssignment_3_2()); 
            // InternalBoardgameDL.g:1989:2: ( rule__Condition__CellstateAssignment_3_2 )
            // InternalBoardgameDL.g:1989:3: rule__Condition__CellstateAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Condition__CellstateAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getCellstateAssignment_3_2()); 

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
    // $ANTLR end "rule__Condition__Group_3__2__Impl"


    // $ANTLR start "rule__Condition__Group_3__3"
    // InternalBoardgameDL.g:1997:1: rule__Condition__Group_3__3 : rule__Condition__Group_3__3__Impl rule__Condition__Group_3__4 ;
    public final void rule__Condition__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2001:1: ( rule__Condition__Group_3__3__Impl rule__Condition__Group_3__4 )
            // InternalBoardgameDL.g:2002:2: rule__Condition__Group_3__3__Impl rule__Condition__Group_3__4
            {
            pushFollow(FOLLOW_29);
            rule__Condition__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_3__4();

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
    // $ANTLR end "rule__Condition__Group_3__3"


    // $ANTLR start "rule__Condition__Group_3__3__Impl"
    // InternalBoardgameDL.g:2009:1: rule__Condition__Group_3__3__Impl : ( ( rule__Condition__Group_3_3__0 )* ) ;
    public final void rule__Condition__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2013:1: ( ( ( rule__Condition__Group_3_3__0 )* ) )
            // InternalBoardgameDL.g:2014:1: ( ( rule__Condition__Group_3_3__0 )* )
            {
            // InternalBoardgameDL.g:2014:1: ( ( rule__Condition__Group_3_3__0 )* )
            // InternalBoardgameDL.g:2015:2: ( rule__Condition__Group_3_3__0 )*
            {
             before(grammarAccess.getConditionAccess().getGroup_3_3()); 
            // InternalBoardgameDL.g:2016:2: ( rule__Condition__Group_3_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBoardgameDL.g:2016:3: rule__Condition__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Condition__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getConditionAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__Condition__Group_3__3__Impl"


    // $ANTLR start "rule__Condition__Group_3__4"
    // InternalBoardgameDL.g:2024:1: rule__Condition__Group_3__4 : rule__Condition__Group_3__4__Impl ;
    public final void rule__Condition__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2028:1: ( rule__Condition__Group_3__4__Impl )
            // InternalBoardgameDL.g:2029:2: rule__Condition__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group_3__4__Impl();

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
    // $ANTLR end "rule__Condition__Group_3__4"


    // $ANTLR start "rule__Condition__Group_3__4__Impl"
    // InternalBoardgameDL.g:2035:1: rule__Condition__Group_3__4__Impl : ( ')' ) ;
    public final void rule__Condition__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2039:1: ( ( ')' ) )
            // InternalBoardgameDL.g:2040:1: ( ')' )
            {
            // InternalBoardgameDL.g:2040:1: ( ')' )
            // InternalBoardgameDL.g:2041:2: ')'
            {
             before(grammarAccess.getConditionAccess().getRightParenthesisKeyword_3_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getRightParenthesisKeyword_3_4()); 

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
    // $ANTLR end "rule__Condition__Group_3__4__Impl"


    // $ANTLR start "rule__Condition__Group_3_3__0"
    // InternalBoardgameDL.g:2051:1: rule__Condition__Group_3_3__0 : rule__Condition__Group_3_3__0__Impl rule__Condition__Group_3_3__1 ;
    public final void rule__Condition__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2055:1: ( rule__Condition__Group_3_3__0__Impl rule__Condition__Group_3_3__1 )
            // InternalBoardgameDL.g:2056:2: rule__Condition__Group_3_3__0__Impl rule__Condition__Group_3_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Condition__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_3_3__1();

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
    // $ANTLR end "rule__Condition__Group_3_3__0"


    // $ANTLR start "rule__Condition__Group_3_3__0__Impl"
    // InternalBoardgameDL.g:2063:1: rule__Condition__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Condition__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2067:1: ( ( ',' ) )
            // InternalBoardgameDL.g:2068:1: ( ',' )
            {
            // InternalBoardgameDL.g:2068:1: ( ',' )
            // InternalBoardgameDL.g:2069:2: ','
            {
             before(grammarAccess.getConditionAccess().getCommaKeyword_3_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getCommaKeyword_3_3_0()); 

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
    // $ANTLR end "rule__Condition__Group_3_3__0__Impl"


    // $ANTLR start "rule__Condition__Group_3_3__1"
    // InternalBoardgameDL.g:2078:1: rule__Condition__Group_3_3__1 : rule__Condition__Group_3_3__1__Impl ;
    public final void rule__Condition__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2082:1: ( rule__Condition__Group_3_3__1__Impl )
            // InternalBoardgameDL.g:2083:2: rule__Condition__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__Condition__Group_3_3__1"


    // $ANTLR start "rule__Condition__Group_3_3__1__Impl"
    // InternalBoardgameDL.g:2089:1: rule__Condition__Group_3_3__1__Impl : ( ( rule__Condition__CellstateAssignment_3_3_1 ) ) ;
    public final void rule__Condition__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2093:1: ( ( ( rule__Condition__CellstateAssignment_3_3_1 ) ) )
            // InternalBoardgameDL.g:2094:1: ( ( rule__Condition__CellstateAssignment_3_3_1 ) )
            {
            // InternalBoardgameDL.g:2094:1: ( ( rule__Condition__CellstateAssignment_3_3_1 ) )
            // InternalBoardgameDL.g:2095:2: ( rule__Condition__CellstateAssignment_3_3_1 )
            {
             before(grammarAccess.getConditionAccess().getCellstateAssignment_3_3_1()); 
            // InternalBoardgameDL.g:2096:2: ( rule__Condition__CellstateAssignment_3_3_1 )
            // InternalBoardgameDL.g:2096:3: rule__Condition__CellstateAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__CellstateAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getCellstateAssignment_3_3_1()); 

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
    // $ANTLR end "rule__Condition__Group_3_3__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalBoardgameDL.g:2105:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2109:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalBoardgameDL.g:2110:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalBoardgameDL.g:2117:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2121:1: ( ( ( '-' )? ) )
            // InternalBoardgameDL.g:2122:1: ( ( '-' )? )
            {
            // InternalBoardgameDL.g:2122:1: ( ( '-' )? )
            // InternalBoardgameDL.g:2123:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalBoardgameDL.g:2124:2: ( '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBoardgameDL.g:2124:3: '-'
                    {
                    match(input,31,FOLLOW_2); 

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
    // InternalBoardgameDL.g:2132:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2136:1: ( rule__EInt__Group__1__Impl )
            // InternalBoardgameDL.g:2137:2: rule__EInt__Group__1__Impl
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
    // InternalBoardgameDL.g:2143:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2147:1: ( ( RULE_INT ) )
            // InternalBoardgameDL.g:2148:1: ( RULE_INT )
            {
            // InternalBoardgameDL.g:2148:1: ( RULE_INT )
            // InternalBoardgameDL.g:2149:2: RULE_INT
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


    // $ANTLR start "rule__InARow__Group__0"
    // InternalBoardgameDL.g:2159:1: rule__InARow__Group__0 : rule__InARow__Group__0__Impl rule__InARow__Group__1 ;
    public final void rule__InARow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2163:1: ( rule__InARow__Group__0__Impl rule__InARow__Group__1 )
            // InternalBoardgameDL.g:2164:2: rule__InARow__Group__0__Impl rule__InARow__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__InARow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InARow__Group__1();

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
    // $ANTLR end "rule__InARow__Group__0"


    // $ANTLR start "rule__InARow__Group__0__Impl"
    // InternalBoardgameDL.g:2171:1: rule__InARow__Group__0__Impl : ( ( rule__InARow__DiagonalAssignment_0 ) ) ;
    public final void rule__InARow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2175:1: ( ( ( rule__InARow__DiagonalAssignment_0 ) ) )
            // InternalBoardgameDL.g:2176:1: ( ( rule__InARow__DiagonalAssignment_0 ) )
            {
            // InternalBoardgameDL.g:2176:1: ( ( rule__InARow__DiagonalAssignment_0 ) )
            // InternalBoardgameDL.g:2177:2: ( rule__InARow__DiagonalAssignment_0 )
            {
             before(grammarAccess.getInARowAccess().getDiagonalAssignment_0()); 
            // InternalBoardgameDL.g:2178:2: ( rule__InARow__DiagonalAssignment_0 )
            // InternalBoardgameDL.g:2178:3: rule__InARow__DiagonalAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__InARow__DiagonalAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInARowAccess().getDiagonalAssignment_0()); 

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
    // $ANTLR end "rule__InARow__Group__0__Impl"


    // $ANTLR start "rule__InARow__Group__1"
    // InternalBoardgameDL.g:2186:1: rule__InARow__Group__1 : rule__InARow__Group__1__Impl rule__InARow__Group__2 ;
    public final void rule__InARow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2190:1: ( rule__InARow__Group__1__Impl rule__InARow__Group__2 )
            // InternalBoardgameDL.g:2191:2: rule__InARow__Group__1__Impl rule__InARow__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__InARow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InARow__Group__2();

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
    // $ANTLR end "rule__InARow__Group__1"


    // $ANTLR start "rule__InARow__Group__1__Impl"
    // InternalBoardgameDL.g:2198:1: rule__InARow__Group__1__Impl : ( ( rule__InARow__HorizontalAssignment_1 ) ) ;
    public final void rule__InARow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2202:1: ( ( ( rule__InARow__HorizontalAssignment_1 ) ) )
            // InternalBoardgameDL.g:2203:1: ( ( rule__InARow__HorizontalAssignment_1 ) )
            {
            // InternalBoardgameDL.g:2203:1: ( ( rule__InARow__HorizontalAssignment_1 ) )
            // InternalBoardgameDL.g:2204:2: ( rule__InARow__HorizontalAssignment_1 )
            {
             before(grammarAccess.getInARowAccess().getHorizontalAssignment_1()); 
            // InternalBoardgameDL.g:2205:2: ( rule__InARow__HorizontalAssignment_1 )
            // InternalBoardgameDL.g:2205:3: rule__InARow__HorizontalAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InARow__HorizontalAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInARowAccess().getHorizontalAssignment_1()); 

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
    // $ANTLR end "rule__InARow__Group__1__Impl"


    // $ANTLR start "rule__InARow__Group__2"
    // InternalBoardgameDL.g:2213:1: rule__InARow__Group__2 : rule__InARow__Group__2__Impl rule__InARow__Group__3 ;
    public final void rule__InARow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2217:1: ( rule__InARow__Group__2__Impl rule__InARow__Group__3 )
            // InternalBoardgameDL.g:2218:2: rule__InARow__Group__2__Impl rule__InARow__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__InARow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InARow__Group__3();

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
    // $ANTLR end "rule__InARow__Group__2"


    // $ANTLR start "rule__InARow__Group__2__Impl"
    // InternalBoardgameDL.g:2225:1: rule__InARow__Group__2__Impl : ( ( rule__InARow__VerticalAssignment_2 ) ) ;
    public final void rule__InARow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2229:1: ( ( ( rule__InARow__VerticalAssignment_2 ) ) )
            // InternalBoardgameDL.g:2230:1: ( ( rule__InARow__VerticalAssignment_2 ) )
            {
            // InternalBoardgameDL.g:2230:1: ( ( rule__InARow__VerticalAssignment_2 ) )
            // InternalBoardgameDL.g:2231:2: ( rule__InARow__VerticalAssignment_2 )
            {
             before(grammarAccess.getInARowAccess().getVerticalAssignment_2()); 
            // InternalBoardgameDL.g:2232:2: ( rule__InARow__VerticalAssignment_2 )
            // InternalBoardgameDL.g:2232:3: rule__InARow__VerticalAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InARow__VerticalAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInARowAccess().getVerticalAssignment_2()); 

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
    // $ANTLR end "rule__InARow__Group__2__Impl"


    // $ANTLR start "rule__InARow__Group__3"
    // InternalBoardgameDL.g:2240:1: rule__InARow__Group__3 : rule__InARow__Group__3__Impl rule__InARow__Group__4 ;
    public final void rule__InARow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2244:1: ( rule__InARow__Group__3__Impl rule__InARow__Group__4 )
            // InternalBoardgameDL.g:2245:2: rule__InARow__Group__3__Impl rule__InARow__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__InARow__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InARow__Group__4();

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
    // $ANTLR end "rule__InARow__Group__3"


    // $ANTLR start "rule__InARow__Group__3__Impl"
    // InternalBoardgameDL.g:2252:1: rule__InARow__Group__3__Impl : ( 'InARow' ) ;
    public final void rule__InARow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2256:1: ( ( 'InARow' ) )
            // InternalBoardgameDL.g:2257:1: ( 'InARow' )
            {
            // InternalBoardgameDL.g:2257:1: ( 'InARow' )
            // InternalBoardgameDL.g:2258:2: 'InARow'
            {
             before(grammarAccess.getInARowAccess().getInARowKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getInARowAccess().getInARowKeyword_3()); 

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
    // $ANTLR end "rule__InARow__Group__3__Impl"


    // $ANTLR start "rule__InARow__Group__4"
    // InternalBoardgameDL.g:2267:1: rule__InARow__Group__4 : rule__InARow__Group__4__Impl rule__InARow__Group__5 ;
    public final void rule__InARow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2271:1: ( rule__InARow__Group__4__Impl rule__InARow__Group__5 )
            // InternalBoardgameDL.g:2272:2: rule__InARow__Group__4__Impl rule__InARow__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__InARow__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InARow__Group__5();

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
    // $ANTLR end "rule__InARow__Group__4"


    // $ANTLR start "rule__InARow__Group__4__Impl"
    // InternalBoardgameDL.g:2279:1: rule__InARow__Group__4__Impl : ( '{' ) ;
    public final void rule__InARow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2283:1: ( ( '{' ) )
            // InternalBoardgameDL.g:2284:1: ( '{' )
            {
            // InternalBoardgameDL.g:2284:1: ( '{' )
            // InternalBoardgameDL.g:2285:2: '{'
            {
             before(grammarAccess.getInARowAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getInARowAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__InARow__Group__4__Impl"


    // $ANTLR start "rule__InARow__Group__5"
    // InternalBoardgameDL.g:2294:1: rule__InARow__Group__5 : rule__InARow__Group__5__Impl rule__InARow__Group__6 ;
    public final void rule__InARow__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2298:1: ( rule__InARow__Group__5__Impl rule__InARow__Group__6 )
            // InternalBoardgameDL.g:2299:2: rule__InARow__Group__5__Impl rule__InARow__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__InARow__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InARow__Group__6();

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
    // $ANTLR end "rule__InARow__Group__5"


    // $ANTLR start "rule__InARow__Group__5__Impl"
    // InternalBoardgameDL.g:2306:1: rule__InARow__Group__5__Impl : ( 'count' ) ;
    public final void rule__InARow__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2310:1: ( ( 'count' ) )
            // InternalBoardgameDL.g:2311:1: ( 'count' )
            {
            // InternalBoardgameDL.g:2311:1: ( 'count' )
            // InternalBoardgameDL.g:2312:2: 'count'
            {
             before(grammarAccess.getInARowAccess().getCountKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getInARowAccess().getCountKeyword_5()); 

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
    // $ANTLR end "rule__InARow__Group__5__Impl"


    // $ANTLR start "rule__InARow__Group__6"
    // InternalBoardgameDL.g:2321:1: rule__InARow__Group__6 : rule__InARow__Group__6__Impl rule__InARow__Group__7 ;
    public final void rule__InARow__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2325:1: ( rule__InARow__Group__6__Impl rule__InARow__Group__7 )
            // InternalBoardgameDL.g:2326:2: rule__InARow__Group__6__Impl rule__InARow__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__InARow__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InARow__Group__7();

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
    // $ANTLR end "rule__InARow__Group__6"


    // $ANTLR start "rule__InARow__Group__6__Impl"
    // InternalBoardgameDL.g:2333:1: rule__InARow__Group__6__Impl : ( ( rule__InARow__CountAssignment_6 ) ) ;
    public final void rule__InARow__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2337:1: ( ( ( rule__InARow__CountAssignment_6 ) ) )
            // InternalBoardgameDL.g:2338:1: ( ( rule__InARow__CountAssignment_6 ) )
            {
            // InternalBoardgameDL.g:2338:1: ( ( rule__InARow__CountAssignment_6 ) )
            // InternalBoardgameDL.g:2339:2: ( rule__InARow__CountAssignment_6 )
            {
             before(grammarAccess.getInARowAccess().getCountAssignment_6()); 
            // InternalBoardgameDL.g:2340:2: ( rule__InARow__CountAssignment_6 )
            // InternalBoardgameDL.g:2340:3: rule__InARow__CountAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__InARow__CountAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getInARowAccess().getCountAssignment_6()); 

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
    // $ANTLR end "rule__InARow__Group__6__Impl"


    // $ANTLR start "rule__InARow__Group__7"
    // InternalBoardgameDL.g:2348:1: rule__InARow__Group__7 : rule__InARow__Group__7__Impl ;
    public final void rule__InARow__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2352:1: ( rule__InARow__Group__7__Impl )
            // InternalBoardgameDL.g:2353:2: rule__InARow__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InARow__Group__7__Impl();

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
    // $ANTLR end "rule__InARow__Group__7"


    // $ANTLR start "rule__InARow__Group__7__Impl"
    // InternalBoardgameDL.g:2359:1: rule__InARow__Group__7__Impl : ( '}' ) ;
    public final void rule__InARow__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2363:1: ( ( '}' ) )
            // InternalBoardgameDL.g:2364:1: ( '}' )
            {
            // InternalBoardgameDL.g:2364:1: ( '}' )
            // InternalBoardgameDL.g:2365:2: '}'
            {
             before(grammarAccess.getInARowAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getInARowAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__InARow__Group__7__Impl"


    // $ANTLR start "rule__BoardGame__PiecetypesAssignment_0"
    // InternalBoardgameDL.g:2375:1: rule__BoardGame__PiecetypesAssignment_0 : ( rulePieceType ) ;
    public final void rule__BoardGame__PiecetypesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2379:1: ( ( rulePieceType ) )
            // InternalBoardgameDL.g:2380:2: ( rulePieceType )
            {
            // InternalBoardgameDL.g:2380:2: ( rulePieceType )
            // InternalBoardgameDL.g:2381:3: rulePieceType
            {
             before(grammarAccess.getBoardGameAccess().getPiecetypesPieceTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePieceType();

            state._fsp--;

             after(grammarAccess.getBoardGameAccess().getPiecetypesPieceTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__BoardGame__PiecetypesAssignment_0"


    // $ANTLR start "rule__BoardGame__CellstateAssignment_1"
    // InternalBoardgameDL.g:2390:1: rule__BoardGame__CellstateAssignment_1 : ( ruleCellState ) ;
    public final void rule__BoardGame__CellstateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2394:1: ( ( ruleCellState ) )
            // InternalBoardgameDL.g:2395:2: ( ruleCellState )
            {
            // InternalBoardgameDL.g:2395:2: ( ruleCellState )
            // InternalBoardgameDL.g:2396:3: ruleCellState
            {
             before(grammarAccess.getBoardGameAccess().getCellstateCellStateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCellState();

            state._fsp--;

             after(grammarAccess.getBoardGameAccess().getCellstateCellStateParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__BoardGame__CellstateAssignment_1"


    // $ANTLR start "rule__BoardGame__WinconditionAssignment_2"
    // InternalBoardgameDL.g:2405:1: rule__BoardGame__WinconditionAssignment_2 : ( ruleWinCondition ) ;
    public final void rule__BoardGame__WinconditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2409:1: ( ( ruleWinCondition ) )
            // InternalBoardgameDL.g:2410:2: ( ruleWinCondition )
            {
            // InternalBoardgameDL.g:2410:2: ( ruleWinCondition )
            // InternalBoardgameDL.g:2411:3: ruleWinCondition
            {
             before(grammarAccess.getBoardGameAccess().getWinconditionWinConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleWinCondition();

            state._fsp--;

             after(grammarAccess.getBoardGameAccess().getWinconditionWinConditionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__BoardGame__WinconditionAssignment_2"


    // $ANTLR start "rule__BoardGame__SizeAssignment_4"
    // InternalBoardgameDL.g:2420:1: rule__BoardGame__SizeAssignment_4 : ( ruleEInt ) ;
    public final void rule__BoardGame__SizeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2424:1: ( ( ruleEInt ) )
            // InternalBoardgameDL.g:2425:2: ( ruleEInt )
            {
            // InternalBoardgameDL.g:2425:2: ( ruleEInt )
            // InternalBoardgameDL.g:2426:3: ruleEInt
            {
             before(grammarAccess.getBoardGameAccess().getSizeEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getBoardGameAccess().getSizeEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__BoardGame__SizeAssignment_4"


    // $ANTLR start "rule__PieceType__NameAssignment_1"
    // InternalBoardgameDL.g:2435:1: rule__PieceType__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__PieceType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2439:1: ( ( ruleEString ) )
            // InternalBoardgameDL.g:2440:2: ( ruleEString )
            {
            // InternalBoardgameDL.g:2440:2: ( ruleEString )
            // InternalBoardgameDL.g:2441:3: ruleEString
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
    // InternalBoardgameDL.g:2450:1: rule__PieceType__SymbolAssignment_4 : ( ruleEString ) ;
    public final void rule__PieceType__SymbolAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2454:1: ( ( ruleEString ) )
            // InternalBoardgameDL.g:2455:2: ( ruleEString )
            {
            // InternalBoardgameDL.g:2455:2: ( ruleEString )
            // InternalBoardgameDL.g:2456:3: ruleEString
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


    // $ANTLR start "rule__PieceType__ValidmoveAssignment_7"
    // InternalBoardgameDL.g:2465:1: rule__PieceType__ValidmoveAssignment_7 : ( ruleValidMove ) ;
    public final void rule__PieceType__ValidmoveAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2469:1: ( ( ruleValidMove ) )
            // InternalBoardgameDL.g:2470:2: ( ruleValidMove )
            {
            // InternalBoardgameDL.g:2470:2: ( ruleValidMove )
            // InternalBoardgameDL.g:2471:3: ruleValidMove
            {
             before(grammarAccess.getPieceTypeAccess().getValidmoveValidMoveParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleValidMove();

            state._fsp--;

             after(grammarAccess.getPieceTypeAccess().getValidmoveValidMoveParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__PieceType__ValidmoveAssignment_7"


    // $ANTLR start "rule__PieceType__ValidmoveAssignment_8_1"
    // InternalBoardgameDL.g:2480:1: rule__PieceType__ValidmoveAssignment_8_1 : ( ruleValidMove ) ;
    public final void rule__PieceType__ValidmoveAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2484:1: ( ( ruleValidMove ) )
            // InternalBoardgameDL.g:2485:2: ( ruleValidMove )
            {
            // InternalBoardgameDL.g:2485:2: ( ruleValidMove )
            // InternalBoardgameDL.g:2486:3: ruleValidMove
            {
             before(grammarAccess.getPieceTypeAccess().getValidmoveValidMoveParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValidMove();

            state._fsp--;

             after(grammarAccess.getPieceTypeAccess().getValidmoveValidMoveParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__PieceType__ValidmoveAssignment_8_1"


    // $ANTLR start "rule__PieceType__EffectoncellAssignment_10_2"
    // InternalBoardgameDL.g:2495:1: rule__PieceType__EffectoncellAssignment_10_2 : ( ruleEffectOnCell ) ;
    public final void rule__PieceType__EffectoncellAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2499:1: ( ( ruleEffectOnCell ) )
            // InternalBoardgameDL.g:2500:2: ( ruleEffectOnCell )
            {
            // InternalBoardgameDL.g:2500:2: ( ruleEffectOnCell )
            // InternalBoardgameDL.g:2501:3: ruleEffectOnCell
            {
             before(grammarAccess.getPieceTypeAccess().getEffectoncellEffectOnCellParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectOnCell();

            state._fsp--;

             after(grammarAccess.getPieceTypeAccess().getEffectoncellEffectOnCellParserRuleCall_10_2_0()); 

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
    // $ANTLR end "rule__PieceType__EffectoncellAssignment_10_2"


    // $ANTLR start "rule__PieceType__EffectoncellAssignment_10_3_1"
    // InternalBoardgameDL.g:2510:1: rule__PieceType__EffectoncellAssignment_10_3_1 : ( ruleEffectOnCell ) ;
    public final void rule__PieceType__EffectoncellAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2514:1: ( ( ruleEffectOnCell ) )
            // InternalBoardgameDL.g:2515:2: ( ruleEffectOnCell )
            {
            // InternalBoardgameDL.g:2515:2: ( ruleEffectOnCell )
            // InternalBoardgameDL.g:2516:3: ruleEffectOnCell
            {
             before(grammarAccess.getPieceTypeAccess().getEffectoncellEffectOnCellParserRuleCall_10_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectOnCell();

            state._fsp--;

             after(grammarAccess.getPieceTypeAccess().getEffectoncellEffectOnCellParserRuleCall_10_3_1_0()); 

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
    // $ANTLR end "rule__PieceType__EffectoncellAssignment_10_3_1"


    // $ANTLR start "rule__WinCondition__InarowAssignment_3"
    // InternalBoardgameDL.g:2525:1: rule__WinCondition__InarowAssignment_3 : ( ruleInARow ) ;
    public final void rule__WinCondition__InarowAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2529:1: ( ( ruleInARow ) )
            // InternalBoardgameDL.g:2530:2: ( ruleInARow )
            {
            // InternalBoardgameDL.g:2530:2: ( ruleInARow )
            // InternalBoardgameDL.g:2531:3: ruleInARow
            {
             before(grammarAccess.getWinConditionAccess().getInarowInARowParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInARow();

            state._fsp--;

             after(grammarAccess.getWinConditionAccess().getInarowInARowParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__WinCondition__InarowAssignment_3"


    // $ANTLR start "rule__ValidMove__PlaceAnywhereAssignment_0"
    // InternalBoardgameDL.g:2540:1: rule__ValidMove__PlaceAnywhereAssignment_0 : ( ( 'placeAnywhere' ) ) ;
    public final void rule__ValidMove__PlaceAnywhereAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2544:1: ( ( ( 'placeAnywhere' ) ) )
            // InternalBoardgameDL.g:2545:2: ( ( 'placeAnywhere' ) )
            {
            // InternalBoardgameDL.g:2545:2: ( ( 'placeAnywhere' ) )
            // InternalBoardgameDL.g:2546:3: ( 'placeAnywhere' )
            {
             before(grammarAccess.getValidMoveAccess().getPlaceAnywherePlaceAnywhereKeyword_0_0()); 
            // InternalBoardgameDL.g:2547:3: ( 'placeAnywhere' )
            // InternalBoardgameDL.g:2548:4: 'placeAnywhere'
            {
             before(grammarAccess.getValidMoveAccess().getPlaceAnywherePlaceAnywhereKeyword_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getValidMoveAccess().getPlaceAnywherePlaceAnywhereKeyword_0_0()); 

            }

             after(grammarAccess.getValidMoveAccess().getPlaceAnywherePlaceAnywhereKeyword_0_0()); 

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
    // $ANTLR end "rule__ValidMove__PlaceAnywhereAssignment_0"


    // $ANTLR start "rule__ValidMove__ConditionAssignment_3_2"
    // InternalBoardgameDL.g:2559:1: rule__ValidMove__ConditionAssignment_3_2 : ( ruleCondition ) ;
    public final void rule__ValidMove__ConditionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2563:1: ( ( ruleCondition ) )
            // InternalBoardgameDL.g:2564:2: ( ruleCondition )
            {
            // InternalBoardgameDL.g:2564:2: ( ruleCondition )
            // InternalBoardgameDL.g:2565:3: ruleCondition
            {
             before(grammarAccess.getValidMoveAccess().getConditionConditionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getValidMoveAccess().getConditionConditionParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__ValidMove__ConditionAssignment_3_2"


    // $ANTLR start "rule__ValidMove__ConditionAssignment_3_3_1"
    // InternalBoardgameDL.g:2574:1: rule__ValidMove__ConditionAssignment_3_3_1 : ( ruleCondition ) ;
    public final void rule__ValidMove__ConditionAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2578:1: ( ( ruleCondition ) )
            // InternalBoardgameDL.g:2579:2: ( ruleCondition )
            {
            // InternalBoardgameDL.g:2579:2: ( ruleCondition )
            // InternalBoardgameDL.g:2580:3: ruleCondition
            {
             before(grammarAccess.getValidMoveAccess().getConditionConditionParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getValidMoveAccess().getConditionConditionParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__ValidMove__ConditionAssignment_3_3_1"


    // $ANTLR start "rule__EffectOnCell__XAssignment_3"
    // InternalBoardgameDL.g:2589:1: rule__EffectOnCell__XAssignment_3 : ( ruleEInt ) ;
    public final void rule__EffectOnCell__XAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2593:1: ( ( ruleEInt ) )
            // InternalBoardgameDL.g:2594:2: ( ruleEInt )
            {
            // InternalBoardgameDL.g:2594:2: ( ruleEInt )
            // InternalBoardgameDL.g:2595:3: ruleEInt
            {
             before(grammarAccess.getEffectOnCellAccess().getXEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEffectOnCellAccess().getXEIntParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__EffectOnCell__XAssignment_3"


    // $ANTLR start "rule__EffectOnCell__YAssignment_5"
    // InternalBoardgameDL.g:2604:1: rule__EffectOnCell__YAssignment_5 : ( ruleEInt ) ;
    public final void rule__EffectOnCell__YAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2608:1: ( ( ruleEInt ) )
            // InternalBoardgameDL.g:2609:2: ( ruleEInt )
            {
            // InternalBoardgameDL.g:2609:2: ( ruleEInt )
            // InternalBoardgameDL.g:2610:3: ruleEInt
            {
             before(grammarAccess.getEffectOnCellAccess().getYEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEffectOnCellAccess().getYEIntParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__EffectOnCell__YAssignment_5"


    // $ANTLR start "rule__EffectOnCell__CellstateAssignment_7"
    // InternalBoardgameDL.g:2619:1: rule__EffectOnCell__CellstateAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__EffectOnCell__CellstateAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2623:1: ( ( ( ruleEString ) ) )
            // InternalBoardgameDL.g:2624:2: ( ( ruleEString ) )
            {
            // InternalBoardgameDL.g:2624:2: ( ( ruleEString ) )
            // InternalBoardgameDL.g:2625:3: ( ruleEString )
            {
             before(grammarAccess.getEffectOnCellAccess().getCellstateCellStateCrossReference_7_0()); 
            // InternalBoardgameDL.g:2626:3: ( ruleEString )
            // InternalBoardgameDL.g:2627:4: ruleEString
            {
             before(grammarAccess.getEffectOnCellAccess().getCellstateCellStateEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEffectOnCellAccess().getCellstateCellStateEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getEffectOnCellAccess().getCellstateCellStateCrossReference_7_0()); 

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
    // $ANTLR end "rule__EffectOnCell__CellstateAssignment_7"


    // $ANTLR start "rule__Condition__CellstateAssignment_3_2"
    // InternalBoardgameDL.g:2638:1: rule__Condition__CellstateAssignment_3_2 : ( ( ruleEString ) ) ;
    public final void rule__Condition__CellstateAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2642:1: ( ( ( ruleEString ) ) )
            // InternalBoardgameDL.g:2643:2: ( ( ruleEString ) )
            {
            // InternalBoardgameDL.g:2643:2: ( ( ruleEString ) )
            // InternalBoardgameDL.g:2644:3: ( ruleEString )
            {
             before(grammarAccess.getConditionAccess().getCellstateCellStateCrossReference_3_2_0()); 
            // InternalBoardgameDL.g:2645:3: ( ruleEString )
            // InternalBoardgameDL.g:2646:4: ruleEString
            {
             before(grammarAccess.getConditionAccess().getCellstateCellStateEStringParserRuleCall_3_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getCellstateCellStateEStringParserRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getConditionAccess().getCellstateCellStateCrossReference_3_2_0()); 

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
    // $ANTLR end "rule__Condition__CellstateAssignment_3_2"


    // $ANTLR start "rule__Condition__CellstateAssignment_3_3_1"
    // InternalBoardgameDL.g:2657:1: rule__Condition__CellstateAssignment_3_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Condition__CellstateAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2661:1: ( ( ( ruleEString ) ) )
            // InternalBoardgameDL.g:2662:2: ( ( ruleEString ) )
            {
            // InternalBoardgameDL.g:2662:2: ( ( ruleEString ) )
            // InternalBoardgameDL.g:2663:3: ( ruleEString )
            {
             before(grammarAccess.getConditionAccess().getCellstateCellStateCrossReference_3_3_1_0()); 
            // InternalBoardgameDL.g:2664:3: ( ruleEString )
            // InternalBoardgameDL.g:2665:4: ruleEString
            {
             before(grammarAccess.getConditionAccess().getCellstateCellStateEStringParserRuleCall_3_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getCellstateCellStateEStringParserRuleCall_3_3_1_0_1()); 

            }

             after(grammarAccess.getConditionAccess().getCellstateCellStateCrossReference_3_3_1_0()); 

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
    // $ANTLR end "rule__Condition__CellstateAssignment_3_3_1"


    // $ANTLR start "rule__InARow__DiagonalAssignment_0"
    // InternalBoardgameDL.g:2676:1: rule__InARow__DiagonalAssignment_0 : ( ( 'diagonal' ) ) ;
    public final void rule__InARow__DiagonalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2680:1: ( ( ( 'diagonal' ) ) )
            // InternalBoardgameDL.g:2681:2: ( ( 'diagonal' ) )
            {
            // InternalBoardgameDL.g:2681:2: ( ( 'diagonal' ) )
            // InternalBoardgameDL.g:2682:3: ( 'diagonal' )
            {
             before(grammarAccess.getInARowAccess().getDiagonalDiagonalKeyword_0_0()); 
            // InternalBoardgameDL.g:2683:3: ( 'diagonal' )
            // InternalBoardgameDL.g:2684:4: 'diagonal'
            {
             before(grammarAccess.getInARowAccess().getDiagonalDiagonalKeyword_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getInARowAccess().getDiagonalDiagonalKeyword_0_0()); 

            }

             after(grammarAccess.getInARowAccess().getDiagonalDiagonalKeyword_0_0()); 

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
    // $ANTLR end "rule__InARow__DiagonalAssignment_0"


    // $ANTLR start "rule__InARow__HorizontalAssignment_1"
    // InternalBoardgameDL.g:2695:1: rule__InARow__HorizontalAssignment_1 : ( ( 'horizontal' ) ) ;
    public final void rule__InARow__HorizontalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2699:1: ( ( ( 'horizontal' ) ) )
            // InternalBoardgameDL.g:2700:2: ( ( 'horizontal' ) )
            {
            // InternalBoardgameDL.g:2700:2: ( ( 'horizontal' ) )
            // InternalBoardgameDL.g:2701:3: ( 'horizontal' )
            {
             before(grammarAccess.getInARowAccess().getHorizontalHorizontalKeyword_1_0()); 
            // InternalBoardgameDL.g:2702:3: ( 'horizontal' )
            // InternalBoardgameDL.g:2703:4: 'horizontal'
            {
             before(grammarAccess.getInARowAccess().getHorizontalHorizontalKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getInARowAccess().getHorizontalHorizontalKeyword_1_0()); 

            }

             after(grammarAccess.getInARowAccess().getHorizontalHorizontalKeyword_1_0()); 

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
    // $ANTLR end "rule__InARow__HorizontalAssignment_1"


    // $ANTLR start "rule__InARow__VerticalAssignment_2"
    // InternalBoardgameDL.g:2714:1: rule__InARow__VerticalAssignment_2 : ( ( 'vertical' ) ) ;
    public final void rule__InARow__VerticalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2718:1: ( ( ( 'vertical' ) ) )
            // InternalBoardgameDL.g:2719:2: ( ( 'vertical' ) )
            {
            // InternalBoardgameDL.g:2719:2: ( ( 'vertical' ) )
            // InternalBoardgameDL.g:2720:3: ( 'vertical' )
            {
             before(grammarAccess.getInARowAccess().getVerticalVerticalKeyword_2_0()); 
            // InternalBoardgameDL.g:2721:3: ( 'vertical' )
            // InternalBoardgameDL.g:2722:4: 'vertical'
            {
             before(grammarAccess.getInARowAccess().getVerticalVerticalKeyword_2_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getInARowAccess().getVerticalVerticalKeyword_2_0()); 

            }

             after(grammarAccess.getInARowAccess().getVerticalVerticalKeyword_2_0()); 

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
    // $ANTLR end "rule__InARow__VerticalAssignment_2"


    // $ANTLR start "rule__InARow__CountAssignment_6"
    // InternalBoardgameDL.g:2733:1: rule__InARow__CountAssignment_6 : ( ruleEInt ) ;
    public final void rule__InARow__CountAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2737:1: ( ( ruleEInt ) )
            // InternalBoardgameDL.g:2738:2: ( ruleEInt )
            {
            // InternalBoardgameDL.g:2738:2: ( ruleEInt )
            // InternalBoardgameDL.g:2739:3: ruleEInt
            {
             before(grammarAccess.getInARowAccess().getCountEIntParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getInARowAccess().getCountEIntParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__InARow__CountAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000180800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008010000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000000L});

}