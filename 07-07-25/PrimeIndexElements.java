// PrimeIndexElements
// Q. Write a Java program to print all the elements of an array that are present at prime index positions.

// Example :
// Input   : [10, 20, 30, 40, 50, 60, 70, 80]
// Output  : 30 40 60 80

// Testcase 1:-

// Enter number of elements: 8
// Enter 8 elements:
// 10
// 20
// 30
// 40
// 50
// 60
// 70
// 80

// Expected Output:-

// Elements at prime index positions:
// 30 40 60 80
// Sample Input
// 8
// 10
// 20
// 30
// 40
// 50
// 60
// 70
// 80
// Sample Output
// Elements at prime index positions:
// 30 40 60 80

// Java Program :
import java.util.Scanner;
class PrimeIndexElements{

public static void main(String[] args){

    Scanner s = new Scanner(System.in);
    System.out.print("Enter the array size : ");
    int size = s.nextInt();
    if(size<0){
        System.out.println("Invalid Array size.");
        return;
    }
    System.out.println("Enter "+size+" elements : ");
    int[] arr = new int[size];
    for(int i=0;i<size;i++){
        arr[i]=s.nextInt();
    }
    System.out.println("Elements at prime index positions:");
    for(int i=1;i<size;i++){
        int c=0;
        for(int j=1;j<=i;j++){
            if(i%j==0){
                c++;
            }
        }
        if(c==2){
            System.out.print(arr[i]+" ");
        }

    }
}
}