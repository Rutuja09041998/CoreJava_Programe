import java.util.Scanner;
class  Marrige2
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		System.out.println("enter gender");
		char gender=sc.next().charAt(0);

		if((age>=21 && age<=40) && gender=='m'||(age>=18 && age<=30) && gender=='f')
		{
		 System.out.println("can marry");	
		}
		else if(age>=41 && gender=='m'||age>=31 && gender=='f')
		{
		 System.out.println("limit is over");	
		}
		else
		{
		 System.out.println("can not marry");
		}
	}
}
