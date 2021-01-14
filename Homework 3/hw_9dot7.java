import java.util.Date;

public class hw_9dot7 {

	public static void main(String[] args) {
		// Create an Account object with account ID of 1122, and a balance of $20000
		Account account = new Account(1122, 20000);

		// Set the Annual Interest to 4.5%
		account.setAnnualInterestRate(4.5);

		// Withdraw $2,500
		account.withdraw(2500);

		// Deposit $3,000
		account.deposit(3000);

		// Outputs the Account ID, Date created, Balance, and Monthly interest
		System.out.println("\n\t     Account Statement");
		System.out.println("==========================================");
		System.out.println("Account ID: " + account.getId());
		System.out.println("Date Created: " + account.getDateCreated());
		System.out.printf("Balance: $%.2f\n", account.getBalance());
		System.out.printf("Monthly Interest: $%.2f\n", 
			account.getMonthlyInterest());
	}
}

class Account {
	// Data fields
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;

	// Constructors
	// Creates a default account 
	Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date(); 
	}

	// Create an Account with the specified ID and Balance
	Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
		dateCreated = new Date();
	}

	// Mutator 
	// Set id 
	public void setId(int newId) {
		id = newId;
	}

	// Set balance 
	public void setBalance(double newBalance) {
		balance = newBalance;
	}

	// Set annualInterestRate 
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}

	// Accessor 
	// Return id 
	public int getId() {
		return id;
	}

	// Return balance 
	public double getBalance() {
		return balance;
	}

	// Return annualInterestRate 
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	// Return dateCreated 
	public String getDateCreated() {
		return dateCreated.toString();
	}

	// Return monthly interest rate 
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	// Methods
	// Return monthly interest 
	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}
	
	// Decrease balance  
	public void withdraw(double amount) {
		balance = balance - amount;
	}

	// Increase balance  
	public void deposit(double amount) {
		balance = balance + amount;
	}
}