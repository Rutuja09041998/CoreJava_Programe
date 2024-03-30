import java.util.Scanner;
class Method13 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int count=m1(sc.nextInt());
		System.out.println(count);
	}
	public static int m1(int num)
	{
		int c=0;
		while(num>0)
			{
				int rem=num%10;
				c++;
				num=num/10;
			}
			
		return (c);
	}
}
