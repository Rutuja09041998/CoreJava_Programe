import java.util.Scanner;
class Method15 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int sum=m1(sc.nextInt());
		System.out.println(sum);
	}
	public static int m1(int num)
	{
		int sum=0;
		while(num>0)
			{
				int rem=num%10;
				sum=sum+rem;
				num=num/10;
			}
			
		return (sum);
	}
}
