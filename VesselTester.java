class VesselTester{
 
  public static void main(String vessel[]){
  Vessel.setVesselId(1234);
  System.out.println("the vessel id is :" + Vessel.getVesselId());
  
  Vessel.setContactNo(123456891L);
  System.out.println("the contact no is :" + Vessel.getContactNo());
  
  Vessel.setAddress("mysore");
  System.out.println("the address is :" + Vessel.getAddress());
  
  Vessel.setName("mysore railway station");
  System.out.println("the name is:" + Vessel.getName());
  
  }

}