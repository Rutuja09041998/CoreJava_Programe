import java.util.Scanner;
class Method26//Prime number
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int a=sc.nextInt();
		 boolean num=isPrime(a);
		 System.out.println(num);
	}

	public static boolean isPrime(int data)
		{
			int c=0;
			int s=1;

            while(s<=data)
				{
					if(data%s==0)
						c++;
					s++;
				}
				if(c==2)
			{
				return true;
			}
				else
			{
					return false;
			}
		}
}
