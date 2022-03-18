import java.util.Scanner;

public class Palindrome_Practice {
	static boolean sentencePalindrome(String str) {
		int j = 0;
		int i = str.length() - 1;

		// Lowercase string
		str = str.toLowerCase();

		// Compares character until they are equal
		while (j <= i) {

			char getAtj = str.charAt(j);
			char getAti = str.charAt(i);

			// If there is another symbol in left
			// of sentence
			if (!(getAtj >= 'a' && getAtj <= 'z'))
				j++;

			// If there is another symbol in right
			// of sentence
			else if (!(getAti >= 'a' && getAti <= 'z'))
				i--;

			// If characters are equal
			else if (getAtj == getAti) {
				j++;
				i--;
			}

			// If characters are not equal then
			// sentence is not palindrome
			else
				return false;
		}

		// Returns true if sentence is palindrome
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter word to chekc for palindrome: ");
		String str = input.nextLine();
		if (sentencePalindrome(str)) {
			System.out.println("Sentence is palindrome");
		} else {
			System.out.println("Sentence is not" + " " + "palindrome");
		}
		input.close();
	}
}
