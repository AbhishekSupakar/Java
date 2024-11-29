/*
Q15. String Reversal:
Write a program to reverse a given string by converting it into a
char array and manipulating it, as String itself does not have a
reverse method. Use the toCharArray() method.

Q16. WAP to Accept a name and print it in reverse form.
   (If name is JAGANNATH, then output is HTANNAGAJ)


Q-15
       
        String s  = "Umbrella";
        char[] arr = s.toCharArray();
        String res = "";
        for(int i = arr.length-1;i>=0;i--) {
         //System.out.print(arr[i]);
         res+=arr[i];
        }
        System.out.println(s);
        System.out.println(res);
*/
import java.util.Scanner;

class StringReversal 
{
	public static void toCharArray(String str)
	{
		String rev = "";
		char ch ;

		for (int i = 0; i<str.length() ;i++ )
		{
			ch = str.charAt(i);

			rev = ch+rev;
		}

		System.out.println("Reverse of the string is ( "+rev+" )");
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String str = sc.nextLine();
		toCharArray(str);
		//remember
		char[] arr = str.toCharArray();
		System.out.println(arr[2]);
		
	}
}
