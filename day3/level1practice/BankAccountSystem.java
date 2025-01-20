class BankAccount {

    // BankAccount Attributes
    private static String bankName = "State Bank of India";
    private String accountHolderName;
    private final int accountNumber;

    static int totalAccounts = 0;

    // Constructor for initialize values
    BankAccount(String accountHolderName, int accountNumber) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        totalAccounts++; // For getting counts of totalAccount
    }

    // Method to return number of accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Method to display Details
    public void display() {
        System.out.println("\nBank Name: " + bankName);
        System.out.println("Name of Account Holder: " + accountHolderName);
        System.out.println("Account Number :" + accountNumber);

    }
}

public class BankAccountSystem {
    public static void main(String args[]) {
        // Creating object of BankAccount class
        BankAccount account = new BankAccount("SAhil Khaimariya", 212345);
        if (account instanceof BankAccount) // Check account is object of BankAccount
            account.display();

        BankAccount account2 = new BankAccount("Akshat Tiwari", 321456);
        if (account2 instanceof BankAccount) // Check account is object of BankAccount
            account2.display();

        BankAccount account3 = new BankAccount("Khiladi", 786678);
        if (account3 instanceof BankAccount) // Check account is object of BankAccount
            account3.display();

        // To output the total number of accounts
        System.out.print("\nTotal number of Accounts are: " + BankAccount.getTotalAccounts());

    }
}
