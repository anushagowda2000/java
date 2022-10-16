class ToysTester{
 
  public static void main(String toys[]){
  Toys.setToysId(12);
  System.out.println("the toys id is :" + Toys.getToysId());
  Toys.setContactNo(9018625342L);
  System.out.println( "the contact no is :" + Toys.getContactNo());
  Toys.setMaterial("fabric");
  System.out.println("the material is :" + Toys.getMaterial());
  Toys.setBrand("storio");
  System.out.println("the name is:" + Toys.getBrand());
  
  }

}