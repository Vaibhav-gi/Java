// ProductInventoryManagementTesting
// 🧠 Problem: Product Inventory Management Using Encapsulation
// 📄 Problem Statement:
// Design a Java program that models a simple product inventory system using encapsulation. The program should safely handle the product name and quantity using appropriate getter and setter methods with basic validation.

// ✅ Requirements:
// Create a class named Product with the following private fields:

// String productName

// int quantity

// Implement the following methods:

// setProduct(String name, int quantity)
// ➤ Sets the product name and quantity.
// ➤ Quantity must be greater than 0, otherwise print "Quantity must be positive.".

// getProductName()
// ➤ Returns the product name.

// getQuantity()
// ➤ Returns the product quantity.

// In another class Main4, perform the following in the main() method:

// Create a Product object.

// Set the product name as "Laptop" and quantity as 2.

// Display the product name and quantity using getter methods.

// 🧪 Expected Output:

// Product: Laptop
// Quantity: 2

// Validation Rule:
// If the quantity is 0 or negative, display:
// "Quantity must be positive."
// and do not update the quantity field.

// Java Program :
import java.util.*;
public class ProductInventoryManagementTesting
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the product Name : ");
        String name = sc.nextLine();
        System.out.print("Enter the  Quantity : ");
        int qty =sc.nextInt();
        Product p = new Product(name , qty);
        System.out.println("Product : "+p.getProductName()+" \nQuantity : "+p.getQuantity());

    }
}
class Product{
    private String productName;
    private int quantity;

    public Product(String name,int quantity)
    {
        this.productName=name;
        this.quantity=quantity;
    }
    public void setProductName(String productName)
    {
        this.productName= productName;
    }
    public String getProductName()
    {
        return productName;
    }
    public void setQuantity()
    {
        if(quantity>0)
        this.quantity=quantity;
        else
        System.out.println("Quantity must be positive");

    }
    public int getQuantity()
    {
        return quantity;
    }
}
