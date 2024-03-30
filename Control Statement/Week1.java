import java.util.Scanner;
class  Week1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a day");
		String day=sc.nextLine();

		switch(day)
			{
				case "monday":
					System.out.println("Volleyball");
				break;
				case "tuesday":
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
				case "saturday":
					System.out.println("Cricket");
				break;
				case "sunday":
					System.out.println("Sleeping");
				break;
				default:
					System.out.println("User please enter monday to sunday");
			}
	}
}
