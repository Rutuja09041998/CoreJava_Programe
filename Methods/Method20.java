import java.util.Scanner;
class Method20 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int midnum=m1();
		System.out.println(midnum);
	}
	public static int m1()
	{
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a<c)
		   return a;
		else if(b>a && b<c)
		   return b;
		else
		   return c;
	}
}

/*import java.util.Scanner;
class Method20 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int midnum=m1(a,b,c);
		System.out.println(midnum);
	}
	public static int m1(int x,int y,int z)
	{
		if(x>y && x<z)
		   return x;
		else if(y>x && y<z)
		   return y;
		else
		   return z;
	}
}
*/