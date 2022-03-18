// Object Oriented Programming (OOP)
// 1. Encapsulation - attributes & methods all in one class per entity
// 2. Abstraction - hading implementation while providing functionality
// 3. Inheritance - Base class, derived class
// 4. Polymorphism (Overloading, Overriding) - same name, different
// functionality

public class Inheritance {

    private int number1;
    private int number2;
    private int number3;

    public Inheritance(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public Inheritance(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public Inheritance(int number1) {
        this.number1 = number1;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumber3() {
        return number3;
    }

    public void setNumber3(int number3) {
        this.number3 = number3;
    }

    static float add(int number1, float number2) {
        return number1 + number2;
    }

    static int add(int number1, int number2) {
        return number1 + number2;
    }

    static int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    static float add(float number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    static int mutiply(int number1, int number2) {
        return number1 * number2;
    }

    static float multiply(float number1, int number2) {
        return number1 * number2;
    }

    static int multiply(int number1, int number2, int number3) {
        return number1 * number2 * number3;
    }

    static float multiply(float number1, int number2, int number3) {
        return number1 * number2 * number3;
    }
}