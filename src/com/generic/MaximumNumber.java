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
		
		MaximumNumber numberObj = new MaximumNumber("1","3","6");
		System.out.println("the grater value  is "+numberObj.maximumValue());
	}
}
