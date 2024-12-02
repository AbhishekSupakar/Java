import java.util.Scanner;
class  DiscountCalculator
{
	String BrandName,productName;
	static String Mall = "Nexus Mall ";
	double originalPrice;
	double DiscountedPrice;
	int discountPercent;
	public int Discount(){
		if(BrandName.equals("petter")){
			return 30;
		}
			return 20;
	}
	public double Price(){
		double PriceOfProduct = originalPrice - (originalPrice * discountPercent / 100);
		return PriceOfProduct;
	}
	public void Display(){
		System.out.println("\n==== Invoice ====");
		System.out.println("Thank you for visiting "+ Mall );
        System.out.println("Brand: " + BrandName);
        System.out.println("Product: " + productName);
        System.out.println("Original Price:  " +originalPrice);
        System.out.println("Discount Offered: " + discountPercent + "%");
        System.out.println("Total Price to be Paid:  " +DiscountedPrice);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		DiscountCalculator P1 = new DiscountCalculator();
		System.out.print("Enter the brand name of the product: ");
		P1.BrandName = sc.nextLine();
		System.out.print("Enter the product name: ");
		P1.productName = sc.nextLine();
		System.out.print("Enter the original price of the product: ");
		P1.originalPrice = sc.nextDouble();
		P1.discountPercent = P1.Discount();
		P1.DiscountedPrice = P1.Price();
		P1.Display();

		
	}
}
