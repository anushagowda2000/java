class Reverse{
 public static void main(String[] args){
int n = 123;
int r = 0;
int e = n;
while(n!=0){
int rem = n%10;
r = r*10+rem;
n = n/10;
}
if(e==r)
System.out.println("number is palindrome");
else
System.out.println("number is not  palindrome");
}
}






