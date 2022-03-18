import java.util.Scanner;

/*
  Jonathan Ocampo
  02-28-22
  Creating a string program to make use of a variety of String methods
*/
public class Strings {
	
	public static void main(String[] args) {
		// Creating a new Scanner for user input
		Scanner input = new Scanner (System.in);
		String choice1;
		String choice2;
		
		System.out.println("Enter sentence: ");
		choice1 = input.nextLine();
		//Returning the length of the string known as choice1 
		System.out.println("String length: " + choice1.length());
		System.out.println();
		
		System.out.println("Enter word: ");
		choice2 = input.next();
		//Returning the length of the string known as choice2
		System.out.println("String length: " + choice2.length());
		System.out.println();
		
		//Checking whether choice1 and choice2 have a substring which in this case its checking if anything matches between the 2 choices
		System.out.println(choice1.contains(choice2));
		//Checking if choice1 starts with a lowercase a if true return true
		System.out.println(choice1.toLowerCase().startsWith("a"));
		//Checking if choice2 ends with uppercase DCI if true returns true
		System.out.println(choice1.endsWith("DCI"));
		//Checking if choice2 contains UST anywhere within it
		System.out.println(choice2.contains("UST"));
		//Checking if choice1 is All is Well even if its all lowercase of uppercase and return true or false
		System.out.println(choice1.equalsIgnoreCase("All is Well"));
		//Checking if choice1 starts with the same letter that it ends with
		System.out.println(choice1.charAt(0) == choice1.charAt(choice1.length()-1));
		//Checking the memory location and checking if both are the same returns true if not false
		System.out.println(choice1.equals(choice2));
		// Checking the value and also checking 
		System.out.println(choice1.equalsIgnoreCase(choice2));
		
		//Checking Immutable string
		System.out.println(choice2.toUpperCase());
		System.out.println(choice2);
		
		input.close();
	}
		
		
}
