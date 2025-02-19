import java.util.*;

class BankingSystem {
    private Map<Integer, Double> accounts = new HashMap<>();
    private TreeMap<Double, List<Integer>> sortedAccounts = new TreeMap<>();
    private Queue<Integer> withdrawalQueue = new LinkedList<>();

    public void createAccount(int accountNumber, double initialBalance) {
        accounts.put(accountNumber, initialBalance);
        sortedAccounts.computeIfAbsent(initialBalance, k -> new ArrayList<>()).add(accountNumber);
    }

    public void deposit(int accountNumber, double amount) {
        if (!accounts.containsKey(accountNumber)) {
            System.out.println("Account not found: " + accountNumber);
            return;
        }
        double oldBalance = accounts.get(accountNumber);
        double newBalance = oldBalance + amount;
        accounts.put(accountNumber, newBalance);

        sortedAccounts.get(oldBalance).remove(Integer.valueOf(accountNumber));
        if (sortedAccounts.get(oldBalance).isEmpty()) {
            sortedAccounts.remove(oldBalance);
        }
        sortedAccounts.computeIfAbsent(newBalance, k -> new ArrayList<>()).add(accountNumber);
    }

    public void requestWithdrawal(int accountNumber) {
        if (!accounts.containsKey(accountNumber)) {
            System.out.println("Account not found: " + accountNumber);
            return;
        }
        withdrawalQueue.add(accountNumber);
        System.out.println("Withdrawal requested for account: " + accountNumber);
    }

    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            int accountNumber = withdrawalQueue.poll();
            System.out.println("Processing withdrawal for account: " + accountNumber);
        }
    }

    public void displayAccountsSortedByBalance() {
        System.out.println("Accounts sorted by balance:");
        for (Map.Entry<Double, List<Integer>> entry : sortedAccounts.entrySet()) {
            for (Integer account : entry.getValue()) {
                System.out.println("Account " + account + " -> Balance: $" + entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        bank.createAccount(1001, 500.0);
        bank.createAccount(1002, 1000.0);
        bank.createAccount(1003, 750.0);

        bank.deposit(1001, 200.0);
        bank.requestWithdrawal(1002);
        bank.requestWithdrawal(1003);

        System.out.println();
        bank.displayAccountsSortedByBalance();
        System.out.println();
        bank.processWithdrawals();
    }
}

