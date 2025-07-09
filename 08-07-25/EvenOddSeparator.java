// EvenOddSeparator
// Q. Write a java program to print all even elements and odd elements 
// separately from an array.

// Enter number of elements: 7
// Enter 7 elements:
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// Even elements are : 2 4 6 
// Odd elements are : 1 3 5 7 
// Sample Input
// 7
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// Sample Output
// Even elements are : 2 4 6
// Odd elements are : 1 3 5 7

// Java Program :

import java.util.Scanner;
class EvenOddSeparator
{
     public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int size= sc.nextInt();
       
        if(size<0)
        {
            System.out.println("Invalid Array size.");
            return;
        }
        int []a=  new int[size];
        for(int i=0;i<=size-1;i++)
        {
         a[i]=sc.nextInt();
        }

         System.out.print("Even elements are : ");
             for(int i=0;i<=size-1;i++)
            {
                 if(a[i]%2==0)
                 {
System.out.print(a[i]+" ");
                 }
            }

        System.out.print("\nOdd elements are : ");
             for(int i=0;i<=size-1;i++)
            {
                 if(a[i]%2!=0)
                 {
                    System.out.print(a[i]+" ");
                 }
            }
    }
}
