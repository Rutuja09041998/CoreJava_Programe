import java.util.Scanner;
class Method11 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int cube=m1(sc.nextInt());
		System.out.println(cube);
	}
	public static int m1(int num)
	{
		return (num*num*num);
	}
}
