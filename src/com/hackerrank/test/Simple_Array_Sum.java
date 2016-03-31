package com.hackerrank.test;

import java.util.Scanner;

public class Simple_Array_Sum {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0;
		for(int i=0;i<n;i++)
		{
			sum += in.nextInt();
		}
		
		System.out.println(sum);
		in.close();
	}

}
