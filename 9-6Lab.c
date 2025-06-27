// Q.1 Write a program in C to find the square of any number using the function.
// Test Data :
// Input any number for square : 20
// Expected Output :
// The square of 20 is : 400.00
// Sample Input
// 20
// Sample Output
// The square of 20.00 is : 400.00

// C Program:
// #include<stdio.h>
// int square(float m){
//     printf("The square of the %.2f is : %.2f",m,(m*m));
// }
// int main(){
//     int n;
//     printf("Enter the number: ");
//     scanf("%d",&n);
//     if(n<0){
//         printf("Negative number is not allowed.");
//         return 0;
//     }
//     square(n);
// }

// Q.2 Program to check whether a number is even or odd using functions ?
// ------------------------------------------------------------------
// Function Signature :-
// ---------------------
// -> Return Type: int (Returns 1 if the number is even, 0 if odd)
// -> Function Name: isEven()
// -> Arguments: int num

// Test Cases :-
// -------------
// Test Case	Input	Expected Output	Result
// ----------------------------------------------
// Test-Case-1	8	1 (Even)	Valid
// Test-Case-2	5	0 (Odd)		Valid
// Test-Case-3	0	1 (Even)	Valid
// Test-Case-4	-3	0 (Odd)		Valid
// Test-Case-5	-6	1 (Even)	Valid
// Sample Input
// 8
// Sample Output
// Even

// C Program:
// #include<stdio.h>
// void isevenodd(int m){
//     if(m%2==0){
//         printf("Even");
//     }else{
//         printf("Odd");
//     }
// }
//     int main(){
//         int n;
//         printf("Enter the number : ");
//         scanf("%d",&n);
//         isevenodd(n);
//     }

// Q.3 Program to reverse a number using function
// -------------------------------------------
// Function Signature :-
// ----------------------
// -> Return Type: int (Returns the reversed number)
// -> Function Name: reverseNumber()
// -> Arguments: int num

// Test Cases :-
// -------------
// Test Case	Input	Expected Output	Result
// ----------------------------------------------
// Test-Case-1	123	321		Valid
// Test-Case-2	0	0		Valid
// Test-Case-3	-456	-654		Valid
// Test-Case-4	100	1		Valid
// Test-Case-5	8901	1098		Valid
// Sample Input
// 123
// Sample Output
// 321

// C Program:
// #include<stdio.h>
// int reverse(int m){
//     int r,rev=0;
//     while (m)
//     {
//     r=m%10;
//     rev=rev*10+r;
//     m=m/10;
//     }
//     printf("The reverse is : %d",rev);
// }
// int main(){
//     int n;
//     printf("Enter the number : ");
//     scanf("%dd",&n);
//     reverse(n);
// }

// Q.4 Create a function to check if a string contains only digits.
// Input:
// String: 12345
// Output:
// The string contains only digits.
// Input:
// String: 45A7
// Output:
// The string contains non-digit characters.
// Explanation:
// -----------------------------------------------------
// The containsOnlyDigits function takes a character array (string) str as input and returns a boolean value (true if the string contains only digits, false otherwise).

// The function uses a for loop to iterate through the characters of the string. The loop runs until it encounters the null character \0, which marks the end of the string.

// In each iteration, the function checks if the current character str[i] is a digit using the isdigit function from the <ctype.h> library. The isdigit function returns a non-zero value if the character is a digit (0 to 9), and it returns 0 otherwise.

// If the current character is not a digit (i.e., isdigit(str[i]) returns 0), the function immediately returns false, indicating that the string contains non-digit characters.

// If the loop completes without finding any non-digit characters, the function returns true, indicating that the string contains only digits.

// The main function asks the user to input a string and calls the containsOnlyDigits function with the given input. It then prints whether the input string contains only digits or not.
// Sample Input
// 1234
// Sample Output
// The string contains only digits.

// C Program:
// #include<stdio.h>
// #include<string.h>
// void isdigit1(int ch[])
// {
//     int length=strlen(ch);
//     int a=1;
//     for(int i=0;i<length;i++){
//         if((ch[i]>='A' && ch[i]<='Z') || (ch[i]>='a' && ch[i]<='z'))
//         {
//             a=0;
//             break;
//         }
//     }
//     if(a==1){
//         printf("The string contains only digits.");
//     }else{
//         printf("The strings contains non-digit characters.");
//     }
// }
// int main()
// {
//     char ch[100];
//     scanf("%s",&ch);
//     isdigit1(ch);
// }


// Q.5 [USING FUNCTION AND POINTER]
// Write a program in C to swap elements using call by reference.
// -> create int main() function.
// -> create void swap(int *a, int *b, int *c) function.
// -> in main function read value for a,b,c and call the swap function by passing addresses of all three variable.
// -> NOTE : print the result before swap and after swap in main function only.
// Sample input : a = 5 , b = 6 , c = 7;

// Sample output :

// The value before swapping are :
// a = 5
// b = 6
// c = 7
// The value after swapping are :
// a = 7
// b = 5
// c = 6
// Sample Input
// 5
// 6
// 7
// Sample Output
// The value before swapping are:
// a = 5
// b = 6
// c = 7

// The value after swapping are:
// a = 7
// b = 5
// c = 6

// C Program:

// Q.6 Write a c program to check the give string is palindrome or not using function
// Sample Input
// madam
// Sample Output
// The string madam is a palindrome.

// C Program:
// #include<stdio.h>
// #include<string.h>
// int ispalindrome(char xyz[30]){
//     int leng = strlen(xyz);
//     for(int i=0;i<leng;i++){
//         if(xyz[i] != xyz[leng-i-1]){
//             printf("The string %s is not a palindrome.",xyz);
//             return 0;
//         }
//     }
//     printf("The string %s is a palindrome.",xyz);
// }
// int main()
// {
//     char abc[30];
//     printf("Enter the string name : ");
//     scanf("%s",abc);
//     ispalindrome(abc);
// }

// Q.7 Write a program in C to print separately the  odd and even integers 

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

// Q.8 Sum of Elements
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

// Q.9 Write a C program to store some integers in an array and print all the prime numbers available in that array


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
//     int n,a[20],temp=0;
//     scanf("%d",&n);
//     if(n<0){
//         printf("Invalid Array size.");
//         return 0;
//     }
//     for(int i=0;i<n;i++)
//     {
//         scanf("%d",&a[i]);
//         int c=0;
//         for(int j=1;j<=a[i];j++){
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

// Q.10 ReverseArray
// Write a program in C to read n number of values in an array and display it in reverse order.

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
// #include<stdio.h>
// int main(){
//     int a[20],n,i;
//     scanf("%d",&n);
    //printf("Enter %d integers : ",n);
//     if(n<0){
//         printf("Invalid Array Size.");
//         return 0;
//     }
//     for(i=0;i<n;i++)
//     scanf("%d",&a[i]);
//     printf("The values stored into the array in reverse are:\n");
//     for(n--;n>=0;n--){
//         printf("%d ",a[n]);
//     }
// }

// Q.11 Write a program in C to store elements in an array and print it.

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