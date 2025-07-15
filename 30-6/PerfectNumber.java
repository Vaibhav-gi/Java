// Q. Check Perfect Number
// 📄 Problem Statement:
// Write a Java program to check whether a given number is a Perfect Number or not.

// 📘 Definition:
// A Perfect Number is a positive integer that is equal to the sum of its proper divisors (excluding the number itself).

// 📌 For example:
// 6 is a Perfect Number because its divisors are 1, 2, 3 and 1 + 2 + 3 = 6.

// 28 is also Perfect: 1 + 2 + 4 + 7 + 14 = 28.

// 📌 Input Format:
// A single positive integer n

// 📌 Output Format:
// Print "Perfect Number" if the number is perfect

// Otherwise, print "Not Perfect"

// Sample Input
// 6
// Sample Output
// Perfect Number

// Java Program :
import java.util.Scanner;
class PerfectNumber{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i=1;i<n;i++)
        {
            if(n%i == 0){
            sum = sum + i;
            }
        }
        if (sum == n)
        {
            System.out.println("Perfect Number");
        }
        else {
            System.out.println("Not Perfect");
        }
    }
}