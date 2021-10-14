package com.generic;

public class MaximumNumber {
	
	public static <E extends Comparable<E>> E findGrater(E []arry){
		E getMaximum = arry[0];
		for(E copyOfElement : arry) {
			if(copyOfElement.compareTo(getMaximum) > 0 )
				getMaximum = copyOfElement;
		}
		return getMaximum;	
	}
	
	public static void main(String[] args) {
		Integer []integer = {34,68,43};
		String []string = {"shailesh", "kush", "shashank"};
		Float []floatValue= {56.3f,66.3f,88.4f};
		System.out.println("the grater value is " +findGrater(integer));
		System.out.println("the grater value is " +findGrater(string));
		System.out.println("the grater value is " +findGrater(floatValue));	
	}
}
