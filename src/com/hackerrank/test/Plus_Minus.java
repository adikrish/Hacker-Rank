package com.hackerrank.test;

import java.util.Scanner;

public class Plus_Minus {

	public static void main(String[] args) {
		
		float count_pos = 0;
		float count_neg = 0;
		float count_zero = 0;
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();		
		
		for(int i=0; i<n; i++)
		{
			int temp = in.nextInt();
			
			if(temp > 0) ++count_pos;
			if(temp < 0) ++count_neg;
			if(temp == 0) ++count_zero;
		}
		
		
		System.out.println(count_pos/n);
		System.out.println(count_neg/n);
		System.out.println(count_zero/n);
		
		
		
		in.close();
	}

}
