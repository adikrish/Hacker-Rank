package com.hackerrank.test;

import java.util.Scanner;

public class Diagonal_Difference {

	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int sumDiagonal1 = 0;
		int sumDiagonal2 = 0;
		
		int[][] array = new int[n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				array[i][j]= in.nextInt();
				
				if(i==j) {
					sumDiagonal1 += array[i][j];
				}
				
				if(i+j == n-1){
					
					sumDiagonal2 += array[i][j];
				}
			}
		}
		
		System.out.println(Math.abs(sumDiagonal1 - sumDiagonal2));
		in.close();
	}

}
