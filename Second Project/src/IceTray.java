
public class IceTray {
	String color;
	String content;
	String shape;
	
	IceTray() {
		this.color = "Transparent";
		this.content = "Water";
		this.shape = "Cube";
	}
	
	IceTray(String col, String con) { // IceTray ("Red", "Strawberry Juice")
		
		this.color = col;
		this.content = con;
	}
	
	IceTray(String col, String con, String shape) {
		this.color = col;
		this.content = con;
		this.shape = shape;
	}
	
	IceTray(String shape) {
		this.shape = shape;
	}
	
	void printHello() {
		System.out.println("My color is " + this.color);
		System.out.println("Hello World!");
	}
}
