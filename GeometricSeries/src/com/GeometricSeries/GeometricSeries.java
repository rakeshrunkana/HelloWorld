package com.GeometricSeries;

import java.util.Scanner;

public class GeometricSeries {

	public static void main(String[] args) {
		System.out.println("Program to print GP Series ");
		System.out.println("Enter a , r and n ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		int term = a;
		for (int i = 0; i < n; i++) {
			System.out.print(term + " , ");
			term = term * r;
		}
	}

}
