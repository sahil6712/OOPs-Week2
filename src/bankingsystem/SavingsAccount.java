package bankingsystem;

public class SavingsAccount extends BankAccount {

    // 5% interest rate for Savings Account
    private static final double INTEREST_RATE = 0.05;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }
}

