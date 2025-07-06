// PrimeInArray

// Write a Java program to find and print all the prime numbers from a given array.
// If there are no prime numbers in the array, print: "No Prime Numbers Found."

// Example1 :
// input: [4,7,6,13,9,2,11]
// output: 7 13 2 11

// Example1 :
// input: [1,0,4,9,6]
// output: No Prime Numbers Found.

// Expected Output:-

// Enter number of elements in the array: 7
// Enter 7 elements:
// 4
// 7
// 6
// 13
// 9
// 2
// 11

// Expected Output:-

// 7 13 2 11
// Sample Input
// 7
// 4
// 7
// 6
// 13
// 9
// 2
// 11
// Sample Output
// 7 13 2 11

// Java Program :
import java.util.Scanner;
class PrimeInArray {
    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = sc.nextInt();
        if(size < 0)
        {
            System.out.println("Invalid Array size.");
            return ;
        }
        System.out.print("Enter number of elements in the array: ");
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Prime Numbers Found.");
        }
    }
}
