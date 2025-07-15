// Q. ArmstrongCheck
// Check Armstrong Number
// 📄 Problem Statement:
// Write a Java program to check whether a given 3-digit number is an Armstrong number or not.

// 📘 Definition:
// A number is called an Armstrong number (also known as a narcissistic number) if the sum of the cubes of its digits equals the number itself.

// For example:

// 153 is an Armstrong number because
// 1³ + 5³ + 3³ = 1 + 125 + 27 = 153

// 📌 Input:
// A positive integer (preferably a 3-digit number).

// 📌 Output:
// Print "Armstrong" if the number is an Armstrong number.

// Otherwise, print "Not Armstrong".

// 🧠 Constraints:
// Valid for 3-digit numbers only (100 to 999).

// You may assume the input is a valid integer.
// Sample Input
// 153
// Sample Output
// Armstrong

// Java Program :
import java.util.Scanner;
class  ArmstrongCheck
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int temp = num;
		//task-1 : count digits using temp
		int count = 0;
		while (temp!=0)
		{
			count++;
			temp = temp/10;
		}
		
		
		//task-2 : re-initialise temp variable with num
		temp = num;
		
		
		/*task-3 : find sum of digits using a loop, where each digit is raised to 
		the power count of digits. use temp variable*/
		int sum = 0;
		while (temp!=0)
		{
			//step-1 : take last digit from temp
			int ld = temp%10;
			
			//step-2 : multiply last digit, count times
			int product = 1;
			for (int i = 1;i<=count ;i++ )
			{
				product = product * ld;
			}
			
			
			//step-3 : add the product to sum
			sum = sum+product;
			
			
			//step-4 : remove last digit from temp.
			temp = temp/10;
		}
		
		/*task-4 : compare sum with num, if sum and num are equal, print "Armstrong
		number", else print "Not armstrong number".*/
		if (sum==num)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}
}
