class CountDigit 
{
	public static void countDigits(int number){
		int m,c = 0;
		for (m = number ;m!=0 ; m/=10)
		{
			c++;
		}
		System.out.println("Number of digits = "+c);
		isOdd(c);
	}
	public static void isOdd(int count){
		if (count % 2 != 0)
		{
			System.out.println("The number's digits contain an odd number of digits.");
		}
		else
		{
			System.out.println("The number's digits do not contain an odd number of digits.");
		}
	}


	public static void main(String[] args) 
	{
		int num;
		num = 7492;
		System.out.println("number: "+num);
		countDigits(num);
	}
}
