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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Title'", "'BoardSize'", "'PieceType'", "'{'", "'Symbol'", "'ValidMoves'", "'}'", "','", "'EffectsOnCell'", "'Cellstate'", "'WinCondition'", "'-'", "'ValidMove'", "'valid'", "'if'", "'and'", "'EffectOnCell'", "'relativePosition'", "'('", "')'", "'newCellState'", "'Condition'", "'Line'", "'count'", "'placeAnywhere'", "'horizontal'", "'vertical'", "'diagonal'", "'unique'"
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


    // $ANTLR start "rule__BoardGameElement__Alternatives"
    // InternalBoardGameDL.g:352:1: rule__BoardGameElement__Alternatives : ( ( rulePieceType ) | ( ruleEffectOnCell ) | ( ruleValidMove ) | ( ruleCellState ) | ( ruleWinCondition ) | ( ruleCondition ) );
    public final void rule__BoardGameElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:356:1: ( ( rulePieceType ) | ( ruleEffectOnCell ) | ( ruleValidMove ) | ( ruleCellState ) | ( ruleWinCondition ) | ( ruleCondition ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt1=1;
                }
                break;
            case 27:
                {
                alt1=2;
                }
                break;
            case 23:
                {
                alt1=3;
                }
                break;
            case 20:
                {
                alt1=4;
                }
                break;
            case 21:
                {
                alt1=5;
                }
                break;
            case 32:
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
                    // InternalBoardGameDL.g:357:2: ( rulePieceType )
                    {
                    // InternalBoardGameDL.g:357:2: ( rulePieceType )
                    // InternalBoardGameDL.g:358:3: rulePieceType
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
                    // InternalBoardGameDL.g:363:2: ( ruleEffectOnCell )
                    {
                    // InternalBoardGameDL.g:363:2: ( ruleEffectOnCell )
                    // InternalBoardGameDL.g:364:3: ruleEffectOnCell
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
                    // InternalBoardGameDL.g:369:2: ( ruleValidMove )
                    {
                    // InternalBoardGameDL.g:369:2: ( ruleValidMove )
                    // InternalBoardGameDL.g:370:3: ruleValidMove
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
                    // InternalBoardGameDL.g:375:2: ( ruleCellState )
                    {
                    // InternalBoardGameDL.g:375:2: ( ruleCellState )
                    // InternalBoardGameDL.g:376:3: ruleCellState
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
                    // InternalBoardGameDL.g:381:2: ( ruleWinCondition )
                    {
                    // InternalBoardGameDL.g:381:2: ( ruleWinCondition )
                    // InternalBoardGameDL.g:382:3: ruleWinCondition
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
                    // InternalBoardGameDL.g:387:2: ( ruleCondition )
                    {
                    // InternalBoardGameDL.g:387:2: ( ruleCondition )
                    // InternalBoardGameDL.g:388:3: ruleCondition
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
    // InternalBoardGameDL.g:397:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:401:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalBoardGameDL.g:402:2: ( RULE_STRING )
                    {
                    // InternalBoardGameDL.g:402:2: ( RULE_STRING )
                    // InternalBoardGameDL.g:403:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBoardGameDL.g:408:2: ( RULE_ID )
                    {
                    // InternalBoardGameDL.g:408:2: ( RULE_ID )
                    // InternalBoardGameDL.g:409:3: RULE_ID
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
    // InternalBoardGameDL.g:418:1: rule__BoardGame__Group__0 : rule__BoardGame__Group__0__Impl rule__BoardGame__Group__1 ;
    public final void rule__BoardGame__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:422:1: ( rule__BoardGame__Group__0__Impl rule__BoardGame__Group__1 )
            // InternalBoardGameDL.g:423:2: rule__BoardGame__Group__0__Impl rule__BoardGame__Group__1
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
    // InternalBoardGameDL.g:430:1: rule__BoardGame__Group__0__Impl : ( 'Title' ) ;
    public final void rule__BoardGame__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:434:1: ( ( 'Title' ) )
            // InternalBoardGameDL.g:435:1: ( 'Title' )
            {
            // InternalBoardGameDL.g:435:1: ( 'Title' )
            // InternalBoardGameDL.g:436:2: 'Title'
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
    // InternalBoardGameDL.g:445:1: rule__BoardGame__Group__1 : rule__BoardGame__Group__1__Impl rule__BoardGame__Group__2 ;
    public final void rule__BoardGame__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:449:1: ( rule__BoardGame__Group__1__Impl rule__BoardGame__Group__2 )
            // InternalBoardGameDL.g:450:2: rule__BoardGame__Group__1__Impl rule__BoardGame__Group__2
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
    // InternalBoardGameDL.g:457:1: rule__BoardGame__Group__1__Impl : ( ( rule__BoardGame__NameAssignment_1 ) ) ;
    public final void rule__BoardGame__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:461:1: ( ( ( rule__BoardGame__NameAssignment_1 ) ) )
            // InternalBoardGameDL.g:462:1: ( ( rule__BoardGame__NameAssignment_1 ) )
            {
            // InternalBoardGameDL.g:462:1: ( ( rule__BoardGame__NameAssignment_1 ) )
            // InternalBoardGameDL.g:463:2: ( rule__BoardGame__NameAssignment_1 )
            {
             before(grammarAccess.getBoardGameAccess().getNameAssignment_1()); 
            // InternalBoardGameDL.g:464:2: ( rule__BoardGame__NameAssignment_1 )
            // InternalBoardGameDL.g:464:3: rule__BoardGame__NameAssignment_1
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
    // InternalBoardGameDL.g:472:1: rule__BoardGame__Group__2 : rule__BoardGame__Group__2__Impl rule__BoardGame__Group__3 ;
    public final void rule__BoardGame__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:476:1: ( rule__BoardGame__Group__2__Impl rule__BoardGame__Group__3 )
            // InternalBoardGameDL.g:477:2: rule__BoardGame__Group__2__Impl rule__BoardGame__Group__3
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
    // InternalBoardGameDL.g:484:1: rule__BoardGame__Group__2__Impl : ( 'BoardSize' ) ;
    public final void rule__BoardGame__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:488:1: ( ( 'BoardSize' ) )
            // InternalBoardGameDL.g:489:1: ( 'BoardSize' )
            {
            // InternalBoardGameDL.g:489:1: ( 'BoardSize' )
            // InternalBoardGameDL.g:490:2: 'BoardSize'
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
    // InternalBoardGameDL.g:499:1: rule__BoardGame__Group__3 : rule__BoardGame__Group__3__Impl rule__BoardGame__Group__4 ;
    public final void rule__BoardGame__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:503:1: ( rule__BoardGame__Group__3__Impl rule__BoardGame__Group__4 )
            // InternalBoardGameDL.g:504:2: rule__BoardGame__Group__3__Impl rule__BoardGame__Group__4
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
    // InternalBoardGameDL.g:511:1: rule__BoardGame__Group__3__Impl : ( ( rule__BoardGame__SizeAssignment_3 ) ) ;
    public final void rule__BoardGame__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:515:1: ( ( ( rule__BoardGame__SizeAssignment_3 ) ) )
            // InternalBoardGameDL.g:516:1: ( ( rule__BoardGame__SizeAssignment_3 ) )
            {
            // InternalBoardGameDL.g:516:1: ( ( rule__BoardGame__SizeAssignment_3 ) )
            // InternalBoardGameDL.g:517:2: ( rule__BoardGame__SizeAssignment_3 )
            {
             before(grammarAccess.getBoardGameAccess().getSizeAssignment_3()); 
            // InternalBoardGameDL.g:518:2: ( rule__BoardGame__SizeAssignment_3 )
            // InternalBoardGameDL.g:518:3: rule__BoardGame__SizeAssignment_3
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
    // InternalBoardGameDL.g:526:1: rule__BoardGame__Group__4 : rule__BoardGame__Group__4__Impl ;
    public final void rule__BoardGame__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:530:1: ( rule__BoardGame__Group__4__Impl )
            // InternalBoardGameDL.g:531:2: rule__BoardGame__Group__4__Impl
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
    // InternalBoardGameDL.g:537:1: rule__BoardGame__Group__4__Impl : ( ( rule__BoardGame__BoardGameElementsAssignment_4 )* ) ;
    public final void rule__BoardGame__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:541:1: ( ( ( rule__BoardGame__BoardGameElementsAssignment_4 )* ) )
            // InternalBoardGameDL.g:542:1: ( ( rule__BoardGame__BoardGameElementsAssignment_4 )* )
            {
            // InternalBoardGameDL.g:542:1: ( ( rule__BoardGame__BoardGameElementsAssignment_4 )* )
            // InternalBoardGameDL.g:543:2: ( rule__BoardGame__BoardGameElementsAssignment_4 )*
            {
             before(grammarAccess.getBoardGameAccess().getBoardGameElementsAssignment_4()); 
            // InternalBoardGameDL.g:544:2: ( rule__BoardGame__BoardGameElementsAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13||(LA3_0>=20 && LA3_0<=21)||LA3_0==23||LA3_0==27||LA3_0==32) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBoardGameDL.g:544:3: rule__BoardGame__BoardGameElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BoardGame__BoardGameElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalBoardGameDL.g:553:1: rule__PieceType__Group__0 : rule__PieceType__Group__0__Impl rule__PieceType__Group__1 ;
    public final void rule__PieceType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:557:1: ( rule__PieceType__Group__0__Impl rule__PieceType__Group__1 )
            // InternalBoardGameDL.g:558:2: rule__PieceType__Group__0__Impl rule__PieceType__Group__1
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
    // InternalBoardGameDL.g:565:1: rule__PieceType__Group__0__Impl : ( 'PieceType' ) ;
    public final void rule__PieceType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:569:1: ( ( 'PieceType' ) )
            // InternalBoardGameDL.g:570:1: ( 'PieceType' )
            {
            // InternalBoardGameDL.g:570:1: ( 'PieceType' )
            // InternalBoardGameDL.g:571:2: 'PieceType'
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
    // InternalBoardGameDL.g:580:1: rule__PieceType__Group__1 : rule__PieceType__Group__1__Impl rule__PieceType__Group__2 ;
    public final void rule__PieceType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:584:1: ( rule__PieceType__Group__1__Impl rule__PieceType__Group__2 )
            // InternalBoardGameDL.g:585:2: rule__PieceType__Group__1__Impl rule__PieceType__Group__2
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
    // InternalBoardGameDL.g:592:1: rule__PieceType__Group__1__Impl : ( ( rule__PieceType__NameAssignment_1 ) ) ;
    public final void rule__PieceType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:596:1: ( ( ( rule__PieceType__NameAssignment_1 ) ) )
            // InternalBoardGameDL.g:597:1: ( ( rule__PieceType__NameAssignment_1 ) )
            {
            // InternalBoardGameDL.g:597:1: ( ( rule__PieceType__NameAssignment_1 ) )
            // InternalBoardGameDL.g:598:2: ( rule__PieceType__NameAssignment_1 )
            {
             before(grammarAccess.getPieceTypeAccess().getNameAssignment_1()); 
            // InternalBoardGameDL.g:599:2: ( rule__PieceType__NameAssignment_1 )
            // InternalBoardGameDL.g:599:3: rule__PieceType__NameAssignment_1
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
    // InternalBoardGameDL.g:607:1: rule__PieceType__Group__2 : rule__PieceType__Group__2__Impl rule__PieceType__Group__3 ;
    public final void rule__PieceType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:611:1: ( rule__PieceType__Group__2__Impl rule__PieceType__Group__3 )
            // InternalBoardGameDL.g:612:2: rule__PieceType__Group__2__Impl rule__PieceType__Group__3
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
    // InternalBoardGameDL.g:619:1: rule__PieceType__Group__2__Impl : ( '{' ) ;
    public final void rule__PieceType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:623:1: ( ( '{' ) )
            // InternalBoardGameDL.g:624:1: ( '{' )
            {
            // InternalBoardGameDL.g:624:1: ( '{' )
            // InternalBoardGameDL.g:625:2: '{'
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
    // InternalBoardGameDL.g:634:1: rule__PieceType__Group__3 : rule__PieceType__Group__3__Impl rule__PieceType__Group__4 ;
    public final void rule__PieceType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:638:1: ( rule__PieceType__Group__3__Impl rule__PieceType__Group__4 )
            // InternalBoardGameDL.g:639:2: rule__PieceType__Group__3__Impl rule__PieceType__Group__4
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
    // InternalBoardGameDL.g:646:1: rule__PieceType__Group__3__Impl : ( 'Symbol' ) ;
    public final void rule__PieceType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:650:1: ( ( 'Symbol' ) )
            // InternalBoardGameDL.g:651:1: ( 'Symbol' )
            {
            // InternalBoardGameDL.g:651:1: ( 'Symbol' )
            // InternalBoardGameDL.g:652:2: 'Symbol'
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
    // InternalBoardGameDL.g:661:1: rule__PieceType__Group__4 : rule__PieceType__Group__4__Impl rule__PieceType__Group__5 ;
    public final void rule__PieceType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:665:1: ( rule__PieceType__Group__4__Impl rule__PieceType__Group__5 )
            // InternalBoardGameDL.g:666:2: rule__PieceType__Group__4__Impl rule__PieceType__Group__5
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
    // InternalBoardGameDL.g:673:1: rule__PieceType__Group__4__Impl : ( ( rule__PieceType__SymbolAssignment_4 ) ) ;
    public final void rule__PieceType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:677:1: ( ( ( rule__PieceType__SymbolAssignment_4 ) ) )
            // InternalBoardGameDL.g:678:1: ( ( rule__PieceType__SymbolAssignment_4 ) )
            {
            // InternalBoardGameDL.g:678:1: ( ( rule__PieceType__SymbolAssignment_4 ) )
            // InternalBoardGameDL.g:679:2: ( rule__PieceType__SymbolAssignment_4 )
            {
             before(grammarAccess.getPieceTypeAccess().getSymbolAssignment_4()); 
            // InternalBoardGameDL.g:680:2: ( rule__PieceType__SymbolAssignment_4 )
            // InternalBoardGameDL.g:680:3: rule__PieceType__SymbolAssignment_4
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
    // InternalBoardGameDL.g:688:1: rule__PieceType__Group__5 : rule__PieceType__Group__5__Impl rule__PieceType__Group__6 ;
    public final void rule__PieceType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:692:1: ( rule__PieceType__Group__5__Impl rule__PieceType__Group__6 )
            // InternalBoardGameDL.g:693:2: rule__PieceType__Group__5__Impl rule__PieceType__Group__6
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
    // InternalBoardGameDL.g:700:1: rule__PieceType__Group__5__Impl : ( 'ValidMoves' ) ;
    public final void rule__PieceType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:704:1: ( ( 'ValidMoves' ) )
            // InternalBoardGameDL.g:705:1: ( 'ValidMoves' )
            {
            // InternalBoardGameDL.g:705:1: ( 'ValidMoves' )
            // InternalBoardGameDL.g:706:2: 'ValidMoves'
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
    // InternalBoardGameDL.g:715:1: rule__PieceType__Group__6 : rule__PieceType__Group__6__Impl rule__PieceType__Group__7 ;
    public final void rule__PieceType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:719:1: ( rule__PieceType__Group__6__Impl rule__PieceType__Group__7 )
            // InternalBoardGameDL.g:720:2: rule__PieceType__Group__6__Impl rule__PieceType__Group__7
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
    // InternalBoardGameDL.g:727:1: rule__PieceType__Group__6__Impl : ( ( rule__PieceType__ValidMovesAssignment_6 ) ) ;
    public final void rule__PieceType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:731:1: ( ( ( rule__PieceType__ValidMovesAssignment_6 ) ) )
            // InternalBoardGameDL.g:732:1: ( ( rule__PieceType__ValidMovesAssignment_6 ) )
            {
            // InternalBoardGameDL.g:732:1: ( ( rule__PieceType__ValidMovesAssignment_6 ) )
            // InternalBoardGameDL.g:733:2: ( rule__PieceType__ValidMovesAssignment_6 )
            {
             before(grammarAccess.getPieceTypeAccess().getValidMovesAssignment_6()); 
            // InternalBoardGameDL.g:734:2: ( rule__PieceType__ValidMovesAssignment_6 )
            // InternalBoardGameDL.g:734:3: rule__PieceType__ValidMovesAssignment_6
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
    // InternalBoardGameDL.g:742:1: rule__PieceType__Group__7 : rule__PieceType__Group__7__Impl rule__PieceType__Group__8 ;
    public final void rule__PieceType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:746:1: ( rule__PieceType__Group__7__Impl rule__PieceType__Group__8 )
            // InternalBoardGameDL.g:747:2: rule__PieceType__Group__7__Impl rule__PieceType__Group__8
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
    // InternalBoardGameDL.g:754:1: rule__PieceType__Group__7__Impl : ( ( rule__PieceType__Group_7__0 )* ) ;
    public final void rule__PieceType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:758:1: ( ( ( rule__PieceType__Group_7__0 )* ) )
            // InternalBoardGameDL.g:759:1: ( ( rule__PieceType__Group_7__0 )* )
            {
            // InternalBoardGameDL.g:759:1: ( ( rule__PieceType__Group_7__0 )* )
            // InternalBoardGameDL.g:760:2: ( rule__PieceType__Group_7__0 )*
            {
             before(grammarAccess.getPieceTypeAccess().getGroup_7()); 
            // InternalBoardGameDL.g:761:2: ( rule__PieceType__Group_7__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBoardGameDL.g:761:3: rule__PieceType__Group_7__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__PieceType__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalBoardGameDL.g:769:1: rule__PieceType__Group__8 : rule__PieceType__Group__8__Impl rule__PieceType__Group__9 ;
    public final void rule__PieceType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:773:1: ( rule__PieceType__Group__8__Impl rule__PieceType__Group__9 )
            // InternalBoardGameDL.g:774:2: rule__PieceType__Group__8__Impl rule__PieceType__Group__9
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
    // InternalBoardGameDL.g:781:1: rule__PieceType__Group__8__Impl : ( ( rule__PieceType__Group_8__0 )? ) ;
    public final void rule__PieceType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:785:1: ( ( ( rule__PieceType__Group_8__0 )? ) )
            // InternalBoardGameDL.g:786:1: ( ( rule__PieceType__Group_8__0 )? )
            {
            // InternalBoardGameDL.g:786:1: ( ( rule__PieceType__Group_8__0 )? )
            // InternalBoardGameDL.g:787:2: ( rule__PieceType__Group_8__0 )?
            {
             before(grammarAccess.getPieceTypeAccess().getGroup_8()); 
            // InternalBoardGameDL.g:788:2: ( rule__PieceType__Group_8__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBoardGameDL.g:788:3: rule__PieceType__Group_8__0
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
    // InternalBoardGameDL.g:796:1: rule__PieceType__Group__9 : rule__PieceType__Group__9__Impl ;
    public final void rule__PieceType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:800:1: ( rule__PieceType__Group__9__Impl )
            // InternalBoardGameDL.g:801:2: rule__PieceType__Group__9__Impl
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
    // InternalBoardGameDL.g:807:1: rule__PieceType__Group__9__Impl : ( '}' ) ;
    public final void rule__PieceType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:811:1: ( ( '}' ) )
            // InternalBoardGameDL.g:812:1: ( '}' )
            {
            // InternalBoardGameDL.g:812:1: ( '}' )
            // InternalBoardGameDL.g:813:2: '}'
            {
             before(grammarAccess.getPieceTypeAccess().getRightCurlyBracketKeyword_9()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBoardGameDL.g:823:1: rule__PieceType__Group_7__0 : rule__PieceType__Group_7__0__Impl rule__PieceType__Group_7__1 ;
    public final void rule__PieceType__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:827:1: ( rule__PieceType__Group_7__0__Impl rule__PieceType__Group_7__1 )
            // InternalBoardGameDL.g:828:2: rule__PieceType__Group_7__0__Impl rule__PieceType__Group_7__1
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
    // InternalBoardGameDL.g:835:1: rule__PieceType__Group_7__0__Impl : ( ',' ) ;
    public final void rule__PieceType__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:839:1: ( ( ',' ) )
            // InternalBoardGameDL.g:840:1: ( ',' )
            {
            // InternalBoardGameDL.g:840:1: ( ',' )
            // InternalBoardGameDL.g:841:2: ','
            {
             before(grammarAccess.getPieceTypeAccess().getCommaKeyword_7_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalBoardGameDL.g:850:1: rule__PieceType__Group_7__1 : rule__PieceType__Group_7__1__Impl ;
    public final void rule__PieceType__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:854:1: ( rule__PieceType__Group_7__1__Impl )
            // InternalBoardGameDL.g:855:2: rule__PieceType__Group_7__1__Impl
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
    // InternalBoardGameDL.g:861:1: rule__PieceType__Group_7__1__Impl : ( ( rule__PieceType__ValidMovesAssignment_7_1 ) ) ;
    public final void rule__PieceType__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:865:1: ( ( ( rule__PieceType__ValidMovesAssignment_7_1 ) ) )
            // InternalBoardGameDL.g:866:1: ( ( rule__PieceType__ValidMovesAssignment_7_1 ) )
            {
            // InternalBoardGameDL.g:866:1: ( ( rule__PieceType__ValidMovesAssignment_7_1 ) )
            // InternalBoardGameDL.g:867:2: ( rule__PieceType__ValidMovesAssignment_7_1 )
            {
             before(grammarAccess.getPieceTypeAccess().getValidMovesAssignment_7_1()); 
            // InternalBoardGameDL.g:868:2: ( rule__PieceType__ValidMovesAssignment_7_1 )
            // InternalBoardGameDL.g:868:3: rule__PieceType__ValidMovesAssignment_7_1
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
    // InternalBoardGameDL.g:877:1: rule__PieceType__Group_8__0 : rule__PieceType__Group_8__0__Impl rule__PieceType__Group_8__1 ;
    public final void rule__PieceType__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:881:1: ( rule__PieceType__Group_8__0__Impl rule__PieceType__Group_8__1 )
            // InternalBoardGameDL.g:882:2: rule__PieceType__Group_8__0__Impl rule__PieceType__Group_8__1
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
    // InternalBoardGameDL.g:889:1: rule__PieceType__Group_8__0__Impl : ( 'EffectsOnCell' ) ;
    public final void rule__PieceType__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:893:1: ( ( 'EffectsOnCell' ) )
            // InternalBoardGameDL.g:894:1: ( 'EffectsOnCell' )
            {
            // InternalBoardGameDL.g:894:1: ( 'EffectsOnCell' )
            // InternalBoardGameDL.g:895:2: 'EffectsOnCell'
            {
             before(grammarAccess.getPieceTypeAccess().getEffectsOnCellKeyword_8_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalBoardGameDL.g:904:1: rule__PieceType__Group_8__1 : rule__PieceType__Group_8__1__Impl rule__PieceType__Group_8__2 ;
    public final void rule__PieceType__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:908:1: ( rule__PieceType__Group_8__1__Impl rule__PieceType__Group_8__2 )
            // InternalBoardGameDL.g:909:2: rule__PieceType__Group_8__1__Impl rule__PieceType__Group_8__2
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
    // InternalBoardGameDL.g:916:1: rule__PieceType__Group_8__1__Impl : ( ( rule__PieceType__EffectsoncellAssignment_8_1 ) ) ;
    public final void rule__PieceType__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:920:1: ( ( ( rule__PieceType__EffectsoncellAssignment_8_1 ) ) )
            // InternalBoardGameDL.g:921:1: ( ( rule__PieceType__EffectsoncellAssignment_8_1 ) )
            {
            // InternalBoardGameDL.g:921:1: ( ( rule__PieceType__EffectsoncellAssignment_8_1 ) )
            // InternalBoardGameDL.g:922:2: ( rule__PieceType__EffectsoncellAssignment_8_1 )
            {
             before(grammarAccess.getPieceTypeAccess().getEffectsoncellAssignment_8_1()); 
            // InternalBoardGameDL.g:923:2: ( rule__PieceType__EffectsoncellAssignment_8_1 )
            // InternalBoardGameDL.g:923:3: rule__PieceType__EffectsoncellAssignment_8_1
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
    // InternalBoardGameDL.g:931:1: rule__PieceType__Group_8__2 : rule__PieceType__Group_8__2__Impl ;
    public final void rule__PieceType__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:935:1: ( rule__PieceType__Group_8__2__Impl )
            // InternalBoardGameDL.g:936:2: rule__PieceType__Group_8__2__Impl
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
    // InternalBoardGameDL.g:942:1: rule__PieceType__Group_8__2__Impl : ( ( rule__PieceType__Group_8_2__0 )* ) ;
    public final void rule__PieceType__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:946:1: ( ( ( rule__PieceType__Group_8_2__0 )* ) )
            // InternalBoardGameDL.g:947:1: ( ( rule__PieceType__Group_8_2__0 )* )
            {
            // InternalBoardGameDL.g:947:1: ( ( rule__PieceType__Group_8_2__0 )* )
            // InternalBoardGameDL.g:948:2: ( rule__PieceType__Group_8_2__0 )*
            {
             before(grammarAccess.getPieceTypeAccess().getGroup_8_2()); 
            // InternalBoardGameDL.g:949:2: ( rule__PieceType__Group_8_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBoardGameDL.g:949:3: rule__PieceType__Group_8_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__PieceType__Group_8_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalBoardGameDL.g:958:1: rule__PieceType__Group_8_2__0 : rule__PieceType__Group_8_2__0__Impl rule__PieceType__Group_8_2__1 ;
    public final void rule__PieceType__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:962:1: ( rule__PieceType__Group_8_2__0__Impl rule__PieceType__Group_8_2__1 )
            // InternalBoardGameDL.g:963:2: rule__PieceType__Group_8_2__0__Impl rule__PieceType__Group_8_2__1
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
    // InternalBoardGameDL.g:970:1: rule__PieceType__Group_8_2__0__Impl : ( ',' ) ;
    public final void rule__PieceType__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:974:1: ( ( ',' ) )
            // InternalBoardGameDL.g:975:1: ( ',' )
            {
            // InternalBoardGameDL.g:975:1: ( ',' )
            // InternalBoardGameDL.g:976:2: ','
            {
             before(grammarAccess.getPieceTypeAccess().getCommaKeyword_8_2_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalBoardGameDL.g:985:1: rule__PieceType__Group_8_2__1 : rule__PieceType__Group_8_2__1__Impl ;
    public final void rule__PieceType__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:989:1: ( rule__PieceType__Group_8_2__1__Impl )
            // InternalBoardGameDL.g:990:2: rule__PieceType__Group_8_2__1__Impl
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
    // InternalBoardGameDL.g:996:1: rule__PieceType__Group_8_2__1__Impl : ( ( rule__PieceType__EffectsoncellAssignment_8_2_1 ) ) ;
    public final void rule__PieceType__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1000:1: ( ( ( rule__PieceType__EffectsoncellAssignment_8_2_1 ) ) )
            // InternalBoardGameDL.g:1001:1: ( ( rule__PieceType__EffectsoncellAssignment_8_2_1 ) )
            {
            // InternalBoardGameDL.g:1001:1: ( ( rule__PieceType__EffectsoncellAssignment_8_2_1 ) )
            // InternalBoardGameDL.g:1002:2: ( rule__PieceType__EffectsoncellAssignment_8_2_1 )
            {
             before(grammarAccess.getPieceTypeAccess().getEffectsoncellAssignment_8_2_1()); 
            // InternalBoardGameDL.g:1003:2: ( rule__PieceType__EffectsoncellAssignment_8_2_1 )
            // InternalBoardGameDL.g:1003:3: rule__PieceType__EffectsoncellAssignment_8_2_1
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
    // InternalBoardGameDL.g:1012:1: rule__CellState__Group__0 : rule__CellState__Group__0__Impl rule__CellState__Group__1 ;
    public final void rule__CellState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1016:1: ( rule__CellState__Group__0__Impl rule__CellState__Group__1 )
            // InternalBoardGameDL.g:1017:2: rule__CellState__Group__0__Impl rule__CellState__Group__1
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
    // InternalBoardGameDL.g:1024:1: rule__CellState__Group__0__Impl : ( 'Cellstate' ) ;
    public final void rule__CellState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1028:1: ( ( 'Cellstate' ) )
            // InternalBoardGameDL.g:1029:1: ( 'Cellstate' )
            {
            // InternalBoardGameDL.g:1029:1: ( 'Cellstate' )
            // InternalBoardGameDL.g:1030:2: 'Cellstate'
            {
             before(grammarAccess.getCellStateAccess().getCellstateKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1039:1: rule__CellState__Group__1 : rule__CellState__Group__1__Impl ;
    public final void rule__CellState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1043:1: ( rule__CellState__Group__1__Impl )
            // InternalBoardGameDL.g:1044:2: rule__CellState__Group__1__Impl
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
    // InternalBoardGameDL.g:1050:1: rule__CellState__Group__1__Impl : ( ( rule__CellState__NameAssignment_1 ) ) ;
    public final void rule__CellState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1054:1: ( ( ( rule__CellState__NameAssignment_1 ) ) )
            // InternalBoardGameDL.g:1055:1: ( ( rule__CellState__NameAssignment_1 ) )
            {
            // InternalBoardGameDL.g:1055:1: ( ( rule__CellState__NameAssignment_1 ) )
            // InternalBoardGameDL.g:1056:2: ( rule__CellState__NameAssignment_1 )
            {
             before(grammarAccess.getCellStateAccess().getNameAssignment_1()); 
            // InternalBoardGameDL.g:1057:2: ( rule__CellState__NameAssignment_1 )
            // InternalBoardGameDL.g:1057:3: rule__CellState__NameAssignment_1
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
    // InternalBoardGameDL.g:1066:1: rule__WinCondition__Group__0 : rule__WinCondition__Group__0__Impl rule__WinCondition__Group__1 ;
    public final void rule__WinCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1070:1: ( rule__WinCondition__Group__0__Impl rule__WinCondition__Group__1 )
            // InternalBoardGameDL.g:1071:2: rule__WinCondition__Group__0__Impl rule__WinCondition__Group__1
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
    // InternalBoardGameDL.g:1078:1: rule__WinCondition__Group__0__Impl : ( 'WinCondition' ) ;
    public final void rule__WinCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1082:1: ( ( 'WinCondition' ) )
            // InternalBoardGameDL.g:1083:1: ( 'WinCondition' )
            {
            // InternalBoardGameDL.g:1083:1: ( 'WinCondition' )
            // InternalBoardGameDL.g:1084:2: 'WinCondition'
            {
             before(grammarAccess.getWinConditionAccess().getWinConditionKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1093:1: rule__WinCondition__Group__1 : rule__WinCondition__Group__1__Impl rule__WinCondition__Group__2 ;
    public final void rule__WinCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1097:1: ( rule__WinCondition__Group__1__Impl rule__WinCondition__Group__2 )
            // InternalBoardGameDL.g:1098:2: rule__WinCondition__Group__1__Impl rule__WinCondition__Group__2
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
    // InternalBoardGameDL.g:1105:1: rule__WinCondition__Group__1__Impl : ( '{' ) ;
    public final void rule__WinCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1109:1: ( ( '{' ) )
            // InternalBoardGameDL.g:1110:1: ( '{' )
            {
            // InternalBoardGameDL.g:1110:1: ( '{' )
            // InternalBoardGameDL.g:1111:2: '{'
            {
             before(grammarAccess.getWinConditionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1120:1: rule__WinCondition__Group__2 : rule__WinCondition__Group__2__Impl rule__WinCondition__Group__3 ;
    public final void rule__WinCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1124:1: ( rule__WinCondition__Group__2__Impl rule__WinCondition__Group__3 )
            // InternalBoardGameDL.g:1125:2: rule__WinCondition__Group__2__Impl rule__WinCondition__Group__3
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
    // InternalBoardGameDL.g:1132:1: rule__WinCondition__Group__2__Impl : ( ( rule__WinCondition__WinConditionElementsAssignment_2 ) ) ;
    public final void rule__WinCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1136:1: ( ( ( rule__WinCondition__WinConditionElementsAssignment_2 ) ) )
            // InternalBoardGameDL.g:1137:1: ( ( rule__WinCondition__WinConditionElementsAssignment_2 ) )
            {
            // InternalBoardGameDL.g:1137:1: ( ( rule__WinCondition__WinConditionElementsAssignment_2 ) )
            // InternalBoardGameDL.g:1138:2: ( rule__WinCondition__WinConditionElementsAssignment_2 )
            {
             before(grammarAccess.getWinConditionAccess().getWinConditionElementsAssignment_2()); 
            // InternalBoardGameDL.g:1139:2: ( rule__WinCondition__WinConditionElementsAssignment_2 )
            // InternalBoardGameDL.g:1139:3: rule__WinCondition__WinConditionElementsAssignment_2
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
    // InternalBoardGameDL.g:1147:1: rule__WinCondition__Group__3 : rule__WinCondition__Group__3__Impl rule__WinCondition__Group__4 ;
    public final void rule__WinCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1151:1: ( rule__WinCondition__Group__3__Impl rule__WinCondition__Group__4 )
            // InternalBoardGameDL.g:1152:2: rule__WinCondition__Group__3__Impl rule__WinCondition__Group__4
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
    // InternalBoardGameDL.g:1159:1: rule__WinCondition__Group__3__Impl : ( ( rule__WinCondition__WinConditionElementsAssignment_3 )* ) ;
    public final void rule__WinCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1163:1: ( ( ( rule__WinCondition__WinConditionElementsAssignment_3 )* ) )
            // InternalBoardGameDL.g:1164:1: ( ( rule__WinCondition__WinConditionElementsAssignment_3 )* )
            {
            // InternalBoardGameDL.g:1164:1: ( ( rule__WinCondition__WinConditionElementsAssignment_3 )* )
            // InternalBoardGameDL.g:1165:2: ( rule__WinCondition__WinConditionElementsAssignment_3 )*
            {
             before(grammarAccess.getWinConditionAccess().getWinConditionElementsAssignment_3()); 
            // InternalBoardGameDL.g:1166:2: ( rule__WinCondition__WinConditionElementsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==33) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBoardGameDL.g:1166:3: rule__WinCondition__WinConditionElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__WinCondition__WinConditionElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalBoardGameDL.g:1174:1: rule__WinCondition__Group__4 : rule__WinCondition__Group__4__Impl ;
    public final void rule__WinCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1178:1: ( rule__WinCondition__Group__4__Impl )
            // InternalBoardGameDL.g:1179:2: rule__WinCondition__Group__4__Impl
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
    // InternalBoardGameDL.g:1185:1: rule__WinCondition__Group__4__Impl : ( '}' ) ;
    public final void rule__WinCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1189:1: ( ( '}' ) )
            // InternalBoardGameDL.g:1190:1: ( '}' )
            {
            // InternalBoardGameDL.g:1190:1: ( '}' )
            // InternalBoardGameDL.g:1191:2: '}'
            {
             before(grammarAccess.getWinConditionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1201:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1205:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalBoardGameDL.g:1206:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalBoardGameDL.g:1213:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1217:1: ( ( ( '-' )? ) )
            // InternalBoardGameDL.g:1218:1: ( ( '-' )? )
            {
            // InternalBoardGameDL.g:1218:1: ( ( '-' )? )
            // InternalBoardGameDL.g:1219:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalBoardGameDL.g:1220:2: ( '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBoardGameDL.g:1220:3: '-'
                    {
                    match(input,22,FOLLOW_2); 

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
    // InternalBoardGameDL.g:1228:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1232:1: ( rule__EInt__Group__1__Impl )
            // InternalBoardGameDL.g:1233:2: rule__EInt__Group__1__Impl
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
    // InternalBoardGameDL.g:1239:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1243:1: ( ( RULE_INT ) )
            // InternalBoardGameDL.g:1244:1: ( RULE_INT )
            {
            // InternalBoardGameDL.g:1244:1: ( RULE_INT )
            // InternalBoardGameDL.g:1245:2: RULE_INT
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
    // InternalBoardGameDL.g:1255:1: rule__ValidMove__Group__0 : rule__ValidMove__Group__0__Impl rule__ValidMove__Group__1 ;
    public final void rule__ValidMove__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1259:1: ( rule__ValidMove__Group__0__Impl rule__ValidMove__Group__1 )
            // InternalBoardGameDL.g:1260:2: rule__ValidMove__Group__0__Impl rule__ValidMove__Group__1
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
    // InternalBoardGameDL.g:1267:1: rule__ValidMove__Group__0__Impl : ( 'ValidMove' ) ;
    public final void rule__ValidMove__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1271:1: ( ( 'ValidMove' ) )
            // InternalBoardGameDL.g:1272:1: ( 'ValidMove' )
            {
            // InternalBoardGameDL.g:1272:1: ( 'ValidMove' )
            // InternalBoardGameDL.g:1273:2: 'ValidMove'
            {
             before(grammarAccess.getValidMoveAccess().getValidMoveKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1282:1: rule__ValidMove__Group__1 : rule__ValidMove__Group__1__Impl rule__ValidMove__Group__2 ;
    public final void rule__ValidMove__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1286:1: ( rule__ValidMove__Group__1__Impl rule__ValidMove__Group__2 )
            // InternalBoardGameDL.g:1287:2: rule__ValidMove__Group__1__Impl rule__ValidMove__Group__2
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
    // InternalBoardGameDL.g:1294:1: rule__ValidMove__Group__1__Impl : ( ( rule__ValidMove__NameAssignment_1 ) ) ;
    public final void rule__ValidMove__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1298:1: ( ( ( rule__ValidMove__NameAssignment_1 ) ) )
            // InternalBoardGameDL.g:1299:1: ( ( rule__ValidMove__NameAssignment_1 ) )
            {
            // InternalBoardGameDL.g:1299:1: ( ( rule__ValidMove__NameAssignment_1 ) )
            // InternalBoardGameDL.g:1300:2: ( rule__ValidMove__NameAssignment_1 )
            {
             before(grammarAccess.getValidMoveAccess().getNameAssignment_1()); 
            // InternalBoardGameDL.g:1301:2: ( rule__ValidMove__NameAssignment_1 )
            // InternalBoardGameDL.g:1301:3: rule__ValidMove__NameAssignment_1
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
    // InternalBoardGameDL.g:1309:1: rule__ValidMove__Group__2 : rule__ValidMove__Group__2__Impl rule__ValidMove__Group__3 ;
    public final void rule__ValidMove__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1313:1: ( rule__ValidMove__Group__2__Impl rule__ValidMove__Group__3 )
            // InternalBoardGameDL.g:1314:2: rule__ValidMove__Group__2__Impl rule__ValidMove__Group__3
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
    // InternalBoardGameDL.g:1321:1: rule__ValidMove__Group__2__Impl : ( '{' ) ;
    public final void rule__ValidMove__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1325:1: ( ( '{' ) )
            // InternalBoardGameDL.g:1326:1: ( '{' )
            {
            // InternalBoardGameDL.g:1326:1: ( '{' )
            // InternalBoardGameDL.g:1327:2: '{'
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
    // InternalBoardGameDL.g:1336:1: rule__ValidMove__Group__3 : rule__ValidMove__Group__3__Impl rule__ValidMove__Group__4 ;
    public final void rule__ValidMove__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1340:1: ( rule__ValidMove__Group__3__Impl rule__ValidMove__Group__4 )
            // InternalBoardGameDL.g:1341:2: rule__ValidMove__Group__3__Impl rule__ValidMove__Group__4
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
    // InternalBoardGameDL.g:1348:1: rule__ValidMove__Group__3__Impl : ( ( rule__ValidMove__PlaceAnywhereAssignment_3 ) ) ;
    public final void rule__ValidMove__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1352:1: ( ( ( rule__ValidMove__PlaceAnywhereAssignment_3 ) ) )
            // InternalBoardGameDL.g:1353:1: ( ( rule__ValidMove__PlaceAnywhereAssignment_3 ) )
            {
            // InternalBoardGameDL.g:1353:1: ( ( rule__ValidMove__PlaceAnywhereAssignment_3 ) )
            // InternalBoardGameDL.g:1354:2: ( rule__ValidMove__PlaceAnywhereAssignment_3 )
            {
             before(grammarAccess.getValidMoveAccess().getPlaceAnywhereAssignment_3()); 
            // InternalBoardGameDL.g:1355:2: ( rule__ValidMove__PlaceAnywhereAssignment_3 )
            // InternalBoardGameDL.g:1355:3: rule__ValidMove__PlaceAnywhereAssignment_3
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
    // InternalBoardGameDL.g:1363:1: rule__ValidMove__Group__4 : rule__ValidMove__Group__4__Impl rule__ValidMove__Group__5 ;
    public final void rule__ValidMove__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1367:1: ( rule__ValidMove__Group__4__Impl rule__ValidMove__Group__5 )
            // InternalBoardGameDL.g:1368:2: rule__ValidMove__Group__4__Impl rule__ValidMove__Group__5
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
    // InternalBoardGameDL.g:1375:1: rule__ValidMove__Group__4__Impl : ( ( rule__ValidMove__Group_4__0 )? ) ;
    public final void rule__ValidMove__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1379:1: ( ( ( rule__ValidMove__Group_4__0 )? ) )
            // InternalBoardGameDL.g:1380:1: ( ( rule__ValidMove__Group_4__0 )? )
            {
            // InternalBoardGameDL.g:1380:1: ( ( rule__ValidMove__Group_4__0 )? )
            // InternalBoardGameDL.g:1381:2: ( rule__ValidMove__Group_4__0 )?
            {
             before(grammarAccess.getValidMoveAccess().getGroup_4()); 
            // InternalBoardGameDL.g:1382:2: ( rule__ValidMove__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBoardGameDL.g:1382:3: rule__ValidMove__Group_4__0
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
    // InternalBoardGameDL.g:1390:1: rule__ValidMove__Group__5 : rule__ValidMove__Group__5__Impl ;
    public final void rule__ValidMove__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1394:1: ( rule__ValidMove__Group__5__Impl )
            // InternalBoardGameDL.g:1395:2: rule__ValidMove__Group__5__Impl
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
    // InternalBoardGameDL.g:1401:1: rule__ValidMove__Group__5__Impl : ( '}' ) ;
    public final void rule__ValidMove__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1405:1: ( ( '}' ) )
            // InternalBoardGameDL.g:1406:1: ( '}' )
            {
            // InternalBoardGameDL.g:1406:1: ( '}' )
            // InternalBoardGameDL.g:1407:2: '}'
            {
             before(grammarAccess.getValidMoveAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1417:1: rule__ValidMove__Group_4__0 : rule__ValidMove__Group_4__0__Impl rule__ValidMove__Group_4__1 ;
    public final void rule__ValidMove__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1421:1: ( rule__ValidMove__Group_4__0__Impl rule__ValidMove__Group_4__1 )
            // InternalBoardGameDL.g:1422:2: rule__ValidMove__Group_4__0__Impl rule__ValidMove__Group_4__1
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
    // InternalBoardGameDL.g:1429:1: rule__ValidMove__Group_4__0__Impl : ( 'valid' ) ;
    public final void rule__ValidMove__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1433:1: ( ( 'valid' ) )
            // InternalBoardGameDL.g:1434:1: ( 'valid' )
            {
            // InternalBoardGameDL.g:1434:1: ( 'valid' )
            // InternalBoardGameDL.g:1435:2: 'valid'
            {
             before(grammarAccess.getValidMoveAccess().getValidKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1444:1: rule__ValidMove__Group_4__1 : rule__ValidMove__Group_4__1__Impl rule__ValidMove__Group_4__2 ;
    public final void rule__ValidMove__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1448:1: ( rule__ValidMove__Group_4__1__Impl rule__ValidMove__Group_4__2 )
            // InternalBoardGameDL.g:1449:2: rule__ValidMove__Group_4__1__Impl rule__ValidMove__Group_4__2
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
    // InternalBoardGameDL.g:1456:1: rule__ValidMove__Group_4__1__Impl : ( 'if' ) ;
    public final void rule__ValidMove__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1460:1: ( ( 'if' ) )
            // InternalBoardGameDL.g:1461:1: ( 'if' )
            {
            // InternalBoardGameDL.g:1461:1: ( 'if' )
            // InternalBoardGameDL.g:1462:2: 'if'
            {
             before(grammarAccess.getValidMoveAccess().getIfKeyword_4_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1471:1: rule__ValidMove__Group_4__2 : rule__ValidMove__Group_4__2__Impl rule__ValidMove__Group_4__3 ;
    public final void rule__ValidMove__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1475:1: ( rule__ValidMove__Group_4__2__Impl rule__ValidMove__Group_4__3 )
            // InternalBoardGameDL.g:1476:2: rule__ValidMove__Group_4__2__Impl rule__ValidMove__Group_4__3
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
    // InternalBoardGameDL.g:1483:1: rule__ValidMove__Group_4__2__Impl : ( ( rule__ValidMove__ConditionsAssignment_4_2 ) ) ;
    public final void rule__ValidMove__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1487:1: ( ( ( rule__ValidMove__ConditionsAssignment_4_2 ) ) )
            // InternalBoardGameDL.g:1488:1: ( ( rule__ValidMove__ConditionsAssignment_4_2 ) )
            {
            // InternalBoardGameDL.g:1488:1: ( ( rule__ValidMove__ConditionsAssignment_4_2 ) )
            // InternalBoardGameDL.g:1489:2: ( rule__ValidMove__ConditionsAssignment_4_2 )
            {
             before(grammarAccess.getValidMoveAccess().getConditionsAssignment_4_2()); 
            // InternalBoardGameDL.g:1490:2: ( rule__ValidMove__ConditionsAssignment_4_2 )
            // InternalBoardGameDL.g:1490:3: rule__ValidMove__ConditionsAssignment_4_2
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
    // InternalBoardGameDL.g:1498:1: rule__ValidMove__Group_4__3 : rule__ValidMove__Group_4__3__Impl ;
    public final void rule__ValidMove__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1502:1: ( rule__ValidMove__Group_4__3__Impl )
            // InternalBoardGameDL.g:1503:2: rule__ValidMove__Group_4__3__Impl
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
    // InternalBoardGameDL.g:1509:1: rule__ValidMove__Group_4__3__Impl : ( ( rule__ValidMove__Group_4_3__0 )* ) ;
    public final void rule__ValidMove__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1513:1: ( ( ( rule__ValidMove__Group_4_3__0 )* ) )
            // InternalBoardGameDL.g:1514:1: ( ( rule__ValidMove__Group_4_3__0 )* )
            {
            // InternalBoardGameDL.g:1514:1: ( ( rule__ValidMove__Group_4_3__0 )* )
            // InternalBoardGameDL.g:1515:2: ( rule__ValidMove__Group_4_3__0 )*
            {
             before(grammarAccess.getValidMoveAccess().getGroup_4_3()); 
            // InternalBoardGameDL.g:1516:2: ( rule__ValidMove__Group_4_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBoardGameDL.g:1516:3: rule__ValidMove__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__ValidMove__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalBoardGameDL.g:1525:1: rule__ValidMove__Group_4_3__0 : rule__ValidMove__Group_4_3__0__Impl rule__ValidMove__Group_4_3__1 ;
    public final void rule__ValidMove__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1529:1: ( rule__ValidMove__Group_4_3__0__Impl rule__ValidMove__Group_4_3__1 )
            // InternalBoardGameDL.g:1530:2: rule__ValidMove__Group_4_3__0__Impl rule__ValidMove__Group_4_3__1
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
    // InternalBoardGameDL.g:1537:1: rule__ValidMove__Group_4_3__0__Impl : ( 'and' ) ;
    public final void rule__ValidMove__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1541:1: ( ( 'and' ) )
            // InternalBoardGameDL.g:1542:1: ( 'and' )
            {
            // InternalBoardGameDL.g:1542:1: ( 'and' )
            // InternalBoardGameDL.g:1543:2: 'and'
            {
             before(grammarAccess.getValidMoveAccess().getAndKeyword_4_3_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1552:1: rule__ValidMove__Group_4_3__1 : rule__ValidMove__Group_4_3__1__Impl ;
    public final void rule__ValidMove__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1556:1: ( rule__ValidMove__Group_4_3__1__Impl )
            // InternalBoardGameDL.g:1557:2: rule__ValidMove__Group_4_3__1__Impl
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
    // InternalBoardGameDL.g:1563:1: rule__ValidMove__Group_4_3__1__Impl : ( ( rule__ValidMove__ConditionsAssignment_4_3_1 ) ) ;
    public final void rule__ValidMove__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1567:1: ( ( ( rule__ValidMove__ConditionsAssignment_4_3_1 ) ) )
            // InternalBoardGameDL.g:1568:1: ( ( rule__ValidMove__ConditionsAssignment_4_3_1 ) )
            {
            // InternalBoardGameDL.g:1568:1: ( ( rule__ValidMove__ConditionsAssignment_4_3_1 ) )
            // InternalBoardGameDL.g:1569:2: ( rule__ValidMove__ConditionsAssignment_4_3_1 )
            {
             before(grammarAccess.getValidMoveAccess().getConditionsAssignment_4_3_1()); 
            // InternalBoardGameDL.g:1570:2: ( rule__ValidMove__ConditionsAssignment_4_3_1 )
            // InternalBoardGameDL.g:1570:3: rule__ValidMove__ConditionsAssignment_4_3_1
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
    // InternalBoardGameDL.g:1579:1: rule__EffectOnCell__Group__0 : rule__EffectOnCell__Group__0__Impl rule__EffectOnCell__Group__1 ;
    public final void rule__EffectOnCell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1583:1: ( rule__EffectOnCell__Group__0__Impl rule__EffectOnCell__Group__1 )
            // InternalBoardGameDL.g:1584:2: rule__EffectOnCell__Group__0__Impl rule__EffectOnCell__Group__1
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
    // InternalBoardGameDL.g:1591:1: rule__EffectOnCell__Group__0__Impl : ( 'EffectOnCell' ) ;
    public final void rule__EffectOnCell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1595:1: ( ( 'EffectOnCell' ) )
            // InternalBoardGameDL.g:1596:1: ( 'EffectOnCell' )
            {
            // InternalBoardGameDL.g:1596:1: ( 'EffectOnCell' )
            // InternalBoardGameDL.g:1597:2: 'EffectOnCell'
            {
             before(grammarAccess.getEffectOnCellAccess().getEffectOnCellKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1606:1: rule__EffectOnCell__Group__1 : rule__EffectOnCell__Group__1__Impl rule__EffectOnCell__Group__2 ;
    public final void rule__EffectOnCell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1610:1: ( rule__EffectOnCell__Group__1__Impl rule__EffectOnCell__Group__2 )
            // InternalBoardGameDL.g:1611:2: rule__EffectOnCell__Group__1__Impl rule__EffectOnCell__Group__2
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
    // InternalBoardGameDL.g:1618:1: rule__EffectOnCell__Group__1__Impl : ( ( rule__EffectOnCell__NameAssignment_1 ) ) ;
    public final void rule__EffectOnCell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1622:1: ( ( ( rule__EffectOnCell__NameAssignment_1 ) ) )
            // InternalBoardGameDL.g:1623:1: ( ( rule__EffectOnCell__NameAssignment_1 ) )
            {
            // InternalBoardGameDL.g:1623:1: ( ( rule__EffectOnCell__NameAssignment_1 ) )
            // InternalBoardGameDL.g:1624:2: ( rule__EffectOnCell__NameAssignment_1 )
            {
             before(grammarAccess.getEffectOnCellAccess().getNameAssignment_1()); 
            // InternalBoardGameDL.g:1625:2: ( rule__EffectOnCell__NameAssignment_1 )
            // InternalBoardGameDL.g:1625:3: rule__EffectOnCell__NameAssignment_1
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
    // InternalBoardGameDL.g:1633:1: rule__EffectOnCell__Group__2 : rule__EffectOnCell__Group__2__Impl rule__EffectOnCell__Group__3 ;
    public final void rule__EffectOnCell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1637:1: ( rule__EffectOnCell__Group__2__Impl rule__EffectOnCell__Group__3 )
            // InternalBoardGameDL.g:1638:2: rule__EffectOnCell__Group__2__Impl rule__EffectOnCell__Group__3
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
    // InternalBoardGameDL.g:1645:1: rule__EffectOnCell__Group__2__Impl : ( '{' ) ;
    public final void rule__EffectOnCell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1649:1: ( ( '{' ) )
            // InternalBoardGameDL.g:1650:1: ( '{' )
            {
            // InternalBoardGameDL.g:1650:1: ( '{' )
            // InternalBoardGameDL.g:1651:2: '{'
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
    // InternalBoardGameDL.g:1660:1: rule__EffectOnCell__Group__3 : rule__EffectOnCell__Group__3__Impl rule__EffectOnCell__Group__4 ;
    public final void rule__EffectOnCell__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1664:1: ( rule__EffectOnCell__Group__3__Impl rule__EffectOnCell__Group__4 )
            // InternalBoardGameDL.g:1665:2: rule__EffectOnCell__Group__3__Impl rule__EffectOnCell__Group__4
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
    // InternalBoardGameDL.g:1672:1: rule__EffectOnCell__Group__3__Impl : ( ( rule__EffectOnCell__UnorderedGroup_3 ) ) ;
    public final void rule__EffectOnCell__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1676:1: ( ( ( rule__EffectOnCell__UnorderedGroup_3 ) ) )
            // InternalBoardGameDL.g:1677:1: ( ( rule__EffectOnCell__UnorderedGroup_3 ) )
            {
            // InternalBoardGameDL.g:1677:1: ( ( rule__EffectOnCell__UnorderedGroup_3 ) )
            // InternalBoardGameDL.g:1678:2: ( rule__EffectOnCell__UnorderedGroup_3 )
            {
             before(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3()); 
            // InternalBoardGameDL.g:1679:2: ( rule__EffectOnCell__UnorderedGroup_3 )
            // InternalBoardGameDL.g:1679:3: rule__EffectOnCell__UnorderedGroup_3
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
    // InternalBoardGameDL.g:1687:1: rule__EffectOnCell__Group__4 : rule__EffectOnCell__Group__4__Impl ;
    public final void rule__EffectOnCell__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1691:1: ( rule__EffectOnCell__Group__4__Impl )
            // InternalBoardGameDL.g:1692:2: rule__EffectOnCell__Group__4__Impl
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
    // InternalBoardGameDL.g:1698:1: rule__EffectOnCell__Group__4__Impl : ( '}' ) ;
    public final void rule__EffectOnCell__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1702:1: ( ( '}' ) )
            // InternalBoardGameDL.g:1703:1: ( '}' )
            {
            // InternalBoardGameDL.g:1703:1: ( '}' )
            // InternalBoardGameDL.g:1704:2: '}'
            {
             before(grammarAccess.getEffectOnCellAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1714:1: rule__EffectOnCell__Group_3_0__0 : rule__EffectOnCell__Group_3_0__0__Impl rule__EffectOnCell__Group_3_0__1 ;
    public final void rule__EffectOnCell__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1718:1: ( rule__EffectOnCell__Group_3_0__0__Impl rule__EffectOnCell__Group_3_0__1 )
            // InternalBoardGameDL.g:1719:2: rule__EffectOnCell__Group_3_0__0__Impl rule__EffectOnCell__Group_3_0__1
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
    // InternalBoardGameDL.g:1726:1: rule__EffectOnCell__Group_3_0__0__Impl : ( 'relativePosition' ) ;
    public final void rule__EffectOnCell__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1730:1: ( ( 'relativePosition' ) )
            // InternalBoardGameDL.g:1731:1: ( 'relativePosition' )
            {
            // InternalBoardGameDL.g:1731:1: ( 'relativePosition' )
            // InternalBoardGameDL.g:1732:2: 'relativePosition'
            {
             before(grammarAccess.getEffectOnCellAccess().getRelativePositionKeyword_3_0_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1741:1: rule__EffectOnCell__Group_3_0__1 : rule__EffectOnCell__Group_3_0__1__Impl rule__EffectOnCell__Group_3_0__2 ;
    public final void rule__EffectOnCell__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1745:1: ( rule__EffectOnCell__Group_3_0__1__Impl rule__EffectOnCell__Group_3_0__2 )
            // InternalBoardGameDL.g:1746:2: rule__EffectOnCell__Group_3_0__1__Impl rule__EffectOnCell__Group_3_0__2
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
    // InternalBoardGameDL.g:1753:1: rule__EffectOnCell__Group_3_0__1__Impl : ( '(' ) ;
    public final void rule__EffectOnCell__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1757:1: ( ( '(' ) )
            // InternalBoardGameDL.g:1758:1: ( '(' )
            {
            // InternalBoardGameDL.g:1758:1: ( '(' )
            // InternalBoardGameDL.g:1759:2: '('
            {
             before(grammarAccess.getEffectOnCellAccess().getLeftParenthesisKeyword_3_0_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1768:1: rule__EffectOnCell__Group_3_0__2 : rule__EffectOnCell__Group_3_0__2__Impl rule__EffectOnCell__Group_3_0__3 ;
    public final void rule__EffectOnCell__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1772:1: ( rule__EffectOnCell__Group_3_0__2__Impl rule__EffectOnCell__Group_3_0__3 )
            // InternalBoardGameDL.g:1773:2: rule__EffectOnCell__Group_3_0__2__Impl rule__EffectOnCell__Group_3_0__3
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
    // InternalBoardGameDL.g:1780:1: rule__EffectOnCell__Group_3_0__2__Impl : ( ( rule__EffectOnCell__XAssignment_3_0_2 ) ) ;
    public final void rule__EffectOnCell__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1784:1: ( ( ( rule__EffectOnCell__XAssignment_3_0_2 ) ) )
            // InternalBoardGameDL.g:1785:1: ( ( rule__EffectOnCell__XAssignment_3_0_2 ) )
            {
            // InternalBoardGameDL.g:1785:1: ( ( rule__EffectOnCell__XAssignment_3_0_2 ) )
            // InternalBoardGameDL.g:1786:2: ( rule__EffectOnCell__XAssignment_3_0_2 )
            {
             before(grammarAccess.getEffectOnCellAccess().getXAssignment_3_0_2()); 
            // InternalBoardGameDL.g:1787:2: ( rule__EffectOnCell__XAssignment_3_0_2 )
            // InternalBoardGameDL.g:1787:3: rule__EffectOnCell__XAssignment_3_0_2
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
    // InternalBoardGameDL.g:1795:1: rule__EffectOnCell__Group_3_0__3 : rule__EffectOnCell__Group_3_0__3__Impl rule__EffectOnCell__Group_3_0__4 ;
    public final void rule__EffectOnCell__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1799:1: ( rule__EffectOnCell__Group_3_0__3__Impl rule__EffectOnCell__Group_3_0__4 )
            // InternalBoardGameDL.g:1800:2: rule__EffectOnCell__Group_3_0__3__Impl rule__EffectOnCell__Group_3_0__4
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
    // InternalBoardGameDL.g:1807:1: rule__EffectOnCell__Group_3_0__3__Impl : ( ',' ) ;
    public final void rule__EffectOnCell__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1811:1: ( ( ',' ) )
            // InternalBoardGameDL.g:1812:1: ( ',' )
            {
            // InternalBoardGameDL.g:1812:1: ( ',' )
            // InternalBoardGameDL.g:1813:2: ','
            {
             before(grammarAccess.getEffectOnCellAccess().getCommaKeyword_3_0_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1822:1: rule__EffectOnCell__Group_3_0__4 : rule__EffectOnCell__Group_3_0__4__Impl rule__EffectOnCell__Group_3_0__5 ;
    public final void rule__EffectOnCell__Group_3_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1826:1: ( rule__EffectOnCell__Group_3_0__4__Impl rule__EffectOnCell__Group_3_0__5 )
            // InternalBoardGameDL.g:1827:2: rule__EffectOnCell__Group_3_0__4__Impl rule__EffectOnCell__Group_3_0__5
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
    // InternalBoardGameDL.g:1834:1: rule__EffectOnCell__Group_3_0__4__Impl : ( ( rule__EffectOnCell__YAssignment_3_0_4 ) ) ;
    public final void rule__EffectOnCell__Group_3_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1838:1: ( ( ( rule__EffectOnCell__YAssignment_3_0_4 ) ) )
            // InternalBoardGameDL.g:1839:1: ( ( rule__EffectOnCell__YAssignment_3_0_4 ) )
            {
            // InternalBoardGameDL.g:1839:1: ( ( rule__EffectOnCell__YAssignment_3_0_4 ) )
            // InternalBoardGameDL.g:1840:2: ( rule__EffectOnCell__YAssignment_3_0_4 )
            {
             before(grammarAccess.getEffectOnCellAccess().getYAssignment_3_0_4()); 
            // InternalBoardGameDL.g:1841:2: ( rule__EffectOnCell__YAssignment_3_0_4 )
            // InternalBoardGameDL.g:1841:3: rule__EffectOnCell__YAssignment_3_0_4
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
    // InternalBoardGameDL.g:1849:1: rule__EffectOnCell__Group_3_0__5 : rule__EffectOnCell__Group_3_0__5__Impl ;
    public final void rule__EffectOnCell__Group_3_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1853:1: ( rule__EffectOnCell__Group_3_0__5__Impl )
            // InternalBoardGameDL.g:1854:2: rule__EffectOnCell__Group_3_0__5__Impl
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
    // InternalBoardGameDL.g:1860:1: rule__EffectOnCell__Group_3_0__5__Impl : ( ')' ) ;
    public final void rule__EffectOnCell__Group_3_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1864:1: ( ( ')' ) )
            // InternalBoardGameDL.g:1865:1: ( ')' )
            {
            // InternalBoardGameDL.g:1865:1: ( ')' )
            // InternalBoardGameDL.g:1866:2: ')'
            {
             before(grammarAccess.getEffectOnCellAccess().getRightParenthesisKeyword_3_0_5()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1876:1: rule__EffectOnCell__Group_3_1__0 : rule__EffectOnCell__Group_3_1__0__Impl rule__EffectOnCell__Group_3_1__1 ;
    public final void rule__EffectOnCell__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1880:1: ( rule__EffectOnCell__Group_3_1__0__Impl rule__EffectOnCell__Group_3_1__1 )
            // InternalBoardGameDL.g:1881:2: rule__EffectOnCell__Group_3_1__0__Impl rule__EffectOnCell__Group_3_1__1
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
    // InternalBoardGameDL.g:1888:1: rule__EffectOnCell__Group_3_1__0__Impl : ( 'newCellState' ) ;
    public final void rule__EffectOnCell__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1892:1: ( ( 'newCellState' ) )
            // InternalBoardGameDL.g:1893:1: ( 'newCellState' )
            {
            // InternalBoardGameDL.g:1893:1: ( 'newCellState' )
            // InternalBoardGameDL.g:1894:2: 'newCellState'
            {
             before(grammarAccess.getEffectOnCellAccess().getNewCellStateKeyword_3_1_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1903:1: rule__EffectOnCell__Group_3_1__1 : rule__EffectOnCell__Group_3_1__1__Impl ;
    public final void rule__EffectOnCell__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1907:1: ( rule__EffectOnCell__Group_3_1__1__Impl )
            // InternalBoardGameDL.g:1908:2: rule__EffectOnCell__Group_3_1__1__Impl
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
    // InternalBoardGameDL.g:1914:1: rule__EffectOnCell__Group_3_1__1__Impl : ( ( rule__EffectOnCell__CellStateAssignment_3_1_1 ) ) ;
    public final void rule__EffectOnCell__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1918:1: ( ( ( rule__EffectOnCell__CellStateAssignment_3_1_1 ) ) )
            // InternalBoardGameDL.g:1919:1: ( ( rule__EffectOnCell__CellStateAssignment_3_1_1 ) )
            {
            // InternalBoardGameDL.g:1919:1: ( ( rule__EffectOnCell__CellStateAssignment_3_1_1 ) )
            // InternalBoardGameDL.g:1920:2: ( rule__EffectOnCell__CellStateAssignment_3_1_1 )
            {
             before(grammarAccess.getEffectOnCellAccess().getCellStateAssignment_3_1_1()); 
            // InternalBoardGameDL.g:1921:2: ( rule__EffectOnCell__CellStateAssignment_3_1_1 )
            // InternalBoardGameDL.g:1921:3: rule__EffectOnCell__CellStateAssignment_3_1_1
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
    // InternalBoardGameDL.g:1930:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1934:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalBoardGameDL.g:1935:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
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
    // InternalBoardGameDL.g:1942:1: rule__Condition__Group__0__Impl : ( 'Condition' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1946:1: ( ( 'Condition' ) )
            // InternalBoardGameDL.g:1947:1: ( 'Condition' )
            {
            // InternalBoardGameDL.g:1947:1: ( 'Condition' )
            // InternalBoardGameDL.g:1948:2: 'Condition'
            {
             before(grammarAccess.getConditionAccess().getConditionKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1957:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1961:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalBoardGameDL.g:1962:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
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
    // InternalBoardGameDL.g:1969:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__NameAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1973:1: ( ( ( rule__Condition__NameAssignment_1 ) ) )
            // InternalBoardGameDL.g:1974:1: ( ( rule__Condition__NameAssignment_1 ) )
            {
            // InternalBoardGameDL.g:1974:1: ( ( rule__Condition__NameAssignment_1 ) )
            // InternalBoardGameDL.g:1975:2: ( rule__Condition__NameAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getNameAssignment_1()); 
            // InternalBoardGameDL.g:1976:2: ( rule__Condition__NameAssignment_1 )
            // InternalBoardGameDL.g:1976:3: rule__Condition__NameAssignment_1
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
    // InternalBoardGameDL.g:1984:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1988:1: ( rule__Condition__Group__2__Impl )
            // InternalBoardGameDL.g:1989:2: rule__Condition__Group__2__Impl
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
    // InternalBoardGameDL.g:1995:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__CellStateAssignment_2 ) ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1999:1: ( ( ( rule__Condition__CellStateAssignment_2 ) ) )
            // InternalBoardGameDL.g:2000:1: ( ( rule__Condition__CellStateAssignment_2 ) )
            {
            // InternalBoardGameDL.g:2000:1: ( ( rule__Condition__CellStateAssignment_2 ) )
            // InternalBoardGameDL.g:2001:2: ( rule__Condition__CellStateAssignment_2 )
            {
             before(grammarAccess.getConditionAccess().getCellStateAssignment_2()); 
            // InternalBoardGameDL.g:2002:2: ( rule__Condition__CellStateAssignment_2 )
            // InternalBoardGameDL.g:2002:3: rule__Condition__CellStateAssignment_2
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
    // InternalBoardGameDL.g:2011:1: rule__Line__Group__0 : rule__Line__Group__0__Impl rule__Line__Group__1 ;
    public final void rule__Line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2015:1: ( rule__Line__Group__0__Impl rule__Line__Group__1 )
            // InternalBoardGameDL.g:2016:2: rule__Line__Group__0__Impl rule__Line__Group__1
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
    // InternalBoardGameDL.g:2023:1: rule__Line__Group__0__Impl : ( 'Line' ) ;
    public final void rule__Line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2027:1: ( ( 'Line' ) )
            // InternalBoardGameDL.g:2028:1: ( 'Line' )
            {
            // InternalBoardGameDL.g:2028:1: ( 'Line' )
            // InternalBoardGameDL.g:2029:2: 'Line'
            {
             before(grammarAccess.getLineAccess().getLineKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBoardGameDL.g:2038:1: rule__Line__Group__1 : rule__Line__Group__1__Impl rule__Line__Group__2 ;
    public final void rule__Line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2042:1: ( rule__Line__Group__1__Impl rule__Line__Group__2 )
            // InternalBoardGameDL.g:2043:2: rule__Line__Group__1__Impl rule__Line__Group__2
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
    // InternalBoardGameDL.g:2050:1: rule__Line__Group__1__Impl : ( 'count' ) ;
    public final void rule__Line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2054:1: ( ( 'count' ) )
            // InternalBoardGameDL.g:2055:1: ( 'count' )
            {
            // InternalBoardGameDL.g:2055:1: ( 'count' )
            // InternalBoardGameDL.g:2056:2: 'count'
            {
             before(grammarAccess.getLineAccess().getCountKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getCountKeyword_1()); 

            }


            }

        }
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
    // InternalBoardGameDL.g:2065:1: rule__Line__Group__2 : rule__Line__Group__2__Impl rule__Line__Group__3 ;
    public final void rule__Line__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2069:1: ( rule__Line__Group__2__Impl rule__Line__Group__3 )
            // InternalBoardGameDL.g:2070:2: rule__Line__Group__2__Impl rule__Line__Group__3
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
    // InternalBoardGameDL.g:2077:1: rule__Line__Group__2__Impl : ( ( rule__Line__CountAssignment_2 ) ) ;
    public final void rule__Line__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2081:1: ( ( ( rule__Line__CountAssignment_2 ) ) )
            // InternalBoardGameDL.g:2082:1: ( ( rule__Line__CountAssignment_2 ) )
            {
            // InternalBoardGameDL.g:2082:1: ( ( rule__Line__CountAssignment_2 ) )
            // InternalBoardGameDL.g:2083:2: ( rule__Line__CountAssignment_2 )
            {
             before(grammarAccess.getLineAccess().getCountAssignment_2()); 
            // InternalBoardGameDL.g:2084:2: ( rule__Line__CountAssignment_2 )
            // InternalBoardGameDL.g:2084:3: rule__Line__CountAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Line__CountAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getCountAssignment_2()); 

            }


            }

        }
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
    // InternalBoardGameDL.g:2092:1: rule__Line__Group__3 : rule__Line__Group__3__Impl ;
    public final void rule__Line__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2096:1: ( rule__Line__Group__3__Impl )
            // InternalBoardGameDL.g:2097:2: rule__Line__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Line__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalBoardGameDL.g:2103:1: rule__Line__Group__3__Impl : ( ( rule__Line__UnorderedGroup_3 ) ) ;
    public final void rule__Line__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2107:1: ( ( ( rule__Line__UnorderedGroup_3 ) ) )
            // InternalBoardGameDL.g:2108:1: ( ( rule__Line__UnorderedGroup_3 ) )
            {
            // InternalBoardGameDL.g:2108:1: ( ( rule__Line__UnorderedGroup_3 ) )
            // InternalBoardGameDL.g:2109:2: ( rule__Line__UnorderedGroup_3 )
            {
             before(grammarAccess.getLineAccess().getUnorderedGroup_3()); 
            // InternalBoardGameDL.g:2110:2: ( rule__Line__UnorderedGroup_3 )
            // InternalBoardGameDL.g:2110:3: rule__Line__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
            rule__Line__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getUnorderedGroup_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__EffectOnCell__UnorderedGroup_3"
    // InternalBoardGameDL.g:2119:1: rule__EffectOnCell__UnorderedGroup_3 : rule__EffectOnCell__UnorderedGroup_3__0 {...}?;
    public final void rule__EffectOnCell__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3());
        	
        try {
            // InternalBoardGameDL.g:2124:1: ( rule__EffectOnCell__UnorderedGroup_3__0 {...}?)
            // InternalBoardGameDL.g:2125:2: rule__EffectOnCell__UnorderedGroup_3__0 {...}?
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
    // InternalBoardGameDL.g:2133:1: rule__EffectOnCell__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__EffectOnCell__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EffectOnCell__Group_3_1__0 ) ) ) ) ) ;
    public final void rule__EffectOnCell__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalBoardGameDL.g:2138:1: ( ( ({...}? => ( ( ( rule__EffectOnCell__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EffectOnCell__Group_3_1__0 ) ) ) ) ) )
            // InternalBoardGameDL.g:2139:3: ( ({...}? => ( ( ( rule__EffectOnCell__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EffectOnCell__Group_3_1__0 ) ) ) ) )
            {
            // InternalBoardGameDL.g:2139:3: ( ({...}? => ( ( ( rule__EffectOnCell__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EffectOnCell__Group_3_1__0 ) ) ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( LA11_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 0) ) {
                alt11=1;
            }
            else if ( LA11_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 1) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalBoardGameDL.g:2140:3: ({...}? => ( ( ( rule__EffectOnCell__Group_3_0__0 ) ) ) )
                    {
                    // InternalBoardGameDL.g:2140:3: ({...}? => ( ( ( rule__EffectOnCell__Group_3_0__0 ) ) ) )
                    // InternalBoardGameDL.g:2141:4: {...}? => ( ( ( rule__EffectOnCell__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__EffectOnCell__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalBoardGameDL.g:2141:108: ( ( ( rule__EffectOnCell__Group_3_0__0 ) ) )
                    // InternalBoardGameDL.g:2142:5: ( ( rule__EffectOnCell__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalBoardGameDL.g:2148:5: ( ( rule__EffectOnCell__Group_3_0__0 ) )
                    // InternalBoardGameDL.g:2149:6: ( rule__EffectOnCell__Group_3_0__0 )
                    {
                     before(grammarAccess.getEffectOnCellAccess().getGroup_3_0()); 
                    // InternalBoardGameDL.g:2150:6: ( rule__EffectOnCell__Group_3_0__0 )
                    // InternalBoardGameDL.g:2150:7: rule__EffectOnCell__Group_3_0__0
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
                    // InternalBoardGameDL.g:2155:3: ({...}? => ( ( ( rule__EffectOnCell__Group_3_1__0 ) ) ) )
                    {
                    // InternalBoardGameDL.g:2155:3: ({...}? => ( ( ( rule__EffectOnCell__Group_3_1__0 ) ) ) )
                    // InternalBoardGameDL.g:2156:4: {...}? => ( ( ( rule__EffectOnCell__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__EffectOnCell__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalBoardGameDL.g:2156:108: ( ( ( rule__EffectOnCell__Group_3_1__0 ) ) )
                    // InternalBoardGameDL.g:2157:5: ( ( rule__EffectOnCell__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalBoardGameDL.g:2163:5: ( ( rule__EffectOnCell__Group_3_1__0 ) )
                    // InternalBoardGameDL.g:2164:6: ( rule__EffectOnCell__Group_3_1__0 )
                    {
                     before(grammarAccess.getEffectOnCellAccess().getGroup_3_1()); 
                    // InternalBoardGameDL.g:2165:6: ( rule__EffectOnCell__Group_3_1__0 )
                    // InternalBoardGameDL.g:2165:7: rule__EffectOnCell__Group_3_1__0
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
    // InternalBoardGameDL.g:2178:1: rule__EffectOnCell__UnorderedGroup_3__0 : rule__EffectOnCell__UnorderedGroup_3__Impl ( rule__EffectOnCell__UnorderedGroup_3__1 )? ;
    public final void rule__EffectOnCell__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2182:1: ( rule__EffectOnCell__UnorderedGroup_3__Impl ( rule__EffectOnCell__UnorderedGroup_3__1 )? )
            // InternalBoardGameDL.g:2183:2: rule__EffectOnCell__UnorderedGroup_3__Impl ( rule__EffectOnCell__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_29);
            rule__EffectOnCell__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalBoardGameDL.g:2184:2: ( rule__EffectOnCell__UnorderedGroup_3__1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( LA12_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 0) ) {
                alt12=1;
            }
            else if ( LA12_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 1) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBoardGameDL.g:2184:2: rule__EffectOnCell__UnorderedGroup_3__1
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
    // InternalBoardGameDL.g:2190:1: rule__EffectOnCell__UnorderedGroup_3__1 : rule__EffectOnCell__UnorderedGroup_3__Impl ;
    public final void rule__EffectOnCell__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2194:1: ( rule__EffectOnCell__UnorderedGroup_3__Impl )
            // InternalBoardGameDL.g:2195:2: rule__EffectOnCell__UnorderedGroup_3__Impl
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


    // $ANTLR start "rule__Line__UnorderedGroup_3"
    // InternalBoardGameDL.g:2202:1: rule__Line__UnorderedGroup_3 : ( rule__Line__UnorderedGroup_3__0 )? ;
    public final void rule__Line__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getLineAccess().getUnorderedGroup_3());
        	
        try {
            // InternalBoardGameDL.g:2207:1: ( ( rule__Line__UnorderedGroup_3__0 )? )
            // InternalBoardGameDL.g:2208:2: ( rule__Line__UnorderedGroup_3__0 )?
            {
            // InternalBoardGameDL.g:2208:2: ( rule__Line__UnorderedGroup_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( LA13_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getLineAccess().getUnorderedGroup_3(), 0) ) {
                alt13=1;
            }
            else if ( LA13_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getLineAccess().getUnorderedGroup_3(), 1) ) {
                alt13=1;
            }
            else if ( LA13_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getLineAccess().getUnorderedGroup_3(), 2) ) {
                alt13=1;
            }
            else if ( LA13_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getLineAccess().getUnorderedGroup_3(), 3) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBoardGameDL.g:2208:2: rule__Line__UnorderedGroup_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Line__UnorderedGroup_3__0();

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

            	getUnorderedGroupHelper().leave(grammarAccess.getLineAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__UnorderedGroup_3"


    // $ANTLR start "rule__Line__UnorderedGroup_3__Impl"
    // InternalBoardGameDL.g:2216:1: rule__Line__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__Line__HorizontalAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__Line__VerticalAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__Line__DiagonalAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__Line__UniqueAssignment_3_3 ) ) ) ) ) ;
    public final void rule__Line__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalBoardGameDL.g:2221:1: ( ( ({...}? => ( ( ( rule__Line__HorizontalAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__Line__VerticalAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__Line__DiagonalAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__Line__UniqueAssignment_3_3 ) ) ) ) ) )
            // InternalBoardGameDL.g:2222:3: ( ({...}? => ( ( ( rule__Line__HorizontalAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__Line__VerticalAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__Line__DiagonalAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__Line__UniqueAssignment_3_3 ) ) ) ) )
            {
            // InternalBoardGameDL.g:2222:3: ( ({...}? => ( ( ( rule__Line__HorizontalAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__Line__VerticalAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__Line__DiagonalAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__Line__UniqueAssignment_3_3 ) ) ) ) )
            int alt14=4;
            int LA14_0 = input.LA(1);

            if ( LA14_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getLineAccess().getUnorderedGroup_3(), 0) ) {
                alt14=1;
            }
            else if ( LA14_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getLineAccess().getUnorderedGroup_3(), 1) ) {
                alt14=2;
            }
            else if ( LA14_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getLineAccess().getUnorderedGroup_3(), 2) ) {
                alt14=3;
            }
            else if ( LA14_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getLineAccess().getUnorderedGroup_3(), 3) ) {
                alt14=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalBoardGameDL.g:2223:3: ({...}? => ( ( ( rule__Line__HorizontalAssignment_3_0 ) ) ) )
                    {
                    // InternalBoardGameDL.g:2223:3: ({...}? => ( ( ( rule__Line__HorizontalAssignment_3_0 ) ) ) )
                    // InternalBoardGameDL.g:2224:4: {...}? => ( ( ( rule__Line__HorizontalAssignment_3_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLineAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Line__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLineAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalBoardGameDL.g:2224:100: ( ( ( rule__Line__HorizontalAssignment_3_0 ) ) )
                    // InternalBoardGameDL.g:2225:5: ( ( rule__Line__HorizontalAssignment_3_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLineAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalBoardGameDL.g:2231:5: ( ( rule__Line__HorizontalAssignment_3_0 ) )
                    // InternalBoardGameDL.g:2232:6: ( rule__Line__HorizontalAssignment_3_0 )
                    {
                     before(grammarAccess.getLineAccess().getHorizontalAssignment_3_0()); 
                    // InternalBoardGameDL.g:2233:6: ( rule__Line__HorizontalAssignment_3_0 )
                    // InternalBoardGameDL.g:2233:7: rule__Line__HorizontalAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Line__HorizontalAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLineAccess().getHorizontalAssignment_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBoardGameDL.g:2238:3: ({...}? => ( ( ( rule__Line__VerticalAssignment_3_1 ) ) ) )
                    {
                    // InternalBoardGameDL.g:2238:3: ({...}? => ( ( ( rule__Line__VerticalAssignment_3_1 ) ) ) )
                    // InternalBoardGameDL.g:2239:4: {...}? => ( ( ( rule__Line__VerticalAssignment_3_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLineAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Line__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLineAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalBoardGameDL.g:2239:100: ( ( ( rule__Line__VerticalAssignment_3_1 ) ) )
                    // InternalBoardGameDL.g:2240:5: ( ( rule__Line__VerticalAssignment_3_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLineAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalBoardGameDL.g:2246:5: ( ( rule__Line__VerticalAssignment_3_1 ) )
                    // InternalBoardGameDL.g:2247:6: ( rule__Line__VerticalAssignment_3_1 )
                    {
                     before(grammarAccess.getLineAccess().getVerticalAssignment_3_1()); 
                    // InternalBoardGameDL.g:2248:6: ( rule__Line__VerticalAssignment_3_1 )
                    // InternalBoardGameDL.g:2248:7: rule__Line__VerticalAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Line__VerticalAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLineAccess().getVerticalAssignment_3_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBoardGameDL.g:2253:3: ({...}? => ( ( ( rule__Line__DiagonalAssignment_3_2 ) ) ) )
                    {
                    // InternalBoardGameDL.g:2253:3: ({...}? => ( ( ( rule__Line__DiagonalAssignment_3_2 ) ) ) )
                    // InternalBoardGameDL.g:2254:4: {...}? => ( ( ( rule__Line__DiagonalAssignment_3_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLineAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Line__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLineAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalBoardGameDL.g:2254:100: ( ( ( rule__Line__DiagonalAssignment_3_2 ) ) )
                    // InternalBoardGameDL.g:2255:5: ( ( rule__Line__DiagonalAssignment_3_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLineAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalBoardGameDL.g:2261:5: ( ( rule__Line__DiagonalAssignment_3_2 ) )
                    // InternalBoardGameDL.g:2262:6: ( rule__Line__DiagonalAssignment_3_2 )
                    {
                     before(grammarAccess.getLineAccess().getDiagonalAssignment_3_2()); 
                    // InternalBoardGameDL.g:2263:6: ( rule__Line__DiagonalAssignment_3_2 )
                    // InternalBoardGameDL.g:2263:7: rule__Line__DiagonalAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Line__DiagonalAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getLineAccess().getDiagonalAssignment_3_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalBoardGameDL.g:2268:3: ({...}? => ( ( ( rule__Line__UniqueAssignment_3_3 ) ) ) )
                    {
                    // InternalBoardGameDL.g:2268:3: ({...}? => ( ( ( rule__Line__UniqueAssignment_3_3 ) ) ) )
                    // InternalBoardGameDL.g:2269:4: {...}? => ( ( ( rule__Line__UniqueAssignment_3_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLineAccess().getUnorderedGroup_3(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Line__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLineAccess().getUnorderedGroup_3(), 3)");
                    }
                    // InternalBoardGameDL.g:2269:100: ( ( ( rule__Line__UniqueAssignment_3_3 ) ) )
                    // InternalBoardGameDL.g:2270:5: ( ( rule__Line__UniqueAssignment_3_3 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLineAccess().getUnorderedGroup_3(), 3);
                    				

                    					selected = true;
                    				
                    // InternalBoardGameDL.g:2276:5: ( ( rule__Line__UniqueAssignment_3_3 ) )
                    // InternalBoardGameDL.g:2277:6: ( rule__Line__UniqueAssignment_3_3 )
                    {
                     before(grammarAccess.getLineAccess().getUniqueAssignment_3_3()); 
                    // InternalBoardGameDL.g:2278:6: ( rule__Line__UniqueAssignment_3_3 )
                    // InternalBoardGameDL.g:2278:7: rule__Line__UniqueAssignment_3_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Line__UniqueAssignment_3_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getLineAccess().getUniqueAssignment_3_3()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLineAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__Line__UnorderedGroup_3__0"
    // InternalBoardGameDL.g:2291:1: rule__Line__UnorderedGroup_3__0 : rule__Line__UnorderedGroup_3__Impl ( rule__Line__UnorderedGroup_3__1 )? ;
    public final void rule__Line__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2295:1: ( rule__Line__UnorderedGroup_3__Impl ( rule__Line__UnorderedGroup_3__1 )? )
            // InternalBoardGameDL.g:2296:2: rule__Line__UnorderedGroup_3__Impl ( rule__Line__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_30);
            rule__Line__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalBoardGameDL.g:2297:2: ( rule__Line__UnorderedGroup_3__1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( LA15_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getLineAccess().getUnorderedGroup_3(), 0) ) {
                alt15=1;
            }
            else if ( LA15_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getLineAccess().getUnorderedGroup_3(), 1) ) {
                alt15=1;
            }
            else if ( LA15_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getLineAccess().getUnorderedGroup_3(), 2) ) {
                alt15=1;
            }
            else if ( LA15_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getLineAccess().getUnorderedGroup_3(), 3) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBoardGameDL.g:2297:2: rule__Line__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Line__UnorderedGroup_3__1();

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
    // $ANTLR end "rule__Line__UnorderedGroup_3__0"


    // $ANTLR start "rule__Line__UnorderedGroup_3__1"
    // InternalBoardGameDL.g:2303:1: rule__Line__UnorderedGroup_3__1 : rule__Line__UnorderedGroup_3__Impl ( rule__Line__UnorderedGroup_3__2 )? ;
    public final void rule__Line__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2307:1: ( rule__Line__UnorderedGroup_3__Impl ( rule__Line__UnorderedGroup_3__2 )? )
            // InternalBoardGameDL.g:2308:2: rule__Line__UnorderedGroup_3__Impl ( rule__Line__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_30);
            rule__Line__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalBoardGameDL.g:2309:2: ( rule__Line__UnorderedGroup_3__2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( LA16_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getLineAccess().getUnorderedGroup_3(), 0) ) {
                alt16=1;
            }
            else if ( LA16_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getLineAccess().getUnorderedGroup_3(), 1) ) {
                alt16=1;
            }
            else if ( LA16_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getLineAccess().getUnorderedGroup_3(), 2) ) {
                alt16=1;
            }
            else if ( LA16_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getLineAccess().getUnorderedGroup_3(), 3) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBoardGameDL.g:2309:2: rule__Line__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Line__UnorderedGroup_3__2();

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
    // $ANTLR end "rule__Line__UnorderedGroup_3__1"


    // $ANTLR start "rule__Line__UnorderedGroup_3__2"
    // InternalBoardGameDL.g:2315:1: rule__Line__UnorderedGroup_3__2 : rule__Line__UnorderedGroup_3__Impl ( rule__Line__UnorderedGroup_3__3 )? ;
    public final void rule__Line__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2319:1: ( rule__Line__UnorderedGroup_3__Impl ( rule__Line__UnorderedGroup_3__3 )? )
            // InternalBoardGameDL.g:2320:2: rule__Line__UnorderedGroup_3__Impl ( rule__Line__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_30);
            rule__Line__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalBoardGameDL.g:2321:2: ( rule__Line__UnorderedGroup_3__3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( LA17_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getLineAccess().getUnorderedGroup_3(), 0) ) {
                alt17=1;
            }
            else if ( LA17_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getLineAccess().getUnorderedGroup_3(), 1) ) {
                alt17=1;
            }
            else if ( LA17_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getLineAccess().getUnorderedGroup_3(), 2) ) {
                alt17=1;
            }
            else if ( LA17_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getLineAccess().getUnorderedGroup_3(), 3) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBoardGameDL.g:2321:2: rule__Line__UnorderedGroup_3__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Line__UnorderedGroup_3__3();

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
    // $ANTLR end "rule__Line__UnorderedGroup_3__2"


    // $ANTLR start "rule__Line__UnorderedGroup_3__3"
    // InternalBoardGameDL.g:2327:1: rule__Line__UnorderedGroup_3__3 : rule__Line__UnorderedGroup_3__Impl ;
    public final void rule__Line__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2331:1: ( rule__Line__UnorderedGroup_3__Impl )
            // InternalBoardGameDL.g:2332:2: rule__Line__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Line__UnorderedGroup_3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__UnorderedGroup_3__3"


    // $ANTLR start "rule__BoardGame__NameAssignment_1"
    // InternalBoardGameDL.g:2339:1: rule__BoardGame__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__BoardGame__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2343:1: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2344:2: ( ruleEString )
            {
            // InternalBoardGameDL.g:2344:2: ( ruleEString )
            // InternalBoardGameDL.g:2345:3: ruleEString
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
    // InternalBoardGameDL.g:2354:1: rule__BoardGame__SizeAssignment_3 : ( ruleEInt ) ;
    public final void rule__BoardGame__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2358:1: ( ( ruleEInt ) )
            // InternalBoardGameDL.g:2359:2: ( ruleEInt )
            {
            // InternalBoardGameDL.g:2359:2: ( ruleEInt )
            // InternalBoardGameDL.g:2360:3: ruleEInt
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
    // InternalBoardGameDL.g:2369:1: rule__BoardGame__BoardGameElementsAssignment_4 : ( ruleBoardGameElement ) ;
    public final void rule__BoardGame__BoardGameElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2373:1: ( ( ruleBoardGameElement ) )
            // InternalBoardGameDL.g:2374:2: ( ruleBoardGameElement )
            {
            // InternalBoardGameDL.g:2374:2: ( ruleBoardGameElement )
            // InternalBoardGameDL.g:2375:3: ruleBoardGameElement
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
    // InternalBoardGameDL.g:2384:1: rule__PieceType__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__PieceType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2388:1: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2389:2: ( ruleEString )
            {
            // InternalBoardGameDL.g:2389:2: ( ruleEString )
            // InternalBoardGameDL.g:2390:3: ruleEString
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
    // InternalBoardGameDL.g:2399:1: rule__PieceType__SymbolAssignment_4 : ( ruleEString ) ;
    public final void rule__PieceType__SymbolAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2403:1: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2404:2: ( ruleEString )
            {
            // InternalBoardGameDL.g:2404:2: ( ruleEString )
            // InternalBoardGameDL.g:2405:3: ruleEString
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
    // InternalBoardGameDL.g:2414:1: rule__PieceType__ValidMovesAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__PieceType__ValidMovesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2418:1: ( ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:2419:2: ( ( ruleEString ) )
            {
            // InternalBoardGameDL.g:2419:2: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2420:3: ( ruleEString )
            {
             before(grammarAccess.getPieceTypeAccess().getValidMovesValidMoveCrossReference_6_0()); 
            // InternalBoardGameDL.g:2421:3: ( ruleEString )
            // InternalBoardGameDL.g:2422:4: ruleEString
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
    // InternalBoardGameDL.g:2433:1: rule__PieceType__ValidMovesAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__PieceType__ValidMovesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2437:1: ( ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:2438:2: ( ( ruleEString ) )
            {
            // InternalBoardGameDL.g:2438:2: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2439:3: ( ruleEString )
            {
             before(grammarAccess.getPieceTypeAccess().getValidMovesValidMoveCrossReference_7_1_0()); 
            // InternalBoardGameDL.g:2440:3: ( ruleEString )
            // InternalBoardGameDL.g:2441:4: ruleEString
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
    // InternalBoardGameDL.g:2452:1: rule__PieceType__EffectsoncellAssignment_8_1 : ( ( ruleEString ) ) ;
    public final void rule__PieceType__EffectsoncellAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2456:1: ( ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:2457:2: ( ( ruleEString ) )
            {
            // InternalBoardGameDL.g:2457:2: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2458:3: ( ruleEString )
            {
             before(grammarAccess.getPieceTypeAccess().getEffectsoncellEffectOnCellCrossReference_8_1_0()); 
            // InternalBoardGameDL.g:2459:3: ( ruleEString )
            // InternalBoardGameDL.g:2460:4: ruleEString
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
    // InternalBoardGameDL.g:2471:1: rule__PieceType__EffectsoncellAssignment_8_2_1 : ( ( ruleEString ) ) ;
    public final void rule__PieceType__EffectsoncellAssignment_8_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2475:1: ( ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:2476:2: ( ( ruleEString ) )
            {
            // InternalBoardGameDL.g:2476:2: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2477:3: ( ruleEString )
            {
             before(grammarAccess.getPieceTypeAccess().getEffectsoncellEffectOnCellCrossReference_8_2_1_0()); 
            // InternalBoardGameDL.g:2478:3: ( ruleEString )
            // InternalBoardGameDL.g:2479:4: ruleEString
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
    // InternalBoardGameDL.g:2490:1: rule__CellState__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CellState__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2494:1: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2495:2: ( ruleEString )
            {
            // InternalBoardGameDL.g:2495:2: ( ruleEString )
            // InternalBoardGameDL.g:2496:3: ruleEString
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
    // InternalBoardGameDL.g:2505:1: rule__WinCondition__WinConditionElementsAssignment_2 : ( ruleWinConditionElement ) ;
    public final void rule__WinCondition__WinConditionElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2509:1: ( ( ruleWinConditionElement ) )
            // InternalBoardGameDL.g:2510:2: ( ruleWinConditionElement )
            {
            // InternalBoardGameDL.g:2510:2: ( ruleWinConditionElement )
            // InternalBoardGameDL.g:2511:3: ruleWinConditionElement
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
    // InternalBoardGameDL.g:2520:1: rule__WinCondition__WinConditionElementsAssignment_3 : ( ruleWinConditionElement ) ;
    public final void rule__WinCondition__WinConditionElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2524:1: ( ( ruleWinConditionElement ) )
            // InternalBoardGameDL.g:2525:2: ( ruleWinConditionElement )
            {
            // InternalBoardGameDL.g:2525:2: ( ruleWinConditionElement )
            // InternalBoardGameDL.g:2526:3: ruleWinConditionElement
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
    // InternalBoardGameDL.g:2535:1: rule__ValidMove__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ValidMove__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2539:1: ( ( RULE_ID ) )
            // InternalBoardGameDL.g:2540:2: ( RULE_ID )
            {
            // InternalBoardGameDL.g:2540:2: ( RULE_ID )
            // InternalBoardGameDL.g:2541:3: RULE_ID
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
    // InternalBoardGameDL.g:2550:1: rule__ValidMove__PlaceAnywhereAssignment_3 : ( ( 'placeAnywhere' ) ) ;
    public final void rule__ValidMove__PlaceAnywhereAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2554:1: ( ( ( 'placeAnywhere' ) ) )
            // InternalBoardGameDL.g:2555:2: ( ( 'placeAnywhere' ) )
            {
            // InternalBoardGameDL.g:2555:2: ( ( 'placeAnywhere' ) )
            // InternalBoardGameDL.g:2556:3: ( 'placeAnywhere' )
            {
             before(grammarAccess.getValidMoveAccess().getPlaceAnywherePlaceAnywhereKeyword_3_0()); 
            // InternalBoardGameDL.g:2557:3: ( 'placeAnywhere' )
            // InternalBoardGameDL.g:2558:4: 'placeAnywhere'
            {
             before(grammarAccess.getValidMoveAccess().getPlaceAnywherePlaceAnywhereKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBoardGameDL.g:2569:1: rule__ValidMove__ConditionsAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__ValidMove__ConditionsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2573:1: ( ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:2574:2: ( ( ruleEString ) )
            {
            // InternalBoardGameDL.g:2574:2: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2575:3: ( ruleEString )
            {
             before(grammarAccess.getValidMoveAccess().getConditionsConditionCrossReference_4_2_0()); 
            // InternalBoardGameDL.g:2576:3: ( ruleEString )
            // InternalBoardGameDL.g:2577:4: ruleEString
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
    // InternalBoardGameDL.g:2588:1: rule__ValidMove__ConditionsAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ValidMove__ConditionsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2592:1: ( ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:2593:2: ( ( ruleEString ) )
            {
            // InternalBoardGameDL.g:2593:2: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2594:3: ( ruleEString )
            {
             before(grammarAccess.getValidMoveAccess().getConditionsConditionCrossReference_4_3_1_0()); 
            // InternalBoardGameDL.g:2595:3: ( ruleEString )
            // InternalBoardGameDL.g:2596:4: ruleEString
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
    // InternalBoardGameDL.g:2607:1: rule__EffectOnCell__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EffectOnCell__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2611:1: ( ( RULE_ID ) )
            // InternalBoardGameDL.g:2612:2: ( RULE_ID )
            {
            // InternalBoardGameDL.g:2612:2: ( RULE_ID )
            // InternalBoardGameDL.g:2613:3: RULE_ID
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
    // InternalBoardGameDL.g:2622:1: rule__EffectOnCell__XAssignment_3_0_2 : ( ruleEInt ) ;
    public final void rule__EffectOnCell__XAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2626:1: ( ( ruleEInt ) )
            // InternalBoardGameDL.g:2627:2: ( ruleEInt )
            {
            // InternalBoardGameDL.g:2627:2: ( ruleEInt )
            // InternalBoardGameDL.g:2628:3: ruleEInt
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
    // InternalBoardGameDL.g:2637:1: rule__EffectOnCell__YAssignment_3_0_4 : ( ruleEInt ) ;
    public final void rule__EffectOnCell__YAssignment_3_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2641:1: ( ( ruleEInt ) )
            // InternalBoardGameDL.g:2642:2: ( ruleEInt )
            {
            // InternalBoardGameDL.g:2642:2: ( ruleEInt )
            // InternalBoardGameDL.g:2643:3: ruleEInt
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
    // InternalBoardGameDL.g:2652:1: rule__EffectOnCell__CellStateAssignment_3_1_1 : ( ( ruleEString ) ) ;
    public final void rule__EffectOnCell__CellStateAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2656:1: ( ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:2657:2: ( ( ruleEString ) )
            {
            // InternalBoardGameDL.g:2657:2: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2658:3: ( ruleEString )
            {
             before(grammarAccess.getEffectOnCellAccess().getCellStateCellStateCrossReference_3_1_1_0()); 
            // InternalBoardGameDL.g:2659:3: ( ruleEString )
            // InternalBoardGameDL.g:2660:4: ruleEString
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
    // InternalBoardGameDL.g:2671:1: rule__Condition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Condition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2675:1: ( ( RULE_ID ) )
            // InternalBoardGameDL.g:2676:2: ( RULE_ID )
            {
            // InternalBoardGameDL.g:2676:2: ( RULE_ID )
            // InternalBoardGameDL.g:2677:3: RULE_ID
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
    // InternalBoardGameDL.g:2686:1: rule__Condition__CellStateAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Condition__CellStateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2690:1: ( ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:2691:2: ( ( ruleEString ) )
            {
            // InternalBoardGameDL.g:2691:2: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2692:3: ( ruleEString )
            {
             before(grammarAccess.getConditionAccess().getCellStateCellStateCrossReference_2_0()); 
            // InternalBoardGameDL.g:2693:3: ( ruleEString )
            // InternalBoardGameDL.g:2694:4: ruleEString
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


    // $ANTLR start "rule__Line__CountAssignment_2"
    // InternalBoardGameDL.g:2705:1: rule__Line__CountAssignment_2 : ( ruleEInt ) ;
    public final void rule__Line__CountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2709:1: ( ( ruleEInt ) )
            // InternalBoardGameDL.g:2710:2: ( ruleEInt )
            {
            // InternalBoardGameDL.g:2710:2: ( ruleEInt )
            // InternalBoardGameDL.g:2711:3: ruleEInt
            {
             before(grammarAccess.getLineAccess().getCountEIntParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getLineAccess().getCountEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__CountAssignment_2"


    // $ANTLR start "rule__Line__HorizontalAssignment_3_0"
    // InternalBoardGameDL.g:2720:1: rule__Line__HorizontalAssignment_3_0 : ( ( 'horizontal' ) ) ;
    public final void rule__Line__HorizontalAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2724:1: ( ( ( 'horizontal' ) ) )
            // InternalBoardGameDL.g:2725:2: ( ( 'horizontal' ) )
            {
            // InternalBoardGameDL.g:2725:2: ( ( 'horizontal' ) )
            // InternalBoardGameDL.g:2726:3: ( 'horizontal' )
            {
             before(grammarAccess.getLineAccess().getHorizontalHorizontalKeyword_3_0_0()); 
            // InternalBoardGameDL.g:2727:3: ( 'horizontal' )
            // InternalBoardGameDL.g:2728:4: 'horizontal'
            {
             before(grammarAccess.getLineAccess().getHorizontalHorizontalKeyword_3_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getHorizontalHorizontalKeyword_3_0_0()); 

            }

             after(grammarAccess.getLineAccess().getHorizontalHorizontalKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__HorizontalAssignment_3_0"


    // $ANTLR start "rule__Line__VerticalAssignment_3_1"
    // InternalBoardGameDL.g:2739:1: rule__Line__VerticalAssignment_3_1 : ( ( 'vertical' ) ) ;
    public final void rule__Line__VerticalAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2743:1: ( ( ( 'vertical' ) ) )
            // InternalBoardGameDL.g:2744:2: ( ( 'vertical' ) )
            {
            // InternalBoardGameDL.g:2744:2: ( ( 'vertical' ) )
            // InternalBoardGameDL.g:2745:3: ( 'vertical' )
            {
             before(grammarAccess.getLineAccess().getVerticalVerticalKeyword_3_1_0()); 
            // InternalBoardGameDL.g:2746:3: ( 'vertical' )
            // InternalBoardGameDL.g:2747:4: 'vertical'
            {
             before(grammarAccess.getLineAccess().getVerticalVerticalKeyword_3_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getVerticalVerticalKeyword_3_1_0()); 

            }

             after(grammarAccess.getLineAccess().getVerticalVerticalKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__VerticalAssignment_3_1"


    // $ANTLR start "rule__Line__DiagonalAssignment_3_2"
    // InternalBoardGameDL.g:2758:1: rule__Line__DiagonalAssignment_3_2 : ( ( 'diagonal' ) ) ;
    public final void rule__Line__DiagonalAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2762:1: ( ( ( 'diagonal' ) ) )
            // InternalBoardGameDL.g:2763:2: ( ( 'diagonal' ) )
            {
            // InternalBoardGameDL.g:2763:2: ( ( 'diagonal' ) )
            // InternalBoardGameDL.g:2764:3: ( 'diagonal' )
            {
             before(grammarAccess.getLineAccess().getDiagonalDiagonalKeyword_3_2_0()); 
            // InternalBoardGameDL.g:2765:3: ( 'diagonal' )
            // InternalBoardGameDL.g:2766:4: 'diagonal'
            {
             before(grammarAccess.getLineAccess().getDiagonalDiagonalKeyword_3_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getDiagonalDiagonalKeyword_3_2_0()); 

            }

             after(grammarAccess.getLineAccess().getDiagonalDiagonalKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__DiagonalAssignment_3_2"


    // $ANTLR start "rule__Line__UniqueAssignment_3_3"
    // InternalBoardGameDL.g:2777:1: rule__Line__UniqueAssignment_3_3 : ( ( 'unique' ) ) ;
    public final void rule__Line__UniqueAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2781:1: ( ( ( 'unique' ) ) )
            // InternalBoardGameDL.g:2782:2: ( ( 'unique' ) )
            {
            // InternalBoardGameDL.g:2782:2: ( ( 'unique' ) )
            // InternalBoardGameDL.g:2783:3: ( 'unique' )
            {
             before(grammarAccess.getLineAccess().getUniqueUniqueKeyword_3_3_0()); 
            // InternalBoardGameDL.g:2784:3: ( 'unique' )
            // InternalBoardGameDL.g:2785:4: 'unique'
            {
             before(grammarAccess.getLineAccess().getUniqueUniqueKeyword_3_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getUniqueUniqueKeyword_3_3_0()); 

            }

             after(grammarAccess.getLineAccess().getUniqueUniqueKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__UniqueAssignment_3_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000108B02000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000108B02002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000F000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000090000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000F000000002L});

}
