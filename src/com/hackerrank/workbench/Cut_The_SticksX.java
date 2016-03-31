package com.hackerrank.workbench;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Cut_The_SticksX {

	// InputStream in;
		Scanner in;
		int numOfSticks;
		List<Integer> stickLengths;

		public Cut_The_SticksX() {

			in = new Scanner(System.in);
			stickLengths = new ArrayList<Integer>();

		}

		public void setStickLengths() {
			for (int i = 0; i < numOfSticks; i++) {
				stickLengths.add(in.nextInt());
			}
		}

		private void stickIterator() {

			while (stickLengths.size() > 1) {

				stickLengths.removeAll(Collections.singleton(0));
				
				int smallestStickLength = 2147483647;     // A bad way... but still works

				if (stickLengths.size() > 0) {
					 smallestStickLength = stickLengths.get(0);
				}
				
				
				for (Integer temp : stickLengths) {
				//	System.out.print(temp + " ");

					if (temp < smallestStickLength) {
						smallestStickLength = temp;
					}

				}

			//	System.out.println();
				
//				
//				
//				6
//				5 4 4 2 2 8
//				6
//				5
//				3
//				1
//				0

				
				for (int i = 0; i < stickLengths.size(); i++) {

					if (stickLengths.get(i) >= smallestStickLength) {

						int temp = stickLengths.get(i) - smallestStickLength;
						stickLengths.set(i, temp);
					}

				}

				System.out.println(stickLengths.size());
			}

		}

		public static void main(String[] args) {

			Scanner in = new Scanner(System.in);
			int n = in.nextInt();

			//
			// int[] stickLengths = new int[n];
			//
			// for (int i = 0; i < n; i++) {
			// stickLengths[i] = in.nextInt();
			// }

			Cut_The_SticksX obj = new Cut_The_SticksX();

			obj.numOfSticks = n;
			obj.setStickLengths();

			obj.stickIterator();

			in.close();
		}

	}
