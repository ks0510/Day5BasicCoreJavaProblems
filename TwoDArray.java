package functionprograms;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

public class TwoDArray {

	/*
	 * This is our main method created to take two dimensional array from user
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*
		 * Taking user input for rwo and column
		 */

		System.out.println("Enter row size of array");
		int row = sc.nextInt();

		System.out.println("Enter coloumn size of array");
		int column = sc.nextInt();
		
               /*
               * To initialize two dimensional array
               */
		
		int[][] arr = new int[row][column];
		
		System.out.println("Enter elements of array");
		
		/*
		 * Two for loop one for rwo and one for column to take elements
		 */

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				int num = sc.nextInt();
				arr[i][j] = num;
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
