class CheckNum 
{
	public static void isPalindrome(int num){
		int r,s=0,m;
		m=num;
		while(m!=0){
			r=m%10;
			s=s*10+r;
			m/=10;
		}
		if(s==num){
			System.out.println(num+" is a Palindrome Number.");
		}
		else{
			System.out.println(num+" is not a Palindrome Number.");
		}

	}
	public static void isPerfect(int num){
		int i,j,s=0;
		for (i = 1;i <= num/2 ; i++)
		{
			if (num % i == 0)
			{
				s+=i;
			}
		}
		if(s==num){
			System.out.println(num+" is a Perfect Number.");
		}
		else{
			System.out.println(num+" is not a Perfect Number.");
		}
	}
	public static void main(String[] args) 
	{
		int num,i;
		num = 0;
		if (num >= 1 || num <= -1)
		{
		
		i=1;
		switch (i)
		{
		case 1: isPalindrome(num);
				break;
		case 2: isPerfect(num);
				break;
		default : System.out.println("Exit.");
				break;
			
		}
		}
		else
			{
				System.out.println(0+" Can't Be Palindrome nor Perfect.");
			}
	}
}
