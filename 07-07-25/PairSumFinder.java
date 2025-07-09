// PairSumFinder

// Q. Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.

// Example1 :
// input    : [2,7,4,-5,11,5,20]
// givenEle : 15

// output   :
// Pairs of elements and their sum :
//  4 + 11 = 15
// -5 + 20 = 15


// Example2 :
// input    : [14,-15,9,16,25,45,12,8]
// givenEle : 30

// output   :
// Pairs of elements and their sum :
//  14 + 16 = 30
// -15 + 45 = 30


// Testcase 1:-

// Enter the number of elements in the array: 5
// Enter 5 elements:
// 2
// 3
// 5
// 6
// 0
// Enter the target sum: 5

// Expected Output :-

// Pairs of elements and their sum:
// 2 + 3 = 5
// 5 + 0 = 5
// Sample Input
// 5
// 2
// 3
// 5
// 6
// 0
// 5
// Sample Output
// Pairs of elements and their sum:
// 2 + 3 = 5
// 5 + 0 = 5

// Java Program :
import java.util.Scanner;
public class PairSumFinder{

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

for(int i=0;i<=size-1;i++){
   arr[i]=s.nextInt();
}
System.out.print("Enter the target sum statement: ");
int ele = s.nextInt();
System.out.println("Pairs of elements and their sum:");
int flag=0;
for(int j=0;j<size;j++){
    for(int k=j+1;k<size;k++){
        if(arr[j]+arr[k]==ele){
            flag=1;
            System.out.println(arr[j]+" + "+arr[k]+" = "+ele);
        }
    }


}
if(flag==0){
    System.out.println("No pairs found with the sum "+ele);
}
}
}