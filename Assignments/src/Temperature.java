/*
1. Create a float variable called temperatureInF. Initialize it with a value of your choice. (Remember, a float needs to be initialized with a f in the end)
2. Create conditional statements to check if temperatureInF is greater than or equal to 100.4 , if it is, print ("You have a fever")
3. If that condition is not met, check if temperatureInF is greater than 99.2, if it is , print ("You have a mild fever"
4. If those 2 conditions are not met, print ("You are fine")
*/

public class Temperature {
	public static void main(String args[]) {
		float tempF;
		float tempC;
		tempF = 99.8f;
		tempC = ((tempF-32)*5/9);
		
		System.out.println("Temperature in Fahrenheit is: " + tempF);
		System.out.println("Temperature in Celsius is: " + tempC);
		
		// Fahrenheit
		if (tempF >= 100.4) {
		// If first statement returns false continue to next if statement, If not return print
			System.out.println("You have a fever.");
		}
		else if (tempF >= 99.2) {
		// If second statement returns false continue to last statement, If not return print
			System.out.println("You have a mild fever.");
		}
		else {
		// Returns final statement
			System.out.println("You are fine.");
		}
		
		// Celsius 
		if (tempC >= 38) {
			System.out.println("You have a fever.");
		}
		else if (tempC >= 37) {
			System.out.println("You have a mild fever.");
		}
		else {
			System.out.println("You are fine.");
		}
	}
	
}
