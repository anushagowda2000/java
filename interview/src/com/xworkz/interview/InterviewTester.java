package com.xworkz.interview;

public class InterviewTester {

	public static void reverse(String data) {
		char newData[] = data.toCharArray();
		// char newData = {'A','n','u','s','h','a'};
		// index = length-1

		/*
		 * for (int index = 0; index < newData.length; index++) {
		 * System.out.println(newData[index] + " "); }
		 */

		for (int index = newData.length - 1; index >= 0; index--) {
			System.out.println(newData[index] + " ");
		}
	}

	public static void main(String[] args) {
		reverse("Anusha");
	}
	
	/*
	 * reverseMiddleWords("my name is anu");
	 * convertfirstcharacterToUpperCase(" my name is anu  ");
	 */
}
