import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter word you want to check if palindrome: ");
		String str = input.nextLine(); 
		String reverseStr = "";
		
		for (int i = (str.length()-1); i >= 0; --i) {
			reverseStr = reverseStr + str.charAt(i);
		}
			if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
				System.out.println(str + " is a palindrome string.");
			} else {
				System.out.println(str + " is not a palindrome string.");
			}
		input.close();
	}

}