// Q. Write a program to input basic salary of an employee and calculate its Gross salary according to following:

// Basic Salary <= 10000 : HRA = 20%, DA = 80%
// Basic Salary <= 20000 : HRA = 25%, DA = 90%
// Basic Salary > 20000 : HRA = 30%, DA = 95%
// Sample Input
// 8000
// Sample Output
// 16000.00

// Java Program : 

import java.util.Scanner;
class GrossSalaryCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the basic salary : ");
        int basicsalary = sc.nextInt();

        if(basicsalary <= 10000)
        {
            double hra=basicsalary*0.20;
            double da=basicsalary*0.80;
            double Grosssalary = basicsalary + hra + da;
            System.out.printf("Gross Salary = %.2f",Grosssalary );
        }
        else if(basicsalary <= 20000)
        {
            double hra=basicsalary*0.25;
            double da=basicsalary*0.90;
            double Grosssalary = basicsalary + hra + da;
            System.out.printf("Gross Salary = %.2f",Grosssalary );
        }
        else
        {
            double hra=basicsalary*0.30;
            double da=basicsalary*0.95;
            double Grosssalary = basicsalary + hra + da;
            System.out.printf("Gross Salary = %.2f",Grosssalary );
        }
    }
}