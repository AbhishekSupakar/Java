class TicketCounter 
{
	public static void main(String[] args) 
	{
		Buyer rahul = new Buyer();
		rahul.buyTickets(1);
		System.out.println("Total Sale : "+Ticket.Sale);
		System.out.println();
		Buyer Arya = new Buyer();
		Arya.buyTickets(2);
		System.out.println("Total Sale : "+Ticket.Sale);

	}
}
