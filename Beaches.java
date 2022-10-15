class Beaches{
static String beachNames[] = {null,null,null,null,null};
static int index;
public static boolean addBeachNames(String beachName){
System.out.println("inside add beachName");
beachNames[index] = beachName;
index++;
System.out.println("end add beachName");
return true;
}
public static void getBeachNames(){
	
for(int index=0; index<beachNames.length; index++){
String ref = beachNames[index];
System.out.println("Beach Name is " + ref);
}
}
}
