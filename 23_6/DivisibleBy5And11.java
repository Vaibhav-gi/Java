// Q.1 WAPTC given number is Divisible by 5 & 11?

// Input: 
// 55 → Divisible by both; 
// 20 → Divisible by 5 only
// 22 → Divisible by 11 only
// Sample Input
// 55
// Sample Output
// Divisible by both 5 and 11

// Java Program:
import java.util.Scanner;
class DivisibleBy5And11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        if (n%5==0 && n%11==0)
        {
            System.out.println("Divisible by both 5 and 11");
        }
        else if (n%5 == 0)
        {
            System.out.println("Divisible by 5 only");
        }
        else if(n%11==0){
             System.out.println("Divisible by 11 only");
        }
        else {
            System.out.println("Not divisible by 5 or 11");
        }
    }
}