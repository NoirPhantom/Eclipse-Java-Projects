//Create an abstract class Shape:
//It has attribute int numberOfSides
//An abstract method double area()
//Another abstract method double perimeter()
//A non-abstract method void finiteElementFormulation() which prints "I don't know what that means!!"

abstract class Shape {
    int numberOfSides;

    abstract double area();

    abstract double perimeter();

    void finiteElementFormulation() {
        System.out.println("I don't know what that means!!");
    }
}
