import java.util.Scanner;
class Method19 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int sumfl=m1(sc.nextInt());
		System.out.println(sumfl);
	}
	public static int m1(int num)
	{
		int fl=num%10;
		num/=10;
		int sum=0;
		while(num>10)
			{
			 int rem=num%10;
			 sum=sum+rem;
			 num=num/10;
			}
			fl=fl+num;
		return (fl);
	}
}
