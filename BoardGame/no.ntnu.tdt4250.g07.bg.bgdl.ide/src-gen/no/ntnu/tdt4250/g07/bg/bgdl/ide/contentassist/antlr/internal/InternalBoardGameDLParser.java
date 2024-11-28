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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Title'", "'BoardSize'", "'PieceType'", "'{'", "'Symbol'", "'ValidMoves'", "'['", "']'", "'}'", "','", "'EffectsOnCell'", "'Cellstate'", "'WinCondition'", "'-'", "'ValidMove'", "'valid'", "'if'", "'and'", "'EffectOnCell'", "'relativePosition'", "'('", "')'", "'newCellState'", "'Condition'", "'count'", "'placeAnywhere'", "'horizontal'", "'vertical'", "'diagonal'"
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


    // $ANTLR start "entryRuleInARow"
    // InternalBoardGameDL.g:303:1: entryRuleInARow : ruleInARow EOF ;
    public final void entryRuleInARow() throws RecognitionException {
        try {
            // InternalBoardGameDL.g:304:1: ( ruleInARow EOF )
            // InternalBoardGameDL.g:305:1: ruleInARow EOF
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
    // InternalBoardGameDL.g:312:1: ruleInARow : ( ( rule__InARow__UnorderedGroup ) ) ;
    public final void ruleInARow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:316:2: ( ( ( rule__InARow__UnorderedGroup ) ) )
            // InternalBoardGameDL.g:317:2: ( ( rule__InARow__UnorderedGroup ) )
            {
            // InternalBoardGameDL.g:317:2: ( ( rule__InARow__UnorderedGroup ) )
            // InternalBoardGameDL.g:318:3: ( rule__InARow__UnorderedGroup )
            {
             before(grammarAccess.getInARowAccess().getUnorderedGroup()); 
            // InternalBoardGameDL.g:319:3: ( rule__InARow__UnorderedGroup )
            // InternalBoardGameDL.g:319:4: rule__InARow__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__InARow__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getInARowAccess().getUnorderedGroup()); 

            }


            }

        }
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


    // $ANTLR start "rule__BoardGameElement__Alternatives"
    // InternalBoardGameDL.g:327:1: rule__BoardGameElement__Alternatives : ( ( rulePieceType ) | ( ruleEffectOnCell ) | ( ruleValidMove ) | ( ruleCellState ) | ( ruleWinCondition ) | ( ruleCondition ) );
    public final void rule__BoardGameElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:331:1: ( ( rulePieceType ) | ( ruleEffectOnCell ) | ( ruleValidMove ) | ( ruleCellState ) | ( ruleWinCondition ) | ( ruleCondition ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt1=1;
                }
                break;
            case 29:
                {
                alt1=2;
                }
                break;
            case 25:
                {
                alt1=3;
                }
                break;
            case 22:
                {
                alt1=4;
                }
                break;
            case 23:
                {
                alt1=5;
                }
                break;
            case 34:
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
                    // InternalBoardGameDL.g:332:2: ( rulePieceType )
                    {
                    // InternalBoardGameDL.g:332:2: ( rulePieceType )
                    // InternalBoardGameDL.g:333:3: rulePieceType
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
                    // InternalBoardGameDL.g:338:2: ( ruleEffectOnCell )
                    {
                    // InternalBoardGameDL.g:338:2: ( ruleEffectOnCell )
                    // InternalBoardGameDL.g:339:3: ruleEffectOnCell
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
                    // InternalBoardGameDL.g:344:2: ( ruleValidMove )
                    {
                    // InternalBoardGameDL.g:344:2: ( ruleValidMove )
                    // InternalBoardGameDL.g:345:3: ruleValidMove
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
                    // InternalBoardGameDL.g:350:2: ( ruleCellState )
                    {
                    // InternalBoardGameDL.g:350:2: ( ruleCellState )
                    // InternalBoardGameDL.g:351:3: ruleCellState
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
                    // InternalBoardGameDL.g:356:2: ( ruleWinCondition )
                    {
                    // InternalBoardGameDL.g:356:2: ( ruleWinCondition )
                    // InternalBoardGameDL.g:357:3: ruleWinCondition
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
                    // InternalBoardGameDL.g:362:2: ( ruleCondition )
                    {
                    // InternalBoardGameDL.g:362:2: ( ruleCondition )
                    // InternalBoardGameDL.g:363:3: ruleCondition
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
    // InternalBoardGameDL.g:372:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:376:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalBoardGameDL.g:377:2: ( RULE_STRING )
                    {
                    // InternalBoardGameDL.g:377:2: ( RULE_STRING )
                    // InternalBoardGameDL.g:378:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBoardGameDL.g:383:2: ( RULE_ID )
                    {
                    // InternalBoardGameDL.g:383:2: ( RULE_ID )
                    // InternalBoardGameDL.g:384:3: RULE_ID
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
    // InternalBoardGameDL.g:393:1: rule__BoardGame__Group__0 : rule__BoardGame__Group__0__Impl rule__BoardGame__Group__1 ;
    public final void rule__BoardGame__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:397:1: ( rule__BoardGame__Group__0__Impl rule__BoardGame__Group__1 )
            // InternalBoardGameDL.g:398:2: rule__BoardGame__Group__0__Impl rule__BoardGame__Group__1
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
    // InternalBoardGameDL.g:405:1: rule__BoardGame__Group__0__Impl : ( 'Title' ) ;
    public final void rule__BoardGame__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:409:1: ( ( 'Title' ) )
            // InternalBoardGameDL.g:410:1: ( 'Title' )
            {
            // InternalBoardGameDL.g:410:1: ( 'Title' )
            // InternalBoardGameDL.g:411:2: 'Title'
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
    // InternalBoardGameDL.g:420:1: rule__BoardGame__Group__1 : rule__BoardGame__Group__1__Impl rule__BoardGame__Group__2 ;
    public final void rule__BoardGame__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:424:1: ( rule__BoardGame__Group__1__Impl rule__BoardGame__Group__2 )
            // InternalBoardGameDL.g:425:2: rule__BoardGame__Group__1__Impl rule__BoardGame__Group__2
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
    // InternalBoardGameDL.g:432:1: rule__BoardGame__Group__1__Impl : ( ( rule__BoardGame__NameAssignment_1 ) ) ;
    public final void rule__BoardGame__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:436:1: ( ( ( rule__BoardGame__NameAssignment_1 ) ) )
            // InternalBoardGameDL.g:437:1: ( ( rule__BoardGame__NameAssignment_1 ) )
            {
            // InternalBoardGameDL.g:437:1: ( ( rule__BoardGame__NameAssignment_1 ) )
            // InternalBoardGameDL.g:438:2: ( rule__BoardGame__NameAssignment_1 )
            {
             before(grammarAccess.getBoardGameAccess().getNameAssignment_1()); 
            // InternalBoardGameDL.g:439:2: ( rule__BoardGame__NameAssignment_1 )
            // InternalBoardGameDL.g:439:3: rule__BoardGame__NameAssignment_1
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
    // InternalBoardGameDL.g:447:1: rule__BoardGame__Group__2 : rule__BoardGame__Group__2__Impl rule__BoardGame__Group__3 ;
    public final void rule__BoardGame__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:451:1: ( rule__BoardGame__Group__2__Impl rule__BoardGame__Group__3 )
            // InternalBoardGameDL.g:452:2: rule__BoardGame__Group__2__Impl rule__BoardGame__Group__3
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
    // InternalBoardGameDL.g:459:1: rule__BoardGame__Group__2__Impl : ( 'BoardSize' ) ;
    public final void rule__BoardGame__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:463:1: ( ( 'BoardSize' ) )
            // InternalBoardGameDL.g:464:1: ( 'BoardSize' )
            {
            // InternalBoardGameDL.g:464:1: ( 'BoardSize' )
            // InternalBoardGameDL.g:465:2: 'BoardSize'
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
    // InternalBoardGameDL.g:474:1: rule__BoardGame__Group__3 : rule__BoardGame__Group__3__Impl rule__BoardGame__Group__4 ;
    public final void rule__BoardGame__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:478:1: ( rule__BoardGame__Group__3__Impl rule__BoardGame__Group__4 )
            // InternalBoardGameDL.g:479:2: rule__BoardGame__Group__3__Impl rule__BoardGame__Group__4
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
    // InternalBoardGameDL.g:486:1: rule__BoardGame__Group__3__Impl : ( ( rule__BoardGame__SizeAssignment_3 ) ) ;
    public final void rule__BoardGame__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:490:1: ( ( ( rule__BoardGame__SizeAssignment_3 ) ) )
            // InternalBoardGameDL.g:491:1: ( ( rule__BoardGame__SizeAssignment_3 ) )
            {
            // InternalBoardGameDL.g:491:1: ( ( rule__BoardGame__SizeAssignment_3 ) )
            // InternalBoardGameDL.g:492:2: ( rule__BoardGame__SizeAssignment_3 )
            {
             before(grammarAccess.getBoardGameAccess().getSizeAssignment_3()); 
            // InternalBoardGameDL.g:493:2: ( rule__BoardGame__SizeAssignment_3 )
            // InternalBoardGameDL.g:493:3: rule__BoardGame__SizeAssignment_3
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
    // InternalBoardGameDL.g:501:1: rule__BoardGame__Group__4 : rule__BoardGame__Group__4__Impl ;
    public final void rule__BoardGame__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:505:1: ( rule__BoardGame__Group__4__Impl )
            // InternalBoardGameDL.g:506:2: rule__BoardGame__Group__4__Impl
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
    // InternalBoardGameDL.g:512:1: rule__BoardGame__Group__4__Impl : ( ( rule__BoardGame__BoardgameelementsAssignment_4 )* ) ;
    public final void rule__BoardGame__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:516:1: ( ( ( rule__BoardGame__BoardgameelementsAssignment_4 )* ) )
            // InternalBoardGameDL.g:517:1: ( ( rule__BoardGame__BoardgameelementsAssignment_4 )* )
            {
            // InternalBoardGameDL.g:517:1: ( ( rule__BoardGame__BoardgameelementsAssignment_4 )* )
            // InternalBoardGameDL.g:518:2: ( rule__BoardGame__BoardgameelementsAssignment_4 )*
            {
             before(grammarAccess.getBoardGameAccess().getBoardgameelementsAssignment_4()); 
            // InternalBoardGameDL.g:519:2: ( rule__BoardGame__BoardgameelementsAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13||(LA3_0>=22 && LA3_0<=23)||LA3_0==25||LA3_0==29||LA3_0==34) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBoardGameDL.g:519:3: rule__BoardGame__BoardgameelementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BoardGame__BoardgameelementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getBoardGameAccess().getBoardgameelementsAssignment_4()); 

            }


            }

        }
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
    // InternalBoardGameDL.g:528:1: rule__PieceType__Group__0 : rule__PieceType__Group__0__Impl rule__PieceType__Group__1 ;
    public final void rule__PieceType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:532:1: ( rule__PieceType__Group__0__Impl rule__PieceType__Group__1 )
            // InternalBoardGameDL.g:533:2: rule__PieceType__Group__0__Impl rule__PieceType__Group__1
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
    // InternalBoardGameDL.g:540:1: rule__PieceType__Group__0__Impl : ( 'PieceType' ) ;
    public final void rule__PieceType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:544:1: ( ( 'PieceType' ) )
            // InternalBoardGameDL.g:545:1: ( 'PieceType' )
            {
            // InternalBoardGameDL.g:545:1: ( 'PieceType' )
            // InternalBoardGameDL.g:546:2: 'PieceType'
            {
             before(grammarAccess.getPieceTypeAccess().getPieceTypeKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalBoardGameDL.g:555:1: rule__PieceType__Group__1 : rule__PieceType__Group__1__Impl rule__PieceType__Group__2 ;
    public final void rule__PieceType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:559:1: ( rule__PieceType__Group__1__Impl rule__PieceType__Group__2 )
            // InternalBoardGameDL.g:560:2: rule__PieceType__Group__1__Impl rule__PieceType__Group__2
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
    // InternalBoardGameDL.g:567:1: rule__PieceType__Group__1__Impl : ( ( rule__PieceType__NameAssignment_1 ) ) ;
    public final void rule__PieceType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:571:1: ( ( ( rule__PieceType__NameAssignment_1 ) ) )
            // InternalBoardGameDL.g:572:1: ( ( rule__PieceType__NameAssignment_1 ) )
            {
            // InternalBoardGameDL.g:572:1: ( ( rule__PieceType__NameAssignment_1 ) )
            // InternalBoardGameDL.g:573:2: ( rule__PieceType__NameAssignment_1 )
            {
             before(grammarAccess.getPieceTypeAccess().getNameAssignment_1()); 
            // InternalBoardGameDL.g:574:2: ( rule__PieceType__NameAssignment_1 )
            // InternalBoardGameDL.g:574:3: rule__PieceType__NameAssignment_1
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
    // InternalBoardGameDL.g:582:1: rule__PieceType__Group__2 : rule__PieceType__Group__2__Impl rule__PieceType__Group__3 ;
    public final void rule__PieceType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:586:1: ( rule__PieceType__Group__2__Impl rule__PieceType__Group__3 )
            // InternalBoardGameDL.g:587:2: rule__PieceType__Group__2__Impl rule__PieceType__Group__3
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
    // InternalBoardGameDL.g:594:1: rule__PieceType__Group__2__Impl : ( '{' ) ;
    public final void rule__PieceType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:598:1: ( ( '{' ) )
            // InternalBoardGameDL.g:599:1: ( '{' )
            {
            // InternalBoardGameDL.g:599:1: ( '{' )
            // InternalBoardGameDL.g:600:2: '{'
            {
             before(grammarAccess.getPieceTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalBoardGameDL.g:609:1: rule__PieceType__Group__3 : rule__PieceType__Group__3__Impl rule__PieceType__Group__4 ;
    public final void rule__PieceType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:613:1: ( rule__PieceType__Group__3__Impl rule__PieceType__Group__4 )
            // InternalBoardGameDL.g:614:2: rule__PieceType__Group__3__Impl rule__PieceType__Group__4
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
    // InternalBoardGameDL.g:621:1: rule__PieceType__Group__3__Impl : ( 'Symbol' ) ;
    public final void rule__PieceType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:625:1: ( ( 'Symbol' ) )
            // InternalBoardGameDL.g:626:1: ( 'Symbol' )
            {
            // InternalBoardGameDL.g:626:1: ( 'Symbol' )
            // InternalBoardGameDL.g:627:2: 'Symbol'
            {
             before(grammarAccess.getPieceTypeAccess().getSymbolKeyword_3()); 
            match(input,15,FOLLOW_2); 
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
    // InternalBoardGameDL.g:636:1: rule__PieceType__Group__4 : rule__PieceType__Group__4__Impl rule__PieceType__Group__5 ;
    public final void rule__PieceType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:640:1: ( rule__PieceType__Group__4__Impl rule__PieceType__Group__5 )
            // InternalBoardGameDL.g:641:2: rule__PieceType__Group__4__Impl rule__PieceType__Group__5
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
    // InternalBoardGameDL.g:648:1: rule__PieceType__Group__4__Impl : ( ( rule__PieceType__SymbolAssignment_4 ) ) ;
    public final void rule__PieceType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:652:1: ( ( ( rule__PieceType__SymbolAssignment_4 ) ) )
            // InternalBoardGameDL.g:653:1: ( ( rule__PieceType__SymbolAssignment_4 ) )
            {
            // InternalBoardGameDL.g:653:1: ( ( rule__PieceType__SymbolAssignment_4 ) )
            // InternalBoardGameDL.g:654:2: ( rule__PieceType__SymbolAssignment_4 )
            {
             before(grammarAccess.getPieceTypeAccess().getSymbolAssignment_4()); 
            // InternalBoardGameDL.g:655:2: ( rule__PieceType__SymbolAssignment_4 )
            // InternalBoardGameDL.g:655:3: rule__PieceType__SymbolAssignment_4
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
    // InternalBoardGameDL.g:663:1: rule__PieceType__Group__5 : rule__PieceType__Group__5__Impl rule__PieceType__Group__6 ;
    public final void rule__PieceType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:667:1: ( rule__PieceType__Group__5__Impl rule__PieceType__Group__6 )
            // InternalBoardGameDL.g:668:2: rule__PieceType__Group__5__Impl rule__PieceType__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalBoardGameDL.g:675:1: rule__PieceType__Group__5__Impl : ( 'ValidMoves' ) ;
    public final void rule__PieceType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:679:1: ( ( 'ValidMoves' ) )
            // InternalBoardGameDL.g:680:1: ( 'ValidMoves' )
            {
            // InternalBoardGameDL.g:680:1: ( 'ValidMoves' )
            // InternalBoardGameDL.g:681:2: 'ValidMoves'
            {
             before(grammarAccess.getPieceTypeAccess().getValidMovesKeyword_5()); 
            match(input,16,FOLLOW_2); 
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
    // InternalBoardGameDL.g:690:1: rule__PieceType__Group__6 : rule__PieceType__Group__6__Impl rule__PieceType__Group__7 ;
    public final void rule__PieceType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:694:1: ( rule__PieceType__Group__6__Impl rule__PieceType__Group__7 )
            // InternalBoardGameDL.g:695:2: rule__PieceType__Group__6__Impl rule__PieceType__Group__7
            {
            pushFollow(FOLLOW_3);
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
    // InternalBoardGameDL.g:702:1: rule__PieceType__Group__6__Impl : ( '[' ) ;
    public final void rule__PieceType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:706:1: ( ( '[' ) )
            // InternalBoardGameDL.g:707:1: ( '[' )
            {
            // InternalBoardGameDL.g:707:1: ( '[' )
            // InternalBoardGameDL.g:708:2: '['
            {
             before(grammarAccess.getPieceTypeAccess().getLeftSquareBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPieceTypeAccess().getLeftSquareBracketKeyword_6()); 

            }


            }

        }
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
    // InternalBoardGameDL.g:717:1: rule__PieceType__Group__7 : rule__PieceType__Group__7__Impl rule__PieceType__Group__8 ;
    public final void rule__PieceType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:721:1: ( rule__PieceType__Group__7__Impl rule__PieceType__Group__8 )
            // InternalBoardGameDL.g:722:2: rule__PieceType__Group__7__Impl rule__PieceType__Group__8
            {
            pushFollow(FOLLOW_12);
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
    // InternalBoardGameDL.g:729:1: rule__PieceType__Group__7__Impl : ( ( rule__PieceType__ValidmovesAssignment_7 ) ) ;
    public final void rule__PieceType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:733:1: ( ( ( rule__PieceType__ValidmovesAssignment_7 ) ) )
            // InternalBoardGameDL.g:734:1: ( ( rule__PieceType__ValidmovesAssignment_7 ) )
            {
            // InternalBoardGameDL.g:734:1: ( ( rule__PieceType__ValidmovesAssignment_7 ) )
            // InternalBoardGameDL.g:735:2: ( rule__PieceType__ValidmovesAssignment_7 )
            {
             before(grammarAccess.getPieceTypeAccess().getValidmovesAssignment_7()); 
            // InternalBoardGameDL.g:736:2: ( rule__PieceType__ValidmovesAssignment_7 )
            // InternalBoardGameDL.g:736:3: rule__PieceType__ValidmovesAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__ValidmovesAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPieceTypeAccess().getValidmovesAssignment_7()); 

            }


            }

        }
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
    // InternalBoardGameDL.g:744:1: rule__PieceType__Group__8 : rule__PieceType__Group__8__Impl rule__PieceType__Group__9 ;
    public final void rule__PieceType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:748:1: ( rule__PieceType__Group__8__Impl rule__PieceType__Group__9 )
            // InternalBoardGameDL.g:749:2: rule__PieceType__Group__8__Impl rule__PieceType__Group__9
            {
            pushFollow(FOLLOW_12);
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
    // InternalBoardGameDL.g:756:1: rule__PieceType__Group__8__Impl : ( ( rule__PieceType__Group_8__0 )* ) ;
    public final void rule__PieceType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:760:1: ( ( ( rule__PieceType__Group_8__0 )* ) )
            // InternalBoardGameDL.g:761:1: ( ( rule__PieceType__Group_8__0 )* )
            {
            // InternalBoardGameDL.g:761:1: ( ( rule__PieceType__Group_8__0 )* )
            // InternalBoardGameDL.g:762:2: ( rule__PieceType__Group_8__0 )*
            {
             before(grammarAccess.getPieceTypeAccess().getGroup_8()); 
            // InternalBoardGameDL.g:763:2: ( rule__PieceType__Group_8__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBoardGameDL.g:763:3: rule__PieceType__Group_8__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__PieceType__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalBoardGameDL.g:771:1: rule__PieceType__Group__9 : rule__PieceType__Group__9__Impl rule__PieceType__Group__10 ;
    public final void rule__PieceType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:775:1: ( rule__PieceType__Group__9__Impl rule__PieceType__Group__10 )
            // InternalBoardGameDL.g:776:2: rule__PieceType__Group__9__Impl rule__PieceType__Group__10
            {
            pushFollow(FOLLOW_14);
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
    // InternalBoardGameDL.g:783:1: rule__PieceType__Group__9__Impl : ( ']' ) ;
    public final void rule__PieceType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:787:1: ( ( ']' ) )
            // InternalBoardGameDL.g:788:1: ( ']' )
            {
            // InternalBoardGameDL.g:788:1: ( ']' )
            // InternalBoardGameDL.g:789:2: ']'
            {
             before(grammarAccess.getPieceTypeAccess().getRightSquareBracketKeyword_9()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPieceTypeAccess().getRightSquareBracketKeyword_9()); 

            }


            }

        }
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
    // InternalBoardGameDL.g:798:1: rule__PieceType__Group__10 : rule__PieceType__Group__10__Impl rule__PieceType__Group__11 ;
    public final void rule__PieceType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:802:1: ( rule__PieceType__Group__10__Impl rule__PieceType__Group__11 )
            // InternalBoardGameDL.g:803:2: rule__PieceType__Group__10__Impl rule__PieceType__Group__11
            {
            pushFollow(FOLLOW_14);
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
    // InternalBoardGameDL.g:810:1: rule__PieceType__Group__10__Impl : ( ( rule__PieceType__Group_10__0 )? ) ;
    public final void rule__PieceType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:814:1: ( ( ( rule__PieceType__Group_10__0 )? ) )
            // InternalBoardGameDL.g:815:1: ( ( rule__PieceType__Group_10__0 )? )
            {
            // InternalBoardGameDL.g:815:1: ( ( rule__PieceType__Group_10__0 )? )
            // InternalBoardGameDL.g:816:2: ( rule__PieceType__Group_10__0 )?
            {
             before(grammarAccess.getPieceTypeAccess().getGroup_10()); 
            // InternalBoardGameDL.g:817:2: ( rule__PieceType__Group_10__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBoardGameDL.g:817:3: rule__PieceType__Group_10__0
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
    // InternalBoardGameDL.g:825:1: rule__PieceType__Group__11 : rule__PieceType__Group__11__Impl ;
    public final void rule__PieceType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:829:1: ( rule__PieceType__Group__11__Impl )
            // InternalBoardGameDL.g:830:2: rule__PieceType__Group__11__Impl
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
    // InternalBoardGameDL.g:836:1: rule__PieceType__Group__11__Impl : ( '}' ) ;
    public final void rule__PieceType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:840:1: ( ( '}' ) )
            // InternalBoardGameDL.g:841:1: ( '}' )
            {
            // InternalBoardGameDL.g:841:1: ( '}' )
            // InternalBoardGameDL.g:842:2: '}'
            {
             before(grammarAccess.getPieceTypeAccess().getRightCurlyBracketKeyword_11()); 
            match(input,19,FOLLOW_2); 
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
    // InternalBoardGameDL.g:852:1: rule__PieceType__Group_8__0 : rule__PieceType__Group_8__0__Impl rule__PieceType__Group_8__1 ;
    public final void rule__PieceType__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:856:1: ( rule__PieceType__Group_8__0__Impl rule__PieceType__Group_8__1 )
            // InternalBoardGameDL.g:857:2: rule__PieceType__Group_8__0__Impl rule__PieceType__Group_8__1
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
    // InternalBoardGameDL.g:864:1: rule__PieceType__Group_8__0__Impl : ( ',' ) ;
    public final void rule__PieceType__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:868:1: ( ( ',' ) )
            // InternalBoardGameDL.g:869:1: ( ',' )
            {
            // InternalBoardGameDL.g:869:1: ( ',' )
            // InternalBoardGameDL.g:870:2: ','
            {
             before(grammarAccess.getPieceTypeAccess().getCommaKeyword_8_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBoardGameDL.g:879:1: rule__PieceType__Group_8__1 : rule__PieceType__Group_8__1__Impl ;
    public final void rule__PieceType__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:883:1: ( rule__PieceType__Group_8__1__Impl )
            // InternalBoardGameDL.g:884:2: rule__PieceType__Group_8__1__Impl
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
    // InternalBoardGameDL.g:890:1: rule__PieceType__Group_8__1__Impl : ( ( rule__PieceType__ValidmovesAssignment_8_1 ) ) ;
    public final void rule__PieceType__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:894:1: ( ( ( rule__PieceType__ValidmovesAssignment_8_1 ) ) )
            // InternalBoardGameDL.g:895:1: ( ( rule__PieceType__ValidmovesAssignment_8_1 ) )
            {
            // InternalBoardGameDL.g:895:1: ( ( rule__PieceType__ValidmovesAssignment_8_1 ) )
            // InternalBoardGameDL.g:896:2: ( rule__PieceType__ValidmovesAssignment_8_1 )
            {
             before(grammarAccess.getPieceTypeAccess().getValidmovesAssignment_8_1()); 
            // InternalBoardGameDL.g:897:2: ( rule__PieceType__ValidmovesAssignment_8_1 )
            // InternalBoardGameDL.g:897:3: rule__PieceType__ValidmovesAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__ValidmovesAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getPieceTypeAccess().getValidmovesAssignment_8_1()); 

            }


            }

        }
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
    // InternalBoardGameDL.g:906:1: rule__PieceType__Group_10__0 : rule__PieceType__Group_10__0__Impl rule__PieceType__Group_10__1 ;
    public final void rule__PieceType__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:910:1: ( rule__PieceType__Group_10__0__Impl rule__PieceType__Group_10__1 )
            // InternalBoardGameDL.g:911:2: rule__PieceType__Group_10__0__Impl rule__PieceType__Group_10__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalBoardGameDL.g:918:1: rule__PieceType__Group_10__0__Impl : ( 'EffectsOnCell' ) ;
    public final void rule__PieceType__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:922:1: ( ( 'EffectsOnCell' ) )
            // InternalBoardGameDL.g:923:1: ( 'EffectsOnCell' )
            {
            // InternalBoardGameDL.g:923:1: ( 'EffectsOnCell' )
            // InternalBoardGameDL.g:924:2: 'EffectsOnCell'
            {
             before(grammarAccess.getPieceTypeAccess().getEffectsOnCellKeyword_10_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPieceTypeAccess().getEffectsOnCellKeyword_10_0()); 

            }


            }

        }
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
    // InternalBoardGameDL.g:933:1: rule__PieceType__Group_10__1 : rule__PieceType__Group_10__1__Impl rule__PieceType__Group_10__2 ;
    public final void rule__PieceType__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:937:1: ( rule__PieceType__Group_10__1__Impl rule__PieceType__Group_10__2 )
            // InternalBoardGameDL.g:938:2: rule__PieceType__Group_10__1__Impl rule__PieceType__Group_10__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalBoardGameDL.g:945:1: rule__PieceType__Group_10__1__Impl : ( '[' ) ;
    public final void rule__PieceType__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:949:1: ( ( '[' ) )
            // InternalBoardGameDL.g:950:1: ( '[' )
            {
            // InternalBoardGameDL.g:950:1: ( '[' )
            // InternalBoardGameDL.g:951:2: '['
            {
             before(grammarAccess.getPieceTypeAccess().getLeftSquareBracketKeyword_10_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPieceTypeAccess().getLeftSquareBracketKeyword_10_1()); 

            }


            }

        }
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
    // InternalBoardGameDL.g:960:1: rule__PieceType__Group_10__2 : rule__PieceType__Group_10__2__Impl rule__PieceType__Group_10__3 ;
    public final void rule__PieceType__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:964:1: ( rule__PieceType__Group_10__2__Impl rule__PieceType__Group_10__3 )
            // InternalBoardGameDL.g:965:2: rule__PieceType__Group_10__2__Impl rule__PieceType__Group_10__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalBoardGameDL.g:972:1: rule__PieceType__Group_10__2__Impl : ( ( rule__PieceType__EffectsoncellAssignment_10_2 ) ) ;
    public final void rule__PieceType__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:976:1: ( ( ( rule__PieceType__EffectsoncellAssignment_10_2 ) ) )
            // InternalBoardGameDL.g:977:1: ( ( rule__PieceType__EffectsoncellAssignment_10_2 ) )
            {
            // InternalBoardGameDL.g:977:1: ( ( rule__PieceType__EffectsoncellAssignment_10_2 ) )
            // InternalBoardGameDL.g:978:2: ( rule__PieceType__EffectsoncellAssignment_10_2 )
            {
             before(grammarAccess.getPieceTypeAccess().getEffectsoncellAssignment_10_2()); 
            // InternalBoardGameDL.g:979:2: ( rule__PieceType__EffectsoncellAssignment_10_2 )
            // InternalBoardGameDL.g:979:3: rule__PieceType__EffectsoncellAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__EffectsoncellAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getPieceTypeAccess().getEffectsoncellAssignment_10_2()); 

            }


            }

        }
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
    // InternalBoardGameDL.g:987:1: rule__PieceType__Group_10__3 : rule__PieceType__Group_10__3__Impl rule__PieceType__Group_10__4 ;
    public final void rule__PieceType__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:991:1: ( rule__PieceType__Group_10__3__Impl rule__PieceType__Group_10__4 )
            // InternalBoardGameDL.g:992:2: rule__PieceType__Group_10__3__Impl rule__PieceType__Group_10__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalBoardGameDL.g:999:1: rule__PieceType__Group_10__3__Impl : ( ( rule__PieceType__Group_10_3__0 )* ) ;
    public final void rule__PieceType__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1003:1: ( ( ( rule__PieceType__Group_10_3__0 )* ) )
            // InternalBoardGameDL.g:1004:1: ( ( rule__PieceType__Group_10_3__0 )* )
            {
            // InternalBoardGameDL.g:1004:1: ( ( rule__PieceType__Group_10_3__0 )* )
            // InternalBoardGameDL.g:1005:2: ( rule__PieceType__Group_10_3__0 )*
            {
             before(grammarAccess.getPieceTypeAccess().getGroup_10_3()); 
            // InternalBoardGameDL.g:1006:2: ( rule__PieceType__Group_10_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBoardGameDL.g:1006:3: rule__PieceType__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__PieceType__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalBoardGameDL.g:1014:1: rule__PieceType__Group_10__4 : rule__PieceType__Group_10__4__Impl ;
    public final void rule__PieceType__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1018:1: ( rule__PieceType__Group_10__4__Impl )
            // InternalBoardGameDL.g:1019:2: rule__PieceType__Group_10__4__Impl
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
    // InternalBoardGameDL.g:1025:1: rule__PieceType__Group_10__4__Impl : ( ']' ) ;
    public final void rule__PieceType__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1029:1: ( ( ']' ) )
            // InternalBoardGameDL.g:1030:1: ( ']' )
            {
            // InternalBoardGameDL.g:1030:1: ( ']' )
            // InternalBoardGameDL.g:1031:2: ']'
            {
             before(grammarAccess.getPieceTypeAccess().getRightSquareBracketKeyword_10_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPieceTypeAccess().getRightSquareBracketKeyword_10_4()); 

            }


            }

        }
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
    // InternalBoardGameDL.g:1041:1: rule__PieceType__Group_10_3__0 : rule__PieceType__Group_10_3__0__Impl rule__PieceType__Group_10_3__1 ;
    public final void rule__PieceType__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1045:1: ( rule__PieceType__Group_10_3__0__Impl rule__PieceType__Group_10_3__1 )
            // InternalBoardGameDL.g:1046:2: rule__PieceType__Group_10_3__0__Impl rule__PieceType__Group_10_3__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalBoardGameDL.g:1053:1: rule__PieceType__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__PieceType__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1057:1: ( ( ',' ) )
            // InternalBoardGameDL.g:1058:1: ( ',' )
            {
            // InternalBoardGameDL.g:1058:1: ( ',' )
            // InternalBoardGameDL.g:1059:2: ','
            {
             before(grammarAccess.getPieceTypeAccess().getCommaKeyword_10_3_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1068:1: rule__PieceType__Group_10_3__1 : rule__PieceType__Group_10_3__1__Impl ;
    public final void rule__PieceType__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1072:1: ( rule__PieceType__Group_10_3__1__Impl )
            // InternalBoardGameDL.g:1073:2: rule__PieceType__Group_10_3__1__Impl
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
    // InternalBoardGameDL.g:1079:1: rule__PieceType__Group_10_3__1__Impl : ( ( rule__PieceType__EffectsoncellAssignment_10_3_1 ) ) ;
    public final void rule__PieceType__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1083:1: ( ( ( rule__PieceType__EffectsoncellAssignment_10_3_1 ) ) )
            // InternalBoardGameDL.g:1084:1: ( ( rule__PieceType__EffectsoncellAssignment_10_3_1 ) )
            {
            // InternalBoardGameDL.g:1084:1: ( ( rule__PieceType__EffectsoncellAssignment_10_3_1 ) )
            // InternalBoardGameDL.g:1085:2: ( rule__PieceType__EffectsoncellAssignment_10_3_1 )
            {
             before(grammarAccess.getPieceTypeAccess().getEffectsoncellAssignment_10_3_1()); 
            // InternalBoardGameDL.g:1086:2: ( rule__PieceType__EffectsoncellAssignment_10_3_1 )
            // InternalBoardGameDL.g:1086:3: rule__PieceType__EffectsoncellAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__EffectsoncellAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPieceTypeAccess().getEffectsoncellAssignment_10_3_1()); 

            }


            }

        }
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
    // InternalBoardGameDL.g:1095:1: rule__CellState__Group__0 : rule__CellState__Group__0__Impl rule__CellState__Group__1 ;
    public final void rule__CellState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1099:1: ( rule__CellState__Group__0__Impl rule__CellState__Group__1 )
            // InternalBoardGameDL.g:1100:2: rule__CellState__Group__0__Impl rule__CellState__Group__1
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
    // InternalBoardGameDL.g:1107:1: rule__CellState__Group__0__Impl : ( 'Cellstate' ) ;
    public final void rule__CellState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1111:1: ( ( 'Cellstate' ) )
            // InternalBoardGameDL.g:1112:1: ( 'Cellstate' )
            {
            // InternalBoardGameDL.g:1112:1: ( 'Cellstate' )
            // InternalBoardGameDL.g:1113:2: 'Cellstate'
            {
             before(grammarAccess.getCellStateAccess().getCellstateKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1122:1: rule__CellState__Group__1 : rule__CellState__Group__1__Impl ;
    public final void rule__CellState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1126:1: ( rule__CellState__Group__1__Impl )
            // InternalBoardGameDL.g:1127:2: rule__CellState__Group__1__Impl
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
    // InternalBoardGameDL.g:1133:1: rule__CellState__Group__1__Impl : ( ( rule__CellState__NameAssignment_1 ) ) ;
    public final void rule__CellState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1137:1: ( ( ( rule__CellState__NameAssignment_1 ) ) )
            // InternalBoardGameDL.g:1138:1: ( ( rule__CellState__NameAssignment_1 ) )
            {
            // InternalBoardGameDL.g:1138:1: ( ( rule__CellState__NameAssignment_1 ) )
            // InternalBoardGameDL.g:1139:2: ( rule__CellState__NameAssignment_1 )
            {
             before(grammarAccess.getCellStateAccess().getNameAssignment_1()); 
            // InternalBoardGameDL.g:1140:2: ( rule__CellState__NameAssignment_1 )
            // InternalBoardGameDL.g:1140:3: rule__CellState__NameAssignment_1
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
    // InternalBoardGameDL.g:1149:1: rule__WinCondition__Group__0 : rule__WinCondition__Group__0__Impl rule__WinCondition__Group__1 ;
    public final void rule__WinCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1153:1: ( rule__WinCondition__Group__0__Impl rule__WinCondition__Group__1 )
            // InternalBoardGameDL.g:1154:2: rule__WinCondition__Group__0__Impl rule__WinCondition__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBoardGameDL.g:1161:1: rule__WinCondition__Group__0__Impl : ( 'WinCondition' ) ;
    public final void rule__WinCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1165:1: ( ( 'WinCondition' ) )
            // InternalBoardGameDL.g:1166:1: ( 'WinCondition' )
            {
            // InternalBoardGameDL.g:1166:1: ( 'WinCondition' )
            // InternalBoardGameDL.g:1167:2: 'WinCondition'
            {
             before(grammarAccess.getWinConditionAccess().getWinConditionKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1176:1: rule__WinCondition__Group__1 : rule__WinCondition__Group__1__Impl ;
    public final void rule__WinCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1180:1: ( rule__WinCondition__Group__1__Impl )
            // InternalBoardGameDL.g:1181:2: rule__WinCondition__Group__1__Impl
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
    // InternalBoardGameDL.g:1187:1: rule__WinCondition__Group__1__Impl : ( ( rule__WinCondition__InarowAssignment_1 ) ) ;
    public final void rule__WinCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1191:1: ( ( ( rule__WinCondition__InarowAssignment_1 ) ) )
            // InternalBoardGameDL.g:1192:1: ( ( rule__WinCondition__InarowAssignment_1 ) )
            {
            // InternalBoardGameDL.g:1192:1: ( ( rule__WinCondition__InarowAssignment_1 ) )
            // InternalBoardGameDL.g:1193:2: ( rule__WinCondition__InarowAssignment_1 )
            {
             before(grammarAccess.getWinConditionAccess().getInarowAssignment_1()); 
            // InternalBoardGameDL.g:1194:2: ( rule__WinCondition__InarowAssignment_1 )
            // InternalBoardGameDL.g:1194:3: rule__WinCondition__InarowAssignment_1
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
    // InternalBoardGameDL.g:1203:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1207:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalBoardGameDL.g:1208:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalBoardGameDL.g:1215:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1219:1: ( ( ( '-' )? ) )
            // InternalBoardGameDL.g:1220:1: ( ( '-' )? )
            {
            // InternalBoardGameDL.g:1220:1: ( ( '-' )? )
            // InternalBoardGameDL.g:1221:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalBoardGameDL.g:1222:2: ( '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBoardGameDL.g:1222:3: '-'
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
    // InternalBoardGameDL.g:1230:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1234:1: ( rule__EInt__Group__1__Impl )
            // InternalBoardGameDL.g:1235:2: rule__EInt__Group__1__Impl
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
    // InternalBoardGameDL.g:1241:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1245:1: ( ( RULE_INT ) )
            // InternalBoardGameDL.g:1246:1: ( RULE_INT )
            {
            // InternalBoardGameDL.g:1246:1: ( RULE_INT )
            // InternalBoardGameDL.g:1247:2: RULE_INT
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
    // InternalBoardGameDL.g:1257:1: rule__ValidMove__Group__0 : rule__ValidMove__Group__0__Impl rule__ValidMove__Group__1 ;
    public final void rule__ValidMove__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1261:1: ( rule__ValidMove__Group__0__Impl rule__ValidMove__Group__1 )
            // InternalBoardGameDL.g:1262:2: rule__ValidMove__Group__0__Impl rule__ValidMove__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalBoardGameDL.g:1269:1: rule__ValidMove__Group__0__Impl : ( 'ValidMove' ) ;
    public final void rule__ValidMove__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1273:1: ( ( 'ValidMove' ) )
            // InternalBoardGameDL.g:1274:1: ( 'ValidMove' )
            {
            // InternalBoardGameDL.g:1274:1: ( 'ValidMove' )
            // InternalBoardGameDL.g:1275:2: 'ValidMove'
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
    // InternalBoardGameDL.g:1284:1: rule__ValidMove__Group__1 : rule__ValidMove__Group__1__Impl rule__ValidMove__Group__2 ;
    public final void rule__ValidMove__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1288:1: ( rule__ValidMove__Group__1__Impl rule__ValidMove__Group__2 )
            // InternalBoardGameDL.g:1289:2: rule__ValidMove__Group__1__Impl rule__ValidMove__Group__2
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
    // InternalBoardGameDL.g:1296:1: rule__ValidMove__Group__1__Impl : ( ( rule__ValidMove__NameAssignment_1 ) ) ;
    public final void rule__ValidMove__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1300:1: ( ( ( rule__ValidMove__NameAssignment_1 ) ) )
            // InternalBoardGameDL.g:1301:1: ( ( rule__ValidMove__NameAssignment_1 ) )
            {
            // InternalBoardGameDL.g:1301:1: ( ( rule__ValidMove__NameAssignment_1 ) )
            // InternalBoardGameDL.g:1302:2: ( rule__ValidMove__NameAssignment_1 )
            {
             before(grammarAccess.getValidMoveAccess().getNameAssignment_1()); 
            // InternalBoardGameDL.g:1303:2: ( rule__ValidMove__NameAssignment_1 )
            // InternalBoardGameDL.g:1303:3: rule__ValidMove__NameAssignment_1
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
    // InternalBoardGameDL.g:1311:1: rule__ValidMove__Group__2 : rule__ValidMove__Group__2__Impl rule__ValidMove__Group__3 ;
    public final void rule__ValidMove__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1315:1: ( rule__ValidMove__Group__2__Impl rule__ValidMove__Group__3 )
            // InternalBoardGameDL.g:1316:2: rule__ValidMove__Group__2__Impl rule__ValidMove__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalBoardGameDL.g:1323:1: rule__ValidMove__Group__2__Impl : ( '{' ) ;
    public final void rule__ValidMove__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1327:1: ( ( '{' ) )
            // InternalBoardGameDL.g:1328:1: ( '{' )
            {
            // InternalBoardGameDL.g:1328:1: ( '{' )
            // InternalBoardGameDL.g:1329:2: '{'
            {
             before(grammarAccess.getValidMoveAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1338:1: rule__ValidMove__Group__3 : rule__ValidMove__Group__3__Impl rule__ValidMove__Group__4 ;
    public final void rule__ValidMove__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1342:1: ( rule__ValidMove__Group__3__Impl rule__ValidMove__Group__4 )
            // InternalBoardGameDL.g:1343:2: rule__ValidMove__Group__3__Impl rule__ValidMove__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalBoardGameDL.g:1350:1: rule__ValidMove__Group__3__Impl : ( ( rule__ValidMove__PlaceAnywhereAssignment_3 ) ) ;
    public final void rule__ValidMove__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1354:1: ( ( ( rule__ValidMove__PlaceAnywhereAssignment_3 ) ) )
            // InternalBoardGameDL.g:1355:1: ( ( rule__ValidMove__PlaceAnywhereAssignment_3 ) )
            {
            // InternalBoardGameDL.g:1355:1: ( ( rule__ValidMove__PlaceAnywhereAssignment_3 ) )
            // InternalBoardGameDL.g:1356:2: ( rule__ValidMove__PlaceAnywhereAssignment_3 )
            {
             before(grammarAccess.getValidMoveAccess().getPlaceAnywhereAssignment_3()); 
            // InternalBoardGameDL.g:1357:2: ( rule__ValidMove__PlaceAnywhereAssignment_3 )
            // InternalBoardGameDL.g:1357:3: rule__ValidMove__PlaceAnywhereAssignment_3
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
    // InternalBoardGameDL.g:1365:1: rule__ValidMove__Group__4 : rule__ValidMove__Group__4__Impl rule__ValidMove__Group__5 ;
    public final void rule__ValidMove__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1369:1: ( rule__ValidMove__Group__4__Impl rule__ValidMove__Group__5 )
            // InternalBoardGameDL.g:1370:2: rule__ValidMove__Group__4__Impl rule__ValidMove__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalBoardGameDL.g:1377:1: rule__ValidMove__Group__4__Impl : ( ( rule__ValidMove__Group_4__0 )? ) ;
    public final void rule__ValidMove__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1381:1: ( ( ( rule__ValidMove__Group_4__0 )? ) )
            // InternalBoardGameDL.g:1382:1: ( ( rule__ValidMove__Group_4__0 )? )
            {
            // InternalBoardGameDL.g:1382:1: ( ( rule__ValidMove__Group_4__0 )? )
            // InternalBoardGameDL.g:1383:2: ( rule__ValidMove__Group_4__0 )?
            {
             before(grammarAccess.getValidMoveAccess().getGroup_4()); 
            // InternalBoardGameDL.g:1384:2: ( rule__ValidMove__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBoardGameDL.g:1384:3: rule__ValidMove__Group_4__0
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
    // InternalBoardGameDL.g:1392:1: rule__ValidMove__Group__5 : rule__ValidMove__Group__5__Impl ;
    public final void rule__ValidMove__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1396:1: ( rule__ValidMove__Group__5__Impl )
            // InternalBoardGameDL.g:1397:2: rule__ValidMove__Group__5__Impl
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
    // InternalBoardGameDL.g:1403:1: rule__ValidMove__Group__5__Impl : ( '}' ) ;
    public final void rule__ValidMove__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1407:1: ( ( '}' ) )
            // InternalBoardGameDL.g:1408:1: ( '}' )
            {
            // InternalBoardGameDL.g:1408:1: ( '}' )
            // InternalBoardGameDL.g:1409:2: '}'
            {
             before(grammarAccess.getValidMoveAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1419:1: rule__ValidMove__Group_4__0 : rule__ValidMove__Group_4__0__Impl rule__ValidMove__Group_4__1 ;
    public final void rule__ValidMove__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1423:1: ( rule__ValidMove__Group_4__0__Impl rule__ValidMove__Group_4__1 )
            // InternalBoardGameDL.g:1424:2: rule__ValidMove__Group_4__0__Impl rule__ValidMove__Group_4__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalBoardGameDL.g:1431:1: rule__ValidMove__Group_4__0__Impl : ( 'valid' ) ;
    public final void rule__ValidMove__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1435:1: ( ( 'valid' ) )
            // InternalBoardGameDL.g:1436:1: ( 'valid' )
            {
            // InternalBoardGameDL.g:1436:1: ( 'valid' )
            // InternalBoardGameDL.g:1437:2: 'valid'
            {
             before(grammarAccess.getValidMoveAccess().getValidKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1446:1: rule__ValidMove__Group_4__1 : rule__ValidMove__Group_4__1__Impl rule__ValidMove__Group_4__2 ;
    public final void rule__ValidMove__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1450:1: ( rule__ValidMove__Group_4__1__Impl rule__ValidMove__Group_4__2 )
            // InternalBoardGameDL.g:1451:2: rule__ValidMove__Group_4__1__Impl rule__ValidMove__Group_4__2
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
    // InternalBoardGameDL.g:1458:1: rule__ValidMove__Group_4__1__Impl : ( 'if' ) ;
    public final void rule__ValidMove__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1462:1: ( ( 'if' ) )
            // InternalBoardGameDL.g:1463:1: ( 'if' )
            {
            // InternalBoardGameDL.g:1463:1: ( 'if' )
            // InternalBoardGameDL.g:1464:2: 'if'
            {
             before(grammarAccess.getValidMoveAccess().getIfKeyword_4_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1473:1: rule__ValidMove__Group_4__2 : rule__ValidMove__Group_4__2__Impl rule__ValidMove__Group_4__3 ;
    public final void rule__ValidMove__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1477:1: ( rule__ValidMove__Group_4__2__Impl rule__ValidMove__Group_4__3 )
            // InternalBoardGameDL.g:1478:2: rule__ValidMove__Group_4__2__Impl rule__ValidMove__Group_4__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalBoardGameDL.g:1485:1: rule__ValidMove__Group_4__2__Impl : ( ( rule__ValidMove__ConditionsAssignment_4_2 ) ) ;
    public final void rule__ValidMove__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1489:1: ( ( ( rule__ValidMove__ConditionsAssignment_4_2 ) ) )
            // InternalBoardGameDL.g:1490:1: ( ( rule__ValidMove__ConditionsAssignment_4_2 ) )
            {
            // InternalBoardGameDL.g:1490:1: ( ( rule__ValidMove__ConditionsAssignment_4_2 ) )
            // InternalBoardGameDL.g:1491:2: ( rule__ValidMove__ConditionsAssignment_4_2 )
            {
             before(grammarAccess.getValidMoveAccess().getConditionsAssignment_4_2()); 
            // InternalBoardGameDL.g:1492:2: ( rule__ValidMove__ConditionsAssignment_4_2 )
            // InternalBoardGameDL.g:1492:3: rule__ValidMove__ConditionsAssignment_4_2
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
    // InternalBoardGameDL.g:1500:1: rule__ValidMove__Group_4__3 : rule__ValidMove__Group_4__3__Impl ;
    public final void rule__ValidMove__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1504:1: ( rule__ValidMove__Group_4__3__Impl )
            // InternalBoardGameDL.g:1505:2: rule__ValidMove__Group_4__3__Impl
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
    // InternalBoardGameDL.g:1511:1: rule__ValidMove__Group_4__3__Impl : ( ( rule__ValidMove__Group_4_3__0 )* ) ;
    public final void rule__ValidMove__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1515:1: ( ( ( rule__ValidMove__Group_4_3__0 )* ) )
            // InternalBoardGameDL.g:1516:1: ( ( rule__ValidMove__Group_4_3__0 )* )
            {
            // InternalBoardGameDL.g:1516:1: ( ( rule__ValidMove__Group_4_3__0 )* )
            // InternalBoardGameDL.g:1517:2: ( rule__ValidMove__Group_4_3__0 )*
            {
             before(grammarAccess.getValidMoveAccess().getGroup_4_3()); 
            // InternalBoardGameDL.g:1518:2: ( rule__ValidMove__Group_4_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBoardGameDL.g:1518:3: rule__ValidMove__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ValidMove__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalBoardGameDL.g:1527:1: rule__ValidMove__Group_4_3__0 : rule__ValidMove__Group_4_3__0__Impl rule__ValidMove__Group_4_3__1 ;
    public final void rule__ValidMove__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1531:1: ( rule__ValidMove__Group_4_3__0__Impl rule__ValidMove__Group_4_3__1 )
            // InternalBoardGameDL.g:1532:2: rule__ValidMove__Group_4_3__0__Impl rule__ValidMove__Group_4_3__1
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
    // InternalBoardGameDL.g:1539:1: rule__ValidMove__Group_4_3__0__Impl : ( 'and' ) ;
    public final void rule__ValidMove__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1543:1: ( ( 'and' ) )
            // InternalBoardGameDL.g:1544:1: ( 'and' )
            {
            // InternalBoardGameDL.g:1544:1: ( 'and' )
            // InternalBoardGameDL.g:1545:2: 'and'
            {
             before(grammarAccess.getValidMoveAccess().getAndKeyword_4_3_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1554:1: rule__ValidMove__Group_4_3__1 : rule__ValidMove__Group_4_3__1__Impl ;
    public final void rule__ValidMove__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1558:1: ( rule__ValidMove__Group_4_3__1__Impl )
            // InternalBoardGameDL.g:1559:2: rule__ValidMove__Group_4_3__1__Impl
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
    // InternalBoardGameDL.g:1565:1: rule__ValidMove__Group_4_3__1__Impl : ( ( rule__ValidMove__ConditionsAssignment_4_3_1 ) ) ;
    public final void rule__ValidMove__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1569:1: ( ( ( rule__ValidMove__ConditionsAssignment_4_3_1 ) ) )
            // InternalBoardGameDL.g:1570:1: ( ( rule__ValidMove__ConditionsAssignment_4_3_1 ) )
            {
            // InternalBoardGameDL.g:1570:1: ( ( rule__ValidMove__ConditionsAssignment_4_3_1 ) )
            // InternalBoardGameDL.g:1571:2: ( rule__ValidMove__ConditionsAssignment_4_3_1 )
            {
             before(grammarAccess.getValidMoveAccess().getConditionsAssignment_4_3_1()); 
            // InternalBoardGameDL.g:1572:2: ( rule__ValidMove__ConditionsAssignment_4_3_1 )
            // InternalBoardGameDL.g:1572:3: rule__ValidMove__ConditionsAssignment_4_3_1
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
    // InternalBoardGameDL.g:1581:1: rule__EffectOnCell__Group__0 : rule__EffectOnCell__Group__0__Impl rule__EffectOnCell__Group__1 ;
    public final void rule__EffectOnCell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1585:1: ( rule__EffectOnCell__Group__0__Impl rule__EffectOnCell__Group__1 )
            // InternalBoardGameDL.g:1586:2: rule__EffectOnCell__Group__0__Impl rule__EffectOnCell__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalBoardGameDL.g:1593:1: rule__EffectOnCell__Group__0__Impl : ( 'EffectOnCell' ) ;
    public final void rule__EffectOnCell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1597:1: ( ( 'EffectOnCell' ) )
            // InternalBoardGameDL.g:1598:1: ( 'EffectOnCell' )
            {
            // InternalBoardGameDL.g:1598:1: ( 'EffectOnCell' )
            // InternalBoardGameDL.g:1599:2: 'EffectOnCell'
            {
             before(grammarAccess.getEffectOnCellAccess().getEffectOnCellKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1608:1: rule__EffectOnCell__Group__1 : rule__EffectOnCell__Group__1__Impl rule__EffectOnCell__Group__2 ;
    public final void rule__EffectOnCell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1612:1: ( rule__EffectOnCell__Group__1__Impl rule__EffectOnCell__Group__2 )
            // InternalBoardGameDL.g:1613:2: rule__EffectOnCell__Group__1__Impl rule__EffectOnCell__Group__2
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
    // InternalBoardGameDL.g:1620:1: rule__EffectOnCell__Group__1__Impl : ( ( rule__EffectOnCell__NameAssignment_1 ) ) ;
    public final void rule__EffectOnCell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1624:1: ( ( ( rule__EffectOnCell__NameAssignment_1 ) ) )
            // InternalBoardGameDL.g:1625:1: ( ( rule__EffectOnCell__NameAssignment_1 ) )
            {
            // InternalBoardGameDL.g:1625:1: ( ( rule__EffectOnCell__NameAssignment_1 ) )
            // InternalBoardGameDL.g:1626:2: ( rule__EffectOnCell__NameAssignment_1 )
            {
             before(grammarAccess.getEffectOnCellAccess().getNameAssignment_1()); 
            // InternalBoardGameDL.g:1627:2: ( rule__EffectOnCell__NameAssignment_1 )
            // InternalBoardGameDL.g:1627:3: rule__EffectOnCell__NameAssignment_1
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
    // InternalBoardGameDL.g:1635:1: rule__EffectOnCell__Group__2 : rule__EffectOnCell__Group__2__Impl rule__EffectOnCell__Group__3 ;
    public final void rule__EffectOnCell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1639:1: ( rule__EffectOnCell__Group__2__Impl rule__EffectOnCell__Group__3 )
            // InternalBoardGameDL.g:1640:2: rule__EffectOnCell__Group__2__Impl rule__EffectOnCell__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalBoardGameDL.g:1647:1: rule__EffectOnCell__Group__2__Impl : ( '{' ) ;
    public final void rule__EffectOnCell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1651:1: ( ( '{' ) )
            // InternalBoardGameDL.g:1652:1: ( '{' )
            {
            // InternalBoardGameDL.g:1652:1: ( '{' )
            // InternalBoardGameDL.g:1653:2: '{'
            {
             before(grammarAccess.getEffectOnCellAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1662:1: rule__EffectOnCell__Group__3 : rule__EffectOnCell__Group__3__Impl rule__EffectOnCell__Group__4 ;
    public final void rule__EffectOnCell__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1666:1: ( rule__EffectOnCell__Group__3__Impl rule__EffectOnCell__Group__4 )
            // InternalBoardGameDL.g:1667:2: rule__EffectOnCell__Group__3__Impl rule__EffectOnCell__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalBoardGameDL.g:1674:1: rule__EffectOnCell__Group__3__Impl : ( ( rule__EffectOnCell__UnorderedGroup_3 ) ) ;
    public final void rule__EffectOnCell__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1678:1: ( ( ( rule__EffectOnCell__UnorderedGroup_3 ) ) )
            // InternalBoardGameDL.g:1679:1: ( ( rule__EffectOnCell__UnorderedGroup_3 ) )
            {
            // InternalBoardGameDL.g:1679:1: ( ( rule__EffectOnCell__UnorderedGroup_3 ) )
            // InternalBoardGameDL.g:1680:2: ( rule__EffectOnCell__UnorderedGroup_3 )
            {
             before(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3()); 
            // InternalBoardGameDL.g:1681:2: ( rule__EffectOnCell__UnorderedGroup_3 )
            // InternalBoardGameDL.g:1681:3: rule__EffectOnCell__UnorderedGroup_3
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
    // InternalBoardGameDL.g:1689:1: rule__EffectOnCell__Group__4 : rule__EffectOnCell__Group__4__Impl ;
    public final void rule__EffectOnCell__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1693:1: ( rule__EffectOnCell__Group__4__Impl )
            // InternalBoardGameDL.g:1694:2: rule__EffectOnCell__Group__4__Impl
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
    // InternalBoardGameDL.g:1700:1: rule__EffectOnCell__Group__4__Impl : ( '}' ) ;
    public final void rule__EffectOnCell__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1704:1: ( ( '}' ) )
            // InternalBoardGameDL.g:1705:1: ( '}' )
            {
            // InternalBoardGameDL.g:1705:1: ( '}' )
            // InternalBoardGameDL.g:1706:2: '}'
            {
             before(grammarAccess.getEffectOnCellAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1716:1: rule__EffectOnCell__Group_3_0__0 : rule__EffectOnCell__Group_3_0__0__Impl rule__EffectOnCell__Group_3_0__1 ;
    public final void rule__EffectOnCell__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1720:1: ( rule__EffectOnCell__Group_3_0__0__Impl rule__EffectOnCell__Group_3_0__1 )
            // InternalBoardGameDL.g:1721:2: rule__EffectOnCell__Group_3_0__0__Impl rule__EffectOnCell__Group_3_0__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalBoardGameDL.g:1728:1: rule__EffectOnCell__Group_3_0__0__Impl : ( 'relativePosition' ) ;
    public final void rule__EffectOnCell__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1732:1: ( ( 'relativePosition' ) )
            // InternalBoardGameDL.g:1733:1: ( 'relativePosition' )
            {
            // InternalBoardGameDL.g:1733:1: ( 'relativePosition' )
            // InternalBoardGameDL.g:1734:2: 'relativePosition'
            {
             before(grammarAccess.getEffectOnCellAccess().getRelativePositionKeyword_3_0_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1743:1: rule__EffectOnCell__Group_3_0__1 : rule__EffectOnCell__Group_3_0__1__Impl rule__EffectOnCell__Group_3_0__2 ;
    public final void rule__EffectOnCell__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1747:1: ( rule__EffectOnCell__Group_3_0__1__Impl rule__EffectOnCell__Group_3_0__2 )
            // InternalBoardGameDL.g:1748:2: rule__EffectOnCell__Group_3_0__1__Impl rule__EffectOnCell__Group_3_0__2
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
    // InternalBoardGameDL.g:1755:1: rule__EffectOnCell__Group_3_0__1__Impl : ( '(' ) ;
    public final void rule__EffectOnCell__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1759:1: ( ( '(' ) )
            // InternalBoardGameDL.g:1760:1: ( '(' )
            {
            // InternalBoardGameDL.g:1760:1: ( '(' )
            // InternalBoardGameDL.g:1761:2: '('
            {
             before(grammarAccess.getEffectOnCellAccess().getLeftParenthesisKeyword_3_0_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1770:1: rule__EffectOnCell__Group_3_0__2 : rule__EffectOnCell__Group_3_0__2__Impl rule__EffectOnCell__Group_3_0__3 ;
    public final void rule__EffectOnCell__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1774:1: ( rule__EffectOnCell__Group_3_0__2__Impl rule__EffectOnCell__Group_3_0__3 )
            // InternalBoardGameDL.g:1775:2: rule__EffectOnCell__Group_3_0__2__Impl rule__EffectOnCell__Group_3_0__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalBoardGameDL.g:1782:1: rule__EffectOnCell__Group_3_0__2__Impl : ( ( rule__EffectOnCell__XAssignment_3_0_2 ) ) ;
    public final void rule__EffectOnCell__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1786:1: ( ( ( rule__EffectOnCell__XAssignment_3_0_2 ) ) )
            // InternalBoardGameDL.g:1787:1: ( ( rule__EffectOnCell__XAssignment_3_0_2 ) )
            {
            // InternalBoardGameDL.g:1787:1: ( ( rule__EffectOnCell__XAssignment_3_0_2 ) )
            // InternalBoardGameDL.g:1788:2: ( rule__EffectOnCell__XAssignment_3_0_2 )
            {
             before(grammarAccess.getEffectOnCellAccess().getXAssignment_3_0_2()); 
            // InternalBoardGameDL.g:1789:2: ( rule__EffectOnCell__XAssignment_3_0_2 )
            // InternalBoardGameDL.g:1789:3: rule__EffectOnCell__XAssignment_3_0_2
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
    // InternalBoardGameDL.g:1797:1: rule__EffectOnCell__Group_3_0__3 : rule__EffectOnCell__Group_3_0__3__Impl rule__EffectOnCell__Group_3_0__4 ;
    public final void rule__EffectOnCell__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1801:1: ( rule__EffectOnCell__Group_3_0__3__Impl rule__EffectOnCell__Group_3_0__4 )
            // InternalBoardGameDL.g:1802:2: rule__EffectOnCell__Group_3_0__3__Impl rule__EffectOnCell__Group_3_0__4
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
    // InternalBoardGameDL.g:1809:1: rule__EffectOnCell__Group_3_0__3__Impl : ( ',' ) ;
    public final void rule__EffectOnCell__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1813:1: ( ( ',' ) )
            // InternalBoardGameDL.g:1814:1: ( ',' )
            {
            // InternalBoardGameDL.g:1814:1: ( ',' )
            // InternalBoardGameDL.g:1815:2: ','
            {
             before(grammarAccess.getEffectOnCellAccess().getCommaKeyword_3_0_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1824:1: rule__EffectOnCell__Group_3_0__4 : rule__EffectOnCell__Group_3_0__4__Impl rule__EffectOnCell__Group_3_0__5 ;
    public final void rule__EffectOnCell__Group_3_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1828:1: ( rule__EffectOnCell__Group_3_0__4__Impl rule__EffectOnCell__Group_3_0__5 )
            // InternalBoardGameDL.g:1829:2: rule__EffectOnCell__Group_3_0__4__Impl rule__EffectOnCell__Group_3_0__5
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
    // InternalBoardGameDL.g:1836:1: rule__EffectOnCell__Group_3_0__4__Impl : ( ( rule__EffectOnCell__YAssignment_3_0_4 ) ) ;
    public final void rule__EffectOnCell__Group_3_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1840:1: ( ( ( rule__EffectOnCell__YAssignment_3_0_4 ) ) )
            // InternalBoardGameDL.g:1841:1: ( ( rule__EffectOnCell__YAssignment_3_0_4 ) )
            {
            // InternalBoardGameDL.g:1841:1: ( ( rule__EffectOnCell__YAssignment_3_0_4 ) )
            // InternalBoardGameDL.g:1842:2: ( rule__EffectOnCell__YAssignment_3_0_4 )
            {
             before(grammarAccess.getEffectOnCellAccess().getYAssignment_3_0_4()); 
            // InternalBoardGameDL.g:1843:2: ( rule__EffectOnCell__YAssignment_3_0_4 )
            // InternalBoardGameDL.g:1843:3: rule__EffectOnCell__YAssignment_3_0_4
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
    // InternalBoardGameDL.g:1851:1: rule__EffectOnCell__Group_3_0__5 : rule__EffectOnCell__Group_3_0__5__Impl ;
    public final void rule__EffectOnCell__Group_3_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1855:1: ( rule__EffectOnCell__Group_3_0__5__Impl )
            // InternalBoardGameDL.g:1856:2: rule__EffectOnCell__Group_3_0__5__Impl
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
    // InternalBoardGameDL.g:1862:1: rule__EffectOnCell__Group_3_0__5__Impl : ( ')' ) ;
    public final void rule__EffectOnCell__Group_3_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1866:1: ( ( ')' ) )
            // InternalBoardGameDL.g:1867:1: ( ')' )
            {
            // InternalBoardGameDL.g:1867:1: ( ')' )
            // InternalBoardGameDL.g:1868:2: ')'
            {
             before(grammarAccess.getEffectOnCellAccess().getRightParenthesisKeyword_3_0_5()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1878:1: rule__EffectOnCell__Group_3_1__0 : rule__EffectOnCell__Group_3_1__0__Impl rule__EffectOnCell__Group_3_1__1 ;
    public final void rule__EffectOnCell__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1882:1: ( rule__EffectOnCell__Group_3_1__0__Impl rule__EffectOnCell__Group_3_1__1 )
            // InternalBoardGameDL.g:1883:2: rule__EffectOnCell__Group_3_1__0__Impl rule__EffectOnCell__Group_3_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalBoardGameDL.g:1890:1: rule__EffectOnCell__Group_3_1__0__Impl : ( 'newCellState' ) ;
    public final void rule__EffectOnCell__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1894:1: ( ( 'newCellState' ) )
            // InternalBoardGameDL.g:1895:1: ( 'newCellState' )
            {
            // InternalBoardGameDL.g:1895:1: ( 'newCellState' )
            // InternalBoardGameDL.g:1896:2: 'newCellState'
            {
             before(grammarAccess.getEffectOnCellAccess().getNewCellStateKeyword_3_1_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1905:1: rule__EffectOnCell__Group_3_1__1 : rule__EffectOnCell__Group_3_1__1__Impl rule__EffectOnCell__Group_3_1__2 ;
    public final void rule__EffectOnCell__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1909:1: ( rule__EffectOnCell__Group_3_1__1__Impl rule__EffectOnCell__Group_3_1__2 )
            // InternalBoardGameDL.g:1910:2: rule__EffectOnCell__Group_3_1__1__Impl rule__EffectOnCell__Group_3_1__2
            {
            pushFollow(FOLLOW_3);
            rule__EffectOnCell__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectOnCell__Group_3_1__2();

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
    // InternalBoardGameDL.g:1917:1: rule__EffectOnCell__Group_3_1__1__Impl : ( '(' ) ;
    public final void rule__EffectOnCell__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1921:1: ( ( '(' ) )
            // InternalBoardGameDL.g:1922:1: ( '(' )
            {
            // InternalBoardGameDL.g:1922:1: ( '(' )
            // InternalBoardGameDL.g:1923:2: '('
            {
             before(grammarAccess.getEffectOnCellAccess().getLeftParenthesisKeyword_3_1_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEffectOnCellAccess().getLeftParenthesisKeyword_3_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__EffectOnCell__Group_3_1__2"
    // InternalBoardGameDL.g:1932:1: rule__EffectOnCell__Group_3_1__2 : rule__EffectOnCell__Group_3_1__2__Impl rule__EffectOnCell__Group_3_1__3 ;
    public final void rule__EffectOnCell__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1936:1: ( rule__EffectOnCell__Group_3_1__2__Impl rule__EffectOnCell__Group_3_1__3 )
            // InternalBoardGameDL.g:1937:2: rule__EffectOnCell__Group_3_1__2__Impl rule__EffectOnCell__Group_3_1__3
            {
            pushFollow(FOLLOW_26);
            rule__EffectOnCell__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectOnCell__Group_3_1__3();

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
    // $ANTLR end "rule__EffectOnCell__Group_3_1__2"


    // $ANTLR start "rule__EffectOnCell__Group_3_1__2__Impl"
    // InternalBoardGameDL.g:1944:1: rule__EffectOnCell__Group_3_1__2__Impl : ( ( rule__EffectOnCell__CellstateAssignment_3_1_2 ) ) ;
    public final void rule__EffectOnCell__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1948:1: ( ( ( rule__EffectOnCell__CellstateAssignment_3_1_2 ) ) )
            // InternalBoardGameDL.g:1949:1: ( ( rule__EffectOnCell__CellstateAssignment_3_1_2 ) )
            {
            // InternalBoardGameDL.g:1949:1: ( ( rule__EffectOnCell__CellstateAssignment_3_1_2 ) )
            // InternalBoardGameDL.g:1950:2: ( rule__EffectOnCell__CellstateAssignment_3_1_2 )
            {
             before(grammarAccess.getEffectOnCellAccess().getCellstateAssignment_3_1_2()); 
            // InternalBoardGameDL.g:1951:2: ( rule__EffectOnCell__CellstateAssignment_3_1_2 )
            // InternalBoardGameDL.g:1951:3: rule__EffectOnCell__CellstateAssignment_3_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EffectOnCell__CellstateAssignment_3_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEffectOnCellAccess().getCellstateAssignment_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__Group_3_1__2__Impl"


    // $ANTLR start "rule__EffectOnCell__Group_3_1__3"
    // InternalBoardGameDL.g:1959:1: rule__EffectOnCell__Group_3_1__3 : rule__EffectOnCell__Group_3_1__3__Impl ;
    public final void rule__EffectOnCell__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1963:1: ( rule__EffectOnCell__Group_3_1__3__Impl )
            // InternalBoardGameDL.g:1964:2: rule__EffectOnCell__Group_3_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectOnCell__Group_3_1__3__Impl();

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
    // $ANTLR end "rule__EffectOnCell__Group_3_1__3"


    // $ANTLR start "rule__EffectOnCell__Group_3_1__3__Impl"
    // InternalBoardGameDL.g:1970:1: rule__EffectOnCell__Group_3_1__3__Impl : ( ')' ) ;
    public final void rule__EffectOnCell__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1974:1: ( ( ')' ) )
            // InternalBoardGameDL.g:1975:1: ( ')' )
            {
            // InternalBoardGameDL.g:1975:1: ( ')' )
            // InternalBoardGameDL.g:1976:2: ')'
            {
             before(grammarAccess.getEffectOnCellAccess().getRightParenthesisKeyword_3_1_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEffectOnCellAccess().getRightParenthesisKeyword_3_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__Group_3_1__3__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalBoardGameDL.g:1986:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1990:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalBoardGameDL.g:1991:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalBoardGameDL.g:1998:1: rule__Condition__Group__0__Impl : ( 'Condition' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2002:1: ( ( 'Condition' ) )
            // InternalBoardGameDL.g:2003:1: ( 'Condition' )
            {
            // InternalBoardGameDL.g:2003:1: ( 'Condition' )
            // InternalBoardGameDL.g:2004:2: 'Condition'
            {
             before(grammarAccess.getConditionAccess().getConditionKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBoardGameDL.g:2013:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2017:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalBoardGameDL.g:2018:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
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
    // InternalBoardGameDL.g:2025:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__NameAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2029:1: ( ( ( rule__Condition__NameAssignment_1 ) ) )
            // InternalBoardGameDL.g:2030:1: ( ( rule__Condition__NameAssignment_1 ) )
            {
            // InternalBoardGameDL.g:2030:1: ( ( rule__Condition__NameAssignment_1 ) )
            // InternalBoardGameDL.g:2031:2: ( rule__Condition__NameAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getNameAssignment_1()); 
            // InternalBoardGameDL.g:2032:2: ( rule__Condition__NameAssignment_1 )
            // InternalBoardGameDL.g:2032:3: rule__Condition__NameAssignment_1
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
    // InternalBoardGameDL.g:2040:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2044:1: ( rule__Condition__Group__2__Impl )
            // InternalBoardGameDL.g:2045:2: rule__Condition__Group__2__Impl
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
    // InternalBoardGameDL.g:2051:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__CellstateAssignment_2 ) ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2055:1: ( ( ( rule__Condition__CellstateAssignment_2 ) ) )
            // InternalBoardGameDL.g:2056:1: ( ( rule__Condition__CellstateAssignment_2 ) )
            {
            // InternalBoardGameDL.g:2056:1: ( ( rule__Condition__CellstateAssignment_2 ) )
            // InternalBoardGameDL.g:2057:2: ( rule__Condition__CellstateAssignment_2 )
            {
             before(grammarAccess.getConditionAccess().getCellstateAssignment_2()); 
            // InternalBoardGameDL.g:2058:2: ( rule__Condition__CellstateAssignment_2 )
            // InternalBoardGameDL.g:2058:3: rule__Condition__CellstateAssignment_2
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


    // $ANTLR start "rule__InARow__Group_0__0"
    // InternalBoardGameDL.g:2067:1: rule__InARow__Group_0__0 : rule__InARow__Group_0__0__Impl rule__InARow__Group_0__1 ;
    public final void rule__InARow__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2071:1: ( rule__InARow__Group_0__0__Impl rule__InARow__Group_0__1 )
            // InternalBoardGameDL.g:2072:2: rule__InARow__Group_0__0__Impl rule__InARow__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__InARow__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InARow__Group_0__1();

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
    // $ANTLR end "rule__InARow__Group_0__0"


    // $ANTLR start "rule__InARow__Group_0__0__Impl"
    // InternalBoardGameDL.g:2079:1: rule__InARow__Group_0__0__Impl : ( 'count' ) ;
    public final void rule__InARow__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2083:1: ( ( 'count' ) )
            // InternalBoardGameDL.g:2084:1: ( 'count' )
            {
            // InternalBoardGameDL.g:2084:1: ( 'count' )
            // InternalBoardGameDL.g:2085:2: 'count'
            {
             before(grammarAccess.getInARowAccess().getCountKeyword_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getInARowAccess().getCountKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InARow__Group_0__0__Impl"


    // $ANTLR start "rule__InARow__Group_0__1"
    // InternalBoardGameDL.g:2094:1: rule__InARow__Group_0__1 : rule__InARow__Group_0__1__Impl ;
    public final void rule__InARow__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2098:1: ( rule__InARow__Group_0__1__Impl )
            // InternalBoardGameDL.g:2099:2: rule__InARow__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InARow__Group_0__1__Impl();

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
    // $ANTLR end "rule__InARow__Group_0__1"


    // $ANTLR start "rule__InARow__Group_0__1__Impl"
    // InternalBoardGameDL.g:2105:1: rule__InARow__Group_0__1__Impl : ( ( rule__InARow__CountAssignment_0_1 ) ) ;
    public final void rule__InARow__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2109:1: ( ( ( rule__InARow__CountAssignment_0_1 ) ) )
            // InternalBoardGameDL.g:2110:1: ( ( rule__InARow__CountAssignment_0_1 ) )
            {
            // InternalBoardGameDL.g:2110:1: ( ( rule__InARow__CountAssignment_0_1 ) )
            // InternalBoardGameDL.g:2111:2: ( rule__InARow__CountAssignment_0_1 )
            {
             before(grammarAccess.getInARowAccess().getCountAssignment_0_1()); 
            // InternalBoardGameDL.g:2112:2: ( rule__InARow__CountAssignment_0_1 )
            // InternalBoardGameDL.g:2112:3: rule__InARow__CountAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__InARow__CountAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getInARowAccess().getCountAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InARow__Group_0__1__Impl"


    // $ANTLR start "rule__EffectOnCell__UnorderedGroup_3"
    // InternalBoardGameDL.g:2121:1: rule__EffectOnCell__UnorderedGroup_3 : rule__EffectOnCell__UnorderedGroup_3__0 {...}?;
    public final void rule__EffectOnCell__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3());
        	
        try {
            // InternalBoardGameDL.g:2126:1: ( rule__EffectOnCell__UnorderedGroup_3__0 {...}?)
            // InternalBoardGameDL.g:2127:2: rule__EffectOnCell__UnorderedGroup_3__0 {...}?
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
    // InternalBoardGameDL.g:2135:1: rule__EffectOnCell__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__EffectOnCell__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EffectOnCell__Group_3_1__0 ) ) ) ) ) ;
    public final void rule__EffectOnCell__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalBoardGameDL.g:2140:1: ( ( ({...}? => ( ( ( rule__EffectOnCell__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EffectOnCell__Group_3_1__0 ) ) ) ) ) )
            // InternalBoardGameDL.g:2141:3: ( ({...}? => ( ( ( rule__EffectOnCell__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EffectOnCell__Group_3_1__0 ) ) ) ) )
            {
            // InternalBoardGameDL.g:2141:3: ( ({...}? => ( ( ( rule__EffectOnCell__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EffectOnCell__Group_3_1__0 ) ) ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( LA10_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 0) ) {
                alt10=1;
            }
            else if ( LA10_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 1) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalBoardGameDL.g:2142:3: ({...}? => ( ( ( rule__EffectOnCell__Group_3_0__0 ) ) ) )
                    {
                    // InternalBoardGameDL.g:2142:3: ({...}? => ( ( ( rule__EffectOnCell__Group_3_0__0 ) ) ) )
                    // InternalBoardGameDL.g:2143:4: {...}? => ( ( ( rule__EffectOnCell__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__EffectOnCell__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalBoardGameDL.g:2143:108: ( ( ( rule__EffectOnCell__Group_3_0__0 ) ) )
                    // InternalBoardGameDL.g:2144:5: ( ( rule__EffectOnCell__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalBoardGameDL.g:2150:5: ( ( rule__EffectOnCell__Group_3_0__0 ) )
                    // InternalBoardGameDL.g:2151:6: ( rule__EffectOnCell__Group_3_0__0 )
                    {
                     before(grammarAccess.getEffectOnCellAccess().getGroup_3_0()); 
                    // InternalBoardGameDL.g:2152:6: ( rule__EffectOnCell__Group_3_0__0 )
                    // InternalBoardGameDL.g:2152:7: rule__EffectOnCell__Group_3_0__0
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
                    // InternalBoardGameDL.g:2157:3: ({...}? => ( ( ( rule__EffectOnCell__Group_3_1__0 ) ) ) )
                    {
                    // InternalBoardGameDL.g:2157:3: ({...}? => ( ( ( rule__EffectOnCell__Group_3_1__0 ) ) ) )
                    // InternalBoardGameDL.g:2158:4: {...}? => ( ( ( rule__EffectOnCell__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__EffectOnCell__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalBoardGameDL.g:2158:108: ( ( ( rule__EffectOnCell__Group_3_1__0 ) ) )
                    // InternalBoardGameDL.g:2159:5: ( ( rule__EffectOnCell__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalBoardGameDL.g:2165:5: ( ( rule__EffectOnCell__Group_3_1__0 ) )
                    // InternalBoardGameDL.g:2166:6: ( rule__EffectOnCell__Group_3_1__0 )
                    {
                     before(grammarAccess.getEffectOnCellAccess().getGroup_3_1()); 
                    // InternalBoardGameDL.g:2167:6: ( rule__EffectOnCell__Group_3_1__0 )
                    // InternalBoardGameDL.g:2167:7: rule__EffectOnCell__Group_3_1__0
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
    // InternalBoardGameDL.g:2180:1: rule__EffectOnCell__UnorderedGroup_3__0 : rule__EffectOnCell__UnorderedGroup_3__Impl ( rule__EffectOnCell__UnorderedGroup_3__1 )? ;
    public final void rule__EffectOnCell__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2184:1: ( rule__EffectOnCell__UnorderedGroup_3__Impl ( rule__EffectOnCell__UnorderedGroup_3__1 )? )
            // InternalBoardGameDL.g:2185:2: rule__EffectOnCell__UnorderedGroup_3__Impl ( rule__EffectOnCell__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_27);
            rule__EffectOnCell__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalBoardGameDL.g:2186:2: ( rule__EffectOnCell__UnorderedGroup_3__1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( LA11_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 0) ) {
                alt11=1;
            }
            else if ( LA11_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 1) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBoardGameDL.g:2186:2: rule__EffectOnCell__UnorderedGroup_3__1
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
    // InternalBoardGameDL.g:2192:1: rule__EffectOnCell__UnorderedGroup_3__1 : rule__EffectOnCell__UnorderedGroup_3__Impl ;
    public final void rule__EffectOnCell__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2196:1: ( rule__EffectOnCell__UnorderedGroup_3__Impl )
            // InternalBoardGameDL.g:2197:2: rule__EffectOnCell__UnorderedGroup_3__Impl
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


    // $ANTLR start "rule__InARow__UnorderedGroup"
    // InternalBoardGameDL.g:2204:1: rule__InARow__UnorderedGroup : rule__InARow__UnorderedGroup__0 {...}?;
    public final void rule__InARow__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getInARowAccess().getUnorderedGroup());
        	
        try {
            // InternalBoardGameDL.g:2209:1: ( rule__InARow__UnorderedGroup__0 {...}?)
            // InternalBoardGameDL.g:2210:2: rule__InARow__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__InARow__UnorderedGroup__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getInARowAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rule__InARow__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getInARowAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getInARowAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InARow__UnorderedGroup"


    // $ANTLR start "rule__InARow__UnorderedGroup__Impl"
    // InternalBoardGameDL.g:2218:1: rule__InARow__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__InARow__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__InARow__HorizontalAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__InARow__VerticalAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__InARow__DiagonalAssignment_3 ) ) ) ) ) ;
    public final void rule__InARow__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalBoardGameDL.g:2223:1: ( ( ({...}? => ( ( ( rule__InARow__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__InARow__HorizontalAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__InARow__VerticalAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__InARow__DiagonalAssignment_3 ) ) ) ) ) )
            // InternalBoardGameDL.g:2224:3: ( ({...}? => ( ( ( rule__InARow__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__InARow__HorizontalAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__InARow__VerticalAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__InARow__DiagonalAssignment_3 ) ) ) ) )
            {
            // InternalBoardGameDL.g:2224:3: ( ({...}? => ( ( ( rule__InARow__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__InARow__HorizontalAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__InARow__VerticalAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__InARow__DiagonalAssignment_3 ) ) ) ) )
            int alt12=4;
            int LA12_0 = input.LA(1);

            if ( LA12_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 0) ) {
                alt12=1;
            }
            else if ( LA12_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 1) ) {
                alt12=2;
            }
            else if ( LA12_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 2) ) {
                alt12=3;
            }
            else if ( LA12_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 3) ) {
                alt12=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalBoardGameDL.g:2225:3: ({...}? => ( ( ( rule__InARow__Group_0__0 ) ) ) )
                    {
                    // InternalBoardGameDL.g:2225:3: ({...}? => ( ( ( rule__InARow__Group_0__0 ) ) ) )
                    // InternalBoardGameDL.g:2226:4: {...}? => ( ( ( rule__InARow__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__InARow__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalBoardGameDL.g:2226:100: ( ( ( rule__InARow__Group_0__0 ) ) )
                    // InternalBoardGameDL.g:2227:5: ( ( rule__InARow__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getInARowAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalBoardGameDL.g:2233:5: ( ( rule__InARow__Group_0__0 ) )
                    // InternalBoardGameDL.g:2234:6: ( rule__InARow__Group_0__0 )
                    {
                     before(grammarAccess.getInARowAccess().getGroup_0()); 
                    // InternalBoardGameDL.g:2235:6: ( rule__InARow__Group_0__0 )
                    // InternalBoardGameDL.g:2235:7: rule__InARow__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InARow__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInARowAccess().getGroup_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBoardGameDL.g:2240:3: ({...}? => ( ( ( rule__InARow__HorizontalAssignment_1 ) ) ) )
                    {
                    // InternalBoardGameDL.g:2240:3: ({...}? => ( ( ( rule__InARow__HorizontalAssignment_1 ) ) ) )
                    // InternalBoardGameDL.g:2241:4: {...}? => ( ( ( rule__InARow__HorizontalAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__InARow__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalBoardGameDL.g:2241:100: ( ( ( rule__InARow__HorizontalAssignment_1 ) ) )
                    // InternalBoardGameDL.g:2242:5: ( ( rule__InARow__HorizontalAssignment_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getInARowAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalBoardGameDL.g:2248:5: ( ( rule__InARow__HorizontalAssignment_1 ) )
                    // InternalBoardGameDL.g:2249:6: ( rule__InARow__HorizontalAssignment_1 )
                    {
                     before(grammarAccess.getInARowAccess().getHorizontalAssignment_1()); 
                    // InternalBoardGameDL.g:2250:6: ( rule__InARow__HorizontalAssignment_1 )
                    // InternalBoardGameDL.g:2250:7: rule__InARow__HorizontalAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__InARow__HorizontalAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getInARowAccess().getHorizontalAssignment_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBoardGameDL.g:2255:3: ({...}? => ( ( ( rule__InARow__VerticalAssignment_2 ) ) ) )
                    {
                    // InternalBoardGameDL.g:2255:3: ({...}? => ( ( ( rule__InARow__VerticalAssignment_2 ) ) ) )
                    // InternalBoardGameDL.g:2256:4: {...}? => ( ( ( rule__InARow__VerticalAssignment_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__InARow__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalBoardGameDL.g:2256:100: ( ( ( rule__InARow__VerticalAssignment_2 ) ) )
                    // InternalBoardGameDL.g:2257:5: ( ( rule__InARow__VerticalAssignment_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getInARowAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalBoardGameDL.g:2263:5: ( ( rule__InARow__VerticalAssignment_2 ) )
                    // InternalBoardGameDL.g:2264:6: ( rule__InARow__VerticalAssignment_2 )
                    {
                     before(grammarAccess.getInARowAccess().getVerticalAssignment_2()); 
                    // InternalBoardGameDL.g:2265:6: ( rule__InARow__VerticalAssignment_2 )
                    // InternalBoardGameDL.g:2265:7: rule__InARow__VerticalAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__InARow__VerticalAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getInARowAccess().getVerticalAssignment_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalBoardGameDL.g:2270:3: ({...}? => ( ( ( rule__InARow__DiagonalAssignment_3 ) ) ) )
                    {
                    // InternalBoardGameDL.g:2270:3: ({...}? => ( ( ( rule__InARow__DiagonalAssignment_3 ) ) ) )
                    // InternalBoardGameDL.g:2271:4: {...}? => ( ( ( rule__InARow__DiagonalAssignment_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 3) ) {
                        throw new FailedPredicateException(input, "rule__InARow__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 3)");
                    }
                    // InternalBoardGameDL.g:2271:100: ( ( ( rule__InARow__DiagonalAssignment_3 ) ) )
                    // InternalBoardGameDL.g:2272:5: ( ( rule__InARow__DiagonalAssignment_3 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getInARowAccess().getUnorderedGroup(), 3);
                    				

                    					selected = true;
                    				
                    // InternalBoardGameDL.g:2278:5: ( ( rule__InARow__DiagonalAssignment_3 ) )
                    // InternalBoardGameDL.g:2279:6: ( rule__InARow__DiagonalAssignment_3 )
                    {
                     before(grammarAccess.getInARowAccess().getDiagonalAssignment_3()); 
                    // InternalBoardGameDL.g:2280:6: ( rule__InARow__DiagonalAssignment_3 )
                    // InternalBoardGameDL.g:2280:7: rule__InARow__DiagonalAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__InARow__DiagonalAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getInARowAccess().getDiagonalAssignment_3()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInARowAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InARow__UnorderedGroup__Impl"


    // $ANTLR start "rule__InARow__UnorderedGroup__0"
    // InternalBoardGameDL.g:2293:1: rule__InARow__UnorderedGroup__0 : rule__InARow__UnorderedGroup__Impl ( rule__InARow__UnorderedGroup__1 )? ;
    public final void rule__InARow__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2297:1: ( rule__InARow__UnorderedGroup__Impl ( rule__InARow__UnorderedGroup__1 )? )
            // InternalBoardGameDL.g:2298:2: rule__InARow__UnorderedGroup__Impl ( rule__InARow__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_28);
            rule__InARow__UnorderedGroup__Impl();

            state._fsp--;

            // InternalBoardGameDL.g:2299:2: ( rule__InARow__UnorderedGroup__1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( LA13_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 0) ) {
                alt13=1;
            }
            else if ( LA13_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 1) ) {
                alt13=1;
            }
            else if ( LA13_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 2) ) {
                alt13=1;
            }
            else if ( LA13_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 3) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBoardGameDL.g:2299:2: rule__InARow__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__InARow__UnorderedGroup__1();

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
    // $ANTLR end "rule__InARow__UnorderedGroup__0"


    // $ANTLR start "rule__InARow__UnorderedGroup__1"
    // InternalBoardGameDL.g:2305:1: rule__InARow__UnorderedGroup__1 : rule__InARow__UnorderedGroup__Impl ( rule__InARow__UnorderedGroup__2 )? ;
    public final void rule__InARow__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2309:1: ( rule__InARow__UnorderedGroup__Impl ( rule__InARow__UnorderedGroup__2 )? )
            // InternalBoardGameDL.g:2310:2: rule__InARow__UnorderedGroup__Impl ( rule__InARow__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_28);
            rule__InARow__UnorderedGroup__Impl();

            state._fsp--;

            // InternalBoardGameDL.g:2311:2: ( rule__InARow__UnorderedGroup__2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( LA14_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 0) ) {
                alt14=1;
            }
            else if ( LA14_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 1) ) {
                alt14=1;
            }
            else if ( LA14_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 2) ) {
                alt14=1;
            }
            else if ( LA14_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 3) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBoardGameDL.g:2311:2: rule__InARow__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__InARow__UnorderedGroup__2();

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
    // $ANTLR end "rule__InARow__UnorderedGroup__1"


    // $ANTLR start "rule__InARow__UnorderedGroup__2"
    // InternalBoardGameDL.g:2317:1: rule__InARow__UnorderedGroup__2 : rule__InARow__UnorderedGroup__Impl ( rule__InARow__UnorderedGroup__3 )? ;
    public final void rule__InARow__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2321:1: ( rule__InARow__UnorderedGroup__Impl ( rule__InARow__UnorderedGroup__3 )? )
            // InternalBoardGameDL.g:2322:2: rule__InARow__UnorderedGroup__Impl ( rule__InARow__UnorderedGroup__3 )?
            {
            pushFollow(FOLLOW_28);
            rule__InARow__UnorderedGroup__Impl();

            state._fsp--;

            // InternalBoardGameDL.g:2323:2: ( rule__InARow__UnorderedGroup__3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( LA15_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 0) ) {
                alt15=1;
            }
            else if ( LA15_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 1) ) {
                alt15=1;
            }
            else if ( LA15_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 2) ) {
                alt15=1;
            }
            else if ( LA15_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getInARowAccess().getUnorderedGroup(), 3) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBoardGameDL.g:2323:2: rule__InARow__UnorderedGroup__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__InARow__UnorderedGroup__3();

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
    // $ANTLR end "rule__InARow__UnorderedGroup__2"


    // $ANTLR start "rule__InARow__UnorderedGroup__3"
    // InternalBoardGameDL.g:2329:1: rule__InARow__UnorderedGroup__3 : rule__InARow__UnorderedGroup__Impl ;
    public final void rule__InARow__UnorderedGroup__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2333:1: ( rule__InARow__UnorderedGroup__Impl )
            // InternalBoardGameDL.g:2334:2: rule__InARow__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InARow__UnorderedGroup__Impl();

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
    // $ANTLR end "rule__InARow__UnorderedGroup__3"


    // $ANTLR start "rule__BoardGame__NameAssignment_1"
    // InternalBoardGameDL.g:2341:1: rule__BoardGame__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__BoardGame__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2345:1: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2346:2: ( ruleEString )
            {
            // InternalBoardGameDL.g:2346:2: ( ruleEString )
            // InternalBoardGameDL.g:2347:3: ruleEString
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
    // InternalBoardGameDL.g:2356:1: rule__BoardGame__SizeAssignment_3 : ( ruleEInt ) ;
    public final void rule__BoardGame__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2360:1: ( ( ruleEInt ) )
            // InternalBoardGameDL.g:2361:2: ( ruleEInt )
            {
            // InternalBoardGameDL.g:2361:2: ( ruleEInt )
            // InternalBoardGameDL.g:2362:3: ruleEInt
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


    // $ANTLR start "rule__BoardGame__BoardgameelementsAssignment_4"
    // InternalBoardGameDL.g:2371:1: rule__BoardGame__BoardgameelementsAssignment_4 : ( ruleBoardGameElement ) ;
    public final void rule__BoardGame__BoardgameelementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2375:1: ( ( ruleBoardGameElement ) )
            // InternalBoardGameDL.g:2376:2: ( ruleBoardGameElement )
            {
            // InternalBoardGameDL.g:2376:2: ( ruleBoardGameElement )
            // InternalBoardGameDL.g:2377:3: ruleBoardGameElement
            {
             before(grammarAccess.getBoardGameAccess().getBoardgameelementsBoardGameElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBoardGameElement();

            state._fsp--;

             after(grammarAccess.getBoardGameAccess().getBoardgameelementsBoardGameElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoardGame__BoardgameelementsAssignment_4"


    // $ANTLR start "rule__PieceType__NameAssignment_1"
    // InternalBoardGameDL.g:2386:1: rule__PieceType__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__PieceType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2390:1: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2391:2: ( ruleEString )
            {
            // InternalBoardGameDL.g:2391:2: ( ruleEString )
            // InternalBoardGameDL.g:2392:3: ruleEString
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
    // InternalBoardGameDL.g:2401:1: rule__PieceType__SymbolAssignment_4 : ( ruleEString ) ;
    public final void rule__PieceType__SymbolAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2405:1: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2406:2: ( ruleEString )
            {
            // InternalBoardGameDL.g:2406:2: ( ruleEString )
            // InternalBoardGameDL.g:2407:3: ruleEString
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


    // $ANTLR start "rule__PieceType__ValidmovesAssignment_7"
    // InternalBoardGameDL.g:2416:1: rule__PieceType__ValidmovesAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__PieceType__ValidmovesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2420:1: ( ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:2421:2: ( ( ruleEString ) )
            {
            // InternalBoardGameDL.g:2421:2: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2422:3: ( ruleEString )
            {
             before(grammarAccess.getPieceTypeAccess().getValidmovesValidMoveCrossReference_7_0()); 
            // InternalBoardGameDL.g:2423:3: ( ruleEString )
            // InternalBoardGameDL.g:2424:4: ruleEString
            {
             before(grammarAccess.getPieceTypeAccess().getValidmovesValidMoveEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPieceTypeAccess().getValidmovesValidMoveEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getPieceTypeAccess().getValidmovesValidMoveCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__ValidmovesAssignment_7"


    // $ANTLR start "rule__PieceType__ValidmovesAssignment_8_1"
    // InternalBoardGameDL.g:2435:1: rule__PieceType__ValidmovesAssignment_8_1 : ( ( ruleEString ) ) ;
    public final void rule__PieceType__ValidmovesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2439:1: ( ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:2440:2: ( ( ruleEString ) )
            {
            // InternalBoardGameDL.g:2440:2: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2441:3: ( ruleEString )
            {
             before(grammarAccess.getPieceTypeAccess().getValidmovesValidMoveCrossReference_8_1_0()); 
            // InternalBoardGameDL.g:2442:3: ( ruleEString )
            // InternalBoardGameDL.g:2443:4: ruleEString
            {
             before(grammarAccess.getPieceTypeAccess().getValidmovesValidMoveEStringParserRuleCall_8_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPieceTypeAccess().getValidmovesValidMoveEStringParserRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getPieceTypeAccess().getValidmovesValidMoveCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__ValidmovesAssignment_8_1"


    // $ANTLR start "rule__PieceType__EffectsoncellAssignment_10_2"
    // InternalBoardGameDL.g:2454:1: rule__PieceType__EffectsoncellAssignment_10_2 : ( ( ruleEString ) ) ;
    public final void rule__PieceType__EffectsoncellAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2458:1: ( ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:2459:2: ( ( ruleEString ) )
            {
            // InternalBoardGameDL.g:2459:2: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2460:3: ( ruleEString )
            {
             before(grammarAccess.getPieceTypeAccess().getEffectsoncellEffectOnCellCrossReference_10_2_0()); 
            // InternalBoardGameDL.g:2461:3: ( ruleEString )
            // InternalBoardGameDL.g:2462:4: ruleEString
            {
             before(grammarAccess.getPieceTypeAccess().getEffectsoncellEffectOnCellEStringParserRuleCall_10_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPieceTypeAccess().getEffectsoncellEffectOnCellEStringParserRuleCall_10_2_0_1()); 

            }

             after(grammarAccess.getPieceTypeAccess().getEffectsoncellEffectOnCellCrossReference_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__EffectsoncellAssignment_10_2"


    // $ANTLR start "rule__PieceType__EffectsoncellAssignment_10_3_1"
    // InternalBoardGameDL.g:2473:1: rule__PieceType__EffectsoncellAssignment_10_3_1 : ( ( ruleEString ) ) ;
    public final void rule__PieceType__EffectsoncellAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2477:1: ( ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:2478:2: ( ( ruleEString ) )
            {
            // InternalBoardGameDL.g:2478:2: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2479:3: ( ruleEString )
            {
             before(grammarAccess.getPieceTypeAccess().getEffectsoncellEffectOnCellCrossReference_10_3_1_0()); 
            // InternalBoardGameDL.g:2480:3: ( ruleEString )
            // InternalBoardGameDL.g:2481:4: ruleEString
            {
             before(grammarAccess.getPieceTypeAccess().getEffectsoncellEffectOnCellEStringParserRuleCall_10_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPieceTypeAccess().getEffectsoncellEffectOnCellEStringParserRuleCall_10_3_1_0_1()); 

            }

             after(grammarAccess.getPieceTypeAccess().getEffectsoncellEffectOnCellCrossReference_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__EffectsoncellAssignment_10_3_1"


    // $ANTLR start "rule__CellState__NameAssignment_1"
    // InternalBoardGameDL.g:2492:1: rule__CellState__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CellState__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2496:1: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2497:2: ( ruleEString )
            {
            // InternalBoardGameDL.g:2497:2: ( ruleEString )
            // InternalBoardGameDL.g:2498:3: ruleEString
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


    // $ANTLR start "rule__WinCondition__InarowAssignment_1"
    // InternalBoardGameDL.g:2507:1: rule__WinCondition__InarowAssignment_1 : ( ruleInARow ) ;
    public final void rule__WinCondition__InarowAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2511:1: ( ( ruleInARow ) )
            // InternalBoardGameDL.g:2512:2: ( ruleInARow )
            {
            // InternalBoardGameDL.g:2512:2: ( ruleInARow )
            // InternalBoardGameDL.g:2513:3: ruleInARow
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


    // $ANTLR start "rule__ValidMove__NameAssignment_1"
    // InternalBoardGameDL.g:2522:1: rule__ValidMove__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ValidMove__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2526:1: ( ( RULE_ID ) )
            // InternalBoardGameDL.g:2527:2: ( RULE_ID )
            {
            // InternalBoardGameDL.g:2527:2: ( RULE_ID )
            // InternalBoardGameDL.g:2528:3: RULE_ID
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
    // InternalBoardGameDL.g:2537:1: rule__ValidMove__PlaceAnywhereAssignment_3 : ( ( 'placeAnywhere' ) ) ;
    public final void rule__ValidMove__PlaceAnywhereAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2541:1: ( ( ( 'placeAnywhere' ) ) )
            // InternalBoardGameDL.g:2542:2: ( ( 'placeAnywhere' ) )
            {
            // InternalBoardGameDL.g:2542:2: ( ( 'placeAnywhere' ) )
            // InternalBoardGameDL.g:2543:3: ( 'placeAnywhere' )
            {
             before(grammarAccess.getValidMoveAccess().getPlaceAnywherePlaceAnywhereKeyword_3_0()); 
            // InternalBoardGameDL.g:2544:3: ( 'placeAnywhere' )
            // InternalBoardGameDL.g:2545:4: 'placeAnywhere'
            {
             before(grammarAccess.getValidMoveAccess().getPlaceAnywherePlaceAnywhereKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBoardGameDL.g:2556:1: rule__ValidMove__ConditionsAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__ValidMove__ConditionsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2560:1: ( ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:2561:2: ( ( ruleEString ) )
            {
            // InternalBoardGameDL.g:2561:2: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2562:3: ( ruleEString )
            {
             before(grammarAccess.getValidMoveAccess().getConditionsConditionCrossReference_4_2_0()); 
            // InternalBoardGameDL.g:2563:3: ( ruleEString )
            // InternalBoardGameDL.g:2564:4: ruleEString
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
    // InternalBoardGameDL.g:2575:1: rule__ValidMove__ConditionsAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ValidMove__ConditionsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2579:1: ( ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:2580:2: ( ( ruleEString ) )
            {
            // InternalBoardGameDL.g:2580:2: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2581:3: ( ruleEString )
            {
             before(grammarAccess.getValidMoveAccess().getConditionsConditionCrossReference_4_3_1_0()); 
            // InternalBoardGameDL.g:2582:3: ( ruleEString )
            // InternalBoardGameDL.g:2583:4: ruleEString
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
    // InternalBoardGameDL.g:2594:1: rule__EffectOnCell__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EffectOnCell__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2598:1: ( ( RULE_ID ) )
            // InternalBoardGameDL.g:2599:2: ( RULE_ID )
            {
            // InternalBoardGameDL.g:2599:2: ( RULE_ID )
            // InternalBoardGameDL.g:2600:3: RULE_ID
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
    // InternalBoardGameDL.g:2609:1: rule__EffectOnCell__XAssignment_3_0_2 : ( ruleEInt ) ;
    public final void rule__EffectOnCell__XAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2613:1: ( ( ruleEInt ) )
            // InternalBoardGameDL.g:2614:2: ( ruleEInt )
            {
            // InternalBoardGameDL.g:2614:2: ( ruleEInt )
            // InternalBoardGameDL.g:2615:3: ruleEInt
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
    // InternalBoardGameDL.g:2624:1: rule__EffectOnCell__YAssignment_3_0_4 : ( ruleEInt ) ;
    public final void rule__EffectOnCell__YAssignment_3_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2628:1: ( ( ruleEInt ) )
            // InternalBoardGameDL.g:2629:2: ( ruleEInt )
            {
            // InternalBoardGameDL.g:2629:2: ( ruleEInt )
            // InternalBoardGameDL.g:2630:3: ruleEInt
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


    // $ANTLR start "rule__EffectOnCell__CellstateAssignment_3_1_2"
    // InternalBoardGameDL.g:2639:1: rule__EffectOnCell__CellstateAssignment_3_1_2 : ( ( ruleEString ) ) ;
    public final void rule__EffectOnCell__CellstateAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2643:1: ( ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:2644:2: ( ( ruleEString ) )
            {
            // InternalBoardGameDL.g:2644:2: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2645:3: ( ruleEString )
            {
             before(grammarAccess.getEffectOnCellAccess().getCellstateCellStateCrossReference_3_1_2_0()); 
            // InternalBoardGameDL.g:2646:3: ( ruleEString )
            // InternalBoardGameDL.g:2647:4: ruleEString
            {
             before(grammarAccess.getEffectOnCellAccess().getCellstateCellStateEStringParserRuleCall_3_1_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEffectOnCellAccess().getCellstateCellStateEStringParserRuleCall_3_1_2_0_1()); 

            }

             after(grammarAccess.getEffectOnCellAccess().getCellstateCellStateCrossReference_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectOnCell__CellstateAssignment_3_1_2"


    // $ANTLR start "rule__Condition__NameAssignment_1"
    // InternalBoardGameDL.g:2658:1: rule__Condition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Condition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2662:1: ( ( RULE_ID ) )
            // InternalBoardGameDL.g:2663:2: ( RULE_ID )
            {
            // InternalBoardGameDL.g:2663:2: ( RULE_ID )
            // InternalBoardGameDL.g:2664:3: RULE_ID
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


    // $ANTLR start "rule__Condition__CellstateAssignment_2"
    // InternalBoardGameDL.g:2673:1: rule__Condition__CellstateAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Condition__CellstateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2677:1: ( ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:2678:2: ( ( ruleEString ) )
            {
            // InternalBoardGameDL.g:2678:2: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2679:3: ( ruleEString )
            {
             before(grammarAccess.getConditionAccess().getCellstateCellStateCrossReference_2_0()); 
            // InternalBoardGameDL.g:2680:3: ( ruleEString )
            // InternalBoardGameDL.g:2681:4: ruleEString
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


    // $ANTLR start "rule__InARow__CountAssignment_0_1"
    // InternalBoardGameDL.g:2692:1: rule__InARow__CountAssignment_0_1 : ( ruleEInt ) ;
    public final void rule__InARow__CountAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2696:1: ( ( ruleEInt ) )
            // InternalBoardGameDL.g:2697:2: ( ruleEInt )
            {
            // InternalBoardGameDL.g:2697:2: ( ruleEInt )
            // InternalBoardGameDL.g:2698:3: ruleEInt
            {
             before(grammarAccess.getInARowAccess().getCountEIntParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getInARowAccess().getCountEIntParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InARow__CountAssignment_0_1"


    // $ANTLR start "rule__InARow__HorizontalAssignment_1"
    // InternalBoardGameDL.g:2707:1: rule__InARow__HorizontalAssignment_1 : ( ( 'horizontal' ) ) ;
    public final void rule__InARow__HorizontalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2711:1: ( ( ( 'horizontal' ) ) )
            // InternalBoardGameDL.g:2712:2: ( ( 'horizontal' ) )
            {
            // InternalBoardGameDL.g:2712:2: ( ( 'horizontal' ) )
            // InternalBoardGameDL.g:2713:3: ( 'horizontal' )
            {
             before(grammarAccess.getInARowAccess().getHorizontalHorizontalKeyword_1_0()); 
            // InternalBoardGameDL.g:2714:3: ( 'horizontal' )
            // InternalBoardGameDL.g:2715:4: 'horizontal'
            {
             before(grammarAccess.getInARowAccess().getHorizontalHorizontalKeyword_1_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBoardGameDL.g:2726:1: rule__InARow__VerticalAssignment_2 : ( ( 'vertical' ) ) ;
    public final void rule__InARow__VerticalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2730:1: ( ( ( 'vertical' ) ) )
            // InternalBoardGameDL.g:2731:2: ( ( 'vertical' ) )
            {
            // InternalBoardGameDL.g:2731:2: ( ( 'vertical' ) )
            // InternalBoardGameDL.g:2732:3: ( 'vertical' )
            {
             before(grammarAccess.getInARowAccess().getVerticalVerticalKeyword_2_0()); 
            // InternalBoardGameDL.g:2733:3: ( 'vertical' )
            // InternalBoardGameDL.g:2734:4: 'vertical'
            {
             before(grammarAccess.getInARowAccess().getVerticalVerticalKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
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


    // $ANTLR start "rule__InARow__DiagonalAssignment_3"
    // InternalBoardGameDL.g:2745:1: rule__InARow__DiagonalAssignment_3 : ( ( 'diagonal' ) ) ;
    public final void rule__InARow__DiagonalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2749:1: ( ( ( 'diagonal' ) ) )
            // InternalBoardGameDL.g:2750:2: ( ( 'diagonal' ) )
            {
            // InternalBoardGameDL.g:2750:2: ( ( 'diagonal' ) )
            // InternalBoardGameDL.g:2751:3: ( 'diagonal' )
            {
             before(grammarAccess.getInARowAccess().getDiagonalDiagonalKeyword_3_0()); 
            // InternalBoardGameDL.g:2752:3: ( 'diagonal' )
            // InternalBoardGameDL.g:2753:4: 'diagonal'
            {
             before(grammarAccess.getInARowAccess().getDiagonalDiagonalKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getInARowAccess().getDiagonalDiagonalKeyword_3_0()); 

            }

             after(grammarAccess.getInARowAccess().getDiagonalDiagonalKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InARow__DiagonalAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000422C02000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000422C02002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000E800000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000240000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000E800000002L});

}
