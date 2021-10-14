package com.generic;

import java.util.Scanner;

public class MaximumNumber {
	
	private static final Scanner userInput = new Scanner(System.in);
	
	public static void findMaximumNumber() {
		
		System.out.println("Enter the fisrst number");
		int numberOne = userInput.nextInt();
		System.out.println("Enter the Second number");
		int numberTwo = userInput.nextInt();
		System.out.println("Enter the Third number");
		int numberThree = userInput.nextInt();
		if(numberOne > numberTwo && numberOne > numberThree)
			System.out.println("the bigger number is "+numberOne);
		else if(numberTwo > numberOne && numberTwo > numberThree)
			System.out.println("the bigger number is "+numberTwo);
		else
			System.out.println("the bigger number is "+numberThree);	
	}
	
	public static void main(String[] args) {
		findMaximumNumber();
	}
}
