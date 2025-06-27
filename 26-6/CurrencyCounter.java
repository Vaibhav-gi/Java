// Q. CurrencyCounter
// Write a program to count minimum number of notes and coins for a given amount.
// denominations : 1 rupee, 2 rupee coins and 5 rupees note, 10 rupees, 20 rupees,50 rupees, 100 rupees, 
// 200 rupees,500 rupees, 2000 rupees notes.

// input : 123 
// output : 2 notes and 2 coins.
// Sample Input
// 123
// Sample Output
// 2 notes and 2 coins

// Java Program: 

import java.util.Scanner;
class CurrencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int note = 0;
        int coins = 0;
        
        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();
        int originalAmount = amount;

        if(amount / 2000 != 0) {
            note += amount / 2000;
            amount %= 2000;
        }
        if(amount / 500 != 0) {
            note += amount / 500;
            amount %= 500;
        }
        if(amount / 200 != 0) {
            note += amount / 200;
            amount %= 200;
        }
        if(amount / 100 != 0) {
            note += amount / 100;
            amount %= 100;
        }
        if(amount / 50 != 0) {
            note += amount / 50;
            amount %= 50;
        }
        if(amount / 20 != 0) {
            note += amount / 20;
            amount %= 20;
        }
        if(amount / 10 != 0) {
            note += amount / 10;
            amount %= 10;
        }
        if(amount / 5 != 0) {
            note += amount / 5;
            amount %= 5;
        }

        if(amount / 2 != 0) {
            coins += amount / 2;
            amount %= 2;
        }
        if(amount / 1 != 0) {
            coins += amount / 1;
            amount %= 1;
        }

        System.out.println(note + " notes and " + coins + " coins" );
    }
}
