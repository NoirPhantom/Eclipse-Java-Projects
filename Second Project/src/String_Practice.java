import java.util.Scanner;

public class String_Practice {

	static boolean isPalindrome(String in) {
		// First step would be to reverse the string
		// convert input to charArray and store it in a char array
		// Create one more char Array with the same size as the above char array
		// loop through the first charArray from last index to first index
		// add each character into the second char array
		String input = in;
		char[] inputChar = input.toCharArray();
		char[] outputChar = new char[inputChar.length];

		// Second step to convert output char into a string
		int j = 0;
		for (int i = inputChar.length - 1; i >= 0; i--) {
			outputChar[j] = inputChar[i];
			j++;
		}
		String output = String.valueOf(outputChar);
		// Comparing the two string ignoring case and check if they are equal return
		// true, false otherwise
		return input.equalsIgnoreCase(output);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//First Print - Checking for the first user input
		System.out.println("Please enter word to check if palindrome: ");
		String str = input.nextLine();
		System.out.println(isPalindrome(str));
		// Second check - Checking for the second user input
		System.out.println("Please enter next word to check: ");
		str = input.nextLine();
		System.out.println(isPalindrome(str));
		// Third Print - Checking for the third user input 
		System.out.println("Please enter next word to check: ");
		str = input.nextLine();
		System.out.println(isPalindrome(str));
		// Fourth Print - Checking for the fourth user input 
		System.out.println("Please enter next word to check: ");
		str = input.nextLine();
		System.out.println(isPalindrome(str));
		
		input.close();

	}

}

/*
 * for (int i = (str.length()-1); i >= 0; --i) { reverseStr = reverseStr +
 * str.charAt(i); }
 */
/*
 * if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
 * System.out.println(str + " is a palindrome string."); } else {
 * System.out.println(str + " is not a palindrome string."); }
 */

//String reverseStr = "";