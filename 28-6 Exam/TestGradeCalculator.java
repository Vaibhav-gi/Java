// Q. . Grade Calculation
// Write a Java program that takes a student’s marks as input and prints the corresponding grade using if-else-if statements. Use the following grading scheme:
// •	90 and above: A
// •	80 to 89: B
// •	70 to 79: C
// •	60 to 69: D
// •	Below 60: F
// Sample Input
// 50
// Sample Output
// Grade D

// Java Program :
import java.util.Scanner;
class TestGradeCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks : ");
        int marks = sc.nextInt();

        if(marks > 100){
            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
        }
        else if(marks >= 90)
        {
            System.out.println("Grade A");
        }
        else if(marks >= 80)
        {
            System.out.println("Grade B");
        }
        else if(marks >= 70)
        {
            System.out.println("Grade C");
        }
        else if(marks >= 60)
        {
            System.out.println("Grade D");
        }
        else
        {
            System.out.println("Grade F");
        }
    }
}