import java.util.Arrays;


public class Array_Resources {
	int number;

	Array_Resources[] array = new Array_Resources[5];

	public Array_Resources(int num) {
		this.number = num;
	}

	public static int getLargest(int[] array, int length) {
		Arrays.sort(array);
		return array[length - 1];
	}
	
	public static int sum(int[] array) {
		int sum = 0;
		for (int value : array) {
			sum += value;
		}
		return sum;
	}
}
