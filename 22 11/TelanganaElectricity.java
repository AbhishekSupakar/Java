
class TelanganaElectricity{
	String ConsumerName,ConsumerNumber;
	double Units;
	public void Display(){
		System.out.println("Consumer's Name  : "+ConsumerName);
		System.out.println("Consumer's Number : "+ConsumerNumber);
		System.out.println("Units Consumed   : "+Units);
	}
	public static double AmtToBePaid(double unit){
		double bill=0,tmt=0;
		if(unit <= 100) 
		{
			bill=unit*5.50; 
		}
		else if(unit<=200)
		{
			bill=100*5.50+(unit-100)*6.50; 
		}
		else if(unit<=300)
		{
			bill=100*5.50+200*6.50+(unit-200)*7.50; 
		}
		else if(unit>=600) 
		{
			bill=100*5.50+200*6.50+300*7.50+(unit-300)*8.50; 
		}
		
			tmt=bill;
			return tmt;
		
	}
	public static void main(String[] args)
		
	{
		System.out.println("--------Money Receipt--------");
		double Totalbill;
		TelanganaElectricity c1 = new TelanganaElectricity();
		c1.ConsumerName = "Abhishek Supakar";
		c1.ConsumerNumber = "I71578A765";
		c1.Units = 250.0;
		c1.Display();
		Totalbill = AmtToBePaid(c1.Units);
		System.out.println("Amount to be paid: " +Totalbill);

	}
}
