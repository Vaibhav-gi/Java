// Q. WAPTP given year is Leap Year or not.
// Identify if a given year is a leap year.

// Input: 
// 2024 → Leap year
// 1900 → Not a leap year
// Sample Input
// 2024
// Sample Output
// Leap year

// Java Program : 
import java.util.Scanner;
class LeapYear
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year : ");
        int year = sc.nextInt();

        if ((year % 400 == 0) || (year % 100!=0) && (year % 4 ==0 ))
        {
        System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not Leap Year");
        }
    }
}