import java.util.Scanner;
class  DuckNumber
{
	public static boolean CheckDuck(int number)
	{
		int z=0;
		do
		{
			if (number%10 == 0)
			{
				
				return true;
			}
			
			number/=10;
		}
		while (number>=1);
		return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		String x = sc.next();
		if (x.charAt(0) =='0')
		{
			System.out.println("Is "+x+" a duck number?d " +false);
		}
		else
		{
			int y = Integer.parseInt(x);
			System.out.println("Is "+x+" a duck number? "+CheckDuck(y));
		}
	}
}
