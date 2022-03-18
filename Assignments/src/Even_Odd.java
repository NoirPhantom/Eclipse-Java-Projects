import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		// Problem 3 - Even or Odd
		System.out.println("-Problem 3-");
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number and I'll let you know of it's even or odd.");
		int num = input.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + " is even.");
		} else {
			System.out.println(num + " is odd.");
		}
		input.close();

	}

}
