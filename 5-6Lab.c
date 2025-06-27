// Q.1 Write a program in C to check whether a number is a prime number or not by using the function.
// Test Data :
// Input a positive number : 5
// Expected Output :
// The number 5 is a prime number.
// Sample Input
// 5
// Sample Output
// The number 5 is a prime number.

// C Program:

// Q.2 Write a C program that finds and prints all pairs of numbers from a given array whose sum equals a specified target value ?
// ----------------------------------------------------------------------------------------------------------------------------

// -> The program should iterate through the array, compare every pair of numbers, and print each pair that meets the condition.

// Test-Case-1 :-
// --------------
// Input :-
// ---------
// Array: {1, 5, 7, -1, 5}  
// Target Sum: 6  

// Output :-
// ----------
// Pair found: (1, 5)  
// Pair found: (7, -1)  
// Pair found: (1, 5)  

// Test-Case-2 :-
// --------------
// Input :-
// --------
// Array: {0, -1, 2, -3, 1}  
// Target Sum: -2  

// Output :-
// ----------
// Pair found: (0, -2)  
// Pair found: (-1, -1)  
// Pair found: (-3, 1)  

// Invalid Test Cases :-
// ---------------------

// Test-Case-3 :-
// ---------------
// Input :-
// ---------
// Array: {}-> empty array with no elements  
// Target Sum: 10  
// Output :-
// ---------
// Invalid input. Array must contain at least two elements.  

// Test-Case-4 :-
// ---------------
// Input :-
// ---------
// Array: {-5, -3, 0, 2, 4}  
// Target Sum: 6  

// Output :-
// ----------
// No pairs found with the given target sum.  

// Sample Input
// 5
// 1
// 5
// 7
// -1
// 5
// 6
// Sample Output
// Pair found: (1, 5)
// Pair found: (1, 5)
// Pair found: (7, -1)

// C Program:

// Q.3 Write a program in C to find the square of any number using the function.
// Test Data :
// Input any number for square : 20
// Expected Output :
// The square of 20 is : 400.00
// Sample Input
// 20
// Sample Output
// The square of 20.00 is : 400.00

// C Program:
#include<stdio.h>
void square(int num){
    printf("The square of %d is : %d",num,(num*num));
}
int main(){
    int n;
    printf("Enter the number : ");
    scanf("%d",&n);
    if(n<0){
        printf("Negative number is not allowed.");
        return 0;
    }
    square(n);
    
}


// Q.4 Write a C program to find the biggest number between three number using the function.

// Test Data :
// Input three positive number : 13 31 19
// Expected Output :
// The biggest number is 31.
// Sample Input
// 10
// 20
// 30
// Sample Output
// The biggest number is 30.

// C Program:

// Q.5 Write a c program to check the give string is palindrome or not using function
// Sample Input
// madam
// Sample Output
// The string madam is a palindrome.

// C Program:
