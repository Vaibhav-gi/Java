// Q.1 Write a program in C to find the prime Numbers Between the given range 1 to N
// Sample Input
// 10
// Sample Output
// Prime numbers between 1 and 10 are:
// 2
// 3
// 5
// 7
// C Program:
#include<stdio.h>
int main()
{
    int n,i,j,r;
    scanf("%d",&n);
    if(n<0){
        printf("Negative value not allowed.");
        return 0;
    }
    printf("Prime numbers between 1 and %d are:\n");

    
    for(i=1; i<=n; i++)
    {
        int c=0;
    for(j=1;j<=i;j++)
    {
        if(i%j==0)c++;
    }
    if(c==2)
        printf("%d\n",i);
    }
}

// Q.2 Write a program in C to check whether a number can be expressed as the sum of two prime. 
// Input as: 16
// Expected Output :

// 16 = 3 + 13

// 16 = 5 + 11
// Sample Input
// 16
// Sample Output
// Pairs of prime numbers whose sum is 16:
// 16 = 3 + 13
// 16 = 5 + 11

// C Program:



// Q.3 Write a C program to find all Armstrong numbers between 100 to N.

// A three digit number is called Armstrong number if sum of cube of its digit is equal to number itself.

// E.g.- 153 is an Armstrong number because (1)^3+(5)^3+(3)^3 = 153.
// Sample Input
// 200
// Sample Output
// Armstrong numbers between 100 and 200 are:
// 153