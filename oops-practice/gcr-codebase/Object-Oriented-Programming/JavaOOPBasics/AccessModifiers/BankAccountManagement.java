class BankAccount {

    public String accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(String accountNumber,
                String accountHolder,
                double balance) {

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(String accountNumber,
                   String accountHolder,
                   double balance) {

        super(accountNumber, accountHolder, balance);
    }

    void display() {

        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : ₹" + getBalance());
    }
}

public class BankAccountManagement {

    public static void main(String[] args) {

        SavingsAccount account =
                new SavingsAccount("SB101", "Ankur", 10000);

        account.display();

        account.setBalance(15000);

        System.out.println("Updated Balance : ₹" + account.getBalance());
    }
}
