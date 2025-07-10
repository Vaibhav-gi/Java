// BookELC
// Design a Book printing System

// Create a class  Book (BLC Class)

// Attributes/Properties :

// Name		     data type
// -------		      -----------
// title              :String
// author       	  :String
// price 		      :double

// Implement a parameterized constructor to initialize all the fields

// Methods :
// Generate toString() method to print object properties.

// Method Name		:applyDiscount(double discountPercentage)
// Return type		:void
// Access modifier	        :public


// Take class BookELC (ELC Class) which having in main method  and execute the main method


// Test Cases :
// --------------

// Test Case 1:
//  Applying Invalid Discount (Negative)

// Error: Invalid discount percentage.
// Title: 1984
// Author: George Orwell
// Price: 14.391

// Test Case 2: Creating Book with Negative Price
// Title: Negative Price Book
// Author: No Author
// Price: -5.0


// Sample Input
// 1984
// George Orwell
// 14391
// 5
// Sample Output
// Title: 1984
// Author: George Orwell
// Price: 13671.45

// Java Program :

import java.util.Scanner;
 class BookElc{

public static void main(String[] args){

Scanner s = new Scanner(System.in);
System.out.print("Enter the title : ");
String title = s.nextLine();
System.out.print("Enter the author : ");
String author = s.nextLine();
System.out.print("Enter the price : ");
double price = Double.parseDouble(s.nextLine());
System.out.print("Enter the discount : ");
int dis = Integer.parseInt(s.nextLine());
if(dis<0){
    System.out.println("Error: Invalid discount percentage.");
    return;
}
   Book bookObj = new Book(title,author,price);
   bookObj.applyDiscount(dis);
   bookObj.display();

}

}

class Book{

String title;
String author;
double price;

public Book(String title,String author,double price){
this.title=title;
this.author=author;
this.price=price;
}
 void display(){
    System.out.println("Title: "+title);
    System.out.println("Author: "+author);
    System.out.println("Price: "+price);


 }
void applyDiscount(double discountPercentage){
    price =price - (price*(discountPercentage/100));
}
}
