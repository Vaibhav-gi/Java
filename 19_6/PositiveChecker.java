class PositiveChecker 
{
	public static void main(String[] args) 
	{
		

		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);

		if(a<0||b<0){
			System.out.println("Negative Numbers are not allowed");
		}
		else if(a>0 && b>0){


			int max= a>b? a:b;
			String s1= a%2==0 ? "Even" : "Odd";
			String s2= b%2==0 ? "Even" : "Odd";
			System.out.println(max);
			System.out.println(s1);
			System.out.println(s2);
		}
	}
}
