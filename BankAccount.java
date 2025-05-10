import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String name;
    private String accountNumber;
    private String password;
    private double balance;
    private List<String> transactionHistory;

    public BankAccount(String name, String accountNumber, String password, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.password = password;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account opened with ₹" + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add("Deposited ₹" + amount);
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrew ₹" + amount);
            return true;
        } else {
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }

    @Override
    public String toString() {
        return "BankAccount [name=" + name + ", accountNumber=" + accountNumber + ", balance=₹" + balance + "]";
    }
}
