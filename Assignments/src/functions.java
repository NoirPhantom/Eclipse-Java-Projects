
// Jonathan Ocampo
// 2/16/22
// Functions
import java.util.Scanner;

public class functions {

	public static void main(String args[]) {
		int num1 = 11;
		int num2 = 7;
		// int answer1;
		// int answer2;
		// boolean answer3;
		System.out.println("Program start.\n");
		name();
		increm();
		// answer1 = multNumbers(num1);
		System.out.println("\nThe result is: " + multNumbers(num1));
		// answer2 = addNumbers(num1, num2);
		System.out.println("The result is: " + addNumbers(num1, num2));
		// answer3 = equalNumbers (num1, num2);
		System.out.println("\nNumber 1 & Number 2 are equal: " + equalNumbers(num1, num2));
		System.out.println("\nProgram end.");
	}

	public static void name() {
		System.out.println("My first name is Jonathan.");
		System.out.println("I love ice cream.\n");
	}

	static void increm() {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Insert starting number: ");
			int a = input.nextInt();
			for (; a <= 10; a++) {
				if (a % 2 == 0) {
					System.out.println("even number:" + a);
				} else {
					System.out.println("odd number:" + a);
				}
			}
			input.close();
		}
	}

	public static int multNumbers(int a) {
		return (a * 7);

	}

	public static int addNumbers(int x, int y) {
		return (x + y);
	}

	public static boolean equalNumbers(int r, int t) {
		if (r == t)
			return true;
		else
			return false;
	}
}
