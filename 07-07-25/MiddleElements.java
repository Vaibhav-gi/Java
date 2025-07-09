// MiddleElements
// Q. Write a program to find the middle elements of a given array. 
// If array is odd then print only the middle element, if array is even
// then print both the middle elements.

// Enter the number of elements: 5
// Enter 5 elements:
// 1
// 2
// 3
// 4
// 5
// Output is: 3
// Sample Input
// 5
// 1
// 2
// 3
// 4
// 5
// Sample Output
// Output is: 3

// Java Program :
import java.util.Scanner;
class MiddleElements{


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
    if(size%2==0){
        System.out.println("Output is: "+arr[(size/2)-1]+" "+arr[(size/2)]);
    }else{
         System.out.println("Output is: "+arr[(size/2)]);

    }
}

}