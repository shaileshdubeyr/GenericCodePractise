package com.generic;

public class MaximumNumber<T extends Comparable<T>> {
	T valueOne;
	T valueTwo;
	T valueeThree;

	public MaximumNumber(T firstNumber, T secondNumber, T third) {
		valueOne = firstNumber;
		valueTwo = secondNumber;
		valueeThree = third;
	}
	
	public static <T> void maximumValue(T firstNumber, T secondNumber, T thirdNumber) {
		System.out.println("first number is " +firstNumber+" second number is " +secondNumber+" third number is " +thirdNumber);
	}

	public T maximumValue() {
		
		if (valueOne.compareTo(valueTwo) > 0) {
			return valueOne;
		} else if (valueTwo.compareTo(valueeThree) > 0)
			return valueTwo;
		else
			return valueeThree;
		
	}

	public static void main(String[] args) {
		MaximumNumber numberObj = new MaximumNumber("1", "3", "6");
		
		maximumValue(numberObj.valueOne, numberObj.valueTwo, numberObj.valueeThree);
		
		System.out.println("the grater value  is " + numberObj.maximumValue());
	}
}
