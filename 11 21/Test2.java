//wap to store num and dispaly the factors of the number
class Test2 
{
	public static void main(String[] args) 
	{
		int a,b;
		b=16;
		System.out.println("Dispaly the factors of the number "+b);
		for (a=1;a <= b ;a++ )
		{
			if (b%a==0)
			{
				System.out.print(a+" ");
			}
			
		}
		System.out.println();
	}
}
