import java.util.Scanner;
class  StringOddOrEven
{
	public static int ASCIIvalue(char ch)
	{
		return ch;
	}
	public static boolean Check(String str)
	{
		for (int i=0;i<=str.length() ;i++ )
		{
			char ch = str.charAt(i);
			int c = ch;
			if (c%2==0)
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
		char ch = sc.next().charAt(0);
		int result = ASCIIvalue(ch);
		System.out.println("ASCII value of "+ch+" : "+result);
		System.out.print("Enter a String: ");
		String str = sc.next();
		if(Check(str))
		{
			System.out.println(str+" is odd;");
		}
		else
		{
			System.out.println(str+" is even;");
		}
	}
}
