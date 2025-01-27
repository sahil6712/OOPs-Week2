package hierarchicalinheritance.bankaccounthandling;

public class Main {
    public static void main(String[] args) {
        // creating the three different account

        SavingsAccount savingsAccount1 = new SavingsAccount(12, 1000, 3);
        CheckingAccount checkingAccount1 = new CheckingAccount(13, 2000, 99999);
        FixedDepositAccount fixedDepositAccount1 = new FixedDepositAccount(14, 3000, 1500);

        // printing the account information
        savingsAccount1.display();
        checkingAccount1.display();
        fixedDepositAccount1.display();

    }
}
