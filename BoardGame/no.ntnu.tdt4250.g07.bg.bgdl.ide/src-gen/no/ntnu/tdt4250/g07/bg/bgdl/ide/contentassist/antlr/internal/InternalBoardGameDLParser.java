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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Title'", "'BoardSize'", "'pieceTypes'", "'['", "']'", "'winConditions'", "','", "'cellStates'", "'PieceType'", "'Symbol'", "'hasValidMovesWhen'", "'hasEffectOnCell'", "'InARow'", "'-'", "'ValidMove'", "'{'", "'}'", "'when'", "'and'", "'effect'", "'->'", "'('", "'relativePosition'", "')'", "'newCellState'", "'cellstate'", "'count'", "'placeAnywhere'", "'horizontal'", "'vertical'", "'diagonal'"
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


    // $ANTLR start "entryRulePieceType"
    // InternalBoardGameDL.g:78:1: entryRulePieceType : rulePieceType EOF ;
    public final void entryRulePieceType() throws RecognitionException {
        try {
            // InternalBoardGameDL.g:79:1: ( rulePieceType EOF )
            // InternalBoardGameDL.g:80:1: rulePieceType EOF
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
    // InternalBoardGameDL.g:87:1: rulePieceType : ( ( rule__PieceType__Group__0 ) ) ;
    public final void rulePieceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:91:2: ( ( ( rule__PieceType__Group__0 ) ) )
            // InternalBoardGameDL.g:92:2: ( ( rule__PieceType__Group__0 ) )
            {
            // InternalBoardGameDL.g:92:2: ( ( rule__PieceType__Group__0 ) )
            // InternalBoardGameDL.g:93:3: ( rule__PieceType__Group__0 )
            {
             before(grammarAccess.getPieceTypeAccess().getGroup()); 
            // InternalBoardGameDL.g:94:3: ( rule__PieceType__Group__0 )
            // InternalBoardGameDL.g:94:4: rule__PieceType__Group__0
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
    // InternalBoardGameDL.g:103:1: entryRuleCellState : ruleCellState EOF ;
    public final void entryRuleCellState() throws RecognitionException {
        try {
            // InternalBoardGameDL.g:104:1: ( ruleCellState EOF )
            // InternalBoardGameDL.g:105:1: ruleCellState EOF
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
    // InternalBoardGameDL.g:112:1: ruleCellState : ( ( rule__CellState__NameAssignment ) ) ;
    public final void ruleCellState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:116:2: ( ( ( rule__CellState__NameAssignment ) ) )
            // InternalBoardGameDL.g:117:2: ( ( rule__CellState__NameAssignment ) )
            {
            // InternalBoardGameDL.g:117:2: ( ( rule__CellState__NameAssignment ) )
            // InternalBoardGameDL.g:118:3: ( rule__CellState__NameAssignment )
            {
             before(grammarAccess.getCellStateAccess().getNameAssignment()); 
            // InternalBoardGameDL.g:119:3: ( rule__CellState__NameAssignment )
            // InternalBoardGameDL.g:119:4: rule__CellState__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__CellState__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCellStateAccess().getNameAssignment()); 

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
    // InternalBoardGameDL.g:128:1: entryRuleWinCondition : ruleWinCondition EOF ;
    public final void entryRuleWinCondition() throws RecognitionException {
        try {
            // InternalBoardGameDL.g:129:1: ( ruleWinCondition EOF )
            // InternalBoardGameDL.g:130:1: ruleWinCondition EOF
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
    // InternalBoardGameDL.g:137:1: ruleWinCondition : ( ( rule__WinCondition__Group__0 ) ) ;
    public final void ruleWinCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:141:2: ( ( ( rule__WinCondition__Group__0 ) ) )
            // InternalBoardGameDL.g:142:2: ( ( rule__WinCondition__Group__0 ) )
            {
            // InternalBoardGameDL.g:142:2: ( ( rule__WinCondition__Group__0 ) )
            // InternalBoardGameDL.g:143:3: ( rule__WinCondition__Group__0 )
            {
             before(grammarAccess.getWinConditionAccess().getGroup()); 
            // InternalBoardGameDL.g:144:3: ( rule__WinCondition__Group__0 )
            // InternalBoardGameDL.g:144:4: rule__WinCondition__Group__0
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
    // InternalBoardGameDL.g:153:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalBoardGameDL.g:154:1: ( ruleEInt EOF )
            // InternalBoardGameDL.g:155:1: ruleEInt EOF
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
    // InternalBoardGameDL.g:162:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:166:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalBoardGameDL.g:167:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalBoardGameDL.g:167:2: ( ( rule__EInt__Group__0 ) )
            // InternalBoardGameDL.g:168:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalBoardGameDL.g:169:3: ( rule__EInt__Group__0 )
            // InternalBoardGameDL.g:169:4: rule__EInt__Group__0
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
    // InternalBoardGameDL.g:178:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalBoardGameDL.g:179:1: ( ruleEString EOF )
            // InternalBoardGameDL.g:180:1: ruleEString EOF
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
    // InternalBoardGameDL.g:187:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:191:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalBoardGameDL.g:192:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalBoardGameDL.g:192:2: ( ( rule__EString__Alternatives ) )
            // InternalBoardGameDL.g:193:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalBoardGameDL.g:194:3: ( rule__EString__Alternatives )
            // InternalBoardGameDL.g:194:4: rule__EString__Alternatives
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
    // InternalBoardGameDL.g:203:1: entryRuleValidMove : ruleValidMove EOF ;
    public final void entryRuleValidMove() throws RecognitionException {
        try {
            // InternalBoardGameDL.g:204:1: ( ruleValidMove EOF )
            // InternalBoardGameDL.g:205:1: ruleValidMove EOF
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
    // InternalBoardGameDL.g:212:1: ruleValidMove : ( ( rule__ValidMove__Group__0 ) ) ;
    public final void ruleValidMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:216:2: ( ( ( rule__ValidMove__Group__0 ) ) )
            // InternalBoardGameDL.g:217:2: ( ( rule__ValidMove__Group__0 ) )
            {
            // InternalBoardGameDL.g:217:2: ( ( rule__ValidMove__Group__0 ) )
            // InternalBoardGameDL.g:218:3: ( rule__ValidMove__Group__0 )
            {
             before(grammarAccess.getValidMoveAccess().getGroup()); 
            // InternalBoardGameDL.g:219:3: ( rule__ValidMove__Group__0 )
            // InternalBoardGameDL.g:219:4: rule__ValidMove__Group__0
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
    // InternalBoardGameDL.g:228:1: entryRuleEffectOnCell : ruleEffectOnCell EOF ;
    public final void entryRuleEffectOnCell() throws RecognitionException {
        try {
            // InternalBoardGameDL.g:229:1: ( ruleEffectOnCell EOF )
            // InternalBoardGameDL.g:230:1: ruleEffectOnCell EOF
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
    // InternalBoardGameDL.g:237:1: ruleEffectOnCell : ( ( rule__EffectOnCell__Group__0 ) ) ;
    public final void ruleEffectOnCell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:241:2: ( ( ( rule__EffectOnCell__Group__0 ) ) )
            // InternalBoardGameDL.g:242:2: ( ( rule__EffectOnCell__Group__0 ) )
            {
            // InternalBoardGameDL.g:242:2: ( ( rule__EffectOnCell__Group__0 ) )
            // InternalBoardGameDL.g:243:3: ( rule__EffectOnCell__Group__0 )
            {
             before(grammarAccess.getEffectOnCellAccess().getGroup()); 
            // InternalBoardGameDL.g:244:3: ( rule__EffectOnCell__Group__0 )
            // InternalBoardGameDL.g:244:4: rule__EffectOnCell__Group__0
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
    // InternalBoardGameDL.g:253:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalBoardGameDL.g:254:1: ( ruleCondition EOF )
            // InternalBoardGameDL.g:255:1: ruleCondition EOF
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
    // InternalBoardGameDL.g:262:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:266:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalBoardGameDL.g:267:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalBoardGameDL.g:267:2: ( ( rule__Condition__Group__0 ) )
            // InternalBoardGameDL.g:268:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalBoardGameDL.g:269:3: ( rule__Condition__Group__0 )
            // InternalBoardGameDL.g:269:4: rule__Condition__Group__0
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


    // $ANTLR start "entryRuleInARow"
    // InternalBoardGameDL.g:278:1: entryRuleInARow : ruleInARow EOF ;
    public final void entryRuleInARow() throws RecognitionException {
        try {
            // InternalBoardGameDL.g:279:1: ( ruleInARow EOF )
            // InternalBoardGameDL.g:280:1: ruleInARow EOF
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
    // InternalBoardGameDL.g:287:1: ruleInARow : ( ( rule__InARow__Group__0 ) ) ;
    public final void ruleInARow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:291:2: ( ( ( rule__InARow__Group__0 ) ) )
            // InternalBoardGameDL.g:292:2: ( ( rule__InARow__Group__0 ) )
            {
            // InternalBoardGameDL.g:292:2: ( ( rule__InARow__Group__0 ) )
            // InternalBoardGameDL.g:293:3: ( rule__InARow__Group__0 )
            {
             before(grammarAccess.getInARowAccess().getGroup()); 
            // InternalBoardGameDL.g:294:3: ( rule__InARow__Group__0 )
            // InternalBoardGameDL.g:294:4: rule__InARow__Group__0
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
    // InternalBoardGameDL.g:302:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:306:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalBoardGameDL.g:307:2: ( RULE_STRING )
                    {
                    // InternalBoardGameDL.g:307:2: ( RULE_STRING )
                    // InternalBoardGameDL.g:308:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBoardGameDL.g:313:2: ( RULE_ID )
                    {
                    // InternalBoardGameDL.g:313:2: ( RULE_ID )
                    // InternalBoardGameDL.g:314:3: RULE_ID
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
    // InternalBoardGameDL.g:323:1: rule__BoardGame__Group__0 : rule__BoardGame__Group__0__Impl rule__BoardGame__Group__1 ;
    public final void rule__BoardGame__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:327:1: ( rule__BoardGame__Group__0__Impl rule__BoardGame__Group__1 )
            // InternalBoardGameDL.g:328:2: rule__BoardGame__Group__0__Impl rule__BoardGame__Group__1
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
    // InternalBoardGameDL.g:335:1: rule__BoardGame__Group__0__Impl : ( 'Title' ) ;
    public final void rule__BoardGame__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:339:1: ( ( 'Title' ) )
            // InternalBoardGameDL.g:340:1: ( 'Title' )
            {
            // InternalBoardGameDL.g:340:1: ( 'Title' )
            // InternalBoardGameDL.g:341:2: 'Title'
            {
             before(grammarAccess.getBoardGameAccess().getTitleKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalBoardGameDL.g:350:1: rule__BoardGame__Group__1 : rule__BoardGame__Group__1__Impl rule__BoardGame__Group__2 ;
    public final void rule__BoardGame__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:354:1: ( rule__BoardGame__Group__1__Impl rule__BoardGame__Group__2 )
            // InternalBoardGameDL.g:355:2: rule__BoardGame__Group__1__Impl rule__BoardGame__Group__2
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
    // InternalBoardGameDL.g:362:1: rule__BoardGame__Group__1__Impl : ( ( rule__BoardGame__NameAssignment_1 ) ) ;
    public final void rule__BoardGame__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:366:1: ( ( ( rule__BoardGame__NameAssignment_1 ) ) )
            // InternalBoardGameDL.g:367:1: ( ( rule__BoardGame__NameAssignment_1 ) )
            {
            // InternalBoardGameDL.g:367:1: ( ( rule__BoardGame__NameAssignment_1 ) )
            // InternalBoardGameDL.g:368:2: ( rule__BoardGame__NameAssignment_1 )
            {
             before(grammarAccess.getBoardGameAccess().getNameAssignment_1()); 
            // InternalBoardGameDL.g:369:2: ( rule__BoardGame__NameAssignment_1 )
            // InternalBoardGameDL.g:369:3: rule__BoardGame__NameAssignment_1
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
    // InternalBoardGameDL.g:377:1: rule__BoardGame__Group__2 : rule__BoardGame__Group__2__Impl rule__BoardGame__Group__3 ;
    public final void rule__BoardGame__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:381:1: ( rule__BoardGame__Group__2__Impl rule__BoardGame__Group__3 )
            // InternalBoardGameDL.g:382:2: rule__BoardGame__Group__2__Impl rule__BoardGame__Group__3
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
    // InternalBoardGameDL.g:389:1: rule__BoardGame__Group__2__Impl : ( 'BoardSize' ) ;
    public final void rule__BoardGame__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:393:1: ( ( 'BoardSize' ) )
            // InternalBoardGameDL.g:394:1: ( 'BoardSize' )
            {
            // InternalBoardGameDL.g:394:1: ( 'BoardSize' )
            // InternalBoardGameDL.g:395:2: 'BoardSize'
            {
             before(grammarAccess.getBoardGameAccess().getBoardSizeKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalBoardGameDL.g:404:1: rule__BoardGame__Group__3 : rule__BoardGame__Group__3__Impl rule__BoardGame__Group__4 ;
    public final void rule__BoardGame__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:408:1: ( rule__BoardGame__Group__3__Impl rule__BoardGame__Group__4 )
            // InternalBoardGameDL.g:409:2: rule__BoardGame__Group__3__Impl rule__BoardGame__Group__4
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
    // InternalBoardGameDL.g:416:1: rule__BoardGame__Group__3__Impl : ( ( rule__BoardGame__SizeAssignment_3 ) ) ;
    public final void rule__BoardGame__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:420:1: ( ( ( rule__BoardGame__SizeAssignment_3 ) ) )
            // InternalBoardGameDL.g:421:1: ( ( rule__BoardGame__SizeAssignment_3 ) )
            {
            // InternalBoardGameDL.g:421:1: ( ( rule__BoardGame__SizeAssignment_3 ) )
            // InternalBoardGameDL.g:422:2: ( rule__BoardGame__SizeAssignment_3 )
            {
             before(grammarAccess.getBoardGameAccess().getSizeAssignment_3()); 
            // InternalBoardGameDL.g:423:2: ( rule__BoardGame__SizeAssignment_3 )
            // InternalBoardGameDL.g:423:3: rule__BoardGame__SizeAssignment_3
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
    // InternalBoardGameDL.g:431:1: rule__BoardGame__Group__4 : rule__BoardGame__Group__4__Impl rule__BoardGame__Group__5 ;
    public final void rule__BoardGame__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:435:1: ( rule__BoardGame__Group__4__Impl rule__BoardGame__Group__5 )
            // InternalBoardGameDL.g:436:2: rule__BoardGame__Group__4__Impl rule__BoardGame__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__BoardGame__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoardGame__Group__5();

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
    // InternalBoardGameDL.g:443:1: rule__BoardGame__Group__4__Impl : ( 'pieceTypes' ) ;
    public final void rule__BoardGame__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:447:1: ( ( 'pieceTypes' ) )
            // InternalBoardGameDL.g:448:1: ( 'pieceTypes' )
            {
            // InternalBoardGameDL.g:448:1: ( 'pieceTypes' )
            // InternalBoardGameDL.g:449:2: 'pieceTypes'
            {
             before(grammarAccess.getBoardGameAccess().getPieceTypesKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getBoardGameAccess().getPieceTypesKeyword_4()); 

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


    // $ANTLR start "rule__BoardGame__Group__5"
    // InternalBoardGameDL.g:458:1: rule__BoardGame__Group__5 : rule__BoardGame__Group__5__Impl rule__BoardGame__Group__6 ;
    public final void rule__BoardGame__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:462:1: ( rule__BoardGame__Group__5__Impl rule__BoardGame__Group__6 )
            // InternalBoardGameDL.g:463:2: rule__BoardGame__Group__5__Impl rule__BoardGame__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__BoardGame__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoardGame__Group__6();

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
    // $ANTLR end "rule__BoardGame__Group__5"


    // $ANTLR start "rule__BoardGame__Group__5__Impl"
    // InternalBoardGameDL.g:470:1: rule__BoardGame__Group__5__Impl : ( '[' ) ;
    public final void rule__BoardGame__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:474:1: ( ( '[' ) )
            // InternalBoardGameDL.g:475:1: ( '[' )
            {
            // InternalBoardGameDL.g:475:1: ( '[' )
            // InternalBoardGameDL.g:476:2: '['
            {
             before(grammarAccess.getBoardGameAccess().getLeftSquareBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBoardGameAccess().getLeftSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__BoardGame__Group__5__Impl"


    // $ANTLR start "rule__BoardGame__Group__6"
    // InternalBoardGameDL.g:485:1: rule__BoardGame__Group__6 : rule__BoardGame__Group__6__Impl rule__BoardGame__Group__7 ;
    public final void rule__BoardGame__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:489:1: ( rule__BoardGame__Group__6__Impl rule__BoardGame__Group__7 )
            // InternalBoardGameDL.g:490:2: rule__BoardGame__Group__6__Impl rule__BoardGame__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__BoardGame__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoardGame__Group__7();

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
    // $ANTLR end "rule__BoardGame__Group__6"


    // $ANTLR start "rule__BoardGame__Group__6__Impl"
    // InternalBoardGameDL.g:497:1: rule__BoardGame__Group__6__Impl : ( ( rule__BoardGame__PiecetypesAssignment_6 ) ) ;
    public final void rule__BoardGame__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:501:1: ( ( ( rule__BoardGame__PiecetypesAssignment_6 ) ) )
            // InternalBoardGameDL.g:502:1: ( ( rule__BoardGame__PiecetypesAssignment_6 ) )
            {
            // InternalBoardGameDL.g:502:1: ( ( rule__BoardGame__PiecetypesAssignment_6 ) )
            // InternalBoardGameDL.g:503:2: ( rule__BoardGame__PiecetypesAssignment_6 )
            {
             before(grammarAccess.getBoardGameAccess().getPiecetypesAssignment_6()); 
            // InternalBoardGameDL.g:504:2: ( rule__BoardGame__PiecetypesAssignment_6 )
            // InternalBoardGameDL.g:504:3: rule__BoardGame__PiecetypesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__BoardGame__PiecetypesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getBoardGameAccess().getPiecetypesAssignment_6()); 

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
    // $ANTLR end "rule__BoardGame__Group__6__Impl"


    // $ANTLR start "rule__BoardGame__Group__7"
    // InternalBoardGameDL.g:512:1: rule__BoardGame__Group__7 : rule__BoardGame__Group__7__Impl rule__BoardGame__Group__8 ;
    public final void rule__BoardGame__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:516:1: ( rule__BoardGame__Group__7__Impl rule__BoardGame__Group__8 )
            // InternalBoardGameDL.g:517:2: rule__BoardGame__Group__7__Impl rule__BoardGame__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__BoardGame__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoardGame__Group__8();

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
    // $ANTLR end "rule__BoardGame__Group__7"


    // $ANTLR start "rule__BoardGame__Group__7__Impl"
    // InternalBoardGameDL.g:524:1: rule__BoardGame__Group__7__Impl : ( ( rule__BoardGame__Group_7__0 )* ) ;
    public final void rule__BoardGame__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:528:1: ( ( ( rule__BoardGame__Group_7__0 )* ) )
            // InternalBoardGameDL.g:529:1: ( ( rule__BoardGame__Group_7__0 )* )
            {
            // InternalBoardGameDL.g:529:1: ( ( rule__BoardGame__Group_7__0 )* )
            // InternalBoardGameDL.g:530:2: ( rule__BoardGame__Group_7__0 )*
            {
             before(grammarAccess.getBoardGameAccess().getGroup_7()); 
            // InternalBoardGameDL.g:531:2: ( rule__BoardGame__Group_7__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBoardGameDL.g:531:3: rule__BoardGame__Group_7__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__BoardGame__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getBoardGameAccess().getGroup_7()); 

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
    // $ANTLR end "rule__BoardGame__Group__7__Impl"


    // $ANTLR start "rule__BoardGame__Group__8"
    // InternalBoardGameDL.g:539:1: rule__BoardGame__Group__8 : rule__BoardGame__Group__8__Impl rule__BoardGame__Group__9 ;
    public final void rule__BoardGame__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:543:1: ( rule__BoardGame__Group__8__Impl rule__BoardGame__Group__9 )
            // InternalBoardGameDL.g:544:2: rule__BoardGame__Group__8__Impl rule__BoardGame__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__BoardGame__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoardGame__Group__9();

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
    // $ANTLR end "rule__BoardGame__Group__8"


    // $ANTLR start "rule__BoardGame__Group__8__Impl"
    // InternalBoardGameDL.g:551:1: rule__BoardGame__Group__8__Impl : ( ']' ) ;
    public final void rule__BoardGame__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:555:1: ( ( ']' ) )
            // InternalBoardGameDL.g:556:1: ( ']' )
            {
            // InternalBoardGameDL.g:556:1: ( ']' )
            // InternalBoardGameDL.g:557:2: ']'
            {
             before(grammarAccess.getBoardGameAccess().getRightSquareBracketKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getBoardGameAccess().getRightSquareBracketKeyword_8()); 

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
    // $ANTLR end "rule__BoardGame__Group__8__Impl"


    // $ANTLR start "rule__BoardGame__Group__9"
    // InternalBoardGameDL.g:566:1: rule__BoardGame__Group__9 : rule__BoardGame__Group__9__Impl rule__BoardGame__Group__10 ;
    public final void rule__BoardGame__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:570:1: ( rule__BoardGame__Group__9__Impl rule__BoardGame__Group__10 )
            // InternalBoardGameDL.g:571:2: rule__BoardGame__Group__9__Impl rule__BoardGame__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__BoardGame__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoardGame__Group__10();

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
    // $ANTLR end "rule__BoardGame__Group__9"


    // $ANTLR start "rule__BoardGame__Group__9__Impl"
    // InternalBoardGameDL.g:578:1: rule__BoardGame__Group__9__Impl : ( ( rule__BoardGame__Group_9__0 )? ) ;
    public final void rule__BoardGame__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:582:1: ( ( ( rule__BoardGame__Group_9__0 )? ) )
            // InternalBoardGameDL.g:583:1: ( ( rule__BoardGame__Group_9__0 )? )
            {
            // InternalBoardGameDL.g:583:1: ( ( rule__BoardGame__Group_9__0 )? )
            // InternalBoardGameDL.g:584:2: ( rule__BoardGame__Group_9__0 )?
            {
             before(grammarAccess.getBoardGameAccess().getGroup_9()); 
            // InternalBoardGameDL.g:585:2: ( rule__BoardGame__Group_9__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalBoardGameDL.g:585:3: rule__BoardGame__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BoardGame__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoardGameAccess().getGroup_9()); 

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
    // $ANTLR end "rule__BoardGame__Group__9__Impl"


    // $ANTLR start "rule__BoardGame__Group__10"
    // InternalBoardGameDL.g:593:1: rule__BoardGame__Group__10 : rule__BoardGame__Group__10__Impl rule__BoardGame__Group__11 ;
    public final void rule__BoardGame__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:597:1: ( rule__BoardGame__Group__10__Impl rule__BoardGame__Group__11 )
            // InternalBoardGameDL.g:598:2: rule__BoardGame__Group__10__Impl rule__BoardGame__Group__11
            {
            pushFollow(FOLLOW_7);
            rule__BoardGame__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoardGame__Group__11();

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
    // $ANTLR end "rule__BoardGame__Group__10"


    // $ANTLR start "rule__BoardGame__Group__10__Impl"
    // InternalBoardGameDL.g:605:1: rule__BoardGame__Group__10__Impl : ( 'winConditions' ) ;
    public final void rule__BoardGame__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:609:1: ( ( 'winConditions' ) )
            // InternalBoardGameDL.g:610:1: ( 'winConditions' )
            {
            // InternalBoardGameDL.g:610:1: ( 'winConditions' )
            // InternalBoardGameDL.g:611:2: 'winConditions'
            {
             before(grammarAccess.getBoardGameAccess().getWinConditionsKeyword_10()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBoardGameAccess().getWinConditionsKeyword_10()); 

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
    // $ANTLR end "rule__BoardGame__Group__10__Impl"


    // $ANTLR start "rule__BoardGame__Group__11"
    // InternalBoardGameDL.g:620:1: rule__BoardGame__Group__11 : rule__BoardGame__Group__11__Impl rule__BoardGame__Group__12 ;
    public final void rule__BoardGame__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:624:1: ( rule__BoardGame__Group__11__Impl rule__BoardGame__Group__12 )
            // InternalBoardGameDL.g:625:2: rule__BoardGame__Group__11__Impl rule__BoardGame__Group__12
            {
            pushFollow(FOLLOW_12);
            rule__BoardGame__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoardGame__Group__12();

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
    // $ANTLR end "rule__BoardGame__Group__11"


    // $ANTLR start "rule__BoardGame__Group__11__Impl"
    // InternalBoardGameDL.g:632:1: rule__BoardGame__Group__11__Impl : ( '[' ) ;
    public final void rule__BoardGame__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:636:1: ( ( '[' ) )
            // InternalBoardGameDL.g:637:1: ( '[' )
            {
            // InternalBoardGameDL.g:637:1: ( '[' )
            // InternalBoardGameDL.g:638:2: '['
            {
             before(grammarAccess.getBoardGameAccess().getLeftSquareBracketKeyword_11()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBoardGameAccess().getLeftSquareBracketKeyword_11()); 

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
    // $ANTLR end "rule__BoardGame__Group__11__Impl"


    // $ANTLR start "rule__BoardGame__Group__12"
    // InternalBoardGameDL.g:647:1: rule__BoardGame__Group__12 : rule__BoardGame__Group__12__Impl rule__BoardGame__Group__13 ;
    public final void rule__BoardGame__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:651:1: ( rule__BoardGame__Group__12__Impl rule__BoardGame__Group__13 )
            // InternalBoardGameDL.g:652:2: rule__BoardGame__Group__12__Impl rule__BoardGame__Group__13
            {
            pushFollow(FOLLOW_9);
            rule__BoardGame__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoardGame__Group__13();

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
    // $ANTLR end "rule__BoardGame__Group__12"


    // $ANTLR start "rule__BoardGame__Group__12__Impl"
    // InternalBoardGameDL.g:659:1: rule__BoardGame__Group__12__Impl : ( ( rule__BoardGame__WinConditionsAssignment_12 ) ) ;
    public final void rule__BoardGame__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:663:1: ( ( ( rule__BoardGame__WinConditionsAssignment_12 ) ) )
            // InternalBoardGameDL.g:664:1: ( ( rule__BoardGame__WinConditionsAssignment_12 ) )
            {
            // InternalBoardGameDL.g:664:1: ( ( rule__BoardGame__WinConditionsAssignment_12 ) )
            // InternalBoardGameDL.g:665:2: ( rule__BoardGame__WinConditionsAssignment_12 )
            {
             before(grammarAccess.getBoardGameAccess().getWinConditionsAssignment_12()); 
            // InternalBoardGameDL.g:666:2: ( rule__BoardGame__WinConditionsAssignment_12 )
            // InternalBoardGameDL.g:666:3: rule__BoardGame__WinConditionsAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__BoardGame__WinConditionsAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getBoardGameAccess().getWinConditionsAssignment_12()); 

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
    // $ANTLR end "rule__BoardGame__Group__12__Impl"


    // $ANTLR start "rule__BoardGame__Group__13"
    // InternalBoardGameDL.g:674:1: rule__BoardGame__Group__13 : rule__BoardGame__Group__13__Impl rule__BoardGame__Group__14 ;
    public final void rule__BoardGame__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:678:1: ( rule__BoardGame__Group__13__Impl rule__BoardGame__Group__14 )
            // InternalBoardGameDL.g:679:2: rule__BoardGame__Group__13__Impl rule__BoardGame__Group__14
            {
            pushFollow(FOLLOW_9);
            rule__BoardGame__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoardGame__Group__14();

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
    // $ANTLR end "rule__BoardGame__Group__13"


    // $ANTLR start "rule__BoardGame__Group__13__Impl"
    // InternalBoardGameDL.g:686:1: rule__BoardGame__Group__13__Impl : ( ( rule__BoardGame__Group_13__0 )* ) ;
    public final void rule__BoardGame__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:690:1: ( ( ( rule__BoardGame__Group_13__0 )* ) )
            // InternalBoardGameDL.g:691:1: ( ( rule__BoardGame__Group_13__0 )* )
            {
            // InternalBoardGameDL.g:691:1: ( ( rule__BoardGame__Group_13__0 )* )
            // InternalBoardGameDL.g:692:2: ( rule__BoardGame__Group_13__0 )*
            {
             before(grammarAccess.getBoardGameAccess().getGroup_13()); 
            // InternalBoardGameDL.g:693:2: ( rule__BoardGame__Group_13__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBoardGameDL.g:693:3: rule__BoardGame__Group_13__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__BoardGame__Group_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getBoardGameAccess().getGroup_13()); 

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
    // $ANTLR end "rule__BoardGame__Group__13__Impl"


    // $ANTLR start "rule__BoardGame__Group__14"
    // InternalBoardGameDL.g:701:1: rule__BoardGame__Group__14 : rule__BoardGame__Group__14__Impl ;
    public final void rule__BoardGame__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:705:1: ( rule__BoardGame__Group__14__Impl )
            // InternalBoardGameDL.g:706:2: rule__BoardGame__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoardGame__Group__14__Impl();

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
    // $ANTLR end "rule__BoardGame__Group__14"


    // $ANTLR start "rule__BoardGame__Group__14__Impl"
    // InternalBoardGameDL.g:712:1: rule__BoardGame__Group__14__Impl : ( ']' ) ;
    public final void rule__BoardGame__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:716:1: ( ( ']' ) )
            // InternalBoardGameDL.g:717:1: ( ']' )
            {
            // InternalBoardGameDL.g:717:1: ( ']' )
            // InternalBoardGameDL.g:718:2: ']'
            {
             before(grammarAccess.getBoardGameAccess().getRightSquareBracketKeyword_14()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getBoardGameAccess().getRightSquareBracketKeyword_14()); 

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
    // $ANTLR end "rule__BoardGame__Group__14__Impl"


    // $ANTLR start "rule__BoardGame__Group_7__0"
    // InternalBoardGameDL.g:728:1: rule__BoardGame__Group_7__0 : rule__BoardGame__Group_7__0__Impl rule__BoardGame__Group_7__1 ;
    public final void rule__BoardGame__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:732:1: ( rule__BoardGame__Group_7__0__Impl rule__BoardGame__Group_7__1 )
            // InternalBoardGameDL.g:733:2: rule__BoardGame__Group_7__0__Impl rule__BoardGame__Group_7__1
            {
            pushFollow(FOLLOW_8);
            rule__BoardGame__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoardGame__Group_7__1();

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
    // $ANTLR end "rule__BoardGame__Group_7__0"


    // $ANTLR start "rule__BoardGame__Group_7__0__Impl"
    // InternalBoardGameDL.g:740:1: rule__BoardGame__Group_7__0__Impl : ( ',' ) ;
    public final void rule__BoardGame__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:744:1: ( ( ',' ) )
            // InternalBoardGameDL.g:745:1: ( ',' )
            {
            // InternalBoardGameDL.g:745:1: ( ',' )
            // InternalBoardGameDL.g:746:2: ','
            {
             before(grammarAccess.getBoardGameAccess().getCommaKeyword_7_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBoardGameAccess().getCommaKeyword_7_0()); 

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
    // $ANTLR end "rule__BoardGame__Group_7__0__Impl"


    // $ANTLR start "rule__BoardGame__Group_7__1"
    // InternalBoardGameDL.g:755:1: rule__BoardGame__Group_7__1 : rule__BoardGame__Group_7__1__Impl ;
    public final void rule__BoardGame__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:759:1: ( rule__BoardGame__Group_7__1__Impl )
            // InternalBoardGameDL.g:760:2: rule__BoardGame__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoardGame__Group_7__1__Impl();

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
    // $ANTLR end "rule__BoardGame__Group_7__1"


    // $ANTLR start "rule__BoardGame__Group_7__1__Impl"
    // InternalBoardGameDL.g:766:1: rule__BoardGame__Group_7__1__Impl : ( ( rule__BoardGame__PiecetypesAssignment_7_1 ) ) ;
    public final void rule__BoardGame__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:770:1: ( ( ( rule__BoardGame__PiecetypesAssignment_7_1 ) ) )
            // InternalBoardGameDL.g:771:1: ( ( rule__BoardGame__PiecetypesAssignment_7_1 ) )
            {
            // InternalBoardGameDL.g:771:1: ( ( rule__BoardGame__PiecetypesAssignment_7_1 ) )
            // InternalBoardGameDL.g:772:2: ( rule__BoardGame__PiecetypesAssignment_7_1 )
            {
             before(grammarAccess.getBoardGameAccess().getPiecetypesAssignment_7_1()); 
            // InternalBoardGameDL.g:773:2: ( rule__BoardGame__PiecetypesAssignment_7_1 )
            // InternalBoardGameDL.g:773:3: rule__BoardGame__PiecetypesAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__BoardGame__PiecetypesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getBoardGameAccess().getPiecetypesAssignment_7_1()); 

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
    // $ANTLR end "rule__BoardGame__Group_7__1__Impl"


    // $ANTLR start "rule__BoardGame__Group_9__0"
    // InternalBoardGameDL.g:782:1: rule__BoardGame__Group_9__0 : rule__BoardGame__Group_9__0__Impl rule__BoardGame__Group_9__1 ;
    public final void rule__BoardGame__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:786:1: ( rule__BoardGame__Group_9__0__Impl rule__BoardGame__Group_9__1 )
            // InternalBoardGameDL.g:787:2: rule__BoardGame__Group_9__0__Impl rule__BoardGame__Group_9__1
            {
            pushFollow(FOLLOW_7);
            rule__BoardGame__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoardGame__Group_9__1();

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
    // $ANTLR end "rule__BoardGame__Group_9__0"


    // $ANTLR start "rule__BoardGame__Group_9__0__Impl"
    // InternalBoardGameDL.g:794:1: rule__BoardGame__Group_9__0__Impl : ( 'cellStates' ) ;
    public final void rule__BoardGame__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:798:1: ( ( 'cellStates' ) )
            // InternalBoardGameDL.g:799:1: ( 'cellStates' )
            {
            // InternalBoardGameDL.g:799:1: ( 'cellStates' )
            // InternalBoardGameDL.g:800:2: 'cellStates'
            {
             before(grammarAccess.getBoardGameAccess().getCellStatesKeyword_9_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBoardGameAccess().getCellStatesKeyword_9_0()); 

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
    // $ANTLR end "rule__BoardGame__Group_9__0__Impl"


    // $ANTLR start "rule__BoardGame__Group_9__1"
    // InternalBoardGameDL.g:809:1: rule__BoardGame__Group_9__1 : rule__BoardGame__Group_9__1__Impl rule__BoardGame__Group_9__2 ;
    public final void rule__BoardGame__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:813:1: ( rule__BoardGame__Group_9__1__Impl rule__BoardGame__Group_9__2 )
            // InternalBoardGameDL.g:814:2: rule__BoardGame__Group_9__1__Impl rule__BoardGame__Group_9__2
            {
            pushFollow(FOLLOW_13);
            rule__BoardGame__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoardGame__Group_9__2();

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
    // $ANTLR end "rule__BoardGame__Group_9__1"


    // $ANTLR start "rule__BoardGame__Group_9__1__Impl"
    // InternalBoardGameDL.g:821:1: rule__BoardGame__Group_9__1__Impl : ( '[' ) ;
    public final void rule__BoardGame__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:825:1: ( ( '[' ) )
            // InternalBoardGameDL.g:826:1: ( '[' )
            {
            // InternalBoardGameDL.g:826:1: ( '[' )
            // InternalBoardGameDL.g:827:2: '['
            {
             before(grammarAccess.getBoardGameAccess().getLeftSquareBracketKeyword_9_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBoardGameAccess().getLeftSquareBracketKeyword_9_1()); 

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
    // $ANTLR end "rule__BoardGame__Group_9__1__Impl"


    // $ANTLR start "rule__BoardGame__Group_9__2"
    // InternalBoardGameDL.g:836:1: rule__BoardGame__Group_9__2 : rule__BoardGame__Group_9__2__Impl rule__BoardGame__Group_9__3 ;
    public final void rule__BoardGame__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:840:1: ( rule__BoardGame__Group_9__2__Impl rule__BoardGame__Group_9__3 )
            // InternalBoardGameDL.g:841:2: rule__BoardGame__Group_9__2__Impl rule__BoardGame__Group_9__3
            {
            pushFollow(FOLLOW_9);
            rule__BoardGame__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoardGame__Group_9__3();

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
    // $ANTLR end "rule__BoardGame__Group_9__2"


    // $ANTLR start "rule__BoardGame__Group_9__2__Impl"
    // InternalBoardGameDL.g:848:1: rule__BoardGame__Group_9__2__Impl : ( ( rule__BoardGame__CellstatesAssignment_9_2 ) ) ;
    public final void rule__BoardGame__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:852:1: ( ( ( rule__BoardGame__CellstatesAssignment_9_2 ) ) )
            // InternalBoardGameDL.g:853:1: ( ( rule__BoardGame__CellstatesAssignment_9_2 ) )
            {
            // InternalBoardGameDL.g:853:1: ( ( rule__BoardGame__CellstatesAssignment_9_2 ) )
            // InternalBoardGameDL.g:854:2: ( rule__BoardGame__CellstatesAssignment_9_2 )
            {
             before(grammarAccess.getBoardGameAccess().getCellstatesAssignment_9_2()); 
            // InternalBoardGameDL.g:855:2: ( rule__BoardGame__CellstatesAssignment_9_2 )
            // InternalBoardGameDL.g:855:3: rule__BoardGame__CellstatesAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__BoardGame__CellstatesAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getBoardGameAccess().getCellstatesAssignment_9_2()); 

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
    // $ANTLR end "rule__BoardGame__Group_9__2__Impl"


    // $ANTLR start "rule__BoardGame__Group_9__3"
    // InternalBoardGameDL.g:863:1: rule__BoardGame__Group_9__3 : rule__BoardGame__Group_9__3__Impl rule__BoardGame__Group_9__4 ;
    public final void rule__BoardGame__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:867:1: ( rule__BoardGame__Group_9__3__Impl rule__BoardGame__Group_9__4 )
            // InternalBoardGameDL.g:868:2: rule__BoardGame__Group_9__3__Impl rule__BoardGame__Group_9__4
            {
            pushFollow(FOLLOW_9);
            rule__BoardGame__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoardGame__Group_9__4();

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
    // $ANTLR end "rule__BoardGame__Group_9__3"


    // $ANTLR start "rule__BoardGame__Group_9__3__Impl"
    // InternalBoardGameDL.g:875:1: rule__BoardGame__Group_9__3__Impl : ( ( rule__BoardGame__Group_9_3__0 )* ) ;
    public final void rule__BoardGame__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:879:1: ( ( ( rule__BoardGame__Group_9_3__0 )* ) )
            // InternalBoardGameDL.g:880:1: ( ( rule__BoardGame__Group_9_3__0 )* )
            {
            // InternalBoardGameDL.g:880:1: ( ( rule__BoardGame__Group_9_3__0 )* )
            // InternalBoardGameDL.g:881:2: ( rule__BoardGame__Group_9_3__0 )*
            {
             before(grammarAccess.getBoardGameAccess().getGroup_9_3()); 
            // InternalBoardGameDL.g:882:2: ( rule__BoardGame__Group_9_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBoardGameDL.g:882:3: rule__BoardGame__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__BoardGame__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getBoardGameAccess().getGroup_9_3()); 

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
    // $ANTLR end "rule__BoardGame__Group_9__3__Impl"


    // $ANTLR start "rule__BoardGame__Group_9__4"
    // InternalBoardGameDL.g:890:1: rule__BoardGame__Group_9__4 : rule__BoardGame__Group_9__4__Impl ;
    public final void rule__BoardGame__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:894:1: ( rule__BoardGame__Group_9__4__Impl )
            // InternalBoardGameDL.g:895:2: rule__BoardGame__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoardGame__Group_9__4__Impl();

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
    // $ANTLR end "rule__BoardGame__Group_9__4"


    // $ANTLR start "rule__BoardGame__Group_9__4__Impl"
    // InternalBoardGameDL.g:901:1: rule__BoardGame__Group_9__4__Impl : ( ']' ) ;
    public final void rule__BoardGame__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:905:1: ( ( ']' ) )
            // InternalBoardGameDL.g:906:1: ( ']' )
            {
            // InternalBoardGameDL.g:906:1: ( ']' )
            // InternalBoardGameDL.g:907:2: ']'
            {
             before(grammarAccess.getBoardGameAccess().getRightSquareBracketKeyword_9_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getBoardGameAccess().getRightSquareBracketKeyword_9_4()); 

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
    // $ANTLR end "rule__BoardGame__Group_9__4__Impl"


    // $ANTLR start "rule__BoardGame__Group_9_3__0"
    // InternalBoardGameDL.g:917:1: rule__BoardGame__Group_9_3__0 : rule__BoardGame__Group_9_3__0__Impl rule__BoardGame__Group_9_3__1 ;
    public final void rule__BoardGame__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:921:1: ( rule__BoardGame__Group_9_3__0__Impl rule__BoardGame__Group_9_3__1 )
            // InternalBoardGameDL.g:922:2: rule__BoardGame__Group_9_3__0__Impl rule__BoardGame__Group_9_3__1
            {
            pushFollow(FOLLOW_13);
            rule__BoardGame__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoardGame__Group_9_3__1();

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
    // $ANTLR end "rule__BoardGame__Group_9_3__0"


    // $ANTLR start "rule__BoardGame__Group_9_3__0__Impl"
    // InternalBoardGameDL.g:929:1: rule__BoardGame__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__BoardGame__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:933:1: ( ( ',' ) )
            // InternalBoardGameDL.g:934:1: ( ',' )
            {
            // InternalBoardGameDL.g:934:1: ( ',' )
            // InternalBoardGameDL.g:935:2: ','
            {
             before(grammarAccess.getBoardGameAccess().getCommaKeyword_9_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBoardGameAccess().getCommaKeyword_9_3_0()); 

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
    // $ANTLR end "rule__BoardGame__Group_9_3__0__Impl"


    // $ANTLR start "rule__BoardGame__Group_9_3__1"
    // InternalBoardGameDL.g:944:1: rule__BoardGame__Group_9_3__1 : rule__BoardGame__Group_9_3__1__Impl ;
    public final void rule__BoardGame__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:948:1: ( rule__BoardGame__Group_9_3__1__Impl )
            // InternalBoardGameDL.g:949:2: rule__BoardGame__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoardGame__Group_9_3__1__Impl();

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
    // $ANTLR end "rule__BoardGame__Group_9_3__1"


    // $ANTLR start "rule__BoardGame__Group_9_3__1__Impl"
    // InternalBoardGameDL.g:955:1: rule__BoardGame__Group_9_3__1__Impl : ( ( rule__BoardGame__CellstatesAssignment_9_3_1 ) ) ;
    public final void rule__BoardGame__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:959:1: ( ( ( rule__BoardGame__CellstatesAssignment_9_3_1 ) ) )
            // InternalBoardGameDL.g:960:1: ( ( rule__BoardGame__CellstatesAssignment_9_3_1 ) )
            {
            // InternalBoardGameDL.g:960:1: ( ( rule__BoardGame__CellstatesAssignment_9_3_1 ) )
            // InternalBoardGameDL.g:961:2: ( rule__BoardGame__CellstatesAssignment_9_3_1 )
            {
             before(grammarAccess.getBoardGameAccess().getCellstatesAssignment_9_3_1()); 
            // InternalBoardGameDL.g:962:2: ( rule__BoardGame__CellstatesAssignment_9_3_1 )
            // InternalBoardGameDL.g:962:3: rule__BoardGame__CellstatesAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BoardGame__CellstatesAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBoardGameAccess().getCellstatesAssignment_9_3_1()); 

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
    // $ANTLR end "rule__BoardGame__Group_9_3__1__Impl"


    // $ANTLR start "rule__BoardGame__Group_13__0"
    // InternalBoardGameDL.g:971:1: rule__BoardGame__Group_13__0 : rule__BoardGame__Group_13__0__Impl rule__BoardGame__Group_13__1 ;
    public final void rule__BoardGame__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:975:1: ( rule__BoardGame__Group_13__0__Impl rule__BoardGame__Group_13__1 )
            // InternalBoardGameDL.g:976:2: rule__BoardGame__Group_13__0__Impl rule__BoardGame__Group_13__1
            {
            pushFollow(FOLLOW_12);
            rule__BoardGame__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoardGame__Group_13__1();

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
    // $ANTLR end "rule__BoardGame__Group_13__0"


    // $ANTLR start "rule__BoardGame__Group_13__0__Impl"
    // InternalBoardGameDL.g:983:1: rule__BoardGame__Group_13__0__Impl : ( ',' ) ;
    public final void rule__BoardGame__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:987:1: ( ( ',' ) )
            // InternalBoardGameDL.g:988:1: ( ',' )
            {
            // InternalBoardGameDL.g:988:1: ( ',' )
            // InternalBoardGameDL.g:989:2: ','
            {
             before(grammarAccess.getBoardGameAccess().getCommaKeyword_13_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBoardGameAccess().getCommaKeyword_13_0()); 

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
    // $ANTLR end "rule__BoardGame__Group_13__0__Impl"


    // $ANTLR start "rule__BoardGame__Group_13__1"
    // InternalBoardGameDL.g:998:1: rule__BoardGame__Group_13__1 : rule__BoardGame__Group_13__1__Impl ;
    public final void rule__BoardGame__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1002:1: ( rule__BoardGame__Group_13__1__Impl )
            // InternalBoardGameDL.g:1003:2: rule__BoardGame__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoardGame__Group_13__1__Impl();

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
    // $ANTLR end "rule__BoardGame__Group_13__1"


    // $ANTLR start "rule__BoardGame__Group_13__1__Impl"
    // InternalBoardGameDL.g:1009:1: rule__BoardGame__Group_13__1__Impl : ( ( rule__BoardGame__WinConditionsAssignment_13_1 ) ) ;
    public final void rule__BoardGame__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1013:1: ( ( ( rule__BoardGame__WinConditionsAssignment_13_1 ) ) )
            // InternalBoardGameDL.g:1014:1: ( ( rule__BoardGame__WinConditionsAssignment_13_1 ) )
            {
            // InternalBoardGameDL.g:1014:1: ( ( rule__BoardGame__WinConditionsAssignment_13_1 ) )
            // InternalBoardGameDL.g:1015:2: ( rule__BoardGame__WinConditionsAssignment_13_1 )
            {
             before(grammarAccess.getBoardGameAccess().getWinConditionsAssignment_13_1()); 
            // InternalBoardGameDL.g:1016:2: ( rule__BoardGame__WinConditionsAssignment_13_1 )
            // InternalBoardGameDL.g:1016:3: rule__BoardGame__WinConditionsAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__BoardGame__WinConditionsAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getBoardGameAccess().getWinConditionsAssignment_13_1()); 

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
    // $ANTLR end "rule__BoardGame__Group_13__1__Impl"


    // $ANTLR start "rule__PieceType__Group__0"
    // InternalBoardGameDL.g:1025:1: rule__PieceType__Group__0 : rule__PieceType__Group__0__Impl rule__PieceType__Group__1 ;
    public final void rule__PieceType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1029:1: ( rule__PieceType__Group__0__Impl rule__PieceType__Group__1 )
            // InternalBoardGameDL.g:1030:2: rule__PieceType__Group__0__Impl rule__PieceType__Group__1
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
    // InternalBoardGameDL.g:1037:1: rule__PieceType__Group__0__Impl : ( 'PieceType' ) ;
    public final void rule__PieceType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1041:1: ( ( 'PieceType' ) )
            // InternalBoardGameDL.g:1042:1: ( 'PieceType' )
            {
            // InternalBoardGameDL.g:1042:1: ( 'PieceType' )
            // InternalBoardGameDL.g:1043:2: 'PieceType'
            {
             before(grammarAccess.getPieceTypeAccess().getPieceTypeKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1052:1: rule__PieceType__Group__1 : rule__PieceType__Group__1__Impl rule__PieceType__Group__2 ;
    public final void rule__PieceType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1056:1: ( rule__PieceType__Group__1__Impl rule__PieceType__Group__2 )
            // InternalBoardGameDL.g:1057:2: rule__PieceType__Group__1__Impl rule__PieceType__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalBoardGameDL.g:1064:1: rule__PieceType__Group__1__Impl : ( ( rule__PieceType__NameAssignment_1 ) ) ;
    public final void rule__PieceType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1068:1: ( ( ( rule__PieceType__NameAssignment_1 ) ) )
            // InternalBoardGameDL.g:1069:1: ( ( rule__PieceType__NameAssignment_1 ) )
            {
            // InternalBoardGameDL.g:1069:1: ( ( rule__PieceType__NameAssignment_1 ) )
            // InternalBoardGameDL.g:1070:2: ( rule__PieceType__NameAssignment_1 )
            {
             before(grammarAccess.getPieceTypeAccess().getNameAssignment_1()); 
            // InternalBoardGameDL.g:1071:2: ( rule__PieceType__NameAssignment_1 )
            // InternalBoardGameDL.g:1071:3: rule__PieceType__NameAssignment_1
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
    // InternalBoardGameDL.g:1079:1: rule__PieceType__Group__2 : rule__PieceType__Group__2__Impl rule__PieceType__Group__3 ;
    public final void rule__PieceType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1083:1: ( rule__PieceType__Group__2__Impl rule__PieceType__Group__3 )
            // InternalBoardGameDL.g:1084:2: rule__PieceType__Group__2__Impl rule__PieceType__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalBoardGameDL.g:1091:1: rule__PieceType__Group__2__Impl : ( 'Symbol' ) ;
    public final void rule__PieceType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1095:1: ( ( 'Symbol' ) )
            // InternalBoardGameDL.g:1096:1: ( 'Symbol' )
            {
            // InternalBoardGameDL.g:1096:1: ( 'Symbol' )
            // InternalBoardGameDL.g:1097:2: 'Symbol'
            {
             before(grammarAccess.getPieceTypeAccess().getSymbolKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPieceTypeAccess().getSymbolKeyword_2()); 

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
    // InternalBoardGameDL.g:1106:1: rule__PieceType__Group__3 : rule__PieceType__Group__3__Impl rule__PieceType__Group__4 ;
    public final void rule__PieceType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1110:1: ( rule__PieceType__Group__3__Impl rule__PieceType__Group__4 )
            // InternalBoardGameDL.g:1111:2: rule__PieceType__Group__3__Impl rule__PieceType__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalBoardGameDL.g:1118:1: rule__PieceType__Group__3__Impl : ( ( rule__PieceType__SymbolAssignment_3 ) ) ;
    public final void rule__PieceType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1122:1: ( ( ( rule__PieceType__SymbolAssignment_3 ) ) )
            // InternalBoardGameDL.g:1123:1: ( ( rule__PieceType__SymbolAssignment_3 ) )
            {
            // InternalBoardGameDL.g:1123:1: ( ( rule__PieceType__SymbolAssignment_3 ) )
            // InternalBoardGameDL.g:1124:2: ( rule__PieceType__SymbolAssignment_3 )
            {
             before(grammarAccess.getPieceTypeAccess().getSymbolAssignment_3()); 
            // InternalBoardGameDL.g:1125:2: ( rule__PieceType__SymbolAssignment_3 )
            // InternalBoardGameDL.g:1125:3: rule__PieceType__SymbolAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__SymbolAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPieceTypeAccess().getSymbolAssignment_3()); 

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
    // InternalBoardGameDL.g:1133:1: rule__PieceType__Group__4 : rule__PieceType__Group__4__Impl rule__PieceType__Group__5 ;
    public final void rule__PieceType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1137:1: ( rule__PieceType__Group__4__Impl rule__PieceType__Group__5 )
            // InternalBoardGameDL.g:1138:2: rule__PieceType__Group__4__Impl rule__PieceType__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalBoardGameDL.g:1145:1: rule__PieceType__Group__4__Impl : ( 'hasValidMovesWhen' ) ;
    public final void rule__PieceType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1149:1: ( ( 'hasValidMovesWhen' ) )
            // InternalBoardGameDL.g:1150:1: ( 'hasValidMovesWhen' )
            {
            // InternalBoardGameDL.g:1150:1: ( 'hasValidMovesWhen' )
            // InternalBoardGameDL.g:1151:2: 'hasValidMovesWhen'
            {
             before(grammarAccess.getPieceTypeAccess().getHasValidMovesWhenKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPieceTypeAccess().getHasValidMovesWhenKeyword_4()); 

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
    // InternalBoardGameDL.g:1160:1: rule__PieceType__Group__5 : rule__PieceType__Group__5__Impl rule__PieceType__Group__6 ;
    public final void rule__PieceType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1164:1: ( rule__PieceType__Group__5__Impl rule__PieceType__Group__6 )
            // InternalBoardGameDL.g:1165:2: rule__PieceType__Group__5__Impl rule__PieceType__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalBoardGameDL.g:1172:1: rule__PieceType__Group__5__Impl : ( '[' ) ;
    public final void rule__PieceType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1176:1: ( ( '[' ) )
            // InternalBoardGameDL.g:1177:1: ( '[' )
            {
            // InternalBoardGameDL.g:1177:1: ( '[' )
            // InternalBoardGameDL.g:1178:2: '['
            {
             before(grammarAccess.getPieceTypeAccess().getLeftSquareBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPieceTypeAccess().getLeftSquareBracketKeyword_5()); 

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
    // InternalBoardGameDL.g:1187:1: rule__PieceType__Group__6 : rule__PieceType__Group__6__Impl rule__PieceType__Group__7 ;
    public final void rule__PieceType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1191:1: ( rule__PieceType__Group__6__Impl rule__PieceType__Group__7 )
            // InternalBoardGameDL.g:1192:2: rule__PieceType__Group__6__Impl rule__PieceType__Group__7
            {
            pushFollow(FOLLOW_9);
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
    // InternalBoardGameDL.g:1199:1: rule__PieceType__Group__6__Impl : ( ( rule__PieceType__ValidmovesAssignment_6 ) ) ;
    public final void rule__PieceType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1203:1: ( ( ( rule__PieceType__ValidmovesAssignment_6 ) ) )
            // InternalBoardGameDL.g:1204:1: ( ( rule__PieceType__ValidmovesAssignment_6 ) )
            {
            // InternalBoardGameDL.g:1204:1: ( ( rule__PieceType__ValidmovesAssignment_6 ) )
            // InternalBoardGameDL.g:1205:2: ( rule__PieceType__ValidmovesAssignment_6 )
            {
             before(grammarAccess.getPieceTypeAccess().getValidmovesAssignment_6()); 
            // InternalBoardGameDL.g:1206:2: ( rule__PieceType__ValidmovesAssignment_6 )
            // InternalBoardGameDL.g:1206:3: rule__PieceType__ValidmovesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__ValidmovesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPieceTypeAccess().getValidmovesAssignment_6()); 

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
    // InternalBoardGameDL.g:1214:1: rule__PieceType__Group__7 : rule__PieceType__Group__7__Impl rule__PieceType__Group__8 ;
    public final void rule__PieceType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1218:1: ( rule__PieceType__Group__7__Impl rule__PieceType__Group__8 )
            // InternalBoardGameDL.g:1219:2: rule__PieceType__Group__7__Impl rule__PieceType__Group__8
            {
            pushFollow(FOLLOW_9);
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
    // InternalBoardGameDL.g:1226:1: rule__PieceType__Group__7__Impl : ( ( rule__PieceType__Group_7__0 )* ) ;
    public final void rule__PieceType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1230:1: ( ( ( rule__PieceType__Group_7__0 )* ) )
            // InternalBoardGameDL.g:1231:1: ( ( rule__PieceType__Group_7__0 )* )
            {
            // InternalBoardGameDL.g:1231:1: ( ( rule__PieceType__Group_7__0 )* )
            // InternalBoardGameDL.g:1232:2: ( rule__PieceType__Group_7__0 )*
            {
             before(grammarAccess.getPieceTypeAccess().getGroup_7()); 
            // InternalBoardGameDL.g:1233:2: ( rule__PieceType__Group_7__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBoardGameDL.g:1233:3: rule__PieceType__Group_7__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__PieceType__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalBoardGameDL.g:1241:1: rule__PieceType__Group__8 : rule__PieceType__Group__8__Impl rule__PieceType__Group__9 ;
    public final void rule__PieceType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1245:1: ( rule__PieceType__Group__8__Impl rule__PieceType__Group__9 )
            // InternalBoardGameDL.g:1246:2: rule__PieceType__Group__8__Impl rule__PieceType__Group__9
            {
            pushFollow(FOLLOW_17);
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
    // InternalBoardGameDL.g:1253:1: rule__PieceType__Group__8__Impl : ( ']' ) ;
    public final void rule__PieceType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1257:1: ( ( ']' ) )
            // InternalBoardGameDL.g:1258:1: ( ']' )
            {
            // InternalBoardGameDL.g:1258:1: ( ']' )
            // InternalBoardGameDL.g:1259:2: ']'
            {
             before(grammarAccess.getPieceTypeAccess().getRightSquareBracketKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPieceTypeAccess().getRightSquareBracketKeyword_8()); 

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
    // InternalBoardGameDL.g:1268:1: rule__PieceType__Group__9 : rule__PieceType__Group__9__Impl ;
    public final void rule__PieceType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1272:1: ( rule__PieceType__Group__9__Impl )
            // InternalBoardGameDL.g:1273:2: rule__PieceType__Group__9__Impl
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
    // InternalBoardGameDL.g:1279:1: rule__PieceType__Group__9__Impl : ( ( rule__PieceType__Group_9__0 )? ) ;
    public final void rule__PieceType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1283:1: ( ( ( rule__PieceType__Group_9__0 )? ) )
            // InternalBoardGameDL.g:1284:1: ( ( rule__PieceType__Group_9__0 )? )
            {
            // InternalBoardGameDL.g:1284:1: ( ( rule__PieceType__Group_9__0 )? )
            // InternalBoardGameDL.g:1285:2: ( rule__PieceType__Group_9__0 )?
            {
             before(grammarAccess.getPieceTypeAccess().getGroup_9()); 
            // InternalBoardGameDL.g:1286:2: ( rule__PieceType__Group_9__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBoardGameDL.g:1286:3: rule__PieceType__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PieceType__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPieceTypeAccess().getGroup_9()); 

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
    // InternalBoardGameDL.g:1295:1: rule__PieceType__Group_7__0 : rule__PieceType__Group_7__0__Impl rule__PieceType__Group_7__1 ;
    public final void rule__PieceType__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1299:1: ( rule__PieceType__Group_7__0__Impl rule__PieceType__Group_7__1 )
            // InternalBoardGameDL.g:1300:2: rule__PieceType__Group_7__0__Impl rule__PieceType__Group_7__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalBoardGameDL.g:1307:1: rule__PieceType__Group_7__0__Impl : ( ',' ) ;
    public final void rule__PieceType__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1311:1: ( ( ',' ) )
            // InternalBoardGameDL.g:1312:1: ( ',' )
            {
            // InternalBoardGameDL.g:1312:1: ( ',' )
            // InternalBoardGameDL.g:1313:2: ','
            {
             before(grammarAccess.getPieceTypeAccess().getCommaKeyword_7_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1322:1: rule__PieceType__Group_7__1 : rule__PieceType__Group_7__1__Impl ;
    public final void rule__PieceType__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1326:1: ( rule__PieceType__Group_7__1__Impl )
            // InternalBoardGameDL.g:1327:2: rule__PieceType__Group_7__1__Impl
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
    // InternalBoardGameDL.g:1333:1: rule__PieceType__Group_7__1__Impl : ( ( rule__PieceType__ValidmovesAssignment_7_1 ) ) ;
    public final void rule__PieceType__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1337:1: ( ( ( rule__PieceType__ValidmovesAssignment_7_1 ) ) )
            // InternalBoardGameDL.g:1338:1: ( ( rule__PieceType__ValidmovesAssignment_7_1 ) )
            {
            // InternalBoardGameDL.g:1338:1: ( ( rule__PieceType__ValidmovesAssignment_7_1 ) )
            // InternalBoardGameDL.g:1339:2: ( rule__PieceType__ValidmovesAssignment_7_1 )
            {
             before(grammarAccess.getPieceTypeAccess().getValidmovesAssignment_7_1()); 
            // InternalBoardGameDL.g:1340:2: ( rule__PieceType__ValidmovesAssignment_7_1 )
            // InternalBoardGameDL.g:1340:3: rule__PieceType__ValidmovesAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__ValidmovesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPieceTypeAccess().getValidmovesAssignment_7_1()); 

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


    // $ANTLR start "rule__PieceType__Group_9__0"
    // InternalBoardGameDL.g:1349:1: rule__PieceType__Group_9__0 : rule__PieceType__Group_9__0__Impl rule__PieceType__Group_9__1 ;
    public final void rule__PieceType__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1353:1: ( rule__PieceType__Group_9__0__Impl rule__PieceType__Group_9__1 )
            // InternalBoardGameDL.g:1354:2: rule__PieceType__Group_9__0__Impl rule__PieceType__Group_9__1
            {
            pushFollow(FOLLOW_7);
            rule__PieceType__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieceType__Group_9__1();

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
    // $ANTLR end "rule__PieceType__Group_9__0"


    // $ANTLR start "rule__PieceType__Group_9__0__Impl"
    // InternalBoardGameDL.g:1361:1: rule__PieceType__Group_9__0__Impl : ( 'hasEffectOnCell' ) ;
    public final void rule__PieceType__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1365:1: ( ( 'hasEffectOnCell' ) )
            // InternalBoardGameDL.g:1366:1: ( 'hasEffectOnCell' )
            {
            // InternalBoardGameDL.g:1366:1: ( 'hasEffectOnCell' )
            // InternalBoardGameDL.g:1367:2: 'hasEffectOnCell'
            {
             before(grammarAccess.getPieceTypeAccess().getHasEffectOnCellKeyword_9_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPieceTypeAccess().getHasEffectOnCellKeyword_9_0()); 

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
    // $ANTLR end "rule__PieceType__Group_9__0__Impl"


    // $ANTLR start "rule__PieceType__Group_9__1"
    // InternalBoardGameDL.g:1376:1: rule__PieceType__Group_9__1 : rule__PieceType__Group_9__1__Impl rule__PieceType__Group_9__2 ;
    public final void rule__PieceType__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1380:1: ( rule__PieceType__Group_9__1__Impl rule__PieceType__Group_9__2 )
            // InternalBoardGameDL.g:1381:2: rule__PieceType__Group_9__1__Impl rule__PieceType__Group_9__2
            {
            pushFollow(FOLLOW_18);
            rule__PieceType__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieceType__Group_9__2();

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
    // $ANTLR end "rule__PieceType__Group_9__1"


    // $ANTLR start "rule__PieceType__Group_9__1__Impl"
    // InternalBoardGameDL.g:1388:1: rule__PieceType__Group_9__1__Impl : ( '[' ) ;
    public final void rule__PieceType__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1392:1: ( ( '[' ) )
            // InternalBoardGameDL.g:1393:1: ( '[' )
            {
            // InternalBoardGameDL.g:1393:1: ( '[' )
            // InternalBoardGameDL.g:1394:2: '['
            {
             before(grammarAccess.getPieceTypeAccess().getLeftSquareBracketKeyword_9_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPieceTypeAccess().getLeftSquareBracketKeyword_9_1()); 

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
    // $ANTLR end "rule__PieceType__Group_9__1__Impl"


    // $ANTLR start "rule__PieceType__Group_9__2"
    // InternalBoardGameDL.g:1403:1: rule__PieceType__Group_9__2 : rule__PieceType__Group_9__2__Impl rule__PieceType__Group_9__3 ;
    public final void rule__PieceType__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1407:1: ( rule__PieceType__Group_9__2__Impl rule__PieceType__Group_9__3 )
            // InternalBoardGameDL.g:1408:2: rule__PieceType__Group_9__2__Impl rule__PieceType__Group_9__3
            {
            pushFollow(FOLLOW_9);
            rule__PieceType__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieceType__Group_9__3();

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
    // $ANTLR end "rule__PieceType__Group_9__2"


    // $ANTLR start "rule__PieceType__Group_9__2__Impl"
    // InternalBoardGameDL.g:1415:1: rule__PieceType__Group_9__2__Impl : ( ( rule__PieceType__EffectsoncellAssignment_9_2 ) ) ;
    public final void rule__PieceType__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1419:1: ( ( ( rule__PieceType__EffectsoncellAssignment_9_2 ) ) )
            // InternalBoardGameDL.g:1420:1: ( ( rule__PieceType__EffectsoncellAssignment_9_2 ) )
            {
            // InternalBoardGameDL.g:1420:1: ( ( rule__PieceType__EffectsoncellAssignment_9_2 ) )
            // InternalBoardGameDL.g:1421:2: ( rule__PieceType__EffectsoncellAssignment_9_2 )
            {
             before(grammarAccess.getPieceTypeAccess().getEffectsoncellAssignment_9_2()); 
            // InternalBoardGameDL.g:1422:2: ( rule__PieceType__EffectsoncellAssignment_9_2 )
            // InternalBoardGameDL.g:1422:3: rule__PieceType__EffectsoncellAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__EffectsoncellAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getPieceTypeAccess().getEffectsoncellAssignment_9_2()); 

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
    // $ANTLR end "rule__PieceType__Group_9__2__Impl"


    // $ANTLR start "rule__PieceType__Group_9__3"
    // InternalBoardGameDL.g:1430:1: rule__PieceType__Group_9__3 : rule__PieceType__Group_9__3__Impl rule__PieceType__Group_9__4 ;
    public final void rule__PieceType__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1434:1: ( rule__PieceType__Group_9__3__Impl rule__PieceType__Group_9__4 )
            // InternalBoardGameDL.g:1435:2: rule__PieceType__Group_9__3__Impl rule__PieceType__Group_9__4
            {
            pushFollow(FOLLOW_9);
            rule__PieceType__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieceType__Group_9__4();

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
    // $ANTLR end "rule__PieceType__Group_9__3"


    // $ANTLR start "rule__PieceType__Group_9__3__Impl"
    // InternalBoardGameDL.g:1442:1: rule__PieceType__Group_9__3__Impl : ( ( rule__PieceType__Group_9_3__0 )* ) ;
    public final void rule__PieceType__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1446:1: ( ( ( rule__PieceType__Group_9_3__0 )* ) )
            // InternalBoardGameDL.g:1447:1: ( ( rule__PieceType__Group_9_3__0 )* )
            {
            // InternalBoardGameDL.g:1447:1: ( ( rule__PieceType__Group_9_3__0 )* )
            // InternalBoardGameDL.g:1448:2: ( rule__PieceType__Group_9_3__0 )*
            {
             before(grammarAccess.getPieceTypeAccess().getGroup_9_3()); 
            // InternalBoardGameDL.g:1449:2: ( rule__PieceType__Group_9_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBoardGameDL.g:1449:3: rule__PieceType__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__PieceType__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPieceTypeAccess().getGroup_9_3()); 

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
    // $ANTLR end "rule__PieceType__Group_9__3__Impl"


    // $ANTLR start "rule__PieceType__Group_9__4"
    // InternalBoardGameDL.g:1457:1: rule__PieceType__Group_9__4 : rule__PieceType__Group_9__4__Impl ;
    public final void rule__PieceType__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1461:1: ( rule__PieceType__Group_9__4__Impl )
            // InternalBoardGameDL.g:1462:2: rule__PieceType__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__Group_9__4__Impl();

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
    // $ANTLR end "rule__PieceType__Group_9__4"


    // $ANTLR start "rule__PieceType__Group_9__4__Impl"
    // InternalBoardGameDL.g:1468:1: rule__PieceType__Group_9__4__Impl : ( ']' ) ;
    public final void rule__PieceType__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1472:1: ( ( ']' ) )
            // InternalBoardGameDL.g:1473:1: ( ']' )
            {
            // InternalBoardGameDL.g:1473:1: ( ']' )
            // InternalBoardGameDL.g:1474:2: ']'
            {
             before(grammarAccess.getPieceTypeAccess().getRightSquareBracketKeyword_9_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPieceTypeAccess().getRightSquareBracketKeyword_9_4()); 

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
    // $ANTLR end "rule__PieceType__Group_9__4__Impl"


    // $ANTLR start "rule__PieceType__Group_9_3__0"
    // InternalBoardGameDL.g:1484:1: rule__PieceType__Group_9_3__0 : rule__PieceType__Group_9_3__0__Impl rule__PieceType__Group_9_3__1 ;
    public final void rule__PieceType__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1488:1: ( rule__PieceType__Group_9_3__0__Impl rule__PieceType__Group_9_3__1 )
            // InternalBoardGameDL.g:1489:2: rule__PieceType__Group_9_3__0__Impl rule__PieceType__Group_9_3__1
            {
            pushFollow(FOLLOW_18);
            rule__PieceType__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieceType__Group_9_3__1();

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
    // $ANTLR end "rule__PieceType__Group_9_3__0"


    // $ANTLR start "rule__PieceType__Group_9_3__0__Impl"
    // InternalBoardGameDL.g:1496:1: rule__PieceType__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__PieceType__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1500:1: ( ( ',' ) )
            // InternalBoardGameDL.g:1501:1: ( ',' )
            {
            // InternalBoardGameDL.g:1501:1: ( ',' )
            // InternalBoardGameDL.g:1502:2: ','
            {
             before(grammarAccess.getPieceTypeAccess().getCommaKeyword_9_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPieceTypeAccess().getCommaKeyword_9_3_0()); 

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
    // $ANTLR end "rule__PieceType__Group_9_3__0__Impl"


    // $ANTLR start "rule__PieceType__Group_9_3__1"
    // InternalBoardGameDL.g:1511:1: rule__PieceType__Group_9_3__1 : rule__PieceType__Group_9_3__1__Impl ;
    public final void rule__PieceType__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1515:1: ( rule__PieceType__Group_9_3__1__Impl )
            // InternalBoardGameDL.g:1516:2: rule__PieceType__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__Group_9_3__1__Impl();

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
    // $ANTLR end "rule__PieceType__Group_9_3__1"


    // $ANTLR start "rule__PieceType__Group_9_3__1__Impl"
    // InternalBoardGameDL.g:1522:1: rule__PieceType__Group_9_3__1__Impl : ( ( rule__PieceType__EffectsoncellAssignment_9_3_1 ) ) ;
    public final void rule__PieceType__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1526:1: ( ( ( rule__PieceType__EffectsoncellAssignment_9_3_1 ) ) )
            // InternalBoardGameDL.g:1527:1: ( ( rule__PieceType__EffectsoncellAssignment_9_3_1 ) )
            {
            // InternalBoardGameDL.g:1527:1: ( ( rule__PieceType__EffectsoncellAssignment_9_3_1 ) )
            // InternalBoardGameDL.g:1528:2: ( rule__PieceType__EffectsoncellAssignment_9_3_1 )
            {
             before(grammarAccess.getPieceTypeAccess().getEffectsoncellAssignment_9_3_1()); 
            // InternalBoardGameDL.g:1529:2: ( rule__PieceType__EffectsoncellAssignment_9_3_1 )
            // InternalBoardGameDL.g:1529:3: rule__PieceType__EffectsoncellAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__EffectsoncellAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPieceTypeAccess().getEffectsoncellAssignment_9_3_1()); 

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
    // $ANTLR end "rule__PieceType__Group_9_3__1__Impl"


    // $ANTLR start "rule__WinCondition__Group__0"
    // InternalBoardGameDL.g:1538:1: rule__WinCondition__Group__0 : rule__WinCondition__Group__0__Impl rule__WinCondition__Group__1 ;
    public final void rule__WinCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1542:1: ( rule__WinCondition__Group__0__Impl rule__WinCondition__Group__1 )
            // InternalBoardGameDL.g:1543:2: rule__WinCondition__Group__0__Impl rule__WinCondition__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalBoardGameDL.g:1550:1: rule__WinCondition__Group__0__Impl : ( 'InARow' ) ;
    public final void rule__WinCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1554:1: ( ( 'InARow' ) )
            // InternalBoardGameDL.g:1555:1: ( 'InARow' )
            {
            // InternalBoardGameDL.g:1555:1: ( 'InARow' )
            // InternalBoardGameDL.g:1556:2: 'InARow'
            {
             before(grammarAccess.getWinConditionAccess().getInARowKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getWinConditionAccess().getInARowKeyword_0()); 

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
    // InternalBoardGameDL.g:1565:1: rule__WinCondition__Group__1 : rule__WinCondition__Group__1__Impl ;
    public final void rule__WinCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1569:1: ( rule__WinCondition__Group__1__Impl )
            // InternalBoardGameDL.g:1570:2: rule__WinCondition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WinCondition__Group__1__Impl();

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
    // InternalBoardGameDL.g:1576:1: rule__WinCondition__Group__1__Impl : ( ( rule__WinCondition__InarowAssignment_1 ) ) ;
    public final void rule__WinCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1580:1: ( ( ( rule__WinCondition__InarowAssignment_1 ) ) )
            // InternalBoardGameDL.g:1581:1: ( ( rule__WinCondition__InarowAssignment_1 ) )
            {
            // InternalBoardGameDL.g:1581:1: ( ( rule__WinCondition__InarowAssignment_1 ) )
            // InternalBoardGameDL.g:1582:2: ( rule__WinCondition__InarowAssignment_1 )
            {
             before(grammarAccess.getWinConditionAccess().getInarowAssignment_1()); 
            // InternalBoardGameDL.g:1583:2: ( rule__WinCondition__InarowAssignment_1 )
            // InternalBoardGameDL.g:1583:3: rule__WinCondition__InarowAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WinCondition__InarowAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWinConditionAccess().getInarowAssignment_1()); 

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


    // $ANTLR start "rule__EInt__Group__0"
    // InternalBoardGameDL.g:1592:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1596:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalBoardGameDL.g:1597:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalBoardGameDL.g:1604:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1608:1: ( ( ( '-' )? ) )
            // InternalBoardGameDL.g:1609:1: ( ( '-' )? )
            {
            // InternalBoardGameDL.g:1609:1: ( ( '-' )? )
            // InternalBoardGameDL.g:1610:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalBoardGameDL.g:1611:2: ( '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBoardGameDL.g:1611:3: '-'
                    {
                    match(input,24,FOLLOW_2); 

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
    // InternalBoardGameDL.g:1619:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1623:1: ( rule__EInt__Group__1__Impl )
            // InternalBoardGameDL.g:1624:2: rule__EInt__Group__1__Impl
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
    // InternalBoardGameDL.g:1630:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1634:1: ( ( RULE_INT ) )
            // InternalBoardGameDL.g:1635:1: ( RULE_INT )
            {
            // InternalBoardGameDL.g:1635:1: ( RULE_INT )
            // InternalBoardGameDL.g:1636:2: RULE_INT
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
    // InternalBoardGameDL.g:1646:1: rule__ValidMove__Group__0 : rule__ValidMove__Group__0__Impl rule__ValidMove__Group__1 ;
    public final void rule__ValidMove__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1650:1: ( rule__ValidMove__Group__0__Impl rule__ValidMove__Group__1 )
            // InternalBoardGameDL.g:1651:2: rule__ValidMove__Group__0__Impl rule__ValidMove__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalBoardGameDL.g:1658:1: rule__ValidMove__Group__0__Impl : ( 'ValidMove' ) ;
    public final void rule__ValidMove__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1662:1: ( ( 'ValidMove' ) )
            // InternalBoardGameDL.g:1663:1: ( 'ValidMove' )
            {
            // InternalBoardGameDL.g:1663:1: ( 'ValidMove' )
            // InternalBoardGameDL.g:1664:2: 'ValidMove'
            {
             before(grammarAccess.getValidMoveAccess().getValidMoveKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1673:1: rule__ValidMove__Group__1 : rule__ValidMove__Group__1__Impl rule__ValidMove__Group__2 ;
    public final void rule__ValidMove__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1677:1: ( rule__ValidMove__Group__1__Impl rule__ValidMove__Group__2 )
            // InternalBoardGameDL.g:1678:2: rule__ValidMove__Group__1__Impl rule__ValidMove__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalBoardGameDL.g:1685:1: rule__ValidMove__Group__1__Impl : ( '{' ) ;
    public final void rule__ValidMove__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1689:1: ( ( '{' ) )
            // InternalBoardGameDL.g:1690:1: ( '{' )
            {
            // InternalBoardGameDL.g:1690:1: ( '{' )
            // InternalBoardGameDL.g:1691:2: '{'
            {
             before(grammarAccess.getValidMoveAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getValidMoveAccess().getLeftCurlyBracketKeyword_1()); 

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
    // InternalBoardGameDL.g:1700:1: rule__ValidMove__Group__2 : rule__ValidMove__Group__2__Impl rule__ValidMove__Group__3 ;
    public final void rule__ValidMove__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1704:1: ( rule__ValidMove__Group__2__Impl rule__ValidMove__Group__3 )
            // InternalBoardGameDL.g:1705:2: rule__ValidMove__Group__2__Impl rule__ValidMove__Group__3
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
    // InternalBoardGameDL.g:1712:1: rule__ValidMove__Group__2__Impl : ( ( rule__ValidMove__PlaceAnywhereAssignment_2 ) ) ;
    public final void rule__ValidMove__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1716:1: ( ( ( rule__ValidMove__PlaceAnywhereAssignment_2 ) ) )
            // InternalBoardGameDL.g:1717:1: ( ( rule__ValidMove__PlaceAnywhereAssignment_2 ) )
            {
            // InternalBoardGameDL.g:1717:1: ( ( rule__ValidMove__PlaceAnywhereAssignment_2 ) )
            // InternalBoardGameDL.g:1718:2: ( rule__ValidMove__PlaceAnywhereAssignment_2 )
            {
             before(grammarAccess.getValidMoveAccess().getPlaceAnywhereAssignment_2()); 
            // InternalBoardGameDL.g:1719:2: ( rule__ValidMove__PlaceAnywhereAssignment_2 )
            // InternalBoardGameDL.g:1719:3: rule__ValidMove__PlaceAnywhereAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ValidMove__PlaceAnywhereAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getValidMoveAccess().getPlaceAnywhereAssignment_2()); 

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
    // InternalBoardGameDL.g:1727:1: rule__ValidMove__Group__3 : rule__ValidMove__Group__3__Impl rule__ValidMove__Group__4 ;
    public final void rule__ValidMove__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1731:1: ( rule__ValidMove__Group__3__Impl rule__ValidMove__Group__4 )
            // InternalBoardGameDL.g:1732:2: rule__ValidMove__Group__3__Impl rule__ValidMove__Group__4
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
    // InternalBoardGameDL.g:1739:1: rule__ValidMove__Group__3__Impl : ( ( rule__ValidMove__Group_3__0 )? ) ;
    public final void rule__ValidMove__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1743:1: ( ( ( rule__ValidMove__Group_3__0 )? ) )
            // InternalBoardGameDL.g:1744:1: ( ( rule__ValidMove__Group_3__0 )? )
            {
            // InternalBoardGameDL.g:1744:1: ( ( rule__ValidMove__Group_3__0 )? )
            // InternalBoardGameDL.g:1745:2: ( rule__ValidMove__Group_3__0 )?
            {
             before(grammarAccess.getValidMoveAccess().getGroup_3()); 
            // InternalBoardGameDL.g:1746:2: ( rule__ValidMove__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBoardGameDL.g:1746:3: rule__ValidMove__Group_3__0
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
    // InternalBoardGameDL.g:1754:1: rule__ValidMove__Group__4 : rule__ValidMove__Group__4__Impl ;
    public final void rule__ValidMove__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1758:1: ( rule__ValidMove__Group__4__Impl )
            // InternalBoardGameDL.g:1759:2: rule__ValidMove__Group__4__Impl
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
    // InternalBoardGameDL.g:1765:1: rule__ValidMove__Group__4__Impl : ( '}' ) ;
    public final void rule__ValidMove__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1769:1: ( ( '}' ) )
            // InternalBoardGameDL.g:1770:1: ( '}' )
            {
            // InternalBoardGameDL.g:1770:1: ( '}' )
            // InternalBoardGameDL.g:1771:2: '}'
            {
             before(grammarAccess.getValidMoveAccess().getRightCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1781:1: rule__ValidMove__Group_3__0 : rule__ValidMove__Group_3__0__Impl rule__ValidMove__Group_3__1 ;
    public final void rule__ValidMove__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1785:1: ( rule__ValidMove__Group_3__0__Impl rule__ValidMove__Group_3__1 )
            // InternalBoardGameDL.g:1786:2: rule__ValidMove__Group_3__0__Impl rule__ValidMove__Group_3__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalBoardGameDL.g:1793:1: rule__ValidMove__Group_3__0__Impl : ( 'when' ) ;
    public final void rule__ValidMove__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1797:1: ( ( 'when' ) )
            // InternalBoardGameDL.g:1798:1: ( 'when' )
            {
            // InternalBoardGameDL.g:1798:1: ( 'when' )
            // InternalBoardGameDL.g:1799:2: 'when'
            {
             before(grammarAccess.getValidMoveAccess().getWhenKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getValidMoveAccess().getWhenKeyword_3_0()); 

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
    // InternalBoardGameDL.g:1808:1: rule__ValidMove__Group_3__1 : rule__ValidMove__Group_3__1__Impl rule__ValidMove__Group_3__2 ;
    public final void rule__ValidMove__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1812:1: ( rule__ValidMove__Group_3__1__Impl rule__ValidMove__Group_3__2 )
            // InternalBoardGameDL.g:1813:2: rule__ValidMove__Group_3__1__Impl rule__ValidMove__Group_3__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalBoardGameDL.g:1820:1: rule__ValidMove__Group_3__1__Impl : ( ( rule__ValidMove__ConditionsAssignment_3_1 ) ) ;
    public final void rule__ValidMove__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1824:1: ( ( ( rule__ValidMove__ConditionsAssignment_3_1 ) ) )
            // InternalBoardGameDL.g:1825:1: ( ( rule__ValidMove__ConditionsAssignment_3_1 ) )
            {
            // InternalBoardGameDL.g:1825:1: ( ( rule__ValidMove__ConditionsAssignment_3_1 ) )
            // InternalBoardGameDL.g:1826:2: ( rule__ValidMove__ConditionsAssignment_3_1 )
            {
             before(grammarAccess.getValidMoveAccess().getConditionsAssignment_3_1()); 
            // InternalBoardGameDL.g:1827:2: ( rule__ValidMove__ConditionsAssignment_3_1 )
            // InternalBoardGameDL.g:1827:3: rule__ValidMove__ConditionsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ValidMove__ConditionsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getValidMoveAccess().getConditionsAssignment_3_1()); 

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
    // InternalBoardGameDL.g:1835:1: rule__ValidMove__Group_3__2 : rule__ValidMove__Group_3__2__Impl ;
    public final void rule__ValidMove__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1839:1: ( rule__ValidMove__Group_3__2__Impl )
            // InternalBoardGameDL.g:1840:2: rule__ValidMove__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValidMove__Group_3__2__Impl();

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
    // InternalBoardGameDL.g:1846:1: rule__ValidMove__Group_3__2__Impl : ( ( rule__ValidMove__Group_3_2__0 )* ) ;
    public final void rule__ValidMove__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1850:1: ( ( ( rule__ValidMove__Group_3_2__0 )* ) )
            // InternalBoardGameDL.g:1851:1: ( ( rule__ValidMove__Group_3_2__0 )* )
            {
            // InternalBoardGameDL.g:1851:1: ( ( rule__ValidMove__Group_3_2__0 )* )
            // InternalBoardGameDL.g:1852:2: ( rule__ValidMove__Group_3_2__0 )*
            {
             before(grammarAccess.getValidMoveAccess().getGroup_3_2()); 
            // InternalBoardGameDL.g:1853:2: ( rule__ValidMove__Group_3_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBoardGameDL.g:1853:3: rule__ValidMove__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__ValidMove__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getValidMoveAccess().getGroup_3_2()); 

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


    // $ANTLR start "rule__ValidMove__Group_3_2__0"
    // InternalBoardGameDL.g:1862:1: rule__ValidMove__Group_3_2__0 : rule__ValidMove__Group_3_2__0__Impl rule__ValidMove__Group_3_2__1 ;
    public final void rule__ValidMove__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1866:1: ( rule__ValidMove__Group_3_2__0__Impl rule__ValidMove__Group_3_2__1 )
            // InternalBoardGameDL.g:1867:2: rule__ValidMove__Group_3_2__0__Impl rule__ValidMove__Group_3_2__1
            {
            pushFollow(FOLLOW_23);
            rule__ValidMove__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidMove__Group_3_2__1();

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
    // $ANTLR end "rule__ValidMove__Group_3_2__0"


    // $ANTLR start "rule__ValidMove__Group_3_2__0__Impl"
    // InternalBoardGameDL.g:1874:1: rule__ValidMove__Group_3_2__0__Impl : ( 'and' ) ;
    public final void rule__ValidMove__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1878:1: ( ( 'and' ) )
            // InternalBoardGameDL.g:1879:1: ( 'and' )
            {
            // InternalBoardGameDL.g:1879:1: ( 'and' )
            // InternalBoardGameDL.g:1880:2: 'and'
            {
             before(grammarAccess.getValidMoveAccess().getAndKeyword_3_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getValidMoveAccess().getAndKeyword_3_2_0()); 

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
    // $ANTLR end "rule__ValidMove__Group_3_2__0__Impl"


    // $ANTLR start "rule__ValidMove__Group_3_2__1"
    // InternalBoardGameDL.g:1889:1: rule__ValidMove__Group_3_2__1 : rule__ValidMove__Group_3_2__1__Impl ;
    public final void rule__ValidMove__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1893:1: ( rule__ValidMove__Group_3_2__1__Impl )
            // InternalBoardGameDL.g:1894:2: rule__ValidMove__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValidMove__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__ValidMove__Group_3_2__1"


    // $ANTLR start "rule__ValidMove__Group_3_2__1__Impl"
    // InternalBoardGameDL.g:1900:1: rule__ValidMove__Group_3_2__1__Impl : ( ( rule__ValidMove__ConditionsAssignment_3_2_1 ) ) ;
    public final void rule__ValidMove__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1904:1: ( ( ( rule__ValidMove__ConditionsAssignment_3_2_1 ) ) )
            // InternalBoardGameDL.g:1905:1: ( ( rule__ValidMove__ConditionsAssignment_3_2_1 ) )
            {
            // InternalBoardGameDL.g:1905:1: ( ( rule__ValidMove__ConditionsAssignment_3_2_1 ) )
            // InternalBoardGameDL.g:1906:2: ( rule__ValidMove__ConditionsAssignment_3_2_1 )
            {
             before(grammarAccess.getValidMoveAccess().getConditionsAssignment_3_2_1()); 
            // InternalBoardGameDL.g:1907:2: ( rule__ValidMove__ConditionsAssignment_3_2_1 )
            // InternalBoardGameDL.g:1907:3: rule__ValidMove__ConditionsAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ValidMove__ConditionsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getValidMoveAccess().getConditionsAssignment_3_2_1()); 

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
    // $ANTLR end "rule__ValidMove__Group_3_2__1__Impl"


    // $ANTLR start "rule__EffectOnCell__Group__0"
    // InternalBoardGameDL.g:1916:1: rule__EffectOnCell__Group__0 : rule__EffectOnCell__Group__0__Impl rule__EffectOnCell__Group__1 ;
    public final void rule__EffectOnCell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1920:1: ( rule__EffectOnCell__Group__0__Impl rule__EffectOnCell__Group__1 )
            // InternalBoardGameDL.g:1921:2: rule__EffectOnCell__Group__0__Impl rule__EffectOnCell__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalBoardGameDL.g:1928:1: rule__EffectOnCell__Group__0__Impl : ( 'effect' ) ;
    public final void rule__EffectOnCell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1932:1: ( ( 'effect' ) )
            // InternalBoardGameDL.g:1933:1: ( 'effect' )
            {
            // InternalBoardGameDL.g:1933:1: ( 'effect' )
            // InternalBoardGameDL.g:1934:2: 'effect'
            {
             before(grammarAccess.getEffectOnCellAccess().getEffectKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEffectOnCellAccess().getEffectKeyword_0()); 

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
    // InternalBoardGameDL.g:1943:1: rule__EffectOnCell__Group__1 : rule__EffectOnCell__Group__1__Impl rule__EffectOnCell__Group__2 ;
    public final void rule__EffectOnCell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1947:1: ( rule__EffectOnCell__Group__1__Impl rule__EffectOnCell__Group__2 )
            // InternalBoardGameDL.g:1948:2: rule__EffectOnCell__Group__1__Impl rule__EffectOnCell__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalBoardGameDL.g:1955:1: rule__EffectOnCell__Group__1__Impl : ( '->' ) ;
    public final void rule__EffectOnCell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1959:1: ( ( '->' ) )
            // InternalBoardGameDL.g:1960:1: ( '->' )
            {
            // InternalBoardGameDL.g:1960:1: ( '->' )
            // InternalBoardGameDL.g:1961:2: '->'
            {
             before(grammarAccess.getEffectOnCellAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEffectOnCellAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

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
    // InternalBoardGameDL.g:1970:1: rule__EffectOnCell__Group__2 : rule__EffectOnCell__Group__2__Impl rule__EffectOnCell__Group__3 ;
    public final void rule__EffectOnCell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1974:1: ( rule__EffectOnCell__Group__2__Impl rule__EffectOnCell__Group__3 )
            // InternalBoardGameDL.g:1975:2: rule__EffectOnCell__Group__2__Impl rule__EffectOnCell__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalBoardGameDL.g:1982:1: rule__EffectOnCell__Group__2__Impl : ( '(' ) ;
    public final void rule__EffectOnCell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1986:1: ( ( '(' ) )
            // InternalBoardGameDL.g:1987:1: ( '(' )
            {
            // InternalBoardGameDL.g:1987:1: ( '(' )
            // InternalBoardGameDL.g:1988:2: '('
            {
             before(grammarAccess.getEffectOnCellAccess().getLeftParenthesisKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEffectOnCellAccess().getLeftParenthesisKeyword_2()); 

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
    // InternalBoardGameDL.g:1997:1: rule__EffectOnCell__Group__3 : rule__EffectOnCell__Group__3__Impl rule__EffectOnCell__Group__4 ;
    public final void rule__EffectOnCell__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2001:1: ( rule__EffectOnCell__Group__3__Impl rule__EffectOnCell__Group__4 )
            // InternalBoardGameDL.g:2002:2: rule__EffectOnCell__Group__3__Impl rule__EffectOnCell__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalBoardGameDL.g:2009:1: rule__EffectOnCell__Group__3__Impl : ( 'relativePosition' ) ;
    public final void rule__EffectOnCell__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2013:1: ( ( 'relativePosition' ) )
            // InternalBoardGameDL.g:2014:1: ( 'relativePosition' )
            {
            // InternalBoardGameDL.g:2014:1: ( 'relativePosition' )
            // InternalBoardGameDL.g:2015:2: 'relativePosition'
            {
             before(grammarAccess.getEffectOnCellAccess().getRelativePositionKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEffectOnCellAccess().getRelativePositionKeyword_3()); 

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
    // InternalBoardGameDL.g:2024:1: rule__EffectOnCell__Group__4 : rule__EffectOnCell__Group__4__Impl rule__EffectOnCell__Group__5 ;
    public final void rule__EffectOnCell__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2028:1: ( rule__EffectOnCell__Group__4__Impl rule__EffectOnCell__Group__5 )
            // InternalBoardGameDL.g:2029:2: rule__EffectOnCell__Group__4__Impl rule__EffectOnCell__Group__5
            {
            pushFollow(FOLLOW_5);
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
    // InternalBoardGameDL.g:2036:1: rule__EffectOnCell__Group__4__Impl : ( '(' ) ;
    public final void rule__EffectOnCell__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2040:1: ( ( '(' ) )
            // InternalBoardGameDL.g:2041:1: ( '(' )
            {
            // InternalBoardGameDL.g:2041:1: ( '(' )
            // InternalBoardGameDL.g:2042:2: '('
            {
             before(grammarAccess.getEffectOnCellAccess().getLeftParenthesisKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEffectOnCellAccess().getLeftParenthesisKeyword_4()); 

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
    // InternalBoardGameDL.g:2051:1: rule__EffectOnCell__Group__5 : rule__EffectOnCell__Group__5__Impl rule__EffectOnCell__Group__6 ;
    public final void rule__EffectOnCell__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2055:1: ( rule__EffectOnCell__Group__5__Impl rule__EffectOnCell__Group__6 )
            // InternalBoardGameDL.g:2056:2: rule__EffectOnCell__Group__5__Impl rule__EffectOnCell__Group__6
            {
            pushFollow(FOLLOW_29);
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
    // InternalBoardGameDL.g:2063:1: rule__EffectOnCell__Group__5__Impl : ( ( rule__EffectOnCell__XAssignment_5 ) ) ;
    public final void rule__EffectOnCell__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2067:1: ( ( ( rule__EffectOnCell__XAssignment_5 ) ) )
            // InternalBoardGameDL.g:2068:1: ( ( rule__EffectOnCell__XAssignment_5 ) )
            {
            // InternalBoardGameDL.g:2068:1: ( ( rule__EffectOnCell__XAssignment_5 ) )
            // InternalBoardGameDL.g:2069:2: ( rule__EffectOnCell__XAssignment_5 )
            {
             before(grammarAccess.getEffectOnCellAccess().getXAssignment_5()); 
            // InternalBoardGameDL.g:2070:2: ( rule__EffectOnCell__XAssignment_5 )
            // InternalBoardGameDL.g:2070:3: rule__EffectOnCell__XAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__EffectOnCell__XAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEffectOnCellAccess().getXAssignment_5()); 

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
    // InternalBoardGameDL.g:2078:1: rule__EffectOnCell__Group__6 : rule__EffectOnCell__Group__6__Impl rule__EffectOnCell__Group__7 ;
    public final void rule__EffectOnCell__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2082:1: ( rule__EffectOnCell__Group__6__Impl rule__EffectOnCell__Group__7 )
            // InternalBoardGameDL.g:2083:2: rule__EffectOnCell__Group__6__Impl rule__EffectOnCell__Group__7
            {
            pushFollow(FOLLOW_5);
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
    // InternalBoardGameDL.g:2090:1: rule__EffectOnCell__Group__6__Impl : ( ',' ) ;
    public final void rule__EffectOnCell__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2094:1: ( ( ',' ) )
            // InternalBoardGameDL.g:2095:1: ( ',' )
            {
            // InternalBoardGameDL.g:2095:1: ( ',' )
            // InternalBoardGameDL.g:2096:2: ','
            {
             before(grammarAccess.getEffectOnCellAccess().getCommaKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEffectOnCellAccess().getCommaKeyword_6()); 

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
    // InternalBoardGameDL.g:2105:1: rule__EffectOnCell__Group__7 : rule__EffectOnCell__Group__7__Impl rule__EffectOnCell__Group__8 ;
    public final void rule__EffectOnCell__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2109:1: ( rule__EffectOnCell__Group__7__Impl rule__EffectOnCell__Group__8 )
            // InternalBoardGameDL.g:2110:2: rule__EffectOnCell__Group__7__Impl rule__EffectOnCell__Group__8
            {
            pushFollow(FOLLOW_30);
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
    // InternalBoardGameDL.g:2117:1: rule__EffectOnCell__Group__7__Impl : ( ( rule__EffectOnCell__YAssignment_7 ) ) ;
    public final void rule__EffectOnCell__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2121:1: ( ( ( rule__EffectOnCell__YAssignment_7 ) ) )
            // InternalBoardGameDL.g:2122:1: ( ( rule__EffectOnCell__YAssignment_7 ) )
            {
            // InternalBoardGameDL.g:2122:1: ( ( rule__EffectOnCell__YAssignment_7 ) )
            // InternalBoardGameDL.g:2123:2: ( rule__EffectOnCell__YAssignment_7 )
            {
             before(grammarAccess.getEffectOnCellAccess().getYAssignment_7()); 
            // InternalBoardGameDL.g:2124:2: ( rule__EffectOnCell__YAssignment_7 )
            // InternalBoardGameDL.g:2124:3: rule__EffectOnCell__YAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__EffectOnCell__YAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getEffectOnCellAccess().getYAssignment_7()); 

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
    // InternalBoardGameDL.g:2132:1: rule__EffectOnCell__Group__8 : rule__EffectOnCell__Group__8__Impl rule__EffectOnCell__Group__9 ;
    public final void rule__EffectOnCell__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2136:1: ( rule__EffectOnCell__Group__8__Impl rule__EffectOnCell__Group__9 )
            // InternalBoardGameDL.g:2137:2: rule__EffectOnCell__Group__8__Impl rule__EffectOnCell__Group__9
            {
            pushFollow(FOLLOW_31);
            rule__EffectOnCell__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectOnCell__Group__9();

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
    // InternalBoardGameDL.g:2144:1: rule__EffectOnCell__Group__8__Impl : ( ')' ) ;
    public final void rule__EffectOnCell__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2148:1: ( ( ')' ) )
            // InternalBoardGameDL.g:2149:1: ( ')' )
            {
            // InternalBoardGameDL.g:2149:1: ( ')' )
            // InternalBoardGameDL.g:2150:2: ')'
            {
             before(grammarAccess.getEffectOnCellAccess().getRightParenthesisKeyword_8()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEffectOnCellAccess().getRightParenthesisKeyword_8()); 

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


    // $ANTLR start "rule__EffectOnCell__Group__9"
    // InternalBoardGameDL.g:2159:1: rule__EffectOnCell__Group__9 : rule__EffectOnCell__Group__9__Impl rule__EffectOnCell__Group__10 ;
    public final void rule__EffectOnCell__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2163:1: ( rule__EffectOnCell__Group__9__Impl rule__EffectOnCell__Group__10 )
            // InternalBoardGameDL.g:2164:2: rule__EffectOnCell__Group__9__Impl rule__EffectOnCell__Group__10
            {
            pushFollow(FOLLOW_27);
            rule__EffectOnCell__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectOnCell__Group__10();

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
    // $ANTLR end "rule__EffectOnCell__Group__9"


    // $ANTLR start "rule__EffectOnCell__Group__9__Impl"
    // InternalBoardGameDL.g:2171:1: rule__EffectOnCell__Group__9__Impl : ( 'newCellState' ) ;
    public final void rule__EffectOnCell__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2175:1: ( ( 'newCellState' ) )
            // InternalBoardGameDL.g:2176:1: ( 'newCellState' )
            {
            // InternalBoardGameDL.g:2176:1: ( 'newCellState' )
            // InternalBoardGameDL.g:2177:2: 'newCellState'
            {
             before(grammarAccess.getEffectOnCellAccess().getNewCellStateKeyword_9()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getEffectOnCellAccess().getNewCellStateKeyword_9()); 

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
    // $ANTLR end "rule__EffectOnCell__Group__9__Impl"


    // $ANTLR start "rule__EffectOnCell__Group__10"
    // InternalBoardGameDL.g:2186:1: rule__EffectOnCell__Group__10 : rule__EffectOnCell__Group__10__Impl rule__EffectOnCell__Group__11 ;
    public final void rule__EffectOnCell__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2190:1: ( rule__EffectOnCell__Group__10__Impl rule__EffectOnCell__Group__11 )
            // InternalBoardGameDL.g:2191:2: rule__EffectOnCell__Group__10__Impl rule__EffectOnCell__Group__11
            {
            pushFollow(FOLLOW_3);
            rule__EffectOnCell__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectOnCell__Group__11();

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
    // $ANTLR end "rule__EffectOnCell__Group__10"


    // $ANTLR start "rule__EffectOnCell__Group__10__Impl"
    // InternalBoardGameDL.g:2198:1: rule__EffectOnCell__Group__10__Impl : ( '(' ) ;
    public final void rule__EffectOnCell__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2202:1: ( ( '(' ) )
            // InternalBoardGameDL.g:2203:1: ( '(' )
            {
            // InternalBoardGameDL.g:2203:1: ( '(' )
            // InternalBoardGameDL.g:2204:2: '('
            {
             before(grammarAccess.getEffectOnCellAccess().getLeftParenthesisKeyword_10()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEffectOnCellAccess().getLeftParenthesisKeyword_10()); 

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
    // $ANTLR end "rule__EffectOnCell__Group__10__Impl"


    // $ANTLR start "rule__EffectOnCell__Group__11"
    // InternalBoardGameDL.g:2213:1: rule__EffectOnCell__Group__11 : rule__EffectOnCell__Group__11__Impl rule__EffectOnCell__Group__12 ;
    public final void rule__EffectOnCell__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2217:1: ( rule__EffectOnCell__Group__11__Impl rule__EffectOnCell__Group__12 )
            // InternalBoardGameDL.g:2218:2: rule__EffectOnCell__Group__11__Impl rule__EffectOnCell__Group__12
            {
            pushFollow(FOLLOW_30);
            rule__EffectOnCell__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectOnCell__Group__12();

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
    // $ANTLR end "rule__EffectOnCell__Group__11"


    // $ANTLR start "rule__EffectOnCell__Group__11__Impl"
    // InternalBoardGameDL.g:2225:1: rule__EffectOnCell__Group__11__Impl : ( ( rule__EffectOnCell__CellstateAssignment_11 ) ) ;
    public final void rule__EffectOnCell__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2229:1: ( ( ( rule__EffectOnCell__CellstateAssignment_11 ) ) )
            // InternalBoardGameDL.g:2230:1: ( ( rule__EffectOnCell__CellstateAssignment_11 ) )
            {
            // InternalBoardGameDL.g:2230:1: ( ( rule__EffectOnCell__CellstateAssignment_11 ) )
            // InternalBoardGameDL.g:2231:2: ( rule__EffectOnCell__CellstateAssignment_11 )
            {
             before(grammarAccess.getEffectOnCellAccess().getCellstateAssignment_11()); 
            // InternalBoardGameDL.g:2232:2: ( rule__EffectOnCell__CellstateAssignment_11 )
            // InternalBoardGameDL.g:2232:3: rule__EffectOnCell__CellstateAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__EffectOnCell__CellstateAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getEffectOnCellAccess().getCellstateAssignment_11()); 

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
    // $ANTLR end "rule__EffectOnCell__Group__11__Impl"


    // $ANTLR start "rule__EffectOnCell__Group__12"
    // InternalBoardGameDL.g:2240:1: rule__EffectOnCell__Group__12 : rule__EffectOnCell__Group__12__Impl rule__EffectOnCell__Group__13 ;
    public final void rule__EffectOnCell__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2244:1: ( rule__EffectOnCell__Group__12__Impl rule__EffectOnCell__Group__13 )
            // InternalBoardGameDL.g:2245:2: rule__EffectOnCell__Group__12__Impl rule__EffectOnCell__Group__13
            {
            pushFollow(FOLLOW_30);
            rule__EffectOnCell__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectOnCell__Group__13();

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
    // $ANTLR end "rule__EffectOnCell__Group__12"


    // $ANTLR start "rule__EffectOnCell__Group__12__Impl"
    // InternalBoardGameDL.g:2252:1: rule__EffectOnCell__Group__12__Impl : ( ')' ) ;
    public final void rule__EffectOnCell__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2256:1: ( ( ')' ) )
            // InternalBoardGameDL.g:2257:1: ( ')' )
            {
            // InternalBoardGameDL.g:2257:1: ( ')' )
            // InternalBoardGameDL.g:2258:2: ')'
            {
             before(grammarAccess.getEffectOnCellAccess().getRightParenthesisKeyword_12()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEffectOnCellAccess().getRightParenthesisKeyword_12()); 

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
    // $ANTLR end "rule__EffectOnCell__Group__12__Impl"


    // $ANTLR start "rule__EffectOnCell__Group__13"
    // InternalBoardGameDL.g:2267:1: rule__EffectOnCell__Group__13 : rule__EffectOnCell__Group__13__Impl ;
    public final void rule__EffectOnCell__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2271:1: ( rule__EffectOnCell__Group__13__Impl )
            // InternalBoardGameDL.g:2272:2: rule__EffectOnCell__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectOnCell__Group__13__Impl();

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
    // $ANTLR end "rule__EffectOnCell__Group__13"


    // $ANTLR start "rule__EffectOnCell__Group__13__Impl"
    // InternalBoardGameDL.g:2278:1: rule__EffectOnCell__Group__13__Impl : ( ')' ) ;
    public final void rule__EffectOnCell__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2282:1: ( ( ')' ) )
            // InternalBoardGameDL.g:2283:1: ( ')' )
            {
            // InternalBoardGameDL.g:2283:1: ( ')' )
            // InternalBoardGameDL.g:2284:2: ')'
            {
             before(grammarAccess.getEffectOnCellAccess().getRightParenthesisKeyword_13()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEffectOnCellAccess().getRightParenthesisKeyword_13()); 

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
    // $ANTLR end "rule__EffectOnCell__Group__13__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalBoardGameDL.g:2294:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2298:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalBoardGameDL.g:2299:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalBoardGameDL.g:2306:1: rule__Condition__Group__0__Impl : ( 'cellstate' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2310:1: ( ( 'cellstate' ) )
            // InternalBoardGameDL.g:2311:1: ( 'cellstate' )
            {
            // InternalBoardGameDL.g:2311:1: ( 'cellstate' )
            // InternalBoardGameDL.g:2312:2: 'cellstate'
            {
             before(grammarAccess.getConditionAccess().getCellstateKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getCellstateKeyword_0()); 

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
    // InternalBoardGameDL.g:2321:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2325:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalBoardGameDL.g:2326:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
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
    // InternalBoardGameDL.g:2333:1: rule__Condition__Group__1__Impl : ( '->' ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2337:1: ( ( '->' ) )
            // InternalBoardGameDL.g:2338:1: ( '->' )
            {
            // InternalBoardGameDL.g:2338:1: ( '->' )
            // InternalBoardGameDL.g:2339:2: '->'
            {
             before(grammarAccess.getConditionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

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
    // InternalBoardGameDL.g:2348:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2352:1: ( rule__Condition__Group__2__Impl )
            // InternalBoardGameDL.g:2353:2: rule__Condition__Group__2__Impl
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
    // InternalBoardGameDL.g:2359:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__CellstateAssignment_2 ) ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2363:1: ( ( ( rule__Condition__CellstateAssignment_2 ) ) )
            // InternalBoardGameDL.g:2364:1: ( ( rule__Condition__CellstateAssignment_2 ) )
            {
            // InternalBoardGameDL.g:2364:1: ( ( rule__Condition__CellstateAssignment_2 ) )
            // InternalBoardGameDL.g:2365:2: ( rule__Condition__CellstateAssignment_2 )
            {
             before(grammarAccess.getConditionAccess().getCellstateAssignment_2()); 
            // InternalBoardGameDL.g:2366:2: ( rule__Condition__CellstateAssignment_2 )
            // InternalBoardGameDL.g:2366:3: rule__Condition__CellstateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Condition__CellstateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getCellstateAssignment_2()); 

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


    // $ANTLR start "rule__InARow__Group__0"
    // InternalBoardGameDL.g:2375:1: rule__InARow__Group__0 : rule__InARow__Group__0__Impl rule__InARow__Group__1 ;
    public final void rule__InARow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2379:1: ( rule__InARow__Group__0__Impl rule__InARow__Group__1 )
            // InternalBoardGameDL.g:2380:2: rule__InARow__Group__0__Impl rule__InARow__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalBoardGameDL.g:2387:1: rule__InARow__Group__0__Impl : ( ( rule__InARow__HorizontalAssignment_0 ) ) ;
    public final void rule__InARow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2391:1: ( ( ( rule__InARow__HorizontalAssignment_0 ) ) )
            // InternalBoardGameDL.g:2392:1: ( ( rule__InARow__HorizontalAssignment_0 ) )
            {
            // InternalBoardGameDL.g:2392:1: ( ( rule__InARow__HorizontalAssignment_0 ) )
            // InternalBoardGameDL.g:2393:2: ( rule__InARow__HorizontalAssignment_0 )
            {
             before(grammarAccess.getInARowAccess().getHorizontalAssignment_0()); 
            // InternalBoardGameDL.g:2394:2: ( rule__InARow__HorizontalAssignment_0 )
            // InternalBoardGameDL.g:2394:3: rule__InARow__HorizontalAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__InARow__HorizontalAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInARowAccess().getHorizontalAssignment_0()); 

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
    // InternalBoardGameDL.g:2402:1: rule__InARow__Group__1 : rule__InARow__Group__1__Impl rule__InARow__Group__2 ;
    public final void rule__InARow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2406:1: ( rule__InARow__Group__1__Impl rule__InARow__Group__2 )
            // InternalBoardGameDL.g:2407:2: rule__InARow__Group__1__Impl rule__InARow__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalBoardGameDL.g:2414:1: rule__InARow__Group__1__Impl : ( ( rule__InARow__VerticalAssignment_1 ) ) ;
    public final void rule__InARow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2418:1: ( ( ( rule__InARow__VerticalAssignment_1 ) ) )
            // InternalBoardGameDL.g:2419:1: ( ( rule__InARow__VerticalAssignment_1 ) )
            {
            // InternalBoardGameDL.g:2419:1: ( ( rule__InARow__VerticalAssignment_1 ) )
            // InternalBoardGameDL.g:2420:2: ( rule__InARow__VerticalAssignment_1 )
            {
             before(grammarAccess.getInARowAccess().getVerticalAssignment_1()); 
            // InternalBoardGameDL.g:2421:2: ( rule__InARow__VerticalAssignment_1 )
            // InternalBoardGameDL.g:2421:3: rule__InARow__VerticalAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InARow__VerticalAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInARowAccess().getVerticalAssignment_1()); 

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
    // InternalBoardGameDL.g:2429:1: rule__InARow__Group__2 : rule__InARow__Group__2__Impl rule__InARow__Group__3 ;
    public final void rule__InARow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2433:1: ( rule__InARow__Group__2__Impl rule__InARow__Group__3 )
            // InternalBoardGameDL.g:2434:2: rule__InARow__Group__2__Impl rule__InARow__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalBoardGameDL.g:2441:1: rule__InARow__Group__2__Impl : ( ( rule__InARow__DiagonalAssignment_2 ) ) ;
    public final void rule__InARow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2445:1: ( ( ( rule__InARow__DiagonalAssignment_2 ) ) )
            // InternalBoardGameDL.g:2446:1: ( ( rule__InARow__DiagonalAssignment_2 ) )
            {
            // InternalBoardGameDL.g:2446:1: ( ( rule__InARow__DiagonalAssignment_2 ) )
            // InternalBoardGameDL.g:2447:2: ( rule__InARow__DiagonalAssignment_2 )
            {
             before(grammarAccess.getInARowAccess().getDiagonalAssignment_2()); 
            // InternalBoardGameDL.g:2448:2: ( rule__InARow__DiagonalAssignment_2 )
            // InternalBoardGameDL.g:2448:3: rule__InARow__DiagonalAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InARow__DiagonalAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInARowAccess().getDiagonalAssignment_2()); 

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
    // InternalBoardGameDL.g:2456:1: rule__InARow__Group__3 : rule__InARow__Group__3__Impl rule__InARow__Group__4 ;
    public final void rule__InARow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2460:1: ( rule__InARow__Group__3__Impl rule__InARow__Group__4 )
            // InternalBoardGameDL.g:2461:2: rule__InARow__Group__3__Impl rule__InARow__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalBoardGameDL.g:2468:1: rule__InARow__Group__3__Impl : ( 'count' ) ;
    public final void rule__InARow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2472:1: ( ( 'count' ) )
            // InternalBoardGameDL.g:2473:1: ( 'count' )
            {
            // InternalBoardGameDL.g:2473:1: ( 'count' )
            // InternalBoardGameDL.g:2474:2: 'count'
            {
             before(grammarAccess.getInARowAccess().getCountKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getInARowAccess().getCountKeyword_3()); 

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
    // InternalBoardGameDL.g:2483:1: rule__InARow__Group__4 : rule__InARow__Group__4__Impl ;
    public final void rule__InARow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2487:1: ( rule__InARow__Group__4__Impl )
            // InternalBoardGameDL.g:2488:2: rule__InARow__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InARow__Group__4__Impl();

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
    // InternalBoardGameDL.g:2494:1: rule__InARow__Group__4__Impl : ( ( rule__InARow__CountAssignment_4 ) ) ;
    public final void rule__InARow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2498:1: ( ( ( rule__InARow__CountAssignment_4 ) ) )
            // InternalBoardGameDL.g:2499:1: ( ( rule__InARow__CountAssignment_4 ) )
            {
            // InternalBoardGameDL.g:2499:1: ( ( rule__InARow__CountAssignment_4 ) )
            // InternalBoardGameDL.g:2500:2: ( rule__InARow__CountAssignment_4 )
            {
             before(grammarAccess.getInARowAccess().getCountAssignment_4()); 
            // InternalBoardGameDL.g:2501:2: ( rule__InARow__CountAssignment_4 )
            // InternalBoardGameDL.g:2501:3: rule__InARow__CountAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__InARow__CountAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInARowAccess().getCountAssignment_4()); 

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


    // $ANTLR start "rule__BoardGame__NameAssignment_1"
    // InternalBoardGameDL.g:2510:1: rule__BoardGame__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__BoardGame__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2514:1: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2515:2: ( ruleEString )
            {
            // InternalBoardGameDL.g:2515:2: ( ruleEString )
            // InternalBoardGameDL.g:2516:3: ruleEString
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
    // InternalBoardGameDL.g:2525:1: rule__BoardGame__SizeAssignment_3 : ( ruleEInt ) ;
    public final void rule__BoardGame__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2529:1: ( ( ruleEInt ) )
            // InternalBoardGameDL.g:2530:2: ( ruleEInt )
            {
            // InternalBoardGameDL.g:2530:2: ( ruleEInt )
            // InternalBoardGameDL.g:2531:3: ruleEInt
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


    // $ANTLR start "rule__BoardGame__PiecetypesAssignment_6"
    // InternalBoardGameDL.g:2540:1: rule__BoardGame__PiecetypesAssignment_6 : ( rulePieceType ) ;
    public final void rule__BoardGame__PiecetypesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2544:1: ( ( rulePieceType ) )
            // InternalBoardGameDL.g:2545:2: ( rulePieceType )
            {
            // InternalBoardGameDL.g:2545:2: ( rulePieceType )
            // InternalBoardGameDL.g:2546:3: rulePieceType
            {
             before(grammarAccess.getBoardGameAccess().getPiecetypesPieceTypeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePieceType();

            state._fsp--;

             after(grammarAccess.getBoardGameAccess().getPiecetypesPieceTypeParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__BoardGame__PiecetypesAssignment_6"


    // $ANTLR start "rule__BoardGame__PiecetypesAssignment_7_1"
    // InternalBoardGameDL.g:2555:1: rule__BoardGame__PiecetypesAssignment_7_1 : ( rulePieceType ) ;
    public final void rule__BoardGame__PiecetypesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2559:1: ( ( rulePieceType ) )
            // InternalBoardGameDL.g:2560:2: ( rulePieceType )
            {
            // InternalBoardGameDL.g:2560:2: ( rulePieceType )
            // InternalBoardGameDL.g:2561:3: rulePieceType
            {
             before(grammarAccess.getBoardGameAccess().getPiecetypesPieceTypeParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            rulePieceType();

            state._fsp--;

             after(grammarAccess.getBoardGameAccess().getPiecetypesPieceTypeParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__BoardGame__PiecetypesAssignment_7_1"


    // $ANTLR start "rule__BoardGame__CellstatesAssignment_9_2"
    // InternalBoardGameDL.g:2570:1: rule__BoardGame__CellstatesAssignment_9_2 : ( ruleCellState ) ;
    public final void rule__BoardGame__CellstatesAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2574:1: ( ( ruleCellState ) )
            // InternalBoardGameDL.g:2575:2: ( ruleCellState )
            {
            // InternalBoardGameDL.g:2575:2: ( ruleCellState )
            // InternalBoardGameDL.g:2576:3: ruleCellState
            {
             before(grammarAccess.getBoardGameAccess().getCellstatesCellStateParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCellState();

            state._fsp--;

             after(grammarAccess.getBoardGameAccess().getCellstatesCellStateParserRuleCall_9_2_0()); 

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
    // $ANTLR end "rule__BoardGame__CellstatesAssignment_9_2"


    // $ANTLR start "rule__BoardGame__CellstatesAssignment_9_3_1"
    // InternalBoardGameDL.g:2585:1: rule__BoardGame__CellstatesAssignment_9_3_1 : ( ruleCellState ) ;
    public final void rule__BoardGame__CellstatesAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2589:1: ( ( ruleCellState ) )
            // InternalBoardGameDL.g:2590:2: ( ruleCellState )
            {
            // InternalBoardGameDL.g:2590:2: ( ruleCellState )
            // InternalBoardGameDL.g:2591:3: ruleCellState
            {
             before(grammarAccess.getBoardGameAccess().getCellstatesCellStateParserRuleCall_9_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCellState();

            state._fsp--;

             after(grammarAccess.getBoardGameAccess().getCellstatesCellStateParserRuleCall_9_3_1_0()); 

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
    // $ANTLR end "rule__BoardGame__CellstatesAssignment_9_3_1"


    // $ANTLR start "rule__BoardGame__WinConditionsAssignment_12"
    // InternalBoardGameDL.g:2600:1: rule__BoardGame__WinConditionsAssignment_12 : ( ruleWinCondition ) ;
    public final void rule__BoardGame__WinConditionsAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2604:1: ( ( ruleWinCondition ) )
            // InternalBoardGameDL.g:2605:2: ( ruleWinCondition )
            {
            // InternalBoardGameDL.g:2605:2: ( ruleWinCondition )
            // InternalBoardGameDL.g:2606:3: ruleWinCondition
            {
             before(grammarAccess.getBoardGameAccess().getWinConditionsWinConditionParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleWinCondition();

            state._fsp--;

             after(grammarAccess.getBoardGameAccess().getWinConditionsWinConditionParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__BoardGame__WinConditionsAssignment_12"


    // $ANTLR start "rule__BoardGame__WinConditionsAssignment_13_1"
    // InternalBoardGameDL.g:2615:1: rule__BoardGame__WinConditionsAssignment_13_1 : ( ruleWinCondition ) ;
    public final void rule__BoardGame__WinConditionsAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2619:1: ( ( ruleWinCondition ) )
            // InternalBoardGameDL.g:2620:2: ( ruleWinCondition )
            {
            // InternalBoardGameDL.g:2620:2: ( ruleWinCondition )
            // InternalBoardGameDL.g:2621:3: ruleWinCondition
            {
             before(grammarAccess.getBoardGameAccess().getWinConditionsWinConditionParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWinCondition();

            state._fsp--;

             after(grammarAccess.getBoardGameAccess().getWinConditionsWinConditionParserRuleCall_13_1_0()); 

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
    // $ANTLR end "rule__BoardGame__WinConditionsAssignment_13_1"


    // $ANTLR start "rule__PieceType__NameAssignment_1"
    // InternalBoardGameDL.g:2630:1: rule__PieceType__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__PieceType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2634:1: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2635:2: ( ruleEString )
            {
            // InternalBoardGameDL.g:2635:2: ( ruleEString )
            // InternalBoardGameDL.g:2636:3: ruleEString
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


    // $ANTLR start "rule__PieceType__SymbolAssignment_3"
    // InternalBoardGameDL.g:2645:1: rule__PieceType__SymbolAssignment_3 : ( ruleEString ) ;
    public final void rule__PieceType__SymbolAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2649:1: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2650:2: ( ruleEString )
            {
            // InternalBoardGameDL.g:2650:2: ( ruleEString )
            // InternalBoardGameDL.g:2651:3: ruleEString
            {
             before(grammarAccess.getPieceTypeAccess().getSymbolEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPieceTypeAccess().getSymbolEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__PieceType__SymbolAssignment_3"


    // $ANTLR start "rule__PieceType__ValidmovesAssignment_6"
    // InternalBoardGameDL.g:2660:1: rule__PieceType__ValidmovesAssignment_6 : ( ruleValidMove ) ;
    public final void rule__PieceType__ValidmovesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2664:1: ( ( ruleValidMove ) )
            // InternalBoardGameDL.g:2665:2: ( ruleValidMove )
            {
            // InternalBoardGameDL.g:2665:2: ( ruleValidMove )
            // InternalBoardGameDL.g:2666:3: ruleValidMove
            {
             before(grammarAccess.getPieceTypeAccess().getValidmovesValidMoveParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleValidMove();

            state._fsp--;

             after(grammarAccess.getPieceTypeAccess().getValidmovesValidMoveParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__PieceType__ValidmovesAssignment_6"


    // $ANTLR start "rule__PieceType__ValidmovesAssignment_7_1"
    // InternalBoardGameDL.g:2675:1: rule__PieceType__ValidmovesAssignment_7_1 : ( ruleValidMove ) ;
    public final void rule__PieceType__ValidmovesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2679:1: ( ( ruleValidMove ) )
            // InternalBoardGameDL.g:2680:2: ( ruleValidMove )
            {
            // InternalBoardGameDL.g:2680:2: ( ruleValidMove )
            // InternalBoardGameDL.g:2681:3: ruleValidMove
            {
             before(grammarAccess.getPieceTypeAccess().getValidmovesValidMoveParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValidMove();

            state._fsp--;

             after(grammarAccess.getPieceTypeAccess().getValidmovesValidMoveParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__PieceType__ValidmovesAssignment_7_1"


    // $ANTLR start "rule__PieceType__EffectsoncellAssignment_9_2"
    // InternalBoardGameDL.g:2690:1: rule__PieceType__EffectsoncellAssignment_9_2 : ( ruleEffectOnCell ) ;
    public final void rule__PieceType__EffectsoncellAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2694:1: ( ( ruleEffectOnCell ) )
            // InternalBoardGameDL.g:2695:2: ( ruleEffectOnCell )
            {
            // InternalBoardGameDL.g:2695:2: ( ruleEffectOnCell )
            // InternalBoardGameDL.g:2696:3: ruleEffectOnCell
            {
             before(grammarAccess.getPieceTypeAccess().getEffectsoncellEffectOnCellParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectOnCell();

            state._fsp--;

             after(grammarAccess.getPieceTypeAccess().getEffectsoncellEffectOnCellParserRuleCall_9_2_0()); 

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
    // $ANTLR end "rule__PieceType__EffectsoncellAssignment_9_2"


    // $ANTLR start "rule__PieceType__EffectsoncellAssignment_9_3_1"
    // InternalBoardGameDL.g:2705:1: rule__PieceType__EffectsoncellAssignment_9_3_1 : ( ruleEffectOnCell ) ;
    public final void rule__PieceType__EffectsoncellAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2709:1: ( ( ruleEffectOnCell ) )
            // InternalBoardGameDL.g:2710:2: ( ruleEffectOnCell )
            {
            // InternalBoardGameDL.g:2710:2: ( ruleEffectOnCell )
            // InternalBoardGameDL.g:2711:3: ruleEffectOnCell
            {
             before(grammarAccess.getPieceTypeAccess().getEffectsoncellEffectOnCellParserRuleCall_9_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectOnCell();

            state._fsp--;

             after(grammarAccess.getPieceTypeAccess().getEffectsoncellEffectOnCellParserRuleCall_9_3_1_0()); 

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
    // $ANTLR end "rule__PieceType__EffectsoncellAssignment_9_3_1"


    // $ANTLR start "rule__CellState__NameAssignment"
    // InternalBoardGameDL.g:2720:1: rule__CellState__NameAssignment : ( RULE_ID ) ;
    public final void rule__CellState__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2724:1: ( ( RULE_ID ) )
            // InternalBoardGameDL.g:2725:2: ( RULE_ID )
            {
            // InternalBoardGameDL.g:2725:2: ( RULE_ID )
            // InternalBoardGameDL.g:2726:3: RULE_ID
            {
             before(grammarAccess.getCellStateAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCellStateAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__CellState__NameAssignment"


    // $ANTLR start "rule__WinCondition__InarowAssignment_1"
    // InternalBoardGameDL.g:2735:1: rule__WinCondition__InarowAssignment_1 : ( ruleInARow ) ;
    public final void rule__WinCondition__InarowAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2739:1: ( ( ruleInARow ) )
            // InternalBoardGameDL.g:2740:2: ( ruleInARow )
            {
            // InternalBoardGameDL.g:2740:2: ( ruleInARow )
            // InternalBoardGameDL.g:2741:3: ruleInARow
            {
             before(grammarAccess.getWinConditionAccess().getInarowInARowParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInARow();

            state._fsp--;

             after(grammarAccess.getWinConditionAccess().getInarowInARowParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__WinCondition__InarowAssignment_1"


    // $ANTLR start "rule__ValidMove__PlaceAnywhereAssignment_2"
    // InternalBoardGameDL.g:2750:1: rule__ValidMove__PlaceAnywhereAssignment_2 : ( ( 'placeAnywhere' ) ) ;
    public final void rule__ValidMove__PlaceAnywhereAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2754:1: ( ( ( 'placeAnywhere' ) ) )
            // InternalBoardGameDL.g:2755:2: ( ( 'placeAnywhere' ) )
            {
            // InternalBoardGameDL.g:2755:2: ( ( 'placeAnywhere' ) )
            // InternalBoardGameDL.g:2756:3: ( 'placeAnywhere' )
            {
             before(grammarAccess.getValidMoveAccess().getPlaceAnywherePlaceAnywhereKeyword_2_0()); 
            // InternalBoardGameDL.g:2757:3: ( 'placeAnywhere' )
            // InternalBoardGameDL.g:2758:4: 'placeAnywhere'
            {
             before(grammarAccess.getValidMoveAccess().getPlaceAnywherePlaceAnywhereKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getValidMoveAccess().getPlaceAnywherePlaceAnywhereKeyword_2_0()); 

            }

             after(grammarAccess.getValidMoveAccess().getPlaceAnywherePlaceAnywhereKeyword_2_0()); 

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
    // $ANTLR end "rule__ValidMove__PlaceAnywhereAssignment_2"


    // $ANTLR start "rule__ValidMove__ConditionsAssignment_3_1"
    // InternalBoardGameDL.g:2769:1: rule__ValidMove__ConditionsAssignment_3_1 : ( ruleCondition ) ;
    public final void rule__ValidMove__ConditionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2773:1: ( ( ruleCondition ) )
            // InternalBoardGameDL.g:2774:2: ( ruleCondition )
            {
            // InternalBoardGameDL.g:2774:2: ( ruleCondition )
            // InternalBoardGameDL.g:2775:3: ruleCondition
            {
             before(grammarAccess.getValidMoveAccess().getConditionsConditionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getValidMoveAccess().getConditionsConditionParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ValidMove__ConditionsAssignment_3_1"


    // $ANTLR start "rule__ValidMove__ConditionsAssignment_3_2_1"
    // InternalBoardGameDL.g:2784:1: rule__ValidMove__ConditionsAssignment_3_2_1 : ( ruleCondition ) ;
    public final void rule__ValidMove__ConditionsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2788:1: ( ( ruleCondition ) )
            // InternalBoardGameDL.g:2789:2: ( ruleCondition )
            {
            // InternalBoardGameDL.g:2789:2: ( ruleCondition )
            // InternalBoardGameDL.g:2790:3: ruleCondition
            {
             before(grammarAccess.getValidMoveAccess().getConditionsConditionParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getValidMoveAccess().getConditionsConditionParserRuleCall_3_2_1_0()); 

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
    // $ANTLR end "rule__ValidMove__ConditionsAssignment_3_2_1"


    // $ANTLR start "rule__EffectOnCell__XAssignment_5"
    // InternalBoardGameDL.g:2799:1: rule__EffectOnCell__XAssignment_5 : ( ruleEInt ) ;
    public final void rule__EffectOnCell__XAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2803:1: ( ( ruleEInt ) )
            // InternalBoardGameDL.g:2804:2: ( ruleEInt )
            {
            // InternalBoardGameDL.g:2804:2: ( ruleEInt )
            // InternalBoardGameDL.g:2805:3: ruleEInt
            {
             before(grammarAccess.getEffectOnCellAccess().getXEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEffectOnCellAccess().getXEIntParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__EffectOnCell__XAssignment_5"


    // $ANTLR start "rule__EffectOnCell__YAssignment_7"
    // InternalBoardGameDL.g:2814:1: rule__EffectOnCell__YAssignment_7 : ( ruleEInt ) ;
    public final void rule__EffectOnCell__YAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2818:1: ( ( ruleEInt ) )
            // InternalBoardGameDL.g:2819:2: ( ruleEInt )
            {
            // InternalBoardGameDL.g:2819:2: ( ruleEInt )
            // InternalBoardGameDL.g:2820:3: ruleEInt
            {
             before(grammarAccess.getEffectOnCellAccess().getYEIntParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEffectOnCellAccess().getYEIntParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__EffectOnCell__YAssignment_7"


    // $ANTLR start "rule__EffectOnCell__CellstateAssignment_11"
    // InternalBoardGameDL.g:2829:1: rule__EffectOnCell__CellstateAssignment_11 : ( ( ruleEString ) ) ;
    public final void rule__EffectOnCell__CellstateAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2833:1: ( ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:2834:2: ( ( ruleEString ) )
            {
            // InternalBoardGameDL.g:2834:2: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2835:3: ( ruleEString )
            {
             before(grammarAccess.getEffectOnCellAccess().getCellstateCellStateCrossReference_11_0()); 
            // InternalBoardGameDL.g:2836:3: ( ruleEString )
            // InternalBoardGameDL.g:2837:4: ruleEString
            {
             before(grammarAccess.getEffectOnCellAccess().getCellstateCellStateEStringParserRuleCall_11_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEffectOnCellAccess().getCellstateCellStateEStringParserRuleCall_11_0_1()); 

            }

             after(grammarAccess.getEffectOnCellAccess().getCellstateCellStateCrossReference_11_0()); 

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
    // $ANTLR end "rule__EffectOnCell__CellstateAssignment_11"


    // $ANTLR start "rule__Condition__CellstateAssignment_2"
    // InternalBoardGameDL.g:2848:1: rule__Condition__CellstateAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Condition__CellstateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2852:1: ( ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:2853:2: ( ( ruleEString ) )
            {
            // InternalBoardGameDL.g:2853:2: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2854:3: ( ruleEString )
            {
             before(grammarAccess.getConditionAccess().getCellstateCellStateCrossReference_2_0()); 
            // InternalBoardGameDL.g:2855:3: ( ruleEString )
            // InternalBoardGameDL.g:2856:4: ruleEString
            {
             before(grammarAccess.getConditionAccess().getCellstateCellStateEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getCellstateCellStateEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getConditionAccess().getCellstateCellStateCrossReference_2_0()); 

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
    // $ANTLR end "rule__Condition__CellstateAssignment_2"


    // $ANTLR start "rule__InARow__HorizontalAssignment_0"
    // InternalBoardGameDL.g:2867:1: rule__InARow__HorizontalAssignment_0 : ( ( 'horizontal' ) ) ;
    public final void rule__InARow__HorizontalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2871:1: ( ( ( 'horizontal' ) ) )
            // InternalBoardGameDL.g:2872:2: ( ( 'horizontal' ) )
            {
            // InternalBoardGameDL.g:2872:2: ( ( 'horizontal' ) )
            // InternalBoardGameDL.g:2873:3: ( 'horizontal' )
            {
             before(grammarAccess.getInARowAccess().getHorizontalHorizontalKeyword_0_0()); 
            // InternalBoardGameDL.g:2874:3: ( 'horizontal' )
            // InternalBoardGameDL.g:2875:4: 'horizontal'
            {
             before(grammarAccess.getInARowAccess().getHorizontalHorizontalKeyword_0_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getInARowAccess().getHorizontalHorizontalKeyword_0_0()); 

            }

             after(grammarAccess.getInARowAccess().getHorizontalHorizontalKeyword_0_0()); 

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
    // $ANTLR end "rule__InARow__HorizontalAssignment_0"


    // $ANTLR start "rule__InARow__VerticalAssignment_1"
    // InternalBoardGameDL.g:2886:1: rule__InARow__VerticalAssignment_1 : ( ( 'vertical' ) ) ;
    public final void rule__InARow__VerticalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2890:1: ( ( ( 'vertical' ) ) )
            // InternalBoardGameDL.g:2891:2: ( ( 'vertical' ) )
            {
            // InternalBoardGameDL.g:2891:2: ( ( 'vertical' ) )
            // InternalBoardGameDL.g:2892:3: ( 'vertical' )
            {
             before(grammarAccess.getInARowAccess().getVerticalVerticalKeyword_1_0()); 
            // InternalBoardGameDL.g:2893:3: ( 'vertical' )
            // InternalBoardGameDL.g:2894:4: 'vertical'
            {
             before(grammarAccess.getInARowAccess().getVerticalVerticalKeyword_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getInARowAccess().getVerticalVerticalKeyword_1_0()); 

            }

             after(grammarAccess.getInARowAccess().getVerticalVerticalKeyword_1_0()); 

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
    // $ANTLR end "rule__InARow__VerticalAssignment_1"


    // $ANTLR start "rule__InARow__DiagonalAssignment_2"
    // InternalBoardGameDL.g:2905:1: rule__InARow__DiagonalAssignment_2 : ( ( 'diagonal' ) ) ;
    public final void rule__InARow__DiagonalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2909:1: ( ( ( 'diagonal' ) ) )
            // InternalBoardGameDL.g:2910:2: ( ( 'diagonal' ) )
            {
            // InternalBoardGameDL.g:2910:2: ( ( 'diagonal' ) )
            // InternalBoardGameDL.g:2911:3: ( 'diagonal' )
            {
             before(grammarAccess.getInARowAccess().getDiagonalDiagonalKeyword_2_0()); 
            // InternalBoardGameDL.g:2912:3: ( 'diagonal' )
            // InternalBoardGameDL.g:2913:4: 'diagonal'
            {
             before(grammarAccess.getInARowAccess().getDiagonalDiagonalKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getInARowAccess().getDiagonalDiagonalKeyword_2_0()); 

            }

             after(grammarAccess.getInARowAccess().getDiagonalDiagonalKeyword_2_0()); 

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
    // $ANTLR end "rule__InARow__DiagonalAssignment_2"


    // $ANTLR start "rule__InARow__CountAssignment_4"
    // InternalBoardGameDL.g:2924:1: rule__InARow__CountAssignment_4 : ( ruleEInt ) ;
    public final void rule__InARow__CountAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2928:1: ( ( ruleEInt ) )
            // InternalBoardGameDL.g:2929:2: ( ruleEInt )
            {
            // InternalBoardGameDL.g:2929:2: ( ruleEInt )
            // InternalBoardGameDL.g:2930:3: ruleEInt
            {
             before(grammarAccess.getInARowAccess().getCountEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getInARowAccess().getCountEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__InARow__CountAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L});

}