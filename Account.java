import java.util.Scanner;

public class Account {
	private String accountNumber;
	private String accountHolderName;
	private int balance;

	// Default constructor
	public Account() {
		this.accountNumber = "";
		this.accountHolderName = "";
		this.balance = 0;
	}

	// Parameterized constructor
	public Account(String accountNumber, String accountHolderName, int balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	// Method to deposit money into the account
	public void deposit(int amount) {
		this.balance += amount;
	}

	// Method to withdraw money from the account
	public void withdraw(int amount) {
		if (this.balance >= amount) {
			this.balance -= amount;
		} else {
			System.out.println("Insufficient balance!");
		}
	}

	// Method to display account details
	public String toString() {
		return "Account number: " + this.accountNumber + "\nAccount holder name: " + this.accountHolderName
				+ "\nBalance: " + this.balance + "\n";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Create an array of accounts
		Account[] accounts = new Account[3];

		// Accept details of accounts from the user
		for (int i = 0; i < accounts.length; i++) {
			System.out.println("Enter details for account " + (i + 1) + ":");
			System.out.print("Account number: ");
			String accountNumber = sc.nextLine();
			System.out.print("Account holder name: ");
			String accountHolderName = sc.nextLine();
			System.out.print("Initial balance: ");
			int balance = sc.nextInt();
			sc.nextLine(); // consume the newline character

			accounts[i] = new Account(accountNumber, accountHolderName, balance);
		}

		// Display the details of all accounts
		for (int i = 0; i < accounts.length; i++) {
			System.out.println(accounts[i]);
		}
	}
}
