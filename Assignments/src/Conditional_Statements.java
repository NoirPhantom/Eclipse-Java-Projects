/*
Declare two integer variables newUsers and appDownloads
If newUsers is more than 100 & appDownloads is at least 200 OR if newUsers is equal to 500 or 600
print("You have reached your application's weekly goal! Well done")
If the above condition is not satisfied, print("Almost there") if either newUsers is 500 or appDownloads is 100
If the none of the above conditions are met, print 2 statements on separate lines: ("Your application didn't do great this week"), ("Better luck next time")
*/
public class Conditional_Statements {
	public static void main(String args[]) {
		// Problem 3 - Using Complex Conditional Statements
		int newUsers;
		int appDownloads;
		newUsers = 500;
		appDownloads = 850;
		
			System.out.println("-Problem 3-");
		if (newUsers >= 100 && appDownloads == 200 || newUsers >= 500) {
			System.out.println("You have reached your application's weekly goal! Well done.");
		}
		else if (newUsers == 500 || appDownloads == 100) {
			System.out.println("Almost there");
		} 
		else {
			System.out.println("Your Application didn't do great this week");
			System.out.println("Better luck next time");
		}

		// Problem 1 - Declare three different variables.
		// Declare 3 variables: an integer, a float and a double. Give it random values
		// of your choice. Using conditional statement, print the largest of the 3
		// numbers.
		int a;
		float b;
		double c;
		a = 50;
		b = 88.9f;
		c = 200;
			
			System.out.println("\n-Problem 1-");
		if (a >= b && a >= c) {
			// Condition asks whether value of a is larger than b & c, if condition is false
			// continue to next statement.
			System.out.println("This number is the largest: " + a);
		} 
		else if (b >= a && b >= c) {
			// condition asks whether value in b is larger than a & c, if condition is false
			// continue to next condition.
			System.out.println("This number is the largest: " + b);
		} 
		else if (c >= a && c >= b) {
			// Condition asks whether value in c is larger than a & b, if condition is false
			// continue to final condition.
			System.out.println("This number is the largest: " + c);
		} 
		else {
			// NO condition to check, just prints out the all my previous conditions are
			// wrong 
			System.out.println("None of my statements are correct");
		}

		// Problem 2 - int declaration of RPM with conditional statement
		// Declare an int variable called RPM and give it a random value of your choice.
		// If the value of RPM is 0 or greater than 3000, print("The engine has either
		// stopped or running too quickly")
		// If the above condition is not met, print("The engine is running on a normal
		// speed")
		int RPM;
		RPM = 1500;
			
			System.out.println("\n-Problem 2-");
		if (RPM == 0 || RPM >= 3000) {
			// This condition checks whether RPM less than or equal to than 0 or grater than or equal to 3000, if statement is false continue to final condition
			System.out.println("The engine has either stopped or running too quickly.");
		} 
		else {
			// Print out final statement
			System.out.println("The engine is running at normal speed.");
		}

	}
}
