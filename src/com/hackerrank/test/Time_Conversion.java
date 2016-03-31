package com.hackerrank.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Time_Conversion {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		String inputDate = in.nextLine();
		SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
		SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = null;
		try {
			date = parseFormat.parse(inputDate);
		} catch (ParseException e) {
		
			e.printStackTrace();
		}
		
		//Date date = parseFormat.parse("12:12:12 AM");
		//System.out.println(parseFormat.format(date) + " = " + displayFormat.format(date));
		
		System.out.println(displayFormat.format(date));

		in.close();

	}
}
