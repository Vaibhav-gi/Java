// InPlaceRightRotate
// Problem Title: Right Rotate an Array by One (In-Place)
// 📄 Problem Statement:
// Write a Java program that takes an integer array as input and performs a right rotation by one position. In a right rotation, the last element moves to the first position, and all other elements shift one position to the right.

// The rotation must be performed in-place, i.e., without using any additional arrays.

// 📘 Input Format:
// An integer n representing the size of the array.

// n integers representing the elements of the array.

// 📤 Output Format:
// The array after rotating it to the right by one position, with elements space-separated on a single line.

// ✅ Constraints:
// 1 <= n <= 100

// -1000 <= arr[i] <= 1000

// 🧪 Sample Input:


// Enter size of array: 5
// Enter 5 integers:
// Element 1: 10
// Element 2: 20
// Element 3: 30
// Element 4: 40
// Element 5: 50
// 📤 Sample Output:


// Array after right rotation:
// 50 10 20 30 40
// 💡 Explanation:
// Original Array: 10 20 30 40 50

// After Right Rotation: 50 10 20 30 40

// Let me know if you'd like a version for:

// Left rotation

// Rotation by k positions

// Allowing the user to choose rotation direction at runtime
// Sample Input
// 5
// 10
// 20
// 30
// 40
// 50
// Sample Output
// Array after right rotation:
// 50 10 20 30 40 

// Java Program :
import java.util.Scanner;
class InPlaceRightRotate
{
    public static int [] rightShift(int[] a,int n)
    {
        for(int x = 1;x<=n;x++)
        {
            int temp = a[a.length-1];
            for(int i = a.length-2;i>=0;i--)
            {
                a[i+1] = a[i];
            }
            a[0] = temp;
        }
        return a;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        
        int []a = new int[size];
          
        for(int i = 0;i<=a.length-1;i++)
        {
            a[i] = sc.nextInt();
        }
        
        a = rightShift(a, 1);
        System.out.println("Array after right rotation:");
        for(int i = 0;i<size;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}