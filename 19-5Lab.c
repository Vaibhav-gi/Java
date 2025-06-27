// Q.1 Find the Sum of Even Numbers Between Two Given Numbers

// Test Case 1 :-  Valid Input (Start and End are Even)
// ---------------
// Input :-
// ---------
// Enter the start number: 2
// Enter the end number: 8

// Expected Output :-
// ------------------
// Sum of even numbers: 20

// Explanation :- The even numbers between 2 and 8 are 2, 4, 6, and 8. The sum is 2 + 4 + 6 + 8 = 20.
// ---------------

// Test Case 2 :- Invalid Input (Start Greater Than End)
// --------------
// Input :-
// --------
// Enter the start number: 10
// Enter the end number: 5

// Expected Output :-
// -------------------
// Invalid range. Start number should be less than or equal to end number.

// Test Case 3 :-  Valid Input (No Even Numbers Between the Range)
// ---------------
// Input :-
// ---------
// Enter the start number: 9
// Enter the end number: 9

// Expected Output :-
// -------------------
// Sum of even numbers: 0
// Explanation: There are no even numbers between 9 and 9.

// Test Case 4 :- Valid Input (Single Even Number)
// --------------
// Input :-
// ---------
// Enter the start number: 4
// Enter the end number: 4

// Expected Output:
// ----------------
// Sum of even numbers: 4

// Sample Input
// 2
// 8
// Sample Output
// Sum of even numbers: 20

// C Program:
// #include<stdio.h>
// int main(){
//     int n1,n2,sum=0;
//     scanf("%d %d",&n1,&n2);

//     if(n1>=n2){
//         printf("Invalid range. Start number should be less than or equal to end number.");
//     }
//     else{
//         while(n1<=n2){
//             if(n1%2==0){
//             sum+=n1;}
//             n1++;
//         }
//         printf("Sum of even numbers: %d",sum);
//         }
// }

// Q.2 Write a C program using a while loop that reads two integers, N1 and N2, from the user. The program should print all the numbers from N1 to N2 (inclusive) in a single line, separated by commas.

// Sample-run :-
// --------------

// Test Case-1 :- [Basic Range]
// --------------
// Input :-
// --------
// N1 = 1, N2 = 10

// Expected Output :-
// ------------------
// 1,2,3,4,5,6,7,8,9,10

// Test Case-2 :- [Negative to Positive Range]
// --------------
// Input :-
// --------
// N1 = -5, N2 = 5

// Expected Output :-
// ------------------
// -5,-4,-3,-2,-1,0,1,2,3,4,5

// Test Case-3 :- [Single Number (N1 = N2)]
// --------------
// Input :-
// --------
// N1 = 7, N2 = 7

// Expected Output :-
// ------------------
// 7

// Test Case 4 :- [Reverse Input (N1 > N2)]
// --------------
// Input :-
// --------
// N1 = 10, N2 = 1

// Expected Output :-
// -------------------
// Invalid input. N1 should be less than or equal to N2.

// Test Case 5 :- [Zero Range]
// --------------
// Input :-
// --------
// N1 = 0, N2 = 3

// Expected Output :-
// ------------------
// 0,1,2,3

// Test Case 6 :- [Negative Range]
// --------------
// Input :-
// ---------
// N1 = -10, N2 = -5

// Expected Output :-
// -------------------
// -10,-9,-8,-7,-6,-5

// Test Case 7 :- [Same Start and End with Negative Value]
// --------------
// Input :-
// --------
// N1 = -2, N2 = -2

// Expected Output :-
// ------------------
// -2
// Sample Input
// 1
// 10
// Sample Output
// 1,2,3,4,5,6,7,8,9,10

// C Program:
// #include<stdio.h>
// int main(){
//     int n1,n2;
//     scanf("%d %d",&n1,&n2);
//     if(n1>n2){
//         printf("Invalid input. N1 should be less than or equal to N2.");
//     }else{
//         while(n1<=n2){
//             printf("%d",n1);
//             if(n1<n2){
//                 printf(",");
//             }
//             n1++;
//         }
//     }
// }

// Q.3 write a c program to find factorial number
// Enter a positive integer: 5
// Factorial of 5 = 120
// Sample Input
// 5
// Sample Output
// Factorial of 5 = 120

// C Program:
// #include<stdio.h>
// int main(){
//     int n,factorial=1,temp;
//     scanf("%d",&n);
//     temp=n;
//     if(n<0){
//         printf("Negative value not allowed.");
//     }else{
//         while(n>0){
//             factorial=factorial*n;
//             n--;
//         }
//         printf("Factorial of %d = %d",temp,factorial);
//     }
// }

// Q.4 Write C program to reverse a number using while

// Sample input  : Enter a number : 12345
// Sample output : Reverse : 54321
// Sample Input
// 123
// Sample Output
// 321

// C Program:
// #include<stdio.h>
// int main(){
//     int n,reverse=0;
//     scanf("%d",&n);

//     while(n!=0){
//         int lastdigit=n%10;
//         reverse=reverse*10+lastdigit;
//         n=n/10;
//     }
//     printf("Reverse : %d",reverse);
// }

// Q.5 Prints odd Numbers
// [Title:- Print Odd Numbers up to N]
// -----------------------------------
// Write a C program that takes an integer input N from the user and prints all odd numbers up to N using a while (true) loop. Ensure the program terminates if the user enters a negative value for N.

// Test Cases :-
// -------------

// Test-Case-1 :-
// --------------
// Input :- N = 10
// --------
// Output :- 1 3 5 7 9
// ---------
// Explanation :- Prints all odd numbers from 1 to 10.
// --------------

// Test-Case-2 :-
// --------------
// Input :- N = -1
// --------
// Output :- Invalid input. Program terminated.
// ---------
// Explanation :- Negative value entered; program exits.
// --------------

// Test-Case-3 :-
// --------------
// Input: N = 15
// Output: 1 3 5 7 9 11 13 15
// Explanation: Prints all odd numbers from 1 to 15.
// Sample Input
// 15
// Sample Output
// 1 3 5 7 9 11 13 15

// C Program:
// #include <stdio.h>
// int main()
// {
//     int n, i = 0;
//     scanf("%d", &n);
//     if (n < 0)
//     {
//         printf("Invalid input. Program terminated.");
//     }
//     else{
//         printf("Odd numbers up to %d:", n);
//         while (i <= n)
//         {
//             if (i % 2 != 0)
//             {
//                 printf(" %d", i);
//             }
//             i++;
//         }
//     }
// }

// Q.6 Write a C program to check whether a given integer is a palindrome. A number is considered a palindrome if the reverse of the number is equal to the original number. 
// The program should prompt the user to enter an integer, reverse the number, and then compare it to the original number to determine if it is a palindrome.

// Sample input  : Enter an integer: 131
// Sample output : 131 is palindrome number.

// Sample input  : Enter an integer: 1121 
// Sample output : 1121 is not palindrome number.
// Sample Input
// 131
// Sample Output
// 131 is palindrome number.

// C Program:
#include<stdio.h>
int main(){
    int n,rev=0,palind;
    scanf("%d",&n);
    palind=n;
    while (n!=0)
    {
        int lastdigit=n%10;
        rev=rev*10+lastdigit;
        n=n/10;
    }

    if (rev == palind)
    {
        printf("%d is a palindrome number.",palind);
    }else{
        printf("%d is not a palindrome number.",palind);
    }
}
