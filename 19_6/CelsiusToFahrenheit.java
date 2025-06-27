import java.util.Scanner;
class CelsiusToFahrenheit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Celsius : ");
		double celcius = sc.nextDouble();

		double Fahrenheit = ((9* celcius)/5) + 32;
		System.out.println("Fahrenheit : "+Fahrenheit);
	}
}