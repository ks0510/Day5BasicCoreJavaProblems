package basiccorejavaprograms;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

public class CalculateCoinPercentage {

	/**
	 * This our starting point of program this method is created to flip coin n
	 * times and check the percentage of result head or tail.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * Taking user input for fliping coin
		 */
		System.out.println("Enter number for coin flip");

		int number = sc.nextInt();

		/*
		 * Tail count and head count for percentage calculation
		 */

		int headcount = 0, tailcount = 0;

		/*
		 * for loop to flip the coin n times
		 */

		if (number > 0) {
			for (int i = 1; i <= number; i++) {
				double random = Math.random() * 2;
				

				if (random < 1) {
					tailcount++;
				} else {
					headcount++;
				}
			}
		} 
		else {
			System.out.println("Invalid Number");
		}
		
		/*
		 * Calculating and printing percentage of head and tail
		 */
		
		System.out.println("The percentage of tail we got "+tailcount*100/number);
		
		System.out.println("The percentage of head we got "+headcount*100/number);
    }
}
