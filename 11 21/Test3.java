//wap to store num and dispaly the factors of the number and the numbers of how many arte there
class Test3
{

	public static void main(String[] args) 
	{
		int a,b,c;
		b=16;
		System.out.println("Dispaly the factors of the number "+b);
		for (a=1 , c=0;a <= b ;a++ )
		{
			if (b%a==0)
			{
				System.out.print(a+" ");
				c++;
			}
			
		}
		System.out.println();
		System.out.println("Numbers of the factors are "+c);
	}
}