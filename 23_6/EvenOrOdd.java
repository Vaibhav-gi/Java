// Q. Write a java program to find the given number is odd or even
// Input: 
// 12 → Even number 
// 7 → Odd number
// Sample Input
// 12
// Sample Output
// Even number

// Java Program:
import java.util.Scanner;
class EvenOrOdd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n= sc.nextInt();
        
        if(n%2==0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }
    }
}