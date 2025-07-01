// Q. Problem: Insert and Display Array Elements
// 📄 Problem Statement:
// Write a Java program that takes a number n from the user representing the size of an array. Then, prompt the user to enter n integer values to store in the array. After taking all inputs, display the elements of the array with their indices.

// 📘 Description:
// You need to create an integer array of a user-defined size.

// Take n integer inputs from the user and store them in the array.

// Finally, print each element along with its index.

// ✅ Input:
// An integer n (size of the array)

// n integers representing the elements of the array

// 📤 Output:
// Print all elements of the array with their indices in the format:

// arr[0] = value0
// arr[1] = value1
// ...
// arr[n-1] = valueN
// 🔎 Example:
// Input:
// Enter the size of the array: 4
// Enter 4 integers:
// Element 1: 12
// Element 2: 25
// Element 3: 7
// Element 4: 30
// Output:

// Elements in the array:
// arr[0] = 12
// arr[1] = 25
// arr[2] = 7
// arr[3] = 30
// Sample Input
// 5
// 4
// 5
// 6
// 1
// 2
// Sample Output
// Elements in the array:
// arr[0] = 4
// arr[1] = 5
// arr[2] = 6
// arr[3] = 1
// arr[4] = 2

// Java Program : 
import java.util.Scanner;
class UserInputArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();
        if(size<0)
        {
            System.out.println("Negative size not allowed.");
            return ;
        }
        System.out.println("Enter the elements : ");
        int [] a = new int[size];
        for(int i= 0; i<=a.length-1;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Elements in the array:");
        for(int i= 0; i<=a.length-1;i++)
        {
            System.out.println("arr["+i+"] = "+a[i]);
        }
    }
}