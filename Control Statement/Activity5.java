import java.util.Scanner;
class Activity5
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input");

		switch(sc.nextInt())
		{
			case 1:
				System.out.println("Addition="+(sc.nextInt()+sc.nextInt()));
			break;

			case 2:
				System.out.println("Subtraction="+(sc.nextInt()-sc.nextInt()));
			break;

			case 3:
				System.out.println("Multiplication="+(sc.nextInt()*sc.nextInt()));
			break;

			case 4:
				System.out.println("Division="+(sc.nextInt()/sc.nextInt()));
			break;

			default :
				System.out.println(" Please enter valid input");
		}
	}
}
