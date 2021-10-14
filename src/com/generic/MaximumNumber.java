package com.generic;

import java.util.Scanner;

public class MaximumNumber<T extends Comparable<T>> {
	T [] multiple;

	public MaximumNumber(T [] multiple) {
			this.multiple = multiple;
		}

	public T maximum() {
		return MaximumNumber.maximum(multiple);
	}

	public static <T extends Comparable<T>> T maximum(T []arry) {
		final int  ZERO = 0;
		for (int i = ZERO; i < arry.length; i++) {
			for (int j = i; j < arry.length; j++) {
				if (arry[i].compareTo(arry[j]) < 0) {
					T temp = arry[i];
					arry[i] = arry[j];
					arry[j] = temp;
				}
			}
		}
		MaximumNumber.printMax(arry[0]);
		return arry[0];
	}
	
	private static <T> void printMax(T t) {
		System.out.println("the maximum vaue is "+t);		
	}

	public static void main(String[] args) {
		Integer [] integerArry = {23, 45,35,44,33};
		int maxValue = new MaximumNumber<Integer>(integerArry).maximum();
		System.out.println("the maximum value of arry "+maxValue);
	}
}
