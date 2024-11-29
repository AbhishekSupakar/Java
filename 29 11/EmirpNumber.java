import java.util.Scanner;

class  EmirpNumber
{
	public static boolean isPrime(int num)
	{
		for (int i=2;i<num ;i++ )
		{
			if (num%i == 0)
			{
				return false;
			}
		}
		return true;
	}
	public static int reverseNumber(int num)
	{
		int rev = 0,r = 0;	
		while (num != 0)
		{
			r = num%10;
			rev = (rev*10) + r;
			num/=10;
		}
		return rev;
	}
	public static boolean isEmirpNumber(int num)
	{
		for (int i=2;i<num ;i++ )
		{
			if (num%i == 0)
			{
				return false;
			}
		}
		return true;	
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		boolean f = isPrime(num);
		int rev = reverseNumber(num);
		boolean z = false;
		if (f && rev != num && num > 9)
		{
			z = isEmirpNumber(rev);
		}
		System.out.println("Is "+num+" a Emirp Number? "+z);
	}
}
