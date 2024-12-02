import java.util.Scanner;
class  CharUNIcode
{
	public static int ASCIIvalue(char ch)
	{
		return ch;
	}
	public static 
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		char ch = sc.next().charAt(0);
		int result = ASCIIvalue(ch);
		System.out.println("ASCII value of "+ch+" : "+result);
	}
}
