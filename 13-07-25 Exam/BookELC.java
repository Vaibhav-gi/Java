// BookELC
// Create a class named Book (BLC - Business Logic Class) that contains:

// Variable	Type	 Description
// title	       String	 Title of the book
// price	   double	 Price of the book


// Constructors:
// Default constructor:

// Initialize to title = "Unknown"
// initialize price = 0.0

// Sets price to 0.0

// Parameterized constructor:

// Accepts title and price as input parameters and assigns them

// Method:
// ----------
// Method Name :- displayInfo()
// Return Type :- void
// Access Modifier :-public
// Description :- Prints book title and price in a clean format

// Create a class ELC (BookELC class) with main() that:
// based on the user choice via switch only create the object and invoke methods
// Creates one book using default constructor

// Creates one book using parameterized constructor

// Calls displayInfo() for both
// Sample Input
// Book b1 = new Book();
// b1.displayInfo();
// Sample Output
// Book b1 = new Book();
// b1.displayInfo();
// Constraints:
// Do not use user input

// Values must be directly passed when creating objects

// Output must be clean (no extra prompts)
// Explanation
// Case 1: Create a book using the default constructor Case 2: Create a book using the parameterized constructor by taking title and price as input Based on user's choice, execute the logic Display book details using displayInfo() Input via Scanner



// Java Program:

import java.util.Scanner;

class BookELC{

String title;
double price;

public BookELC(){
    this.title="Unknown";
    this.price =0.0;
}
public BookELC(String title ,double price){
    this.title=title;
    this.price=price;
}

public void displayInfo(){
System.out.println("Title : "+title);
System.out.println("Price : "+price);
}


public static void main(String[] args){

Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    if(a == 1){
            System.out.print("Enter the ");
            BookELC b1 = new BookELC();
            b1.displayInfo();

    }else if(a == 2){

        System.out.print("Enter the book title : ");
        String title = s.next();
        System.out.print("Enter the book price : ");
        double price =s.nextDouble();
        BookELC b1 = new BookELC(title,price);
        b1.displayInfo();

    }else{
        System.out.println("Invalid Choice");
    }
}
}