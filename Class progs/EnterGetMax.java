import java.util.Scanner;
class EnterGetMax
{
	public static void Greater(int a,int b)
	{
		if (a>b)
		{
			System.out.println(a+" is greater.");
		}
		else if (b>a)
		{
			System.out.println(b+" is greater.");
		}
		else
		{
			System.out.println("Both are Equal.");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr Two Number: ");
		int Nm = sc.nextInt();
		int Nm2 = sc.nextInt();
		Greater(Nm,Nm2);
	}
}
