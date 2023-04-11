package basiccorejavaprograms;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

public class NumEvenOdd {
	
	/**
	 * This method will check whether the given number is odd or even
	 * @param args
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		int number = sc.nextInt();
		
		/*
		 * To check number is even or odd by if condition
		 */
		
		if(number%2==0) {
			System.out.println(number+" is even number");
		}
		else {
			System.out.println(number+" is odd number");
		}
    }
}
