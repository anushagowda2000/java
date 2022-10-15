class TeaStall{
   static int teaStallId;
   static long contactNo;
   static String address;
   static String name;
 
    //setter and getter
	static  void setTeaStallId(int id){
		teaStallId = id;
	}
    static int getTeaStallId(){
		return teaStallId;
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