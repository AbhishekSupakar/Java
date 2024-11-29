/*
Number: 6
The number is a perfect number

Number: 28
The number is a perfect number

Number: 10
The number is not a perfect number

checkPerfectNumber()
*/

class PerfectNumber 
{
	int number;// (int)
	boolean isPerfect;// (boolean)
	public static void checkPerfectNumber(int num){
		int s=0;
		for (int i = 1; i<num-1 ;i++ )
		{
			if(num%i == 0){
				s+=i;
			}
		}
		if(s==num){
			System.out.println("Number: "+num);
			System.out.println("The number is a perfect number");
		}
		else{
			System.out.println("Number: "+num);
			System.out.println("The number is not a perfect number");
		}
	}
	public static void main(String[] args) 
	{
		PerfectNumber n1 = new PerfectNumber();
		n1.number = 6;
		checkPerfectNumber(n1.number);
		PerfectNumber n2 = new PerfectNumber();
		n2.number = 28;
		checkPerfectNumber(n2.number);
		PerfectNumber n3 = new PerfectNumber();
		n3.number = 10;
		checkPerfectNumber(n3.number);
		
	}
}