// EvenNumberPrinter
// Q. Write a Java method without parameters that prints all even numbers from 1 to 50 (inclusive).
// Requirements:
// •	The method should be named printEvenNumbers.
// •	It should not take any parameters.
// •	It should print each even number on a new line.
// Sample Output:
// 2
// 4
// 6
// ...
// 50
// Sample Input
// 5
// Sample Output
// 2
// 4

// Java Program :
import java.util.Scanner;
public class EvenNumberPrinter {

    public static void printEvenNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Negative value not allowed.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        printEvenNumbers(); 
    }
}
