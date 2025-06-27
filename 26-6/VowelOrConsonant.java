// Q. VowelOrConsonant
// Write a program to input any alphabet and check whether it is vowel or consonant.
// Sample Input
// A
// Sample Output
// A is a vowel.

// Java Program :
import java.util.Scanner;
class VowelOrConsonant
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Alphabet : ");
        char a = sc.next().charAt(0);

        if(('A'<= a && a<='Z')||('a'<= a && a<= 'z'))
        {
            if(('A'== a  || 'E'== a || 'I'== a || 'O'== a || 'U'== a) || ('a'== a  || 'e'== a || 'i'== a || 'o'== a || 'u'== a) )
            {
                System.out.println(a+" is a vowel.");
            }
            else{
                System.out.println(a+" is a consonant.");
            }
        }
        else
        {
            System.out.println("Invalid input. Please enter an alphabet (a-z or A-Z).");
        }
    }
}