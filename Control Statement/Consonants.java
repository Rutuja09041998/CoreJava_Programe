import java .util.Scanner;
class  Consonants
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter char type data");
		char ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("vowels");
			System.exit(0);
		}
		System.out.println("consonants");
	}
}