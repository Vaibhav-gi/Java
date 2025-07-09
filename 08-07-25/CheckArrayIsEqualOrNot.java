// CheckArrayIsEqualOrNot

// Q. Write a Java program to check whether two integer arrays are equal.
// -> Two arrays are considered equal if:
//    They have the same length & All elements at the same positions.

// Example1 :
// input    :
// arr1     : [1,2,3,4,5]
// arr2     : [1,2,3,4,5]
// output   : Equal


// Example2 :
// input    :
// arr1     : [1,2,3,4,5]
// arr2     : [5,2,3,4,1]
// output   : Not Equal


// Example3 :
// input    :
// arr1     : [2,3,1]
// arr2     : [2,3,1,1]
// output   : Not Equal

// Testcase 1:-
// Enter number of elements in first array: 4
// Enter elements of first array:
// 1
// 2
// 3
// 4
// Enter number of elements in second array: 4
// Enter elements of second array:
// 1
// 2
// 3
// 4

// Expected Output :-


// Equal

// Sample Input
// 4
// 1
// 2
// 3
// 4
// 4
// 1
// 2
// 3
// 4
// Sample Output
// Equal

// Java Program :
import java.util.Scanner;
public class CheckArrayIsEqualOrNot
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of first array : ");
        int size = sc.nextInt();
        System.out.println("Enter elements of first array:");
        int [] arr = new int[size];
        for (int i=0;i<=arr.length-1;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter the size of second array : ");
        int size1 = sc.nextInt();
        System.out.println("Enter elements of second array:");
        int[] arr1 = new int[size1];

        for(int i=0;i<size1;i++)
        {
            arr1[i] = sc.nextInt();
        }
        if(size != size1)
        {
            System.out.println("Not Equal");
            return;
        }
        else
        {
            for(int i=0;i<size1;i++)
            {
                if(arr[i] != arr1[i])
                {
                    System.out.println("Not Equal");
                    return;
                }
            }
            System.out.println("Equal");
        }
    }
}