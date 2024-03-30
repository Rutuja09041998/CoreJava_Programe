import java.util.Scanner;
class Method30
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int mindigit=m1(sc.nextInt());
		System.out.println(mindigit);
	}
	public static int m1(int num)
	{
	    int min=num%10;

		while(num>0)
		{
			if(num%10<min)
			{
				min=num%10;
			}
			num=num/10;
		}
		return min;
	}

}