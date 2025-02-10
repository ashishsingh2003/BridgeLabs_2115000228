import java.util.*;

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public abstract double calculateInterest();
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getHolderName() {
        return holderName;
    }
    
    public double getBalance() {
        return balance;
    }
}

interface Loanable {
    boolean applyForLoan(double amount);
    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;
    
    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return balance * interestRate / 100;
    }
    
    public boolean applyForLoan(double amount) {
        return balance > amount * 0.2;
    }
    
    public double calculateLoanEligibility() {
        return balance * 5;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;
    
    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double calculateInterest() {
        return 0;
    }
    
    public boolean applyForLoan(double amount) {
        return balance + overdraftLimit > amount;
    }
    
    public double calculateLoanEligibility() {
        return balance + overdraftLimit;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("S123", "Alice", 5000, 3.5));
        accounts.add(new CurrentAccount("C456", "Bob", 2000, 1000));

        for (BankAccount account : accounts) {
            System.out.println(account.getHolderName() + " Interest: " + account.calculateInterest());
            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                System.out.println(account.getHolderName() + " Loan Eligibility: " + loanable.calculateLoanEligibility());
            }
        }
    }
}

