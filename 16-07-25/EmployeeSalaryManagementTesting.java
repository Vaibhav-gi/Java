// EmployeeSalaryManagementTesting
// 🧠 Problem: Employee Salary Management Using Encapsulation
// 📄 Problem Statement:
// Create a Java program to manage employee details using the encapsulation concept. The program should securely store the employee's name and salary and ensure salary validation during data entry.

// ✅ Requirements:
// Create a class named Employee with the following private fields:

// String name

// double salary

// Implement the following methods:

// setName(String name)
// ➤ Sets the employee's name.

// getName()
// ➤ Returns the employee's name.

// setSalary(double salary)
// ➤ Sets the employee’s salary only if it is greater than or equal to 0.
// ➤ If the salary is negative, print "Invalid salary!".

// getSalary()
// ➤ Returns the employee's salary.

// In a separate class Main3, do the following inside the main() method:

// Create an Employee object.

// Set the name to "Anjali" and salary to 35000.

// Print the employee’s name and salary using getter methods.

// 🧪 Expected Output:

// Employee: Anjali
// Salary: 35000.0

// Validation Rule:
// If salary is negative, print:
// "Invalid salary!"
// and do not update the salary field.


// Java Program :
public class EmployeeSalaryManagementTesting {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee();

        // Set name and salary
        emp.setName("Anjali");
        emp.setSalary(35000);

        // Print employee details
        System.out.println("Employee: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
    }
}

// Encapsulated Employee class
class Employee {
    // Private fields
    private String name;
    private double salary;

    // Set name
    public void setName(String name) {
        this.name = name;
    }

    // Get name
    public String getName() {
        return name;
    }

    // Set salary with validation
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary!");
        }
    }

    // Get salary
    public double getSalary() {
        return salary;
    }
}
