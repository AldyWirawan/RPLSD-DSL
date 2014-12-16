import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

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

	public String[] init(InputStream is) {
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
		/*
		System.out.println("FLIGHT PLAN");
		System.out.println("type : " + type);
		System.out.println("aircraft ID : " + aircraft_id);
		System.out.println("aircraft type : " + aircraft_type);
		System.out.println("true airspeed : " + true_airspeed);
		System.out.println("departure point : " + departure_point);
		System.out.println("departure time : " + departure_time);
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
		*/
		String[] ret = new String[]{type, aircraft_id, aircraft_type,
				true_airspeed, departure_point, departure_time, cruising_alt,
				route, destination, eta, remark, fuel, alternate_airport,
				pic, number_aboard, aircraft_color, destination_contact};
		return ret;

	}
	
	public static void printTable(String[] header, String[][] table){
		StringBuffer format = new StringBuffer();
//		for(int i = 0; i < header.length; i++){
//			format.append("%" + (header[i].length() + 5) + "s");
//		}
		format.append("%-13s%-13s%-15s%-15s%-17s%-35s%-19s%-20s%-24s%-7s%-10s%-8s%-27s%-37s%-15s%-15s%-17s");
		
		System.out.format(format.toString().concat("\n"), header);
		for (String[] row : table){
			System.out.format(format.toString().concat("\n"), row);
		}
	}
	
	public static String[][] searchRow(String[][] table, int columnNum, String searchTerm){
		List<String[]> ret = new ArrayList<String[]>();
		for(String[] row : table){
			if (row[columnNum].contentEquals(searchTerm)) ret.add(row);
		}
		return ret.toArray(new String[ret.size()][]);
	}
	
	public enum columnNames {flight_type, aircraft_id, aircraft_type, true_airspeed, departure_point, departure_time, cruising_altitude, route, destination, eta, remark, fuel, alternate_airport, pic, number_aboard, aircraft_color, destination_contact};
	
	public static void main(String[] args) {
		FlightPlanGenerator fpg = new FlightPlanGenerator();
		
		try {
			FileInputStream fis;
			int numberTestCase = 3;
			
			StringBuffer testcaseFileFormat = new StringBuffer();
			testcaseFileFormat.append("doc/testcase");
			
			String[] header = new String[]{"Flight_Type", "Aircraft_ID", "Aircraft_Type", "True_Airspeed", "Departure_Point", "Departure_Time", "Cruising_Altitude", "Route", "Destination", "ETA", "Remark", "Fuel", "Alternate_Airport", "PIC", "Number_Aboard", "Aircraft_Color", "Destination_Contact"};
			String[][] flightTable = new String[numberTestCase][];
			
			//Initialize flight plan table from N testcase files
			for(int i = 0; i < numberTestCase; i++){
				fis = new FileInputStream(testcaseFileFormat.toString().concat(String.valueOf(i+1)));
				flightTable[i] = fpg.init(fis);
			}
			
			//Print initial table
			printTable(header, flightTable);
			
			
			//Prompt for user's input
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String input = null;
			do {
				try{
					System.out.println("Enter command.\n1. Search a specific plan: search <column_name> <search term>\n2. Terminat: quit");
					input = reader.readLine();
					String[] inputArgs = input.split("\\s+");
					
					//Do search on flight plan table
					if (inputArgs[0].contentEquals("search") && inputArgs.length == 3){
						String[][] ret = searchRow(flightTable, columnNames.valueOf(inputArgs[1].toLowerCase()).ordinal(), inputArgs[2]);
						System.out.println("Search Result:");
						if (ret.length > 0){
							printTable(header, ret);
						} else {
							System.out.println("No plans matched");
						}
					}
				} catch (IOException ioe){
					System.out.println("Error while reading input.");
				}
			} while (!input.contentEquals("quit"));
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
