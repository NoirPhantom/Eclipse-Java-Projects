import java.util.Scanner;
/* Tomas, Sudha, Padmaja, Jonathan
 * This program takes 2 numbers as user input:
 * Calculates the summation of first n natural numbers for first number entered
 * Cube (to the power 3) of the second number entered
 * 
 * Make the code modular by using methods instead of computing everything in main
 * 
 * Examine the code to see if it makes sense to use a different kind of loop to reduce extra lines of code
 */

public class Team4 {
	public static void main(String[] args) {
		// Creating Scanner input
		Scanner input = new Scanner(System.in);
		// Requesting user input for 2 variables
		System.out.println("Please enter first number: ");
		int num1 = input.nextInt();
		System.out.println("Please enter second number: ");
		int num2 = input.nextInt();

		int sum = summation(num1);
		System.out.println("The summation of  " + num1 + " is " + sum);

		int cube = cube(num2);
		System.out.println("The cube of " + num2 + " is " + cube);

		input.close();
	}

	// Method to calculate summation of n number
	static int summation(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		return sum;
	}

	// Method to calculate cube of n number
	static int cube(int num) {
		int cube = 1;
		for (int i = 1; i <= 3; i++) {
			cube = cube * num;
		}
		return cube;
	}
}
