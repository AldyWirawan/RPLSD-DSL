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
		T__3=10, T__2=11, T__1=12, T__0=13, NULL=14, NEWLINE=15, POS_INT=16, STR=17, 
		NO_DME=18, DME=19, TACAN_ONLY=20, AREA_NAV=21, ADV_RNAV=22, Number=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'"
	};
	public static final String[] ruleNames = {
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "NULL", "NEWLINE", "POS_INT", "STR", "NO_DME", 
		"DME", "TACAN_ONLY", "AREA_NAV", "ADV_RNAV", "Number"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u008d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\6\20i\n\20\r\20\16\20j\3\21\6\21n\n\21\r\21\16\21o\3\22"+
		"\6\22s\n\22\r\22\16\22t\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\6\30\u0082\n\30\r\30\16\30\u0083\3\30\3\30\6\30\u0088\n\30\r"+
		"\30\16\30\u0089\5\30\u008c\n\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\3\2\t\3\2\17\17\4\2\f\f\17\17\4\2VWZZ\4\2CDFF\4\2OPRR\5\2EEKK[[\4"+
		"\2GITT\u0092\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\3\61\3\2\2\2\5\64\3\2\2\2\78\3\2\2\2\t>\3\2\2\2\13D\3\2"+
		"\2\2\rI\3\2\2\2\17K\3\2\2\2\21O\3\2\2\2\23Q\3\2\2\2\25T\3\2\2\2\27Z\3"+
		"\2\2\2\31_\3\2\2\2\33c\3\2\2\2\35e\3\2\2\2\37h\3\2\2\2!m\3\2\2\2#r\3\2"+
		"\2\2%v\3\2\2\2\'x\3\2\2\2)z\3\2\2\2+|\3\2\2\2-~\3\2\2\2/\u0081\3\2\2\2"+
		"\61\62\7P\2\2\62\63\7Q\2\2\63\4\3\2\2\2\64\65\7K\2\2\65\66\7H\2\2\66\67"+
		"\7T\2\2\67\6\3\2\2\289\7J\2\29:\7K\2\2:;\7V\2\2;<\7C\2\2<=\7O\2\2=\b\3"+
		"\2\2\2>?\7R\2\2?@\7W\2\2@A\7V\2\2AB\7K\2\2BC\7J\2\2C\n\3\2\2\2DE\7F\2"+
		"\2EF\7X\2\2FG\7H\2\2GH\7T\2\2H\f\3\2\2\2IJ\7.\2\2J\16\3\2\2\2KL\7X\2\2"+
		"LM\7H\2\2MN\7T\2\2N\20\3\2\2\2OP\7<\2\2P\22\3\2\2\2QR\7F\2\2RS\7R\2\2"+
		"S\24\3\2\2\2TU\7O\2\2UV\7G\2\2VW\7T\2\2WX\7C\2\2XY\7J\2\2Y\26\3\2\2\2"+
		"Z[\7D\2\2[\\\7K\2\2\\]\7T\2\2]^\7W\2\2^\30\3\2\2\2_`\7W\2\2`a\7V\2\2a"+
		"b\7E\2\2b\32\3\2\2\2cd\7N\2\2d\34\3\2\2\2ef\t\2\2\2f\36\3\2\2\2gi\t\3"+
		"\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2k \3\2\2\2ln\4\62;\2ml\3\2"+
		"\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2p\"\3\2\2\2qs\4C\\\2rq\3\2\2\2st\3\2"+
		"\2\2tr\3\2\2\2tu\3\2\2\2u$\3\2\2\2vw\t\4\2\2w&\3\2\2\2xy\t\5\2\2y(\3\2"+
		"\2\2z{\t\6\2\2{*\3\2\2\2|}\t\7\2\2},\3\2\2\2~\177\t\b\2\2\177.\3\2\2\2"+
		"\u0080\u0082\4\62;\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u008b\3\2\2\2\u0085\u0087\7\60\2\2"+
		"\u0086\u0088\4\62;\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0085\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\60\3\2\2\2\t\2jot\u0083\u0089\u008b\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}