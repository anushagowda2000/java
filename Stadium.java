class Stadium{
static String stadiumNames[] = {null,null,null,null,null};
static int index;
public static boolean addStadiumNames(String stadiumName){
System.out.println("inside add stadiumName");
if(stadiumNames.length<=5){
stadiumNames[index] = stadiumName;
index++;
System.out.println("end add stadiumName");
return true;
}
else{
System.out.println("the names is only 5");
return false;
}
}
public static void getStadiumNames(){	
for(int index=0; index<stadiumNames.length; index++){
String ref = stadiumNames[index];
System.out.println("Stadium Name is " + ref);
}
}
}
