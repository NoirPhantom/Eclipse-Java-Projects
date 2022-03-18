import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // Question 1 - alpha array - 15 elements
        int intArray[] = new int[15];

        intArray[0] = 3;
        intArray[1] = 8;
        intArray[2] = 65;
        intArray[3] = 87;
        intArray[4] = 123;
        intArray[5] = 35;
        intArray[6] = 45;
        intArray[7] = 23;
        intArray[8] = 124;
        intArray[9] = (intArray[6] + intArray[13]);
        intArray[10] = 856;
        intArray[11] = 765;
        intArray[12] = 44;
        intArray[13] = 34;
        intArray[14] = 467;

        System.out.println(intArray[10]);
        System.out.println(intArray[9]);

        // Question 2 - weekDay array - 7 elements
        String dayArray[] = new String[7];
        dayArray[0] = "Monday";
        dayArray[1] = "Tuesday";
        dayArray[2] = "Wednesday";
        dayArray[3] = "Thursday";
        dayArray[4] = "Friday";
        dayArray[5] = "Saturday";
        dayArray[6] = "Sunday";

        String output = "{";

        for (int i = 0; i <= dayArray.length - 1; i++) {
            output += dayArray[i];

            if (i != dayArray.length - 1) {
                output += ", ";
            }
        }
        output += "}";

        System.out.println(output);

        // Question 3 - sum Array - 10 elements
        Scanner input = new Scanner(System.in);
        int[] sumArray = new int[10];
        int sum = 0;

        System.out.println("Enter number to place into array:");
        sumArray[0] = input.nextInt();
        System.out.println("Enter number to place into array:");
        sumArray[1] = input.nextInt();
        System.out.println("Enter number to place into array:");
        sumArray[2] = input.nextInt();
        System.out.println("Enter number to place into array:");
        sumArray[3] = input.nextInt();
        System.out.println("Enter number to place into array:");
        sumArray[4] = input.nextInt();
        System.out.println("Enter number to place into array:");
        sumArray[5] = input.nextInt();
        System.out.println("Enter number to place into array:");
        sumArray[6] = input.nextInt();
        System.out.println("Enter number to place into array:");
        sumArray[7] = input.nextInt();
        System.out.println("Enter number to place into array:");
        sumArray[8] = input.nextInt();
        System.out.println("Enter number to place into array:");
        sumArray[9] = input.nextInt();

        for (int value : sumArray) {
            sum += value;

        }
        System.out.println(sum);

        // Question 4 - reference arrays - 2 arrays - 5 element
        int[] list1 = new int[5];
        int[] list2 = new int[list1.length];
        list2 = list1;
        list2[0]++;

        System.out.println("Enter number to put into array: ");
        list1[0] = input.nextInt();
        System.out.println("Enter number to put into array: ");
        list1[1] = input.nextInt();
        System.out.println("Enter number to put into array: ");
        list1[2] = input.nextInt();
        System.out.println("Enter number to put into array: ");
        list1[3] = input.nextInt();
        System.out.println("Enter number to put into array: ");
        list1[4] = input.nextInt();

        // Prints out contents of list 1 array
        System.out.println("Contents of list1[] ");
        for (int i = 0; i < list1.length; i++) {
            System.out.println(list1[i] + " ");
        }

        // Prints out contents of list 2 array
        System.out.println("Contents of list2[] ");
        for (int i = 0; i < list2.length; i++) {
            System.out.println(list2[i] + " ");
        }

        // Question 5 - reverse arrays - 5 elements
        int[] reverseArray = { 23, 456, 678, 12, 45 };
        reverse(reverseArray, reverseArray.length);

        // Question 6 - largest and smallest array - 5 elements
        int[] number = { 12, 56, 1, 546, 43 };
        System.out.println("Largest in given array is: " + largest());
        System.out.println("Smallest in given array is: " + getSmallest(number, 5));

        input.close();
    }

    // Question 5
    static void reverse(int a[], int n) {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }

    // Question 6
    static int largest() {
        int i;
        int[] number = { 12, 56, 1, 546, 43 };
        int max = number[0];

        for (i = 1; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }
        return max;
    }

    public static int getSmallest(int[] a, int total) {
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[0];
    }
}
