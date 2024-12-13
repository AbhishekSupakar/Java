import java.util.Scanner;
class TestMovieTicket 
{
	public void displayDetails(MovieTicket mt){
		System.out.println("Movie name: "+mt.getMovieName());
		System.out.println("Movie ticket's price: "+mt.getTicketPrice());
		System.out.println("Seat number: "+mt.getSeatNumber());	
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Movie Name: ");
		String mName = sc.nextLine();
		System.out.print("Enter Movie Price: ");
		double mPrice = sc.nextDouble();
		System.out.print("Enter Seat Number: ");
		int mSeatno = sc.nextInt();
		MovieTicket mt1 = new MovieTicket();
		TestMovieTicket tmt1 = new TestMovieTicket();
		
		mt1.setMovieName(mName);
		mt1.setSeatNumber(mSeatno);
		mt1.setTicketPrice(mPrice);
		System.out.println();
		tmt1.displayDetails(mt1);
		System.out.println();
		System.out.print("Enter Movie Price update: ");
		double mPriceUp = sc.nextDouble();
		mt1.setTicketPrice(mPriceUp);
		System.out.println("Movie ticket's price After upDate: "+mt1.getTicketPrice());

		System.out.print("Enter Movie Name: ");
		sc.nextLine();
		String mName2 = sc.nextLine();
		System.out.print("Enter Movie Price: ");
		double mPrice2 = sc.nextDouble();
		System.out.print("Enter Seat Number: ");
		int mSeatno2 = sc.nextInt();
		MovieTicket mt2 = new MovieTicket();
		TestMovieTicket tmt2 = new TestMovieTicket();
		
		mt2.setMovieName(mName2);
		mt2.setSeatNumber(mSeatno2);
		mt2.setTicketPrice(mPrice2);
		System.out.println();
		tmt2.displayDetails(mt2);
		System.out.println();
	}
}
