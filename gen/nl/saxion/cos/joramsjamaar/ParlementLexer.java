// Generated from C:/data/A416939/Desktop/43-master/src\Parlement.g4 by ANTLR 4.9.1
package nl.saxion.cos.joramsjamaar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParlementLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T_INT=9, 
		T_STRING=10, T_BOOLEAN=11, LEFT_PARENTHESES=12, RIGHT_PARENTHESES=13, 
		LEFT_CURLYBRACKET=14, RIGHT_CURLYBRACKET=15, INT=16, BOOLEAN=17, STRING=18, 
		ADD=19, SUB=20, MUL=21, DIV=22, ASSIGN=23, GT=24, LT=25, EQUAL=26, NOTEQUAL=27, 
		AND=28, OR=29, IDENTIFIER=30, WS=31, COMMENT=32, BLOCK_COMMENT=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T_INT", 
			"T_STRING", "T_BOOLEAN", "LEFT_PARENTHESES", "RIGHT_PARENTHESES", "LEFT_CURLYBRACKET", 
			"RIGHT_CURLYBRACKET", "INT", "BOOLEAN", "STRING", "ADD", "SUB", "MUL", 
			"DIV", "ASSIGN", "GT", "LT", "EQUAL", "NOTEQUAL", "AND", "OR", "IDENTIFIER", 
			"WS", "COMMENT", "BLOCK_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'WILLIE WIL JE DIT OPLEZEN ALSJEBLIEFT'", "'ALS'", "'DAN'", "'ANDERS'", 
			"'MARK RUTTE WIL JE DIT'", "'KEER HERHALEN'", "'OKE STOP MAAR'", "'MOTIE'", 
			"'int'", "'string'", "'bool'", "'('", "')'", "'{'", "'}'", null, null, 
			null, "'+'", "'-'", "'*'", "'/'", "'='", "'>'", "'<'", "'=='", "'!='", 
			"'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "T_INT", "T_STRING", 
			"T_BOOLEAN", "LEFT_PARENTHESES", "RIGHT_PARENTHESES", "LEFT_CURLYBRACKET", 
			"RIGHT_CURLYBRACKET", "INT", "BOOLEAN", "STRING", "ADD", "SUB", "MUL", 
			"DIV", "ASSIGN", "GT", "LT", "EQUAL", "NOTEQUAL", "AND", "OR", "IDENTIFIER", 
			"WS", "COMMENT", "BLOCK_COMMENT"
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


	public ParlementLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Parlement.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u012a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\21\7\21\u00ce\n\21\f\21\16\21\u00d1\13\21\5\21\u00d3\n\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00df\n\22\3\23"+
		"\3\23\7\23\u00e3\n\23\f\23\16\23\u00e6\13\23\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\7\37\u0106\n\37"+
		"\f\37\16\37\u0109\13\37\3 \6 \u010c\n \r \16 \u010d\3 \3 \3!\3!\3!\3!"+
		"\7!\u0116\n!\f!\16!\u0119\13!\3!\3!\3\"\3\"\3\"\3\"\7\"\u0121\n\"\f\""+
		"\16\"\u0124\13\"\3\"\3\"\3\"\3\"\3\"\3\u0122\2#\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#\3\2\t\3\2\63"+
		";\3\2\62;\3\2\62\63\4\2\f\f\17\17\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17"+
		"\17\"\"\2\u0132\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3"+
		"\2\2\2\5k\3\2\2\2\7o\3\2\2\2\ts\3\2\2\2\13z\3\2\2\2\r\u0090\3\2\2\2\17"+
		"\u009e\3\2\2\2\21\u00ac\3\2\2\2\23\u00b2\3\2\2\2\25\u00b6\3\2\2\2\27\u00bd"+
		"\3\2\2\2\31\u00c2\3\2\2\2\33\u00c4\3\2\2\2\35\u00c6\3\2\2\2\37\u00c8\3"+
		"\2\2\2!\u00d2\3\2\2\2#\u00de\3\2\2\2%\u00e0\3\2\2\2\'\u00e9\3\2\2\2)\u00eb"+
		"\3\2\2\2+\u00ed\3\2\2\2-\u00ef\3\2\2\2/\u00f1\3\2\2\2\61\u00f3\3\2\2\2"+
		"\63\u00f5\3\2\2\2\65\u00f7\3\2\2\2\67\u00fa\3\2\2\29\u00fd\3\2\2\2;\u0100"+
		"\3\2\2\2=\u0103\3\2\2\2?\u010b\3\2\2\2A\u0111\3\2\2\2C\u011c\3\2\2\2E"+
		"F\7Y\2\2FG\7K\2\2GH\7N\2\2HI\7N\2\2IJ\7K\2\2JK\7G\2\2KL\7\"\2\2LM\7Y\2"+
		"\2MN\7K\2\2NO\7N\2\2OP\7\"\2\2PQ\7L\2\2QR\7G\2\2RS\7\"\2\2ST\7F\2\2TU"+
		"\7K\2\2UV\7V\2\2VW\7\"\2\2WX\7Q\2\2XY\7R\2\2YZ\7N\2\2Z[\7G\2\2[\\\7\\"+
		"\2\2\\]\7G\2\2]^\7P\2\2^_\7\"\2\2_`\7C\2\2`a\7N\2\2ab\7U\2\2bc\7L\2\2"+
		"cd\7G\2\2de\7D\2\2ef\7N\2\2fg\7K\2\2gh\7G\2\2hi\7H\2\2ij\7V\2\2j\4\3\2"+
		"\2\2kl\7C\2\2lm\7N\2\2mn\7U\2\2n\6\3\2\2\2op\7F\2\2pq\7C\2\2qr\7P\2\2"+
		"r\b\3\2\2\2st\7C\2\2tu\7P\2\2uv\7F\2\2vw\7G\2\2wx\7T\2\2xy\7U\2\2y\n\3"+
		"\2\2\2z{\7O\2\2{|\7C\2\2|}\7T\2\2}~\7M\2\2~\177\7\"\2\2\177\u0080\7T\2"+
		"\2\u0080\u0081\7W\2\2\u0081\u0082\7V\2\2\u0082\u0083\7V\2\2\u0083\u0084"+
		"\7G\2\2\u0084\u0085\7\"\2\2\u0085\u0086\7Y\2\2\u0086\u0087\7K\2\2\u0087"+
		"\u0088\7N\2\2\u0088\u0089\7\"\2\2\u0089\u008a\7L\2\2\u008a\u008b\7G\2"+
		"\2\u008b\u008c\7\"\2\2\u008c\u008d\7F\2\2\u008d\u008e\7K\2\2\u008e\u008f"+
		"\7V\2\2\u008f\f\3\2\2\2\u0090\u0091\7M\2\2\u0091\u0092\7G\2\2\u0092\u0093"+
		"\7G\2\2\u0093\u0094\7T\2\2\u0094\u0095\7\"\2\2\u0095\u0096\7J\2\2\u0096"+
		"\u0097\7G\2\2\u0097\u0098\7T\2\2\u0098\u0099\7J\2\2\u0099\u009a\7C\2\2"+
		"\u009a\u009b\7N\2\2\u009b\u009c\7G\2\2\u009c\u009d\7P\2\2\u009d\16\3\2"+
		"\2\2\u009e\u009f\7Q\2\2\u009f\u00a0\7M\2\2\u00a0\u00a1\7G\2\2\u00a1\u00a2"+
		"\7\"\2\2\u00a2\u00a3\7U\2\2\u00a3\u00a4\7V\2\2\u00a4\u00a5\7Q\2\2\u00a5"+
		"\u00a6\7R\2\2\u00a6\u00a7\7\"\2\2\u00a7\u00a8\7O\2\2\u00a8\u00a9\7C\2"+
		"\2\u00a9\u00aa\7C\2\2\u00aa\u00ab\7T\2\2\u00ab\20\3\2\2\2\u00ac\u00ad"+
		"\7O\2\2\u00ad\u00ae\7Q\2\2\u00ae\u00af\7V\2\2\u00af\u00b0\7K\2\2\u00b0"+
		"\u00b1\7G\2\2\u00b1\22\3\2\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7p\2\2\u00b4"+
		"\u00b5\7v\2\2\u00b5\24\3\2\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7v\2\2\u00b8"+
		"\u00b9\7t\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc\7i\2\2"+
		"\u00bc\26\3\2\2\2\u00bd\u00be\7d\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0\7"+
		"q\2\2\u00c0\u00c1\7n\2\2\u00c1\30\3\2\2\2\u00c2\u00c3\7*\2\2\u00c3\32"+
		"\3\2\2\2\u00c4\u00c5\7+\2\2\u00c5\34\3\2\2\2\u00c6\u00c7\7}\2\2\u00c7"+
		"\36\3\2\2\2\u00c8\u00c9\7\177\2\2\u00c9 \3\2\2\2\u00ca\u00d3\7\62\2\2"+
		"\u00cb\u00cf\t\2\2\2\u00cc\u00ce\t\3\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1"+
		"\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d2\u00cb\3\2\2\2\u00d3\"\3\2\2\2"+
		"\u00d4\u00d5\7v\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7w\2\2\u00d7\u00df"+
		"\7g\2\2\u00d8\u00d9\7h\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7n\2\2\u00db"+
		"\u00dc\7u\2\2\u00dc\u00df\7g\2\2\u00dd\u00df\t\4\2\2\u00de\u00d4\3\2\2"+
		"\2\u00de\u00d8\3\2\2\2\u00de\u00dd\3\2\2\2\u00df$\3\2\2\2\u00e0\u00e4"+
		"\7$\2\2\u00e1\u00e3\n\5\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e7\u00e8\7$\2\2\u00e8&\3\2\2\2\u00e9\u00ea\7-\2\2\u00ea(\3\2\2"+
		"\2\u00eb\u00ec\7/\2\2\u00ec*\3\2\2\2\u00ed\u00ee\7,\2\2\u00ee,\3\2\2\2"+
		"\u00ef\u00f0\7\61\2\2\u00f0.\3\2\2\2\u00f1\u00f2\7?\2\2\u00f2\60\3\2\2"+
		"\2\u00f3\u00f4\7@\2\2\u00f4\62\3\2\2\2\u00f5\u00f6\7>\2\2\u00f6\64\3\2"+
		"\2\2\u00f7\u00f8\7?\2\2\u00f8\u00f9\7?\2\2\u00f9\66\3\2\2\2\u00fa\u00fb"+
		"\7#\2\2\u00fb\u00fc\7?\2\2\u00fc8\3\2\2\2\u00fd\u00fe\7(\2\2\u00fe\u00ff"+
		"\7(\2\2\u00ff:\3\2\2\2\u0100\u0101\7~\2\2\u0101\u0102\7~\2\2\u0102<\3"+
		"\2\2\2\u0103\u0107\t\6\2\2\u0104\u0106\t\7\2\2\u0105\u0104\3\2\2\2\u0106"+
		"\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108>\3\2\2\2"+
		"\u0109\u0107\3\2\2\2\u010a\u010c\t\b\2\2\u010b\u010a\3\2\2\2\u010c\u010d"+
		"\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0110\b \2\2\u0110@\3\2\2\2\u0111\u0112\7\61\2\2\u0112\u0113\7\61\2\2"+
		"\u0113\u0117\3\2\2\2\u0114\u0116\n\5\2\2\u0115\u0114\3\2\2\2\u0116\u0119"+
		"\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u011a\u011b\b!\2\2\u011bB\3\2\2\2\u011c\u011d\7\61\2\2"+
		"\u011d\u011e\7,\2\2\u011e\u0122\3\2\2\2\u011f\u0121\13\2\2\2\u0120\u011f"+
		"\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123"+
		"\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\7,\2\2\u0126\u0127\7\61"+
		"\2\2\u0127\u0128\3\2\2\2\u0128\u0129\b\"\3\2\u0129D\3\2\2\2\13\2\u00cf"+
		"\u00d2\u00de\u00e4\u0107\u010d\u0117\u0122\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}