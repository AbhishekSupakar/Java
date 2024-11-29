import java.util.Scanner;
class ArmstrongNumber
{
	int number;
	int count;
	int power;
	public int Digitcount(){
		int a = number,c=0;
		do
		{
			c++;
			a/=10;
		}
		while (a!=0);
		return c;
	}
	public int Power(){
		int a=count;
		int r=0,p=0,s=1;
		for (int numb =number;numb!=0; numb=numb/10)
		{
			a=count;
			r = numb%10;
			s=1;
			while (a!=0)
			{
				s=s*r;
				a--;
			}
			p+=s;
			
		}
		return p;
	}
	public void checkArmstrong(){
		System.out.println("================================================");
		if (power == number)
		{
			System.out.println(number+" is an armstrong number.");
		}
		else
		{
			System.out.println(number+" is not an armstrong number.");	
		}
		System.out.println("=================================================");
	}
	public void Dispaly(){
		System.out.println("==================================================");	
		System.out.println("Give number is : "+number);	
		System.out.println("Digits in number are: "+count);
		System.out.println("Check the Power Sum of the number is: "+power);	
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ArmstrongNumber n1 = new ArmstrongNumber();
		System.out.print("Enter a number: ");
		n1.number = sc.nextInt();
		n1.count = n1.Digitcount();
		n1.power = n1.Power();
		n1.Dispaly();
		n1.checkArmstrong();
	}
}
