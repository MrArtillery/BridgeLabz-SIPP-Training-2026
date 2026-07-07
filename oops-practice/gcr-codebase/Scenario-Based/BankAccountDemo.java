class BankAccount {

    private String accountNumber;
    private String holder;
    private double balance;

    // static field to track total accounts
    static int totalAccounts = 0;

    // constructor
    BankAccount(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    // deposit method
    void deposit(double amount) {
        balance += amount;
        System.out.println(holder + " deposited ₹" + amount);
    }

    // withdraw method with overdraft check
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println(holder + " withdrawal failed! Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println(holder + " withdrew ₹" + amount);
        }
    }

    // get account statement
    void getStatement() {
        System.out.println("\nAccount Number : " + accountNumber);
        System.out.println("Holder Name    : " + holder);
        System.out.println("Balance        : ₹" + balance);
    }
}

public class BankAccountDemo {

    public static void main(String[] args) {

        // create 3 accounts
        BankAccount acc1 = new BankAccount("A101", "Ankur", 10000);
        BankAccount acc2 = new BankAccount("A102", "Rahul", 15000);
        BankAccount acc3 = new BankAccount("A103", "Priya", 20000);

        // 5 transactions for acc1
        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.deposit(3000);
        acc1.withdraw(5000);
        acc1.withdraw(12000);

        // 5 transactions for acc2
        acc2.deposit(1000);
        acc2.withdraw(2000);
        acc2.deposit(4000);
        acc2.withdraw(3000);
        acc2.withdraw(20000);

        // 5 transactions for acc3
        acc3.deposit(5000);
        acc3.withdraw(2500);
        acc3.deposit(1500);
        acc3.withdraw(1000);
        acc3.withdraw(30000);

        // statements
        acc1.getStatement();
        acc2.getStatement();
        acc3.getStatement();

        // total accounts created
        System.out.println("\nTotal Accounts Created = " + BankAccount.totalAccounts);
    }
}