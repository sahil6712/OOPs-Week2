package bankingsystem;

public class CurrentAccount extends BankAccount {
    // 3% interest rate for Current Account
    private static final double INTEREST_RATE = 0.03;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }
}

