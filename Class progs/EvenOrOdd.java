import java.util.Scanner;
class EvenOrOdd 
{
	public static void EvenOdd(int a)
	{
		if (a%2 == 0)
		{
			System.out.println(a+" number is even");
		}
		else
		{
			System.out.println(a+" number is odd");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int b = sc.nextInt();
		EvenOdd(b);
	}
}
