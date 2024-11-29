import java.util.Scanner;
class SecondLargest2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many numbers you want: ");
		int n = sc.nextInt();
		int i =1;
		int fm=-1;int sm=-1;
		System.out.println("Enter "+n+" numbers.");
		if (n<2)
		{
			System.out.println("Don't have second maximum");
		}
		for (i=1; i<=n;i++ )
		{
			int ai = sc.nextInt();
			if (ai>fm)
			{
				sm= fm;
				fm = ai;
			}
			else if (ai>sm && ai!=fm)
			{
				sm = ai;
			}
			
			
			
		}
		System.out.println("Second max is "+sm );
		
	}
}
