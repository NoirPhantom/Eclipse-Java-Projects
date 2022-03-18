
import java.util.Scanner;

public class Name {
	public static void main(String args[]) {
		// Using a string as a variable - Problem 1
		Scanner name = new Scanner(System.in);
		System.out.println("-Problem 1-");
		System.out.println("Input Name: ");
		String n = name.nextLine();
		System.out.println("Hello and Welcome to DCI " + n + ".");
		name.close();
	}
}
