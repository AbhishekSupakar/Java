class CarS 
{
	String BrandName;
	String color;
	int price;
	public void setterMethod(String BrandName,String color){
		this.BrandName = BrandName;
		this.color = color;
		
	}
	public void setterMethod(int price){
		
		this.price = price;
	}
	public void DisplayDetails(){
		//System.out.println();
		System.out.println("Car brand name: "+BrandName);
		System.out.println("Car color : "+color);
		System.out.println("Car price : "+price);
		System.out.println();
	}
}

class driver
{
	public static void main(String[] args) 
	{
		CarS c1 = new CarS();
		CarS c2 = c1;
		CarS c3 = c1;
		c1.setterMethod("Volvo","Red");
		c1.setterMethod(50000000);
		c1.DisplayDetails();
		c2.setterMethod("TATA","Black");
		c2.setterMethod(3500000);
		c2.DisplayDetails();

		c3.setterMethod("BMW","White");
		c3.setterMethod(7500000);
		c3.DisplayDetails();
		
	}
}