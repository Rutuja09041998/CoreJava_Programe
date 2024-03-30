import java.util.Scanner;
class Method14 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		m1(sc.nextInt());
	}
	public static void m1(int num)
	{
		int sum=0;
		while(num>0)
			{
				int rem=num%10;
				sum=sum+rem;
				num=num/10;
			}
			
		System.out.println(sum);
	}
}
