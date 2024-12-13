import java.util.Scanner;

class Clothing {
	String name;
	double price;
	int qty;
public void displayDetails() 
{
	System.out.println("Clothing Item : "+name);
	System.out.println("Price per item:  "+price);
	System.out.println("Quantity : "+qty);
}
}
class Electronic {
	String name;
	double price;
	int qty;

	public void displayDetails() 
{
	System.out.println("Electronic   Item : "+name);
	System.out.println("Price per item:  "+price);
	System.out.println("Quantity : "+qty);
}
}
class Grocery{
	String name;
	double price;
	int qty;

	public void displayDetails() 
{
	System.out.println("Grocery  Item : "+name);
	System.out.println("Price per item:  "+price);
	System.out.println("Quantity : "+qty);
}
}





class ShoppingCart
{
	public double calculatePrice(Clothing cloth, double percentage){
		cloth.displayDetails();
		double FinalPrice = 0;
		double AfterFinalPrice =0;
		if (cloth.qty<=0)
		{
			System.out.println("Wrong Information!!!");
		}
		else{
			FinalPrice = cloth.price * cloth.qty;
			double disscount = FinalPrice*percentage/100;
			System.out.println("Discount price:  "+disscount);
			AfterFinalPrice = FinalPrice - disscount;
			System.out.println("====Final Price for "+cloth.qty+" items: "+AfterFinalPrice+"=====");
		}
		return AfterFinalPrice;

	}
	public double calculatePrice(Electronic e, double percentage){
		e.displayDetails();
		double FinalPrice = 0;
		double AfterFinalPrice =0;
		if (e.qty<=0)
		{
			System.out.println("Wrong Information!!!");
		}
		else{
			FinalPrice = e.price * e.qty;
			double disscount = FinalPrice*percentage/100;
			System.out.println("Discount price:  "+disscount);
			AfterFinalPrice = FinalPrice-disscount;
			System.out.println("====Final Price for "+e.qty+" items: "+AfterFinalPrice+"=====");
		}
		return AfterFinalPrice;
	}
	public double calculatePrice(Grocery g, double percentage){
		g.displayDetails();
		double FinalPrice = 0;
		double AfterFinalPrice =0;
		if (g.qty<=0)
		{
			System.out.println("Wrong Information!!!");
		}
		else{
			FinalPrice = g.price * g.qty;
			double disscount = FinalPrice*percentage/100;
			System.out.println("Discount price:  "+disscount);
			AfterFinalPrice = FinalPrice-disscount;
			System.out.println("===Final Price for "+g.qty+" items: "+AfterFinalPrice+"=====");
		}
		return AfterFinalPrice;
	}
	}
class Final
{
	double discount;
	double ClothPrice;
	double ElectronicPrice;
	double GroceryPrice;
	double FinalPrice;
	public void Display()
	{
		System.out.println("Total price of all items in cart after discount: "+FinalPrice);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Final a1 = new Final();


		Clothing c = new Clothing();
		System.out.print("Enter Product(Clothing) name :");
		c.name = sc.nextLine();
		System.out.print("Enter Product(Clothing) price: ");
		c.price = sc.nextDouble();
		System.out.print("Enter Product(Clothing) quantity: ");
		c.qty = sc.nextInt();
		System.out.print("Enter Product(Clothing) Discount:  ");
		
		double dis = sc.nextInt();
		System.out.println();

		ShoppingCart sct = new ShoppingCart();



		Electronic e = new Electronic();
		System.out.print("Enter Product(Electronic) name :");
		sc.nextLine();
		e.name = sc.nextLine();
		System.out.print("Enter Product(Electronic) price: ");
		e.price = sc.nextDouble();
		System.out.print("Enter Product(Electronic) quantity: ");
		e.qty = sc.nextInt();
		System.out.print("Enter Product(Electronic) Discount:  ");
		double dis2 = sc.nextInt();
		System.out.println();

		ShoppingCart sct2 = sct;
		




		Grocery g = new Grocery();
		System.out.print("Enter Product(Grocery) name :");
		sc.nextLine();
		g.name = sc.nextLine();
		System.out.print("Enter Product(Grocery) price: ");
		g.price = sc.nextDouble();
		System.out.print("Enter Product(Grocery) quantity: ");
		g.qty = sc.nextInt();
		System.out.print("Enter Product(Grocery) Discount:  ");
		double dis3 = sc.nextInt();
		System.out.println();

		ShoppingCart sct3 = sct;

		a1.ClothPrice = sct.calculatePrice(c,dis);
		System.out.println();
		a1.ElectronicPrice = sct2.calculatePrice(e,dis2);
		System.out.println();
		a1.GroceryPrice = sct3.calculatePrice(g,dis3);
		System.out.println();
		a1.FinalPrice = a1.ClothPrice + a1.ElectronicPrice + a1.GroceryPrice;
		System.out.println();
		a1.Display();


		
	}
}
