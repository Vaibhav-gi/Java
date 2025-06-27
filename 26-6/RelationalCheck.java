// Q. RelationalCheck
// WAPTP Relational Check between given two numbers.

// logic :
// Compare n and m: output lesser, equal, or greater
// Input: 3, 4 → 3 is less than 4 
// Input: 5, 4 → 5 is more than 4 
// Input: 4, 4 → 4 is equal to  4
// Sample Input
// 3
// 4
// Sample Output
// 3 is less than 4

// Java Program :
import java.util.Scanner;
class RelationalCheck
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number : ");
        int num2 = sc.nextInt();

        if(num1 > num2)
        {
            System.out.println(num1 +" is more than "+num2);
        }
        else if(num2 > num1)
        {
            System.out.println(num1 +" is less than "+num2);
        }
        else
        {
            System.out.println(num1 +" is equal to "+num2);
        }
    }
}
