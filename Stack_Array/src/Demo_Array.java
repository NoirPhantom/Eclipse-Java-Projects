import java.util.Scanner;
// Jonathan Ocampo
// 02/27/22
// Creating a stack with an array and limiting it to 5 elements
public class Demo_Array {

	public static void main(String[] args) {
		// Creating a scanner for user input to be allowed
		Scanner input = new Scanner(System.in);
		// Creating an array that has access to all attributes within the array class
		Array stack = new Array();
		// Creating a menu for the choices to implement
		String menu = "1.Print elements \n2.Push \n3.Pop \n4.Count \n5.Peek \n6.Quit";
		// Creating a variable to use a user input
		int choice;
		
		// Created a do while loop to execute everything before checking if the condition is checked and returns true or false to terminate the program
		do {
			System.out.println("Please enter the menu number for the action you want to perform on the stack: ");
			System.out.println(menu);
			choice = input.nextInt();
			// Printing display of elements within stack
			if (choice == 1) {
				stack.display();
			}
			// Pushing element or value to the top of the stack 
			else if (choice == 2) {
				System.out.println("Enter value you want to insert: ");
				choice = input.nextInt();
				stack.push(choice);
			} 
			// Popping the top most element of the stack
			else if (choice == 3) {
				System.out.println("Top number in stack is removed." + stack.pop());
			}
			// Counting the number of elements in the stack
			else if (choice == 4) {
				System.out.println("The count of elements within the stack: " + stack.count());
			}
			// Peeks at the top most element within the stack without removing or modifiying the element
			else if (choice == 5){
				System.out.println("The top most element value is as follows: " + stack.peek());
			}
			
		} 
		// Quits the program if user input ever equals to 6
		while (choice != 6);
		System.out.println("Thank you for using our application!");
		input.close();
	}

}
