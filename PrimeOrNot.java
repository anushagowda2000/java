class PrimeOrNot{

  public static void main(String args[]){
  int n = 4;
  boolean prime = false;
  for( int i = 0; i<n; i++){
	  if(n % i == 0){
		  prime = false;
		  break;
	  }
  }
 System.out.println(prime) ;
  
}
}
