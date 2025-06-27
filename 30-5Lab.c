// Q.1 PrintOddEvenElements
// Write a program in C to print separately the  odd and even integers 
// Test Data :
// Input the number of elements to be stored in the array :5
// Input 5 elements in the array :
// element - 0 : 25
// element - 1 : 47
// element - 2 : 42
// element - 3 : 56
// element - 4 : 32
// Expected Output :
// The Even elements are :
// 42 56 32
// The Odd elements are :
// 25 47
// Sample Input
// 5
// 25
// 47
// 42
// 56
// 32
// Sample Output
// The Even elements are:
// 42 56 32
// The Odd elements are:
// 25 47
// C Program:
// #include<stdio.h>
// int main(){
//     int n;
//     printf("Enter the elements:");
//     scanf("%d",&n);
//     if(n<0){
//         printf("Invalid Array Size.");
//         return 0;
//     }
//     int a[n];
//     for(int i=0;i<n;i++){
//         scanf("%d",&a[i]);
//     }
//     int b=0;
//     printf("The Even elements are:\n");
//     for(int j=0;j<n;j++){
//         if(a[j]%2==0 && j<n-1){
//             b++;
//             printf("%d ",a[j]);
//         }else if(a[j]%2==0){
//             b++;
//             printf("%d",a[j]);
//         }
//     }
//     if(b)
//     printf("\n");
//     printf("The Odd elements are:\n");
//     for(int k=0;k<n;k++){
//         if(a[k]%2){
//             printf("%d ",a[k]);
//         }
//     }
// }

// Q.2 Sum of Elements
// -> Reads an integer N from the user to define the size of a dynamically allocated array.
// -> Prompts the user to input N integer values into the array.
// -> Calculates and prints the sum of all elements in the array.

// Sample TestCase :-
// --------------------------
// Input :-
// --------
// Enter the size of the array: 6
// Enter 6 elements into the array:
// 8  2  3  4  5  6

// Output :-
// ---------
// The sum of all elements in the array is: 28
// Sample Input
// 5
// -2  -4  -6  -8  -10
// Sample Output
// The sum of all elements in the array is: -30

// C Program:
// #include<stdio.h>
// int main(){
//     int n;
//     printf("Enter the elements : ");
//     scanf("%d",&n);
//     if(n<0){
//         printf("Invalid input. Array size must be a positive integer");
//         return 0;
//     }
//     if(n==0){
//         printf("Invalid input. Array size must be greater than 0");
//         return 0;
// }
//     int a[n];
//     int sum=0;
//     for(int i=0;i<n;i++){
//         scanf("%d",&a[i]);
//     }
//     for(int j=0;j<n;j++){
//         sum+=a[j];
//     }
//     printf("The sum of all elements in the array is: %d\n",sum);
// }

// Q.3 Write a C program to store some integers in an array and print all the prime numbers available in that array
// Input as :
// 1 2 3 4 5
// Output as :
// 2 3 5
// Sample Input
// 5
// 1
// 2
// 3
// 4
// 5
// Sample Output
// 2 3 5

// C Program:
// #include<stdio.h>
// int main(){
//     int n,i,j,a[20],temp=0;
//     printf("Enter the array size: ");
//     scanf("%d",&n);
//     if(n<0){
//         printf("Invalid Array size.");
//         return 0;
//     }
//     for(i=0;i<n;i++)
//     {
//         scanf("%d",&a[i]);
//         int c=0;
//         for(j=1;j<=a[i];j++){
//             if(a[i]%j==0)
//             c++;
//         }
//         if(c==2){
//             printf("%d ",a[i]);
//             temp=1;
//         }
//     }
//     if(temp==0)
//     {
//         printf("No Element.");
//     }
// }

// Q.4 Write a program in C to read n number of values in an array and display it in reverse order.

// Input the number of elements to store in the array :3
// Input 3 number of elements in the array :
// element - 0 : 2
// element - 1 : 5
// element - 2 : 7
// Expected Output :
// The values store into the array are :
// 2 5 7
// The values store into the array in reverse are :
// 7 5 2
// Sample Input
// 3
// 2
// 5
// 7
// Sample Output
// The values stored into the array in reverse are:
// 7 5 2

// C Program:
#include<stdio.h>
int main(){
    int n;
    printf("Enter array size 1-100: ");
    scanf("%d",&n);
    int a[n];
    printf("Enter %d integers : ",n);
    if(n<0){
        printf("Invalid Array Size.");
        return 0;
    }
    for(int i=0;i<n;i++)
    scanf("%d",&a[i]);
    printf("The values stored into the array in reverse are:\n");
    for(int i=0; i<n/2; i++){
        int temp = a[i];
        a[i] = a[n-1-i];
        a[n-1-i] = temp;
    }
        for(int i=0; i<n; i++){
            printf("%d ",a[i]);
        }
}

// Q.5 Write a program in C to store elements in an array and print it.

// Input 10 elements in the array :
// element - 0 : 1
// element - 1 : 1
// element - 2 : 2
// element - 3 : 3
// element - 4 : 4
// element - 5 : 5
// element - 6 : 6
// element - 7 : 7
// element - 8 : 8
// element - 9 : 9
// .......
// and so on.
// Expected Output :
// Elements in array are: 1 1 2 3 4 5 6 7 8 9
// Sample Input
// 5
// 1
// 2
// 3
// 4
// 5
// Sample Output
// 1 2 3 4 5 

// C Program:
