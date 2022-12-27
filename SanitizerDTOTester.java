package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SanitizerDTOTester {

	public static void main(String[] args) {
		SanitizerDTO sani1 = new SanitizerDTO(3,"lifeboy",30,"white");
		SanitizerDTO sani2 = new SanitizerDTO(10,"sterillium",50,"red");
		SanitizerDTO sani3 = new SanitizerDTO(74,"godrej",60,"green");
		SanitizerDTO sani4 = new SanitizerDTO(23,"dabur",30,"pink");
		SanitizerDTO sani5 = new SanitizerDTO(39,"trust",150,"white");
		SanitizerDTO sani6 = new SanitizerDTO(1,"multani",220,"yellow");
		SanitizerDTO sani7 = new SanitizerDTO(45,"corvil",170,"blue");
		SanitizerDTO sani8 = new SanitizerDTO(88,"santoor",110,"organe");
		SanitizerDTO sani9 = new SanitizerDTO(6,"dettol",70,"green");
		SanitizerDTO sani10 = new SanitizerDTO(30,"savlon",90,"blue");
		
		Collection<SanitizerDTO> col = new ArrayList();
		col.add(sani10);
		col.add(sani8);
		col.add(sani9);
		col.add(sani7);
		col.add(sani6);
		col.add(sani4);
		col.add(sani5);
		col.add(sani1);
		col.add(sani3);
		col.add(sani2);
		
		Iterator<SanitizerDTO> ref = col.iterator();
		while (ref.hasNext()) {
			SanitizerDTO sanitizerDTO = ref.next();
			if(sanitizerDTO.getPrice()>100) {
				System.out.println(sanitizerDTO);
			}
			
		}
		
		System.out.println("#####################################");
		Iterator<SanitizerDTO> refe = col.iterator();
		while (refe.hasNext()) {
			SanitizerDTO san = refe.next();
			if(san.getColour().contains("green")) {
				 refe.remove();
			System.out.println(san);
			}
			}
		 System.out.println("************************************");
		for (SanitizerDTO sanitizerDTO : col) {
		
		}
		 
		
			
		
	}
}
