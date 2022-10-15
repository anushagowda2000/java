class FurnitureTester{
 
  public static void main(String furniture[]){
  Furniture.setFurnitureId(1234);
  System.out.println("the furniture id is :" + Furniture.getFurnitureId());
  
  Furniture.setContactNo(123456891L);
  System.out.println( "the contact no is :" + Furniture.getContactNo());
  
  Furniture.setBrand("crafts");
  System.out.println("Brand is:" + Furniture.getBrand());

  Furniture.setShape("round");
  System.out.println("the shape is :" + Furniture.getShape());
  
  }

}