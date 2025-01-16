
class BankAccount {

    // Class Attributes
    String accountHolder = "Sahil Khaimariya";
    int accountNumber = 19221132;
    int balance = 999999776;

    // Method for depositing Money
    public void depositMoney(int depositedAmount) {
        // Increase the current balance
        balance += depositedAmount; // update the balance;
        System.out.println("Amount deposited current balance is: " + balance); // Operation completed message
    }

    // Method to withdraw money
    public void withdrawMoney(int withdrawAmount) {
        // Check if current balance is greater than withdrawamount
        if (balance < withdrawAmount) {
            System.out.println("Insufficient Funds: "); // Operation not completed message
        } else {
            balance -= withdrawAmount; // update the balance after withdrawl
            System.out.println("Withdrawl Completed current balance is: " + balance); // Operation completed message
        }
    }

    // Method to get the
    public void getBalance() {
        System.out.println("Current balance is: " + balance);
    }
}

public class ATM {
    public static void main(String args[]) {

        // Creating the object of the class
        BankAccount bankAccount = new BankAccount();

        // MEthod to deposit
        bankAccount.depositMoney(1000);

        // Method to withdraw money
        bankAccount.withdrawMoney(100);

        // Method to show balance
        bankAccount.getBalance();

    }
}
