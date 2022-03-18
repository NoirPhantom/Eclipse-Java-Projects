import java.util.Scanner;

public class Main_Inheritance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int number1 = input.nextInt();
        System.out.println("Please enter second number:");
        int number2 = input.nextInt();
        System.out.println("Please enter third number:");
        int number3 = input.nextInt();
        System.out.println("Please enter fourth number:");
        float number4 = input.nextFloat();

        System.out.println(Inheritance.add(number1, number2));
        System.out.println(Inheritance.add(number1, number4));
        System.out.println(Inheritance.add(number1, number2, number3));
        System.out.println(Inheritance.add(number4, number2, number3));
        System.out.println(Inheritance.multiply(number1, number2));
        System.out.println(Inheritance.multiply(number4, number3));
        System.out.println(Inheritance.multiply(number1, number2, number3));
        System.out.println(Inheritance.multiply(number4, number2, number3));

        input.close();

    }
}
