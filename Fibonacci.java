class Fibonacci{
  static int a = 0;
  static int b = 1;
public static void main(String args[]){
for(int i=1;i<=10;i++){
 int c = a+b;

 System.out.println(c);
 a = b;
 b = c;
 
}
}
}
