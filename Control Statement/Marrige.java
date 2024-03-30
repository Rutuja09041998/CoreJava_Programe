import java.util.Scanner;
class  Marrige
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		System.out.println("enter gender");
		char gender=sc.next().charAt(0);
		if(age>=21 && gender=='m'|| age>=18 && gender=='f')
		{
		 System.out.println("can marry");	
		}
		else{
		 System.out.println("cannot marry");
		}
	}
}
