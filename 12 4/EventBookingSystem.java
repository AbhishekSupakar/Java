import java.util.Scanner;

class Concert {
    String eventName;
    double ticketPrice;
    int attendees;

    public void displayDetails() {
        System.out.println("Concert: " + eventName + " | Ticket Price: " + ticketPrice + " | Number of Attendees: " + attendees);
    }
}

class TheaterPlay {
    String eventName;
    double ticketPrice;
    int attendees;

    public void displayDetails() {
        System.out.println("Theater Play: " + eventName + " | Ticket Price: " + ticketPrice + " | Number of Attendees: " + attendees);
    }
}

class EventBookingSystem {

    public double applyDiscount(Concert concert, int daysBeforeEvent) {
        concert.displayDetails();
        double totalPrice = concert.ticketPrice * concert.attendees;
        double discount = 0;

        if (daysBeforeEvent > 30) {
            discount = 15;
        } else if (daysBeforeEvent >= 15) {
            discount = 10;
        }

        double discountedPrice = totalPrice - (totalPrice * discount / 100);
        System.out.println("Early-booking discount: " + discount + "% | Total price for " + concert.attendees + " tickets after discount: " + discountedPrice);
        return discountedPrice;
    }

    public double applyDiscount(TheaterPlay play, int daysBeforeEvent) {
        play.displayDetails();
        double totalPrice = play.ticketPrice * play.attendees;
        double discount = 0;

        if (daysBeforeEvent > 20) {
            discount = 10;
        } else if (daysBeforeEvent >= 10) {
            discount = 5;
        }

        double discountedPrice = totalPrice - (totalPrice * discount / 100);
        System.out.println("Early-booking discount: " + discount + "% | Total price for " + play.attendees + " tickets after discount: " + discountedPrice);
        return discountedPrice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Concert
        Concert concert = new Concert();
        System.out.print("Enter Concert Name: ");
        concert.eventName = sc.nextLine();
        System.out.print("Enter Concert Ticket Price: ");
        concert.ticketPrice = sc.nextDouble();
        System.out.print("Enter Number of Attendees for Concert: ");
        concert.attendees = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Input for TheaterPlay
        TheaterPlay play = new TheaterPlay();
        System.out.print("Enter Theater Play Name: ");
        play.eventName = sc.nextLine();
        System.out.print("Enter Theater Play Ticket Price: ");
        play.ticketPrice = sc.nextDouble();
        System.out.print("Enter Number of Attendees for Theater Play: ");
        play.attendees = sc.nextInt();

        // Input for Days Before Event
        System.out.print("Enter Days Before Event: ");
        int daysBeforeEvent = sc.nextInt();

        // Calculate Discounts
        EventBookingSystem system = new EventBookingSystem();
        double concertTotal = system.applyDiscount(concert, daysBeforeEvent);
        System.out.println();
        double playTotal = system.applyDiscount(play, daysBeforeEvent);
        System.out.println();

        // Total Cost of All Events
        double totalCost = concertTotal + playTotal;
        System.out.println("Total cost of all events after discounts: " + totalCost);
    }
}