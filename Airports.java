class Airports{
static String airportNames[] = {null,null,null,null,null};
static int index;
public static boolean addAirportNames(String airportName){
System.out.println("inside add airportName");
if(airportNames.length<=5){
airportNames[index] = airportName;
index++;
System.out.println("end add airportName");
return true;
}
else{
System.out.println("the airports are secured");
return false;
}
}
public static void getAirportNames(){	
for(int index=0; index<airportNames.length; index++){
String ref = airportNames[index];
System.out.println("Airport Name is " + ref);
}
}
}
