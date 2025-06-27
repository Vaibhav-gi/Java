// Q. WAPTP Triangle Type for the given triangle dimensions.

// [hint : 3 types of triangles. equilateral triangle(all sides equal), isosceles 
// triangle(two-sides equal) and Scalene triangle(if all sides different)]

// Input: 
// 3,4,5 → Scalene triangle
// Sample Input
// 3
// 4
// 5
// Sample Output
// Scalene triangle

// Java Program : 
import java.util.Scanner;
class TriangleType
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Side of Triangle : ");
        int side1 = sc.nextInt();
        System.out.print("Enter the Second Side of Triangle : ");
        int side2 = sc.nextInt();
        System.out.print("Enter the First Side of Triangle : ");
        int side3 = sc.nextInt();

        if ((side1 + side2) > side3)
        {
        if ((side1 < side2) && (side2 < side3) )
        {
            System.out.println("Scalene triangle");
        }
        else if ((side1 == side2) && (side2 == side3) )
        {
            System.out.println("Equilateral triangle");
        }
        else if ((side1 == side2) && (side2 > side3))
        {
            System.out.println("Isosceles triangle");
        }
        }
        else
        {
            System.out.println("Invalid triangle");
        }
    }
}