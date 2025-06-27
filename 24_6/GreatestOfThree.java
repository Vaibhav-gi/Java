// Q. Write a java program to perform  Greatest of Three given numbers.

// Input: 
// 7,14,9 → Greatest: 14
// 16,14,9 → Greatest: 16
// Sample Input
// 7
// 14
// 9
// Sample Output
// Greatest: 14

// Java Program : 
import java.util.Scanner;
class GreatestOfThree
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        System.out.print("Enter the third number : ");
        int c = sc.nextInt();
        int big = a;
        
        if (a==b && b==c && c==a)
        {
            big=a;
        }
        if (b>big)
        {
            big=b;
        }
        if (c>big)
        {
            big=c;
        }
        System.out.println("Greatest: "+big);
    }
}