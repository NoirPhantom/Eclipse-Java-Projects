/*
 * Author: Jonathan Ocampo
 * Date: 02/15/22
 * Description: Creating a for loop and Practicing Concepts
 * 1. Understanding the question
 * 2. PseudoCode / Flowchart / Statements
 * 3. Solving - Code Implementation
 * 4. Testing
 */

//import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class Concepts_Practice {
	public static void main(String args[]) throws Exception {
		/*
		 * // Declaring the Scanner class for user input
		 * System.out.println("Enter the number whose sum needs to be calculated: "); //
		 * Declaring my user input variable int n = input.nextInt(); input.nextLine();
		 * int sum = 0;
		 * 
		 * // Declaring my variable for my for loop for (int i = 1; i <= n; i++) { sum =
		 * sum + i; }
		 * 
		 * System.out.println("The sum of first " + n + " numbers is " + sum);
		 * System.out.println("What is your name: "); String name = input.nextLine();
		 * System.out.println("Hello " + name + ", What would you like to do next?");
		 * input.close();
		 */
		// Scanner input = new Scanner(System.in);
		// String array to have a set of times that made as strings to be called upon
		// later in the code
		String[] time = { "01:11", "23:11", "16:48", "12:30", "08:28", "17:07" };
		// Setting time format to understand that time is hh:mm
		SimpleDateFormat twentyFourHourFormat = new SimpleDateFormat("hh:mm");
		// Declaring date variable to null due to having be changed within the code
		Date date = null;
		// Result is for the final print out when code shows final product
		String result;
		String formatTwelve;

		for (String res : time) {
			/*
			 * Setting a try catch block to catch the exception that i have declared at
			 * which point the rest of my code will still print even if the exception error
			 * is shown.
			 */
			try {
				date = twentyFourHourFormat.parse(res);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			// Declaring format Twelve to format twenty four giving it the format of hh:mm
			formatTwelve = twentyFourHourFormat.format(date);
			// If and else statement calling upon my string array to bring my times in the
			// array and converting them to either am or pm
			if (formatTwelve.equals(res)) {
				result = formatTwelve + " AM";
			} else {
				result = formatTwelve + " PM";
			}

			System.out.println(res + " : " + result);
		}

		// System.out.println();
		// System.out.println("Insert starting base you want to start with: ");
		// int base = input.nextInt();
		int base = 5;
		// System.out.println("Insert starting exponent you want to start with: ");
		// int exponent = input.nextInt();
		int exponent = 3;
		long endresult = 1;
		// System.out.println("Starting base is: " + base);
		// System.out.println("Starting exponent is: " + exponent);
		for (; exponent != 0; --exponent) {
			// endresult = 1 * base = 6 = 6 - 1st run
			// endresult = 6 * base = 6 = 36 - 2nd run
			// endresult = 36 * base = 6 216 - 3rd run
			endresult *= base;
			// System.out.println("Answer: " + endresult);
		}
		System.out.println("Answer: " + endresult);
		// input.close();
	}
}