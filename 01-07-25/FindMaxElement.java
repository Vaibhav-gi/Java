// Q. Find Maximum Element in an Array
// Write a Java program to find and print the largest element in a given integer array.
// Example:
// Input: {4, 7, 1, 9, 2}
// Output: 9
// Sample Input
// 5
// 4
// 7
// 1
// 9
// 2
// Sample Output
// Maximum element: 9

// Java Program :

import java.util.Scanner;
class FindMaxElement{
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
        int [] a = new int[size];
        System.out.println("Enter the array elements one by one : ");
        for (int i=0;i<=a.length-1;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Maximum element: "+maxOfArray(a));
    }
    
}