// Q. WAPTP Grade Calculator. take marks(out of 100) from user.
// Grade range :- A to E
// 90 - 100 → Grade A
// 80 - 89 → Grade B
// 70 - 79 → Grade C
// 50 - 69 → Grade D
// 35 - 49 → Grade E
// 0 - 34 → Grade F
// if marks out of range -> invalid input 
// Input:
// 50  →   grade D
// 78  →   grade C
// Sample Input
// 50
// Sample Output
// Grade D

// Java Program :
import java.util.Scanner;
class GradeCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Marks : ");
        int marks = sc.nextInt();

        if (marks > 100)
        {
            System.out.println("Invalid input");
        }
        else if (marks >= 90)
        {
            System.out.println("Grade A");
        }
        else if (marks >= 80)
        {
            System.out.println("Grade B");
        }
        else if (marks >= 70)
        {
            System.out.println("Grade C");
        }
        else if (marks >= 50)
        {
            System.out.println("Grade D");
        }
        else if (marks >= 35)
        {
            System.out.println("Grade E");
        }
        else if (marks <= 34)
        {
            System.out.println("Grade F");
        }
    }
}