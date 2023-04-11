package basiccorejavaprograms;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

public class HarmonicNumber {

	/**
	 * Create this main method to find nth harmonic number
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter nth number to find harmonic");

		int number = sc.nextInt();

		double sum = 0;

		/*
		 * for loop to get nth harmonic term
		 */
		for (int i = 1; i <= number; i++) {
			sum += (double) 1 / i;
		}
		System.out.println("The " + number + " harmonic term is " + sum);
	}
}
