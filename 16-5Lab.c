//Q.1 Write a C program to print sum of digits entered by user
// --------

// Sample input  : int n = 1234

// Sample output : 10
// Sample Input
// 1234
// Sample Output
// Sum of digits of 1234 is: 10
// C Program:
// #include <stdio.h>
// int main()
// {
//     int n;
//     int s = 0, r = 0;
//     scanf("%d", &n);
//     int temp = n;
//     if (n < 0)
//     {
//         printf("Negative value Not Allowed.");
//         return 0;
//     }
//     while (n != 0)
//     {
//         r = n % 10;
//         s += r;
//         n = n / 10;
//     }
//     printf("Sum of digits of %d is: %d", temp, s);
// }

// Q.2 Write a C program to print all natural numbers form 1 to N in reverse order
// Sample input  : int n = 10;

// Sample output : 10,9,8,7,6,5,4,3,2,1
// Sample Input
// 10
// Sample Output
// Natural numbers from 10 to 1:
// 10 9 8 7 6 5 4 3 2 1

// C Program:
// #include<stdio.h>
// int main()
// {
//     int n,rev=0,r=0;
//     scanf("%d",&n);
//     if (n<0)
//     {
//         printf("Please enter a natural number (positive integer greater than 0).");
//         return 0;
//     }
//      printf("Natural numbers from %d to 1:\n",n);
//     while (n>=1){
//      printf("%d ",n);
//      n--;
//     }
// }

// Q.3 Write C program to print alphabets from a to z using while loop
// Enter starting alphabet (a-z): d
// Enter ending alphabet (a-z): j
// Alphabets from d to j:
// d e f g h i j
// Sample Input
// a
// d
// Sample Output
// Alphabets from a to d:
// a b c d

// C Program:
// #include<stdio.h>
// int main()
// {
//     char n;
//     scanf(" %c",&n);
//     char m;
//     scanf(" %c",&m);
//     if (n<'a'||n>'z'&& m<'a'||m>'z'){
//         printf("Invalid input. Please enter lowercase letters from a to z in correct order.");
//     }
//     else{
//      printf("Alphabets from %c to %c:\n",n,m);
//     while(n<=m)
//     {
//    printf("%c ",n);
//     n++;
//     }
//     }
// }

// Q.4 Write C program to print multiplication table of a given number.
// --------

// Sample input  : int n = 5;

// Sample output : 5 * 1 = 5
//                 5 * 2 = 10
//                 5 * 3 = 15
//                 - - -
//                 - - -
//                 5 * 10 = 50
// Sample Input
// 5
// Sample Output
// Multiplication table of 5:
// 5 * 1 = 5
// 5 * 2 = 10
// 5 * 3 = 15
// 5 * 4 = 20
// 5 * 5 = 25
// 5 * 6 = 30
// 5 * 7 = 35
// 5 * 8 = 40
// 5 * 9 = 45
// 5 * 10 = 50

// C Program:
// #include<stdio.h>
// int main()
// {
//     int n;
//     scanf("%d",&n);
//     if(n<1){
//         printf("Negative Number not allowed.");
//         }
//     else{
//         printf("Multiplication table of %d:\n");
//         int i=1;
//     while(i<=10)
//     {
//         printf("%d * %d = %d\n",n,i,i*n);
//         i++;
//     }
//     }
// }

// Q.5 Write a C program that reads a positive integer N from the user and calculates the sum of even and odd numbers between 1 and N using a while loop.
// The program should then print the sum of even numbers and the sum of odd numbers.

// NOTE : If user entered negative input then print "Invalid Input" message.

// Example_1 :

// Sample input  : N = -10;

// Sample output : Invalid Input
// Sample Input
// 10
// Sample Output
// Even Sum = 30
// Odd Sum = 25

// C Program:
#include<stdio.h>
int main()
{
    int n,even=0,odd=0;
    scanf("%d",&n);
    if(n<1){
        printf("Invalid Input");
    }
    else
    {
        int i=1;
        while(i<=n){
            if(i%2==0)
            even += i;
            else
            odd += i;
            i++;
        }
        printf("Even sum = %d\nOdd sum = %d",even,odd);
    }
}
