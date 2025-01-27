package hierarchicalinheritance.bankaccounthandling;

class SavingsAccount extends BankAccount {
    // attribute
    int interestRate;
    // Implement a method displayAccountType() in each subclass to specify the account type.
    void displayAccountType() {
        System.out.println("It is a savings account");
    }
    public int getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    // constructors
    public SavingsAccount(int interestRate) {
        this.interestRate = interestRate;
    }
    public SavingsAccount(int accountNumber, int balance, int interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // displaying the interest rate
    @Override
    void display() {
        super.display();
        System.out.println("Interest rate is : "+ interestRate);
    }
}