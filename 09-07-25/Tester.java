// Tester
// Create an Employee class (BLC Class)

// Attributes :

// names		Return Type
// --------		---------------
//  firstName   	:String
//  lastName      	:String
//  employeeId 	:int
//  salary  		:double
//  NoOfProject 	:int

// Access Modifier : private (for all variables)

// Implement constructors to initialize these properties.

// implement calculateSalary() method that will add extra amount in salary based on NoOfProject.

// Return Type       : void
// Access modifier :public

// NoOfProject is more than 5 and less that 10 then add 5000
// NoOfProject is more than 10 and less that 20 then add 10000
// NoOfProject is more than 20 then add 15000

// Take another class Tester (ELC Class) which is having main method and instantiate the Employee object and execute the methods.


// Test Case 1:
// ----------------

// Valid Input with Projects Between 6 and 10

// Sample Input:

// firstName: John
// lastName: Doe
// employeeId: 101
// salary: 50000.00
// NoOfProject: 7

// Expected Output:

// After executing calculateSalary(), the salary should be updated to 55000.00.
// Print output showing the updated salary: 55000.00.

// Test Case 2:
// ---------------
//  Invalid Number of Projects (Negative Value)

// Sample Input:

// firstName: Michael
// lastName: Johnson
// employeeId: 105
// salary: 45000.00
// NoOfProject: -5

// Expected Output:

// Print an error message indicating invalid number of projects (e.g., "Number of projects cannot be negative").
// Salary remains 45000.00.
// Sample Input
// John
// Deo
// 101
// 50000.00
// 7
// Sample Output
// Updated Salary: 55000.00

// Java Program :
import java.util.Scanner;
public class Tester{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first Name : ");
    String firstName = sc.next();
    System.out.print("Enter the last Name : ");
    String lastName = sc.next();
    System.out.print("Enter the employee id : ");
    int employeeId = sc.nextInt();
    System.out.print("Enter the salary : ");
    double salary = sc.nextDouble();
    System.out.print("Enter the number of projects : ");
    int noOfProject = sc.nextInt();

    Employee vaibhav = new Employee(firstName,lastName,employeeId,salary,noOfProject);

    vaibhav.calculateSalary();

    }
}

class Employee{

 String firstName;
 String lastName;
 int employeeId;
 double salary;
 int noOfProject;

public Employee(String firstName,String lastName , int employeeId,double salary , int noOfProject){

this.firstName =firstName;
this.lastName = lastName;
this.employeeId = employeeId;
this.salary = salary;
this.noOfProject = noOfProject;

}
public void calculateSalary(){
    if(noOfProject>5 && noOfProject<10){
        salary =salary+5000;
    }else if(noOfProject>10 && noOfProject<20){
        salary = salary+10000;
    }else if(noOfProject>20){
        salary = salary+15000;
    }
System.out.printf("Updated Salary: %.2f",salary);
}
}
