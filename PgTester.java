class PgTester{
 
  public static void main(String pg[]){
  Pg.setPgId(1234);
  System.out.println( "the pg id is :" + Pg.getPgId());
  
  Pg.setContactNo(123456891L);
  System.out.println( "the contact no is :" + Pg.getContactNo());
  
  Pg.setAddress("bangalore");
  System.out.println("the address is :" + Pg.getAddress());
  
  Pg.setName("khushi");
  System.out.println("the name is:" + Pg.getName());
  
  }

}