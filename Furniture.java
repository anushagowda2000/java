class Furniture{
   static int furnitureId;
   static long contactNo;
   static String brand;
   static String shape;
 
	static  void setFurnitureId(int id){
		furnitureId = id;
	}
    static int getFurnitureId(){
		return furnitureId;
	}

	static  void setContactNo(long cNo){
		contactNo = cNo;
	}
    static long getContactNo(){
		return contactNo;
	}
 
   static void setBrand(String bran){
          brand = bran;
 }
static String getBrand(){
return brand;
}

	
	static void setShape(String shap){
		shape = shap;
	}
	static String getShape(){
		return shape;
	}
}