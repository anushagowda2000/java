class TouristPlace{
static String touristPlaces[] = {null,null,null,null,null,null,null};
static int index;
public static boolean addTouristPlaces(String touristPlace){
System.out.println("inside add touristPlace");
if(touristPlaces.length<=7){
touristPlaces[index] = touristPlace;
index++;
System.out.println("end add touristPlace");
return true;
}
else{
System.out.println("the names is only 7");
return false;
}
}
public static void getTouristPlaces(){	
for(int index=0; index<touristPlaces.length; index++){
String ref = touristPlaces[index];
System.out.println("Tourist place is " + ref);
}
}
}
