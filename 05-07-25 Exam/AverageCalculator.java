// AverageCalculator
// Q. Write a Java method that takes an integer array as a parameter and returns the average of all the elements in the array.
// Requirements:
// •	The method should be named findAverage.
// •	It should accept an int[] as a parameter.
// •	It should return a double representing the average.
// Sample Input: int[] numbers = {2, 4, 6, 8, 10};
// Sample Output: 6.0
// Sample Input
// 5
// 5
// 6
// 4
// 8
// 2
// Sample Output
// Average: 5.0

// Java Program :
import java.util.Scanner;
public class AverageCalculator {

    public static double findAverage(int[] numbers) {
        if (numbers.length == 0) return 0;

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid Array size.");
            return;
        }

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        double avg = findAverage(numbers);
        System.out.println("Average: " + avg);
    }
}
