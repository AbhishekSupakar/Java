import java.util.Scanner;

class FindTheNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many numbers: ");
		int n = sc.nextInt();
		int i = 0;
		int temp=9999;
		int b = 0,c=1,f=0;
		if (n>1)
		{
			for (i=1;i<=n ;i++ )
			{
				System.out.print("Enter "+i+" number: ");
				b = sc.nextInt();
					
				if (temp<=b)
				{
					c=b-temp;
				}
				if (c==2)
				{
					f=b-1;
				}
				if (c==0)
				{
					f=b+1;
				}
				temp = b;
			}
		}
		else
		{
			System.out.println("Less than 1 number is not allowed");
		}
		System.out.println("The number is missing is "+f);
		
	}
}
