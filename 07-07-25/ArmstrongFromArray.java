// ArmstrongFromArray

// Q. Write a Java program to find and print all Armstrong numbers from a given array.
// An Armstrong number is a number that is equal to the sum of its digits each raised to the power of the number of digits.(153 → 1³ + 5³ + 3³ = 153).

// Example1 :
// input    : [153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084, 123, 5000, 10000, 9999]
// output   : 153 370 371 407 1634 8208 9474 54748 92727 93084


// Example2 :
// input    : [154, 123, 5000, 10000, 9999]
// output   : No Armstrong Numbers Found.


// Testcase 1:-

// Enter number of elements: 14
// Enter 14 elements:
// 153
// 370
// 371
// 407
// 1634
// 8208
// 9474
// 54748
// 92727
// 93084
// 123
// 5000
// 1000
// 9999

// Expected output:-

// 153 370 371 407 1634 8208 9474 54748 92727 93084
// Sample Input
// 14
// 153
// 370
// 371
// 407
// 1634
// 8208
// 9474
// 54748
// 92727
// 93084
// 123
// 5000
// 1000
// 9999
// Sample Output
// 153 370 371 407 1634 8208 9474 54748 92727 93084


// Java Program :
import java.util.Scanner;
class ArmstrongFromArray{
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

int flag=0;
    for(int i=0;i<size;i++){
          int sum=0;
       int val = arr[i];
        int c=0;
        while(val!=0){
            c++;
            val/=10;
        }
        val=arr[i];
        while(val!=0){
            int mul=1;
            int last = val%10;
            for(int j=1;j<=c;j++){
                mul*=last;
            }
            sum+=mul;
            val/=10;
        }
       if(sum == arr[i]){
        flag=1;
         System.out.print(sum+" ");
       }
    }

    if(flag!=1){
        System.out.println("No Armstrong Numbers Found.");
    }
}
}