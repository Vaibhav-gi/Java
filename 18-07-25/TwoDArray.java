import java.util.Scanner;
class TwoDArray{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the matrix : ");
		int[][] a = new int[3][4];
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = 0; j <= a[i].length - 1; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("Given matrix is : ");
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = 0; j <= a[i].length - 1; j++) {
				System.out.print(" " + a[i][j] + " ");
			}
			System.out.println();
		}
	}
}