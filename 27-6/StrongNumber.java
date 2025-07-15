// Q. Write a C program to check if a given number is a strong number. A strong number is a positive integer in which the sum of the factorial of its digits is equal to the number itself. For example, 145 is a strong number since 1! + 4! + 5! = 145. The program should prompt the user to enter a positive integer and determine whether it is a strong number or not.

// Input as:

// Enter a number : 145

// Output as:

// 145 is a strong number.
// Sample Input
// 145
// Sample Output
// 145 is a strong number.

// java Program :

import java.util.Scanner;
class StrongNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int temp = num;
		//task- 1 : find sum of factorial of each digit from temp(use a loop)
		int sum = 0;
		while (temp!=0)
		{
			//step-1 : take last digit from temp
			int ld = temp%10;

			//step-2 : find factorial of last digit
			int factorial = 1;
			for (int i=ld;i>=1 ;i-- )
			{
				factorial = factorial * i;
			}
			
			//step-3 : add factorial to sum
			sum = sum + factorial;

			//step-4 : remove last digit from temp.
			temp = temp/10;
		}
		System.out.println("sum is : "+sum);
		
		if (sum==num)
		{
			System.out.println("Strong Number / Krashnamurti Number");
		}
		else
		{
			System.out.println("Not Strong Number / Krashnamurti Number");
		}
	}
}