// Q. WAPTP Profit or Loss for the given cost and sell price.

// Input: 
// cost=500, sell=600 → Profit: 100
// cost=500, sell=400 → Loss: 100
// Sample Input
// 500
// 600
// Sample Output
// Profit: 100

// Java Program :
import java.util.Scanner;
class ProfitOrLoss
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost price : ");
        int cost = sc.nextInt();
        System.out.print("Enter the sell price :");
        int sell = sc.nextInt();
        int profit ;
        int loss ;

        if (cost < sell)
        {
            profit = sell - cost;
            System.out.println("Profit: "+profit);
        }
        else if(cost > sell)
        {
            loss = (cost - sell);

            System.out.println("Loss: "+loss);
        }
        else
        {
            System.out.println("No Profit No Loss");
        }
    }
}