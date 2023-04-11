package basiccorejavaprograms;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

public class CalculateLeapYear {

	/**
	 * This is our main method and it created to check the year is leap or not
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * Taking input from user
		 */

		System.out.println("Enter year");

		int year = sc.nextInt();

		/*
		 * To ensure given year is 4 digit
		 */

		if (year >= 1000 && year <= 9999) {
			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
				System.out.println(year + " is a leap year");
			} else {
				System.out.println(year + " is not a leap year");
			}
		} else {
			System.out.println("Invalid year");
		}

	}
}
