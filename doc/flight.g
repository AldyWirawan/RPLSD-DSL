grammar flight;
prog: flight_plan SPACE* ;
NULL : [\r];

SPACE : '\t' | ' ' | '\r' | '\n'| '\u000C' | '\n\t';

flight_plan
		: 'CREATE PLAN :' SPACE+ 
		   'tipe <=' SPACE+ type SPACE+
		   'id_pesawat <=' SPACE+ aircraft_id SPACE+
		   'tipe_pesawat <=' SPACE+ aircraft_type SPACE+ 
		   'kecepatan <=' SPACE+ true_airspeed SPACE+ 
		   'pendaratan <=' SPACE+ departure_point SPACE+ 
		   'waktu_mendarat <=' SPACE+ departure_time SPACE+ 
		   'cruising_altitude <=' SPACE+ cruising_alt SPACE+ 
		   'route <=' SPACE+ route SPACE+ 
		   'tujuan <=' SPACE+ destination SPACE+ 
		   'eta <=' SPACE+ eta SPACE+ 
		   'remark <=' SPACE+ remark SPACE+ 
		   'tangki <=' SPACE+ fuel SPACE+ 
		   'bandara_alternatif <=' SPACE+ alternate_airport SPACE+ 
		   'PIC <=' SPACE+ pic SPACE+ 
		   'nomor_berangkat <=' SPACE+ number_aboard SPACE+ 
		   'warna_pesawat <=' SPACE+ aircraft_color SPACE+ 
		   'kontak_tujuan <=' SPACE+ (destination_contact | NULL) SPACE+
		   'END;';
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