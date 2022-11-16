package com.xworkz.overloading;
import com.xworkz.overloading.conceptoverloading.CarromBoard;

public class CarromBoardTester {

	public static void main(String[] args) {
		String manuFacturerNames[] = {"anu","anusha","usha","anush","ammu"};
		CarromBoard board = new CarromBoard(manuFacturerNames);
		board.displayDetails();
		
	} 
}
