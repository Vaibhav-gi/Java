// BankAccountTesting
// 2) Problem: Bank Account Transaction System (Using Encapsulation)
// 📄 Problem Statement:
// Create a Java program to simulate a simple bank account system using encapsulation. The system should allow depositing and withdrawing money while keeping the balance secure and accessible only through public methods.

// ✅ Requirements:
// Create a class named BankAccount with:

// A private field double balance to store the current account balance.

// Implement the following methods:

// deposit(double amount)
// ➤ Adds the amount to the balance only if the amount is greater than 0.

// withdraw(double amount)
// ➤ Deducts the amount from the balance only if the balance is sufficient.
// ➤ If not, print "Insufficient balance!" and do not deduct.

// getBalance()
// ➤ Returns the current balance.

// In a separate class named Main2, do the following in the main() method:

// Create a BankAccount object.

// Deposit 5000 units.

// Withdraw 2000 units.

// Print the remaining balance using the getter method.

// 🧪 Expected Output:

// Remaining Balance: 3000.0

// Validation Rules:
// Deposits must be greater than 0.

// Withdrawals must be less than or equal to the current balance.

// Print "Insufficient balance!" if withdrawal exceeds balance.

// Java Program :

public class BankAccountTesting {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(5000);
        account.withdraw(2000);
        System.out.println("Remaining Balance: " + account.getBalance());
    }
}
class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    public double getBalance() {
        return balance;
    }
}
