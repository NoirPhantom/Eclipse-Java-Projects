
import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to my shop! \n");
		String shop = "0 : Shoes \n1 : Firearms \n2 : Outdoor materials \n3 : Clothes \n4 : Quit";
		int userinput;

		do {
			System.out.println(shop);
			System.out.println();
			System.out.println("Enter corresponding number for certain shop area. To leave application enter 4.");
			userinput = input.nextInt();
			if (userinput >= 0 && userinput <= 3) {
				System.out.println("Thank you for your purchase today!");
			}
		} while (userinput != 4);
		System.out.println("Thank you for shopping with us today!");
		input.close();
	}

}
