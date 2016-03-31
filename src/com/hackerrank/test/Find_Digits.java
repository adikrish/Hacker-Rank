package com.hackerrank.test;

import java.util.Scanner;

public class Find_Digits {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		int[] resultsList = new int[t];

		int n;
		for (int i = 0; i < t; i++) {
			n = in.nextInt();
			resultsList[i] = findDivisibleDigits(n);
		}

		printResults(resultsList);

		in.close();

	}

	private static int findDivisibleDigits(int n) {

		int numLength = String.valueOf(n).length();

		int k = numLength;
		int d = 0; // Number of divisible digits in the input
		int p = n % 10; // Parsing each digit
		
		int temp = n;
		
		while (k > 0) {

			if (p != 0 && n % p == 0) {
				d++;
			}

			k--;

		temp = temp/10;
		
		p = temp % 10;

		}

		return d;
	}

	private static void printResults(int[] resultsList) {

		for (int temp : resultsList) {
			System.out.println(temp);
		}
	}

}
