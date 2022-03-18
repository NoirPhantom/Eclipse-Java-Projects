
public class Main_IceTray {
	public static void main(String[] args) {
		IceTray ice1 = new IceTray();

		IceTray ice2 = new IceTray("Red", "Strawberry Juice");

		IceTray ice3 = new IceTray("Yellow", "Mango", "Square");

		new IceTray("Round");

		ice1.printHello();

		ice2.printHello();

		ice3.printHello();

	}
}
