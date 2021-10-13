package com.generic;

import java.util.Scanner;

public class MaximumNumber<T extends Comparable<T>> {
	T valueOne;
	T valueTwo;
	T valueeThree;
	public MaximumNumber(T firstNumber, T secondNumber, T third ) {
		valueOne = firstNumber;
		valueTwo = secondNumber;
		valueeThree = third;
	}
	
	public static String userInput() {
		System.out.println("enter the value");
		Scanner inputObj = new Scanner(System.in);
		 String StringValue = inputObj.nextLine();
		return StringValue;
	}
	
	public String maximumValue() {
		if(valueOne.compareTo(valueTwo) > 0) {
			return (String)valueOne;
		}
		else if (valueTwo.compareTo(valueeThree) > 0)
			return (String)valueTwo;
		else 
			return (String)valueeThree;
	}
	
	public static void main(String[] args) {
		System.out.println("enter the three String ");
		String firstValue = userInput();
		String secondValue = userInput();
		String thirdValue = userInput();
		
		MaximumNumber<String> numberObj = new MaximumNumber<String>(firstValue, secondValue, thirdValue);
		String maxvalue = numberObj.maximumValue();
		System.out.println("the grater string  is "+maxvalue);
	}
}
