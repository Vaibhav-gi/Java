// Q. WAPTP given dimensions of a triangle is valid or not(Triangle Validity)

// Logic : This theorem states that the sum of the lengths of any two sides of a triangle 
// must be greater than the length of the third side. 


// Input: 
// 30,60,90 → Valid triangle 
// 30,30,140 → Invalid triangle

// Java Program : 
import java.util.Scanner;
class TriangleValidity
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Side Of Triangle : ");
        int side1 = sc.nextInt();
        System.out.print("Enter the Second Side Of Triangle : ");
        int side2 = sc.nextInt();
        System.out.print("Enter the Third Side Of Triangle : ");
        int side3 = sc.nextInt();

        if ((side1 + side2) > side3)
        {
            System.out.println("Valid triangle");
        }
        else
        {
            System.out.println("Invalid triangle");
        }
    }
}