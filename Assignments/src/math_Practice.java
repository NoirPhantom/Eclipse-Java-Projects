import java.util.Scanner;

//Jonathan Ocampo
//02/17/2022
//Doing multiple methods and call upon then through the main method
// factorial - n = n*(n-1),n*(n-2),n*(n-3),n*(n-4),n*(n-5)
// sum = 1 + 2 + 3..... + n
// average = (1 + 2 + 3..... + n) / 2
public class math_Practice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String name = input.nextLine();
		
		System.out.println("Enter the number: ");	
		int number = input.nextInt();

		welcome (name, number);
		
		long fact = factorial(number);
		System.out.println("The factorial of number " + number + " is " + fact);
		int sum = summation(number);
		System.out.println("The summation of first n natural numbers n being " + number + " and " + sum);
		double average = average(number);
		System.out.println("The average of first n natural numbers n being " + number + " and " + average);
		input.close();
	}
	
	static void welcome (String name, int num) {
		System.out.println("Welcome " + name + "!" + " I'll display the factorial, sum, and average of " + num);
	}
	

	/*
	 * method - return factorial of a given number 
	 * parameters - taking an int number as the the parameter 
	 * return - computes and returns the factorial of that number
	 */
	static long factorial(int number) {
		long factorial = 1;

		for (int i = number; i >= 1; i--) {
			factorial *= i; // factorial = factorial * i;
		}
		return factorial;
	}

	/*
	 * method - return summation 
	 * parameters - 
	 * return - 
	 */
	static int summation(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i; // sum = sum + i;
		}
		return sum;
	}
	
	/*
	method - Average of 
	parameters - 
	return - 
	*/
	static double average (int n) {
		double sum = summation(n);
		return sum/n;
	}
}
