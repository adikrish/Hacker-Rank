package com.hackerrank.test;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {

		char hash = '#';
		char space = ' ';
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		for (int i = 0; i < n; i++) {
			int c = n - (i + 1);
			while (c > 0) {
				System.out.print(space);
				c--;
			}

			int d = i + 1;
			while (d > 0) {
				System.out.print(hash);
				d--;
			}

			System.out.println();

		}

		in.close();
	}

}
