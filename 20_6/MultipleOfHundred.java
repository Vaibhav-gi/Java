import java.util.Scanner;
class MultipleOfHundred
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int nextmultiple;
		
		if (num>0)
		{
			nextmultiple = ((num / 100)+1)*100;


			System.out.println("Next Multiple Of Hundred is : "+nextmultiple);
		}
		else
		{
			System.out.println("-1");
		}
	}
}