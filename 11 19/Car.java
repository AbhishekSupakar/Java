class Car {
    String carModel, ownerName;
    double fuelLevel;

    public void displayCarInfo() {
        System.out.println("Car Model: " + carModel);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Fuel Level: " + fuelLevel + " liters");
    }

    public static double refuel(double currentFuelLevel, double liters) {
        if (liters > 0) {
            double updatedFuelLevel = currentFuelLevel + liters;
            System.out.println(liters + " liters added to the fuel tank.");
            return updatedFuelLevel;
        } else {
            System.out.println("Invalid fuel amount.");
            return currentFuelLevel;
        }
    }

    public static double drive(double currentFuelLevel, double distance) {
        double fuelConsumptionRate = 0.1; 
        double fuelNeeded = distance * fuelConsumptionRate;

        if (fuelNeeded <= currentFuelLevel) {
            double updatedFuelLevel = currentFuelLevel - fuelNeeded;
            System.out.println("You drove " + distance + " km.");
            return updatedFuelLevel;
        } else {
            System.out.println("Insufficient fuel to drive " + distance + " km. Please refuel.");
            return currentFuelLevel;
        }
    }

    public static void main(String[] args) {
        System.out.println("-------------Car 1---------------");
        Car car1 = new Car();
        car1.carModel = "Tesla Model S";
        car1.ownerName = "John Doe";
        car1.fuelLevel = 20.0;

        car1.displayCarInfo();
        car1.fuelLevel = refuel(car1.fuelLevel, 30.0); 
        car1.fuelLevel = drive(car1.fuelLevel, 150);   
        car1.displayCarInfo();

        System.out.println("-------------Car 2---------------");
        Car car2 = new Car();
        car2.carModel = "Ford Mustang";
        car2.ownerName = "Jane Smith";
        car2.fuelLevel = 0.0;

        car2.displayCarInfo();
        car2.fuelLevel = refuel(car2.fuelLevel, 50.0); 
        car2.fuelLevel = drive(car2.fuelLevel, 200);   
        car2.displayCarInfo();
    }
}
