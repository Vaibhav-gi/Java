// Q. Problem: Find the Smallest Element in an Array
// 📄 Problem Statement:
// Write a Java program that takes a number n from the user, then reads n integer elements into an array. The program should then find and display the smallest element present in the array.

// 📘 Description:
// Read the size of the array from the user.

// Accept n integers and store them in an array.

// Traverse the array to find the smallest element.

// Display the smallest element to the user.

// ✅ Input:
// An integer n (the size of the array)

// n integers as elements of the array

// 📤 Output:
// A single line displaying the smallest element in the array.

// 🔎 Example:
// Input:

// Enter the size of the array: 5
// Enter 5 integers:
// Element 1: 22
// Element 2: 5
// Element 3: 19
// Element 4: 3
// Element 5: 9
// Output:

// Smallest element in the array is: 3
// Sample Input
// 5
// 1
// 2
// 3
// 4
// 5
// Sample Output
// Smallest element in the array is: 1

// Java Program :

import java.util.Scanner;
class FindMinElement{
    public static int maxOfArray(int[] a)
    {
        int max = a[0];
        for(int i=1;i<=a.length-1;i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
        }
        return max;
    }
    public static int minOfArray(int [] a)
    {
        int min = a[0];
        for(int i=1;i<=a.length-1;i++)
        {
            if(a[i]<min)
            {
                min = a[i];
            }
        }
        return min;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int size = sc.nextInt();
        
        if(size<0){
            System.out.println("Negative size not allowed.");
            return ;
        }
        int [] a = new int[size];
        System.out.println("Enter the array elements one by one : ");
        for (int i=0;i<=a.length-1;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Smallest element in the array is: "+minOfArray(a));
    }
    
}