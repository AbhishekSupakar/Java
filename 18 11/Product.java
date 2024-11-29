class Product 
{

	String Pname;
	double price;
	double discount;
	public void ShowDetails(){
		System.out.println("Product name: "+Pname);
		System.out.println("Product Price: "+price);
		System.out.println("Product Discount: "+discount);
	}
	public static void calculateDiscount(double prices, double discounts){
		double discounted_prices=prices-(prices*(discounts/100));
		System.out.println("product discounted_prices: "+discounted_prices);
	}
	public static void main(String[] args) 
	{
		double price;
		double discount;
		System.out.println("---------------------------Product 1------------------------");
		Product p1=new Product();
		p1.Pname="Laptop";
		p1.price = 100000;
		p1.discount=20;
		p1.ShowDetails();
		calculateDiscount(p1.price,p1.discount);
		System.out.println("---------------------------Product 2------------------------");
		Product p2=new Product();
		p2.Pname="Laptop";
		p2.price = 100000;
		p2.discount=10;
		p2.ShowDetails();
		calculateDiscount(p2.price,p2.discount);
		System.out.println("---------------------------Product 3------------------------");
		Product p3=new Product();
		p3.Pname="Laptop";
		p3.price = 100000;
		p3.discount=30;
		p3.ShowDetails();
		calculateDiscount(p3.price,p3.discount);


	

	}
}
