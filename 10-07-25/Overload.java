// Overload
// Write a Java program that defines a ShapeCalculator class with method overloading to calculate the area of geometric shapes. 
// Implement the following methods:

// Coding Requirements :
// ---------------------
// Take a BLC class ShapeCalculator

// Methods [Access Modifier is public]
// -----------------------------------

// calculateArea(int side): Returns the area of a square (side * side).

// calculateArea(int length, int width): Returns the area of a rectangle (length * width).

// calculateArea(double radius): Returns the area of a circle (Math.PI * radius * radius).

// Take an ELC class Overload with main method to work with above requirement.

// Note :- For PI Value use Math.PI

// Test Cases -1 :
// -------------------
// Enter side of the square: 9
// Enter length of the rectangle: 12
// Enter width of the rectangle: 10
// Enter radius of the circle: 3.2

// Expected output :-

// Area of the Square : 81
// Area of the Rectangle : 120
// Area of the Circle is 32.17
// Sample Input
// 9
// 12
// 10
// 3.2
// Sample Output
// Area of the Square : 81
// Area of the Rectangle : 120
// Area of the Circle is 32.17


// Java Program :

import java.util.Scanner;
public class Overload {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter side of the Square : ");
		int side = s.nextInt();
		System.out.print("Enter length of the Rectangle : ");
		int length = s.nextInt();
		System.out.print("Enter width of the Square : ");
		int width = s.nextInt();
		System.out.print("Enter radius of the Circle : ");
		double radius = s.nextDouble();

		ShapeCalculator cal = new ShapeCalculator();

		System.out.println("Area of the Square : " + cal.calculateArea(side));
		System.out.println("Area of the Rectangle : " + cal.calculateArea(length, width));
		System.out.printf("Area of the Circle is %.2f", cal.calculateArea(radius));

	}

}

class ShapeCalculator {

	public int calculateArea(int side) {
		return side * side;
	}

	public int calculateArea(int length, int width) {
		return length * width;
	}

	public double calculateArea(double radius) {
		return Math.PI * radius * radius;
	}

}
