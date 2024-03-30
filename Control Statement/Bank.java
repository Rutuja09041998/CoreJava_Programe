import java.util.Scanner;
class Bank 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount");
		int a=sc.nextInt();
		System.out.println("enter the password");
		int b=sc.nextInt();
		if(a<=1000 && b==123)
		{
			System.out.println("your withdraw sucess");
			return;
		}
		System.out.println("something went wrong");
	}
}
