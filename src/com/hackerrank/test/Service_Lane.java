package com.hackerrank.test;

import java.util.Scanner;

public class Service_Lane {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = in.nextInt();

		int[] width = new int[n];

		int[] results = new int[t];

		for (int i = 0; i < n; i++) {
			
				width[i] = in.nextInt();
				
				if(width[i] > 3)
				{
				width[i] = 0;
				}
		}

		for (int k = 0; k < t; k++) {

			int i = in.nextInt();
			int j = in.nextInt();

			int permissibleVehicle = 4;

			int p = i;
			while (p <= j) {

				if (width[p] < permissibleVehicle) {
					permissibleVehicle = width[p];
				}

				p++;
			}

			results[k] = permissibleVehicle;
		}

		for (int k = 0; k < t; k++) {
			System.out.println(results[k]);
		}

		in.close();
	}

}
