import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
    ArrayList<BankAccount> accounts = new ArrayList<>();

    public void createAccount(Scanner sc) {
        String name;
        while (true) {
            System.out.print("Enter your name: ");
            name = sc.nextLine();
            if (name.matches("^[a-zA-Z\\s]+$")) break;
            else System.out.println("❌ Invalid name! Use letters and spaces only.");
        }

        String accountNumber;
        while (true) {
            System.out.print("Enter a Unique Account Number: ");
            accountNumber = sc.nextLine();
            if (!accountNumber.matches("\\d+")) {
                System.out.println("❌ Numbers only.");
                continue;
            }
            boolean duplicate = false;
            for (BankAccount acc : accounts) {
                if (acc.getAccountNumber().equals(accountNumber)) {
                    System.out.println("⚠️ Account number already exists.");
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) break;
        }

        System.out.print("Set a password: ");
        String password = sc.nextLine();

        double balance = 0;
        while (true) {
            System.out.print("Enter Initial Deposit (Min ₹500): ");
            String input = sc.nextLine();
            if (input.matches("\\d+(\\.\\d+)?")) {
                balance = Double.parseDouble(input);
                if (balance >= 500) {
                    accounts.add(new BankAccount(name, accountNumber, password, balance));
                    System.out.println("✅ Account created successfully!");
                    break;
                } else {
                    System.out.println("❌ Minimum ₹500 required.");
                }
            } else {
                System.out.println("❌ Invalid input.");
            }
        }
    }

    public BankAccount findAccount(String accNo) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber().equals(accNo)) return acc;
        }
        return null;
    }

    private boolean verifyPassword(Scanner sc, BankAccount acc) {
        System.out.print("Enter password: ");
        String input = sc.nextLine();
        return input.equals(acc.getPassword());
    }

    public void deposit(Scanner sc) {
        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();
        BankAccount acc = findAccount(accNo);
        if (acc != null) {
            System.out.print("Enter deposit amount: ");
            double amount = sc.nextDouble();
            sc.nextLine();
            acc.deposit(amount);
            System.out.println("✅ Amount deposited successfully!");
        } else {
            System.out.println("❌ Account not found.");
        }
    }

    public void withdraw(Scanner sc) {
        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();
        BankAccount acc = findAccount(accNo);
        if (acc != null && verifyPassword(sc, acc)) {
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();
            sc.nextLine();
            if (acc.withdraw(amount)) {
                System.out.println("✅ Withdrawal successful!");
            } else {
                System.out.println("❌ Insufficient balance.");
            }
        } else {
            System.out.println("❌ Invalid credentials or account not found.");
        }
    }

    public void checkBalance(Scanner sc) {
        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();
        BankAccount acc = findAccount(accNo);
        if (acc != null && verifyPassword(sc, acc)) {
            System.out.println("💰 Current Balance: ₹" + acc.getBalance());
        } else {
            System.out.println("❌ Invalid credentials or account not found.");
        }
    }

    public void showDetails(Scanner sc) {
        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();
        BankAccount acc = findAccount(accNo);
        if (acc != null && verifyPassword(sc, acc)) {
            System.out.println("📋 Account Details:\n" + acc);
        } else {
            System.out.println("❌ Invalid credentials or account not found.");
        }
    }

    public void viewTransactionHistory(Scanner sc) {
        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();
        BankAccount acc = findAccount(accNo);
        if (acc != null && verifyPassword(sc, acc)) {
            System.out.println("📜 Transaction History:");
            for (String txn : acc.getTransactionHistory()) {
                System.out.println("- " + txn);
            }
        } else {
            System.out.println("❌ Invalid credentials or account not found.");
        }
    }
}
