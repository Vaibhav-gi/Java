// CalculatorELC
// Create a class named Calculator to demonstrate method overloading using three add() methods:

// Method Signature	Description
// int add(int a, int b)	Adds two integers
// double add(double a, double b)	Adds two double values
// int add(int a, int b, int c)	Adds three integers

// Create a tester class CalculatorELC with a main() method where:

// Use Scanner to take the user's choice

// Based on the choice, read the required values

// Call the appropriate overloaded method from Calculator based on the users choice

// Print the result directly
// Sample Input
// Sample input :
// 1 10 20
// Sample Output
// Result : 30
// Constraints:
// Constraints:
// Input should be handled with Scanner

// No prompt messages in output

// Use clean input-output format (like competitive programming)
// Explanation
// Take the Scanner class and take the input based on the user choice case 1: add(int a, int b)//call the method case 2: add(double a, double b) case 3: add(int a, int b, int c)

// Java Program :
import java.util.Scanner;

class Calculator{

int add(int a, int b){
    System.out.println(a+b);
    return a+b;
}
double add(double a, double b){
      System.out.println(a+b);
       return a+b;
}
int add(int a, int b, int c){
    System.out.println(a+b+c);
     return a+b+c;
}
public static void main(String[] args){

Scanner s = new Scanner(System.in);

    int a = s.nextInt();
    if(a == 1){

        System.out.print("Enter the first value for adding : ");
        int val1 = s.nextInt();
        System.out.print("Enter the second value for adding : ");
        int val2 = s.nextInt();
        Calculator cal = new Calculator();
    cal.add(val1,val2);

    }else if(a == 2){
 double val1 = s.nextDouble();
        double val2 = s.nextDouble();

        Calculator cal = new Calculator();
    cal.add(val1,val2);

    }else if(a==3){
       int val1 = s.nextInt();
        int val2 = s.nextInt();
        int val3 = s.nextInt();
        Calculator cal = new Calculator();
    cal.add(val1,val2,val3);
    }else{
        System.out.println("Invalid Choice");
    }
}
}