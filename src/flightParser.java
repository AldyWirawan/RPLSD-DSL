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
		T__3=10, T__2=11, T__1=12, T__0=13, NULL=14, NEWLINE=15, POS_INT=16, STR=17, 
		NO_DME=18, DME=19, TACAN_ONLY=20, AREA_NAV=21, ADV_RNAV=22, Number=23;
	public static final String[] tokenNames = {
		"<INVALID>", "'NO'", "'IFR'", "'HITAM'", "'PUTIH'", "'DVFR'", "','", "'VFR'", 
		"':'", "'DP'", "'MERAH'", "'BIRU'", "'UTC'", "'L'", "NULL", "NEWLINE", 
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
		public List<TerminalNode> NEWLINE() { return getTokens(flightParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(flightParser.NEWLINE, i);
		}
		public List<Flight_planContext> flight_plan() {
			return getRuleContexts(Flight_planContext.class);
		}
		public Flight_planContext flight_plan(int i) {
			return getRuleContext(Flight_planContext.class,i);
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
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__8) | (1L << T__6))) != 0)) {
				{
				{
				setState(68); flight_plan();
				setState(69); match(NEWLINE);
				}
				}
				setState(75);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); type();
			setState(77); aircraft_id();
			setState(78); aircraft_type();
			setState(79); true_airspeed();
			setState(80); departure_point();
			setState(81); departure_time();
			setState(82); cruising_alt();
			setState(83); route();
			setState(84); destination();
			setState(85); eta();
			setState(86); remark();
			setState(87); fuel();
			setState(88); alternate_airport();
			setState(89); pic();
			setState(90); number_aboard();
			setState(91); aircraft_color();
			setState(94);
			switch (_input.LA(1)) {
			case STR:
				{
				setState(92); destination_contact();
				}
				break;
			case NULL:
				{
				setState(93); match(NULL);
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
			setState(96);
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
			setState(98); match(STR);
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
			setState(106);
			switch (_input.LA(1)) {
			case NO_DME:
				enterOuterAlt(_localctx, 1);
				{
				setState(100); match(NO_DME);
				}
				break;
			case DME:
				enterOuterAlt(_localctx, 2);
				{
				setState(101); match(DME);
				}
				break;
			case TACAN_ONLY:
				enterOuterAlt(_localctx, 3);
				{
				setState(102); match(TACAN_ONLY);
				}
				break;
			case AREA_NAV:
				enterOuterAlt(_localctx, 4);
				{
				setState(103); match(AREA_NAV);
				}
				break;
			case ADV_RNAV:
				enterOuterAlt(_localctx, 5);
				{
				setState(104); match(ADV_RNAV);
				}
				break;
			case POS_INT:
				enterOuterAlt(_localctx, 6);
				{
				setState(105); rvsm();
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
			setState(108); match(POS_INT);
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
			setState(110); match(POS_INT);
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
			setState(112); match(STR);
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
		public ProposedContext proposed() {
			return getRuleContext(ProposedContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); proposed();
			setState(115); actual();
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
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(117); match(T__1);
			setState(118); time();
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
		public TerminalNode POS_INT(int i) {
			return getToken(flightParser.POS_INT, i);
		}
		public List<TerminalNode> POS_INT() { return getTokens(flightParser.POS_INT); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); match(POS_INT);
			setState(121); match(POS_INT);
			setState(122); match(T__5);
			setState(123); match(POS_INT);
			setState(124); match(POS_INT);
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
			setState(126); match(T__1);
			setState(127); time();
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
			setState(129); match(POS_INT);
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
			setState(131); poly_line();
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
			{
			setState(133); match(Number);
			setState(134); match(T__7);
			setState(135); match(Number);
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
			setState(137); match(STR);
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
			setState(139); match(STR);
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
		public Airport_nameContext airport_name() {
			return getRuleContext(Airport_nameContext.class,0);
		}
		public CityContext city() {
			return getRuleContext(CityContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); airport_name();
			setState(142); city();
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
		public TerminalNode POS_INT(int i) {
			return getToken(flightParser.POS_INT, i);
		}
		public List<TerminalNode> POS_INT() { return getTokens(flightParser.POS_INT); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); match(POS_INT);
			setState(145); match(POS_INT);
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
			setState(147);
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
			setState(149); match(POS_INT);
			setState(150); match(T__0);
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
		public LattitudeContext lattitude() {
			return getRuleContext(LattitudeContext.class,0);
		}
		public TerminalNode STR() { return getToken(flightParser.STR, 0); }
		public LongitudeContext longitude() {
			return getRuleContext(LongitudeContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); match(STR);
			setState(153); lattitude();
			setState(154); longitude();
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
			setState(156); pilot_info();
			setState(157); aircraft_homebase();
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
		public TelpContext telp() {
			return getRuleContext(TelpContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); pilot_name();
			setState(160); pilot_address();
			setState(161); telp();
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
			setState(163); match(STR);
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
			setState(165); match(STR);
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
			setState(167); match(POS_INT);
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
		public TerminalNode STR() { return getToken(flightParser.STR, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); match(STR);
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
			setState(171); match(STR);
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
			setState(173); color();
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
			setState(175);
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
			setState(177); match(POS_INT);
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
			setState(179); match(Number);
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
			setState(181); match(Number);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u00ba\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3a\n\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6m\n\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\2\2$\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\5\5\2\4\4\7\7\t\t\4\2\3"+
		"\3\13\13\4\2\5\6\f\r\u009e\2K\3\2\2\2\4N\3\2\2\2\6b\3\2\2\2\bd\3\2\2\2"+
		"\nl\3\2\2\2\fn\3\2\2\2\16p\3\2\2\2\20r\3\2\2\2\22t\3\2\2\2\24w\3\2\2\2"+
		"\26z\3\2\2\2\30\u0080\3\2\2\2\32\u0083\3\2\2\2\34\u0085\3\2\2\2\36\u0087"+
		"\3\2\2\2 \u008b\3\2\2\2\"\u008d\3\2\2\2$\u008f\3\2\2\2&\u0092\3\2\2\2"+
		"(\u0095\3\2\2\2*\u0097\3\2\2\2,\u009a\3\2\2\2.\u009e\3\2\2\2\60\u00a1"+
		"\3\2\2\2\62\u00a5\3\2\2\2\64\u00a7\3\2\2\2\66\u00a9\3\2\2\28\u00ab\3\2"+
		"\2\2:\u00ad\3\2\2\2<\u00af\3\2\2\2>\u00b1\3\2\2\2@\u00b3\3\2\2\2B\u00b5"+
		"\3\2\2\2D\u00b7\3\2\2\2FG\5\4\3\2GH\7\21\2\2HJ\3\2\2\2IF\3\2\2\2JM\3\2"+
		"\2\2KI\3\2\2\2KL\3\2\2\2L\3\3\2\2\2MK\3\2\2\2NO\5\6\4\2OP\5\b\5\2PQ\5"+
		"\n\6\2QR\5\16\b\2RS\5\20\t\2ST\5\22\n\2TU\5\32\16\2UV\5\34\17\2VW\5$\23"+
		"\2WX\5&\24\2XY\5(\25\2YZ\5*\26\2Z[\5,\27\2[\\\5.\30\2\\]\5@!\2]`\5<\37"+
		"\2^a\5:\36\2_a\7\20\2\2`^\3\2\2\2`_\3\2\2\2a\5\3\2\2\2bc\t\2\2\2c\7\3"+
		"\2\2\2de\7\23\2\2e\t\3\2\2\2fm\7\24\2\2gm\7\25\2\2hm\7\26\2\2im\7\27\2"+
		"\2jm\7\30\2\2km\5\f\7\2lf\3\2\2\2lg\3\2\2\2lh\3\2\2\2li\3\2\2\2lj\3\2"+
		"\2\2lk\3\2\2\2m\13\3\2\2\2no\7\22\2\2o\r\3\2\2\2pq\7\22\2\2q\17\3\2\2"+
		"\2rs\7\23\2\2s\21\3\2\2\2tu\5\24\13\2uv\5\30\r\2v\23\3\2\2\2wx\7\16\2"+
		"\2xy\5\26\f\2y\25\3\2\2\2z{\7\22\2\2{|\7\22\2\2|}\7\n\2\2}~\7\22\2\2~"+
		"\177\7\22\2\2\177\27\3\2\2\2\u0080\u0081\7\16\2\2\u0081\u0082\5\26\f\2"+
		"\u0082\31\3\2\2\2\u0083\u0084\7\22\2\2\u0084\33\3\2\2\2\u0085\u0086\5"+
		"\36\20\2\u0086\35\3\2\2\2\u0087\u0088\7\31\2\2\u0088\u0089\7\b\2\2\u0089"+
		"\u008a\7\31\2\2\u008a\37\3\2\2\2\u008b\u008c\7\23\2\2\u008c!\3\2\2\2\u008d"+
		"\u008e\7\23\2\2\u008e#\3\2\2\2\u008f\u0090\5 \21\2\u0090\u0091\5\"\22"+
		"\2\u0091%\3\2\2\2\u0092\u0093\7\22\2\2\u0093\u0094\7\22\2\2\u0094\'\3"+
		"\2\2\2\u0095\u0096\t\3\2\2\u0096)\3\2\2\2\u0097\u0098\7\22\2\2\u0098\u0099"+
		"\7\17\2\2\u0099+\3\2\2\2\u009a\u009b\7\23\2\2\u009b\u009c\5B\"\2\u009c"+
		"\u009d\5D#\2\u009d-\3\2\2\2\u009e\u009f\5\60\31\2\u009f\u00a0\58\35\2"+
		"\u00a0/\3\2\2\2\u00a1\u00a2\5\62\32\2\u00a2\u00a3\5\64\33\2\u00a3\u00a4"+
		"\5\66\34\2\u00a4\61\3\2\2\2\u00a5\u00a6\7\23\2\2\u00a6\63\3\2\2\2\u00a7"+
		"\u00a8\7\23\2\2\u00a8\65\3\2\2\2\u00a9\u00aa\7\22\2\2\u00aa\67\3\2\2\2"+
		"\u00ab\u00ac\7\23\2\2\u00ac9\3\2\2\2\u00ad\u00ae\7\23\2\2\u00ae;\3\2\2"+
		"\2\u00af\u00b0\5> \2\u00b0=\3\2\2\2\u00b1\u00b2\t\4\2\2\u00b2?\3\2\2\2"+
		"\u00b3\u00b4\7\22\2\2\u00b4A\3\2\2\2\u00b5\u00b6\7\31\2\2\u00b6C\3\2\2"+
		"\2\u00b7\u00b8\7\31\2\2\u00b8E\3\2\2\2\5K`l";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}