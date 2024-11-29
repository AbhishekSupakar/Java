import java.util.Scanner;
class StringQues 
{
	String str,str2,str3;
	
	public void LengthCheck()
	{
		System.out.println("Length of the string: "+str.length());
	}
	public void ShowIndex()
	{
		int z = str.length();
		if (z <= 5)
		{
			System.out.println("String length is less than 5, so can.t be show the 5th character.");
		}
		else{
			System.out.println("Show chatacter of the string at 5th position: "+str.charAt(5));
		}
	}
	public String Concatenation()
	{
		String z = str.concat(str2);
		System.out.println("Concatenate two strings entered by the user: "+z);
		return z;
	}
	public void SubstringExtraction()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enetr Frist point of the String: ");
		int a = sc.nextInt();
		System.out.print("Enetr Second point of the String: ");
		int b = sc.nextInt();
		int z = str3.length();
		if (a>=z || b>=z)
		{
			System.out.println("Worng input!!");
		}
		else
		{
		System.out.println("Substring from a given string: "+str3.substring(a,b));
		}
	}
	public void StringComparison()
	{
		System.out.println("String "+str+" Equal with "+str2+"??"+str.equals(str2));
	}
	public void IgnoreCaseComparison()
	{
		System.out.println("String "+str+" Equal with "+str2+" with out checking cases??"+str.equalsIgnoreCase(str2));
	}
	public void StringReplacement()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enetr old character to change from string given: ");
		char a = sc.next().charAt(0);
		System.out.print("Enetr new character to replace: ");
		char b = sc.next().charAt(0);
		System.out.println("replace all occurrences of a character in a string with another character "+str3.replace(a, b));
	}
	public void StartsAndEndsCheck() {
        System.out.println("Does the string start with 'Java'? " + str.startsWith("Java"));
        System.out.println("Does the string end with 'Code'? " + str.endsWith("Code"));
    }

    public void CaseConversion() {
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
    }

    public void WhitespaceTrimming() {
        System.out.println("Trimmed string: '" + str.trim() + "'");
    }

    public void IndexOfSubstring() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the substring to search: ");
        String substring = sc.nextLine();
        System.out.println("First occurrence of substring: " + str3.indexOf(substring));
        System.out.println("Last occurrence of substring: " + str3.lastIndexOf(substring));
    }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first string: ");
		StringQues a = new StringQues();
		a.str = sc.nextLine();
		System.out.print("Enter first string: ");
		a.str2 = sc.nextLine();
		a.LengthCheck();
		a.ShowIndex();
		a.str3 = a.Concatenation();
		a.SubstringExtraction();
		a.StringComparison();
		a.IgnoreCaseComparison();
		a.StringReplacement();
		a.StartsAndEndsCheck();
        a.CaseConversion();
        a.WhitespaceTrimming();
        a.IndexOfSubstring();
        a.StringSplitting();
		
	}
}
