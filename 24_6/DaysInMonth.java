// Q. WAPTP number of days in Month for the given month number.
// please keep in mind that given year is leap year or not.

// Input: 
// 2, 2020 → 29 days
// Sample Input
// 2
// 2020
// Sample Output
// 29 days

// Java Program :
import java.util.Scanner;
class DaysInMonth
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month : ");
        int month = sc.nextInt();

        if(month>12 || month<0)
        {
            System.out.println("Invalid month number");
            return ;
        }

        System.out.print("Enter the year : ");
        int year = sc.nextInt();

        
        switch(month)
        {
             case 1 : 
            System.out.println("31 days");
            break;

            case 2 : 
            if ((year % 400 == 0) || (year % 100!=0) && (year % 4 ==0 ))
            {
                 System.out.println("29 days");
            }
            else
            {
                 System.out.println("28 days");
            }
            break;

            case 3 : 
            System.out.println("31 days");
            break;
            case 4 : 
            System.out.println("30 days");
            break;
            case 5 : 
            System.out.println("31 days");
            break;
            case 6 : 
            System.out.println("30 days");
            break;
            case 7 : 
            System.out.println("31 days");
            break;
            case 8 : 
            System.out.println("31 days");
            break;
            case 9 : 
            System.out.println("30 days");
            break;
            case 10 : 
            System.out.println("31 days");
            break;
            case 11 : 
            System.out.println("30 days");
            break;
            case 12 :
            System.out.println("31 days");
            break;
            
        }
    }
}