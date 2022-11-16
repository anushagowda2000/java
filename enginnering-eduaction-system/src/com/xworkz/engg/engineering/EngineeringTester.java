package com.xworkz.engg.engineering;

import com.xworkz.engg.computerscience.ComputerScience;

public class EngineeringTester {
public static void main(String[] args) {
	
	Engineering me = new Engineering();
	me.toStudy(8);
	System.out.println("i am studying eight subjects" + me.fees);
	
	Engineering cousin = new Engineering();
	cousin.toStudy(5);
	System.out.println("cousin five subjects" + cousin.fees);
	
	me.toGraduate(5.00,cousin);
	System.out.println("i am studying eight subjects" + me.fees);
	System.out.println("cousin five subjects" + cousin.fees);
	
	ComputerScience me1= new ComputerScience();
	me1.toStudy(8);
	System.out.println("i am studying eight subjects" + me1.fees);
	
	ComputerScience brother = new ComputerScience();
	brother.toStudy(5);
	System.out.println("brother studying five subjects" + brother.fees);
	
	me1.toGraduate(5.00,brother);
	System.out.println("i am studying eight subjects" + me1.fees);
	System.out.println("brother five subjects" + brother.fees);
	
}
}
