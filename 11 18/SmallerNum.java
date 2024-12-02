class SmallerNum 
{
	public static void SmallerNumberBetween(int a,int b){
		if(a>b){
			System.out.println("b= "+b+ " is Smaller");
		}
		else{
			System.out.println("a= "+a+ " is Smaller");
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Display the smaller number among them.");
		int a,b;
		a=123;
		b=143;
		SmallerNumberBetween(a,b);
	}
}
