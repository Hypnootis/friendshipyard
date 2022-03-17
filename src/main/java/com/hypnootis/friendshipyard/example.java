package com.hypnootis.friendshipyard;

import java.lang.reflect.Array;
import java.util.Arrays;

public class example {
	
	public static String name1 = "Ismo";
	public static String name2 = "Esko";
	public static String name3 = "Eskoliina";
	public static String name4 = "Indokiina";
	public static String[] names = {name1, name2, name3, name4};
	
	public static void main(String[] args) {
		printChart();

	}
	static void printChart() {
		String[][] chart = new String[Array.getLength(names)][Array.getLength(names)];
		
		/*
		for (String[] row : chart) {
			Arrays.fill(row, "hello");
			System.out.println(Arrays.toString(row));
		}
		*/
		
		// " " gets repeated for the length of the first name, fixing formatting
		
		String longestName = "";
		for (String name : names) {
			
		}
		String header = " ".repeat(names[0].length());
		for (String name : names) {
			header += name + "|";
		}
		
		System.out.println(header);
		for (String[] row : chart) {
			for (String[] column : chart) {
				System.out.print("|");
			}
			System.out.println();
		}
		
	}

}
