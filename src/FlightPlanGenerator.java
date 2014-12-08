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

	String all;
	String[] cut;

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
			public void exitFlight_plan(flightParser.Flight_planContext ctx) {
				all = ctx.getText();
			}
		});
		
		System.out.println (all);
		//cut = all.split(" ");		
		
		p.prog();
		
		System.out.println("FLIGHT PLAN");
		System.out.println("type :" + cut[0]);
		System.out.println("aircraft ID :" + cut[1]);
		System.out.println("aircraft type :" + cut[2]);
		System.out.println("true airspeed :" + cut[3]);
		System.out.println("departure point :" + cut[4]);
		System.out.println("proposed departure time :" + cut[5] + " " + cut[6] + cut[7] + " " + cut[8] + " " + cut[9] + cut[10]);
		System.out.println("actual departure time :" + cut[11] + " " + cut[12] + cut[13] + " " + cut[14] + " " + cut[15] + cut[16]);
		System.out.println("cruising altitude :" + cut[17]);
		System.out.println("route :" + cut[18] + cut[19] + cut[20]);
		System.out.println("destination :" + cut[21] + " " + cut[22]);
		System.out.println("ETA :" + cut[23] + ":" + cut[24]);
		System.out.println("remark :" + cut[25]);
		System.out.println("fuel :" + cut[26]);
		System.out.println("alternate airport :" + cut[27] + " " + cut[28] + " " + cut[29]);
		System.out.println("PIC :" + cut[30] + " " + cut[31] + " " + cut[32] + " " + cut[33]);
		System.out.println("number aboard :" + cut[34]);
		System.out.println("aircraft color :" + cut[35]);
		System.out.println("destination contact :" + cut[36]);
		

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
