import java.util.Scanner;
class SumOfRoundedThreeIntegers
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = sc.nextInt();
		System.out.println("Enter the second number : ");
		int b = sc.nextInt();
		System.out.println("Enter the third number : ");
		int c = sc.nextInt();

		if (a<0 || b<0 || c<0)
		{
			System.out.println("-1");
		}
		else 
		{
			int temp1 = a % 10;
			if (temp1 < 5)
			{
				
			}
			
		}
	}
}