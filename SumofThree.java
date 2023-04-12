package functionprograms;

import java.util.*;
/**
 * 
 * @author Kaif
 *
 */

public class SumofthreeInt {
	
	/**
	 * This method created to give triples which gives summation
	 * zero
	 * @param args
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int size= sc.nextInt();
		
		int [] arr = new int[size];
		int count=0;
		
		/*
		 * To take elements of array
		 */
		
		for(int i=0;i<size;i++) {
			int num = sc.nextInt();
			arr[i] = num;
		}
		
		/*
		 * To check distinct triples among array
		 */
		
		for(int i=0;i<size-2;i++) {
			if(arr[i]+arr[i+1]+arr[i+2]==0) {
				count++;
				System.out.println("Distinct triples are "+arr[i]+" "+arr[i+1]+" "+arr[i+2]);
			}
		}
		System.out.println("The number of triples is "+count);
	}
}
