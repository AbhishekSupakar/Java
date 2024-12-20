import java.util.Scanner;

class NeonNumber
{
	public static int getSquare(int num)
	{
		return num*num;
	}
	public static boolean isNeonNumber(int num,int sqr)
	{
		int r=0,s=0;
		while (sqr!=0)
		{
			r = sqr%10;
			s+=r;
			sqr/=10;
		}
		if (s==num)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int sqr = getSquare(num);
		boolean at = isNeonNumber(num,sqr);
		System.out.println("Is "+num+" a Neon Number? "+at);
	}
}
