package com.factorial;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		System.out.println("Enter a Number to get the factorial result");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		long fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is " + fact);
	}

}
