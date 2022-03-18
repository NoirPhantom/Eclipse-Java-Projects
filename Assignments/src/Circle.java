import java.util.Scanner;

/*
 Author: Jonathan Ocampo
 Date: 02/17/2022
 Description: Creating multiple methods to do the area, circumference, and diameter of a circle using the radius.
*/

/* - INSTRUCTIONS - 
 * Modify the Circle class that you created yesterday to make it modular

Main Method - Ask the user to enter the radius of a circle
Tell the user that you'll be computing the area, circumference and diameter of a circle

1. Create a method called area that takes radius as parameter and returns area
Formula for computing area is 3.142 * r * r
2. Create a method called circumference that takes the radius and returns circumference
Formula: 2 * 3.142 * r
3. Create a method called diameter that takes the radius and returns diameter
Formula: 2 * r

Call the appropriate methods and create the required variables to print the following messages on screen:
The diameter of the circle with radius ____ is ____
The area of the circle with radius ____ is ____
The circumference of the circle with radius ____ is ____
*/
public class Circle {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter number for Radius: ");
		double radius = input.nextInt();
		System.out.println("I'll be computing the area, circumference, and diameter of Circle according to the Radius: " + radius);
		
		double area = area(radius);
		System.out.println("The area of the circle with radius " + radius + " is " + area);
		
		double circumference = circumference(radius);
		System.out.println("The circumference of the circle with radius " + radius + " is " + circumference);
		
		double diameter = diameter(radius);
		System.out.println("The diameter of the circle with radius " + radius + " is " + diameter);
		input.close();
	}

	static double area(double num) {
		double a2 = 3.142 * num * num;
		return a2;
	}

	static double circumference(double num) {
		double cir = 3.142 * num;
		return cir;
	}

	static double diameter(double num) {
		double dia = 2 * num;
		return dia;
	}
}
