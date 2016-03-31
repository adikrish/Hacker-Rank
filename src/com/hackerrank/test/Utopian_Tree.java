package com.hackerrank.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utopian_Tree {

	private static final int initHeight = 1;
	private static List<Integer> treeHeightList = new ArrayList<Integer>();

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t >= 1 && t <= 10) {

			treeHeightList.add(getHeight(in));
			t--;	
		}
		
		in.close();
		
		printHeightList(treeHeightList);

	}


	private static int getHeight(Scanner in) {

		int n = in.nextInt(); // Number of cycles
		// int t =n;

		int h = initHeight;
		while (n > 0 && n <= 60) {

			if (n > 0) {

				h *= 2;
				n--;

				if (n > 0) {
					h += 1;
					n--;
				}
			}

		}

		return h;

	}

	
	
	private static void printHeightList(List<Integer> treeHeightList) {
		
		for(Integer temp: treeHeightList)
		{
			System.out.println(temp);
		}
	}
	
}
