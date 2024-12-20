class Times
{	
	private int hours;
	private int minutes;
	private int seconds;
	Times(){
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	Times(int hours ,int minutes){
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	Times(int hours ,int minutes ,int seconds){
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	public void setHours(int hours){
		this.hours = hours;
	}
	public void setMinutes(int minutes){
		this.minutes = minutes;
	}
	public void setSeconds(int seconds){
		this.seconds = seconds;
	}
	public int getHours(){
		return hours;
	}
	public int getMinutes(){
		return minutes;
	}
	public int getSecond(){
		return seconds;
	}
	public void show(){
		System.out.println("Time : "+hours+":"+minutes+":"+seconds);
	}
	
}

class TimeCalculate
{
	public Times add(Times t1, Times t2)
	{
		int seconds = t1.getSecond() + t2.getSecond();
		int minutes = seconds/60 +t1.getMinutes() + t2.getMinutes();
		seconds = seconds%60;
		int hours = minutes/60 +t1.getHours() + t2.getHours();
		minutes = minutes%60;
		
		return new Times(hours,minutes,seconds);
	}
}

class TimeTester
{
	public static void main(String[] args) 
	{
		
		Times t1 = new Times(2,30,40);
		
		Times t2 = new Times(4,40,71);
		
		TimeCalculate tc1 = new TimeCalculate();
		//t1.setSeconds(124);
		t1.show();
		System.out.println();
		t2.show();
		System.out.println();
		Times t3 = tc1.add( t1,  t2);
		t3.show();
		System.out.println();
		

	}
}
