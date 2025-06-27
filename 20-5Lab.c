// Q.1 [Title: Check Armstrong Number Using While Loop]

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

// C Program:
// #include <stdio.h>
// int main()
// {
//     int n, sum = 0,c = 0;//3 sum = 153
//     printf("Enter the number : ");
//     scanf("%d",&n); //153
//     int temp = n; //0
//     while(temp!=0) {
//        c++;
//        temp/=10;
//     }
//     temp = n;//0
//     while(temp!=0) {
//         int r = temp%10;//1
//         int res = 1;//1
//         int count = c;//3
//         while(count!=0) {
//             res*=r;
//             count--;
//         }
//         sum+=res;
//         temp/=10;
//     }
//     if(sum == n) {
//         printf("%d is an Armstrong number.",n);
//     }else {
//         printf("%d is not an Armstrong number.",n);
//     }
//     return 0;
// }

// Using pow function
// -------------------------
// #include <stdio.h>
// #include <math.h>

// int main()
// {
//     int n, sum = 0, c = 0; // 3 sum = 153
//     printf("Enter the number : ");
//     scanf("%d", &n); // 153
//     int temp = n;    // 0
//     while (temp != 0)
//     {
//         c++;
//         temp /= 10;
//     }
//     temp = n; // 0
//     while (temp != 0)
//     {
//         int r = temp % 10; // 1
//         sum = sum + pow(r, c);
//         temp /= 10;
//     }
//     if (sum == n)
//     {
//         printf("Armstrong", n);
//     }
//     else
//     {
//         printf("not an armstrong", n);
//     }
//     return 0;
// }

// Q.2 Write a C program using nested while loops to print all prime numbers between 1 and N.

// Enter a number: 10

// 2 is a prime number
// 3 is a prime number
// 5 is a prime number
// 7 is a prime number
// Sample Input
// 10
// Sample Output
// 2 is a prime number
// 3 is a prime number
// 5 is a prime number
// 7 is a prime number

// C Program:
// #include<stdio.h>
// int main(){
//     int n,i=1;
//     scanf("%d",&n);

//     while(i<=n){
//         int k=i;
//         int c=0;
//         int j=1;

//         if(n<0){
//             printf("Negative value Not allowed.");
//         }
//         while(j<=k){
//             if(k%j==0)
//             {
//                 c++;
//             }
//             j++;
//         }
//         if(c==2){
//             printf("%d is a prime number\n",i);
//         }
//          i++;
//     }
//          return 0;
// }

// Q.3 Write a c program to check given number is prime or not using while loop

// Enter a number: 7

// 7 is a Prime Number.
// Sample Input
// 7
// Sample Output
// 7 is a Prime Number.

// C Program:
// #include<stdio.h>
// int main(){
//     int n,i=1,c=0;
//     scanf("%d",&n);

//     if(n<0){
//         printf("Negative value Not allowed.");
//         return 0;
//     }
//     while(i<=n){
//         if(n%i==0){
//         c++;}
//         i++;
//     }
//     printf((c==2)? "%d is a Prime Number." : "%d is not a Prime Number.",n,n);
// }

// #include<stdio.h>
// int main(){
//     int n,count=0,i=1;
//     scanf("%d",&n);
//     if(n<0){
//         printf("Negative value Not allowed.");
//         return 0;
//     }
//     while(i<=n){
//         if(n%i==0){
//             count++;
//         }i++;
//     }
//         if(count==2){
//             printf("%d is a Prime Number.",n);
//         }
//         else{
//             printf("%d is not a prime number.",n);
//         }
//     }

// Q.4 Write C program to check given number is automorphic number or not.
// --------

// Automorphic number :
// An automorphic number is a number whose square ends in the
// same digits as the number itself.
// For example:
// 5,6,25 are automorphic numbers.
// 5*5=25 // last digit is 5
// 6*6=36 // last digit is 6
// 25*25=625 // last digit is 25
// Sample Input
// 5
// Sample Output
// 5 is an Automorphic Number.

// C Program:

// Q.5 Write C program to check given number is spy number or not.
// --------

// spy number :
// A spy number is a number where the sum of its digits equals
// the product of its digits.
// For example :
// 1124 is a spy number, because the sum of its digits is 1+1+2+4=8 and
// the product of its digits is 1*1*2*4=8 is equal.
// Sample Input
// 1124
// Sample Output
// 1124 is a Spy Number.

// C Program:
