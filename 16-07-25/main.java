// StudentTester
//  Problem: Student Information Using Encapsulation
// 📄 Problem Statement:
// Create a Java program that uses encapsulation to manage student information. The program should allow setting and getting the name and age of a student using appropriate getter and setter methods.

// The student's name should be stored privately and accessed only through public methods.

// The student's age should also be private, and it should only be set if it is 5 or above. Otherwise, a warning should be printed.

// ✅ Requirements:
// Define a class named Student.

// Include two private instance variables:

// String name

// int age

// Implement:

// setName(String name) – to set the student’s name.

// setAge(int age) – to set the student’s age only if it’s 5 or more.

// getName() – to return the student’s name.

// getAge() – to return the student’s age.

// Create a Main1 class with the main method:

// Create a Student object.

// Set the name to "Rahul" and age to 15.

// Print the name and age using the getter methods.

// 💡 Expected Output:

// Name: Rahul
// Age: 15

// Validation Rule:
// If the given age is less than 5, display:
// "Age must be 5 or above."
// and do not update the age field.
// Sample Input
// Rahul
// 15
// Sample Output
// Name: Rahul
// Age: 15

// Java Program :
import java.util.*;
public class main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Name: ");
        String name = sc.nextLine();
        System.out.print("Enter the Age: ");
        int age =sc.nextInt();
        Student s= new Student();
        s.setName(name);
        s.setAge(age);
        System.out.println("Name :"+s.getName()+" \nAge :"+s.getAge());
    }
}
class Student{
    private String name;
    private int age;
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        if(age>=5){
        this.age=age;
        }
        else{
        System.out.println("Age must be 5 or above.");
        System.exit(0);
        }
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}
