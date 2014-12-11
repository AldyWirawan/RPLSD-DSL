// Generated from flight.g by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class flightParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, NULL=14, SPACE=15, NEWLINE=16, POS_INT=17, 
		STR=18, NO_DME=19, DME=20, TACAN_ONLY=21, AREA_NAV=22, ADV_RNAV=23, Number=24;
	public static final String[] tokenNames = {
		"<INVALID>", "'NO'", "'IFR'", "'HITAM'", "'PUTIH'", "'DVFR'", "','", "'VFR'", 
		"':'", "'DP'", "'MERAH'", "'BIRU'", "'UTC'", "'L'", "NULL", "SPACE", "NEWLINE", 
		"POS_INT", "STR", "NO_DME", "DME", "TACAN_ONLY", "AREA_NAV", "ADV_RNAV", 
		"Number"
	};
	public static final int
		RULE_prog = 0, RULE_flight_plan = 1, RULE_type = 2, RULE_aircraft_id = 3, 
		RULE_aircraft_type = 4, RULE_rvsm = 5, RULE_true_airspeed = 6, RULE_departure_point = 7, 
		RULE_departure_time = 8, RULE_proposed = 9, RULE_time = 10, RULE_actual = 11, 
		RULE_cruising_alt = 12, RULE_route = 13, RULE_poly_line = 14, RULE_airport_name = 15, 
		RULE_city = 16, RULE_destination = 17, RULE_eta = 18, RULE_remark = 19, 
		RULE_fuel = 20, RULE_alternate_airport = 21, RULE_pic = 22, RULE_pilot_info = 23, 
		RULE_pilot_name = 24, RULE_pilot_address = 25, RULE_telp = 26, RULE_aircraft_homebase = 27, 
		RULE_destination_contact = 28, RULE_aircraft_color = 29, RULE_color = 30, 
		RULE_number_aboard = 31, RULE_lattitude = 32, RULE_longitude = 33;
	public static final String[] ruleNames = {
		"prog", "flight_plan", "type", "aircraft_id", "aircraft_type", "rvsm", 
		"true_airspeed", "departure_point", "departure_time", "proposed", "time", 
		"actual", "cruising_alt", "route", "poly_line", "airport_name", "city", 
		"destination", "eta", "remark", "fuel", "alternate_airport", "pic", "pilot_info", 
		"pilot_name", "pilot_address", "telp", "aircraft_homebase", "destination_contact", 
		"aircraft_color", "color", "number_aboard", "lattitude", "longitude"
	};

	@Override
	public String getGrammarFileName() { return "flight.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public flightParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<TerminalNode> SPACE() { return getTokens(flightParser.SPACE); }
		public Flight_planContext flight_plan() {
			return getRuleContext(Flight_planContext.class,0);
		}
		public TerminalNode SPACE(int i) {
			return getToken(flightParser.SPACE, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); flight_plan();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(69); match(SPACE);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Flight_planContext extends ParserRuleContext {
		public PicContext pic() {
			return getRuleContext(PicContext.class,0);
		}
		public Aircraft_typeContext aircraft_type() {
			return getRuleContext(Aircraft_typeContext.class,0);
		}
		public Destination_contactContext destination_contact() {
			return getRuleContext(Destination_contactContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(flightParser.SPACE); }
		public Number_aboardContext number_aboard() {
			return getRuleContext(Number_aboardContext.class,0);
		}
		public RouteContext route() {
			return getRuleContext(RouteContext.class,0);
		}
		public RemarkContext remark() {
			return getRuleContext(RemarkContext.class,0);
		}
		public Aircraft_idContext aircraft_id() {
			return getRuleContext(Aircraft_idContext.class,0);
		}
		public Departure_pointContext departure_point() {
			return getRuleContext(Departure_pointContext.class,0);
		}
		public Cruising_altContext cruising_alt() {
			return getRuleContext(Cruising_altContext.class,0);
		}
		public EtaContext eta() {
			return getRuleContext(EtaContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FuelContext fuel() {
			return getRuleContext(FuelContext.class,0);
		}
		public Aircraft_colorContext aircraft_color() {
			return getRuleContext(Aircraft_colorContext.class,0);
		}
		public Alternate_airportContext alternate_airport() {
			return getRuleContext(Alternate_airportContext.class,0);
		}
		public True_airspeedContext true_airspeed() {
			return getRuleContext(True_airspeedContext.class,0);
		}
		public Departure_timeContext departure_time() {
			return getRuleContext(Departure_timeContext.class,0);
		}
		public TerminalNode NULL() { return getToken(flightParser.NULL, 0); }
		public TerminalNode SPACE(int i) {
			return getToken(flightParser.SPACE, i);
		}
		public DestinationContext destination() {
			return getRuleContext(DestinationContext.class,0);
		}
		public Flight_planContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flight_plan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterFlight_plan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitFlight_plan(this);
		}
	}

	public final Flight_planContext flight_plan() throws RecognitionException {
		Flight_planContext _localctx = new Flight_planContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_flight_plan);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); type();
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76); match(SPACE);
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(81); aircraft_id();
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(82); match(SPACE);
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(87); aircraft_type();
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(88); match(SPACE);
				}
				}
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(93); true_airspeed();
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(94); match(SPACE);
				}
				}
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(99); departure_point();
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100); match(SPACE);
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(105); departure_time();
			setState(107); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(106); match(SPACE);
				}
				}
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(111); cruising_alt();
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112); match(SPACE);
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(117); route();
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118); match(SPACE);
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(123); destination();
			setState(125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(124); match(SPACE);
				}
				}
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(129); eta();
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130); match(SPACE);
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(135); remark();
			setState(137); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(136); match(SPACE);
				}
				}
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(141); fuel();
			setState(143); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(142); match(SPACE);
				}
				}
				setState(145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(147); alternate_airport();
			setState(149); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(148); match(SPACE);
				}
				}
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(153); pic();
			setState(155); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(154); match(SPACE);
				}
				}
				setState(157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(159); number_aboard();
			setState(161); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(160); match(SPACE);
				}
				}
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(165); aircraft_color();
			setState(167); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(166); match(SPACE);
				}
				}
				setState(169); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(173);
			switch (_input.LA(1)) {
			case STR:
				{
				setState(171); destination_contact();
				}
				break;
			case NULL:
				{
				setState(172); match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__8) | (1L << T__6))) != 0)) ) {
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

	public static class Aircraft_idContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(flightParser.STR, 0); }
		public Aircraft_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aircraft_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterAircraft_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitAircraft_id(this);
		}
	}

	public final Aircraft_idContext aircraft_id() throws RecognitionException {
		Aircraft_idContext _localctx = new Aircraft_idContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_aircraft_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); match(STR);
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

	public static class Aircraft_typeContext extends ParserRuleContext {
		public TerminalNode ADV_RNAV() { return getToken(flightParser.ADV_RNAV, 0); }
		public TerminalNode AREA_NAV() { return getToken(flightParser.AREA_NAV, 0); }
		public TerminalNode NO_DME() { return getToken(flightParser.NO_DME, 0); }
		public RvsmContext rvsm() {
			return getRuleContext(RvsmContext.class,0);
		}
		public TerminalNode TACAN_ONLY() { return getToken(flightParser.TACAN_ONLY, 0); }
		public TerminalNode DME() { return getToken(flightParser.DME, 0); }
		public Aircraft_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aircraft_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterAircraft_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitAircraft_type(this);
		}
	}

	public final Aircraft_typeContext aircraft_type() throws RecognitionException {
		Aircraft_typeContext _localctx = new Aircraft_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_aircraft_type);
		try {
			setState(185);
			switch (_input.LA(1)) {
			case NO_DME:
				enterOuterAlt(_localctx, 1);
				{
				setState(179); match(NO_DME);
				}
				break;
			case DME:
				enterOuterAlt(_localctx, 2);
				{
				setState(180); match(DME);
				}
				break;
			case TACAN_ONLY:
				enterOuterAlt(_localctx, 3);
				{
				setState(181); match(TACAN_ONLY);
				}
				break;
			case AREA_NAV:
				enterOuterAlt(_localctx, 4);
				{
				setState(182); match(AREA_NAV);
				}
				break;
			case ADV_RNAV:
				enterOuterAlt(_localctx, 5);
				{
				setState(183); match(ADV_RNAV);
				}
				break;
			case POS_INT:
				enterOuterAlt(_localctx, 6);
				{
				setState(184); rvsm();
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

	public static class RvsmContext extends ParserRuleContext {
		public TerminalNode POS_INT() { return getToken(flightParser.POS_INT, 0); }
		public RvsmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rvsm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterRvsm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitRvsm(this);
		}
	}

	public final RvsmContext rvsm() throws RecognitionException {
		RvsmContext _localctx = new RvsmContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rvsm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187); match(POS_INT);
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

	public static class True_airspeedContext extends ParserRuleContext {
		public TerminalNode POS_INT() { return getToken(flightParser.POS_INT, 0); }
		public True_airspeedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_true_airspeed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterTrue_airspeed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitTrue_airspeed(this);
		}
	}

	public final True_airspeedContext true_airspeed() throws RecognitionException {
		True_airspeedContext _localctx = new True_airspeedContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_true_airspeed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189); match(POS_INT);
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

	public static class Departure_pointContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(flightParser.STR, 0); }
		public Departure_pointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_departure_point; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterDeparture_point(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitDeparture_point(this);
		}
	}

	public final Departure_pointContext departure_point() throws RecognitionException {
		Departure_pointContext _localctx = new Departure_pointContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_departure_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191); match(STR);
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

	public static class Departure_timeContext extends ParserRuleContext {
		public ActualContext actual() {
			return getRuleContext(ActualContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(flightParser.SPACE); }
		public ProposedContext proposed() {
			return getRuleContext(ProposedContext.class,0);
		}
		public TerminalNode SPACE(int i) {
			return getToken(flightParser.SPACE, i);
		}
		public Departure_timeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_departure_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterDeparture_time(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitDeparture_time(this);
		}
	}

	public final Departure_timeContext departure_time() throws RecognitionException {
		Departure_timeContext _localctx = new Departure_timeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_departure_time);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); proposed();
			setState(195); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(194); match(SPACE);
				}
				}
				setState(197); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(199); actual();
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

	public static class ProposedContext extends ParserRuleContext {
		public List<TerminalNode> SPACE() { return getTokens(flightParser.SPACE); }
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public TerminalNode SPACE(int i) {
			return getToken(flightParser.SPACE, i);
		}
		public ProposedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proposed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterProposed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitProposed(this);
		}
	}

	public final ProposedContext proposed() throws RecognitionException {
		ProposedContext _localctx = new ProposedContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_proposed);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201); match(T__1);
			setState(203); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(202); match(SPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(205); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(207); time();
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

	public static class TimeContext extends ParserRuleContext {
		public List<TerminalNode> SPACE() { return getTokens(flightParser.SPACE); }
		public TerminalNode POS_INT(int i) {
			return getToken(flightParser.POS_INT, i);
		}
		public List<TerminalNode> POS_INT() { return getTokens(flightParser.POS_INT); }
		public TerminalNode SPACE(int i) {
			return getToken(flightParser.SPACE, i);
		}
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitTime(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_time);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(209); match(SPACE);
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215); match(POS_INT);
			setState(217); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(216); match(SPACE);
				}
				}
				setState(219); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(221); match(POS_INT);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(222); match(SPACE);
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228); match(T__5);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(229); match(SPACE);
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235); match(POS_INT);
			setState(237); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(236); match(SPACE);
				}
				}
				setState(239); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(241); match(POS_INT);
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

	public static class ActualContext extends ParserRuleContext {
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public ActualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterActual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitActual(this);
		}
	}

	public final ActualContext actual() throws RecognitionException {
		ActualContext _localctx = new ActualContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_actual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); match(T__1);
			setState(244); time();
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

	public static class Cruising_altContext extends ParserRuleContext {
		public TerminalNode POS_INT() { return getToken(flightParser.POS_INT, 0); }
		public Cruising_altContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cruising_alt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterCruising_alt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitCruising_alt(this);
		}
	}

	public final Cruising_altContext cruising_alt() throws RecognitionException {
		Cruising_altContext _localctx = new Cruising_altContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cruising_alt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246); match(POS_INT);
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

	public static class RouteContext extends ParserRuleContext {
		public Poly_lineContext poly_line() {
			return getRuleContext(Poly_lineContext.class,0);
		}
		public RouteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_route; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterRoute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitRoute(this);
		}
	}

	public final RouteContext route() throws RecognitionException {
		RouteContext _localctx = new RouteContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_route);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); poly_line();
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

	public static class Poly_lineContext extends ParserRuleContext {
		public List<TerminalNode> Number() { return getTokens(flightParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(flightParser.Number, i);
		}
		public Poly_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_poly_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterPoly_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitPoly_line(this);
		}
	}

	public final Poly_lineContext poly_line() throws RecognitionException {
		Poly_lineContext _localctx = new Poly_lineContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_poly_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); match(Number);
			setState(251); match(T__7);
			setState(252); match(Number);
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

	public static class Airport_nameContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(flightParser.STR, 0); }
		public Airport_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_airport_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterAirport_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitAirport_name(this);
		}
	}

	public final Airport_nameContext airport_name() throws RecognitionException {
		Airport_nameContext _localctx = new Airport_nameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_airport_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); match(STR);
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

	public static class CityContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(flightParser.STR, 0); }
		public CityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_city; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterCity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitCity(this);
		}
	}

	public final CityContext city() throws RecognitionException {
		CityContext _localctx = new CityContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_city);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256); match(STR);
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

	public static class DestinationContext extends ParserRuleContext {
		public List<TerminalNode> SPACE() { return getTokens(flightParser.SPACE); }
		public Airport_nameContext airport_name() {
			return getRuleContext(Airport_nameContext.class,0);
		}
		public CityContext city() {
			return getRuleContext(CityContext.class,0);
		}
		public TerminalNode SPACE(int i) {
			return getToken(flightParser.SPACE, i);
		}
		public DestinationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destination; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterDestination(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitDestination(this);
		}
	}

	public final DestinationContext destination() throws RecognitionException {
		DestinationContext _localctx = new DestinationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_destination);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258); airport_name();
			setState(260); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(259); match(SPACE);
				}
				}
				setState(262); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(264); city();
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

	public static class EtaContext extends ParserRuleContext {
		public List<TerminalNode> SPACE() { return getTokens(flightParser.SPACE); }
		public TerminalNode POS_INT(int i) {
			return getToken(flightParser.POS_INT, i);
		}
		public List<TerminalNode> POS_INT() { return getTokens(flightParser.POS_INT); }
		public TerminalNode SPACE(int i) {
			return getToken(flightParser.SPACE, i);
		}
		public EtaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterEta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitEta(this);
		}
	}

	public final EtaContext eta() throws RecognitionException {
		EtaContext _localctx = new EtaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_eta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266); match(POS_INT);
			setState(268); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(267); match(SPACE);
				}
				}
				setState(270); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(272); match(POS_INT);
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

	public static class RemarkContext extends ParserRuleContext {
		public RemarkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remark; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterRemark(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitRemark(this);
		}
	}

	public final RemarkContext remark() throws RecognitionException {
		RemarkContext _localctx = new RemarkContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_remark);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==T__4) ) {
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

	public static class FuelContext extends ParserRuleContext {
		public TerminalNode POS_INT() { return getToken(flightParser.POS_INT, 0); }
		public FuelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fuel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterFuel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitFuel(this);
		}
	}

	public final FuelContext fuel() throws RecognitionException {
		FuelContext _localctx = new FuelContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fuel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276); match(POS_INT);
			setState(277); match(T__0);
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

	public static class Alternate_airportContext extends ParserRuleContext {
		public List<TerminalNode> SPACE() { return getTokens(flightParser.SPACE); }
		public LattitudeContext lattitude() {
			return getRuleContext(LattitudeContext.class,0);
		}
		public TerminalNode STR() { return getToken(flightParser.STR, 0); }
		public LongitudeContext longitude() {
			return getRuleContext(LongitudeContext.class,0);
		}
		public TerminalNode SPACE(int i) {
			return getToken(flightParser.SPACE, i);
		}
		public Alternate_airportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternate_airport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterAlternate_airport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitAlternate_airport(this);
		}
	}

	public final Alternate_airportContext alternate_airport() throws RecognitionException {
		Alternate_airportContext _localctx = new Alternate_airportContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_alternate_airport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279); match(STR);
			setState(281); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(280); match(SPACE);
				}
				}
				setState(283); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(285); lattitude();
			setState(287); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(286); match(SPACE);
				}
				}
				setState(289); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(291); longitude();
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

	public static class PicContext extends ParserRuleContext {
		public Aircraft_homebaseContext aircraft_homebase() {
			return getRuleContext(Aircraft_homebaseContext.class,0);
		}
		public Pilot_infoContext pilot_info() {
			return getRuleContext(Pilot_infoContext.class,0);
		}
		public PicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterPic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitPic(this);
		}
	}

	public final PicContext pic() throws RecognitionException {
		PicContext _localctx = new PicContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_pic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293); pilot_info();
			setState(294); aircraft_homebase();
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

	public static class Pilot_infoContext extends ParserRuleContext {
		public Pilot_addressContext pilot_address() {
			return getRuleContext(Pilot_addressContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(flightParser.SPACE); }
		public TelpContext telp() {
			return getRuleContext(TelpContext.class,0);
		}
		public TerminalNode SPACE(int i) {
			return getToken(flightParser.SPACE, i);
		}
		public Pilot_nameContext pilot_name() {
			return getRuleContext(Pilot_nameContext.class,0);
		}
		public Pilot_infoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pilot_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterPilot_info(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitPilot_info(this);
		}
	}

	public final Pilot_infoContext pilot_info() throws RecognitionException {
		Pilot_infoContext _localctx = new Pilot_infoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_pilot_info);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296); pilot_name();
			setState(298); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(297); match(SPACE);
				}
				}
				setState(300); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(302); pilot_address();
			setState(304); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(303); match(SPACE);
				}
				}
				setState(306); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(308); telp();
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

	public static class Pilot_nameContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(flightParser.STR, 0); }
		public Pilot_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pilot_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterPilot_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitPilot_name(this);
		}
	}

	public final Pilot_nameContext pilot_name() throws RecognitionException {
		Pilot_nameContext _localctx = new Pilot_nameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pilot_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310); match(STR);
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

	public static class Pilot_addressContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(flightParser.STR, 0); }
		public Pilot_addressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pilot_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterPilot_address(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitPilot_address(this);
		}
	}

	public final Pilot_addressContext pilot_address() throws RecognitionException {
		Pilot_addressContext _localctx = new Pilot_addressContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_pilot_address);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312); match(STR);
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

	public static class TelpContext extends ParserRuleContext {
		public TerminalNode POS_INT() { return getToken(flightParser.POS_INT, 0); }
		public TelpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_telp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterTelp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitTelp(this);
		}
	}

	public final TelpContext telp() throws RecognitionException {
		TelpContext _localctx = new TelpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_telp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314); match(POS_INT);
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

	public static class Aircraft_homebaseContext extends ParserRuleContext {
		public List<TerminalNode> SPACE() { return getTokens(flightParser.SPACE); }
		public TerminalNode STR() { return getToken(flightParser.STR, 0); }
		public TerminalNode SPACE(int i) {
			return getToken(flightParser.SPACE, i);
		}
		public Aircraft_homebaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aircraft_homebase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterAircraft_homebase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitAircraft_homebase(this);
		}
	}

	public final Aircraft_homebaseContext aircraft_homebase() throws RecognitionException {
		Aircraft_homebaseContext _localctx = new Aircraft_homebaseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_aircraft_homebase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(316); match(SPACE);
				}
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(322); match(STR);
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

	public static class Destination_contactContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(flightParser.STR, 0); }
		public Destination_contactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destination_contact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterDestination_contact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitDestination_contact(this);
		}
	}

	public final Destination_contactContext destination_contact() throws RecognitionException {
		Destination_contactContext _localctx = new Destination_contactContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_destination_contact);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324); match(STR);
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

	public static class Aircraft_colorContext extends ParserRuleContext {
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public Aircraft_colorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aircraft_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterAircraft_color(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitAircraft_color(this);
		}
	}

	public final Aircraft_colorContext aircraft_color() throws RecognitionException {
		Aircraft_colorContext _localctx = new Aircraft_colorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_aircraft_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326); color();
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

	public static class ColorContext extends ParserRuleContext {
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitColor(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_color);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__9) | (1L << T__3) | (1L << T__2))) != 0)) ) {
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

	public static class Number_aboardContext extends ParserRuleContext {
		public TerminalNode POS_INT() { return getToken(flightParser.POS_INT, 0); }
		public Number_aboardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_aboard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterNumber_aboard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitNumber_aboard(this);
		}
	}

	public final Number_aboardContext number_aboard() throws RecognitionException {
		Number_aboardContext _localctx = new Number_aboardContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_number_aboard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330); match(POS_INT);
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

	public static class LattitudeContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(flightParser.Number, 0); }
		public LattitudeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lattitude; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterLattitude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitLattitude(this);
		}
	}

	public final LattitudeContext lattitude() throws RecognitionException {
		LattitudeContext _localctx = new LattitudeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_lattitude);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332); match(Number);
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

	public static class LongitudeContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(flightParser.Number, 0); }
		public LongitudeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longitude; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).enterLongitude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof flightListener ) ((flightListener)listener).exitLongitude(this);
		}
	}

	public final LongitudeContext longitude() throws RecognitionException {
		LongitudeContext _localctx = new LongitudeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_longitude);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334); match(Number);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32\u0153\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\7\2I\n\2\f\2\16\2L\13\2\3\3\3\3\6\3P\n\3\r\3"+
		"\16\3Q\3\3\3\3\6\3V\n\3\r\3\16\3W\3\3\3\3\6\3\\\n\3\r\3\16\3]\3\3\3\3"+
		"\6\3b\n\3\r\3\16\3c\3\3\3\3\6\3h\n\3\r\3\16\3i\3\3\3\3\6\3n\n\3\r\3\16"+
		"\3o\3\3\3\3\6\3t\n\3\r\3\16\3u\3\3\3\3\6\3z\n\3\r\3\16\3{\3\3\3\3\6\3"+
		"\u0080\n\3\r\3\16\3\u0081\3\3\3\3\6\3\u0086\n\3\r\3\16\3\u0087\3\3\3\3"+
		"\6\3\u008c\n\3\r\3\16\3\u008d\3\3\3\3\6\3\u0092\n\3\r\3\16\3\u0093\3\3"+
		"\3\3\6\3\u0098\n\3\r\3\16\3\u0099\3\3\3\3\6\3\u009e\n\3\r\3\16\3\u009f"+
		"\3\3\3\3\6\3\u00a4\n\3\r\3\16\3\u00a5\3\3\3\3\6\3\u00aa\n\3\r\3\16\3\u00ab"+
		"\3\3\3\3\5\3\u00b0\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00bc"+
		"\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\6\n\u00c6\n\n\r\n\16\n\u00c7\3\n"+
		"\3\n\3\13\3\13\6\13\u00ce\n\13\r\13\16\13\u00cf\3\13\3\13\3\f\7\f\u00d5"+
		"\n\f\f\f\16\f\u00d8\13\f\3\f\3\f\6\f\u00dc\n\f\r\f\16\f\u00dd\3\f\3\f"+
		"\7\f\u00e2\n\f\f\f\16\f\u00e5\13\f\3\f\3\f\7\f\u00e9\n\f\f\f\16\f\u00ec"+
		"\13\f\3\f\3\f\6\f\u00f0\n\f\r\f\16\f\u00f1\3\f\3\f\3\r\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\6\23\u0107"+
		"\n\23\r\23\16\23\u0108\3\23\3\23\3\24\3\24\6\24\u010f\n\24\r\24\16\24"+
		"\u0110\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\6\27\u011c\n\27\r"+
		"\27\16\27\u011d\3\27\3\27\6\27\u0122\n\27\r\27\16\27\u0123\3\27\3\27\3"+
		"\30\3\30\3\30\3\31\3\31\6\31\u012d\n\31\r\31\16\31\u012e\3\31\3\31\6\31"+
		"\u0133\n\31\r\31\16\31\u0134\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\35\7\35\u0140\n\35\f\35\16\35\u0143\13\35\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\5\5\2\4\4\7\7\t\t\4\2\3\3\13\13\4"+
		"\2\5\6\f\r\u0155\2F\3\2\2\2\4M\3\2\2\2\6\u00b1\3\2\2\2\b\u00b3\3\2\2\2"+
		"\n\u00bb\3\2\2\2\f\u00bd\3\2\2\2\16\u00bf\3\2\2\2\20\u00c1\3\2\2\2\22"+
		"\u00c3\3\2\2\2\24\u00cb\3\2\2\2\26\u00d6\3\2\2\2\30\u00f5\3\2\2\2\32\u00f8"+
		"\3\2\2\2\34\u00fa\3\2\2\2\36\u00fc\3\2\2\2 \u0100\3\2\2\2\"\u0102\3\2"+
		"\2\2$\u0104\3\2\2\2&\u010c\3\2\2\2(\u0114\3\2\2\2*\u0116\3\2\2\2,\u0119"+
		"\3\2\2\2.\u0127\3\2\2\2\60\u012a\3\2\2\2\62\u0138\3\2\2\2\64\u013a\3\2"+
		"\2\2\66\u013c\3\2\2\28\u0141\3\2\2\2:\u0146\3\2\2\2<\u0148\3\2\2\2>\u014a"+
		"\3\2\2\2@\u014c\3\2\2\2B\u014e\3\2\2\2D\u0150\3\2\2\2FJ\5\4\3\2GI\7\21"+
		"\2\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\3\3\2\2\2LJ\3\2\2\2MO\5"+
		"\6\4\2NP\7\21\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2SU"+
		"\5\b\5\2TV\7\21\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2\2"+
		"Y[\5\n\6\2Z\\\7\21\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^_\3\2"+
		"\2\2_a\5\16\b\2`b\7\21\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2de\3"+
		"\2\2\2eg\5\20\t\2fh\7\21\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j"+
		"k\3\2\2\2km\5\22\n\2ln\7\21\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2"+
		"\2pq\3\2\2\2qs\5\32\16\2rt\7\21\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3"+
		"\2\2\2vw\3\2\2\2wy\5\34\17\2xz\7\21\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2"+
		"{|\3\2\2\2|}\3\2\2\2}\177\5$\23\2~\u0080\7\21\2\2\177~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0085\5&\24\2\u0084\u0086\7\21\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3"+
		"\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008b\5(\25\2\u008a\u008c\7\21\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3"+
		"\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0091\5*\26\2\u0090\u0092\7\21\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3"+
		"\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0097\5,\27\2\u0096\u0098\7\21\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3"+
		"\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009d\5.\30\2\u009c\u009e\7\21\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3"+
		"\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a3\5@!\2\u00a2\u00a4\7\21\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a9\5<\37\2\u00a8\u00aa\7\21\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3"+
		"\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad"+
		"\u00b0\5:\36\2\u00ae\u00b0\7\20\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3"+
		"\2\2\2\u00b0\5\3\2\2\2\u00b1\u00b2\t\2\2\2\u00b2\7\3\2\2\2\u00b3\u00b4"+
		"\7\24\2\2\u00b4\t\3\2\2\2\u00b5\u00bc\7\25\2\2\u00b6\u00bc\7\26\2\2\u00b7"+
		"\u00bc\7\27\2\2\u00b8\u00bc\7\30\2\2\u00b9\u00bc\7\31\2\2\u00ba\u00bc"+
		"\5\f\7\2\u00bb\u00b5\3\2\2\2\u00bb\u00b6\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bb"+
		"\u00b8\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\13\3\2\2"+
		"\2\u00bd\u00be\7\23\2\2\u00be\r\3\2\2\2\u00bf\u00c0\7\23\2\2\u00c0\17"+
		"\3\2\2\2\u00c1\u00c2\7\24\2\2\u00c2\21\3\2\2\2\u00c3\u00c5\5\24\13\2\u00c4"+
		"\u00c6\7\21\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3"+
		"\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\5\30\r\2\u00ca"+
		"\23\3\2\2\2\u00cb\u00cd\7\16\2\2\u00cc\u00ce\7\21\2\2\u00cd\u00cc\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d2\5\26\f\2\u00d2\25\3\2\2\2\u00d3\u00d5\7\21"+
		"\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db\7\23"+
		"\2\2\u00da\u00dc\7\21\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e3\7\23"+
		"\2\2\u00e0\u00e2\7\21\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e6\u00ea\7\n\2\2\u00e7\u00e9\7\21\2\2\u00e8\u00e7\3\2\2\2\u00e9"+
		"\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2"+
		"\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ef\7\23\2\2\u00ee\u00f0\7\21\2\2\u00ef"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\7\23\2\2\u00f4\27\3\2\2\2\u00f5\u00f6"+
		"\7\16\2\2\u00f6\u00f7\5\26\f\2\u00f7\31\3\2\2\2\u00f8\u00f9\7\23\2\2\u00f9"+
		"\33\3\2\2\2\u00fa\u00fb\5\36\20\2\u00fb\35\3\2\2\2\u00fc\u00fd\7\32\2"+
		"\2\u00fd\u00fe\7\b\2\2\u00fe\u00ff\7\32\2\2\u00ff\37\3\2\2\2\u0100\u0101"+
		"\7\24\2\2\u0101!\3\2\2\2\u0102\u0103\7\24\2\2\u0103#\3\2\2\2\u0104\u0106"+
		"\5 \21\2\u0105\u0107\7\21\2\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2"+
		"\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b"+
		"\5\"\22\2\u010b%\3\2\2\2\u010c\u010e\7\23\2\2\u010d\u010f\7\21\2\2\u010e"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u0112\3\2\2\2\u0112\u0113\7\23\2\2\u0113\'\3\2\2\2\u0114\u0115"+
		"\t\3\2\2\u0115)\3\2\2\2\u0116\u0117\7\23\2\2\u0117\u0118\7\17\2\2\u0118"+
		"+\3\2\2\2\u0119\u011b\7\24\2\2\u011a\u011c\7\21\2\2\u011b\u011a\3\2\2"+
		"\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f"+
		"\3\2\2\2\u011f\u0121\5B\"\2\u0120\u0122\7\21\2\2\u0121\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u0126\5D#\2\u0126-\3\2\2\2\u0127\u0128\5\60\31\2\u0128\u0129"+
		"\58\35\2\u0129/\3\2\2\2\u012a\u012c\5\62\32\2\u012b\u012d\7\21\2\2\u012c"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\u0130\3\2\2\2\u0130\u0132\5\64\33\2\u0131\u0133\7\21\2\2\u0132"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2"+
		"\2\2\u0135\u0136\3\2\2\2\u0136\u0137\5\66\34\2\u0137\61\3\2\2\2\u0138"+
		"\u0139\7\24\2\2\u0139\63\3\2\2\2\u013a\u013b\7\24\2\2\u013b\65\3\2\2\2"+
		"\u013c\u013d\7\23\2\2\u013d\67\3\2\2\2\u013e\u0140\7\21\2\2\u013f\u013e"+
		"\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0145\7\24\2\2\u01459\3\2\2\2"+
		"\u0146\u0147\7\24\2\2\u0147;\3\2\2\2\u0148\u0149\5> \2\u0149=\3\2\2\2"+
		"\u014a\u014b\t\4\2\2\u014b?\3\2\2\2\u014c\u014d\7\23\2\2\u014dA\3\2\2"+
		"\2\u014e\u014f\7\32\2\2\u014fC\3\2\2\2\u0150\u0151\7\32\2\2\u0151E\3\2"+
		"\2\2#JQW]ciou{\u0081\u0087\u008d\u0093\u0099\u009f\u00a5\u00ab\u00af\u00bb"+
		"\u00c7\u00cf\u00d6\u00dd\u00e3\u00ea\u00f1\u0108\u0110\u011d\u0123\u012e"+
		"\u0134\u0141";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}