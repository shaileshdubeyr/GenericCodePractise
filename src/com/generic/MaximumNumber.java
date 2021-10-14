package com.generic;

import java.util.Scanner;

public class MaximumNumber {
	
	static Scanner userInput = new Scanner(System.in);
	
	public static String findMaximumNumberForString(String stringOne, String stringTwo, String stringThree) {
		if(stringOne.compareTo(stringTwo) > 0 && stringOne.compareTo(stringThree) > 0)
			return stringOne;
		else if (stringTwo.compareTo(stringOne) > 0 && stringTwo.compareTo(stringThree) > 0)
			return stringTwo;
		else 
			return stringThree;		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the first String");
		String stringOne = userInput.nextLine();
		System.out.println("Enter the second String");
		String stringTwo = userInput.nextLine();
		System.out.println("Enter third String");
		String stringThree = userInput.nextLine();
		System.out.println("The maximum value among three is "+findMaximumNumberForString(stringOne, stringTwo, stringThree));
	}
}
