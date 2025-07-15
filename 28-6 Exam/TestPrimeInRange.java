import java.util.Scanner;
class TestPrimeInRange
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Starting Number : ");
        int start = sc.nextInt();
        System.out.print("Enter the Ending Number : ");
        int end = sc.nextInt();
        
         System.out.println("Prime numbers between " +start+  " and " +end+  " are:");
        for(int n=start;n<=end;n++)
        {
            int count = 0;
            for(int i=1;i<=n;i++)
            {
                if(n %i == 0)
                {
                    count ++;
                }
            }
            if(count == 2)
            {
                System.out.printf(n + " ");
                
            }
        }
       
    }
}
