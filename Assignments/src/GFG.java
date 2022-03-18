import java.util.Scanner;

public class GFG {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int number = 1 + (int) (100 * Math.random());

		int K = 10;
		int i, guess;

		System.out.println("A number is chosen" + " between 1 to 100." + " Guess the number" + " within 5 tries.");

		for (i = 0; i < K; i++) {
			System.out.println("Guess the number: ");

			guess = sc.nextInt();

			if (number == guess) {
				System.out.println("Congragulations!" + " You guessed the number");
				break;
			} else if (number > guess && i != K - 1) {
				System.out.println("The number is " + "greater than " + guess);
			} else if (number < guess && i != K - 1) {
				System.out.println("The number is " + " less than " + guess);
			}
		}
		if (i == K) {
			System.out.println("You have exhausted" + " K tries.");
			System.out.println("The number was " + number);
		}
	}
}
