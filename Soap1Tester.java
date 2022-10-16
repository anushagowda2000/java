class Soap1Tester{

public static void main(String args[]){

Soap ref = new Soap();
ref.brandName = "Mysore Sandal Soap";
ref.colour = "cream";
ref.shape = "Oval";

System.out.println(ref.brandName + " " + ref.colour + " " + ref.shape);

Soap sop = ref;
sop.brandName = "lux";
sop.colour = "pink";
sop.shape = "round";
System.out.println(sop.brandName + " " + sop.colour + " " + sop.shape);
 }
 }