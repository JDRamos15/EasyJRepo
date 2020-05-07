// Generated from EasyJ.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EasyJParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		DECIMALNUMERAL=95, WS=96, NUMERIC=97, IDENTIFIER=98, SEPARATOR=99, OPERATOR=100, 
		LITERAL=101;
	public static final int
		RULE_idstart = 0, RULE_alphabetic = 1, RULE_lowercase = 2, RULE_uppercase = 3, 
		RULE_integerliteral = 4, RULE_digits = 5, RULE_digit = 6, RULE_booleanliteral = 7, 
		RULE_characterliteral = 8, RULE_stringliteral = 9, RULE_graphic = 10, 
		RULE_alphanumeric = 11, RULE_special = 12, RULE_escapesequence = 13, RULE_nullliteral = 14;
	public static final String[] ruleNames = {
		"idstart", "alphabetic", "lowercase", "uppercase", "integerliteral", "digits", 
		"digit", "booleanliteral", "characterliteral", "stringliteral", "graphic", 
		"alphanumeric", "special", "escapesequence", "nullliteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'$'", "'_'", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", "'h'", 
		"'i'", "'j'", "'k'", "'l'", "'m'", "'n'", "'o'", "'p'", "'q'", "'r'", 
		"'s'", "'t'", "'u'", "'v'", "'w'", "'x'", "'y'", "'z'", "'A'", "'B'", 
		"'C'", "'D'", "'E'", "'F'", "'G'", "'H'", "'I'", "'J'", "'K'", "'L'", 
		"'M'", "'N'", "'O'", "'P'", "'Q'", "'R'", "'S'", "'T'", "'U'", "'V'", 
		"'W'", "'X'", "'Y'", "'Z'", "'true'", "'false'", "'space'", "'!'", "'%'", 
		"'^'", "'&'", "'*'", "'('", "')'", "'-'", "'+'", "'='", "'{'", "'}'", 
		"'|'", "'~'", "'['", "']'", "';'", "':'", "'\"'", "'<'", "'>'", "'?'", 
		"','", "'.'", "'/'", "'#'", "'@'", "'`'", "' '", "'\n'", "'\t'", "'\b'", 
		"'\r'", "'\f'", "'\\'", "'''", "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "DECIMALNUMERAL", 
		"WS", "NUMERIC", "IDENTIFIER", "SEPARATOR", "OPERATOR", "LITERAL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "EasyJ.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EasyJParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class IdstartContext extends ParserRuleContext {
		public AlphabeticContext alphabetic() {
			return getRuleContext(AlphabeticContext.class,0);
		}
		public IdstartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idstart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyJListener ) ((EasyJListener)listener).enterIdstart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyJListener ) ((EasyJListener)listener).exitIdstart(this);
		}
	}

	public final IdstartContext idstart() throws RecognitionException {
		IdstartContext _localctx = new IdstartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_idstart);
		try {
			setState(33);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				alphabetic();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(T__0);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlphabeticContext extends ParserRuleContext {
		public LowercaseContext lowercase() {
			return getRuleContext(LowercaseContext.class,0);
		}
		public UppercaseContext uppercase() {
			return getRuleContext(UppercaseContext.class,0);
		}
		public AlphabeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alphabetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyJListener ) ((EasyJListener)listener).enterAlphabetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyJListener ) ((EasyJListener)listener).exitAlphabetic(this);
		}
	}

	public final AlphabeticContext alphabetic() throws RecognitionException {
		AlphabeticContext _localctx = new AlphabeticContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_alphabetic);
		try {
			setState(37);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				lowercase();
				}
				break;
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				uppercase();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LowercaseContext extends ParserRuleContext {
		public LowercaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lowercase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyJListener ) ((EasyJListener)listener).enterLowercase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyJListener ) ((EasyJListener)listener).exitLowercase(this);
		}
	}

	public final LowercaseContext lowercase() throws RecognitionException {
		LowercaseContext _localctx = new LowercaseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lowercase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UppercaseContext extends ParserRuleContext {
		public UppercaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uppercase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyJListener ) ((EasyJListener)listener).enterUppercase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyJListener ) ((EasyJListener)listener).exitUppercase(this);
		}
	}

	public final UppercaseContext uppercase() throws RecognitionException {
		UppercaseContext _localctx = new UppercaseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_uppercase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerliteralContext extends ParserRuleContext {
		public TerminalNode DECIMALNUMERAL() { return getToken(EasyJParser.DECIMALNUMERAL, 0); }
		public IntegerliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyJListener ) ((EasyJListener)listener).enterIntegerliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyJListener ) ((EasyJListener)listener).exitIntegerliteral(this);
		}
	}

	public final IntegerliteralContext integerliteral() throws RecognitionException {
		IntegerliteralContext _localctx = new IntegerliteralContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_integerliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(DECIMALNUMERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DigitsContext extends ParserRuleContext {
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public DigitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyJListener ) ((EasyJListener)listener).enterDigits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyJListener ) ((EasyJListener)listener).exitDigits(this);
		}
	}

	public final DigitsContext digits() throws RecognitionException {
		DigitsContext _localctx = new DigitsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_digits);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			digit();
			digit
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DigitContext extends ParserRuleContext {
		public TerminalNode NUMERIC() { return getToken(EasyJParser.NUMERIC, 0); }
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyJListener ) ((EasyJListener)listener).enterDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyJListener ) ((EasyJListener)listener).exitDigit(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_digit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(NUMERIC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanliteralContext extends ParserRuleContext {
		public BooleanliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyJListener ) ((EasyJListener)listener).enterBooleanliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyJListener ) ((EasyJListener)listener).exitBooleanliteral(this);
		}
	}

	public final BooleanliteralContext booleanliteral() throws RecognitionException {
		BooleanliteralContext _localctx = new BooleanliteralContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_booleanliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !(_la==T__54 || _la==T__55) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterliteralContext extends ParserRuleContext {
		public GraphicContext graphic() {
			return getRuleContext(GraphicContext.class,0);
		}
		public EscapesequenceContext escapesequence() {
			return getRuleContext(EscapesequenceContext.class,0);
		}
		public CharacterliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyJListener ) ((EasyJListener)listener).enterCharacterliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyJListener ) ((EasyJListener)listener).exitCharacterliteral(this);
		}
	}

	public final CharacterliteralContext characterliteral() throws RecognitionException {
		CharacterliteralContext _localctx = new CharacterliteralContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_characterliteral);
		try {
			setState(56);
			switch (_input.LA(1)) {
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				graphic();
				setState(53);
				match(T__56);
				}
				break;
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				escapesequence();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringliteralContext extends ParserRuleContext {
		public StringliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyJListener ) ((EasyJListener)listener).enterStringliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyJListener ) ((EasyJListener)listener).exitStringliteral(this);
		}
	}

	public final StringliteralContext stringliteral() throws RecognitionException {
		StringliteralContext _localctx = new StringliteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stringliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			graphic | special | escapesequence 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GraphicContext extends ParserRuleContext {
		public SpecialContext special() {
			return getRuleContext(SpecialContext.class,0);
		}
		public GraphicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyJListener ) ((EasyJListener)listener).enterGraphic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyJListener ) ((EasyJListener)listener).exitGraphic(this);
		}
	}

	public final GraphicContext graphic() throws RecognitionException {
		GraphicContext _localctx = new GraphicContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_graphic);
		try {
			setState(62);
			switch (_input.LA(1)) {
			case T__56:
				enterOuterAlt(_localctx, 1);
				{
				alphanumeric
				}
				break;
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				special();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlphanumericContext extends ParserRuleContext {
		public TerminalNode NUMERIC() { return getToken(EasyJParser.NUMERIC, 0); }
		public AlphanumericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alphanumeric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyJListener ) ((EasyJListener)listener).enterAlphanumeric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyJListener ) ((EasyJListener)listener).exitAlphanumeric(this);
		}
	}

	public final AlphanumericContext alphanumeric() throws RecognitionException {
		AlphanumericContext _localctx = new AlphanumericContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_alphanumeric);
		try {
			setState(66);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				alphabetic
				}
				break;
			case NUMERIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(NUMERIC);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecialContext extends ParserRuleContext {
		public SpecialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyJListener ) ((EasyJListener)listener).enterSpecial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyJListener ) ((EasyJListener)listener).exitSpecial(this);
		}
	}

	public final SpecialContext special() throws RecognitionException {
		SpecialContext _localctx = new SpecialContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_special);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_la = _input.LA(1);
			if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (T__57 - 58)) | (1L << (T__58 - 58)) | (1L << (T__59 - 58)) | (1L << (T__60 - 58)) | (1L << (T__61 - 58)) | (1L << (T__62 - 58)) | (1L << (T__63 - 58)) | (1L << (T__64 - 58)) | (1L << (T__65 - 58)) | (1L << (T__66 - 58)) | (1L << (T__67 - 58)) | (1L << (T__68 - 58)) | (1L << (T__69 - 58)) | (1L << (T__70 - 58)) | (1L << (T__71 - 58)) | (1L << (T__72 - 58)) | (1L << (T__73 - 58)) | (1L << (T__74 - 58)) | (1L << (T__75 - 58)) | (1L << (T__76 - 58)) | (1L << (T__77 - 58)) | (1L << (T__78 - 58)) | (1L << (T__79 - 58)) | (1L << (T__80 - 58)) | (1L << (T__81 - 58)) | (1L << (T__82 - 58)) | (1L << (T__83 - 58)) | (1L << (T__84 - 58)) | (1L << (T__85 - 58)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EscapesequenceContext extends ParserRuleContext {
		public EscapesequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escapesequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyJListener ) ((EasyJListener)listener).enterEscapesequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyJListener ) ((EasyJListener)listener).exitEscapesequence(this);
		}
	}

	public final EscapesequenceContext escapesequence() throws RecognitionException {
		EscapesequenceContext _localctx = new EscapesequenceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_escapesequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (T__86 - 87)) | (1L << (T__87 - 87)) | (1L << (T__88 - 87)) | (1L << (T__89 - 87)) | (1L << (T__90 - 87)) | (1L << (T__91 - 87)) | (1L << (T__92 - 87)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullliteralContext extends ParserRuleContext {
		public NullliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyJListener ) ((EasyJListener)listener).enterNullliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyJListener ) ((EasyJListener)listener).exitNullliteral(this);
		}
	}

	public final NullliteralContext nullliteral() throws RecognitionException {
		NullliteralContext _localctx = new NullliteralContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_nullliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__93);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3gM\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\5\2$\n\2\3\3\3"+
		"\3\5\3(\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\5\n;\n\n\3\13\3\13\3\f\3\f\5\fA\n\f\3\r\3\r\5\rE\n\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36\2\7\3\2\5\36\3\2\378\3\29:\3\2<X\3\2Y_C\2#\3\2\2\2\4\'\3\2\2\2\6)"+
		"\3\2\2\2\b+\3\2\2\2\n-\3\2\2\2\f/\3\2\2\2\16\62\3\2\2\2\20\64\3\2\2\2"+
		"\22:\3\2\2\2\24<\3\2\2\2\26@\3\2\2\2\30D\3\2\2\2\32F\3\2\2\2\34H\3\2\2"+
		"\2\36J\3\2\2\2 $\5\4\3\2!$\7\3\2\2\"$\7\4\2\2# \3\2\2\2#!\3\2\2\2#\"\3"+
		"\2\2\2$\3\3\2\2\2%(\5\6\4\2&(\5\b\5\2\'%\3\2\2\2\'&\3\2\2\2(\5\3\2\2\2"+
		")*\t\2\2\2*\7\3\2\2\2+,\t\3\2\2,\t\3\2\2\2-.\7a\2\2.\13\3\2\2\2/\60\5"+
		"\16\b\2\60\61\b\7\1\2\61\r\3\2\2\2\62\63\7c\2\2\63\17\3\2\2\2\64\65\t"+
		"\4\2\2\65\21\3\2\2\2\66\67\5\26\f\2\678\7;\2\28;\3\2\2\29;\5\34\17\2:"+
		"\66\3\2\2\2:9\3\2\2\2;\23\3\2\2\2<=\b\13\1\2=\25\3\2\2\2>A\b\f\1\2?A\5"+
		"\32\16\2@>\3\2\2\2@?\3\2\2\2A\27\3\2\2\2BE\b\r\1\2CE\7c\2\2DB\3\2\2\2"+
		"DC\3\2\2\2E\31\3\2\2\2FG\t\5\2\2G\33\3\2\2\2HI\t\6\2\2I\35\3\2\2\2JK\7"+
		"`\2\2K\37\3\2\2\2\7#\':@D";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}