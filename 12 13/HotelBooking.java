class HotelBooking 
{
	private double roomPrice;
	private int numberOfRooms;
	HotelBooking(double roomPrice,int numberOfRooms){
		this.roomPrice = roomPrice;
		this.numberOfRooms = numberOfRooms;
	}
	HotelBooking(int numberOfRooms){
		this.roomPrice = 5000;
		this.numberOfRooms = numberOfRooms;
	}
	HotelBooking(){}
	public double calculateTotalCost(){
		
		return roomPrice*numberOfRooms;
	}
	public static double calculateTotalCost(HotelBooking h1,HotelBooking h2){

		return h1.calculateTotalCost()+h2.calculateTotalCost() ;
	}
	public double applyDiscount(double discountPercentage){
		double afterDiscount = calculateTotalCost() - calculateTotalCost()*discountPercentage/100;
		return afterDiscount;
	}
	public void displayBookingDetails(){
		System.out.println("Room Price: "+roomPrice);
		System.out.println("Numbers of room: "+numberOfRooms);
		System.out.println("Total room cost:"+calculateTotalCost());
		
	}
	public static void main(String[] args) 
	{
		HotelBooking h1 = new HotelBooking(7000,2);
		h1.displayBookingDetails();
		double h1DiscountedPrice = h1.applyDiscount(10);
		System.out.println("Total room cost after discount: "+h1DiscountedPrice );
		System.out.println();

		HotelBooking h2 = new HotelBooking(5);
		h2.displayBookingDetails();
		double h2DiscountedPrice = h2.applyDiscount(30);
		System.out.println("Total room cost after discount: "+h2DiscountedPrice );
		System.out.println();

		System.out.println("Total room cost of both : "+calculateTotalCost(h1,h2));
		System.out.println("Total cost for both rooms after discount: "+(h1DiscountedPrice+h2DiscountedPrice) );
		System.out.println();
		//System.out.println("Total room cost after discount: "+ );
	}
}
