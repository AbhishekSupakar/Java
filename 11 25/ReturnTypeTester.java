class ReturnTypeTester 
{
	double a,b;
	int z;
	char Ch;
//System.out.println("Hello World!");
	public boolean IsTrue(int number){
		if (number % 2 ==0)
		{
			return true;
		}
		return false;
	}
	public static boolean GetMaxValue(double a,double b){
		
		return a<b;
	}
	public double findAverage(){
		double x = (a+b)/2;
		return x;
		
	}
	public void asciiValu(){
		System.out.println("ASCII value of "+Ch+" is "+(int)Ch);	
	}
	public static void main(String[] args) 
	{
		ReturnTypeTester A1= new ReturnTypeTester();
		A1.a = 2342.00;
		A1.b = 2321.00;
		A1.z = 123;
		A1.Ch = 'A';
		A1.asciiValu();
		A1.findAverage();
		
	}
}
