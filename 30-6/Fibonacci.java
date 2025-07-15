// Q. FibonacciSeries
// Print Fibonacci Series
// 📄 Problem Statement:
// Write a Java program to print the first 10 numbers in the Fibonacci series.

// The Fibonacci series is a sequence where each number is the sum of the two preceding ones, starting from 0 and 1.

// 📌 Expected Fibonacci Output:
// Copy
// Edit
// 0 1 1 2 3 5 8 13 21 34
// 🧠 Logic:
// Start with the first two numbers: 0 and 1.

// For the remaining 8 numbers, use a loop to calculate each next term as:

// ini
// Copy
// Edit
// next = previous + current
// ✅ Functionality Requirements:
// No input required from the user.

// Program should print the first 10 Fibonacci numbers in a single line, separated by spaces.
// Sample Input
// 5
// Sample Output
// Fibonacci Series: 0 1 1 2 3

// Java Program :
import java.util.Scanner;
class Fibonacci
{
	public static void main(String[] args)
	{
		int a = 0;
		int b = 1;
		int sum = 0;
        System.out.print("Fibonacci Series: ");
		for (int i = 1;i<=5 ;i++ )
		{
			System.out.print(sum);
			a = b;
			b = sum;
			sum = a + b;
		}
	}
}
