import java.util.Scanner;
class AreaOfCylinder
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of cylinder : ");
		double r = sc.nextDouble();

		System.out.println("Enter the height of cylinder : ");
		double h = sc.nextDouble();
		
		double pi = 3.14;

		double area = (2*pi*r*h) + (2*pi*r*r);

		System.out.println("The area of cylinder : "+area);

	}
}