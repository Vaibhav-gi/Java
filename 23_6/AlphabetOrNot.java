// Q. WAPTP given Character is Alphabet?

// Input: 
// @ → Not an alphabet 
// G → Alphabet
// Sample Input
// G
// Sample Output
// Alphabet

// Java Program: 
import java.util.Scanner;
class AlphabetOrNot
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Alphabet : ");
        char n = sc.next().charAt(0);

        if ((n>='A' && n<='Z')||(n>='a' && n<='z'))
        {
            System.out.println("Alphabet");
        }
        else
        {
            System.out.println("Not an alphabet");
        }
    }
}