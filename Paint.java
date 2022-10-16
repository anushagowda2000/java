class Paint{

  static int paintId;
  static String brandName;
  static String colour;
  
  static void setPaintId(int id){
  paintId = id;
  }
  static int getPaintId(){
  return paintId;
  }
  
  static void setBrandName(String name){
	  brandName = name;
  }
  static String getBrandName(){
	return brandName;
  }
  
  static void setColour(String color){
	  colour = color;
  }
  static String getColour(){
	  return colour;
  }

}