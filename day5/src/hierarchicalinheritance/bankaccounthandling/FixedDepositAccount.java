package hierarchicalinheritance.bankaccounthandling;

class FixedDepositAccount extends BankAccount {
    // attribute
    int fixedDepositAmount = 0;

    // Implement a method displayAccountType() in each subclass to specify the account type.
    void displayAccountType() {
        System.out.println("It is a Fixed deposit account");
    }

    public int getFixedDepositAmount() {
        return fixedDepositAmount;
    }

    public void setFixedDepositAmount(int fixedDepositAmount) {
        this.fixedDepositAmount = fixedDepositAmount;
    }

    // constructors
    public FixedDepositAccount(int fixedDepositAmount) {
        this.fixedDepositAmount = fixedDepositAmount;
    }

    public FixedDepositAccount(int accountNumber, int balance, int fixedDepositAmount) {
        super(accountNumber, balance);
        this.fixedDepositAmount = fixedDepositAmount;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Fixed Deposit Amount limit is : " + fixedDepositAmount);
    }
}
