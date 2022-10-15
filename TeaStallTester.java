class TeaStallTester{
 
  public static void main(String teaStall[]){
  TeaStall.setTeaStallId(1234);
  System.out.println( "the teastall id is : " + TeaStall.getTeaStallId());
  TeaStall.setContactNo(123456891L);
  System.out.println( "the contact no is :" + TeaStall.getContactNo());
  TeaStall.setAddress("bangalore");
  System.out.println("the address is : " + TeaStall.getAddress());
  TeaStall.setName("cool");
  System.out.println("the name is:" + TeaStall.getName());
  
  }

}