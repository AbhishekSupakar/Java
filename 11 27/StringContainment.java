import java.util.Scanner;

class StringContainment 
{

/*
The contains() method checks whether a string contains a sequence of characters.

Returns true if the characters exist and false if not.

Syntax
public boolean contains(CharSequence chars)
*/

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String str = sc.nextLine();
		System.out.print("Enter search chars: ");
		String str2 = sc.nextLine();
		String str3 = "Hello World!";
		
		System.out.println(str.contains(str2));
		System.out.println(str3.contains("Hel"));
	}
}