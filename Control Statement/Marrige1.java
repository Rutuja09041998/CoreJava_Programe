import java.util.Scanner;
class  Marrige1
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		System.out.println("enter gender");
		char gender=sc.next().charAt(0);
		if((age>=21&&age<=40) && gender=='m'||(age>=18&&age<=30) && gender=='f')
		{
		 System.out.println("can marry");	
		}
		else{
		 System.out.println("can not marry");
		}
	}
}
