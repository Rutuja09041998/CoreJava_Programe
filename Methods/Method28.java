class Method28 
{
	public static void main(String[] args) 
	{
		int count=m1(1234);
		System.out.println(count);
	}
	public static int m1(int num)
	{
		int c=0;
		while(num>0)
			{
				int rem=num%10;
				c++;
				num=num/10;
			}
			
		return (c);
	}
}
