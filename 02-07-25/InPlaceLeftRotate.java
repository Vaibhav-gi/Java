// InPlaceLeftRotate

// 🧾  Problem Title: In-Place Left Rotation of an Array by One
// 📄 Problem Statement:
// Write a Java program that reads an array of integers from the user and performs a left rotation by one position.
// In a left rotation, the first element moves to the end, and all other elements shift one position to the left.

// The rotation must be done in-place, meaning no extra arrays should be used.

// 📘 Input Format:
// An integer n representing the size of the array.

// n space-separated integers representing the array elements.

// 📤 Output Format:
// Print the array after performing the left rotation by one position, with elements separated by a space.

// ✅ Constraints:
// 1 <= n <= 100

// -1000 <= arr[i] <= 1000

// 🧪 Sample Input:
// yaml
// Copy
// Edit
// Enter size of array: 5
// Enter 5 integers:
// Element 1: 10
// Element 2: 20
// Element 3: 30
// Element 4: 40
// Element 5: 50
// 📤 Sample Output:
// sql
// Copy
// Edit
// Array after left rotation:
// 20 30 40 50 10
// 💡 Explanation:
// The original array is:

// Copy
// Edit
// 10 20 30 40 50
// After left rotation by 1:

// Copy
// Edit
// 20 30 40 50 10
// Let me know if you'd like to add:

// Multiple rotations (k positions)

// Rotation direction selection (left/right) at runtime

// Support for string or character arrays
// Sample Input
// 4
// 1
// 2
// 3
// 4
// Sample Output
// Array after left rotation:
// 2 3 4 1

// Java Program :
import java.util.Scanner;
class InPlaceLeftRotate
{
    public static int [] leftShift(int[] a)
    {
            int temp = a[0];
            for (int i=0;i<a.length-1;i++)
            {
                a[i] = a[i+1];
            }
            a[a.length-1] = temp;
            return a;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int size = sc.nextInt();
        int [] a = new int[size];
    
        for(int i = 0;i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }

       int[] b = leftShift(a);
        System.out.println("Array after left rotation:");
         for(int i = 0;i<=a.length-1;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}

