package hierarchicalinheritance.bankaccounthandling;

class CheckingAccount extends BankAccount {
    // attribute
    int withdrawalLimit;
    // Implement a method displayAccountType() in each subclass to specify the account type.
    void displayAccountType() {
        System.out.println("It is a Checking account");
    }

    public int getWithdrawalLimit() {
        return withdrawalLimit;
    }
    public void setWithdrawalLimit(int withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    // constructors
    public CheckingAccount(int withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    public CheckingAccount(int accountNumber, int balance, int withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Withdraw limit is : "+ withdrawalLimit);
    }
}
