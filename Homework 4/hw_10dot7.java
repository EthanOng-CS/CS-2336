import java.util.*;

public class hw_10dot7 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Create an array of 10 accounts
		Account[] accounts = new Account[10];

		// Initialize the balance of the account
		initialBalance(accounts);
		
		do {
			// Prompt user to enter an id
			System.out.print("Enter an id: ");
			int id = input.nextInt();

			if (isValidID(id, accounts)) {
				int choice;
				do {	
					choice = displayMainMenu(input);
					if (isTransaction(choice)) {
							executeTransaction(choice, accounts, id, input);
					}
				} while (choice != 4); 
			}
			// When exit system prompts for an Id again
		} while (true); 
	}

	// Initialize accounts balance of 100 
	public static void initialBalance(Account[] a) {
		int initialBalance = 100;
		for (int i = 0; i < a.length; i++) {
			a[i] = new Account(i, initialBalance);
		}
	}

	// Return true if choice is a transaction 
	public static boolean isTransaction(int choice) {
		return choice > 0 && choice < 4;
	}

	// Return true if ID is valid 
	public static boolean isValidID(int id, Account[] a) {
		for (int i = 0; i < a.length; i++) {
			if (id == a[i].getId())
				return true;
		}
		return false;
	}

	// Display main menu 
	public static int displayMainMenu(Scanner input) {
		System.out.print(
			"\nMain Menu\n1: Check Balance\n2: Withdraw" +
			"\n3: Deposit\n4: Exit\nEnter a Choice: ");
		return input.nextInt();
	}

	// Execute a Transaction 
	public static void executeTransaction(
		int c, Account[] a, int id, Scanner input) {
		switch (c) {
			case 1: // Viewing the current balance
					  System.out.println("The balance is " + a[id].getBalance());
					  break;
			case 2: // Withdraw money
					  System.out.print("Enter an amount to withdraw: "); 
					  a[id].withdraw(input.nextDouble());
					  break;
			case 3: // Deposit money
					  System.out.print("Enter an amount to deposit: "); 
					  a[id].deposit(input.nextDouble());
		}
	}
}

class Account {
	
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

	// Creates an account with the specified id and initial balance 
	Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
		dateCreated = new Date();
	}

	// Mutator methods
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

	// Accessor methods
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
		balance -= amount;
	}

	// Increase balance  
	public void deposit(double amount) {
		balance += amount;
	}
}