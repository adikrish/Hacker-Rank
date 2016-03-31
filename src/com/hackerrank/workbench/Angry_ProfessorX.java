package com.hackerrank.workbench;

import java.util.Scanner;

public class Angry_ProfessorX {

	public static void main(String[] args) {

		// For each test case, print the word YES if the class is canceled or NO
		// if it is not.

		int t; // No. of test cases
		int n; // No. of students
		int k = 0; // cancellation threshold
		int numOfStudentsPresent = 0;
		Scanner in = new Scanner(System.in);
		t = in.nextInt();
		boolean validNoOfTests = t >= 1 && t <= 10;

		if (validNoOfTests) {
			for (int i = 0; i < t; i++) {

				n = in.nextInt();
				k = in.nextInt();

				boolean valid_n_k = n >= 1 && n <= 1000 && k >= 1 && k <= n;
				if (valid_n_k) {
					numOfStudentsPresent = checkThresholds(in, n, k);

				}

				printClassStatus(k,numOfStudentsPresent);
			}

		}

		in.close();

	}

	private static int checkThresholds(Scanner in, int n, int k) {

		int numOfStudents = 0;
		for (int i = 0; i < n; i++) {
			int thresholdVal = in.nextInt();
			boolean validThreashold = thresholdVal >= -100 && thresholdVal <= 100;
			if (validThreashold && thresholdVal < 1) {

				++numOfStudents;

			}

		}

		return numOfStudents;
	}

	private static void printClassStatus(int k, int numOfStudentsPresent) {

		if (numOfStudentsPresent >= k) {
			System.out.println("NO");			// Class Cancelled = NO
		}

		else
			System.out.println("YES");			// Class Cancelled = YES 

	}

}
