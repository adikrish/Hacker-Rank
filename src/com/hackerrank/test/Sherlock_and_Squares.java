package com.hackerrank.test;

import java.util.Scanner;


// Solution was timing out, Optimized basd on, nextSquareNumber = currentSquareNumber + sqrt(currentSquareNumber) +  (sqrt(currentSquareNumber)+1)

public class Sherlock_and_Squares {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		int[] resultsList = new int[t];

		if (t >= 1 && t <= 100) {
			for (int i = 0; i < t; i++) {
				int a = in.nextInt();
				int b = in.nextInt();

			//	if (a <= b && a >= 1 && a <= 1000000000 && b >= 1 && b <= 1000000000) {    // ALREADY GIVEN.. NEED NOT VALIDATE

					resultsList[i] = findSquareNumbers(a, b);

			//	}
			}

		}

		in.close();

		printResults(resultsList);

	}

	private static int findSquareNumbers(int a, int b) {

		int square = a;
		int squareCount = 0;
		while (square <= b) {

			// if(Math.sqrt(square) == Math.floor(Math.sqrt(square))){ *Write
			// your logic here* }
			//System.out.println(Math.sqrt(square) % 1);
			
			if (Math.sqrt(square) % 1 == 0) {
				++squareCount;
	
				square = (int) (square + 2* Math.sqrt(square) + 1);		
			}

			else{
				square ++;
			}
			

		}

		return squareCount;
	}

	private static void printResults(int[] resultsList) {

		for (int tmp : resultsList) {
			System.out.println(tmp);
		}

	}

}
