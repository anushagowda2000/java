class EmpireHotel{
  public static void main(String appu[]){
  
   String type = "3 Star Hotel";
   String address = "Kormangala";
   String[] managerNames = {"Bryan Tillman","Deborah","Scott Griith","Natalia","Anusha"};
   int noOfManagers = 5;
   String foodMenu[] = {"chilli kebab","grilled chicken","masala papad","chilli chicken","alfaham chicken","mutton raan","egg noodles","mutton noodles","prawns noodles","mutton kurma","fish curry","kadai chicken","jumbo fish","kalmi kabab","chicken varaval"};
   System.out.println("Welcome to EmpireHotel");
   System.out.println("EmpireHotel is "+ type);
   System.out.println("EmpireHotel address is"+ address);
   System.out.println("EmpireHotel managerNames is");
   for(int s=0; s<managerNames.length; s++){
       System.out.println(managerNames[s] + " ");
	 }
	System.out.println("list of managers" + noOfManagers); 
    for(int h=0; h<foodMenu.length; h++){
	 System.out.println(foodMenu[h] + " ");
	}
	}
	}
	