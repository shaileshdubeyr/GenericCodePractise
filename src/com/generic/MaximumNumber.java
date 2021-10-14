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

	public static int userInput() {
		System.out.println("enter the value");
		Scanner inputObj = new Scanner(System.in);
		int integer = inputObj.nextInt();
		return integer;
	}
	
	public T maximumValue() {
		if(valueOne.compareTo(valueTwo) > 0) {
			return valueOne;
		}
		else if (valueTwo.compareTo(valueeThree) > 0)
			return valueTwo;
		else 
			return valueeThree;
	}
	
	public static void main(String[] args) {
		System.out.println("enter the three value ");
		Integer firstValue = userInput();
		Integer secondValue = userInput();
		Integer thirdValue = userInput();
		MaximumNumber<Integer> numberObj = new MaximumNumber<Integer>(firstValue, secondValue, thirdValue);
		Integer maxvalue = numberObj.maximumValue();
		System.out.println("maximum value is " +maxvalue);
	}
}
