package com.hackerrank.test;

import java.util.Scanner;

public class A_Very_Big_Sum {

	public static void main(String[] args) {
	
		long sum = 0;
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for(int i=0;i<n;i++)
		{
			sum += in.nextLong();
		}
		
		System.out.println(sum);
		in.close();
	
	}

}
