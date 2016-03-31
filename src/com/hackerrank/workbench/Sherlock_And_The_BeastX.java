package com.hackerrank.workbench;

import java.util.Scanner;

public class Sherlock_And_The_BeastX {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for (int i = 0; i < n; i++) {
			int numOfDigits = in.nextInt();

			String result = findDecentNumber(numOfDigits);
			
			System.out.println(result);

		}

		in.close();
	}

	private static String findDecentNumber(int numOfDigits) {

		//int d = numOfDigits;
		int fives = 0;
		int threes = 0;
		int digits = numOfDigits;

		while (digits > 0) {
			if (digits % 3 == 0) {
				fives = digits;
				break;
			}

			digits -= 5;
		}

		threes = numOfDigits - fives;

		while (digits < 0 || threes % 5 != 0) {
			return "-1";
		}

		StringBuilder sb = new StringBuilder(numOfDigits);

		while (fives-- > 0) {
			sb.append("5");
		}

		while (threes-- > 0) {
			sb.append("3");
		}

		return sb.toString();

	}

}