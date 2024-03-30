import java.util.Scanner;
class Method27//Perfect Number
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int a=sc.nextInt();
		isPerfect(a);
	}

	public static void isPerfect(int data)
		{
			int sum=0;
			int s=1;

            while(s<=data)
				{
					if(data%s==0)
						sum=sum+s;
					s++;
				}
				if(sum-data==data)
					System.out.println("Perfect Number");
				else
					System.out.println("Not Perfect Number");
		}
}
