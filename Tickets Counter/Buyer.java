class Buyer 
{
	double balance;
	public  void buyTickets(int qty) 
	{
		Ticket.Sale = Ticket.Price*qty;
	}

}
