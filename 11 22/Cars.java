/*
Q9. WAP for below requirement:
        i. 3 cars of same brand moving at different speed and travelled for
   different amount of time.
        ii. Find the distance travelled by each car and print all the
details of car.
Take class name as Car.Take 1 SV for car brand, 2 nsv for speed and time.
Create objects to assign values to NSV.
Create a method to findDistance travelled by car.
*/

class  Cars
{
	static String CarBrand = "TATA";
	String Model;
	double CarSpeed, TravelledDistance, TravelledTime;

	public static double Distance(double speed, double time){
		double Distance=0;
		Distance = speed*time;
		return Distance;
	}
	public void Details(){
		System.out.println("Car Brand: "+CarBrand);
		System.out.println("Car Model: "+Model);
		System.out.println("Car Speed: "+CarSpeed);
		System.out.println("Car Travelled For "+TravelledTime+" Hours.");
		System.out.println("Car Travelled Distance: "+TravelledDistance);
		System.out.println();
	}

	public void DataEntry(){
		Cars c1 = new Cars();
		c1.Model ="Tata Nexon";
		c1.CarSpeed = 180;
		c1.TravelledTime = 3;
		c1.TravelledDistance = Distance(c1.CarSpeed, c1.TravelledTime);
		c1.Details();
		Cars c2 = new Cars();
		c2.Model ="Tata Curvv EV";
		c2.CarSpeed = 160;
		c2.TravelledTime = 5;
		c2.TravelledDistance = Distance(c2.CarSpeed, c2.TravelledTime);
		c2.Details();
	}
	public static void main(String[] args) 
	{
		System.out.println("--------Some TATA Cars and it's details--------");
		Cars b1 = new Cars();
		b1.DataEntry();
		
		
		
	}
}
