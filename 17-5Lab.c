// Q.1 Write a C program to find the previous multiple & next multiple of 100 of a given three digit number using if-else. 
// if the number is not 3 digit print invalid massage.
// Number should be between 100 to 999
// if not then print a message invalid massage.

// Case 1:

// Sample input  : 234

// Sample output : Previous multiple : 200
// 		next multiple : 300

// Case 2:

// Sample input  : 23

// Sample output : Invalid Input

// case 3:

// Sample input : 1234
// Sample output : Invalid Input

// case 4:

// Sample input  : -567

// Sample output : Invalid Input
// Sample Input
// 450
// Sample Output
// Previous multiple: 400
// Next multiple: 500

// C program:
// #include<stdio.h>
// int main()
// {
//     int number,nextmultiple,previousmultiple;
//     scanf("%d",&number);

//     if(number>=100 && number<=999)
//     {
//         previousmultiple=(number/100)*100;
//         nextmultiple=previousmultiple+100;

//         printf("Previous Multiple: %d\n",previousmultiple);
//         printf("Next Multiple: %d\n2",nextmultiple); 
//     }
//     else
//     {
//         printf("Invalid Input");
//     }
// }

// Q.2 Write a C program to determine whether a person is eligible to get married in India or not, based on their age, gender, and nationality.
	
// 	The program should read three inputs from the user:

// 	1. Age of the person
// 	2. Gender of the person (Male/Female)
// 	3. Nationality of the person (for Indian 'i' or 'I')
	
// 	The program should first check the nationality of the person. If the person is not an Indian citizen, the program should print "You are not an Indian citizen, cannot get married in India"

// 	If the person is an Indian citizen, the program should then check their age and gender to determine if they are eligible to get married.

// 	- If the person is a male, they must be at least 21 years old to get married.
// 	- If the person is a female, they must be at least 18 years old to get married.
	
// 	Eligible to get married in India" if the person meets all the criteria (age, gender, and nationality)
// - "Not eligible to get married in India" if the person does not meet the age or gender criteria
// Sample Input
// input :
// 	Enter your age: 28
// 	Enter your gender (M/F): m
// 	Enter your nationality (i or I  for Indian): I
// Sample Output
// output:
// 	Eligible to get married in India

// C Program:
// #include <stdio.h>
// #include <ctype.h>

// int main() {
//     int age;
//     char gender, nationality;

//     scanf("%d", &age);
//     scanf(" %c", &gender); 
//     scanf(" %c", &nationality); 

//     gender = toupper(gender);
//     nationality = toupper(nationality);

//     if (nationality != 'I') {
//         printf("You are not an Indian citizen, cannot get married in India\n");
//     } else {
        
//         if (gender == 'M' && age >= 21) {
//             printf("Eligible to get married in India\n");
//         } else if (gender == 'F' && age >= 18) {
//             printf("Eligible to get married in India\n");
//         } else {
//             printf("Not eligible to get married in India\n");
//         }
//     } 
// }

// Q.3 Write a C program to input the lengths of all sides of a triangle and check whether the triangle is valid.

// Validity Check :-
// ------------------
// 	-> The sum of side1 and side2 must be greater than side3.
// 	-> The sum of side1 and side3 must be greater than side2.
// 	-> The sum of side2 and side3 must be greater than side1.

// If all three conditions are true, the program should print "The triangle is valid." If any of the conditions are false, the program should print "The triangle is not valid."

// Sample Input :-
// ---------------
// Enter the lengths of the three sides of the triangle:
// -> Side 1: 3
// -> Side 2: 4
// -> Side 3: 5

// Sample Output :-
// -----------------
// The triangle is valid.

// Sample Input :-
// ---------------
// Enter the lengths of the three sides of the triangle:
// -> Side 1: 1
// -> Side 2: 2
// -> Side 3: 3

// Sample Output :-
// ----------------
// The triangle is not valid.
// Sample Input
// 3
// 4
// 5
// Sample Output
// The triangle is valid.

//C program:
// #include<stdio.h>
// int main(){
//     int side1,side2,side3;
//     scanf("%d%d%d",&side1,&side2,&side3);

//     if((side1 + side2 > side3) && (side1 + side3 >side2) && (side2 + side3 > side1))
//     {
//         printf("Triangle is valid");
//     }
//     else
//     printf("Triangle is Not valid");
// }

// Q.4 Write a C program to calculate the total bill for a customer based on the type of tea and the number of cups ordered.

// 1. The program should display a menu to the customer with the available tea options and their prices.
// 2. The program should ask the customer to enter their choice of tea from the menu.
// 3. The program should ask the customer to enter the number of cups they want to order.
// 4. Based on the type of tea and the number of cups ordered, the program should calculate the total bill.
// 5. The program should display the total bill to the customer.


// case 1 :
// input :
// 	Tea Menu:
// 	1. Masala Tea - Rs. 10 per cup
// 	2. Ginger Tea - Rs. 15 per cup
// 	3. Lemon Tea - Rs. 20 per cup
// 	Enter your choice (1/2/3): 2

// 	Enter the number of cups: 3
// output :
// 	Total bill: Rs. 45.00
// Sample Input
// 3
// 2
// Sample Output
// Total bill: Rs. 40.00

// C program:
// #include <stdio.h>
// #include <stdbool.h>

// int main() {
//     int choice, cups;
//     float pricePerCup, totalBill;
//     bool validChoice = true;

//     scanf("%d", &choice);
//     scanf("%d", &cups);

//     if (choice == 1) {
//         pricePerCup = 10.0;
//     } else if (choice == 2) {
//         pricePerCup = 15.0;
//     } else if (choice == 3) {
//         pricePerCup = 20.0;
//     } else {
//         printf("Invalid tea choice.\n");
//         validChoice = false;
//     }

//     if (validChoice) {
//         totalBill = pricePerCup * cups;
//         printf("Total bill: Rs. %.2f\n", totalBill);
//     }

//     return 0;
// }

// 
// Write a C program that takes the time of day as input (in hours) and prints whether it is morning, afternoon, evening, or night using an if statement.

// -categorize the time of day into four categories:
// if the time between 0 - 5 then print Night
// if the time between 6 - 11 then print Morning
// if the time between 12 -17 then print Afternoon
// if the time between 18 - 23 then print Evening
// if the time is more then 24 then print invalid time


// case 1:
// Input: 
// 	Enter time  : 3
// Expected Output: 
// 	"It is night."
// Sample Input
// 3
// Sample Output
// It is night.

// C Program:
#include<stdio.h>
int main()
{
    int time;
    scanf("%d",&time);

    if(time>=0 && time<=5){
    printf("It is night.");
    return 0;
    }

    if(time>=6 && time<=11){
    printf("It is morning.");
    return 0;
    }

    if(time>=12 && time<=17){
    printf("It is afternoon.");
    return 0;
    }

    if(time>=18 && time<=23){
    printf("It is evening.");}

    else{
    printf("Invalid time.");
    }
}