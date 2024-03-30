import java.util.Scanner;
class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();//153
		int temp=num;//
		int count=iscount(num);//
		int sum=0;//
       
		while(num>0)//
		{
			sum=sum+ispower(num%10,count);//
			num=num/10;
		}
		if(sum==temp)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
	}
	public static int iscount(int a)//
	{
		int c=0;//
		while(a>0)//
		{
		    c++;
			a=a/10;//
		}
		return c;//
	}
	public static int ispower(int b,int power)//
	{ 
		
		int value=1;//
		while(power>0)//
		{
			value=value*b;//
			power--;
		}
		return value;//
	}
}
