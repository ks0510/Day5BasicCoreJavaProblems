package functionprograms;

import java.util.*;
/**
 * 
 * @author Kaif
 *
 */
 

public class Quadratic {
	
	/**
	 * Created method to find the roots of quadratic equation
	 * @param args
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of a");
		int a = sc.nextInt();
		
		System.out.println("Enter value of b");
		int b = sc.nextInt();
		
		System.out.println("Enter value of c");
		int c = sc.nextInt();
		
		/*
		 * To find delta using formula
		 */
		
		int delta = b*b-4*a*c;
		
		/*
		 * To find two roots of quadratic equation using formulae 
		 */
		
		
		System.out.println("Root 1 of x = "+(-b+Math.sqrt(delta))/(2*a));
		
		System.out.println("Root 2 of x = "+(-b-Math.sqrt(delta))/(2*a));
     }
}
