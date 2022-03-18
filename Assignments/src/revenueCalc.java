import java.util.Scanner;

public class revenueCalc {
		public static void main(String args []) {
			// Declaring variables needed
			int revenue, price, quantity;
			int discount = 0;
			
			// Creating Scanner for user input
			Scanner input = new Scanner (System.in);
			
			//Getting value for price of product from user
			System.out.println("Enter price of product: ");
			price = input.nextInt();
			
			// Getting value for quantity of product from user
			System.out.println("Enter quantity of product: ");
			quantity = input.nextInt();
			
			//Calculating revenue
			revenue = price * quantity;
			
			if (revenue > 5000) {
				// Calculate discount 
				discount = revenue * 10 / 100;
				// Calculate net revenue
				revenue = revenue - discount;
			}
			
			// Displaying Discount and net revenue
			System.out.println("The discount is " + discount);
			System.out.println("The net revenue is " + revenue);
			
			input.close();
		}
}
