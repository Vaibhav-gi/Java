import java.util.Scanner;
class CompoundInterest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle amount : ");
		double principle = sc.nextDouble();
	
		System.out.println("Enter the rate of Interest : ");
		double rate = sc.nextDouble();

		double amount = principle * (1+rate/100) * (1+rate/100) * (1+rate/100);

		double CompoundInterest = amount - principle;

		System.out.println("Total Amount after 3 years = "+amount);
		System.out.println("Compound Interest : "+CompoundInterest);
	}
}