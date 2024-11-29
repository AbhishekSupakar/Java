import java.util.Scanner;
class SecondLargest 
{
	public static void main(String[] args) 
	{
		int temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers you want to enter: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 1;i<=n ; i++ )
		{
			 arr[i] = sc.nextInt();
		}
		for (int j =1;j<=n ;j++ )
		{
			for (int i = j+1;i<=n ;i++ )
			{
				if (arr[j]>arr[i])
				{
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for (int i = 1;i<=n ; i++ )
		{
			System.out.println(arr[i]+" ");
		}
		for (int i = n;i>=1 ;i-- )
		{
			if (arr[i]>arr[i-1])
			{
				System.out.println("Second largest number is : "+arr[i-1]);
			}
		}
	}
}
