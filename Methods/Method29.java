import java.util.Scanner;
class Method29
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int maxdigit=m1(sc.nextInt());
		System.out.println(maxdigit);
	}
	public static int m1(int num)
	{
	    int max=num%10;

		while(num>0)
		{
			if(num%10>max)
			{
				max=num%10;
			}
			num=num/10;
		}
		return max;
	}

}