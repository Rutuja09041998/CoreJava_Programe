import java.util.Scanner;
class Activity5_1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Quotient 5.Reminder");
		s
		switch(sc.nextInt())
		{
			case 1:
			{
				System .out.println("enter two numbers");
				System.out.println(sc.nextInt()+sc.nextInt());
			break;
			}
			case 2:
			{
				System .out.println("enter two numbers");
				System.out.println(sc.nextInt()-sc.nextInt());
			break;
			}
			case 3:
			{
				System .out.println("enter two numbers");
				System.out.println(sc.nextInt()*sc.nextInt());
			break;
			}
			case 4:
			{
				System .out.println("enter two numbers");
				System.out.println(sc.nextInt()/sc.nextInt());
			break;
			}
			case 5:
			{
				System .out.println("enter two numbers");
				System.out.println(sc.nextInt()%sc.nextInt());
			break;
			}
			default:	
            {
			    System.out.println("enter valid input");
			}
		}
	}
}
