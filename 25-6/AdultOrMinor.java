// Q. :WAPTP Adult or Minor?(age>=18)

// Input: 
// 17 → Minor 
// 20 → Adult
// Sample Input
// 17
// Sample Output
// Minor

// Java Program :
import java.util.Scanner;
class AdultOrMinor
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Age : ");
        int age = sc.nextInt();

        if (age >= 18)
        {
            System.out.println("Adult");
        }
        else
        {
            System.out.println("Minor");
        }
    }
}