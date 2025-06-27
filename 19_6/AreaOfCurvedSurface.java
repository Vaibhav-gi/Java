import java.util.Scanner;
class AreaOfCurvedSurface
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of the Square : ");
		int side = sc.nextInt();
		int area = side * side;
		System.out.println("area of square : "+area);
		int curvedsurfacearea = 6 * (side * side);
		System.out.println("area of curved surface : "+curvedsurfacearea);
	}
}