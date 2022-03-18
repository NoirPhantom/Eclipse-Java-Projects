
/*
	Jonathan Ocampo
	02/25/22
	Creating the fitness class as the main to call the person class and user everything the person class allowed
*/
public class Fitness {

	public static void main(String[] args) {
		// Creating objects under the class Person and allowed them access to all
		// attributes and functions within the class
		// Person 1 details being sent to constructors in Person class
		Person person1 = new Person("Tom", 'H', 152.5, 5, 6);
		// Person 2 details being sent to constructors in Person class
		Person person2 = new Person("Leslie", "Knope", 'K', 32, 122.9, 4, 11);
		// Person 3 details being sent to constructors in Person class
		Person person3 = new Person("Ron", "Swanson", 222.2, 6, 0);
		// Person 4 details being sent to constructors in Person class
		Person person4 = new Person("April", "Ludgate", 110.5, 5, 5);

		// Printing out all details pertaining to each person and any attributes that
		// aren't initialized return as null or empty for default
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		System.out.println(person4);

		System.out.println();

		System.out.println(person2.ageIn5());

		System.out.println(person2.getAge());

		System.out.println(person1.firstNameStartsWithA());

		System.out.println(person3.hasProvidedInitials());

		System.out.println(person4.firstNameStartsWithA());

		// Static methods belong to the class and call it by using calss name
		// Don't have to create an object of that class to call it's static attributes
		// and methods
		System.out.println(Person.isOriginPlant());

		System.out.println(Person.origin);

		System.out.println(Person.origin);

		Person.origin = "PLANT";

		System.out.println(Person.origin);
		System.out.println(Person.origin);
		System.out.println(Person.origin);

		System.out.println(Person.isOriginPlant());

		/*
		 * // Printing out Person 1 first name and bmi and bmiLevel
		 * System.out.println("First name: " + person1.getFirstName() + " : " +
		 * person1.calculateBMI()); // Printing out Person 1 first name and bmi and
		 * bmiLevel System.out.println("First name: " + person2.getFirstName() + " : " +
		 * person2.calculateBMI()); // Printing out Person 1 first name and bmi and
		 * bmiLevel System.out.println("First name: " + person3.getFirstName() + " : " +
		 * person3.calculateBMI()); // Printing out Person 1 first name and bmi and
		 * bmiLevel System.out.println("First name: " + person4.getFirstName() + " : " +
		 * person4.calculateBMI());
		 */
	}

}
