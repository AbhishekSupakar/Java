import java.util.Scanner;

class FindVowel
{
	public static void toCharCheckVowel(String str)
	{
		int count  = 0;
		String lw = str.toLowerCase();
		char ch ;

		for (int i = 0; i<str.length() ;i++ )
		{
			ch = lw.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch== 'o' || ch == 'u')
			{
				System.out.println(ch+" is in "+i+" position, and first vowel.");
				count++;
				break;
			}

		}

		if (count==0)
			{
				System.out.println("Sorry no vowel");
			}

		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String str = sc.nextLine();
		toCharCheckVowel(str);
		
	}
}