import java.util.Scanner;
class Activity_5
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		
		int a=sc.nextInt();
	    int b=sc.nextInt();

		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		int input=sc.nextInt();

		switch(input)
		{
			case 1:
				System.out.println("Addition of (a+b)="+(a+b));
			break;

			case 2:
				System.out.println("Subtraction of (a-b)="+(a-b));
			break;

			case 3:
				System.out.println("Multiplication of (a*b)="+(a*b));
			break;

			case 4:
				System.out.println("Division of (a/b)="+(a/b));
	        break;
		}
	}
}
