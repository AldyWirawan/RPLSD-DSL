// Generated from flight.g by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class flightLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, NULL=14, SPACE=15, NEWLINE=16, POS_INT=17, 
		STR=18, NO_DME=19, DME=20, TACAN_ONLY=21, AREA_NAV=22, ADV_RNAV=23, Number=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'"
	};
	public static final String[] ruleNames = {
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "NULL", "SPACE", "NEWLINE", "POS_INT", 
		"STR", "NO_DME", "DME", "TACAN_ONLY", "AREA_NAV", "ADV_RNAV", "Number"
	};


	public flightLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "flight.g"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u0091\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\6\21m\n\21\r\21\16\21n\3\22\6\22"+
		"r\n\22\r\22\16\22s\3\23\6\23w\n\23\r\23\16\23x\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\6\31\u0086\n\31\r\31\16\31\u0087\3\31\3"+
		"\31\6\31\u008c\n\31\r\31\16\31\u008d\5\31\u0090\n\31\2\2\32\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\n\3\2\17\17\5\2\13\f\16\17\"\""+
		"\4\2\f\f\17\17\4\2VWZZ\4\2CDFF\4\2OPRR\5\2EEKK[[\4\2GITT\u0096\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\3\63\3\2\2\2\5\66\3\2\2\2\7:\3\2\2\2\t@\3\2\2\2\13F\3\2\2\2\rK"+
		"\3\2\2\2\17M\3\2\2\2\21Q\3\2\2\2\23S\3\2\2\2\25V\3\2\2\2\27\\\3\2\2\2"+
		"\31a\3\2\2\2\33e\3\2\2\2\35g\3\2\2\2\37i\3\2\2\2!l\3\2\2\2#q\3\2\2\2%"+
		"v\3\2\2\2\'z\3\2\2\2)|\3\2\2\2+~\3\2\2\2-\u0080\3\2\2\2/\u0082\3\2\2\2"+
		"\61\u0085\3\2\2\2\63\64\7P\2\2\64\65\7Q\2\2\65\4\3\2\2\2\66\67\7K\2\2"+
		"\678\7H\2\289\7T\2\29\6\3\2\2\2:;\7J\2\2;<\7K\2\2<=\7V\2\2=>\7C\2\2>?"+
		"\7O\2\2?\b\3\2\2\2@A\7R\2\2AB\7W\2\2BC\7V\2\2CD\7K\2\2DE\7J\2\2E\n\3\2"+
		"\2\2FG\7F\2\2GH\7X\2\2HI\7H\2\2IJ\7T\2\2J\f\3\2\2\2KL\7.\2\2L\16\3\2\2"+
		"\2MN\7X\2\2NO\7H\2\2OP\7T\2\2P\20\3\2\2\2QR\7<\2\2R\22\3\2\2\2ST\7F\2"+
		"\2TU\7R\2\2U\24\3\2\2\2VW\7O\2\2WX\7G\2\2XY\7T\2\2YZ\7C\2\2Z[\7J\2\2["+
		"\26\3\2\2\2\\]\7D\2\2]^\7K\2\2^_\7T\2\2_`\7W\2\2`\30\3\2\2\2ab\7W\2\2"+
		"bc\7V\2\2cd\7E\2\2d\32\3\2\2\2ef\7N\2\2f\34\3\2\2\2gh\t\2\2\2h\36\3\2"+
		"\2\2ij\t\3\2\2j \3\2\2\2km\t\4\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2"+
		"\2\2o\"\3\2\2\2pr\4\62;\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t$\3"+
		"\2\2\2uw\4C\\\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y&\3\2\2\2z{\t"+
		"\5\2\2{(\3\2\2\2|}\t\6\2\2}*\3\2\2\2~\177\t\7\2\2\177,\3\2\2\2\u0080\u0081"+
		"\t\b\2\2\u0081.\3\2\2\2\u0082\u0083\t\t\2\2\u0083\60\3\2\2\2\u0084\u0086"+
		"\4\62;\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u008f\3\2\2\2\u0089\u008b\7\60\2\2\u008a\u008c\4"+
		"\62;\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u0089\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\62\3\2\2\2\t\2nsx\u0087\u008d\u008f\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}