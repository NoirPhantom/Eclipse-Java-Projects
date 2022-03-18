/*1. Create a program that prints number from 1 to 15.
2. Create a program that display all odd number from 1 to 10.
3. Create a program that display back-counting from 20 to 1.
4. Create a program that can print the following series: 1,4,7,10...20.
5. Create a program to display the product of all odd number from 1 to 10 using for loop (Optional Question).
*/
public class For_Loops {
	public static void main(String args[]) {
		//Problem 1 - Counter 1 - 15
		System.out.println("-Problem 1-");
		for (int num1 = 1; num1<= 15; num1++)
		{
			System.out.println("Number: " +num1);
		}
		
		//Problem 2 - Display odd numbers from 1 - 10
		System.out.println("\n-Problem 2-");
		for(int odd = 1; odd <= 10; odd += 2) {
			System.out.println("Odd number: " + odd);
		}
		
		//Problem 2 - Alternate
		/*
		 * int n = 10; System.out.println("\n-Problem 2 - Alternate-"); for(int m = 1; m
		 * <= n; m++) { if(m%2== 1) { System.out.println("Odd Number is: " + m); } }
		 */
		
		//Problem 3 - Back counting from 20 - 1
		System.out.println("\n-Problem 3-");
		// Starting from 20 and check condition that back is greater than 0 until it reaches 1 at which point it stops the for loop 
		for(int back = 20; back > 0; back--) {
		// Everytime it checks the condition inside the parenthesis and its comes back as true it prints out the statement in the print statement
			System.out.println("Number is: " + back);
		}
		
		//Problem 4 - Printing a Certain Series of numbers
		System.out.println("\n-Problem 4-");
		int add = 1; 
		   for (int i = 0;i <= 5;i++) 
		   {  
			 add = add + i;
		     System.out.println(add); 
		    } 
		   
		// Problem 5 - Multiply Odd by Odd
		   System.out.println("\n-Problem 5-");
			for(int mul = 1; mul <= 10; mul += 2) {
				System.out.println(mul * (mul + 2));
			}
	}
}
