class LeapYear{
    public static void main(String[] args){
	
	int year = 2004;
	if(year % 400 == 0 && year % 100 == 0 || year%100 == 0 && year%4 == 0){
	System.out.println("Leap year");
	}
	else
	System.out.println("Not a Leap year");
	
	
	}
}