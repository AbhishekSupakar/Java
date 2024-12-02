import java.util.Scanner;
class StringJoining 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String str = sc.nextLine();
		System.out.print("Enter Second string: ");
		String str2 = sc.nextLine();
		String str3 = String.join(" ", "Orange", "Apple", str,str2,"Mango");
		System.out.println("Join multiple strings: "+str3);


		//public String join(CharSequence separator, CharSequence... elements)
		//The join() method joins one or more strings with a specified separator.
		/*
		Q - 13
        String[] arr = {"Java", "is","a","programming","language"};
        String res = String.join("100",arr);
        System.out.println(res);
		*/
	
	
	}
}
