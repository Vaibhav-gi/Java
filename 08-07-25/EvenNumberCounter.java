// EvenNumberCounter
// Count Even Numbers in an Array
// Q. Write a Java program that takes an array of integers as input and prints the count of even numbers in the array.
// Example:
// Input: {2, 5, 8, 9, 12}
// Output: 3

// Test case 1:-
// -----------------
// Enter number of elements in the array: 5
// Enter 5 integers:
// 2
// 5
// 8
// 9
// 12
// Count of even numbers: 3
// Sample Input
// 5
// 2
// 5
// 8
// 9
// 12
// Sample Output
// Count of even numbers: 3

// Java Program :

import java.util.Scanner;
class EvenNumberCounter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        if(size < 0)
        {
            System.out.println("Invalid Array Size.");
            return ;
        }
        System.out.println("Enter "+size+" integers");
        int [] arr = new int[size];
        for(int i=0;i<=arr.length-1;i++)
        {
            arr[i] = sc.nextInt();
        }
        int c = 0;
        System.out.print("Count of even numbers: ");
        for (int i=0;i<=arr.length-1;i++)
        {
            if(arr[i]%2==0)
            {
                c++;
            }
        }
        System.out.print(c);
    }
}