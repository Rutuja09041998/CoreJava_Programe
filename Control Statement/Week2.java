import java.util.Scanner;
class  Week2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a day");

		switch(sc.next())
			{
				case "monday":
					System.out.println("Vollyball");
				break;
				case "tuesday":
				case "saturday":
					System.out.println("Cricket");
				break;
				case "wednsday":
					System.out.println("Kho-Kho");
				break;
				case "thursday":
					System.out.println("Kabaddi");
				break;
				case "friday":
					System.out.println("Movie");
				break;
				case "sunday":
					System.out.println("Sleeping");
				break;
				default:
					System.out.println("User please enter 1 to 7");
			}
	}
}
