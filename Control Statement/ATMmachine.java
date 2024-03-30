import java.util.Scanner;
class  ATMmachine
{
	public static void main(String[] args) 
	{
		int accountno=12345;
		int password=1111;
		double balance=1000;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter account no");

		if(accountno==sc.nextInt())
		{
	      System.out.println("enter password");

		  if (password==sc.nextInt())
		  {
			  System.out.println("enter amount to withdraw");

			  if(balance>=sc.nextDouble())
				  {
					System.out.println("transaction succesfull"+(char)+1);
				  }
				  else
					  {
						System.out.println("insufficient balance");
					  }
		  }
		  else
			  {
				System.out.println("password is incorrect");
			  }
		}
		else
		{
			System.out.println("account no does not match");
		}
	}

}
