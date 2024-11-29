class FirstClass
{
	static String SV = "Static variable ";
	String NSV = "Non Static Variable";
	public static void SM(){
		System.out.println("First Class Starts");
		System.out.println("SV: "+SV);
	}
	public void NSM(){
		//FirstClass Z1 = new FirstClass();
		//System.out.println("NSV: "+Z1.NSV);
		System.out.println("NSV: "+NSV);
		System.out.println("First Class Ends");
	}
	public static void main(String[] args) 
	{
		System.out.println("First Class");
		
	}
}


class SecondClass

{
	public static void SM2(){
		System.out.println("Second Class Starts");
		FirstClass.SM();
	}
	public void NSM2(){
		FirstClass A1 =new FirstClass();
		A1.NSM();
		System.out.println("Second Class Ends");
	}
	public static void main(String[] args) 
	{
		System.out.println("Second Class");
	}
}


class ThirdClass

{
	public static void main(String[] args) 
	{
		SecondClass.SM2();
		SecondClass B1= new SecondClass();
		B1.NSM2();
	}
}
