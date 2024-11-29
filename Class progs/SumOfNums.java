//wap a to enter two int values from user and sum of two number
import java.util.Scanner;
class  SumOfNums
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a+b;
		System.out.print("Two numbers Sum : "+c);
		System.out.println();


	}
}
