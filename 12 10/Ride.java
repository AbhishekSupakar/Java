class Ride
{
	String rideId;
	String source;
	String destination;
	double distance;
	double fare;
public Ride(String rideId,String source,String destination,double distance){
	this.rideId=rideId;
	this.source=source;
		this.destination=destination;
		this.distance=distance;
		//this.fare=fare;

}
public void calculateFare(){
	fare = distance *10;
	
}
public void displayRideDetails(){
	System.out.println("Ride ID: "+rideId);
	System.out.println("Source: "+source);
	System.out.println("Destination: "+destination);
	System.out.println("Distance: "+distance);
	System.out.println("Fare : "+fare);

}
	public static void main(String[] args)
	{
		Ride r1 = new Ride("BhAkua","BEdha","Nuguda",120.67);
		r1.calculateFare();
		r1.displayRideDetails();
	}
}
