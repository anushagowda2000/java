class Toys{
   static int toysId;
   static long contactNo;
   static String material;
   static String brand;
 
    //setter and getter
	static  void setToysId(int id){
		toysId = id;
	}
    static int getToysId(){
		return toysId;
	}

	static  void setContactNo(long cNo){
		contactNo = cNo;
	}
    static long getContactNo(){
		return contactNo;
	}
 
    static void setMaterial(String mat){
		material = mat;
	}
    static String getMaterial(){
	    return material;
		
    }
	
	static void setBrand(String band){
		brand = band;
	}
	static String getBrand(){
		return brand;
	}
}