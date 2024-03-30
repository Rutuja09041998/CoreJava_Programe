import java.util.Scanner;
class Method6//Prime number
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int a=sc.nextInt();
		isPrime(a);
	}

	public static void isPrime(int data)
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
					System.out.println("Prime Number");
				else
					System.out.println("Not Prime Number");
		}
}
