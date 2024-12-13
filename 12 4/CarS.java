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
		System.out.println("Car brand name: "+BrandName);
		System.out.println("Car color : "+color);
		System.out.println("Car price : "+price);
	}
	
}

