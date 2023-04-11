package basiccorejavaprograms;

import java.util.*;
/**
 * 
 * @author Kaif
 *
 */

public class PrimeFactors {
	
	/**
	 * This method is created to find prime factors of number
	 * @param args
	 */

	public static void main(String[] args) {
		
		
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.println("Enter a number ");
	      int number = sc.nextInt();
	     
	      /*
	       * for loop to check factors till number itself for divisibility
	       */
	      
	      for(int i = 2; i< number; i++) {
	         while(number%i == 0) {
	            System.out.println(i+" ");
	            number = number/i;
	         }
	      }
	      if(number >2) {
	         System.out.println(number);
	      }
	  }
}
