//Create a Circle class that implements the 2 interfaces and inherits from Shape
//Circle will have a static final float PI = 3.142f
//It'll have an int attribute radius
//drawColor prints ("The color is" + color)
//drawCoordinates prints "The circle is drawn at (" + x + "," + y + ")"
//angleOfSector returns radius * radius * angle / 2
//arc prints ("360 degrees")
//area returns PI * radius * radius
//perimeter returns 2 * PI * r

public class Circle extends Shape implements Draw, Geometry {
    static final float PI = 3.142f;
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void drawColor(String color) {
        System.out.println("This color is: " + color);
    }

    public void drawCoordinates(int x, int y) {
        System.out.println("The circle is drawn at (" + x + "," + y + ")");
    }

    @Override
    public int angleOfSector(int angle) {
        return radius * radius * angle / 2;
    }

    @Override
    public void arc() {
        System.out.println("360 degrees");
    }

    @Override
    double area() {
        return PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * PI * radius;
    }

}
