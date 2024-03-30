import java.util.Scanner;
class AutomorphicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter int type data");
		int n=sc.nextInt();
		int square=n*n;

		if(isAutomorphic(square,n))
			System.out.println("Automorphic Number");
		else
			System.out.println("Not Automorphic Number");
	}

		static public boolean isAutomorphic(int sqr,int num)
		{
			while (num>0)
			{
				if(sqr%10!=num%10)
					return false;
				sqr/=10;
				num/=10;
			}
			return true;
		}
}
