package com.TcsPreparation;

import java.util.Scanner;

public class CountofDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number = sc.nextInt();
		int count = 0;
		while (number > 0) {
			number = number / 10;
			count++;
		}
		System.out.println("count of the number is " + count);
	}

}
