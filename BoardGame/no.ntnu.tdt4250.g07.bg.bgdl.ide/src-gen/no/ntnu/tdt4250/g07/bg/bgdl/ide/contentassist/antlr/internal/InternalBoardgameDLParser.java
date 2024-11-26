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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Rules'", "'{'", "'board'", "'}'", "','", "'Board'", "'Name'", "'Width'", "'Height'", "'cell'", "'('", "')'", "'playerbrickset'", "'validmove'", "'boardstate'", "'PlayerBrickSet'", "'win'", "'brick'", "'draw'", "'-'", "'ValidMove'", "'brickchange'", "'cellchange'", "'Brick'", "'bricktype'", "'startCell'", "'LineElement'", "'Position'", "'celltype'", "'cellstate'", "'brickstate'"
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



    // $ANTLR start "entryRuleRules"
    // InternalBoardgameDL.g:53:1: entryRuleRules : ruleRules EOF ;
    public final void entryRuleRules() throws RecognitionException {
        try {
            // InternalBoardgameDL.g:54:1: ( ruleRules EOF )
            // InternalBoardgameDL.g:55:1: ruleRules EOF
            {
             before(grammarAccess.getRulesRule()); 
            pushFollow(FOLLOW_1);
            ruleRules();

            state._fsp--;

             after(grammarAccess.getRulesRule()); 
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
    // $ANTLR end "entryRuleRules"


    // $ANTLR start "ruleRules"
    // InternalBoardgameDL.g:62:1: ruleRules : ( ( rule__Rules__Group__0 ) ) ;
    public final void ruleRules() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:66:2: ( ( ( rule__Rules__Group__0 ) ) )
            // InternalBoardgameDL.g:67:2: ( ( rule__Rules__Group__0 ) )
            {
            // InternalBoardgameDL.g:67:2: ( ( rule__Rules__Group__0 ) )
            // InternalBoardgameDL.g:68:3: ( rule__Rules__Group__0 )
            {
             before(grammarAccess.getRulesAccess().getGroup()); 
            // InternalBoardgameDL.g:69:3: ( rule__Rules__Group__0 )
            // InternalBoardgameDL.g:69:4: rule__Rules__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rules__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRulesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRules"


    // $ANTLR start "entryRuleBoard"
    // InternalBoardgameDL.g:78:1: entryRuleBoard : ruleBoard EOF ;
    public final void entryRuleBoard() throws RecognitionException {
        try {
            // InternalBoardgameDL.g:79:1: ( ruleBoard EOF )
            // InternalBoardgameDL.g:80:1: ruleBoard EOF
            {
             before(grammarAccess.getBoardRule()); 
            pushFollow(FOLLOW_1);
            ruleBoard();

            state._fsp--;

             after(grammarAccess.getBoardRule()); 
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
    // $ANTLR end "entryRuleBoard"


    // $ANTLR start "ruleBoard"
    // InternalBoardgameDL.g:87:1: ruleBoard : ( ( rule__Board__Group__0 ) ) ;
    public final void ruleBoard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:91:2: ( ( ( rule__Board__Group__0 ) ) )
            // InternalBoardgameDL.g:92:2: ( ( rule__Board__Group__0 ) )
            {
            // InternalBoardgameDL.g:92:2: ( ( rule__Board__Group__0 ) )
            // InternalBoardgameDL.g:93:3: ( rule__Board__Group__0 )
            {
             before(grammarAccess.getBoardAccess().getGroup()); 
            // InternalBoardgameDL.g:94:3: ( rule__Board__Group__0 )
            // InternalBoardgameDL.g:94:4: rule__Board__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Board__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoard"


    // $ANTLR start "entryRuleEString"
    // InternalBoardgameDL.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalBoardgameDL.g:104:1: ( ruleEString EOF )
            // InternalBoardgameDL.g:105:1: ruleEString EOF
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
    // InternalBoardgameDL.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalBoardgameDL.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalBoardgameDL.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalBoardgameDL.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalBoardgameDL.g:119:3: ( rule__EString__Alternatives )
            // InternalBoardgameDL.g:119:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRulePlayerBrickSet"
    // InternalBoardgameDL.g:128:1: entryRulePlayerBrickSet : rulePlayerBrickSet EOF ;
    public final void entryRulePlayerBrickSet() throws RecognitionException {
        try {
            // InternalBoardgameDL.g:129:1: ( rulePlayerBrickSet EOF )
            // InternalBoardgameDL.g:130:1: rulePlayerBrickSet EOF
            {
             before(grammarAccess.getPlayerBrickSetRule()); 
            pushFollow(FOLLOW_1);
            rulePlayerBrickSet();

            state._fsp--;

             after(grammarAccess.getPlayerBrickSetRule()); 
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
    // $ANTLR end "entryRulePlayerBrickSet"


    // $ANTLR start "rulePlayerBrickSet"
    // InternalBoardgameDL.g:137:1: rulePlayerBrickSet : ( ( rule__PlayerBrickSet__Group__0 ) ) ;
    public final void rulePlayerBrickSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:141:2: ( ( ( rule__PlayerBrickSet__Group__0 ) ) )
            // InternalBoardgameDL.g:142:2: ( ( rule__PlayerBrickSet__Group__0 ) )
            {
            // InternalBoardgameDL.g:142:2: ( ( rule__PlayerBrickSet__Group__0 ) )
            // InternalBoardgameDL.g:143:3: ( rule__PlayerBrickSet__Group__0 )
            {
             before(grammarAccess.getPlayerBrickSetAccess().getGroup()); 
            // InternalBoardgameDL.g:144:3: ( rule__PlayerBrickSet__Group__0 )
            // InternalBoardgameDL.g:144:4: rule__PlayerBrickSet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlayerBrickSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlayerBrickSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlayerBrickSet"


    // $ANTLR start "entryRuleEInt"
    // InternalBoardgameDL.g:153:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalBoardgameDL.g:154:1: ( ruleEInt EOF )
            // InternalBoardgameDL.g:155:1: ruleEInt EOF
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
    // InternalBoardgameDL.g:162:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:166:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalBoardgameDL.g:167:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalBoardgameDL.g:167:2: ( ( rule__EInt__Group__0 ) )
            // InternalBoardgameDL.g:168:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalBoardgameDL.g:169:3: ( rule__EInt__Group__0 )
            // InternalBoardgameDL.g:169:4: rule__EInt__Group__0
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


    // $ANTLR start "entryRuleBrick"
    // InternalBoardgameDL.g:203:1: entryRuleBrick : ruleBrick EOF ;
    public final void entryRuleBrick() throws RecognitionException {
        try {
            // InternalBoardgameDL.g:204:1: ( ruleBrick EOF )
            // InternalBoardgameDL.g:205:1: ruleBrick EOF
            {
             before(grammarAccess.getBrickRule()); 
            pushFollow(FOLLOW_1);
            ruleBrick();

            state._fsp--;

             after(grammarAccess.getBrickRule()); 
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
    // $ANTLR end "entryRuleBrick"


    // $ANTLR start "ruleBrick"
    // InternalBoardgameDL.g:212:1: ruleBrick : ( ( rule__Brick__Group__0 ) ) ;
    public final void ruleBrick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:216:2: ( ( ( rule__Brick__Group__0 ) ) )
            // InternalBoardgameDL.g:217:2: ( ( rule__Brick__Group__0 ) )
            {
            // InternalBoardgameDL.g:217:2: ( ( rule__Brick__Group__0 ) )
            // InternalBoardgameDL.g:218:3: ( rule__Brick__Group__0 )
            {
             before(grammarAccess.getBrickAccess().getGroup()); 
            // InternalBoardgameDL.g:219:3: ( rule__Brick__Group__0 )
            // InternalBoardgameDL.g:219:4: rule__Brick__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Brick__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBrickAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBrick"


    // $ANTLR start "entryRuleLineElement"
    // InternalBoardgameDL.g:228:1: entryRuleLineElement : ruleLineElement EOF ;
    public final void entryRuleLineElement() throws RecognitionException {
        try {
            // InternalBoardgameDL.g:229:1: ( ruleLineElement EOF )
            // InternalBoardgameDL.g:230:1: ruleLineElement EOF
            {
             before(grammarAccess.getLineElementRule()); 
            pushFollow(FOLLOW_1);
            ruleLineElement();

            state._fsp--;

             after(grammarAccess.getLineElementRule()); 
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
    // $ANTLR end "entryRuleLineElement"


    // $ANTLR start "ruleLineElement"
    // InternalBoardgameDL.g:237:1: ruleLineElement : ( ( rule__LineElement__Group__0 ) ) ;
    public final void ruleLineElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:241:2: ( ( ( rule__LineElement__Group__0 ) ) )
            // InternalBoardgameDL.g:242:2: ( ( rule__LineElement__Group__0 ) )
            {
            // InternalBoardgameDL.g:242:2: ( ( rule__LineElement__Group__0 ) )
            // InternalBoardgameDL.g:243:3: ( rule__LineElement__Group__0 )
            {
             before(grammarAccess.getLineElementAccess().getGroup()); 
            // InternalBoardgameDL.g:244:3: ( rule__LineElement__Group__0 )
            // InternalBoardgameDL.g:244:4: rule__LineElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LineElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLineElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLineElement"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalBoardgameDL.g:252:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:256:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalBoardgameDL.g:257:2: ( RULE_STRING )
                    {
                    // InternalBoardgameDL.g:257:2: ( RULE_STRING )
                    // InternalBoardgameDL.g:258:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBoardgameDL.g:263:2: ( RULE_ID )
                    {
                    // InternalBoardgameDL.g:263:2: ( RULE_ID )
                    // InternalBoardgameDL.g:264:3: RULE_ID
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


    // $ANTLR start "rule__Rules__Group__0"
    // InternalBoardgameDL.g:273:1: rule__Rules__Group__0 : rule__Rules__Group__0__Impl rule__Rules__Group__1 ;
    public final void rule__Rules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:277:1: ( rule__Rules__Group__0__Impl rule__Rules__Group__1 )
            // InternalBoardgameDL.g:278:2: rule__Rules__Group__0__Impl rule__Rules__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Rules__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rules__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__0"


    // $ANTLR start "rule__Rules__Group__0__Impl"
    // InternalBoardgameDL.g:285:1: rule__Rules__Group__0__Impl : ( 'Rules' ) ;
    public final void rule__Rules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:289:1: ( ( 'Rules' ) )
            // InternalBoardgameDL.g:290:1: ( 'Rules' )
            {
            // InternalBoardgameDL.g:290:1: ( 'Rules' )
            // InternalBoardgameDL.g:291:2: 'Rules'
            {
             before(grammarAccess.getRulesAccess().getRulesKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getRulesAccess().getRulesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__0__Impl"


    // $ANTLR start "rule__Rules__Group__1"
    // InternalBoardgameDL.g:300:1: rule__Rules__Group__1 : rule__Rules__Group__1__Impl rule__Rules__Group__2 ;
    public final void rule__Rules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:304:1: ( rule__Rules__Group__1__Impl rule__Rules__Group__2 )
            // InternalBoardgameDL.g:305:2: rule__Rules__Group__1__Impl rule__Rules__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Rules__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rules__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__1"


    // $ANTLR start "rule__Rules__Group__1__Impl"
    // InternalBoardgameDL.g:312:1: rule__Rules__Group__1__Impl : ( '{' ) ;
    public final void rule__Rules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:316:1: ( ( '{' ) )
            // InternalBoardgameDL.g:317:1: ( '{' )
            {
            // InternalBoardgameDL.g:317:1: ( '{' )
            // InternalBoardgameDL.g:318:2: '{'
            {
             before(grammarAccess.getRulesAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRulesAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__1__Impl"


    // $ANTLR start "rule__Rules__Group__2"
    // InternalBoardgameDL.g:327:1: rule__Rules__Group__2 : rule__Rules__Group__2__Impl rule__Rules__Group__3 ;
    public final void rule__Rules__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:331:1: ( rule__Rules__Group__2__Impl rule__Rules__Group__3 )
            // InternalBoardgameDL.g:332:2: rule__Rules__Group__2__Impl rule__Rules__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Rules__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rules__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__2"


    // $ANTLR start "rule__Rules__Group__2__Impl"
    // InternalBoardgameDL.g:339:1: rule__Rules__Group__2__Impl : ( 'board' ) ;
    public final void rule__Rules__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:343:1: ( ( 'board' ) )
            // InternalBoardgameDL.g:344:1: ( 'board' )
            {
            // InternalBoardgameDL.g:344:1: ( 'board' )
            // InternalBoardgameDL.g:345:2: 'board'
            {
             before(grammarAccess.getRulesAccess().getBoardKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRulesAccess().getBoardKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__2__Impl"


    // $ANTLR start "rule__Rules__Group__3"
    // InternalBoardgameDL.g:354:1: rule__Rules__Group__3 : rule__Rules__Group__3__Impl rule__Rules__Group__4 ;
    public final void rule__Rules__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:358:1: ( rule__Rules__Group__3__Impl rule__Rules__Group__4 )
            // InternalBoardgameDL.g:359:2: rule__Rules__Group__3__Impl rule__Rules__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Rules__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rules__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__3"


    // $ANTLR start "rule__Rules__Group__3__Impl"
    // InternalBoardgameDL.g:366:1: rule__Rules__Group__3__Impl : ( '{' ) ;
    public final void rule__Rules__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:370:1: ( ( '{' ) )
            // InternalBoardgameDL.g:371:1: ( '{' )
            {
            // InternalBoardgameDL.g:371:1: ( '{' )
            // InternalBoardgameDL.g:372:2: '{'
            {
             before(grammarAccess.getRulesAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRulesAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__3__Impl"


    // $ANTLR start "rule__Rules__Group__4"
    // InternalBoardgameDL.g:381:1: rule__Rules__Group__4 : rule__Rules__Group__4__Impl rule__Rules__Group__5 ;
    public final void rule__Rules__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:385:1: ( rule__Rules__Group__4__Impl rule__Rules__Group__5 )
            // InternalBoardgameDL.g:386:2: rule__Rules__Group__4__Impl rule__Rules__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Rules__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rules__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__4"


    // $ANTLR start "rule__Rules__Group__4__Impl"
    // InternalBoardgameDL.g:393:1: rule__Rules__Group__4__Impl : ( ( rule__Rules__BoardAssignment_4 ) ) ;
    public final void rule__Rules__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:397:1: ( ( ( rule__Rules__BoardAssignment_4 ) ) )
            // InternalBoardgameDL.g:398:1: ( ( rule__Rules__BoardAssignment_4 ) )
            {
            // InternalBoardgameDL.g:398:1: ( ( rule__Rules__BoardAssignment_4 ) )
            // InternalBoardgameDL.g:399:2: ( rule__Rules__BoardAssignment_4 )
            {
             before(grammarAccess.getRulesAccess().getBoardAssignment_4()); 
            // InternalBoardgameDL.g:400:2: ( rule__Rules__BoardAssignment_4 )
            // InternalBoardgameDL.g:400:3: rule__Rules__BoardAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Rules__BoardAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRulesAccess().getBoardAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__4__Impl"


    // $ANTLR start "rule__Rules__Group__5"
    // InternalBoardgameDL.g:408:1: rule__Rules__Group__5 : rule__Rules__Group__5__Impl rule__Rules__Group__6 ;
    public final void rule__Rules__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:412:1: ( rule__Rules__Group__5__Impl rule__Rules__Group__6 )
            // InternalBoardgameDL.g:413:2: rule__Rules__Group__5__Impl rule__Rules__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Rules__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rules__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__5"


    // $ANTLR start "rule__Rules__Group__5__Impl"
    // InternalBoardgameDL.g:420:1: rule__Rules__Group__5__Impl : ( ( rule__Rules__Group_5__0 )* ) ;
    public final void rule__Rules__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:424:1: ( ( ( rule__Rules__Group_5__0 )* ) )
            // InternalBoardgameDL.g:425:1: ( ( rule__Rules__Group_5__0 )* )
            {
            // InternalBoardgameDL.g:425:1: ( ( rule__Rules__Group_5__0 )* )
            // InternalBoardgameDL.g:426:2: ( rule__Rules__Group_5__0 )*
            {
             before(grammarAccess.getRulesAccess().getGroup_5()); 
            // InternalBoardgameDL.g:427:2: ( rule__Rules__Group_5__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBoardgameDL.g:427:3: rule__Rules__Group_5__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Rules__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getRulesAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__5__Impl"


    // $ANTLR start "rule__Rules__Group__6"
    // InternalBoardgameDL.g:435:1: rule__Rules__Group__6 : rule__Rules__Group__6__Impl rule__Rules__Group__7 ;
    public final void rule__Rules__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:439:1: ( rule__Rules__Group__6__Impl rule__Rules__Group__7 )
            // InternalBoardgameDL.g:440:2: rule__Rules__Group__6__Impl rule__Rules__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Rules__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rules__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__6"


    // $ANTLR start "rule__Rules__Group__6__Impl"
    // InternalBoardgameDL.g:447:1: rule__Rules__Group__6__Impl : ( '}' ) ;
    public final void rule__Rules__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:451:1: ( ( '}' ) )
            // InternalBoardgameDL.g:452:1: ( '}' )
            {
            // InternalBoardgameDL.g:452:1: ( '}' )
            // InternalBoardgameDL.g:453:2: '}'
            {
             before(grammarAccess.getRulesAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRulesAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__6__Impl"


    // $ANTLR start "rule__Rules__Group__7"
    // InternalBoardgameDL.g:462:1: rule__Rules__Group__7 : rule__Rules__Group__7__Impl ;
    public final void rule__Rules__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:466:1: ( rule__Rules__Group__7__Impl )
            // InternalBoardgameDL.g:467:2: rule__Rules__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rules__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__7"


    // $ANTLR start "rule__Rules__Group__7__Impl"
    // InternalBoardgameDL.g:473:1: rule__Rules__Group__7__Impl : ( '}' ) ;
    public final void rule__Rules__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:477:1: ( ( '}' ) )
            // InternalBoardgameDL.g:478:1: ( '}' )
            {
            // InternalBoardgameDL.g:478:1: ( '}' )
            // InternalBoardgameDL.g:479:2: '}'
            {
             before(grammarAccess.getRulesAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRulesAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__7__Impl"


    // $ANTLR start "rule__Rules__Group_5__0"
    // InternalBoardgameDL.g:489:1: rule__Rules__Group_5__0 : rule__Rules__Group_5__0__Impl rule__Rules__Group_5__1 ;
    public final void rule__Rules__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:493:1: ( rule__Rules__Group_5__0__Impl rule__Rules__Group_5__1 )
            // InternalBoardgameDL.g:494:2: rule__Rules__Group_5__0__Impl rule__Rules__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Rules__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rules__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group_5__0"


    // $ANTLR start "rule__Rules__Group_5__0__Impl"
    // InternalBoardgameDL.g:501:1: rule__Rules__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Rules__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:505:1: ( ( ',' ) )
            // InternalBoardgameDL.g:506:1: ( ',' )
            {
            // InternalBoardgameDL.g:506:1: ( ',' )
            // InternalBoardgameDL.g:507:2: ','
            {
             before(grammarAccess.getRulesAccess().getCommaKeyword_5_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRulesAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group_5__0__Impl"


    // $ANTLR start "rule__Rules__Group_5__1"
    // InternalBoardgameDL.g:516:1: rule__Rules__Group_5__1 : rule__Rules__Group_5__1__Impl ;
    public final void rule__Rules__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:520:1: ( rule__Rules__Group_5__1__Impl )
            // InternalBoardgameDL.g:521:2: rule__Rules__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rules__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group_5__1"


    // $ANTLR start "rule__Rules__Group_5__1__Impl"
    // InternalBoardgameDL.g:527:1: rule__Rules__Group_5__1__Impl : ( ( rule__Rules__BoardAssignment_5_1 ) ) ;
    public final void rule__Rules__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:531:1: ( ( ( rule__Rules__BoardAssignment_5_1 ) ) )
            // InternalBoardgameDL.g:532:1: ( ( rule__Rules__BoardAssignment_5_1 ) )
            {
            // InternalBoardgameDL.g:532:1: ( ( rule__Rules__BoardAssignment_5_1 ) )
            // InternalBoardgameDL.g:533:2: ( rule__Rules__BoardAssignment_5_1 )
            {
             before(grammarAccess.getRulesAccess().getBoardAssignment_5_1()); 
            // InternalBoardgameDL.g:534:2: ( rule__Rules__BoardAssignment_5_1 )
            // InternalBoardgameDL.g:534:3: rule__Rules__BoardAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Rules__BoardAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRulesAccess().getBoardAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group_5__1__Impl"


    // $ANTLR start "rule__Board__Group__0"
    // InternalBoardgameDL.g:543:1: rule__Board__Group__0 : rule__Board__Group__0__Impl rule__Board__Group__1 ;
    public final void rule__Board__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:547:1: ( rule__Board__Group__0__Impl rule__Board__Group__1 )
            // InternalBoardgameDL.g:548:2: rule__Board__Group__0__Impl rule__Board__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Board__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__0"


    // $ANTLR start "rule__Board__Group__0__Impl"
    // InternalBoardgameDL.g:555:1: rule__Board__Group__0__Impl : ( 'Board' ) ;
    public final void rule__Board__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:559:1: ( ( 'Board' ) )
            // InternalBoardgameDL.g:560:1: ( 'Board' )
            {
            // InternalBoardgameDL.g:560:1: ( 'Board' )
            // InternalBoardgameDL.g:561:2: 'Board'
            {
             before(grammarAccess.getBoardAccess().getBoardKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getBoardKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__0__Impl"


    // $ANTLR start "rule__Board__Group__1"
    // InternalBoardgameDL.g:570:1: rule__Board__Group__1 : rule__Board__Group__1__Impl rule__Board__Group__2 ;
    public final void rule__Board__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:574:1: ( rule__Board__Group__1__Impl rule__Board__Group__2 )
            // InternalBoardgameDL.g:575:2: rule__Board__Group__1__Impl rule__Board__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Board__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__1"


    // $ANTLR start "rule__Board__Group__1__Impl"
    // InternalBoardgameDL.g:582:1: rule__Board__Group__1__Impl : ( '{' ) ;
    public final void rule__Board__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:586:1: ( ( '{' ) )
            // InternalBoardgameDL.g:587:1: ( '{' )
            {
            // InternalBoardgameDL.g:587:1: ( '{' )
            // InternalBoardgameDL.g:588:2: '{'
            {
             before(grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__1__Impl"


    // $ANTLR start "rule__Board__Group__2"
    // InternalBoardgameDL.g:597:1: rule__Board__Group__2 : rule__Board__Group__2__Impl rule__Board__Group__3 ;
    public final void rule__Board__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:601:1: ( rule__Board__Group__2__Impl rule__Board__Group__3 )
            // InternalBoardgameDL.g:602:2: rule__Board__Group__2__Impl rule__Board__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Board__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__2"


    // $ANTLR start "rule__Board__Group__2__Impl"
    // InternalBoardgameDL.g:609:1: rule__Board__Group__2__Impl : ( 'Name' ) ;
    public final void rule__Board__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:613:1: ( ( 'Name' ) )
            // InternalBoardgameDL.g:614:1: ( 'Name' )
            {
            // InternalBoardgameDL.g:614:1: ( 'Name' )
            // InternalBoardgameDL.g:615:2: 'Name'
            {
             before(grammarAccess.getBoardAccess().getNameKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__2__Impl"


    // $ANTLR start "rule__Board__Group__3"
    // InternalBoardgameDL.g:624:1: rule__Board__Group__3 : rule__Board__Group__3__Impl rule__Board__Group__4 ;
    public final void rule__Board__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:628:1: ( rule__Board__Group__3__Impl rule__Board__Group__4 )
            // InternalBoardgameDL.g:629:2: rule__Board__Group__3__Impl rule__Board__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Board__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__3"


    // $ANTLR start "rule__Board__Group__3__Impl"
    // InternalBoardgameDL.g:636:1: rule__Board__Group__3__Impl : ( ( rule__Board__NameAssignment_3 ) ) ;
    public final void rule__Board__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:640:1: ( ( ( rule__Board__NameAssignment_3 ) ) )
            // InternalBoardgameDL.g:641:1: ( ( rule__Board__NameAssignment_3 ) )
            {
            // InternalBoardgameDL.g:641:1: ( ( rule__Board__NameAssignment_3 ) )
            // InternalBoardgameDL.g:642:2: ( rule__Board__NameAssignment_3 )
            {
             before(grammarAccess.getBoardAccess().getNameAssignment_3()); 
            // InternalBoardgameDL.g:643:2: ( rule__Board__NameAssignment_3 )
            // InternalBoardgameDL.g:643:3: rule__Board__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Board__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__3__Impl"


    // $ANTLR start "rule__Board__Group__4"
    // InternalBoardgameDL.g:651:1: rule__Board__Group__4 : rule__Board__Group__4__Impl rule__Board__Group__5 ;
    public final void rule__Board__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:655:1: ( rule__Board__Group__4__Impl rule__Board__Group__5 )
            // InternalBoardgameDL.g:656:2: rule__Board__Group__4__Impl rule__Board__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Board__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__4"


    // $ANTLR start "rule__Board__Group__4__Impl"
    // InternalBoardgameDL.g:663:1: rule__Board__Group__4__Impl : ( 'Width' ) ;
    public final void rule__Board__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:667:1: ( ( 'Width' ) )
            // InternalBoardgameDL.g:668:1: ( 'Width' )
            {
            // InternalBoardgameDL.g:668:1: ( 'Width' )
            // InternalBoardgameDL.g:669:2: 'Width'
            {
             before(grammarAccess.getBoardAccess().getWidthKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getWidthKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__4__Impl"


    // $ANTLR start "rule__Board__Group__5"
    // InternalBoardgameDL.g:678:1: rule__Board__Group__5 : rule__Board__Group__5__Impl rule__Board__Group__6 ;
    public final void rule__Board__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:682:1: ( rule__Board__Group__5__Impl rule__Board__Group__6 )
            // InternalBoardgameDL.g:683:2: rule__Board__Group__5__Impl rule__Board__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Board__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__5"


    // $ANTLR start "rule__Board__Group__5__Impl"
    // InternalBoardgameDL.g:690:1: rule__Board__Group__5__Impl : ( ( rule__Board__WidthAssignment_5 ) ) ;
    public final void rule__Board__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:694:1: ( ( ( rule__Board__WidthAssignment_5 ) ) )
            // InternalBoardgameDL.g:695:1: ( ( rule__Board__WidthAssignment_5 ) )
            {
            // InternalBoardgameDL.g:695:1: ( ( rule__Board__WidthAssignment_5 ) )
            // InternalBoardgameDL.g:696:2: ( rule__Board__WidthAssignment_5 )
            {
             before(grammarAccess.getBoardAccess().getWidthAssignment_5()); 
            // InternalBoardgameDL.g:697:2: ( rule__Board__WidthAssignment_5 )
            // InternalBoardgameDL.g:697:3: rule__Board__WidthAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Board__WidthAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getWidthAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__5__Impl"


    // $ANTLR start "rule__Board__Group__6"
    // InternalBoardgameDL.g:705:1: rule__Board__Group__6 : rule__Board__Group__6__Impl rule__Board__Group__7 ;
    public final void rule__Board__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:709:1: ( rule__Board__Group__6__Impl rule__Board__Group__7 )
            // InternalBoardgameDL.g:710:2: rule__Board__Group__6__Impl rule__Board__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Board__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__6"


    // $ANTLR start "rule__Board__Group__6__Impl"
    // InternalBoardgameDL.g:717:1: rule__Board__Group__6__Impl : ( 'Height' ) ;
    public final void rule__Board__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:721:1: ( ( 'Height' ) )
            // InternalBoardgameDL.g:722:1: ( 'Height' )
            {
            // InternalBoardgameDL.g:722:1: ( 'Height' )
            // InternalBoardgameDL.g:723:2: 'Height'
            {
             before(grammarAccess.getBoardAccess().getHeightKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getHeightKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__6__Impl"


    // $ANTLR start "rule__Board__Group__7"
    // InternalBoardgameDL.g:732:1: rule__Board__Group__7 : rule__Board__Group__7__Impl rule__Board__Group__8 ;
    public final void rule__Board__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:736:1: ( rule__Board__Group__7__Impl rule__Board__Group__8 )
            // InternalBoardgameDL.g:737:2: rule__Board__Group__7__Impl rule__Board__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__Board__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__7"


    // $ANTLR start "rule__Board__Group__7__Impl"
    // InternalBoardgameDL.g:744:1: rule__Board__Group__7__Impl : ( ( rule__Board__HeightAssignment_7 ) ) ;
    public final void rule__Board__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:748:1: ( ( ( rule__Board__HeightAssignment_7 ) ) )
            // InternalBoardgameDL.g:749:1: ( ( rule__Board__HeightAssignment_7 ) )
            {
            // InternalBoardgameDL.g:749:1: ( ( rule__Board__HeightAssignment_7 ) )
            // InternalBoardgameDL.g:750:2: ( rule__Board__HeightAssignment_7 )
            {
             before(grammarAccess.getBoardAccess().getHeightAssignment_7()); 
            // InternalBoardgameDL.g:751:2: ( rule__Board__HeightAssignment_7 )
            // InternalBoardgameDL.g:751:3: rule__Board__HeightAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Board__HeightAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getHeightAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__7__Impl"


    // $ANTLR start "rule__Board__Group__8"
    // InternalBoardgameDL.g:759:1: rule__Board__Group__8 : rule__Board__Group__8__Impl rule__Board__Group__9 ;
    public final void rule__Board__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:763:1: ( rule__Board__Group__8__Impl rule__Board__Group__9 )
            // InternalBoardgameDL.g:764:2: rule__Board__Group__8__Impl rule__Board__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__Board__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__8"


    // $ANTLR start "rule__Board__Group__8__Impl"
    // InternalBoardgameDL.g:771:1: rule__Board__Group__8__Impl : ( 'cell' ) ;
    public final void rule__Board__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:775:1: ( ( 'cell' ) )
            // InternalBoardgameDL.g:776:1: ( 'cell' )
            {
            // InternalBoardgameDL.g:776:1: ( 'cell' )
            // InternalBoardgameDL.g:777:2: 'cell'
            {
             before(grammarAccess.getBoardAccess().getCellKeyword_8()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getCellKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__8__Impl"


    // $ANTLR start "rule__Board__Group__9"
    // InternalBoardgameDL.g:786:1: rule__Board__Group__9 : rule__Board__Group__9__Impl rule__Board__Group__10 ;
    public final void rule__Board__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:790:1: ( rule__Board__Group__9__Impl rule__Board__Group__10 )
            // InternalBoardgameDL.g:791:2: rule__Board__Group__9__Impl rule__Board__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__Board__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__9"


    // $ANTLR start "rule__Board__Group__9__Impl"
    // InternalBoardgameDL.g:798:1: rule__Board__Group__9__Impl : ( '(' ) ;
    public final void rule__Board__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:802:1: ( ( '(' ) )
            // InternalBoardgameDL.g:803:1: ( '(' )
            {
            // InternalBoardgameDL.g:803:1: ( '(' )
            // InternalBoardgameDL.g:804:2: '('
            {
             before(grammarAccess.getBoardAccess().getLeftParenthesisKeyword_9()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getLeftParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__9__Impl"


    // $ANTLR start "rule__Board__Group__10"
    // InternalBoardgameDL.g:813:1: rule__Board__Group__10 : rule__Board__Group__10__Impl rule__Board__Group__11 ;
    public final void rule__Board__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:817:1: ( rule__Board__Group__10__Impl rule__Board__Group__11 )
            // InternalBoardgameDL.g:818:2: rule__Board__Group__10__Impl rule__Board__Group__11
            {
            pushFollow(FOLLOW_16);
            rule__Board__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__10"


    // $ANTLR start "rule__Board__Group__10__Impl"
    // InternalBoardgameDL.g:825:1: rule__Board__Group__10__Impl : ( ( rule__Board__CellAssignment_10 ) ) ;
    public final void rule__Board__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:829:1: ( ( ( rule__Board__CellAssignment_10 ) ) )
            // InternalBoardgameDL.g:830:1: ( ( rule__Board__CellAssignment_10 ) )
            {
            // InternalBoardgameDL.g:830:1: ( ( rule__Board__CellAssignment_10 ) )
            // InternalBoardgameDL.g:831:2: ( rule__Board__CellAssignment_10 )
            {
             before(grammarAccess.getBoardAccess().getCellAssignment_10()); 
            // InternalBoardgameDL.g:832:2: ( rule__Board__CellAssignment_10 )
            // InternalBoardgameDL.g:832:3: rule__Board__CellAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Board__CellAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getCellAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__10__Impl"


    // $ANTLR start "rule__Board__Group__11"
    // InternalBoardgameDL.g:840:1: rule__Board__Group__11 : rule__Board__Group__11__Impl rule__Board__Group__12 ;
    public final void rule__Board__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:844:1: ( rule__Board__Group__11__Impl rule__Board__Group__12 )
            // InternalBoardgameDL.g:845:2: rule__Board__Group__11__Impl rule__Board__Group__12
            {
            pushFollow(FOLLOW_16);
            rule__Board__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__11"


    // $ANTLR start "rule__Board__Group__11__Impl"
    // InternalBoardgameDL.g:852:1: rule__Board__Group__11__Impl : ( ( rule__Board__Group_11__0 )* ) ;
    public final void rule__Board__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:856:1: ( ( ( rule__Board__Group_11__0 )* ) )
            // InternalBoardgameDL.g:857:1: ( ( rule__Board__Group_11__0 )* )
            {
            // InternalBoardgameDL.g:857:1: ( ( rule__Board__Group_11__0 )* )
            // InternalBoardgameDL.g:858:2: ( rule__Board__Group_11__0 )*
            {
             before(grammarAccess.getBoardAccess().getGroup_11()); 
            // InternalBoardgameDL.g:859:2: ( rule__Board__Group_11__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBoardgameDL.g:859:3: rule__Board__Group_11__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Board__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getBoardAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__11__Impl"


    // $ANTLR start "rule__Board__Group__12"
    // InternalBoardgameDL.g:867:1: rule__Board__Group__12 : rule__Board__Group__12__Impl rule__Board__Group__13 ;
    public final void rule__Board__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:871:1: ( rule__Board__Group__12__Impl rule__Board__Group__13 )
            // InternalBoardgameDL.g:872:2: rule__Board__Group__12__Impl rule__Board__Group__13
            {
            pushFollow(FOLLOW_17);
            rule__Board__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__12"


    // $ANTLR start "rule__Board__Group__12__Impl"
    // InternalBoardgameDL.g:879:1: rule__Board__Group__12__Impl : ( ')' ) ;
    public final void rule__Board__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:883:1: ( ( ')' ) )
            // InternalBoardgameDL.g:884:1: ( ')' )
            {
            // InternalBoardgameDL.g:884:1: ( ')' )
            // InternalBoardgameDL.g:885:2: ')'
            {
             before(grammarAccess.getBoardAccess().getRightParenthesisKeyword_12()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getRightParenthesisKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__12__Impl"


    // $ANTLR start "rule__Board__Group__13"
    // InternalBoardgameDL.g:894:1: rule__Board__Group__13 : rule__Board__Group__13__Impl rule__Board__Group__14 ;
    public final void rule__Board__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:898:1: ( rule__Board__Group__13__Impl rule__Board__Group__14 )
            // InternalBoardgameDL.g:899:2: rule__Board__Group__13__Impl rule__Board__Group__14
            {
            pushFollow(FOLLOW_17);
            rule__Board__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__13"


    // $ANTLR start "rule__Board__Group__13__Impl"
    // InternalBoardgameDL.g:906:1: rule__Board__Group__13__Impl : ( ( rule__Board__Group_13__0 )? ) ;
    public final void rule__Board__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:910:1: ( ( ( rule__Board__Group_13__0 )? ) )
            // InternalBoardgameDL.g:911:1: ( ( rule__Board__Group_13__0 )? )
            {
            // InternalBoardgameDL.g:911:1: ( ( rule__Board__Group_13__0 )? )
            // InternalBoardgameDL.g:912:2: ( rule__Board__Group_13__0 )?
            {
             before(grammarAccess.getBoardAccess().getGroup_13()); 
            // InternalBoardgameDL.g:913:2: ( rule__Board__Group_13__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBoardgameDL.g:913:3: rule__Board__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Board__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoardAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__13__Impl"


    // $ANTLR start "rule__Board__Group__14"
    // InternalBoardgameDL.g:921:1: rule__Board__Group__14 : rule__Board__Group__14__Impl rule__Board__Group__15 ;
    public final void rule__Board__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:925:1: ( rule__Board__Group__14__Impl rule__Board__Group__15 )
            // InternalBoardgameDL.g:926:2: rule__Board__Group__14__Impl rule__Board__Group__15
            {
            pushFollow(FOLLOW_3);
            rule__Board__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__14"


    // $ANTLR start "rule__Board__Group__14__Impl"
    // InternalBoardgameDL.g:933:1: rule__Board__Group__14__Impl : ( 'playerbrickset' ) ;
    public final void rule__Board__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:937:1: ( ( 'playerbrickset' ) )
            // InternalBoardgameDL.g:938:1: ( 'playerbrickset' )
            {
            // InternalBoardgameDL.g:938:1: ( 'playerbrickset' )
            // InternalBoardgameDL.g:939:2: 'playerbrickset'
            {
             before(grammarAccess.getBoardAccess().getPlayerbricksetKeyword_14()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getPlayerbricksetKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__14__Impl"


    // $ANTLR start "rule__Board__Group__15"
    // InternalBoardgameDL.g:948:1: rule__Board__Group__15 : rule__Board__Group__15__Impl rule__Board__Group__16 ;
    public final void rule__Board__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:952:1: ( rule__Board__Group__15__Impl rule__Board__Group__16 )
            // InternalBoardgameDL.g:953:2: rule__Board__Group__15__Impl rule__Board__Group__16
            {
            pushFollow(FOLLOW_18);
            rule__Board__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__15"


    // $ANTLR start "rule__Board__Group__15__Impl"
    // InternalBoardgameDL.g:960:1: rule__Board__Group__15__Impl : ( '{' ) ;
    public final void rule__Board__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:964:1: ( ( '{' ) )
            // InternalBoardgameDL.g:965:1: ( '{' )
            {
            // InternalBoardgameDL.g:965:1: ( '{' )
            // InternalBoardgameDL.g:966:2: '{'
            {
             before(grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_15()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__15__Impl"


    // $ANTLR start "rule__Board__Group__16"
    // InternalBoardgameDL.g:975:1: rule__Board__Group__16 : rule__Board__Group__16__Impl rule__Board__Group__17 ;
    public final void rule__Board__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:979:1: ( rule__Board__Group__16__Impl rule__Board__Group__17 )
            // InternalBoardgameDL.g:980:2: rule__Board__Group__16__Impl rule__Board__Group__17
            {
            pushFollow(FOLLOW_6);
            rule__Board__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__16"


    // $ANTLR start "rule__Board__Group__16__Impl"
    // InternalBoardgameDL.g:987:1: rule__Board__Group__16__Impl : ( ( rule__Board__PlayerbricksetAssignment_16 ) ) ;
    public final void rule__Board__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:991:1: ( ( ( rule__Board__PlayerbricksetAssignment_16 ) ) )
            // InternalBoardgameDL.g:992:1: ( ( rule__Board__PlayerbricksetAssignment_16 ) )
            {
            // InternalBoardgameDL.g:992:1: ( ( rule__Board__PlayerbricksetAssignment_16 ) )
            // InternalBoardgameDL.g:993:2: ( rule__Board__PlayerbricksetAssignment_16 )
            {
             before(grammarAccess.getBoardAccess().getPlayerbricksetAssignment_16()); 
            // InternalBoardgameDL.g:994:2: ( rule__Board__PlayerbricksetAssignment_16 )
            // InternalBoardgameDL.g:994:3: rule__Board__PlayerbricksetAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__Board__PlayerbricksetAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getPlayerbricksetAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__16__Impl"


    // $ANTLR start "rule__Board__Group__17"
    // InternalBoardgameDL.g:1002:1: rule__Board__Group__17 : rule__Board__Group__17__Impl rule__Board__Group__18 ;
    public final void rule__Board__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1006:1: ( rule__Board__Group__17__Impl rule__Board__Group__18 )
            // InternalBoardgameDL.g:1007:2: rule__Board__Group__17__Impl rule__Board__Group__18
            {
            pushFollow(FOLLOW_6);
            rule__Board__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__17"


    // $ANTLR start "rule__Board__Group__17__Impl"
    // InternalBoardgameDL.g:1014:1: rule__Board__Group__17__Impl : ( ( rule__Board__Group_17__0 )* ) ;
    public final void rule__Board__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1018:1: ( ( ( rule__Board__Group_17__0 )* ) )
            // InternalBoardgameDL.g:1019:1: ( ( rule__Board__Group_17__0 )* )
            {
            // InternalBoardgameDL.g:1019:1: ( ( rule__Board__Group_17__0 )* )
            // InternalBoardgameDL.g:1020:2: ( rule__Board__Group_17__0 )*
            {
             before(grammarAccess.getBoardAccess().getGroup_17()); 
            // InternalBoardgameDL.g:1021:2: ( rule__Board__Group_17__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBoardgameDL.g:1021:3: rule__Board__Group_17__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Board__Group_17__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getBoardAccess().getGroup_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__17__Impl"


    // $ANTLR start "rule__Board__Group__18"
    // InternalBoardgameDL.g:1029:1: rule__Board__Group__18 : rule__Board__Group__18__Impl rule__Board__Group__19 ;
    public final void rule__Board__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1033:1: ( rule__Board__Group__18__Impl rule__Board__Group__19 )
            // InternalBoardgameDL.g:1034:2: rule__Board__Group__18__Impl rule__Board__Group__19
            {
            pushFollow(FOLLOW_19);
            rule__Board__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__18"


    // $ANTLR start "rule__Board__Group__18__Impl"
    // InternalBoardgameDL.g:1041:1: rule__Board__Group__18__Impl : ( '}' ) ;
    public final void rule__Board__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1045:1: ( ( '}' ) )
            // InternalBoardgameDL.g:1046:1: ( '}' )
            {
            // InternalBoardgameDL.g:1046:1: ( '}' )
            // InternalBoardgameDL.g:1047:2: '}'
            {
             before(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_18()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__18__Impl"


    // $ANTLR start "rule__Board__Group__19"
    // InternalBoardgameDL.g:1056:1: rule__Board__Group__19 : rule__Board__Group__19__Impl rule__Board__Group__20 ;
    public final void rule__Board__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1060:1: ( rule__Board__Group__19__Impl rule__Board__Group__20 )
            // InternalBoardgameDL.g:1061:2: rule__Board__Group__19__Impl rule__Board__Group__20
            {
            pushFollow(FOLLOW_3);
            rule__Board__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__19"


    // $ANTLR start "rule__Board__Group__19__Impl"
    // InternalBoardgameDL.g:1068:1: rule__Board__Group__19__Impl : ( 'validmove' ) ;
    public final void rule__Board__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1072:1: ( ( 'validmove' ) )
            // InternalBoardgameDL.g:1073:1: ( 'validmove' )
            {
            // InternalBoardgameDL.g:1073:1: ( 'validmove' )
            // InternalBoardgameDL.g:1074:2: 'validmove'
            {
             before(grammarAccess.getBoardAccess().getValidmoveKeyword_19()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getValidmoveKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__19__Impl"


    // $ANTLR start "rule__Board__Group__20"
    // InternalBoardgameDL.g:1083:1: rule__Board__Group__20 : rule__Board__Group__20__Impl rule__Board__Group__21 ;
    public final void rule__Board__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1087:1: ( rule__Board__Group__20__Impl rule__Board__Group__21 )
            // InternalBoardgameDL.g:1088:2: rule__Board__Group__20__Impl rule__Board__Group__21
            {
            pushFollow(FOLLOW_20);
            rule__Board__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__20"


    // $ANTLR start "rule__Board__Group__20__Impl"
    // InternalBoardgameDL.g:1095:1: rule__Board__Group__20__Impl : ( '{' ) ;
    public final void rule__Board__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1099:1: ( ( '{' ) )
            // InternalBoardgameDL.g:1100:1: ( '{' )
            {
            // InternalBoardgameDL.g:1100:1: ( '{' )
            // InternalBoardgameDL.g:1101:2: '{'
            {
             before(grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_20()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__20__Impl"


    // $ANTLR start "rule__Board__Group__21"
    // InternalBoardgameDL.g:1110:1: rule__Board__Group__21 : rule__Board__Group__21__Impl rule__Board__Group__22 ;
    public final void rule__Board__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1114:1: ( rule__Board__Group__21__Impl rule__Board__Group__22 )
            // InternalBoardgameDL.g:1115:2: rule__Board__Group__21__Impl rule__Board__Group__22
            {
            pushFollow(FOLLOW_6);
            rule__Board__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__21"


    // $ANTLR start "rule__Board__Group__21__Impl"
    // InternalBoardgameDL.g:1122:1: rule__Board__Group__21__Impl : ( ( rule__Board__ValidmoveAssignment_21 ) ) ;
    public final void rule__Board__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1126:1: ( ( ( rule__Board__ValidmoveAssignment_21 ) ) )
            // InternalBoardgameDL.g:1127:1: ( ( rule__Board__ValidmoveAssignment_21 ) )
            {
            // InternalBoardgameDL.g:1127:1: ( ( rule__Board__ValidmoveAssignment_21 ) )
            // InternalBoardgameDL.g:1128:2: ( rule__Board__ValidmoveAssignment_21 )
            {
             before(grammarAccess.getBoardAccess().getValidmoveAssignment_21()); 
            // InternalBoardgameDL.g:1129:2: ( rule__Board__ValidmoveAssignment_21 )
            // InternalBoardgameDL.g:1129:3: rule__Board__ValidmoveAssignment_21
            {
            pushFollow(FOLLOW_2);
            rule__Board__ValidmoveAssignment_21();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getValidmoveAssignment_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__21__Impl"


    // $ANTLR start "rule__Board__Group__22"
    // InternalBoardgameDL.g:1137:1: rule__Board__Group__22 : rule__Board__Group__22__Impl rule__Board__Group__23 ;
    public final void rule__Board__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1141:1: ( rule__Board__Group__22__Impl rule__Board__Group__23 )
            // InternalBoardgameDL.g:1142:2: rule__Board__Group__22__Impl rule__Board__Group__23
            {
            pushFollow(FOLLOW_6);
            rule__Board__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__22"


    // $ANTLR start "rule__Board__Group__22__Impl"
    // InternalBoardgameDL.g:1149:1: rule__Board__Group__22__Impl : ( ( rule__Board__Group_22__0 )* ) ;
    public final void rule__Board__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1153:1: ( ( ( rule__Board__Group_22__0 )* ) )
            // InternalBoardgameDL.g:1154:1: ( ( rule__Board__Group_22__0 )* )
            {
            // InternalBoardgameDL.g:1154:1: ( ( rule__Board__Group_22__0 )* )
            // InternalBoardgameDL.g:1155:2: ( rule__Board__Group_22__0 )*
            {
             before(grammarAccess.getBoardAccess().getGroup_22()); 
            // InternalBoardgameDL.g:1156:2: ( rule__Board__Group_22__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBoardgameDL.g:1156:3: rule__Board__Group_22__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Board__Group_22__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getBoardAccess().getGroup_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__22__Impl"


    // $ANTLR start "rule__Board__Group__23"
    // InternalBoardgameDL.g:1164:1: rule__Board__Group__23 : rule__Board__Group__23__Impl rule__Board__Group__24 ;
    public final void rule__Board__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1168:1: ( rule__Board__Group__23__Impl rule__Board__Group__24 )
            // InternalBoardgameDL.g:1169:2: rule__Board__Group__23__Impl rule__Board__Group__24
            {
            pushFollow(FOLLOW_8);
            rule__Board__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__23"


    // $ANTLR start "rule__Board__Group__23__Impl"
    // InternalBoardgameDL.g:1176:1: rule__Board__Group__23__Impl : ( '}' ) ;
    public final void rule__Board__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1180:1: ( ( '}' ) )
            // InternalBoardgameDL.g:1181:1: ( '}' )
            {
            // InternalBoardgameDL.g:1181:1: ( '}' )
            // InternalBoardgameDL.g:1182:2: '}'
            {
             before(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_23()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__23__Impl"


    // $ANTLR start "rule__Board__Group__24"
    // InternalBoardgameDL.g:1191:1: rule__Board__Group__24 : rule__Board__Group__24__Impl ;
    public final void rule__Board__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1195:1: ( rule__Board__Group__24__Impl )
            // InternalBoardgameDL.g:1196:2: rule__Board__Group__24__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Board__Group__24__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__24"


    // $ANTLR start "rule__Board__Group__24__Impl"
    // InternalBoardgameDL.g:1202:1: rule__Board__Group__24__Impl : ( '}' ) ;
    public final void rule__Board__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1206:1: ( ( '}' ) )
            // InternalBoardgameDL.g:1207:1: ( '}' )
            {
            // InternalBoardgameDL.g:1207:1: ( '}' )
            // InternalBoardgameDL.g:1208:2: '}'
            {
             before(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_24()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__24__Impl"


    // $ANTLR start "rule__Board__Group_11__0"
    // InternalBoardgameDL.g:1218:1: rule__Board__Group_11__0 : rule__Board__Group_11__0__Impl rule__Board__Group_11__1 ;
    public final void rule__Board__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1222:1: ( rule__Board__Group_11__0__Impl rule__Board__Group_11__1 )
            // InternalBoardgameDL.g:1223:2: rule__Board__Group_11__0__Impl rule__Board__Group_11__1
            {
            pushFollow(FOLLOW_10);
            rule__Board__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_11__0"


    // $ANTLR start "rule__Board__Group_11__0__Impl"
    // InternalBoardgameDL.g:1230:1: rule__Board__Group_11__0__Impl : ( ',' ) ;
    public final void rule__Board__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1234:1: ( ( ',' ) )
            // InternalBoardgameDL.g:1235:1: ( ',' )
            {
            // InternalBoardgameDL.g:1235:1: ( ',' )
            // InternalBoardgameDL.g:1236:2: ','
            {
             before(grammarAccess.getBoardAccess().getCommaKeyword_11_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getCommaKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_11__0__Impl"


    // $ANTLR start "rule__Board__Group_11__1"
    // InternalBoardgameDL.g:1245:1: rule__Board__Group_11__1 : rule__Board__Group_11__1__Impl ;
    public final void rule__Board__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1249:1: ( rule__Board__Group_11__1__Impl )
            // InternalBoardgameDL.g:1250:2: rule__Board__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Board__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_11__1"


    // $ANTLR start "rule__Board__Group_11__1__Impl"
    // InternalBoardgameDL.g:1256:1: rule__Board__Group_11__1__Impl : ( ( rule__Board__CellAssignment_11_1 ) ) ;
    public final void rule__Board__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1260:1: ( ( ( rule__Board__CellAssignment_11_1 ) ) )
            // InternalBoardgameDL.g:1261:1: ( ( rule__Board__CellAssignment_11_1 ) )
            {
            // InternalBoardgameDL.g:1261:1: ( ( rule__Board__CellAssignment_11_1 ) )
            // InternalBoardgameDL.g:1262:2: ( rule__Board__CellAssignment_11_1 )
            {
             before(grammarAccess.getBoardAccess().getCellAssignment_11_1()); 
            // InternalBoardgameDL.g:1263:2: ( rule__Board__CellAssignment_11_1 )
            // InternalBoardgameDL.g:1263:3: rule__Board__CellAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Board__CellAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getCellAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_11__1__Impl"


    // $ANTLR start "rule__Board__Group_13__0"
    // InternalBoardgameDL.g:1272:1: rule__Board__Group_13__0 : rule__Board__Group_13__0__Impl rule__Board__Group_13__1 ;
    public final void rule__Board__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1276:1: ( rule__Board__Group_13__0__Impl rule__Board__Group_13__1 )
            // InternalBoardgameDL.g:1277:2: rule__Board__Group_13__0__Impl rule__Board__Group_13__1
            {
            pushFollow(FOLLOW_15);
            rule__Board__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_13__0"


    // $ANTLR start "rule__Board__Group_13__0__Impl"
    // InternalBoardgameDL.g:1284:1: rule__Board__Group_13__0__Impl : ( 'boardstate' ) ;
    public final void rule__Board__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1288:1: ( ( 'boardstate' ) )
            // InternalBoardgameDL.g:1289:1: ( 'boardstate' )
            {
            // InternalBoardgameDL.g:1289:1: ( 'boardstate' )
            // InternalBoardgameDL.g:1290:2: 'boardstate'
            {
             before(grammarAccess.getBoardAccess().getBoardstateKeyword_13_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getBoardstateKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_13__0__Impl"


    // $ANTLR start "rule__Board__Group_13__1"
    // InternalBoardgameDL.g:1299:1: rule__Board__Group_13__1 : rule__Board__Group_13__1__Impl rule__Board__Group_13__2 ;
    public final void rule__Board__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1303:1: ( rule__Board__Group_13__1__Impl rule__Board__Group_13__2 )
            // InternalBoardgameDL.g:1304:2: rule__Board__Group_13__1__Impl rule__Board__Group_13__2
            {
            pushFollow(FOLLOW_10);
            rule__Board__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group_13__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_13__1"


    // $ANTLR start "rule__Board__Group_13__1__Impl"
    // InternalBoardgameDL.g:1311:1: rule__Board__Group_13__1__Impl : ( '(' ) ;
    public final void rule__Board__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1315:1: ( ( '(' ) )
            // InternalBoardgameDL.g:1316:1: ( '(' )
            {
            // InternalBoardgameDL.g:1316:1: ( '(' )
            // InternalBoardgameDL.g:1317:2: '('
            {
             before(grammarAccess.getBoardAccess().getLeftParenthesisKeyword_13_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getLeftParenthesisKeyword_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_13__1__Impl"


    // $ANTLR start "rule__Board__Group_13__2"
    // InternalBoardgameDL.g:1326:1: rule__Board__Group_13__2 : rule__Board__Group_13__2__Impl rule__Board__Group_13__3 ;
    public final void rule__Board__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1330:1: ( rule__Board__Group_13__2__Impl rule__Board__Group_13__3 )
            // InternalBoardgameDL.g:1331:2: rule__Board__Group_13__2__Impl rule__Board__Group_13__3
            {
            pushFollow(FOLLOW_16);
            rule__Board__Group_13__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group_13__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_13__2"


    // $ANTLR start "rule__Board__Group_13__2__Impl"
    // InternalBoardgameDL.g:1338:1: rule__Board__Group_13__2__Impl : ( ( rule__Board__BoardstateAssignment_13_2 ) ) ;
    public final void rule__Board__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1342:1: ( ( ( rule__Board__BoardstateAssignment_13_2 ) ) )
            // InternalBoardgameDL.g:1343:1: ( ( rule__Board__BoardstateAssignment_13_2 ) )
            {
            // InternalBoardgameDL.g:1343:1: ( ( rule__Board__BoardstateAssignment_13_2 ) )
            // InternalBoardgameDL.g:1344:2: ( rule__Board__BoardstateAssignment_13_2 )
            {
             before(grammarAccess.getBoardAccess().getBoardstateAssignment_13_2()); 
            // InternalBoardgameDL.g:1345:2: ( rule__Board__BoardstateAssignment_13_2 )
            // InternalBoardgameDL.g:1345:3: rule__Board__BoardstateAssignment_13_2
            {
            pushFollow(FOLLOW_2);
            rule__Board__BoardstateAssignment_13_2();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getBoardstateAssignment_13_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_13__2__Impl"


    // $ANTLR start "rule__Board__Group_13__3"
    // InternalBoardgameDL.g:1353:1: rule__Board__Group_13__3 : rule__Board__Group_13__3__Impl rule__Board__Group_13__4 ;
    public final void rule__Board__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1357:1: ( rule__Board__Group_13__3__Impl rule__Board__Group_13__4 )
            // InternalBoardgameDL.g:1358:2: rule__Board__Group_13__3__Impl rule__Board__Group_13__4
            {
            pushFollow(FOLLOW_16);
            rule__Board__Group_13__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group_13__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_13__3"


    // $ANTLR start "rule__Board__Group_13__3__Impl"
    // InternalBoardgameDL.g:1365:1: rule__Board__Group_13__3__Impl : ( ( rule__Board__Group_13_3__0 )* ) ;
    public final void rule__Board__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1369:1: ( ( ( rule__Board__Group_13_3__0 )* ) )
            // InternalBoardgameDL.g:1370:1: ( ( rule__Board__Group_13_3__0 )* )
            {
            // InternalBoardgameDL.g:1370:1: ( ( rule__Board__Group_13_3__0 )* )
            // InternalBoardgameDL.g:1371:2: ( rule__Board__Group_13_3__0 )*
            {
             before(grammarAccess.getBoardAccess().getGroup_13_3()); 
            // InternalBoardgameDL.g:1372:2: ( rule__Board__Group_13_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBoardgameDL.g:1372:3: rule__Board__Group_13_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Board__Group_13_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getBoardAccess().getGroup_13_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_13__3__Impl"


    // $ANTLR start "rule__Board__Group_13__4"
    // InternalBoardgameDL.g:1380:1: rule__Board__Group_13__4 : rule__Board__Group_13__4__Impl ;
    public final void rule__Board__Group_13__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1384:1: ( rule__Board__Group_13__4__Impl )
            // InternalBoardgameDL.g:1385:2: rule__Board__Group_13__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Board__Group_13__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_13__4"


    // $ANTLR start "rule__Board__Group_13__4__Impl"
    // InternalBoardgameDL.g:1391:1: rule__Board__Group_13__4__Impl : ( ')' ) ;
    public final void rule__Board__Group_13__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1395:1: ( ( ')' ) )
            // InternalBoardgameDL.g:1396:1: ( ')' )
            {
            // InternalBoardgameDL.g:1396:1: ( ')' )
            // InternalBoardgameDL.g:1397:2: ')'
            {
             before(grammarAccess.getBoardAccess().getRightParenthesisKeyword_13_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getRightParenthesisKeyword_13_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_13__4__Impl"


    // $ANTLR start "rule__Board__Group_13_3__0"
    // InternalBoardgameDL.g:1407:1: rule__Board__Group_13_3__0 : rule__Board__Group_13_3__0__Impl rule__Board__Group_13_3__1 ;
    public final void rule__Board__Group_13_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1411:1: ( rule__Board__Group_13_3__0__Impl rule__Board__Group_13_3__1 )
            // InternalBoardgameDL.g:1412:2: rule__Board__Group_13_3__0__Impl rule__Board__Group_13_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Board__Group_13_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group_13_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_13_3__0"


    // $ANTLR start "rule__Board__Group_13_3__0__Impl"
    // InternalBoardgameDL.g:1419:1: rule__Board__Group_13_3__0__Impl : ( ',' ) ;
    public final void rule__Board__Group_13_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1423:1: ( ( ',' ) )
            // InternalBoardgameDL.g:1424:1: ( ',' )
            {
            // InternalBoardgameDL.g:1424:1: ( ',' )
            // InternalBoardgameDL.g:1425:2: ','
            {
             before(grammarAccess.getBoardAccess().getCommaKeyword_13_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getCommaKeyword_13_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_13_3__0__Impl"


    // $ANTLR start "rule__Board__Group_13_3__1"
    // InternalBoardgameDL.g:1434:1: rule__Board__Group_13_3__1 : rule__Board__Group_13_3__1__Impl ;
    public final void rule__Board__Group_13_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1438:1: ( rule__Board__Group_13_3__1__Impl )
            // InternalBoardgameDL.g:1439:2: rule__Board__Group_13_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Board__Group_13_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_13_3__1"


    // $ANTLR start "rule__Board__Group_13_3__1__Impl"
    // InternalBoardgameDL.g:1445:1: rule__Board__Group_13_3__1__Impl : ( ( rule__Board__BoardstateAssignment_13_3_1 ) ) ;
    public final void rule__Board__Group_13_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1449:1: ( ( ( rule__Board__BoardstateAssignment_13_3_1 ) ) )
            // InternalBoardgameDL.g:1450:1: ( ( rule__Board__BoardstateAssignment_13_3_1 ) )
            {
            // InternalBoardgameDL.g:1450:1: ( ( rule__Board__BoardstateAssignment_13_3_1 ) )
            // InternalBoardgameDL.g:1451:2: ( rule__Board__BoardstateAssignment_13_3_1 )
            {
             before(grammarAccess.getBoardAccess().getBoardstateAssignment_13_3_1()); 
            // InternalBoardgameDL.g:1452:2: ( rule__Board__BoardstateAssignment_13_3_1 )
            // InternalBoardgameDL.g:1452:3: rule__Board__BoardstateAssignment_13_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Board__BoardstateAssignment_13_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getBoardstateAssignment_13_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_13_3__1__Impl"


    // $ANTLR start "rule__Board__Group_17__0"
    // InternalBoardgameDL.g:1461:1: rule__Board__Group_17__0 : rule__Board__Group_17__0__Impl rule__Board__Group_17__1 ;
    public final void rule__Board__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1465:1: ( rule__Board__Group_17__0__Impl rule__Board__Group_17__1 )
            // InternalBoardgameDL.g:1466:2: rule__Board__Group_17__0__Impl rule__Board__Group_17__1
            {
            pushFollow(FOLLOW_18);
            rule__Board__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group_17__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_17__0"


    // $ANTLR start "rule__Board__Group_17__0__Impl"
    // InternalBoardgameDL.g:1473:1: rule__Board__Group_17__0__Impl : ( ',' ) ;
    public final void rule__Board__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1477:1: ( ( ',' ) )
            // InternalBoardgameDL.g:1478:1: ( ',' )
            {
            // InternalBoardgameDL.g:1478:1: ( ',' )
            // InternalBoardgameDL.g:1479:2: ','
            {
             before(grammarAccess.getBoardAccess().getCommaKeyword_17_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getCommaKeyword_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_17__0__Impl"


    // $ANTLR start "rule__Board__Group_17__1"
    // InternalBoardgameDL.g:1488:1: rule__Board__Group_17__1 : rule__Board__Group_17__1__Impl ;
    public final void rule__Board__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1492:1: ( rule__Board__Group_17__1__Impl )
            // InternalBoardgameDL.g:1493:2: rule__Board__Group_17__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Board__Group_17__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_17__1"


    // $ANTLR start "rule__Board__Group_17__1__Impl"
    // InternalBoardgameDL.g:1499:1: rule__Board__Group_17__1__Impl : ( ( rule__Board__PlayerbricksetAssignment_17_1 ) ) ;
    public final void rule__Board__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1503:1: ( ( ( rule__Board__PlayerbricksetAssignment_17_1 ) ) )
            // InternalBoardgameDL.g:1504:1: ( ( rule__Board__PlayerbricksetAssignment_17_1 ) )
            {
            // InternalBoardgameDL.g:1504:1: ( ( rule__Board__PlayerbricksetAssignment_17_1 ) )
            // InternalBoardgameDL.g:1505:2: ( rule__Board__PlayerbricksetAssignment_17_1 )
            {
             before(grammarAccess.getBoardAccess().getPlayerbricksetAssignment_17_1()); 
            // InternalBoardgameDL.g:1506:2: ( rule__Board__PlayerbricksetAssignment_17_1 )
            // InternalBoardgameDL.g:1506:3: rule__Board__PlayerbricksetAssignment_17_1
            {
            pushFollow(FOLLOW_2);
            rule__Board__PlayerbricksetAssignment_17_1();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getPlayerbricksetAssignment_17_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_17__1__Impl"


    // $ANTLR start "rule__Board__Group_22__0"
    // InternalBoardgameDL.g:1515:1: rule__Board__Group_22__0 : rule__Board__Group_22__0__Impl rule__Board__Group_22__1 ;
    public final void rule__Board__Group_22__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1519:1: ( rule__Board__Group_22__0__Impl rule__Board__Group_22__1 )
            // InternalBoardgameDL.g:1520:2: rule__Board__Group_22__0__Impl rule__Board__Group_22__1
            {
            pushFollow(FOLLOW_20);
            rule__Board__Group_22__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group_22__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_22__0"


    // $ANTLR start "rule__Board__Group_22__0__Impl"
    // InternalBoardgameDL.g:1527:1: rule__Board__Group_22__0__Impl : ( ',' ) ;
    public final void rule__Board__Group_22__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1531:1: ( ( ',' ) )
            // InternalBoardgameDL.g:1532:1: ( ',' )
            {
            // InternalBoardgameDL.g:1532:1: ( ',' )
            // InternalBoardgameDL.g:1533:2: ','
            {
             before(grammarAccess.getBoardAccess().getCommaKeyword_22_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getCommaKeyword_22_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_22__0__Impl"


    // $ANTLR start "rule__Board__Group_22__1"
    // InternalBoardgameDL.g:1542:1: rule__Board__Group_22__1 : rule__Board__Group_22__1__Impl ;
    public final void rule__Board__Group_22__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1546:1: ( rule__Board__Group_22__1__Impl )
            // InternalBoardgameDL.g:1547:2: rule__Board__Group_22__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Board__Group_22__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_22__1"


    // $ANTLR start "rule__Board__Group_22__1__Impl"
    // InternalBoardgameDL.g:1553:1: rule__Board__Group_22__1__Impl : ( ( rule__Board__ValidmoveAssignment_22_1 ) ) ;
    public final void rule__Board__Group_22__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1557:1: ( ( ( rule__Board__ValidmoveAssignment_22_1 ) ) )
            // InternalBoardgameDL.g:1558:1: ( ( rule__Board__ValidmoveAssignment_22_1 ) )
            {
            // InternalBoardgameDL.g:1558:1: ( ( rule__Board__ValidmoveAssignment_22_1 ) )
            // InternalBoardgameDL.g:1559:2: ( rule__Board__ValidmoveAssignment_22_1 )
            {
             before(grammarAccess.getBoardAccess().getValidmoveAssignment_22_1()); 
            // InternalBoardgameDL.g:1560:2: ( rule__Board__ValidmoveAssignment_22_1 )
            // InternalBoardgameDL.g:1560:3: rule__Board__ValidmoveAssignment_22_1
            {
            pushFollow(FOLLOW_2);
            rule__Board__ValidmoveAssignment_22_1();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getValidmoveAssignment_22_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_22__1__Impl"


    // $ANTLR start "rule__PlayerBrickSet__Group__0"
    // InternalBoardgameDL.g:1569:1: rule__PlayerBrickSet__Group__0 : rule__PlayerBrickSet__Group__0__Impl rule__PlayerBrickSet__Group__1 ;
    public final void rule__PlayerBrickSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1573:1: ( rule__PlayerBrickSet__Group__0__Impl rule__PlayerBrickSet__Group__1 )
            // InternalBoardgameDL.g:1574:2: rule__PlayerBrickSet__Group__0__Impl rule__PlayerBrickSet__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PlayerBrickSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerBrickSet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group__0"


    // $ANTLR start "rule__PlayerBrickSet__Group__0__Impl"
    // InternalBoardgameDL.g:1581:1: rule__PlayerBrickSet__Group__0__Impl : ( 'PlayerBrickSet' ) ;
    public final void rule__PlayerBrickSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1585:1: ( ( 'PlayerBrickSet' ) )
            // InternalBoardgameDL.g:1586:1: ( 'PlayerBrickSet' )
            {
            // InternalBoardgameDL.g:1586:1: ( 'PlayerBrickSet' )
            // InternalBoardgameDL.g:1587:2: 'PlayerBrickSet'
            {
             before(grammarAccess.getPlayerBrickSetAccess().getPlayerBrickSetKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPlayerBrickSetAccess().getPlayerBrickSetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group__0__Impl"


    // $ANTLR start "rule__PlayerBrickSet__Group__1"
    // InternalBoardgameDL.g:1596:1: rule__PlayerBrickSet__Group__1 : rule__PlayerBrickSet__Group__1__Impl rule__PlayerBrickSet__Group__2 ;
    public final void rule__PlayerBrickSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1600:1: ( rule__PlayerBrickSet__Group__1__Impl rule__PlayerBrickSet__Group__2 )
            // InternalBoardgameDL.g:1601:2: rule__PlayerBrickSet__Group__1__Impl rule__PlayerBrickSet__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__PlayerBrickSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerBrickSet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group__1"


    // $ANTLR start "rule__PlayerBrickSet__Group__1__Impl"
    // InternalBoardgameDL.g:1608:1: rule__PlayerBrickSet__Group__1__Impl : ( '{' ) ;
    public final void rule__PlayerBrickSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1612:1: ( ( '{' ) )
            // InternalBoardgameDL.g:1613:1: ( '{' )
            {
            // InternalBoardgameDL.g:1613:1: ( '{' )
            // InternalBoardgameDL.g:1614:2: '{'
            {
             before(grammarAccess.getPlayerBrickSetAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPlayerBrickSetAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group__1__Impl"


    // $ANTLR start "rule__PlayerBrickSet__Group__2"
    // InternalBoardgameDL.g:1623:1: rule__PlayerBrickSet__Group__2 : rule__PlayerBrickSet__Group__2__Impl rule__PlayerBrickSet__Group__3 ;
    public final void rule__PlayerBrickSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1627:1: ( rule__PlayerBrickSet__Group__2__Impl rule__PlayerBrickSet__Group__3 )
            // InternalBoardgameDL.g:1628:2: rule__PlayerBrickSet__Group__2__Impl rule__PlayerBrickSet__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__PlayerBrickSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerBrickSet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group__2"


    // $ANTLR start "rule__PlayerBrickSet__Group__2__Impl"
    // InternalBoardgameDL.g:1635:1: rule__PlayerBrickSet__Group__2__Impl : ( 'Name' ) ;
    public final void rule__PlayerBrickSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1639:1: ( ( 'Name' ) )
            // InternalBoardgameDL.g:1640:1: ( 'Name' )
            {
            // InternalBoardgameDL.g:1640:1: ( 'Name' )
            // InternalBoardgameDL.g:1641:2: 'Name'
            {
             before(grammarAccess.getPlayerBrickSetAccess().getNameKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPlayerBrickSetAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group__2__Impl"


    // $ANTLR start "rule__PlayerBrickSet__Group__3"
    // InternalBoardgameDL.g:1650:1: rule__PlayerBrickSet__Group__3 : rule__PlayerBrickSet__Group__3__Impl rule__PlayerBrickSet__Group__4 ;
    public final void rule__PlayerBrickSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1654:1: ( rule__PlayerBrickSet__Group__3__Impl rule__PlayerBrickSet__Group__4 )
            // InternalBoardgameDL.g:1655:2: rule__PlayerBrickSet__Group__3__Impl rule__PlayerBrickSet__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__PlayerBrickSet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerBrickSet__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group__3"


    // $ANTLR start "rule__PlayerBrickSet__Group__3__Impl"
    // InternalBoardgameDL.g:1662:1: rule__PlayerBrickSet__Group__3__Impl : ( ( rule__PlayerBrickSet__NameAssignment_3 ) ) ;
    public final void rule__PlayerBrickSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1666:1: ( ( ( rule__PlayerBrickSet__NameAssignment_3 ) ) )
            // InternalBoardgameDL.g:1667:1: ( ( rule__PlayerBrickSet__NameAssignment_3 ) )
            {
            // InternalBoardgameDL.g:1667:1: ( ( rule__PlayerBrickSet__NameAssignment_3 ) )
            // InternalBoardgameDL.g:1668:2: ( rule__PlayerBrickSet__NameAssignment_3 )
            {
             before(grammarAccess.getPlayerBrickSetAccess().getNameAssignment_3()); 
            // InternalBoardgameDL.g:1669:2: ( rule__PlayerBrickSet__NameAssignment_3 )
            // InternalBoardgameDL.g:1669:3: rule__PlayerBrickSet__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PlayerBrickSet__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPlayerBrickSetAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group__3__Impl"


    // $ANTLR start "rule__PlayerBrickSet__Group__4"
    // InternalBoardgameDL.g:1677:1: rule__PlayerBrickSet__Group__4 : rule__PlayerBrickSet__Group__4__Impl rule__PlayerBrickSet__Group__5 ;
    public final void rule__PlayerBrickSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1681:1: ( rule__PlayerBrickSet__Group__4__Impl rule__PlayerBrickSet__Group__5 )
            // InternalBoardgameDL.g:1682:2: rule__PlayerBrickSet__Group__4__Impl rule__PlayerBrickSet__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__PlayerBrickSet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerBrickSet__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group__4"


    // $ANTLR start "rule__PlayerBrickSet__Group__4__Impl"
    // InternalBoardgameDL.g:1689:1: rule__PlayerBrickSet__Group__4__Impl : ( 'win' ) ;
    public final void rule__PlayerBrickSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1693:1: ( ( 'win' ) )
            // InternalBoardgameDL.g:1694:1: ( 'win' )
            {
            // InternalBoardgameDL.g:1694:1: ( 'win' )
            // InternalBoardgameDL.g:1695:2: 'win'
            {
             before(grammarAccess.getPlayerBrickSetAccess().getWinKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPlayerBrickSetAccess().getWinKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group__4__Impl"


    // $ANTLR start "rule__PlayerBrickSet__Group__5"
    // InternalBoardgameDL.g:1704:1: rule__PlayerBrickSet__Group__5 : rule__PlayerBrickSet__Group__5__Impl rule__PlayerBrickSet__Group__6 ;
    public final void rule__PlayerBrickSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1708:1: ( rule__PlayerBrickSet__Group__5__Impl rule__PlayerBrickSet__Group__6 )
            // InternalBoardgameDL.g:1709:2: rule__PlayerBrickSet__Group__5__Impl rule__PlayerBrickSet__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__PlayerBrickSet__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerBrickSet__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group__5"


    // $ANTLR start "rule__PlayerBrickSet__Group__5__Impl"
    // InternalBoardgameDL.g:1716:1: rule__PlayerBrickSet__Group__5__Impl : ( '(' ) ;
    public final void rule__PlayerBrickSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1720:1: ( ( '(' ) )
            // InternalBoardgameDL.g:1721:1: ( '(' )
            {
            // InternalBoardgameDL.g:1721:1: ( '(' )
            // InternalBoardgameDL.g:1722:2: '('
            {
             before(grammarAccess.getPlayerBrickSetAccess().getLeftParenthesisKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPlayerBrickSetAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group__5__Impl"


    // $ANTLR start "rule__PlayerBrickSet__Group__6"
    // InternalBoardgameDL.g:1731:1: rule__PlayerBrickSet__Group__6 : rule__PlayerBrickSet__Group__6__Impl rule__PlayerBrickSet__Group__7 ;
    public final void rule__PlayerBrickSet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1735:1: ( rule__PlayerBrickSet__Group__6__Impl rule__PlayerBrickSet__Group__7 )
            // InternalBoardgameDL.g:1736:2: rule__PlayerBrickSet__Group__6__Impl rule__PlayerBrickSet__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__PlayerBrickSet__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerBrickSet__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group__6"


    // $ANTLR start "rule__PlayerBrickSet__Group__6__Impl"
    // InternalBoardgameDL.g:1743:1: rule__PlayerBrickSet__Group__6__Impl : ( ( rule__PlayerBrickSet__WinAssignment_6 ) ) ;
    public final void rule__PlayerBrickSet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1747:1: ( ( ( rule__PlayerBrickSet__WinAssignment_6 ) ) )
            // InternalBoardgameDL.g:1748:1: ( ( rule__PlayerBrickSet__WinAssignment_6 ) )
            {
            // InternalBoardgameDL.g:1748:1: ( ( rule__PlayerBrickSet__WinAssignment_6 ) )
            // InternalBoardgameDL.g:1749:2: ( rule__PlayerBrickSet__WinAssignment_6 )
            {
             before(grammarAccess.getPlayerBrickSetAccess().getWinAssignment_6()); 
            // InternalBoardgameDL.g:1750:2: ( rule__PlayerBrickSet__WinAssignment_6 )
            // InternalBoardgameDL.g:1750:3: rule__PlayerBrickSet__WinAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__PlayerBrickSet__WinAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPlayerBrickSetAccess().getWinAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group__6__Impl"


    // $ANTLR start "rule__PlayerBrickSet__Group__7"
    // InternalBoardgameDL.g:1758:1: rule__PlayerBrickSet__Group__7 : rule__PlayerBrickSet__Group__7__Impl rule__PlayerBrickSet__Group__8 ;
    public final void rule__PlayerBrickSet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1762:1: ( rule__PlayerBrickSet__Group__7__Impl rule__PlayerBrickSet__Group__8 )
            // InternalBoardgameDL.g:1763:2: rule__PlayerBrickSet__Group__7__Impl rule__PlayerBrickSet__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__PlayerBrickSet__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerBrickSet__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group__7"


    // $ANTLR start "rule__PlayerBrickSet__Group__7__Impl"
    // InternalBoardgameDL.g:1770:1: rule__PlayerBrickSet__Group__7__Impl : ( ( rule__PlayerBrickSet__Group_7__0 )* ) ;
    public final void rule__PlayerBrickSet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1774:1: ( ( ( rule__PlayerBrickSet__Group_7__0 )* ) )
            // InternalBoardgameDL.g:1775:1: ( ( rule__PlayerBrickSet__Group_7__0 )* )
            {
            // InternalBoardgameDL.g:1775:1: ( ( rule__PlayerBrickSet__Group_7__0 )* )
            // InternalBoardgameDL.g:1776:2: ( rule__PlayerBrickSet__Group_7__0 )*
            {
             before(grammarAccess.getPlayerBrickSetAccess().getGroup_7()); 
            // InternalBoardgameDL.g:1777:2: ( rule__PlayerBrickSet__Group_7__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBoardgameDL.g:1777:3: rule__PlayerBrickSet__Group_7__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__PlayerBrickSet__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPlayerBrickSetAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group__7__Impl"


    // $ANTLR start "rule__PlayerBrickSet__Group__8"
    // InternalBoardgameDL.g:1785:1: rule__PlayerBrickSet__Group__8 : rule__PlayerBrickSet__Group__8__Impl rule__PlayerBrickSet__Group__9 ;
    public final void rule__PlayerBrickSet__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1789:1: ( rule__PlayerBrickSet__Group__8__Impl rule__PlayerBrickSet__Group__9 )
            // InternalBoardgameDL.g:1790:2: rule__PlayerBrickSet__Group__8__Impl rule__PlayerBrickSet__Group__9
            {
            pushFollow(FOLLOW_22);
            rule__PlayerBrickSet__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerBrickSet__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group__8"


    // $ANTLR start "rule__PlayerBrickSet__Group__8__Impl"
    // InternalBoardgameDL.g:1797:1: rule__PlayerBrickSet__Group__8__Impl : ( ')' ) ;
    public final void rule__PlayerBrickSet__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1801:1: ( ( ')' ) )
            // InternalBoardgameDL.g:1802:1: ( ')' )
            {
            // InternalBoardgameDL.g:1802:1: ( ')' )
            // InternalBoardgameDL.g:1803:2: ')'
            {
             before(grammarAccess.getPlayerBrickSetAccess().getRightParenthesisKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPlayerBrickSetAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group__8__Impl"


    // $ANTLR start "rule__PlayerBrickSet__Group__9"
    // InternalBoardgameDL.g:1812:1: rule__PlayerBrickSet__Group__9 : rule__PlayerBrickSet__Group__9__Impl rule__PlayerBrickSet__Group__10 ;
    public final void rule__PlayerBrickSet__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1816:1: ( rule__PlayerBrickSet__Group__9__Impl rule__PlayerBrickSet__Group__10 )
            // InternalBoardgameDL.g:1817:2: rule__PlayerBrickSet__Group__9__Impl rule__PlayerBrickSet__Group__10
            {
            pushFollow(FOLLOW_22);
            rule__PlayerBrickSet__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerBrickSet__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group__9"


    // $ANTLR start "rule__PlayerBrickSet__Group__9__Impl"
    // InternalBoardgameDL.g:1824:1: rule__PlayerBrickSet__Group__9__Impl : ( ( rule__PlayerBrickSet__Group_9__0 )? ) ;
    public final void rule__PlayerBrickSet__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1828:1: ( ( ( rule__PlayerBrickSet__Group_9__0 )? ) )
            // InternalBoardgameDL.g:1829:1: ( ( rule__PlayerBrickSet__Group_9__0 )? )
            {
            // InternalBoardgameDL.g:1829:1: ( ( rule__PlayerBrickSet__Group_9__0 )? )
            // InternalBoardgameDL.g:1830:2: ( rule__PlayerBrickSet__Group_9__0 )?
            {
             before(grammarAccess.getPlayerBrickSetAccess().getGroup_9()); 
            // InternalBoardgameDL.g:1831:2: ( rule__PlayerBrickSet__Group_9__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBoardgameDL.g:1831:3: rule__PlayerBrickSet__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlayerBrickSet__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlayerBrickSetAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group__9__Impl"


    // $ANTLR start "rule__PlayerBrickSet__Group__10"
    // InternalBoardgameDL.g:1839:1: rule__PlayerBrickSet__Group__10 : rule__PlayerBrickSet__Group__10__Impl rule__PlayerBrickSet__Group__11 ;
    public final void rule__PlayerBrickSet__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1843:1: ( rule__PlayerBrickSet__Group__10__Impl rule__PlayerBrickSet__Group__11 )
            // InternalBoardgameDL.g:1844:2: rule__PlayerBrickSet__Group__10__Impl rule__PlayerBrickSet__Group__11
            {
            pushFollow(FOLLOW_3);
            rule__PlayerBrickSet__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerBrickSet__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group__10"


    // $ANTLR start "rule__PlayerBrickSet__Group__10__Impl"
    // InternalBoardgameDL.g:1851:1: rule__PlayerBrickSet__Group__10__Impl : ( 'brick' ) ;
    public final void rule__PlayerBrickSet__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1855:1: ( ( 'brick' ) )
            // InternalBoardgameDL.g:1856:1: ( 'brick' )
            {
            // InternalBoardgameDL.g:1856:1: ( 'brick' )
            // InternalBoardgameDL.g:1857:2: 'brick'
            {
             before(grammarAccess.getPlayerBrickSetAccess().getBrickKeyword_10()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPlayerBrickSetAccess().getBrickKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group__10__Impl"


    // $ANTLR start "rule__PlayerBrickSet__Group__11"
    // InternalBoardgameDL.g:1866:1: rule__PlayerBrickSet__Group__11 : rule__PlayerBrickSet__Group__11__Impl rule__PlayerBrickSet__Group__12 ;
    public final void rule__PlayerBrickSet__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1870:1: ( rule__PlayerBrickSet__Group__11__Impl rule__PlayerBrickSet__Group__12 )
            // InternalBoardgameDL.g:1871:2: rule__PlayerBrickSet__Group__11__Impl rule__PlayerBrickSet__Group__12
            {
            pushFollow(FOLLOW_23);
            rule__PlayerBrickSet__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerBrickSet__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group__11"


    // $ANTLR start "rule__PlayerBrickSet__Group__11__Impl"
    // InternalBoardgameDL.g:1878:1: rule__PlayerBrickSet__Group__11__Impl : ( '{' ) ;
    public final void rule__PlayerBrickSet__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1882:1: ( ( '{' ) )
            // InternalBoardgameDL.g:1883:1: ( '{' )
            {
            // InternalBoardgameDL.g:1883:1: ( '{' )
            // InternalBoardgameDL.g:1884:2: '{'
            {
             before(grammarAccess.getPlayerBrickSetAccess().getLeftCurlyBracketKeyword_11()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPlayerBrickSetAccess().getLeftCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group__11__Impl"


    // $ANTLR start "rule__PlayerBrickSet__Group__12"
    // InternalBoardgameDL.g:1893:1: rule__PlayerBrickSet__Group__12 : rule__PlayerBrickSet__Group__12__Impl rule__PlayerBrickSet__Group__13 ;
    public final void rule__PlayerBrickSet__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1897:1: ( rule__PlayerBrickSet__Group__12__Impl rule__PlayerBrickSet__Group__13 )
            // InternalBoardgameDL.g:1898:2: rule__PlayerBrickSet__Group__12__Impl rule__PlayerBrickSet__Group__13
            {
            pushFollow(FOLLOW_6);
            rule__PlayerBrickSet__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerBrickSet__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group__12"


    // $ANTLR start "rule__PlayerBrickSet__Group__12__Impl"
    // InternalBoardgameDL.g:1905:1: rule__PlayerBrickSet__Group__12__Impl : ( ( rule__PlayerBrickSet__BrickAssignment_12 ) ) ;
    public final void rule__PlayerBrickSet__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1909:1: ( ( ( rule__PlayerBrickSet__BrickAssignment_12 ) ) )
            // InternalBoardgameDL.g:1910:1: ( ( rule__PlayerBrickSet__BrickAssignment_12 ) )
            {
            // InternalBoardgameDL.g:1910:1: ( ( rule__PlayerBrickSet__BrickAssignment_12 ) )
            // InternalBoardgameDL.g:1911:2: ( rule__PlayerBrickSet__BrickAssignment_12 )
            {
             before(grammarAccess.getPlayerBrickSetAccess().getBrickAssignment_12()); 
            // InternalBoardgameDL.g:1912:2: ( rule__PlayerBrickSet__BrickAssignment_12 )
            // InternalBoardgameDL.g:1912:3: rule__PlayerBrickSet__BrickAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__PlayerBrickSet__BrickAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getPlayerBrickSetAccess().getBrickAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group__12__Impl"


    // $ANTLR start "rule__PlayerBrickSet__Group__13"
    // InternalBoardgameDL.g:1920:1: rule__PlayerBrickSet__Group__13 : rule__PlayerBrickSet__Group__13__Impl rule__PlayerBrickSet__Group__14 ;
    public final void rule__PlayerBrickSet__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1924:1: ( rule__PlayerBrickSet__Group__13__Impl rule__PlayerBrickSet__Group__14 )
            // InternalBoardgameDL.g:1925:2: rule__PlayerBrickSet__Group__13__Impl rule__PlayerBrickSet__Group__14
            {
            pushFollow(FOLLOW_6);
            rule__PlayerBrickSet__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerBrickSet__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group__13"


    // $ANTLR start "rule__PlayerBrickSet__Group__13__Impl"
    // InternalBoardgameDL.g:1932:1: rule__PlayerBrickSet__Group__13__Impl : ( ( rule__PlayerBrickSet__Group_13__0 )* ) ;
    public final void rule__PlayerBrickSet__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1936:1: ( ( ( rule__PlayerBrickSet__Group_13__0 )* ) )
            // InternalBoardgameDL.g:1937:1: ( ( rule__PlayerBrickSet__Group_13__0 )* )
            {
            // InternalBoardgameDL.g:1937:1: ( ( rule__PlayerBrickSet__Group_13__0 )* )
            // InternalBoardgameDL.g:1938:2: ( rule__PlayerBrickSet__Group_13__0 )*
            {
             before(grammarAccess.getPlayerBrickSetAccess().getGroup_13()); 
            // InternalBoardgameDL.g:1939:2: ( rule__PlayerBrickSet__Group_13__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBoardgameDL.g:1939:3: rule__PlayerBrickSet__Group_13__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__PlayerBrickSet__Group_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getPlayerBrickSetAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group__13__Impl"


    // $ANTLR start "rule__PlayerBrickSet__Group__14"
    // InternalBoardgameDL.g:1947:1: rule__PlayerBrickSet__Group__14 : rule__PlayerBrickSet__Group__14__Impl rule__PlayerBrickSet__Group__15 ;
    public final void rule__PlayerBrickSet__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1951:1: ( rule__PlayerBrickSet__Group__14__Impl rule__PlayerBrickSet__Group__15 )
            // InternalBoardgameDL.g:1952:2: rule__PlayerBrickSet__Group__14__Impl rule__PlayerBrickSet__Group__15
            {
            pushFollow(FOLLOW_8);
            rule__PlayerBrickSet__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerBrickSet__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group__14"


    // $ANTLR start "rule__PlayerBrickSet__Group__14__Impl"
    // InternalBoardgameDL.g:1959:1: rule__PlayerBrickSet__Group__14__Impl : ( '}' ) ;
    public final void rule__PlayerBrickSet__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1963:1: ( ( '}' ) )
            // InternalBoardgameDL.g:1964:1: ( '}' )
            {
            // InternalBoardgameDL.g:1964:1: ( '}' )
            // InternalBoardgameDL.g:1965:2: '}'
            {
             before(grammarAccess.getPlayerBrickSetAccess().getRightCurlyBracketKeyword_14()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPlayerBrickSetAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group__14__Impl"


    // $ANTLR start "rule__PlayerBrickSet__Group__15"
    // InternalBoardgameDL.g:1974:1: rule__PlayerBrickSet__Group__15 : rule__PlayerBrickSet__Group__15__Impl ;
    public final void rule__PlayerBrickSet__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1978:1: ( rule__PlayerBrickSet__Group__15__Impl )
            // InternalBoardgameDL.g:1979:2: rule__PlayerBrickSet__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlayerBrickSet__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group__15"


    // $ANTLR start "rule__PlayerBrickSet__Group__15__Impl"
    // InternalBoardgameDL.g:1985:1: rule__PlayerBrickSet__Group__15__Impl : ( '}' ) ;
    public final void rule__PlayerBrickSet__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:1989:1: ( ( '}' ) )
            // InternalBoardgameDL.g:1990:1: ( '}' )
            {
            // InternalBoardgameDL.g:1990:1: ( '}' )
            // InternalBoardgameDL.g:1991:2: '}'
            {
             before(grammarAccess.getPlayerBrickSetAccess().getRightCurlyBracketKeyword_15()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPlayerBrickSetAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group__15__Impl"


    // $ANTLR start "rule__PlayerBrickSet__Group_7__0"
    // InternalBoardgameDL.g:2001:1: rule__PlayerBrickSet__Group_7__0 : rule__PlayerBrickSet__Group_7__0__Impl rule__PlayerBrickSet__Group_7__1 ;
    public final void rule__PlayerBrickSet__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2005:1: ( rule__PlayerBrickSet__Group_7__0__Impl rule__PlayerBrickSet__Group_7__1 )
            // InternalBoardgameDL.g:2006:2: rule__PlayerBrickSet__Group_7__0__Impl rule__PlayerBrickSet__Group_7__1
            {
            pushFollow(FOLLOW_10);
            rule__PlayerBrickSet__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerBrickSet__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group_7__0"


    // $ANTLR start "rule__PlayerBrickSet__Group_7__0__Impl"
    // InternalBoardgameDL.g:2013:1: rule__PlayerBrickSet__Group_7__0__Impl : ( ',' ) ;
    public final void rule__PlayerBrickSet__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2017:1: ( ( ',' ) )
            // InternalBoardgameDL.g:2018:1: ( ',' )
            {
            // InternalBoardgameDL.g:2018:1: ( ',' )
            // InternalBoardgameDL.g:2019:2: ','
            {
             before(grammarAccess.getPlayerBrickSetAccess().getCommaKeyword_7_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPlayerBrickSetAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group_7__0__Impl"


    // $ANTLR start "rule__PlayerBrickSet__Group_7__1"
    // InternalBoardgameDL.g:2028:1: rule__PlayerBrickSet__Group_7__1 : rule__PlayerBrickSet__Group_7__1__Impl ;
    public final void rule__PlayerBrickSet__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2032:1: ( rule__PlayerBrickSet__Group_7__1__Impl )
            // InternalBoardgameDL.g:2033:2: rule__PlayerBrickSet__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlayerBrickSet__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group_7__1"


    // $ANTLR start "rule__PlayerBrickSet__Group_7__1__Impl"
    // InternalBoardgameDL.g:2039:1: rule__PlayerBrickSet__Group_7__1__Impl : ( ( rule__PlayerBrickSet__WinAssignment_7_1 ) ) ;
    public final void rule__PlayerBrickSet__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2043:1: ( ( ( rule__PlayerBrickSet__WinAssignment_7_1 ) ) )
            // InternalBoardgameDL.g:2044:1: ( ( rule__PlayerBrickSet__WinAssignment_7_1 ) )
            {
            // InternalBoardgameDL.g:2044:1: ( ( rule__PlayerBrickSet__WinAssignment_7_1 ) )
            // InternalBoardgameDL.g:2045:2: ( rule__PlayerBrickSet__WinAssignment_7_1 )
            {
             before(grammarAccess.getPlayerBrickSetAccess().getWinAssignment_7_1()); 
            // InternalBoardgameDL.g:2046:2: ( rule__PlayerBrickSet__WinAssignment_7_1 )
            // InternalBoardgameDL.g:2046:3: rule__PlayerBrickSet__WinAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__PlayerBrickSet__WinAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPlayerBrickSetAccess().getWinAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group_7__1__Impl"


    // $ANTLR start "rule__PlayerBrickSet__Group_9__0"
    // InternalBoardgameDL.g:2055:1: rule__PlayerBrickSet__Group_9__0 : rule__PlayerBrickSet__Group_9__0__Impl rule__PlayerBrickSet__Group_9__1 ;
    public final void rule__PlayerBrickSet__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2059:1: ( rule__PlayerBrickSet__Group_9__0__Impl rule__PlayerBrickSet__Group_9__1 )
            // InternalBoardgameDL.g:2060:2: rule__PlayerBrickSet__Group_9__0__Impl rule__PlayerBrickSet__Group_9__1
            {
            pushFollow(FOLLOW_10);
            rule__PlayerBrickSet__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerBrickSet__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group_9__0"


    // $ANTLR start "rule__PlayerBrickSet__Group_9__0__Impl"
    // InternalBoardgameDL.g:2067:1: rule__PlayerBrickSet__Group_9__0__Impl : ( 'draw' ) ;
    public final void rule__PlayerBrickSet__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2071:1: ( ( 'draw' ) )
            // InternalBoardgameDL.g:2072:1: ( 'draw' )
            {
            // InternalBoardgameDL.g:2072:1: ( 'draw' )
            // InternalBoardgameDL.g:2073:2: 'draw'
            {
             before(grammarAccess.getPlayerBrickSetAccess().getDrawKeyword_9_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPlayerBrickSetAccess().getDrawKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group_9__0__Impl"


    // $ANTLR start "rule__PlayerBrickSet__Group_9__1"
    // InternalBoardgameDL.g:2082:1: rule__PlayerBrickSet__Group_9__1 : rule__PlayerBrickSet__Group_9__1__Impl ;
    public final void rule__PlayerBrickSet__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2086:1: ( rule__PlayerBrickSet__Group_9__1__Impl )
            // InternalBoardgameDL.g:2087:2: rule__PlayerBrickSet__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlayerBrickSet__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group_9__1"


    // $ANTLR start "rule__PlayerBrickSet__Group_9__1__Impl"
    // InternalBoardgameDL.g:2093:1: rule__PlayerBrickSet__Group_9__1__Impl : ( ( rule__PlayerBrickSet__DrawAssignment_9_1 ) ) ;
    public final void rule__PlayerBrickSet__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2097:1: ( ( ( rule__PlayerBrickSet__DrawAssignment_9_1 ) ) )
            // InternalBoardgameDL.g:2098:1: ( ( rule__PlayerBrickSet__DrawAssignment_9_1 ) )
            {
            // InternalBoardgameDL.g:2098:1: ( ( rule__PlayerBrickSet__DrawAssignment_9_1 ) )
            // InternalBoardgameDL.g:2099:2: ( rule__PlayerBrickSet__DrawAssignment_9_1 )
            {
             before(grammarAccess.getPlayerBrickSetAccess().getDrawAssignment_9_1()); 
            // InternalBoardgameDL.g:2100:2: ( rule__PlayerBrickSet__DrawAssignment_9_1 )
            // InternalBoardgameDL.g:2100:3: rule__PlayerBrickSet__DrawAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__PlayerBrickSet__DrawAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getPlayerBrickSetAccess().getDrawAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group_9__1__Impl"


    // $ANTLR start "rule__PlayerBrickSet__Group_13__0"
    // InternalBoardgameDL.g:2109:1: rule__PlayerBrickSet__Group_13__0 : rule__PlayerBrickSet__Group_13__0__Impl rule__PlayerBrickSet__Group_13__1 ;
    public final void rule__PlayerBrickSet__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2113:1: ( rule__PlayerBrickSet__Group_13__0__Impl rule__PlayerBrickSet__Group_13__1 )
            // InternalBoardgameDL.g:2114:2: rule__PlayerBrickSet__Group_13__0__Impl rule__PlayerBrickSet__Group_13__1
            {
            pushFollow(FOLLOW_23);
            rule__PlayerBrickSet__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerBrickSet__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group_13__0"


    // $ANTLR start "rule__PlayerBrickSet__Group_13__0__Impl"
    // InternalBoardgameDL.g:2121:1: rule__PlayerBrickSet__Group_13__0__Impl : ( ',' ) ;
    public final void rule__PlayerBrickSet__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2125:1: ( ( ',' ) )
            // InternalBoardgameDL.g:2126:1: ( ',' )
            {
            // InternalBoardgameDL.g:2126:1: ( ',' )
            // InternalBoardgameDL.g:2127:2: ','
            {
             before(grammarAccess.getPlayerBrickSetAccess().getCommaKeyword_13_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPlayerBrickSetAccess().getCommaKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group_13__0__Impl"


    // $ANTLR start "rule__PlayerBrickSet__Group_13__1"
    // InternalBoardgameDL.g:2136:1: rule__PlayerBrickSet__Group_13__1 : rule__PlayerBrickSet__Group_13__1__Impl ;
    public final void rule__PlayerBrickSet__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2140:1: ( rule__PlayerBrickSet__Group_13__1__Impl )
            // InternalBoardgameDL.g:2141:2: rule__PlayerBrickSet__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlayerBrickSet__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group_13__1"


    // $ANTLR start "rule__PlayerBrickSet__Group_13__1__Impl"
    // InternalBoardgameDL.g:2147:1: rule__PlayerBrickSet__Group_13__1__Impl : ( ( rule__PlayerBrickSet__BrickAssignment_13_1 ) ) ;
    public final void rule__PlayerBrickSet__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2151:1: ( ( ( rule__PlayerBrickSet__BrickAssignment_13_1 ) ) )
            // InternalBoardgameDL.g:2152:1: ( ( rule__PlayerBrickSet__BrickAssignment_13_1 ) )
            {
            // InternalBoardgameDL.g:2152:1: ( ( rule__PlayerBrickSet__BrickAssignment_13_1 ) )
            // InternalBoardgameDL.g:2153:2: ( rule__PlayerBrickSet__BrickAssignment_13_1 )
            {
             before(grammarAccess.getPlayerBrickSetAccess().getBrickAssignment_13_1()); 
            // InternalBoardgameDL.g:2154:2: ( rule__PlayerBrickSet__BrickAssignment_13_1 )
            // InternalBoardgameDL.g:2154:3: rule__PlayerBrickSet__BrickAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__PlayerBrickSet__BrickAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getPlayerBrickSetAccess().getBrickAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__Group_13__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalBoardgameDL.g:2163:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2167:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalBoardgameDL.g:2168:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalBoardgameDL.g:2175:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2179:1: ( ( ( '-' )? ) )
            // InternalBoardgameDL.g:2180:1: ( ( '-' )? )
            {
            // InternalBoardgameDL.g:2180:1: ( ( '-' )? )
            // InternalBoardgameDL.g:2181:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalBoardgameDL.g:2182:2: ( '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBoardgameDL.g:2182:3: '-'
                    {
                    match(input,30,FOLLOW_2); 

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
    // InternalBoardgameDL.g:2190:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2194:1: ( rule__EInt__Group__1__Impl )
            // InternalBoardgameDL.g:2195:2: rule__EInt__Group__1__Impl
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
    // InternalBoardgameDL.g:2201:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2205:1: ( ( RULE_INT ) )
            // InternalBoardgameDL.g:2206:1: ( RULE_INT )
            {
            // InternalBoardgameDL.g:2206:1: ( RULE_INT )
            // InternalBoardgameDL.g:2207:2: RULE_INT
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
    // InternalBoardgameDL.g:2217:1: rule__ValidMove__Group__0 : rule__ValidMove__Group__0__Impl rule__ValidMove__Group__1 ;
    public final void rule__ValidMove__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2221:1: ( rule__ValidMove__Group__0__Impl rule__ValidMove__Group__1 )
            // InternalBoardgameDL.g:2222:2: rule__ValidMove__Group__0__Impl rule__ValidMove__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalBoardgameDL.g:2229:1: rule__ValidMove__Group__0__Impl : ( 'ValidMove' ) ;
    public final void rule__ValidMove__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2233:1: ( ( 'ValidMove' ) )
            // InternalBoardgameDL.g:2234:1: ( 'ValidMove' )
            {
            // InternalBoardgameDL.g:2234:1: ( 'ValidMove' )
            // InternalBoardgameDL.g:2235:2: 'ValidMove'
            {
             before(grammarAccess.getValidMoveAccess().getValidMoveKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBoardgameDL.g:2244:1: rule__ValidMove__Group__1 : rule__ValidMove__Group__1__Impl rule__ValidMove__Group__2 ;
    public final void rule__ValidMove__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2248:1: ( rule__ValidMove__Group__1__Impl rule__ValidMove__Group__2 )
            // InternalBoardgameDL.g:2249:2: rule__ValidMove__Group__1__Impl rule__ValidMove__Group__2
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
    // InternalBoardgameDL.g:2256:1: rule__ValidMove__Group__1__Impl : ( '{' ) ;
    public final void rule__ValidMove__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2260:1: ( ( '{' ) )
            // InternalBoardgameDL.g:2261:1: ( '{' )
            {
            // InternalBoardgameDL.g:2261:1: ( '{' )
            // InternalBoardgameDL.g:2262:2: '{'
            {
             before(grammarAccess.getValidMoveAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalBoardgameDL.g:2271:1: rule__ValidMove__Group__2 : rule__ValidMove__Group__2__Impl rule__ValidMove__Group__3 ;
    public final void rule__ValidMove__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2275:1: ( rule__ValidMove__Group__2__Impl rule__ValidMove__Group__3 )
            // InternalBoardgameDL.g:2276:2: rule__ValidMove__Group__2__Impl rule__ValidMove__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalBoardgameDL.g:2283:1: rule__ValidMove__Group__2__Impl : ( 'Name' ) ;
    public final void rule__ValidMove__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2287:1: ( ( 'Name' ) )
            // InternalBoardgameDL.g:2288:1: ( 'Name' )
            {
            // InternalBoardgameDL.g:2288:1: ( 'Name' )
            // InternalBoardgameDL.g:2289:2: 'Name'
            {
             before(grammarAccess.getValidMoveAccess().getNameKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getValidMoveAccess().getNameKeyword_2()); 

            }


            }

        }
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
    // InternalBoardgameDL.g:2298:1: rule__ValidMove__Group__3 : rule__ValidMove__Group__3__Impl rule__ValidMove__Group__4 ;
    public final void rule__ValidMove__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2302:1: ( rule__ValidMove__Group__3__Impl rule__ValidMove__Group__4 )
            // InternalBoardgameDL.g:2303:2: rule__ValidMove__Group__3__Impl rule__ValidMove__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalBoardgameDL.g:2310:1: rule__ValidMove__Group__3__Impl : ( ( rule__ValidMove__NameAssignment_3 ) ) ;
    public final void rule__ValidMove__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2314:1: ( ( ( rule__ValidMove__NameAssignment_3 ) ) )
            // InternalBoardgameDL.g:2315:1: ( ( rule__ValidMove__NameAssignment_3 ) )
            {
            // InternalBoardgameDL.g:2315:1: ( ( rule__ValidMove__NameAssignment_3 ) )
            // InternalBoardgameDL.g:2316:2: ( rule__ValidMove__NameAssignment_3 )
            {
             before(grammarAccess.getValidMoveAccess().getNameAssignment_3()); 
            // InternalBoardgameDL.g:2317:2: ( rule__ValidMove__NameAssignment_3 )
            // InternalBoardgameDL.g:2317:3: rule__ValidMove__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ValidMove__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getValidMoveAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalBoardgameDL.g:2325:1: rule__ValidMove__Group__4 : rule__ValidMove__Group__4__Impl rule__ValidMove__Group__5 ;
    public final void rule__ValidMove__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2329:1: ( rule__ValidMove__Group__4__Impl rule__ValidMove__Group__5 )
            // InternalBoardgameDL.g:2330:2: rule__ValidMove__Group__4__Impl rule__ValidMove__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalBoardgameDL.g:2337:1: rule__ValidMove__Group__4__Impl : ( ( rule__ValidMove__Group_4__0 )? ) ;
    public final void rule__ValidMove__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2341:1: ( ( ( rule__ValidMove__Group_4__0 )? ) )
            // InternalBoardgameDL.g:2342:1: ( ( rule__ValidMove__Group_4__0 )? )
            {
            // InternalBoardgameDL.g:2342:1: ( ( rule__ValidMove__Group_4__0 )? )
            // InternalBoardgameDL.g:2343:2: ( rule__ValidMove__Group_4__0 )?
            {
             before(grammarAccess.getValidMoveAccess().getGroup_4()); 
            // InternalBoardgameDL.g:2344:2: ( rule__ValidMove__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBoardgameDL.g:2344:3: rule__ValidMove__Group_4__0
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
    // InternalBoardgameDL.g:2352:1: rule__ValidMove__Group__5 : rule__ValidMove__Group__5__Impl rule__ValidMove__Group__6 ;
    public final void rule__ValidMove__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2356:1: ( rule__ValidMove__Group__5__Impl rule__ValidMove__Group__6 )
            // InternalBoardgameDL.g:2357:2: rule__ValidMove__Group__5__Impl rule__ValidMove__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__ValidMove__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidMove__Group__6();

            state._fsp--;


            }

        }
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
    // InternalBoardgameDL.g:2364:1: rule__ValidMove__Group__5__Impl : ( ( rule__ValidMove__Group_5__0 )? ) ;
    public final void rule__ValidMove__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2368:1: ( ( ( rule__ValidMove__Group_5__0 )? ) )
            // InternalBoardgameDL.g:2369:1: ( ( rule__ValidMove__Group_5__0 )? )
            {
            // InternalBoardgameDL.g:2369:1: ( ( rule__ValidMove__Group_5__0 )? )
            // InternalBoardgameDL.g:2370:2: ( rule__ValidMove__Group_5__0 )?
            {
             before(grammarAccess.getValidMoveAccess().getGroup_5()); 
            // InternalBoardgameDL.g:2371:2: ( rule__ValidMove__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBoardgameDL.g:2371:3: rule__ValidMove__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ValidMove__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getValidMoveAccess().getGroup_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__ValidMove__Group__6"
    // InternalBoardgameDL.g:2379:1: rule__ValidMove__Group__6 : rule__ValidMove__Group__6__Impl ;
    public final void rule__ValidMove__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2383:1: ( rule__ValidMove__Group__6__Impl )
            // InternalBoardgameDL.g:2384:2: rule__ValidMove__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValidMove__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group__6"


    // $ANTLR start "rule__ValidMove__Group__6__Impl"
    // InternalBoardgameDL.g:2390:1: rule__ValidMove__Group__6__Impl : ( '}' ) ;
    public final void rule__ValidMove__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2394:1: ( ( '}' ) )
            // InternalBoardgameDL.g:2395:1: ( '}' )
            {
            // InternalBoardgameDL.g:2395:1: ( '}' )
            // InternalBoardgameDL.g:2396:2: '}'
            {
             before(grammarAccess.getValidMoveAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getValidMoveAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group__6__Impl"


    // $ANTLR start "rule__ValidMove__Group_4__0"
    // InternalBoardgameDL.g:2406:1: rule__ValidMove__Group_4__0 : rule__ValidMove__Group_4__0__Impl rule__ValidMove__Group_4__1 ;
    public final void rule__ValidMove__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2410:1: ( rule__ValidMove__Group_4__0__Impl rule__ValidMove__Group_4__1 )
            // InternalBoardgameDL.g:2411:2: rule__ValidMove__Group_4__0__Impl rule__ValidMove__Group_4__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBoardgameDL.g:2418:1: rule__ValidMove__Group_4__0__Impl : ( 'brickchange' ) ;
    public final void rule__ValidMove__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2422:1: ( ( 'brickchange' ) )
            // InternalBoardgameDL.g:2423:1: ( 'brickchange' )
            {
            // InternalBoardgameDL.g:2423:1: ( 'brickchange' )
            // InternalBoardgameDL.g:2424:2: 'brickchange'
            {
             before(grammarAccess.getValidMoveAccess().getBrickchangeKeyword_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getValidMoveAccess().getBrickchangeKeyword_4_0()); 

            }


            }

        }
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
    // InternalBoardgameDL.g:2433:1: rule__ValidMove__Group_4__1 : rule__ValidMove__Group_4__1__Impl rule__ValidMove__Group_4__2 ;
    public final void rule__ValidMove__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2437:1: ( rule__ValidMove__Group_4__1__Impl rule__ValidMove__Group_4__2 )
            // InternalBoardgameDL.g:2438:2: rule__ValidMove__Group_4__1__Impl rule__ValidMove__Group_4__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalBoardgameDL.g:2445:1: rule__ValidMove__Group_4__1__Impl : ( '(' ) ;
    public final void rule__ValidMove__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2449:1: ( ( '(' ) )
            // InternalBoardgameDL.g:2450:1: ( '(' )
            {
            // InternalBoardgameDL.g:2450:1: ( '(' )
            // InternalBoardgameDL.g:2451:2: '('
            {
             before(grammarAccess.getValidMoveAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getValidMoveAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
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
    // InternalBoardgameDL.g:2460:1: rule__ValidMove__Group_4__2 : rule__ValidMove__Group_4__2__Impl rule__ValidMove__Group_4__3 ;
    public final void rule__ValidMove__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2464:1: ( rule__ValidMove__Group_4__2__Impl rule__ValidMove__Group_4__3 )
            // InternalBoardgameDL.g:2465:2: rule__ValidMove__Group_4__2__Impl rule__ValidMove__Group_4__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalBoardgameDL.g:2472:1: rule__ValidMove__Group_4__2__Impl : ( ( rule__ValidMove__BrickchangeAssignment_4_2 ) ) ;
    public final void rule__ValidMove__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2476:1: ( ( ( rule__ValidMove__BrickchangeAssignment_4_2 ) ) )
            // InternalBoardgameDL.g:2477:1: ( ( rule__ValidMove__BrickchangeAssignment_4_2 ) )
            {
            // InternalBoardgameDL.g:2477:1: ( ( rule__ValidMove__BrickchangeAssignment_4_2 ) )
            // InternalBoardgameDL.g:2478:2: ( rule__ValidMove__BrickchangeAssignment_4_2 )
            {
             before(grammarAccess.getValidMoveAccess().getBrickchangeAssignment_4_2()); 
            // InternalBoardgameDL.g:2479:2: ( rule__ValidMove__BrickchangeAssignment_4_2 )
            // InternalBoardgameDL.g:2479:3: rule__ValidMove__BrickchangeAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ValidMove__BrickchangeAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getValidMoveAccess().getBrickchangeAssignment_4_2()); 

            }


            }

        }
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
    // InternalBoardgameDL.g:2487:1: rule__ValidMove__Group_4__3 : rule__ValidMove__Group_4__3__Impl rule__ValidMove__Group_4__4 ;
    public final void rule__ValidMove__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2491:1: ( rule__ValidMove__Group_4__3__Impl rule__ValidMove__Group_4__4 )
            // InternalBoardgameDL.g:2492:2: rule__ValidMove__Group_4__3__Impl rule__ValidMove__Group_4__4
            {
            pushFollow(FOLLOW_16);
            rule__ValidMove__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidMove__Group_4__4();

            state._fsp--;


            }

        }
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
    // InternalBoardgameDL.g:2499:1: rule__ValidMove__Group_4__3__Impl : ( ( rule__ValidMove__Group_4_3__0 )* ) ;
    public final void rule__ValidMove__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2503:1: ( ( ( rule__ValidMove__Group_4_3__0 )* ) )
            // InternalBoardgameDL.g:2504:1: ( ( rule__ValidMove__Group_4_3__0 )* )
            {
            // InternalBoardgameDL.g:2504:1: ( ( rule__ValidMove__Group_4_3__0 )* )
            // InternalBoardgameDL.g:2505:2: ( rule__ValidMove__Group_4_3__0 )*
            {
             before(grammarAccess.getValidMoveAccess().getGroup_4_3()); 
            // InternalBoardgameDL.g:2506:2: ( rule__ValidMove__Group_4_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBoardgameDL.g:2506:3: rule__ValidMove__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ValidMove__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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


    // $ANTLR start "rule__ValidMove__Group_4__4"
    // InternalBoardgameDL.g:2514:1: rule__ValidMove__Group_4__4 : rule__ValidMove__Group_4__4__Impl ;
    public final void rule__ValidMove__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2518:1: ( rule__ValidMove__Group_4__4__Impl )
            // InternalBoardgameDL.g:2519:2: rule__ValidMove__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValidMove__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group_4__4"


    // $ANTLR start "rule__ValidMove__Group_4__4__Impl"
    // InternalBoardgameDL.g:2525:1: rule__ValidMove__Group_4__4__Impl : ( ')' ) ;
    public final void rule__ValidMove__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2529:1: ( ( ')' ) )
            // InternalBoardgameDL.g:2530:1: ( ')' )
            {
            // InternalBoardgameDL.g:2530:1: ( ')' )
            // InternalBoardgameDL.g:2531:2: ')'
            {
             before(grammarAccess.getValidMoveAccess().getRightParenthesisKeyword_4_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getValidMoveAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group_4__4__Impl"


    // $ANTLR start "rule__ValidMove__Group_4_3__0"
    // InternalBoardgameDL.g:2541:1: rule__ValidMove__Group_4_3__0 : rule__ValidMove__Group_4_3__0__Impl rule__ValidMove__Group_4_3__1 ;
    public final void rule__ValidMove__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2545:1: ( rule__ValidMove__Group_4_3__0__Impl rule__ValidMove__Group_4_3__1 )
            // InternalBoardgameDL.g:2546:2: rule__ValidMove__Group_4_3__0__Impl rule__ValidMove__Group_4_3__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalBoardgameDL.g:2553:1: rule__ValidMove__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__ValidMove__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2557:1: ( ( ',' ) )
            // InternalBoardgameDL.g:2558:1: ( ',' )
            {
            // InternalBoardgameDL.g:2558:1: ( ',' )
            // InternalBoardgameDL.g:2559:2: ','
            {
             before(grammarAccess.getValidMoveAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getValidMoveAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
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
    // InternalBoardgameDL.g:2568:1: rule__ValidMove__Group_4_3__1 : rule__ValidMove__Group_4_3__1__Impl ;
    public final void rule__ValidMove__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2572:1: ( rule__ValidMove__Group_4_3__1__Impl )
            // InternalBoardgameDL.g:2573:2: rule__ValidMove__Group_4_3__1__Impl
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
    // InternalBoardgameDL.g:2579:1: rule__ValidMove__Group_4_3__1__Impl : ( ( rule__ValidMove__BrickchangeAssignment_4_3_1 ) ) ;
    public final void rule__ValidMove__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2583:1: ( ( ( rule__ValidMove__BrickchangeAssignment_4_3_1 ) ) )
            // InternalBoardgameDL.g:2584:1: ( ( rule__ValidMove__BrickchangeAssignment_4_3_1 ) )
            {
            // InternalBoardgameDL.g:2584:1: ( ( rule__ValidMove__BrickchangeAssignment_4_3_1 ) )
            // InternalBoardgameDL.g:2585:2: ( rule__ValidMove__BrickchangeAssignment_4_3_1 )
            {
             before(grammarAccess.getValidMoveAccess().getBrickchangeAssignment_4_3_1()); 
            // InternalBoardgameDL.g:2586:2: ( rule__ValidMove__BrickchangeAssignment_4_3_1 )
            // InternalBoardgameDL.g:2586:3: rule__ValidMove__BrickchangeAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ValidMove__BrickchangeAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getValidMoveAccess().getBrickchangeAssignment_4_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ValidMove__Group_5__0"
    // InternalBoardgameDL.g:2595:1: rule__ValidMove__Group_5__0 : rule__ValidMove__Group_5__0__Impl rule__ValidMove__Group_5__1 ;
    public final void rule__ValidMove__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2599:1: ( rule__ValidMove__Group_5__0__Impl rule__ValidMove__Group_5__1 )
            // InternalBoardgameDL.g:2600:2: rule__ValidMove__Group_5__0__Impl rule__ValidMove__Group_5__1
            {
            pushFollow(FOLLOW_15);
            rule__ValidMove__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidMove__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group_5__0"


    // $ANTLR start "rule__ValidMove__Group_5__0__Impl"
    // InternalBoardgameDL.g:2607:1: rule__ValidMove__Group_5__0__Impl : ( 'cellchange' ) ;
    public final void rule__ValidMove__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2611:1: ( ( 'cellchange' ) )
            // InternalBoardgameDL.g:2612:1: ( 'cellchange' )
            {
            // InternalBoardgameDL.g:2612:1: ( 'cellchange' )
            // InternalBoardgameDL.g:2613:2: 'cellchange'
            {
             before(grammarAccess.getValidMoveAccess().getCellchangeKeyword_5_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getValidMoveAccess().getCellchangeKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group_5__0__Impl"


    // $ANTLR start "rule__ValidMove__Group_5__1"
    // InternalBoardgameDL.g:2622:1: rule__ValidMove__Group_5__1 : rule__ValidMove__Group_5__1__Impl rule__ValidMove__Group_5__2 ;
    public final void rule__ValidMove__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2626:1: ( rule__ValidMove__Group_5__1__Impl rule__ValidMove__Group_5__2 )
            // InternalBoardgameDL.g:2627:2: rule__ValidMove__Group_5__1__Impl rule__ValidMove__Group_5__2
            {
            pushFollow(FOLLOW_10);
            rule__ValidMove__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidMove__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group_5__1"


    // $ANTLR start "rule__ValidMove__Group_5__1__Impl"
    // InternalBoardgameDL.g:2634:1: rule__ValidMove__Group_5__1__Impl : ( '(' ) ;
    public final void rule__ValidMove__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2638:1: ( ( '(' ) )
            // InternalBoardgameDL.g:2639:1: ( '(' )
            {
            // InternalBoardgameDL.g:2639:1: ( '(' )
            // InternalBoardgameDL.g:2640:2: '('
            {
             before(grammarAccess.getValidMoveAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getValidMoveAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group_5__1__Impl"


    // $ANTLR start "rule__ValidMove__Group_5__2"
    // InternalBoardgameDL.g:2649:1: rule__ValidMove__Group_5__2 : rule__ValidMove__Group_5__2__Impl rule__ValidMove__Group_5__3 ;
    public final void rule__ValidMove__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2653:1: ( rule__ValidMove__Group_5__2__Impl rule__ValidMove__Group_5__3 )
            // InternalBoardgameDL.g:2654:2: rule__ValidMove__Group_5__2__Impl rule__ValidMove__Group_5__3
            {
            pushFollow(FOLLOW_16);
            rule__ValidMove__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidMove__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group_5__2"


    // $ANTLR start "rule__ValidMove__Group_5__2__Impl"
    // InternalBoardgameDL.g:2661:1: rule__ValidMove__Group_5__2__Impl : ( ( rule__ValidMove__CellchangeAssignment_5_2 ) ) ;
    public final void rule__ValidMove__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2665:1: ( ( ( rule__ValidMove__CellchangeAssignment_5_2 ) ) )
            // InternalBoardgameDL.g:2666:1: ( ( rule__ValidMove__CellchangeAssignment_5_2 ) )
            {
            // InternalBoardgameDL.g:2666:1: ( ( rule__ValidMove__CellchangeAssignment_5_2 ) )
            // InternalBoardgameDL.g:2667:2: ( rule__ValidMove__CellchangeAssignment_5_2 )
            {
             before(grammarAccess.getValidMoveAccess().getCellchangeAssignment_5_2()); 
            // InternalBoardgameDL.g:2668:2: ( rule__ValidMove__CellchangeAssignment_5_2 )
            // InternalBoardgameDL.g:2668:3: rule__ValidMove__CellchangeAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__ValidMove__CellchangeAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getValidMoveAccess().getCellchangeAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group_5__2__Impl"


    // $ANTLR start "rule__ValidMove__Group_5__3"
    // InternalBoardgameDL.g:2676:1: rule__ValidMove__Group_5__3 : rule__ValidMove__Group_5__3__Impl rule__ValidMove__Group_5__4 ;
    public final void rule__ValidMove__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2680:1: ( rule__ValidMove__Group_5__3__Impl rule__ValidMove__Group_5__4 )
            // InternalBoardgameDL.g:2681:2: rule__ValidMove__Group_5__3__Impl rule__ValidMove__Group_5__4
            {
            pushFollow(FOLLOW_16);
            rule__ValidMove__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidMove__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group_5__3"


    // $ANTLR start "rule__ValidMove__Group_5__3__Impl"
    // InternalBoardgameDL.g:2688:1: rule__ValidMove__Group_5__3__Impl : ( ( rule__ValidMove__Group_5_3__0 )* ) ;
    public final void rule__ValidMove__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2692:1: ( ( ( rule__ValidMove__Group_5_3__0 )* ) )
            // InternalBoardgameDL.g:2693:1: ( ( rule__ValidMove__Group_5_3__0 )* )
            {
            // InternalBoardgameDL.g:2693:1: ( ( rule__ValidMove__Group_5_3__0 )* )
            // InternalBoardgameDL.g:2694:2: ( rule__ValidMove__Group_5_3__0 )*
            {
             before(grammarAccess.getValidMoveAccess().getGroup_5_3()); 
            // InternalBoardgameDL.g:2695:2: ( rule__ValidMove__Group_5_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==15) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalBoardgameDL.g:2695:3: rule__ValidMove__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ValidMove__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getValidMoveAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group_5__3__Impl"


    // $ANTLR start "rule__ValidMove__Group_5__4"
    // InternalBoardgameDL.g:2703:1: rule__ValidMove__Group_5__4 : rule__ValidMove__Group_5__4__Impl ;
    public final void rule__ValidMove__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2707:1: ( rule__ValidMove__Group_5__4__Impl )
            // InternalBoardgameDL.g:2708:2: rule__ValidMove__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValidMove__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group_5__4"


    // $ANTLR start "rule__ValidMove__Group_5__4__Impl"
    // InternalBoardgameDL.g:2714:1: rule__ValidMove__Group_5__4__Impl : ( ')' ) ;
    public final void rule__ValidMove__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2718:1: ( ( ')' ) )
            // InternalBoardgameDL.g:2719:1: ( ')' )
            {
            // InternalBoardgameDL.g:2719:1: ( ')' )
            // InternalBoardgameDL.g:2720:2: ')'
            {
             before(grammarAccess.getValidMoveAccess().getRightParenthesisKeyword_5_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getValidMoveAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group_5__4__Impl"


    // $ANTLR start "rule__ValidMove__Group_5_3__0"
    // InternalBoardgameDL.g:2730:1: rule__ValidMove__Group_5_3__0 : rule__ValidMove__Group_5_3__0__Impl rule__ValidMove__Group_5_3__1 ;
    public final void rule__ValidMove__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2734:1: ( rule__ValidMove__Group_5_3__0__Impl rule__ValidMove__Group_5_3__1 )
            // InternalBoardgameDL.g:2735:2: rule__ValidMove__Group_5_3__0__Impl rule__ValidMove__Group_5_3__1
            {
            pushFollow(FOLLOW_10);
            rule__ValidMove__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidMove__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group_5_3__0"


    // $ANTLR start "rule__ValidMove__Group_5_3__0__Impl"
    // InternalBoardgameDL.g:2742:1: rule__ValidMove__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__ValidMove__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2746:1: ( ( ',' ) )
            // InternalBoardgameDL.g:2747:1: ( ',' )
            {
            // InternalBoardgameDL.g:2747:1: ( ',' )
            // InternalBoardgameDL.g:2748:2: ','
            {
             before(grammarAccess.getValidMoveAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getValidMoveAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group_5_3__0__Impl"


    // $ANTLR start "rule__ValidMove__Group_5_3__1"
    // InternalBoardgameDL.g:2757:1: rule__ValidMove__Group_5_3__1 : rule__ValidMove__Group_5_3__1__Impl ;
    public final void rule__ValidMove__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2761:1: ( rule__ValidMove__Group_5_3__1__Impl )
            // InternalBoardgameDL.g:2762:2: rule__ValidMove__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValidMove__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group_5_3__1"


    // $ANTLR start "rule__ValidMove__Group_5_3__1__Impl"
    // InternalBoardgameDL.g:2768:1: rule__ValidMove__Group_5_3__1__Impl : ( ( rule__ValidMove__CellchangeAssignment_5_3_1 ) ) ;
    public final void rule__ValidMove__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2772:1: ( ( ( rule__ValidMove__CellchangeAssignment_5_3_1 ) ) )
            // InternalBoardgameDL.g:2773:1: ( ( rule__ValidMove__CellchangeAssignment_5_3_1 ) )
            {
            // InternalBoardgameDL.g:2773:1: ( ( rule__ValidMove__CellchangeAssignment_5_3_1 ) )
            // InternalBoardgameDL.g:2774:2: ( rule__ValidMove__CellchangeAssignment_5_3_1 )
            {
             before(grammarAccess.getValidMoveAccess().getCellchangeAssignment_5_3_1()); 
            // InternalBoardgameDL.g:2775:2: ( rule__ValidMove__CellchangeAssignment_5_3_1 )
            // InternalBoardgameDL.g:2775:3: rule__ValidMove__CellchangeAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ValidMove__CellchangeAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getValidMoveAccess().getCellchangeAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__Group_5_3__1__Impl"


    // $ANTLR start "rule__Brick__Group__0"
    // InternalBoardgameDL.g:2784:1: rule__Brick__Group__0 : rule__Brick__Group__0__Impl rule__Brick__Group__1 ;
    public final void rule__Brick__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2788:1: ( rule__Brick__Group__0__Impl rule__Brick__Group__1 )
            // InternalBoardgameDL.g:2789:2: rule__Brick__Group__0__Impl rule__Brick__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Brick__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Brick__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group__0"


    // $ANTLR start "rule__Brick__Group__0__Impl"
    // InternalBoardgameDL.g:2796:1: rule__Brick__Group__0__Impl : ( 'Brick' ) ;
    public final void rule__Brick__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2800:1: ( ( 'Brick' ) )
            // InternalBoardgameDL.g:2801:1: ( 'Brick' )
            {
            // InternalBoardgameDL.g:2801:1: ( 'Brick' )
            // InternalBoardgameDL.g:2802:2: 'Brick'
            {
             before(grammarAccess.getBrickAccess().getBrickKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBrickAccess().getBrickKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group__0__Impl"


    // $ANTLR start "rule__Brick__Group__1"
    // InternalBoardgameDL.g:2811:1: rule__Brick__Group__1 : rule__Brick__Group__1__Impl rule__Brick__Group__2 ;
    public final void rule__Brick__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2815:1: ( rule__Brick__Group__1__Impl rule__Brick__Group__2 )
            // InternalBoardgameDL.g:2816:2: rule__Brick__Group__1__Impl rule__Brick__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Brick__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Brick__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group__1"


    // $ANTLR start "rule__Brick__Group__1__Impl"
    // InternalBoardgameDL.g:2823:1: rule__Brick__Group__1__Impl : ( '{' ) ;
    public final void rule__Brick__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2827:1: ( ( '{' ) )
            // InternalBoardgameDL.g:2828:1: ( '{' )
            {
            // InternalBoardgameDL.g:2828:1: ( '{' )
            // InternalBoardgameDL.g:2829:2: '{'
            {
             before(grammarAccess.getBrickAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getBrickAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group__1__Impl"


    // $ANTLR start "rule__Brick__Group__2"
    // InternalBoardgameDL.g:2838:1: rule__Brick__Group__2 : rule__Brick__Group__2__Impl rule__Brick__Group__3 ;
    public final void rule__Brick__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2842:1: ( rule__Brick__Group__2__Impl rule__Brick__Group__3 )
            // InternalBoardgameDL.g:2843:2: rule__Brick__Group__2__Impl rule__Brick__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Brick__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Brick__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group__2"


    // $ANTLR start "rule__Brick__Group__2__Impl"
    // InternalBoardgameDL.g:2850:1: rule__Brick__Group__2__Impl : ( 'bricktype' ) ;
    public final void rule__Brick__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2854:1: ( ( 'bricktype' ) )
            // InternalBoardgameDL.g:2855:1: ( 'bricktype' )
            {
            // InternalBoardgameDL.g:2855:1: ( 'bricktype' )
            // InternalBoardgameDL.g:2856:2: 'bricktype'
            {
             before(grammarAccess.getBrickAccess().getBricktypeKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBrickAccess().getBricktypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group__2__Impl"


    // $ANTLR start "rule__Brick__Group__3"
    // InternalBoardgameDL.g:2865:1: rule__Brick__Group__3 : rule__Brick__Group__3__Impl rule__Brick__Group__4 ;
    public final void rule__Brick__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2869:1: ( rule__Brick__Group__3__Impl rule__Brick__Group__4 )
            // InternalBoardgameDL.g:2870:2: rule__Brick__Group__3__Impl rule__Brick__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Brick__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Brick__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group__3"


    // $ANTLR start "rule__Brick__Group__3__Impl"
    // InternalBoardgameDL.g:2877:1: rule__Brick__Group__3__Impl : ( ( rule__Brick__BricktypeAssignment_3 ) ) ;
    public final void rule__Brick__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2881:1: ( ( ( rule__Brick__BricktypeAssignment_3 ) ) )
            // InternalBoardgameDL.g:2882:1: ( ( rule__Brick__BricktypeAssignment_3 ) )
            {
            // InternalBoardgameDL.g:2882:1: ( ( rule__Brick__BricktypeAssignment_3 ) )
            // InternalBoardgameDL.g:2883:2: ( rule__Brick__BricktypeAssignment_3 )
            {
             before(grammarAccess.getBrickAccess().getBricktypeAssignment_3()); 
            // InternalBoardgameDL.g:2884:2: ( rule__Brick__BricktypeAssignment_3 )
            // InternalBoardgameDL.g:2884:3: rule__Brick__BricktypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Brick__BricktypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBrickAccess().getBricktypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group__3__Impl"


    // $ANTLR start "rule__Brick__Group__4"
    // InternalBoardgameDL.g:2892:1: rule__Brick__Group__4 : rule__Brick__Group__4__Impl rule__Brick__Group__5 ;
    public final void rule__Brick__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2896:1: ( rule__Brick__Group__4__Impl rule__Brick__Group__5 )
            // InternalBoardgameDL.g:2897:2: rule__Brick__Group__4__Impl rule__Brick__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Brick__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Brick__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group__4"


    // $ANTLR start "rule__Brick__Group__4__Impl"
    // InternalBoardgameDL.g:2904:1: rule__Brick__Group__4__Impl : ( ( rule__Brick__Group_4__0 )? ) ;
    public final void rule__Brick__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2908:1: ( ( ( rule__Brick__Group_4__0 )? ) )
            // InternalBoardgameDL.g:2909:1: ( ( rule__Brick__Group_4__0 )? )
            {
            // InternalBoardgameDL.g:2909:1: ( ( rule__Brick__Group_4__0 )? )
            // InternalBoardgameDL.g:2910:2: ( rule__Brick__Group_4__0 )?
            {
             before(grammarAccess.getBrickAccess().getGroup_4()); 
            // InternalBoardgameDL.g:2911:2: ( rule__Brick__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBoardgameDL.g:2911:3: rule__Brick__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Brick__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBrickAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group__4__Impl"


    // $ANTLR start "rule__Brick__Group__5"
    // InternalBoardgameDL.g:2919:1: rule__Brick__Group__5 : rule__Brick__Group__5__Impl ;
    public final void rule__Brick__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2923:1: ( rule__Brick__Group__5__Impl )
            // InternalBoardgameDL.g:2924:2: rule__Brick__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Brick__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group__5"


    // $ANTLR start "rule__Brick__Group__5__Impl"
    // InternalBoardgameDL.g:2930:1: rule__Brick__Group__5__Impl : ( '}' ) ;
    public final void rule__Brick__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2934:1: ( ( '}' ) )
            // InternalBoardgameDL.g:2935:1: ( '}' )
            {
            // InternalBoardgameDL.g:2935:1: ( '}' )
            // InternalBoardgameDL.g:2936:2: '}'
            {
             before(grammarAccess.getBrickAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBrickAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group__5__Impl"


    // $ANTLR start "rule__Brick__Group_4__0"
    // InternalBoardgameDL.g:2946:1: rule__Brick__Group_4__0 : rule__Brick__Group_4__0__Impl rule__Brick__Group_4__1 ;
    public final void rule__Brick__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2950:1: ( rule__Brick__Group_4__0__Impl rule__Brick__Group_4__1 )
            // InternalBoardgameDL.g:2951:2: rule__Brick__Group_4__0__Impl rule__Brick__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__Brick__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Brick__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_4__0"


    // $ANTLR start "rule__Brick__Group_4__0__Impl"
    // InternalBoardgameDL.g:2958:1: rule__Brick__Group_4__0__Impl : ( 'startCell' ) ;
    public final void rule__Brick__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2962:1: ( ( 'startCell' ) )
            // InternalBoardgameDL.g:2963:1: ( 'startCell' )
            {
            // InternalBoardgameDL.g:2963:1: ( 'startCell' )
            // InternalBoardgameDL.g:2964:2: 'startCell'
            {
             before(grammarAccess.getBrickAccess().getStartCellKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getBrickAccess().getStartCellKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_4__0__Impl"


    // $ANTLR start "rule__Brick__Group_4__1"
    // InternalBoardgameDL.g:2973:1: rule__Brick__Group_4__1 : rule__Brick__Group_4__1__Impl ;
    public final void rule__Brick__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2977:1: ( rule__Brick__Group_4__1__Impl )
            // InternalBoardgameDL.g:2978:2: rule__Brick__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Brick__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_4__1"


    // $ANTLR start "rule__Brick__Group_4__1__Impl"
    // InternalBoardgameDL.g:2984:1: rule__Brick__Group_4__1__Impl : ( ( rule__Brick__StartCellAssignment_4_1 ) ) ;
    public final void rule__Brick__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:2988:1: ( ( ( rule__Brick__StartCellAssignment_4_1 ) ) )
            // InternalBoardgameDL.g:2989:1: ( ( rule__Brick__StartCellAssignment_4_1 ) )
            {
            // InternalBoardgameDL.g:2989:1: ( ( rule__Brick__StartCellAssignment_4_1 ) )
            // InternalBoardgameDL.g:2990:2: ( rule__Brick__StartCellAssignment_4_1 )
            {
             before(grammarAccess.getBrickAccess().getStartCellAssignment_4_1()); 
            // InternalBoardgameDL.g:2991:2: ( rule__Brick__StartCellAssignment_4_1 )
            // InternalBoardgameDL.g:2991:3: rule__Brick__StartCellAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Brick__StartCellAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBrickAccess().getStartCellAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_4__1__Impl"


    // $ANTLR start "rule__LineElement__Group__0"
    // InternalBoardgameDL.g:3000:1: rule__LineElement__Group__0 : rule__LineElement__Group__0__Impl rule__LineElement__Group__1 ;
    public final void rule__LineElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3004:1: ( rule__LineElement__Group__0__Impl rule__LineElement__Group__1 )
            // InternalBoardgameDL.g:3005:2: rule__LineElement__Group__0__Impl rule__LineElement__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__LineElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group__0"


    // $ANTLR start "rule__LineElement__Group__0__Impl"
    // InternalBoardgameDL.g:3012:1: rule__LineElement__Group__0__Impl : ( () ) ;
    public final void rule__LineElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3016:1: ( ( () ) )
            // InternalBoardgameDL.g:3017:1: ( () )
            {
            // InternalBoardgameDL.g:3017:1: ( () )
            // InternalBoardgameDL.g:3018:2: ()
            {
             before(grammarAccess.getLineElementAccess().getLineElementAction_0()); 
            // InternalBoardgameDL.g:3019:2: ()
            // InternalBoardgameDL.g:3019:3: 
            {
            }

             after(grammarAccess.getLineElementAccess().getLineElementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group__0__Impl"


    // $ANTLR start "rule__LineElement__Group__1"
    // InternalBoardgameDL.g:3027:1: rule__LineElement__Group__1 : rule__LineElement__Group__1__Impl rule__LineElement__Group__2 ;
    public final void rule__LineElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3031:1: ( rule__LineElement__Group__1__Impl rule__LineElement__Group__2 )
            // InternalBoardgameDL.g:3032:2: rule__LineElement__Group__1__Impl rule__LineElement__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__LineElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group__1"


    // $ANTLR start "rule__LineElement__Group__1__Impl"
    // InternalBoardgameDL.g:3039:1: rule__LineElement__Group__1__Impl : ( 'LineElement' ) ;
    public final void rule__LineElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3043:1: ( ( 'LineElement' ) )
            // InternalBoardgameDL.g:3044:1: ( 'LineElement' )
            {
            // InternalBoardgameDL.g:3044:1: ( 'LineElement' )
            // InternalBoardgameDL.g:3045:2: 'LineElement'
            {
             before(grammarAccess.getLineElementAccess().getLineElementKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getLineElementAccess().getLineElementKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group__1__Impl"


    // $ANTLR start "rule__LineElement__Group__2"
    // InternalBoardgameDL.g:3054:1: rule__LineElement__Group__2 : rule__LineElement__Group__2__Impl rule__LineElement__Group__3 ;
    public final void rule__LineElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3058:1: ( rule__LineElement__Group__2__Impl rule__LineElement__Group__3 )
            // InternalBoardgameDL.g:3059:2: rule__LineElement__Group__2__Impl rule__LineElement__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__LineElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group__2"


    // $ANTLR start "rule__LineElement__Group__2__Impl"
    // InternalBoardgameDL.g:3066:1: rule__LineElement__Group__2__Impl : ( '{' ) ;
    public final void rule__LineElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3070:1: ( ( '{' ) )
            // InternalBoardgameDL.g:3071:1: ( '{' )
            {
            // InternalBoardgameDL.g:3071:1: ( '{' )
            // InternalBoardgameDL.g:3072:2: '{'
            {
             before(grammarAccess.getLineElementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLineElementAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group__2__Impl"


    // $ANTLR start "rule__LineElement__Group__3"
    // InternalBoardgameDL.g:3081:1: rule__LineElement__Group__3 : rule__LineElement__Group__3__Impl rule__LineElement__Group__4 ;
    public final void rule__LineElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3085:1: ( rule__LineElement__Group__3__Impl rule__LineElement__Group__4 )
            // InternalBoardgameDL.g:3086:2: rule__LineElement__Group__3__Impl rule__LineElement__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__LineElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineElement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group__3"


    // $ANTLR start "rule__LineElement__Group__3__Impl"
    // InternalBoardgameDL.g:3093:1: rule__LineElement__Group__3__Impl : ( ( rule__LineElement__Group_3__0 )? ) ;
    public final void rule__LineElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3097:1: ( ( ( rule__LineElement__Group_3__0 )? ) )
            // InternalBoardgameDL.g:3098:1: ( ( rule__LineElement__Group_3__0 )? )
            {
            // InternalBoardgameDL.g:3098:1: ( ( rule__LineElement__Group_3__0 )? )
            // InternalBoardgameDL.g:3099:2: ( rule__LineElement__Group_3__0 )?
            {
             before(grammarAccess.getLineElementAccess().getGroup_3()); 
            // InternalBoardgameDL.g:3100:2: ( rule__LineElement__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==38) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBoardgameDL.g:3100:3: rule__LineElement__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LineElement__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineElementAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group__3__Impl"


    // $ANTLR start "rule__LineElement__Group__4"
    // InternalBoardgameDL.g:3108:1: rule__LineElement__Group__4 : rule__LineElement__Group__4__Impl rule__LineElement__Group__5 ;
    public final void rule__LineElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3112:1: ( rule__LineElement__Group__4__Impl rule__LineElement__Group__5 )
            // InternalBoardgameDL.g:3113:2: rule__LineElement__Group__4__Impl rule__LineElement__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__LineElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineElement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group__4"


    // $ANTLR start "rule__LineElement__Group__4__Impl"
    // InternalBoardgameDL.g:3120:1: rule__LineElement__Group__4__Impl : ( ( rule__LineElement__Group_4__0 )? ) ;
    public final void rule__LineElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3124:1: ( ( ( rule__LineElement__Group_4__0 )? ) )
            // InternalBoardgameDL.g:3125:1: ( ( rule__LineElement__Group_4__0 )? )
            {
            // InternalBoardgameDL.g:3125:1: ( ( rule__LineElement__Group_4__0 )? )
            // InternalBoardgameDL.g:3126:2: ( rule__LineElement__Group_4__0 )?
            {
             before(grammarAccess.getLineElementAccess().getGroup_4()); 
            // InternalBoardgameDL.g:3127:2: ( rule__LineElement__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBoardgameDL.g:3127:3: rule__LineElement__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LineElement__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineElementAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group__4__Impl"


    // $ANTLR start "rule__LineElement__Group__5"
    // InternalBoardgameDL.g:3135:1: rule__LineElement__Group__5 : rule__LineElement__Group__5__Impl rule__LineElement__Group__6 ;
    public final void rule__LineElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3139:1: ( rule__LineElement__Group__5__Impl rule__LineElement__Group__6 )
            // InternalBoardgameDL.g:3140:2: rule__LineElement__Group__5__Impl rule__LineElement__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__LineElement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineElement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group__5"


    // $ANTLR start "rule__LineElement__Group__5__Impl"
    // InternalBoardgameDL.g:3147:1: rule__LineElement__Group__5__Impl : ( ( rule__LineElement__Group_5__0 )? ) ;
    public final void rule__LineElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3151:1: ( ( ( rule__LineElement__Group_5__0 )? ) )
            // InternalBoardgameDL.g:3152:1: ( ( rule__LineElement__Group_5__0 )? )
            {
            // InternalBoardgameDL.g:3152:1: ( ( rule__LineElement__Group_5__0 )? )
            // InternalBoardgameDL.g:3153:2: ( rule__LineElement__Group_5__0 )?
            {
             before(grammarAccess.getLineElementAccess().getGroup_5()); 
            // InternalBoardgameDL.g:3154:2: ( rule__LineElement__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==40) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBoardgameDL.g:3154:3: rule__LineElement__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LineElement__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineElementAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group__5__Impl"


    // $ANTLR start "rule__LineElement__Group__6"
    // InternalBoardgameDL.g:3162:1: rule__LineElement__Group__6 : rule__LineElement__Group__6__Impl rule__LineElement__Group__7 ;
    public final void rule__LineElement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3166:1: ( rule__LineElement__Group__6__Impl rule__LineElement__Group__7 )
            // InternalBoardgameDL.g:3167:2: rule__LineElement__Group__6__Impl rule__LineElement__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__LineElement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineElement__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group__6"


    // $ANTLR start "rule__LineElement__Group__6__Impl"
    // InternalBoardgameDL.g:3174:1: rule__LineElement__Group__6__Impl : ( ( rule__LineElement__Group_6__0 )? ) ;
    public final void rule__LineElement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3178:1: ( ( ( rule__LineElement__Group_6__0 )? ) )
            // InternalBoardgameDL.g:3179:1: ( ( rule__LineElement__Group_6__0 )? )
            {
            // InternalBoardgameDL.g:3179:1: ( ( rule__LineElement__Group_6__0 )? )
            // InternalBoardgameDL.g:3180:2: ( rule__LineElement__Group_6__0 )?
            {
             before(grammarAccess.getLineElementAccess().getGroup_6()); 
            // InternalBoardgameDL.g:3181:2: ( rule__LineElement__Group_6__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==41) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBoardgameDL.g:3181:3: rule__LineElement__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LineElement__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineElementAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group__6__Impl"


    // $ANTLR start "rule__LineElement__Group__7"
    // InternalBoardgameDL.g:3189:1: rule__LineElement__Group__7 : rule__LineElement__Group__7__Impl rule__LineElement__Group__8 ;
    public final void rule__LineElement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3193:1: ( rule__LineElement__Group__7__Impl rule__LineElement__Group__8 )
            // InternalBoardgameDL.g:3194:2: rule__LineElement__Group__7__Impl rule__LineElement__Group__8
            {
            pushFollow(FOLLOW_28);
            rule__LineElement__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineElement__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group__7"


    // $ANTLR start "rule__LineElement__Group__7__Impl"
    // InternalBoardgameDL.g:3201:1: rule__LineElement__Group__7__Impl : ( ( rule__LineElement__Group_7__0 )? ) ;
    public final void rule__LineElement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3205:1: ( ( ( rule__LineElement__Group_7__0 )? ) )
            // InternalBoardgameDL.g:3206:1: ( ( rule__LineElement__Group_7__0 )? )
            {
            // InternalBoardgameDL.g:3206:1: ( ( rule__LineElement__Group_7__0 )? )
            // InternalBoardgameDL.g:3207:2: ( rule__LineElement__Group_7__0 )?
            {
             before(grammarAccess.getLineElementAccess().getGroup_7()); 
            // InternalBoardgameDL.g:3208:2: ( rule__LineElement__Group_7__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBoardgameDL.g:3208:3: rule__LineElement__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LineElement__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineElementAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group__7__Impl"


    // $ANTLR start "rule__LineElement__Group__8"
    // InternalBoardgameDL.g:3216:1: rule__LineElement__Group__8 : rule__LineElement__Group__8__Impl ;
    public final void rule__LineElement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3220:1: ( rule__LineElement__Group__8__Impl )
            // InternalBoardgameDL.g:3221:2: rule__LineElement__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineElement__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group__8"


    // $ANTLR start "rule__LineElement__Group__8__Impl"
    // InternalBoardgameDL.g:3227:1: rule__LineElement__Group__8__Impl : ( '}' ) ;
    public final void rule__LineElement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3231:1: ( ( '}' ) )
            // InternalBoardgameDL.g:3232:1: ( '}' )
            {
            // InternalBoardgameDL.g:3232:1: ( '}' )
            // InternalBoardgameDL.g:3233:2: '}'
            {
             before(grammarAccess.getLineElementAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLineElementAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group__8__Impl"


    // $ANTLR start "rule__LineElement__Group_3__0"
    // InternalBoardgameDL.g:3243:1: rule__LineElement__Group_3__0 : rule__LineElement__Group_3__0__Impl rule__LineElement__Group_3__1 ;
    public final void rule__LineElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3247:1: ( rule__LineElement__Group_3__0__Impl rule__LineElement__Group_3__1 )
            // InternalBoardgameDL.g:3248:2: rule__LineElement__Group_3__0__Impl rule__LineElement__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__LineElement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineElement__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group_3__0"


    // $ANTLR start "rule__LineElement__Group_3__0__Impl"
    // InternalBoardgameDL.g:3255:1: rule__LineElement__Group_3__0__Impl : ( 'Position' ) ;
    public final void rule__LineElement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3259:1: ( ( 'Position' ) )
            // InternalBoardgameDL.g:3260:1: ( 'Position' )
            {
            // InternalBoardgameDL.g:3260:1: ( 'Position' )
            // InternalBoardgameDL.g:3261:2: 'Position'
            {
             before(grammarAccess.getLineElementAccess().getPositionKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLineElementAccess().getPositionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group_3__0__Impl"


    // $ANTLR start "rule__LineElement__Group_3__1"
    // InternalBoardgameDL.g:3270:1: rule__LineElement__Group_3__1 : rule__LineElement__Group_3__1__Impl ;
    public final void rule__LineElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3274:1: ( rule__LineElement__Group_3__1__Impl )
            // InternalBoardgameDL.g:3275:2: rule__LineElement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineElement__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group_3__1"


    // $ANTLR start "rule__LineElement__Group_3__1__Impl"
    // InternalBoardgameDL.g:3281:1: rule__LineElement__Group_3__1__Impl : ( ( rule__LineElement__PositionAssignment_3_1 ) ) ;
    public final void rule__LineElement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3285:1: ( ( ( rule__LineElement__PositionAssignment_3_1 ) ) )
            // InternalBoardgameDL.g:3286:1: ( ( rule__LineElement__PositionAssignment_3_1 ) )
            {
            // InternalBoardgameDL.g:3286:1: ( ( rule__LineElement__PositionAssignment_3_1 ) )
            // InternalBoardgameDL.g:3287:2: ( rule__LineElement__PositionAssignment_3_1 )
            {
             before(grammarAccess.getLineElementAccess().getPositionAssignment_3_1()); 
            // InternalBoardgameDL.g:3288:2: ( rule__LineElement__PositionAssignment_3_1 )
            // InternalBoardgameDL.g:3288:3: rule__LineElement__PositionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__LineElement__PositionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLineElementAccess().getPositionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group_3__1__Impl"


    // $ANTLR start "rule__LineElement__Group_4__0"
    // InternalBoardgameDL.g:3297:1: rule__LineElement__Group_4__0 : rule__LineElement__Group_4__0__Impl rule__LineElement__Group_4__1 ;
    public final void rule__LineElement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3301:1: ( rule__LineElement__Group_4__0__Impl rule__LineElement__Group_4__1 )
            // InternalBoardgameDL.g:3302:2: rule__LineElement__Group_4__0__Impl rule__LineElement__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__LineElement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineElement__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group_4__0"


    // $ANTLR start "rule__LineElement__Group_4__0__Impl"
    // InternalBoardgameDL.g:3309:1: rule__LineElement__Group_4__0__Impl : ( 'celltype' ) ;
    public final void rule__LineElement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3313:1: ( ( 'celltype' ) )
            // InternalBoardgameDL.g:3314:1: ( 'celltype' )
            {
            // InternalBoardgameDL.g:3314:1: ( 'celltype' )
            // InternalBoardgameDL.g:3315:2: 'celltype'
            {
             before(grammarAccess.getLineElementAccess().getCelltypeKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLineElementAccess().getCelltypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group_4__0__Impl"


    // $ANTLR start "rule__LineElement__Group_4__1"
    // InternalBoardgameDL.g:3324:1: rule__LineElement__Group_4__1 : rule__LineElement__Group_4__1__Impl ;
    public final void rule__LineElement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3328:1: ( rule__LineElement__Group_4__1__Impl )
            // InternalBoardgameDL.g:3329:2: rule__LineElement__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineElement__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group_4__1"


    // $ANTLR start "rule__LineElement__Group_4__1__Impl"
    // InternalBoardgameDL.g:3335:1: rule__LineElement__Group_4__1__Impl : ( ( rule__LineElement__CelltypeAssignment_4_1 ) ) ;
    public final void rule__LineElement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3339:1: ( ( ( rule__LineElement__CelltypeAssignment_4_1 ) ) )
            // InternalBoardgameDL.g:3340:1: ( ( rule__LineElement__CelltypeAssignment_4_1 ) )
            {
            // InternalBoardgameDL.g:3340:1: ( ( rule__LineElement__CelltypeAssignment_4_1 ) )
            // InternalBoardgameDL.g:3341:2: ( rule__LineElement__CelltypeAssignment_4_1 )
            {
             before(grammarAccess.getLineElementAccess().getCelltypeAssignment_4_1()); 
            // InternalBoardgameDL.g:3342:2: ( rule__LineElement__CelltypeAssignment_4_1 )
            // InternalBoardgameDL.g:3342:3: rule__LineElement__CelltypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__LineElement__CelltypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLineElementAccess().getCelltypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group_4__1__Impl"


    // $ANTLR start "rule__LineElement__Group_5__0"
    // InternalBoardgameDL.g:3351:1: rule__LineElement__Group_5__0 : rule__LineElement__Group_5__0__Impl rule__LineElement__Group_5__1 ;
    public final void rule__LineElement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3355:1: ( rule__LineElement__Group_5__0__Impl rule__LineElement__Group_5__1 )
            // InternalBoardgameDL.g:3356:2: rule__LineElement__Group_5__0__Impl rule__LineElement__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__LineElement__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineElement__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group_5__0"


    // $ANTLR start "rule__LineElement__Group_5__0__Impl"
    // InternalBoardgameDL.g:3363:1: rule__LineElement__Group_5__0__Impl : ( 'cellstate' ) ;
    public final void rule__LineElement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3367:1: ( ( 'cellstate' ) )
            // InternalBoardgameDL.g:3368:1: ( 'cellstate' )
            {
            // InternalBoardgameDL.g:3368:1: ( 'cellstate' )
            // InternalBoardgameDL.g:3369:2: 'cellstate'
            {
             before(grammarAccess.getLineElementAccess().getCellstateKeyword_5_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getLineElementAccess().getCellstateKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group_5__0__Impl"


    // $ANTLR start "rule__LineElement__Group_5__1"
    // InternalBoardgameDL.g:3378:1: rule__LineElement__Group_5__1 : rule__LineElement__Group_5__1__Impl ;
    public final void rule__LineElement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3382:1: ( rule__LineElement__Group_5__1__Impl )
            // InternalBoardgameDL.g:3383:2: rule__LineElement__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineElement__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group_5__1"


    // $ANTLR start "rule__LineElement__Group_5__1__Impl"
    // InternalBoardgameDL.g:3389:1: rule__LineElement__Group_5__1__Impl : ( ( rule__LineElement__CellstateAssignment_5_1 ) ) ;
    public final void rule__LineElement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3393:1: ( ( ( rule__LineElement__CellstateAssignment_5_1 ) ) )
            // InternalBoardgameDL.g:3394:1: ( ( rule__LineElement__CellstateAssignment_5_1 ) )
            {
            // InternalBoardgameDL.g:3394:1: ( ( rule__LineElement__CellstateAssignment_5_1 ) )
            // InternalBoardgameDL.g:3395:2: ( rule__LineElement__CellstateAssignment_5_1 )
            {
             before(grammarAccess.getLineElementAccess().getCellstateAssignment_5_1()); 
            // InternalBoardgameDL.g:3396:2: ( rule__LineElement__CellstateAssignment_5_1 )
            // InternalBoardgameDL.g:3396:3: rule__LineElement__CellstateAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__LineElement__CellstateAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLineElementAccess().getCellstateAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group_5__1__Impl"


    // $ANTLR start "rule__LineElement__Group_6__0"
    // InternalBoardgameDL.g:3405:1: rule__LineElement__Group_6__0 : rule__LineElement__Group_6__0__Impl rule__LineElement__Group_6__1 ;
    public final void rule__LineElement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3409:1: ( rule__LineElement__Group_6__0__Impl rule__LineElement__Group_6__1 )
            // InternalBoardgameDL.g:3410:2: rule__LineElement__Group_6__0__Impl rule__LineElement__Group_6__1
            {
            pushFollow(FOLLOW_10);
            rule__LineElement__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineElement__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group_6__0"


    // $ANTLR start "rule__LineElement__Group_6__0__Impl"
    // InternalBoardgameDL.g:3417:1: rule__LineElement__Group_6__0__Impl : ( 'brickstate' ) ;
    public final void rule__LineElement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3421:1: ( ( 'brickstate' ) )
            // InternalBoardgameDL.g:3422:1: ( 'brickstate' )
            {
            // InternalBoardgameDL.g:3422:1: ( 'brickstate' )
            // InternalBoardgameDL.g:3423:2: 'brickstate'
            {
             before(grammarAccess.getLineElementAccess().getBrickstateKeyword_6_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getLineElementAccess().getBrickstateKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group_6__0__Impl"


    // $ANTLR start "rule__LineElement__Group_6__1"
    // InternalBoardgameDL.g:3432:1: rule__LineElement__Group_6__1 : rule__LineElement__Group_6__1__Impl ;
    public final void rule__LineElement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3436:1: ( rule__LineElement__Group_6__1__Impl )
            // InternalBoardgameDL.g:3437:2: rule__LineElement__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineElement__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group_6__1"


    // $ANTLR start "rule__LineElement__Group_6__1__Impl"
    // InternalBoardgameDL.g:3443:1: rule__LineElement__Group_6__1__Impl : ( ( rule__LineElement__BrickstateAssignment_6_1 ) ) ;
    public final void rule__LineElement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3447:1: ( ( ( rule__LineElement__BrickstateAssignment_6_1 ) ) )
            // InternalBoardgameDL.g:3448:1: ( ( rule__LineElement__BrickstateAssignment_6_1 ) )
            {
            // InternalBoardgameDL.g:3448:1: ( ( rule__LineElement__BrickstateAssignment_6_1 ) )
            // InternalBoardgameDL.g:3449:2: ( rule__LineElement__BrickstateAssignment_6_1 )
            {
             before(grammarAccess.getLineElementAccess().getBrickstateAssignment_6_1()); 
            // InternalBoardgameDL.g:3450:2: ( rule__LineElement__BrickstateAssignment_6_1 )
            // InternalBoardgameDL.g:3450:3: rule__LineElement__BrickstateAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__LineElement__BrickstateAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getLineElementAccess().getBrickstateAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group_6__1__Impl"


    // $ANTLR start "rule__LineElement__Group_7__0"
    // InternalBoardgameDL.g:3459:1: rule__LineElement__Group_7__0 : rule__LineElement__Group_7__0__Impl rule__LineElement__Group_7__1 ;
    public final void rule__LineElement__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3463:1: ( rule__LineElement__Group_7__0__Impl rule__LineElement__Group_7__1 )
            // InternalBoardgameDL.g:3464:2: rule__LineElement__Group_7__0__Impl rule__LineElement__Group_7__1
            {
            pushFollow(FOLLOW_10);
            rule__LineElement__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineElement__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group_7__0"


    // $ANTLR start "rule__LineElement__Group_7__0__Impl"
    // InternalBoardgameDL.g:3471:1: rule__LineElement__Group_7__0__Impl : ( 'bricktype' ) ;
    public final void rule__LineElement__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3475:1: ( ( 'bricktype' ) )
            // InternalBoardgameDL.g:3476:1: ( 'bricktype' )
            {
            // InternalBoardgameDL.g:3476:1: ( 'bricktype' )
            // InternalBoardgameDL.g:3477:2: 'bricktype'
            {
             before(grammarAccess.getLineElementAccess().getBricktypeKeyword_7_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getLineElementAccess().getBricktypeKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group_7__0__Impl"


    // $ANTLR start "rule__LineElement__Group_7__1"
    // InternalBoardgameDL.g:3486:1: rule__LineElement__Group_7__1 : rule__LineElement__Group_7__1__Impl ;
    public final void rule__LineElement__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3490:1: ( rule__LineElement__Group_7__1__Impl )
            // InternalBoardgameDL.g:3491:2: rule__LineElement__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineElement__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group_7__1"


    // $ANTLR start "rule__LineElement__Group_7__1__Impl"
    // InternalBoardgameDL.g:3497:1: rule__LineElement__Group_7__1__Impl : ( ( rule__LineElement__BricktypeAssignment_7_1 ) ) ;
    public final void rule__LineElement__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3501:1: ( ( ( rule__LineElement__BricktypeAssignment_7_1 ) ) )
            // InternalBoardgameDL.g:3502:1: ( ( rule__LineElement__BricktypeAssignment_7_1 ) )
            {
            // InternalBoardgameDL.g:3502:1: ( ( rule__LineElement__BricktypeAssignment_7_1 ) )
            // InternalBoardgameDL.g:3503:2: ( rule__LineElement__BricktypeAssignment_7_1 )
            {
             before(grammarAccess.getLineElementAccess().getBricktypeAssignment_7_1()); 
            // InternalBoardgameDL.g:3504:2: ( rule__LineElement__BricktypeAssignment_7_1 )
            // InternalBoardgameDL.g:3504:3: rule__LineElement__BricktypeAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__LineElement__BricktypeAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getLineElementAccess().getBricktypeAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__Group_7__1__Impl"


    // $ANTLR start "rule__Rules__BoardAssignment_4"
    // InternalBoardgameDL.g:3513:1: rule__Rules__BoardAssignment_4 : ( ruleBoard ) ;
    public final void rule__Rules__BoardAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3517:1: ( ( ruleBoard ) )
            // InternalBoardgameDL.g:3518:2: ( ruleBoard )
            {
            // InternalBoardgameDL.g:3518:2: ( ruleBoard )
            // InternalBoardgameDL.g:3519:3: ruleBoard
            {
             before(grammarAccess.getRulesAccess().getBoardBoardParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBoard();

            state._fsp--;

             after(grammarAccess.getRulesAccess().getBoardBoardParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__BoardAssignment_4"


    // $ANTLR start "rule__Rules__BoardAssignment_5_1"
    // InternalBoardgameDL.g:3528:1: rule__Rules__BoardAssignment_5_1 : ( ruleBoard ) ;
    public final void rule__Rules__BoardAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3532:1: ( ( ruleBoard ) )
            // InternalBoardgameDL.g:3533:2: ( ruleBoard )
            {
            // InternalBoardgameDL.g:3533:2: ( ruleBoard )
            // InternalBoardgameDL.g:3534:3: ruleBoard
            {
             before(grammarAccess.getRulesAccess().getBoardBoardParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBoard();

            state._fsp--;

             after(grammarAccess.getRulesAccess().getBoardBoardParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__BoardAssignment_5_1"


    // $ANTLR start "rule__Board__NameAssignment_3"
    // InternalBoardgameDL.g:3543:1: rule__Board__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Board__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3547:1: ( ( ruleEString ) )
            // InternalBoardgameDL.g:3548:2: ( ruleEString )
            {
            // InternalBoardgameDL.g:3548:2: ( ruleEString )
            // InternalBoardgameDL.g:3549:3: ruleEString
            {
             before(grammarAccess.getBoardAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBoardAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__NameAssignment_3"


    // $ANTLR start "rule__Board__WidthAssignment_5"
    // InternalBoardgameDL.g:3558:1: rule__Board__WidthAssignment_5 : ( ruleEInt ) ;
    public final void rule__Board__WidthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3562:1: ( ( ruleEInt ) )
            // InternalBoardgameDL.g:3563:2: ( ruleEInt )
            {
            // InternalBoardgameDL.g:3563:2: ( ruleEInt )
            // InternalBoardgameDL.g:3564:3: ruleEInt
            {
             before(grammarAccess.getBoardAccess().getWidthEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getBoardAccess().getWidthEIntParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__WidthAssignment_5"


    // $ANTLR start "rule__Board__HeightAssignment_7"
    // InternalBoardgameDL.g:3573:1: rule__Board__HeightAssignment_7 : ( ruleEInt ) ;
    public final void rule__Board__HeightAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3577:1: ( ( ruleEInt ) )
            // InternalBoardgameDL.g:3578:2: ( ruleEInt )
            {
            // InternalBoardgameDL.g:3578:2: ( ruleEInt )
            // InternalBoardgameDL.g:3579:3: ruleEInt
            {
             before(grammarAccess.getBoardAccess().getHeightEIntParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getBoardAccess().getHeightEIntParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__HeightAssignment_7"


    // $ANTLR start "rule__Board__CellAssignment_10"
    // InternalBoardgameDL.g:3588:1: rule__Board__CellAssignment_10 : ( ( ruleEString ) ) ;
    public final void rule__Board__CellAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3592:1: ( ( ( ruleEString ) ) )
            // InternalBoardgameDL.g:3593:2: ( ( ruleEString ) )
            {
            // InternalBoardgameDL.g:3593:2: ( ( ruleEString ) )
            // InternalBoardgameDL.g:3594:3: ( ruleEString )
            {
             before(grammarAccess.getBoardAccess().getCellCellCrossReference_10_0()); 
            // InternalBoardgameDL.g:3595:3: ( ruleEString )
            // InternalBoardgameDL.g:3596:4: ruleEString
            {
             before(grammarAccess.getBoardAccess().getCellCellEStringParserRuleCall_10_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBoardAccess().getCellCellEStringParserRuleCall_10_0_1()); 

            }

             after(grammarAccess.getBoardAccess().getCellCellCrossReference_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__CellAssignment_10"


    // $ANTLR start "rule__Board__CellAssignment_11_1"
    // InternalBoardgameDL.g:3607:1: rule__Board__CellAssignment_11_1 : ( ( ruleEString ) ) ;
    public final void rule__Board__CellAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3611:1: ( ( ( ruleEString ) ) )
            // InternalBoardgameDL.g:3612:2: ( ( ruleEString ) )
            {
            // InternalBoardgameDL.g:3612:2: ( ( ruleEString ) )
            // InternalBoardgameDL.g:3613:3: ( ruleEString )
            {
             before(grammarAccess.getBoardAccess().getCellCellCrossReference_11_1_0()); 
            // InternalBoardgameDL.g:3614:3: ( ruleEString )
            // InternalBoardgameDL.g:3615:4: ruleEString
            {
             before(grammarAccess.getBoardAccess().getCellCellEStringParserRuleCall_11_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBoardAccess().getCellCellEStringParserRuleCall_11_1_0_1()); 

            }

             after(grammarAccess.getBoardAccess().getCellCellCrossReference_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__CellAssignment_11_1"


    // $ANTLR start "rule__Board__BoardstateAssignment_13_2"
    // InternalBoardgameDL.g:3626:1: rule__Board__BoardstateAssignment_13_2 : ( ( ruleEString ) ) ;
    public final void rule__Board__BoardstateAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3630:1: ( ( ( ruleEString ) ) )
            // InternalBoardgameDL.g:3631:2: ( ( ruleEString ) )
            {
            // InternalBoardgameDL.g:3631:2: ( ( ruleEString ) )
            // InternalBoardgameDL.g:3632:3: ( ruleEString )
            {
             before(grammarAccess.getBoardAccess().getBoardstateBoardStateCrossReference_13_2_0()); 
            // InternalBoardgameDL.g:3633:3: ( ruleEString )
            // InternalBoardgameDL.g:3634:4: ruleEString
            {
             before(grammarAccess.getBoardAccess().getBoardstateBoardStateEStringParserRuleCall_13_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBoardAccess().getBoardstateBoardStateEStringParserRuleCall_13_2_0_1()); 

            }

             after(grammarAccess.getBoardAccess().getBoardstateBoardStateCrossReference_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__BoardstateAssignment_13_2"


    // $ANTLR start "rule__Board__BoardstateAssignment_13_3_1"
    // InternalBoardgameDL.g:3645:1: rule__Board__BoardstateAssignment_13_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Board__BoardstateAssignment_13_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3649:1: ( ( ( ruleEString ) ) )
            // InternalBoardgameDL.g:3650:2: ( ( ruleEString ) )
            {
            // InternalBoardgameDL.g:3650:2: ( ( ruleEString ) )
            // InternalBoardgameDL.g:3651:3: ( ruleEString )
            {
             before(grammarAccess.getBoardAccess().getBoardstateBoardStateCrossReference_13_3_1_0()); 
            // InternalBoardgameDL.g:3652:3: ( ruleEString )
            // InternalBoardgameDL.g:3653:4: ruleEString
            {
             before(grammarAccess.getBoardAccess().getBoardstateBoardStateEStringParserRuleCall_13_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBoardAccess().getBoardstateBoardStateEStringParserRuleCall_13_3_1_0_1()); 

            }

             after(grammarAccess.getBoardAccess().getBoardstateBoardStateCrossReference_13_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__BoardstateAssignment_13_3_1"


    // $ANTLR start "rule__Board__PlayerbricksetAssignment_16"
    // InternalBoardgameDL.g:3664:1: rule__Board__PlayerbricksetAssignment_16 : ( rulePlayerBrickSet ) ;
    public final void rule__Board__PlayerbricksetAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3668:1: ( ( rulePlayerBrickSet ) )
            // InternalBoardgameDL.g:3669:2: ( rulePlayerBrickSet )
            {
            // InternalBoardgameDL.g:3669:2: ( rulePlayerBrickSet )
            // InternalBoardgameDL.g:3670:3: rulePlayerBrickSet
            {
             before(grammarAccess.getBoardAccess().getPlayerbricksetPlayerBrickSetParserRuleCall_16_0()); 
            pushFollow(FOLLOW_2);
            rulePlayerBrickSet();

            state._fsp--;

             after(grammarAccess.getBoardAccess().getPlayerbricksetPlayerBrickSetParserRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__PlayerbricksetAssignment_16"


    // $ANTLR start "rule__Board__PlayerbricksetAssignment_17_1"
    // InternalBoardgameDL.g:3679:1: rule__Board__PlayerbricksetAssignment_17_1 : ( rulePlayerBrickSet ) ;
    public final void rule__Board__PlayerbricksetAssignment_17_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3683:1: ( ( rulePlayerBrickSet ) )
            // InternalBoardgameDL.g:3684:2: ( rulePlayerBrickSet )
            {
            // InternalBoardgameDL.g:3684:2: ( rulePlayerBrickSet )
            // InternalBoardgameDL.g:3685:3: rulePlayerBrickSet
            {
             before(grammarAccess.getBoardAccess().getPlayerbricksetPlayerBrickSetParserRuleCall_17_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlayerBrickSet();

            state._fsp--;

             after(grammarAccess.getBoardAccess().getPlayerbricksetPlayerBrickSetParserRuleCall_17_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__PlayerbricksetAssignment_17_1"


    // $ANTLR start "rule__Board__ValidmoveAssignment_21"
    // InternalBoardgameDL.g:3694:1: rule__Board__ValidmoveAssignment_21 : ( ruleValidMove ) ;
    public final void rule__Board__ValidmoveAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3698:1: ( ( ruleValidMove ) )
            // InternalBoardgameDL.g:3699:2: ( ruleValidMove )
            {
            // InternalBoardgameDL.g:3699:2: ( ruleValidMove )
            // InternalBoardgameDL.g:3700:3: ruleValidMove
            {
             before(grammarAccess.getBoardAccess().getValidmoveValidMoveParserRuleCall_21_0()); 
            pushFollow(FOLLOW_2);
            ruleValidMove();

            state._fsp--;

             after(grammarAccess.getBoardAccess().getValidmoveValidMoveParserRuleCall_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__ValidmoveAssignment_21"


    // $ANTLR start "rule__Board__ValidmoveAssignment_22_1"
    // InternalBoardgameDL.g:3709:1: rule__Board__ValidmoveAssignment_22_1 : ( ruleValidMove ) ;
    public final void rule__Board__ValidmoveAssignment_22_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3713:1: ( ( ruleValidMove ) )
            // InternalBoardgameDL.g:3714:2: ( ruleValidMove )
            {
            // InternalBoardgameDL.g:3714:2: ( ruleValidMove )
            // InternalBoardgameDL.g:3715:3: ruleValidMove
            {
             before(grammarAccess.getBoardAccess().getValidmoveValidMoveParserRuleCall_22_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValidMove();

            state._fsp--;

             after(grammarAccess.getBoardAccess().getValidmoveValidMoveParserRuleCall_22_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__ValidmoveAssignment_22_1"


    // $ANTLR start "rule__PlayerBrickSet__NameAssignment_3"
    // InternalBoardgameDL.g:3724:1: rule__PlayerBrickSet__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__PlayerBrickSet__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3728:1: ( ( ruleEString ) )
            // InternalBoardgameDL.g:3729:2: ( ruleEString )
            {
            // InternalBoardgameDL.g:3729:2: ( ruleEString )
            // InternalBoardgameDL.g:3730:3: ruleEString
            {
             before(grammarAccess.getPlayerBrickSetAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPlayerBrickSetAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__NameAssignment_3"


    // $ANTLR start "rule__PlayerBrickSet__WinAssignment_6"
    // InternalBoardgameDL.g:3739:1: rule__PlayerBrickSet__WinAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__PlayerBrickSet__WinAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3743:1: ( ( ( ruleEString ) ) )
            // InternalBoardgameDL.g:3744:2: ( ( ruleEString ) )
            {
            // InternalBoardgameDL.g:3744:2: ( ( ruleEString ) )
            // InternalBoardgameDL.g:3745:3: ( ruleEString )
            {
             before(grammarAccess.getPlayerBrickSetAccess().getWinOutcomeCrossReference_6_0()); 
            // InternalBoardgameDL.g:3746:3: ( ruleEString )
            // InternalBoardgameDL.g:3747:4: ruleEString
            {
             before(grammarAccess.getPlayerBrickSetAccess().getWinOutcomeEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPlayerBrickSetAccess().getWinOutcomeEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getPlayerBrickSetAccess().getWinOutcomeCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__WinAssignment_6"


    // $ANTLR start "rule__PlayerBrickSet__WinAssignment_7_1"
    // InternalBoardgameDL.g:3758:1: rule__PlayerBrickSet__WinAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__PlayerBrickSet__WinAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3762:1: ( ( ( ruleEString ) ) )
            // InternalBoardgameDL.g:3763:2: ( ( ruleEString ) )
            {
            // InternalBoardgameDL.g:3763:2: ( ( ruleEString ) )
            // InternalBoardgameDL.g:3764:3: ( ruleEString )
            {
             before(grammarAccess.getPlayerBrickSetAccess().getWinOutcomeCrossReference_7_1_0()); 
            // InternalBoardgameDL.g:3765:3: ( ruleEString )
            // InternalBoardgameDL.g:3766:4: ruleEString
            {
             before(grammarAccess.getPlayerBrickSetAccess().getWinOutcomeEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPlayerBrickSetAccess().getWinOutcomeEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getPlayerBrickSetAccess().getWinOutcomeCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__WinAssignment_7_1"


    // $ANTLR start "rule__PlayerBrickSet__DrawAssignment_9_1"
    // InternalBoardgameDL.g:3777:1: rule__PlayerBrickSet__DrawAssignment_9_1 : ( ( ruleEString ) ) ;
    public final void rule__PlayerBrickSet__DrawAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3781:1: ( ( ( ruleEString ) ) )
            // InternalBoardgameDL.g:3782:2: ( ( ruleEString ) )
            {
            // InternalBoardgameDL.g:3782:2: ( ( ruleEString ) )
            // InternalBoardgameDL.g:3783:3: ( ruleEString )
            {
             before(grammarAccess.getPlayerBrickSetAccess().getDrawOutcomeCrossReference_9_1_0()); 
            // InternalBoardgameDL.g:3784:3: ( ruleEString )
            // InternalBoardgameDL.g:3785:4: ruleEString
            {
             before(grammarAccess.getPlayerBrickSetAccess().getDrawOutcomeEStringParserRuleCall_9_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPlayerBrickSetAccess().getDrawOutcomeEStringParserRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getPlayerBrickSetAccess().getDrawOutcomeCrossReference_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__DrawAssignment_9_1"


    // $ANTLR start "rule__PlayerBrickSet__BrickAssignment_12"
    // InternalBoardgameDL.g:3796:1: rule__PlayerBrickSet__BrickAssignment_12 : ( ruleBrick ) ;
    public final void rule__PlayerBrickSet__BrickAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3800:1: ( ( ruleBrick ) )
            // InternalBoardgameDL.g:3801:2: ( ruleBrick )
            {
            // InternalBoardgameDL.g:3801:2: ( ruleBrick )
            // InternalBoardgameDL.g:3802:3: ruleBrick
            {
             before(grammarAccess.getPlayerBrickSetAccess().getBrickBrickParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleBrick();

            state._fsp--;

             after(grammarAccess.getPlayerBrickSetAccess().getBrickBrickParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__BrickAssignment_12"


    // $ANTLR start "rule__PlayerBrickSet__BrickAssignment_13_1"
    // InternalBoardgameDL.g:3811:1: rule__PlayerBrickSet__BrickAssignment_13_1 : ( ruleBrick ) ;
    public final void rule__PlayerBrickSet__BrickAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3815:1: ( ( ruleBrick ) )
            // InternalBoardgameDL.g:3816:2: ( ruleBrick )
            {
            // InternalBoardgameDL.g:3816:2: ( ruleBrick )
            // InternalBoardgameDL.g:3817:3: ruleBrick
            {
             before(grammarAccess.getPlayerBrickSetAccess().getBrickBrickParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBrick();

            state._fsp--;

             after(grammarAccess.getPlayerBrickSetAccess().getBrickBrickParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerBrickSet__BrickAssignment_13_1"


    // $ANTLR start "rule__ValidMove__NameAssignment_3"
    // InternalBoardgameDL.g:3826:1: rule__ValidMove__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__ValidMove__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3830:1: ( ( ruleEString ) )
            // InternalBoardgameDL.g:3831:2: ( ruleEString )
            {
            // InternalBoardgameDL.g:3831:2: ( ruleEString )
            // InternalBoardgameDL.g:3832:3: ruleEString
            {
             before(grammarAccess.getValidMoveAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getValidMoveAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__NameAssignment_3"


    // $ANTLR start "rule__ValidMove__BrickchangeAssignment_4_2"
    // InternalBoardgameDL.g:3841:1: rule__ValidMove__BrickchangeAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__ValidMove__BrickchangeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3845:1: ( ( ( ruleEString ) ) )
            // InternalBoardgameDL.g:3846:2: ( ( ruleEString ) )
            {
            // InternalBoardgameDL.g:3846:2: ( ( ruleEString ) )
            // InternalBoardgameDL.g:3847:3: ( ruleEString )
            {
             before(grammarAccess.getValidMoveAccess().getBrickchangeBrickChangeCrossReference_4_2_0()); 
            // InternalBoardgameDL.g:3848:3: ( ruleEString )
            // InternalBoardgameDL.g:3849:4: ruleEString
            {
             before(grammarAccess.getValidMoveAccess().getBrickchangeBrickChangeEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getValidMoveAccess().getBrickchangeBrickChangeEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getValidMoveAccess().getBrickchangeBrickChangeCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__BrickchangeAssignment_4_2"


    // $ANTLR start "rule__ValidMove__BrickchangeAssignment_4_3_1"
    // InternalBoardgameDL.g:3860:1: rule__ValidMove__BrickchangeAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ValidMove__BrickchangeAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3864:1: ( ( ( ruleEString ) ) )
            // InternalBoardgameDL.g:3865:2: ( ( ruleEString ) )
            {
            // InternalBoardgameDL.g:3865:2: ( ( ruleEString ) )
            // InternalBoardgameDL.g:3866:3: ( ruleEString )
            {
             before(grammarAccess.getValidMoveAccess().getBrickchangeBrickChangeCrossReference_4_3_1_0()); 
            // InternalBoardgameDL.g:3867:3: ( ruleEString )
            // InternalBoardgameDL.g:3868:4: ruleEString
            {
             before(grammarAccess.getValidMoveAccess().getBrickchangeBrickChangeEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getValidMoveAccess().getBrickchangeBrickChangeEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getValidMoveAccess().getBrickchangeBrickChangeCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__BrickchangeAssignment_4_3_1"


    // $ANTLR start "rule__ValidMove__CellchangeAssignment_5_2"
    // InternalBoardgameDL.g:3879:1: rule__ValidMove__CellchangeAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__ValidMove__CellchangeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3883:1: ( ( ( ruleEString ) ) )
            // InternalBoardgameDL.g:3884:2: ( ( ruleEString ) )
            {
            // InternalBoardgameDL.g:3884:2: ( ( ruleEString ) )
            // InternalBoardgameDL.g:3885:3: ( ruleEString )
            {
             before(grammarAccess.getValidMoveAccess().getCellchangeCellChangeCrossReference_5_2_0()); 
            // InternalBoardgameDL.g:3886:3: ( ruleEString )
            // InternalBoardgameDL.g:3887:4: ruleEString
            {
             before(grammarAccess.getValidMoveAccess().getCellchangeCellChangeEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getValidMoveAccess().getCellchangeCellChangeEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getValidMoveAccess().getCellchangeCellChangeCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__CellchangeAssignment_5_2"


    // $ANTLR start "rule__ValidMove__CellchangeAssignment_5_3_1"
    // InternalBoardgameDL.g:3898:1: rule__ValidMove__CellchangeAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ValidMove__CellchangeAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3902:1: ( ( ( ruleEString ) ) )
            // InternalBoardgameDL.g:3903:2: ( ( ruleEString ) )
            {
            // InternalBoardgameDL.g:3903:2: ( ( ruleEString ) )
            // InternalBoardgameDL.g:3904:3: ( ruleEString )
            {
             before(grammarAccess.getValidMoveAccess().getCellchangeCellChangeCrossReference_5_3_1_0()); 
            // InternalBoardgameDL.g:3905:3: ( ruleEString )
            // InternalBoardgameDL.g:3906:4: ruleEString
            {
             before(grammarAccess.getValidMoveAccess().getCellchangeCellChangeEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getValidMoveAccess().getCellchangeCellChangeEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getValidMoveAccess().getCellchangeCellChangeCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidMove__CellchangeAssignment_5_3_1"


    // $ANTLR start "rule__Brick__BricktypeAssignment_3"
    // InternalBoardgameDL.g:3917:1: rule__Brick__BricktypeAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Brick__BricktypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3921:1: ( ( ( ruleEString ) ) )
            // InternalBoardgameDL.g:3922:2: ( ( ruleEString ) )
            {
            // InternalBoardgameDL.g:3922:2: ( ( ruleEString ) )
            // InternalBoardgameDL.g:3923:3: ( ruleEString )
            {
             before(grammarAccess.getBrickAccess().getBricktypeBrickTypeCrossReference_3_0()); 
            // InternalBoardgameDL.g:3924:3: ( ruleEString )
            // InternalBoardgameDL.g:3925:4: ruleEString
            {
             before(grammarAccess.getBrickAccess().getBricktypeBrickTypeEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBrickAccess().getBricktypeBrickTypeEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getBrickAccess().getBricktypeBrickTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__BricktypeAssignment_3"


    // $ANTLR start "rule__Brick__StartCellAssignment_4_1"
    // InternalBoardgameDL.g:3936:1: rule__Brick__StartCellAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Brick__StartCellAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3940:1: ( ( ( ruleEString ) ) )
            // InternalBoardgameDL.g:3941:2: ( ( ruleEString ) )
            {
            // InternalBoardgameDL.g:3941:2: ( ( ruleEString ) )
            // InternalBoardgameDL.g:3942:3: ( ruleEString )
            {
             before(grammarAccess.getBrickAccess().getStartCellCellCrossReference_4_1_0()); 
            // InternalBoardgameDL.g:3943:3: ( ruleEString )
            // InternalBoardgameDL.g:3944:4: ruleEString
            {
             before(grammarAccess.getBrickAccess().getStartCellCellEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBrickAccess().getStartCellCellEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getBrickAccess().getStartCellCellCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__StartCellAssignment_4_1"


    // $ANTLR start "rule__LineElement__PositionAssignment_3_1"
    // InternalBoardgameDL.g:3955:1: rule__LineElement__PositionAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__LineElement__PositionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3959:1: ( ( ruleEInt ) )
            // InternalBoardgameDL.g:3960:2: ( ruleEInt )
            {
            // InternalBoardgameDL.g:3960:2: ( ruleEInt )
            // InternalBoardgameDL.g:3961:3: ruleEInt
            {
             before(grammarAccess.getLineElementAccess().getPositionEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getLineElementAccess().getPositionEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__PositionAssignment_3_1"


    // $ANTLR start "rule__LineElement__CelltypeAssignment_4_1"
    // InternalBoardgameDL.g:3970:1: rule__LineElement__CelltypeAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__LineElement__CelltypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3974:1: ( ( ( ruleEString ) ) )
            // InternalBoardgameDL.g:3975:2: ( ( ruleEString ) )
            {
            // InternalBoardgameDL.g:3975:2: ( ( ruleEString ) )
            // InternalBoardgameDL.g:3976:3: ( ruleEString )
            {
             before(grammarAccess.getLineElementAccess().getCelltypeCellTypeCrossReference_4_1_0()); 
            // InternalBoardgameDL.g:3977:3: ( ruleEString )
            // InternalBoardgameDL.g:3978:4: ruleEString
            {
             before(grammarAccess.getLineElementAccess().getCelltypeCellTypeEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLineElementAccess().getCelltypeCellTypeEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getLineElementAccess().getCelltypeCellTypeCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__CelltypeAssignment_4_1"


    // $ANTLR start "rule__LineElement__CellstateAssignment_5_1"
    // InternalBoardgameDL.g:3989:1: rule__LineElement__CellstateAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__LineElement__CellstateAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:3993:1: ( ( ( ruleEString ) ) )
            // InternalBoardgameDL.g:3994:2: ( ( ruleEString ) )
            {
            // InternalBoardgameDL.g:3994:2: ( ( ruleEString ) )
            // InternalBoardgameDL.g:3995:3: ( ruleEString )
            {
             before(grammarAccess.getLineElementAccess().getCellstateCellStateCrossReference_5_1_0()); 
            // InternalBoardgameDL.g:3996:3: ( ruleEString )
            // InternalBoardgameDL.g:3997:4: ruleEString
            {
             before(grammarAccess.getLineElementAccess().getCellstateCellStateEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLineElementAccess().getCellstateCellStateEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getLineElementAccess().getCellstateCellStateCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__CellstateAssignment_5_1"


    // $ANTLR start "rule__LineElement__BrickstateAssignment_6_1"
    // InternalBoardgameDL.g:4008:1: rule__LineElement__BrickstateAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__LineElement__BrickstateAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:4012:1: ( ( ( ruleEString ) ) )
            // InternalBoardgameDL.g:4013:2: ( ( ruleEString ) )
            {
            // InternalBoardgameDL.g:4013:2: ( ( ruleEString ) )
            // InternalBoardgameDL.g:4014:3: ( ruleEString )
            {
             before(grammarAccess.getLineElementAccess().getBrickstateBrickStateCrossReference_6_1_0()); 
            // InternalBoardgameDL.g:4015:3: ( ruleEString )
            // InternalBoardgameDL.g:4016:4: ruleEString
            {
             before(grammarAccess.getLineElementAccess().getBrickstateBrickStateEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLineElementAccess().getBrickstateBrickStateEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getLineElementAccess().getBrickstateBrickStateCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__BrickstateAssignment_6_1"


    // $ANTLR start "rule__LineElement__BricktypeAssignment_7_1"
    // InternalBoardgameDL.g:4027:1: rule__LineElement__BricktypeAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__LineElement__BricktypeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoardgameDL.g:4031:1: ( ( ( ruleEString ) ) )
            // InternalBoardgameDL.g:4032:2: ( ( ruleEString ) )
            {
            // InternalBoardgameDL.g:4032:2: ( ( ruleEString ) )
            // InternalBoardgameDL.g:4033:3: ( ruleEString )
            {
             before(grammarAccess.getLineElementAccess().getBricktypeBrickTypeCrossReference_7_1_0()); 
            // InternalBoardgameDL.g:4034:3: ( ruleEString )
            // InternalBoardgameDL.g:4035:4: ruleEString
            {
             before(grammarAccess.getLineElementAccess().getBricktypeBrickTypeEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLineElementAccess().getBricktypeBrickTypeEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getLineElementAccess().getBricktypeBrickTypeCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineElement__BricktypeAssignment_7_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000300004000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000004000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000003C800004000L});

}