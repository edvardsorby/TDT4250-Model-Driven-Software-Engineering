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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ROW'", "'COLUMN'", "'DIAGONAL'", "'Title'", "'BoardSize'", "'PieceType'", "'{'", "'Symbol'", "'DisallowedStates'", "'}'", "','", "'EffectsOnCell'", "'Cellstate'", "'WinCondition'", "'-'", "'EffectOnCell'", "'relativePosition'", "'('", "')'", "'newCellState'", "'Line'", "'length'", "'direction'"
    };
    public static final int RULE_STRING=4;
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


    // $ANTLR start "entryRuleWinConditionElement"
    // InternalBoardGameDL.g:253:1: entryRuleWinConditionElement : ruleWinConditionElement EOF ;
    public final void entryRuleWinConditionElement() throws RecognitionException {
        try {
            // InternalBoardGameDL.g:254:1: ( ruleWinConditionElement EOF )
            // InternalBoardGameDL.g:255:1: ruleWinConditionElement EOF
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
    // InternalBoardGameDL.g:262:1: ruleWinConditionElement : ( ruleLine ) ;
    public final void ruleWinConditionElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:266:2: ( ( ruleLine ) )
            // InternalBoardGameDL.g:267:2: ( ruleLine )
            {
            // InternalBoardGameDL.g:267:2: ( ruleLine )
            // InternalBoardGameDL.g:268:3: ruleLine
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
    // InternalBoardGameDL.g:278:1: entryRuleLine : ruleLine EOF ;
    public final void entryRuleLine() throws RecognitionException {
        try {
            // InternalBoardGameDL.g:279:1: ( ruleLine EOF )
            // InternalBoardGameDL.g:280:1: ruleLine EOF
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
    // InternalBoardGameDL.g:287:1: ruleLine : ( ( rule__Line__Group__0 ) ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:291:2: ( ( ( rule__Line__Group__0 ) ) )
            // InternalBoardGameDL.g:292:2: ( ( rule__Line__Group__0 ) )
            {
            // InternalBoardGameDL.g:292:2: ( ( rule__Line__Group__0 ) )
            // InternalBoardGameDL.g:293:3: ( rule__Line__Group__0 )
            {
             before(grammarAccess.getLineAccess().getGroup()); 
            // InternalBoardGameDL.g:294:3: ( rule__Line__Group__0 )
            // InternalBoardGameDL.g:294:4: rule__Line__Group__0
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
    // InternalBoardGameDL.g:303:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:307:1: ( ( ( rule__Direction__Alternatives ) ) )
            // InternalBoardGameDL.g:308:2: ( ( rule__Direction__Alternatives ) )
            {
            // InternalBoardGameDL.g:308:2: ( ( rule__Direction__Alternatives ) )
            // InternalBoardGameDL.g:309:3: ( rule__Direction__Alternatives )
            {
             before(grammarAccess.getDirectionAccess().getAlternatives()); 
            // InternalBoardGameDL.g:310:3: ( rule__Direction__Alternatives )
            // InternalBoardGameDL.g:310:4: rule__Direction__Alternatives
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
    // InternalBoardGameDL.g:318:1: rule__BoardGameElement__Alternatives : ( ( rulePieceType ) | ( ruleEffectOnCell ) | ( ruleCellState ) | ( ruleWinCondition ) );
    public final void rule__BoardGameElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:322:1: ( ( rulePieceType ) | ( ruleEffectOnCell ) | ( ruleCellState ) | ( ruleWinCondition ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt1=1;
                }
                break;
            case 26:
                {
                alt1=2;
                }
                break;
            case 23:
                {
                alt1=3;
                }
                break;
            case 24:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalBoardGameDL.g:323:2: ( rulePieceType )
                    {
                    // InternalBoardGameDL.g:323:2: ( rulePieceType )
                    // InternalBoardGameDL.g:324:3: rulePieceType
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
                    // InternalBoardGameDL.g:329:2: ( ruleEffectOnCell )
                    {
                    // InternalBoardGameDL.g:329:2: ( ruleEffectOnCell )
                    // InternalBoardGameDL.g:330:3: ruleEffectOnCell
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
                    // InternalBoardGameDL.g:335:2: ( ruleCellState )
                    {
                    // InternalBoardGameDL.g:335:2: ( ruleCellState )
                    // InternalBoardGameDL.g:336:3: ruleCellState
                    {
                     before(grammarAccess.getBoardGameElementAccess().getCellStateParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCellState();

                    state._fsp--;

                     after(grammarAccess.getBoardGameElementAccess().getCellStateParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBoardGameDL.g:341:2: ( ruleWinCondition )
                    {
                    // InternalBoardGameDL.g:341:2: ( ruleWinCondition )
                    // InternalBoardGameDL.g:342:3: ruleWinCondition
                    {
                     before(grammarAccess.getBoardGameElementAccess().getWinConditionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleWinCondition();

                    state._fsp--;

                     after(grammarAccess.getBoardGameElementAccess().getWinConditionParserRuleCall_3()); 

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
    // InternalBoardGameDL.g:351:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:355:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalBoardGameDL.g:356:2: ( RULE_STRING )
                    {
                    // InternalBoardGameDL.g:356:2: ( RULE_STRING )
                    // InternalBoardGameDL.g:357:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBoardGameDL.g:362:2: ( RULE_ID )
                    {
                    // InternalBoardGameDL.g:362:2: ( RULE_ID )
                    // InternalBoardGameDL.g:363:3: RULE_ID
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
    // InternalBoardGameDL.g:372:1: rule__Direction__Alternatives : ( ( ( 'ROW' ) ) | ( ( 'COLUMN' ) ) | ( ( 'DIAGONAL' ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:376:1: ( ( ( 'ROW' ) ) | ( ( 'COLUMN' ) ) | ( ( 'DIAGONAL' ) ) )
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
                    // InternalBoardGameDL.g:377:2: ( ( 'ROW' ) )
                    {
                    // InternalBoardGameDL.g:377:2: ( ( 'ROW' ) )
                    // InternalBoardGameDL.g:378:3: ( 'ROW' )
                    {
                     before(grammarAccess.getDirectionAccess().getROWEnumLiteralDeclaration_0()); 
                    // InternalBoardGameDL.g:379:3: ( 'ROW' )
                    // InternalBoardGameDL.g:379:4: 'ROW'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getROWEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBoardGameDL.g:383:2: ( ( 'COLUMN' ) )
                    {
                    // InternalBoardGameDL.g:383:2: ( ( 'COLUMN' ) )
                    // InternalBoardGameDL.g:384:3: ( 'COLUMN' )
                    {
                     before(grammarAccess.getDirectionAccess().getCOLUMNEnumLiteralDeclaration_1()); 
                    // InternalBoardGameDL.g:385:3: ( 'COLUMN' )
                    // InternalBoardGameDL.g:385:4: 'COLUMN'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getCOLUMNEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBoardGameDL.g:389:2: ( ( 'DIAGONAL' ) )
                    {
                    // InternalBoardGameDL.g:389:2: ( ( 'DIAGONAL' ) )
                    // InternalBoardGameDL.g:390:3: ( 'DIAGONAL' )
                    {
                     before(grammarAccess.getDirectionAccess().getDIAGONALEnumLiteralDeclaration_2()); 
                    // InternalBoardGameDL.g:391:3: ( 'DIAGONAL' )
                    // InternalBoardGameDL.g:391:4: 'DIAGONAL'
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
    // InternalBoardGameDL.g:399:1: rule__BoardGame__Group__0 : rule__BoardGame__Group__0__Impl rule__BoardGame__Group__1 ;
    public final void rule__BoardGame__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:403:1: ( rule__BoardGame__Group__0__Impl rule__BoardGame__Group__1 )
            // InternalBoardGameDL.g:404:2: rule__BoardGame__Group__0__Impl rule__BoardGame__Group__1
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
    // InternalBoardGameDL.g:411:1: rule__BoardGame__Group__0__Impl : ( 'Title' ) ;
    public final void rule__BoardGame__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:415:1: ( ( 'Title' ) )
            // InternalBoardGameDL.g:416:1: ( 'Title' )
            {
            // InternalBoardGameDL.g:416:1: ( 'Title' )
            // InternalBoardGameDL.g:417:2: 'Title'
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
    // InternalBoardGameDL.g:426:1: rule__BoardGame__Group__1 : rule__BoardGame__Group__1__Impl rule__BoardGame__Group__2 ;
    public final void rule__BoardGame__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:430:1: ( rule__BoardGame__Group__1__Impl rule__BoardGame__Group__2 )
            // InternalBoardGameDL.g:431:2: rule__BoardGame__Group__1__Impl rule__BoardGame__Group__2
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
    // InternalBoardGameDL.g:438:1: rule__BoardGame__Group__1__Impl : ( ( rule__BoardGame__NameAssignment_1 ) ) ;
    public final void rule__BoardGame__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:442:1: ( ( ( rule__BoardGame__NameAssignment_1 ) ) )
            // InternalBoardGameDL.g:443:1: ( ( rule__BoardGame__NameAssignment_1 ) )
            {
            // InternalBoardGameDL.g:443:1: ( ( rule__BoardGame__NameAssignment_1 ) )
            // InternalBoardGameDL.g:444:2: ( rule__BoardGame__NameAssignment_1 )
            {
             before(grammarAccess.getBoardGameAccess().getNameAssignment_1()); 
            // InternalBoardGameDL.g:445:2: ( rule__BoardGame__NameAssignment_1 )
            // InternalBoardGameDL.g:445:3: rule__BoardGame__NameAssignment_1
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
    // InternalBoardGameDL.g:453:1: rule__BoardGame__Group__2 : rule__BoardGame__Group__2__Impl rule__BoardGame__Group__3 ;
    public final void rule__BoardGame__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:457:1: ( rule__BoardGame__Group__2__Impl rule__BoardGame__Group__3 )
            // InternalBoardGameDL.g:458:2: rule__BoardGame__Group__2__Impl rule__BoardGame__Group__3
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
    // InternalBoardGameDL.g:465:1: rule__BoardGame__Group__2__Impl : ( 'BoardSize' ) ;
    public final void rule__BoardGame__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:469:1: ( ( 'BoardSize' ) )
            // InternalBoardGameDL.g:470:1: ( 'BoardSize' )
            {
            // InternalBoardGameDL.g:470:1: ( 'BoardSize' )
            // InternalBoardGameDL.g:471:2: 'BoardSize'
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
    // InternalBoardGameDL.g:480:1: rule__BoardGame__Group__3 : rule__BoardGame__Group__3__Impl rule__BoardGame__Group__4 ;
    public final void rule__BoardGame__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:484:1: ( rule__BoardGame__Group__3__Impl rule__BoardGame__Group__4 )
            // InternalBoardGameDL.g:485:2: rule__BoardGame__Group__3__Impl rule__BoardGame__Group__4
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
    // InternalBoardGameDL.g:492:1: rule__BoardGame__Group__3__Impl : ( ( rule__BoardGame__SizeAssignment_3 ) ) ;
    public final void rule__BoardGame__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:496:1: ( ( ( rule__BoardGame__SizeAssignment_3 ) ) )
            // InternalBoardGameDL.g:497:1: ( ( rule__BoardGame__SizeAssignment_3 ) )
            {
            // InternalBoardGameDL.g:497:1: ( ( rule__BoardGame__SizeAssignment_3 ) )
            // InternalBoardGameDL.g:498:2: ( rule__BoardGame__SizeAssignment_3 )
            {
             before(grammarAccess.getBoardGameAccess().getSizeAssignment_3()); 
            // InternalBoardGameDL.g:499:2: ( rule__BoardGame__SizeAssignment_3 )
            // InternalBoardGameDL.g:499:3: rule__BoardGame__SizeAssignment_3
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
    // InternalBoardGameDL.g:507:1: rule__BoardGame__Group__4 : rule__BoardGame__Group__4__Impl ;
    public final void rule__BoardGame__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:511:1: ( rule__BoardGame__Group__4__Impl )
            // InternalBoardGameDL.g:512:2: rule__BoardGame__Group__4__Impl
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
    // InternalBoardGameDL.g:518:1: rule__BoardGame__Group__4__Impl : ( ( rule__BoardGame__BoardGameElementsAssignment_4 )* ) ;
    public final void rule__BoardGame__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:522:1: ( ( ( rule__BoardGame__BoardGameElementsAssignment_4 )* ) )
            // InternalBoardGameDL.g:523:1: ( ( rule__BoardGame__BoardGameElementsAssignment_4 )* )
            {
            // InternalBoardGameDL.g:523:1: ( ( rule__BoardGame__BoardGameElementsAssignment_4 )* )
            // InternalBoardGameDL.g:524:2: ( rule__BoardGame__BoardGameElementsAssignment_4 )*
            {
             before(grammarAccess.getBoardGameAccess().getBoardGameElementsAssignment_4()); 
            // InternalBoardGameDL.g:525:2: ( rule__BoardGame__BoardGameElementsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16||(LA4_0>=23 && LA4_0<=24)||LA4_0==26) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBoardGameDL.g:525:3: rule__BoardGame__BoardGameElementsAssignment_4
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
    // InternalBoardGameDL.g:534:1: rule__PieceType__Group__0 : rule__PieceType__Group__0__Impl rule__PieceType__Group__1 ;
    public final void rule__PieceType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:538:1: ( rule__PieceType__Group__0__Impl rule__PieceType__Group__1 )
            // InternalBoardGameDL.g:539:2: rule__PieceType__Group__0__Impl rule__PieceType__Group__1
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
    // InternalBoardGameDL.g:546:1: rule__PieceType__Group__0__Impl : ( 'PieceType' ) ;
    public final void rule__PieceType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:550:1: ( ( 'PieceType' ) )
            // InternalBoardGameDL.g:551:1: ( 'PieceType' )
            {
            // InternalBoardGameDL.g:551:1: ( 'PieceType' )
            // InternalBoardGameDL.g:552:2: 'PieceType'
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
    // InternalBoardGameDL.g:561:1: rule__PieceType__Group__1 : rule__PieceType__Group__1__Impl rule__PieceType__Group__2 ;
    public final void rule__PieceType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:565:1: ( rule__PieceType__Group__1__Impl rule__PieceType__Group__2 )
            // InternalBoardGameDL.g:566:2: rule__PieceType__Group__1__Impl rule__PieceType__Group__2
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
    // InternalBoardGameDL.g:573:1: rule__PieceType__Group__1__Impl : ( ( rule__PieceType__NameAssignment_1 ) ) ;
    public final void rule__PieceType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:577:1: ( ( ( rule__PieceType__NameAssignment_1 ) ) )
            // InternalBoardGameDL.g:578:1: ( ( rule__PieceType__NameAssignment_1 ) )
            {
            // InternalBoardGameDL.g:578:1: ( ( rule__PieceType__NameAssignment_1 ) )
            // InternalBoardGameDL.g:579:2: ( rule__PieceType__NameAssignment_1 )
            {
             before(grammarAccess.getPieceTypeAccess().getNameAssignment_1()); 
            // InternalBoardGameDL.g:580:2: ( rule__PieceType__NameAssignment_1 )
            // InternalBoardGameDL.g:580:3: rule__PieceType__NameAssignment_1
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
    // InternalBoardGameDL.g:588:1: rule__PieceType__Group__2 : rule__PieceType__Group__2__Impl rule__PieceType__Group__3 ;
    public final void rule__PieceType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:592:1: ( rule__PieceType__Group__2__Impl rule__PieceType__Group__3 )
            // InternalBoardGameDL.g:593:2: rule__PieceType__Group__2__Impl rule__PieceType__Group__3
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
    // InternalBoardGameDL.g:600:1: rule__PieceType__Group__2__Impl : ( '{' ) ;
    public final void rule__PieceType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:604:1: ( ( '{' ) )
            // InternalBoardGameDL.g:605:1: ( '{' )
            {
            // InternalBoardGameDL.g:605:1: ( '{' )
            // InternalBoardGameDL.g:606:2: '{'
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
    // InternalBoardGameDL.g:615:1: rule__PieceType__Group__3 : rule__PieceType__Group__3__Impl rule__PieceType__Group__4 ;
    public final void rule__PieceType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:619:1: ( rule__PieceType__Group__3__Impl rule__PieceType__Group__4 )
            // InternalBoardGameDL.g:620:2: rule__PieceType__Group__3__Impl rule__PieceType__Group__4
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
    // InternalBoardGameDL.g:627:1: rule__PieceType__Group__3__Impl : ( 'Symbol' ) ;
    public final void rule__PieceType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:631:1: ( ( 'Symbol' ) )
            // InternalBoardGameDL.g:632:1: ( 'Symbol' )
            {
            // InternalBoardGameDL.g:632:1: ( 'Symbol' )
            // InternalBoardGameDL.g:633:2: 'Symbol'
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
    // InternalBoardGameDL.g:642:1: rule__PieceType__Group__4 : rule__PieceType__Group__4__Impl rule__PieceType__Group__5 ;
    public final void rule__PieceType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:646:1: ( rule__PieceType__Group__4__Impl rule__PieceType__Group__5 )
            // InternalBoardGameDL.g:647:2: rule__PieceType__Group__4__Impl rule__PieceType__Group__5
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
    // InternalBoardGameDL.g:654:1: rule__PieceType__Group__4__Impl : ( ( rule__PieceType__SymbolAssignment_4 ) ) ;
    public final void rule__PieceType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:658:1: ( ( ( rule__PieceType__SymbolAssignment_4 ) ) )
            // InternalBoardGameDL.g:659:1: ( ( rule__PieceType__SymbolAssignment_4 ) )
            {
            // InternalBoardGameDL.g:659:1: ( ( rule__PieceType__SymbolAssignment_4 ) )
            // InternalBoardGameDL.g:660:2: ( rule__PieceType__SymbolAssignment_4 )
            {
             before(grammarAccess.getPieceTypeAccess().getSymbolAssignment_4()); 
            // InternalBoardGameDL.g:661:2: ( rule__PieceType__SymbolAssignment_4 )
            // InternalBoardGameDL.g:661:3: rule__PieceType__SymbolAssignment_4
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
    // InternalBoardGameDL.g:669:1: rule__PieceType__Group__5 : rule__PieceType__Group__5__Impl rule__PieceType__Group__6 ;
    public final void rule__PieceType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:673:1: ( rule__PieceType__Group__5__Impl rule__PieceType__Group__6 )
            // InternalBoardGameDL.g:674:2: rule__PieceType__Group__5__Impl rule__PieceType__Group__6
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
    // InternalBoardGameDL.g:681:1: rule__PieceType__Group__5__Impl : ( 'DisallowedStates' ) ;
    public final void rule__PieceType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:685:1: ( ( 'DisallowedStates' ) )
            // InternalBoardGameDL.g:686:1: ( 'DisallowedStates' )
            {
            // InternalBoardGameDL.g:686:1: ( 'DisallowedStates' )
            // InternalBoardGameDL.g:687:2: 'DisallowedStates'
            {
             before(grammarAccess.getPieceTypeAccess().getDisallowedStatesKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPieceTypeAccess().getDisallowedStatesKeyword_5()); 

            }


            }

        }
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
    // InternalBoardGameDL.g:696:1: rule__PieceType__Group__6 : rule__PieceType__Group__6__Impl rule__PieceType__Group__7 ;
    public final void rule__PieceType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:700:1: ( rule__PieceType__Group__6__Impl rule__PieceType__Group__7 )
            // InternalBoardGameDL.g:701:2: rule__PieceType__Group__6__Impl rule__PieceType__Group__7
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
    // InternalBoardGameDL.g:708:1: rule__PieceType__Group__6__Impl : ( ( rule__PieceType__DisallowedStatesAssignment_6 ) ) ;
    public final void rule__PieceType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:712:1: ( ( ( rule__PieceType__DisallowedStatesAssignment_6 ) ) )
            // InternalBoardGameDL.g:713:1: ( ( rule__PieceType__DisallowedStatesAssignment_6 ) )
            {
            // InternalBoardGameDL.g:713:1: ( ( rule__PieceType__DisallowedStatesAssignment_6 ) )
            // InternalBoardGameDL.g:714:2: ( rule__PieceType__DisallowedStatesAssignment_6 )
            {
             before(grammarAccess.getPieceTypeAccess().getDisallowedStatesAssignment_6()); 
            // InternalBoardGameDL.g:715:2: ( rule__PieceType__DisallowedStatesAssignment_6 )
            // InternalBoardGameDL.g:715:3: rule__PieceType__DisallowedStatesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__DisallowedStatesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPieceTypeAccess().getDisallowedStatesAssignment_6()); 

            }


            }

        }
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
    // InternalBoardGameDL.g:723:1: rule__PieceType__Group__7 : rule__PieceType__Group__7__Impl rule__PieceType__Group__8 ;
    public final void rule__PieceType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:727:1: ( rule__PieceType__Group__7__Impl rule__PieceType__Group__8 )
            // InternalBoardGameDL.g:728:2: rule__PieceType__Group__7__Impl rule__PieceType__Group__8
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
    // InternalBoardGameDL.g:735:1: rule__PieceType__Group__7__Impl : ( ( rule__PieceType__Group_7__0 )* ) ;
    public final void rule__PieceType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:739:1: ( ( ( rule__PieceType__Group_7__0 )* ) )
            // InternalBoardGameDL.g:740:1: ( ( rule__PieceType__Group_7__0 )* )
            {
            // InternalBoardGameDL.g:740:1: ( ( rule__PieceType__Group_7__0 )* )
            // InternalBoardGameDL.g:741:2: ( rule__PieceType__Group_7__0 )*
            {
             before(grammarAccess.getPieceTypeAccess().getGroup_7()); 
            // InternalBoardGameDL.g:742:2: ( rule__PieceType__Group_7__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBoardGameDL.g:742:3: rule__PieceType__Group_7__0
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
    // InternalBoardGameDL.g:750:1: rule__PieceType__Group__8 : rule__PieceType__Group__8__Impl rule__PieceType__Group__9 ;
    public final void rule__PieceType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:754:1: ( rule__PieceType__Group__8__Impl rule__PieceType__Group__9 )
            // InternalBoardGameDL.g:755:2: rule__PieceType__Group__8__Impl rule__PieceType__Group__9
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
    // InternalBoardGameDL.g:762:1: rule__PieceType__Group__8__Impl : ( ( rule__PieceType__Group_8__0 )? ) ;
    public final void rule__PieceType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:766:1: ( ( ( rule__PieceType__Group_8__0 )? ) )
            // InternalBoardGameDL.g:767:1: ( ( rule__PieceType__Group_8__0 )? )
            {
            // InternalBoardGameDL.g:767:1: ( ( rule__PieceType__Group_8__0 )? )
            // InternalBoardGameDL.g:768:2: ( rule__PieceType__Group_8__0 )?
            {
             before(grammarAccess.getPieceTypeAccess().getGroup_8()); 
            // InternalBoardGameDL.g:769:2: ( rule__PieceType__Group_8__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBoardGameDL.g:769:3: rule__PieceType__Group_8__0
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
    // InternalBoardGameDL.g:777:1: rule__PieceType__Group__9 : rule__PieceType__Group__9__Impl ;
    public final void rule__PieceType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:781:1: ( rule__PieceType__Group__9__Impl )
            // InternalBoardGameDL.g:782:2: rule__PieceType__Group__9__Impl
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
    // InternalBoardGameDL.g:788:1: rule__PieceType__Group__9__Impl : ( '}' ) ;
    public final void rule__PieceType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:792:1: ( ( '}' ) )
            // InternalBoardGameDL.g:793:1: ( '}' )
            {
            // InternalBoardGameDL.g:793:1: ( '}' )
            // InternalBoardGameDL.g:794:2: '}'
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
    // InternalBoardGameDL.g:804:1: rule__PieceType__Group_7__0 : rule__PieceType__Group_7__0__Impl rule__PieceType__Group_7__1 ;
    public final void rule__PieceType__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:808:1: ( rule__PieceType__Group_7__0__Impl rule__PieceType__Group_7__1 )
            // InternalBoardGameDL.g:809:2: rule__PieceType__Group_7__0__Impl rule__PieceType__Group_7__1
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
    // InternalBoardGameDL.g:816:1: rule__PieceType__Group_7__0__Impl : ( ',' ) ;
    public final void rule__PieceType__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:820:1: ( ( ',' ) )
            // InternalBoardGameDL.g:821:1: ( ',' )
            {
            // InternalBoardGameDL.g:821:1: ( ',' )
            // InternalBoardGameDL.g:822:2: ','
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
    // InternalBoardGameDL.g:831:1: rule__PieceType__Group_7__1 : rule__PieceType__Group_7__1__Impl ;
    public final void rule__PieceType__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:835:1: ( rule__PieceType__Group_7__1__Impl )
            // InternalBoardGameDL.g:836:2: rule__PieceType__Group_7__1__Impl
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
    // InternalBoardGameDL.g:842:1: rule__PieceType__Group_7__1__Impl : ( ( rule__PieceType__DisallowedStatesAssignment_7_1 ) ) ;
    public final void rule__PieceType__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:846:1: ( ( ( rule__PieceType__DisallowedStatesAssignment_7_1 ) ) )
            // InternalBoardGameDL.g:847:1: ( ( rule__PieceType__DisallowedStatesAssignment_7_1 ) )
            {
            // InternalBoardGameDL.g:847:1: ( ( rule__PieceType__DisallowedStatesAssignment_7_1 ) )
            // InternalBoardGameDL.g:848:2: ( rule__PieceType__DisallowedStatesAssignment_7_1 )
            {
             before(grammarAccess.getPieceTypeAccess().getDisallowedStatesAssignment_7_1()); 
            // InternalBoardGameDL.g:849:2: ( rule__PieceType__DisallowedStatesAssignment_7_1 )
            // InternalBoardGameDL.g:849:3: rule__PieceType__DisallowedStatesAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__DisallowedStatesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPieceTypeAccess().getDisallowedStatesAssignment_7_1()); 

            }


            }

        }
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
    // InternalBoardGameDL.g:858:1: rule__PieceType__Group_8__0 : rule__PieceType__Group_8__0__Impl rule__PieceType__Group_8__1 ;
    public final void rule__PieceType__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:862:1: ( rule__PieceType__Group_8__0__Impl rule__PieceType__Group_8__1 )
            // InternalBoardGameDL.g:863:2: rule__PieceType__Group_8__0__Impl rule__PieceType__Group_8__1
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
    // InternalBoardGameDL.g:870:1: rule__PieceType__Group_8__0__Impl : ( 'EffectsOnCell' ) ;
    public final void rule__PieceType__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:874:1: ( ( 'EffectsOnCell' ) )
            // InternalBoardGameDL.g:875:1: ( 'EffectsOnCell' )
            {
            // InternalBoardGameDL.g:875:1: ( 'EffectsOnCell' )
            // InternalBoardGameDL.g:876:2: 'EffectsOnCell'
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
    // InternalBoardGameDL.g:885:1: rule__PieceType__Group_8__1 : rule__PieceType__Group_8__1__Impl rule__PieceType__Group_8__2 ;
    public final void rule__PieceType__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:889:1: ( rule__PieceType__Group_8__1__Impl rule__PieceType__Group_8__2 )
            // InternalBoardGameDL.g:890:2: rule__PieceType__Group_8__1__Impl rule__PieceType__Group_8__2
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
    // InternalBoardGameDL.g:897:1: rule__PieceType__Group_8__1__Impl : ( ( rule__PieceType__EffectsOnCellAssignment_8_1 ) ) ;
    public final void rule__PieceType__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:901:1: ( ( ( rule__PieceType__EffectsOnCellAssignment_8_1 ) ) )
            // InternalBoardGameDL.g:902:1: ( ( rule__PieceType__EffectsOnCellAssignment_8_1 ) )
            {
            // InternalBoardGameDL.g:902:1: ( ( rule__PieceType__EffectsOnCellAssignment_8_1 ) )
            // InternalBoardGameDL.g:903:2: ( rule__PieceType__EffectsOnCellAssignment_8_1 )
            {
             before(grammarAccess.getPieceTypeAccess().getEffectsOnCellAssignment_8_1()); 
            // InternalBoardGameDL.g:904:2: ( rule__PieceType__EffectsOnCellAssignment_8_1 )
            // InternalBoardGameDL.g:904:3: rule__PieceType__EffectsOnCellAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__EffectsOnCellAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getPieceTypeAccess().getEffectsOnCellAssignment_8_1()); 

            }


            }

        }
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
    // InternalBoardGameDL.g:912:1: rule__PieceType__Group_8__2 : rule__PieceType__Group_8__2__Impl ;
    public final void rule__PieceType__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:916:1: ( rule__PieceType__Group_8__2__Impl )
            // InternalBoardGameDL.g:917:2: rule__PieceType__Group_8__2__Impl
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
    // InternalBoardGameDL.g:923:1: rule__PieceType__Group_8__2__Impl : ( ( rule__PieceType__Group_8_2__0 )* ) ;
    public final void rule__PieceType__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:927:1: ( ( ( rule__PieceType__Group_8_2__0 )* ) )
            // InternalBoardGameDL.g:928:1: ( ( rule__PieceType__Group_8_2__0 )* )
            {
            // InternalBoardGameDL.g:928:1: ( ( rule__PieceType__Group_8_2__0 )* )
            // InternalBoardGameDL.g:929:2: ( rule__PieceType__Group_8_2__0 )*
            {
             before(grammarAccess.getPieceTypeAccess().getGroup_8_2()); 
            // InternalBoardGameDL.g:930:2: ( rule__PieceType__Group_8_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBoardGameDL.g:930:3: rule__PieceType__Group_8_2__0
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
    // InternalBoardGameDL.g:939:1: rule__PieceType__Group_8_2__0 : rule__PieceType__Group_8_2__0__Impl rule__PieceType__Group_8_2__1 ;
    public final void rule__PieceType__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:943:1: ( rule__PieceType__Group_8_2__0__Impl rule__PieceType__Group_8_2__1 )
            // InternalBoardGameDL.g:944:2: rule__PieceType__Group_8_2__0__Impl rule__PieceType__Group_8_2__1
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
    // InternalBoardGameDL.g:951:1: rule__PieceType__Group_8_2__0__Impl : ( ',' ) ;
    public final void rule__PieceType__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:955:1: ( ( ',' ) )
            // InternalBoardGameDL.g:956:1: ( ',' )
            {
            // InternalBoardGameDL.g:956:1: ( ',' )
            // InternalBoardGameDL.g:957:2: ','
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
    // InternalBoardGameDL.g:966:1: rule__PieceType__Group_8_2__1 : rule__PieceType__Group_8_2__1__Impl ;
    public final void rule__PieceType__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:970:1: ( rule__PieceType__Group_8_2__1__Impl )
            // InternalBoardGameDL.g:971:2: rule__PieceType__Group_8_2__1__Impl
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
    // InternalBoardGameDL.g:977:1: rule__PieceType__Group_8_2__1__Impl : ( ( rule__PieceType__EffectsOnCellAssignment_8_2_1 ) ) ;
    public final void rule__PieceType__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:981:1: ( ( ( rule__PieceType__EffectsOnCellAssignment_8_2_1 ) ) )
            // InternalBoardGameDL.g:982:1: ( ( rule__PieceType__EffectsOnCellAssignment_8_2_1 ) )
            {
            // InternalBoardGameDL.g:982:1: ( ( rule__PieceType__EffectsOnCellAssignment_8_2_1 ) )
            // InternalBoardGameDL.g:983:2: ( rule__PieceType__EffectsOnCellAssignment_8_2_1 )
            {
             before(grammarAccess.getPieceTypeAccess().getEffectsOnCellAssignment_8_2_1()); 
            // InternalBoardGameDL.g:984:2: ( rule__PieceType__EffectsOnCellAssignment_8_2_1 )
            // InternalBoardGameDL.g:984:3: rule__PieceType__EffectsOnCellAssignment_8_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PieceType__EffectsOnCellAssignment_8_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPieceTypeAccess().getEffectsOnCellAssignment_8_2_1()); 

            }


            }

        }
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
    // InternalBoardGameDL.g:993:1: rule__CellState__Group__0 : rule__CellState__Group__0__Impl rule__CellState__Group__1 ;
    public final void rule__CellState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:997:1: ( rule__CellState__Group__0__Impl rule__CellState__Group__1 )
            // InternalBoardGameDL.g:998:2: rule__CellState__Group__0__Impl rule__CellState__Group__1
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
    // InternalBoardGameDL.g:1005:1: rule__CellState__Group__0__Impl : ( 'Cellstate' ) ;
    public final void rule__CellState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1009:1: ( ( 'Cellstate' ) )
            // InternalBoardGameDL.g:1010:1: ( 'Cellstate' )
            {
            // InternalBoardGameDL.g:1010:1: ( 'Cellstate' )
            // InternalBoardGameDL.g:1011:2: 'Cellstate'
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
    // InternalBoardGameDL.g:1020:1: rule__CellState__Group__1 : rule__CellState__Group__1__Impl ;
    public final void rule__CellState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1024:1: ( rule__CellState__Group__1__Impl )
            // InternalBoardGameDL.g:1025:2: rule__CellState__Group__1__Impl
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
    // InternalBoardGameDL.g:1031:1: rule__CellState__Group__1__Impl : ( ( rule__CellState__NameAssignment_1 ) ) ;
    public final void rule__CellState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1035:1: ( ( ( rule__CellState__NameAssignment_1 ) ) )
            // InternalBoardGameDL.g:1036:1: ( ( rule__CellState__NameAssignment_1 ) )
            {
            // InternalBoardGameDL.g:1036:1: ( ( rule__CellState__NameAssignment_1 ) )
            // InternalBoardGameDL.g:1037:2: ( rule__CellState__NameAssignment_1 )
            {
             before(grammarAccess.getCellStateAccess().getNameAssignment_1()); 
            // InternalBoardGameDL.g:1038:2: ( rule__CellState__NameAssignment_1 )
            // InternalBoardGameDL.g:1038:3: rule__CellState__NameAssignment_1
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
    // InternalBoardGameDL.g:1047:1: rule__WinCondition__Group__0 : rule__WinCondition__Group__0__Impl rule__WinCondition__Group__1 ;
    public final void rule__WinCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1051:1: ( rule__WinCondition__Group__0__Impl rule__WinCondition__Group__1 )
            // InternalBoardGameDL.g:1052:2: rule__WinCondition__Group__0__Impl rule__WinCondition__Group__1
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
    // InternalBoardGameDL.g:1059:1: rule__WinCondition__Group__0__Impl : ( 'WinCondition' ) ;
    public final void rule__WinCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1063:1: ( ( 'WinCondition' ) )
            // InternalBoardGameDL.g:1064:1: ( 'WinCondition' )
            {
            // InternalBoardGameDL.g:1064:1: ( 'WinCondition' )
            // InternalBoardGameDL.g:1065:2: 'WinCondition'
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
    // InternalBoardGameDL.g:1074:1: rule__WinCondition__Group__1 : rule__WinCondition__Group__1__Impl rule__WinCondition__Group__2 ;
    public final void rule__WinCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1078:1: ( rule__WinCondition__Group__1__Impl rule__WinCondition__Group__2 )
            // InternalBoardGameDL.g:1079:2: rule__WinCondition__Group__1__Impl rule__WinCondition__Group__2
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
    // InternalBoardGameDL.g:1086:1: rule__WinCondition__Group__1__Impl : ( '{' ) ;
    public final void rule__WinCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1090:1: ( ( '{' ) )
            // InternalBoardGameDL.g:1091:1: ( '{' )
            {
            // InternalBoardGameDL.g:1091:1: ( '{' )
            // InternalBoardGameDL.g:1092:2: '{'
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
    // InternalBoardGameDL.g:1101:1: rule__WinCondition__Group__2 : rule__WinCondition__Group__2__Impl rule__WinCondition__Group__3 ;
    public final void rule__WinCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1105:1: ( rule__WinCondition__Group__2__Impl rule__WinCondition__Group__3 )
            // InternalBoardGameDL.g:1106:2: rule__WinCondition__Group__2__Impl rule__WinCondition__Group__3
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
    // InternalBoardGameDL.g:1113:1: rule__WinCondition__Group__2__Impl : ( ( rule__WinCondition__WinConditionElementsAssignment_2 ) ) ;
    public final void rule__WinCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1117:1: ( ( ( rule__WinCondition__WinConditionElementsAssignment_2 ) ) )
            // InternalBoardGameDL.g:1118:1: ( ( rule__WinCondition__WinConditionElementsAssignment_2 ) )
            {
            // InternalBoardGameDL.g:1118:1: ( ( rule__WinCondition__WinConditionElementsAssignment_2 ) )
            // InternalBoardGameDL.g:1119:2: ( rule__WinCondition__WinConditionElementsAssignment_2 )
            {
             before(grammarAccess.getWinConditionAccess().getWinConditionElementsAssignment_2()); 
            // InternalBoardGameDL.g:1120:2: ( rule__WinCondition__WinConditionElementsAssignment_2 )
            // InternalBoardGameDL.g:1120:3: rule__WinCondition__WinConditionElementsAssignment_2
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
    // InternalBoardGameDL.g:1128:1: rule__WinCondition__Group__3 : rule__WinCondition__Group__3__Impl rule__WinCondition__Group__4 ;
    public final void rule__WinCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1132:1: ( rule__WinCondition__Group__3__Impl rule__WinCondition__Group__4 )
            // InternalBoardGameDL.g:1133:2: rule__WinCondition__Group__3__Impl rule__WinCondition__Group__4
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
    // InternalBoardGameDL.g:1140:1: rule__WinCondition__Group__3__Impl : ( ( rule__WinCondition__WinConditionElementsAssignment_3 )* ) ;
    public final void rule__WinCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1144:1: ( ( ( rule__WinCondition__WinConditionElementsAssignment_3 )* ) )
            // InternalBoardGameDL.g:1145:1: ( ( rule__WinCondition__WinConditionElementsAssignment_3 )* )
            {
            // InternalBoardGameDL.g:1145:1: ( ( rule__WinCondition__WinConditionElementsAssignment_3 )* )
            // InternalBoardGameDL.g:1146:2: ( rule__WinCondition__WinConditionElementsAssignment_3 )*
            {
             before(grammarAccess.getWinConditionAccess().getWinConditionElementsAssignment_3()); 
            // InternalBoardGameDL.g:1147:2: ( rule__WinCondition__WinConditionElementsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==31) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBoardGameDL.g:1147:3: rule__WinCondition__WinConditionElementsAssignment_3
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
    // InternalBoardGameDL.g:1155:1: rule__WinCondition__Group__4 : rule__WinCondition__Group__4__Impl ;
    public final void rule__WinCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1159:1: ( rule__WinCondition__Group__4__Impl )
            // InternalBoardGameDL.g:1160:2: rule__WinCondition__Group__4__Impl
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
    // InternalBoardGameDL.g:1166:1: rule__WinCondition__Group__4__Impl : ( '}' ) ;
    public final void rule__WinCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1170:1: ( ( '}' ) )
            // InternalBoardGameDL.g:1171:1: ( '}' )
            {
            // InternalBoardGameDL.g:1171:1: ( '}' )
            // InternalBoardGameDL.g:1172:2: '}'
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
    // InternalBoardGameDL.g:1182:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1186:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalBoardGameDL.g:1187:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalBoardGameDL.g:1194:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1198:1: ( ( ( '-' )? ) )
            // InternalBoardGameDL.g:1199:1: ( ( '-' )? )
            {
            // InternalBoardGameDL.g:1199:1: ( ( '-' )? )
            // InternalBoardGameDL.g:1200:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalBoardGameDL.g:1201:2: ( '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBoardGameDL.g:1201:3: '-'
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
    // InternalBoardGameDL.g:1209:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1213:1: ( rule__EInt__Group__1__Impl )
            // InternalBoardGameDL.g:1214:2: rule__EInt__Group__1__Impl
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
    // InternalBoardGameDL.g:1220:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1224:1: ( ( RULE_INT ) )
            // InternalBoardGameDL.g:1225:1: ( RULE_INT )
            {
            // InternalBoardGameDL.g:1225:1: ( RULE_INT )
            // InternalBoardGameDL.g:1226:2: RULE_INT
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


    // $ANTLR start "rule__EffectOnCell__Group__0"
    // InternalBoardGameDL.g:1236:1: rule__EffectOnCell__Group__0 : rule__EffectOnCell__Group__0__Impl rule__EffectOnCell__Group__1 ;
    public final void rule__EffectOnCell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1240:1: ( rule__EffectOnCell__Group__0__Impl rule__EffectOnCell__Group__1 )
            // InternalBoardGameDL.g:1241:2: rule__EffectOnCell__Group__0__Impl rule__EffectOnCell__Group__1
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
    // InternalBoardGameDL.g:1248:1: rule__EffectOnCell__Group__0__Impl : ( 'EffectOnCell' ) ;
    public final void rule__EffectOnCell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1252:1: ( ( 'EffectOnCell' ) )
            // InternalBoardGameDL.g:1253:1: ( 'EffectOnCell' )
            {
            // InternalBoardGameDL.g:1253:1: ( 'EffectOnCell' )
            // InternalBoardGameDL.g:1254:2: 'EffectOnCell'
            {
             before(grammarAccess.getEffectOnCellAccess().getEffectOnCellKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1263:1: rule__EffectOnCell__Group__1 : rule__EffectOnCell__Group__1__Impl rule__EffectOnCell__Group__2 ;
    public final void rule__EffectOnCell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1267:1: ( rule__EffectOnCell__Group__1__Impl rule__EffectOnCell__Group__2 )
            // InternalBoardGameDL.g:1268:2: rule__EffectOnCell__Group__1__Impl rule__EffectOnCell__Group__2
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
    // InternalBoardGameDL.g:1275:1: rule__EffectOnCell__Group__1__Impl : ( ( rule__EffectOnCell__NameAssignment_1 ) ) ;
    public final void rule__EffectOnCell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1279:1: ( ( ( rule__EffectOnCell__NameAssignment_1 ) ) )
            // InternalBoardGameDL.g:1280:1: ( ( rule__EffectOnCell__NameAssignment_1 ) )
            {
            // InternalBoardGameDL.g:1280:1: ( ( rule__EffectOnCell__NameAssignment_1 ) )
            // InternalBoardGameDL.g:1281:2: ( rule__EffectOnCell__NameAssignment_1 )
            {
             before(grammarAccess.getEffectOnCellAccess().getNameAssignment_1()); 
            // InternalBoardGameDL.g:1282:2: ( rule__EffectOnCell__NameAssignment_1 )
            // InternalBoardGameDL.g:1282:3: rule__EffectOnCell__NameAssignment_1
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
    // InternalBoardGameDL.g:1290:1: rule__EffectOnCell__Group__2 : rule__EffectOnCell__Group__2__Impl rule__EffectOnCell__Group__3 ;
    public final void rule__EffectOnCell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1294:1: ( rule__EffectOnCell__Group__2__Impl rule__EffectOnCell__Group__3 )
            // InternalBoardGameDL.g:1295:2: rule__EffectOnCell__Group__2__Impl rule__EffectOnCell__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalBoardGameDL.g:1302:1: rule__EffectOnCell__Group__2__Impl : ( '{' ) ;
    public final void rule__EffectOnCell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1306:1: ( ( '{' ) )
            // InternalBoardGameDL.g:1307:1: ( '{' )
            {
            // InternalBoardGameDL.g:1307:1: ( '{' )
            // InternalBoardGameDL.g:1308:2: '{'
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
    // InternalBoardGameDL.g:1317:1: rule__EffectOnCell__Group__3 : rule__EffectOnCell__Group__3__Impl rule__EffectOnCell__Group__4 ;
    public final void rule__EffectOnCell__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1321:1: ( rule__EffectOnCell__Group__3__Impl rule__EffectOnCell__Group__4 )
            // InternalBoardGameDL.g:1322:2: rule__EffectOnCell__Group__3__Impl rule__EffectOnCell__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalBoardGameDL.g:1329:1: rule__EffectOnCell__Group__3__Impl : ( ( rule__EffectOnCell__UnorderedGroup_3 ) ) ;
    public final void rule__EffectOnCell__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1333:1: ( ( ( rule__EffectOnCell__UnorderedGroup_3 ) ) )
            // InternalBoardGameDL.g:1334:1: ( ( rule__EffectOnCell__UnorderedGroup_3 ) )
            {
            // InternalBoardGameDL.g:1334:1: ( ( rule__EffectOnCell__UnorderedGroup_3 ) )
            // InternalBoardGameDL.g:1335:2: ( rule__EffectOnCell__UnorderedGroup_3 )
            {
             before(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3()); 
            // InternalBoardGameDL.g:1336:2: ( rule__EffectOnCell__UnorderedGroup_3 )
            // InternalBoardGameDL.g:1336:3: rule__EffectOnCell__UnorderedGroup_3
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
    // InternalBoardGameDL.g:1344:1: rule__EffectOnCell__Group__4 : rule__EffectOnCell__Group__4__Impl ;
    public final void rule__EffectOnCell__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1348:1: ( rule__EffectOnCell__Group__4__Impl )
            // InternalBoardGameDL.g:1349:2: rule__EffectOnCell__Group__4__Impl
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
    // InternalBoardGameDL.g:1355:1: rule__EffectOnCell__Group__4__Impl : ( '}' ) ;
    public final void rule__EffectOnCell__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1359:1: ( ( '}' ) )
            // InternalBoardGameDL.g:1360:1: ( '}' )
            {
            // InternalBoardGameDL.g:1360:1: ( '}' )
            // InternalBoardGameDL.g:1361:2: '}'
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
    // InternalBoardGameDL.g:1371:1: rule__EffectOnCell__Group_3_0__0 : rule__EffectOnCell__Group_3_0__0__Impl rule__EffectOnCell__Group_3_0__1 ;
    public final void rule__EffectOnCell__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1375:1: ( rule__EffectOnCell__Group_3_0__0__Impl rule__EffectOnCell__Group_3_0__1 )
            // InternalBoardGameDL.g:1376:2: rule__EffectOnCell__Group_3_0__0__Impl rule__EffectOnCell__Group_3_0__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalBoardGameDL.g:1383:1: rule__EffectOnCell__Group_3_0__0__Impl : ( 'relativePosition' ) ;
    public final void rule__EffectOnCell__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1387:1: ( ( 'relativePosition' ) )
            // InternalBoardGameDL.g:1388:1: ( 'relativePosition' )
            {
            // InternalBoardGameDL.g:1388:1: ( 'relativePosition' )
            // InternalBoardGameDL.g:1389:2: 'relativePosition'
            {
             before(grammarAccess.getEffectOnCellAccess().getRelativePositionKeyword_3_0_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1398:1: rule__EffectOnCell__Group_3_0__1 : rule__EffectOnCell__Group_3_0__1__Impl rule__EffectOnCell__Group_3_0__2 ;
    public final void rule__EffectOnCell__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1402:1: ( rule__EffectOnCell__Group_3_0__1__Impl rule__EffectOnCell__Group_3_0__2 )
            // InternalBoardGameDL.g:1403:2: rule__EffectOnCell__Group_3_0__1__Impl rule__EffectOnCell__Group_3_0__2
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
    // InternalBoardGameDL.g:1410:1: rule__EffectOnCell__Group_3_0__1__Impl : ( '(' ) ;
    public final void rule__EffectOnCell__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1414:1: ( ( '(' ) )
            // InternalBoardGameDL.g:1415:1: ( '(' )
            {
            // InternalBoardGameDL.g:1415:1: ( '(' )
            // InternalBoardGameDL.g:1416:2: '('
            {
             before(grammarAccess.getEffectOnCellAccess().getLeftParenthesisKeyword_3_0_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1425:1: rule__EffectOnCell__Group_3_0__2 : rule__EffectOnCell__Group_3_0__2__Impl rule__EffectOnCell__Group_3_0__3 ;
    public final void rule__EffectOnCell__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1429:1: ( rule__EffectOnCell__Group_3_0__2__Impl rule__EffectOnCell__Group_3_0__3 )
            // InternalBoardGameDL.g:1430:2: rule__EffectOnCell__Group_3_0__2__Impl rule__EffectOnCell__Group_3_0__3
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
    // InternalBoardGameDL.g:1437:1: rule__EffectOnCell__Group_3_0__2__Impl : ( ( rule__EffectOnCell__XAssignment_3_0_2 ) ) ;
    public final void rule__EffectOnCell__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1441:1: ( ( ( rule__EffectOnCell__XAssignment_3_0_2 ) ) )
            // InternalBoardGameDL.g:1442:1: ( ( rule__EffectOnCell__XAssignment_3_0_2 ) )
            {
            // InternalBoardGameDL.g:1442:1: ( ( rule__EffectOnCell__XAssignment_3_0_2 ) )
            // InternalBoardGameDL.g:1443:2: ( rule__EffectOnCell__XAssignment_3_0_2 )
            {
             before(grammarAccess.getEffectOnCellAccess().getXAssignment_3_0_2()); 
            // InternalBoardGameDL.g:1444:2: ( rule__EffectOnCell__XAssignment_3_0_2 )
            // InternalBoardGameDL.g:1444:3: rule__EffectOnCell__XAssignment_3_0_2
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
    // InternalBoardGameDL.g:1452:1: rule__EffectOnCell__Group_3_0__3 : rule__EffectOnCell__Group_3_0__3__Impl rule__EffectOnCell__Group_3_0__4 ;
    public final void rule__EffectOnCell__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1456:1: ( rule__EffectOnCell__Group_3_0__3__Impl rule__EffectOnCell__Group_3_0__4 )
            // InternalBoardGameDL.g:1457:2: rule__EffectOnCell__Group_3_0__3__Impl rule__EffectOnCell__Group_3_0__4
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
    // InternalBoardGameDL.g:1464:1: rule__EffectOnCell__Group_3_0__3__Impl : ( ',' ) ;
    public final void rule__EffectOnCell__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1468:1: ( ( ',' ) )
            // InternalBoardGameDL.g:1469:1: ( ',' )
            {
            // InternalBoardGameDL.g:1469:1: ( ',' )
            // InternalBoardGameDL.g:1470:2: ','
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
    // InternalBoardGameDL.g:1479:1: rule__EffectOnCell__Group_3_0__4 : rule__EffectOnCell__Group_3_0__4__Impl rule__EffectOnCell__Group_3_0__5 ;
    public final void rule__EffectOnCell__Group_3_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1483:1: ( rule__EffectOnCell__Group_3_0__4__Impl rule__EffectOnCell__Group_3_0__5 )
            // InternalBoardGameDL.g:1484:2: rule__EffectOnCell__Group_3_0__4__Impl rule__EffectOnCell__Group_3_0__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalBoardGameDL.g:1491:1: rule__EffectOnCell__Group_3_0__4__Impl : ( ( rule__EffectOnCell__YAssignment_3_0_4 ) ) ;
    public final void rule__EffectOnCell__Group_3_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1495:1: ( ( ( rule__EffectOnCell__YAssignment_3_0_4 ) ) )
            // InternalBoardGameDL.g:1496:1: ( ( rule__EffectOnCell__YAssignment_3_0_4 ) )
            {
            // InternalBoardGameDL.g:1496:1: ( ( rule__EffectOnCell__YAssignment_3_0_4 ) )
            // InternalBoardGameDL.g:1497:2: ( rule__EffectOnCell__YAssignment_3_0_4 )
            {
             before(grammarAccess.getEffectOnCellAccess().getYAssignment_3_0_4()); 
            // InternalBoardGameDL.g:1498:2: ( rule__EffectOnCell__YAssignment_3_0_4 )
            // InternalBoardGameDL.g:1498:3: rule__EffectOnCell__YAssignment_3_0_4
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
    // InternalBoardGameDL.g:1506:1: rule__EffectOnCell__Group_3_0__5 : rule__EffectOnCell__Group_3_0__5__Impl ;
    public final void rule__EffectOnCell__Group_3_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1510:1: ( rule__EffectOnCell__Group_3_0__5__Impl )
            // InternalBoardGameDL.g:1511:2: rule__EffectOnCell__Group_3_0__5__Impl
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
    // InternalBoardGameDL.g:1517:1: rule__EffectOnCell__Group_3_0__5__Impl : ( ')' ) ;
    public final void rule__EffectOnCell__Group_3_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1521:1: ( ( ')' ) )
            // InternalBoardGameDL.g:1522:1: ( ')' )
            {
            // InternalBoardGameDL.g:1522:1: ( ')' )
            // InternalBoardGameDL.g:1523:2: ')'
            {
             before(grammarAccess.getEffectOnCellAccess().getRightParenthesisKeyword_3_0_5()); 
            match(input,29,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1533:1: rule__EffectOnCell__Group_3_1__0 : rule__EffectOnCell__Group_3_1__0__Impl rule__EffectOnCell__Group_3_1__1 ;
    public final void rule__EffectOnCell__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1537:1: ( rule__EffectOnCell__Group_3_1__0__Impl rule__EffectOnCell__Group_3_1__1 )
            // InternalBoardGameDL.g:1538:2: rule__EffectOnCell__Group_3_1__0__Impl rule__EffectOnCell__Group_3_1__1
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
    // InternalBoardGameDL.g:1545:1: rule__EffectOnCell__Group_3_1__0__Impl : ( 'newCellState' ) ;
    public final void rule__EffectOnCell__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1549:1: ( ( 'newCellState' ) )
            // InternalBoardGameDL.g:1550:1: ( 'newCellState' )
            {
            // InternalBoardGameDL.g:1550:1: ( 'newCellState' )
            // InternalBoardGameDL.g:1551:2: 'newCellState'
            {
             before(grammarAccess.getEffectOnCellAccess().getNewCellStateKeyword_3_1_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1560:1: rule__EffectOnCell__Group_3_1__1 : rule__EffectOnCell__Group_3_1__1__Impl ;
    public final void rule__EffectOnCell__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1564:1: ( rule__EffectOnCell__Group_3_1__1__Impl )
            // InternalBoardGameDL.g:1565:2: rule__EffectOnCell__Group_3_1__1__Impl
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
    // InternalBoardGameDL.g:1571:1: rule__EffectOnCell__Group_3_1__1__Impl : ( ( rule__EffectOnCell__CellStateAssignment_3_1_1 ) ) ;
    public final void rule__EffectOnCell__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1575:1: ( ( ( rule__EffectOnCell__CellStateAssignment_3_1_1 ) ) )
            // InternalBoardGameDL.g:1576:1: ( ( rule__EffectOnCell__CellStateAssignment_3_1_1 ) )
            {
            // InternalBoardGameDL.g:1576:1: ( ( rule__EffectOnCell__CellStateAssignment_3_1_1 ) )
            // InternalBoardGameDL.g:1577:2: ( rule__EffectOnCell__CellStateAssignment_3_1_1 )
            {
             before(grammarAccess.getEffectOnCellAccess().getCellStateAssignment_3_1_1()); 
            // InternalBoardGameDL.g:1578:2: ( rule__EffectOnCell__CellStateAssignment_3_1_1 )
            // InternalBoardGameDL.g:1578:3: rule__EffectOnCell__CellStateAssignment_3_1_1
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


    // $ANTLR start "rule__Line__Group__0"
    // InternalBoardGameDL.g:1587:1: rule__Line__Group__0 : rule__Line__Group__0__Impl rule__Line__Group__1 ;
    public final void rule__Line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1591:1: ( rule__Line__Group__0__Impl rule__Line__Group__1 )
            // InternalBoardGameDL.g:1592:2: rule__Line__Group__0__Impl rule__Line__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalBoardGameDL.g:1599:1: rule__Line__Group__0__Impl : ( 'Line' ) ;
    public final void rule__Line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1603:1: ( ( 'Line' ) )
            // InternalBoardGameDL.g:1604:1: ( 'Line' )
            {
            // InternalBoardGameDL.g:1604:1: ( 'Line' )
            // InternalBoardGameDL.g:1605:2: 'Line'
            {
             before(grammarAccess.getLineAccess().getLineKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1614:1: rule__Line__Group__1 : rule__Line__Group__1__Impl rule__Line__Group__2 ;
    public final void rule__Line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1618:1: ( rule__Line__Group__1__Impl rule__Line__Group__2 )
            // InternalBoardGameDL.g:1619:2: rule__Line__Group__1__Impl rule__Line__Group__2
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
    // InternalBoardGameDL.g:1626:1: rule__Line__Group__1__Impl : ( 'length' ) ;
    public final void rule__Line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1630:1: ( ( 'length' ) )
            // InternalBoardGameDL.g:1631:1: ( 'length' )
            {
            // InternalBoardGameDL.g:1631:1: ( 'length' )
            // InternalBoardGameDL.g:1632:2: 'length'
            {
             before(grammarAccess.getLineAccess().getLengthKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1641:1: rule__Line__Group__2 : rule__Line__Group__2__Impl rule__Line__Group__3 ;
    public final void rule__Line__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1645:1: ( rule__Line__Group__2__Impl rule__Line__Group__3 )
            // InternalBoardGameDL.g:1646:2: rule__Line__Group__2__Impl rule__Line__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalBoardGameDL.g:1653:1: rule__Line__Group__2__Impl : ( ( rule__Line__LengthAssignment_2 ) ) ;
    public final void rule__Line__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1657:1: ( ( ( rule__Line__LengthAssignment_2 ) ) )
            // InternalBoardGameDL.g:1658:1: ( ( rule__Line__LengthAssignment_2 ) )
            {
            // InternalBoardGameDL.g:1658:1: ( ( rule__Line__LengthAssignment_2 ) )
            // InternalBoardGameDL.g:1659:2: ( rule__Line__LengthAssignment_2 )
            {
             before(grammarAccess.getLineAccess().getLengthAssignment_2()); 
            // InternalBoardGameDL.g:1660:2: ( rule__Line__LengthAssignment_2 )
            // InternalBoardGameDL.g:1660:3: rule__Line__LengthAssignment_2
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
    // InternalBoardGameDL.g:1668:1: rule__Line__Group__3 : rule__Line__Group__3__Impl rule__Line__Group__4 ;
    public final void rule__Line__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1672:1: ( rule__Line__Group__3__Impl rule__Line__Group__4 )
            // InternalBoardGameDL.g:1673:2: rule__Line__Group__3__Impl rule__Line__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalBoardGameDL.g:1680:1: rule__Line__Group__3__Impl : ( 'direction' ) ;
    public final void rule__Line__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1684:1: ( ( 'direction' ) )
            // InternalBoardGameDL.g:1685:1: ( 'direction' )
            {
            // InternalBoardGameDL.g:1685:1: ( 'direction' )
            // InternalBoardGameDL.g:1686:2: 'direction'
            {
             before(grammarAccess.getLineAccess().getDirectionKeyword_3()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBoardGameDL.g:1695:1: rule__Line__Group__4 : rule__Line__Group__4__Impl ;
    public final void rule__Line__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1699:1: ( rule__Line__Group__4__Impl )
            // InternalBoardGameDL.g:1700:2: rule__Line__Group__4__Impl
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
    // InternalBoardGameDL.g:1706:1: rule__Line__Group__4__Impl : ( ( rule__Line__DirectionAssignment_4 ) ) ;
    public final void rule__Line__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1710:1: ( ( ( rule__Line__DirectionAssignment_4 ) ) )
            // InternalBoardGameDL.g:1711:1: ( ( rule__Line__DirectionAssignment_4 ) )
            {
            // InternalBoardGameDL.g:1711:1: ( ( rule__Line__DirectionAssignment_4 ) )
            // InternalBoardGameDL.g:1712:2: ( rule__Line__DirectionAssignment_4 )
            {
             before(grammarAccess.getLineAccess().getDirectionAssignment_4()); 
            // InternalBoardGameDL.g:1713:2: ( rule__Line__DirectionAssignment_4 )
            // InternalBoardGameDL.g:1713:3: rule__Line__DirectionAssignment_4
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
    // InternalBoardGameDL.g:1722:1: rule__EffectOnCell__UnorderedGroup_3 : rule__EffectOnCell__UnorderedGroup_3__0 {...}?;
    public final void rule__EffectOnCell__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3());
        	
        try {
            // InternalBoardGameDL.g:1727:1: ( rule__EffectOnCell__UnorderedGroup_3__0 {...}?)
            // InternalBoardGameDL.g:1728:2: rule__EffectOnCell__UnorderedGroup_3__0 {...}?
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
    // InternalBoardGameDL.g:1736:1: rule__EffectOnCell__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__EffectOnCell__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EffectOnCell__Group_3_1__0 ) ) ) ) ) ;
    public final void rule__EffectOnCell__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalBoardGameDL.g:1741:1: ( ( ({...}? => ( ( ( rule__EffectOnCell__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EffectOnCell__Group_3_1__0 ) ) ) ) ) )
            // InternalBoardGameDL.g:1742:3: ( ({...}? => ( ( ( rule__EffectOnCell__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EffectOnCell__Group_3_1__0 ) ) ) ) )
            {
            // InternalBoardGameDL.g:1742:3: ( ({...}? => ( ( ( rule__EffectOnCell__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EffectOnCell__Group_3_1__0 ) ) ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( LA10_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 0) ) {
                alt10=1;
            }
            else if ( LA10_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 1) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalBoardGameDL.g:1743:3: ({...}? => ( ( ( rule__EffectOnCell__Group_3_0__0 ) ) ) )
                    {
                    // InternalBoardGameDL.g:1743:3: ({...}? => ( ( ( rule__EffectOnCell__Group_3_0__0 ) ) ) )
                    // InternalBoardGameDL.g:1744:4: {...}? => ( ( ( rule__EffectOnCell__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__EffectOnCell__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalBoardGameDL.g:1744:108: ( ( ( rule__EffectOnCell__Group_3_0__0 ) ) )
                    // InternalBoardGameDL.g:1745:5: ( ( rule__EffectOnCell__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalBoardGameDL.g:1751:5: ( ( rule__EffectOnCell__Group_3_0__0 ) )
                    // InternalBoardGameDL.g:1752:6: ( rule__EffectOnCell__Group_3_0__0 )
                    {
                     before(grammarAccess.getEffectOnCellAccess().getGroup_3_0()); 
                    // InternalBoardGameDL.g:1753:6: ( rule__EffectOnCell__Group_3_0__0 )
                    // InternalBoardGameDL.g:1753:7: rule__EffectOnCell__Group_3_0__0
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
                    // InternalBoardGameDL.g:1758:3: ({...}? => ( ( ( rule__EffectOnCell__Group_3_1__0 ) ) ) )
                    {
                    // InternalBoardGameDL.g:1758:3: ({...}? => ( ( ( rule__EffectOnCell__Group_3_1__0 ) ) ) )
                    // InternalBoardGameDL.g:1759:4: {...}? => ( ( ( rule__EffectOnCell__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__EffectOnCell__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalBoardGameDL.g:1759:108: ( ( ( rule__EffectOnCell__Group_3_1__0 ) ) )
                    // InternalBoardGameDL.g:1760:5: ( ( rule__EffectOnCell__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalBoardGameDL.g:1766:5: ( ( rule__EffectOnCell__Group_3_1__0 ) )
                    // InternalBoardGameDL.g:1767:6: ( rule__EffectOnCell__Group_3_1__0 )
                    {
                     before(grammarAccess.getEffectOnCellAccess().getGroup_3_1()); 
                    // InternalBoardGameDL.g:1768:6: ( rule__EffectOnCell__Group_3_1__0 )
                    // InternalBoardGameDL.g:1768:7: rule__EffectOnCell__Group_3_1__0
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
    // InternalBoardGameDL.g:1781:1: rule__EffectOnCell__UnorderedGroup_3__0 : rule__EffectOnCell__UnorderedGroup_3__Impl ( rule__EffectOnCell__UnorderedGroup_3__1 )? ;
    public final void rule__EffectOnCell__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1785:1: ( rule__EffectOnCell__UnorderedGroup_3__Impl ( rule__EffectOnCell__UnorderedGroup_3__1 )? )
            // InternalBoardGameDL.g:1786:2: rule__EffectOnCell__UnorderedGroup_3__Impl ( rule__EffectOnCell__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_25);
            rule__EffectOnCell__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalBoardGameDL.g:1787:2: ( rule__EffectOnCell__UnorderedGroup_3__1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( LA11_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 0) ) {
                alt11=1;
            }
            else if ( LA11_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getEffectOnCellAccess().getUnorderedGroup_3(), 1) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBoardGameDL.g:1787:2: rule__EffectOnCell__UnorderedGroup_3__1
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
    // InternalBoardGameDL.g:1793:1: rule__EffectOnCell__UnorderedGroup_3__1 : rule__EffectOnCell__UnorderedGroup_3__Impl ;
    public final void rule__EffectOnCell__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1797:1: ( rule__EffectOnCell__UnorderedGroup_3__Impl )
            // InternalBoardGameDL.g:1798:2: rule__EffectOnCell__UnorderedGroup_3__Impl
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
    // InternalBoardGameDL.g:1805:1: rule__BoardGame__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__BoardGame__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1809:1: ( ( ruleEString ) )
            // InternalBoardGameDL.g:1810:2: ( ruleEString )
            {
            // InternalBoardGameDL.g:1810:2: ( ruleEString )
            // InternalBoardGameDL.g:1811:3: ruleEString
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
    // InternalBoardGameDL.g:1820:1: rule__BoardGame__SizeAssignment_3 : ( ruleEInt ) ;
    public final void rule__BoardGame__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1824:1: ( ( ruleEInt ) )
            // InternalBoardGameDL.g:1825:2: ( ruleEInt )
            {
            // InternalBoardGameDL.g:1825:2: ( ruleEInt )
            // InternalBoardGameDL.g:1826:3: ruleEInt
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
    // InternalBoardGameDL.g:1835:1: rule__BoardGame__BoardGameElementsAssignment_4 : ( ruleBoardGameElement ) ;
    public final void rule__BoardGame__BoardGameElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1839:1: ( ( ruleBoardGameElement ) )
            // InternalBoardGameDL.g:1840:2: ( ruleBoardGameElement )
            {
            // InternalBoardGameDL.g:1840:2: ( ruleBoardGameElement )
            // InternalBoardGameDL.g:1841:3: ruleBoardGameElement
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
    // InternalBoardGameDL.g:1850:1: rule__PieceType__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__PieceType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1854:1: ( ( ruleEString ) )
            // InternalBoardGameDL.g:1855:2: ( ruleEString )
            {
            // InternalBoardGameDL.g:1855:2: ( ruleEString )
            // InternalBoardGameDL.g:1856:3: ruleEString
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
    // InternalBoardGameDL.g:1865:1: rule__PieceType__SymbolAssignment_4 : ( ruleEString ) ;
    public final void rule__PieceType__SymbolAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1869:1: ( ( ruleEString ) )
            // InternalBoardGameDL.g:1870:2: ( ruleEString )
            {
            // InternalBoardGameDL.g:1870:2: ( ruleEString )
            // InternalBoardGameDL.g:1871:3: ruleEString
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


    // $ANTLR start "rule__PieceType__DisallowedStatesAssignment_6"
    // InternalBoardGameDL.g:1880:1: rule__PieceType__DisallowedStatesAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__PieceType__DisallowedStatesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1884:1: ( ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:1885:2: ( ( ruleEString ) )
            {
            // InternalBoardGameDL.g:1885:2: ( ( ruleEString ) )
            // InternalBoardGameDL.g:1886:3: ( ruleEString )
            {
             before(grammarAccess.getPieceTypeAccess().getDisallowedStatesCellStateCrossReference_6_0()); 
            // InternalBoardGameDL.g:1887:3: ( ruleEString )
            // InternalBoardGameDL.g:1888:4: ruleEString
            {
             before(grammarAccess.getPieceTypeAccess().getDisallowedStatesCellStateEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPieceTypeAccess().getDisallowedStatesCellStateEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getPieceTypeAccess().getDisallowedStatesCellStateCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__DisallowedStatesAssignment_6"


    // $ANTLR start "rule__PieceType__DisallowedStatesAssignment_7_1"
    // InternalBoardGameDL.g:1899:1: rule__PieceType__DisallowedStatesAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__PieceType__DisallowedStatesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1903:1: ( ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:1904:2: ( ( ruleEString ) )
            {
            // InternalBoardGameDL.g:1904:2: ( ( ruleEString ) )
            // InternalBoardGameDL.g:1905:3: ( ruleEString )
            {
             before(grammarAccess.getPieceTypeAccess().getDisallowedStatesCellStateCrossReference_7_1_0()); 
            // InternalBoardGameDL.g:1906:3: ( ruleEString )
            // InternalBoardGameDL.g:1907:4: ruleEString
            {
             before(grammarAccess.getPieceTypeAccess().getDisallowedStatesCellStateEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPieceTypeAccess().getDisallowedStatesCellStateEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getPieceTypeAccess().getDisallowedStatesCellStateCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__DisallowedStatesAssignment_7_1"


    // $ANTLR start "rule__PieceType__EffectsOnCellAssignment_8_1"
    // InternalBoardGameDL.g:1918:1: rule__PieceType__EffectsOnCellAssignment_8_1 : ( ( ruleEString ) ) ;
    public final void rule__PieceType__EffectsOnCellAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1922:1: ( ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:1923:2: ( ( ruleEString ) )
            {
            // InternalBoardGameDL.g:1923:2: ( ( ruleEString ) )
            // InternalBoardGameDL.g:1924:3: ( ruleEString )
            {
             before(grammarAccess.getPieceTypeAccess().getEffectsOnCellEffectOnCellCrossReference_8_1_0()); 
            // InternalBoardGameDL.g:1925:3: ( ruleEString )
            // InternalBoardGameDL.g:1926:4: ruleEString
            {
             before(grammarAccess.getPieceTypeAccess().getEffectsOnCellEffectOnCellEStringParserRuleCall_8_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPieceTypeAccess().getEffectsOnCellEffectOnCellEStringParserRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getPieceTypeAccess().getEffectsOnCellEffectOnCellCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__EffectsOnCellAssignment_8_1"


    // $ANTLR start "rule__PieceType__EffectsOnCellAssignment_8_2_1"
    // InternalBoardGameDL.g:1937:1: rule__PieceType__EffectsOnCellAssignment_8_2_1 : ( ( ruleEString ) ) ;
    public final void rule__PieceType__EffectsOnCellAssignment_8_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1941:1: ( ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:1942:2: ( ( ruleEString ) )
            {
            // InternalBoardGameDL.g:1942:2: ( ( ruleEString ) )
            // InternalBoardGameDL.g:1943:3: ( ruleEString )
            {
             before(grammarAccess.getPieceTypeAccess().getEffectsOnCellEffectOnCellCrossReference_8_2_1_0()); 
            // InternalBoardGameDL.g:1944:3: ( ruleEString )
            // InternalBoardGameDL.g:1945:4: ruleEString
            {
             before(grammarAccess.getPieceTypeAccess().getEffectsOnCellEffectOnCellEStringParserRuleCall_8_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPieceTypeAccess().getEffectsOnCellEffectOnCellEStringParserRuleCall_8_2_1_0_1()); 

            }

             after(grammarAccess.getPieceTypeAccess().getEffectsOnCellEffectOnCellCrossReference_8_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieceType__EffectsOnCellAssignment_8_2_1"


    // $ANTLR start "rule__CellState__NameAssignment_1"
    // InternalBoardGameDL.g:1956:1: rule__CellState__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CellState__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1960:1: ( ( ruleEString ) )
            // InternalBoardGameDL.g:1961:2: ( ruleEString )
            {
            // InternalBoardGameDL.g:1961:2: ( ruleEString )
            // InternalBoardGameDL.g:1962:3: ruleEString
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
    // InternalBoardGameDL.g:1971:1: rule__WinCondition__WinConditionElementsAssignment_2 : ( ruleWinConditionElement ) ;
    public final void rule__WinCondition__WinConditionElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1975:1: ( ( ruleWinConditionElement ) )
            // InternalBoardGameDL.g:1976:2: ( ruleWinConditionElement )
            {
            // InternalBoardGameDL.g:1976:2: ( ruleWinConditionElement )
            // InternalBoardGameDL.g:1977:3: ruleWinConditionElement
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
    // InternalBoardGameDL.g:1986:1: rule__WinCondition__WinConditionElementsAssignment_3 : ( ruleWinConditionElement ) ;
    public final void rule__WinCondition__WinConditionElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:1990:1: ( ( ruleWinConditionElement ) )
            // InternalBoardGameDL.g:1991:2: ( ruleWinConditionElement )
            {
            // InternalBoardGameDL.g:1991:2: ( ruleWinConditionElement )
            // InternalBoardGameDL.g:1992:3: ruleWinConditionElement
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


    // $ANTLR start "rule__EffectOnCell__NameAssignment_1"
    // InternalBoardGameDL.g:2001:1: rule__EffectOnCell__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EffectOnCell__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2005:1: ( ( RULE_ID ) )
            // InternalBoardGameDL.g:2006:2: ( RULE_ID )
            {
            // InternalBoardGameDL.g:2006:2: ( RULE_ID )
            // InternalBoardGameDL.g:2007:3: RULE_ID
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
    // InternalBoardGameDL.g:2016:1: rule__EffectOnCell__XAssignment_3_0_2 : ( ruleEInt ) ;
    public final void rule__EffectOnCell__XAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2020:1: ( ( ruleEInt ) )
            // InternalBoardGameDL.g:2021:2: ( ruleEInt )
            {
            // InternalBoardGameDL.g:2021:2: ( ruleEInt )
            // InternalBoardGameDL.g:2022:3: ruleEInt
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
    // InternalBoardGameDL.g:2031:1: rule__EffectOnCell__YAssignment_3_0_4 : ( ruleEInt ) ;
    public final void rule__EffectOnCell__YAssignment_3_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2035:1: ( ( ruleEInt ) )
            // InternalBoardGameDL.g:2036:2: ( ruleEInt )
            {
            // InternalBoardGameDL.g:2036:2: ( ruleEInt )
            // InternalBoardGameDL.g:2037:3: ruleEInt
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
    // InternalBoardGameDL.g:2046:1: rule__EffectOnCell__CellStateAssignment_3_1_1 : ( ( ruleEString ) ) ;
    public final void rule__EffectOnCell__CellStateAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2050:1: ( ( ( ruleEString ) ) )
            // InternalBoardGameDL.g:2051:2: ( ( ruleEString ) )
            {
            // InternalBoardGameDL.g:2051:2: ( ( ruleEString ) )
            // InternalBoardGameDL.g:2052:3: ( ruleEString )
            {
             before(grammarAccess.getEffectOnCellAccess().getCellStateCellStateCrossReference_3_1_1_0()); 
            // InternalBoardGameDL.g:2053:3: ( ruleEString )
            // InternalBoardGameDL.g:2054:4: ruleEString
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


    // $ANTLR start "rule__Line__LengthAssignment_2"
    // InternalBoardGameDL.g:2065:1: rule__Line__LengthAssignment_2 : ( ruleEInt ) ;
    public final void rule__Line__LengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2069:1: ( ( ruleEInt ) )
            // InternalBoardGameDL.g:2070:2: ( ruleEInt )
            {
            // InternalBoardGameDL.g:2070:2: ( ruleEInt )
            // InternalBoardGameDL.g:2071:3: ruleEInt
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
    // InternalBoardGameDL.g:2080:1: rule__Line__DirectionAssignment_4 : ( ruleDirection ) ;
    public final void rule__Line__DirectionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardGameDL.g:2084:1: ( ( ruleDirection ) )
            // InternalBoardGameDL.g:2085:2: ( ruleDirection )
            {
            // InternalBoardGameDL.g:2085:2: ( ruleDirection )
            // InternalBoardGameDL.g:2086:3: ruleDirection
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000005810000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000005810002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000048000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000048000002L});

}
