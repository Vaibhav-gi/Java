// Q. Print Factors of a Number
// 📄 Problem Statement:
// Write a Java program to print all the factors of a given positive integer.

// 📘 Definition:
// A factor (or divisor) of a number n is any number that divides n exactly without leaving a remainder.

// For example, the factors of 12 are:
// 1, 2, 3, 4, 6, 12

// 📌 Input Format:
// A single positive integer n (n ≥ 1)

// 📌 Output Format:
// All factors of n printed in ascending order, separated by a space
// Sample Input
// 12
// Sample Output
// 1 2 3 4 6 12 

// Java Program :
import java.util.Scanner; // Import the Scanner class to read user input

 class Factor {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

       
        int n = sc.nextInt(); 
        for (int i = 1; i <= n; i++) {
            
            if (n % i == 0) {
                System.out.print(i + " "); 
            }
        }
    }
}
