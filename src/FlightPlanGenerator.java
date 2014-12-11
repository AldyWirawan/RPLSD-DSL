import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class FlightPlanGenerator {

	String type;
	String aircraft_id;
	String aircraft_type;
	String true_airspeed;
	String departure_point;
	String departure_time;
	String cruising_alt;
	String route;
	String destination;
	String eta;
	String remark;
	String fuel;
	String alternate_airport;
	String pic;
	String number_aboard;
	String aircraft_color;
	String destination_contact;

	public void init(InputStream is) {
		flightLexer l = null;
		try {
			l = new flightLexer(new ANTLRInputStream(is));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		flightParser p = new flightParser(new CommonTokenStream(l));

		p.addErrorListener(new BaseErrorListener() {
				@Override
				public void syntaxError(Recognizer<?, ?> recognizer,
						Object offendingSymbol, int line, int charPositionInLine,
						String msg, RecognitionException e) {
							throw new IllegalStateException("failed to parse at line "
							+ line + " due to " + msg, e);
						}
		});
			
		p.addParseListener(new flightBaseListener() {

			@Override
			public void exitType(flightParser.TypeContext ctx) {
				type = ctx.getText();
			}
			
			@Override
			public void exitAircraft_id(flightParser.Aircraft_idContext ctx) {
				aircraft_id = ctx.getText();
			}
			
			@Override
			public void exitAircraft_type(flightParser.Aircraft_typeContext ctx) {
				aircraft_type = ctx.getText();
			}
			
			@Override
			public void exitTrue_airspeed(flightParser.True_airspeedContext ctx) {
				true_airspeed = ctx.getText();
			}
			
			@Override
			public void exitDeparture_point(flightParser.Departure_pointContext ctx) {
				departure_point = ctx.getText();
			}
			
			@Override
			public void exitDeparture_time(flightParser.Departure_timeContext ctx) {
				departure_time = ctx.getText();
			}
			
			@Override
			public void exitCruising_alt(flightParser.Cruising_altContext ctx) {
				cruising_alt = ctx.getText();
			}
			
			@Override
			public void exitRoute(flightParser.RouteContext ctx) {
				route = ctx.getText();
			}
			
			@Override
			public void exitDestination(flightParser.DestinationContext ctx) {
				destination = ctx.getText();
			}
			
			@Override
			public void exitEta(flightParser.EtaContext ctx) {
				eta = ctx.getText();
			}
			
			@Override
			public void exitRemark(flightParser.RemarkContext ctx) {
				remark = ctx.getText();
			}
			
			@Override
			public void exitFuel(flightParser.FuelContext ctx) {
				fuel = ctx.getText();
			}
			
			@Override
			public void exitAlternate_airport(flightParser.Alternate_airportContext ctx) {
				alternate_airport = ctx.getText();
			}
			
			@Override
			public void exitPic(flightParser.PicContext ctx) {
				pic = ctx.getText();
			}
			
			@Override
			public void exitNumber_aboard(flightParser.Number_aboardContext ctx) {
				number_aboard = ctx.getText();
			}
			
			@Override
			public void exitAircraft_color(flightParser.Aircraft_colorContext ctx) {
				aircraft_color = ctx.getText();
			}
			
			@Override
			public void exitDestination_contact(flightParser.Destination_contactContext ctx) {
				destination_contact = ctx.getText();
			}
			
		});
		
		p.prog();
		
		System.out.println("FLIGHT PLAN");
		System.out.println("type : " + destination);
		System.out.println("aircraft ID : " + aircraft_id);
		System.out.println("aircraft type : " + aircraft_type);
		System.out.println("true airspeed : " + true_airspeed);
		System.out.println("departure point : " + departure_point);
		System.out.println("cruising altitude : " + cruising_alt);
		System.out.println("route : " + route);
		System.out.println("destination : " + destination);
		System.out.println("ETA : " + eta);
		System.out.println("remark : " + remark);
		System.out.println("fuel : " + fuel);
		System.out.println("alternate airport : " + alternate_airport);
		System.out.println("PIC : " + pic);
		System.out.println("number aboard : " + number_aboard);
		System.out.println("aircraft color : " + aircraft_color);
		System.out.println("destination contact : " + destination_contact);
		

	}
	
	public static void main(String[] args) {
		FlightPlanGenerator fpg = new FlightPlanGenerator();
		try {
			FileInputStream fis = new FileInputStream("doc/testcase");
			fpg.init(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
