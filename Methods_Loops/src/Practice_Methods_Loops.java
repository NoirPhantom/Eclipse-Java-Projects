import java.util.Scanner;

// Jonathan Ocampo
// 02/24/2022
// Creating Methods and Loops
public class Practice_Methods_Loops {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			String choice;

			// Question 1 - Loops - Sum of First 10 natural numbers
			System.out.println("Please enter number: ");
			int num = input.nextInt();
			int sum = 0;
			// Initializing for loop to add the sum of the first n natural numbers
			for (int i = 1; i <= num; i++) {
				sum += i;
			}
			System.out.println("Sum of natural numbers is: " + sum);

			// Question 2 - Loops - Creating a multiplication table of number provided by
			// user
			System.out.println("Please enter number to create Multiplication table: ");
			int num1 = input.nextInt();
			// Initializing for loop to create the format to create the multiplication table
			// by being provided a number from user input
			for (int i = 1; i <= 10; i++) {
				System.out.printf("%d * %d = %d \n", num1, i, num1 * i);
			}

			// Question 3 - Loops - Printing out number provided by user in reverse order
			System.out.println("Please enter number to reverse: ");
			int num2 = input.nextInt();
			int reverse = 0;
			// Initializing for loop
			for (; num2 != 0; num2 = num2 / 10) {
				int remainder = num2 % 10;
				reverse = reverse * 10 + remainder;
				// System.out.println("The reverse of the given number is: " + reverse);
			}
			System.out.println("The reverse of the given number is: " + reverse);

			// Question 4 - Loops - Prints a set of integers and then prints the sum of the
			// even and odd integers
			int num3 = 10;
			int evenSum = 0;
			int oddSum = 0;
			// for loop to print out integers 1 to 10
			for (int i = 1; i <= num3; i++) {
				System.out.println("Number: " + i);
			}
			// for loop to print out the sum of the even numbers and the sum of the odd
			// numbers within the first 10 integers
			for (int i = 1; i <= num3; i++) {
				if ((i & 1) == 0) {
					evenSum += i;
				} else {
					oddSum += i;
				}
			}
			// Printing out the sum of the even numbers included within the first 10
			// integers
			System.out.println("Sum of First " + num3 + " Even numbers: " + evenSum);
			// Printing out the sum of the odd numbers included within the first 10 integers
			System.out.println("Sum of First " + num3 + " Odd numbers: " + oddSum);

			// Question 5 - Loops - Creating a do-while loop to take two numbers from user
			// input and add them
			// and display the sum and ask if you want to continue.
			do {
				int add = 0;
				System.out.println("Enter first number: ");
				int num4 = input.nextInt();
				System.out.println("Enter second number: ");
				int num5 = input.nextInt();
				add = num4 + num5;
				System.out.println("The sum of " + num4 + " and " + num5 + " is " + add);
				System.out.println();
				System.out.println("Do you want to continue? [yes/no]");
				choice = input.nextLine();
				choice = input.nextLine();

			} while (choice.equals("yes"));
			System.out.println("Thank you for playing!");

			input.close();
		}

	}
}
