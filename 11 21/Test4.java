//wap to store num and dispaly the number is prime number or not
class  Test4
{
	public static void main(String[] args) 
	{
		int a,b,c;
		b=13;
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
		if(c==2){
		System.out.println("Numbers " +b+" is a prime number ");}
		else{
			System.out.println("Numbers " +b+" is not a prime number ");
		}
	}
}