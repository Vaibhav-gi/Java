// Q. WAPTP Electricity Bill.

// Rules for determining bill
// --------------------------
// Slabs: first 50 units of electricity @0.50 doller per unit, simililarly next 150 @0.75, 
// next 250 @1.20, >250 @1.50 + surcharge

// *First 50 units: $0.50/unit

// *Next 150 units (51–200): $0.75/unit

// *Next 250 units (201–450): $1.20/unit

// *Above 450 units: $1.50/unit

// *A surcharge of 20% is applied only if total units > 250



// input: 52 units -> 26.5
// Sample Input
// 52
// Sample Output
// 26.50

// Java Program :
import java.util.Scanner;
class ElectricityBillCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the units : ");
        int units = sc.nextInt();
        double bill = 0;

        if(units <= 50){
        bill = units * 0.50;
        } else if(units <= 200){
            bill = 50 * 0.50 + (units - 50) * 0.75;
        } else if(units <= 450){
            bill = 50 * 0.50 + 150 * 0.75 + (units -200) * 1.20;
        } else {
            bill = 50 * 0.50 + 150 * 0.75 + 250 * 1.20 + (units - 450) * 1.50;
            bill = bill + bill * 0.20;
        }
        System.out.printf("%.2f",bill);
    }
}