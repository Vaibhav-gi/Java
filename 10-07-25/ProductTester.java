// ProductTester
// Question:
// Create a Java class called Product with instance variables id, name, and price.
// •	Implement a parameterized constructor to initialize all variables.
// •	Method name  toString() method to return a string in the format:
// "Product[ID=..., Name=..., Price=...]"
// •	create a class named ProductTester it contain  main method, create a Product object and print it to demonstrate the overridden toString().


// Testcase 1:-
// Enter Product ID: 101
// Enter Product Name: Laptop
// Enter Product Price: 75000.0

// Expected Output:-
// Product[ID=101, Name=Laptop, Price=75000.0]
// Sample Input
// 101
// Laptop
// 75000
// Sample Output
// Product[ID=101, Name=Laptop, Price=75000.0]

// Java Program :

import java.util.Scanner;
class ProductTester {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the product ID : ");
		int productId = Integer.parseInt(s.nextLine());
		System.out.print("Enter the product Name : ");
		String productName = s.nextLine();
		System.out.print("Enter the product Price : ");
		double productPrice = Double.parseDouble(s.nextLine());

		if (productId < 0) {
			System.out.println("Invalid Id.");
			return;
		}
		if (productPrice < 0) {
			System.out.println("Invalid price.");
			return;
		}

		Product p = new Product(productId, productName, productPrice);
		p.toString();
		System.out.printf("Product[ID=%d, Name=%s, Price=%.1f]", p.id, p.name, p.price);

	}

}

class Product {

	int id;
	String name;
	Double price;

	public Product(int id, String name, Double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

}
