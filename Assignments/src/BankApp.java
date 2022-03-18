
public class BankApp {
	private int accountNumber;
	private double balance;
	private String type;
	
	public BankApp(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BankApp(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public BankApp(int accountNumber, double balance, String type) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.type = type;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "BankApp [accountNumber=" + accountNumber + ", balance=" + balance + ", type=" + type + "]";
	}
	
	
}
