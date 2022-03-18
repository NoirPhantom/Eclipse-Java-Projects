
/*
	Author: Jonathan Ocampo
	Date: 02/18/22
	Description: Creating an Object Oriented Programming
*/

public class bankAccount {

	// Attributes - static/no-static, constant(final)
	String number;
	String name;
	String type;
	double balance;

	static String bankName = "Chase";

	// Constructors
	// Bank Account Number & Type
	bankAccount(String accNumber, String type) {
		this.number = accNumber;
		this.type = type;
	}

	bankAccount(String accNumber) {
		this.number = accNumber;
	}

	bankAccount(String accNumber, String type, double bal) {
		this.number = accNumber;
		this.type = type;
		this.balance = bal;
	}

	// Instance Methods
	double getBalance() {

		return this.balance;
	}

	void deposit(double amount) {

		this.balance += amount; // this.balance = this.balance + amount;
	}

	void withdraw(double amount) {

		this.balance -= amount; // this.balance = this.balance - amount;
	}

	static String getTradeName() {

		return "JPM";
	}

	public static void main(String[] args) {

		// ClassName ObjectName = new ClassName();
		// Object Called - Jonathan
		bankAccount jonathan = new bankAccount("056-528", "Checking");
		jonathan.name = "Jonathan";
		System.out.println(jonathan.name);
		// jonathan.number = "056-528";
		System.out.println("Account number: " + jonathan.number);
		// jonathan.type = "Checking";
		System.out.println("Account type: " + jonathan.type);
		jonathan.balance = 800000;
		System.out.println("Account balance: " + jonathan.balance);
		// System.out.println(getTradeName());
		jonathan.withdraw(6500);
		System.out.println("Account balance after withdraw: " + jonathan.balance);
		jonathan.deposit(80000);
		System.out.println("Account balance after deposit: " + jonathan.balance);

		System.out.println();

		// Object Called - Jessica
		bankAccount jessica = new bankAccount("041-564");
		jessica.name = "Jessica";
		System.out.println(jessica.name);
		// jessica.number = "041-564";
		System.out.println("Account number: " + jessica.number);
		jessica.balance = 100000;
		jessica.type = "Savings";
		System.out.println("Account type: " + jessica.type);
		System.out.println("Account balance: " + jessica.balance);
		jessica.deposit(20000);
		System.out.println("Account balance after deposit: " + jessica.balance);

		// Static attributes are accessed using class name
		System.out.println();
		// System.out.println(bankAccount.bankName);
		// System.out.println();
		System.out.println("Bank Name: " + bankAccount.bankName + " for " + jonathan.name);
		System.out.println("Bank Name: " + bankAccount.bankName + " for " + jessica.name);
		System.out.println();
		System.out.println("Changing the value of bank name to JP Morgan");
		bankAccount.bankName = "JP Morgan";
		System.out.println();
		System.out.println("Bank Name: " + bankAccount.bankName + " for " + jonathan.name);
		System.out.println("Bank Name: " + bankAccount.bankName + " for " + jessica.name);
	}
}
