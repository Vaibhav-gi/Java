import java.util.Scanner;
class VotingEligibility
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age;
		age= sc.nextInt();

		if (age >=18)
		{
			System.out.println("Eligible for voting");
		}
		else 
		{
			System.out.println("Not Eligible for voting");
		}
	}
}