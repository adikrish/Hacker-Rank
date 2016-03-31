package com.hackerrank.test;

import java.math.BigInteger;
import java.util.Scanner;

public class Extra_Long_Factorials {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		long t = n;
		BigInteger factVal = BigInteger.valueOf(1);

		BigInteger temp = null;
		while (t != 0) {
			temp = BigInteger.valueOf(t);
			factVal = factVal.multiply(temp);
			t--;
		}

		in.close();
		System.out.println(factVal);
	}

}
