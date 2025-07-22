// CheckMatrixEquality
// Problem: Check Matrix Equality
// Problem Statement:
// Write a Java program that checks whether two matrices are equal or not.

// Two matrices are said to be equal if:

// They have the same dimensions, and

// Each corresponding element in the two matrices is identical.

// Your task is to read two matrices from the user and print "Equal" if they are equal, otherwise print "Not Equal".

// 📥 Input Format:

// First line: Two integers R and C — number of rows and columns

// Next R lines: Each line contains C space-separated integers for the first matrix

// Next R lines: Each line contains C space-separated integers for the second matrix
// Output Format:

// Print "Equal" if the matrices are equal, otherwise print "Not Equal"
// Sample Input:

// 2 3
// 1 2 3
// 4 5 6
// 1 2 3
// 4 5 6
// ✅ Sample Output:

// Equal
// Sample Input
// 2
// 3
// 1 2 3
// 4 5 6
// 1 2 3
// 4 5 6
// Sample Output
// Equal


// Java Program :
import java.util.Scanner;
class CheckMatrixEquality
{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

int m = sc.nextInt();
int n = sc.nextInt();


int[][] arr = new int[m][n];
int[][] arr1 = new int[m][n];
for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        arr[i][j]=sc.nextInt();

    }
}
for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        arr1[i][j]=sc.nextInt();

    }
}
for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        if(arr[i][j]!=arr1[i][j]){
            System.out.println("Not Equal");
            return;
        }
    }
   
}
System.out.println("Equal");
}
}