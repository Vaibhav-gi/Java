// MoveZerosToEnd
//  Problem: Move All Zeros to the End
//  Problem Statement:
// Write a Java program that moves all the zeros in an array to the end, while maintaining the relative order of non-zero elements.

// Your program must:

// Accept 5 test cases from the user.

// For each test case:

// Read the array size.

// Accept the elements of the array.

// Display the original array.

// Move all zeros to the end of the array.

// Print the modified array.

//  Input Format:
// For each test case:

// First line contains a single integer n (1 ≤ n ≤ 100) — the number of elements in the array.

// Second line contains n integers (both zero and non-zero values).

//  Output Format:
// For each test case:

// Print "Original Array: " followed by the input array.

// Then print "After Moving Zeros to End: " followed by the modified array.
// Sample Input
// 5
// 0
// 1
// 0
// 3
// 12
// Sample Output
// Original Array: 0 1 0 3 12 
// Array After Moving Zeros to End: 1 3 12 0 0 

// Java Program :

import java.util.Scanner;
import java.util.Arrays;

public class MoveZerosToEnd
{
    // By creating extra array By
    public static int[] MoveZerosToEnd(int [] a)
    {
        int [] b = new int[a.length];
        int index = 0;
        for (int i=0;i<=a.length-1;i++)
        {
            if(a[i]!=0)
            {
                b[index] = a[i];
                index++;
            }
        }
        return b;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int size = sc.nextInt();
        int [] a = new int[size];
        System.out.print("Enter the array elements : ");
        for(int i=0;i<=a.length-1;i++)
        {
            a[i] = sc.nextInt();
        }
            System.out.print("Original Array: ");
            for(int i=0;i<=a.length-1;i++)
            {
                System.out.print(a[i] + " ");
            }
            System.out.println("");
            System.out.print("Array After Moving Zeros to End: ");
            int arr[] = MoveZerosToEnd(a);
            for(int i=0;i<=arr.length-1;i++)
            {
                System.out.print(arr[i]+" ");
            }
    
    }
}