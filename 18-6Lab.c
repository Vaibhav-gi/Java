// Q.1 Write a program in C to rotate an array by N positions.

// Sample input:
// Enter size of array : 11
// Enter 11 elements   : 0 3 6 9 12 14 18 20 22 25 27
// Enter the position  : 4

// Sample output :
// After rotating from 4th position the array is: 12 14 18 20 22 25 27 0 3 6 9
// Sample Input
// 11
// 0 3 6 9 12 14 18 20 22 25 27
// 4
// Sample Output
// 12 14 18 20 22 25 27 0 3 6 9

// C Program:
#include<stdio.h>
int main(){
    int n;
    printf("Enter the size of the array : ");
    scanf("%d",&n);
    int arr[n];
     printf("Enter the elements : ");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int k;
    printf("Enter the position : ");
    scanf("%d",&k);


    int dup1[n];
    int index =0;
    for(int i=k;i<n;i++){
        dup1[index]=arr[i];
        index++;
    }
    for(int i=0;i<n;i++){
        dup1[index]=arr[i];
        index++;
    }

    for(int i=0;i<n;i++){
        printf("%d ",dup1[i]);
    }
}

// Q.2 Write a program in C to delete an element at desired position from an array.
// Test Data :
// Input the size of array : 5
// Input 5 elements in the array in ascending order:
// element - 0 : 1

// element - 1 : 2

// element - 2 : 3

// element - 3 : 4

// element - 4 : 5

// Input the position which to delete: 3

// Expected Output :

// The new list is : 1 2 4 5
// Sample Input
// 6
// 10
// 20
// 30
// 40
// 50
// 60
// 1
// Sample Output
// 20 30 40 50 60

// Q.3 [Title:- Find the Number Occurring Odd Number of Times]
// -------------------------------------------------------
// Write a C program to find the number(s) occurring an odd number of times in a given array.

// Sample Input :-
// ----------------
// The given array is: 8 3 8 5 4 3 4 3 5 1

// Sample Output :-
// -----------------
// The elements occurring odd number of times are: 3 1

// Test Cases :-
// --------------
// Test Case-1 :- Valid
// ---------------
// Input :- {8, 3, 8, 5, 4, 3, 4, 3, 5, 1}
// ---------
// Output :- 3, 1 (elements occurring odd times)
// ---------

// Test Case-2 :- Valid
// --------------
// Input :- {10, 20, 10, 20, 10}
// --------
// Output :- 10
// ---------

// Test Case-3 :- Invalid
// --------------
// Input :- {} -> if size of the array is 0
// --------
// Output :- No elements in the array.
// Sample Input
// 5
// 10
// 20
// 10
// 20
// 10
// Sample Output
// 10

// C Program

// Q.4 Write a program in C to find the frequency of characters.
// --------
// Sample input : This is a test string
// Sample input : the character to find frequency: i

// Sample  output : The frequency of 'i' is : 3
// Sample Input
// Hello world
// Sample Output
// o
// The frequency of 'o' is: 2

// C Program :

// Q.5 Write a C program to find the repeated character in a string.
// --------
// Sample input : welcome to Nareshit

// Sample  output:  The first repetitive character in Nareshit is: e
// Sample Input
// welcome to Nareshit
// Sample Output
// The first repetitive character is: e

