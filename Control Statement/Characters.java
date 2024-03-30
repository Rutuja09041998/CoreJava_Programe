import java .util.Scanner;
class  Characters
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the data");
		char ch=sc.next().charAt(0);
		if(ch>=65 && ch<=90)
		{
			System.out.println("Uppercase char");
		}
		else if(ch>=97 && ch<=122)
		{
			System.out.println("Lowercase char");
		}
		else if(ch>=48 && ch<=57)
		{
			System.out.println("Numbers");
		}
		else{
			System.out.println("Symbol");
		}
	}
}