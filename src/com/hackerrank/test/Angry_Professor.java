package com.hackerrank.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Angry_Professor {

	static List<String> cancelledStatus = new ArrayList<String>();
	public static void main(String[] args) {

		// For each test case, print the word YES if the class is canceled or NO if it is not.

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

				getClassStatus(k, numOfStudentsPresent);
			}

		}

		in.close();
		
		printStatus(cancelledStatus);

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

	private static void getClassStatus(int k, int numOfStudentsPresent) {

		if (numOfStudentsPresent >= k) {
			cancelledStatus.add("NO");			// Class Cancelled = NO
		}

		else cancelledStatus.add("YES");			// Class Cancelled = YES 

	}
	

	private static void printStatus(List<String> cancelledStatus) {
		
		for(String status : cancelledStatus)
		{
			System.out.println(status);
		}
		
	}
	
}
