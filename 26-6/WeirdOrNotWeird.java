// Q. The "Weird Not Weird" problem.

// Rules for determining "Weird" or "Not Weird":
// ---------------------------------------------
// If N is odd, print "Weird".
// If N is even and in the inclusive range of 2 to 5, print "Not Weird". 
// If N is even and in the inclusive range of 6 to 20, print "Weird". 
// If N is even and greater than 20, print "Not Weird".

// Input: 3 → Weird 
// Sample Input
// 3
// Sample Output
// Weird

// Java Program : 
import java.util.Scanner;
class WeirdOrNotWeird
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        if (n%2 == 0)
        {
            if (n>=2 && n<=5)
            {
                System.out.println("Not Weird");
            }
            else if(n>=6 && n<=20)
            {
                System.out.println("Weird");
            }
            else{
                System.out.println("Not Weird");
            }
        }
        else 
        {
            System.out.println("Weird");
        }
    }
}