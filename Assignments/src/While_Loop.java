/*Create a counter that prints numbers from 8 through 20
Print all even numbers between 1 & 25
Print all odd numbers between 50 & 100*/
public class While_Loop {

		public static void main (String args []) {
			// Problem 1 - Counter
			int counter = 8;
				System.out.println("-Counter-");
			while (counter <= 20) {
				System.out.println("Count is: " +counter);
				counter++;
			}
			
			//Problem 2 - Even Numbers
			int even = 1;
				System.out.println("\n-Even Numbers-");
			while (even <= 12) {
				System.out.println(even*2);
				even++;
			}
				
//			while (even <= 25) {
//				System.out.println("Even number is: " + even);
//				even = even + 2;
//			}
			
			//Problem 3 - Odd numbers
			int num = 100;
				System.out.println("\n-Odd Numbers-");
				System.out.println("List of odd numbers from 50 to " + num + ":");
				for (int odd = 50; odd <= num; odd++ ) {
					if (odd%2!=0)
					{
						System.out.println(odd);
					}
				}
			int a = 1;
				System.out.println();
				while (a <= 10) {
					System.out.println("The value of a is: " + a);
					a++;
				}
				
//			while(odd <= 100) {
//				System.out.println("Odd number is: " + odd);
//				odd = odd + 2;
//			}
				
			Conditional_Statements.main(args);
		}
}
