class MovieTicket 
{
	String movieTitle;
	String showTime;
	double ticketPrice;
	MovieTicket(String movieTitle,String showTime){
		this.movieTitle= movieTitle;
		this.showTime = showTime;
		this.ticketPrice = 10.0;
	}
	MovieTicket(String movieTitle,String showTime,double ticketPrice){
		this.movieTitle= movieTitle;
		this.showTime = showTime;
		this.ticketPrice = ticketPrice;
	}
	public double calculateTotalCost(int numberOfTickets){
		System.out.println("Number of tickets: "+numberOfTickets);
		return ticketPrice*numberOfTickets;
	}
	public double calculateTotalCost(int numberOfTickets, double popcornPrice, int popcornQuantity){
		System.out.println("Number of tickets: "+numberOfTickets);
		double totalPopcornPrice = popcornPrice*popcornQuantity;
		System.out.println("Popcorn price : "+popcornPrice+"\nPopcorn quantity: "+popcornQuantity+"\nPopcorn total price: "+totalPopcornPrice);
		double totalTicketPrice = numberOfTickets*ticketPrice;
		
		return totalPopcornPrice+totalTicketPrice;
	}
	public void displayTicketDetails(){
		System.out.println("Movie Name: "+movieTitle+"\nShow time: "+showTime+"\nTicket Price: "+ticketPrice);
	}
	public static void main(String[] args) 
	{
		MovieTicket m1 = new MovieTicket("Leo","1:30");
		m1.displayTicketDetails();
		System.out.println("Total cost: "+m1.calculateTotalCost(10));
		System.out.println();
		MovieTicket m2 = new MovieTicket("Pushpa","8:30",220);
		m2.displayTicketDetails();
		System.out.println("Total cost: "+m2.calculateTotalCost(10));
		System.out.println();
		MovieTicket m3 = new MovieTicket("Venom-3D","5:30",370.67);
		m3.displayTicketDetails();
		System.out.println("Total cost: "+m3.calculateTotalCost(2,540.45,2));
		//MovieTicket m1 = new MovieTicket();
		System.out.println();
		//System.out.println("Total cost: ");
	}
}
