package basiccorejavaprograms;

import java.util.*;

public class PowerofTwo {

	/**
	 * This method is created to give table of 2 power nth
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number for table");

		int number = sc.nextInt();

		/*
		 * If condition for table should not exceed the limit
		 */

		if (number < 31) {

			/*
			 * For loop to get table till nth number
			 */

			for (int i = 1; i <= number; i++)
				System.out.println("2 power " + i + " = " + (int) Math.pow(2, i));
		} else {
			System.out.println("Out of integer range");
		}
	}
}
