class Cars 
{
	String make;
	int year;
	public void displayDetails(){
		System.out.println("Car Make: "+make+",Year "+year);
	}
	public static int updateYear(int newYear){
		return newYear;
	}
	public static void checkVintage(int currentYear,int year){
	int ele= year-currentYear;
	 if (ele>=30)
	 {
		System.out.println("Is the car vintage ? true");
		

	 }
	 else{
		System.out.println("Is the car vintage ? false");
		
	 }
	 
	}
	public static void main(String[] args) 
	{
		Cars c1 = new Cars();
		c1.make = "Toyota";
		c1.year = updateYear(1990);
		c1.displayDetails();
		checkVintage(2024,c1.year);
		
	}
}
