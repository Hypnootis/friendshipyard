package com.hypnootis.friendshipyard;

import java.util.Arrays;

public class example {

	public static void main(String[] args) {
		printChart();

	}
	static void printChart() {
		int rows = 6;
		int columns = 6;
		String[][] chart = new String[rows][columns];
		
		for (String[] row : chart) {
			Arrays.fill(row, "hello");
			System.out.println(Arrays.toString(row));
		}
	}

}
