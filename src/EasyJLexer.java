// Generated from EasyJ.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EasyJLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, WS=4, NUMERIC=5, KEYWORDS=6, SEPARATOR=7, OPERATOR=8, 
		LITERAL=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "LOWERCASE", "UPPERCASE", "WS", "NUMERIC", "KEYWORDS", 
		"SEPARATOR", "OPERATOR", "LITERAL"
	};


	public EasyJLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "EasyJ.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\13\177\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\6\7(\n\7\r\7\16\7)\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t:\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13o\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\2\2\r\3\3"+
		"\5\4\7\5\t\2\13\2\r\6\17\7\21\b\23\t\25\n\27\13\3\2\t\3\2c|\3\2C\\\5\2"+
		"\13\f\17\17\"\"\3\2\62;\n\2*+..\60\60==]]__}}\177\177\7\2##<<>>@A\u0080"+
		"\u0080\7\2\'(,-//\61\61``\u0095\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\3\31\3\2\2\2\5\33\3\2\2\2\7\35\3\2\2\2\t\"\3\2\2\2\13$\3\2\2\2"+
		"\r\'\3\2\2\2\17-\3\2\2\2\219\3\2\2\2\23;\3\2\2\2\25n\3\2\2\2\27p\3\2\2"+
		"\2\31\32\7a\2\2\32\4\3\2\2\2\33\34\7&\2\2\34\6\3\2\2\2\35\36\7p\2\2\36"+
		"\37\7w\2\2\37 \7n\2\2 !\7n\2\2!\b\3\2\2\2\"#\t\2\2\2#\n\3\2\2\2$%\t\3"+
		"\2\2%\f\3\2\2\2&(\t\4\2\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*+"+
		"\3\2\2\2+,\b\7\2\2,\16\3\2\2\2-.\t\5\2\2.\20\3\2\2\2/\60\7f\2\2\60\61"+
		"\7k\2\2\61\62\7u\2\2\62\63\7r\2\2\63\64\7n\2\2\64\65\7c\2\2\65:\7{\2\2"+
		"\66\67\7h\2\2\678\7q\2\28:\7t\2\29/\3\2\2\29\66\3\2\2\2:\22\3\2\2\2;<"+
		"\t\6\2\2<\24\3\2\2\2=o\t\7\2\2>?\7?\2\2?o\7?\2\2@A\7>\2\2Ao\7?\2\2BC\7"+
		"@\2\2Co\7?\2\2DE\7#\2\2Eo\7?\2\2FG\7(\2\2Go\7(\2\2Ho\7~\2\2IJ\7-\2\2J"+
		"o\7-\2\2KL\7/\2\2Lo\7/\2\2Mo\t\b\2\2NO\7>\2\2Oo\7>\2\2PQ\7@\2\2Qo\7@\2"+
		"\2RS\7@\2\2ST\7@\2\2To\7@\2\2UV\7-\2\2Vo\7?\2\2WX\7/\2\2Xo\7?\2\2YZ\7"+
		",\2\2Zo\7?\2\2[\\\7\61\2\2\\o\7?\2\2]^\7(\2\2^o\7?\2\2_`\7~\2\2`o\7?\2"+
		"\2ab\7`\2\2bo\7?\2\2cd\7\'\2\2do\7?\2\2ef\7>\2\2fg\7>\2\2go\7?\2\2hi\7"+
		"@\2\2ij\7@\2\2jo\7?\2\2kl\7@\2\2lm\7@\2\2mo\7?\2\2n=\3\2\2\2n>\3\2\2\2"+
		"n@\3\2\2\2nB\3\2\2\2nD\3\2\2\2nF\3\2\2\2nH\3\2\2\2nI\3\2\2\2nK\3\2\2\2"+
		"nM\3\2\2\2nN\3\2\2\2nP\3\2\2\2nR\3\2\2\2nU\3\2\2\2nW\3\2\2\2nY\3\2\2\2"+
		"n[\3\2\2\2n]\3\2\2\2n_\3\2\2\2na\3\2\2\2nc\3\2\2\2ne\3\2\2\2nh\3\2\2\2"+
		"nk\3\2\2\2o\26\3\2\2\2pq\7k\2\2qr\7p\2\2rs\7v\2\2st\7g\2\2tu\7i\2\2uv"+
		"\7g\2\2vw\7t\2\2wx\7n\2\2xy\7k\2\2yz\7v\2\2z{\7g\2\2{|\7t\2\2|}\7c\2\2"+
		"}~\7n\2\2~\30\3\2\2\2\6\2)9n\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}