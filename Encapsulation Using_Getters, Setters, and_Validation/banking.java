
class BankAccount {

    private String accountHolder;
    private long accountNumber;
    private double balance;

    BankAccount(String accountHolder, long accountNumber,
                double balance) {

        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        }
        else if (amount > balance) {
            System.out.println("Insufficient balance!");
        }
        else {
            balance -= amount;
            System.out.println("Withdrawal successful: " + amount);
        }
    }

    public void displayDetails() {
        System.out.println("\nAccount Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

public class banking {
    public static void main(String[] args) {

        BankAccount account =
                new BankAccount("Rahul", 123456789, 5000);

        account.displayDetails();

        System.out.println("\n--- Valid Transactions ---");

        account.deposit(2000);

        account.withdraw(1000);

        System.out.println("\n--- Invalid Transactions ---");

        account.deposit(-500);

        account.withdraw(0);

        account.withdraw(-200);

        account.withdraw(10000);

        System.out.println("\n--- Final Account Details ---");
        account.displayDetails();
    }
}
// Private fields prevent direct access to sensitive account information, while public methods provide controlled access.
// The deposit and withdrawal methods validate transactions before modifying the balance. Therefore, invalid operations cannot change the object's balance.
// This makes the program more secure, reliable, and easier to maintain.