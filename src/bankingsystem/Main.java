package bankingsystem;

public class Main {
    public static void main(String[] args) {
        // Create a list of bank accounts (both loan eligible and non-loan eligible)
        BankAccount[] accounts = new BankAccount[4];
        accounts[0] = new SavingsAccount("SAV001", "Aarav", 150000);
        accounts[1] = new CurrentAccount("CUR101", "Priya", 80000);
        accounts[2] = new LoanEligibleSavingsAccount("SAV505", "Ishaan", 200000);
        accounts[3] = new LoanEligibleCurrentAccount("CUR999", "Ananya", 120000);

        // Polymorphism
        for (BankAccount account : accounts) {
            account.deposit(5000);
            account.withdraw(2000);

            // Calculate and display interest dynamically
            double interest = account.calculateInterest();
            System.out.println("Interest for " + account.getClass().getSimpleName() + ": " + interest);

            // If account is Loanable, apply for a loan and calculate loan eligibility
            if (account instanceof Loanable loanableAccount) {
                loanableAccount.applyForLoan(30000);
                double eligibility = loanableAccount.calculateLoanEligibility();
                System.out.println("Loan Eligibility: " + eligibility);
            }

            System.out.println();
        }
    }
}
