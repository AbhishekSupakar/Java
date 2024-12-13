class  FoodItem 
{
	private String itemName;
	private double price;
	private String catagory;
	public void setItemName(String itemName){
		this.itemName = itemName;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public void setCatagory(String catagory){
		this.catagory = catagory;
	}
	public String getItemName(){
		return itemName;
	}
	public double getPrice(){
		return price;
	}
	public String getCatagory(){
		return catagory;
	}
	public void displayDetails(){
		System.out.println("Item name: "+getItemName());
		System.out.println("Item's price: "+getPrice());
		System.out.println("Catagory of the item: "+getCatagory());	
	}
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		FoodItem o1 = new FoodItem();
		o1.setItemName("Burger");
		o1.setPrice(149.99);
		o1.setCatagory("Starter");
		//o1.displayDetails();
		System.out.println("Item name: "+o1.getItemName());
		System.out.println("Item's price before update: "+o1.getPrice());
		System.out.println("Catagory of the item: "+o1.getCatagory());
		o1.setPrice(159.99);
		System.out.println("Item's price after update: "+o1.getPrice());
	}
}
