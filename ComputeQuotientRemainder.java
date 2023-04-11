package basiccorejavaprograms;

import java.util.*;
/**
 * 
 * @author Kaif
 *
 */

public class ComputeQuotientRemainder {
	
	/**
	 * This method will display quotient and ramainder of division
	 * @param args
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter dividend");
		int dividend = sc.nextInt();
		
		System.out.println("Enter divisior");
		int divisior = sc.nextInt();
		
		System.out.println("The quotient of division is "+(double) dividend/divisior);
		
		System.out.println("The remainder of division is "+dividend%divisior);
    }
}
