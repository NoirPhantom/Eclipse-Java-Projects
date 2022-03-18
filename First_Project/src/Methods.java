import java.util.Scanner;

public class Methods {

    static int getTotal(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    static boolean isEven(int num1) {
        if (num1 % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isVowel(String word) {
        for (int i = 0; i < word.length(); i++) {
            char vowels = word.charAt(i);
            if (vowels == 'a' || vowels == 'e' || vowels == 'i' || vowels == 'o' || vowels == 'u') {
                return true;
            }
        }
        return false;
    }

    static int countVowels(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char vowel = word.charAt(i);
            if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
                count++;
            }
        }
        return count;
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static String displayPrimeNumbers() {
        int i = 0;
        int num = 0;
        String primeNumbers = "";

        for (i = 1; i <= 500; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter += 1;
                }
            }
            if (counter == 2) {
                primeNumbers += i + " ";
            }
        }
        return primeNumbers;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int even;
        String word;
        int prime;

        // Question 1
        System.out.println("Please enter first number to add: ");
        num1 = input.nextInt();
        System.out.println("Please enter second number to add: ");
        num2 = input.nextInt();
        System.out.println(getTotal(num1, num2));
        // Question 2
        System.out.println("Enter number to check if even: ");
        even = input.nextInt();
        System.out.println(isEven(even));
        // Question 3
        System.out.println("Enter word to check for vowels: ");
        input.nextLine();
        word = input.nextLine();
        System.out.println(isVowel(word));
        System.out.println("Counting how many vowels the word has: " + countVowels(word));
        // Question 4
        System.out.println("Enter number to check if prime: ");
        prime = input.nextInt();
        System.out.println(isPrime(prime));
        System.out.println("Prime numbers from 1 to 500 are: ");
        System.out.println(displayPrimeNumbers());

        input.close();
    }
}
