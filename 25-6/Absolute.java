// Q.WAPTP Absolute Value of a given number.

// Input: -12 → Absolute = 12
// Input: 12 → Absolute = 12
// Sample Input
// -12
// Sample Output
// Absolute = 12

// Java Program :
import java.util.Scanner;
class Absolute
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        if (n<0)
        {
        n = (-n);
        }
        System.out.println("Absolute = "+n);
    }
}