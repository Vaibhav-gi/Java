// Q. Write a java program print all palindrome numbers between a given range

// Enter start of range: 100
// Enter end of range: 150

// Palindrome numbers between 100 and 150 are:
// 101 111 121 131 141
// Sample Input
// 100
// 200
// Sample Output
// Palindrome numbers between 100 and 200 are:
// 101 111 121 131 141 151 161 171 181 191 

// Java Program : 
import java.util.Scanner;
class TestPalindromeInRange
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter start of range: ");
        int start = sc.nextInt();
        
        System.out.print("Enter end of range: ");
        int end = sc.nextInt();
        
        System.out.println("Palindrome numbers between " + start + " and " + end + " are:");
        
        for(int n = start; n <= end; n++)
        {
            int temp = n;
            int rev = 0;
            
            while(temp > 0)
            {
                int digit = temp % 10;
                rev = rev * 10 + digit;
                temp = temp / 10;
            }
            
            if(n == rev)
            {
                System.out.print(n + " ");
            }
        }
    }
}
