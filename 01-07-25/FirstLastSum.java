// Q. Write a program to add the last and first element of a given array.


// Enter the number of elements in the array: 5
// Enter 5 elements:
// 1
// 2
// 3
// 4
// 5
// Output: 6
// Sample Input
// 5
// 1
// 2
// 3
// 4
// 5
// Sample Output
// Output: 6

// Java Program : 
import java.util.Scanner;
class FirstLastSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();
        if(size<0)
        {
            System.out.println("Invalid Array size.");
            return ;
        }
        int [] a = new int[size]; 
        for (int i=0;i<=a.length-1;i++)
        {
            a[i] = sc.nextInt();
        }

        int sum=a[0]+a[a.length-1];
        
        System.out.print("Output: "+sum);
    }
}