// StringArrayInput
// 🧾 Problem Title: String Array Input and Display
// 📄 Problem Statement:
// Write a Java program that performs the following tasks:

// Prompts the user to enter the number of strings they wish to input.

// Creates a string array of the specified size.

// Accepts input strings from the user and stores them in the array.

// Prints all the strings entered by the user.

// 📘 Input Description:
// First, an integer n representing the number of strings.

// Then, n strings entered by the user, one per line.

// 📌 Output Description:
// Display each string on a new line in the order they were entered.

// ✅ Constraints:
// 1 <= n <= 100

// Strings can contain spaces and should be read using nextLine().

// 🧪 Sample Input:

// Enter the number of strings: 3
// Enter 3 strings:
// String 1: Hello
// String 2: Java Programming
// String 3: World

// 📤 Sample Output:

// You entered:
// Hello
// Java Programming
// World
// Sample Input
// 3
// Hello
// Java
// world
// Sample Output
// Hello
// Java
// world

// Java Program :
import java.util.Scanner;
public class StringArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Negative value not allowed.");
            return;
        }
        sc.nextLine(); // takes the last element to the leftover newline

        String[] arr = new String[n];
        
        System.out.println("Enter " + n + " strings:");

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextLine();
        }

        System.out.println("\nYou entered:");
        for (String str : arr) {
            System.out.println(str);
        }
    }
}
