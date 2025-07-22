// DisplayUpperTriangularMatrix
//  Problem: Display Upper Triangular Matrix
// Problem Statement:
// Write a Java program that reads a square matrix of size n x n and displays its upper triangular matrix.

// An upper triangular matrix contains all the elements on or above the main diagonal, and all elements below the main diagonal are replaced with 0.

// 📥 Input Format:

// First line: Integer n — the number of rows and columns

// Next n lines: Each line contains n space-separated integers representing one row of the matrix
// 📤 Output Format:

// Print the upper triangular matrix with each row on a new line. Elements should be separated by a single space.
// 🧪 Sample Input:

// 3
// 1 2 3
// 4 5 6
// 7 8 9
// ✅ Sample Output:

// 1 2 3
// 0 5 6
// 0 0 9
// 📌 Explanation:
// The main diagonal elements are 1, 5, and 9.

// Elements above the diagonal are retained (2, 3, 6).

// Elements below the diagonal (like 4, 7, 8) are replaced with 0.

// Sample Input
// 3
// 3
// 1 2 3
// 4 5 6
// 7 8 9
// Sample Output
// 1 2 3
// 0 5 6
// 0 0 9


// Java Program :
import java.util.Scanner;
class DisplayUpperTriangularMatrix
{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

int m = sc.nextInt();


int[][] arr = new int[m][m];
for(int i=0;i<m;i++){
    for(int j=0;j<m;j++){
        arr[i][j]=sc.nextInt();

    }
}

for(int i=0;i<m;i++){
    for(int j=0;j<m;j++){
        if(j>=i){
            System.out.print(arr[i][j]+" ");
        }else{
             System.out.print(0+" ");
        }
    }
    System.out.println();
}
}
}