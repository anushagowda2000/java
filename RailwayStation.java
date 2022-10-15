class RailwayStation{
   static int railwayStationId;
   static long contactNo;
   static String address;
   static String name;
 
    //setter and getter
	static  void setRailwayStationId(int id){
        railwayStationId = id;
	}
    static int getRailwayStationId(){
		return railwayStationId;
	}

	static  void setContactNo(long cNo){
		contactNo = cNo;
	}
    static long getContactNo(){
		return contactNo;
	}
 
    static void setAddress(String addres){
		address = addres;
	}
    static String getAddress(){
	    return address;

    }
	
	static void setName(String nam){
		name = nam;
	}
	static String getName(){
		return name;
	}
}