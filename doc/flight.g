grammar flight;
prog: flight_plan SPACE* ;
NULL : [\r];

SPACE : '\t' | ' ' | '\r' | '\n'| '\u000C';

flight_plan
		: type SPACE+ aircraft_id SPACE+ aircraft_type SPACE+ true_airspeed SPACE+ departure_point SPACE+ departure_time SPACE+ cruising_alt SPACE+ route SPACE+ destination SPACE+ eta SPACE+ remark SPACE+ fuel SPACE+ alternate_airport SPACE+ pic SPACE+ number_aboard SPACE+ aircraft_color SPACE+ (destination_contact | NULL);
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
		: proposed SPACE+ actual;
proposed 
		: 'UTC' SPACE+ time;
time 
		: SPACE* POS_INT SPACE+ POS_INT SPACE* ':' SPACE* POS_INT SPACE+ POS_INT;

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
		: Number ',' Number;

airport_name
		: STR;

city
		: STR;

destination 
		: airport_name SPACE+ city;

eta		
		: POS_INT SPACE+ POS_INT;
remark	
		: 'NO' | 'DP';
fuel	
		: POS_INT 'L';

alternate_airport	
		: STR SPACE+ lattitude SPACE+ longitude;
pic 
		: pilot_info aircraft_homebase;
pilot_info	
		: pilot_name SPACE+ pilot_address SPACE+ telp;
pilot_name			
		: STR ;
pilot_address		: STR ;
telp				: POS_INT ;

aircraft_homebase 	: SPACE* STR ;
destination_contact	: STR ;
aircraft_color		: color ;
color 				: 'BIRU' | 'MERAH' | 'PUTIH' | 'HITAM';
number_aboard		: POS_INT ;
lattitude			: Number ;
longitude			: Number ;