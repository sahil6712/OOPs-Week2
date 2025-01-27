class BankAccount {
    // Instance Variables
    public int accountNumber; 
    protected String accountHolder;
    private double balance; 

    // Constructor
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Get balance
    public double getBalance() {
        return balance;
    }

    // Modify balance
    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    // Deposit balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }
}

// Inheritance
class SavingsAccount extends BankAccount {

    // Constructor
    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        // Calling the parent class constructor
        super(accountNumber, accountHolder, balance);
    }

    // Method to display savings account details
    public void displaySavingsAccountDetails() {
        System.out.println("Account Number: " + accountNumber); 
        System.out.println("Account Holder: " + accountHolder); 
        System.out.println("Balance: " + getBalance()); 
    }
}

public class BankAccountManagementSystem {
    public static void main(String[] args) {
        // Create an instance of SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount(12345, "Alice", 1000.0);

        // Display savings account details
        savingsAccount.displaySavingsAccountDetails();

        // Deposit an amount
        savingsAccount.deposit(500.0);

        // Display updated savings account details
        System.out.println("\nAfter deposit:");
        savingsAccount.displaySavingsAccountDetails();

        // Withdraw an amount
        savingsAccount.withdraw(300.0);

        // Display updated savings account details
        System.out.println("\nAfter withdrawal:");
        savingsAccount.displaySavingsAccountDetails();
    }
}
