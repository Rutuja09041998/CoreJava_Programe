import java.util.Scanner;
class Method10 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		m1(sc.nextInt());
	}
	public static void m1(int num)
	{
		System.out.println(num*num*num);
	}
}
