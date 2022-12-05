class MultiplesOfNumbers{
    public static void main(String[] args){
    int a [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,30,40};
	for(int i = 0; i<a.length ;i++){
	if(a[i]%3 ==0){
	System.out.println("multiples of 3 : " + a[i]);
	}
	
	}
	
	for(int j = 0; j<a.length ; j++){		
		if(a[j]%6 == 0){
			System.out.println("multiples of 6 : " + a[j]);
		}
	}
}
}