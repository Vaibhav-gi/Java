import java.util.Scanner;
class TestGreatestOfThree
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second Number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter third Number : ");
        int num3 = sc.nextInt();

        if((num1 >= num2) && (num1 >= num3))
        {
            System.out.println("Greatest: "+num1);
        }
        if((num2 > num1) && (num2 >= num3))
        {
            System.out.println("Greatest: "+num2);
        }
        if((num3 > num1) && (num3 > num2))
        {
            System.out.println("Greatest: "+num3);
        }
    }
}