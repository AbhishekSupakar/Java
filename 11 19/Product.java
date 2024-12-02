/*
Q3. Design a Product class to manage inventory in a store.
The class should include the following:
productId, productName, stockQuantity.
Initialize the product details with or without stock quantity.
Define some operations such as:
addStock(int quantity): Increases the stock by the specified amount.
sellStock(int quantity): Reduces the stock by the specified amount if
    enough stock is available; otherwise, display an appropriate message.
displayProductInfo(): Displays the product ID, name, and available
    stock quantity.
*/

class Product
{
	String productId,productName;
	int stockQuantity;
	public void displayAccountInfo(){
		System.out.println("Product Number: "+productId);
		System.out.println("Product Name: "+productName);
		System.out.println("Before Operation Stock Quantity:"+stockQuantity);
	}
	public static int StockAfteraddStock(int CurrentBalance,int addStock){
		int newbalanceAfterDeposite=CurrentBalance+addStock;
		System.out.println("After Adding Stock Stock Quantity: "+newbalanceAfterDeposite);
		return newbalanceAfterDeposite;
	}
	public static void StockAfterSellStock(int StockBeforeSellStock,int sellStock){
		if(StockBeforeSellStock>sellStock){
			int StockAfterSellStock=StockBeforeSellStock-sellStock;
			System.out.println("Sufficient products are available!!!");
			System.out.println("After Selling Stock Stock Quantity:: "+StockAfterSellStock);
		}
		else{
		System.out.println("Sufficient products are not available!!!");
		}
	}
	public static void main(String[] args) 
	{	
		int addStock,sellStock;
		Product a1= new Product();
		a1.productId="39901";
		a1.productName="Laptop";
		a1.stockQuantity=10109;
		addStock=0;
		sellStock=20000;
		a1.displayAccountInfo();
		int result=StockAfteraddStock(a1.stockQuantity,addStock);
		StockAfterSellStock(result,sellStock);
		System.out.println("-------------------------------------------------------");

		Product a2= new Product();
		a2.productId="90901";
		a2.productName="Mobile";
		a2.stockQuantity=1010;
		addStock=12340;
		sellStock=2000;
		a2.displayAccountInfo();
		result = StockAfteraddStock(a2.stockQuantity,addStock);
		StockAfterSellStock(result,sellStock);
		
	}
}
