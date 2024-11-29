import java.util.Scanner;
class Name01 
{
	public static void Display(String name){
	for (int i=1 ;i<=5 ;i++ )
	{
		System.out.println("Your name is: "+name);
	}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enetr your name: ");
		String Nm = sc.nextLine();
		Display(Nm);
	}
}
