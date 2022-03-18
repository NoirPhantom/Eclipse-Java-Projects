
public class Demo {
		
	public static void main(String[] args) {
		IceTray ice1 = new IceTray();
		
		
		
		System.out.println("Ice 1 Details");
		System.out.println(ice1.shape);
		System.out.println(ice1.color);
		System.out.println(ice1.content);
		
		IceTray ice2 = new IceTray("Red", "Strawberry Juice");
		ice2.shape = "Triangle";
		
		System.out.println("\nIce 2 Details");
		System.out.println(ice2.shape);
		System.out.println(ice2.color);
		System.out.println(ice2.content);
		
		IceTray ice3 = new IceTray("Blue", "Blueberry Smoothie", "Round");
		
		System.out.println("\nIce 3 Details");
		System.out.println(ice3.shape);
		System.out.println(ice3.color);
		System.out.println(ice3.content);
		
		IceTray ice4 = new IceTray("Square");
		
		System.out.println("\nIce 4 Details");
		System.out.println(ice4.shape);
		System.out.println(ice4.color);
		System.out.println(ice4.content);
		
		
	}
}
