package bankingsystem;

public class LoanEligibleCurrentAccount extends CurrentAccount implements Loanable {
    private double loanAmount;

    public LoanEligibleCurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void applyForLoan(double amount) {
        loanAmount = amount;
        System.out.println("Loan application for amount: " + loanAmount);
    }

    @Override
    public double calculateLoanEligibility() {
        // Eligibility based on balance (example: loan eligibility is 2x the balance)
        return getBalance() * 2;
    }
}

