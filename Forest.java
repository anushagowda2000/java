class Forest{
   public static void main(String anu[]){
   
   String name = "Amazon";
   String totalArea = "290321 hectare";
   String type = "decidious forest";
   String region = "Africa";
   String forestDetail[] = {name,totalArea,type,region};
   String primaryAnimals[] = {"lion","tiger","elephant","fox","cheetha"};
   for( int index=0; index<forestDetail.length; index++){
   String ref = forestDetail[index];
   System.out.println("Element at index"+ index+" "+ ref);
   
   for(int a=0; a<primaryAnimals.length; a++)
   System.out.println(primaryAnimals[a] + " ");
   
   
   
   
   }  
   }
   }