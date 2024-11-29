
//Example - KARTHIKEYA NAIDU becomes K. NAIDU
import java.util.Scanner;

class FirstLetterOfName 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your Full name: ");
		String str = sc.nextLine();
		String [] ar = str.split(" ");
		char a = ar[0].charAt(0);
		String newName = a+"."+ar[1];
		System.out.println("new Name is : "+newName);
		
		//Another Method for this is by Amarjeet Maharana
		/*
		String s = "KARTHIKEYA NAIDU";
        String [] arr = s.split(" ");// 0 -> KARTHIKEYA 1 -> NAIDU
		for (int i =0;i<s.length() ; i++)
		{
			System.out.println(arr[i]);
		}
        String res = arr[0].charAt(0)+". "+arr[1];
        System.out.println(res);
		*/
	}
}
