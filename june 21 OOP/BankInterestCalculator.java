// Base class: Account
class Account {
    String accountHolder;
    double balance;

    Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Base method to calculate interest
    public double calculateInterest() {
        // Default interest rate (can be overridden)
        double interestRate = 0.02; // 2% annual
        return balance * interestRate;
    }
}

// Derived class: SavingsAccount
class SavingsAccount extends Account {

    SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public double calculateInterest() {
        double interestRate = 0.04; // 4% annual
        return balance * interestRate;
    }
}

// Derived class: FixedDepositAccount
class FixedDepositAccount extends Account {
    int termInYears;

    FixedDepositAccount(String accountHolder, double balance, int termInYears) {
        super(accountHolder, balance);
        this.termInYears = termInYears;
    }

    @Override
    public double calculateInterest() {
        double interestRate = 0.06; // 6% annual
        return balance * interestRate * termInYears;
    }
}

// Main class to demonstrate method overriding
public class BankInterestCalculator {
    public static void main(String[] args) {
        Account acc = new Account("Regular User", 10000);
        SavingsAccount savings = new SavingsAccount("Alice", 15000);
        FixedDepositAccount fixed = new FixedDepositAccount("Bob", 20000, 3);

        System.out.println(acc.accountHolder + " Interest: $" + acc.calculateInterest());
        System.out.println(savings.accountHolder + " (Savings) Interest: $" + savings.calculateInterest());
        System.out.println(fixed.accountHolder + " (Fixed Deposit) Interest: $" + fixed.calculateInterest());
    }
}