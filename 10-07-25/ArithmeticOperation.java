// ArithmeticOperation

// Write a Java program that defines a calculation of two numbers with method overloading to perform arithmetic operations. 
// Implement the followings :

// Coding Requirements :
// ---------------------
// Take a BLC class Calculator 

// Methods [Access Modifier is public]
// -----------------------------------

// add(int num1, int num2): Returns the sum of two integers.

// add(double num1, double num2): Returns the sum of two doubles.

// multiply(int num1, int num2): Returns the product of two integers.

// multiply(double num1, double num2): Returns the product of two doubles.

// Take an ELC class, ArithmeticOperation with main method, create an instance of Calculator class and demonstrate the use of 
// each method by performing calculations with different types of arguments (integers and doubles).

// Test Cases 01 :    
// ------------------
// Enter first integer: 12
// Enter second integer: 12
// Enter first double: 12.25
// Enter second double: 25.32

// Expected output 

// Sum of two integer is : 24
// Sum of two double is : 37.57
// Multiplication of two integer is : 144
// Multiplication of two double is : 310.17
// Sample Input
// 12
// 12
// 12.25
// 25.32
// Sample Output
// Sum of two integer is : 24
// Sum of two double is : 37.57
// Multiplication of two integer is : 144
// Multiplication of two double is : 310.17

// Java Program :

import java.util.Scanner;
public class ArithmeticOperation{

public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter first integer : ");
    int n1 =s.nextInt();
    System.out.print("Enter second integer : ");
    int n2 =s.nextInt();
    System.out.print("Enter first double : ");
    double n3 =s.nextDouble();
    System.out.print("Enter second double : ");
    double n4 =s.nextDouble();

    Calculator cal = new Calculator();
System.out.println("Sum of two integer is : "+cal.add(n1,n2));
System.out.printf("Sum of two double is : %.2f\n",cal.add(n3,n4));
System.out.println("Multiplication of two integer is : "+cal.Multiply(n1,n2));
System.out.printf("Multiplication of two double is : %.2f",cal.Multiply(n3,n4));

}

}



class Calculator{
//     int num1;
//     int num2;
//     double num3;
//     double num4;
// public Calculator(int num1, int num2,double num3,double num4){
//     this.num1=num1;
//     this.num2=num2;
//     this.num3=num3;
//     this.num4=num4;
// }


public int add(int num1, int num2){
    return num1+num2;
}
public double add(double num1, double num2){
    return num1+num2;
}
public double Multiply(double num1, double num2){
    return num1*num2;
}
public int Multiply(int num1, int num2){
    return num1*num2;
}
}