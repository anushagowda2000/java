class SoapTester{

public static void main(String args[]){

//ClassName ref = new ClassName();

Soap soap = new Soap();
soap.brandName = "Mysore Sandal Soap";
soap.colour = "cream";
soap.shape = "Oval";
soap.bath();
System.out.println(Soap.brandName);
System.out.println(Soap.colour);
System.out.println(Soap.shape);

Soap soap1 = new Soap();
soap1.brandName = "lux";
soap1.colour = "white";
soap1.shape = "rectangle";
soap1.bath();



}
}