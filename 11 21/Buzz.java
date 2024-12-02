class Buzz{
	public static void isBuzzNumber(int num){
		if (num % 7 == 0 || num % 10 == 7)
			{
				System.out.print(num+" ");
			}
			
			
	}
	public static void displayBuzzNumbers(int p, int q){
		int i;
		
		for (i = p ;i <= q ;i++ )
		{
			isBuzzNumber(i);
		}
		System.out.println();
		
		
		
	}
	public static void main(String[] args) 
	{
		int p = 10;
		int q = 30;
		System.out.println("The Buzz Numbers between "+p+ " and " +q+ " are:" );
		displayBuzzNumbers(p, q);
	}
}