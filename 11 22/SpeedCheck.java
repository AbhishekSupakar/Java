class SpeedCheck 
{
	String name;
	double speed,mins;
	static double bridgeSize = 120;
	public static double checkTime(double sd){
	double check=0;
	if (sd>0)
	{
		return bridgeSize/sd;
	}
	return 0;
	}
	public static double SecToMin(double sec){
		return sec/60;
	}
	public void Display(){
		System.out.println("To cross the bridge "+name+ " Takes "+mins+" minutes");
	}
	public static void main(String[] args) 
	{
		SpeedCheck m1 = new SpeedCheck();
		m1.speed = 5;
		m1.name="Pravakar";
		double TimeTaken =  checkTime(m1.speed);
		m1.mins = SecToMin(TimeTaken);
		m1.Display();
		
	}
}
