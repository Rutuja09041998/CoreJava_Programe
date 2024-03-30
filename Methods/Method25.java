import java.util.Scanner;
class Method25
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int number=sc.nextInt();
	    System.out.println("Enter Power");
	    int powerOfNumber=sc.nextInt();
	    int powervalue=m1(number,powerOfNumber);
		System.out.println(powervalue);
	}
       public static int m1(int num,int power)
	    {		   
            int value=1;

		    while(power>0)
			  {
				value=value*num;
				power--;
			  }
		        return value;
	    }
}

/*import java.util.Scanner;
class Method25
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
	    int powervalue=m1();
		System.out.println(powervalue);
	}
       public static int m1()
	   {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter Number");
		   int num=sc.nextInt();
		   System.out.println("Enter Power");
		    int power=sc.nextInt();
            int value=1;

		    while(power>0)
			  {
				value=value*num;
				power--;
			  }
		        return value;
	    }
}*/