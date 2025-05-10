# Bank Account Management System

This is a console-based Java application designed to simulate the core functionality of a simple banking system. It enables users to securely manage bank accounts, perform transactions, and view account history. The project emphasises modular design, secure access, and object-oriented principles.

---

## Features

* **Account Creation**

  * Unique account number and password setup
  * Name validation (letters and spaces only)
  * Minimum initial deposit requirement (₹500)

* **Secure Authentication**

  * Password-protected access for sensitive actions (withdrawals, balance checks, details, and history)

* **Transactions**

  * Deposit and withdraw funds with appropriate validation
  * Real-time balance updates

* **Account Overview**

  * Display current balance and account details
  * View full transaction history with timestamps

* **Input Validation**

  * Handles invalid input gracefully
  * Prevents duplicate account numbers and unauthorised access

---

## Technologies Used

* **Language**: Java
* **Development**: Console-based (command-line interface)
* **Concepts**: Object-Oriented Programming (OOP), Exception Handling, Input Validation
* **Data Structures**: `ArrayList` for dynamic account and transaction storage

---

## File Structure

```
BankAccountManagementSystem/
├── Main.java           // Application entry point and menu navigation
├── Bank.java           // Core banking logic and operations
├── BankAccount.java    // Account data structure and methods
└── README.md           // Project documentation
```

---

## How to Run

1. **Download or clone** the repository.
2. **Compile the Java files**:

   ```bash
   javac Main.java Bank.java BankAccount.java
   ```
4. **Run the application**:

   ```bash
   java Main
   ```

---

## Sample User Flow

```text
--- Bank Account Management System ---
1. Create a New Bank Account
2. Deposit Money
3. Withdraw Money
4. View Account Balance
5. Display Account Details
6. View Transaction History
7. Exit
Enter a choice: 1

Enter your name: TestUser
Enter a Unique Account Number: 202301
Set a password: pass123
Enter Initial Deposit (Min ₹500): 2000
✅ Account created successfully.
```

---

## Security Notes

* All sensitive actions (withdrawal, balance check, detail view, transaction history) are password-protected.
* Passwords are stored in plaintext for simplicity and learning purposes, but passwords are securely hashed and encrypted in real-world systems.
---

## Potential Enhancements

* Password encryption and secure credential management
* Integration with database (e.g., MySQL or SQLite)
* Export transaction logs to files (CSV or PDF)
* GUI integration with JavaFX or web-based interface
* Interest and fee logic
