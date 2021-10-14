package com.generic;

import java.util.Scanner;

public class MaximumNumber {
	
	static Scanner userInput = new Scanner(System.in);
	
	public static Integer findMaximumNumber(Integer valueOne, Integer valueTwo, Integer valueThree) {
		
		if(valueOne.compareTo(valueTwo) > 0 && valueOne.compareTo(valueThree) > 0)
			return valueOne;
		else if (valueTwo.compareTo(valueOne) > 0 && valueTwo.compareTo(valueThree) > 0)
			return valueTwo;
		else 
			return valueThree;		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the first number");
		Integer numberOne = userInput.nextInt();
		System.out.println("Enter the second number");
		Integer numberTwo = userInput.nextInt();
		System.out.println("Enter third number");
		Integer numberThree = userInput.nextInt();
		Integer maxValue = findMaximumNumber(numberOne, numberTwo, numberThree);
		System.out.println("The maximum value among three is "+maxValue);
	}
}
