
public class Main_Arrays {

	public static void main(String[] args) {
		int[] userArray = { 2, 55, 75, 90, 23};
						 // 2, 23, 55, 75, 90
						 // 0,  1,  2,  3,  4
		System.out.println("Array length is: " + userArray.length);

		for (int i = 0; i <= userArray.length - 1; i++) {
			System.out.println("Array number: " + userArray[i] + ", ");
		}

		for (int i = userArray.length - 1; i >= 0; i--) {
			System.out.println("Array numbers in reverse " + userArray[i] + ", ");
		}

		System.out.println("Largest: " + Array_Resources.getLargest(userArray, userArray.length));

		System.out.println("The sum of the array is: " + Array_Resources.sum(userArray));
		
	}
	
}
