import java.util.Scanner;
class ArithmeticOperations
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        char a = sc.next().charAt(0);
        int num2 = sc.nextInt();

        switch (a) {
            case '+': int sum = num1 + num2;
                System.out.println(sum);
                break;
            case '-': int sub = num1 - num2;
                System.out.println(sub);
                break;
            case '*' : int mul = num1 * num2;
                System.out.println(mul);
                break;
            case '/' : int div = num1 / num2;
                System.out.println(div);
                break;
            default: 
                int mod = num1 % num2;
                System.out.println(mod);
            
        }
    }
}