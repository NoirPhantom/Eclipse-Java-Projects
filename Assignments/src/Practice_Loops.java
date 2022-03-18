
public class Practice_Loops {
		public static void main(String args[]) {
			/*
			 * // Loop out from 20 to 100 and designate each either odd or even - Question 2
			 * for (int num1 = 20; num1 <= 100; num1++) { if(num1%2 == 0) {
			 * System.out.println(num1 + " Even"); } else { System.out.println(num1 +
			 * " Odd"); } }
			 * 
			 * // Questions 4 A)
			 * 
			 * int i = 10; int sum = 0; //This will loop for 90 times before terminating
			 * code System.out.println("\n- Question 4 - A"); while (i <= 100) {
			 * System.out.println(sum + i); i++; } //Question 4 B)
			 * System.out.println("\n - Question 4 - B"); for (int n = 10; n <= 100; n++) {
			 * System.out.println("Number: " + n); } //Question 4 C)
			 * System.out.println("\n-Question 4 - C"); int m = 10; do{
			 * System.out.println("Number is: " + m); m++; } while(m <= 100);
			 */
				int i;
				int beginValue = 10;
				int endValue = 50;
				int tableValue = 5;
				for (i = beginValue; i <= endValue; i = i + tableValue) {
					System.out.println(i + " ");
				}
				
				double n = 1.2;
				System.out.println();
				while(n != 5.6) {
					System.out.println(Math.sqrt(n));
					n = n + 1.1;
				}
				
				int starNo = 20;
				int endNo = 50;
				System.out.println();
				do {
					if ((starNo % 2) != 0) {
						System.out.println(starNo);
					}
				} while ((starNo++) < endNo);
		}
}
