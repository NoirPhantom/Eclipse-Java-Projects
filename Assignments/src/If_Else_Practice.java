
public class If_Else_Practice {
		public static void main(String args[]) {
			int count = 10;
			if (count == 10) {
				System.out.println("The count is 10.");
			} else {
					System.out.println("The count is not 10.");
				}
			
			String carColor = "Black";
			if (carColor == "Red") {
				System.out.println("Red");
			}
			else if (carColor == "Blue") {
				System.out.println("Blue");
			}
			else {
				System.out.println("The car color is: " + carColor);
			}
			
			boolean raining = false;
			float temp = 65.8f;
			if (raining == true && temp < 50) {
				System.out.println("Take your umbrella.");
			} else {
				System.out.println("Don't take your umbrella.");
			}
		}
}
