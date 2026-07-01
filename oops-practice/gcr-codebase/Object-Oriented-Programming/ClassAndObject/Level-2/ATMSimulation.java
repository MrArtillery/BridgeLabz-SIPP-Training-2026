class BankAccount {

    String accountHolder;
    String accountNumber;
    double balance;

    // Constructor
    public BankAccount(String accountHolder,
                       String accountNumber,
                       double balance) {

        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {

        balance += amount;
        System.out.println("₹" + amount + " deposited successfully.");
    }

    // Method to withdraw money
    public void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Method to display current balance
    public void displayBalance() {

        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class ATMSimulation {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(
                "Ankur",
                "SB101",
                10000);

        account.displayBalance();

        System.out.println();

        account.deposit(5000);

        account.withdraw(3000);

        account.withdraw(15000);

        System.out.println();

        account.displayBalance();
    }
}
