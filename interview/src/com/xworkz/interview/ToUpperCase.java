package com.xworkz.interview;

public class ToUpperCase {

	public static void main(String[] args) {

		String reqStr = " ";
		String s = "i am anusha";
      //splitting based on space
		
		String[] arr = s.split(" ");
		
		for (int i = 0; i < arr.length; i++) {
			char c = arr[i].charAt(0);

			String c1 = String.valueOf(c).toUpperCase();
			String sub = arr[i].substring(1);
			reqStr = reqStr + c1 + sub + " ";
		}
		
		System.out.print(reqStr.trim());
	}

}
