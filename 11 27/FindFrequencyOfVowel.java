import java.util.Scanner;

class FindFrequencyOfVowel
{
	public static void toCharCheckVowelTimes(String str)
	{
		int count  = 0;
		String lw = str.toLowerCase();
		char[] ch= lw.toCharArray();

		for (int j = 0; j<str.length() ;j++ )
		{
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch== 'o' || ch == 'u')
			{
				System.out.println(ch+" is in "+i+" position.");
				count++;
			} 
				
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String str = sc.nextLine();
		toCharCheckVowelTimes(str);
		
	}
}