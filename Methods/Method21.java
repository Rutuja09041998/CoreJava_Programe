import java.util.Scanner;
class Method21
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int sumofeven=m1(m,n);
		System.out.println(sumofeven);
	}
		public static int m1(int a,int b)
	    {
			int sum=0;
			for(;a<=b;a++)
			{
				if(a%2==0)
					sum=sum+a;
			}
			return sum;
		}

}

/*import java.util.Scanner;
class Method21
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int sumofeven=m1();
		System.out.println(sumofeven);
	}
		public static int m1()
		{
			Scanner sc=new Scanner(System.in);
			int m=sc.nextInt();
			int n=sc.nextInt();
			int sum=0;
			for(;m<=n;m++)
			{
				if(m%2==0)
					sum=sum+m;
			}
			return sum;
		}

}*/