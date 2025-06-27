// Q. Positive or Negative?
// Description: Check if a number is positive, negative, or zero

// Input: 35
// Output: Number is positive

// Input: -3
// Output: Number is negative

// Input: 0
// Output: Number is zero
// Sample Input
// 35
// Sample Output
// Number is positive

// Java Program :
import java.util.Scanner;
class PositiveOrNegative
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        if(n==0)
        {
            System.out.println("Number is zero");
        }
        else if(n>=0)
        {
            System.out.println("Number is positive");
        }
        else
        {
            System.out.println("Number is negative");
        }
    }
}