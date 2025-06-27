import java.util.Scanner;
class DifferenceOfDigits
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int temp = 0;

		if(num<=0)
		{
			System.out.println("Zero");
		}
		 else if (num>99)
		{
			System.out.println("-1");
		}	
		else
		{
			temp = num % 10;
			int sub =num/10; 
			System.out.println(sub-temp);
		}
	}
}