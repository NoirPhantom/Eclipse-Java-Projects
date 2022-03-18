// Jonathan Ocampo
//03/04/22
//Creating a Circle class to implement all attributes and methods needed to run in the main method
public class Circle {
    int radius;
    final static float pi = 3.142f;

    // Creating a default constructor to make radius 1
    public Circle() {
        this.radius = 1;
    }

    // Constructor accepting an integer value as a parameter
    public Circle(int radius) {
        this.radius = radius;
    }

    // Method to calculate diameter - not being used today
    public float getDiameter() {
        return this.radius * 2;
    }

    // Method to calculate area
    public float getArea() {
        return pi * this.radius * this.radius;
    }

    // Method to calculate circumference
    public float getCircumference() {
        return 2 * pi * this.radius;
    }

    // Overriding the default expression of toString to print what we want to show
    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }

}
