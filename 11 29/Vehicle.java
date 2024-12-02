import java.util.Scanner;

class  Vehicle
{
	String NameOfTheVehicle;
	double DistanceTraveled, TimeTaken, FuelConsumed, Speed, FuelEfficiency ;

	public double calculateSpeed()
	{
		Speed = DistanceTraveled/TimeTaken;
		return Speed;
	}

	public double calculateFuelEfficiency()
	{
		FuelEfficiency = DistanceTraveled/FuelConsumed;
		return FuelEfficiency;
	}

	public void Display()
	{
		System.out.println("======== Vehicle INFO ========");
		System.out.println();
		System.out.println("Vehicle Name: "+NameOfTheVehicle);
		System.out.println();
		System.out.println("Distance Travelled: "+DistanceTraveled+"km");
		System.out.println();
		System.out.println("Time Taken:" +TimeTaken+"hours");
		System.out.println();
		System.out.println("Fuel Consumed: "+FuelConsumed+"liters");
		System.out.println();
		System.out.println("Fuel Efficiency: "+FuelEfficiency+" km/l");
		System.out.println();
		System.out.println("Speed of the Vehicle: "+Speed+"km/h");
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Vehicle v1 = new Vehicle();

		System.out.print("Enter Vehicle Name:  ");
		v1.NameOfTheVehicle = sc.nextLine();
		System.out.println();

		System.out.print("Enter Distance Travelled (in km):  ");
		v1.DistanceTraveled = sc.nextDouble();
		System.out.println();

		System.out.print("Enter Time Taken (in hours):  ");
		v1.TimeTaken = sc.nextDouble();
		System.out.println();

		System.out.print("Enter Fuel Consumed (in liters):  ");
		v1.FuelConsumed = sc.nextDouble();
		System.out.println();

		v1.Speed = v1.calculateSpeed();

		v1.FuelEfficiency =v1.calculateFuelEfficiency();

		System.out.println();
		v1.Display();
	}
}
