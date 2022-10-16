class GalaxyTester{
 
  public static void main(String args[]){
  Galaxy.setGalaxyId(5774);
  System.out.println("the galaxyid is:" + Galaxy.getGalaxyId());
  
  Galaxy.setSpaces("200billion");
  System.out.println( "the spaces is :" + Galaxy.getSpaces());
 
  Galaxy.setOldest("jupiter");
  System.out.println("the oldest is : " + Galaxy.getOldest());
  
  Galaxy.setName("milky way");
  System.out.println("the name is:" + Galaxy.getName());
  
  }

}

// 1 error