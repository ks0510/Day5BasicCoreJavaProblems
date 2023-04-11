package basiccorejavaprograms;
import java.util.*;
/**
 * 
 * @author Kaif
 *
 */

public class VowelorConsonant {
	
	/**
	 * Method to check alphabet is vowel or consonant 
	 * @param args
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter alphabet");
		
		char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
		
		
  }
}
