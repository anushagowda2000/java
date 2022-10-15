class Banks{
static String bankNames[] = {null,null,null,null,null};
static int index;
public static boolean addBankNames(String bankName){
System.out.println("inside add bankName");
if(bankNames.length<=5){
bankNames[index] = bankName;
index++;
System.out.println("end add bankName");
return true;
}
else{
	System.out.println("the banks are five");
	return false;
}
}
public static void getBankNames(){
for(int index=0; index<bankNames.length; index++){
String ref = bankNames[index];
System.out.println("Bank Name is " + ref);

}
}
}
