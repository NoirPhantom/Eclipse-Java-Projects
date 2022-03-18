package com.dci.model;

public abstract class Instructor {

	protected String name;
	protected int yearsOfExperience;
	protected double hypotheticalSalary;
	protected double hypotheticalTax;
	protected String email;
	int certificationEarned;
	public String[] coursesOffered;
	static String trainingInstitution = "DCI Resources LLC";

	public Instructor(String name, int yearsOfExperience, double hypotheticalSalary, int hypotheticalTax, String email,
			int certificationEarned, String[] coursesOffered) {
		super();
		this.name = name;
		this.yearsOfExperience = yearsOfExperience;
		this.hypotheticalSalary = hypotheticalSalary;
		this.hypotheticalTax = hypotheticalTax;
		this.email = email;
		this.certificationEarned = certificationEarned;
		this.coursesOffered = coursesOffered;
	}

	// Getters and setters for some fields
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCertificationEarned() {
		return certificationEarned;
	}

	public void setCertificationEarned(int certificationEarned) {
		this.certificationEarned = certificationEarned;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/*
	 * Adds 1 to the certificationsEarned by the Instructor
	 * 
	 * @params : none
	 * 
	 * @returns : void
	 */
	public void incrementCertificationsEarned() {
		this.certificationEarned++;
	}

	/*
	 * Describes our training institution DCI Resources
	 * 
	 * @params : none
	 * 
	 * @returns : String that contains the description
	 */
	public String describeDCI() {
		return "DCI Resources (The Learning Academy) is an "
				+ "IT Training & Education and Public Testing Center where individuals will learn new skills,"
				+ " upgrade to new technologies and earn certifications to enhance their careers.";
	}

	/*
	 * Performs a random math equation to learn about operator precedence
	 * 
	 * @params : none
	 * 
	 * @returns : result of the equation specified below
	 */
	int randomMathEquation() {
		return 8 + 4 / 4;
	}

	/*
	 * Returns a description of instructor roles
	 * 
	 * @params : none
	 * 
	 * @returns : A string that contains duties
	 */
	abstract String duties();

}
