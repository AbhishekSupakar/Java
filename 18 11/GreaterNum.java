class GreaterNum 
{
	public static void GreaterNumberBetween(int a,int b){
		if(a>b){
			System.out.println("a= "+a+ " is greater");
		}
		else{
			System.out.println("b= "+b+ " is greater");
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Display the greater number among them.");
		int a,b;
		a=123;
		b=143;
		GreaterNumberBetween(a,b);
	}
}
