// Q.1 Write a C program to check if two strings are anagrams of each other or not using function.
// ------

// -> create int main() function.
// -> create bool isAnagram(char str1[],char str2[]) function. this function will take two string as input and will return true if both String are anagram otherwise will return false.
// -> in main function read two Strings and pass it to isAnagram fuction by calling it and print the result.


// Sample input:
//              First string : listen
//              Second string: silent

// Sample output: The strings are anagrams.


// Sample input:
//              First string : hello
//              Second string: world

// Sample output: The strings are not anagrams.
// Sample Input
// listen
// silent
// Sample Output
// The strings are anagrams.

// C Program:

// Q.2 Write a C program to check if a given year is a leap year or not using function.
// ------

// -> create int main() function
// -> create bool isLeapYear(int year) function. this function will take year as parameter suppied by main function and will check the year is leap year or not. if year is leap then return true otherwise false.

// Sample input : Enter a year: 2024

// Sample output : 2024 is a leap year.
// Sample Input
// 2024
// Sample Output
// 2024 is a leap year.

// Q.3 Count Palindromic Substrings of Length
// Problem Statement:
// Write a C program to find and count all palindromic substrings of a given input string where the length of each palindrome is greater than or equal to 2. A palindromic substring is a sequence of characters that reads the same backward as forward.

// You should use the center expansion technique to find palindromes efficiently.

// Function Requirements:
// Implement a function:

// int expandAroundCenter(char str[], int left, int right);

// This function should expand outward from the center and:


// Return the count of such palindromic substrings found

// Input:

// A single string (no spaces) of at most 100 characters.

// The string is entered by the user via scanf.

// Output:
// Print each palindromic substring on a new line.

// Print the total count at the end in the format:

// Total palindromic substrings : X


// The input string contains only lowercase or uppercase letters (no spaces).

// Testcase 1:-

// madam

// Expected Output:-
// -------------------
// ada
// madam
// Total palindromic substrings : 2
// Sample Input
// madam
// Sample Output
// ada
// madam
// Total palindromic substrings : 2
