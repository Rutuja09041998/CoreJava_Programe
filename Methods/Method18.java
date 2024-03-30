import java.util.Scanner;
class Method18 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		 int lastdigit=m1(sc.nextInt());
		 System.out.println(lastdigit);
	}
	public static int m1(int num)
	{
		return (num%10);
	}
}
	


