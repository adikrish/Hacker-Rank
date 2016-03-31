package com.hackerrank.workbench;

import java.util.Scanner;

public class Solution_SumX {

	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int a, b;

		do {
			System.out.println("Enter a number, A");
			a = in.nextInt();

			if ((a < 1 || a > 1000)) {
				System.out.println("Invalid input... Enter 1 ≤ A ≤ 1000 ");
			}
		} while (a < 1 || a > 1000);

		do {
			System.out.println("Enter a number, B");
			b = in.nextInt();

			if ((b < 1 || b > 1000)) {
				System.out.println("Invalid input... Enter 1 ≤ B ≤ 1000 ");
			}

		} while (b < 1 || b > 1000);

		int sum = addNum(a, b);

		System.out.println("Sum of A and B = " + sum);

		in.close();

	}

	private static int addNum(int a, int b) {

		return a + b;
	}

}
