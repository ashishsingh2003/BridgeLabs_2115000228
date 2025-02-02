class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    public void displayInfo() {
        accountNumber = "123456789";
        accountHolder = "Ashish Singh";
        setBalance(1000.50);

        System.out.println("Account Number " + accountNumber);
        System.out.println("Account Holder " + accountHolder);
        System.out.println("Balance " + getBalance());
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.displayInfo();
    }
}

