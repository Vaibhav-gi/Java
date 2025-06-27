// Q. WAPTP Character Type of a given character.

// Digit, Uppercase, Lowercase, or Special

// Input: 
// 9 → Digit; 
// # → Special character
// A → Uppercase 
// b → Lowercase
// Sample Input
// 9
// Sample Output
// Digit

// Java Program:
import java.util.Scanner;
class CharacterType
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the Character : ");
        char ch = a.next().charAt(0);
        if (ch >= '0' && ch<='9')
        {
            System.out.println("Digit");
        }
        else if(ch >= 'A' && ch <= 'Z' )
        {
            System.out.println("Uppercase");
        }
        else if (ch >= 'a' && ch <= 'z')
        {
            System.out.println("Lowercase");
        }
        else
        {
            System.out.println("Special character");
        }
    }
}