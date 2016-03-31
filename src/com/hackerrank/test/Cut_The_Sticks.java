package com.hackerrank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Cut_The_Sticks {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(in.nextInt());
		}

		list.removeAll(Collections.singleton(0));
		Collections.sort(list);

		while (list.size() != 0) {
			
			System.out.println(list.size());
			
			int temp = list.get(0);

			for (int i = 0; i < list.size(); i++) {
				list.set(i, list.get(i) - temp);
			}
			list.removeAll(Collections.singleton(0));

		}

		in.close();
	}
}