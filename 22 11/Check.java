/*
Q8. Create a class. Create NSV and NSM. Create a LV inside NSM with the same
        name used as NSV. Access the NSV and LV separately inside the NSM.
Call the NSM from the main method.
*/

class  Check
{
	String NSV = "Non static variable";
	public void NSM(){
		String NSV = "Local Variable";
		Check A1 = new Check();
		System.out.println("NSV: "+A1.NSV);
		System.out.println("LV: "+NSV);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		Check A1 = new Check();
		A1.NSM();
		System.out.println("Main Ends");
	}
}