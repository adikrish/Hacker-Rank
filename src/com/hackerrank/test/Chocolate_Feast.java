package com.hackerrank.test;

import java.util.Scanner;

public class Chocolate_Feast {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		int[] resultsArray= new int[t];
		for (int i = 0; i < t; i++) {
			int amount_N = in.nextInt();
			int chocoPrice_C = in.nextInt();
			int wrapperToTrade_M = in.nextInt();

			int wrappers = amount_N / chocoPrice_C;
			int totalChocs = wrappers;

			while (wrappers >= wrapperToTrade_M) {

				int newWrappers = wrappers / wrapperToTrade_M;

				totalChocs = totalChocs + newWrappers;
				wrappers = newWrappers + (wrappers - newWrappers * wrapperToTrade_M);

			}

			//System.out.println(totalChocs);
			
			resultsArray[i] = totalChocs;
		}
		in.close();
		
		
		
		for (int i = 0; i < t; i++) {
			System.out.println(resultsArray[i]);
		}
	}

}
