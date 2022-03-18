
import java.util.Scanner;

public class IfElse {
	public static void main(String args[]) {
		// Problem 4 - If else statement
		Scanner input = new Scanner(System.in);
		System.out.println("Please insert grade: ");
		int grade = input.nextInt();
		if (grade >= 90) {
			System.out.println(grade + " is a A.");
		} else if (grade >= 80) {
			System.out.println(grade + " is a B.");
		} else if (grade >= 70) {
			System.out.println(grade + " is a C.");
		} else {
			System.out.println(grade + " is a failing grade.");
		}
			input.close();
	}
}
