package basiccorejavaprograms;

import java.util.*;
/**
 * 
 * @author Kaif
 *
 */

public class SwapNumber {
	
	/**
	 * To swap two numbers
	 * @param args
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		
		int temp;
		
		/*
		 * To swap numbers
		 */
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("Swapped number are "+num1+" "+num2);
     }
}
