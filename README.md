

```markdown
# Bank Account Management System

This is a console-based Java application designed to simulate the core functionality of a simple banking system. It enables users to manage bank accounts, perform secure transactions, and access account details. The project emphasizes modular design and object-oriented principles.

---

## Features

- **Account Creation**  
  - Validates user name (letters and spaces only)  
  - Ensures unique account number  
  - Minimum initial deposit requirement (₹500)

- **Secure Access**  
  - Password-protected actions (withdrawal, balance check, account details, transaction history)

- **Transaction Handling**  
  - Deposit and withdraw funds  
  - Real-time balance updates  
  - Prevents overdrafts

- **Account Information**  
  - Check account balance  
  - View full account details  
  - Review transaction history with timestamps

- **Robust Input Validation**  
  - Graceful handling of invalid inputs  
  - Prevents duplicate account numbers and incorrect data formats

---

## Technologies Used

- **Language**: Java  
- **Paradigm**: Object-Oriented Programming (OOP)  
- **Collections**: `ArrayList` for managing accounts and transactions  
- **Input Handling**: Java Scanner, exception handling (`try-catch`)

---

## File Structure

```

BankAccountManagementSystem/
├── Main.java           // Entry point; manages user interface and menu
├── Bank.java           // Core logic: creating accounts, searching, transactions
├── BankAccount.java    // Represents individual accounts and their state
└── README.md           // Documentation

````

---

## How to Run

1. Clone or download the repository.
2. Open a terminal or command prompt in the project directory.
3. Compile all Java files:
   ```bash
   javac Main.java Bank.java BankAccount.java
````

4. Run the program:

   ```bash
   java Main
   ```

---

## Sample Interaction

```
--- Bank Account Management System ---
1. Create a New Bank Account
2. Deposit Money
3. Withdraw Money
4. View Account Balance
5. Display Account Details
6. View Transaction History
7. Exit

Enter a choice: 1
Enter your name: Priya
Enter a Unique Account Number: 202301
Set a password: pass123
Enter Initial Deposit (Min ₹500): 2000
✅ Account created successfully.
```

---

## Security Notes

* Passwords are currently stored in plaintext for demonstration purposes.
* This project is for academic and educational use only.
* Real-world applications should implement secure authentication and data storage.

---

## Potential Improvements

* Encrypt passwords and sensitive data
* Save account and transaction data to a database or file
* Add interest calculation, account types, and audit logs
* Build a GUI using JavaFX or convert to a web application
