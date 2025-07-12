// ScholarshipChecker
// Scenario:
// NareshIT wants to automate its student course enrollment system. Each student enrolls in a course with a fixed fee. Some students have scholarships, and they receive a discount on their course fee.

// Create a class Student with the following:

//  Class: Student
// --------------------
// Attributes :
// Field	Type	Description
// name	String	Student's name
// course	String	Name of the course
// fee	       double	Original course fee

// isScholarshipHolder	boolean	Whether the student holds a scholarship

// Constructor:
// ----------------
// One constructor that accepts all fields (name, course, fee, isScholarshipHolder) and initializes them.

// Overloaded Methods:
// --------------------------

// ➤ void enroll()
// Displays all student details with the full fee (no discount logic).

// ➤ void enroll(double scholarshipPercentage)
// formula
// ----------
// Applies the discount only if isScholarshipHolder is true


// fee - (fee * scholarshipPercentage / 100)

// Prints discounted fee if applicable

//  Create a tester class ELC:
// Create two student objects:

// One without scholarship

// One with scholarship

// Call appropriate enroll() method for each

// Constraints:
// No user input (use direct values)

// Use method overloading and constructor initialization

// Use boolean-based logic
// Sample Input
// Test Case 1
// -==-=-=-=-=
// Sample input
// -----------------
// Student s1 = new Student("Ravi", "Java Full Stack", 25000, false);
// s1.enroll();


// Test Case 2
// -==-=-=-=-

// Sample input
// -----------------
// Student s2 = new Student("Priya", "Python with Django", 30000, true);
// s2.enroll(20);

// Sample Output
// Sample Output
// -------------------
// Student Name       : Ravi
// Course Enrolled    : Java Full Stack
// Scholarship Holder : No
// Fee to Pay         : ₹25000.0

// Sample Output
// -------------------
// Student Name       : Priya
// Course Enrolled    : Python with Django
// Scholarship Holder : Yes
// Scholarship (%)    : 20.0%
// Fee to Pay         : ₹24000.0

// Java Program :
import java.util.Scanner;

class Student {
    // Attributes
    String name;
    String course;
    double fee;
    boolean isScholarshipHolder;

    // Constructor
    public Student(String name, String course, double fee, boolean isScholarshipHolder) {
        this.name = name;
        this.course = course;
        this.fee = fee;
        this.isScholarshipHolder = isScholarshipHolder;
    }

    // Method: enroll
    void enroll() {
        System.out.println("Student Name       : " + name);
        System.out.println("Course Enrolled    : " + course);
        System.out.println("Scholarship Holder : " + (isScholarshipHolder ? "Yes" : "No"));
        System.out.println("Fee to Pay         : ₹" + fee);
    }
}

public class ELC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Course Name: ");
        String course = sc.nextLine();

        System.out.print("Enter Course Fee: ");
        double fee = sc.nextDouble();

        System.out.print("Is Scholarship Holder (true/false): ");
        boolean isScholarshipHolder = sc.nextBoolean();

        // Create student and enroll
        Student s = new Student(name, course, fee, isScholarshipHolder);
        System.out.println("\n--- Enrollment Details ---");
        s.enroll();

        sc.close();
    }
}
