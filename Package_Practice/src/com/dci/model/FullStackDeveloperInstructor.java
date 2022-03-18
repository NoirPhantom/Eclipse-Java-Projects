package com.dci.model;

public class FullStackDeveloperInstructor extends Instructor {

	public FullStackDeveloperInstructor(String name, int yearsOfExperience, double hypotheticalSalary,
			int hypotheticalTax, String email, int certificationEarned, String[] coursesOffered) {

		super(name, yearsOfExperience, hypotheticalSalary, hypotheticalTax, email, certificationEarned, coursesOffered);
	}

	@Override
	String duties() {

		return "Share your knowledge of technology with a class of adult learners "
				+ "by leading technical instruction via lectures, activity-based learning workshops, "
				+ "code reviews, and projects";
	}

}
