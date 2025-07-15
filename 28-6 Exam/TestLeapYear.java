// Q. Check Leap Year
// Write a Java program that takes a year as input and prints whether it is a leap year or not using if-else statements.
// Sample Input
// 2024
// Sample Output
// Leap year


// Java Program :
import java.util.Scanner;
class TestLeapYear
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = sc.nextInt();

        if((year % 400 ==0 ) || (year % 4 == 0) && (year % 100 !=0))
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not a leap year");
        }
    }
}