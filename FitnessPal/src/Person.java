/*
	Jonathan Ocampo
	02/25/22
	Creating a person class with attributes, constructors, methods, instances 
*/
public class Person {

	// All attributes available to this class called Person
	private String firstName;
	private String lastName;
	private char lastNameInitial;
	private int age;
	private double weight; // weight is in pounds
	private int feet;
	private int inches;

	static String origin = "Homo Sapiens";

	// Constructor only accepting (string, string, double, int, int) parameters in
	// that order
	public Person(String firstName, String lastName, double weight, int feet, int inches) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.weight = weight;
		this.feet = feet;
		this.inches = inches;
	}

	// Constructor only accepting (String, char, double, int, int) parameters in
	// that order
	public Person(String firstName, char lastNameInitial, double weight, int feet, int inches) {
		this.firstName = firstName;
		this.lastNameInitial = lastNameInitial;
		this.weight = weight;
		this.feet = feet;
		this.inches = inches;
	}

	// Constructor only accepting (String, String , char, int, double, int, int)
	// parameters in that order
	public Person(String firstName, String lastName, char lastNameInitial, int age, double weight, int feet,
			int inches) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastNameInitial = lastNameInitial;
		this.age = age;
		this.weight = weight;
		this.feet = feet;
		this.inches = inches;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getLastNameInitial() {
		return lastNameInitial;
	}

	public void setLastNameInitial(char lastNameInitial) {
		this.lastNameInitial = lastNameInitial;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getFeet() {
		return feet;
	}

	public void setFeet(int feet) {
		this.feet = feet;
	}

	public int getInches() {
		return inches;
	}

	public void setInches(int inches) {
		this.inches = inches;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", lastNameInitial=" + lastNameInitial
				+ ", age=" + age + ", weight=" + weight + ", feet=" + feet + ", inches=" + inches + "]";
	}

	// Instance method to calculate BMI
	String calculateBMI() {
		String bmiLevel = null;
		// Calculating overall height in inches to calculate the BMI
		int heightInInches = (this.feet * 12) + this.inches;
		double bmi = (this.weight * 703) / (heightInInches * heightInInches);

		// Checking BMI if less than parameter & if true then bmiLevel is underweight
		if (bmi < 18.5) {
			bmiLevel = "Underweight";
		}
		// Checking BMI is between 2 certain parameter and if true then bmiLevel is
		// normal
		else if (bmi >= 18.5 && bmi <= 24.9) {
			bmiLevel = "Normal";
		}
		// Checking BMI IS between 2 more parameters and is true then bmiLevel is
		// overweight
		else if (bmi >= 25 && bmi <= 29.9) {
			bmiLevel = "Overweight";
		}
		// If all other previous conditions for BMI have not been met then bmiLevel is
		// obese
		else if (bmi >= 30) {
			bmiLevel = "Obese";
		}
		// Return both the BMi and bmiLevel to the main method
		return bmi + ": " + bmiLevel;
	}

	boolean firstNameStartsWithA() {
		return (this.firstName.startsWith("A") || this.firstName.startsWith("a"));
	}

	int ageIn5() {
		return this.age + 5;
	}

	boolean hasProvidedInitials() {
		return (this.lastNameInitial != '0');
	}

	static boolean isOriginPlant() {

		return origin.equalsIgnoreCase("plant");
	}

}
