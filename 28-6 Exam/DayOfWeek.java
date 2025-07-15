// Q. Day of the Week
// Write a Java program that takes a number (1 to 7) as input and prints the corresponding day of the week using a switch-case statement (e.g., 1 for Monday, 2 for Tuesday, etc.).
// Sample Input
// 1
// Sample Output
// Monday

// Java Program : 
import java.util.Scanner;
class DayOfWeek
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Day Number : ");
        int day = sc.nextInt();

        switch(day)
        {
            case 1 : System.out.println("Monday"); break;
            case 2 : System.out.println("Tuesday"); break;
            case 3 : System.out.println("Wednesday"); break;
            case 4 : System.out.println("Thursday"); break;
            case 5 : System.out.println("Friday"); break;
            case 6 : System.out.println("Saturday"); break;
            case 7 : System.out.println("Sunday"); break;
            default : { System.out.println("Invalid input! Please enter a number from 1 to 7.");
  }
        }
    }
}