import java.util.Scanner;

class ZomatoOrder 
{
	String customerName;
	double orderAmount,discountRate;
	int quantity;
	public static void main(String[] args) 
	{
		ZomatoOrder a1 = new ZomatoOrder();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Customer Name: ");
		a1.customerName =sc.nextLine();

		System.out.println("Hello World!");
	}
}
