grammar flight;
prog: (flight_plan NEWLINE)* ;
NULL : [\r];
flight_plan
		: type aircraft_id aircraft_type true_airspeed departure_point departure_time cruising_alt route destination eta remark fuel alternate_airport pic number_aboard aircraft_color (destination_contact | NULL);
type 
		: 'VFR' | 'IFR' | 'DVFR';
NEWLINE
		: [\r\n]+ ;

POS_INT : ('0'..'9')+;

STR		: ('A'..'Z')+;

aircraft_id : STR;

aircraft_type : NO_DME | DME | TACAN_ONLY | AREA_NAV | ADV_RNAV | rvsm;

rvsm : POS_INT;

NO_DME 
		: 'X' | 'T' | 'U';
DME 
		: 'D' | 'B' | 'A' ;
TACAN_ONLY 
		: 'M' | 'N' | 'P' ;
AREA_NAV
		: 'Y' | 'C' | 'I' ;
ADV_RNAV
		: 'E' | 'F' | 'G' | 'R';
true_airspeed
		: POS_INT;	

departure_point 
		: STR;

departure_time
		: proposed actual;
proposed 
		: 'UTC' time;
time 
		: POS_INT POS_INT ':' POS_INT POS_INT;

actual 
		: 'UTC' time;
cruising_alt 
		: POS_INT;
route 
		: poly_line;
Number :
		('0'..'9')+ ('.' ('0'..'9')+)?
		;
poly_line 
		: (Number ',' Number);

airport_name
		: STR;

city
		: STR;

destination 
		: airport_name city;

eta		
		: POS_INT POS_INT;
remark	
		: 'NO' | 'DP';
fuel	
		: POS_INT 'L';

alternate_airport	
		: STR lattitude longitude;
pic 
		: pilot_info aircraft_homebase;
pilot_info	
		: pilot_name pilot_address telp;
pilot_name			
		: STR ;
pilot_address		: STR ;
telp				: POS_INT ;
aircraft_homebase 	: STR ;
destination_contact	: STR ;
aircraft_color		: color ;
color 				: 'BIRU' | 'MERAH' | 'PUTIH' | 'HITAM';
number_aboard		: POS_INT ;
lattitude			: Number ;
longitude			: Number ;