import java.util.Scanner;
class Method17 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int reverse=m1(sc.nextInt());
		System.out.println(reverse);
	}
	public static int m1(int num)
	{
		int sum=0;
		while(num>0)
			{
				int rem=num%10;
				sum=(sum*10)+rem;
				num=num/10;
			}
			
		return (sum);
	}
}