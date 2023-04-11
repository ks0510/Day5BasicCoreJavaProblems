package basiccorejavaprograms;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

public class LargestNumber {

	/**
	 * Created method to check largest number among three numbers
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number");
		int num1 = sc.nextInt();

		System.out.println("Enter second number");
		int num2 = sc.nextInt();

		System.out.println("Enter third number");
		int num3 = sc.nextInt();

		/*
		 * To check largest number using ternory operator
		 */

		int largestnum = num3 > (num1 > num2 ? num1 : num2) ? num3 : ((num1 > num2) ? num1 : num2);

		System.out.println(largestnum + " is largest among three numbers");
	}
}
