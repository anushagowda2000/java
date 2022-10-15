class Vessel{
   static int vesselId;
   static long contactNo;
   static String address;
   static String name;
 
    
	static  void setVesselId(int id){
		vesselId = id;
	}
    static int getVesselId(){
		return vesselId;
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