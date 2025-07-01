// Q. Print all elements in reverse order of an Array.

// Enter number of elements: 5
// Enter 5 elements:
// 1
// 2
// 3
// 4
// 5
// Output as: 5 4 3 2 1 
// Sample Input
// 5
// 1
// 2
// 3
// 4
// 5
// Sample Output
// Output as: 5 4 3 2 1 

// Java Program :
import java.util.Scanner;
public class ReverseArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
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

System.out.print("Output as: ");
        for (int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
}
