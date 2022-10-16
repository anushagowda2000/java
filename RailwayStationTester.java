class RailwayStationTester{
 
  public static void main(String railway[]){
  RailwayStation.setRailwayStationId(131);
  System.out.println( "the railway id is : " +  RailwayStation.getRailwayStationId());
  RailwayStation.setContactNo(2444516661L);
  System.out.println( "the contact no is :" + RailwayStation.getContactNo());
  RailwayStation.setAddress("bangalore");
  System.out.println("the address is : " + RailwayStation.getAddress());
  RailwayStation.setName("majestic");
  System.out.println("the name is:" + RailwayStation.getName());
  
  }

}
