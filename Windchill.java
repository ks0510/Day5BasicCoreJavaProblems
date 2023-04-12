/*
 * 
 * Write a program WindChill.java that takes two double command-line arguments t
 * and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the
 * temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the
 * National Weather Service defines the effective temperature (the wind chill) to be:
*/
 
package functionprograms;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

public class Windchill {
	
	/**
	 * This main method will calculate the wind chill
	 * @param args
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * To take value of temprature
		 */
		
		System.out.println("Enter value of temprature");
		double t = sc.nextDouble();
		
		/*
		 * To take value of wind speed
		 */
		System.out.println("Enter value of wind speed");
		double v = sc.nextDouble();
		
		double windchill=0;
		
		/*
		 * To keep value in range claculating windchill
		 */
		if(t<50 &&(v<120 && v>2)) {
			 windchill = 35.47+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
		}
		System.out.println("The wind chill is "+windchill);
	}
}
