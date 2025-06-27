// Q.1 Write a program in C for addition of two Matrices of same size. Test Data : 
// Input the size of the square matrix (less than 5): 2
// Input elements in the first matrix :
// element - [0],[0] : 1
// element - [0],[1] : 2 
// element - [1],[0] : 3 
// element - [1],[1] : 4 
// Input elements in the second matrix : 
// element - [0],[0] : 5 
// element - [0],[1] : 6 
// element - [1],[0] : 7 
// element - [1],[1] : 8 
// Expected Output : 
// The First matrix is : 
// 1 2 
// 3 4 
// The Second matrix is : 
// 5 6 
// 7 8
// The Addition of two matrix is : 
// 6 8 
// 10 12
// Sample Input
// 2 2
// 1
// 2
// 3
// 4
// 2 2
// 5
// 6
// 7
// 8
// Sample Output
// 6 8
// 10 12
// C Program:
// Q.2 Create a function to check if a string contains only digits.
// Input:
// String: 12345
// Output:
// The string contains only digits.
// Input:
// String: 45A7
// Output:
// The string contains non-digit characters.
// Explanation:
// -----------------------------------------------------
// The containsOnlyDigits function takes a character array (string) str as input and returns a boolean value (true if the string contains only digits, false otherwise).

// The function uses a for loop to iterate through the characters of the string. The loop runs until it encounters the null character \0, which marks the end of the string.

// In each iteration, the function checks if the current character str[i] is a digit using the isdigit function from the <ctype.h> library. The isdigit function returns a non-zero value if the character is a digit (0 to 9), and it returns 0 otherwise.

// If the current character is not a digit (i.e., isdigit(str[i]) returns 0), the function immediately returns false, indicating that the string contains non-digit characters.

// If the loop completes without finding any non-digit characters, the function returns true, indicating that the string contains only digits.

// The main function asks the user to input a string and calls the containsOnlyDigits function with the given input. It then prints whether the input string contains only digits or not.
// Sample Input
// 1234
// Sample Output
// The string contains only digits.

// C Program:

// Q.3 Write a program in C for a 2D array of size 3x3 and print the matrix. Test Data : Input elements in the matrix : 

// element - [0],[0] : 1 
// element - [0],[1] : 2 
// element - [0],[2] : 3
// element - [1],[0] : 4 
// element - [1],[1] : 5 
// element - [1],[2] : 6 
// element - [2],[0] : 7 
// element - [2],[1] : 8 
// element - [2],[2] : 9 
// Expected Output : 
// The matrix is : 1 2 3 4 5 6 7 8 9 
// Sample Input
// 3
// 3
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// Sample Output
// The matrix is :
// 1 2 3 
// 4 5 6 
// 7 8 9

// C Program:

// Q.4 Write a c program to print all the frequency of character present in string .
// --------
// Sample input: String s=" Hello Everyone"

// Sample output  :-
// The frequency of H is 1
// The frequency of e is 3
// The frequency of l is 2
// The frequency of o is 2
// The frequency of   is 1  --------THIS IS FOP CHECKING THE SPACE COUNT 
// The frequency of E is 1
// The frequency of v is 1
// The frequency of r is 1
// The frequency of y is 1
// The frequency of n is 1
// Sample Input
// Hello Everyone
// Sample Output
// The frequency of H is 1
// The frequency of e is 3
// The frequency of l is 2
// The frequency of o is 2
// The frequency of   is 1  --------THIS IS FOP CHECKING THE SPACE COUNT 
// The frequency of E is 1
// The frequency of v is 1
// The frequency of r is 1
// The frequency of y is 1
// The frequency of n is 1

// C Program:

// Q.5 Write a C program to remove all the Spaces from a given String.

// Sample input : Enter a String : Black cat on a mat
// Sample output : Blackcatonamat
// Sample Input
// Black cat on a mat
// Sample Output
// Blackcatonamat

// C Program:

// Q.6 Write a program in C to find the sum of the rows and columns of a square matrix ?
// ---------------------------------------------------------------------------------
// Sample Input :-
// ---------------
// -> Input the size of the square matrix :- 2  
// -> Input elements in the 2x2 matrix :-
  
// Element - [0][0]: 5  
// Element - [0][1]: 6  
// Element - [1][0]: 7  
// Element - [1][1]: 8

// Sample Output :-
// ----------------
// -> The matrix is:  
// __    __
// |  5 6 | 
// |_ 7 8_|  

// The sum of rows and columns of the matrix is :-
// -----------------------------------------------  
// __     __
// |  5  6 |-> 11 
// |_ 7  8_|-> 15
//    |  |
//   \|/\|/
//   12 14
  
// Test Cases :-
// -------------

// -> Valid Test Cases :-
// ----------------------
// Test Case-1 :- [Minimum Size Matrix]
// --------------
// Input :-
// --------
// -> Input the size of the square matrix :- 1  
// -> Input elements in the 1x1 matrix :-  

// Element - [0][0]: 10  

// Expected Output :-
// -------------------
// The matrix is:  

// 10  

// The sum of rows and columns of the matrix is:  

// 10  10  

// Test Case 2 :- [Typical Square Matrix (3x3)]
// --------------
// Input :-
// --------
// -> Input the size of the square matrix :- 3  
// -> Input elements in the 3x3 matrix :-
  
// Element - [0][0]: 1  
// Element - [0][1]: 2  
// Element - [0][2]: 3  
// Element - [1][0]: 4  
// Element - [1][1]: 5  
// Element - [1][2]: 6  
// Element - [2][0]: 7  
// Element - [2][1]: 8  
// Element - [2][2]: 9  

// Expected Output :-
// -------------------
// The matrix is :-  
// ----------------
// 1  2  3  
// 4  5  6  
// 7  8  9  

// The sum of rows and columns of the matrix is :-
// -----------------------------------------------  
//  1   2   3 ->  6  
//  4   5   6 ->  15  
//  7   8   9 ->  24  
//  |   |   |  
// \|/ \|/ \|/ 
// 12  15  18  

// Invalid Test Cases :-
// ----------------------
// Test Case 3 :- [Negative Matrix Size]
// --------------
// Input :-
// --------
// -> Input the size of the square matrix: -3  

// Expected Output :-
// ------------------
// Invalid matrix size. Please enter a positive integer.
// Sample Input
// -3
// Sample Output
// Invalid matrix size. Please enter a positive integer

// C Program:

