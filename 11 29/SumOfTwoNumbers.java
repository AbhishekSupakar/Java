class SumOfTwoNumbers
{
	public static void  sum(int a,double b)
	{
		System.out.println(a+b);	
	}
	public static void  sum(double a,int b)
	{
		System.out.println(a+b);	
	}
	public static void  sum(int b,int a)
	{
		System.out.println(a+b);	
	}
	public static void  sum(double a,double b)
	{
		System.out.println(a+b);	
	}
	public static void main(String[] args) 
	{
		sum(1,1.2);
		sum(1.2,3);
		sum(1.1,1.2);
		sum(3,4);
	}
}
