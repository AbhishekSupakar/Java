class  Customer
{
	String customerName;
	double monthlySpending;
	String cardName;
	public void setCustomerName(String customerName){
		this.customerName = customerName;
	}
	public void setMonthlySpending(double monthlySpending){
		this.monthlySpending = monthlySpending;
	}
	public String getCustomerName(){
		return customerName;
	}
	public double getMonthlySpending(){
		return monthlySpending;
	}
	public void displayDetails(){
		System.out.print("Name: "+customerName);
		System.out.print(" | Monthly Spending: "+monthlySpending);
		
	}
}
class CardType
{
	String cardName;
	public void getCardName(String cardName){
		this.cardName = cardName;
	}
	public String assignCardName(Customer customer){
		if (customer.monthlySpending < 10000 )
		{
			return "Silver";
		}
		else if (customer.monthlySpending > 10000 && customer.monthlySpending < 50000)
		{
			return "Gold";
		}
		return "Platinum";
	}
	public static void main(String[] args) 
	{
		Customer c1 = new Customer();
		c1.setCustomerName("John Doe");
		c1.setMonthlySpending(9000);
		CardType t1= new CardType();
		t1.getCardName(t1.assignCardName(c1));
		c1.displayDetails();
		System.out.print(" | Card Type: "+t1.cardName);
		System.out.println();

		Customer c2 = new Customer();
		c2.setCustomerName("Jane Smith");
		c2.setMonthlySpending(28000);
		CardType t2= t1;
		t2.getCardName(t2.assignCardName(c2));
		c2.displayDetails();
		System.out.print(" | Card Type: "+t2.cardName);
		System.out.println();


		Customer c3 = new Customer();
		c3.setCustomerName("Alice Brown");
		c3.setMonthlySpending(120000);
		CardType t3= t1;
		t3.getCardName(t3.assignCardName(c3));
		c3.displayDetails();
		System.out.print(" | Card Type: "+t3.cardName);
		System.out.println();
	}
}
