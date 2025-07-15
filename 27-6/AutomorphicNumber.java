// Q. (USING FOR LOOP)
// ------------------
// Write a C program to check whether the given number is an automorphic number or not.

// Automorphic Number :-
// ---------------------
// An automorphic number is a number whose square ends with the same digits as the number itself.

// For example :-
// --------------

// 5, 6, and 25 are automorphic numbers.

// -> 5×5=25 → The original number is 5 (single digit), and the last digit is also 5.
// -> 6×6=36 → The original number is 6 (single digit), and the last digit is also 6.
// -> 25×25=625 → The original number is 25 (double digit), and the last two digits are 25.

// Test-Cases-1 :- Positive Automorphic Number
// ---------------
// Input :-
// --------
// Enter a number: 5

// Expected Output :-
// ------------------
// 5 is an automorphic number.

// Explanation: The square of 5 is 25, and the last digit is 5, which matches the original number.
// ------------

// Test-Cases-2 :- Negative Automorphic Number
// ---------------
// Input :-
// --------
// Enter a number: -7

// Expected Output :-
// ------------------
// 7 is not an automorphic number.

// Explanation: The square of 7 is 49, and the last digit is 9, which does not match the original number.
// ------------

// Test-Cases-3 :- Zero Input
// ---------------
// Input :-
// --------
// Enter a number: 0

// Expected Output :-
// -------------------
// 0 is an automorphic number.

// Explanation: The square of 0 is 0, and the last digit is also 0, which matches the original number. Therefore, 0 is an automorphic number.
// Sample Input
// 5
// Sample Output
// 5 is an automorphic number.

// Java Program : 
import java.util.Scanner;
class AutomorphicNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int temp = num;
        boolean isAutomorphic = true;

        int square = num * num;
        while(num > 0)
        {
            if((num % 10)!=(square % 10))
            {
                isAutomorphic = false;
                break;
            }
            num=num/10;
            square=square/10;
        }
        if(isAutomorphic)
        {
            System.out.println(+temp+" is an automorphic number.");
        }
        else
        {
            System.out.println(+temp+" is not an automorphic number.");
        }
    }
}