import java.util.Scanner;
class Activity
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input");
		int input=sc.nextInt();
		int a=sc.nextInt();
	    int b=sc.nextInt();

		switch(input)
			
		{
			case 1:
				System.out.println("Addition="+(a+b));
			break;

			case 2:
				System.out.println("Subtraction="+(a-b));
			break;

			case 3:
				System.out.println("Multiplication="+(a*b));
			break;

			case 4:
				System.out.println("Division="+(a/b));
			break;

			default :
				System.out.println(" Please enter valid input");
		}
	}
}
