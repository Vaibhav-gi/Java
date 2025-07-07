// SearchElementInArray
// Q. Write a java program to search given element is present in array or not.
// Example1 :
// input    : [1,2,3,4,6,4,7,3,4]
// element  : 4
// output   : 4 is present at index 3.

// Example2 :
// input    : [1,2,3,4,6,4,7,3,4]
// element  : 5
// output   : 5 is not present in array.

// Testcase 1:-

// Enter number of elements: 9
// Enter 9 integers:
// 1
// 2
// 3
// 4
// 6
// 4
// 7
// 3
// 4
// Enter element to search: 4

// Expected Output:-

// 4 is present at index 3.

// Sample Input
// 9
// 1
// 2
// 3
// 4
// 6
// 4
// 7
// 3
// 4
// 4
// Sample Output
// 4 is present at index 3.

// Java program :
import java.util.Scanner;
class SearchElementInArray
{ 
    public static int SearchElement(int[] a,int num)
    {
        for(int i=1;i<=a.length-1;i++)
        {
            if(a[i] == num)
            return i;
        }
        return -1;
    }
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the array size : ");
    int size = sc.nextInt();
    if(size < 0)
    {
        System.out.println("Array size must be greater than 0.");
        return ;
    }
    int [] a = new int[size];
    System.out.print("Enter "+size+" integers: ");
    for(int i=0;i<=a.length-1;i++)
    {
        a[i] = sc.nextInt();
    }
    System.out.print("Enter element to search: ");
    int element = sc.nextInt();
    int index = SearchElement(a,element);
    if(index > 0)
    {
        System.out.println(element + " is present at index "+index + ".");
    }
    else
    {
        System.out.println(element +" is not present in array.");
    }
    }
}
