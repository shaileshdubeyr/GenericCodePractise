package com.generic;

import java.util.Scanner;

public class MaximumNumber<T extends Comparable<T>> {
	T ValueOne, valueTwo, valueThree;

	public MaximumNumber(T valueOne, T ValueTwo, T valueThree) {
		this.ValueOne = valueOne;
		this.valueTwo = ValueTwo;
		this.valueThree = valueThree;
	}

	public T maximum() {
		return MaximumNumber.maximum(ValueOne, valueTwo, valueThree);
	}

	public static <T extends Comparable<T>> T maximum(T valueOne, T valueTwo, T ValueThree) {
		T maximum = valueOne;
		if (valueTwo.compareTo(maximum) > 0)
			maximum = valueTwo;
		if (ValueThree.compareTo(maximum) > 0)
			maximum = ValueThree;
		return maximum;

	}

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("enter the first one");
		Integer intOne = userInput.nextInt();
		System.out.println("enter the second value");
		Integer intTwo = userInput.nextInt();
		System.out.println("enter the third value");
		Integer intThree = userInput.nextInt();
		new MaximumNumber(intOne, intTwo, intThree).maximum();
		System.out.println("Print Maximum Number is :" + " " + new MaximumNumber(intOne, intTwo, intThree).maximum());

	}

}