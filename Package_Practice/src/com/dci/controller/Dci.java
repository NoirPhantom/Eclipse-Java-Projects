package com.dci.controller;

import com.dci.model.CyberSecurityInstructor;
import com.dci.model.FullStackDeveloperInstructor;
import com.dci.model.Instructor;

public class Dci {

	static String[] cyberCourses = { "A+", "Security+", "ITF+" };
	static String[] softwareCourses = { "Java", "Python", "Database", "HTML5" };

	
	static Instructor[] instructors = {
			new CyberSecurityInstructor("Krishna", 25, 3333.55, 12, "krishna@dci.com", 5, cyberCourses),
			new CyberSecurityInstructor("Jim", 30, 3333.55, 10, "jim@dci.com", 8, cyberCourses),
			new FullStackDeveloperInstructor("Xander", 12, 3333.55, 15, "xander@dci.com", 10, softwareCourses),
			new FullStackDeveloperInstructor("Maleeha", 4, 3333.55, 18, "maleeha@dci.com", 2, softwareCourses),
			new FullStackDeveloperInstructor("Pooja", 8, 3333.55, 18, "pooja@dci.com", 0, softwareCourses),
			new CyberSecurityInstructor("Tony", 25, 3333.55, 12, "tony@dci.com", 3, cyberCourses) };

	/*
	 * Prints the details of each instructor in instructors array
	 */
	static void printAllInstructors() {

		for (int i = 0; i <= instructors.length - 1; i += 2) {

			System.out.println(instructors[i]);
		}
	}

	/*
	 * This method checks if an instructor with name {input} is present in the array
	 * 
	 * @params : name that needs to be found
	 * 
	 * @returns : true or false based on the search result
	 */
	static boolean findInstructorByName(String input) {

		boolean found = false;

		for (int i = 0; i <= instructors.length - 1; i++) {

			if (instructors[i].getName() == input) {
				found = true;
				break;
			}
		}

		return found;
	}

	/*
	 * This method prints the courses offered by each instructor
	 * 
	 * @params : none
	 * 
	 * @returns : none
	 */
	static void coursesOfferedByEachInstructor() {

		System.out.println("------------------");

	}

	/*
	 * This method print names of instructors who have number of certifications
	 * {certificationEarned} between 1 to 5
	 */
	static void instructors1to5Certs() {

		for (int i = 0; i <= instructors.length - 1; i++) {

			if (instructors[i].getCertificationEarned() >= 0 && instructors[i].getCertificationEarned() <= 5) {

				System.out.println(instructors[i].getName());
			}
		}

	}

	public static void main(String[] args) {

		System.out.println("--------------All instructor details------------");
		printAllInstructors();
		System.out.println("--------------********------------\n");

		System.out.println("--------------Find instructor by name------------");
		System.out.println(findInstructorByName("jim"));
		System.out.println("--------------********------------\n");

		System.out.println("--------------Courses offered by each instructor------------");
		coursesOfferedByEachInstructor();
		System.out.println("--------------********------------\n");

		System.out.println("--------------Instructors with 1 to 5 certs------------");
		instructors1to5Certs();
		System.out.println("--------------********------------\n");

	}

}
