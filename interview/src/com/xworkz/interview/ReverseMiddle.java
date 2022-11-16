package com.xworkz.interview;

public class ReverseMiddle {
	public static void printReverse(String str) {

		int i = 0;
		for (i = 0; i < str.length() && str.charAt(i) != ' '; i++)
			System.out.print(str.charAt(i));

		String word = " ";

		for (i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')
				word += str.charAt(i);
			else {
				System.out.print(new StringBuilder(word).reverse().toString());
				word = " ";
			}
		}
		System.out.print(word + " ");
	}

	public static void main(String[] args) {
		String str = "hi how are you anusha";
		printReverse(str);
	}

}

