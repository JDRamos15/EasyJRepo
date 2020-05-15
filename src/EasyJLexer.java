// Generated from EasyJ.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WS=2, NUMERIC=3, SEPARATOR=4, OPERATOR=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "WS", "NUMERIC", "SEPARATOR", "OPERATOR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "WS", "NUMERIC", "SEPARATOR", "OPERATOR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public EasyJLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "EasyJ.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\7P\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\3\6\3\24\n\3\r\3"+
		"\16\3\25\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6O\n\6\2\2\7\3\3\5\4\7\5\t\6\13\7\3\2\7\5\2\13\f"+
		"\17\17\"\"\3\2\62;\n\2*+..\60\60==]]__}}\177\177\7\2##<<>>@A\u0080\u0080"+
		"\7\2\'(,-//\61\61``\2g\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\3\r\3\2\2\2\5\23\3\2\2\2\7\31\3\2\2\2\t\33\3\2\2\2\13N\3"+
		"\2\2\2\r\16\7p\2\2\16\17\7w\2\2\17\20\7n\2\2\20\21\7n\2\2\21\4\3\2\2\2"+
		"\22\24\t\2\2\2\23\22\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2"+
		"\26\27\3\2\2\2\27\30\b\3\2\2\30\6\3\2\2\2\31\32\t\3\2\2\32\b\3\2\2\2\33"+
		"\34\t\4\2\2\34\n\3\2\2\2\35O\t\5\2\2\36\37\7?\2\2\37O\7?\2\2 !\7>\2\2"+
		"!O\7?\2\2\"#\7@\2\2#O\7?\2\2$%\7#\2\2%O\7?\2\2&\'\7(\2\2\'O\7(\2\2(O\7"+
		"~\2\2)*\7-\2\2*O\7-\2\2+,\7/\2\2,O\7/\2\2-O\t\6\2\2./\7>\2\2/O\7>\2\2"+
		"\60\61\7@\2\2\61O\7@\2\2\62\63\7@\2\2\63\64\7@\2\2\64O\7@\2\2\65\66\7"+
		"-\2\2\66O\7?\2\2\678\7/\2\28O\7?\2\29:\7,\2\2:O\7?\2\2;<\7\61\2\2<O\7"+
		"?\2\2=>\7(\2\2>O\7?\2\2?@\7~\2\2@O\7?\2\2AB\7`\2\2BO\7?\2\2CD\7\'\2\2"+
		"DO\7?\2\2EF\7>\2\2FG\7>\2\2GO\7?\2\2HI\7@\2\2IJ\7@\2\2JO\7?\2\2KL\7@\2"+
		"\2LM\7@\2\2MO\7?\2\2N\35\3\2\2\2N\36\3\2\2\2N \3\2\2\2N\"\3\2\2\2N$\3"+
		"\2\2\2N&\3\2\2\2N(\3\2\2\2N)\3\2\2\2N+\3\2\2\2N-\3\2\2\2N.\3\2\2\2N\60"+
		"\3\2\2\2N\62\3\2\2\2N\65\3\2\2\2N\67\3\2\2\2N9\3\2\2\2N;\3\2\2\2N=\3\2"+
		"\2\2N?\3\2\2\2NA\3\2\2\2NC\3\2\2\2NE\3\2\2\2NH\3\2\2\2NK\3\2\2\2O\f\3"+
		"\2\2\2\5\2\25N\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}