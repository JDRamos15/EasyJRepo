// Generated from EasyJ.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, WS=4, NUMERIC=5, KEYWORDS=6, SEPARATOR=7, OPERATOR=8, 
		LITERAL=9, LOWERCASE=10, UPPERCASE=11;
	public static final String[] tokenNames = {
		"<INVALID>", "'_'", "'$'", "'null'", "WS", "NUMERIC", "KEYWORDS", "SEPARATOR", 
		"OPERATOR", "'integerliteral'", "LOWERCASE", "UPPERCASE"
	};
	public static final int
		RULE_idstart = 0, RULE_alphabetic = 1, RULE_nullliteral = 2;
	public static final String[] ruleNames = {
		"idstart", "alphabetic", "nullliteral"
	};

	@Override
	public String getGrammarFileName() { return "EasyJ.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
		public TerminalNode UPPERCASE() { return getToken(EasyJParser.UPPERCASE, 0); }
		public TerminalNode LOWERCASE() { return getToken(EasyJParser.LOWERCASE, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__1) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public TerminalNode UPPERCASE() { return getToken(EasyJParser.UPPERCASE, 0); }
		public TerminalNode LOWERCASE() { return getToken(EasyJParser.LOWERCASE, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			_la = _input.LA(1);
			if ( !(_la==LOWERCASE || _la==UPPERCASE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		enterRule(_localctx, 4, RULE_nullliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10); match(T__0);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\r\17\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\3\3\3\3\4\3\4\3\4\2\2\5\2\4\6\2\4\4\2\3\4\f\r\3"+
		"\2\f\r\13\2\b\3\2\2\2\4\n\3\2\2\2\6\f\3\2\2\2\b\t\t\2\2\2\t\3\3\2\2\2"+
		"\n\13\t\3\2\2\13\5\3\2\2\2\f\r\7\5\2\2\r\7\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}