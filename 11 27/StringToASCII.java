import java.util.Scanner;

class StringToASCII
{
	public static void toChartoASCII(String str)
	{
		int ASCII  = 0;
		char ch ;

		for (int i = 0; i<str.length() ;i++ )
		{
			ch = str.charAt(i);

			ASCII = (int)ch;
			System.out.println("ASCII value of "+ch+ " is ( "+ASCII+" )");
		}

		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String str = sc.nextLine();
		toChartoASCII(str);
		
	}
}