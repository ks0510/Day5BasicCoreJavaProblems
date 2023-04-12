package functionprograms;

import java.util.*;
/**
 * 
 * @author Kaif
 *
 */

public class Distance {
	
	/**
	 * This is our main method which calculate euclidean distance
	 * by formula
	 * @param args
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x coordinate");
		int x = sc.nextInt();
		
		System.out.println("Enter y coordinate");
		int y = sc.nextInt();
		
		/*
		 * To find euclidean distance using formula
		 */
		
		System.out.println("The euclidean distance is "+Math.sqrt((x*x+y*y)));
    }
}
