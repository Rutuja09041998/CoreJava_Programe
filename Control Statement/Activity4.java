import java.util.Scanner;
class  Activity4
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		int year=sc.nextInt();

		if(year%4==0)
			{
				System.out.println("Leap Year");
				System.exit(0);
			}
			System.out.println("Not a leap year");
	}
}
