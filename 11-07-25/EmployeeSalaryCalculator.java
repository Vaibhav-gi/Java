// EmployeeSalaryCalculator
// Create a class Employee (BLC Class)

// Attributes:

// names           		datatype
// --------    	       -----------
// hoursWorked        :double
// hourlyRate         :double
// annualSalary	      :double
// salesAmount        :double


// Implement a parameterized constructors:
// that initialize all instance variables except  annualSalary and salesAmount.
// Methods :
// ------------
// method name 	:calculateSalary()
// Return type 	        :double
// Access Modifier	:public

//  ->for calculating the salary of an hourly employee.

// method name 	:calculateSalary(double annualSalary)
// Return type 	        :double
// Access Modifier	:public

// -> for calculating the salary of a salaried employee.(annualSalary/12)

// method name 	:calculateSalary(double salesAmount, double commissionRate)
// Return type 	        :double
// Access Modifier	:public

// ->for calculating the commission of a commission-based employee.
// (salesAmount/commissionRate*100)
// Create a Tester Class(ELC Class) Create instances of each type of employee.
// Calculate and display the salary for each employee type using the appropriate method.
// Sample Input
// Hourly Employee

// Input: hoursWorked = 160, hourlyRate = 15 remaining all values zero you have to pass




// Sample Output
// Expected Output: Monthly salary of hourly employee: 2400.0

// Java Program :

import java.util.Scanner;
class EmployeeSalaryCalculator
{
    double hoursWorked;
    double hourlyRate;
    double annualSalary;
    double salesAmount;

    public EmployeeSalaryCalculator(double hoursWorked, double hourlyRate, double annualSalary, double salesAmount)
    {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        this.annualSalary = annualSalary;
        this.salesAmount = salesAmount;
    }

    public double salesAmount()
    {
        System.out.println("Monthly Salary of hourly employee : "+hourlyRate*hoursWorked);
        return 0;
    }

    public double calculateSalary(double annualSalary)
    {
        System.out.println((hourlyRate * hoursWorked)*365);
        return 0;
    }

    double calculateSalary(double salesAmount, double commissionRate)
    {
        System.out.println("salary amount");
        return 0;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the hours Worked : ");
        double hoursWorked = sc.nextDouble();
        System.out.print("Enter the hourly rate : ");
        double hourlyRate = sc.nextDouble();
        System.out.print("Enter the annual Salary : ");
        double annualSalary = sc.nextDouble();
        System.out.print("Enter the Sales Amount : ");
        double salesAmount = sc.nextDouble();

        EmployeeSalaryCalculator e = new EmployeeSalaryCalculator(hoursWorked,hourlyRate,annualSalary,salesAmount);
        e.salesAmount();
    }
}