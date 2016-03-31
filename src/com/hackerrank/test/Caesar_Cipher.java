package com.hackerrank.test;

import java.util.Scanner;

public class Caesar_Cipher {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		String str = in.next();
		int k = in.nextInt();
		// char[] result = new char[n];

		for (int i = 0; i < n; i++) {

			char c = str.charAt(i);

			char d = c;
			
			char base = Character.isUpperCase(c) ? 'A' : 'a';
			
			if(Character.isAlphabetic(c))
			{
				d = (char) (base + (c - base + k) % 26) ;
			}
			
			System.out.print(d);
		}

		in.close();
	}

}
