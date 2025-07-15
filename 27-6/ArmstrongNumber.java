// Q. [Title: Check Armstrong Number Using While Loop]

// Problem Statement :-
// --------------------
// Write a C program to check whether a given number is an Armstrong number or not using a while loop.

// What is an Armstrong Number?
// ----------------------------
// An Armstrong number (also known as a narcissistic number) is a number that is equal to the sum of its own digits raised to the power of the number of digits.

// For example :-
// ---------------
// 153 :- [1 pow 3] + [5 pow 3] + [3 pow 3] = 153 (Armstrong number)
// 9474: [9 pow 4] + [ 4 pow 4] + [7 pow 4] + [4  pow 4] = 947 (Armstrong number)
// 123: [1 pow 3] + [2 pow 3] + [3 pow 3] = 36 (Not an Armstrong number)

// Algorithm Overview
// ------------------
// -> Read the input number from the user.
// -> Count the number of digits in the number.
// -> Calculate the sum of each digit raised to the power of the total number of digits.
// -> Compare the sum with the original number.
// -> If they are equal, it is an Armstrong number; otherwise, it is not.

// Test-Case-1 :-
// ---------------
// Enter a number: 153

// Sample Output-1 :-
// ------------------
// 153 is an Armstrong number.

// Test-Case-2 :-
// ---------------
// Enter a number: 123

// Sample Output-2 :-
// ------------------
// 123 is not an Armstrong number.

// Test-Case-3 :- (Invalid):
// --------------
// Enter a number: -9474

// Sample Output-3 :-
// ------------------
// Invalid input. Enter a positive number.

// Test-Case-4 :- (Valid)
// --------------
// Enter a number: 9474

// Sample Output-4 :-
// ------------------
// 9474 is an Armstrong number.
// Sample Input
// 9474
// Sample Output
// 9474 is an Armstrong number.

// Java Program :

import java.util.Scanner;
class  ArmstrongNumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int temp = num;
		
		int count = 0;
		while (temp!=0)
		{
			count++;
			temp = temp/10;
		}
		
		temp = num;
	
		int sum = 0;
		while (temp!=0)
		{
			int ld = temp%10;
			
			int product = 1;
			for (int i = 1;i<=count ;i++ )
			{
				product = product * ld;
			}
			
			sum = sum+product;
			temp = temp/10;
		}
		
		if (sum==num)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("not an Armstrong number");
		}
    }
}

