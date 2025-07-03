// MergeTwoArrays
// Write a Java program to merge two integer arrays into a single new array. 
// The merged array should contain all elements of the first array followed by all elements of the second array.

// Example1 :
// input :  
// [1,2,3,4,5]
// [6,7,8,9,10]

// output : 
// [1,2,3,4,5,6,7,8,9,10]


// Example2 :
// input :
// [1,2]
// [10,20,30]

// output :
// [1,2,10,20,30]

// Testcase 1:-

// Enter number of elements in first array: 3
// Enter 3 elements of first array:
// 1
// 2
// 3
// Enter number of elements in second array: 4
// Enter 4 elements of second array:
// 4
// 5
// 6
// 7


// Expected output:-
// -----------------
// Merged Array: [1, 2, 3, 4, 5, 6, 7]

// -----------------
// Testcase 2:-

// Enter number of elements in first array: 2
// Enter 2 elements of first array:
// 4
// 5
// Enter number of elements in second array: 3
// Enter 3 elements of second array:
// 1
// 2
// 3

// Expected output:-
// ----------------
// Merged Array: [4, 5, 1, 2, 3]
// Sample Input
// 3
// 1
// 2
// 3
// 4
// 4
// 5
// 6
// 7
// Sample Output
// Merged Array: [1, 2, 3, 4, 5, 6, 7]

// Java Program :
import java.util.*;
class MergeTwoArrays
{
    public static int[] mergeArrays(int [] a, int [] b)
    {
        int [] c = new int[a.length+b.length];
        for(int i = 0;i<=c.length-1;i++)
        {
            if(i<=a.length-1)
            {
                c[i] = a[i];
            }
            else{
                c[i] = b[i-a.length];
            }
        }
        return c;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first array size : ");
        int size1 = sc.nextInt();
        if(size1<0)
        {
            System.out.println("Invalid Array size.");
            return ;
        }
        int [] a = new int[size1];
        System.out.println("Enter first array elements one by one : ");
        for (int i = 0;i<=a.length-1;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter second array size : ");
        int size2 = sc.nextInt();
        int [] b = new int[size2];
        System.out.println("Enter second array elements one by one : ");
        for (int i = 0;i<=b.length-1;i++)
        {
            b[i] = sc.nextInt();
        }
        int [] c = mergeArrays(a,b);
        System.out.print("Merged Array: ");   
        System.out.print(Arrays.toString(c));
    }
}