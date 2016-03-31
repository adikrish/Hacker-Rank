package com.hackerrank.test;

import java.util.Scanner;

public class Solve_Me_First {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int a, b;

		a = in.nextInt();
		b = in.nextInt();
		if (a < 1 || a > 1000 || b < 1 || b > 1000) ;
		else {

			int sum = addNum(a, b);
			System.out.println(sum);

		}

	
		in.close();

	}

	private static int addNum(int a, int b) {

		return a + b;
	}

}
