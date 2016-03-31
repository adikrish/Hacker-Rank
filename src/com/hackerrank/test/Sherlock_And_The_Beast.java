package com.hackerrank.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sherlock_And_The_Beast {

	private static List<String> resultsList = new ArrayList<String>();

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		if (n >= 1 && n <= 20) {
			for (int i = 0; i < n; i++) {
				int numOfDigits = in.nextInt();

				if (numOfDigits >= 1 && numOfDigits <= 100000) {
					String result = findDecentNumber(numOfDigits);
					resultsList.add(result);
				}
			}

		}

		printResults(resultsList);

		in.close();
	}

	private static String findDecentNumber(int numOfDigits) {

		// int d = numOfDigits;
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

	private static void printResults(List<String> resultsList) {

		for (String itr : resultsList) {
			System.out.println(itr);
		}

	}

}