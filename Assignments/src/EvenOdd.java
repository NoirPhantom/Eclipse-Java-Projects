import java.util.Scanner;

public class EvenOdd {
		public static void main(String args []) {
			
			// Creating Scanner for user input
			Scanner input = new Scanner(System.in);
			
			//Getting input from user
			System.out.println("Please enter an integer: ");
			int number = input.nextInt();
			
			//Determining whether number is even or odd
			if (number % 2 == 0) {
				System.out.println("The number is even: " + number);
			} else {
				System.out.println("The number is odd: " + number);
			}
			//Closing user input scanner
			input.close();
		}
}
