package com.dci.model;

public class CyberSecurityInstructor extends Instructor {

	public CyberSecurityInstructor(String name, int yearsOfExperience, double hypotheticalSalary, int hypotheticalTax,
			String email, int certificationEarned, String[] coursesOffered) {
		super(name, yearsOfExperience, hypotheticalSalary, hypotheticalTax, email, certificationEarned, coursesOffered);
	}

	@Override
	String duties() {
		return "Duties and responsibilities include, "
				+ "teaching courses in the following areas: PC Hardware, Operating Systems, "
				+ "Principles of Information Security, Server Administration, Network Security,"
				+ " Computer Forensics, and Penetration Testing";
	}

}
