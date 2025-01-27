package hierarchicalinheritance.bankaccounthandling;

class BankAccount {
    // attribute
    int accountNumber = -1;
    int balance = 0;

    // constructors
    public BankAccount(){};

    public BankAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    };

    // display
    void display() {
        System.out.println("Account number is : "+ accountNumber + " and account balance is : "+ balance);
    }

}
