// Q.1
// ----------
// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.


// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
// Example 2:

// Input: nums = [0]
// Output: [0]

// =================================

// Q.2 : Develop a C program that simulates a simple bank account system. Users can create accounts, deposit money, withdraw money, and check their balances. Implement separate functions for these operations. Take the initial balance as Rs.2000.
// --------

// Condition For deposit :

// * If the user want to deposit 0 or negative amount then print "Invalid amount to deposit"


// Condition For withdraw :

// * If the user want to withdraw 0 or negative amount then print "Invalid amount to withdrawal"

// * If the user given amount is greater than the balance then print "Insufficient Funds"


// SAMPLE INPUT AND SAMPLE OUTPUT :
// --------------------------------

// --- Bank Account Menu ---
// 1. Create Account
// 2. Deposit Money
// 3. Withdraw Money
// 4. Check Balance
// 5. Exit
// Enter your choice: 1

// Account created successfully with initial balance of Rs. 2000.
// -------------------------------------------------------

// --- Bank Account Menu ---
// 1. Create Account
// 2. Deposit Money
// 3. Withdraw Money
// 4. Check Balance
// 5. Exit
// Enter your choice: 2

// Enter amount to deposit: 1500

// Rs. 1500 deposited successfully.
// Your current balance is: Rs. 3500
// -------------------------------------------------------

// --- Bank Account Menu ---
// 1. Create Account
// 2. Deposit Money
// 3. Withdraw Money
// 4. Check Balance
// 5. Exit
// Enter your choice: 2

// Enter amount to deposit: -500

// Invalid amount to deposit
// -------------------------------------------------------

// --- Bank Account Menu ---
// 1. Create Account
// 2. Deposit Money
// 3. Withdraw Money
// 4. Check Balance
// 5. Exit
// Enter your choice: 3

// Enter amount to withdraw: 1000

// Rs. 1000 withdrawn successfully.
// Your current balance is: Rs. 2500
// -------------------------------------------------------

// --- Bank Account Menu ---
// 1. Create Account
// 2. Deposit Money
// 3. Withdraw Money
// 4. Check Balance
// 5. Exit
// Enter your choice: 3

// Enter amount to withdraw: -300

// Invalid amount to withdraw
// -------------------------------------------------------

// --- Bank Account Menu ---
// 1. Create Account
// 2. Deposit Money
// 3. Withdraw Money
// 4. Check Balance
// 5. Exit
// Enter your choice: 3

// Enter amount to withdraw: 3000

// Insufficient Funds
// -------------------------------------------------------

// --- Bank Account Menu ---
// 1. Create Account
// 2. Deposit Money
// 3. Withdraw Money
// 4. Check Balance
// 5. Exit
// Enter your choice: 4

// Your current balance is: Rs. 2500
// -------------------------------------------------------

// --- Bank Account Menu ---
// 1. Create Account
// 2. Deposit Money
// 3. Withdraw Money
// 4. Check Balance
// 5. Exit
// Enter your choice: 5

// Thank you for using our banking system.

// C Program:
#include<stdio.h>
int isbank(int ac){
    printf("Account created successfully with initial balance 2000.");
}
int isdep(int dep){
    printf("Enter amount to deposit: ");
    scanf("%d",&dep);
    dep= dep+ 'ac';
    printf("Rs. %d Deposited Successfully.");
    printf("Your current balance is : Rs. %d");

}
int main()
{
    int choice,c;
    printf("Bank Account Menu");
    printf("Create Account");
    printf("Deposit Money");
    printf("Withdraw Money");
    printf("Check Balance");
    printf("exit");
    printf("Enter the Choice : ");
    scanf("%d",&choice);
    isbank(c);
}