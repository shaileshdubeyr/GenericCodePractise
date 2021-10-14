package com.generic;

import java.util.Scanner;

public class MaximumNumber {
	
	static Scanner userInput = new Scanner(System.in);
	
	public static Float findMaximumNumberForFloat(Float valueOne, Float valueTwo, Float valueThree) {
		if(valueOne.compareTo(valueTwo) > 0 && valueOne.compareTo(valueThree) > 0)
			return valueOne;
		else if (valueTwo.compareTo(valueOne) > 0 && valueTwo.compareTo(valueThree) > 0)
			return valueTwo;
		else 
			return valueThree;		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the first number");
		Float numberOne = userInput.nextFloat();
		System.out.println("Enter the second number");
		Float numberTwo = userInput.nextFloat();
		System.out.println("Enter third number");
		Float numberThree = userInput.nextFloat();
		Float maxValue = findMaximumNumberForFloat(numberOne, numberTwo, numberThree);
		System.out.println("The maximum value among three is "+maxValue);
	}
}
