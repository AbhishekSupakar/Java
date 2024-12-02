import java.util.Scanner;

class  UNIcode
{
	public static String DecimalToHexadecimal(int num)
	{
		int r=0,rev=0;
		String n ="";
		char s= 'A';
		while (num!=0)
		{
			r = num%16;
			if (r>9)
			{
			if(r==10){s='A';n=s+n;}
			if(r==11){s='B';n=s+n;}
			if(r==12){s='C';n=s+n;}
			if(r==13){s='D';n=s+n;}
			if(r==14){s='E';n=s+n;}
			if(r==15){s='F';n=s+n;}
			}
			else {n=r+n;}
			
			num/=16;

		}
		
		return n;
	}
	public static String CONVERTtoUNIcode(String hex)
	{
		String str ="\\u00";
		str = str+hex;
		return str;
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Character : ");
		char ch = sc.next().charAt(0);
		String hex = DecimalToHexadecimal((int)ch);
		String uniCode = CONVERTtoUNIcode(hex);
		//@64, Unicode: \u0040
		System.out.println("Character: "+ch+", ASCII: "+(int)ch+", Unicode: "+uniCode);

	}
}