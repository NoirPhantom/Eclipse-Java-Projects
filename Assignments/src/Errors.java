
public class Errors {
	// Syntax error - fix it
	// Changed the capital S to lower case
	public static void main(String[] args) {

		int leftOperand = 8;
		// Syntax error - Fix the syntax error
		// Changed string to int
		int rightOperand = 4;
		char operator = '*';

		if (operator == '+') {
			/*
			 * Logic error - unexpected output, it doesn't add the two numbers. Fix the
			 * error
			 */
			// placed parenthesis around the 2 numbers to actually add them together
			System.out.println("The sum of two numbers is " + (leftOperand + rightOperand));
		}

		else if (operator == '-') {
			// Logic error - unexpected output. Fix the error by choosing the correct
			// operator and precedence
			// Added the number in parenthesis and changed the addition to subtraction.
			System.out.println("The difference between the two numbers is " + (leftOperand - rightOperand));
		}

		// Syntax error - Fix the error by using the appropriate relational operator
		// Gave it one more equals to correct the relational operator
		else if (operator == '*') {

			System.out.println(leftOperand + " times " + rightOperand + " is " + leftOperand * rightOperand);
		}

		else if (operator == '/') {

			/*
			 * Runtime error - In mathematics division by zero results in undefined. Change
			 * the value of rightOperand to 0, value of operator to '/' and execute your
			 * code. It'll result in a run-time error (DivideByZero Error) Fix it by adding
			 * a nested if within this code block to check if rightOperand is equal to 0 if
			 * it is, print a message saying "Divide by Zero not allowed" For all other
			 * cases, print the below statement
			 */
			// Added parenthesis around the 2 final numbers in the condition to get them to
			// divide first
			System.out.println(leftOperand + " divided by  " + rightOperand + " is " + (leftOperand / rightOperand));

			if (rightOperand == 0) {
				System.out.println("Divided by zero is not allowed");
			}
		}

	}
}
