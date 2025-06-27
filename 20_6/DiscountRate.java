import java.util.Scanner;
class DiscountRate
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product price : ");
        double price = sc.nextDouble();
        System.out.println("Enter product quantity : ");
        int quantity = sc.nextInt();

        double total = price * quantity;

        double discountRate = (total > 1200) ? 0.10 : 0.05;
        double discountAmount = total * discountRate;
        double finalAmount = total - discountAmount;
        System.out.println("Total Price before discount : "+total);
        System.out.println("Discount (" + (int)(discountRate * 100) + "%)       : Rs. " + discountAmount);
        System.out.println("Total price to be paid after discount : "+ finalAmount);
    }
}