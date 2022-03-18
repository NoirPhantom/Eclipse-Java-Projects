
public class TestArrays {
	public static void main(String[] args) {
		// integer array
		/*
		 * A student can take 5 courses
		 * Score at index 0 = Math score
		 * Score at index 1 = Science Score
		 * Score at index 2 = Art
		 * Score at index 3 = Computer
		 * Score at index 4 = Gym
		 */
		int[] scores = { 99, 88, 50, 75, 40 };
		System.out.println("My score in Computers is: " + scores[3]);

		// print all elements in scores
		for (int i = 1; i <= (scores.length - 1); i++) {
			System.out.println(scores[i]);
		}

		// float array
		System.out.println();
		float[] decimals = new float[4];
		decimals[0] = 22.5f;
		decimals[1] = 33.6f;
		decimals[2] = 2.2f;
		decimals[3] = 90.5f;

		String output = "{";

		for (int i = 0; i <= (decimals.length - 1); i++) {

			output += decimals[i];

			// if i is not in the last index
			if (i != decimals.length - 1) {
				output += ", ";
			}
		}
		output += "}";

		System.out.println(output);

		// String array
		System.out.println();
		String[] students = { "Jonathan", "Connor", "ShaKeah", "Justice", "David", "Bijay" };
		int count = 0;
		for (int i = 0; i <= students.length - 1; i++) {

			if (students[i].startsWith("J")) {
				count++;
			}
			System.out.println("The number of students whose name starts with J is " + count);
		}
		System.out.println();
		// Printing all students names in array
		for (int i = 0; i <= students.length - 1; i += 2) {
			System.out.println(students[i]);
		}
		System.out.println();
		// Creating an array of lucky numbers
		int[] lucky = { 19, 20, 22, 13, 18, 4 };
		System.out.println(lucky.length);
		System.out.println(lucky[0]);
		System.out.println(lucky[lucky.length - 1]);

		System.out.println();
		for (int i = lucky.length - 1; i >= 0; i--) {
			System.out.println(lucky[i]);
		}

	}
}
