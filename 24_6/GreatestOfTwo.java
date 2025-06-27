// Write a java program to find the maximum number among two numbers

// Input: 25, 30 → Greater: 30
// Input: 15, 10 → Greater: 15
// Sample Input
// 25
// 30
// Sample Output
// Greater: 30

// Java Program : 
import java.util.Scanner;
class GreatestOfTwo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second52 number : ");
        int b = sc.nextInt();

        if (a>b)
        {
            System.out.println("Greater: "+a+"");
        }
        else if (b>a)
        {
            System.out.println("Greater: "+b+"");
        }
        else
        {
            System.out.println("Both numbers are equal.");
        }
    }
}