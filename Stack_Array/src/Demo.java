//import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		// Scanner input = new Scanner(System.in);
		// String menu = "1.Print elements \n2.Push \n3.Pop \n4.Count \n5.Peek
		// \n6.Quit";
		// String choice;
		// int number;
		Stack_Array stack = new Stack_Array(5);

		// stack.push(10);
		// stack.push(50);
		// stack.push(35);
		// stack.push(65);
		// stack.push(2);

		System.out.print("Stack: ");
		stack.printStack();

		// remove element from stack
		stack.pop();
		System.out.println("\nAfter popping out");
		stack.printStack();

		/*
		 * do { System.out.
		 * println("Please enter the menu number for the action you want to perform on the stack."
		 * ); System.out.println(menu);
		 * System.out.println("Select an option from the menu: "); choice =
		 * input.nextLine(); if (choice == "1") { System.out.println("Stack: ");
		 * stack.printStack(); } else if(choice == "2") {
		 * System.out.println("Enter the value you want to insert: "); number =
		 * input.nextInt(); stack.push(number);
		 * 
		 * }
		 * 
		 * } while(choice != "6");
		 * System.out.println("Thank you for using our application!");
		 */

		// input.close();
	}
}
