import java .util.Scanner;
class  Devide
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter int type data");
		int a=sc.nextInt();
		if(a%3==0 && a%5==0)
		{
			System.out.println("Hi");
			System.exit(0);
		}
		System.out.println("Bye");
	}
}